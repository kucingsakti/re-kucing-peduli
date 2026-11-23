package Z7;

import B4.RunnableC0160h;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f5898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f5899c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f5900d = new ConcurrentHashMap();

    static {
        boolean zEquals;
        int i10;
        try {
            String property = System.getProperty("rx2.purge-enabled");
            zEquals = property == null ? true : "true".equals(property);
        } catch (Throwable unused) {
        }
        a = zEquals;
        if (zEquals) {
            try {
                String property2 = System.getProperty("rx2.purge-period-seconds");
                i10 = property2 == null ? 1 : Integer.parseInt(property2);
            } catch (Throwable unused2) {
            }
        }
        f5898b = i10;
        if (!a) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f5899c;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new k("RxSchedulerPurge"));
            do {
                if (atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                    RunnableC0160h runnableC0160h = new RunnableC0160h(2);
                    long j = f5898b;
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(runnableC0160h, j, j, TimeUnit.SECONDS);
                    return;
                }
            } while (atomicReference.get() == scheduledExecutorService);
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
