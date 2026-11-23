# API / Auth Findings — com.kcstream.cing ("Kucing")  [GOAL 2]

Semua di bawah **direcover STATIK** (tanpa menjalankan app), dari `libnative-lib.so`
(JNI `com.kcstream.cing.api.Service`) + interceptor OkHttp `Service.a()` + string XOR.

## Base API (dari native, base64-encoded di libnative-lib.so)
| Item | Fungsi JNI | Nilai |
|------|-----------|-------|
| Base URL | `getAPIUrl()` | `https://api.explorethefrontierforlimitlessimaginationanddiscov.com` |
| Path prefix | `getAPIPath()` | `330cceade91a6a9cd30fb8042222ed56/71b8acf33b508c7543592acd9d9eb70d` |
| API Key (b64) | `getAPIKey()` | `XbGSFkQsJYbFC6pcUMCFL4oNHULvHU7WdDAXYgpmqYlh7p5ZCQ4QZ13GDgowiOGvAejz9X5H6DYvEQBMrc3A17SO3qwLwVkbn6YY` |
| API Signature (b64) | `getAPISignature()` | `pOplm8IDEDGXN55IaYohQ8CzJFvWsfXyhGvwPRD9kWgzYSRuuvAOPfsE0AJbHVbAJyWGsGCNUIuQLJ7HbMbuFLMWwDgHNwxOrYMH` |
| (lain) UUID | - | `3a9737ba-1a72-464e-a396-23220e3e51b0` |
| Ad unit | - | `Ad_Android_Interstitial` |

Kemungkinan full base = `https://api.explore...com/330cceade91a6a9cd30fb8042222ed56/71b8acf33b508c7543592acd9d9eb70d/<endpoint>`

## Header auth (ditambahkan ke SETIAP request oleh interceptor `Service.a`)
```
Token:        <Base64.decode(getAPIKey())>
AppSignature: <Base64.decode(getAPISignature())>
AppBuildCode: 25301
Accept:       application/json
```
Catatan: decode base64 ke-2 dari Token/AppSignature menghasilkan **biner** (72 byte) —
nilai header final belum pasti teks; perlu konfirmasi runtime (hook `Service.getAPIKey`
atau log header "Token"/"AppSignature" yang benar-benar dikirim).

## Auth per-user (login)
- Terpisah dari di atas. `libclib.so` berisi `Authorization: Bearer %s` → token login user.
- Token login disimpan di **EncryptedSharedPreferences** (file prefs nama acak,
  mis. `Lpt8WLRqdspyfb4HJG3nBpExQr2L0dk.xml`) + Android Keystore.
- Nilai token hidup HANYA bisa diambil runtime (hook OkHttp / baca prefs setelah login).

## Endpoint operasi (kandidat statik — lengkapi saat runtime)
`login-user`, `login-user-from-subscription`, `register`, `listall`, `banner`,
`category`, `genre`, `details`, `episode`/`episodes`, `season`, `link`/`links`,
`player`, `profile`, `premium`, `bookmark`, `download`, `author`, `posts`, `comment`
→ daftar PASTI & lengkap = capture runtime via hook OkHttp (lihat modul Vector).

## Transport / pinning
- OkHttp3 + Retrofit2; TLS via `libclib.so` (BoringSSL) + `libpolarssl.so`.
- Ada `burp_system_ca` (Magisk) → MITM Burp mungkin jalan, TAPI cek pinning native dulu.
- Cara paling andal ambil endpoint+token = hook OkHttp di dalam proses (bukan MITM).
