#!/usr/bin/env bash
# resolve_playmogo.sh <embed_url>
# Resolve DoodStream-based playmogo.com/e/<id> -> direct MP4 URL.
# Chain: embed -> /pass_md5/<key>/<token> (needs Referer) -> base + 10rand + ?token=&expiry=
set -eu
EMBED="${1:?usage: resolve_playmogo.sh https://playmogo.com/e/<id>}"
UA="Mozilla/5.0 (Linux; Android 15; Pixel 10 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0 Mobile Safari/537.36"
HOST="https://$(echo "$EMBED" | awk -F/ '{print $3}')"

html=$(curl -sSL --max-time 30 -A "$UA" -e "$HOST/" "$EMBED")
pass=$(grep -aoE "/pass_md5/[A-Za-z0-9/_-]+" <<<"$html" | head -1 || true)
token=$(grep -aoE "token=[A-Za-z0-9]+" <<<"$html" | head -1 | cut -d= -f2 || true)
[ -z "$pass" ] && { echo "pass_md5 tidak ditemukan (mungkin butuh Turnstile/anti-bot)"; exit 1; }

base=$(curl -sS --max-time 30 -A "$UA" -e "$EMBED" -H "X-Requested-With: XMLHttpRequest" "${HOST}${pass}")
rnd=$(tr -dc 'A-Za-z0-9' </dev/urandom | head -c 10)
final="${base}${rnd}?token=${token}&expiry=$(date +%s)000"
echo "$final"
