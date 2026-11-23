package B4;

import android.webkit.WebView;

/* JADX INFO: renamed from: B4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0165m extends B1.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0159g f695t;

    @Override // B1.a
    public final void P0(C0159g c0159g) {
        this.f695t = c0159g;
    }

    @Override // B1.a
    public final B1.a S0(WebView webView) {
        webView.setDownloadListener(new t(this.f695t.a, webView));
        return this;
    }
}
