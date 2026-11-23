package J0;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Interpolator {
    public final /* synthetic */ int a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        switch (this.a) {
            case 0:
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            case 1:
                float f12 = f10 - 1.0f;
                return (f12 * f12 * f12 * f12 * f12) + 1.0f;
            default:
                float f13 = f10 - 1.0f;
                return (f13 * f13 * f13 * f13 * f13) + 1.0f;
        }
    }
}
