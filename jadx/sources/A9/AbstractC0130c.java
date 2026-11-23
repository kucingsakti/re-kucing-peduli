package A9;

import L8.InterfaceC0273g;
import L8.InterfaceC0274h;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: A9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0130c {
    public static final D A(D d3, D d8) {
        p210v8.i.f(d3, "<this>");
        p210v8.i.f(d8, "abbreviatedType");
        return j(d3) ? d3 : new C0128a(d3, d8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final d0 B(d0 d0Var, AbstractC0151y abstractC0151y) {
        p210v8.i.f(d0Var, "<this>");
        if (d0Var instanceof c0) {
            return B(((c0) d0Var).i(), abstractC0151y);
        }
        if (abstractC0151y == null || abstractC0151y.equals(d0Var)) {
            return d0Var;
        }
        if (d0Var instanceof D) {
            return new G((D) d0Var, abstractC0151y);
        }
        if (d0Var instanceof r) {
            return new C0146t((r) d0Var, abstractC0151y);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static final D b(AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, "<this>");
        d0 d0VarD0 = abstractC0151y.D0();
        D d3 = d0VarD0 instanceof D ? (D) d0VarD0 : null;
        if (d3 != null) {
            return d3;
        }
        throw new IllegalStateException(("This is should be simple type: " + abstractC0151y).toString());
    }

    public static final AbstractC0151y c(ArrayList arrayList, List list, I8.i iVar) {
        AbstractC0151y abstractC0151yI = new Z(new J(arrayList, 0)).i(3, (AbstractC0151y) p086i8.k.T(list));
        return abstractC0151yI == null ? iVar.m() : abstractC0151yI;
    }

    public static final D9.c d(D9.c cVar, HashSet hashSet) {
        D9.c cVarD;
        B9.e eVar = B9.e.f779t;
        O oJ = eVar.j(cVar);
        if (!hashSet.add(oJ)) {
            return null;
        }
        L8.P pS = B9.g.s(oJ);
        if (pS != null) {
            D9.c cVarN = qa.b.n(pS);
            D9.c cVarD2 = d(cVarN, hashSet);
            if (cVarD2 == null) {
                return null;
            }
            boolean z6 = B9.g.C(eVar.j(cVarN)) || ((cVarN instanceof D9.d) && B9.g.I((D9.d) cVarN));
            if ((cVarD2 instanceof D9.d) && B9.g.I((D9.d) cVarD2) && B9.g.H(cVar) && z6) {
                return eVar.b(cVarN);
            }
            return (!B9.g.H(cVarD2) && (cVar instanceof D9.d) && B9.g.F((D9.d) cVar)) ? eVar.b(cVarD2) : cVarD2;
        }
        if (B9.g.C(oJ)) {
            p210v8.i.f(cVar, "$receiver");
            if (!(cVar instanceof AbstractC0151y)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(cVar);
                sb.append(", ");
                throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, cVar.getClass(), sb).toString());
            }
            D dF = p124m9.g.f((AbstractC0151y) cVar);
            if (dF == null || (cVarD = d(dF, hashSet)) == null) {
                return null;
            }
            if (!B9.g.H(cVar)) {
                return cVarD;
            }
            if (!B9.g.H(cVarD) && (!(cVarD instanceof D9.d) || !B9.g.I((D9.d) cVarD))) {
                return eVar.b(cVarD);
            }
        }
        return cVar;
    }

    public static o1.m e(o1.m mVar, p238y9.q qVar, List list) {
        p210v8.i.f(qVar, "typeAliasDescriptor");
        List listU = qVar.f16126y.u();
        ArrayList arrayList = new ArrayList(p086i8.m.H(listU, 10));
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            arrayList.add(((L8.P) it.next()).c());
        }
        return new o1.m(mVar, qVar, list, p086i8.y.z(p086i8.k.z0(arrayList, list)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC0151y f(AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, "<this>");
        if (abstractC0151y instanceof c0) {
            return ((c0) abstractC0151y).a();
        }
        return null;
    }

    public static boolean g(N n10, D9.d dVar, AbstractC0130c abstractC0130c) {
        p210v8.i.f(dVar, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        B9.b bVar = n10.f344c;
        if ((bVar.A0(dVar) && !bVar.q0(dVar)) || bVar.a(dVar)) {
            return true;
        }
        n10.b();
        ArrayDeque arrayDeque = n10.f348g;
        p210v8.i.c(arrayDeque);
        J9.i iVar = n10.f349h;
        p210v8.i.c(iVar);
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            if (iVar.f2475t > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + dVar + ". Supertypes = " + p086i8.k.Z(iVar, null, null, null, null, 63)).toString());
            }
            D9.d dVar2 = (D9.d) arrayDeque.pop();
            p210v8.i.e(dVar2, "current");
            if (iVar.add(dVar2)) {
                boolean zQ0 = bVar.q0(dVar2);
                M m2 = M.f341c;
                AbstractC0130c abstractC0130c2 = zQ0 ? m2 : abstractC0130c;
                if (abstractC0130c2.equals(m2)) {
                    abstractC0130c2 = null;
                }
                if (abstractC0130c2 == null) {
                    continue;
                } else {
                    Iterator it = bVar.g0(bVar.h0(dVar2)).iterator();
                    while (it.hasNext()) {
                        D9.d dVarY = abstractC0130c2.y(n10, (D9.c) it.next());
                        if ((bVar.A0(dVarY) && !bVar.q0(dVarY)) || bVar.a(dVarY)) {
                            n10.a();
                            return true;
                        }
                        arrayDeque.add(dVarY);
                    }
                }
            }
        }
        n10.a();
        return false;
    }

    public static final d0 h(d0 d0Var, AbstractC0151y abstractC0151y) {
        p210v8.i.f(d0Var, "<this>");
        p210v8.i.f(abstractC0151y, "origin");
        return B(d0Var, f(abstractC0151y));
    }

    public static boolean i(N n10, D9.d dVar, D9.f fVar) {
        B9.b bVar = n10.f344c;
        if (bVar.i0(dVar)) {
            return true;
        }
        if (bVar.q0(dVar)) {
            return false;
        }
        if (n10.f343b) {
            bVar.w(dVar);
        }
        return bVar.e(bVar.h0(dVar), fVar);
    }

    public static final boolean j(AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, "<this>");
        d0 d0VarD0 = abstractC0151y.D0();
        if (d0VarD0 instanceof C9.f) {
            return true;
        }
        return (d0VarD0 instanceof r) && (((r) d0VarD0).O0() instanceof C9.f);
    }

    public static final boolean k(AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, "<this>");
        return abstractC0151y.D0() instanceof r;
    }

    public static final D l(AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, "<this>");
        d0 d0VarD0 = abstractC0151y.D0();
        if (d0VarD0 instanceof r) {
            return ((r) d0VarD0).f383t;
        }
        if (d0VarD0 instanceof D) {
            return (D) d0VarD0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final d0 m(d0 d0Var, boolean z6) {
        p210v8.i.f(d0Var, "<this>");
        C0141n c0141nP = C0133f.p(d0Var, z6);
        if (c0141nP != null) {
            return c0141nP;
        }
        D dN = n(d0Var);
        return dN != null ? dN : d0Var.G0(false);
    }

    public static final D n(d0 d0Var) {
        C0150x c0150x;
        O oD = d0Var.D();
        C0150x c0150x2 = oD instanceof C0150x ? (C0150x) oD : null;
        if (c0150x2 != null) {
            LinkedHashSet<AbstractC0151y> linkedHashSet = c0150x2.f392b;
            ArrayList arrayList = new ArrayList(p086i8.m.H(linkedHashSet, 10));
            boolean z6 = false;
            for (AbstractC0151y abstractC0151yM : linkedHashSet) {
                if (b0.e(abstractC0151yM)) {
                    abstractC0151yM = m(abstractC0151yM.D0(), false);
                    z6 = true;
                }
                arrayList.add(abstractC0151yM);
            }
            if (z6) {
                AbstractC0151y abstractC0151yM2 = c0150x2.a;
                if (abstractC0151yM2 == null) {
                    abstractC0151yM2 = null;
                } else if (b0.e(abstractC0151yM2)) {
                    abstractC0151yM2 = m(abstractC0151yM2.D0(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                c0150x = new C0150x(linkedHashSet2);
                c0150x.a = abstractC0151yM2;
            } else {
                c0150x = null;
            }
            if (c0150x != null) {
                return c0150x.b();
            }
        }
        return null;
    }

    public static final D o(D d3, List list, K k3) {
        p210v8.i.f(d3, "<this>");
        p210v8.i.f(list, "newArguments");
        p210v8.i.f(k3, "newAttributes");
        if (list.isEmpty() && k3 == d3.o()) {
            return d3;
        }
        if (list.isEmpty()) {
            return d3.N0(k3);
        }
        if (!(d3 instanceof C9.f)) {
            return C0133f.r(k3, d3.D(), list, d3.H());
        }
        C9.f fVar = (C9.f) d3;
        String[] strArr = fVar.f980y;
        return new C9.f(fVar.f975t, fVar.f976u, fVar.f977v, list, fVar.f979x, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static AbstractC0151y p(AbstractC0151y abstractC0151y, List list, M8.h hVar, int i10) {
        if ((i10 & 2) != 0) {
            hVar = abstractC0151y.q();
        }
        p210v8.i.f(abstractC0151y, "<this>");
        if ((list.isEmpty() || list == abstractC0151y.l()) && hVar == abstractC0151y.q()) {
            return abstractC0151y;
        }
        K kO = abstractC0151y.o();
        if ((hVar instanceof M8.l) && hVar.isEmpty()) {
            hVar = M8.g.a;
        }
        K kR = r(kO, hVar);
        d0 d0VarD0 = abstractC0151y.D0();
        if (d0VarD0 instanceof r) {
            r rVar = (r) d0VarD0;
            return C0133f.j(o(rVar.f383t, list, kR), o(rVar.f384u, list, kR));
        }
        if (d0VarD0 instanceof D) {
            return o((D) d0VarD0, list, kR);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ D q(D d3, List list, K k3, int i10) {
        if ((i10 & 1) != 0) {
            list = d3.l();
        }
        if ((i10 & 2) != 0) {
            k3 = d3.o();
        }
        return o(d3, list, k3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    public static final K r(K k3, M8.h hVar) {
        K kO;
        p210v8.i.f(k3, "<this>");
        if (AbstractC0137j.a(k3) == hVar) {
            return k3;
        }
        C8.u uVar = AbstractC0137j.a[0];
        G9.p pVar = AbstractC0137j.f374b;
        pVar.getClass();
        p210v8.i.f(uVar, "property");
        C0136i c0136i = (C0136i) k3.f1752s.get(pVar.a);
        if (c0136i != null) {
            if (k3.isEmpty()) {
                kO = k3;
            } else {
                G9.a aVar = k3.f1752s;
                ArrayList arrayList = new ArrayList();
                for (Object obj : aVar) {
                    if (!p210v8.i.a((C0136i) obj, c0136i)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == k3.f1752s.e()) {
                    kO = k3;
                } else {
                    K.f338t.getClass();
                    kO = o1.c.o(arrayList);
                }
            }
            if (kO != null) {
                k3 = kO;
            }
        }
        if (hVar.iterator().hasNext() || !hVar.isEmpty()) {
            C0136i c0136i2 = new C0136i(hVar);
            if (k3.f1752s.get(K.f338t.r(p210v8.u.a.b(C0136i.class))) == null) {
                return k3.isEmpty() ? new K(com.bumptech.glide.d.u(c0136i2)) : o1.c.o(p086i8.k.h0(p086i8.k.s0(k3), c0136i2));
            }
        }
        return k3;
    }

    public static final AbstractC0151y s(L8.P p10) {
        p210v8.i.f(p10, "<this>");
        InterfaceC0276j interfaceC0276jV = p10.v();
        p210v8.i.e(interfaceC0276jV, "this.containingDeclaration");
        if (interfaceC0276jV instanceof InterfaceC0274h) {
            List listU = ((InterfaceC0274h) interfaceC0276jV).I().u();
            p210v8.i.e(listU, "descriptor.typeConstructor.parameters");
            List list = listU;
            ArrayList arrayList = new ArrayList(p086i8.m.H(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                O oI = ((L8.P) it.next()).I();
                p210v8.i.e(oI, "it.typeConstructor");
                arrayList.add(oI);
            }
            List upperBounds = p10.getUpperBounds();
            p210v8.i.e(upperBounds, "upperBounds");
            return c(arrayList, upperBounds, p165q9.d.e(p10));
        }
        if (!(interfaceC0276jV instanceof InterfaceC0285t)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List listZ = ((InterfaceC0285t) interfaceC0276jV).z();
        p210v8.i.e(listZ, "descriptor.typeParameters");
        List list2 = listZ;
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            O oI2 = ((L8.P) it2.next()).I();
            p210v8.i.e(oI2, "it.typeConstructor");
            arrayList2.add(oI2);
        }
        List upperBounds2 = p10.getUpperBounds();
        p210v8.i.e(upperBounds2, "upperBounds");
        return c(arrayList2, upperBounds2, p165q9.d.e(p10));
    }

    public static boolean t(B9.b bVar, D9.d dVar, D9.d dVar2) {
        if (bVar.M(dVar) == bVar.M(dVar2) && bVar.q0(dVar) == bVar.q0(dVar2)) {
            if ((bVar.n(dVar) == null) == (bVar.n(dVar2) == null) && bVar.e(bVar.h0(dVar), bVar.h0(dVar2))) {
                if (!bVar.d0(dVar, dVar2)) {
                    int iM = bVar.M(dVar);
                    for (int i10 = 0; i10 < iM; i10++) {
                        S sH = bVar.h(dVar, i10);
                        S sH2 = bVar.h(dVar2, i10);
                        if (bVar.K(sH) == bVar.K(sH2) && (bVar.K(sH) || (bVar.m0(sH) == bVar.m0(sH2) && u(bVar, bVar.Q(sH), bVar.Q(sH2))))) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean u(B9.b bVar, D9.c cVar, D9.c cVar2) {
        if (cVar == cVar2) {
            return true;
        }
        D dU = bVar.U(cVar);
        D dU2 = bVar.U(cVar2);
        if (dU != null && dU2 != null) {
            return t(bVar, dU, dU2);
        }
        r rVarT = bVar.t(cVar);
        r rVarT2 = bVar.t(cVar2);
        return rVarT != null && rVarT2 != null && t(bVar, bVar.r0(rVarT), bVar.r0(rVarT2)) && t(bVar, bVar.G(rVarT), bVar.G(rVarT2));
    }

    public static Z v(List list, W w2, InterfaceC0276j interfaceC0276j, ArrayList arrayList) {
        if (w2 == null) {
            a(1);
            throw null;
        }
        if (interfaceC0276j == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        Z zW = w(list, w2, interfaceC0276j, arrayList, null);
        if (zW != null) {
            return zW;
        }
        throw new AssertionError("Substitution failed");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00bb  */
    public static Z w(List list, W w2, InterfaceC0276j interfaceC0276j, ArrayList arrayList, boolean[] zArr) {
        Z z6;
        if (w2 == null) {
            a(6);
            throw null;
        }
        if (interfaceC0276j == null) {
            a(7);
            throw null;
        }
        if (arrayList == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            L8.P p10 = (L8.P) it.next();
            O8.S sB1 = O8.S.b1(interfaceC0276j, p10.q(), p10.Y(), p10.j0(), p10.getName(), i10, p10.L());
            map.put(p10.I(), new T(1, sB1.p()));
            map2.put(p10, sB1);
            arrayList.add(sB1);
            i10++;
        }
        J j = new J(map, 1);
        Z zE = Z.e(w2, j);
        Z zE2 = Z.e(new V(w2, 0), j);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            L8.P p11 = (L8.P) it2.next();
            O8.S s9 = (O8.S) map2.get(p11);
            for (AbstractC0151y abstractC0151y : p11.getUpperBounds()) {
                InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
                if (interfaceC0273gW instanceof L8.P) {
                    L8.P p12 = (L8.P) interfaceC0273gW;
                    p210v8.i.f(p12, "typeParameter");
                    if (qa.b.p(p12, null, null)) {
                        z6 = zE;
                    } else {
                        z6 = zE2;
                    }
                } else {
                    z6 = zE2;
                }
                AbstractC0151y abstractC0151yI = z6.i(3, abstractC0151y);
                if (abstractC0151yI == null) {
                    return null;
                }
                if (abstractC0151yI != abstractC0151y && zArr != null) {
                    zArr[0] = true;
                }
                if (s9.f3686D) {
                    throw new IllegalStateException("Type parameter descriptor is already initialized: " + s9.d1());
                }
                if (!j(abstractC0151yI)) {
                    s9.f3685C.add(abstractC0151yI);
                }
            }
            if (s9.f3686D) {
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + s9.d1());
            }
            s9.f3686D = true;
        }
        return zE;
    }

    public static final K x(M8.h hVar) {
        p210v8.i.f(hVar, "<this>");
        if (hVar.isEmpty()) {
            K.f338t.getClass();
            return K.f339u;
        }
        o1.c cVar = K.f338t;
        List listU = com.bumptech.glide.d.u(new C0136i(hVar));
        cVar.getClass();
        return o1.c.o(listU);
    }

    public static final D z(AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, "<this>");
        d0 d0VarD0 = abstractC0151y.D0();
        if (d0VarD0 instanceof r) {
            return ((r) d0VarD0).f384u;
        }
        if (d0VarD0 instanceof D) {
            return (D) d0VarD0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract D9.d y(N n10, D9.c cVar);
}
