package F8;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends g0 implements C8.q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a0 f1552w;

    public Y(a0 a0Var) {
        p210v8.i.f(a0Var, "property");
        this.f1552w = a0Var;
    }

    @Override // C8.m
    public final C8.u a() {
        return this.f1552w;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h8.d, java.lang.Object] */
    @Override // p200u8.b
    public final Object invoke(Object obj) {
        return ((Y) this.f1552w.f1555A.getValue()).v(obj);
    }

    @Override // F8.e0
    public final k0 l() {
        return this.f1552w;
    }
}
