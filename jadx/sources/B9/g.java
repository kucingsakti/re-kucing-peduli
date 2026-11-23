package B9;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.C0141n;
import A9.C0150x;
import A9.D;
import A9.G;
import A9.K;
import A9.N;
import A9.O;
import A9.P;
import A9.S;
import A9.T;
import A9.Z;
import A9.b0;
import A9.d0;
import L8.C0286u;
import L8.C0289x;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final C0289x a = new C0289x("KotlinTypeRefiner", 0);

    public static boolean A(D9.f fVar) {
        p210v8.i.f(fVar, "$receiver");
        if (fVar instanceof O) {
            return ((O) fVar).v();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, fVar.getClass(), sb).toString());
    }

    public static boolean B(D9.c cVar) {
        p210v8.i.f(cVar, "$receiver");
        if (cVar instanceof AbstractC0151y) {
            return AbstractC0130c.j((AbstractC0151y) cVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, cVar.getClass(), sb).toString());
    }

    public static boolean C(D9.f fVar) {
        p210v8.i.f(fVar, "$receiver");
        if (fVar instanceof O) {
            InterfaceC0273g interfaceC0273gW = ((O) fVar).w();
            InterfaceC0271e interfaceC0271e = interfaceC0273gW instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gW : null;
            return (interfaceC0271e != null ? interfaceC0271e.t0() : null) instanceof C0286u;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, fVar.getClass(), sb).toString());
    }

    public static boolean D(D9.f fVar) {
        p210v8.i.f(fVar, "$receiver");
        if (fVar instanceof O) {
            return fVar instanceof p145o9.m;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, fVar.getClass(), sb).toString());
    }

    public static boolean E(D9.f fVar) {
        p210v8.i.f(fVar, "$receiver");
        if (fVar instanceof O) {
            return fVar instanceof C0150x;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, fVar.getClass(), sb).toString());
    }

    public static boolean F(D9.d dVar) {
        p210v8.i.f(dVar, "$receiver");
        if (dVar instanceof D) {
            return ((D) dVar).H();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, dVar.getClass(), sb).toString());
    }

    public static boolean G(D9.f fVar) {
        p210v8.i.f(fVar, "$receiver");
        if (fVar instanceof O) {
            return I8.i.H((O) fVar, I8.n.f2164b);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, fVar.getClass(), sb).toString());
    }

    public static boolean H(D9.c cVar) {
        p210v8.i.f(cVar, "$receiver");
        if (cVar instanceof AbstractC0151y) {
            return b0.e((AbstractC0151y) cVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, cVar.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean I(D9.d dVar) {
        p210v8.i.f(dVar, "$receiver");
        if (dVar instanceof AbstractC0151y) {
            return I8.i.F((AbstractC0151y) dVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, dVar.getClass(), sb).toString());
    }

    public static boolean J(D9.b bVar) {
        if (bVar instanceof h) {
            return ((h) bVar).f785y;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, bVar.getClass(), sb).toString());
    }

    public static boolean K(S s9) {
        p210v8.i.f(s9, "$receiver");
        if (s9 instanceof S) {
            return s9.c();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(s9);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, s9.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void L(D9.d dVar) {
        p210v8.i.f(dVar, "$receiver");
        if (dVar instanceof D) {
            boolean z6 = ((AbstractC0151y) dVar) instanceof C0141n;
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, dVar.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(D9.d dVar) {
        p210v8.i.f(dVar, "$receiver");
        if (dVar instanceof D) {
            boolean z6 = ((AbstractC0151y) dVar) instanceof C0141n;
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, dVar.getClass(), sb).toString());
    }

    public static D N(A9.r rVar) {
        if (rVar instanceof A9.r) {
            return rVar.f383t;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(rVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, rVar.getClass(), sb).toString());
    }

    public static d0 O(D9.b bVar) {
        if (bVar instanceof h) {
            return ((h) bVar).f782v;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, bVar.getClass(), sb).toString());
    }

    public static d0 P(D9.c cVar) {
        if (cVar instanceof d0) {
            return AbstractC0130c.m((d0) cVar, false);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, cVar.getClass(), sb).toString());
    }

    public static D Q(C0141n c0141n) {
        if (c0141n instanceof C0141n) {
            return c0141n.f378t;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(c0141n);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, c0141n.getClass(), sb).toString());
    }

    public static int R(D9.f fVar) {
        p210v8.i.f(fVar, "$receiver");
        if (fVar instanceof O) {
            return ((O) fVar).u().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, fVar.getClass(), sb).toString());
    }

    public static Set S(b bVar, D9.d dVar) {
        p210v8.i.f(dVar, "$receiver");
        O oH0 = bVar.h0(dVar);
        if (oH0 instanceof p145o9.m) {
            return ((p145o9.m) oH0).a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, dVar.getClass(), sb).toString());
    }

    public static S T(p135n9.b bVar) {
        p210v8.i.f(bVar, "$receiver");
        if (bVar instanceof j) {
            return ((j) bVar).a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, bVar.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a U(b bVar, D9.d dVar) {
        if (dVar instanceof D) {
            AbstractC0151y abstractC0151y = (AbstractC0151y) dVar;
            return new a(bVar, new Z(P.f350b.f(abstractC0151y.D(), abstractC0151y.l())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, dVar.getClass(), sb).toString());
    }

    public static Collection V(D9.f fVar) {
        p210v8.i.f(fVar, "$receiver");
        if (fVar instanceof O) {
            Collection collectionT = ((O) fVar).t();
            p210v8.i.e(collectionT, "this.supertypes");
            return collectionT;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, fVar.getClass(), sb).toString());
    }

    public static O W(D9.d dVar) {
        p210v8.i.f(dVar, "$receiver");
        if (dVar instanceof D) {
            return ((D) dVar).D();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, dVar.getClass(), sb).toString());
    }

    public static j X(D9.b bVar) {
        p210v8.i.f(bVar, "$receiver");
        if (bVar instanceof h) {
            return ((h) bVar).f781u;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, bVar.getClass(), sb).toString());
    }

    public static D Y(A9.r rVar) {
        if (rVar instanceof A9.r) {
            return rVar.f384u;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(rVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, rVar.getClass(), sb).toString());
    }

    public static D Z(D9.d dVar, boolean z6) {
        p210v8.i.f(dVar, "$receiver");
        if (dVar instanceof D) {
            return ((D) dVar).G0(z6);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, dVar.getClass(), sb).toString());
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = R5.a.PUSH_ADDITIONAL_DATA_KEY;
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY;
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i10) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static D9.c a0(b bVar, D9.c cVar) {
        if (cVar instanceof D9.d) {
            return bVar.y((D9.d) cVar, true);
        }
        if (!(cVar instanceof A9.r)) {
            throw new IllegalStateException("sealed");
        }
        A9.r rVar = (A9.r) cVar;
        return bVar.a0(bVar.y(bVar.r0(rVar), true), bVar.y(bVar.G(rVar), true));
    }

    public static boolean b(D9.f fVar, D9.f fVar2) {
        p210v8.i.f(fVar, "c1");
        p210v8.i.f(fVar2, "c2");
        if (!(fVar instanceof O)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(fVar);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, fVar.getClass(), sb).toString());
        }
        if (fVar2 instanceof O) {
            return fVar.equals(fVar2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(fVar2);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, fVar2.getClass(), sb2).toString());
    }

    public static int c(D9.c cVar) {
        p210v8.i.f(cVar, "$receiver");
        if (cVar instanceof AbstractC0151y) {
            return ((AbstractC0151y) cVar).l().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, cVar.getClass(), sb).toString());
    }

    public static D9.e d(D9.d dVar) {
        p210v8.i.f(dVar, "$receiver");
        if (dVar instanceof D) {
            return (D9.e) dVar;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, dVar.getClass(), sb).toString());
    }

    public static D9.b e(b bVar, D9.d dVar) {
        p210v8.i.f(dVar, "$receiver");
        if (dVar instanceof D) {
            if (dVar instanceof G) {
                return bVar.e0(((G) dVar).f333t);
            }
            if (dVar instanceof h) {
                return (h) dVar;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, dVar.getClass(), sb).toString());
    }

    public static C0141n f(D9.d dVar) {
        p210v8.i.f(dVar, "$receiver");
        if (dVar instanceof D) {
            if (dVar instanceof C0141n) {
                return (C0141n) dVar;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, dVar.getClass(), sb).toString());
    }

    public static A9.r g(D9.c cVar) {
        p210v8.i.f(cVar, "$receiver");
        if (cVar instanceof AbstractC0151y) {
            d0 d0VarD0 = ((AbstractC0151y) cVar).D0();
            if (d0VarD0 instanceof A9.r) {
                return (A9.r) d0VarD0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, cVar.getClass(), sb).toString());
    }

    public static D h(D9.c cVar) {
        p210v8.i.f(cVar, "$receiver");
        if (cVar instanceof AbstractC0151y) {
            d0 d0VarD0 = ((AbstractC0151y) cVar).D0();
            if (d0VarD0 instanceof D) {
                return (D) d0VarD0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, cVar.getClass(), sb).toString());
    }

    public static T i(D9.c cVar) {
        p210v8.i.f(cVar, "$receiver");
        if (cVar instanceof AbstractC0151y) {
            return qa.b.a((AbstractC0151y) cVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, cVar.getClass(), sb).toString());
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0023  */
    public static D j(D9.d dVar) {
        ArrayList arrayList;
        e eVar;
        AbstractC0487g.p(1, "status");
        if (!(dVar instanceof D)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(dVar);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, dVar.getClass(), sb).toString());
        }
        D d3 = (D) dVar;
        i iVar = null;
        if (d3.l().size() != d3.D().u().size()) {
            arrayList = null;
        } else {
            List listL = d3.l();
            List list = listL;
            if ((list instanceof Collection) && list.isEmpty()) {
                arrayList = null;
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((S) it.next()).a() != 1) {
                        List listU = d3.D().u();
                        p210v8.i.e(listU, "type.constructor.parameters");
                        ArrayList<p076h8.f> arrayListZ0 = p086i8.k.z0(list, listU);
                        arrayList = new ArrayList(p086i8.m.H(arrayListZ0, 10));
                        for (p076h8.f fVar : arrayListZ0) {
                            S sA = (S) fVar.f11789s;
                            L8.P p10 = (L8.P) fVar.f11790t;
                            if (sA.a() != 1) {
                                d0 d0VarD0 = (sA.c() || sA.a() != 2) ? null : sA.b().D0();
                                p210v8.i.e(p10, "parameter");
                                sA = qa.b.a(new h(1, new j(sA, iVar, p10, 6), d0VarD0, (K) null, false, 56));
                            }
                            arrayList.add(sA);
                        }
                        Z z6 = new Z(P.f350b.f(d3.D(), arrayList));
                        int size = listL.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            S s9 = (S) listL.get(i10);
                            S s10 = (S) arrayList.get(i10);
                            if (s9.a() != 1) {
                                List upperBounds = ((L8.P) d3.D().u().get(i10)).getUpperBounds();
                                p210v8.i.e(upperBounds, "type.constructor.parameters[index].upperBounds");
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = upperBounds.iterator();
                                while (true) {
                                    boolean zHasNext = it2.hasNext();
                                    eVar = e.f778s;
                                    if (!zHasNext) {
                                        break;
                                    }
                                    arrayList2.add(eVar.c(z6.g(1, (AbstractC0151y) it2.next()).D0()));
                                }
                                if (!s9.c() && s9.a() == 3) {
                                    arrayList2.add(eVar.c(s9.b().D0()));
                                }
                                AbstractC0151y abstractC0151yB = s10.b();
                                p210v8.i.d(abstractC0151yB, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                                j jVar = ((h) abstractC0151yB).f781u;
                                jVar.getClass();
                                jVar.f788b = new i(1, arrayList2);
                            }
                        }
                    }
                }
                arrayList = null;
            }
        }
        if (arrayList != null) {
            return C0133f.r(d3.o(), d3.D(), arrayList, d3.H());
        }
        return null;
    }

    public static int k(D9.b bVar) {
        p210v8.i.f(bVar, "$receiver");
        if (bVar instanceof h) {
            return ((h) bVar).f780t;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, bVar.getClass(), sb).toString());
    }

    public static N l(boolean z6, e eVar, int i10) {
        f fVar = f.a;
        e eVar2 = e.f779t;
        if ((i10 & 8) != 0) {
            eVar = e.f778s;
        }
        return new N(z6, true, eVar2, eVar, fVar);
    }

    public static d0 m(b bVar, D9.d dVar, D9.d dVar2) {
        p210v8.i.f(dVar, "lowerBound");
        p210v8.i.f(dVar2, "upperBound");
        if (!(dVar instanceof D)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(bVar);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, bVar.getClass(), sb).toString());
        }
        if (dVar2 instanceof D) {
            return C0133f.j((D) dVar, (D) dVar2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(bVar);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, bVar.getClass(), sb2).toString());
    }

    public static final String n(O o10) {
        StringBuilder sb = new StringBuilder();
        o(sb, "type: " + o10);
        o(sb, "hashCode: " + o10.hashCode());
        o(sb, "javaClass: " + o10.getClass().getCanonicalName());
        for (InterfaceC0276j interfaceC0276jW = o10.w(); interfaceC0276jW != null; interfaceC0276jW = interfaceC0276jW.v()) {
            o(sb, "fqName: ".concat(p114l9.g.f12982c.w(interfaceC0276jW)));
            o(sb, "javaClass: " + interfaceC0276jW.getClass().getCanonicalName());
        }
        String string = sb.toString();
        p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final void o(StringBuilder sb, String str) {
        p210v8.i.f(str, "<this>");
        sb.append(str);
        sb.append('\n');
    }

    public static S p(D9.c cVar, int i10) {
        p210v8.i.f(cVar, "$receiver");
        if (cVar instanceof AbstractC0151y) {
            return (S) ((AbstractC0151y) cVar).l().get(i10);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, cVar.getClass(), sb).toString());
    }

    public static L8.P q(D9.f fVar, int i10) {
        p210v8.i.f(fVar, "$receiver");
        if (fVar instanceof O) {
            Object obj = ((O) fVar).u().get(i10);
            p210v8.i.e(obj, "this.parameters[index]");
            return (L8.P) obj;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, fVar.getClass(), sb).toString());
    }

    public static d0 r(S s9) {
        p210v8.i.f(s9, "$receiver");
        if (s9 instanceof S) {
            return s9.b().D0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(s9);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, s9.getClass(), sb).toString());
    }

    public static L8.P s(D9.f fVar) {
        p210v8.i.f(fVar, "$receiver");
        if (fVar instanceof O) {
            InterfaceC0273g interfaceC0273gW = ((O) fVar).w();
            if (interfaceC0273gW instanceof L8.P) {
                return (L8.P) interfaceC0273gW;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, fVar.getClass(), sb).toString());
    }

    public static int t(S s9) {
        p210v8.i.f(s9, "$receiver");
        if (s9 instanceof S) {
            int iA = s9.a();
            AbstractC0487g.u(iA, "this.projectionKind");
            return com.bumptech.glide.d.g(iA);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(s9);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, s9.getClass(), sb).toString());
    }

    public static boolean u(AbstractC0151y abstractC0151y, p096j9.c cVar) {
        p210v8.i.f(abstractC0151y, "$receiver");
        p210v8.i.f(cVar, "fqName");
        return abstractC0151y.q().E(cVar);
    }

    public static boolean v(L8.P p10, D9.f fVar) {
        if (fVar == null ? true : fVar instanceof O) {
            return qa.b.p(p10, (O) fVar, null);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(p10);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, p10.getClass(), sb).toString());
    }

    public static boolean w(D9.d dVar, D9.d dVar2) {
        p210v8.i.f(dVar, R5.a.PUSH_ADDITIONAL_DATA_KEY);
        p210v8.i.f(dVar2, "b");
        if (!(dVar instanceof D)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(dVar);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, dVar.getClass(), sb).toString());
        }
        if (dVar2 instanceof D) {
            return ((D) dVar).l() == ((D) dVar2).l();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar2);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, dVar2.getClass(), sb2).toString());
    }

    public static boolean x(D9.f fVar) {
        p210v8.i.f(fVar, "$receiver");
        if (fVar instanceof O) {
            return I8.i.H((O) fVar, I8.n.a);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, fVar.getClass(), sb).toString());
    }

    public static boolean y(D9.f fVar) {
        p210v8.i.f(fVar, "$receiver");
        if (fVar instanceof O) {
            return ((O) fVar).w() instanceof InterfaceC0271e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, fVar.getClass(), sb).toString());
    }

    public static boolean z(D9.f fVar) {
        if (fVar instanceof O) {
            InterfaceC0273g interfaceC0273gW = ((O) fVar).w();
            InterfaceC0271e interfaceC0271e = interfaceC0273gW instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gW : null;
            return (interfaceC0271e == null || interfaceC0271e.m() != 1 || interfaceC0271e.M() == 3 || interfaceC0271e.M() == 4 || interfaceC0271e.M() == 5) ? false : true;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0487g.k(p210v8.u.a, fVar.getClass(), sb).toString());
    }
}
