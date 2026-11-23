package U;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ n0 a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B0 f4807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B0 f4808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f4810e;

    public g0(n0 n0Var, B0 b3, B0 b7, int i10, View view) {
        this.a = n0Var;
        this.f4807b = b3;
        this.f4808c = b7;
        this.f4809d = i10;
        this.f4810e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        s0 q0Var;
        int i10;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        n0 n0Var = this.a;
        n0Var.a.d(animatedFraction);
        float fB = n0Var.a.b();
        PathInterpolator pathInterpolator = j0.f4821e;
        int i11 = Build.VERSION.SDK_INT;
        B0 b3 = this.f4807b;
        if (i11 >= 30) {
            q0Var = new r0(b3);
        } else {
            q0Var = i11 >= 29 ? new q0(b3) : new p0(b3);
        }
        int i12 = 1;
        while (i12 <= 256) {
            int i13 = this.f4809d & i12;
            y0 y0Var = b3.a;
            if (i13 == 0) {
                q0Var.c(i12, y0Var.f(i12));
                i10 = 1;
            } else {
                L.c cVarF = y0Var.f(i12);
                L.c cVarF2 = this.f4808c.a.f(i12);
                float f10 = 1.0f - fB;
                i10 = 1;
                q0Var.c(i12, B0.e(cVarF, (int) (((double) ((cVarF.a - cVarF2.a) * f10)) + 0.5d), (int) (((double) ((cVarF.f2712b - cVarF2.f2712b) * f10)) + 0.5d), (int) (((double) ((cVarF.f2713c - cVarF2.f2713c) * f10)) + 0.5d), (int) (((double) ((cVarF.f2714d - cVarF2.f2714d) * f10)) + 0.5d)));
            }
            i12 <<= i10;
            fB = fB;
        }
        j0.g(this.f4810e, q0Var.b(), Collections.singletonList(n0Var));
    }
}
