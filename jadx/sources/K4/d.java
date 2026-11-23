package K4;

import A1.C0099h;
import B4.Q;
import android.app.Activity;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0099h f2587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f2588c;

    public d(C0099h c0099h, Activity activity) {
        this.f2587b = c0099h;
        this.f2588c = activity;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        p210v8.i.f(sslErrorHandler, "handler");
        sslErrorHandler.cancel();
    }

    @Override // B4.S, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String strValueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        if (L9.f.J(strValueOf, "linkpoi", false)) {
            return false;
        }
        this.f2587b.n(this.f2588c, strValueOf);
        return true;
    }

    @Override // B4.S, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        p210v8.i.f(str, "url");
        if (L9.f.J(str, "linkpoi", false)) {
            return false;
        }
        this.f2587b.n(this.f2588c, str);
        return true;
    }
}
