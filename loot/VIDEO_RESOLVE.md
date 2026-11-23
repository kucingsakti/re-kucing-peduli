# RESOLVE LAPISAN VIDEO — com.kcstream.cing

## Rantai lengkap (app -> video asli)
```
1. API:   GET {BASE}{P}/post?id=<id>   (body berisi embed id, field download/stream)
2. App buka WebView: https://playmogo.com/e/<embedId>     (host embed = DoodStream)
3. Embed page (inline JS) memanggil:
      GET https://playmogo.com/pass_md5/<key-time-based>/<token>
      (WAJIB header Referer: https://playmogo.com/e/<embedId>)
   -> balas BASE url CDN, mis:
      https://s248dk.cloudatacdn.com/<hash>/<prefix>~
4. makePlay(): base + 10 char acak + "?token=<token>&expiry=<ms>"
   -> MP4 LANGSUNG (video/mp4), mis:
      https://s248dk.cloudatacdn.com/<hash>/<prefix>~AbCdEf1234?token=<token>&expiry=<ms>
```

## Catatan
- Host embed: **playmogo.com** = berbasis **DoodStream** (doodcdn.io + embed3.js + video.js).
- `pass_md5` key berubah tiap fetch (ada komponen timestamp) -> harus pakai hasil fetch yang sama.
- Token (mis. `z09gpesc7ef8bys6fvz1fynd`) tetap per-embed.
- Ada Cloudflare Turnstile di halaman, TAPI endpoint pass_md5 tetap bisa diakses langsung
  dengan Referer yang benar (tanpa solve Turnstile) -> MP4 200 OK.
- URL final mengandung expiry; sifatnya sementara (regenerate via resolver).
- 10 char acak di makePlay: nilai apa pun diterima (server abaikan isinya).

## Pakai resolver
```
bash loot/resolve_playmogo.sh https://playmogo.com/e/<embedId>
# -> cetak URL MP4 langsung (bisa di-curl/mpv/vlc/yt-dlp dgn Referer playmogo.com)
```
Contoh verifikasi: HTTP 200, Content-Type: video/mp4, Content-Length ~19 MB.

## Drawer (sesi ini)
- Jadwal hentai -> endpoint {BASE}{P}/comingsoon
- Chat          -> WebView https://hentaipoi.chatango.com/ (chat eksternal, bukan API)
- Stiker        -> "Item not found" (fitur kosong/broken; tak ada endpoint API ketangkap)
