package B4;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class E {
    public Activity a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public M f626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WebView f627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FrameLayout f628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f629h;

    public final P a() {
        Activity activity = this.a;
        P p10 = new P(activity, null, -1);
        p10.f652s = null;
        p10.f654u = -1;
        p10.f657x = null;
        if (!(activity instanceof Activity)) {
            throw new IllegalArgumentException("WebParentLayout context must be activity or activity sub class .");
        }
        p10.f653t = R.layout.agentweb_error_page;
        String str = AbstractC0162j.a;
        p10.setId(R.id.web_parent_layout_id);
        p10.setBackgroundColor(-1);
        WebView f10 = this.f627f;
        if (f10 != null) {
            this.f629h = 3;
        } else {
            f10 = new F(this.a);
            this.f629h = 1;
        }
        this.f627f = f10;
        p10.addView(f10, new FrameLayout.LayoutParams(-1, -1));
        WebView webView = this.f627f;
        if (p10.f656w == null) {
            p10.f656w = webView;
        }
        ViewStub viewStub = new ViewStub(activity);
        viewStub.setId(R.id.mainframe_error_viewsub_id);
        p10.addView(viewStub, new FrameLayout.LayoutParams(-1, -1));
        if (this.f623b) {
            M m2 = new M(activity, null, 0);
            m2.f643v = 0;
            m2.f644w = 8000;
            m2.f645x = 450;
            m2.f646y = 600;
            m2.f647z = 0;
            m2.f636A = 0.0f;
            m2.f637B = 3;
            m2.f638C = new K(m2, 0);
            m2.f639D = new L(m2, 0);
            m2.f641t = new Paint();
            m2.f640s = Color.parseColor("#1aad19");
            m2.f641t.setAntiAlias(true);
            m2.f641t.setColor(m2.f640s);
            m2.f641t.setDither(true);
            m2.f641t.setStrokeCap(Paint.Cap.SQUARE);
            m2.f643v = activity.getResources().getDisplayMetrics().widthPixels;
            m2.f637B = (int) ((3.0f * activity.getResources().getDisplayMetrics().density) + 0.5f);
            int i10 = this.f625d;
            FrameLayout.LayoutParams layoutParams = i10 > 0 ? new FrameLayout.LayoutParams(-2, (int) ((i10 * activity.getResources().getDisplayMetrics().density) + 0.5f)) : new FrameLayout.LayoutParams(-1, m2.f637B);
            int i11 = this.f624c;
            if (i11 != -1) {
                m2.setColor(i11);
            }
            layoutParams.gravity = 48;
            this.f626e = m2;
            p10.addView(m2, layoutParams);
            m2.setVisibility(8);
        }
        return p10;
    }
}
