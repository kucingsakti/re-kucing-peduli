#!/usr/bin/env bash
# Capture endpoint + header live dari modul KucingUnlock.
export PATH="$HOME/.local/bin:$PATH"
OUT="$(dirname "$0")/loot/capture-$(date +%H%M%S).log"
echo "[*] buka & pakai app Kucing (login, browse). Ctrl-C utk stop. -> $OUT"
adb logcat -c
adb logcat -v time -s VectorLegacyBridge | grep --line-buffered 'KUCING' | tee "$OUT" \
  | grep --line-buffered -E '\[http\]|\[hdr\] (Token|AppSignature|Authorization)'
