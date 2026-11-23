package Y8;

import A9.AbstractC0151y;
import A9.C0133f;
import A9.b0;
import L8.InterfaceC0277k;
import L8.N;
import O8.AbstractC0347c;
import U8.EnumC0440a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC0347c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Fa.e f5730C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final R8.B f5731D;

    /* JADX WARN: Illegal instructions before constructor call */
    public F(Fa.e eVar, R8.B b3, int i10, InterfaceC0277k interfaceC0277k) {
        p210v8.i.f(b3, "javaTypeParameter");
        I4.a aVar = (I4.a) eVar.f1659t;
        super((p247z9.l) aVar.a, interfaceC0277k, new X8.b(eVar, b3, false), p096j9.f.j(b3.a.getName()), 1, false, i10, (N) aVar.f2057m);
        this.f5730C = eVar;
        this.f5731D = b3;
    }

    @Override // O8.AbstractC0354j
    public final List Z0(List list) {
        p019b9.d dVar;
        Fa.e eVar = this.f5730C;
        p019b9.d dVar2 = (p019b9.d) ((I4.a) eVar.f1659t).f2062r;
        dVar2.getClass();
        List<AbstractC0151y> list2 = list;
        ArrayList arrayList = new ArrayList(p086i8.m.H(list2, 10));
        for (AbstractC0151y abstractC0151yA : list2) {
            p019b9.m mVar = p019b9.m.f7348w;
            p210v8.i.f(abstractC0151yA, "<this>");
            if (b0.c(abstractC0151yA, mVar, null)) {
                dVar = dVar2;
            } else {
                dVar = dVar2;
                abstractC0151yA = dVar.a(new O0.a((InterfaceC0277k) this, false, eVar, EnumC0440a.TYPE_PARAMETER_BOUNDS, false), abstractC0151yA, p086i8.s.f12328s, null, false);
                if (abstractC0151yA == null) {
                    abstractC0151yA = abstractC0151yA;
                }
            }
            arrayList.add(abstractC0151yA);
            dVar2 = dVar;
        }
        return arrayList;
    }

    @Override // O8.AbstractC0354j
    public final List a1() {
        Type[] bounds = this.f5731D.a.getBounds();
        p210v8.i.e(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new R8.p(type));
        }
        R8.p pVar = (R8.p) p086i8.k.m0(arrayList);
        Collection collection = arrayList;
        if (p210v8.i.a(pVar != null ? pVar.a : null, Object.class)) {
            collection = p086i8.s.f12328s;
        }
        Collection collection2 = collection;
        boolean zIsEmpty = collection2.isEmpty();
        Fa.e eVar = this.f5730C;
        if (zIsEmpty) {
            return com.bumptech.glide.d.u(C0133f.j(((O8.C) ((I4.a) eVar.f1659t).f2059o).f3622v.e(), ((O8.C) ((I4.a) eVar.f1659t).f2059o).f3622v.o()));
        }
        Collection collection3 = collection2;
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(collection3, 10));
        Iterator it = collection3.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Y1.c) eVar.f1663x).P((R8.p) it.next(), C8.E.A(2, false, this, 3)));
        }
        return arrayList2;
    }
}
