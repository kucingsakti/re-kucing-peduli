package p220w9;

import A9.AbstractC0151y;
import I4.c;
import J7.j;
import L8.C0280n;
import L8.D;
import L8.InterfaceC0268b;
import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import L8.InterfaceC0290y;
import L8.M;
import L8.N;
import M8.h;
import O8.C0364u;
import O8.E;
import O8.L;
import O8.U;
import O8.x;
import V3.b;
import java.util.ArrayList;
import java.util.List;
import o1.k;
import p.b1;
import p047e9.A;
import p047e9.C0620l;
import p047e9.C0632y;
import p047e9.EnumC0633z;
import p047e9.G;
import p047e9.Q;
import p047e9.Z;
import p047e9.f0;
import p067g9.a;
import p067g9.e;
import p067g9.f;
import p067g9.g;
import p086i8.t;
import p104k9.AbstractC0682k;
import p124m9.m;
import p140o4.r;
import p165q9.d;
import p210v8.i;
import p238y9.o;
import p238y9.p;
import p238y9.s;
import p247z9.l;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f15684b;

    public q(b bVar) {
        i.f(bVar, "c");
        this.a = bVar;
        c cVar = (c) bVar.a;
        this.f15684b = new k((InterfaceC0290y) cVar.f2079b, (r) cVar.f2088l);
    }

    public final K0.q a(InterfaceC0276j interfaceC0276j) {
        if (interfaceC0276j instanceof D) {
            p096j9.c cVar = ((E) ((D) interfaceC0276j)).f3634w;
            b bVar = this.a;
            return new s(cVar, (f) bVar.f5172b, (g) bVar.f5174d, (p029c9.f) bVar.f5177g);
        }
        if (interfaceC0276j instanceof p238y9.g) {
            return ((p238y9.g) interfaceC0276j).f16077N;
        }
        return null;
    }

    public final h b(AbstractC0682k abstractC0682k, int i10, int i11) {
        return !e.f11563c.c(i10).booleanValue() ? M8.g.a : new s((l) ((c) this.a.a).a, new m(this, abstractC0682k, i11, 0));
    }

    public final h c(G g8, boolean z6) {
        return !e.f11563c.c(g8.f10800v).booleanValue() ? M8.g.a : new s((l) ((c) this.a.a).a, new n(this, z6, g8));
    }

    public final p238y9.c d(C0620l c0620l, boolean z6) {
        b bVar = this.a;
        InterfaceC0276j interfaceC0276j = (InterfaceC0276j) bVar.f5173c;
        i.d(interfaceC0276j, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC0271e interfaceC0271e = (InterfaceC0271e) interfaceC0276j;
        p238y9.c cVar = new p238y9.c(interfaceC0271e, null, b(c0620l, c0620l.f11140v, 1), z6, 1, c0620l, (f) bVar.f5172b, (g) bVar.f5174d, (p067g9.h) bVar.f5175e, (p029c9.f) bVar.f5177g, null);
        b bVarC = bVar.c(cVar, p086i8.s.f12328s, (f) bVar.f5172b, (g) bVar.f5174d, (p067g9.h) bVar.f5175e, (a) bVar.f5176f);
        List list = c0620l.f11141w;
        i.e(list, "proto.valueParameterList");
        cVar.n1(((q) bVarC.f5179i).g(list, c0620l, 1), j.i((f0) e.f11564d.c(c0620l.f11140v)));
        cVar.j1(interfaceC0271e.p());
        cVar.f3774J = interfaceC0271e.i0();
        cVar.f3778N = !e.f11573n.c(c0620l.f11140v).booleanValue();
        return cVar;
    }

    public final p e(C0632y c0632y) {
        int i10;
        AbstractC0151y abstractC0151yH;
        i.f(c0632y, "proto");
        int i11 = 1;
        if ((c0632y.f11244u & 1) == 1) {
            i10 = c0632y.f11245v;
        } else {
            int i12 = c0632y.f11246w;
            i10 = ((i12 >> 8) << 6) + (i12 & 63);
        }
        int i13 = i10;
        h hVarB = b(c0632y, i13, 1);
        int i14 = c0632y.f11244u;
        int i15 = i14 & 32;
        M8.f fVar = M8.g.a;
        b bVar = this.a;
        h aVar = (i15 == 32 || (i14 & 64) == 64) ? new p238y9.a((l) ((c) bVar.a).a, new m(this, c0632y, i11, 1)) : fVar;
        p096j9.c cVarG = d.g((InterfaceC0276j) bVar.f5173c);
        int i16 = c0632y.f11247x;
        f fVar2 = (f) bVar.f5172b;
        p067g9.h hVar = cVarG.c(J7.a.i(fVar2, i16)).equals(v.a) ? p067g9.h.f11586b : (p067g9.h) bVar.f5175e;
        p096j9.f fVarI = J7.a.i(fVar2, c0632y.f11247x);
        int iU = j.u((EnumC0633z) e.f11574o.c(i13));
        g gVar = (g) bVar.f5174d;
        h hVar2 = aVar;
        p pVar = new p((InterfaceC0276j) bVar.f5173c, null, hVarB, fVarI, iU, c0632y, (f) bVar.f5172b, gVar, hVar, (p029c9.f) bVar.f5177g, null);
        List list = c0632y.f11231A;
        i.e(list, "proto.typeParameterList");
        b bVarC = bVar.c(pVar, list, (f) bVar.f5172b, (g) bVar.f5174d, (p067g9.h) bVar.f5175e, (a) bVar.f5176f);
        Q qM = C3.a.m(c0632y, gVar);
        b1 b1Var = (b1) bVarC.f5178h;
        x xVarK = (qM == null || (abstractC0151yH = b1Var.h(qM)) == null) ? null : m.k(pVar, abstractC0151yH, hVar2);
        InterfaceC0276j interfaceC0276j = (InterfaceC0276j) bVar.f5173c;
        InterfaceC0271e interfaceC0271e = interfaceC0276j instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0276j : null;
        x xVarM0 = interfaceC0271e != null ? interfaceC0271e.M0() : null;
        List list2 = c0632y.f11234D;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List list3 = c0632y.f11235E;
            i.e(list3, "contextReceiverTypeIdList");
            List<Integer> list4 = list3;
            ArrayList arrayList = new ArrayList(p086i8.m.H(list4, 10));
            for (Integer num : list4) {
                i.e(num, "it");
                arrayList.add(gVar.a(num.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i17 = 0;
        for (Object obj : list2) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                p086i8.l.G();
                throw null;
            }
            x xVarE = m.e(pVar, b1Var.h((Q) obj), null, fVar, i17);
            if (xVarE != null) {
                arrayList2.add(xVarE);
            }
            i17 = i18;
        }
        List listB = b1Var.b();
        List list5 = c0632y.f11237G;
        i.e(list5, "proto.valueParameterList");
        pVar.n1(xVarK, xVarM0, arrayList2, listB, ((q) bVarC.f5179i).g(list5, c0632y, 1), b1Var.h(C3.a.n(c0632y, gVar)), i.e((A) e.f11565e.c(i13)), j.i((f0) e.f11564d.c(i13)), t.f12329s);
        pVar.f3769E = e.f11575p.c(i13).booleanValue();
        pVar.f3770F = e.f11576q.c(i13).booleanValue();
        pVar.f3771G = e.f11579t.c(i13).booleanValue();
        pVar.f3772H = e.f11577r.c(i13).booleanValue();
        pVar.f3773I = e.f11578s.c(i13).booleanValue();
        pVar.f3777M = e.f11580u.c(i13).booleanValue();
        pVar.f3774J = e.f11581v.c(i13).booleanValue();
        pVar.f3778N = !e.f11582w.c(i13).booleanValue();
        ((i) ((c) bVar.a).f2089m).getClass();
        return pVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0111  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [O8.M] */
    /* JADX WARN: Type inference failed for: r3v26, types: [z9.h] */
    /* JADX WARN: Type inference failed for: r4v0, types: [L8.K, L8.b, O8.K, O8.p, y9.o] */
    public final o f(G g8) throws Throwable {
        int i10;
        q qVar;
        h aVar;
        boolean z6;
        int i11;
        Throwable th;
        p067g9.b bVar;
        p067g9.b bVar2;
        N n10;
        L l4;
        q qVar2;
        ?? G2;
        L lF;
        AbstractC0151y abstractC0151yH;
        i.f(g8, "proto");
        if ((g8.f10799u & 1) == 1) {
            i10 = g8.f10800v;
        } else {
            int i12 = g8.f10801w;
            i10 = ((i12 >> 8) << 6) + (i12 & 63);
        }
        b bVar3 = this.a;
        InterfaceC0276j interfaceC0276j = (InterfaceC0276j) bVar3.f5173c;
        h hVarB = b(g8, i10, 2);
        int iE = i.e((A) e.f11565e.c(i10));
        C0280n c0280nI = j.i((f0) e.f11564d.c(i10));
        boolean zBooleanValue = e.f11583x.c(i10).booleanValue();
        p096j9.f fVarI = J7.a.i((f) bVar3.f5172b, g8.f10802x);
        int iU = j.u((EnumC0633z) e.f11574o.c(i10));
        boolean zBooleanValue2 = e.f11550B.c(i10).booleanValue();
        boolean zBooleanValue3 = e.f11549A.c(i10).booleanValue();
        boolean zBooleanValue4 = e.f11552D.c(i10).booleanValue();
        boolean zBooleanValue5 = e.f11553E.c(i10).booleanValue();
        boolean zBooleanValue6 = e.f11554F.c(i10).booleanValue();
        int i13 = i10;
        g gVar = (g) bVar3.f5174d;
        ?? oVar = new o(interfaceC0276j, null, hVarB, iE, c0280nI, zBooleanValue, fVarI, iU, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, g8, (f) bVar3.f5172b, gVar, (p067g9.h) bVar3.f5175e, (p029c9.f) bVar3.f5177g);
        List list = g8.f10786A;
        i.e(list, "proto.typeParameterList");
        b bVarC = bVar3.c(oVar, list, (f) bVar3.f5172b, (g) bVar3.f5174d, (p067g9.h) bVar3.f5175e, (a) bVar3.f5176f);
        boolean zBooleanValue7 = e.f11584y.c(i13).booleanValue();
        M8.f fVar = M8.g.a;
        int i14 = 3;
        if (zBooleanValue7) {
            int i15 = g8.f10799u;
            if ((i15 & 32) == 32 || (i15 & 64) == 64) {
                qVar = this;
                aVar = new p238y9.a((l) ((c) bVar3.a).a, new m(qVar, g8, i14, 1));
            } else {
                qVar = this;
                aVar = fVar;
            }
        } else {
            qVar = this;
            aVar = fVar;
        }
        Q qO = C3.a.o(g8, gVar);
        b1 b1Var = (b1) bVarC.f5178h;
        AbstractC0151y abstractC0151yH2 = b1Var.h(qO);
        List listB = b1Var.b();
        InterfaceC0276j interfaceC0276j2 = (InterfaceC0276j) bVar3.f5173c;
        InterfaceC0271e interfaceC0271e = interfaceC0276j2 instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0276j2 : null;
        x xVarM0 = interfaceC0271e != null ? interfaceC0271e.M0() : null;
        int i16 = g8.f10799u;
        Q qA = (i16 & 32) == 32 ? g8.f10787B : (i16 & 64) == 64 ? gVar.a(g8.f10788C) : null;
        x xVarK = (qA == null || (abstractC0151yH = b1Var.h(qA)) == null) ? null : m.k(oVar, abstractC0151yH, aVar);
        List list2 = g8.f10789D;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List list3 = g8.f10790E;
            i.e(list3, "contextReceiverTypeIdList");
            List<Integer> list4 = list3;
            ArrayList arrayList = new ArrayList(p086i8.m.H(list4, 10));
            for (Integer num : list4) {
                i.e(num, "it");
                arrayList.add(gVar.a(num.intValue()));
            }
            list2 = arrayList;
        }
        List list5 = list2;
        AbstractC0151y abstractC0151y = abstractC0151yH2;
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(list5, 10));
        int i17 = 0;
        for (Object obj : list5) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                p086i8.l.G();
                throw null;
            }
            arrayList2.add(m.e(oVar, b1Var.h((Q) obj), null, fVar, i17));
            i17 = i18;
            abstractC0151y = abstractC0151y;
        }
        oVar.g1(abstractC0151y, listB, xVarM0, xVarK, arrayList2);
        p067g9.b bVar4 = e.f11563c;
        boolean zBooleanValue8 = bVar4.c(i13).booleanValue();
        p067g9.c cVar = e.f11564d;
        f0 f0Var = (f0) cVar.c(i13);
        p067g9.c cVar2 = e.f11565e;
        A a = (A) cVar2.c(i13);
        if (f0Var == null) {
            e.a(10);
            throw null;
        }
        if (a == null) {
            e.a(11);
            throw null;
        }
        if (zBooleanValue8) {
            z6 = true;
            i11 = 1 << bVar4.a;
        } else {
            z6 = true;
            i11 = 0;
        }
        int number = i11 | (a.getNumber() << cVar2.a) | (f0Var.getNumber() << cVar.a);
        p067g9.b bVar5 = e.f11558J;
        bVar5.getClass();
        p067g9.b bVar6 = e.f11559K;
        bVar6.getClass();
        p067g9.b bVar7 = e.f11560L;
        bVar7.getClass();
        N n11 = M.a;
        if (zBooleanValue7) {
            int i19 = (g8.f10799u & 256) == 256 ? g8.f10793H : number;
            boolean zBooleanValue9 = bVar5.c(i19).booleanValue();
            boolean zBooleanValue10 = bVar6.c(i19).booleanValue();
            boolean zBooleanValue11 = bVar7.c(i19).booleanValue();
            h hVarB2 = qVar.b(g8, i19, 3);
            if (zBooleanValue9) {
                bVar = bVar5;
                n10 = n11;
                th = null;
                bVar2 = bVar7;
                lF = new L(oVar, hVarB2, i.e((A) cVar2.c(i19)), j.i((f0) cVar.c(i19)), !zBooleanValue9, zBooleanValue10, zBooleanValue11, oVar.V(), null, n10);
            } else {
                bVar = bVar5;
                n10 = n11;
                th = null;
                bVar2 = bVar7;
                lF = m.f(oVar, hVarB2);
            }
            l4 = lF;
            l4.c1(oVar.w());
        } else {
            th = null;
            number = number;
            bVarC = bVarC;
            bVar = bVar5;
            cVar = cVar;
            bVar6 = bVar6;
            cVar2 = cVar2;
            bVar2 = bVar7;
            n10 = n11;
            l4 = null;
        }
        if (e.f11585z.c(i13).booleanValue()) {
            int i20 = (g8.f10799u & 512) == 512 ? g8.f10794I : number;
            boolean zBooleanValue12 = bVar.c(i20).booleanValue();
            boolean zBooleanValue13 = bVar6.c(i20).booleanValue();
            boolean zBooleanValue14 = bVar2.c(i20).booleanValue();
            qVar2 = this;
            h hVarB3 = qVar2.b(g8, i20, 4);
            if (zBooleanValue12) {
                O8.M m2 = new O8.M(oVar, hVarB3, i.e((A) cVar2.c(i20)), j.i((f0) cVar.c(i20)), !zBooleanValue12, zBooleanValue13, zBooleanValue14, oVar.V(), null, n10);
                b bVar8 = bVarC;
                U u3 = (U) p086i8.k.k0(((q) bVar8.c(m2, p086i8.s.f12328s, (f) bVar8.f5172b, (g) bVar8.f5174d, (p067g9.h) bVar8.f5175e, (a) bVar8.f5176f).f5179i).g(com.bumptech.glide.d.u(g8.f10792G), g8, 4));
                if (u3 == null) {
                    O8.M.N0(6);
                    throw th;
                }
                m2.f3677E = u3;
                G2 = m2;
            } else {
                G2 = m.g(oVar, hVarB3);
            }
        } else {
            qVar2 = this;
            G2 = th;
        }
        if (e.f11551C.c(i13).booleanValue()) {
            oVar.e1(th, new o(qVar2, g8, oVar, 1));
        }
        InterfaceC0276j interfaceC0276j3 = (InterfaceC0276j) bVar3.f5173c;
        InterfaceC0271e interfaceC0271e2 = interfaceC0276j3 instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0276j3 : null;
        if ((interfaceC0271e2 != null ? interfaceC0271e2.M() : 0) == 5) {
            oVar.e1(null, new o(qVar2, g8, oVar, 3));
        }
        oVar.d1(l4, G2, new C0364u(qVar2.c(g8, false)), new C0364u(qVar2.c(g8, z6)));
        return oVar;
    }

    public final List g(List list, AbstractC0682k abstractC0682k, int i10) {
        q qVar = this;
        b bVar = qVar.a;
        InterfaceC0276j interfaceC0276j = (InterfaceC0276j) bVar.f5173c;
        i.d(interfaceC0276j, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC0268b interfaceC0268b = (InterfaceC0268b) interfaceC0276j;
        InterfaceC0276j interfaceC0276jV = interfaceC0268b.v();
        i.e(interfaceC0276jV, "callableDescriptor.containingDeclaration");
        K0.q qVarA = qVar.a(interfaceC0276jV);
        List list2 = list;
        ArrayList arrayList = new ArrayList(p086i8.m.H(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            AbstractC0151y abstractC0151yH = null;
            if (i11 < 0) {
                p086i8.l.G();
                throw null;
            }
            Z z6 = (Z) obj;
            int i13 = (z6.f10960u & 1) == 1 ? z6.f10961v : 0;
            h sVar = (qVarA == null || !e.f11563c.c(i13).booleanValue()) ? M8.g.a : new s((l) ((c) bVar.a).a, new p(qVar, qVarA, abstractC0682k, i10, i11, z6));
            p096j9.f fVarI = J7.a.i((f) bVar.f5172b, z6.f10962w);
            g gVar = (g) bVar.f5174d;
            Q qR = C3.a.r(z6, gVar);
            b1 b1Var = (b1) bVar.f5178h;
            AbstractC0151y abstractC0151yH2 = b1Var.h(qR);
            boolean zBooleanValue = e.f11555G.c(i13).booleanValue();
            boolean zBooleanValue2 = e.f11556H.c(i13).booleanValue();
            boolean zBooleanValue3 = e.f11557I.c(i13).booleanValue();
            int i14 = z6.f10960u;
            Q qA = (i14 & 16) == 16 ? z6.f10965z : (i14 & 32) == 32 ? gVar.a(z6.f10956A) : null;
            if (qA != null) {
                abstractC0151yH = b1Var.h(qA);
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new U(interfaceC0268b, null, i11, sVar, fVarI, abstractC0151yH2, zBooleanValue, zBooleanValue2, zBooleanValue3, abstractC0151yH, M.a));
            qVar = this;
            arrayList = arrayList2;
            i11 = i12;
        }
        return p086i8.k.s0(arrayList);
    }
}
