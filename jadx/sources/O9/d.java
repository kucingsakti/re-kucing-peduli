package O9;

import N9.AbstractC0337u;
import N9.C0324g;
import N9.E;
import N9.I;
import N9.K;
import N9.b0;
import N9.c0;
import N9.k0;
import N9.m0;
import N9.u0;
import S9.n;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import p123m8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0337u implements E {
    private volatile d _immediate;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Handler f3802t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f3803u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f3804v;

    public d(Handler handler, boolean z6) {
        this.f3802t = handler;
        this.f3803u = z6;
        this._immediate = z6 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, true);
            this._immediate = dVar;
        }
        this.f3804v = dVar;
    }

    @Override // N9.E
    public final void b(long j, C0324g c0324g) {
        C3.c cVar = new C3.c(c0324g, 23, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f3802t.postDelayed(cVar, j)) {
            c0324g.y(new E0.b(this, 2, cVar));
        } else {
            t(c0324g.f3452w, cVar);
        }
    }

    @Override // N9.E
    public final K c(long j, final u0 u0Var, i iVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f3802t.postDelayed(u0Var, j)) {
            return new K() { // from class: O9.c
                @Override // N9.K
                public final void f() {
                    this.f3800s.f3802t.removeCallbacks(u0Var);
                }
            };
        }
        t(iVar, u0Var);
        return m0.f3471s;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f3802t == this.f3802t;
    }

    @Override // N9.AbstractC0337u
    public final void g(i iVar, Runnable runnable) {
        if (this.f3802t.post(runnable)) {
            return;
        }
        t(iVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3802t);
    }

    @Override // N9.AbstractC0337u
    public final boolean o() {
        return (this.f3803u && p210v8.i.a(Looper.myLooper(), this.f3802t.getLooper())) ? false : true;
    }

    public final void t(i iVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        c0 c0Var = (c0) iVar.get(b0.f3440s);
        if (c0Var != null) {
            ((k0) c0Var).k(cancellationException);
        }
        I.f3415c.g(iVar, runnable);
    }

    @Override // N9.AbstractC0337u
    public final String toString() {
        d dVar;
        String str;
        U9.d dVar2 = I.a;
        d dVar3 = n.a;
        if (this == dVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar3.f3804v;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f3802t.toString();
        return this.f3803u ? p231y.a.c(string, ".immediate") : string;
    }
}
