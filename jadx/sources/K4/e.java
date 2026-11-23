package K4;

import A1.C0099h;
import B4.J;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class e extends J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f2589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0099h f2590c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C0099h c0099h, Activity activity) {
        super(0);
        this.f2589b = activity;
        this.f2590c = c0099h;
    }

    @Override // B4.G, android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z6, boolean z10, Message message) {
        Bundle data;
        String string;
        Handler handler;
        Activity activity = this.f2589b;
        WebView webView2 = new WebView(activity);
        WebSettings settings = webView2.getSettings();
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccessFromFileURLs(false);
        if (webView != null) {
            webView.addView(webView2);
        }
        webView2.setVisibility(8);
        Message messageObtainMessage = (webView == null || (handler = webView.getHandler()) == null) ? null : handler.obtainMessage();
        if (webView != null) {
            webView.requestFocusNodeHref(messageObtainMessage);
        }
        C0099h c0099h = this.f2590c;
        if (messageObtainMessage != null && (data = messageObtainMessage.getData()) != null && (string = data.getString("url")) != null && !L9.f.J(string, "linkpoi", false)) {
            c0099h.n(activity, string);
        }
        p210v8.i.c(message);
        Object obj = message.obj;
        p210v8.i.d(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
        ((WebView.WebViewTransport) obj).setWebView(webView2);
        message.sendToTarget();
        webView2.setWebViewClient(new d(c0099h, activity));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        p210v8.i.f(jsResult, "result");
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        p210v8.i.f(jsResult, "result");
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        p210v8.i.f(jsPromptResult, "result");
        jsPromptResult.cancel();
        return true;
    }

    @Override // B4.G, android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
    }
}
