package N9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends S9.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f3464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0 f3465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0 f3466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y f3467e;

    public j0(f0 f0Var, k0 k0Var, Y y6) {
        this.f3466d = k0Var;
        this.f3467e = y6;
        this.f3464b = f0Var;
    }

    @Override // S9.b
    public final void b(Object obj, Object obj2) {
        S9.j jVar = (S9.j) obj;
        boolean z6 = obj2 == null;
        f0 f0Var = this.f3464b;
        Y y6 = z6 ? f0Var : this.f3465c;
        if (y6 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = S9.j.f4566s;
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, this, y6)) {
                if (atomicReferenceFieldUpdater.get(jVar) != this) {
                    return;
                }
            }
            if (z6) {
                l0 l0Var = this.f3465c;
                p210v8.i.c(l0Var);
                f0Var.i(l0Var);
            }
        }
    }

    @Override // S9.b
    public final O3.y c(Object obj) {
        if (this.f3466d.y() == this.f3467e) {
            return null;
        }
        return S9.a.f4550e;
    }
}
