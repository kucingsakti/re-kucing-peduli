package sa;

/* JADX INFO: renamed from: sa.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0834y extends B {
    public C0834y() {
        super("Text", 7);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        if (nVar.a == 5) {
            c0789b.s((G) nVar);
            return true;
        }
        if (nVar.j()) {
            c0789b.h(this);
            c0789b.A();
            c0789b.f14884l = c0789b.f14885m;
            return c0789b.D(nVar);
        }
        if (!nVar.k()) {
            return true;
        }
        c0789b.A();
        c0789b.f14884l = c0789b.f14885m;
        return true;
    }
}
