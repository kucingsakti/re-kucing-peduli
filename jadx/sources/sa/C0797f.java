package sa;

/* JADX INFO: renamed from: sa.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0797f extends B {
    public C0797f() {
        super("InTableBody", 12);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        int iD = p239z.e.d(nVar.a);
        C0836z c0836z = B.f14775A;
        if (iD == 1) {
            L l4 = (L) nVar;
            String str = l4.f14828c;
            if (str.equals("tr")) {
                c0789b.d("tbody", "tfoot", "thead", "template");
                c0789b.r(l4);
                c0789b.f14884l = B.f14780F;
                return true;
            }
            if (ra.a.c(str, A.f14770v)) {
                c0789b.h(this);
                c0789b.G("tr");
                return c0789b.D(l4);
            }
            if (ra.a.c(str, A.f14740B)) {
                return i(nVar, c0789b);
            }
            c0789b.f14880g = nVar;
            return c0836z.h(nVar, c0789b);
        }
        if (iD != 2) {
            c0789b.f14880g = nVar;
            return c0836z.h(nVar, c0789b);
        }
        String str2 = ((K) nVar).f14828c;
        if (ra.a.c(str2, A.f14746H)) {
            if (!c0789b.q(str2)) {
                c0789b.h(this);
                return false;
            }
            c0789b.d("tbody", "tfoot", "thead", "template");
            c0789b.A();
            c0789b.f14884l = c0836z;
            return true;
        }
        if (str2.equals("table")) {
            return i(nVar, c0789b);
        }
        if (ra.a.c(str2, A.f14741C)) {
            c0789b.h(this);
            return false;
        }
        c0789b.f14880g = nVar;
        return c0836z.h(nVar, c0789b);
    }

    public final boolean i(K0.n nVar, C0789b c0789b) {
        if (!c0789b.q("tbody") && !c0789b.q("thead") && !c0789b.n("tfoot")) {
            c0789b.h(this);
            return false;
        }
        c0789b.d("tbody", "tfoot", "thead", "template");
        c0789b.F(c0789b.f().f13880v.f14812t);
        return c0789b.D(nVar);
    }
}
