package com.google.android.gms.measurement.internal;

import M2.B;
import M2.C;
import M2.D;
import M2.L;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzhc extends L {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final AtomicLong f9103C = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f9104A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Semaphore f9105B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C f9106u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C f9107v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final PriorityBlockingQueue f9108w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinkedBlockingQueue f9109x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final B f9110y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final B f9111z;

    public zzhc(zzhj zzhjVar) {
        super(zzhjVar);
        this.f9104A = new Object();
        this.f9105B = new Semaphore(2);
        this.f9108w = new PriorityBlockingQueue();
        this.f9109x = new LinkedBlockingQueue();
        this.f9110y = new B(this, "Thread death: Uncaught exception on worker thread");
        this.f9111z = new B(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // B1.a
    public final void W0() {
        if (Thread.currentThread() != this.f9106u) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // M2.L
    public final boolean Z0() {
        return false;
    }

    public final D a1(Callable callable) {
        X0();
        D d3 = new D(this, callable, false);
        if (Thread.currentThread() != this.f9106u) {
            c1(d3);
            return d3;
        }
        if (!this.f9108w.isEmpty()) {
            i().f9047A.b("Callable skipped the worker queue.");
        }
        d3.run();
        return d3;
    }

    public final Object b1(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            l().f1(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                i().f9047A.b("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            i().f9047A.b("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void c1(D d3) {
        synchronized (this.f9104A) {
            try {
                this.f9108w.add(d3);
                C c10 = this.f9106u;
                if (c10 == null) {
                    C c11 = new C(this, "Measurement Worker", this.f9108w);
                    this.f9106u = c11;
                    c11.setUncaughtExceptionHandler(this.f9110y);
                    this.f9106u.start();
                } else {
                    c10.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d1(Runnable runnable) {
        X0();
        D d3 = new D(this, runnable, false, "Task exception on network thread");
        synchronized (this.f9104A) {
            try {
                this.f9109x.add(d3);
                C c10 = this.f9107v;
                if (c10 == null) {
                    C c11 = new C(this, "Measurement Network", this.f9109x);
                    this.f9107v = c11;
                    c11.setUncaughtExceptionHandler(this.f9111z);
                    this.f9107v.start();
                } else {
                    c10.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final D e1(Callable callable) {
        X0();
        D d3 = new D(this, callable, true);
        if (Thread.currentThread() == this.f9106u) {
            d3.run();
            return d3;
        }
        c1(d3);
        return d3;
    }

    public final void f1(Runnable runnable) {
        X0();
        Preconditions.i(runnable);
        c1(new D(this, runnable, false, "Task exception on worker thread"));
    }

    public final void g1(Runnable runnable) {
        X0();
        c1(new D(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean h1() {
        return Thread.currentThread() == this.f9106u;
    }

    public final void i1() {
        if (Thread.currentThread() != this.f9107v) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }
}
