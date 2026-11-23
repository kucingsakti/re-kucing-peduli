package sa;

import java.util.ArrayList;

/* JADX INFO: renamed from: sa.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0791c extends B {
    public C0791c() {
        super("InTableText", 9);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        if (nVar.a == 5) {
            G g8 = (G) nVar;
            if (g8.f14819b.equals(B.P)) {
                c0789b.h(this);
                return false;
            }
            c0789b.f14891s.add(g8.f14819b);
            return true;
        }
        if (c0789b.f14891s.size() > 0) {
            for (String str : c0789b.f14891s) {
                if (ra.a.d(str)) {
                    G g10 = new G();
                    g10.f14819b = str;
                    c0789b.s(g10);
                } else {
                    c0789b.h(this);
                    boolean zC = ra.a.c(c0789b.f().f13880v.f14812t, A.f14739A);
                    B b3 = B.f14797y;
                    if (zC) {
                        c0789b.f14894v = true;
                        G g11 = new G();
                        g11.f14819b = str;
                        c0789b.E(g11, b3);
                        c0789b.f14894v = false;
                    } else {
                        G g12 = new G();
                        g12.f14819b = str;
                        c0789b.E(g12, b3);
                    }
                }
            }
            c0789b.f14891s = new ArrayList();
        }
        c0789b.f14884l = c0789b.f14885m;
        return c0789b.D(nVar);
    }
}
