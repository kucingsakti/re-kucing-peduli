package Z7;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p extends J7.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f5904b;
    public final AtomicReference a;

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        f5904b = new k("RxSingleScheduler", true, Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())));
    }

    public p() {
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        boolean z6 = n.a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, f5904b);
        if (n.a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            n.f5900d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // J7.n
    public final J7.m a() {
        return new o((ScheduledExecutorService) this.a.get());
    }

    @Override // J7.n
    public final L7.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        l lVar = new l(runnable);
        AtomicReference atomicReference = this.a;
        try {
            lVar.a(j <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(lVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(lVar, j, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e10) {
            J7.j.y(e10);
            return O7.c.f3610s;
        }
    }
}
