package sa;

/* JADX INFO: renamed from: sa.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0807k extends B {
    public C0807k() {
        super("InTemplate", 17);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        int iD = p239z.e.d(nVar.a);
        C0832x c0832x = B.f14797y;
        if (iD != 0) {
            C0826u c0826u = B.f14794v;
            if (iD == 1) {
                String str = ((L) nVar).f14828c;
                if (ra.a.c(str, A.f14749K)) {
                    c0789b.E(nVar, c0826u);
                    return true;
                }
                if (ra.a.c(str, A.f14750L)) {
                    c0789b.C();
                    C0836z c0836z = B.f14775A;
                    c0789b.H(c0836z);
                    c0789b.f14884l = c0836z;
                    return c0789b.D(nVar);
                }
                if (str.equals("col")) {
                    c0789b.C();
                    C0795e c0795e = B.f14778D;
                    c0789b.H(c0795e);
                    c0789b.f14884l = c0795e;
                    return c0789b.D(nVar);
                }
                if (str.equals("tr")) {
                    c0789b.C();
                    C0797f c0797f = B.f14779E;
                    c0789b.H(c0797f);
                    c0789b.f14884l = c0797f;
                    return c0789b.D(nVar);
                }
                if (!str.equals("td") && !str.equals("th")) {
                    c0789b.C();
                    c0789b.H(c0832x);
                    c0789b.f14884l = c0832x;
                    return c0789b.D(nVar);
                }
                c0789b.C();
                C0799g c0799g = B.f14780F;
                c0789b.H(c0799g);
                c0789b.f14884l = c0799g;
                return c0789b.D(nVar);
            }
            if (iD == 2) {
                if (((K) nVar).f14828c.equals("template")) {
                    c0789b.E(nVar, c0826u);
                    return true;
                }
                c0789b.h(this);
                return false;
            }
            if (iD != 3 && iD != 4) {
                if (iD == 5 && c0789b.y("template")) {
                    c0789b.h(this);
                    c0789b.B("template");
                    c0789b.c();
                    c0789b.C();
                    c0789b.M();
                    if (c0789b.f14884l != B.f14784J && c0789b.f14890r.size() < 12) {
                        return c0789b.D(nVar);
                    }
                }
                return true;
            }
        }
        c0789b.E(nVar, c0832x);
        return true;
    }
}
