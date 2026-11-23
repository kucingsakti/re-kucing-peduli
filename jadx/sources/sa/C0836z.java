package sa;

import java.util.ArrayList;

/* JADX INFO: renamed from: sa.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0836z extends B {
    public C0836z() {
        super("InTable", 8);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        if (nVar.a == 5 && ra.a.c(c0789b.f().f13880v.f14812t, A.f14739A)) {
            c0789b.f14891s = new ArrayList();
            c0789b.f14885m = c0789b.f14884l;
            c0789b.f14884l = B.f14776B;
            return c0789b.D(nVar);
        }
        if (nVar.h()) {
            c0789b.t((H) nVar);
            return true;
        }
        if (nVar.i()) {
            c0789b.h(this);
            return false;
        }
        boolean zL = nVar.l();
        C0826u c0826u = B.f14794v;
        if (!zL) {
            if (!nVar.k()) {
                if (!nVar.j()) {
                    i(nVar, c0789b);
                    return true;
                }
                if (c0789b.g(com.onesignal.inAppMessages.internal.d.HTML)) {
                    c0789b.h(this);
                }
                return true;
            }
            String str = ((K) nVar).f14828c;
            if (str.equals("table")) {
                if (!c0789b.q(str)) {
                    c0789b.h(this);
                    return false;
                }
                c0789b.B("table");
                c0789b.M();
                return true;
            }
            if (ra.a.c(str, A.f14774z)) {
                c0789b.h(this);
                return false;
            }
            if (str.equals("template")) {
                c0789b.E(nVar, c0826u);
                return true;
            }
            i(nVar, c0789b);
            return true;
        }
        L l4 = (L) nVar;
        String str2 = l4.f14828c;
        if (str2.equals("caption")) {
            c0789b.e();
            c0789b.f14889q.add(null);
            c0789b.r(l4);
            c0789b.f14884l = B.f14777C;
            return true;
        }
        if (str2.equals("colgroup")) {
            c0789b.e();
            c0789b.r(l4);
            c0789b.f14884l = B.f14778D;
            return true;
        }
        if (str2.equals("col")) {
            c0789b.e();
            c0789b.G("colgroup");
            return c0789b.D(nVar);
        }
        if (ra.a.c(str2, A.f14767s)) {
            c0789b.e();
            c0789b.r(l4);
            c0789b.f14884l = B.f14779E;
            return true;
        }
        if (ra.a.c(str2, A.f14768t)) {
            c0789b.e();
            c0789b.G("tbody");
            return c0789b.D(nVar);
        }
        if (str2.equals("table")) {
            c0789b.h(this);
            if (c0789b.q(str2)) {
                c0789b.B(str2);
                if (c0789b.M()) {
                    return c0789b.D(nVar);
                }
                c0789b.r(l4);
                return true;
            }
        } else {
            if (ra.a.c(str2, A.f14769u)) {
                c0789b.f14880g = nVar;
                return c0826u.h(nVar, c0789b);
            }
            if (str2.equals("input")) {
                if (l4.w() && l4.f14836l.k(com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY).equalsIgnoreCase("hidden")) {
                    c0789b.u(l4);
                    return true;
                }
                i(nVar, c0789b);
                return true;
            }
            if (!str2.equals("form")) {
                i(nVar, c0789b);
                return true;
            }
            c0789b.h(this);
            if (c0789b.f14888p == null && !c0789b.y("template")) {
                c0789b.v(l4, false, false);
                return true;
            }
        }
        return false;
    }

    public final void i(K0.n nVar, C0789b c0789b) {
        c0789b.h(this);
        c0789b.f14894v = true;
        c0789b.E(nVar, B.f14797y);
        c0789b.f14894v = false;
    }
}
