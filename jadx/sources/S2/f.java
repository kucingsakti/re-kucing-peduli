package S2;

import J0.C0256f;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends G.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0256f f4526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4527t = 0;

    public f() {
    }

    @Override // G.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        x(coordinatorLayout, view, i10);
        if (this.f4526s == null) {
            C0256f c0256f = new C0256f();
            c0256f.f2305d = view;
            this.f4526s = c0256f;
        }
        C0256f c0256f2 = this.f4526s;
        View view2 = (View) c0256f2.f2305d;
        c0256f2.a = view2.getTop();
        c0256f2.f2303b = view2.getLeft();
        this.f4526s.c();
        int i11 = this.f4527t;
        if (i11 == 0) {
            return true;
        }
        C0256f c0256f3 = this.f4526s;
        if (c0256f3.f2304c != i11) {
            c0256f3.f2304c = i11;
            c0256f3.c();
        }
        this.f4527t = 0;
        return true;
    }

    public final int w() {
        C0256f c0256f = this.f4526s;
        if (c0256f != null) {
            return c0256f.f2304c;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.q(view, i10);
    }

    public f(int i10) {
    }
}
