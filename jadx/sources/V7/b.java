package V7;

import J7.f;
import J7.j;
import J7.o;
import com.bumptech.glide.e;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p028c8.c;
import p068ga.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AtomicInteger implements f, ua.a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f5190B = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f5191A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f5192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p045e7.f f5193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p028c8.a f5194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicLong f5195v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicReference f5196w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ua.a f5197x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f5198y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f5199z;

    public b(f fVar) {
        p045e7.f fVar2 = p045e7.f.f10718t;
        this.f5192s = fVar;
        this.f5193t = fVar2;
        this.f5194u = new p028c8.a();
        this.f5195v = new AtomicLong();
        this.f5196w = new AtomicReference();
    }

    @Override // J7.f
    public final void a() {
        this.f5198y = true;
        g();
    }

    @Override // J7.f
    public final void c(ua.a aVar) {
        if (p018b8.a.h(this.f5197x, aVar)) {
            this.f5197x = aVar;
            this.f5192s.c(this);
            aVar.f(Long.MAX_VALUE);
        }
    }

    @Override // ua.a
    public final void cancel() {
        this.f5199z = true;
        this.f5197x.cancel();
        e();
    }

    @Override // J7.f
    public final void d(Object obj) {
        a aVar = f5190B;
        AtomicReference atomicReference = this.f5196w;
        a aVar2 = (a) atomicReference.get();
        if (aVar2 != null) {
            O7.b.g(aVar2);
        }
        try {
            o oVar = (o) this.f5193t.apply(obj);
            a aVar3 = new a(this);
            while (true) {
                a aVar4 = (a) atomicReference.get();
                if (aVar4 == aVar) {
                    return;
                }
                do {
                    if (atomicReference.compareAndSet(aVar4, aVar3)) {
                        oVar.b(aVar3);
                        return;
                    }
                } while (atomicReference.get() == aVar4);
            }
        } catch (Throwable th) {
            l.n(th);
            this.f5197x.cancel();
            atomicReference.getAndSet(aVar);
            onError(th);
        }
    }

    public final void e() {
        AtomicReference atomicReference = this.f5196w;
        a aVar = f5190B;
        a aVar2 = (a) atomicReference.getAndSet(aVar);
        if (aVar2 == null || aVar2 == aVar) {
            return;
        }
        O7.b.g(aVar2);
    }

    @Override // ua.a
    public final void f(long j) {
        e.a(this.f5195v, j);
        g();
    }

    public final void g() {
        if (getAndIncrement() != 0) {
            return;
        }
        f fVar = this.f5192s;
        p028c8.a aVar = this.f5194u;
        AtomicReference atomicReference = this.f5196w;
        AtomicLong atomicLong = this.f5195v;
        long j = this.f5191A;
        int iAddAndGet = 1;
        while (!this.f5199z) {
            if (aVar.get() != null) {
                p028c8.b bVar = c.a;
                Throwable th = (Throwable) aVar.get();
                p028c8.b bVar2 = c.a;
                if (th != bVar2) {
                    th = (Throwable) aVar.getAndSet(bVar2);
                }
                fVar.onError(th);
                return;
            }
            boolean z6 = this.f5198y;
            a aVar2 = (a) atomicReference.get();
            boolean z10 = aVar2 == null;
            if (z6 && z10) {
                p028c8.b bVar3 = c.a;
                Throwable th2 = (Throwable) aVar.get();
                p028c8.b bVar4 = c.a;
                if (th2 != bVar4) {
                    th2 = (Throwable) aVar.getAndSet(bVar4);
                }
                if (th2 != null) {
                    fVar.onError(th2);
                    return;
                } else {
                    fVar.a();
                    return;
                }
            }
            if (z10 || aVar2.f5189t == null || j == atomicLong.get()) {
                this.f5191A = j;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                }
                fVar.d(aVar2.f5189t);
                j++;
            }
        }
    }

    @Override // J7.f
    public final void onError(Throwable th) {
        if (!this.f5194u.a(th)) {
            j.y(th);
            return;
        }
        e();
        this.f5198y = true;
        g();
    }
}
