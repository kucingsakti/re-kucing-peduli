#!/usr/bin/env python3
# Spawn com.kcstream.cing di bawah Frida, inject recon.js, kumpulkan output ~18s.
import sys, time, frida, os

PKG = "com.kcstream.cing"
JS = os.path.join(os.path.dirname(__file__), "recon.js")

def on_message(message, data):
    if message.get("type") == "send":
        print("MSG:", message["payload"])
    elif message.get("type") == "error":
        print("ERR:", message.get("stack") or message.get("description"))

dev = frida.get_usb_device(timeout=10)
print("[*] device:", dev.name)
pid = dev.spawn([PKG])
print("[*] spawned pid", pid)
session = dev.attach(pid)
script = session.create_script(open(JS).read())
script.on("message", on_message)
script.load()
print("[*] script loaded, resuming...")
dev.resume(pid)
t = int(sys.argv[1]) if len(sys.argv) > 1 else 18
time.sleep(t)
try:
    still = pid in [p.pid for p in dev.enumerate_processes()]
    print("[*] proses masih hidup?" , still)
except Exception as e:
    print("[*] enum err:", e)
print("[*] selesai observasi")
