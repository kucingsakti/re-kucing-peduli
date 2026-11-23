package A9;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class E extends D {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final O f327t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f328u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f329v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t9.n f330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p200u8.b f331x;

    public E(O o10, List list, boolean z6, t9.n nVar, p200u8.b bVar) {
        p210v8.i.f(o10, "constructor");
        p210v8.i.f(list, "arguments");
        p210v8.i.f(nVar, "memberScope");
        this.f327t = o10;
        this.f328u = list;
        this.f329v = z6;
        this.f330w = nVar;
        this.f331x = bVar;
        if (!(nVar instanceof C9.e) || (nVar instanceof C9.j)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + nVar + '\n' + o10);
    }

    @Override // A9.AbstractC0151y
    public final O D() {
        return this.f327t;
    }

    @Override // A9.AbstractC0151y
    public final t9.n E0() {
        return this.f330w;
    }

    @Override // A9.AbstractC0151y
    public final boolean H() {
        return this.f329v;
    }

    @Override // A9.d0
    public final d0 K0(B9.f fVar) {
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        D d3 = (D) this.f331x.invoke(fVar);
        return d3 == null ? this : d3;
    }

    @Override // A9.D
    /* JADX INFO: renamed from: O0 */
    public final D G0(boolean z6) {
        if (z6 == this.f329v) {
            return this;
        }
        return z6 ? new C(this, 1) : new C(this, 0);
    }

    @Override // A9.D
    /* JADX INFO: renamed from: P0 */
    public final D N0(K k3) {
        p210v8.i.f(k3, "newAttributes");
        return k3.isEmpty() ? this : new F(this, k3);
    }

    @Override // A9.AbstractC0151y
    public final List l() {
        return this.f328u;
    }

    @Override // A9.AbstractC0151y
    public final AbstractC0151y l0(B9.f fVar) {
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        D d3 = (D) this.f331x.invoke(fVar);
        return d3 == null ? this : d3;
    }

    @Override // A9.AbstractC0151y
    public final K o() {
        K.f338t.getClass();
        return K.f339u;
    }
}
