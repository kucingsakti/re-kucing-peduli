package E4;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.kcstream.cing.activity.ItemActivity;

/* JADX INFO: renamed from: E4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0206u extends B4.Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ItemActivity f1440b;

    public C0206u(ItemActivity itemActivity) {
        this.f1440b = itemActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        p210v8.i.f(sslErrorHandler, "handler");
        sslErrorHandler.cancel();
    }

    @Override // B4.S, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            String string = url.toString();
            p210v8.i.e(string, "toString(...)");
            boolean zJ = L9.f.J(string, "img.doodcdn.co", false);
            ItemActivity itemActivity = this.f1440b;
            if (zJ) {
                itemActivity.f10190k0 = true;
            }
            String string2 = url.toString();
            p210v8.i.e(string2, "toString(...)");
            if (L9.f.J(string2, "upstreamcdn.co", false)) {
                itemActivity.f10191l0 = true;
            }
            String string3 = url.toString();
            p210v8.i.e(string3, "toString(...)");
            if (L9.f.J(string3, "voe-network.net", false)) {
                itemActivity.f10192m0 = true;
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // B4.S, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String strValueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        if (L9.f.J(strValueOf, "clean", false) || L9.f.J(strValueOf, "shopee", false) || L9.f.J(strValueOf, "lazada", false) || L9.f.J(strValueOf, "tokopedia", false) || L9.f.J(strValueOf, "market", false) || L9.f.J(strValueOf, "intent://", false)) {
            return true;
        }
        ItemActivity itemActivity = this.f1440b;
        return !strValueOf.equals(itemActivity.f0) || itemActivity.f10190k0 || itemActivity.f10192m0 || itemActivity.f10191l0;
    }

    @Override // B4.S, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        p210v8.i.f(str, "url");
        boolean zJ = L9.f.J(str, "img.doodcdn.co", false);
        ItemActivity itemActivity = this.f1440b;
        if (zJ) {
            itemActivity.f10190k0 = true;
        }
        if (L9.f.J(str, "upstreamcdn.co", false)) {
            itemActivity.f10191l0 = true;
        }
        if (L9.f.J(str, "voe-network.net", false)) {
            itemActivity.f10192m0 = true;
        }
        return false;
    }
}
