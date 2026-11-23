package U7;

import J7.j;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import p068ga.l;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicReference implements J7.i, L7.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final P0.d f4906s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final V.h f4907t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p170r3.e f4908u;

    public a(P0.d dVar, V.h hVar) {
        p170r3.e eVar = P7.a.f3897b;
        this.f4906s = dVar;
        this.f4907t = hVar;
        this.f4908u = eVar;
    }

    @Override // J7.i
    public final void a() {
        lazySet(O7.b.f3608s);
        try {
            this.f4908u.getClass();
        } catch (Throwable th) {
            l.n(th);
            j.y(th);
        }
    }

    @Override // J7.i
    public final void b(L7.b bVar) {
        O7.b.j(this, bVar);
    }

    @Override // J7.i
    public final void c(Object obj) {
        lazySet(O7.b.f3608s);
        try {
            this.f4906s.accept(obj);
        } catch (Throwable th) {
            l.n(th);
            j.y(th);
        }
    }

    @Override // L7.b
    public final void f() {
        O7.b.g(this);
    }

    @Override // J7.i
    public final void onError(Throwable th) {
        lazySet(O7.b.f3608s);
        try {
            this.f4907t.accept(th);
        } catch (Throwable th2) {
            l.n(th2);
            j.y(new CompositeException(th, th2));
        }
    }
}
