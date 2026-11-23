package sa;

/* JADX INFO: renamed from: sa.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0815o extends B {
    public C0815o() {
        super("AfterFrameset", 20);
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
            C0832x c0832x = B.f14797y;
            c0789b.f14880g = nVar;
            return c0832x.h(nVar, c0789b);
        }
        if (nVar.k() && ((K) nVar).f14828c.equals(com.onesignal.inAppMessages.internal.d.HTML)) {
            c0789b.f14884l = B.f14789O;
            return true;
        }
        if (nVar.l() && ((L) nVar).f14828c.equals("noframes")) {
            C0826u c0826u = B.f14794v;
            c0789b.f14880g = nVar;
            return c0826u.h(nVar, c0789b);
        }
        if (nVar.j()) {
            return true;
        }
        c0789b.h(this);
        return false;
    }
}
