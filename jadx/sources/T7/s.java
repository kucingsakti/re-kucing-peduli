package T7;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class s extends AtomicInteger implements J7.f, ua.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final J7.f f4751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ua.a f4752t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f4753u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Throwable f4754v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f4755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicLong f4756x = new AtomicLong();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicReference f4757y = new AtomicReference();

    public s(J7.f fVar) {
        this.f4751s = fVar;
    }

    @Override // J7.f
    public final void a() {
        this.f4753u = true;
        g();
    }

    @Override // J7.f
    public final void c(ua.a aVar) {
        if (p018b8.a.h(this.f4752t, aVar)) {
            this.f4752t = aVar;
            this.f4751s.c(this);
            aVar.f(Long.MAX_VALUE);
        }
    }

    @Override // ua.a
    public final void cancel() {
        if (this.f4755w) {
            return;
        }
        this.f4755w = true;
        this.f4752t.cancel();
        if (getAndIncrement() == 0) {
            this.f4757y.lazySet(null);
        }
    }

    @Override // J7.f
    public final void d(Object obj) {
        this.f4757y.lazySet(obj);
        g();
    }

    public final boolean e(boolean z6, boolean z10, J7.f fVar, AtomicReference atomicReference) {
        if (this.f4755w) {
            atomicReference.lazySet(null);
            return true;
        }
        if (!z6) {
            return false;
        }
        Throwable th = this.f4754v;
        if (th != null) {
            atomicReference.lazySet(null);
            fVar.onError(th);
            return true;
        }
        if (!z10) {
            return false;
        }
        fVar.a();
        return true;
    }

    @Override // ua.a
    public final void f(long j) {
        if (p018b8.a.g(j)) {
            com.bumptech.glide.e.a(this.f4756x, j);
            g();
        }
    }

    public final void g() {
        if (getAndIncrement() != 0) {
            return;
        }
        J7.f fVar = this.f4751s;
        AtomicLong atomicLong = this.f4756x;
        AtomicReference atomicReference = this.f4757y;
        int iAddAndGet = 1;
        do {
            long j = 0;
            while (true) {
                if (j == atomicLong.get()) {
                    break;
                }
                boolean z6 = this.f4753u;
                Object andSet = atomicReference.getAndSet(null);
                boolean z10 = andSet == null;
                if (e(z6, z10, fVar, atomicReference)) {
                    return;
                }
                if (z10) {
                    break;
                }
                fVar.d(andSet);
                j++;
            }
            if (j == atomicLong.get()) {
                if (e(this.f4753u, atomicReference.get() == null, fVar, atomicReference)) {
                    return;
                }
            }
            if (j != 0) {
                com.bumptech.glide.e.n(atomicLong, j);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // J7.f
    public final void onError(Throwable th) {
        this.f4754v = th;
        this.f4753u = true;
        g();
    }
}
