# ENDPOINT MAP — com.kcstream.cing ("Kucing")  [live capture + static]

## Auth (app-level, SETIAP request) — tidak ada login user / Bearer
```
Token:        XbGSFkQsJYbFC6pcUMCFL4oNHULvHU7WdDAXYgpmqYlh7p5ZCQ4QZ13GDgowiOGvAejz9X5H6DYvEQBMrc3A17SO3qwLwVkbn6YY
AppSignature: pOplm8IDEDGXN55IaYohQ8CzJFvWsfXyhGvwPRD9kWgzYSRuuvAOPfsE0AJbHVbAJyWGsGCNUIuQLJ7HbMbuFLMWwDgHNwxOrYMH
AppBuildCode: 25301
Accept:       application/json
```
(Pengaturan app tidak punya menu login; endpoint statik `login-user*` kemungkinan VIP tak aktif.)

## Base
```
{BASE} = https://api.explorethefrontierforlimitlessimaginationanddiscov.com
{P}    = /330cceade91a6a9cd30fb8042222ed56/71b8acf33b508c7543592acd9d9eb70d
```

## Endpoint (GET) — TERKONFIRMASI LIVE
| Endpoint | Contoh |
|----------|--------|
| home/recent | `{BASE}{P}/recent` |
| index/list | `{BASE}{P}/listall?letter=<0-9\|A..Z>&type=<hentai\|jav\|2d\|3d\|jav-cosplay>&page=<n>` |
| search | `{BASE}{P}/search?q=<query>&page=<n>` |
| detail post | `{BASE}{P}/post?id=<postId>` |
| detail series | `{BASE}{P}/series?id=<seriesId>` |
| cek update | `{BASE}/71b8acf33b508c7543592acd9d9eb70d/updateApp` (path pendek) |

Kategori (type di listall): Hentai, 2D Animation, 3D Hentai, JAV, JAV Cosplay.
Genre (filter search): Action, Ahegao, Anal, Armpit, BDSM, Big Oppai, Blackmail,
Blonde, Blowjob, Bondage, Cheating, Comedy, Creampie, ... (list penuh di layar Cari).

## Struktur response (model, dari smali)
- `RecentPost{ category, data[] }`
- `Posts{ id, slug, series, content, date, image, note, download, stream }`
- `PostsDownload{ type, links }`   ← **URL download/stream ada di sini**
- `SeriesInfoMeta{ aliases, durasi, episode, genre, produser, skor, status }`

## Catatan stream/download
- URL stream/download ADA DI BODY response `post?id=` (field `download`/`links`/`stream`).
- Diputar lewat WebView (AgentWeb) / dibuka via `BrowserActivity` (intent VIEW http/https).
- Hook saat ini hanya log URL request (bukan body). Untuk ambil URL stream asli:
  perlu hook body OkHttp (enhance modul) atau MITM.

## Belum tereksplor (koordinat drawer labil)
- Jadwal hentai (schedule), Chat, Stiker — kemungkinan endpoint sendiri.
