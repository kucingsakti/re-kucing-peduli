package sa;

/* JADX INFO: renamed from: sa.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0801h extends B {
    public C0801h() {
        super("InCell", 14);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        boolean zK = nVar.k();
        C0832x c0832x = B.f14797y;
        if (!zK) {
            if (!nVar.l() || !ra.a.c(((L) nVar).f14828c, A.f14773y)) {
                c0789b.f14880g = nVar;
                return c0832x.h(nVar, c0789b);
            }
            if (!c0789b.q("td") && !c0789b.q("th")) {
                c0789b.h(this);
                return false;
            }
            if (c0789b.q("td")) {
                c0789b.F("td");
            } else {
                c0789b.F("th");
            }
            return c0789b.D(nVar);
        }
        String str = ((K) nVar).f14828c;
        if (ra.a.c(str, A.f14770v)) {
            boolean zQ = c0789b.q(str);
            C0799g c0799g = B.f14780F;
            if (!zQ) {
                c0789b.h(this);
                c0789b.f14884l = c0799g;
                return false;
            }
            c0789b.j(false);
            if (!c0789b.g(str)) {
                c0789b.h(this);
            }
            c0789b.B(str);
            c0789b.c();
            c0789b.f14884l = c0799g;
            return true;
        }
        if (ra.a.c(str, A.f14771w)) {
            c0789b.h(this);
            return false;
        }
        if (!ra.a.c(str, A.f14772x)) {
            c0789b.f14880g = nVar;
            return c0832x.h(nVar, c0789b);
        }
        if (!c0789b.q(str)) {
            c0789b.h(this);
            return false;
        }
        if (c0789b.q("td")) {
            c0789b.F("td");
        } else {
            c0789b.F("th");
        }
        return c0789b.D(nVar);
    }
}
