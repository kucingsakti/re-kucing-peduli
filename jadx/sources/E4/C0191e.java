package E4;

import A1.C0099h;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.kcstream.cing.activity.Browser2Activity;
import java.io.ByteArrayInputStream;
import java.io.File;
import p078i.AbstractActivityC0655l;

/* JADX INFO: renamed from: E4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0191e extends WebViewClient {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f1406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f1407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1408d;

    public /* synthetic */ C0191e(Object obj, File file, StringBuilder sb, int i10) {
        this.a = i10;
        this.f1408d = obj;
        this.f1406b = file;
        this.f1407c = sb;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        switch (this.a) {
            case 0:
                super.onPageFinished(webView, str);
                ((LinearProgressIndicator) ((C0099h) this.f1408d).f104u).setVisibility(8);
                break;
            default:
                p210v8.i.f(webView, "view");
                p210v8.i.f(str, "url");
                AbstractActivityC0655l abstractActivityC0655lF = ((C0193g) this.f1408d).f();
                Browser2Activity browser2Activity = abstractActivityC0655lF instanceof Browser2Activity ? (Browser2Activity) abstractActivityC0655lF : null;
                if (browser2Activity != null) {
                    browser2Activity.f10165Q.add(str);
                    C0189c c0189c = browser2Activity.f10166R;
                    if (c0189c != null) {
                        c0189c.a.b();
                    }
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.a) {
            case 0:
                C0099h c0099h = (C0099h) this.f1408d;
                super.onPageStarted(webView, str, bitmap);
                try {
                    ((LinearProgressIndicator) c0099h.f104u).setVisibility(0);
                    ((LinearProgressIndicator) c0099h.f104u).setProgress(0);
                } catch (Exception e10) {
                    za.c cVar = Ha.a.a;
                    e10.getStackTrace();
                    cVar.getClass();
                    za.c.k(new Object[0]);
                    return;
                }
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.a) {
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

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String host;
        Uri url2;
        String host2;
        switch (this.a) {
            case 0:
                if (this.f1406b.exists()) {
                    byte[] bytes = "".getBytes(L9.a.a);
                    p210v8.i.e(bytes, "getBytes(...)");
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                    String strValueOf = String.valueOf(this.f1407c);
                    if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (host = url.getHost()) != null && L9.f.J(strValueOf, ":::::".concat(host), false)) {
                        return new WebResourceResponse("text/plain", "utf-8", byteArrayInputStream);
                    }
                }
                return super.shouldInterceptRequest(webView, webResourceRequest);
            default:
                if (this.f1406b.exists()) {
                    byte[] bytes2 = "".getBytes(L9.a.a);
                    p210v8.i.e(bytes2, "getBytes(...)");
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bytes2);
                    String strValueOf2 = String.valueOf(this.f1407c);
                    if (webResourceRequest != null && (url2 = webResourceRequest.getUrl()) != null && (host2 = url2.getHost()) != null && L9.f.J(strValueOf2, ":::::".concat(host2), false)) {
                        return new WebResourceResponse("text/plain", "utf-8", byteArrayInputStream2);
                    }
                }
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 0:
                p210v8.i.f(webView, "view");
                p210v8.i.f(webResourceRequest, "request");
                String string = webResourceRequest.getUrl().toString();
                p210v8.i.e(string, "toString(...)");
                return (L9.n.I(string, "http://", false) || L9.n.I(string, "https://", false)) ? false : true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.a) {
            case 0:
                p210v8.i.f(webView, "view");
                p210v8.i.f(str, "url");
                return (L9.n.I(str, "http://", false) || L9.n.I(str, "https://", false)) ? false : true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
