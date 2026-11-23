package J3;

import A1.r;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p231y.h implements ScheduledFuture {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ScheduledFuture f2395z;

    public i(h hVar) {
        this.f2395z = hVar.a(new r(this, 17));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f2395z.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f2395z.getDelay(timeUnit);
    }

    @Override // p231y.h
    public final void h() {
        ScheduledFuture scheduledFuture = this.f2395z;
        Object obj = this.f15821s;
        scheduledFuture.cancel((obj instanceof p231y.b) && ((p231y.b) obj).a);
    }
}
