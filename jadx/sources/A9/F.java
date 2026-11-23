package A9;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC0143p {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final K f332u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(D d3, K k3) {
        super(d3);
        p210v8.i.f(k3, "attributes");
        this.f332u = k3;
    }

    @Override // A9.AbstractC0142o
    public final AbstractC0142o S0(D d3) {
        return new F(d3, this.f332u);
    }

    @Override // A9.AbstractC0142o, A9.AbstractC0151y
    public final K o() {
        return this.f332u;
    }
}
