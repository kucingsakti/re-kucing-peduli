package ta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import sa.C;
import sa.E;

/* JADX INFO: loaded from: classes.dex */
public final class d extends m {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    @Override // ta.m
    public final boolean a(org.jsoup.nodes.k kVar, org.jsoup.nodes.k kVar2) {
        List<org.jsoup.nodes.p> listUnmodifiableList;
        C c10;
        switch (this.a) {
            case 0:
                return true;
            case 1:
                if (kVar2.h() == 0) {
                    listUnmodifiableList = org.jsoup.nodes.p.f13895u;
                } else {
                    List listL = kVar2.l();
                    ArrayList arrayList = new ArrayList(listL.size());
                    arrayList.addAll(listL);
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                for (org.jsoup.nodes.p pVar : listUnmodifiableList) {
                    if (!(pVar instanceof org.jsoup.nodes.e) && !(pVar instanceof org.jsoup.nodes.i)) {
                        return false;
                    }
                }
                return true;
            case 2:
                org.jsoup.nodes.k kVar3 = (org.jsoup.nodes.k) kVar2.f13896s;
                return (kVar3 == null || (kVar3 instanceof org.jsoup.nodes.h) || kVar2.I() != 0) ? false : true;
            case 3:
                org.jsoup.nodes.k kVar4 = (org.jsoup.nodes.k) kVar2.f13896s;
                return (kVar4 == null || (kVar4 instanceof org.jsoup.nodes.h) || kVar2.I() != new C(kVar4.E()).size() - 1) ? false : true;
            case 4:
                org.jsoup.nodes.p pVar2 = kVar2.f13896s;
                org.jsoup.nodes.k kVar5 = (org.jsoup.nodes.k) pVar2;
                if (kVar5 == null || (kVar5 instanceof org.jsoup.nodes.h)) {
                    return false;
                }
                if (pVar2 == null) {
                    c10 = new C(0, 1);
                } else {
                    List<org.jsoup.nodes.k> listE = ((org.jsoup.nodes.k) pVar2).E();
                    C c11 = new C(listE.size() - 1, 1);
                    for (org.jsoup.nodes.k kVar6 : listE) {
                        if (kVar6 != kVar2) {
                            c11.add(kVar6);
                        }
                    }
                    c10 = c11;
                }
                return c10.isEmpty();
            case 5:
                org.jsoup.nodes.k kVar7 = (org.jsoup.nodes.k) kVar2.f13896s;
                if (kVar7 == null || (kVar7 instanceof org.jsoup.nodes.h)) {
                    return false;
                }
                Iterator<E> it = new C(kVar7.E()).iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    if (((org.jsoup.nodes.k) it.next()).f13880v.equals(kVar2.f13880v)) {
                        i10++;
                    }
                }
                return i10 == 1;
            case 6:
                if (kVar instanceof org.jsoup.nodes.h) {
                    kVar = (org.jsoup.nodes.k) kVar.E().get(0);
                }
                return kVar2 == kVar;
            case 7:
                if (kVar2 instanceof org.jsoup.nodes.q) {
                    return true;
                }
                kVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (org.jsoup.nodes.p pVar3 : kVar2.f13882x) {
                    if (pVar3 instanceof org.jsoup.nodes.r) {
                        arrayList2.add((org.jsoup.nodes.r) pVar3);
                    }
                }
                Iterator it2 = Collections.unmodifiableList(arrayList2).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        return false;
                    }
                    org.jsoup.nodes.r rVar = (org.jsoup.nodes.r) it2.next();
                    String str = kVar2.f13880v.f14811s;
                    qa.b.w(str);
                    HashMap map = E.f14803B;
                    E eClone = (E) map.get(str);
                    if (eClone == null) {
                        String strTrim = str.trim();
                        qa.b.u(strTrim);
                        String strT = J7.j.t(strTrim);
                        E e10 = (E) map.get(strT);
                        if (e10 == null) {
                            eClone = new E(strTrim);
                            eClone.f14813u = false;
                        } else if (strTrim.equals(strT)) {
                            eClone = e10;
                        } else {
                            eClone = e10.clone();
                            eClone.f14811s = strTrim;
                        }
                    }
                    org.jsoup.nodes.q qVar = new org.jsoup.nodes.q(eClone, kVar2.f(), kVar2.e());
                    rVar.getClass();
                    qa.b.w(rVar.f13896s);
                    org.jsoup.nodes.p pVar4 = rVar.f13896s;
                    pVar4.getClass();
                    qa.b.r(rVar.f13896s == pVar4);
                    org.jsoup.nodes.p pVar5 = qVar.f13896s;
                    if (pVar5 != null) {
                        pVar5.z(qVar);
                    }
                    int i11 = rVar.f13897t;
                    pVar4.l().set(i11, qVar);
                    qVar.f13896s = pVar4;
                    qVar.f13897t = i11;
                    rVar.f13896s = null;
                    qVar.B(rVar);
                }
                break;
            default:
                return kVar == kVar2;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "*";
            case 1:
                return ":empty";
            case 2:
                return ":first-child";
            case 3:
                return ":last-child";
            case 4:
                return ":only-child";
            case 5:
                return ":only-of-type";
            case 6:
                return ":root";
            case 7:
                return ":matchText";
            default:
                return super.toString();
        }
    }
}
