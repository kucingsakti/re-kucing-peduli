# CONFIRMED LIVE (via modul KucingUnlock @ Vector) — com.kcstream.cing

## App-level auth (dikirim di SETIAP request)
```
Base: https://api.explorethefrontierforlimitlessimaginationanddiscov.com/330cceade91a6a9cd30fb8042222ed56/71b8acf33b508c7543592acd9d9eb70d/
Header:
  Token: XbGSFkQsJYbFC6pcUMCFL4oNHULvHU7WdDAXYgpmqYlh7p5ZCQ4QZ13GDgowiOGvAejz9X5H6DYvEQBMrc3A17SO3qwLwVkbn6YY
  AppSignature: pOplm8IDEDGXN55IaYohQ8CzJFvWsfXyhGvwPRD9kWgzYSRuuvAOPfsE0AJbHVbAJyWGsGCNUIuQLJ7HbMbuFLMWwDgHNwxOrYMH
  AppBuildCode: 25301
  Accept: application/json
```
Catatan: Token = Base64.decode(getAPIKey()); AppSignature = Base64.decode(getAPISignature()).
(nilai di atas sudah bentuk final yang dikirim — bukan di-decode lagi.)

## Endpoint terlihat (tambah terus sambil pakai app)
- GET  {base}recent
- GET  https://api.explore.../71b8acf33b508c7543592acd9d9eb70d/updateApp   (path pendek, tanpa segmen pertama)

## Token login per-user (Authorization: Bearer ...)
- Belum muncul (sesi belum login). Akan tertangkap otomatis oleh hook header [hdr]
  saat kamu login di app. Pantau: adb logcat -s VectorLegacyBridge | grep -i 'hdr\].*Authorization'

## Cara capture berjalan
adb logcat -c; adb logcat -s VectorLegacyBridge | grep --line-buffered 'KUCING'
  -> [http] = URL+status tiap request (endpoint lengkap)
  -> [hdr]  = semua header (Token, AppSignature, Authorization: Bearer <token-login>)
