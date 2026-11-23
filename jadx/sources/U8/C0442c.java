package U8;

import L8.InterfaceC0271e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: U8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0442c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f4960c;
    public final t a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4961b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC0440a enumC0440a : EnumC0440a.values()) {
            String str = enumC0440a.f4952s;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, enumC0440a);
            }
        }
        f4960c = linkedHashMap;
    }

    public C0442c(t tVar) {
        p210v8.i.f(tVar, "javaTypeEnhancementState");
        this.a = tVar;
        this.f4961b = new ConcurrentHashMap();
    }

    public static ArrayList a(Object obj, boolean z6) {
        M8.b bVar = (M8.b) obj;
        p210v8.i.f(bVar, "<this>");
        Map mapB = bVar.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapB.entrySet()) {
            p086i8.q.J(arrayList, (!z6 || p210v8.i.a((p096j9.f) entry.getKey(), x.f4994b)) ? j((p145o9.g) entry.getValue()) : p086i8.s.f12328s);
        }
        return arrayList;
    }

    public static Object c(Object obj, p096j9.c cVar) {
        for (Object obj2 : e(obj)) {
            if (p210v8.i.a(d(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    public static p096j9.c d(Object obj) {
        M8.b bVar = (M8.b) obj;
        p210v8.i.f(bVar, "<this>");
        return bVar.a();
    }

    public static Iterable e(Object obj) {
        M8.h hVarQ;
        M8.b bVar = (M8.b) obj;
        p210v8.i.f(bVar, "<this>");
        InterfaceC0271e interfaceC0271eD = p165q9.d.d(bVar);
        return (interfaceC0271eD == null || (hVarQ = interfaceC0271eD.q()) == null) ? p086i8.s.f12328s : hVarQ;
    }

    public static boolean f(Object obj, p096j9.c cVar) {
        Iterable iterableE = e(obj);
        if ((iterableE instanceof Collection) && ((Collection) iterableE).isEmpty()) {
            return false;
        }
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            if (p210v8.i.a(d(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    public static List j(p145o9.g gVar) {
        if (!(gVar instanceof p145o9.b)) {
            return gVar instanceof p145o9.i ? com.bumptech.glide.d.u(((p145o9.i) gVar).f13832c.h()) : p086i8.s.f12328s;
        }
        Iterable iterable = (Iterable) ((p145o9.b) gVar).a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            p086i8.q.J(arrayList, j((p145o9.g) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:73:0x0127  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Map] */
    public final u b(u uVar, M8.h hVar) {
        boolean z6;
        n nVar;
        B bH;
        n nVar2;
        Object objC;
        Object next;
        p076h8.f fVar;
        p019b9.i iVarG;
        p210v8.i.f(hVar, "annotations");
        t tVar = this.a;
        if (!tVar.f4989b) {
            ArrayList<n> arrayList = new ArrayList();
            Iterator it = hVar.iterator();
            while (true) {
                z6 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                B b3 = B.IGNORE;
                B b7 = B.WARN;
                n nVar3 = null;
                if (tVar.f4989b || (nVar = (n) AbstractC0441b.f4958g.get(d(next2))) == null) {
                    nVar2 = null;
                } else {
                    p096j9.c cVarD = d(next2);
                    if (cVarD == null || !AbstractC0441b.f4957f.containsKey(cVarD)) {
                        bH = h(next2);
                        if (bH == null) {
                            bH = tVar.a.a;
                        }
                    } else {
                        bH = (B) s.f4987A.invoke(cVarD);
                    }
                    if (bH == b3) {
                        bH = null;
                    }
                    if (bH == null) {
                        nVar2 = null;
                    } else {
                        p019b9.i iVarA = p019b9.i.a(nVar.a, null, bH == b7, 1);
                        Collection collection = nVar.f4976b;
                        p210v8.i.f(collection, "qualifierApplicabilityTypes");
                        nVar2 = new n(iVarA, collection, nVar.f4977c);
                    }
                }
                if (nVar2 != null) {
                    nVar3 = nVar2;
                } else {
                    if (tVar.a.f4992d || (objC = c(next2, AbstractC0441b.f4954c)) == null) {
                        fVar = null;
                    } else {
                        Iterator it2 = e(next2).iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (i(next) == null);
                        if (next == null) {
                            fVar = null;
                        } else {
                            ArrayList arrayListA = a(objC, true);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it3 = arrayListA.iterator();
                            while (it3.hasNext()) {
                                EnumC0440a enumC0440a = (EnumC0440a) f4960c.get((String) it3.next());
                                if (enumC0440a != null) {
                                    linkedHashSet.add(enumC0440a);
                                }
                            }
                            if (linkedHashSet.contains(EnumC0440a.TYPE_USE)) {
                                linkedHashSet = p086i8.C.u(p086i8.C.r(p086i8.i.K(EnumC0440a.values()), EnumC0440a.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                            }
                            fVar = new p076h8.f(next, linkedHashSet);
                        }
                    }
                    if (fVar != null) {
                        Set set = (Set) fVar.f11790t;
                        B bH2 = h(next2);
                        Object obj = fVar.f11789s;
                        if (bH2 == null && (bH2 = h(obj)) == null) {
                            bH2 = tVar.a.a;
                        }
                        if (bH2 != b3) {
                            p210v8.i.f(obj, "$this$extractNullability");
                            p019b9.i iVarG2 = g(obj, false);
                            if (iVarG2 == null) {
                                Object objI = i(obj);
                                if (objI != null) {
                                    B bH3 = h(obj);
                                    if (bH3 == null) {
                                        bH3 = tVar.a.a;
                                    }
                                    if (bH3 == b3 || (iVarG = g(objI, false)) == null) {
                                        iVarG2 = null;
                                    } else {
                                        iVarG2 = p019b9.i.a(iVarG, null, bH3 == b7, 1);
                                    }
                                } else {
                                    iVarG2 = null;
                                }
                            }
                            if (iVarG2 != null) {
                                nVar3 = new n(p019b9.i.a(iVarG2, null, bH2 == b7, 1), set);
                            }
                        }
                    }
                }
                if (nVar3 != null) {
                    arrayList.add(nVar3);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = uVar != null ? new EnumMap(uVar.a) : new EnumMap(EnumC0440a.class);
                for (n nVar4 : arrayList) {
                    Iterator it4 = nVar4.f4976b.iterator();
                    while (it4.hasNext()) {
                        enumMap.put((EnumC0440a) it4.next(), nVar4);
                        z6 = true;
                    }
                }
                if (z6) {
                    return new u(enumMap);
                }
            }
        }
        return uVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (r10.equals("ALWAYS") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        if (r10.equals("UNKNOWN") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (r10.equals("NEVER") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        if (r10.equals("MAYBE") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c8, code lost:
    
        if (r0.equals(U8.y.f5019m) != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p019b9.i g(java.lang.Object r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U8.C0442c.g(java.lang.Object, boolean):b9.i");
    }

    public final B h(Object obj) {
        String str;
        t tVar = this.a;
        B b3 = (B) tVar.a.f4991c.get(d(obj));
        if (b3 != null) {
            return b3;
        }
        Object objC = c(obj, AbstractC0441b.f4955d);
        if (objC == null || (str = (String) p086i8.k.U(a(objC, false))) == null) {
            return null;
        }
        B b7 = tVar.a.f4990b;
        if (b7 != null) {
            return b7;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return B.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return B.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return B.WARN;
        }
        return null;
    }

    public final Object i(Object obj) {
        Object objI;
        p210v8.i.f(obj, "annotation");
        if (!this.a.a.f4992d) {
            if (p086i8.k.O(AbstractC0441b.f4959h, d(obj)) || f(obj, AbstractC0441b.f4953b)) {
                return obj;
            }
            if (f(obj, AbstractC0441b.a)) {
                ConcurrentHashMap concurrentHashMap = this.f4961b;
                InterfaceC0271e interfaceC0271eD = p165q9.d.d((M8.b) obj);
                p210v8.i.c(interfaceC0271eD);
                Object obj2 = concurrentHashMap.get(interfaceC0271eD);
                if (obj2 != null) {
                    return obj2;
                }
                Iterator it = e(obj).iterator();
                do {
                    if (!it.hasNext()) {
                        objI = null;
                        break;
                    }
                    objI = i(it.next());
                } while (objI == null);
                if (objI != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC0271eD, objI);
                    return objPutIfAbsent == null ? objI : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
