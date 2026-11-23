package sa;

/* JADX INFO: renamed from: sa.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0817p extends B {
    public C0817p() {
        super("AfterAfterBody", 21);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        if (nVar.h()) {
            c0789b.t((H) nVar);
            return true;
        }
        if (nVar.i() || (nVar.l() && ((L) nVar).f14828c.equals(com.onesignal.inAppMessages.internal.d.HTML))) {
            C0832x c0832x = B.f14797y;
            c0789b.f14880g = nVar;
            return c0832x.h(nVar, c0789b);
        }
        if (B.f(nVar)) {
            c0789b.s((G) nVar);
            return true;
        }
        if (nVar.j()) {
            return true;
        }
        c0789b.h(this);
        c0789b.L();
        return c0789b.D(nVar);
    }
}
