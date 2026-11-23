package A9;

/* JADX INFO: loaded from: classes.dex */
public final class I extends S {
    public final L8.P a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f335b;

    public I(L8.P p10) {
        p210v8.i.f(p10, "typeParameter");
        this.a = p10;
        this.f335b = D3.b.r(p076h8.e.f11786s, new A0.r(this, 2));
    }

    @Override // A9.S
    public final int a() {
        return 3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // A9.S
    public final AbstractC0151y b() {
        return (AbstractC0151y) this.f335b.getValue();
    }

    @Override // A9.S
    public final boolean c() {
        return true;
    }

    @Override // A9.S
    public final S d(B9.f fVar) {
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        return this;
    }
}
