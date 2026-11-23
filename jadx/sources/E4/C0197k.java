package E4;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.kcstream.cing.activity.BrowserActivity;
import java.io.ByteArrayInputStream;
import java.io.File;

/* JADX INFO: renamed from: E4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0197k extends WebViewClient {
    public final /* synthetic */ BrowserActivity a;

    public C0197k(BrowserActivity browserActivity) {
        this.a = browserActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        p210v8.i.f(str, "url");
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        p210v8.i.f(sslErrorHandler, "handler");
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String host;
        BrowserActivity browserActivity = this.a;
        File file = browserActivity.f10177a0;
        if (file != null && file.exists() && browserActivity.f10177a0 != null) {
            byte[] bytes = "".getBytes(L9.a.a);
            p210v8.i.e(bytes, "getBytes(...)");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            String strValueOf = String.valueOf(browserActivity.f10176Z);
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (host = url.getHost()) != null && L9.f.J(strValueOf, ":::::".concat(host), false)) {
                return new WebResourceResponse("text/plain", "utf-8", byteArrayInputStream);
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String host;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (host = url.getHost()) != null) {
            L9.f.J(host, "linkpoi", false);
            if (L9.f.J(host, "shopee", false) || L9.f.J(host, "lazada", false) || L9.f.J(host, "tokopedia", false) || L9.f.J(host, "market", false)) {
                return true;
            }
            if (webView != null) {
                webView.loadUrl(webResourceRequest.getUrl().toString());
            }
        }
        return false;
    }
}
