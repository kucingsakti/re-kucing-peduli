package U8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {
    public static final ArrayList a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f4937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f4938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f4939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f4940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f4941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C f4942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f4943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LinkedHashMap f4944i;
    public static final ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final LinkedHashMap f4945k;

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setK = p086i8.i.K(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(p086i8.m.H(setK, 10));
        for (String str : setK) {
            String strH = p176r9.c.BOOLEAN.h();
            p210v8.i.e(strH, "BOOLEAN.desc");
            arrayList.add(m.a("java/util/Collection", str, "Ljava/util/Collection;", strH));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C) it.next()).f4930b);
        }
        f4937b = arrayList2;
        ArrayList arrayList3 = a;
        ArrayList arrayList4 = new ArrayList(p086i8.m.H(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C) it2.next()).a.g());
        }
        String strConcat = "java/util/".concat("Collection");
        p176r9.c cVar = p176r9.c.BOOLEAN;
        String strH2 = cVar.h();
        p210v8.i.e(strH2, "BOOLEAN.desc");
        C cA = m.a(strConcat, "contains", "Ljava/lang/Object;", strH2);
        E e10 = E.f4933v;
        p076h8.f fVar = new p076h8.f(cA, e10);
        String strConcat2 = "java/util/".concat("Collection");
        String strH3 = cVar.h();
        p210v8.i.e(strH3, "BOOLEAN.desc");
        p076h8.f fVar2 = new p076h8.f(m.a(strConcat2, "remove", "Ljava/lang/Object;", strH3), e10);
        String strConcat3 = "java/util/".concat("Map");
        String strH4 = cVar.h();
        p210v8.i.e(strH4, "BOOLEAN.desc");
        p076h8.f fVar3 = new p076h8.f(m.a(strConcat3, "containsKey", "Ljava/lang/Object;", strH4), e10);
        String strConcat4 = "java/util/".concat("Map");
        String strH5 = cVar.h();
        p210v8.i.e(strH5, "BOOLEAN.desc");
        p076h8.f fVar4 = new p076h8.f(m.a(strConcat4, "containsValue", "Ljava/lang/Object;", strH5), e10);
        String strConcat5 = "java/util/".concat("Map");
        String strH6 = cVar.h();
        p210v8.i.e(strH6, "BOOLEAN.desc");
        p076h8.f fVar5 = new p076h8.f(m.a(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strH6), e10);
        p076h8.f fVar6 = new p076h8.f(m.a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), E.f4934w);
        C cA2 = m.a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        E e11 = E.f4931t;
        p076h8.f fVar7 = new p076h8.f(cA2, e11);
        p076h8.f fVar8 = new p076h8.f(m.a("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), e11);
        String strConcat6 = "java/util/".concat("List");
        p176r9.c cVar2 = p176r9.c.INT;
        String strH7 = cVar2.h();
        p210v8.i.e(strH7, "INT.desc");
        C cA3 = m.a(strConcat6, "indexOf", "Ljava/lang/Object;", strH7);
        E e12 = E.f4932u;
        p076h8.f fVar9 = new p076h8.f(cA3, e12);
        String strConcat7 = "java/util/".concat("List");
        String strH8 = cVar2.h();
        p210v8.i.e(strH8, "INT.desc");
        Map mapW = p086i8.y.w(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, new p076h8.f(m.a(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strH8), e12));
        f4938c = mapW;
        LinkedHashMap linkedHashMap = new LinkedHashMap(p086i8.z.s(mapW.size()));
        for (Map.Entry entry : mapW.entrySet()) {
            linkedHashMap.put(((C) entry.getKey()).f4930b, entry.getValue());
        }
        f4939d = linkedHashMap;
        LinkedHashSet linkedHashSetU = p086i8.C.u(f4938c.keySet(), a);
        ArrayList arrayList5 = new ArrayList(p086i8.m.H(linkedHashSetU, 10));
        Iterator it3 = linkedHashSetU.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((C) it3.next()).a);
        }
        f4940e = p086i8.k.w0(arrayList5);
        ArrayList arrayList6 = new ArrayList(p086i8.m.H(linkedHashSetU, 10));
        Iterator it4 = linkedHashSetU.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((C) it4.next()).f4930b);
        }
        f4941f = p086i8.k.w0(arrayList6);
        p176r9.c cVar3 = p176r9.c.INT;
        String strH9 = cVar3.h();
        p210v8.i.e(strH9, "INT.desc");
        C cA4 = m.a("java/util/List", "removeAt", strH9, "Ljava/lang/Object;");
        f4942g = cA4;
        String strConcat8 = "java/lang/".concat("Number");
        String strH10 = p176r9.c.BYTE.h();
        p210v8.i.e(strH10, "BYTE.desc");
        p076h8.f fVar10 = new p076h8.f(m.a(strConcat8, "toByte", "", strH10), p096j9.f.j("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strH11 = p176r9.c.SHORT.h();
        p210v8.i.e(strH11, "SHORT.desc");
        p076h8.f fVar11 = new p076h8.f(m.a(strConcat9, "toShort", "", strH11), p096j9.f.j("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strH12 = cVar3.h();
        p210v8.i.e(strH12, "INT.desc");
        p076h8.f fVar12 = new p076h8.f(m.a(strConcat10, "toInt", "", strH12), p096j9.f.j("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strH13 = p176r9.c.LONG.h();
        p210v8.i.e(strH13, "LONG.desc");
        p076h8.f fVar13 = new p076h8.f(m.a(strConcat11, "toLong", "", strH13), p096j9.f.j("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strH14 = p176r9.c.FLOAT.h();
        p210v8.i.e(strH14, "FLOAT.desc");
        p076h8.f fVar14 = new p076h8.f(m.a(strConcat12, "toFloat", "", strH14), p096j9.f.j("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strH15 = p176r9.c.DOUBLE.h();
        p210v8.i.e(strH15, "DOUBLE.desc");
        p076h8.f fVar15 = new p076h8.f(m.a(strConcat13, "toDouble", "", strH15), p096j9.f.j("doubleValue"));
        p076h8.f fVar16 = new p076h8.f(cA4, p096j9.f.j("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strH16 = cVar3.h();
        p210v8.i.e(strH16, "INT.desc");
        String strH17 = p176r9.c.CHAR.h();
        p210v8.i.e(strH17, "CHAR.desc");
        Map mapW2 = p086i8.y.w(fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16, new p076h8.f(m.a(strConcat14, "get", strH16, strH17), p096j9.f.j("charAt")));
        f4943h = mapW2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p086i8.z.s(mapW2.size()));
        for (Map.Entry entry2 : mapW2.entrySet()) {
            linkedHashMap2.put(((C) entry2.getKey()).f4930b, entry2.getValue());
        }
        f4944i = linkedHashMap2;
        Set setKeySet = f4943h.keySet();
        ArrayList arrayList7 = new ArrayList(p086i8.m.H(setKeySet, 10));
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((C) it5.next()).a);
        }
        j = arrayList7;
        Set<Map.Entry> setEntrySet = f4943h.entrySet();
        ArrayList<p076h8.f> arrayList8 = new ArrayList(p086i8.m.H(setEntrySet, 10));
        for (Map.Entry entry3 : setEntrySet) {
            arrayList8.add(new p076h8.f(((C) entry3.getKey()).a, entry3.getValue()));
        }
        int iS = p086i8.z.s(p086i8.m.H(arrayList8, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS);
        for (p076h8.f fVar17 : arrayList8) {
            linkedHashMap3.put((p096j9.f) fVar17.f11790t, (p096j9.f) fVar17.f11789s);
        }
        f4945k = linkedHashMap3;
    }
}
