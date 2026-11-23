package Z7;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class o extends J7.m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ScheduledExecutorService f5901s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final L7.a f5902t = new L7.a(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f5903u;

    public o(ScheduledExecutorService scheduledExecutorService) {
        this.f5901s = scheduledExecutorService;
    }

    @Override // J7.m
    public final L7.b a(Runnable runnable, long j, TimeUnit timeUnit) {
        boolean z6 = this.f5903u;
        O7.c cVar = O7.c.f3610s;
        if (z6) {
            return cVar;
        }
        m mVar = new m(runnable, this.f5902t);
        this.f5902t.a(mVar);
        try {
            mVar.a(j <= 0 ? this.f5901s.submit((Callable) mVar) : this.f5901s.schedule((Callable) mVar, j, timeUnit));
            return mVar;
        } catch (RejectedExecutionException e10) {
            f();
            J7.j.y(e10);
            return cVar;
        }
    }

    @Override // L7.b
    public final void f() {
        if (this.f5903u) {
            return;
        }
        this.f5903u = true;
        this.f5902t.f();
    }
}
