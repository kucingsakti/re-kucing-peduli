package U8;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f4972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f4973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f4974d;

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.Map] */
    static {
        p096j9.e eVar = I8.n.j;
        p096j9.c cVarG = eVar.b(p096j9.f.j(MediationMetaData.KEY_NAME)).g();
        p210v8.i.e(cVarG, "child(Name.identifier(name)).toSafe()");
        p076h8.f fVar = new p076h8.f(cVarG, p096j9.f.j(MediationMetaData.KEY_NAME));
        p096j9.c cVarG2 = eVar.b(p096j9.f.j(MediationMetaData.KEY_ORDINAL)).g();
        p210v8.i.e(cVarG2, "child(Name.identifier(name)).toSafe()");
        p076h8.f fVar2 = new p076h8.f(cVarG2, p096j9.f.j(MediationMetaData.KEY_ORDINAL));
        p076h8.f fVar3 = new p076h8.f(I8.n.f2139B.c(p096j9.f.j("size")), p096j9.f.j("size"));
        p096j9.c cVar = I8.n.f2143F;
        p076h8.f fVar4 = new p076h8.f(cVar.c(p096j9.f.j("size")), p096j9.f.j("size"));
        p096j9.c cVarG3 = I8.n.f2168e.b(p096j9.f.j("length")).g();
        p210v8.i.e(cVarG3, "child(Name.identifier(name)).toSafe()");
        Map mapW = p086i8.y.w(fVar, fVar2, fVar3, fVar4, new p076h8.f(cVarG3, p096j9.f.j("length")), new p076h8.f(cVar.c(p096j9.f.j("keys")), p096j9.f.j("keySet")), new p076h8.f(cVar.c(p096j9.f.j("values")), p096j9.f.j("values")), new p076h8.f(cVar.c(p096j9.f.j("entries")), p096j9.f.j("entrySet")));
        a = mapW;
        Set<Map.Entry> setEntrySet = mapW.entrySet();
        ArrayList<p076h8.f> arrayList = new ArrayList(p086i8.m.H(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new p076h8.f(((p096j9.c) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (p076h8.f fVar5 : arrayList) {
            p096j9.f fVar6 = (p096j9.f) fVar5.f11790t;
            Object arrayList2 = linkedHashMap.get(fVar6);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(fVar6, arrayList2);
            }
            ((List) arrayList2).add((p096j9.f) fVar5.f11789s);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p086i8.z.s(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            p210v8.i.f(iterable, "<this>");
            linkedHashMap2.put(key, p086i8.k.s0(p086i8.k.v0(iterable)));
        }
        f4972b = linkedHashMap2;
        Set setKeySet = a.keySet();
        f4973c = setKeySet;
        ArrayList arrayList3 = new ArrayList(p086i8.m.H(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList3.add(((p096j9.c) it.next()).f());
        }
        f4974d = p086i8.k.w0(arrayList3);
    }
}
