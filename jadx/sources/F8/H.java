package F8;

/* JADX INFO: loaded from: classes.dex */
public final class H extends X implements C8.j {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Object f1522B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(D d3, O8.K k3) {
        super(d3, k3);
        p210v8.i.f(d3, "container");
        p210v8.i.f(k3, "descriptor");
        this.f1522B = D3.b.r(p076h8.e.f11786s, new A0.r(this, 8));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // C8.j
    public final C8.g h() {
        return (G) this.f1522B.getValue();
    }
}
