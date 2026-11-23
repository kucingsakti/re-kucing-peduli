package J7;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements L7.b {
    public abstract L7.b a(Runnable runnable, long j, TimeUnit timeUnit);

    public void b(T7.o oVar) {
        a(oVar, 0L, TimeUnit.NANOSECONDS);
    }
}
