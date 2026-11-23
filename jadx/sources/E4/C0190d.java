package E4;

import android.content.Context;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import p078i.AbstractActivityC0655l;

/* JADX INFO: renamed from: E4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0190d implements DownloadListener {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0193g f1404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f1405c;

    public /* synthetic */ C0190d(C0193g c0193g, WebView webView, int i10) {
        this.a = i10;
        this.f1404b = c0193g;
        this.f1405c = webView;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        AbstractActivityC0655l abstractActivityC0655lF;
        switch (this.a) {
            case 0:
                C0193g c0193g = this.f1404b;
                p210v8.i.f(c0193g, "this$0");
                WebView webView = this.f1405c;
                if (str != null && c0193g.v()) {
                    Ha.a.a.getClass();
                    za.c.m(new Object[0]);
                    AbstractActivityC0655l abstractActivityC0655lF2 = c0193g.f();
                    if (abstractActivityC0655lF2 != null) {
                        Context context = webView.getContext();
                        p210v8.i.e(context, "getContext(...)");
                        p210v8.i.c(str4);
                        new K4.m(context, abstractActivityC0655lF2, c0193g.f1413u0, str3, str, str2, j, str4).execute(str);
                    }
                    break;
                }
                break;
            default:
                C0193g c0193g2 = this.f1404b;
                p210v8.i.f(c0193g2, "this$0");
                WebView webView2 = this.f1405c;
                if (str != null && c0193g2.v() && (abstractActivityC0655lF = c0193g2.f()) != null) {
                    Context context2 = webView2.getContext();
                    p210v8.i.e(context2, "getContext(...)");
                    p210v8.i.c(str4);
                    new K4.m(context2, abstractActivityC0655lF, c0193g2.f1413u0, str3, str, str2, j, str4).execute(str);
                    break;
                }
                break;
        }
    }
}
