package Z7;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class j extends J7.m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ScheduledExecutorService f5884s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f5885t;

    public j(k kVar) {
        boolean z6 = n.a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, kVar);
        if (n.a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            n.f5900d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f5884s = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // J7.m
    public final L7.b a(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f5885t ? O7.c.f3610s : c(runnable, j, timeUnit, null);
    }

    @Override // J7.m
    public final void b(T7.o oVar) {
        a(oVar, 0L, null);
    }

    public final m c(Runnable runnable, long j, TimeUnit timeUnit, L7.a aVar) {
        m mVar = new m(runnable, aVar);
        if (aVar == null || aVar.a(mVar)) {
            ScheduledExecutorService scheduledExecutorService = this.f5884s;
            try {
                mVar.a(j <= 0 ? scheduledExecutorService.submit((Callable) mVar) : scheduledExecutorService.schedule((Callable) mVar, j, timeUnit));
                return mVar;
            } catch (RejectedExecutionException e10) {
                if (aVar != null) {
                    aVar.h(mVar);
                }
                J7.j.y(e10);
            }
        }
        return mVar;
    }

    @Override // L7.b
    public final void f() {
        if (this.f5885t) {
            return;
        }
        this.f5885t = true;
        this.f5884s.shutdownNow();
    }
}
