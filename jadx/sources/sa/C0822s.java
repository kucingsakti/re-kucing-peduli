package sa;

/* JADX INFO: renamed from: sa.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0822s extends B {
    public C0822s() {
        super("BeforeHtml", 1);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        if (nVar.i()) {
            c0789b.h(this);
            return false;
        }
        if (nVar.h()) {
            c0789b.t((H) nVar);
            return true;
        }
        if (B.f(nVar)) {
            c0789b.s((G) nVar);
            return true;
        }
        boolean zL = nVar.l();
        C0824t c0824t = B.f14793u;
        if (zL) {
            L l4 = (L) nVar;
            if (l4.f14828c.equals(com.onesignal.inAppMessages.internal.d.HTML)) {
                c0789b.r(l4);
                c0789b.f14884l = c0824t;
                return true;
            }
        }
        if (nVar.k() && ra.a.c(((K) nVar).f14828c, A.f14754e)) {
            org.jsoup.nodes.k kVar = new org.jsoup.nodes.k(c0789b.N(com.onesignal.inAppMessages.internal.d.HTML, c0789b.f14881h), null, null);
            c0789b.x(kVar);
            c0789b.f14878e.add(kVar);
            c0789b.f14884l = c0824t;
            return c0789b.D(nVar);
        }
        if (nVar.k()) {
            c0789b.h(this);
            return false;
        }
        org.jsoup.nodes.k kVar2 = new org.jsoup.nodes.k(c0789b.N(com.onesignal.inAppMessages.internal.d.HTML, c0789b.f14881h), null, null);
        c0789b.x(kVar2);
        c0789b.f14878e.add(kVar2);
        c0789b.f14884l = c0824t;
        return c0789b.D(nVar);
    }
}
