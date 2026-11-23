package L8;

import A1.C0099h;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: L8.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0287v {
    public static final C0289x a = new C0289x("InvalidModuleNotifier", 0);

    public static final C0099h a(A9.D d3, InterfaceC0274h interfaceC0274h, int i10) {
        if (interfaceC0274h == null || C9.i.f(interfaceC0274h)) {
            return null;
        }
        int size = interfaceC0274h.y().size() + i10;
        if (interfaceC0274h.r()) {
            List listSubList = d3.l().subList(i10, size);
            InterfaceC0276j interfaceC0276jV = interfaceC0274h.v();
            return new C0099h(interfaceC0274h, listSubList, a(d3, interfaceC0276jV instanceof InterfaceC0274h ? (InterfaceC0274h) interfaceC0276jV : null, size));
        }
        if (size != d3.l().size()) {
            p124m9.e.o(interfaceC0274h);
        }
        return new C0099h(interfaceC0274h, d3.l().subList(i10, d3.l().size()), (C0099h) null);
    }

    public static final void b(G g8, p096j9.c cVar, ArrayList arrayList) {
        p210v8.i.f(g8, "<this>");
        p210v8.i.f(cVar, "fqName");
        g8.a(cVar, arrayList);
    }

    public static final List c(InterfaceC0274h interfaceC0274h) {
        List listU;
        Object next;
        A9.O oI;
        p210v8.i.f(interfaceC0274h, "<this>");
        List listY = interfaceC0274h.y();
        p210v8.i.e(listY, "declaredTypeParameters");
        if (!interfaceC0274h.r() && !(interfaceC0274h.v() instanceof InterfaceC0268b)) {
            return listY;
        }
        int i10 = p165q9.d.a;
        p165q9.c cVar = p165q9.c.f14440s;
        List listB = K9.n.B(new K9.i(new K9.g(new K9.k(K9.n.u(K9.n.x(interfaceC0274h, cVar), 1), r.f2835v), true, r.f2836w), r.f2837x, K9.s.f2706A));
        Iterator it = K9.n.u(K9.n.x(interfaceC0274h, cVar), 1).iterator();
        do {
            listU = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof InterfaceC0271e));
        InterfaceC0271e interfaceC0271e = (InterfaceC0271e) next;
        if (interfaceC0271e != null && (oI = interfaceC0271e.I()) != null) {
            listU = oI.u();
        }
        if (listU == null) {
            listU = p086i8.s.f12328s;
        }
        if (listB.isEmpty() && listU.isEmpty()) {
            List listY2 = interfaceC0274h.y();
            p210v8.i.e(listY2, "declaredTypeParameters");
            return listY2;
        }
        ArrayList<P> arrayListG0 = p086i8.k.g0(listB, listU);
        ArrayList arrayList = new ArrayList(p086i8.m.H(arrayListG0, 10));
        for (P p10 : arrayListG0) {
            p210v8.i.e(p10, "it");
            arrayList.add(new C0270d(p10, interfaceC0274h, listY.size()));
        }
        return p086i8.k.g0(listY, arrayList);
    }

    public static final InterfaceC0271e d(InterfaceC0290y interfaceC0290y, p096j9.b bVar) {
        p210v8.i.f(interfaceC0290y, "<this>");
        p210v8.i.f(bVar, "classId");
        InterfaceC0273g interfaceC0273gE = e(interfaceC0290y, bVar);
        if (interfaceC0273gE instanceof InterfaceC0271e) {
            return (InterfaceC0271e) interfaceC0273gE;
        }
        return null;
    }

    public static final InterfaceC0273g e(InterfaceC0290y interfaceC0290y, p096j9.b bVar) {
        p210v8.i.f(interfaceC0290y, "<this>");
        p210v8.i.f(bVar, "classId");
        if (interfaceC0290y.o0(p124m9.m.a) != null) {
            throw new ClassCastException();
        }
        p096j9.c cVarG = bVar.g();
        p210v8.i.e(cVarG, "classId.packageFqName");
        H hK = interfaceC0290y.K(cVarG);
        List listE = bVar.h().a.e();
        t9.j jVar = ((O8.z) hK).f3799y;
        Object objT = p086i8.k.T(listE);
        p210v8.i.e(objT, "segments.first()");
        T8.b bVar2 = T8.b.f4765y;
        InterfaceC0273g interfaceC0273gA = jVar.a((p096j9.f) objT, bVar2);
        if (interfaceC0273gA != null) {
            for (p096j9.f fVar : listE.subList(1, listE.size())) {
                if (interfaceC0273gA instanceof InterfaceC0271e) {
                    t9.n nVarS0 = ((InterfaceC0271e) interfaceC0273gA).s0();
                    p210v8.i.e(fVar, MediationMetaData.KEY_NAME);
                    InterfaceC0273g interfaceC0273gA2 = nVarS0.a(fVar, bVar2);
                    interfaceC0273gA = interfaceC0273gA2 instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gA2 : null;
                    if (interfaceC0273gA != null) {
                    }
                }
            }
            return interfaceC0273gA;
        }
        return null;
    }

    public static final InterfaceC0271e f(InterfaceC0290y interfaceC0290y, p096j9.b bVar, p140o4.r rVar) {
        p210v8.i.f(interfaceC0290y, "<this>");
        p210v8.i.f(bVar, "classId");
        p210v8.i.f(rVar, "notFoundClasses");
        InterfaceC0271e interfaceC0271eD = d(interfaceC0290y, bVar);
        return interfaceC0271eD != null ? interfaceC0271eD : rVar.l(bVar, K9.n.B(K9.n.z(K9.n.x(bVar, C0283q.f2832A), r.f2833t)));
    }

    public static final InterfaceC0273g g(InterfaceC0276j interfaceC0276j) {
        p210v8.i.f(interfaceC0276j, "<this>");
        InterfaceC0276j interfaceC0276jV = interfaceC0276j.v();
        if (interfaceC0276jV == null || (interfaceC0276j instanceof D)) {
            return null;
        }
        if (!(interfaceC0276jV.v() instanceof D)) {
            return g(interfaceC0276jV);
        }
        if (interfaceC0276jV instanceof InterfaceC0273g) {
            return (InterfaceC0273g) interfaceC0276jV;
        }
        return null;
    }

    public static final boolean h(G g8, p096j9.c cVar) {
        p210v8.i.f(g8, "<this>");
        p210v8.i.f(cVar, "fqName");
        return g8.b(cVar);
    }

    public static final ArrayList i(G g8, p096j9.c cVar) {
        p210v8.i.f(g8, "<this>");
        p210v8.i.f(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        b(g8, cVar, arrayList);
        return arrayList;
    }

    public static final InterfaceC0271e j(O8.C c10, p096j9.c cVar) {
        InterfaceC0273g interfaceC0273gA;
        t9.n nVarS0;
        T8.b bVar = T8.b.f4759s;
        p210v8.i.f(c10, "<this>");
        p210v8.i.f(cVar, "fqName");
        if (!cVar.d()) {
            p096j9.c cVarE = cVar.e();
            p210v8.i.e(cVarE, "fqName.parent()");
            O8.z zVar = (O8.z) c10.K(cVarE);
            p096j9.f fVarF = cVar.f();
            p210v8.i.e(fVarF, "fqName.shortName()");
            InterfaceC0273g interfaceC0273gA2 = zVar.f3799y.a(fVarF, bVar);
            InterfaceC0271e interfaceC0271e = interfaceC0273gA2 instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gA2 : null;
            if (interfaceC0271e != null) {
                return interfaceC0271e;
            }
            p096j9.c cVarE2 = cVar.e();
            p210v8.i.e(cVarE2, "fqName.parent()");
            InterfaceC0271e interfaceC0271eJ = j(c10, cVarE2);
            if (interfaceC0271eJ == null || (nVarS0 = interfaceC0271eJ.s0()) == null) {
                interfaceC0273gA = null;
            } else {
                p096j9.f fVarF2 = cVar.f();
                p210v8.i.e(fVarF2, "fqName.shortName()");
                interfaceC0273gA = nVarS0.a(fVarF2, bVar);
            }
            if (interfaceC0273gA instanceof InterfaceC0271e) {
                return (InterfaceC0271e) interfaceC0273gA;
            }
        }
        return null;
    }
}
