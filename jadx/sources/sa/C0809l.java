package sa;

/* JADX INFO: renamed from: sa.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0809l extends B {
    public C0809l() {
        super("AfterBody", 18);
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
            if (c0789b.y(com.onesignal.inAppMessages.internal.d.HTML)) {
                c0789b.B(com.onesignal.inAppMessages.internal.d.HTML);
            }
            c0789b.f14884l = B.f14788N;
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
