package Z7;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f5865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConcurrentLinkedQueue f5866t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final L7.a f5867u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ScheduledExecutorService f5868v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ScheduledFuture f5869w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k f5870x;

    public e(long j, TimeUnit timeUnit, k kVar) {
        e eVar;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.f5865s = nanos;
        this.f5866t = new ConcurrentLinkedQueue();
        this.f5867u = new L7.a(0);
        this.f5870x = kVar;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, h.f5877c);
            eVar = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(eVar, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            eVar = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        eVar.f5868v = scheduledExecutorServiceNewScheduledThreadPool;
        eVar.f5869w = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue<g> concurrentLinkedQueue = this.f5866t;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        for (g gVar : concurrentLinkedQueue) {
            if (gVar.f5875u > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(gVar)) {
                this.f5867u.h(gVar);
            }
        }
    }
}
