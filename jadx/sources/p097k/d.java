package p097k;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements TimeInterpolator {
    public int[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12616c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        int i10 = (int) ((f10 * this.f12616c) + 0.5f);
        int i11 = this.f12615b;
        int[] iArr = this.a;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr[i12];
            if (i10 < i13) {
                break;
            }
            i10 -= i13;
            i12++;
        }
        return (i12 / i11) + (i12 < i11 ? i10 / this.f12616c : 0.0f);
    }
}
