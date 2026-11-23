package A9;

import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import O8.C0349e;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: A9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0133f {
    public static final C0133f a = new C0133f();

    public static final boolean b(B9.b bVar, D9.d dVar) {
        if (bVar.u(dVar)) {
            return true;
        }
        if (!(dVar instanceof D9.b)) {
            return false;
        }
        S sC = bVar.C(bVar.r((D9.b) dVar));
        return !bVar.K(sC) && bVar.u(bVar.u0(bVar.Q(sC)));
    }

    public static final boolean c(B9.b bVar, N n10, D9.d dVar, D9.d dVar2, boolean z6) {
        Set<D9.c> setI = bVar.i(dVar);
        if ((setI instanceof Collection) && setI.isEmpty()) {
            return false;
        }
        for (D9.c cVar : setI) {
            if (p210v8.i.a(bVar.j(cVar), bVar.h0(dVar2))) {
                return true;
            }
            if (z6 && n(a, n10, dVar2, cVar)) {
                return true;
            }
        }
        return false;
    }

    public static List d(N n10, D9.d dVar, D9.f fVar) {
        AbstractC0130c abstractC0130cD;
        B9.b bVar = n10.f344c;
        bVar.g(dVar, fVar);
        boolean zK = bVar.k(fVar);
        p086i8.s sVar = p086i8.s.f12328s;
        if (zK || !bVar.A0(dVar)) {
            if (!bVar.l(fVar)) {
                J9.g gVar = new J9.g();
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
                        D9.d dVarS = bVar.S(dVar2);
                        if (dVarS == null) {
                            dVarS = dVar2;
                        }
                        boolean zE = bVar.e(bVar.h0(dVarS), fVar);
                        M m2 = M.f341c;
                        if (zE) {
                            gVar.add(dVarS);
                            abstractC0130cD = m2;
                        } else {
                            abstractC0130cD = bVar.M(dVarS) == 0 ? M.f340b : bVar.d(dVarS);
                        }
                        if (abstractC0130cD.equals(m2)) {
                            abstractC0130cD = null;
                        }
                        if (abstractC0130cD != null) {
                            Iterator it = bVar.g0(bVar.h0(dVar2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(abstractC0130cD.y(n10, (D9.c) it.next()));
                            }
                        }
                    }
                }
                n10.a();
                return gVar;
            }
            if (bVar.e(bVar.h0(dVar), fVar)) {
                D dS = bVar.S(dVar);
                if (dS != null) {
                    dVar = dS;
                }
                return com.bumptech.glide.d.u(dVar);
            }
        }
        return sVar;
    }

    public static List e(N n10, D9.d dVar, D9.f fVar) {
        List listD = d(n10, dVar, fVar);
        if (listD.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD) {
                B9.b bVar = n10.f344c;
                D9.e eVarO = bVar.O((D9.d) obj);
                int iA = bVar.A(eVarO);
                int i10 = 0;
                while (true) {
                    if (i10 >= iA) {
                        arrayList.add(obj);
                        break;
                    }
                    if (bVar.t(bVar.Q(bVar.q(eVarO, i10))) != null) {
                        break;
                    }
                    i10++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listD;
    }

    public static boolean g(N n10, D9.c cVar, D9.c cVar2) {
        p210v8.i.f(cVar, R5.a.PUSH_ADDITIONAL_DATA_KEY);
        p210v8.i.f(cVar2, "b");
        if (cVar == cVar2) {
            return true;
        }
        C0133f c0133f = a;
        B9.b bVar = n10.f344c;
        if (l(bVar, cVar) && l(bVar, cVar2)) {
            d0 d0VarC = n10.c(n10.d(cVar));
            d0 d0VarC2 = n10.c(n10.d(cVar2));
            D dO = bVar.o(d0VarC);
            if (!bVar.e(bVar.j(d0VarC), bVar.j(d0VarC2))) {
                return false;
            }
            if (bVar.M(dO) == 0) {
                return bVar.f0(d0VarC) || bVar.f0(d0VarC2) || bVar.q0(dO) == bVar.q0(bVar.o(d0VarC2));
            }
        }
        return n(c0133f, n10, cVar, cVar2) && n(c0133f, n10, cVar2, cVar);
    }

    public static final d0 j(D d3, D d8) {
        p210v8.i.f(d3, "lowerBound");
        p210v8.i.f(d8, "upperBound");
        return d3.equals(d8) ? d3 : new C0145s(d3, d8);
    }

    public static L8.P k(B9.b bVar, D9.c cVar, D9.d dVar) {
        d0 d0VarQ;
        int iM = bVar.M(cVar);
        int i10 = 0;
        while (true) {
            if (i10 >= iM) {
                return null;
            }
            S sH = bVar.h(cVar, i10);
            S s9 = bVar.K(sH) ? null : sH;
            if (s9 != null && (d0VarQ = bVar.Q(s9)) != null) {
                boolean z6 = bVar.P(bVar.J(bVar.o(d0VarQ))) && bVar.P(bVar.J(bVar.o(dVar)));
                if (d0VarQ.equals(dVar) || (z6 && p210v8.i.a(bVar.j(d0VarQ), bVar.j(dVar)))) {
                    return bVar.p(bVar.j(cVar), i10);
                }
                L8.P pK = k(bVar, d0VarQ, dVar);
                if (pK != null) {
                    return pK;
                }
            }
            i10++;
        }
    }

    public static boolean l(B9.b bVar, D9.c cVar) {
        if (!bVar.z0(bVar.j(cVar))) {
            return false;
        }
        bVar.W(cVar);
        return (bVar.a(cVar) || bVar.s0(cVar) || !p210v8.i.a(bVar.h0(bVar.o(cVar)), bVar.h0(bVar.u0(cVar)))) ? false : true;
    }

    public static boolean m(N n10, D9.e eVar, D9.d dVar) {
        boolean zN;
        p210v8.i.f(eVar, "capturedSubArguments");
        B9.b bVar = n10.f344c;
        O oH0 = bVar.h0(dVar);
        int iA = bVar.A(eVar);
        int iL = bVar.L(oH0);
        if (iA == iL && iA == bVar.M(dVar)) {
            for (int i10 = 0; i10 < iL; i10++) {
                S sH = bVar.h(dVar, i10);
                if (!bVar.K(sH)) {
                    d0 d0VarQ = bVar.Q(sH);
                    S sQ = bVar.q(eVar, i10);
                    bVar.m0(sQ);
                    d0 d0VarQ2 = bVar.Q(sQ);
                    int iR = bVar.R(bVar.p(oH0, i10));
                    int iM0 = bVar.m0(sH);
                    AbstractC0487g.p(iR, "declared");
                    AbstractC0487g.p(iM0, "useSite");
                    if (iR == 3) {
                        iR = iM0;
                    } else if (iM0 != 3 && iR != iM0) {
                        iR = 0;
                    }
                    if (iR == 0) {
                        return n10.a;
                    }
                    C0133f c0133f = a;
                    if (iR == 3) {
                        o(bVar, d0VarQ2, d0VarQ);
                        o(bVar, d0VarQ, d0VarQ2);
                    }
                    int i11 = n10.f347f;
                    if (i11 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + d0VarQ2).toString());
                    }
                    n10.f347f = i11 + 1;
                    int iD = p239z.e.d(iR);
                    if (iD == 0) {
                        zN = n(c0133f, n10, d0VarQ, d0VarQ2);
                    } else if (iD == 1) {
                        zN = n(c0133f, n10, d0VarQ2, d0VarQ);
                    } else {
                        if (iD != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zN = g(n10, d0VarQ2, d0VarQ);
                    }
                    n10.f347f--;
                    if (!zN) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0269  */
    /* JADX WARN: Code duplicated, block: B:166:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:220:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:223:0x040d  */
    /* JADX WARN: Code duplicated, block: B:227:0x0418  */
    /* JADX WARN: Code duplicated, block: B:229:0x041b  */
    /* JADX WARN: Code duplicated, block: B:231:0x042d  */
    /* JADX WARN: Code duplicated, block: B:236:0x043e  */
    /* JADX WARN: Code duplicated, block: B:238:0x0441  */
    /* JADX WARN: Code duplicated, block: B:241:0x0454  */
    /* JADX WARN: Code duplicated, block: B:243:0x0460  */
    /* JADX WARN: Code duplicated, block: B:246:0x0468  */
    /* JADX WARN: Code duplicated, block: B:261:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:263:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:265:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:267:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:271:0x0501  */
    /* JADX WARN: Code duplicated, block: B:274:0x0517  */
    /* JADX WARN: Code duplicated, block: B:276:0x051d  */
    /* JADX WARN: Code duplicated, block: B:278:0x052c  */
    /* JADX WARN: Code duplicated, block: B:280:0x0532  */
    /* JADX WARN: Code duplicated, block: B:281:0x0534  */
    /* JADX WARN: Code duplicated, block: B:285:0x053c  */
    /* JADX WARN: Code duplicated, block: B:291:0x0552  */
    /* JADX WARN: Code duplicated, block: B:295:0x056c A[LOOP:6: B:289:0x054c->B:295:0x056c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:311:0x040e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0477 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x04aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0575 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0540 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x0566 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0511 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:344:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:? A[LOOP:11: B:38:0x00b2->B:346:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:? A[LOOP:12: B:54:0x00f1->B:349:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    /* JADX WARN: Code duplicated, block: B:61:0x0108  */
    /* JADX WARN: Code duplicated, block: B:64:0x0115  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [B9.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static boolean n(C0133f c0133f, N n10, D9.c cVar, D9.c cVar2) {
        Boolean boolValueOf;
        Boolean bool;
        boolean z6;
        List listD;
        M m2;
        ArrayList<D9.d> arrayList;
        int i10;
        int size;
        O oH0;
        ArrayDeque arrayDeque;
        J9.i iVar;
        D9.d dVar;
        M m10;
        Iterator it;
        D9.d dVarY;
        D9.a aVar;
        int iL;
        boolean z10;
        boolean z11;
        ?? r10;
        boolean z12;
        S sI;
        d0 d0VarQ;
        D dU;
        D dV;
        O oH1;
        O oH2;
        L8.P pK;
        Collection collectionG0;
        Iterator it2;
        Collection collectionG1;
        Iterator it3;
        boolean z13;
        c0133f.getClass();
        p210v8.i.f(cVar, "subType");
        p210v8.i.f(cVar2, "superType");
        if (cVar == cVar2) {
            return true;
        }
        n10.getClass();
        boolean z14 = false;
        d0 d0VarC = n10.c(n10.d(cVar));
        d0 d0VarC2 = n10.c(n10.d(cVar2));
        ?? r11 = n10.f344c;
        D dO = r11.o(d0VarC);
        D dU0 = r11.u0(d0VarC2);
        boolean zF = r11.f(dO);
        C0133f c0133f2 = a;
        if (!zF && !r11.f(dU0)) {
            r11.v0(dO);
            r11.w(dO);
            r11.w(dU0);
            C0141n c0141nN = r11.n(dU0);
            if (c0141nN == null || (dV = r11.v(c0141nN)) == null) {
                dV = dU0;
            }
            D9.b bVarE0 = r11.e0(dV);
            D9.c cVarS = bVarE0 != null ? r11.s(bVarE0) : null;
            if (bVarE0 == null || cVarS == null) {
                oH1 = r11.h0(dU0);
                if (r11.m(oH1)) {
                    r11.q0(dU0);
                    collectionG1 = r11.g0(oH1);
                    if (!(collectionG1 instanceof Collection) && collectionG1.isEmpty()) {
                        z13 = true;
                        break;
                    }
                    it3 = collectionG1.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z13 = true;
                            break;
                        }
                        if (!n(c0133f2, n10, dO, (D9.c) it3.next())) {
                            z13 = false;
                            break;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z13);
                } else {
                    oH2 = r11.h0(dO);
                    if (dO instanceof D9.b) {
                        pK = k(r11, dU0, dO);
                        if (pK == null && r11.b0(pK, r11.h0(dU0))) {
                            boolValueOf = Boolean.TRUE;
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        if (r11.m(oH2)) {
                            collectionG0 = r11.g0(oH2);
                            if ((collectionG0 instanceof Collection) || !collectionG0.isEmpty()) {
                                it2 = collectionG0.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        pK = k(r11, dU0, dO);
                                        if (pK == null) {
                                        }
                                    } else if (!(((D9.c) it2.next()) instanceof D9.b)) {
                                    }
                                }
                            } else {
                                pK = k(r11, dU0, dO);
                                if (pK == null) {
                                }
                            }
                        }
                        boolValueOf = null;
                    }
                }
            } else {
                if (r11.q0(dU0)) {
                    cVarS = r11.B(cVarS);
                } else if (r11.a(dU0)) {
                    cVarS = r11.V(cVarS);
                }
                if (n(c0133f2, n10, dO, cVarS)) {
                    boolValueOf = Boolean.TRUE;
                } else {
                    oH1 = r11.h0(dU0);
                    if (r11.m(oH1)) {
                        r11.q0(dU0);
                        collectionG1 = r11.g0(oH1);
                        if (!(collectionG1 instanceof Collection)) {
                            it3 = collectionG1.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z13 = true;
                                    break;
                                }
                                if (!n(c0133f2, n10, dO, (D9.c) it3.next())) {
                                    z13 = false;
                                    break;
                                }
                            }
                        } else {
                            it3 = collectionG1.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z13 = true;
                                    break;
                                }
                                if (!n(c0133f2, n10, dO, (D9.c) it3.next())) {
                                    z13 = false;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z13);
                    } else {
                        oH2 = r11.h0(dO);
                        if (dO instanceof D9.b) {
                            pK = k(r11, dU0, dO);
                            if (pK == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = null;
                            }
                        } else {
                            if (r11.m(oH2)) {
                                collectionG0 = r11.g0(oH2);
                                if (collectionG0 instanceof Collection) {
                                    it2 = collectionG0.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            pK = k(r11, dU0, dO);
                                            if (pK == null) {
                                            }
                                        } else if (!(((D9.c) it2.next()) instanceof D9.b)) {
                                        }
                                    }
                                } else {
                                    it2 = collectionG0.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            pK = k(r11, dU0, dO);
                                            if (pK == null) {
                                            }
                                        } else if (!(((D9.c) it2.next()) instanceof D9.b)) {
                                        }
                                    }
                                }
                            }
                            boolValueOf = null;
                        }
                    }
                }
            }
        } else if (n10.a) {
            boolValueOf = Boolean.TRUE;
        } else if (!r11.q0(dO) || r11.q0(dU0)) {
            D dY = r11.y(dO, false);
            D dY2 = r11.y(dU0, false);
            p210v8.i.f(r11, "context");
            p210v8.i.f(dY, R5.a.PUSH_ADDITIONAL_DATA_KEY);
            p210v8.i.f(dY2, "b");
            boolValueOf = Boolean.valueOf(AbstractC0130c.u(r11, dY, dY2));
        } else {
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        D9.d dVarO = r11.o(d0VarC);
        D dU1 = r11.u0(d0VarC2);
        boolean zQ0 = r11.q0(dU1);
        M m11 = M.f341c;
        M m12 = M.f340b;
        int i11 = 1000;
        if (!zQ0 && !r11.a(dVarO) && !r11.s0(dVarO) && ((!(dVarO instanceof D9.b) || !r11.n0((D9.b) dVarO)) && !AbstractC0130c.g(n10, dVarO, m12))) {
            if (r11.a(dU1) || AbstractC0130c.g(n10, dU1, M.f342d) || r11.A0(dVarO)) {
                return false;
            }
            O oH3 = r11.h0(dU1);
            p210v8.i.f(oH3, "end");
            if (!AbstractC0130c.i(n10, dVarO, oH3)) {
                n10.b();
                ArrayDeque arrayDeque2 = n10.f348g;
                p210v8.i.c(arrayDeque2);
                J9.i iVar2 = n10.f349h;
                p210v8.i.c(iVar2);
                arrayDeque2.push(dVarO);
                loop0: while (true) {
                    if (arrayDeque2.isEmpty()) {
                        n10.a();
                        return false;
                    }
                    if (iVar2.f2475t > i11) {
                        throw new IllegalStateException(("Too many supertypes for type: " + dVarO + ". Supertypes = " + p086i8.k.Z(iVar2, null, null, null, null, 63)).toString());
                    }
                    D9.d dVar2 = (D9.d) arrayDeque2.pop();
                    p210v8.i.e(dVar2, "current");
                    if (iVar2.add(dVar2)) {
                        M m13 = r11.q0(dVar2) ? m11 : m12;
                        if (m13.equals(m11)) {
                            m13 = null;
                        }
                        if (m13 != null) {
                            Iterator it4 = r11.g0(r11.h0(dVar2)).iterator();
                            while (it4.hasNext()) {
                                D9.d dVarY2 = m13.y(n10, (D9.c) it4.next());
                                if (AbstractC0130c.i(n10, dVarY2, oH3)) {
                                    n10.a();
                                    break loop0;
                                }
                                arrayDeque2.add(dVarY2);
                            }
                        }
                        i11 = 1000;
                    }
                }
            }
        }
        D dO2 = r11.o(dVarO);
        D dU2 = r11.u0(dU1);
        if (!r11.u(dO2) && !r11.u(dU2)) {
            bool = null;
        } else if (b(r11, dO2) && b(r11, dU2)) {
            bool = Boolean.TRUE;
        } else if (r11.u(dO2)) {
            if (c(r11, n10, dO2, dU2, false)) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
        } else if (r11.u(dU2)) {
            O oH4 = r11.h0(dO2);
            if (oH4 instanceof C0150x) {
                Collection collectionG2 = r11.g0(oH4);
                if (!(collectionG2 instanceof Collection) || !collectionG2.isEmpty()) {
                    Iterator it5 = collectionG2.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            D dU3 = r11.U((D9.c) it5.next());
                            if (dU3 != null && r11.u(dU3)) {
                            }
                        } else if (!c(r11, n10, dU2, dO2, true)) {
                            bool = null;
                        }
                    }
                } else if (!c(r11, n10, dU2, dO2, true)) {
                    bool = null;
                }
            } else if (!c(r11, n10, dU2, dO2, true)) {
                bool = null;
            }
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        O oH5 = r11.h0(dU1);
        if ((r11.e(r11.h0(dVarO), oH5) && r11.L(oH5) == 0) || r11.p0(r11.h0(dU1))) {
            return true;
        }
        p210v8.i.f(oH5, "superConstructor");
        if (!r11.A0(dVarO)) {
            if (r11.k(oH5) || r11.c0(oH5)) {
                J9.g<D9.d> gVar = new J9.g();
                n10.b();
                ArrayDeque arrayDeque3 = n10.f348g;
                p210v8.i.c(arrayDeque3);
                J9.i iVar3 = n10.f349h;
                p210v8.i.c(iVar3);
                arrayDeque3.push(dVarO);
                while (!arrayDeque3.isEmpty()) {
                    if (iVar3.f2475t > 1000) {
                        throw new IllegalStateException(("Too many supertypes for type: " + dVarO + ". Supertypes = " + p086i8.k.Z(iVar3, null, null, null, null, 63)).toString());
                    }
                    D9.d dVar3 = (D9.d) arrayDeque3.pop();
                    p210v8.i.e(dVar3, "current");
                    if (iVar3.add(dVar3)) {
                        if (r11.A0(dVar3)) {
                            gVar.add(dVar3);
                            m2 = m11;
                        } else {
                            m2 = m12;
                        }
                        if (m2.equals(m11)) {
                            m2 = null;
                        }
                        if (m2 != null) {
                            Iterator it6 = r11.g0(r11.h0(dVar3)).iterator();
                            while (it6.hasNext()) {
                                arrayDeque3.add(m2.y(n10, (D9.c) it6.next()));
                                z14 = z14;
                            }
                        }
                    }
                }
                z6 = z14;
                n10.a();
                ArrayList arrayList2 = new ArrayList();
                for (D9.d dVar4 : gVar) {
                    p210v8.i.e(dVar4, "it");
                    p086i8.q.J(arrayList2, e(n10, dVar4, oH5));
                }
                listD = arrayList2;
            } else {
                listD = d(n10, dVarO, oH5);
            }
            List<D9.d> list = listD;
            i10 = 10;
            arrayList = new ArrayList(p086i8.m.H(list, 10));
            for (D9.d dVar5 : list) {
                dU = r11.U(n10.c(dVar5));
                if (dU == null) {
                    dVar5 = dU;
                }
                arrayList.add(dVar5);
            }
            size = arrayList.size();
            if (size != 0) {
                oH0 = r11.h0(dVarO);
                if (r11.k(oH0)) {
                    return r11.Y(oH0);
                }
                if (r11.Y(r11.h0(dVarO))) {
                    return true;
                }
                n10.b();
                arrayDeque = n10.f348g;
                p210v8.i.c(arrayDeque);
                iVar = n10.f349h;
                p210v8.i.c(iVar);
                arrayDeque.push(dVarO);
                while (!arrayDeque.isEmpty()) {
                    if (iVar.f2475t <= 1000) {
                        throw new IllegalStateException(("Too many supertypes for type: " + dVarO + ". Supertypes = " + p086i8.k.Z(iVar, null, null, null, null, 63)).toString());
                    }
                    dVar = (D9.d) arrayDeque.pop();
                    p210v8.i.e(dVar, "current");
                    if (!iVar.add(dVar)) {
                        if (r11.A0(dVar)) {
                            m10 = m11;
                        } else {
                            m10 = m12;
                        }
                        if (m10.equals(m11)) {
                            m10 = null;
                        }
                        if (m10 == null) {
                            continue;
                        } else {
                            it = r11.g0(r11.h0(dVar)).iterator();
                            while (it.hasNext()) {
                                dVarY = m10.y(n10, (D9.c) it.next());
                                if (r11.Y(r11.h0(dVarY))) {
                                    n10.a();
                                    return true;
                                }
                                arrayDeque.add(dVarY);
                            }
                        }
                    }
                }
                n10.a();
                return z6;
            }
            if (size != 1) {
                return m(n10, r11.O((D9.d) p086i8.k.T(arrayList)), dU1);
            }
            aVar = new D9.a(r11.L(oH5));
            iL = r11.L(oH5);
            z10 = z6;
            z11 = z10;
            while (r10 < iL) {
                if (z11 && r11.R(r11.p(oH5, r10)) == 2) {
                    z12 = z6;
                } else {
                    z12 = true;
                }
                if (!z12) {
                    ArrayList arrayList3 = new ArrayList(p086i8.m.H(arrayList, i10));
                    for (D9.d dVar6 : arrayList) {
                        sI = r11.I(dVar6, r10);
                        if (sI == null) {
                            if (r11.m0(sI) != 3) {
                                sI = null;
                            }
                            if (sI == null && (d0VarQ = r11.Q(sI)) != null) {
                                arrayList3.add(d0VarQ);
                            }
                        }
                        throw new IllegalStateException(("Incorrect type: " + dVar6 + ", subType: " + dVarO + ", superType: " + dU1).toString());
                    }
                    aVar.add(r11.z(r11.D(arrayList3)));
                }
                i10 = 10;
                r10++;
                z11 = z12;
            }
            if (z11 && m(n10, aVar, dU1)) {
                r10 = z10;
                return true;
            }
            r10 = z10;
            r10 = z10;
            C0132e c0132e = new C0132e(arrayList, n10, r11, dU1, 0);
            L l4 = new L();
            c0132e.invoke(l4);
            return l4.a;
        }
        listD = e(n10, dVarO, oH5);
        z6 = false;
        List<D9.d> list2 = listD;
        i10 = 10;
        arrayList = new ArrayList(p086i8.m.H(list2, 10));
        while (r6.hasNext()) {
            dU = r11.U(n10.c(dVar5));
            if (dU == null) {
                dVar5 = dU;
            }
            arrayList.add(dVar5);
        }
        size = arrayList.size();
        if (size != 0) {
            oH0 = r11.h0(dVarO);
            if (r11.k(oH0)) {
                return r11.Y(oH0);
            }
            if (r11.Y(r11.h0(dVarO))) {
                return true;
            }
            n10.b();
            arrayDeque = n10.f348g;
            p210v8.i.c(arrayDeque);
            iVar = n10.f349h;
            p210v8.i.c(iVar);
            arrayDeque.push(dVarO);
            while (!arrayDeque.isEmpty()) {
                if (iVar.f2475t <= 1000) {
                    throw new IllegalStateException(("Too many supertypes for type: " + dVarO + ". Supertypes = " + p086i8.k.Z(iVar, null, null, null, null, 63)).toString());
                }
                dVar = (D9.d) arrayDeque.pop();
                p210v8.i.e(dVar, "current");
                if (!iVar.add(dVar)) {
                    if (r11.A0(dVar)) {
                        m10 = m11;
                    } else {
                        m10 = m12;
                    }
                    if (m10.equals(m11)) {
                        m10 = null;
                    }
                    if (m10 == null) {
                        continue;
                    } else {
                        it = r11.g0(r11.h0(dVar)).iterator();
                        while (it.hasNext()) {
                            dVarY = m10.y(n10, (D9.c) it.next());
                            if (r11.Y(r11.h0(dVarY))) {
                                n10.a();
                                return true;
                            }
                            arrayDeque.add(dVarY);
                        }
                    }
                }
            }
            n10.a();
            return z6;
        }
        if (size != 1) {
            return m(n10, r11.O((D9.d) p086i8.k.T(arrayList)), dU1);
        }
        aVar = new D9.a(r11.L(oH5));
        iL = r11.L(oH5);
        z10 = z6;
        z11 = z10;
        while (r10 < iL) {
            if (z11) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (!z12) {
                ArrayList arrayList4 = new ArrayList(p086i8.m.H(arrayList, i10));
                while (r12.hasNext()) {
                    sI = r11.I(dVar6, r10);
                    if (sI == null) {
                        if (r11.m0(sI) != 3) {
                            sI = null;
                        }
                        if (sI == null) {
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + dVar6 + ", subType: " + dVarO + ", superType: " + dU1).toString());
                }
                aVar.add(r11.z(r11.D(arrayList4)));
            }
            i10 = 10;
            r10++;
            z11 = z12;
        }
        if (z11) {
        }
        r10 = z10;
        r10 = z10;
        C0132e c0132e2 = new C0132e(arrayList, n10, r11, dU1, 0);
        L l10 = new L();
        c0132e2.invoke(l10);
        return l10.a;
    }

    public static void o(B9.b bVar, D9.c cVar, D9.c cVar2) {
        D9.e eVarU = bVar.U(cVar);
        if (eVarU instanceof D9.b) {
            D9.b bVar2 = (D9.b) eVarU;
            if (!bVar.B0(bVar2) && bVar.K(bVar.C(bVar.r(bVar2))) && bVar.H(bVar2) == 1) {
                bVar.j(cVar2);
            }
        }
    }

    public static C0141n p(d0 d0Var, boolean z6) {
        boolean zE;
        p210v8.i.f(d0Var, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        if (d0Var instanceof C0141n) {
            return (C0141n) d0Var;
        }
        d0Var.D();
        if ((d0Var.D().w() instanceof L8.P) || (d0Var instanceof B9.h)) {
            InterfaceC0273g interfaceC0273gW = d0Var.D().w();
            O8.S s9 = interfaceC0273gW instanceof O8.S ? (O8.S) interfaceC0273gW : null;
            zE = true;
            if (s9 == null || s9.f3686D) {
                zE = (z6 && (d0Var.D().w() instanceof L8.P)) ? b0.e(d0Var) : true ^ AbstractC0130c.g(B9.g.l(false, null, 24), AbstractC0130c.l(d0Var), M.f340b);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            return null;
        }
        if (d0Var instanceof r) {
            r rVar = (r) d0Var;
            p210v8.i.a(rVar.f383t.D(), rVar.f384u.D());
        }
        return new C0141n(AbstractC0130c.l(d0Var).G0(false), z6);
    }

    public static final D q(K k3, InterfaceC0271e interfaceC0271e, List list) {
        p210v8.i.f(k3, "attributes");
        p210v8.i.f(interfaceC0271e, "descriptor");
        p210v8.i.f(list, "arguments");
        O oI = interfaceC0271e.I();
        p210v8.i.e(oI, "descriptor.typeConstructor");
        return r(k3, oI, list, false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[PHI: r1
      0x0074: PHI (r1v11 t9.n) = (r1v10 t9.n), (r1v13 t9.n) binds: [B:33:0x0098, B:24:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    public static D r(K k3, O o10, List list, boolean z6) {
        t9.n nVarG;
        O8.B b3;
        t9.n nVarA;
        t9.n nVar;
        p210v8.i.f(k3, "attributes");
        p210v8.i.f(o10, "constructor");
        p210v8.i.f(list, "arguments");
        if (k3.isEmpty() && list.isEmpty() && !z6 && o10.w() != null) {
            InterfaceC0273g interfaceC0273gW = o10.w();
            p210v8.i.c(interfaceC0273gW);
            D dP = interfaceC0273gW.p();
            p210v8.i.e(dP, "constructor.declarationDescriptor!!.defaultType");
            return dP;
        }
        InterfaceC0273g interfaceC0273gW2 = o10.w();
        if (interfaceC0273gW2 instanceof L8.P) {
            nVarG = ((L8.P) interfaceC0273gW2).p().E0();
        } else {
            if (interfaceC0273gW2 instanceof InterfaceC0271e) {
                p165q9.d.i(p165q9.d.j(interfaceC0273gW2));
                B9.f fVar = B9.f.a;
                if (list.isEmpty()) {
                    InterfaceC0271e interfaceC0271e = (InterfaceC0271e) interfaceC0273gW2;
                    p210v8.i.f(interfaceC0271e, "<this>");
                    b3 = interfaceC0271e instanceof O8.B ? (O8.B) interfaceC0271e : null;
                    if (b3 == null || (nVarA = b3.b(fVar)) == null) {
                        nVarG = interfaceC0271e.z0();
                        p210v8.i.e(nVarG, "this.unsubstitutedMemberScope");
                    } else {
                        nVar = nVarA;
                    }
                } else {
                    InterfaceC0271e interfaceC0271e2 = (InterfaceC0271e) interfaceC0273gW2;
                    W wF = P.f350b.f(o10, list);
                    p210v8.i.f(interfaceC0271e2, "<this>");
                    b3 = interfaceC0271e2 instanceof O8.B ? (O8.B) interfaceC0271e2 : null;
                    if (b3 == null || (nVarA = b3.a(wF, fVar)) == null) {
                        nVarG = interfaceC0271e2.E(wF);
                        p210v8.i.e(nVarG, "this.getMemberScope(\n   …ubstitution\n            )");
                    } else {
                        nVar = nVarA;
                    }
                }
                return t(k3, o10, list, z6, nVar, new C0152z(k3, o10, list, z6));
            }
            if (interfaceC0273gW2 instanceof p238y9.q) {
                String str = ((p238y9.q) interfaceC0273gW2).getName().f12551s;
                p210v8.i.e(str, "descriptor.name.toString()");
                nVarG = C9.i.a(4, true, str);
            } else {
                if (!(o10 instanceof C0150x)) {
                    throw new IllegalStateException("Unsupported classifier: " + interfaceC0273gW2 + " for constructor: " + o10);
                }
                nVarG = qa.b.g("member scope for intersection type", ((C0150x) o10).f392b);
            }
        }
        nVar = nVarG;
        return t(k3, o10, list, z6, nVar, new C0152z(k3, o10, list, z6));
    }

    public static final D s(K k3, O o10, List list, t9.n nVar, boolean z6) {
        p210v8.i.f(k3, "attributes");
        p210v8.i.f(o10, "constructor");
        p210v8.i.f(list, "arguments");
        p210v8.i.f(nVar, "memberScope");
        E e10 = new E(o10, list, z6, nVar, new C0152z(k3, o10, list, nVar, z6));
        return k3.isEmpty() ? e10 : new F(e10, k3);
    }

    public static final D t(K k3, O o10, List list, boolean z6, t9.n nVar, p200u8.b bVar) {
        p210v8.i.f(k3, "attributes");
        p210v8.i.f(o10, "constructor");
        p210v8.i.f(list, "arguments");
        p210v8.i.f(nVar, "memberScope");
        E e10 = new E(o10, list, z6, nVar, bVar);
        return k3.isEmpty() ? e10 : new F(e10, k3);
    }

    public void a(M8.h hVar, M8.h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((M8.b) it.next()).a());
        }
        Iterator it2 = hVar2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((M8.b) it2.next()).a());
        }
    }

    public W f(O o10, List list) {
        p210v8.i.f(o10, "typeConstructor");
        p210v8.i.f(list, "arguments");
        List listU = o10.u();
        p210v8.i.e(listU, "typeConstructor.parameters");
        L8.P p10 = (L8.P) p086i8.k.c0(listU);
        if (p10 == null || !p10.X()) {
            return new C0147u((L8.P[]) listU.toArray(new L8.P[0]), (S[]) list.toArray(new S[0]), false);
        }
        List listU2 = o10.u();
        p210v8.i.e(listU2, "typeConstructor.parameters");
        List list2 = listU2;
        ArrayList arrayList = new ArrayList(p086i8.m.H(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((L8.P) it.next()).I());
        }
        return new J(p086i8.y.z(p086i8.k.z0(arrayList, list)), 1);
    }

    public D h(o1.m mVar, K k3, boolean z6, int i10, boolean z10) {
        K kO;
        p238y9.q qVar = (p238y9.q) mVar.f13642t;
        S sI = i(new T(1, qVar.b1()), mVar, null, i10);
        AbstractC0151y abstractC0151yB = sI.b();
        p210v8.i.e(abstractC0151yB, "expandedProjection.type");
        D dB = AbstractC0130c.b(abstractC0151yB);
        if (AbstractC0130c.j(dB)) {
            return dB;
        }
        sI.a();
        a(dB.q(), AbstractC0137j.a(k3));
        if (!AbstractC0130c.j(dB)) {
            if (AbstractC0130c.j(dB)) {
                kO = dB.o();
            } else {
                K kO2 = dB.o();
                p210v8.i.f(kO2, "other");
                if (k3.isEmpty() && kO2.isEmpty()) {
                    kO = k3;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) K.f338t.f13623t).values();
                    p210v8.i.e(collectionValues, "idPerType.values");
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        C0136i c0136i = (C0136i) k3.f1752s.get(iIntValue);
                        C0136i c0136i2 = (C0136i) kO2.f1752s.get(iIntValue);
                        if (c0136i != null) {
                            if (c0136i2 != null) {
                                c0136i = new C0136i(oa.b.b(c0136i.a, c0136i2.a));
                            }
                            c0136i2 = c0136i;
                        } else if (c0136i2 == null) {
                            c0136i2 = null;
                        } else if (c0136i != null) {
                            c0136i2 = new C0136i(oa.b.b(c0136i2.a, c0136i.a));
                        }
                        J9.l.b(arrayList, c0136i2);
                    }
                    kO = o1.c.o(arrayList);
                }
            }
            dB = AbstractC0130c.q(dB, null, kO, 1);
        }
        D dI = b0.i(dB, z6);
        if (!z10) {
            return dI;
        }
        C0349e c0349e = qVar.f16126y;
        p210v8.i.e(c0349e, "descriptor.typeConstructor");
        return AbstractC0130c.A(dI, s(k3, c0349e, (List) mVar.f13643u, t9.m.f15259b, z6));
    }

    public S i(S s9, o1.m mVar, L8.P p10, int i10) {
        int iJ0;
        p238y9.q qVar = (p238y9.q) mVar.f13642t;
        if (i10 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + qVar.getName());
        }
        if (s9.c()) {
            p210v8.i.c(p10);
            return b0.j(p10);
        }
        AbstractC0151y abstractC0151yB = s9.b();
        p210v8.i.e(abstractC0151yB, "underlyingProjection.type");
        O oD = abstractC0151yB.D();
        p210v8.i.f(oD, "constructor");
        InterfaceC0273g interfaceC0273gW = oD.w();
        S s10 = interfaceC0273gW instanceof L8.P ? (S) ((Map) mVar.f13644v).get(interfaceC0273gW) : null;
        if (s10 == null) {
            D dB = AbstractC0130c.b(s9.b().D0());
            if (!AbstractC0130c.j(dB) && b0.c(dB, E9.a.f1457u, null)) {
                O oD2 = dB.D();
                InterfaceC0273g interfaceC0273gW2 = oD2.w();
                oD2.u().size();
                dB.l().size();
                if (!(interfaceC0273gW2 instanceof L8.P)) {
                    int i11 = 0;
                    if (interfaceC0273gW2 instanceof p238y9.q) {
                        p238y9.q qVar2 = (p238y9.q) interfaceC0273gW2;
                        if (mVar.h(qVar2)) {
                            C9.h hVar = C9.h.RECURSIVE_TYPE_ALIAS;
                            String str = qVar2.getName().f12551s;
                            p210v8.i.e(str, "typeDescriptor.name.toString()");
                            return new T(1, C9.i.c(hVar, str));
                        }
                        List listL = dB.l();
                        ArrayList arrayList = new ArrayList(p086i8.m.H(listL, 10));
                        for (Object obj : listL) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                p086i8.l.G();
                                throw null;
                            }
                            arrayList.add(i((S) obj, mVar, (L8.P) oD2.u().get(i11), i10 + 1));
                            i11 = i12;
                        }
                        return new T(s9.a(), AbstractC0130c.A(h(AbstractC0130c.e(mVar, qVar2, arrayList), dB.o(), dB.H(), i10 + 1, false), u(dB, mVar, i10)));
                    }
                    D dU = u(dB, mVar, i10);
                    Z.d(dU);
                    for (Object obj2 : dU.l()) {
                        int i13 = i11 + 1;
                        if (i11 < 0) {
                            p086i8.l.G();
                            throw null;
                        }
                        S s11 = (S) obj2;
                        if (!s11.c()) {
                            AbstractC0151y abstractC0151yB2 = s11.b();
                            p210v8.i.e(abstractC0151yB2, "substitutedArgument.type");
                            if (!b0.c(abstractC0151yB2, E9.a.f1456t, null)) {
                            }
                        }
                        i11 = i13;
                    }
                    return new T(s9.a(), dU);
                }
            }
            return s9;
        }
        if (s10.c()) {
            p210v8.i.c(p10);
            return b0.j(p10);
        }
        d0 d0VarD0 = s10.b().D0();
        int iA = s10.a();
        AbstractC0487g.u(iA, "argument.projectionKind");
        int iA2 = s9.a();
        AbstractC0487g.u(iA2, "underlyingProjection.projectionKind");
        if (iA2 != iA && iA2 != 1) {
            if (iA == 1) {
                iA = iA2;
            } else {
                p210v8.i.f(qVar, "typeAlias");
            }
        }
        if (p10 == null || (iJ0 = p10.j0()) == 0) {
            iJ0 = 1;
        }
        if (iJ0 != iA && iJ0 != 1) {
            if (iA == 1) {
                iA = 1;
            } else {
                p210v8.i.f(qVar, "typeAlias");
            }
        }
        a(abstractC0151yB.q(), d0VarD0.q());
        D dI = b0.i(AbstractC0130c.b(d0VarD0), abstractC0151yB.H());
        K kO = abstractC0151yB.o();
        if (!AbstractC0130c.j(dI)) {
            if (AbstractC0130c.j(dI)) {
                kO = dI.o();
            } else {
                K kO2 = dI.o();
                kO.getClass();
                p210v8.i.f(kO2, "other");
                if (!kO.isEmpty() || !kO2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) K.f338t.f13623t).values();
                    p210v8.i.e(collectionValues, "idPerType.values");
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        C0136i c0136i = (C0136i) kO.f1752s.get(iIntValue);
                        C0136i c0136i2 = (C0136i) kO2.f1752s.get(iIntValue);
                        if (c0136i != null) {
                            if (c0136i2 != null) {
                                c0136i = new C0136i(oa.b.b(c0136i.a, c0136i2.a));
                            }
                            c0136i2 = c0136i;
                        } else if (c0136i2 == null) {
                            c0136i2 = null;
                        } else if (c0136i != null) {
                            c0136i2 = new C0136i(oa.b.b(c0136i2.a, c0136i.a));
                        }
                        J9.l.b(arrayList2, c0136i2);
                    }
                    kO = o1.c.o(arrayList2);
                }
            }
            dI = AbstractC0130c.q(dI, null, kO, 1);
        }
        return new T(iA, dI);
    }

    public D u(D d3, o1.m mVar, int i10) {
        O oD = d3.D();
        List listL = d3.l();
        ArrayList arrayList = new ArrayList(p086i8.m.H(listL, 10));
        int i11 = 0;
        for (Object obj : listL) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                p086i8.l.G();
                throw null;
            }
            S s9 = (S) obj;
            S sI = i(s9, mVar, (L8.P) oD.u().get(i11), i10 + 1);
            if (!sI.c()) {
                sI = new T(sI.a(), b0.h(sI.b(), s9.b().H()));
            }
            arrayList.add(sI);
            i11 = i12;
        }
        return AbstractC0130c.q(d3, arrayList, null, 2);
    }
}
