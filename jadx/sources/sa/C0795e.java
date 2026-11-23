package sa;

/* JADX INFO: renamed from: sa.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0795e extends B {
    public C0795e() {
        super("InColumnGroup", 11);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        if (B.f(nVar)) {
            c0789b.s((G) nVar);
            return true;
        }
        int iD = p239z.e.d(nVar.a);
        if (iD == 0) {
            c0789b.h(this);
            return true;
        }
        C0826u c0826u = B.f14794v;
        if (iD != 1) {
            if (iD != 2) {
                if (iD == 3) {
                    c0789b.t((H) nVar);
                    return true;
                }
                if (iD != 5) {
                    return i(nVar, c0789b);
                }
                if (c0789b.g(com.onesignal.inAppMessages.internal.d.HTML)) {
                    return true;
                }
                return i(nVar, c0789b);
            }
            String str = ((K) nVar).f14828c;
            str.getClass();
            if (str.equals("template")) {
                c0789b.E(nVar, c0826u);
                return true;
            }
            if (!str.equals("colgroup")) {
                return i(nVar, c0789b);
            }
            if (!c0789b.g(str)) {
                c0789b.h(this);
                return false;
            }
            c0789b.A();
            c0789b.f14884l = B.f14775A;
            return true;
        }
        L l4 = (L) nVar;
        String str2 = l4.f14828c;
        str2.getClass();
        switch (str2) {
            case "template":
                c0789b.E(nVar, c0826u);
                return true;
            case "col":
                c0789b.u(l4);
                return true;
            case "html":
                C0832x c0832x = B.f14797y;
                c0789b.f14880g = nVar;
                return c0832x.h(nVar, c0789b);
            default:
                return i(nVar, c0789b);
        }
    }

    public final boolean i(K0.n nVar, C0789b c0789b) {
        if (!c0789b.g("colgroup")) {
            c0789b.h(this);
            return false;
        }
        c0789b.A();
        c0789b.f14884l = B.f14775A;
        c0789b.D(nVar);
        return true;
    }
}
