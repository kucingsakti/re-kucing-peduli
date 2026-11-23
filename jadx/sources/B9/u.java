package B9;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.C0136i;
import A9.C0150x;
import A9.D;
import A9.K;
import A9.O;
import A9.d0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final u a = new u();

    public static ArrayList a(AbstractCollection abstractCollection, p200u8.c cVar) {
        ArrayList<D> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        p210v8.i.e(it, "filteredTypes.iterator()");
        while (it.hasNext()) {
            D d3 = (D) it.next();
            if (!arrayList.isEmpty()) {
                for (D d8 : arrayList) {
                    if (d8 != d3) {
                        p210v8.i.e(d8, "lower");
                        p210v8.i.e(d3, "upper");
                        if (((Boolean) cVar.invoke(d8, d3)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [A9.K] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [A9.K, G9.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16, types: [A9.D] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [A9.D, A9.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Set] */
    public final D b(ArrayList arrayList) {
        D d3;
        D dB;
        arrayList.size();
        ArrayList<D> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            D d8 = (D) it.next();
            if (d8.D() instanceof C0150x) {
                Collection collectionT = d8.D().t();
                p210v8.i.e(collectionT, "type.constructor.supertypes");
                Collection<AbstractC0151y> collection = collectionT;
                ArrayList arrayList3 = new ArrayList(p086i8.m.H(collection, 10));
                for (AbstractC0151y abstractC0151y : collection) {
                    p210v8.i.e(abstractC0151y, "it");
                    D dZ = AbstractC0130c.z(abstractC0151y);
                    if (d8.H()) {
                        dZ = dZ.G0(true);
                    }
                    arrayList3.add(dZ);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(d8);
            }
        }
        s sVarF = s.f797s;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            sVarF = sVarF.f((d0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (D dG0 : arrayList2) {
            if (sVarF == s.f800v) {
                if (dG0 instanceof h) {
                    h hVar = (h) dG0;
                    p210v8.i.f(hVar, "<this>");
                    dG0 = new h(hVar.f780t, hVar.f781u, hVar.f782v, hVar.f783w, hVar.f784x, true);
                }
                p210v8.i.f(dG0, "<this>");
                D dP = C0133f.p(dG0, false);
                dG0 = (dP == null && (dP = AbstractC0130c.n(dG0)) == null) ? dG0.G0(false) : dP;
            }
            linkedHashSet.add(dG0);
        }
        ArrayList arrayList4 = new ArrayList(p086i8.m.H(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((D) it3.next()).o());
        }
        Iterator it4 = arrayList4.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it4.next();
        while (it4.hasNext()) {
            K k3 = (K) it4.next();
            next = (K) next;
            next.getClass();
            p210v8.i.f(k3, "other");
            if (!next.isEmpty() || !k3.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) K.f338t.f13623t).values();
                p210v8.i.e(collectionValues, "idPerType.values");
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    C0136i c0136i = (C0136i) next.f1752s.get(iIntValue);
                    C0136i c0136i2 = (C0136i) k3.f1752s.get(iIntValue);
                    if (c0136i != null) {
                        if (!p210v8.i.a(c0136i2, c0136i)) {
                            c0136i = null;
                        }
                        c0136i2 = c0136i;
                    } else if (c0136i2 == null || !p210v8.i.a(c0136i, c0136i2)) {
                        c0136i2 = null;
                    }
                    J9.l.b(arrayList5, c0136i2);
                }
                next = o1.c.o(arrayList5);
            }
        }
        K k10 = (K) next;
        if (linkedHashSet.size() == 1) {
            dB = (D) p086i8.k.j0(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new t(2, 0, this));
            arrayListA.isEmpty();
            if (arrayListA.isEmpty()) {
                d3 = null;
            } else {
                Iterator it6 = arrayListA.iterator();
                if (!it6.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                ?? next2 = it6.next();
                while (it6.hasNext()) {
                    D d10 = (D) it6.next();
                    next2 = (D) next2;
                    if (next2 != 0 && d10 != null) {
                        O oD = next2.D();
                        O oD2 = d10.D();
                        boolean z6 = oD instanceof p145o9.m;
                        if (z6 && (oD2 instanceof p145o9.m)) {
                            Set set = ((p145o9.m) oD).a;
                            Set set2 = ((p145o9.m) oD2).a;
                            p210v8.i.f(set, "<this>");
                            p210v8.i.f(set2, "other");
                            Set setV0 = p086i8.k.v0(set);
                            p086i8.q.J(setV0, set2);
                            p145o9.m mVar = new p145o9.m(setV0);
                            K.f338t.getClass();
                            K k11 = K.f339u;
                            p210v8.i.f(k11, "attributes");
                            next2 = C0133f.s(k11, mVar, p086i8.s.f12328s, C9.i.a(2, true, "unknown integer literal type"), false);
                        } else if (z6) {
                            if (!((p145o9.m) oD).a.contains(d10)) {
                                d10 = null;
                            }
                            next2 = d10;
                        } else if (!(oD2 instanceof p145o9.m) || !((p145o9.m) oD2).a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                d3 = (D) next2;
            }
            if (d3 != null) {
                dB = d3;
            } else {
                l.f793b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new t(2, 1, k.f792b));
                arrayListA2.isEmpty();
                dB = arrayListA2.size() < 2 ? (D) p086i8.k.j0(arrayListA2) : new C0150x(linkedHashSet).b();
            }
        }
        return dB.N0(k10);
    }
}
