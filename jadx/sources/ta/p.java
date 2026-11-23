package ta;

/* JADX INFO: loaded from: classes.dex */
public final class p extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y1.c f15285b;

    public p(m mVar) {
        this.a = mVar;
        this.f15285b = new Y1.c(mVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    @Override // ta.m
    public final boolean a(org.jsoup.nodes.k kVar, org.jsoup.nodes.k kVar2) {
        char c10;
        for (int i10 = 0; i10 < kVar2.f13882x.size(); i10++) {
            org.jsoup.nodes.p pVar = (org.jsoup.nodes.p) kVar2.l().get(i10);
            if (pVar instanceof org.jsoup.nodes.k) {
                org.jsoup.nodes.k kVar3 = (org.jsoup.nodes.k) pVar;
                Y1.c cVar = this.f15285b;
                cVar.f5670t = kVar2;
                cVar.f5671u = null;
                int i11 = 0;
                org.jsoup.nodes.p pVar2 = kVar3;
                while (pVar2 != null) {
                    if (pVar2 instanceof org.jsoup.nodes.k) {
                        org.jsoup.nodes.k kVar4 = (org.jsoup.nodes.k) pVar2;
                        if (((m) cVar.f5672v).a((org.jsoup.nodes.k) cVar.f5670t, kVar4)) {
                            cVar.f5671u = kVar4;
                            c10 = 5;
                        } else {
                            c10 = 1;
                        }
                    } else {
                        c10 = 1;
                    }
                    if (c10 == 5) {
                        break;
                    }
                    if (c10 != 1 || pVar2.h() <= 0) {
                        while (pVar2.r() == null && i11 > 0) {
                            if (c10 == 1 || c10 == 2) {
                                c10 = 1;
                            }
                            org.jsoup.nodes.p pVar3 = pVar2.f13896s;
                            i11--;
                            if (c10 == 4) {
                                pVar2.y();
                            }
                            c10 = 1;
                            pVar2 = pVar3;
                        }
                        if (c10 == 1 || c10 == 2) {
                            c10 = 1;
                        }
                        if (pVar2 == kVar3) {
                            break;
                        }
                        org.jsoup.nodes.p pVarR = pVar2.r();
                        if (c10 == 4) {
                            pVar2.y();
                        }
                        pVar2 = pVarR;
                    } else {
                        pVar2 = (org.jsoup.nodes.p) pVar2.l().get(0);
                        i11++;
                    }
                }
                if (((org.jsoup.nodes.k) cVar.f5671u) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.a);
    }
}
