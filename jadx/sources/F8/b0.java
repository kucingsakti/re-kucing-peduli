package F8;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends g0 implements C8.s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d0 f1566w;

    public b0(d0 d0Var) {
        p210v8.i.f(d0Var, "property");
        this.f1566w = d0Var;
    }

    @Override // C8.m
    public final C8.u a() {
        return this.f1566w;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h8.d, java.lang.Object] */
    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) this.f1566w.f1571A.getValue()).v(obj, obj2);
    }

    @Override // F8.e0
    public final k0 l() {
        return this.f1566w;
    }
}
