package E4;

import A1.C0099h;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.kcstream.cing.R;
import java.io.File;

/* JADX INFO: renamed from: E4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0193g extends androidx.fragment.app.b {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f1412t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Bundle f1413u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final File f1414v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final StringBuilder f1415w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public C0099h f1416x0;

    public C0193g(String str, Bundle bundle, File file, StringBuilder sb) {
        p210v8.i.f(str, "url");
        p210v8.i.f(bundle, "urlFromIntent");
        p210v8.i.f(sb, "blocklist");
        this.f1412t0 = str;
        this.f1413u0 = bundle;
        this.f1414v0 = file;
        this.f1415w0 = sb;
    }

    @Override // androidx.fragment.app.b
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p210v8.i.f(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_activity_browser2_webview, viewGroup, false);
        int i10 = R.id.progressBar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) oa.b.c(viewInflate, R.id.progressBar);
        if (linearProgressIndicator != null) {
            i10 = R.id.rl_layout;
            if (((RelativeLayout) oa.b.c(viewInflate, R.id.rl_layout)) != null) {
                i10 = R.id.webview;
                WebView webView = (WebView) oa.b.c(viewInflate, R.id.webview);
                if (webView != null) {
                    this.f1416x0 = new C0099h((ConstraintLayout) viewInflate, linearProgressIndicator, webView, 14);
                    try {
                        g0(this.f1414v0, this.f1415w0);
                    } catch (Exception e10) {
                        za.c cVar = Ha.a.a;
                        e10.getStackTrace();
                        cVar.getClass();
                        za.c.k(new Object[0]);
                    }
                    C0099h c0099h = this.f1416x0;
                    if (c0099h != null) {
                        ((WebView) c0099h.f105v).loadUrl(this.f1412t0);
                    }
                    C0099h c0099h2 = this.f1416x0;
                    if (c0099h2 != null) {
                        return (ConstraintLayout) c0099h2.f103t;
                    }
                    return null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.b
    public final void F() {
        this.f6634a0 = true;
        this.f1416x0 = null;
    }

    @Override // androidx.fragment.app.b
    public final void G() {
        this.f6634a0 = true;
        this.f1416x0 = null;
    }

    public final void g0(File file, StringBuilder sb) {
        C0099h c0099h = this.f1416x0;
        if (c0099h != null) {
            C0191e c0191e = new C0191e(c0099h, file, sb, 0);
            WebView webView = (WebView) c0099h.f105v;
            webView.setWebViewClient(c0191e);
            webView.setDownloadListener(new C0190d(this, webView, 0));
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setSupportMultipleWindows(true);
            webView.getSettings().setDomStorageEnabled(true);
            String userAgentString = webView.getSettings().getUserAgentString();
            p210v8.i.c(userAgentString);
            webView.getSettings().setUserAgentString(L9.n.G(userAgentString, "; wv", ""));
            webView.setWebChromeClient(new C0192f(c0099h, this, file, sb));
        }
    }
}
