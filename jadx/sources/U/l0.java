package U;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f4827e;

    public l0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f4827e = windowInsetsAnimation;
    }

    @Override // U.m0
    public final long a() {
        return this.f4827e.getDurationMillis();
    }

    @Override // U.m0
    public final float b() {
        return this.f4827e.getInterpolatedFraction();
    }

    @Override // U.m0
    public final int c() {
        return this.f4827e.getTypeMask();
    }

    @Override // U.m0
    public final void d(float f10) {
        this.f4827e.setFraction(f10);
    }
}
