# RE — com.kcstream.cing ("Kucing")

## Target
- Package: `com.kcstream.cing`
- Label: **Kucing**
- Version: 2.5.3-build01 (versionCode 25301)
- minSdk 23 / targetSdk 34
- Signer: `CN=Usamin.tech` (SHA-256 d3ca93d2…08ad) — custom/repack signer
- Device: Samsung M20 (m20lte), Android 15 / LineageOS 22.2, Magisk root, spoofed Pixel 10 Pro
- APK pulled: `apk/base.apk` (28 MB, single, no splits)

## Protection / Anti-tamper (apkid)
- **protector: FreeRASP** (Talsec RASP)  ← sumber utama deteksi root & "semacamnya"
- manipulator: Resources Confusion
- anti_debug: Debug.isDebuggerConnected()
- anti_vm: Build.BOARD/FINGERPRINT/HARDWARE/MANUFACTURER/MODEL/PRODUCT/TAGS, SIM operator,
  network operator, Build.SERIAL, subscriber ID
- compiler: r8 (minified/obfuscated)

## Native libs (arm64-v8a yang relevan)
- `libtmlib.so`      ← Talsec Mobile lib (inti FreeRASP, native checks)
- `libsecurity.so`
- `libnative-lib.so`
- `libclib.so`
- `libpolarssl.so`   ← mbedTLS/PolarSSL (TLS / cert pinning)
- `libpbkdf2_native.so`

## Hipotesis deteksi
FreeRASP native (`libtmlib.so`) menjalankan thread yang memeriksa:
root (su/magisk paths, mount, props), Frida (port/maps/threads), debugger,
emulator, repackaging (signature mismatch — perhatikan signer Usamin.tech),
lalu memanggil callback Java (threat listener) → app menutup / menolak jalan.

## Rencana bypass (urut prioritas)
1. Jalankan app + Frida, tangkap callback FreeRASP di layer Java (Talsec SDK:
   `com.aheaditec.talsec.security.*` threat callback) — hook agar tidak trigger.
2. Kalau cek di native libtmlib.so: hook via Frida (Interceptor) pada fungsi
   yang kembalikan status threat / JNI callback.
3. Stealth Frida kalau anti-Frida aktif (rename server, gadget, dll).

## Temuan statik (lanjutan)
- Talsec SDK: `com.aheaditec.talsec_security.security.api.Talsec` + `Natives`.
- Entry native: `api.Natives.start(Context, boolean)` → `System.loadLibrary(<obfuscated>)`
  (loader pakai `i8.C.a(...)` buat decode nama lib → kemungkinan libtmlib).
- `com.aheaditec.talsec_security.security.Natives` (internal) import `com.kcstream.cing.MainApp`
  dan punya native methods: cek signature/cert (`j(Context,hashes)` → Pair<String,X509Certificate>),
  cek apks terpasang (`c(String[])`), pkgName (`h`), store (`i`), dll → logika root/tamper/hook di native.
- Nama method callback threat TER-OBFUSCATE (R8) — tidak ada string `onRootDetected` dsb di dex.
  Reaksi deteksi kemungkinan: callback Java obfuscated ATAU langsung native → app exit/blok.
- Internal logic classes: `com.aheaditec.talsec.security.{l0,t2,w2}` (obfuscated).

## Kesimpulan & strategi
Deteksi inti ada di **native libtmlib.so**. Dua jalur bypass:
- (A) **Java layer**: hook hasil `Natives.*` / intercept threat callback & cegah `System.exit`.
- (B) **Native layer**: hook fungsi di libtmlib.so atau libc yang dipakai (fopen `/proc`,
  `/su` path checks, `stat`, baca maps utk Frida), paksa hasil "bersih".
Tahap 1 = OBSERVASI dulu (frida/recon.js) utk lihat reaksi nyata, baru susun bypass.

### Catatan anti-Frida
FreeRASP mendeteksi frida-server (port 27042, thread names, maps). frida-server default
kita mungkin ketahuan. Opsi stealth bila perlu: rename frida-server, port kustom (-l),
atau Frida Gadget. Putuskan setelah lihat apakah deteksi Frida aktif memblok.

## Status folder
- apk/base.apk          (pulled)
- jadx/                 (7422 file, decompiled Java)
- decompiled/           (apktool: smali + resources)
- frida/recon.js        (script observasi tahap 1)
- notes/recon.md        (dokumen ini)

