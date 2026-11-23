package sa;

/* JADX INFO: renamed from: sa.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0813n extends B {
    public C0813n() {
        super("InFrameset", 19);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        if (B.f(nVar)) {
            c0789b.s((G) nVar);
            return true;
        }
        if (nVar.h()) {
            c0789b.t((H) nVar);
            return true;
        }
        if (nVar.i()) {
            c0789b.h(this);
            return false;
        }
        if (!nVar.l()) {
            if (nVar.k() && ((K) nVar).f14828c.equals("frameset")) {
                if (c0789b.g(com.onesignal.inAppMessages.internal.d.HTML)) {
                    c0789b.h(this);
                    return false;
                }
                c0789b.A();
                if (!c0789b.g("frameset")) {
                    c0789b.f14884l = B.f14787M;
                    return true;
                }
            } else {
                if (!nVar.j()) {
                    c0789b.h(this);
                    return false;
                }
                if (!c0789b.g(com.onesignal.inAppMessages.internal.d.HTML)) {
                    c0789b.h(this);
                }
            }
            return true;
        }
        L l4 = (L) nVar;
        String str = l4.f14828c;
        str.getClass();
        switch (str) {
            case "frameset":
                c0789b.r(l4);
                return true;
            case "html":
                C0832x c0832x = B.f14797y;
                c0789b.f14880g = l4;
                return c0832x.h(l4, c0789b);
            case "frame":
                c0789b.u(l4);
                return true;
            case "noframes":
                C0826u c0826u = B.f14794v;
                c0789b.f14880g = l4;
                return c0826u.h(l4, c0789b);
            default:
                c0789b.h(this);
                return false;
        }
    }
}
