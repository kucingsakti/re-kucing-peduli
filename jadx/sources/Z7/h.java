package Z7;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class h extends J7.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f5876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f5877c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f5880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f5881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f5882h;
    public final AtomicReference a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeUnit f5879e = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f5878d = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        g gVar = new g(new k("RxCachedThreadSchedulerShutdown"));
        f5880f = gVar;
        gVar.f();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        k kVar = new k("RxCachedThreadScheduler", false, iMax);
        f5876b = kVar;
        f5877c = new k("RxCachedWorkerPoolEvictor", false, iMax);
        f5881g = Boolean.getBoolean("rx2.io-scheduled-release");
        e eVar = new e(0L, null, kVar);
        f5882h = eVar;
        eVar.f5867u.f();
        ScheduledFuture scheduledFuture = eVar.f5869w;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = eVar.f5868v;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public h() {
        AtomicReference atomicReference;
        k kVar = f5876b;
        e eVar = f5882h;
        this.a = new AtomicReference(eVar);
        e eVar2 = new e(f5878d, f5879e, kVar);
        do {
            atomicReference = this.a;
            if (atomicReference.compareAndSet(eVar, eVar2)) {
                return;
            }
        } while (atomicReference.get() == eVar);
        eVar2.f5867u.f();
        ScheduledFuture scheduledFuture = eVar2.f5869w;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = eVar2.f5868v;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // J7.n
    public final J7.m a() {
        return new f((e) this.a.get());
    }
}
