package U;

import android.view.VelocityTracker;

/* JADX INFO: renamed from: U.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0438y {
    public static float a(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getAxisVelocity(i10);
    }

    public static float b(VelocityTracker velocityTracker, int i10, int i11) {
        return velocityTracker.getAxisVelocity(i10, i11);
    }

    public static boolean c(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.isAxisSupported(i10);
    }
}
