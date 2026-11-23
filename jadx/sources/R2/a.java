package R2;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final LinearInterpolator a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p178s0.a f4441b = new p178s0.a(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p178s0.a f4442c = new p178s0.a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p178s0.a f4443d = new p178s0.a(p178s0.a.f14586e);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f4444e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return ((f11 - f10) * f12) + f10;
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= f12) {
            return f10;
        }
        return f14 >= f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(int i10, float f10, int i11) {
        return Math.round(f10 * (i11 - i10)) + i10;
    }
}
