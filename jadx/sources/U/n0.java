package U;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    public m0 a;

    public n0(int i10, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new l0(B6.a.k(i10, interpolator, j));
        } else {
            this.a = new j0(i10, interpolator, j);
        }
    }
}
