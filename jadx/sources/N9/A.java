package N9;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class A extends S implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final A f3407A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final long f3408B;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l4;
        A a = new A();
        f3407A = a;
        a.E(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f3408B = timeUnit.toNanos(l4.longValue());
    }

    @Override // N9.T
    public final Thread B() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // N9.T
    public final void J(long j, P p10) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // N9.S
    public final void K(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.K(runnable);
    }

    public final synchronized void Y() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            S.f3426x.set(this, null);
            S.f3427y.set(this, null);
            notifyAll();
        }
    }

    @Override // N9.S, N9.E
    public final K c(long j, u0 u0Var, p123m8.i iVar) {
        long j10 = 0;
        if (j > 0) {
            j10 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j10 >= 4611686018427387903L) {
            return m0.f3471s;
        }
        long jNanoTime = System.nanoTime();
        O o10 = new O(j10 + jNanoTime, u0Var);
        X(jNanoTime, o10);
        return o10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s0.a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 == 2 || i10 == 3) {
                    _thread = null;
                    Y();
                    if (W()) {
                        return;
                    }
                    B();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jG = G();
                    if (jG == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f3408B + jNanoTime;
                        }
                        long j10 = j - jNanoTime;
                        if (j10 <= 0) {
                            _thread = null;
                            Y();
                            if (W()) {
                                return;
                            }
                            B();
                            return;
                        }
                        if (jG > j10) {
                            jG = j10;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jG > 0) {
                        int i11 = debugStatus;
                        if (i11 == 2 || i11 == 3) {
                            _thread = null;
                            Y();
                            if (W()) {
                                return;
                            }
                            B();
                            return;
                        }
                        LockSupport.parkNanos(this, jG);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            Y();
            if (!W()) {
                B();
            }
            throw th;
        }
    }

    @Override // N9.S, N9.T
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
