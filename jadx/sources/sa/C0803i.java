package sa;

/* JADX INFO: renamed from: sa.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0803i extends B {
    public C0803i() {
        super("InSelect", 15);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        byte b3 = 3;
        int iD = p239z.e.d(nVar.a);
        if (iD == 0) {
            c0789b.h(this);
            return false;
        }
        C0826u c0826u = B.f14794v;
        if (iD == 1) {
            L l4 = (L) nVar;
            String str = l4.f14828c;
            if (str.equals(com.onesignal.inAppMessages.internal.d.HTML)) {
                C0832x c0832x = B.f14797y;
                c0789b.f14880g = l4;
                return c0832x.h(l4, c0789b);
            }
            if (str.equals("option")) {
                if (c0789b.g("option")) {
                    c0789b.F("option");
                }
                c0789b.r(l4);
                return true;
            }
            if (str.equals("optgroup")) {
                if (c0789b.g("option")) {
                    c0789b.F("option");
                }
                if (c0789b.g("optgroup")) {
                    c0789b.F("optgroup");
                }
                c0789b.r(l4);
                return true;
            }
            if (str.equals("select")) {
                c0789b.h(this);
                return c0789b.F("select");
            }
            if (ra.a.c(str, A.f14744F)) {
                c0789b.h(this);
                if (!c0789b.o("select")) {
                    return false;
                }
                c0789b.F("select");
                return c0789b.D(l4);
            }
            if (str.equals("script") || str.equals("template")) {
                c0789b.f14880g = nVar;
                return c0826u.h(nVar, c0789b);
            }
            c0789b.h(this);
            return false;
        }
        if (iD != 2) {
            if (iD == 3) {
                c0789b.t((H) nVar);
                return true;
            }
            if (iD != 4) {
                if (iD != 5) {
                    c0789b.h(this);
                    return false;
                }
                if (!c0789b.g(com.onesignal.inAppMessages.internal.d.HTML)) {
                    c0789b.h(this);
                }
                return true;
            }
            G g8 = (G) nVar;
            if (g8.f14819b.equals(B.P)) {
                c0789b.h(this);
                return false;
            }
            c0789b.s(g8);
            return true;
        }
        String str2 = ((K) nVar).f14828c;
        str2.getClass();
        switch (str2.hashCode()) {
            case -1321546630:
                b3 = !str2.equals("template") ? (byte) -1 : (byte) 0;
                break;
            case -1010136971:
                b3 = !str2.equals("option") ? (byte) -1 : (byte) 1;
                break;
            case -906021636:
                b3 = !str2.equals("select") ? (byte) -1 : (byte) 2;
                break;
            case -80773204:
                if (!str2.equals("optgroup")) {
                    b3 = -1;
                }
                break;
            default:
                b3 = -1;
                break;
        }
        switch (b3) {
            case 0:
                c0789b.f14880g = nVar;
                return c0826u.h(nVar, c0789b);
            case 1:
                if (c0789b.g("option")) {
                    c0789b.A();
                    return true;
                }
                c0789b.h(this);
                return true;
            case 2:
                if (!c0789b.o(str2)) {
                    c0789b.h(this);
                    return false;
                }
                c0789b.B(str2);
                c0789b.M();
                return true;
            case 3:
                if (c0789b.g("option") && c0789b.a(c0789b.f()) != null && c0789b.a(c0789b.f()).f13880v.f14812t.equals("optgroup")) {
                    c0789b.F("option");
                }
                if (c0789b.g("optgroup")) {
                    c0789b.A();
                    return true;
                }
                c0789b.h(this);
                return true;
            default:
                c0789b.h(this);
                return false;
        }
    }
}
