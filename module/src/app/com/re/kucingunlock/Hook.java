package com.re.kucingunlock;

import android.util.Base64;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

/**
 * KucingUnlock — Vector/Xposed module untuk com.kcstream.cing ("Kucing").
 *  (1) Bypass FreeRASP: telan broadcast ancaman (emulator/tamper/hooks) -> app jalan di root.
 *  (2) Log konfigurasi API native (getAPIUrl/Path/Key/Signature).
 *  (3) Log semua header request (Token, AppSignature, Authorization: Bearer) + URL response.
 * Lihat log:  adb logcat -s KUCING  (atau grep "KUCING")
 */
public class Hook implements IXposedHookLoadPackage {

    private static final String PKG = "com.kcstream.cing";
    private static final String TAG = "KUCING";

    private static void log(String m) { XposedBridge.log(TAG + " | " + m); }

    private static String hex(byte[] b) {
        StringBuilder sb = new StringBuilder();
        for (byte x : b) sb.append(String.format("%02x", x));
        return sb.toString();
    }

    @Override
    public void handleLoadPackage(LoadPackageParam lp) throws Throwable {
        if (!PKG.equals(lp.packageName)) return;
        final ClassLoader cl = lp.classLoader;
        log("attached ke " + PKG);

        // (1) BYPASS — telan reaksi ancaman FreeRASP (titik choke tunggal, di Java)
        try {
            XposedHelpers.findAndHookMethod("u1.c", cl, "onReceive",
                "android.content.Context", "android.content.Intent",
                new XC_MethodReplacement() {
                    protected Object replaceHookedMethod(MethodHookParam p) {
                        log("[bypass] threat broadcast ditelan (onReceive dinonaktifkan)");
                        return null;
                    }
                });
            log("[ok] hook u1.c.onReceive terpasang");
        } catch (Throwable t) { log("[err] u1.c.onReceive: " + t); }

        // (1b) Safety — matikan TimerTask yang panggil System.exit(-1)
        try {
            XposedHelpers.findAndHookMethod("D4.d", cl, "run",
                new XC_MethodReplacement() {
                    protected Object replaceHookedMethod(MethodHookParam p) {
                        log("[bypass] D4.d.run (System.exit) dicegah");
                        return null;
                    }
                });
        } catch (Throwable t) { log("[warn] D4.d.run: " + t); }

        // (2) Konfigurasi API native
        final String[] getters = {"getAPIUrl", "getAPIPath", "getAPIKey", "getAPISignature"};
        for (final String g : getters) {
            try {
                XposedHelpers.findAndHookMethod("com.kcstream.cing.api.Service", cl, g,
                    new XC_MethodHook() {
                        protected void afterHookedMethod(MethodHookParam p) {
                            try {
                                Object r = p.getResult();
                                String s = String.valueOf(r);
                                log("[api] " + g + "() = " + s);
                                if ("getAPIKey".equals(g) || "getAPISignature".equals(g)) {
                                    byte[] dec = Base64.decode(s, 0);
                                    log("[api] " + g + " decoded: str=" + new String(dec) + " | hex=" + hex(dec));
                                }
                            } catch (Throwable e) { log("[err] " + g + " post: " + e); }
                        }
                    });
            } catch (Throwable t) { log("[err] hook " + g + ": " + t); }
        }

        // (3a) Semua header request (Token, AppSignature, AppBuildCode, Authorization: Bearer <token>)
        try {
            XposedHelpers.findAndHookMethod("Fa.e", cl, "g",
                "java.lang.String", "java.lang.String",
                new XC_MethodHook() {
                    protected void beforeHookedMethod(MethodHookParam p) {
                        try {
                            log("[hdr] " + p.args[0] + ": " + p.args[1]);
                        } catch (Throwable e) {}
                    }
                });
            log("[ok] hook header-builder Fa.e.g terpasang");
        } catch (Throwable t) { log("[warn] Fa.e.g: " + t); }

        // (3b) URL + status tiap request (interceptor app -> Response.toString() memuat url)
        try {
            XposedHelpers.findAndHookMethod("com.kcstream.cing.api.Service", cl, "a",
                "com.kcstream.cing.api.Service", "ca.f",
                new XC_MethodHook() {
                    protected void afterHookedMethod(MethodHookParam p) {
                        try { log("[http] " + String.valueOf(p.getResult())); }
                        catch (Throwable e) {}
                    }
                });
            log("[ok] hook interceptor Service.a terpasang");
        } catch (Throwable t) { log("[warn] Service.a: " + t); }

        // (4) URL stream/download ASLI yang dibuka (WebView.loadUrl + Intent VIEW)
        final XC_MethodHook wv = new XC_MethodHook() {
            protected void beforeHookedMethod(MethodHookParam p) {
                try { log("[stream] WebView.loadUrl: " + p.args[0]); } catch (Throwable e) {}
            }
        };
        try { XposedHelpers.findAndHookMethod("android.webkit.WebView", cl, "loadUrl", "java.lang.String", wv); } catch (Throwable t) { log("[warn] loadUrl1: " + t); }
        try { XposedHelpers.findAndHookMethod("android.webkit.WebView", cl, "loadUrl", "java.lang.String", "java.util.Map", wv); } catch (Throwable t) {}

        final XC_MethodHook intentUri = new XC_MethodHook() {
            protected void beforeHookedMethod(MethodHookParam p) {
                try {
                    String u = String.valueOf(p.args[0]);
                    if (u.startsWith("http")) log("[open] Intent data: " + u);
                } catch (Throwable e) {}
            }
        };
        try { XposedHelpers.findAndHookMethod("android.content.Intent", cl, "setData", "android.net.Uri", intentUri); } catch (Throwable t) { log("[warn] setData: " + t); }
        try { XposedHelpers.findAndHookMethod("android.content.Intent", cl, "setDataAndType", "android.net.Uri", "java.lang.String", intentUri); } catch (Throwable t) {}
        log("[ok] hook WebView/Intent stream terpasang");
    }
}
