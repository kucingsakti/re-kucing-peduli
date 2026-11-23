package U;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B0 f4771b;
    public final y0 a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f4771b = x0.f4863q;
        } else {
            f4771b = y0.f4864b;
        }
    }

    public B0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.a = new x0(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.a = new w0(this, windowInsets);
        } else if (i10 >= 28) {
            this.a = new v0(this, windowInsets);
        } else {
            this.a = new u0(this, windowInsets);
        }
    }

    public static L.c e(L.c cVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, cVar.a - i10);
        int iMax2 = Math.max(0, cVar.f2712b - i11);
        int iMax3 = Math.max(0, cVar.f2713c - i12);
        int iMax4 = Math.max(0, cVar.f2714d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? cVar : L.c.b(iMax, iMax2, iMax3, iMax4);
    }

    public static B0 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        B0 b3 = new B0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = U.a;
            B0 b0A = I.a(view);
            y0 y0Var = b3.a;
            y0Var.p(b0A);
            y0Var.d(view.getRootView());
        }
        return b3;
    }

    public final int a() {
        return this.a.j().f2714d;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int c() {
        return this.a.j().f2713c;
    }

    public final int d() {
        return this.a.j().f2712b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        return Objects.equals(this.a, ((B0) obj).a);
    }

    public final B0 f(int i10, int i11, int i12, int i13) {
        s0 q0Var;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            q0Var = new r0(this);
        } else {
            q0Var = i14 >= 29 ? new q0(this) : new p0(this);
        }
        q0Var.g(L.c.b(i10, i11, i12, i13));
        return q0Var.b();
    }

    public final WindowInsets g() {
        y0 y0Var = this.a;
        if (y0Var instanceof t0) {
            return ((t0) y0Var).f4851c;
        }
        return null;
    }

    public final int hashCode() {
        y0 y0Var = this.a;
        if (y0Var == null) {
            return 0;
        }
        return y0Var.hashCode();
    }

    public B0() {
        this.a = new y0(this);
    }
}
