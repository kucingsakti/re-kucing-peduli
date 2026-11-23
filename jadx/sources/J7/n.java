package J7;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    static {
        Boolean.getBoolean("rx2.scheduler.use-nanotime");
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    public abstract m a();

    public L7.b b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public L7.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        m mVarA = a();
        l lVar = new l(runnable, mVarA);
        mVarA.a(lVar, j, timeUnit);
        return lVar;
    }
}
