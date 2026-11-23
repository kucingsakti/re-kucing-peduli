package Z7;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class d extends J7.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f5861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f5862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f5863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f5864e;
    public final AtomicReference a;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f5863d = iAvailableProcessors;
        c cVar = new c(new k("RxComputationShutdown"));
        f5864e = cVar;
        cVar.f();
        k kVar = new k("RxComputationThreadPool", true, Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())));
        f5862c = kVar;
        b bVar = new b(0, kVar);
        f5861b = bVar;
        for (c cVar2 : bVar.f5859b) {
            cVar2.f();
        }
    }

    public d() {
        AtomicReference atomicReference;
        k kVar = f5862c;
        b bVar = f5861b;
        this.a = new AtomicReference(bVar);
        b bVar2 = new b(f5863d, kVar);
        do {
            atomicReference = this.a;
            if (atomicReference.compareAndSet(bVar, bVar2)) {
                return;
            }
        } while (atomicReference.get() == bVar);
        for (c cVar : bVar2.f5859b) {
            cVar.f();
        }
    }

    @Override // J7.n
    public final J7.m a() {
        c cVar;
        b bVar = (b) this.a.get();
        int i10 = bVar.a;
        if (i10 == 0) {
            cVar = f5864e;
        } else {
            long j = bVar.f5860c;
            bVar.f5860c = 1 + j;
            cVar = bVar.f5859b[(int) (j % ((long) i10))];
        }
        return new a(cVar);
    }

    @Override // J7.n
    public final L7.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        c cVar;
        b bVar = (b) this.a.get();
        int i10 = bVar.a;
        if (i10 == 0) {
            cVar = f5864e;
        } else {
            long j10 = bVar.f5860c;
            bVar.f5860c = 1 + j10;
            cVar = bVar.f5859b[(int) (j10 % ((long) i10))];
        }
        cVar.getClass();
        l lVar = new l(runnable);
        ScheduledExecutorService scheduledExecutorService = cVar.f5884s;
        try {
            lVar.a(j <= 0 ? scheduledExecutorService.submit(lVar) : scheduledExecutorService.schedule(lVar, j, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e10) {
            J7.j.y(e10);
            return O7.c.f3610s;
        }
    }
}