## Temuan DINAMIK (run1/run2)
- Frida 17 menghapus bridge `Java` global → downgrade toolkit ke **Frida 16.7.19**
  (client pipx + frida-server di device, start sbg root via `frida-start`).
- **Baseline (frida-server OFF):** app launch & dapat PID, lalu **mati sendiri ~8 dtk**
  → FreeRASP deteksi ROOT (Magisk) → threat reaction menutup app. (keluhan utama user)
- **frida-server ON (root):** `spawn` TIMEOUT / app langsung mati → deteksi FRIDA aktif
  (kemungkinan cek port 27042 / thread "gum-js-loop" / maps / ptrace).

## Model ancaman app (2 lapis)
1. ROOT detection (primer) — native libtmlib, lihat Magisk → exit ~8s.
2. FRIDA/anti-instrument (sekunder) — frida-server default ketahuan → block saat spawn.
(plus: signature check native `Natives.j()` → repackage akan ketahuan = tamper.)

## Aset device yg relevan (sudah terpasang user)
- Magisk (com.topjohnwu.magisk), Shizuku, HideMyApplist (com.tsng.hidemyapplist)
- icu.nullptr.applistdetector, com.reveny.nativecheck, com.apin.revenybypass (studi FreeRASP)

## ★ MODEL ANCAMAN FINAL (terbongkar via dekripsi string + reverse native)
String XOR dibuka: decryptor `p086i8.C.a(C.c(hex))` = hexdecode XOR key32
(key di `loot/decrypt_strings.py`). 789 string terbuka.

Alur: `libtmlib.so` deteksi → kirim BROADCAST nama-ancaman → `p195u1.c.onReceive`
map ke kode → hanya kode **2,3,5** yang FATAL (toast + Timer 3dtk → System.exit(-1)).

| kode | ancaman (didekripsi) | reaksi |
|------|----------------------|--------|
| 0 | root | diabaikan |
| 1 | debug | diabaikan |
| 2 | **emulator** | FATAL |
| 3 | **tamper** (signature) | FATAL |
| 5 | **hooks** (Xposed/Zygisk/Frida) | FATAL |
| 11 | adbEnabled | diabaikan |
| 6 deviceBinding,12 systemVPN,14 screenshot,... | diabaikan |

➡️ App TOLERAN ROOT. Pembunuh sebenarnya: **hooks** (Vector/Zygisk/Shizuku-mu aktif)
   dan/atau **emulator** (spoof Pixel 10 Pro di hardware m20lte → props tak konsisten).
   tamper kemungkinan aman (Usamin set expected-hash ke cert repack-nya sendiri).

## ★ TITIK BYPASS (tunggal, Java)
`p195u1.c.onReceive(Context, Intent)` — jadikan no-op → tak ada toast, tak ada exit.
Belt-and-suspenders: hook `java.lang.System.exit` (scope app) + `D4.d.run`.
Karena reaksi 100% Java → **modul Xposed (Vector)** = solusi bersih, persisten,
tanpa repack (signature utuh), survive reboot.

## ★ GOAL 2 — lihat loot/API_FINDINGS.md
Base URL/path/key/signature sudah direcover STATIK dari libnative-lib.so.
Token login per-user = runtime (hook OkHttp interceptor / Service.getAPIKey).

## Rencana modul "Vector" (satu modul, dua goal)
1. hook `p195u1.c.onReceive` → return (BYPASS, app jalan di root). [Goal 1]
2. hook `com.kcstream.cing.api.Service.getAPIKey/Path/Signature/Url` → log nilai asli. [Goal 2]
3. hook OkHttp `Interceptor`/`Request` → log tiap URL + semua header (Token, AppSignature,
   Authorization: Bearer) → endpoint lengkap + token hidup. [Goal 2]

## TODO berikut — butuh keputusan strategi bypass
- [ ] Hide-root dulu (Magisk DenyList/Zygisk + Shamiko + HMA utk com.kcstream.cing) → tes app jalan?
- [ ] Stealth Frida (frida-server rename + port kustom / patched hluda) utk analisis native FreeRASP
- [ ] Atau Zygisk gadget injection (tanpa repackage, hindari tamper-check)
- [ ] Target akhir: netralkan threat-callback / native check libtmlib
