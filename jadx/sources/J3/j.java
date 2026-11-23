package J3;

import A1.RunnableC0092a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Executor {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Logger f2396x = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Executor f2397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayDeque f2398t = new ArrayDeque();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2399u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f2400v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C3.c f2401w = new C3.c(this);

    public j(Executor executor) {
        Preconditions.i(executor);
        this.f2397s = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.i(runnable);
        synchronized (this.f2398t) {
            int i10 = this.f2399u;
            if (i10 != 4 && i10 != 3) {
                long j = this.f2400v;
                RunnableC0092a runnableC0092a = new RunnableC0092a(runnable, 2);
                this.f2398t.add(runnableC0092a);
                this.f2399u = 2;
                try {
                    this.f2397s.execute(this.f2401w);
                    if (this.f2399u != 2) {
                        return;
                    }
                    synchronized (this.f2398t) {
                        try {
                            if (this.f2400v == j && this.f2399u == 2) {
                                this.f2399u = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f2398t) {
                        try {
                            int i11 = this.f2399u;
                            boolean z6 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f2398t.removeLastOccurrence(runnableC0092a)) {
                                z6 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z6) {
                                throw e10;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f2398t.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f2397s + "}";
    }
}
