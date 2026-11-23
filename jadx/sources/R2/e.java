package R2;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public long a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f4447c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4448d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4449e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4446b = 150;

    public e(long j) {
        this.a = j;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.a);
        objectAnimator.setDuration(this.f4446b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.f4448d);
        objectAnimator.setRepeatMode(this.f4449e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f4447c;
        return timeInterpolator != null ? timeInterpolator : a.f4441b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a == eVar.a && this.f4446b == eVar.f4446b && this.f4448d == eVar.f4448d && this.f4449e == eVar.f4449e) {
            return b().getClass().equals(eVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j10 = this.f4446b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f4448d) * 31) + this.f4449e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(e.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.a);
        sb.append(" duration: ");
        sb.append(this.f4446b);
        sb.append(" interpolator: ");
        sb.append(b().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f4448d);
        sb.append(" repeatMode: ");
        return E0.a.j(sb, this.f4449e, "}\n");
    }
}
