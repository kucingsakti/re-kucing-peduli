/*
 * FreeRASP recon — com.kcstream.cing (Kucing)
 * Tahap 1: observasi. Belum bypass. Tujuan: lihat modul native yang dimuat,
 * kapan Talsec start() dipanggil, dan reaksi app saat deteksi.
 *
 * Jalankan:  frida -U -f com.kcstream.cing -l recon.js  (spawn, pause di awal)
 * atau attach: frida -U com.kcstream.cing -l recon.js
 */

'use strict';

function log(tag, msg) { console.log('[' + tag + '] ' + msg); }

// 1) Pantau pemuatan libtmlib.so / lib native Talsec lain
try {
  const dlopen = Module.findExportByName(null, 'android_dlopen_ext') ||
                 Module.findExportByName(null, 'dlopen');
  if (dlopen) {
    Interceptor.attach(dlopen, {
      onEnter(args) { this.path = args[0].readCString(); },
      onLeave(ret) {
        if (this.path && /\.so$/.test(this.path))
          log('dlopen', this.path + '  ret=' + ret);
      }
    });
  }
} catch (e) { log('err', 'dlopen hook: ' + e); }

// 2) Hook Talsec native entry: api.Natives.start(Context, boolean)
Java.perform(function () {
  try {
    const N = Java.use('com.aheaditec.talsec_security.security.api.Natives');
    N.start.overload('android.content.Context', 'boolean').implementation = function (ctx, mode) {
      log('talsec', 'api.Natives.start(ctx, mode=' + mode + ') dipanggil');
      return this.start(ctx, mode);   // biarkan jalan dulu (observasi)
    };
    log('talsec', 'hook api.Natives.start terpasang');
  } catch (e) { log('err', 'hook start: ' + e); }

  // 3) Tangkap reaksi umum deteksi: System.exit / Process.killProcess
  try {
    const Sys = Java.use('java.lang.System');
    Sys.exit.implementation = function (code) {
      log('REACT', 'System.exit(' + code + ')  <-- app mencoba menutup');
      log('REACT', Java.use('android.util.Log').getStackTraceString(
        Java.use('java.lang.Exception').$new()));
      // return;  // <- uncomment utk cegah exit saat bypass
      return this.exit(code);
    };
  } catch (e) {}
  try {
    const P = Java.use('android.os.Process');
    P.killProcess.implementation = function (pid) {
      log('REACT', 'Process.killProcess(' + pid + ')');
      return this.killProcess(pid);
    };
  } catch (e) {}
});

log('init', 'recon aktif — tunggu app start & amati output');
