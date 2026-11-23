package p007a7;

import N6.l;
import N6.n;
import N6.o;
import android.database.DataSetObserver;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Z0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f6006c;

    @Override // Z0.a
    public final void a(l lVar, int i10, Object obj) {
        int iQ = q();
        o oVar = this.f6006c;
        if (iQ < 1) {
            oVar.a(lVar, 0, obj);
        } else {
            oVar.a(lVar, r(i10), obj);
        }
    }

    @Override // Z0.a
    public final void b() {
        this.f6006c.getClass();
    }

    @Override // Z0.a
    public final int c() {
        if (q() < 1) {
            return 0;
        }
        return q() * 32400;
    }

    @Override // Z0.a
    public final void d() {
        this.f6006c.getClass();
    }

    @Override // Z0.a
    public final void e(int i10) {
        r(i10);
        this.f6006c.getClass();
    }

    @Override // Z0.a
    public final void f() {
        this.f6006c.getClass();
    }

    @Override // Z0.a
    public final n g(l lVar, int i10) {
        int iQ = q();
        o oVar = this.f6006c;
        return iQ < 1 ? oVar.g(lVar, 0) : oVar.g(lVar, r(i10));
    }

    @Override // Z0.a
    public final boolean h(View view, Object obj) {
        return this.f6006c.h(view, obj);
    }

    @Override // Z0.a
    public final void j(DataSetObserver dataSetObserver) {
        this.f6006c.j(dataSetObserver);
    }

    @Override // Z0.a
    public final void k() {
        this.f6006c.getClass();
    }

    @Override // Z0.a
    public final void l() {
        this.f6006c.getClass();
    }

    @Override // Z0.a
    public final void m() {
        this.f6006c.getClass();
    }

    @Override // Z0.a
    public final void o() {
        this.f6006c.getClass();
    }

    @Override // Z0.a
    public final void p(DataSetObserver dataSetObserver) {
        this.f6006c.p(dataSetObserver);
    }

    public final int q() {
        try {
            return this.f6006c.c();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final int r(int i10) {
        if (q() > 0) {
            return i10 % q();
        }
        return 0;
    }
}
