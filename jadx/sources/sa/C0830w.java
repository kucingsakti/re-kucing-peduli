package sa;

/* JADX INFO: renamed from: sa.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0830w extends B {
    public C0830w() {
        super("AfterHead", 5);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        if (B.f(nVar)) {
            c0789b.s((G) nVar);
        } else if (nVar.h()) {
            c0789b.t((H) nVar);
        } else if (nVar.i()) {
            c0789b.h(this);
        } else {
            boolean zL = nVar.l();
            C0826u c0826u = B.f14794v;
            if (zL) {
                L l4 = (L) nVar;
                String str = l4.f14828c;
                boolean zEquals = str.equals(com.onesignal.inAppMessages.internal.d.HTML);
                C0832x c0832x = B.f14797y;
                if (zEquals) {
                    c0789b.f14880g = nVar;
                    return c0832x.h(nVar, c0789b);
                }
                if (str.equals("body")) {
                    c0789b.r(l4);
                    c0789b.f14893u = false;
                    c0789b.f14884l = c0832x;
                } else if (str.equals("frameset")) {
                    c0789b.r(l4);
                    c0789b.f14884l = B.f14786L;
                } else if (ra.a.c(str, A.f14756g)) {
                    c0789b.h(this);
                    org.jsoup.nodes.k kVar = c0789b.f14887o;
                    c0789b.f14878e.add(kVar);
                    c0789b.E(nVar, c0826u);
                    c0789b.K(kVar);
                } else {
                    if (str.equals("head")) {
                        c0789b.h(this);
                        return false;
                    }
                    c0789b.G("body");
                    c0789b.f14893u = true;
                    c0789b.D(nVar);
                }
            } else if (nVar.k()) {
                String str2 = ((K) nVar).f14828c;
                if (ra.a.c(str2, A.f14753d)) {
                    c0789b.G("body");
                    c0789b.f14893u = true;
                    c0789b.D(nVar);
                } else {
                    if (!str2.equals("template")) {
                        c0789b.h(this);
                        return false;
                    }
                    c0789b.E(nVar, c0826u);
                }
            } else {
                c0789b.G("body");
                c0789b.f14893u = true;
                c0789b.D(nVar);
            }
        }
        return true;
    }
}
