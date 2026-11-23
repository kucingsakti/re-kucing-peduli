package B4;

import android.app.Activity;
import android.net.http.SslError;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* JADX INFO: renamed from: B4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0153a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f658c;
    public volatile boolean a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B f659b;

    static {
        try {
            int[] iArr = p190t3.g.f15207B;
            int i10 = X2.h.f5396I;
            f658c = true;
        } catch (Throwable unused) {
            f658c = false;
            String str = AbstractC0162j.a;
        }
    }

    public abstract void a(P p10, Activity activity);

    public final AbstractC0153a b() {
        B b3;
        B b7 = this.f659b;
        B b10 = b7;
        if (b7 == null) {
            if (f658c) {
                C0169q c0169q = new C0169q();
                c0169q.f704l = null;
                b3 = c0169q;
            } else {
                b3 = new B();
            }
            this.f659b = b3;
            b10 = b3;
        }
        return b10;
    }

    public abstract void c(String str, r rVar);

    public abstract void d(WebView webView, String str, String str2);

    public abstract void e(WebView webView, String str, String str2, JsResult jsResult);

    public abstract void f(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult);

    public abstract void g(WebView webView, int i10, String str, String str2);

    public abstract void h(WebView webView, String str, r rVar);

    public abstract void i(PermissionRequest permissionRequest);

    public abstract void j(String[] strArr);

    public abstract void k();

    public abstract void l(String str);

    public abstract void m(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);
}
