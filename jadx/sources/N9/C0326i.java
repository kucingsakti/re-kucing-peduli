package N9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: N9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0326i extends d0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0324g f3459w;

    public C0326i(C0324g c0324g) {
        this.f3459w = c0324g;
    }

    @Override // p200u8.b
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n((Throwable) obj);
        return p076h8.m.a;
    }

    @Override // N9.f0
    public final void n(Throwable th) {
        k0 k0VarM = m();
        C0324g c0324g = this.f3459w;
        Throwable thU = c0324g.u(k0VarM);
        if (c0324g.A()) {
            p123m8.d dVar = c0324g.f3451v;
            p210v8.i.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            S9.g gVar = (S9.g) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = S9.g.f4555z;
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                O3.y yVar = S9.a.f4549d;
                if (p210v8.i.a(obj, yVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, yVar, thU)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != yVar) {
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(gVar) == obj);
                }
            }
        }
        c0324g.r(thU);
        if (c0324g.A()) {
            return;
        }
        c0324g.s();
    }
}
