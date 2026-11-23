package androidx.recyclerview.widget;

import J0.P;

/* JADX INFO: loaded from: classes.dex */
public final class I {
    public final p212w.i a = new p212w.i(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p212w.g f6891b = new p212w.g();

    public final void a(RecyclerView.a aVar, t tVar) {
        p212w.i iVar = this.a;
        P pA = (P) iVar.get(aVar);
        if (pA == null) {
            pA = P.a();
            iVar.put(aVar, pA);
        }
        pA.f2267c = tVar;
        pA.a |= 8;
    }

    public final t b(RecyclerView.a aVar, int i10) {
        P p10;
        t tVar;
        p212w.i iVar = this.a;
        int iE = iVar.e(aVar);
        if (iE >= 0 && (p10 = (P) iVar.k(iE)) != null) {
            int i11 = p10.a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                p10.a = i12;
                if (i10 == 4) {
                    tVar = p10.f2266b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    tVar = p10.f2267c;
                }
                if ((i12 & 12) == 0) {
                    iVar.i(iE);
                    p10.a = 0;
                    p10.f2266b = null;
                    p10.f2267c = null;
                    P.f2265d.c(p10);
                }
                return tVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.a aVar) {
        P p10 = (P) this.a.get(aVar);
        if (p10 == null) {
            return;
        }
        p10.a &= -2;
    }

    public final void d(RecyclerView.a aVar) {
        p212w.g gVar = this.f6891b;
        for (int iL = gVar.l() - 1; iL >= 0; iL--) {
            if (aVar == gVar.m(iL)) {
                Object[] objArr = gVar.f15501u;
                Object obj = objArr[iL];
                Object obj2 = p212w.h.a;
                if (obj == obj2) {
                    break;
                }
                objArr[iL] = obj2;
                gVar.f15499s = true;
                break;
            }
        }
        P p10 = (P) this.a.remove(aVar);
        if (p10 != null) {
            p10.a = 0;
            p10.f2266b = null;
            p10.f2267c = null;
            P.f2265d.c(p10);
        }
    }
}
