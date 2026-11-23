package N9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends S9.j implements K, Y, p200u8.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public k0 f3447v;

    @Override // N9.Y
    public final boolean a() {
        return true;
    }

    @Override // N9.Y
    public final l0 c() {
        return null;
    }

    @Override // N9.K
    public final void f() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        k0 k0VarM = m();
        while (true) {
            Object objY = k0VarM.y();
            if (objY instanceof f0) {
                if (objY != this) {
                    return;
                }
                M m2 = AbstractC0342z.j;
                do {
                    atomicReferenceFieldUpdater2 = k0.f3469s;
                    if (atomicReferenceFieldUpdater2.compareAndSet(k0VarM, objY, m2)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(k0VarM) == objY);
            } else {
                if (!(objY instanceof Y) || ((Y) objY).c() == null) {
                    return;
                }
                while (true) {
                    Object objJ = j();
                    if (objJ instanceof S9.p) {
                        S9.j jVar = ((S9.p) objJ).a;
                        return;
                    }
                    if (objJ == this) {
                        return;
                    }
                    p210v8.i.d(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    S9.j jVar2 = (S9.j) objJ;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = S9.j.f4568u;
                    S9.p pVar = (S9.p) atomicReferenceFieldUpdater3.get(jVar2);
                    if (pVar == null) {
                        pVar = new S9.p(jVar2);
                        atomicReferenceFieldUpdater3.lazySet(jVar2, pVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = S9.j.f4566s;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, objJ, pVar)) {
                            jVar2.d();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == objJ);
                }
            }
        }
    }

    public c0 getParent() {
        return m();
    }

    public final k0 m() {
        k0 k0Var = this.f3447v;
        if (k0Var != null) {
            return k0Var;
        }
        p210v8.i.n("job");
        throw null;
    }

    public abstract void n(Throwable th);

    @Override // S9.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0342z.j(this) + "[job@" + AbstractC0342z.j(m()) + ']';
    }
}
