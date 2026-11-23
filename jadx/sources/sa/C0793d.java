package sa;

/* JADX INFO: renamed from: sa.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0793d extends B {
    public C0793d() {
        super("InCaption", 10);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        if (nVar.k()) {
            K k3 = (K) nVar;
            if (k3.f14828c.equals("caption")) {
                if (!c0789b.q(k3.f14828c)) {
                    c0789b.h(this);
                    return false;
                }
                c0789b.j(false);
                if (!c0789b.g("caption")) {
                    c0789b.h(this);
                }
                c0789b.B("caption");
                c0789b.c();
                c0789b.f14884l = B.f14775A;
                return true;
            }
        }
        if ((nVar.l() && ra.a.c(((L) nVar).f14828c, A.f14773y)) || (nVar.k() && ((K) nVar).f14828c.equals("table"))) {
            c0789b.h(this);
            if (c0789b.F("caption")) {
                return c0789b.D(nVar);
            }
            return true;
        }
        if (nVar.k() && ra.a.c(((K) nVar).f14828c, A.f14748J)) {
            c0789b.h(this);
            return false;
        }
        C0832x c0832x = B.f14797y;
        c0789b.f14880g = nVar;
        return c0832x.h(nVar, c0789b);
    }
}
