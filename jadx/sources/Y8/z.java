package Y8;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.b0;
import L8.C0280n;
import L8.InterfaceC0276j;
import L8.K;
import O8.N;
import Q3.u0;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ A f5817t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(A a, int i10) {
        super(1);
        this.f5816s = i10;
        this.f5817t = a;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:92:0x0287  */
    @Override // p200u8.b
    public final Object invoke(Object obj) {
        p009a9.d hVar;
        p009a9.d yVar;
        A a = this.f5817t;
        switch (this.f5816s) {
            case 0:
                p096j9.f fVar = (p096j9.f) obj;
                p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
                p pVar = a.f5714c;
                if (pVar != null) {
                    return (K) pVar.f5718g.invoke(fVar);
                }
                R8.t tVarD = ((InterfaceC0474c) a.f5716e.invoke()).d(fVar);
                if (tVarD != null) {
                    Field field = tVarD.a;
                    if (!field.isEnumConstant()) {
                        boolean z6 = !Modifier.isFinal(((Field) tVarD.b()).getModifiers());
                        Fa.e eVar = a.f5713b;
                        X8.b bVarK = u0.k(eVar, tVarD);
                        InterfaceC0276j interfaceC0276jQ = a.q();
                        C0280n c0280nF = p068ga.d.F(tVarD.e());
                        p096j9.f fVarC = tVarD.c();
                        I4.a aVar = (I4.a) eVar.f1659t;
                        W8.g gVarH1 = W8.g.h1(interfaceC0276jQ, bVarK, c0280nF, z6, fVarC, ((Q8.d) aVar.j).a(tVarD), Modifier.isFinal(((Field) tVarD.b()).getModifiers()) && Modifier.isStatic(((Field) tVarD.b()).getModifiers()));
                        gVarH1.d1(null, null, null, null);
                        Type genericType = field.getGenericType();
                        p210v8.i.e(genericType, "member.genericType");
                        boolean z10 = genericType instanceof Class;
                        if (z10) {
                            Class cls = (Class) genericType;
                            if (cls.isPrimitive()) {
                                yVar = new R8.y(cls);
                            } else {
                                if (!(genericType instanceof GenericArrayType) || (z10 && ((Class) genericType).isArray())) {
                                    hVar = new R8.h(genericType);
                                } else {
                                    hVar = genericType instanceof WildcardType ? new R8.D((WildcardType) genericType) : new R8.p(genericType);
                                }
                                yVar = hVar;
                            }
                        } else {
                            if (genericType instanceof GenericArrayType) {
                                hVar = new R8.h(genericType);
                            } else {
                                hVar = new R8.h(genericType);
                            }
                            yVar = hVar;
                        }
                        AbstractC0151y abstractC0151yP = ((Y1.c) eVar.f1663x).P(yVar, C8.E.A(2, false, null, 7));
                        if ((I8.i.F(abstractC0151yP) || I8.i.G(abstractC0151yP)) && Modifier.isFinal(((Field) tVarD.b()).getModifiers())) {
                            Modifier.isStatic(((Field) tVarD.b()).getModifiers());
                        }
                        p086i8.s sVar = p086i8.s.f12328s;
                        gVarH1.g1(abstractC0151yP, sVar, a.p(), null, sVar);
                        AbstractC0151y type = gVarH1.getType();
                        if (type == null) {
                            p124m9.e.a(67);
                            throw null;
                        }
                        int i10 = p124m9.e.a;
                        if (!gVarH1.f3672x && !AbstractC0130c.j(type)) {
                            if (b0.b(type)) {
                                gVarH1.e1(null, new A0.j(a, tVarD, gVarH1, 6));
                            } else {
                                I8.i iVarE = p165q9.d.e(gVarH1);
                                if (I8.i.F(type)) {
                                    gVarH1.e1(null, new A0.j(a, tVarD, gVarH1, 6));
                                } else {
                                    B9.m mVar = B9.d.a;
                                    if (mVar.a(iVarE.u(), type) || mVar.a(iVarE.j("Number").p(), type) || mVar.a(iVarE.e(), type) || I8.s.a(type)) {
                                        gVarH1.e1(null, new A0.j(a, tVarD, gVarH1, 6));
                                    }
                                }
                            }
                        }
                        ((V8.h) aVar.f2052g).getClass();
                        return gVarH1;
                    }
                }
                return null;
            case 1:
                p096j9.f fVar2 = (p096j9.f) obj;
                p210v8.i.f(fVar2, MediationMetaData.KEY_NAME);
                p pVar2 = a.f5714c;
                if (pVar2 != null) {
                    return (Collection) pVar2.f5717f.invoke(fVar2);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((InterfaceC0474c) a.f5716e.invoke()).e(fVar2).iterator();
                while (it.hasNext()) {
                    W8.f fVarT = a.t((R8.w) it.next());
                    if (a.r(fVarT)) {
                        ((V8.h) ((I4.a) a.f5713b.f1659t).f2052g).getClass();
                        arrayList.add(fVarT);
                    }
                }
                a.j(fVar2, arrayList);
                return arrayList;
            case 2:
                p096j9.f fVar3 = (p096j9.f) obj;
                p210v8.i.f(fVar3, MediationMetaData.KEY_NAME);
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) a.f5717f.invoke(fVar3));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : linkedHashSet) {
                    String strC = qa.b.c((N) obj2, 2);
                    Object arrayList2 = linkedHashMap.get(strC);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strC, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        List list2 = list;
                        Collection collectionO = p124m9.m.o(list2, k.f5773u);
                        linkedHashSet.removeAll(list2);
                        linkedHashSet.addAll(collectionO);
                    }
                }
                a.m(linkedHashSet, fVar3);
                Fa.e eVar2 = a.f5713b;
                return p086i8.k.s0(((p019b9.d) ((I4.a) eVar2.f1659t).f2062r).e(eVar2, linkedHashSet));
            default:
                p096j9.f fVar4 = (p096j9.f) obj;
                p210v8.i.f(fVar4, MediationMetaData.KEY_NAME);
                ArrayList arrayList3 = new ArrayList();
                J9.l.b(arrayList3, a.f5718g.invoke(fVar4));
                a.n(fVar4, arrayList3);
                if (p124m9.e.n(a.q(), 5)) {
                    return p086i8.k.s0(arrayList3);
                }
                Fa.e eVar3 = a.f5713b;
                return p086i8.k.s0(((p019b9.d) ((I4.a) eVar3.f1659t).f2062r).e(eVar3, arrayList3));
        }
    }
}
