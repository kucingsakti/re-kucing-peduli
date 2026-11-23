package B4;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.webkit.WebView;
import com.kcstream.cing.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: B4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0169q extends B {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Activity f704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public P f705m;

    @Override // B4.B, B4.AbstractC0153a
    public final void a(P p10, Activity activity) {
        super.a(p10, activity);
        this.f704l = activity;
        this.f705m = p10;
        LayoutInflater.from(activity);
    }

    @Override // B4.B, B4.AbstractC0153a
    public final void d(WebView webView, String str, String str2) {
        o(webView, str2);
    }

    @Override // B4.B, B4.AbstractC0153a
    public final void l(String str) {
        Activity activity = this.f704l;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        TextUtils.isEmpty("preDownload");
        o(this.f705m.getWebView(), str);
    }

    public final void o(WebView webView, String str) {
        Activity activity = this.f704l;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        try {
            int color = activity.getResources().getColor(R.color.black);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(-1), 0, spannableString.length(), 33);
            p190t3.g gVar = (p190t3.g) new WeakReference(p190t3.g.f(webView, spannableString)).get();
            gVar.f15196i.setBackgroundColor(color);
            gVar.g();
        } catch (Throwable unused) {
            String str2 = AbstractC0162j.a;
        }
    }
}
