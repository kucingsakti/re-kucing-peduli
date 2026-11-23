package sa;

/* JADX INFO: renamed from: sa.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0819q extends B {
    public C0819q() {
        super("AfterAfterFrameset", 22);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        if (nVar.h()) {
            c0789b.t((H) nVar);
            return true;
        }
        if (nVar.i() || B.f(nVar) || (nVar.l() && ((L) nVar).f14828c.equals(com.onesignal.inAppMessages.internal.d.HTML))) {
            C0832x c0832x = B.f14797y;
            c0789b.f14880g = nVar;
            return c0832x.h(nVar, c0789b);
        }
        if (nVar.j()) {
            return true;
        }
        if (!nVar.l() || !((L) nVar).f14828c.equals("noframes")) {
            c0789b.h(this);
            return false;
        }
        C0826u c0826u = B.f14794v;
        c0789b.f14880g = nVar;
        return c0826u.h(nVar, c0789b);
    }
}
