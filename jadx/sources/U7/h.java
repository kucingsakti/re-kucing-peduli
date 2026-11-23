package U7;

import J7.j;
import io.reactivex.exceptions.CompositeException;
import p068ga.l;

/* JADX INFO: loaded from: classes.dex */
public final class h implements J7.i, L7.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final J7.i f4918s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f4919t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public L7.b f4920u;

    public h(J7.i iVar, i iVar2) {
        this.f4918s = iVar;
        this.f4919t = iVar2;
    }

    @Override // J7.i
    public final void a() {
        L7.b bVar = this.f4920u;
        O7.b bVar2 = O7.b.f3608s;
        if (bVar == bVar2) {
            return;
        }
        try {
            this.f4919t.getClass();
            this.f4920u = bVar2;
            this.f4918s.a();
            d();
        } catch (Throwable th) {
            l.n(th);
            e(th);
        }
    }

    @Override // J7.i
    public final void b(L7.b bVar) {
        J7.i iVar = this.f4918s;
        if (O7.b.k(this.f4920u, bVar)) {
            try {
                this.f4919t.getClass();
                this.f4920u = bVar;
                iVar.b(this);
            } catch (Throwable th) {
                l.n(th);
                bVar.f();
                this.f4920u = O7.b.f3608s;
                iVar.b(O7.c.f3610s);
                iVar.onError(th);
            }
        }
    }

    @Override // J7.i
    public final void c(Object obj) {
        L7.b bVar = this.f4920u;
        O7.b bVar2 = O7.b.f3608s;
        if (bVar == bVar2) {
            return;
        }
        try {
            this.f4919t.getClass();
            this.f4920u = bVar2;
            this.f4918s.c(obj);
            d();
        } catch (Throwable th) {
            l.n(th);
            e(th);
        }
    }

    public final void d() {
        try {
            ((V.h) this.f4919t.f4923u).mo0run();
        } catch (Throwable th) {
            l.n(th);
            j.y(th);
        }
    }

    public final void e(Throwable th) {
        try {
            this.f4919t.getClass();
        } catch (Throwable th2) {
            l.n(th2);
            th = new CompositeException(th, th2);
        }
        this.f4920u = O7.b.f3608s;
        this.f4918s.onError(th);
        d();
    }

    @Override // L7.b
    public final void f() {
        try {
            this.f4919t.getClass();
        } catch (Throwable th) {
            l.n(th);
            j.y(th);
        }
        this.f4920u.f();
        this.f4920u = O7.b.f3608s;
    }

    @Override // J7.i
    public final void onError(Throwable th) {
        if (this.f4920u == O7.b.f3608s) {
            j.y(th);
        } else {
            e(th);
        }
    }
}
