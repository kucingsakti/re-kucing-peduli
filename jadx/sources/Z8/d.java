package Z8;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.D;
import A9.K;
import A9.O;
import A9.S;
import A9.T;
import A9.W;
import C8.E;
import C9.h;
import I8.i;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.P;
import java.util.ArrayList;
import java.util.List;
import p086i8.m;
import t9.n;

/* JADX INFO: loaded from: classes.dex */
public final class d extends W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5915c = E.A(2, false, null, 5).b(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f5916d = E.A(2, false, null, 5).b(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1.e f5917b = new o1.e(new p170r3.e(13));

    @Override // A9.W
    public final S d(AbstractC0151y abstractC0151y) {
        return new T(h(abstractC0151y, new a(2, false, false, null, 62)));
    }

    public final p076h8.f g(D d3, InterfaceC0271e interfaceC0271e, a aVar) {
        if (d3.D().u().isEmpty()) {
            return new p076h8.f(d3, Boolean.FALSE);
        }
        if (i.y(d3)) {
            S s9 = (S) d3.l().get(0);
            int iA = s9.a();
            AbstractC0151y abstractC0151yB = s9.b();
            p210v8.i.e(abstractC0151yB, "componentTypeProjection.type");
            return new p076h8.f(C0133f.r(d3.o(), d3.D(), com.bumptech.glide.d.u(new T(iA, h(abstractC0151yB, aVar))), d3.H()), Boolean.FALSE);
        }
        if (AbstractC0130c.j(d3)) {
            return new p076h8.f(C9.i.c(h.ERROR_RAW_TYPE, d3.D().toString()), Boolean.FALSE);
        }
        n nVarE = interfaceC0271e.E(this);
        p210v8.i.e(nVarE, "declaration.getMemberScope(this)");
        K kO = d3.o();
        O oI = interfaceC0271e.I();
        p210v8.i.e(oI, "declaration.typeConstructor");
        List listU = interfaceC0271e.I().u();
        p210v8.i.e(listU, "declaration.typeConstructor.parameters");
        List<P> list = listU;
        ArrayList arrayList = new ArrayList(m.H(list, 10));
        for (P p10 : list) {
            p210v8.i.e(p10, "parameter");
            o1.e eVar = this.f5917b;
            arrayList.add(p170r3.e.e(p10, aVar, eVar, eVar.T0(p10, aVar)));
        }
        return new p076h8.f(C0133f.t(kO, oI, arrayList, d3.H(), nVarE, new A0.m(interfaceC0271e, this, d3, aVar)), Boolean.TRUE);
    }

    public final AbstractC0151y h(AbstractC0151y abstractC0151y, a aVar) {
        InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
        if (interfaceC0273gW instanceof P) {
            aVar.getClass();
            return h(this.f5917b.T0((P) interfaceC0273gW, a.a(aVar, 0, true, null, null, 59)), aVar);
        }
        if (!(interfaceC0273gW instanceof InterfaceC0271e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC0273gW).toString());
        }
        InterfaceC0273g interfaceC0273gW2 = AbstractC0130c.z(abstractC0151y).D().w();
        if (interfaceC0273gW2 instanceof InterfaceC0271e) {
            p076h8.f fVarG = g(AbstractC0130c.l(abstractC0151y), (InterfaceC0271e) interfaceC0273gW, f5915c);
            D d3 = (D) fVarG.f11789s;
            boolean zBooleanValue = ((Boolean) fVarG.f11790t).booleanValue();
            p076h8.f fVarG2 = g(AbstractC0130c.z(abstractC0151y), (InterfaceC0271e) interfaceC0273gW2, f5916d);
            D d8 = (D) fVarG2.f11789s;
            return (zBooleanValue || ((Boolean) fVarG2.f11790t).booleanValue()) ? new f(d3, d8) : C0133f.j(d3, d8);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC0273gW2 + "\" while for lower it's \"" + interfaceC0273gW + '\"').toString());
    }
}
