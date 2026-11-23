package p019b9;

import A1.l;
import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.D;
import A9.K;
import A9.O;
import A9.S;
import A9.b0;
import A9.d0;
import A9.r;
import B9.g;
import E0.b;
import L8.AbstractC0287v;
import L8.InterfaceC0268b;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.InterfaceC0277k;
import L8.InterfaceC0285t;
import L8.P;
import M8.h;
import M8.i;
import O0.a;
import O8.L;
import O8.U;
import O8.x;
import R8.C0409d;
import U8.B;
import U8.C0442c;
import U8.EnumC0440a;
import U8.n;
import U8.q;
import U8.t;
import U8.u;
import U8.y;
import Y8.C0477f;
import Y8.j;
import Z8.f;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p086i8.k;
import p086i8.m;
import p086i8.s;
import p096j9.c;
import p096j9.e;
import p188t1.Y;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static c c(D d3, b bVar, int i10, int i11, boolean z6, boolean z10) {
        InterfaceC0271e interfaceC0271eA;
        Boolean bool;
        O oD;
        l lVar;
        S sJ;
        ?? r10 = 0;
        int i12 = 1;
        AbstractC0487g.p(i11, "<this>");
        boolean z11 = i11 != 3;
        boolean z12 = (z10 && z6) ? false : true;
        Object obj = null;
        if (!z11 && d3.l().isEmpty()) {
            return new c(null, 1, false);
        }
        InterfaceC0273g interfaceC0273gW = d3.D().w();
        if (interfaceC0273gW == null) {
            return new c(null, 1, false);
        }
        e eVar = (e) bVar.invoke(Integer.valueOf(i10));
        i iVar = r.a;
        AbstractC0487g.p(i11, "<this>");
        if (i11 == 3 || !(interfaceC0273gW instanceof InterfaceC0271e)) {
            interfaceC0271eA = null;
        } else if (eVar.f7326b == f.f7329s && i11 == 1) {
            InterfaceC0271e interfaceC0271e = (InterfaceC0271e) interfaceC0273gW;
            String str = K8.d.a;
            e eVarG = p124m9.e.g(interfaceC0271e);
            HashMap map = K8.d.j;
            if (map.containsKey(eVarG)) {
                c cVar = (c) map.get(p124m9.e.g(interfaceC0271e));
                if (cVar == null) {
                    throw new IllegalArgumentException("Given class " + interfaceC0271e + " is not a mutable collection");
                }
                interfaceC0271eA = p165q9.d.e(interfaceC0271e).i(cVar);
            } else if (eVar.f7326b == f.f7330t) {
                interfaceC0271eA = null;
            } else {
                interfaceC0271eA = null;
            }
        } else if (eVar.f7326b == f.f7330t || i11 != 2) {
            interfaceC0271eA = null;
        } else {
            InterfaceC0271e interfaceC0271e2 = (InterfaceC0271e) interfaceC0273gW;
            String str2 = K8.d.a;
            if (K8.d.f2634k.containsKey(p124m9.e.g(interfaceC0271e2))) {
                interfaceC0271eA = K8.e.a(interfaceC0271e2);
            } else {
                interfaceC0271eA = null;
            }
        }
        AbstractC0487g.p(i11, "<this>");
        if (i11 == 3) {
            bool = null;
        } else {
            h hVar = eVar.a;
            int i13 = hVar == null ? -1 : q.a[hVar.ordinal()];
            if (i13 == 1) {
                bool = Boolean.TRUE;
            } else if (i13 != 2) {
                bool = null;
            } else {
                bool = Boolean.FALSE;
            }
        }
        if (interfaceC0271eA == null || (oD = interfaceC0271eA.I()) == null) {
            oD = d3.D();
        }
        p210v8.i.e(oD, "enhancedClassifier?.typeConstructor ?: constructor");
        int i14 = i10 + 1;
        List listL = d3.l();
        List listU = oD.u();
        p210v8.i.e(listU, "typeConstructor.parameters");
        List list = listU;
        Iterator it = listL.iterator();
        Iterator it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(m.H(listL, 10), m.H(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            P p10 = (P) it2.next();
            S s9 = (S) next;
            if (!z12) {
                lVar = new l(obj, (int) r10);
            } else if (!s9.c()) {
                lVar = d(s9.b().D0(), bVar, i14, z10);
            } else if (((e) bVar.invoke(Integer.valueOf(i14))).a == h.f7333s) {
                d0 d0VarD0 = s9.b().D0();
                lVar = new l(C0133f.j(AbstractC0130c.l(d0VarD0).G0(r10), AbstractC0130c.z(d0VarD0).G0(true)), 1);
            } else {
                lVar = new l((Object) null, i12);
            }
            i14 += lVar.f122s;
            d0 d0Var = (d0) lVar.f123t;
            if (d0Var != null) {
                int iA = s9.a();
                AbstractC0487g.u(iA, "arg.projectionKind");
                sJ = qa.b.h(d0Var, iA, p10);
            } else if (interfaceC0271eA == null || s9.c()) {
                sJ = interfaceC0271eA != null ? b0.j(p10) : null;
            } else {
                AbstractC0151y abstractC0151yB = s9.b();
                p210v8.i.e(abstractC0151yB, "arg.type");
                int iA2 = s9.a();
                AbstractC0487g.u(iA2, "arg.projectionKind");
                sJ = qa.b.h(abstractC0151yB, iA2, p10);
            }
            arrayList.add(sJ);
            r10 = 0;
            i12 = 1;
            obj = null;
        }
        int i15 = i14 - i10;
        if (interfaceC0271eA == null && bool == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((S) it3.next()) == null);
            }
            return new c(null, i15, false);
        }
        h hVarQ = d3.q();
        i iVar2 = r.f7352b;
        if (interfaceC0271eA == null) {
            iVar2 = null;
        }
        ArrayList arrayListU = p086i8.i.u(new h[]{hVarQ, iVar2, bool != null ? r.a : null});
        int size = arrayListU.size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected");
        }
        K kX = AbstractC0130c.x(size != 1 ? new i(k.s0(arrayListU), 1) : (h) k.k0(arrayListU));
        List listL2 = d3.l();
        Iterator it4 = arrayList.iterator();
        Iterator it5 = listL2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(m.H(arrayList, 10), m.H(listL2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            S s10 = (S) it5.next();
            S s11 = (S) next2;
            if (s11 != null) {
                s10 = s11;
            }
            arrayList2.add(s10);
        }
        D dR = C0133f.r(kX, oD, arrayList2, bool != null ? bool.booleanValue() : d3.H());
        if (eVar.f7327c) {
            dR = new g(dR);
        }
        return new c(dR, i15, bool != null && eVar.f7328d);
    }

    public static l d(d0 d0Var, b bVar, int i10, boolean z6) {
        d0 d0VarJ;
        D d3;
        D d8;
        Object objB = null;
        if (AbstractC0130c.j(d0Var)) {
            return new l((Object) null, 1);
        }
        if (!(d0Var instanceof r)) {
            if (!(d0Var instanceof D)) {
                throw new NoWhenBranchMatchedException();
            }
            c cVarC = c((D) d0Var, bVar, i10, 3, false, z6);
            boolean z10 = cVarC.a;
            d0 d0VarB = (D) cVarC.f7324c;
            if (z10) {
                d0VarB = AbstractC0130c.B(d0Var, d0VarB);
            }
            return new l(d0VarB, cVarC.f7323b);
        }
        boolean z11 = d0Var instanceof f;
        r rVar = (r) d0Var;
        c cVarC2 = c(rVar.f383t, bVar, i10, 1, z11, z6);
        c cVarC3 = c(rVar.f384u, bVar, i10, 2, z11, z6);
        D d10 = (D) cVarC3.f7324c;
        D d11 = (D) cVarC2.f7324c;
        if (d11 != null || d10 != null) {
            if (cVarC2.a || cVarC3.a) {
                if (d10 != null) {
                    if (d11 == null) {
                        d11 = d10;
                    }
                    d0VarJ = C0133f.j(d11, d10);
                } else {
                    p210v8.i.c(d11);
                    d0VarJ = d11;
                }
                objB = AbstractC0130c.B(d0Var, d0VarJ);
            } else {
                D d12 = rVar.f384u;
                D d13 = rVar.f383t;
                if (z11) {
                    if (d11 == null) {
                        d3 = d11;
                        d8 = d11;
                        d8 = d13;
                    }
                    if (d10 == null) {
                        d10 = d12;
                    }
                    objB = new f(d8, d10);
                } else {
                    if (d11 == null) {
                        d3 = d13;
                    }
                    if (d10 == null) {
                        d10 = d12;
                    }
                    objB = C0133f.j(d3, d10);
                }
            }
        }
        return new l(objB, cVarC2.f7323b);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:102:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:188:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:218:0x0336  */
    /* JADX WARN: Code duplicated, block: B:220:0x0339  */
    /* JADX WARN: Code duplicated, block: B:225:0x0344  */
    /* JADX WARN: Code duplicated, block: B:232:0x0353  */
    /* JADX WARN: Code duplicated, block: B:236:0x0363  */
    /* JADX WARN: Code duplicated, block: B:238:0x036d  */
    /* JADX WARN: Code duplicated, block: B:239:0x036f  */
    /* JADX WARN: Code duplicated, block: B:244:0x0381  */
    /* JADX WARN: Code duplicated, block: B:245:0x0383  */
    /* JADX WARN: Code duplicated, block: B:247:0x0386  */
    /* JADX WARN: Code duplicated, block: B:248:0x0388  */
    /* JADX WARN: Code duplicated, block: B:250:0x0390  */
    /* JADX WARN: Code duplicated, block: B:253:0x039f  */
    /* JADX WARN: Code duplicated, block: B:259:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:260:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:264:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:274:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:276:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:278:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:281:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:284:0x0408  */
    /* JADX WARN: Code duplicated, block: B:287:0x0414  */
    /* JADX WARN: Code duplicated, block: B:291:0x041b  */
    /* JADX WARN: Code duplicated, block: B:304:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0373 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x03d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x03c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0414 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:? A[LOOP:7: B:282:0x0402->B:322:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x0203 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0151y a(a aVar, AbstractC0151y abstractC0151y, List list, p pVar, boolean z6) {
        int size;
        boolean z10;
        h hVarQ;
        Iterable iterable;
        Fa.e eVar;
        EnumC0440a enumC0440a;
        e[] eVarArr;
        h hVar;
        i iVar;
        n nVar;
        i iVarC;
        i iVar2;
        i iVar3;
        h hVar2;
        boolean z11;
        i iVarA;
        e eVar2;
        i iVarC2;
        i iVarA2;
        n nVar2;
        i iVar4;
        i iVarA3;
        f fVar;
        O oJ;
        ArrayList<e> arrayList;
        Iterator it;
        boolean z12;
        boolean z13;
        ArrayList arrayList2;
        Set setW0;
        boolean z14;
        h hVar3;
        h hVar4;
        h hVar5;
        ArrayList arrayList3;
        Iterator it2;
        h hVar6;
        boolean z15;
        boolean z16;
        Iterator it3;
        f fVar2;
        ArrayList arrayList4;
        Iterator it4;
        Set setW1;
        h hVar7;
        h hVar8;
        a aVar2;
        e eVar3;
        D9.c cVar;
        h hVarF;
        int iG;
        a aVar3 = aVar;
        List list2 = list;
        p210v8.i.f(abstractC0151y, "<this>");
        ArrayList arrayListI = aVar.i(abstractC0151y);
        ArrayList arrayList5 = new ArrayList(m.H(list2, 10));
        Iterator it5 = list2.iterator();
        while (it5.hasNext()) {
            arrayList5.add(aVar3.i((D9.c) it5.next()));
        }
        Fa.e eVar4 = (Fa.e) aVar3.f3506d;
        boolean z17 = aVar3.a;
        if (!z17 || ((list2 instanceof Collection) && list2.isEmpty())) {
            size = arrayListI.size();
            break;
        }
        Iterator it6 = list2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                size = arrayListI.size();
                break;
            }
            D9.c cVar2 = (D9.c) it6.next();
            p210v8.i.f(cVar2, "other");
            if (!((B9.m) ((I4.a) eVar4.f1659t).f2065u).a(abstractC0151y, (AbstractC0151y) cVar2)) {
                size = 1;
                break;
            }
        }
        e[] eVarArr2 = new e[size];
        int i10 = 0;
        while (i10 < size) {
            a aVar4 = (a) arrayListI.get(i10);
            D9.c cVar3 = aVar4.a;
            h hVar9 = h.f7334t;
            h hVar10 = h.f7335u;
            B9.e eVar5 = B9.e.f779t;
            f fVar3 = f.f7330t;
            f fVar4 = f.f7329s;
            h hVar11 = h.f7333s;
            int i11 = size;
            InterfaceC0277k interfaceC0277k = (InterfaceC0277k) aVar3.f3505c;
            ArrayList arrayList6 = arrayListI;
            P p10 = aVar4.f7322c;
            if (cVar3 == null) {
                if (p10 != null) {
                    int iJ0 = p10.j0();
                    AbstractC0487g.u(iJ0, "this.variance");
                    iG = com.bumptech.glide.d.g(iJ0);
                } else {
                    iG = 0;
                }
                if (iG == 1) {
                    eVar2 = e.f7325e;
                    arrayList5 = arrayList5;
                    eVar = eVar4;
                    z10 = z17;
                    eVarArr = eVarArr2;
                    hVar = null;
                }
                arrayList = new ArrayList();
                it = arrayList5.iterator();
                while (it.hasNext()) {
                    aVar2 = (a) k.W((List) it.next(), i10);
                    if (aVar2 != null || (cVar = aVar2.a) == null) {
                        eVar3 = null;
                    } else {
                        h hVarF2 = a.f(cVar);
                        if (hVarF2 == null) {
                            AbstractC0151y abstractC0151yF = AbstractC0130c.f((AbstractC0151y) cVar);
                            hVarF = abstractC0151yF != null ? a.f(abstractC0151yF) : hVar;
                        } else {
                            hVarF = hVarF2;
                        }
                        String str = K8.d.a;
                        eVar3 = new e(hVarF, K8.d.f2634k.containsKey(a.e(eVar5.o(cVar))) ? fVar4 : K8.d.j.containsKey(a.e(eVar5.u0(cVar))) ? fVar3 : null, eVar5.a(cVar) || (((AbstractC0151y) cVar).D0() instanceof g), hVarF != hVarF2);
                    }
                    if (eVar3 != null) {
                        arrayList.add(eVar3);
                    }
                    hVar = null;
                }
                if (i10 == 0 || !z10) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (i10 == 0 || !(interfaceC0277k instanceof U) || ((U) interfaceC0277k).f3689B == null) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                arrayList2 = new ArrayList();
                for (e eVar6 : arrayList) {
                    if (eVar6.f7328d) {
                        hVar8 = null;
                    } else {
                        hVar8 = eVar6.a;
                    }
                    if (hVar8 != null) {
                        arrayList2.add(hVar8);
                    }
                }
                setW0 = k.w0(arrayList2);
                z14 = eVar2.f7328d;
                hVar3 = eVar2.a;
                if (z14) {
                    hVar4 = null;
                } else {
                    hVar4 = hVar3;
                }
                if (hVar4 == hVar11) {
                    hVar5 = hVar11;
                } else {
                    hVar5 = (h) com.bumptech.glide.d.A(setW0, hVar10, hVar9, hVar4, z12);
                }
                if (hVar5 == null) {
                    arrayList4 = new ArrayList();
                    it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        hVar7 = ((e) it4.next()).a;
                        if (hVar7 != null) {
                            arrayList4.add(hVar7);
                        }
                    }
                    setW1 = k.w0(arrayList4);
                    if (hVar3 != hVar11) {
                        hVar11 = (h) com.bumptech.glide.d.A(setW1, hVar10, hVar9, hVar3, z12);
                    }
                } else {
                    hVar11 = hVar5;
                }
                arrayList3 = new ArrayList();
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    fVar2 = ((e) it2.next()).f7326b;
                    if (fVar2 != null) {
                        arrayList3.add(fVar2);
                    }
                }
                f fVar5 = (f) com.bumptech.glide.d.A(k.w0(arrayList3), fVar3, fVar4, eVar2.f7326b, z12);
                if (hVar11 != null || z6 || (z13 && hVar11 == hVar9)) {
                    hVar6 = null;
                } else {
                    hVar6 = hVar11;
                }
                if (hVar6 != hVar10) {
                    z15 = false;
                } else {
                    if (!eVar2.f7327c) {
                        if (!arrayList.isEmpty()) {
                            it3 = arrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((e) it3.next()).f7327c) {
                                    }
                                }
                            }
                        }
                        z15 = false;
                    }
                    z15 = true;
                }
                if (hVar6 != null || hVar5 == hVar11) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                eVarArr[i10] = new e(hVar6, fVar5, z15, z16);
                i10++;
                aVar3 = aVar;
                size = i11;
                arrayListI = arrayList6;
                arrayList5 = arrayList5;
                z17 = z10;
                eVar4 = eVar;
                eVarArr2 = eVarArr;
            } else {
                p10 = p10;
            }
            boolean z18 = p10 == null;
            Iterable iterable2 = s.f12328s;
            boolean z19 = z18;
            D9.c cVar4 = aVar4.a;
            Iterable iterableQ = cVar4 != null ? ((AbstractC0151y) cVar4).q() : iterable2;
            P pS = (cVar4 == null || (oJ = eVar5.j(cVar4)) == null) ? null : g.s(oJ);
            EnumC0440a enumC0440a2 = EnumC0440a.TYPE_PARAMETER_BOUNDS;
            z10 = z17;
            EnumC0440a enumC0440a3 = (EnumC0440a) aVar3.f3507e;
            boolean z20 = enumC0440a3 == enumC0440a2;
            if (z19) {
                if (!z20) {
                    ((X8.a) ((I4.a) eVar4.f1659t).f2064t).getClass();
                }
                if (interfaceC0277k != null && (hVarQ = interfaceC0277k.q()) != null) {
                    iterable2 = hVarQ;
                }
                iterableQ = k.e0(iterable2, iterableQ);
            }
            ((C0442c) ((I4.a) eVar4.f1659t).f2061q).getClass();
            Iterator it7 = iterableQ.iterator();
            f fVar6 = null;
            while (true) {
                if (!it7.hasNext()) {
                    iterable = iterableQ;
                    break;
                }
                Iterator it8 = it7;
                c cVarD = C0442c.d(it7.next());
                iterable = iterableQ;
                if (y.f5021o.contains(cVarD)) {
                    fVar = fVar4;
                } else {
                    if (y.f5022p.contains(cVarD)) {
                        fVar = fVar3;
                    } else {
                        continue;
                    }
                    iterableQ = iterable;
                    it7 = it8;
                }
                if (fVar6 != null && fVar6 != fVar) {
                    fVar6 = null;
                    break;
                }
                fVar6 = fVar;
                iterableQ = iterable;
                it7 = it8;
            }
            I4.a aVar5 = (I4.a) eVar4.f1659t;
            eVar = eVar4;
            b bVar = new b(aVar3, 8, aVar4);
            C0442c c0442c = (C0442c) aVar5.f2061q;
            c0442c.getClass();
            Iterator it9 = iterable.iterator();
            i iVar5 = null;
            while (true) {
                if (!it9.hasNext()) {
                    enumC0440a = enumC0440a3;
                    eVarArr = eVarArr2;
                    hVar = null;
                    iVar = iVar5;
                    break;
                }
                enumC0440a = enumC0440a3;
                Object next = it9.next();
                i iVarG = c0442c.g(next, ((Boolean) bVar.invoke(next)).booleanValue());
                if (iVarG != null) {
                    eVarArr = eVarArr2;
                    iVar4 = iVarG;
                } else {
                    Object objI = c0442c.i(next);
                    if (objI == null) {
                        eVarArr = eVarArr2;
                    } else {
                        B bH = c0442c.h(next);
                        if (bH == null) {
                            bH = c0442c.a.a.a;
                        }
                        eVarArr = eVarArr2;
                        if (bH == B.IGNORE) {
                            iVar4 = null;
                        } else {
                            i iVarG2 = c0442c.g(objI, ((Boolean) bVar.invoke(objI)).booleanValue());
                            if (iVarG2 != null) {
                                c0442c = c0442c;
                                hVar = null;
                                iVarA3 = i.a(iVarG2, null, bH == B.WARN, 1);
                            }
                        }
                        if (iVar5 == null) {
                            iVar5 = iVarA3;
                        } else if (iVarA3 == null && !iVarA3.equals(iVar5)) {
                            boolean z21 = iVar5.f7337b;
                            boolean z22 = iVarA3.f7337b;
                            if (!z22 || z21) {
                                if (z22 || !z21) {
                                    iVar = hVar;
                                    break;
                                }
                                iVar5 = iVarA3;
                            }
                        }
                        c0442c = c0442c;
                        enumC0440a3 = enumC0440a;
                        eVarArr2 = eVarArr;
                        iVar5 = iVar5;
                    }
                    c0442c = c0442c;
                    hVar = null;
                    iVarA3 = null;
                    if (iVar5 == null) {
                        iVar5 = iVarA3;
                    } else if (iVarA3 == null) {
                        continue;
                    }
                    c0442c = c0442c;
                    enumC0440a3 = enumC0440a;
                    eVarArr2 = eVarArr;
                    iVar5 = iVar5;
                }
                hVar = null;
                iVarA3 = iVar4;
                if (iVar5 == null) {
                    iVar5 = iVarA3;
                } else if (iVarA3 == null) {
                    continue;
                }
                c0442c = c0442c;
                enumC0440a3 = enumC0440a;
                eVarArr2 = eVarArr;
                iVar5 = iVar5;
            }
            if (iVar != 0) {
                h hVar12 = iVar.a;
                eVar2 = new e(hVar12, fVar6, hVar12 == hVar10 && pS != null, iVar.f7337b);
            } else {
                EnumC0440a enumC0440a4 = (z19 || z20) ? enumC0440a : EnumC0440a.TYPE_USE;
                u uVar = aVar4.f7321b;
                if (uVar != null) {
                    nVar2 = (n) uVar.a.get(enumC0440a4);
                } else {
                    nVar = hVar;
                }
                if (pS != null) {
                    nVar = nVar2;
                    iVarC = a.c(pS);
                } else {
                    nVar = nVar2;
                    iVarC = hVar;
                }
                if (iVarC != 0) {
                    iVarA2 = i.a(iVarC, hVar10, false, 2);
                } else if (nVar != 0) {
                    iVar3 = nVar.a;
                } else {
                    iVar2 = hVar;
                }
                if (iVarC != 0) {
                    iVar2 = iVar3;
                    hVar2 = iVarC.a;
                } else {
                    iVar2 = iVar3;
                    hVar2 = hVar;
                }
                if (hVar2 == hVar10 || !(pS == null || nVar == 0 || !nVar.f4977c)) {
                    iVar2 = iVarA2;
                    iVar2 = iVarA2;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (p10 == null || (iVarC2 = a.c(p10)) == null) {
                    iVarA = hVar;
                } else if (iVarC2.a == hVar9) {
                    iVarA = iVarC2;
                    iVarA = i.a(iVarC2, hVar11, false, 2);
                }
                if (iVarA != 0) {
                    if (iVar2 == 0) {
                        iVar2 = iVarA;
                    } else {
                        boolean z23 = iVar2.f7337b;
                        boolean z24 = iVarA.f7337b;
                        if (!z24 || z23) {
                            if (z24 || !z23) {
                                h hVar13 = iVarA.a;
                                h hVar14 = iVar2.a;
                                if (hVar13.compareTo(hVar14) >= 0 && hVar13.compareTo(hVar14) > 0) {
                                    iVar2 = iVarA;
                                }
                            } else {
                                iVar2 = iVarA;
                            }
                        }
                    }
                }
                eVar2 = new e(iVar2 != 0 ? iVar2.a : hVar, fVar6, z11, iVar2 != 0 && iVar2.f7337b);
            }
            arrayList = new ArrayList();
            it = arrayList5.iterator();
            while (it.hasNext()) {
                aVar2 = (a) k.W((List) it.next(), i10);
                if (aVar2 != null) {
                    eVar3 = null;
                } else {
                    eVar3 = null;
                }
                if (eVar3 != null) {
                    arrayList.add(eVar3);
                }
                hVar = null;
            }
            if (i10 == 0) {
                z12 = false;
            } else {
                z12 = false;
            }
            if (i10 == 0) {
                z13 = false;
            } else {
                z13 = false;
            }
            arrayList2 = new ArrayList();
            while (r6.hasNext()) {
                if (eVar6.f7328d) {
                    hVar8 = null;
                } else {
                    hVar8 = eVar6.a;
                }
                if (hVar8 != null) {
                    arrayList2.add(hVar8);
                }
            }
            setW0 = k.w0(arrayList2);
            z14 = eVar2.f7328d;
            hVar3 = eVar2.a;
            if (z14) {
                hVar4 = null;
            } else {
                hVar4 = hVar3;
            }
            if (hVar4 == hVar11) {
                hVar5 = hVar11;
            } else {
                hVar5 = (h) com.bumptech.glide.d.A(setW0, hVar10, hVar9, hVar4, z12);
            }
            if (hVar5 == null) {
                arrayList4 = new ArrayList();
                it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    hVar7 = ((e) it4.next()).a;
                    if (hVar7 != null) {
                        arrayList4.add(hVar7);
                    }
                }
                setW1 = k.w0(arrayList4);
                if (hVar3 != hVar11) {
                    hVar11 = (h) com.bumptech.glide.d.A(setW1, hVar10, hVar9, hVar3, z12);
                }
            } else {
                hVar11 = hVar5;
            }
            arrayList3 = new ArrayList();
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                fVar2 = ((e) it2.next()).f7326b;
                if (fVar2 != null) {
                    arrayList3.add(fVar2);
                }
            }
            f fVar7 = (f) com.bumptech.glide.d.A(k.w0(arrayList3), fVar3, fVar4, eVar2.f7326b, z12);
            if (hVar11 != null) {
                hVar6 = null;
            } else {
                hVar6 = null;
            }
            if (hVar6 != hVar10) {
                z15 = false;
            } else {
                if (!eVar2.f7327c) {
                    if (!arrayList.isEmpty()) {
                        it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((e) it3.next()).f7327c) {
                                }
                            }
                        }
                    }
                    z15 = false;
                }
                z15 = true;
            }
            if (hVar6 != null) {
                z16 = false;
            } else {
                z16 = false;
            }
            eVarArr[i10] = new e(hVar6, fVar7, z15, z16);
            i10++;
            aVar3 = aVar;
            size = i11;
            arrayListI = arrayList6;
            arrayList5 = arrayList5;
            z17 = z10;
            eVar4 = eVar;
            eVarArr2 = eVarArr;
        }
        return (d0) d(abstractC0151y.D0(), new b(pVar, 7, eVarArr2), 0, aVar.f3504b).f123t;
    }

    public AbstractC0151y b(W8.a aVar, InterfaceC0268b interfaceC0268b, boolean z6, Fa.e eVar, EnumC0440a enumC0440a, p pVar, boolean z10, p200u8.b bVar) {
        a aVar2 = new a((InterfaceC0277k) interfaceC0268b, z6, eVar, enumC0440a, false);
        AbstractC0151y abstractC0151y = (AbstractC0151y) bVar.invoke(aVar);
        Collection collectionX = aVar.x();
        p210v8.i.e(collectionX, "overriddenDescriptors");
        Collection<InterfaceC0269c> collection = collectionX;
        ArrayList arrayList = new ArrayList(m.H(collection, 10));
        for (InterfaceC0269c interfaceC0269c : collection) {
            p210v8.i.e(interfaceC0269c, "it");
            arrayList.add((AbstractC0151y) bVar.invoke(interfaceC0269c));
        }
        return a(aVar2, abstractC0151y, arrayList, pVar, z10);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0207  */
    /* JADX WARN: Code duplicated, block: B:103:0x020c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0210  */
    /* JADX WARN: Code duplicated, block: B:107:0x0230  */
    /* JADX WARN: Code duplicated, block: B:109:0x0236  */
    /* JADX WARN: Code duplicated, block: B:110:0x023f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0243  */
    /* JADX WARN: Code duplicated, block: B:117:0x025e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0268  */
    /* JADX WARN: Code duplicated, block: B:125:0x0284  */
    /* JADX WARN: Code duplicated, block: B:126:0x0287  */
    /* JADX WARN: Code duplicated, block: B:128:0x028a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0297  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:148:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:150:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:155:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:164:0x0317  */
    /* JADX WARN: Code duplicated, block: B:169:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x030b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[LOOP:4: B:118:0x0262->B:186:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0142  */
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01de  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [L8.b] */
    /* JADX WARN: Type inference failed for: r25v0, types: [b9.d] */
    /* JADX WARN: Type inference failed for: r4v3, types: [L8.b, L8.c, L8.j] */
    /* JADX WARN: Type inference failed for: r4v5, types: [W8.a] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v39 */
    public ArrayList e(Fa.e eVar, Collection collection) {
        h hVarQ;
        AbstractC0151y type;
        l lVar;
        boolean z6;
        ArrayList arrayList;
        L8.K k3;
        EnumC0440a enumC0440a;
        p pVar;
        AbstractC0151y abstractC0151yB;
        AbstractC0151y abstractC0151yW;
        m mVar;
        boolean z10;
        p076h8.f fVar;
        ArrayList arrayList2;
        int i10;
        Iterator it;
        int i11;
        Object next;
        AbstractC0151y type2;
        x xVarR;
        x xVarR2;
        boolean zC;
        List list;
        Iterator it2;
        AbstractC0151y type3;
        boolean z11;
        p pVar2;
        Fa.e eVarH;
        L l4;
        p210v8.i.f(eVar, "c");
        Collection<??> collection2 = collection;
        int i12 = 10;
        ArrayList arrayList3 = new ArrayList(m.H(collection2, 10));
        for (?? B10 : collection2) {
            if (B10 instanceof W8.a) {
                W8.a aVar = (W8.a) B10;
                boolean z12 = true;
                if (aVar.V() == 2 && aVar.c().x().size() == 1) {
                    i10 = i12;
                } else {
                    InterfaceC0273g interfaceC0273gG = AbstractC0287v.g(B10);
                    if (interfaceC0273gG == null) {
                        hVarQ = ((B1.a) B10).q();
                    } else {
                        j jVar = interfaceC0273gG instanceof j ? (j) interfaceC0273gG : null;
                        List list2 = jVar != null ? (List) jVar.f5758C.getValue() : null;
                        List list3 = list2;
                        if (list3 == null || list3.isEmpty()) {
                            hVarQ = ((B1.a) B10).q();
                        } else {
                            List list4 = list2;
                            ArrayList arrayList4 = new ArrayList(m.H(list4, i12));
                            Iterator it3 = list4.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(new C0477f(eVar, (C0409d) it3.next(), true));
                            }
                            ArrayList arrayListE0 = k.e0(((B1.a) B10).q(), arrayList4);
                            hVarQ = arrayListE0.isEmpty() ? M8.g.a : new i(arrayListE0, 0);
                        }
                    }
                    Fa.e eVarH2 = J7.j.h(eVar, hVarQ);
                    ?? r11 = (!(B10 instanceof W8.g) || (l4 = ((W8.g) B10).f3669O) == null || l4.f3642w) ? B10 : l4;
                    x xVarR3 = aVar.R();
                    EnumC0440a enumC0440a2 = EnumC0440a.VALUE_PARAMETER;
                    if (xVarR3 != null) {
                        InterfaceC0285t interfaceC0285t = r11 instanceof InterfaceC0285t ? (InterfaceC0285t) r11 : null;
                        U u3 = interfaceC0285t != null ? (U) interfaceC0285t.c0(W8.f.f5363X) : null;
                        type = b((W8.a) B10, u3, false, u3 != null ? J7.j.h(eVarH2, u3.q()) : eVarH2, enumC0440a2, null, false, m.f7346u);
                    } else {
                        type = null;
                    }
                    W8.f fVar2 = B10 instanceof W8.f ? (W8.f) B10 : null;
                    if (fVar2 != null) {
                        InterfaceC0276j interfaceC0276jV = fVar2.v();
                        p210v8.i.d(interfaceC0276jV, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        String strN = oa.b.n((InterfaceC0271e) interfaceC0276jV, qa.b.c(fVar2, 3));
                        if (strN != null) {
                            lVar = (l) k.f7343d.get(strN);
                        } else {
                            lVar = null;
                        }
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        lVar.f7344b.size();
                        aVar.H0().size();
                    }
                    p210v8.i.f((t) ((I4.a) eVar.f1659t).f2066v, "javaTypeEnhancementState");
                    int i13 = 0;
                    if (U8.s.f4987A.invoke(q.a) == B.STRICT) {
                        if ((B10 instanceof InterfaceC0285t) && p210v8.i.a(B10.c0(W8.f.f5364Y), Boolean.TRUE)) {
                            z6 = true;
                        }
                        List listH0 = r11.H0();
                        p210v8.i.e(listH0, "annotationOwnerForMember.valueParameters");
                        List<U> list5 = listH0;
                        arrayList = new ArrayList(m.H(list5, i12));
                        for (U u10 : list5) {
                            if (lVar != null) {
                                pVar2 = (p) k.W(lVar.f7344b, u10.f3691x);
                            } else {
                                pVar2 = null;
                            }
                            A0.m mVar2 = new A0.m(u10, 27);
                            W8.a aVar2 = (W8.a) B10;
                            if (u10 != null) {
                                eVarH = J7.j.h(eVarH2, u10.q());
                            } else {
                                eVarH = eVarH2;
                            }
                            arrayList.add(b(aVar2, u10, false, eVarH, enumC0440a2, pVar2, z6, mVar2));
                        }
                        if (B10 instanceof L8.K) {
                            k3 = (L8.K) B10;
                        } else {
                            k3 = null;
                        }
                        if (k3 == null && Y.q(k3)) {
                            enumC0440a = EnumC0440a.FIELD;
                        } else {
                            enumC0440a = EnumC0440a.METHOD_RETURN_TYPE;
                        }
                        EnumC0440a enumC0440a3 = enumC0440a;
                        if (lVar != null) {
                            pVar = lVar.a;
                        } else {
                            pVar = null;
                        }
                        abstractC0151yB = b((W8.a) B10, r11, true, eVarH2, enumC0440a3, pVar, false, m.f7347v);
                        abstractC0151yW = aVar.w();
                        p210v8.i.c(abstractC0151yW);
                        mVar = m.f7345t;
                        if (b0.c(abstractC0151yW, mVar, null)) {
                            z10 = true;
                        } else {
                            xVarR2 = aVar.R();
                            if (xVarR2 != null) {
                                zC = b0.c(xVarR2.getType(), mVar, null);
                            } else {
                                zC = false;
                            }
                            if (zC) {
                                z10 = true;
                            } else {
                                List listH1 = aVar.H0();
                                p210v8.i.e(listH1, "valueParameters");
                                list = listH1;
                                if (!(list instanceof Collection) && list.isEmpty()) {
                                    z11 = false;
                                    break;
                                }
                                it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z11 = false;
                                        break;
                                    }
                                    type3 = ((U) it2.next()).getType();
                                    p210v8.i.e(type3, "it.type");
                                    if (b0.c(type3, mVar, null)) {
                                        z11 = true;
                                        break;
                                    }
                                }
                                if (z11) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            }
                        }
                        if (z10) {
                            fVar = new p076h8.f(p154p9.a.a, new U8.h());
                        } else {
                            fVar = null;
                        }
                        if (type == null && abstractC0151yB == null) {
                            if (arrayList.isEmpty()) {
                                z12 = false;
                                break;
                            }
                            Iterator it4 = arrayList.iterator();
                            do {
                                if (!it4.hasNext()) {
                                    z12 = false;
                                    break;
                                }
                            } while (!(((AbstractC0151y) it4.next()) != null));
                            if (z12 || fVar != null) {
                                if (type == null) {
                                    xVarR = aVar.R();
                                    if (xVarR != null) {
                                        type = xVarR.getType();
                                    } else {
                                        type = null;
                                    }
                                }
                                i10 = 10;
                                arrayList2 = new ArrayList(m.H(arrayList, 10));
                                it = arrayList.iterator();
                                while (true) {
                                    i11 = i13;
                                    if (it.hasNext()) {
                                        if (abstractC0151yB == null) {
                                            abstractC0151yB = aVar.w();
                                            p210v8.i.c(abstractC0151yB);
                                        }
                                        B10 = aVar.B0(type, arrayList2, abstractC0151yB, fVar);
                                        break;
                                        break;
                                    }
                                    next = it.next();
                                    i13 = i11 + 1;
                                    if (i11 >= 0) {
                                        p086i8.l.G();
                                        throw null;
                                    }
                                    type2 = (AbstractC0151y) next;
                                    if (type2 == null) {
                                        type2 = ((U) aVar.H0().get(i11)).getType();
                                        p210v8.i.e(type2, "valueParameters[index].type");
                                    }
                                    arrayList2.add(type2);
                                }
                            } else {
                                i10 = 10;
                            }
                        } else {
                            if (type == null) {
                                xVarR = aVar.R();
                                if (xVarR != null) {
                                    type = xVarR.getType();
                                } else {
                                    type = null;
                                }
                            }
                            i10 = 10;
                            arrayList2 = new ArrayList(m.H(arrayList, 10));
                            it = arrayList.iterator();
                            while (true) {
                                i11 = i13;
                                if (it.hasNext()) {
                                    if (abstractC0151yB == null) {
                                        abstractC0151yB = aVar.w();
                                        p210v8.i.c(abstractC0151yB);
                                    }
                                    B10 = aVar.B0(type, arrayList2, abstractC0151yB, fVar);
                                    break;
                                }
                                next = it.next();
                                i13 = i11 + 1;
                                if (i11 >= 0) {
                                    p086i8.l.G();
                                    throw null;
                                }
                                type2 = (AbstractC0151y) next;
                                if (type2 == null) {
                                    type2 = ((U) aVar.H0().get(i11)).getType();
                                    p210v8.i.e(type2, "valueParameters[index].type");
                                }
                                arrayList2.add(type2);
                            }
                        }
                    } else {
                        ((X8.a) ((I4.a) eVarH2.f1659t).f2064t).getClass();
                    }
                    z6 = false;
                    List listH2 = r11.H0();
                    p210v8.i.e(listH2, "annotationOwnerForMember.valueParameters");
                    List<U> list6 = listH2;
                    arrayList = new ArrayList(m.H(list6, i12));
                    while (r10.hasNext()) {
                        if (lVar != null) {
                            pVar2 = (p) k.W(lVar.f7344b, u10.f3691x);
                        } else {
                            pVar2 = null;
                        }
                        A0.m mVar3 = new A0.m(u10, 27);
                        W8.a aVar3 = (W8.a) B10;
                        if (u10 != null) {
                            eVarH = J7.j.h(eVarH2, u10.q());
                        } else {
                            eVarH = eVarH2;
                        }
                        arrayList.add(b(aVar3, u10, false, eVarH, enumC0440a2, pVar2, z6, mVar3));
                    }
                    if (B10 instanceof L8.K) {
                        k3 = (L8.K) B10;
                    } else {
                        k3 = null;
                    }
                    if (k3 == null) {
                        enumC0440a = EnumC0440a.METHOD_RETURN_TYPE;
                    } else {
                        enumC0440a = EnumC0440a.METHOD_RETURN_TYPE;
                    }
                    EnumC0440a enumC0440a4 = enumC0440a;
                    if (lVar != null) {
                        pVar = lVar.a;
                    } else {
                        pVar = null;
                    }
                    abstractC0151yB = b((W8.a) B10, r11, true, eVarH2, enumC0440a4, pVar, false, m.f7347v);
                    abstractC0151yW = aVar.w();
                    p210v8.i.c(abstractC0151yW);
                    mVar = m.f7345t;
                    if (b0.c(abstractC0151yW, mVar, null)) {
                        z10 = true;
                    } else {
                        xVarR2 = aVar.R();
                        if (xVarR2 != null) {
                            zC = b0.c(xVarR2.getType(), mVar, null);
                        } else {
                            zC = false;
                        }
                        if (zC) {
                            List listH3 = aVar.H0();
                            p210v8.i.e(listH3, "valueParameters");
                            list = listH3;
                            if (!(list instanceof Collection)) {
                                it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z11 = false;
                                        break;
                                    }
                                    type3 = ((U) it2.next()).getType();
                                    p210v8.i.e(type3, "it.type");
                                    if (b0.c(type3, mVar, null)) {
                                        z11 = true;
                                        break;
                                    }
                                }
                            } else {
                                it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z11 = false;
                                        break;
                                    }
                                    type3 = ((U) it2.next()).getType();
                                    p210v8.i.e(type3, "it.type");
                                    if (b0.c(type3, mVar, null)) {
                                        z11 = true;
                                        break;
                                    }
                                }
                            }
                            if (z11) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        fVar = new p076h8.f(p154p9.a.a, new U8.h());
                    } else {
                        fVar = null;
                    }
                    if (type == null) {
                        if (type == null) {
                            xVarR = aVar.R();
                            if (xVarR != null) {
                                type = xVarR.getType();
                            } else {
                                type = null;
                            }
                        }
                        i10 = 10;
                        arrayList2 = new ArrayList(m.H(arrayList, 10));
                        it = arrayList.iterator();
                        while (true) {
                            i11 = i13;
                            if (it.hasNext()) {
                                if (abstractC0151yB == null) {
                                    abstractC0151yB = aVar.w();
                                    p210v8.i.c(abstractC0151yB);
                                }
                                B10 = aVar.B0(type, arrayList2, abstractC0151yB, fVar);
                                break;
                                break;
                            }
                            next = it.next();
                            i13 = i11 + 1;
                            if (i11 >= 0) {
                                p086i8.l.G();
                                throw null;
                            }
                            type2 = (AbstractC0151y) next;
                            if (type2 == null) {
                                type2 = ((U) aVar.H0().get(i11)).getType();
                                p210v8.i.e(type2, "valueParameters[index].type");
                            }
                            arrayList2.add(type2);
                        }
                    } else {
                        if (type == null) {
                            xVarR = aVar.R();
                            if (xVarR != null) {
                                type = xVarR.getType();
                            } else {
                                type = null;
                            }
                        }
                        i10 = 10;
                        arrayList2 = new ArrayList(m.H(arrayList, 10));
                        it = arrayList.iterator();
                        while (true) {
                            i11 = i13;
                            if (it.hasNext()) {
                                if (abstractC0151yB == null) {
                                    abstractC0151yB = aVar.w();
                                    p210v8.i.c(abstractC0151yB);
                                }
                                B10 = aVar.B0(type, arrayList2, abstractC0151yB, fVar);
                                break;
                                break;
                            }
                            next = it.next();
                            i13 = i11 + 1;
                            if (i11 >= 0) {
                                p086i8.l.G();
                                throw null;
                            }
                            type2 = (AbstractC0151y) next;
                            if (type2 == null) {
                                type2 = ((U) aVar.H0().get(i11)).getType();
                                p210v8.i.e(type2, "valueParameters[index].type");
                            }
                            arrayList2.add(type2);
                        }
                    }
                }
            } else {
                i10 = i12;
            }
            arrayList3.add(B10);
            i12 = i10;
        }
        return arrayList3;
    }
}
