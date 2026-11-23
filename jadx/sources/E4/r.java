package E4;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class r extends B4.Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1436b;

    public /* synthetic */ r(int i10) {
        this.f1436b = i10;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.f1436b) {
            case 0:
                p210v8.i.f(sslErrorHandler, "handler");
                sslErrorHandler.cancel();
                break;
            default:
                p210v8.i.f(sslErrorHandler, "handler");
                sslErrorHandler.cancel();
                break;
        }
    }

    @Override // B4.S, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f1436b) {
            case 0:
                String strValueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
                if (!L9.f.J(strValueOf, "clean", false) && !L9.f.J(strValueOf, "shopee", false) && !L9.f.J(strValueOf, "lazada", false) && !L9.f.J(strValueOf, "tokopedia", false) && !L9.f.J(strValueOf, "market", false) && !L9.f.J(strValueOf, "intent://", false) && webView != null) {
                    webView.loadUrl(Uri.parse(strValueOf).toString());
                }
                return true;
            default:
                String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
                return L9.f.J(strValueOf2, "shopee", false) || L9.f.J(strValueOf2, "lazada", false) || L9.f.J(strValueOf2, "tokopedia", false) || L9.f.J(strValueOf2, "market", false);
        }
    }

    @Override // B4.S, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f1436b) {
            case 0:
                p210v8.i.f(str, "url");
                if (webView == null) {
                    return true;
                }
                webView.loadUrl(str);
                return true;
            default:
                p210v8.i.f(str, "url");
                return L9.f.J(str, "shopee", false) || L9.f.J(str, "lazada", false) || L9.f.J(str, "tokopedia", false) || L9.f.J(str, "market", false);
        }
    }
}
