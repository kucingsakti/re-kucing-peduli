package A9;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0151y {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p247z9.l f323t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p210v8.k f324u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p247z9.i f325v;

    /* JADX WARN: Multi-variable type inference failed */
    public B(p247z9.l lVar, p200u8.a aVar) {
        p210v8.i.f(lVar, "storageManager");
        this.f323t = lVar;
        this.f324u = (p210v8.k) aVar;
        this.f325v = new p247z9.i(lVar, aVar);
    }

    @Override // A9.AbstractC0151y
    public final O D() {
        return G0().D();
    }

    @Override // A9.AbstractC0151y
    public final d0 D0() {
        AbstractC0151y abstractC0151yG0 = G0();
        while (abstractC0151yG0 instanceof B) {
            abstractC0151yG0 = ((B) abstractC0151yG0).G0();
        }
        p210v8.i.d(abstractC0151yG0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (d0) abstractC0151yG0;
    }

    @Override // A9.AbstractC0151y
    public final t9.n E0() {
        return G0().E0();
    }

    public final AbstractC0151y G0() {
        return (AbstractC0151y) this.f325v.invoke();
    }

    @Override // A9.AbstractC0151y
    public final boolean H() {
        return G0().H();
    }

    @Override // A9.AbstractC0151y
    public final List l() {
        return G0().l();
    }

    @Override // A9.AbstractC0151y
    public final AbstractC0151y l0(B9.f fVar) {
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        return new B(this.f323t, new A(fVar, 0, this));
    }

    @Override // A9.AbstractC0151y
    public final K o() {
        return G0().o();
    }

    public final String toString() {
        p247z9.i iVar = this.f325v;
        return (iVar.f16326u == p247z9.k.f16330s || iVar.f16326u == p247z9.k.f16331t) ? "<Not computed yet>" : G0().toString();
    }
}
