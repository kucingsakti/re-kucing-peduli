package E4;

import A1.C0099h;
import android.os.Message;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.io.File;

/* JADX INFO: renamed from: E4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0192f extends WebChromeClient {
    public final /* synthetic */ C0099h a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0193g f1409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f1410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f1411d;

    public C0192f(C0099h c0099h, C0193g c0193g, File file, StringBuilder sb) {
        this.a = c0099h;
        this.f1409b = c0193g;
        this.f1410c = file;
        this.f1411d = sb;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z6, boolean z10, Message message) {
        p210v8.i.f(webView, "view");
        Object obj = message != null ? message.obj : null;
        p210v8.i.d(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) obj;
        webViewTransport.setWebView(new WebView(webView.getContext()));
        message.sendToTarget();
        WebView webView2 = webViewTransport.getWebView();
        C0193g c0193g = this.f1409b;
        if (webView2 != null) {
            webView2.setWebViewClient(new C0191e(c0193g, this.f1410c, this.f1411d, 1));
        }
        WebView webView3 = webViewTransport.getWebView();
        if (webView3 == null) {
            return true;
        }
        webView3.setDownloadListener(new C0190d(c0193g, webView3, 1));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        super.onPermissionRequest(permissionRequest);
        if (permissionRequest != null) {
            permissionRequest.deny();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        try {
            ((LinearProgressIndicator) this.a.f104u).setProgress(i10);
        } catch (Exception e10) {
            za.c cVar = Ha.a.a;
            e10.getStackTrace();
            cVar.getClass();
            za.c.k(new Object[0]);
        }
    }
}
