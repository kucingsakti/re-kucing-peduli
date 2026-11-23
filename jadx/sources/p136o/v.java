package p136o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public class v {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f13557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f13560e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f13563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f13564i;
    public PopupWindow.OnDismissListener j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13561f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f13565k = new u(this, 0);

    public v(int i10, Context context, View view, l lVar, boolean z6) {
        this.a = context;
        this.f13557b = lVar;
        this.f13560e = view;
        this.f13558c = z6;
        this.f13559d = i10;
    }

    public final t a() {
        t c10;
        if (this.f13564i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                c10 = new f(context, this.f13560e, this.f13559d, this.f13558c);
            } else {
                View view = this.f13560e;
                Context context2 = this.a;
                boolean z6 = this.f13558c;
                c10 = new C(this.f13559d, context2, view, this.f13557b, z6);
            }
            c10.n(this.f13557b);
            c10.t(this.f13565k);
            c10.p(this.f13560e);
            c10.h(this.f13563h);
            c10.q(this.f13562g);
            c10.r(this.f13561f);
            this.f13564i = c10;
        }
        return this.f13564i;
    }

    public final boolean b() {
        t tVar = this.f13564i;
        return tVar != null && tVar.b();
    }

    public void c() {
        this.f13564i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z6, boolean z10) {
        t tVarA = a();
        tVarA.u(z10);
        if (z6) {
            if ((Gravity.getAbsoluteGravity(this.f13561f, this.f13560e.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f13560e.getWidth();
            }
            tVarA.s(i10);
            tVarA.v(i11);
            int i12 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            tVarA.f13554s = new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        }
        tVarA.a();
    }
}
