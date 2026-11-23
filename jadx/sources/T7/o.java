package T7;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends AtomicInteger implements J7.f, Runnable, Q7.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Throwable f4734A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4735B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f4736C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f4737D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final J7.m f4738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f4739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f4740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicLong f4741v = new AtomicLong();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ua.a f4742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Q7.d f4743x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f4744y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f4745z;

    public o(J7.m mVar, int i10) {
        this.f4738s = mVar;
        this.f4739t = i10;
        this.f4740u = i10 - (i10 >> 2);
    }

    @Override // J7.f
    public final void a() {
        if (this.f4745z) {
            return;
        }
        this.f4745z = true;
        o();
    }

    @Override // ua.a
    public final void cancel() {
        if (this.f4744y) {
            return;
        }
        this.f4744y = true;
        this.f4742w.cancel();
        this.f4738s.f();
        if (this.f4737D || getAndIncrement() != 0) {
            return;
        }
        this.f4743x.clear();
    }

    @Override // Q7.d
    public final void clear() {
        this.f4743x.clear();
    }

    @Override // J7.f
    public final void d(Object obj) {
        if (this.f4745z) {
            return;
        }
        if (this.f4735B == 2) {
            o();
            return;
        }
        if (!this.f4743x.offer(obj)) {
            this.f4742w.cancel();
            this.f4734A = new MissingBackpressureException("Queue is full?!");
            this.f4745z = true;
        }
        o();
    }

    public final boolean e(boolean z6, boolean z10, J7.f fVar) {
        if (this.f4744y) {
            clear();
            return true;
        }
        if (!z6) {
            return false;
        }
        Throwable th = this.f4734A;
        if (th != null) {
            this.f4744y = true;
            clear();
            fVar.onError(th);
            this.f4738s.f();
            return true;
        }
        if (!z10) {
            return false;
        }
        this.f4744y = true;
        fVar.a();
        this.f4738s.f();
        return true;
    }

    @Override // ua.a
    public final void f(long j) {
        if (p018b8.a.g(j)) {
            com.bumptech.glide.e.a(this.f4741v, j);
            o();
        }
    }

    @Override // Q7.b
    public final int g() {
        this.f4737D = true;
        return 2;
    }

    @Override // Q7.d
    public final boolean isEmpty() {
        return this.f4743x.isEmpty();
    }

    public abstract void k();

    public abstract void m();

    public abstract void n();

    public final void o() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.f4738s.b(this);
    }

    @Override // Q7.d
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // J7.f
    public final void onError(Throwable th) {
        if (this.f4745z) {
            J7.j.y(th);
            return;
        }
        this.f4734A = th;
        this.f4745z = true;
        o();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4737D) {
            m();
        } else if (this.f4735B == 1) {
            n();
        } else {
            k();
        }
    }
}
