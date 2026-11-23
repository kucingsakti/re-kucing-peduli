package com.re.kucingunlock;

import android.util.Base64;
import android.webkit.WebResourceResponse;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * KucingUnlock — Vector/Xposed module untuk com.kcstream.cing ("Kucing").
 *  (1) Bypass FreeRASP (emulator/tamper/hooks) -> app jalan di root.
 *  (2) Log konfig API native + header (Token/AppSignature/Authorization) + URL.
 *  (3) AD-BLOCK: UnityAds interstitial + iklan WebView (in-app & di video player).
 * Log: adb logcat -s VectorLegacyBridge  (filter "KUCING").
 */
public class Hook implements IXposedHookLoadPackage {

    private static final String PKG = "com.kcstream.cing";
    private static final String TAG = "KUCING";
    private static final Set<String> HOOKED = Collections.synchronizedSet(new HashSet<String>());

    private static void log(String m) { XposedBridge.log(TAG + " | " + m); }
    private static String hex(byte[] b) { StringBuilder s = new StringBuilder(); for (byte x : b) s.append(String.format("%02x", x)); return s.toString(); }

    // ---- ADBLOCK: allowlist (deny-by-default) ----
    // Iklan NekoPoi/DoodStream pakai domain acak yang BERPUTAR tiap load, jadi denylist
    // takkan cukup. Kita izinkan hanya host yang benar-benar dibutuhkan player/API/chat;
    // semua host pihak-ketiga lain di WebView = iklan/tracker -> blok.
    private static final String[] ALLOW_HOSTS = {
        // video player (embed + CDN video + gambar)
        "playmogo.com", "doodcdn.io", "cloudatacdn.com", "imgds.net", "dood.",
        // library player + cloudflare turnstile/insights
        "cdnjs.cloudflare.com", "challenges.cloudflare.com", "cloudflareinsights.com",
        "jsdelivr.net", "unpkg.com", "ytimg.com",
        // google (font/cast/recaptcha/login player) — BUKAN googlesyndication/doubleclick
        "gstatic.com", "googleapis.com", "accounts.google.com", "recaptcha",
        // chat + API app + watermark
        "chatango.com", "explorethefrontier", "nekopoi"
    };
    // path iklan yg tetap diblok walau host-nya diizinkan (mis. doodcdn.io/ads/ad.js)
    private static final String[] AD_PATHS = { "/ads/", "/ad.js", "/pagead", "/adsbygoogle", "/gampad" };

    static boolean isAd(String url) {
        if (url == null) return false;
        String u = url.toLowerCase();
        if (u.startsWith("data:") || u.startsWith("about:") || u.startsWith("blob:")
                || u.startsWith("file:") || u.startsWith("javascript:")) return false;
        for (String p : AD_PATHS) if (u.contains(p)) return true;     // selalu blok path iklan
        for (String a : ALLOW_HOSTS) if (u.contains(a)) return false; // host dikenal -> izinkan
        return true;                                                  // sisanya -> blok (iklan/tracker)
    }

    private static WebResourceResponse blank() {
        return new WebResourceResponse("text/plain", "utf-8", new ByteArrayInputStream(new byte[0]));
    }

