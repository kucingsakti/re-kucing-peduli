package sa;

/* JADX INFO: renamed from: sa.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0826u extends B {
    public C0826u() {
        super("InHead", 3);
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
            return false;
        }
        if (iD != 1) {
            if (iD != 2) {
                if (iD != 3) {
                    c0789b.F("head");
                    return c0789b.D(nVar);
                }
                c0789b.t((H) nVar);
                return true;
            }
            String str = ((K) nVar).f14828c;
            if (str.equals("head")) {
                c0789b.A();
                c0789b.f14884l = B.f14796x;
                return true;
            }
            if (ra.a.c(str, A.f14752c)) {
                c0789b.F("head");
                return c0789b.D(nVar);
            }
            if (!str.equals("template")) {
                c0789b.h(this);
                return false;
            }
            if (!c0789b.y(str)) {
                c0789b.h(this);
                return true;
            }
            c0789b.j(true);
            if (!str.equals(c0789b.f().f13880v.f14812t)) {
                c0789b.h(this);
            }
            c0789b.B(str);
            c0789b.c();
            c0789b.C();
            c0789b.M();
            return true;
        }
        L l4 = (L) nVar;
        String str2 = l4.f14828c;
        if (str2.equals(com.onesignal.inAppMessages.internal.d.HTML)) {
            return B.f14797y.h(nVar, c0789b);
        }
        if (ra.a.c(str2, A.a)) {
            org.jsoup.nodes.k kVarU = c0789b.u(l4);
            if (str2.equals("base") && kVarU.m("href") && !c0789b.f14886n) {
                String strA = kVarU.a("href");
                if (strA.length() != 0) {
                    c0789b.f14879f = strA;
                    c0789b.f14886n = true;
                    org.jsoup.nodes.h hVar = c0789b.f14877d;
                    hVar.getClass();
                    hVar.H(strA);
                }
            }
            return true;
        }
        if (str2.equals("meta")) {
            c0789b.u(l4);
            return true;
        }
        boolean zEquals = str2.equals("title");
        C0834y c0834y = B.f14798z;
        if (zEquals) {
            c0789b.f14876c.o(e1.f14952u);
            c0789b.f14885m = c0789b.f14884l;
            c0789b.f14884l = c0834y;
            c0789b.r(l4);
            return true;
        }
        if (ra.a.c(str2, A.f14751b)) {
            B.g(l4, c0789b);
            return true;
        }
        if (str2.equals("noscript")) {
            c0789b.r(l4);
            c0789b.f14884l = B.f14795w;
            return true;
        }
        if (str2.equals("script")) {
            c0789b.f14876c.o(e1.f14958x);
            c0789b.f14885m = c0789b.f14884l;
            c0789b.f14884l = c0834y;
            c0789b.r(l4);
            return true;
        }
        if (str2.equals("head")) {
            c0789b.h(this);
            return false;
        }
        if (!str2.equals("template")) {
            c0789b.F("head");
            return c0789b.D(nVar);
        }
        c0789b.r(l4);
        c0789b.f14889q.add(null);
        c0789b.f14893u = false;
        C0807k c0807k = B.f14784J;
        c0789b.f14884l = c0807k;
        c0789b.H(c0807k);
        return true;
    }
}
