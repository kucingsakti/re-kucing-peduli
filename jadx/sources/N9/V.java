package N9;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class V extends U implements E {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Executor f3433t;

    public V(Executor executor) {
        Method method;
        this.f3433t = executor;
        Method method2 = S9.c.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = S9.c.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // N9.E
    public final void b(long j, C0324g c0324g) {
        Executor executor = this.f3433t;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new C3.c(this, 21, c0324g), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                c0 c0Var = (c0) c0324g.f3452w.get(b0.f3440s);
                if (c0Var != null) {
                    ((k0) c0Var).k(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            c0324g.y(new C0322e(scheduledFutureSchedule, 0));
        } else {
            A.f3407A.b(j, c0324g);
        }
    }

    @Override // N9.E
    public final K c(long j, u0 u0Var, p123m8.i iVar) {
        Executor executor = this.f3433t;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(u0Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                c0 c0Var = (c0) iVar.get(b0.f3440s);
                if (c0Var != null) {
                    ((k0) c0Var).k(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new J(scheduledFutureSchedule) : A.f3407A.c(j, u0Var, iVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f3433t;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof V) && ((V) obj).f3433t == this.f3433t;
    }

    @Override // N9.AbstractC0337u
    public final void g(p123m8.i iVar, Runnable runnable) {
        try {
            this.f3433t.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            c0 c0Var = (c0) iVar.get(b0.f3440s);
            if (c0Var != null) {
                ((k0) c0Var).k(cancellationException);
            }
            I.f3415c.g(iVar, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3433t);
    }

    @Override // N9.U
    public final Executor t() {
        return this.f3433t;
    }

    @Override // N9.AbstractC0337u
    public final String toString() {
        return this.f3433t.toString();
    }
}