    @Override
    public void handleLoadPackage(LoadPackageParam lp) throws Throwable {
        if (!PKG.equals(lp.packageName)) return;
        final ClassLoader cl = lp.classLoader;
        log("attached ke " + PKG);

        // (1) BYPASS FreeRASP
        try {
            XposedHelpers.findAndHookMethod("u1.c", cl, "onReceive",
                "android.content.Context", "android.content.Intent",
                new XC_MethodReplacement() {
                    protected Object replaceHookedMethod(MethodHookParam p) {
                        log("[bypass] threat broadcast ditelan"); return null;
                    }
                });
            log("[ok] hook u1.c.onReceive");
        } catch (Throwable t) { log("[err] u1.c.onReceive: " + t); }
        try {
            XposedHelpers.findAndHookMethod("D4.d", cl, "run",
                new XC_MethodReplacement() { protected Object replaceHookedMethod(MethodHookParam p) { return null; } });
        } catch (Throwable t) {}

        // (2) Konfig API native
        final String[] getters = {"getAPIUrl", "getAPIPath", "getAPIKey", "getAPISignature"};
        for (final String g : getters) {
            try {
                XposedHelpers.findAndHookMethod("com.kcstream.cing.api.Service", cl, g,
                    new XC_MethodHook() {
                        protected void afterHookedMethod(MethodHookParam p) {
                            try {
                                String s = String.valueOf(p.getResult());
                                log("[api] " + g + "() = " + s);
                                if ("getAPIKey".equals(g) || "getAPISignature".equals(g)) {
                                    byte[] d = Base64.decode(s, 0);
                                    log("[api] " + g + " decoded: str=" + new String(d) + " | hex=" + hex(d));
                                }
                            } catch (Throwable e) {}
                        }
                    });
            } catch (Throwable t) { log("[err] hook " + g + ": " + t); }
        }

        // (3a) Semua header request
        try {
            XposedHelpers.findAndHookMethod("Fa.e", cl, "g", "java.lang.String", "java.lang.String",
                new XC_MethodHook() {
                    protected void beforeHookedMethod(MethodHookParam p) {
                        try { log("[hdr] " + p.args[0] + ": " + p.args[1]); } catch (Throwable e) {}
                    }
                });
        } catch (Throwable t) { log("[warn] Fa.e.g: " + t); }

        // (3b) URL + status request
        try {
            XposedHelpers.findAndHookMethod("com.kcstream.cing.api.Service", cl, "a",
                "com.kcstream.cing.api.Service", "ca.f",
                new XC_MethodHook() {
                    protected void afterHookedMethod(MethodHookParam p) {
                        try { log("[http] " + String.valueOf(p.getResult())); } catch (Throwable e) {}
                    }
                });
        } catch (Throwable t) { log("[warn] Service.a: " + t); }

        // (3c) BODY (decoded): Gson instansiasi model via Unsafe (konstruktor TAK dipanggil),
        //      jadi hook getter yang PASTI dipanggil saat render detail:
        //      Posts.getDownload() -> nama asli di dex = "c". toString() memuat seluruh field
        //      (stream=[...] & download=[...] lengkap type + name + link). Dedupe per objek.
        try {
            final Set<Integer> seenPosts = Collections.synchronizedSet(new HashSet<Integer>());
            XposedHelpers.findAndHookMethod("com.kcstream.cing.model.Posts", cl, "c",
                new XC_MethodHook() {
                    protected void afterHookedMethod(MethodHookParam p) {
                        try {
                            Object o = p.thisObject;
                            if (o == null || !seenPosts.add(System.identityHashCode(o))) return;
                            Object dl = p.getResult();                        // = download list
                            Object st = XposedHelpers.getObjectField(o, "stream");
                            int nd = (dl instanceof java.util.List) ? ((java.util.List) dl).size() : -1;
                            int ns = (st instanceof java.util.List) ? ((java.util.List) st).size() : -1;
                            Object id = XposedHelpers.getObjectField(o, "id");
                            // Cetak list stream & download TERPISAH (field 'content' HTML besar
                            // bikin toString penuh kepotong limit baris logcat). Ini yang kita mau:
                            // PostsDownload(type, links=[PostsDownloadLinks(name, link), ...]).
                            log("[post] id=" + id + " stream=" + ns + " download=" + nd);
                            log("[stream] " + String.valueOf(st));
                            log("[download] " + String.valueOf(dl));
                        } catch (Throwable e) {}
                    }
                });
            log("[ok] hook Posts.getDownload (body logger)");
        } catch (Throwable t) { log("[warn] Posts.getDownload: " + t); }

        // ===================== AD-BLOCK =====================

        // (A) UnityAds interstitial -> no-op (iklan in-app di luar player)
        try {
            Class<?> ua = XposedHelpers.findClass("com.unity3d.ads.UnityAds", cl);
            XposedBridge.hookAllMethods(ua, "show", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam p) { log("[ad] UnityAds.show diblok"); return null; }
            });
            log("[ok] UnityAds.show diblok");
        } catch (Throwable t) { log("[warn] UnityAds: " + t); }

        // (B) WebView: intercept resource iklan (in-app banner + di player)
        final XC_MethodHook intercept = new XC_MethodHook() {
            protected void beforeHookedMethod(MethodHookParam p) {
                try {
                    Object rq = p.args[1];
                    String url = (rq instanceof String) ? (String) rq
                                 : String.valueOf(XposedHelpers.callMethod(rq, "getUrl"));
                    if (isAd(url)) { p.setResult(blank()); }
                } catch (Throwable e) {}
            }
        };
        // client default (tak di-override)
        try { XposedHelpers.findAndHookMethod("android.webkit.WebViewClient", cl, "shouldInterceptRequest",
                "android.webkit.WebView", "android.webkit.WebResourceRequest", intercept); } catch (Throwable t) {}
        try { XposedHelpers.findAndHookMethod("android.webkit.WebViewClient", cl, "shouldInterceptRequest",
                "android.webkit.WebView", "java.lang.String", intercept); } catch (Throwable t) {}
        // client kustom app (mis. BrowserActivity) -> tangkap via setWebViewClient
        try {
            XposedHelpers.findAndHookMethod("android.webkit.WebView", cl, "setWebViewClient",
                "android.webkit.WebViewClient", new XC_MethodHook() {
                    protected void beforeHookedMethod(MethodHookParam p) {
                        try {
                            Object c = p.args[0]; if (c == null) return;
                            String cn = c.getClass().getName();
                            if (HOOKED.add(cn)) {
                                try { XposedHelpers.findAndHookMethod(c.getClass(), "shouldInterceptRequest",
                                        "android.webkit.WebView", "android.webkit.WebResourceRequest", intercept); } catch (Throwable e) {}
                                try { XposedHelpers.findAndHookMethod(c.getClass(), "shouldInterceptRequest",
                                        "android.webkit.WebView", "java.lang.String", intercept); } catch (Throwable e) {}
                                log("[ad] intercept dipasang di client " + cn);
                            }
                        } catch (Throwable e) {}
                    }
                });
            log("[ok] hook setWebViewClient (adblock)");
        } catch (Throwable t) { log("[warn] setWebViewClient: " + t); }

        // (C) WebView.loadUrl -> log stream + blok navigasi iklan
        final XC_MethodHook wv = new XC_MethodHook() {
            protected void beforeHookedMethod(MethodHookParam p) {
                try {
                    String u = String.valueOf(p.args[0]);
                    if (isAd(u)) { p.setResult(null); log("[ad] loadUrl diblok: " + u); return; }
                    log("[stream] WebView.loadUrl: " + u);
                } catch (Throwable e) {}
            }
        };
        try { XposedHelpers.findAndHookMethod("android.webkit.WebView", cl, "loadUrl", "java.lang.String", wv); } catch (Throwable t) {}
        try { XposedHelpers.findAndHookMethod("android.webkit.WebView", cl, "loadUrl", "java.lang.String", "java.util.Map", wv); } catch (Throwable t) {}

        // (D) blok buka iklan ke browser eksternal (Intent VIEW ke host iklan)
        final XC_MethodHook saHook = new XC_MethodHook() {
            protected void beforeHookedMethod(MethodHookParam p) {
                try {
                    Object intent = p.args[0];
                    Object d = XposedHelpers.callMethod(intent, "getDataString");
                    if (d != null && isAd(String.valueOf(d))) { p.setResult(null); log("[ad] open-ext diblok: " + d); }
                } catch (Throwable e) {}
            }
        };
        try { XposedHelpers.findAndHookMethod("android.app.Activity", cl, "startActivity", "android.content.Intent", saHook); } catch (Throwable t) {}
        try { XposedHelpers.findAndHookMethod("android.app.Activity", cl, "startActivity", "android.content.Intent", "android.os.Bundle", saHook); } catch (Throwable t) {}

        // (E) sembunyikan teks instruksi iklan "KLIK IKLAN ATAU TOMBOL X..." (id/tx_streamNote,
        //     di-set dari field 'note' server). Hook setText -> GONE bila berisi teks itu.
        try {
            XposedBridge.hookAllMethods(XposedHelpers.findClass("android.widget.TextView", cl), "setText",
                new XC_MethodHook() {
                    protected void afterHookedMethod(MethodHookParam p) {
                        try {
                            if (p.args.length > 0 && p.args[0] != null) {
                                String t = p.args[0].toString();
                                if (t.contains("MENGHILANGKAN IKLAN") || t.contains("KLIK IKLAN")) {
                                    ((android.view.View) p.thisObject).setVisibility(android.view.View.GONE);
                                    log("[ui] teks iklan disembunyikan");
                                }
                            }
                        } catch (Throwable e) {}
                    }
                });
            log("[ok] hook hide teks KLIK IKLAN");
        } catch (Throwable t) { log("[warn] hideNote: " + t); }

        // (F) tutup SPACE kosong bekas container iklan di SEMUA layar (scan view-tree -> GONE)
        try {
            XposedHelpers.findAndHookMethod("android.app.Activity", cl, "onResume",
                new XC_MethodHook() {
                    protected void afterHookedMethod(MethodHookParam p) {
                        try {
                            android.app.Activity a = (android.app.Activity) p.thisObject;
                            collapseAds(a.getWindow().getDecorView());
                        } catch (Throwable e) {}
                    }
                });
            log("[ok] hook tutup space iklan (scan)");
        } catch (Throwable t) { log("[warn] hideAdView: " + t); }

        log("[ok] AD-BLOCK aktif");
    }

    // GONE-kan view yang id resource-nya mengandung "ads"/"adview" (container iklan)
    private static void collapseAds(android.view.View v) {
        try {
            int id = v.getId();
            if (id != android.view.View.NO_ID) {
                String name = null;
                try { name = v.getResources().getResourceEntryName(id); } catch (Throwable e) {}
                if (name != null) {
                    String n = name.toLowerCase();
                    if (looksLikeAd(n)) {
                        if (v.getVisibility() != android.view.View.GONE) {
                            v.setVisibility(android.view.View.GONE);
                            log("[ui] container iklan GONE: " + name);
                        }
                        return; // tak perlu telusuri anak container yg sudah disembunyikan
                    }
                }
            }
            if (v instanceof android.view.ViewGroup) {
                android.view.ViewGroup g = (android.view.ViewGroup) v;
                for (int i = 0; i < g.getChildCount(); i++) collapseAds(g.getChildAt(i));
            }
        } catch (Throwable e) {}
    }

    // Match id iklan berbasis TOKEN, bukan substring. Mencegah false-positive:
    // "downloads"/"cv_downloads"/"bottom_navigation_downloads" mengandung "ads"
    // tapi BUKAN iklan (itu UI Unduhan). Token di-split pada non-alfanumerik.
    private static boolean looksLikeAd(String n) {
        if (n.contains("download")) return false; // lindungi fitur Unduhan
        for (String tok : n.split("[^a-z0-9]+")) {
            if (tok.equals("ad") || tok.equals("ads") || tok.equals("adview")
                || tok.equals("admob") || tok.equals("adbanner") || tok.equals("adcontainer")
                || tok.equals("adlayout") || tok.equals("adcontent")
                || tok.startsWith("adview") || tok.startsWith("admob")
                || tok.startsWith("adbanner") || tok.startsWith("adcontainer")) {
                return true;
            }
        }
        return false;
    }
}
