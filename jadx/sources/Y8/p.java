package Y8;

import A9.AbstractC0151y;
import A9.S;
import A9.b0;
import A9.d0;
import L8.AbstractC0281o;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.InterfaceC0284s;
import L8.InterfaceC0285t;
import L8.K;
import O8.AbstractC0359o;
import O8.L;
import O8.M;
import O8.N;
import O8.U;
import Q3.u0;
import R8.AbstractC0408c;
import U8.AbstractC0443d;
import U8.C0444e;
import U8.C0445f;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p188t1.Y;

/* JADX INFO: loaded from: classes.dex */
public final class p extends A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC0271e f5786n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final R8.n f5787o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f5788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p247z9.i f5789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p247z9.i f5790r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p247z9.i f5791s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p247z9.i f5792t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p247z9.j f5793u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Fa.e eVar, InterfaceC0271e interfaceC0271e, R8.n nVar, boolean z6, p pVar) {
        super(eVar, pVar);
        p210v8.i.f(eVar, "c");
        p210v8.i.f(interfaceC0271e, "ownerDescriptor");
        p210v8.i.f(nVar, "jClass");
        this.f5786n = interfaceC0271e;
        this.f5787o = nVar;
        this.f5788p = z6;
        p247z9.l lVar = (p247z9.l) ((I4.a) eVar.f1659t).a;
        n nVar2 = new n(this, eVar);
        lVar.getClass();
        this.f5789q = new p247z9.i(lVar, nVar2);
        o oVar = new o(this, 1);
        lVar.getClass();
        this.f5790r = new p247z9.i(lVar, oVar);
        n nVar3 = new n(eVar, this);
        lVar.getClass();
        this.f5791s = new p247z9.i(lVar, nVar3);
        o oVar2 = new o(this, 0);
        lVar.getClass();
        this.f5792t = new p247z9.i(lVar, oVar2);
        this.f5793u = lVar.c(new E0.b(this, 4, eVar));
    }

    public static N C(N n10, InterfaceC0285t interfaceC0285t, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return n10;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            N n11 = (N) it.next();
            if (!n10.equals(n11) && n11.f3783T == null && F(n11, interfaceC0285t)) {
                InterfaceC0285t interfaceC0285tBuild = n10.y0().k().build();
                p210v8.i.c(interfaceC0285tBuild);
                return (N) interfaceC0285tBuild;
            }
        }
        return n10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public static N D(N n10) {
        p096j9.c cVarG;
        List listH0 = n10.H0();
        p210v8.i.e(listH0, "valueParameters");
        U u3 = (U) p086i8.k.c0(listH0);
        if (u3 != null) {
            InterfaceC0273g interfaceC0273gW = u3.getType().D().w();
            if (interfaceC0273gW != null) {
                p096j9.e eVarH = p165q9.d.h(interfaceC0273gW);
                if (!eVarH.d()) {
                    eVarH = null;
                }
                if (eVarH != null) {
                    cVarG = eVarH.g();
                } else {
                    cVarG = null;
                }
            } else {
                cVarG = null;
            }
            if (!p210v8.i.a(cVarG, I8.o.f2193f)) {
                u3 = null;
            }
            if (u3 != null) {
                InterfaceC0284s interfaceC0284sY0 = n10.y0();
                List listH1 = n10.H0();
                p210v8.i.e(listH1, "valueParameters");
                N n11 = (N) interfaceC0284sY0.g(p086i8.k.Q(listH1)).d(((S) u3.getType().l().get(0)).b()).build();
                if (n11 == null) {
                    return n11;
                }
                n11.f3777M = true;
                return n11;
            }
        }
        return null;
    }

    public static boolean F(InterfaceC0285t interfaceC0285t, InterfaceC0285t interfaceC0285t2) {
        int iC = p124m9.l.f13174c.n(interfaceC0285t2, interfaceC0285t, true).c();
        AbstractC0487g.u(iC, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return iC == 1 && !com.bumptech.glide.d.l(interfaceC0285t2, interfaceC0285t);
    }

    public static boolean G(N n10, N n11) {
        int i10 = AbstractC0443d.f4962l;
        p210v8.i.f(n10, "<this>");
        if (p210v8.i.a(n10.getName().g(), "removeAt") && p210v8.i.a(qa.b.d(n10), U8.F.f4942g.f4930b)) {
            n11 = n11.c();
        }
        p210v8.i.e(n11, "if (superDescriptor.isRe…iginal else subDescriptor");
        return F(n11, n10);
    }

    public static N H(K k3, String str, p200u8.b bVar) {
        N n10;
        Iterator it = ((Iterable) bVar.invoke(p096j9.f.j(str))).iterator();
        do {
            n10 = null;
            if (!it.hasNext()) {
                break;
            }
            N n11 = (N) it.next();
            if (n11.H0().size() == 0) {
                B9.m mVar = B9.d.a;
                AbstractC0151y abstractC0151y = n11.f3787y;
                if (abstractC0151y == null ? false : mVar.b(abstractC0151y, k3.getType())) {
                    n10 = n11;
                }
            }
        } while (n10 == null);
        return n10;
    }

    public static N J(K k3, p200u8.b bVar) {
        N n10;
        AbstractC0151y abstractC0151y;
        String strG = k3.getName().g();
        p210v8.i.e(strG, "name.asString()");
        Iterator it = ((Iterable) bVar.invoke(p096j9.f.j(U8.w.b(strG)))).iterator();
        do {
            n10 = null;
            if (!it.hasNext()) {
                break;
            }
            N n11 = (N) it.next();
            if (n11.H0().size() == 1 && (abstractC0151y = n11.f3787y) != null) {
                p096j9.f fVar = I8.i.f2112e;
                if (I8.i.D(abstractC0151y, I8.n.f2167d)) {
                    B9.m mVar = B9.d.a;
                    List listH0 = n11.H0();
                    p210v8.i.e(listH0, "descriptor.valueParameters");
                    if (mVar.a(((U) p086i8.k.k0(listH0)).getType(), k3.getType())) {
                        n10 = n11;
                    }
                }
            }
        } while (n10 == null);
        return n10;
    }

    public static boolean M(N n10, InterfaceC0285t interfaceC0285t) {
        String strC = qa.b.c(n10, 2);
        InterfaceC0285t interfaceC0285tC = interfaceC0285t.c();
        p210v8.i.e(interfaceC0285tC, "builtinWithErasedParameters.original");
        return strC.equals(qa.b.c(interfaceC0285tC, 2)) && !F(n10, interfaceC0285t);
    }

    public static final ArrayList v(p pVar, p096j9.f fVar) {
        Collection collectionE = ((InterfaceC0474c) pVar.f5716e.invoke()).e(fVar);
        ArrayList arrayList = new ArrayList(p086i8.m.H(collectionE, 10));
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add(pVar.t((R8.w) it.next()));
        }
        return arrayList;
    }

    public static final ArrayList w(p pVar, p096j9.f fVar) {
        LinkedHashSet linkedHashSetK = pVar.K(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetK) {
            N n10 = (N) obj;
            p210v8.i.f(n10, "<this>");
            if (p086i8.C.l(n10) == null && C0445f.a(n10) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A(Set set, AbstractCollection abstractCollection, J9.i iVar, p200u8.b bVar) {
        N nJ;
        M m2;
        W8.d dVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            K k3 = (K) it.next();
            if (E(k3, bVar)) {
                N nI = I(k3, bVar);
                p210v8.i.c(nI);
                if (k3.P()) {
                    nJ = J(k3, bVar);
                    p210v8.i.c(nJ);
                } else {
                    nJ = null;
                }
                if (nJ != null) {
                    nJ.m();
                    nI.m();
                }
                InterfaceC0271e interfaceC0271e = this.f5786n;
                p210v8.i.f(interfaceC0271e, "ownerDescriptor");
                W8.d dVar2 = new W8.d(interfaceC0271e, M8.g.a, nI.m(), nI.f(), nJ != null, k3.getName(), nI.g(), null, 1, false, null);
                AbstractC0151y abstractC0151y = nI.f3787y;
                p210v8.i.c(abstractC0151y);
                p086i8.s sVar = p086i8.s.f12328s;
                dVar2.g1(abstractC0151y, sVar, p(), null, sVar);
                L l4 = p124m9.m.l(dVar2, nI.q(), false, nI.g());
                l4.f3641D = nI;
                l4.c1(dVar2.getType());
                if (nJ != null) {
                    List listH0 = nJ.H0();
                    p210v8.i.e(listH0, "setterMethod.valueParameters");
                    U u3 = (U) p086i8.k.V(listH0);
                    if (u3 == null) {
                        throw new AssertionError("No parameter found for " + nJ);
                    }
                    m2 = p124m9.m.m(dVar2, nJ.q(), u3.q(), false, nJ.f(), nJ.g());
                    m2.f3641D = nJ;
                } else {
                    m2 = null;
                }
                dVar2.d1(l4, m2, null, null);
                dVar = dVar2;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                abstractCollection.add(dVar);
                if (iVar != null) {
                    iVar.add(k3);
                    return;
                }
                return;
            }
        }
    }

    public final Collection B() {
        boolean z6 = this.f5788p;
        InterfaceC0271e interfaceC0271e = this.f5786n;
        if (z6) {
            Collection collectionT = interfaceC0271e.I().t();
            p210v8.i.e(collectionT, "ownerDescriptor.typeConstructor.supertypes");
            return collectionT;
        }
        ((B9.m) ((I4.a) this.f5713b.f1659t).f2065u).getClass();
        p210v8.i.f(interfaceC0271e, "classDescriptor");
        Collection collectionT2 = interfaceC0271e.I().t();
        p210v8.i.e(collectionT2, "classDescriptor.typeConstructor.supertypes");
        return collectionT2;
    }

    public final boolean E(K k3, p200u8.b bVar) {
        if (Y.q(k3)) {
            return false;
        }
        N nI = I(k3, bVar);
        N nJ = J(k3, bVar);
        if (nI == null) {
            return false;
        }
        if (k3.P()) {
            return nJ != null && nJ.m() == nI.m();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final N I(K k3, p200u8.b bVar) {
        p096j9.f fVar;
        L lE = k3.e();
        String strG = null;
        L l4 = lE != null ? (L) p086i8.C.l(lE) : null;
        if (l4 != null) {
            I8.i.z(l4);
            InterfaceC0269c interfaceC0269cB = p165q9.d.b(p165q9.d.k(l4), C0444e.f4965v);
            if (interfaceC0269cB != null && (fVar = (p096j9.f) U8.g.a.get(p165q9.d.g(interfaceC0269cB))) != null) {
                strG = fVar.g();
            }
        }
        if (strG != null && !p086i8.C.p(this.f5786n, l4)) {
            return H(k3, strG, bVar);
        }
        String strG2 = k3.getName().g();
        p210v8.i.e(strG2, "name.asString()");
        return H(k3, U8.w.a(strG2), bVar);
    }

    public final LinkedHashSet K(p096j9.f fVar) {
        Collection collectionB = B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            p086i8.q.J(linkedHashSet, ((AbstractC0151y) it.next()).E0().c(fVar, T8.b.f4763w));
        }
        return linkedHashSet;
    }

    public final Set L(p096j9.f fVar) {
        Collection collectionB = B();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            Collection collectionB2 = ((AbstractC0151y) it.next()).E0().b(fVar, T8.b.f4763w);
            ArrayList arrayList2 = new ArrayList(p086i8.m.H(collectionB2, 10));
            Iterator it2 = collectionB2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((K) it2.next());
            }
            p086i8.q.J(arrayList, arrayList2);
        }
        return p086i8.k.w0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[LOOP:3: B:72:0x0186->B:107:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01b6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:50:0x010c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0129  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x0141  */
    /* JADX WARN: Code duplicated, block: B:62:0x0151  */
    /* JADX WARN: Code duplicated, block: B:65:0x016b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0182  */
    /* JADX WARN: Code duplicated, block: B:74:0x018c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[LOOP:1: B:54:0x012d->B:99:?, LOOP_END, SYNTHETIC] */
    public final boolean N(N n10) {
        Iterable iterableD;
        p096j9.f fVar;
        p096j9.f name;
        N nD;
        LinkedHashSet<N> linkedHashSetK;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        InterfaceC0285t interfaceC0285tA;
        ArrayList arrayList2;
        N n11;
        Iterator it3;
        N n12;
        p096j9.f name2 = n10.getName();
        p210v8.i.e(name2, "function.name");
        String strG = name2.g();
        p210v8.i.e(strG, "name.asString()");
        p096j9.c cVar = U8.w.a;
        if (L9.n.I(strG, "get", false) || L9.n.I(strG, "is", false)) {
            p096j9.f fVarO = com.bumptech.glide.e.o(name2, "get", null, 12);
            if (fVarO == null) {
                fVarO = com.bumptech.glide.e.o(name2, "is", null, 8);
            }
            iterableD = p086i8.l.D(fVarO);
        } else if (L9.n.I(strG, "set", false)) {
            iterableD = p086i8.i.u(new p096j9.f[]{com.bumptech.glide.e.o(name2, "set", null, 4), com.bumptech.glide.e.o(name2, "set", "is", 4)});
        } else {
            iterableD = (List) U8.g.f4972b.get(name2);
            if (iterableD == null) {
                iterableD = p086i8.s.f12328s;
            }
        }
        Iterable iterable = iterableD;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            ArrayList arrayList3 = U8.F.a;
            p096j9.f name3 = n10.getName();
            p210v8.i.e(name3, MediationMetaData.KEY_NAME);
            fVar = (p096j9.f) U8.F.f4945k.get(name3);
            if (fVar == null) {
                int i10 = C0445f.f4971l;
                name = n10.getName();
                p210v8.i.e(name, MediationMetaData.KEY_NAME);
                if (!C0445f.b(name)) {
                    nD = D(n10);
                    if (nD != null) {
                        p096j9.f name4 = n10.getName();
                        p210v8.i.e(name4, MediationMetaData.KEY_NAME);
                        linkedHashSetK = K(name4);
                        if (!linkedHashSetK.isEmpty()) {
                            for (N n13 : linkedHashSetK) {
                                if (n13.t()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                p096j9.f name5 = n10.getName();
                p210v8.i.e(name5, MediationMetaData.KEY_NAME);
                LinkedHashSet linkedHashSetK2 = K(name5);
                arrayList = new ArrayList();
                it = linkedHashSetK2.iterator();
                while (it.hasNext()) {
                    interfaceC0285tA = C0445f.a((N) it.next());
                    if (interfaceC0285tA != null) {
                        arrayList.add(interfaceC0285tA);
                    }
                }
                if (arrayList.isEmpty()) {
                    nD = D(n10);
                    if (nD != null) {
                        p096j9.f name6 = n10.getName();
                        p210v8.i.e(name6, MediationMetaData.KEY_NAME);
                        linkedHashSetK = K(name6);
                        if (!linkedHashSetK.isEmpty()) {
                            while (r10.hasNext()) {
                                if (n13.t()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (M(n10, (InterfaceC0285t) it2.next())) {
                    }
                }
                nD = D(n10);
                if (nD != null) {
                    p096j9.f name7 = n10.getName();
                    p210v8.i.e(name7, MediationMetaData.KEY_NAME);
                    linkedHashSetK = K(name7);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r10.hasNext()) {
                            if (n13.t()) {
                            }
                        }
                    }
                }
                return true;
            }
            LinkedHashSet linkedHashSetK3 = K(fVar);
            arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetK3) {
                n12 = (N) obj;
                p210v8.i.f(n12, "<this>");
                if (p086i8.C.l(n12) != null) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                int i11 = C0445f.f4971l;
                name = n10.getName();
                p210v8.i.e(name, MediationMetaData.KEY_NAME);
                if (!C0445f.b(name)) {
                    nD = D(n10);
                    if (nD != null) {
                        p096j9.f name8 = n10.getName();
                        p210v8.i.e(name8, MediationMetaData.KEY_NAME);
                        linkedHashSetK = K(name8);
                        if (!linkedHashSetK.isEmpty()) {
                            while (r10.hasNext()) {
                                if (n13.t()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                p096j9.f name9 = n10.getName();
                p210v8.i.e(name9, MediationMetaData.KEY_NAME);
                LinkedHashSet linkedHashSetK4 = K(name9);
                arrayList = new ArrayList();
                it = linkedHashSetK4.iterator();
                while (it.hasNext()) {
                    interfaceC0285tA = C0445f.a((N) it.next());
                    if (interfaceC0285tA != null) {
                        arrayList.add(interfaceC0285tA);
                    }
                }
                if (arrayList.isEmpty()) {
                    nD = D(n10);
                    if (nD != null) {
                        p096j9.f name10 = n10.getName();
                        p210v8.i.e(name10, MediationMetaData.KEY_NAME);
                        linkedHashSetK = K(name10);
                        if (!linkedHashSetK.isEmpty()) {
                            while (r10.hasNext()) {
                                if (n13.t()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (M(n10, (InterfaceC0285t) it2.next())) {
                    }
                }
                nD = D(n10);
                if (nD != null) {
                    p096j9.f name11 = n10.getName();
                    p210v8.i.e(name11, MediationMetaData.KEY_NAME);
                    linkedHashSetK = K(name11);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r10.hasNext()) {
                            if (n13.t()) {
                            }
                        }
                    }
                }
                return true;
            }
            InterfaceC0284s interfaceC0284sY0 = n10.y0();
            interfaceC0284sY0.q(fVar);
            interfaceC0284sY0.F();
            interfaceC0284sY0.r();
            InterfaceC0285t interfaceC0285tBuild = interfaceC0284sY0.build();
            p210v8.i.c(interfaceC0285tBuild);
            n11 = (N) interfaceC0285tBuild;
            if (arrayList2.isEmpty()) {
                int i12 = C0445f.f4971l;
                name = n10.getName();
                p210v8.i.e(name, MediationMetaData.KEY_NAME);
                if (!C0445f.b(name)) {
                    nD = D(n10);
                    if (nD != null) {
                        p096j9.f name12 = n10.getName();
                        p210v8.i.e(name12, MediationMetaData.KEY_NAME);
                        linkedHashSetK = K(name12);
                        if (!linkedHashSetK.isEmpty()) {
                            while (r10.hasNext()) {
                                if (n13.t()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                p096j9.f name13 = n10.getName();
                p210v8.i.e(name13, MediationMetaData.KEY_NAME);
                LinkedHashSet linkedHashSetK5 = K(name13);
                arrayList = new ArrayList();
                it = linkedHashSetK5.iterator();
                while (it.hasNext()) {
                    interfaceC0285tA = C0445f.a((N) it.next());
                    if (interfaceC0285tA != null) {
                        arrayList.add(interfaceC0285tA);
                    }
                }
                if (arrayList.isEmpty()) {
                    nD = D(n10);
                    if (nD != null) {
                        p096j9.f name14 = n10.getName();
                        p210v8.i.e(name14, MediationMetaData.KEY_NAME);
                        linkedHashSetK = K(name14);
                        if (!linkedHashSetK.isEmpty()) {
                            while (r10.hasNext()) {
                                if (n13.t()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (M(n10, (InterfaceC0285t) it2.next())) {
                    }
                }
                nD = D(n10);
                if (nD != null) {
                    p096j9.f name15 = n10.getName();
                    p210v8.i.e(name15, MediationMetaData.KEY_NAME);
                    linkedHashSetK = K(name15);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r10.hasNext()) {
                            if (n13.t()) {
                            }
                        }
                    }
                }
                return true;
            }
            it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (G((N) it3.next(), n11)) {
                }
            }
            int i13 = C0445f.f4971l;
            name = n10.getName();
            p210v8.i.e(name, MediationMetaData.KEY_NAME);
            if (!C0445f.b(name)) {
                nD = D(n10);
                if (nD != null) {
                    p096j9.f name16 = n10.getName();
                    p210v8.i.e(name16, MediationMetaData.KEY_NAME);
                    linkedHashSetK = K(name16);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r10.hasNext()) {
                            if (n13.t()) {
                            }
                        }
                    }
                }
                return true;
            }
            p096j9.f name17 = n10.getName();
            p210v8.i.e(name17, MediationMetaData.KEY_NAME);
            LinkedHashSet linkedHashSetK6 = K(name17);
            arrayList = new ArrayList();
            it = linkedHashSetK6.iterator();
            while (it.hasNext()) {
                interfaceC0285tA = C0445f.a((N) it.next());
                if (interfaceC0285tA != null) {
                    arrayList.add(interfaceC0285tA);
                }
            }
            if (arrayList.isEmpty()) {
                nD = D(n10);
                if (nD != null) {
                    p096j9.f name18 = n10.getName();
                    p210v8.i.e(name18, MediationMetaData.KEY_NAME);
                    linkedHashSetK = K(name18);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r10.hasNext()) {
                            if (n13.t()) {
                            }
                        }
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (M(n10, (InterfaceC0285t) it2.next())) {
                }
            }
            nD = D(n10);
            if (nD != null) {
                p096j9.f name19 = n10.getName();
                p210v8.i.e(name19, MediationMetaData.KEY_NAME);
                linkedHashSetK = K(name19);
                if (!linkedHashSetK.isEmpty()) {
                    while (r10.hasNext()) {
                        if (n13.t()) {
                        }
                    }
                }
            }
            return true;
        }
        Iterator it4 = iterable.iterator();
        while (it4.hasNext()) {
            Set<K> setL = L((p096j9.f) it4.next());
            if (!setL.isEmpty()) {
                for (K k3 : setL) {
                    if (E(k3, new E0.b(n10, 3, this))) {
                        if (!k3.P()) {
                            String strG2 = n10.getName().g();
                            p210v8.i.e(strG2, "function.name.asString()");
                            if (!L9.n.I(strG2, "set", false)) {
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = U8.F.a;
        p096j9.f name20 = n10.getName();
        p210v8.i.e(name20, MediationMetaData.KEY_NAME);
        fVar = (p096j9.f) U8.F.f4945k.get(name20);
        if (fVar == null) {
            int i14 = C0445f.f4971l;
            name = n10.getName();
            p210v8.i.e(name, MediationMetaData.KEY_NAME);
            if (!C0445f.b(name)) {
                nD = D(n10);
                if (nD != null) {
                    p096j9.f name110 = n10.getName();
                    p210v8.i.e(name110, MediationMetaData.KEY_NAME);
                    linkedHashSetK = K(name110);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r10.hasNext()) {
                            if (n13.t() || !F(nD, n13)) {
                            }
                        }
                    }
                }
                return true;
            }
            p096j9.f name111 = n10.getName();
            p210v8.i.e(name111, MediationMetaData.KEY_NAME);
            LinkedHashSet linkedHashSetK7 = K(name111);
            arrayList = new ArrayList();
            it = linkedHashSetK7.iterator();
            while (it.hasNext()) {
                interfaceC0285tA = C0445f.a((N) it.next());
                if (interfaceC0285tA != null) {
                    arrayList.add(interfaceC0285tA);
                }
            }
            if (arrayList.isEmpty()) {
                nD = D(n10);
                if (nD != null) {
                    p096j9.f name112 = n10.getName();
                    p210v8.i.e(name112, MediationMetaData.KEY_NAME);
                    linkedHashSetK = K(name112);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r10.hasNext()) {
                            if (n13.t()) {
                            }
                        }
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (M(n10, (InterfaceC0285t) it2.next())) {
                }
            }
            nD = D(n10);
            if (nD != null) {
                p096j9.f name113 = n10.getName();
                p210v8.i.e(name113, MediationMetaData.KEY_NAME);
                linkedHashSetK = K(name113);
                if (!linkedHashSetK.isEmpty()) {
                    while (r10.hasNext()) {
                        if (n13.t()) {
                        }
                    }
                }
            }
            return true;
        }
        LinkedHashSet linkedHashSetK8 = K(fVar);
        arrayList2 = new ArrayList();
        while (r4.hasNext()) {
            n12 = (N) obj;
            p210v8.i.f(n12, "<this>");
            if (p086i8.C.l(n12) != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            int i15 = C0445f.f4971l;
            name = n10.getName();
            p210v8.i.e(name, MediationMetaData.KEY_NAME);
            if (!C0445f.b(name)) {
                nD = D(n10);
                if (nD != null) {
                    p096j9.f name114 = n10.getName();
                    p210v8.i.e(name114, MediationMetaData.KEY_NAME);
                    linkedHashSetK = K(name114);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r10.hasNext()) {
                            if (n13.t()) {
                            }
                        }
                    }
                }
                return true;
            }
            p096j9.f name115 = n10.getName();
            p210v8.i.e(name115, MediationMetaData.KEY_NAME);
            LinkedHashSet linkedHashSetK9 = K(name115);
            arrayList = new ArrayList();
            it = linkedHashSetK9.iterator();
            while (it.hasNext()) {
                interfaceC0285tA = C0445f.a((N) it.next());
                if (interfaceC0285tA != null) {
                    arrayList.add(interfaceC0285tA);
                }
            }
            if (arrayList.isEmpty()) {
                nD = D(n10);
                if (nD != null) {
                    p096j9.f name116 = n10.getName();
                    p210v8.i.e(name116, MediationMetaData.KEY_NAME);
                    linkedHashSetK = K(name116);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r10.hasNext()) {
                            if (n13.t()) {
                            }
                        }
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (M(n10, (InterfaceC0285t) it2.next())) {
                }
            }
            nD = D(n10);
            if (nD != null) {
                p096j9.f name117 = n10.getName();
                p210v8.i.e(name117, MediationMetaData.KEY_NAME);
                linkedHashSetK = K(name117);
                if (!linkedHashSetK.isEmpty()) {
                    while (r10.hasNext()) {
                        if (n13.t()) {
                        }
                    }
                }
            }
            return true;
        }
        InterfaceC0284s interfaceC0284sY1 = n10.y0();
        interfaceC0284sY1.q(fVar);
        interfaceC0284sY1.F();
        interfaceC0284sY1.r();
        InterfaceC0285t interfaceC0285tBuild2 = interfaceC0284sY1.build();
        p210v8.i.c(interfaceC0285tBuild2);
        n11 = (N) interfaceC0285tBuild2;
        if (arrayList2.isEmpty()) {
            int i16 = C0445f.f4971l;
            name = n10.getName();
            p210v8.i.e(name, MediationMetaData.KEY_NAME);
            if (!C0445f.b(name)) {
                nD = D(n10);
                if (nD != null) {
                    p096j9.f name118 = n10.getName();
                    p210v8.i.e(name118, MediationMetaData.KEY_NAME);
                    linkedHashSetK = K(name118);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r10.hasNext()) {
                            if (n13.t()) {
                            }
                        }
                    }
                }
                return true;
            }
            p096j9.f name119 = n10.getName();
            p210v8.i.e(name119, MediationMetaData.KEY_NAME);
            LinkedHashSet linkedHashSetK10 = K(name119);
            arrayList = new ArrayList();
            it = linkedHashSetK10.iterator();
            while (it.hasNext()) {
                interfaceC0285tA = C0445f.a((N) it.next());
                if (interfaceC0285tA != null) {
                    arrayList.add(interfaceC0285tA);
                }
            }
            if (arrayList.isEmpty()) {
                nD = D(n10);
                if (nD != null) {
                    p096j9.f name1110 = n10.getName();
                    p210v8.i.e(name1110, MediationMetaData.KEY_NAME);
                    linkedHashSetK = K(name1110);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r10.hasNext()) {
                            if (n13.t()) {
                            }
                        }
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (M(n10, (InterfaceC0285t) it2.next())) {
                }
            }
            nD = D(n10);
            if (nD != null) {
                p096j9.f name1111 = n10.getName();
                p210v8.i.e(name1111, MediationMetaData.KEY_NAME);
                linkedHashSetK = K(name1111);
                if (!linkedHashSetK.isEmpty()) {
                    while (r10.hasNext()) {
                        if (n13.t()) {
                        }
                    }
                }
            }
            return true;
        }
        it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (G((N) it3.next(), n11)) {
            }
        }
        int i17 = C0445f.f4971l;
        name = n10.getName();
        p210v8.i.e(name, MediationMetaData.KEY_NAME);
        if (!C0445f.b(name)) {
            nD = D(n10);
            if (nD != null) {
                p096j9.f name1112 = n10.getName();
                p210v8.i.e(name1112, MediationMetaData.KEY_NAME);
                linkedHashSetK = K(name1112);
                if (!linkedHashSetK.isEmpty()) {
                    while (r10.hasNext()) {
                        if (n13.t()) {
                        }
                    }
                }
            }
            return true;
        }
        p096j9.f name1113 = n10.getName();
        p210v8.i.e(name1113, MediationMetaData.KEY_NAME);
        LinkedHashSet linkedHashSetK11 = K(name1113);
        arrayList = new ArrayList();
        it = linkedHashSetK11.iterator();
        while (it.hasNext()) {
            interfaceC0285tA = C0445f.a((N) it.next());
            if (interfaceC0285tA != null) {
                arrayList.add(interfaceC0285tA);
            }
        }
        if (arrayList.isEmpty()) {
            nD = D(n10);
            if (nD != null) {
                p096j9.f name1114 = n10.getName();
                p210v8.i.e(name1114, MediationMetaData.KEY_NAME);
                linkedHashSetK = K(name1114);
                if (!linkedHashSetK.isEmpty()) {
                    while (r10.hasNext()) {
                        if (n13.t()) {
                        }
                    }
                }
            }
            return true;
        }
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (M(n10, (InterfaceC0285t) it2.next())) {
            }
        }
        nD = D(n10);
        if (nD != null) {
            p096j9.f name1115 = n10.getName();
            p210v8.i.e(name1115, MediationMetaData.KEY_NAME);
            linkedHashSetK = K(name1115);
            if (!linkedHashSetK.isEmpty()) {
                while (r10.hasNext()) {
                    if (n13.t()) {
                    }
                }
            }
        }
        return true;
        return false;
    }

    public final void O(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        p210v8.i.f((T8.a) ((I4.a) this.f5713b.f1659t).f2058n, "<this>");
        p210v8.i.f(this.f5786n, "scopeOwner");
    }

    @Override // t9.o, t9.p
    public final InterfaceC0273g a(p096j9.f fVar, T8.b bVar) {
        p247z9.j jVar;
        InterfaceC0271e interfaceC0271e;
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        O(fVar, bVar);
        p pVar = this.f5714c;
        return (pVar == null || (jVar = pVar.f5793u) == null || (interfaceC0271e = (InterfaceC0271e) jVar.invoke(fVar)) == null) ? (InterfaceC0273g) this.f5793u.invoke(fVar) : interfaceC0271e;
    }

    @Override // Y8.A, t9.o, t9.n
    public final Collection b(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        O(fVar, bVar);
        return super.b(fVar, bVar);
    }

    @Override // Y8.A, t9.o, t9.n
    public final Collection c(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        O(fVar, bVar);
        return super.c(fVar, bVar);
    }

    @Override // Y8.A
    public final Set h(t9.f fVar, t9.k kVar) {
        p210v8.i.f(fVar, "kindFilter");
        return p086i8.C.u((Set) this.f5790r.invoke(), ((Map) this.f5792t.invoke()).keySet());
    }

    @Override // Y8.A
    public final Set i(t9.f fVar, t9.k kVar) {
        p210v8.i.f(fVar, "kindFilter");
        InterfaceC0271e interfaceC0271e = this.f5786n;
        Collection collectionT = interfaceC0271e.I().t();
        p210v8.i.e(collectionT, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionT.iterator();
        while (it.hasNext()) {
            p086i8.q.J(linkedHashSet, ((AbstractC0151y) it.next()).E0().d());
        }
        p247z9.i iVar = this.f5716e;
        linkedHashSet.addAll(((InterfaceC0474c) iVar.invoke()).a());
        linkedHashSet.addAll(((InterfaceC0474c) iVar.invoke()).b());
        linkedHashSet.addAll(h(fVar, kVar));
        Fa.e eVar = this.f5713b;
        linkedHashSet.addAll(((p176r9.a) ((p176r9.e) ((I4.a) eVar.f1659t).f2068x)).e(eVar, interfaceC0271e));
        return linkedHashSet;
    }

    @Override // Y8.A
    public final void j(p096j9.f fVar, ArrayList arrayList) throws IllegalAccessException, InvocationTargetException {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        boolean zF = this.f5787o.f();
        InterfaceC0271e interfaceC0271e = this.f5786n;
        Fa.e eVar = this.f5713b;
        if (zF) {
            p247z9.i iVar = this.f5716e;
            if (((InterfaceC0474c) iVar.invoke()).f(fVar) != null) {
                if (arrayList.isEmpty()) {
                    R8.z zVarF = ((InterfaceC0474c) iVar.invoke()).f(fVar);
                    p210v8.i.c(zVarF);
                    X8.b bVarK = u0.k(eVar, zVarF);
                    p096j9.f fVarC = zVarF.c();
                    I4.a aVar = (I4.a) eVar.f1659t;
                    W8.f fVarO1 = W8.f.o1(interfaceC0271e, bVarK, fVarC, ((Q8.d) aVar.j).a(zVarF), true);
                    Z8.a aVarA = C8.E.A(2, false, null, 6);
                    AbstractC0151y abstractC0151yP = ((Y1.c) eVar.f1663x).P(zVarF.f(), aVarA);
                    O8.x xVarP = p();
                    p086i8.s sVar = p086i8.s.f12328s;
                    fVarO1.n1(null, xVarP, sVar, sVar, sVar, abstractC0151yP, 3, AbstractC0281o.f2822e, null);
                    fVarO1.f5365V = 1;
                    ((V8.h) aVar.f2052g).getClass();
                    arrayList.add(fVarO1);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((N) it.next()).H0().isEmpty()) {
                        }
                    }
                    R8.z zVarF2 = ((InterfaceC0474c) iVar.invoke()).f(fVar);
                    p210v8.i.c(zVarF2);
                    X8.b bVarK2 = u0.k(eVar, zVarF2);
                    p096j9.f fVarC2 = zVarF2.c();
                    I4.a aVar2 = (I4.a) eVar.f1659t;
                    W8.f fVarO2 = W8.f.o1(interfaceC0271e, bVarK2, fVarC2, ((Q8.d) aVar2.j).a(zVarF2), true);
                    Z8.a aVarA2 = C8.E.A(2, false, null, 6);
                    AbstractC0151y abstractC0151yP2 = ((Y1.c) eVar.f1663x).P(zVarF2.f(), aVarA2);
                    O8.x xVarP2 = p();
                    p086i8.s sVar2 = p086i8.s.f12328s;
                    fVarO2.n1(null, xVarP2, sVar2, sVar2, sVar2, abstractC0151yP2, 3, AbstractC0281o.f2822e, null);
                    fVarO2.f5365V = 1;
                    ((V8.h) aVar2.f2052g).getClass();
                    arrayList.add(fVarO2);
                }
            }
        }
        ((p176r9.a) ((p176r9.e) ((I4.a) eVar.f1659t).f2068x)).b(eVar, interfaceC0271e, fVar, arrayList);
    }

    @Override // Y8.A
    public final InterfaceC0474c k() {
        return new C0472a(this.f5787o, k.f5772t);
    }

    @Override // Y8.A
    public final void m(LinkedHashSet linkedHashSet, p096j9.f fVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        LinkedHashSet linkedHashSetK = K(fVar);
        ArrayList arrayList = U8.F.a;
        if (!U8.F.j.contains(fVar)) {
            int i10 = C0445f.f4971l;
            if (!C0445f.b(fVar)) {
                if (!linkedHashSetK.isEmpty()) {
                    Iterator it = linkedHashSetK.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((InterfaceC0285t) it.next()).t()) {
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSetK) {
                    if (N((N) obj)) {
                        arrayList2.add(obj);
                    }
                }
                y(linkedHashSet, fVar, arrayList2, false);
                return;
            }
        }
        J9.i iVar = new J9.i();
        LinkedHashSet linkedHashSetW = Y.w(fVar, linkedHashSetK, p086i8.s.f12328s, this.f5786n, p220w9.j.a, ((B9.m) ((I4.a) this.f5713b.f1659t).f2065u).f795d);
        z(fVar, linkedHashSet, linkedHashSetW, linkedHashSet, new l(1, 0, this));
        z(fVar, linkedHashSet, linkedHashSetW, iVar, new l(1, 1, this));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetK) {
            if (N((N) obj2)) {
                arrayList3.add(obj2);
            }
        }
        y(linkedHashSet, fVar, p086i8.k.g0(arrayList3, iVar), true);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [h8.d, java.lang.Object] */
    @Override // Y8.A
    public final void n(p096j9.f fVar, ArrayList arrayList) {
        LinkedHashSet linkedHashSet;
        Set setW0;
        R8.w wVar;
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        boolean zIsAnnotation = this.f5787o.a.isAnnotation();
        Fa.e eVar = this.f5713b;
        if (zIsAnnotation && (wVar = (R8.w) p086i8.k.l0(((InterfaceC0474c) this.f5716e.invoke()).e(fVar))) != null) {
            W8.g gVarH1 = W8.g.h1(this.f5786n, u0.k(eVar, wVar), p068ga.d.F(wVar.e()), false, wVar.c(), ((Q8.d) ((I4.a) eVar.f1659t).j).a(wVar), false);
            L lF = p124m9.m.f(gVarH1, M8.g.a);
            gVarH1.d1(lF, null, null, null);
            p210v8.i.f(eVar, "<this>");
            AbstractC0151y abstractC0151yL = A.l(wVar, new Fa.e((I4.a) eVar.f1659t, new I.D(eVar, gVarH1, wVar, 0), eVar.f1661v));
            p086i8.s sVar = p086i8.s.f12328s;
            gVarH1.g1(abstractC0151yL, sVar, p(), null, sVar);
            lF.f3675E = abstractC0151yL;
            arrayList.add(gVarH1);
        }
        Set setL = L(fVar);
        if (setL.isEmpty()) {
            return;
        }
        J9.i iVar = new J9.i();
        AbstractCollection iVar2 = new J9.i();
        A(setL, arrayList, iVar, new m(this, 0));
        if (iVar.isEmpty()) {
            setW0 = p086i8.k.w0(setL);
        } else {
            if (iVar instanceof Set) {
                linkedHashSet = new LinkedHashSet();
                for (Object obj : setL) {
                    if (!iVar.contains(obj)) {
                        linkedHashSet.add(obj);
                    }
                }
            } else {
                linkedHashSet = new LinkedHashSet(setL);
                linkedHashSet.removeAll(iVar);
            }
            setW0 = linkedHashSet;
        }
        A(setW0, iVar2, null, new m(this, 1));
        LinkedHashSet linkedHashSetU = p086i8.C.u(setL, iVar2);
        I4.a aVar = (I4.a) eVar.f1659t;
        arrayList.addAll(Y.w(fVar, linkedHashSetU, arrayList, this.f5786n, (Q8.d) aVar.f2051f, ((B9.m) aVar.f2065u).f795d));
    }

    @Override // Y8.A
    public final Set o(t9.f fVar) {
        p210v8.i.f(fVar, "kindFilter");
        if (this.f5787o.a.isAnnotation()) {
            return d();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((InterfaceC0474c) this.f5716e.invoke()).c());
        Collection collectionT = this.f5786n.I().t();
        p210v8.i.e(collectionT, "ownerDescriptor.typeConstructor.supertypes");
        Iterator it = collectionT.iterator();
        while (it.hasNext()) {
            p086i8.q.J(linkedHashSet, ((AbstractC0151y) it.next()).E0().e());
        }
        return linkedHashSet;
    }

    @Override // Y8.A
    public final O8.x p() {
        InterfaceC0271e interfaceC0271e = this.f5786n;
        if (interfaceC0271e != null) {
            int i10 = p124m9.e.a;
            return interfaceC0271e.M0();
        }
        p124m9.e.a(0);
        throw null;
    }

    @Override // Y8.A
    public final InterfaceC0276j q() {
        return this.f5786n;
    }

    @Override // Y8.A
    public final boolean r(W8.f fVar) {
        if (this.f5787o.a.isAnnotation()) {
            return false;
        }
        return N(fVar);
    }

    @Override // Y8.A
    public final x s(R8.w wVar, ArrayList arrayList, AbstractC0151y abstractC0151y, List list) {
        p210v8.i.f(wVar, "method");
        ((V8.h) ((I4.a) this.f5713b.f1659t).f2050e).getClass();
        if (this.f5786n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new x(abstractC0151y, list, arrayList, list2);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Y8.A
    public final String toString() {
        return "Lazy Java member scope for " + this.f5787o.c();
    }

    public final void x(ArrayList arrayList, W8.b bVar, int i10, R8.w wVar, AbstractC0151y abstractC0151y, AbstractC0151y abstractC0151y2) {
        p009a9.a oVar;
        M8.f fVar = M8.g.a;
        p096j9.f fVarC = wVar.c();
        if (abstractC0151y == null) {
            b0.a(2);
            throw null;
        }
        d0 d0VarG = b0.g(abstractC0151y, false);
        Object defaultValue = wVar.a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = AbstractC0408c.a;
            if (Enum.class.isAssignableFrom(cls)) {
                oVar = new R8.s(null, (Enum) defaultValue);
            } else if (defaultValue instanceof Annotation) {
                oVar = new R8.f(null, (Annotation) defaultValue);
            } else if (defaultValue instanceof Object[]) {
                oVar = new R8.g(null, (Object[]) defaultValue);
            } else {
                oVar = defaultValue instanceof Class ? new R8.o(null, (Class) defaultValue) : new R8.u(null, defaultValue);
            }
        } else {
            oVar = null;
        }
        arrayList.add(new U(bVar, null, i10, fVar, fVarC, d0VarG, oVar != null, false, false, abstractC0151y2 != null ? b0.g(abstractC0151y2, false) : null, ((Q8.d) ((I4.a) this.f5713b.f1659t).j).a(wVar)));
    }

    public final void y(LinkedHashSet linkedHashSet, p096j9.f fVar, ArrayList arrayList, boolean z6) {
        I4.a aVar = (I4.a) this.f5713b.f1659t;
        LinkedHashSet<N> linkedHashSetW = Y.w(fVar, arrayList, linkedHashSet, this.f5786n, (Q8.d) aVar.f2051f, ((B9.m) aVar.f2065u).f795d);
        if (!z6) {
            linkedHashSet.addAll(linkedHashSetW);
            return;
        }
        ArrayList arrayListG0 = p086i8.k.g0(linkedHashSet, linkedHashSetW);
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(linkedHashSetW, 10));
        for (N nC : linkedHashSetW) {
            N n10 = (N) p086i8.C.m(nC);
            if (n10 != null) {
                nC = C(nC, n10, arrayListG0);
            }
            arrayList2.add(nC);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void z(p096j9.f fVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, p200u8.b bVar) {
        N nC;
        Object next;
        N n10;
        N nC2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            N n11 = (N) it.next();
            N n12 = (N) p086i8.C.l(n11);
            N n13 = null;
            if (n12 != null) {
                String strK = p086i8.C.k(n12);
                p210v8.i.c(strK);
                Iterator it2 = ((Collection) bVar.invoke(p096j9.f.j(strK))).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        nC = null;
                        break;
                    }
                    InterfaceC0284s interfaceC0284sY0 = ((N) it2.next()).y0();
                    interfaceC0284sY0.q(fVar);
                    interfaceC0284sY0.F();
                    interfaceC0284sY0.r();
                    InterfaceC0285t interfaceC0285tBuild = interfaceC0284sY0.build();
                    p210v8.i.c(interfaceC0285tBuild);
                    N n14 = (N) interfaceC0285tBuild;
                    if (G(n12, n14)) {
                        nC = C(n14, n12, linkedHashSet);
                        break;
                    }
                }
            } else {
                nC = null;
                break;
            }
            J9.l.b(abstractSet, nC);
            InterfaceC0285t interfaceC0285tA = C0445f.a(n11);
            if (interfaceC0285tA == 0) {
                nC2 = null;
            } else {
                p096j9.f name = ((AbstractC0359o) interfaceC0285tA).getName();
                p210v8.i.e(name, "overridden.name");
                Iterator it3 = ((Iterable) bVar.invoke(name)).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!M((N) next, interfaceC0285tA));
                N n15 = (N) next;
                if (n15 != null) {
                    InterfaceC0284s interfaceC0284sY1 = n15.y0();
                    List listH0 = interfaceC0285tA.H0();
                    p210v8.i.e(listH0, "overridden.valueParameters");
                    List list = listH0;
                    ArrayList arrayList = new ArrayList(p086i8.m.H(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((U) it4.next()).getType());
                    }
                    List listH1 = n15.H0();
                    p210v8.i.e(listH1, "override.valueParameters");
                    interfaceC0284sY1.g(xa.d.f(arrayList, listH1, interfaceC0285tA));
                    interfaceC0284sY1.F();
                    interfaceC0284sY1.r();
                    interfaceC0284sY1.B();
                    n10 = (N) interfaceC0284sY1.build();
                } else {
                    n10 = null;
                }
                if (n10 == null) {
                    nC2 = null;
                } else {
                    if (!N(n10)) {
                        n10 = null;
                    }
                    if (n10 != null) {
                        nC2 = C(n10, interfaceC0285tA, linkedHashSet);
                    } else {
                        nC2 = null;
                    }
                }
            }
            J9.l.b(abstractSet, nC2);
            if (n11.t()) {
                p096j9.f name2 = n11.getName();
                p210v8.i.e(name2, "descriptor.name");
                Iterator it5 = ((Iterable) bVar.invoke(name2)).iterator();
                while (it5.hasNext()) {
                    N nD = D((N) it5.next());
                    if (nD == null || !F(nD, n11)) {
                        nD = null;
                    }
                    if (nD != null) {
                        n13 = nD;
                        break;
                    }
                }
            }
            J9.l.b(abstractSet, n13);
        }
    }
}
