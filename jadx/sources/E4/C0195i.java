package E4;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: E4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0195i extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        p210v8.i.f(sslErrorHandler, "handler");
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        p210v8.i.f(webResourceRequest, "request");
        String string = webResourceRequest.getUrl().toString();
        p210v8.i.c(string);
        if (!L9.f.J(string, "clean", false) && !L9.f.J(string, "shopee", false) && !L9.f.J(string, "lazada", false) && !L9.f.J(string, "tokopedia", false) && !L9.f.J(string, "market", false) && !L9.f.J(string, "googleadservices", false) && webView != null) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        p210v8.i.f(str, "url");
        if (!L9.f.J(str, "clean", false) && !L9.f.J(str, "shopee", false) && !L9.f.J(str, "lazada", false) && !L9.f.J(str, "tokopedia", false) && !L9.f.J(str, "market", false) && !L9.f.J(str, "googleadservices", false) && webView != null) {
            webView.loadUrl(str);
        }
        return true;
    }
}
