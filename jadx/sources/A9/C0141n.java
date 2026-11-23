package A9;

/* JADX INFO: renamed from: A9.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0141n extends AbstractC0142o implements InterfaceC0139l, D9.d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D f378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f379u;

    public C0141n(D d3, boolean z6) {
        this.f378t = d3;
        this.f379u = z6;
    }

    @Override // A9.AbstractC0142o, A9.AbstractC0151y
    public final boolean H() {
        return false;
    }

    @Override // A9.D
    /* JADX INFO: renamed from: O0 */
    public final D G0(boolean z6) {
        return z6 ? this.f378t.G0(z6) : this;
    }

    @Override // A9.D
    /* JADX INFO: renamed from: P0 */
    public final D N0(K k3) {
        p210v8.i.f(k3, "newAttributes");
        return new C0141n(this.f378t.N0(k3), this.f379u);
    }

    @Override // A9.AbstractC0142o
    public final D Q0() {
        return this.f378t;
    }

    @Override // A9.AbstractC0142o
    public final AbstractC0142o S0(D d3) {
        return new C0141n(d3, this.f379u);
    }

    @Override // A9.InterfaceC0139l
    public final boolean b() {
        D d3 = this.f378t;
        d3.D();
        return d3.D().w() instanceof L8.P;
    }

    @Override // A9.InterfaceC0139l
    public final d0 d(AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, "replacement");
        return AbstractC0130c.m(abstractC0151y.D0(), this.f379u);
    }

    @Override // A9.D
    public final String toString() {
        return this.f378t + " & Any";
    }
}
