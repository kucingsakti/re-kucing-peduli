package K8;

import A0.r;
import A9.A;
import A9.B;
import A9.D;
import A9.W;
import A9.Z;
import C8.u;
import L8.AbstractC0281o;
import L8.AbstractC0287v;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.InterfaceC0284s;
import L8.InterfaceC0285t;
import O8.C;
import O8.C0355k;
import O8.C0357m;
import O8.C0365v;
import O8.N;
import O8.U;
import O8.w;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p047e9.C0632y;
import p086i8.s;
import p210v8.t;
import p210v8.v;

/* JADX INFO: loaded from: classes.dex */
public final class n implements N8.b, N8.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ u[] f2660g;
    public final C a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p247z9.i f2661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D f2662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p247z9.i f2663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p247z9.e f2664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p247z9.i f2665f;

    static {
        v vVar = p210v8.u.a;
        f2660g = new u[]{vVar.f(new p210v8.n(vVar.b(n.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), vVar.f(new p210v8.n(vVar.b(n.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), vVar.f(new p210v8.n(vVar.b(n.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public n(C c10, p247z9.l lVar, r rVar) {
        this.a = c10;
        this.f2661b = new p247z9.i(lVar, rVar);
        C0357m c0357m = new C0357m(new k(c10, new p096j9.c("java.io"), 0), p096j9.f.j("Serializable"), 4, 2, com.bumptech.glide.d.u(new B(lVar, new l(this, 0))), lVar);
        c0357m.l(t9.m.f15259b, p086i8.u.f12330s, null);
        this.f2662c = c0357m.p();
        this.f2663d = new p247z9.i(lVar, new A(this, 20, lVar));
        this.f2664e = new p247z9.e(lVar, new ConcurrentHashMap(3, 1.0f, 2), new p247z9.f(), 0);
        this.f2665f = new p247z9.i(lVar, new l(this, 1));
    }

    @Override // N8.d
    public final boolean a(InterfaceC0271e interfaceC0271e, p238y9.p pVar) {
        p210v8.i.f(interfaceC0271e, "classDescriptor");
        Y8.j jVarF = f(interfaceC0271e);
        if (jVarF == null || !pVar.q().E(N8.e.a)) {
            return true;
        }
        g().getClass();
        String strC = qa.b.c(pVar, 3);
        Y8.p pVarL = jVarF.l();
        p096j9.f name = pVar.getName();
        p210v8.i.e(name, "functionDescriptor.name");
        Collection collectionC = pVarL.c(name, T8.b.f4759s);
        if ((collectionC instanceof Collection) && collectionC.isEmpty()) {
            return false;
        }
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            if (qa.b.c((N) it.next(), 3).equals(strC)) {
                return true;
            }
        }
        return false;
    }

    @Override // N8.b
    public final Collection b(InterfaceC0271e interfaceC0271e) {
        Set setD;
        p210v8.i.f(interfaceC0271e, "classDescriptor");
        g().getClass();
        p086i8.u uVar = p086i8.u.f12330s;
        Y8.j jVarF = f(interfaceC0271e);
        return (jVarF == null || (setD = jVarF.l().d()) == null) ? uVar : setD;
    }

    @Override // N8.b
    public final Collection c(InterfaceC0271e interfaceC0271e) {
        boolean zIsAssignableFrom = true;
        p210v8.i.f(interfaceC0271e, "classDescriptor");
        p096j9.e eVarH = p165q9.d.h(interfaceC0271e);
        LinkedHashSet linkedHashSet = p.a;
        p096j9.e eVar = I8.n.f2170g;
        boolean z6 = eVarH.equals(eVar) || I8.n.c0.get(eVarH) != null;
        D d3 = this.f2662c;
        if (z6) {
            D d8 = (D) J7.j.o(this.f2663d, f2660g[1]);
            p210v8.i.e(d8, "cloneableType");
            return p086i8.l.C(d8, d3);
        }
        if (!eVarH.equals(eVar) && I8.n.c0.get(eVarH) == null) {
            String str = d.a;
            p096j9.b bVarF = d.f(eVarH);
            if (bVarF == null) {
                zIsAssignableFrom = false;
            } else {
                try {
                    zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(bVarF.b().b()));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
            }
        }
        return zIsAssignableFrom ? com.bumptech.glide.d.u(d3) : s.f12328s;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:101:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:102:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:107:0x0302  */
    /* JADX WARN: Code duplicated, block: B:110:0x0307  */
    /* JADX WARN: Code duplicated, block: B:120:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0123  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x023a  */
    /* JADX WARN: Code duplicated, block: B:84:0x023c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0258  */
    /* JADX WARN: Code duplicated, block: B:94:0x0273  */
    /* JADX WARN: Code duplicated, block: B:96:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:98:0x02df A[DONT_INVERT] */
    @Override // N8.b
    public final Collection d(p096j9.f fVar, InterfaceC0271e interfaceC0271e) throws Throwable {
        boolean z6;
        List listW;
        Object obj;
        N n10;
        InterfaceC0276j interfaceC0276jV;
        boolean zBooleanValue;
        boolean z10;
        ArrayList arrayList;
        InterfaceC0284s interfaceC0284sY0;
        int iOrdinal;
        boolean z11;
        N n11;
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(interfaceC0271e, "classDescriptor");
        boolean zEquals = fVar.equals(a.f2622e);
        List<N> list = s.f12328s;
        u[] uVarArr = f2660g;
        if (zEquals && (interfaceC0271e instanceof p238y9.g)) {
            p096j9.f fVar2 = I8.i.f2112e;
            if (I8.i.b(interfaceC0271e, I8.n.f2170g) || I8.i.r(interfaceC0271e) != null) {
                p238y9.g gVar = (p238y9.g) interfaceC0271e;
                List list2 = gVar.f16079w.f11107I;
                p210v8.i.e(list2, "classDescriptor.classProto.functionList");
                List list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (J7.a.i((p067g9.f) gVar.f16067D.f5172b, ((C0632y) it.next()).f11247x).equals(a.f2622e)) {
                            return list;
                        }
                    }
                }
                InterfaceC0284s interfaceC0284sY1 = ((N) p086i8.k.j0(((D) J7.j.o(this.f2663d, uVarArr[1])).E0().c(fVar, T8.b.f4759s))).y0();
                interfaceC0284sY1.m(gVar);
                interfaceC0284sY1.s(AbstractC0281o.f2822e);
                interfaceC0284sY1.d(gVar.p());
                interfaceC0284sY1.b(gVar.M0());
                InterfaceC0285t interfaceC0285tBuild = interfaceC0284sY1.build();
                p210v8.i.c(interfaceC0285tBuild);
                return com.bumptech.glide.d.u((N) interfaceC0285tBuild);
            }
        }
        g().getClass();
        m mVar = new m(fVar, 0);
        Y8.j jVarF = f(interfaceC0271e);
        if (jVarF != null) {
            p096j9.c cVarG = p165q9.d.g(jVarF);
            b bVar = b.f2623f;
            p210v8.i.f(bVar, "builtIns");
            InterfaceC0271e interfaceC0271eB = e.b(cVarG, bVar);
            if (interfaceC0271eB == null) {
                listW = p086i8.u.f12330s;
                z6 = false;
            } else {
                String str = d.a;
                z6 = false;
                p096j9.c cVar = (p096j9.c) d.f2634k.get(p165q9.d.h(interfaceC0271eB));
                listW = cVar == null ? p086i8.C.w(interfaceC0271eB) : p086i8.l.C(interfaceC0271eB, bVar.i(cVar));
            }
            Iterable iterable = listW;
            if (iterable instanceof List) {
                List list4 = (List) iterable;
                if (list4.isEmpty()) {
                    obj = null;
                } else {
                    obj = list4.get(list4.size() - 1);
                }
            } else {
                Iterator it2 = iterable.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = it2.next();
                    }
                    obj = next;
                } else {
                    obj = null;
                }
            }
            InterfaceC0271e interfaceC0271e2 = (InterfaceC0271e) obj;
            if (interfaceC0271e2 != null) {
                int i10 = J9.i.f2473u;
                ArrayList arrayList2 = new ArrayList(p086i8.m.H(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(p165q9.d.g((InterfaceC0271e) it3.next()));
                }
                J9.i iVar = new J9.i();
                iVar.addAll(arrayList2);
                String str2 = d.a;
                boolean zContainsKey = d.j.containsKey(p124m9.e.g(interfaceC0271e));
                p096j9.c cVarG2 = p165q9.d.g(jVarF);
                n10 = null;
                A a = new A(jVarF, 21, interfaceC0271e2);
                p247z9.e eVar = this.f2664e;
                eVar.getClass();
                Object objInvoke = eVar.invoke(new p247z9.g(cVarG2, a));
                if (objInvoke == null) {
                    p247z9.e.a(3);
                    throw null;
                }
                t9.n nVarZ0 = ((InterfaceC0271e) objInvoke).z0();
                p210v8.i.e(nVarZ0, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
                Iterable iterable2 = (Iterable) mVar.invoke(nVarZ0);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : iterable2) {
                    N n12 = (N) obj2;
                    if (n12.V() == 1 && n12.f().a.f2816t && !I8.i.C(n12)) {
                        Collection collectionX = n12.x();
                        if ((collectionX instanceof Collection) && collectionX.isEmpty()) {
                            interfaceC0276jV = n12.v();
                            p210v8.i.d(interfaceC0276jV, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            if (p.f2671d.contains(oa.b.n((InterfaceC0271e) interfaceC0276jV, qa.b.c(n12, 3))) ^ zContainsKey) {
                                zBooleanValue = true;
                            } else {
                                Boolean boolI = J9.l.i(com.bumptech.glide.d.u(n12), e.f2638s, new A0.m(this, 10));
                                p210v8.i.e(boolI, "private fun SimpleFuncti…scriptor)\n        }\n    }");
                                zBooleanValue = boolI.booleanValue();
                            }
                            if (zBooleanValue) {
                                z10 = z6;
                            } else {
                                z10 = true;
                            }
                        } else {
                            Iterator it4 = collectionX.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    InterfaceC0276j interfaceC0276jV2 = ((InterfaceC0285t) it4.next()).v();
                                    p210v8.i.e(interfaceC0276jV2, "it.containingDeclaration");
                                    if (iVar.contains(p165q9.d.g(interfaceC0276jV2))) {
                                    }
                                } else {
                                    interfaceC0276jV = n12.v();
                                    p210v8.i.d(interfaceC0276jV, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                    if (p.f2671d.contains(oa.b.n((InterfaceC0271e) interfaceC0276jV, qa.b.c(n12, 3))) ^ zContainsKey) {
                                        zBooleanValue = true;
                                    } else {
                                        Boolean boolI2 = J9.l.i(com.bumptech.glide.d.u(n12), e.f2638s, new A0.m(this, 10));
                                        p210v8.i.e(boolI2, "private fun SimpleFuncti…scriptor)\n        }\n    }");
                                        zBooleanValue = boolI2.booleanValue();
                                    }
                                    if (zBooleanValue) {
                                        z10 = true;
                                    }
                                }
                                z10 = z6;
                            }
                        }
                    } else {
                        z10 = z6;
                    }
                    if (z10) {
                        arrayList3.add(obj2);
                    }
                }
                list = arrayList3;
            }
            arrayList = new ArrayList();
            for (N n13 : list) {
                InterfaceC0276j interfaceC0276jV3 = n13.v();
                p210v8.i.d(interfaceC0276jV3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                InterfaceC0285t interfaceC0285tJ = n13.j(new Z(xa.d.i((InterfaceC0271e) interfaceC0276jV3, interfaceC0271e)));
                p210v8.i.d(interfaceC0285tJ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
                interfaceC0284sY0 = ((N) interfaceC0285tJ).y0();
                interfaceC0284sY0.m(interfaceC0271e);
                interfaceC0284sY0.b(interfaceC0271e.M0());
                interfaceC0284sY0.r();
                InterfaceC0276j interfaceC0276jV4 = n13.v();
                p210v8.i.d(interfaceC0276jV4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Object objF = J9.l.f(com.bumptech.glide.d.u((InterfaceC0271e) interfaceC0276jV4), new p040e1.j(this, 17), new J9.a(qa.b.c(n13, 3), new t(), 1));
                p210v8.i.e(objF, "jvmDescriptor = computeJ…CONSIDERED\n            })");
                iOrdinal = ((j) objF).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 2) {
                        interfaceC0284sY0.e((M8.h) J7.j.o(this.f2665f, uVarArr[2]));
                    } else if (iOrdinal != 3) {
                        n11 = n10;
                    }
                    InterfaceC0285t interfaceC0285tBuild2 = interfaceC0284sY0.build();
                    p210v8.i.c(interfaceC0285tBuild2);
                    n11 = (N) interfaceC0285tBuild2;
                } else {
                    if (interfaceC0271e.m() == 1 || interfaceC0271e.M() == 3) {
                        z11 = z6;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        n11 = n10;
                    } else {
                        interfaceC0284sY0.C();
                        InterfaceC0285t interfaceC0285tBuild3 = interfaceC0284sY0.build();
                        p210v8.i.c(interfaceC0285tBuild3);
                        n11 = (N) interfaceC0285tBuild3;
                    }
                }
                if (n11 != null) {
                    arrayList.add(n11);
                }
            }
            return arrayList;
        }
        z6 = false;
        n10 = null;
        arrayList = new ArrayList();
        while (r3.hasNext()) {
            InterfaceC0276j interfaceC0276jV5 = n13.v();
            p210v8.i.d(interfaceC0276jV5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC0285t interfaceC0285tJ2 = n13.j(new Z(xa.d.i((InterfaceC0271e) interfaceC0276jV5, interfaceC0271e)));
            p210v8.i.d(interfaceC0285tJ2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            interfaceC0284sY0 = ((N) interfaceC0285tJ2).y0();
            interfaceC0284sY0.m(interfaceC0271e);
            interfaceC0284sY0.b(interfaceC0271e.M0());
            interfaceC0284sY0.r();
            InterfaceC0276j interfaceC0276jV6 = n13.v();
            p210v8.i.d(interfaceC0276jV6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Object objF2 = J9.l.f(com.bumptech.glide.d.u((InterfaceC0271e) interfaceC0276jV6), new p040e1.j(this, 17), new J9.a(qa.b.c(n13, 3), new t(), 1));
            p210v8.i.e(objF2, "jvmDescriptor = computeJ…CONSIDERED\n            })");
            iOrdinal = ((j) objF2).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    interfaceC0284sY0.e((M8.h) J7.j.o(this.f2665f, uVarArr[2]));
                } else if (iOrdinal != 3) {
                    n11 = n10;
                }
                InterfaceC0285t interfaceC0285tBuild4 = interfaceC0284sY0.build();
                p210v8.i.c(interfaceC0285tBuild4);
                n11 = (N) interfaceC0285tBuild4;
            } else {
                if (interfaceC0271e.m() == 1) {
                    z11 = z6;
                } else {
                    z11 = z6;
                }
                if (z11) {
                    n11 = n10;
                } else {
                    interfaceC0284sY0.C();
                    InterfaceC0285t interfaceC0285tBuild5 = interfaceC0284sY0.build();
                    p210v8.i.c(interfaceC0285tBuild5);
                    n11 = (N) interfaceC0285tBuild5;
                }
            }
            if (n11 != null) {
                arrayList.add(n11);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [i8.s] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    @Override // N8.b
    public final Collection e(InterfaceC0271e interfaceC0271e) {
        InterfaceC0271e interfaceC0271eB;
        p210v8.i.f(interfaceC0271e, "classDescriptor");
        int iM = interfaceC0271e.M();
        ?? arrayList = s.f12328s;
        if (iM == 1) {
            g().getClass();
            Y8.j jVarF = f(interfaceC0271e);
            if (jVarF != null && (interfaceC0271eB = e.b(p165q9.d.g(jVarF), b.f2623f)) != null) {
                Z z6 = new Z(xa.d.i(interfaceC0271eB, jVarF));
                List list = (List) jVarF.f5764I.f5789q.invoke();
                ArrayList<C0355k> arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    C0355k c0355k = (C0355k) next;
                    C0355k c0355k2 = c0355k;
                    if (c0355k2.f().a.f2816t) {
                        Collection collectionN = interfaceC0271eB.n();
                        p210v8.i.e(collectionN, "defaultKotlinVersion.constructors");
                        Collection collection = collectionN;
                        if (!(collection instanceof Collection) || !collection.isEmpty()) {
                            Iterator it2 = collection.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    C0355k c0355k3 = (C0355k) it2.next();
                                    p210v8.i.e(c0355k3, "it");
                                    if (p124m9.l.j(c0355k3, c0355k.j(z6)) == 1) {
                                    }
                                }
                            }
                        }
                        if (c0355k2.H0().size() == 1) {
                            List listH0 = c0355k2.H0();
                            p210v8.i.e(listH0, "valueParameters");
                            InterfaceC0273g interfaceC0273gW = ((U) p086i8.k.k0(listH0)).getType().D().w();
                            if (p210v8.i.a(interfaceC0273gW != null ? p165q9.d.h(interfaceC0273gW) : null, p165q9.d.h(interfaceC0271e))) {
                            }
                        }
                        if (!I8.i.C(c0355k) && !p.f2672e.contains(oa.b.n(jVarF, qa.b.c(c0355k, 3)))) {
                            arrayList2.add(next);
                        }
                    }
                }
                arrayList = new ArrayList(p086i8.m.H(arrayList2, 10));
                for (C0355k c0355k4 : arrayList2) {
                    C0355k c0355k5 = c0355k4;
                    c0355k5.getClass();
                    C0365v c0365vF1 = c0355k5.f1(Z.f355b);
                    c0365vF1.f3758t = interfaceC0271e;
                    c0365vF1.d(interfaceC0271e.p());
                    c0365vF1.f3748G = true;
                    W wF = z6.f();
                    if (wF == null) {
                        C0365v.a(37);
                        throw null;
                    }
                    c0365vF1.f3757s = wF;
                    if (!p.f2673f.contains(oa.b.n(jVarF, qa.b.c(c0355k4, 3)))) {
                        c0365vF1.e((M8.h) J7.j.o(this.f2665f, f2660g[2]));
                    }
                    w wVarC1 = c0365vF1.P.c1(c0365vF1);
                    p210v8.i.d(wVarC1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                    arrayList.add((C0355k) wVarC1);
                }
            }
        }
        return arrayList;
    }

    public final Y8.j f(InterfaceC0271e interfaceC0271e) {
        if (interfaceC0271e == null) {
            I8.i.a(108);
            throw null;
        }
        p096j9.f fVar = I8.i.f2112e;
        if (!I8.i.b(interfaceC0271e, I8.n.a) && I8.i.I(interfaceC0271e)) {
            p096j9.e eVarH = p165q9.d.h(interfaceC0271e);
            if (eVarH.d()) {
                String str = d.a;
                p096j9.b bVarF = d.f(eVarH);
                if (bVarF != null) {
                    InterfaceC0271e interfaceC0271eJ = AbstractC0287v.j(g().a, bVarF.b());
                    if (interfaceC0271eJ instanceof Y8.j) {
                        return (Y8.j) interfaceC0271eJ;
                    }
                }
            }
        }
        return null;
    }

    public final h g() {
        return (h) J7.j.o(this.f2661b, f2660g[0]);
    }
}
