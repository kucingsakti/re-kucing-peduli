package sa;

/* JADX INFO: renamed from: sa.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0799g extends B {
    public C0799g() {
        super("InRow", 13);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        boolean zL = nVar.l();
        C0836z c0836z = B.f14775A;
        if (zL) {
            L l4 = (L) nVar;
            String str = l4.f14828c;
            if (ra.a.c(str, A.f14770v)) {
                c0789b.d("tr", "template");
                c0789b.r(l4);
                c0789b.f14884l = B.f14781G;
                c0789b.f14889q.add(null);
                return true;
            }
            if (!ra.a.c(str, A.f14742D)) {
                c0789b.f14880g = nVar;
                return c0836z.h(nVar, c0789b);
            }
            if (c0789b.F("tr")) {
                return c0789b.D(nVar);
            }
            return false;
        }
        if (!nVar.k()) {
            c0789b.f14880g = nVar;
            return c0836z.h(nVar, c0789b);
        }
        String str2 = ((K) nVar).f14828c;
        boolean zEquals = str2.equals("tr");
        C0797f c0797f = B.f14779E;
        if (zEquals) {
            if (!c0789b.q(str2)) {
                c0789b.h(this);
                return false;
            }
            c0789b.d("tr", "template");
            c0789b.A();
            c0789b.f14884l = c0797f;
            return true;
        }
        if (str2.equals("table")) {
            if (c0789b.F("tr")) {
                return c0789b.D(nVar);
            }
            return false;
        }
        if (!ra.a.c(str2, A.f14767s)) {
            if (ra.a.c(str2, A.f14743E)) {
                c0789b.h(this);
                return false;
            }
            c0789b.f14880g = nVar;
            return c0836z.h(nVar, c0789b);
        }
        if (!c0789b.q(str2) || !c0789b.q("tr")) {
            c0789b.h(this);
            return false;
        }
        c0789b.d("tr", "template");
        c0789b.A();
        c0789b.f14884l = c0797f;
        return true;
    }
}
