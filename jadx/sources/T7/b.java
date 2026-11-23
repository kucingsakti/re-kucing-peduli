package T7;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends AtomicLong implements J7.d, ua.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final J7.f f4703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final O7.a f4704t = new O7.a();

    public b(J7.f fVar) {
        this.f4703s = fVar;
    }

    public final void a() {
        O7.a aVar = this.f4704t;
        if (aVar.a()) {
            return;
        }
        try {
            this.f4703s.a();
        } finally {
            O7.b.g(aVar);
        }
    }

    public final boolean b(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        O7.a aVar = this.f4704t;
        if (aVar.a()) {
            return false;
        }
        try {
            this.f4703s.onError(th);
            return true;
        } finally {
            O7.b.g(aVar);
        }
    }

    public final void c(Throwable th) {
        if (i(th)) {
            return;
        }
        J7.j.y(th);
    }

    @Override // ua.a
    public final void cancel() {
        O7.a aVar = this.f4704t;
        aVar.getClass();
        O7.b.g(aVar);
        g();
    }

    @Override // ua.a
    public final void f(long j) {
        if (p018b8.a.g(j)) {
            com.bumptech.glide.e.a(this, j);
            e();
        }
    }

    public final void h(p045e7.a aVar) {
        O7.a aVar2 = new O7.a(aVar);
        while (true) {
            O7.a aVar3 = this.f4704t;
            L7.b bVar = (L7.b) aVar3.get();
            if (bVar == O7.b.f3608s) {
                aVar2.f();
                return;
            }
            do {
                if (aVar3.compareAndSet(bVar, aVar2)) {
                    if (bVar != null) {
                        bVar.f();
                        return;
                    }
                    return;
                }
            } while (aVar3.get() == bVar);
        }
    }

    public boolean i(Throwable th) {
        return b(th);
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return getClass().getSimpleName() + "{" + super.toString() + "}";
    }

    public void e() {
    }

    public void g() {
    }
}
