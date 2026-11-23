package p178s0;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Interpolator {
    public final float[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14587b;

    public b(float[] fArr) {
        this.a = fArr;
        this.f14587b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f14587b;
        float f12 = (f10 - (iMin * f11)) / f11;
        float f13 = fArr[iMin];
        return ((fArr[iMin + 1] - f13) * f12) + f13;
    }
}
