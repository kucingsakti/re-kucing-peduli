package sa;

/* JADX INFO: renamed from: sa.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0828v extends B {
    public C0828v() {
        super("InHeadNoscript", 4);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        if (nVar.i()) {
            c0789b.h(this);
            return true;
        }
        if (nVar.l() && ((L) nVar).f14828c.equals(com.onesignal.inAppMessages.internal.d.HTML)) {
            C0832x c0832x = B.f14797y;
            c0789b.f14880g = nVar;
            return c0832x.h(nVar, c0789b);
        }
        boolean zK = nVar.k();
        C0826u c0826u = B.f14794v;
        if (zK && ((K) nVar).f14828c.equals("noscript")) {
            c0789b.A();
            c0789b.f14884l = c0826u;
            return true;
        }
        if (B.f(nVar) || nVar.h() || (nVar.l() && ra.a.c(((L) nVar).f14828c, A.f14755f))) {
            c0789b.f14880g = nVar;
            return c0826u.h(nVar, c0789b);
        }
        if (nVar.k() && ((K) nVar).f14828c.equals("br")) {
            c0789b.h(this);
            G g8 = new G();
            g8.f14819b = nVar.toString();
            c0789b.s(g8);
            return true;
        }
        if ((nVar.l() && ra.a.c(((L) nVar).f14828c, A.f14747I)) || nVar.k()) {
            c0789b.h(this);
            return false;
        }
        c0789b.h(this);
        G g10 = new G();
        g10.f14819b = nVar.toString();
        c0789b.s(g10);
        return true;
    }
}
