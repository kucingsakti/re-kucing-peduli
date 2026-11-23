package sa;

/* JADX INFO: renamed from: sa.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0824t extends B {
    public C0824t() {
        super("BeforeHead", 2);
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
        if (nVar.l() && ((L) nVar).f14828c.equals(com.onesignal.inAppMessages.internal.d.HTML)) {
            return B.f14797y.h(nVar, c0789b);
        }
        if (nVar.l()) {
            L l4 = (L) nVar;
            if (l4.f14828c.equals("head")) {
                c0789b.f14887o = c0789b.r(l4);
                c0789b.f14884l = B.f14794v;
                return true;
            }
        }
        if (nVar.k() && ra.a.c(((K) nVar).f14828c, A.f14754e)) {
            c0789b.G("head");
            return c0789b.D(nVar);
        }
        if (nVar.k()) {
            c0789b.h(this);
            return false;
        }
        c0789b.G("head");
        return c0789b.D(nVar);
    }
}
