package Y8;

import A9.AbstractC0129b;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.K;
import A9.O;
import A9.T;
import A9.Z;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0277k;
import L8.N;
import L8.P;
import O8.AbstractC0346b;
import U8.EnumC0440a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p.b1;
import p047e9.C0618j;
import p047e9.Q;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0129b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5753c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p247z9.i f5754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0346b f5755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super((p247z9.l) ((I4.a) jVar.f5757B.f1659t).a);
        this.f5755e = jVar;
        p247z9.l lVar = (p247z9.l) ((I4.a) jVar.f5757B.f1659t).a;
        g gVar = new g(jVar, 0);
        lVar.getClass();
        this.f5754d = new p247z9.i(lVar, gVar);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:122:0x0315  */
    /* JADX WARN: Code duplicated, block: B:125:0x0322  */
    /* JADX WARN: Code duplicated, block: B:128:0x032b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0330  */
    /* JADX WARN: Code duplicated, block: B:138:0x0348  */
    /* JADX WARN: Code duplicated, block: B:139:0x035a  */
    /* JADX WARN: Code duplicated, block: B:142:0x0367  */
    /* JADX WARN: Code duplicated, block: B:145:0x037e A[LOOP:5: B:143:0x0378->B:145:0x037e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x039f  */
    /* JADX WARN: Code duplicated, block: B:150:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:172:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x018e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01db  */
    /* JADX WARN: Code duplicated, block: B:93:0x020c  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x018e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Collection] */
    @Override // A9.AbstractC0135h
    public final Collection b() {
        ?? arrayList;
        String str;
        p096j9.c cVar;
        p096j9.c cVar2;
        ArrayList arrayList2;
        A9.D dQ;
        Fa.e eVar;
        InterfaceC0271e interfaceC0271e;
        AbstractC0151y abstractC0151yI;
        List listU;
        ArrayList arrayList3;
        AbstractC0151y abstractC0151yP;
        AbstractC0151y abstractC0151yA;
        O oD;
        O oD2;
        AbstractC0346b abstractC0346b = this.f5755e;
        switch (this.f5753c) {
            case 0:
                j jVar = (j) abstractC0346b;
                Class cls = jVar.f5771z.a;
                boolean zA = p210v8.i.a(cls, Object.class);
                p086i8.s sVar = p086i8.s.f12328s;
                if (zA) {
                    arrayList = sVar;
                } else {
                    Ea.a aVar = new Ea.a(2);
                    Type genericSuperclass = cls.getGenericSuperclass();
                    aVar.a(genericSuperclass != null ? genericSuperclass : Object.class);
                    Type[] genericInterfaces = cls.getGenericInterfaces();
                    p210v8.i.e(genericInterfaces, "klass.genericInterfaces");
                    aVar.b(genericInterfaces);
                    ArrayList arrayList4 = aVar.a;
                    List listC = p086i8.l.C(arrayList4.toArray(new Type[arrayList4.size()]));
                    arrayList = new ArrayList(p086i8.m.H(listC, 10));
                    Iterator it = listC.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new R8.p((Type) it.next()));
                    }
                }
                ArrayList arrayList5 = new ArrayList(arrayList.size());
                ArrayList<p009a9.d> arrayList6 = new ArrayList(0);
                p096j9.c cVar3 = U8.x.f5005n;
                p210v8.i.e(cVar3, "PURELY_IMPLEMENTS_ANNOTATION");
                M8.b bVarH = jVar.f5768M.H(cVar3);
                if (bVarH != null) {
                    Object objL0 = p086i8.k.l0(bVarH.b().values());
                    p145o9.v vVar = objL0 instanceof p145o9.v ? (p145o9.v) objL0 : null;
                    if (vVar != null && (str = (String) vVar.a) != null) {
                        int i10 = 1;
                        int i11 = 0;
                        while (true) {
                            if (i11 < str.length()) {
                                char cCharAt = str.charAt(i11);
                                int iD = p239z.e.d(i10);
                                if (iD != 0) {
                                    if (iD != 1) {
                                        if (iD != 2) {
                                            continue;
                                        } else if (!Character.isJavaIdentifierStart(cCharAt)) {
                                            i10 = 2;
                                        }
                                    } else if (cCharAt == '.') {
                                        i10 = 3;
                                    } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                                    }
                                    i11++;
                                } else if (!Character.isJavaIdentifierStart(cCharAt)) {
                                    i10 = 2;
                                    i11++;
                                }
                            } else {
                                cVar = i10 != 3 ? new p096j9.c(str) : null;
                            }
                        }
                    }
                }
                if (cVar == null || cVar.d() || !cVar.h(I8.o.j)) {
                    cVar = null;
                }
                Fa.e eVar2 = jVar.f5757B;
                if (cVar == null) {
                    LinkedHashMap linkedHashMap = U8.k.a;
                    cVar2 = (p096j9.c) U8.k.f4975b.get(p165q9.d.g(jVar));
                    if (cVar2 == null) {
                        dQ = null;
                    }
                    for (R8.p pVar : arrayList) {
                        abstractC0151yP = ((Y1.c) eVar2.f1663x).P(pVar, C8.E.A(1, false, null, 7));
                        p019b9.d dVar = (p019b9.d) ((I4.a) eVar2.f1659t).f2062r;
                        dVar.getClass();
                        Fa.e eVar3 = eVar2;
                        abstractC0151yA = dVar.a(new O0.a((InterfaceC0277k) null, false, eVar3, EnumC0440a.TYPE_USE, true), abstractC0151yP, sVar, null, false);
                        if (abstractC0151yA != null) {
                            abstractC0151yP = abstractC0151yA;
                        }
                        if (abstractC0151yP.D().w() instanceof L8.B) {
                            arrayList6.add(pVar);
                        }
                        oD = abstractC0151yP.D();
                        if (dQ != null) {
                            oD2 = dQ.D();
                        } else {
                            oD2 = null;
                        }
                        if (!p210v8.i.a(oD, oD2) && !I8.i.x(abstractC0151yP)) {
                            arrayList5.add(abstractC0151yP);
                        }
                        eVar2 = eVar3;
                    }
                    eVar = eVar2;
                    interfaceC0271e = jVar.f5756A;
                    if (interfaceC0271e != null) {
                        abstractC0151yI = new Z(xa.d.i(interfaceC0271e, jVar)).i(1, interfaceC0271e.p());
                    } else {
                        abstractC0151yI = null;
                    }
                    J9.l.b(arrayList5, abstractC0151yI);
                    J9.l.b(arrayList5, dQ);
                    if (!arrayList6.isEmpty()) {
                        if (arrayList5.isEmpty()) {
                            listU = com.bumptech.glide.d.u(((O8.C) ((I4.a) eVar.f1659t).f2059o).f3622v.e());
                        } else {
                            listU = p086i8.k.s0(arrayList5);
                        }
                        return listU;
                    }
                    I4.a aVar2 = (I4.a) eVar.f1659t;
                    arrayList3 = new ArrayList(p086i8.m.H(arrayList6, 10));
                    for (p009a9.d dVar2 : arrayList6) {
                        p210v8.i.d(dVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                        arrayList3.add(((R8.p) dVar2).a.toString());
                    }
                    ((Q8.d) aVar2.f2051f).b(jVar, arrayList3);
                    throw null;
                }
                cVar2 = cVar;
                I4.a aVar3 = (I4.a) eVar2.f1659t;
                T8.b bVar = T8.b.f4766z;
                int i12 = p165q9.d.a;
                O8.C c10 = (O8.C) aVar3.f2059o;
                p210v8.i.f(c10, "<this>");
                cVar2.d();
                p096j9.c cVarE = cVar2.e();
                p210v8.i.e(cVarE, "topLevelClassFqName.parent()");
                O8.z zVar = (O8.z) c10.K(cVarE);
                p096j9.f fVarF = cVar2.f();
                p210v8.i.e(fVarF, "topLevelClassFqName.shortName()");
                InterfaceC0273g interfaceC0273gA = zVar.f3799y.a(fVarF, bVar);
                InterfaceC0271e interfaceC0271e2 = interfaceC0273gA instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gA : null;
                if (interfaceC0271e2 == null) {
                    dQ = null;
                } else {
                    int size = interfaceC0271e2.I().u().size();
                    List listU2 = jVar.f5763H.u();
                    p210v8.i.e(listU2, "getTypeConstructor().parameters");
                    int size2 = listU2.size();
                    if (size2 == size) {
                        List list = listU2;
                        arrayList2 = new ArrayList(p086i8.m.H(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new T(1, ((P) it2.next()).p()));
                        }
                    } else if (size2 == 1 && size > 1 && cVar == null) {
                        T t7 = new T(1, ((P) p086i8.k.k0(listU2)).p());
                        B8.c cVar4 = new B8.c(1, size, 1);
                        ArrayList arrayList7 = new ArrayList(p086i8.m.H(cVar4, 10));
                        B8.b it3 = cVar4.iterator();
                        while (it3.f774u) {
                            it3.a();
                            arrayList7.add(t7);
                        }
                        arrayList2 = arrayList7;
                    } else {
                        dQ = null;
                    }
                    K.f338t.getClass();
                    dQ = C0133f.q(K.f339u, interfaceC0271e2, arrayList2);
                }
                while (r4.hasNext()) {
                    abstractC0151yP = ((Y1.c) eVar2.f1663x).P(pVar, C8.E.A(1, false, null, 7));
                    p019b9.d dVar3 = (p019b9.d) ((I4.a) eVar2.f1659t).f2062r;
                    dVar3.getClass();
                    Fa.e eVar4 = eVar2;
                    abstractC0151yA = dVar3.a(new O0.a((InterfaceC0277k) null, false, eVar4, EnumC0440a.TYPE_USE, true), abstractC0151yP, sVar, null, false);
                    if (abstractC0151yA != null) {
                        abstractC0151yP = abstractC0151yA;
                    }
                    if (abstractC0151yP.D().w() instanceof L8.B) {
                        arrayList6.add(pVar);
                    }
                    oD = abstractC0151yP.D();
                    if (dQ != null) {
                        oD2 = dQ.D();
                    } else {
                        oD2 = null;
                    }
                    if (!p210v8.i.a(oD, oD2)) {
                        arrayList5.add(abstractC0151yP);
                    }
                    eVar2 = eVar4;
                }
                eVar = eVar2;
                interfaceC0271e = jVar.f5756A;
                if (interfaceC0271e != null) {
                    abstractC0151yI = new Z(xa.d.i(interfaceC0271e, jVar)).i(1, interfaceC0271e.p());
                } else {
                    abstractC0151yI = null;
                }
                J9.l.b(arrayList5, abstractC0151yI);
                J9.l.b(arrayList5, dQ);
                if (!arrayList6.isEmpty()) {
                    if (arrayList5.isEmpty()) {
                        listU = p086i8.k.s0(arrayList5);
                    } else {
                        listU = com.bumptech.glide.d.u(((O8.C) ((I4.a) eVar.f1659t).f2059o).f3622v.e());
                    }
                    return listU;
                }
                I4.a aVar4 = (I4.a) eVar.f1659t;
                arrayList3 = new ArrayList(p086i8.m.H(arrayList6, 10));
                while (r2.hasNext()) {
                    p210v8.i.d(dVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((R8.p) dVar2).a.toString());
                }
                ((Q8.d) aVar4.f2051f).b(jVar, arrayList3);
                throw null;
            default:
                p238y9.g gVar = (p238y9.g) abstractC0346b;
                C0618j c0618j = gVar.f16079w;
                V3.b bVar2 = gVar.f16067D;
                p067g9.g gVar2 = (p067g9.g) bVar2.f5174d;
                p210v8.i.f(c0618j, "<this>");
                List list2 = c0618j.f11131z;
                boolean zIsEmpty = list2.isEmpty();
                ?? arrayList8 = list2;
                if (zIsEmpty) {
                    arrayList8 = 0;
                }
                if (arrayList8 == 0) {
                    List list3 = c0618j.f11099A;
                    p210v8.i.e(list3, "supertypeIdList");
                    List<Integer> list4 = list3;
                    arrayList8 = new ArrayList(p086i8.m.H(list4, 10));
                    for (Integer num : list4) {
                        p210v8.i.e(num, "it");
                        arrayList8.add(gVar2.a(num.intValue()));
                    }
                }
                Iterable iterable = (Iterable) arrayList8;
                ArrayList arrayList9 = new ArrayList(p086i8.m.H(iterable, 10));
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    arrayList9.add(((b1) bVar2.f5178h).h((Q) it4.next()));
                }
                ArrayList arrayListG0 = p086i8.k.g0(arrayList9, ((N8.b) ((I4.c) bVar2.a).f2090n).c(gVar));
                ArrayList<L8.B> arrayList10 = new ArrayList();
                Iterator it5 = arrayListG0.iterator();
                while (it5.hasNext()) {
                    InterfaceC0273g interfaceC0273gW = ((AbstractC0151y) it5.next()).D().w();
                    L8.B b3 = interfaceC0273gW instanceof L8.B ? (L8.B) interfaceC0273gW : null;
                    if (b3 != null) {
                        arrayList10.add(b3);
                    }
                }
                if (!arrayList10.isEmpty()) {
                    p220w9.j jVar2 = (p220w9.j) ((I4.c) bVar2.a).f2085h;
                    ArrayList arrayList11 = new ArrayList(p086i8.m.H(arrayList10, 10));
                    for (L8.B b7 : arrayList10) {
                        p096j9.b bVarF = p165q9.d.f(b7);
                        arrayList11.add(bVarF != null ? bVarF.b().b() : b7.getName().g());
                    }
                    jVar2.b(gVar, arrayList11);
                }
                return p086i8.k.s0(arrayListG0);
        }
    }

    @Override // A9.AbstractC0135h
    public final N d() {
        switch (this.f5753c) {
            case 0:
                return (N) ((I4.a) ((j) this.f5755e).f5757B.f1659t).f2057m;
            default:
                return N.f2801u;
        }
    }

    @Override // A9.AbstractC0129b
    /* JADX INFO: renamed from: i */
    public final InterfaceC0271e w() {
        switch (this.f5753c) {
            case 0:
                return (j) this.f5755e;
            default:
                return (p238y9.g) this.f5755e;
        }
    }

    public final String toString() {
        switch (this.f5753c) {
            case 0:
                String strG = ((j) this.f5755e).getName().g();
                p210v8.i.e(strG, "name.asString()");
                return strG;
            default:
                String str = ((p238y9.g) this.f5755e).getName().f12551s;
                p210v8.i.e(str, "name.toString()");
                return str;
        }
    }

    @Override // A9.O
    public final List u() {
        switch (this.f5753c) {
            case 0:
                break;
        }
        return (List) this.f5754d.invoke();
    }

    @Override // A9.O
    public final boolean v() {
        switch (this.f5753c) {
        }
        return true;
    }

    @Override // A9.AbstractC0129b, A9.O
    public final InterfaceC0273g w() {
        switch (this.f5753c) {
            case 0:
                return (j) this.f5755e;
            default:
                return (p238y9.g) this.f5755e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p238y9.g gVar) {
        super((p247z9.l) ((I4.c) gVar.f16067D.a).a);
        this.f5755e = gVar;
        p247z9.l lVar = (p247z9.l) ((I4.c) gVar.f16067D.a).a;
        p238y9.f fVar = new p238y9.f(gVar, 0);
        lVar.getClass();
        this.f5754d = new p247z9.i(lVar, fVar);
    }
}
