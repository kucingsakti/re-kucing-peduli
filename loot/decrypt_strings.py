#!/usr/bin/env python3
# Dekripsi string obfuscated com.kcstream.cing: C.a(C.c(hex)) = hexdecode XOR key32
import re, sys, os, glob

KEY = [96,2,-44,-87,106,-123,-91,-57,-26,23,111,104,-5,45,20,84,
       -93,-87,-50,-128,51,-74,82,125,58,-126,-59,84,95,-123,89,60]
KEY = [k & 0xFF for k in KEY]

def dec(hexs):
    try:
        b = bytes.fromhex(hexs)
    except ValueError:
        return None
    out = bytes((b[i] ^ KEY[i % 32]) for i in range(len(b)))
    try:
        return out.decode('utf-8')
    except UnicodeDecodeError:
        return out.decode('latin-1')

def printable(s):
    return s is not None and sum(c.isprintable() for c in s) >= max(1, int(0.7*len(s)))

if __name__ == '__main__':
    # mode 1: decrypt args
    if len(sys.argv) > 1 and sys.argv[1] != '--scan':
        for h in sys.argv[1:]:
            print(f"{h} -> {dec(h)!r}")
        sys.exit(0)
    # mode 2: scan jadx sources for C.c("HEX") and decrypt all
    root = sys.argv[2] if len(sys.argv) > 2 else os.path.expanduser('~/Projects/re/com.kcstream.cing/jadx/sources')
    pat = re.compile(r'C\.c\("([0-9A-Fa-f]{4,})"\)')
    seen = {}
    for f in glob.glob(os.path.join(root, '**', '*.java'), recursive=True):
        try:
            txt = open(f, encoding='utf-8', errors='ignore').read()
        except Exception:
            continue
        for m in pat.finditer(txt):
            h = m.group(1)
            if h in seen: continue
            d = dec(h)
            if printable(d):
                seen[h] = d
    for h, d in sorted(seen.items(), key=lambda kv: kv[1]):
        print(f"{d!r}\t<= {h}")
    print(f"\n[total unik: {len(seen)}]", file=sys.stderr)
