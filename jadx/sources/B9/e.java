package B9;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.C0141n;
import A9.C0150x;
import A9.D;
import A9.O;
import A9.S;
import A9.T;
import A9.d0;
import L8.P;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f778s = new e();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f779t = new e();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [A9.x] */
    /* JADX WARN: Type inference failed for: r0v2, types: [A9.x] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [L8.P] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static D x(D d3) {
        AbstractC0151y abstractC0151yB;
        O oD = d3.D();
        ?? r10 = 0;
        if (oD instanceof p135n9.c) {
            p135n9.c cVar = (p135n9.c) oD;
            S s9 = cVar.a;
            if (s9.a() != 2) {
                s9 = null;
            }
            d0 d0VarD0 = (s9 == null || (abstractC0151yB = s9.b()) == null) ? null : abstractC0151yB.D0();
            if (cVar.f13410b == null) {
                Collection collectionT = cVar.t();
                ArrayList arrayList = new ArrayList(p086i8.m.H(collectionT, 10));
                Iterator it = collectionT.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC0151y) it.next()).D0());
                }
                S s10 = cVar.a;
                p210v8.i.f(s10, "projection");
                cVar.f13410b = new j(s10, new i(0, arrayList), (P) r10, 8);
            }
            j jVar = cVar.f13410b;
            p210v8.i.c(jVar);
            return new h(1, jVar, d0VarD0, d3.o(), d3.H(), 32);
        }
        if (!(oD instanceof C0150x) || !d3.H()) {
            return d3;
        }
        ?? r11 = (C0150x) oD;
        LinkedHashSet linkedHashSet = r11.f392b;
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z6 = false;
        while (it2.hasNext()) {
            arrayList2.add(qa.b.s((AbstractC0151y) it2.next()));
            z6 = true;
        }
        if (z6) {
            AbstractC0151y abstractC0151y = r11.a;
            d0 d0VarS = abstractC0151y != null ? qa.b.s(abstractC0151y) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            C0150x c0150x = new C0150x(linkedHashSet2);
            c0150x.a = d0VarS;
            r10 = c0150x;
        }
        if (r10 != 0) {
            r11 = r10;
        }
        return r11.b();
    }

    @Override // B9.b
    public int A(D9.e eVar) {
        p210v8.i.f(eVar, "<this>");
        if (eVar instanceof D9.d) {
            return g.c((D9.c) eVar);
        }
        if (eVar instanceof D9.a) {
            return ((D9.a) eVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + eVar + ", " + p210v8.u.a.b(eVar.getClass())).toString());
    }

    @Override // B9.b
    public boolean A0(D9.d dVar) {
        p210v8.i.f(dVar, "<this>");
        return g.y(g.W(dVar));
    }

    @Override // B9.b
    public D9.c B(D9.c cVar) {
        return g.a0(this, cVar);
    }

    @Override // B9.b
    public boolean B0(D9.b bVar) {
        p210v8.i.f(bVar, "$receiver");
        return bVar instanceof p135n9.a;
    }

    @Override // B9.b
    public S C(p135n9.b bVar) {
        return g.T(bVar);
    }

    @Override // B9.b
    public d0 D(ArrayList arrayList) {
        D d3;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (d0) p086i8.k.k0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z6 = false;
        boolean z10 = false;
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            z6 = z6 || AbstractC0130c.j(d0Var);
            if (d0Var instanceof D) {
                d3 = (D) d0Var;
            } else {
                if (!(d0Var instanceof A9.r)) {
                    throw new NoWhenBranchMatchedException();
                }
                p210v8.i.f(d0Var, "<this>");
                d3 = ((A9.r) d0Var).f383t;
                z10 = true;
            }
            arrayList2.add(d3);
        }
        if (z6) {
            return C9.i.c(C9.h.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        u uVar = u.a;
        if (!z10) {
            return uVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(p086i8.m.H(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC0130c.z((d0) it2.next()));
        }
        return C0133f.j(uVar.b(arrayList2), uVar.b(arrayList3));
    }

    @Override // B9.b
    public D G(A9.r rVar) {
        return g.Y(rVar);
    }

    @Override // B9.b
    public int H(D9.b bVar) {
        return g.k(bVar);
    }

    @Override // B9.b
    public S I(D9.d dVar, int i10) {
        p210v8.i.f(dVar, "<this>");
        if (i10 < 0 || i10 >= g.c(dVar)) {
            return null;
        }
        return g.p(dVar, i10);
    }

    @Override // B9.b
    public D9.d J(D9.d dVar) {
        D dQ;
        p210v8.i.f(dVar, "<this>");
        C0141n c0141nF = g.f(dVar);
        return (c0141nF == null || (dQ = g.Q(c0141nF)) == null) ? dVar : dQ;
    }

    @Override // B9.b
    public boolean K(S s9) {
        return g.K(s9);
    }

    @Override // B9.b
    public int L(D9.f fVar) {
        return g.R(fVar);
    }

    @Override // B9.b
    public int M(D9.c cVar) {
        return g.c(cVar);
    }

    @Override // B9.b
    public D9.e O(D9.d dVar) {
        return g.d(dVar);
    }

    @Override // B9.b
    public boolean P(D9.d dVar) {
        p210v8.i.f(dVar, "<this>");
        D dH = g.h(dVar);
        return (dH != null ? g.e(this, dH) : null) != null;
    }

    @Override // B9.b
    public d0 Q(S s9) {
        return g.r(s9);
    }

    @Override // B9.b
    public int R(P p10) {
        p210v8.i.f(p10, "$receiver");
        int iJ0 = p10.j0();
        AbstractC0487g.u(iJ0, "this.variance");
        return com.bumptech.glide.d.g(iJ0);
    }

    @Override // B9.b
    public D S(D9.d dVar) {
        return g.j(dVar);
    }

    @Override // B9.b
    public D U(D9.c cVar) {
        return g.h(cVar);
    }

    @Override // B9.b
    public d0 V(D9.c cVar) {
        return g.P(cVar);
    }

    @Override // B9.b
    public void W(D9.c cVar) {
        p210v8.i.f(cVar, "<this>");
        g.g(cVar);
    }

    @Override // B9.b
    public boolean Y(D9.f fVar) {
        return g.G(fVar);
    }

    @Override // B9.b
    public boolean a(D9.c cVar) {
        p210v8.i.f(cVar, "<this>");
        D dH = g.h(cVar);
        return (dH != null ? g.f(dH) : null) != null;
    }

    @Override // B9.b
    public d0 a0(D9.d dVar, D9.d dVar2) {
        return g.m(this, dVar, dVar2);
    }

    public D9.c b(D9.c cVar) {
        D dZ;
        p210v8.i.f(cVar, "<this>");
        D dH = g.h(cVar);
        return (dH == null || (dZ = g.Z(dH, true)) == null) ? cVar : dZ;
    }

    @Override // B9.b
    public boolean b0(P p10, D9.f fVar) {
        return g.v(p10, fVar);
    }

    public d0 c(D9.c cVar) {
        d0 d0VarJ;
        p210v8.i.f(cVar, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        if (!(cVar instanceof AbstractC0151y)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        d0 d0VarD0 = ((AbstractC0151y) cVar).D0();
        if (d0VarD0 instanceof D) {
            d0VarJ = x((D) d0VarD0);
        } else {
            if (!(d0VarD0 instanceof A9.r)) {
                throw new NoWhenBranchMatchedException();
            }
            A9.r rVar = (A9.r) d0VarD0;
            D d3 = rVar.f383t;
            D dX = x(d3);
            D d8 = rVar.f384u;
            D dX2 = x(d8);
            d0VarJ = (dX == d3 && dX2 == d8) ? d0VarD0 : C0133f.j(dX, dX2);
        }
        AbstractC0151y abstractC0151yF = AbstractC0130c.f(d0VarD0);
        return AbstractC0130c.B(d0VarJ, abstractC0151yF != null ? c(abstractC0151yF) : null);
    }

    @Override // B9.b
    public boolean c0(D9.f fVar) {
        return g.D(fVar);
    }

    @Override // B9.b
    public a d(D9.d dVar) {
        return g.U(this, dVar);
    }

    @Override // B9.b
    public boolean d0(D9.d dVar, D9.d dVar2) {
        return g.w(dVar, dVar2);
    }

    @Override // B9.b
    public boolean e(D9.f fVar, D9.f fVar2) {
        return g.b(fVar, fVar2);
    }

    @Override // B9.b
    public D9.b e0(D9.d dVar) {
        return g.e(this, dVar);
    }

    @Override // B9.b
    public boolean f(D9.d dVar) {
        return g.B(dVar);
    }

    @Override // B9.b
    public boolean f0(d0 d0Var) {
        p210v8.i.f(d0Var, "<this>");
        return g.F(o(d0Var)) != g.F(u0(d0Var));
    }

    @Override // B9.b
    public Collection g0(D9.f fVar) {
        return g.V(fVar);
    }

    @Override // B9.b
    public S h(D9.c cVar, int i10) {
        return g.p(cVar, i10);
    }

    @Override // B9.b
    public O h0(D9.d dVar) {
        return g.W(dVar);
    }

    @Override // B9.b
    public Set i(D9.d dVar) {
        return g.S(this, dVar);
    }

    @Override // B9.b
    public boolean i0(D9.d dVar) {
        p210v8.i.f(dVar, "<this>");
        return g.G(j(dVar)) && !g.H(dVar);
    }

    @Override // B9.b
    public O j(D9.c cVar) {
        p210v8.i.f(cVar, "<this>");
        D dH = g.h(cVar);
        if (dH == null) {
            dH = o(cVar);
        }
        return g.W(dH);
    }

    @Override // B9.b
    public boolean k(D9.f fVar) {
        return g.y(fVar);
    }

    @Override // B9.b
    public boolean l(D9.f fVar) {
        return g.z(fVar);
    }

    @Override // B9.b
    public boolean m(D9.f fVar) {
        return g.E(fVar);
    }

    @Override // B9.b
    public int m0(S s9) {
        return g.t(s9);
    }

    @Override // B9.b
    public C0141n n(D9.d dVar) {
        return g.f(dVar);
    }

    @Override // B9.b
    public boolean n0(D9.b bVar) {
        return g.J(bVar);
    }

    @Override // B9.b
    public D o(D9.c cVar) {
        D dN;
        p210v8.i.f(cVar, "<this>");
        A9.r rVarG = g.g(cVar);
        if (rVarG != null && (dN = g.N(rVarG)) != null) {
            return dN;
        }
        D dH = g.h(cVar);
        p210v8.i.c(dH);
        return dH;
    }

    @Override // B9.b
    public P p(D9.f fVar, int i10) {
        return g.q(fVar, i10);
    }

    @Override // B9.b
    public boolean p0(D9.f fVar) {
        return g.x(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // B9.b
    public S q(D9.e eVar, int i10) {
        p210v8.i.f(eVar, "<this>");
        if (eVar instanceof D9.d) {
            return g.p((D9.c) eVar, i10);
        }
        if (eVar instanceof D9.a) {
            E e10 = ((D9.a) eVar).get(i10);
            p210v8.i.e(e10, "get(index)");
            return (S) e10;
        }
        throw new IllegalStateException(("unknown type argument list type: " + eVar + ", " + p210v8.u.a.b(eVar.getClass())).toString());
    }

    @Override // B9.b
    public boolean q0(D9.d dVar) {
        return g.F(dVar);
    }

    @Override // B9.b
    public j r(D9.b bVar) {
        return g.X(bVar);
    }

    @Override // B9.b
    public D r0(A9.r rVar) {
        return g.N(rVar);
    }

    @Override // B9.b
    public d0 s(D9.b bVar) {
        return g.O(bVar);
    }

    @Override // B9.b
    public boolean s0(D9.c cVar) {
        p210v8.i.f(cVar, "$receiver");
        return cVar instanceof p019b9.g;
    }

    @Override // B9.b
    public A9.r t(D9.c cVar) {
        return g.g(cVar);
    }

    @Override // B9.b
    public boolean u(D9.d dVar) {
        p210v8.i.f(dVar, "<this>");
        return g.D(g.W(dVar));
    }

    @Override // B9.b
    public D u0(D9.c cVar) {
        D dY;
        p210v8.i.f(cVar, "<this>");
        A9.r rVarG = g.g(cVar);
        if (rVarG != null && (dY = g.Y(rVarG)) != null) {
            return dY;
        }
        D dH = g.h(cVar);
        p210v8.i.c(dH);
        return dH;
    }

    @Override // B9.b
    public D v(C0141n c0141n) {
        return g.Q(c0141n);
    }

    @Override // B9.b
    public void v0(D9.d dVar) {
        g.M(dVar);
    }

    @Override // B9.b
    public void w(D9.d dVar) {
        g.L(dVar);
    }

    @Override // B9.b
    public D y(D9.d dVar, boolean z6) {
        return g.Z(dVar, z6);
    }

    @Override // B9.b
    public T z(D9.c cVar) {
        return g.i(cVar);
    }

    @Override // B9.b
    public boolean z0(D9.f fVar) {
        return g.A(fVar);
    }

    @Override // B9.b
    public void g(D9.d dVar, D9.f fVar) {
    }
}
