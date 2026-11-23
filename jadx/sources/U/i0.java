package U;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements View.OnApplyWindowInsetsListener {
    public final X2.j a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B0 f4820b;

    public i0(View view, X2.j jVar) {
        B0 b0B;
        this.a = jVar;
        WeakHashMap weakHashMap = U.a;
        B0 b0A = I.a(view);
        if (b0A != null) {
            int i10 = Build.VERSION.SDK_INT;
            b0B = (i10 >= 30 ? new r0(b0A) : i10 >= 29 ? new q0(b0A) : new p0(b0A)).b();
        } else {
            b0B = null;
        }
        this.f4820b = b0B;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        y0 y0Var;
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f4820b = B0.h(view, windowInsets);
            return j0.i(view, windowInsets);
        }
        B0 b0H = B0.h(view, windowInsets);
        if (this.f4820b == null) {
            WeakHashMap weakHashMap = U.a;
            this.f4820b = I.a(view);
        }
        if (this.f4820b == null) {
            this.f4820b = b0H;
            return j0.i(view, windowInsets);
        }
        X2.j jVarJ = j0.j(view);
        if (jVarJ != null && Objects.equals((WindowInsets) jVarJ.f5409c, windowInsets)) {
            return j0.i(view, windowInsets);
        }
        B0 b3 = this.f4820b;
        int i10 = 1;
        int i11 = 0;
        while (true) {
            y0Var = b0H.a;
            if (i10 > 256) {
                break;
            }
            if (!y0Var.f(i10).equals(b3.a.f(i10))) {
                i11 |= i10;
            }
            i10 <<= 1;
        }
        if (i11 == 0) {
            return j0.i(view, windowInsets);
        }
        B0 b7 = this.f4820b;
        if ((i11 & 8) != 0) {
            interpolator = y0Var.f(8).f2714d > b7.a.f(8).f2714d ? j0.f4821e : j0.f4822f;
        } else {
            interpolator = j0.f4823g;
        }
        n0 n0Var = new n0(i11, interpolator, 160L);
        n0Var.a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(n0Var.a.a());
        L.c cVarF = y0Var.f(i11);
        L.c cVarF2 = b7.a.f(i11);
        int iMin = Math.min(cVarF.a, cVarF2.a);
        int i12 = cVarF.f2712b;
        int i13 = cVarF2.f2712b;
        int iMin2 = Math.min(i12, i13);
        int i14 = cVarF.f2713c;
        int i15 = cVarF2.f2713c;
        int iMin3 = Math.min(i14, i15);
        int i16 = cVarF.f2714d;
        int i17 = cVarF2.f2714d;
        o1.e eVar = new o1.e(L.c.b(iMin, iMin2, iMin3, Math.min(i16, i17)), 10, L.c.b(Math.max(cVarF.a, cVarF2.a), Math.max(i12, i13), Math.max(i14, i15), Math.max(i16, i17)));
        j0.f(view, windowInsets, false);
        duration.addUpdateListener(new g0(n0Var, b0H, b7, i11, view));
        duration.addListener(new h0(n0Var, view, 0));
        ViewTreeObserverOnPreDrawListenerC0435v.a(view, new B4.I(view, n0Var, eVar, duration));
        this.f4820b = b0H;
        return j0.i(view, windowInsets);
    }
}
