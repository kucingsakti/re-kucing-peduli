package U;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f4828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f4829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4830d;

    public m0(int i10, Interpolator interpolator, long j) {
        this.a = i10;
        this.f4829c = interpolator;
        this.f4830d = j;
    }

    public long a() {
        return this.f4830d;
    }

    public float b() {
        Interpolator interpolator = this.f4829c;
        return interpolator != null ? interpolator.getInterpolation(this.f4828b) : this.f4828b;
    }

    public int c() {
        return this.a;
    }

    public void d(float f10) {
        this.f4828b = f10;
    }
}
