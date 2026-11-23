package Z7;

import B4.RunnableC0160h;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AtomicReference implements Callable, L7.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final FutureTask f5889u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final FutureTask f5890v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f5891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Thread f5892t;

    static {
        RunnableC0160h runnableC0160h = P7.a.a;
        f5889u = new FutureTask(runnableC0160h, null);
        f5890v = new FutureTask(runnableC0160h, null);
    }

    public l(Runnable runnable) {
        this.f5891s = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f5889u) {
                return;
            }
            if (future2 == f5890v) {
                future.cancel(this.f5892t != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = f5889u;
        this.f5892t = Thread.currentThread();
        try {
            this.f5891s.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f5892t = null;
        }
    }

    @Override // L7.b
    public final void f() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f5889u || future == (futureTask = f5890v) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f5892t != Thread.currentThread());
    }
}
