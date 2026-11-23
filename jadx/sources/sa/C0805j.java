package sa;

/* JADX INFO: renamed from: sa.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0805j extends B {
    public C0805j() {
        super("InSelectInTable", 16);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        boolean zL = nVar.l();
        String[] strArr = A.f14745G;
        if (zL && ra.a.c(((L) nVar).f14828c, strArr)) {
            c0789b.h(this);
            c0789b.B("select");
            c0789b.M();
            return c0789b.D(nVar);
        }
        if (nVar.k()) {
            K k3 = (K) nVar;
            if (ra.a.c(k3.f14828c, strArr)) {
                c0789b.h(this);
                if (!c0789b.q(k3.f14828c)) {
                    return false;
                }
                c0789b.B("select");
                c0789b.M();
                return c0789b.D(nVar);
            }
        }
        C0803i c0803i = B.f14782H;
        c0789b.f14880g = nVar;
        return c0803i.h(nVar, c0789b);
    }
}
