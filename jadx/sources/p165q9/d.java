package p165q9;

import B9.g;
import J9.a;
import J9.l;
import L8.D;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0274h;
import L8.InterfaceC0276j;
import L8.InterfaceC0277k;
import L8.InterfaceC0290y;
import L8.J;
import L8.K;
import O8.E;
import O8.I;
import O8.U;
import p096j9.c;
import p096j9.e;
import p096j9.f;
import p200u8.b;
import p210v8.i;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final /* synthetic */ int a = 0;

    static {
        f.j("value");
    }

    public static final boolean a(U u3) {
        Boolean boolI = l.i(com.bumptech.glide.d.u(u3), a.f14437t, b.f14439A);
        i.e(boolI, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return boolI.booleanValue();
    }

    public static InterfaceC0269c b(InterfaceC0269c interfaceC0269c, b bVar) {
        i.f(interfaceC0269c, "<this>");
        return (InterfaceC0269c) l.f(com.bumptech.glide.d.u(interfaceC0269c), new a(1), new a(new t(), bVar));
    }

    public static final c c(InterfaceC0277k interfaceC0277k) {
        i.f(interfaceC0277k, "<this>");
        e eVarH = h(interfaceC0277k);
        if (!eVarH.d()) {
            eVarH = null;
        }
        if (eVarH != null) {
            return eVarH.g();
        }
        return null;
    }

    public static final InterfaceC0271e d(M8.b bVar) {
        i.f(bVar, "<this>");
        InterfaceC0273g interfaceC0273gW = bVar.getType().D().w();
        if (interfaceC0273gW instanceof InterfaceC0271e) {
            return (InterfaceC0271e) interfaceC0273gW;
        }
        return null;
    }

    public static final I8.i e(InterfaceC0276j interfaceC0276j) {
        i.f(interfaceC0276j, "<this>");
        return j(interfaceC0276j).s();
    }

    public static final p096j9.b f(InterfaceC0273g interfaceC0273g) {
        InterfaceC0276j interfaceC0276jV;
        p096j9.b bVarF;
        if (interfaceC0273g == null || (interfaceC0276jV = interfaceC0273g.v()) == null) {
            return null;
        }
        if (interfaceC0276jV instanceof D) {
            return new p096j9.b(((E) ((D) interfaceC0276jV)).f3634w, interfaceC0273g.getName());
        }
        if (!(interfaceC0276jV instanceof InterfaceC0274h) || (bVarF = f((InterfaceC0273g) interfaceC0276jV)) == null) {
            return null;
        }
        return bVarF.d(interfaceC0273g.getName());
    }

    public static final c g(InterfaceC0276j interfaceC0276j) {
        i.f(interfaceC0276j, "<this>");
        c cVarH = p124m9.e.h(interfaceC0276j);
        if (cVarH == null) {
            cVarH = p124m9.e.g(interfaceC0276j.v()).b(interfaceC0276j.getName()).g();
        }
        if (cVarH != null) {
            return cVarH;
        }
        p124m9.e.a(4);
        throw null;
    }

    public static final e h(InterfaceC0276j interfaceC0276j) {
        i.f(interfaceC0276j, "<this>");
        e eVarG = p124m9.e.g(interfaceC0276j);
        i.e(eVarG, "getFqName(this)");
        return eVarG;
    }

    public static final void i(InterfaceC0290y interfaceC0290y) {
        i.f(interfaceC0290y, "<this>");
        if (interfaceC0290y.o0(g.a) != null) {
            throw new ClassCastException();
        }
    }

    public static final InterfaceC0290y j(InterfaceC0276j interfaceC0276j) {
        i.f(interfaceC0276j, "<this>");
        InterfaceC0290y interfaceC0290yD = p124m9.e.d(interfaceC0276j);
        i.e(interfaceC0290yD, "getContainingModule(this)");
        return interfaceC0290yD;
    }

    public static final InterfaceC0269c k(InterfaceC0269c interfaceC0269c) {
        i.f(interfaceC0269c, "<this>");
        if (!(interfaceC0269c instanceof J)) {
            return interfaceC0269c;
        }
        K kZ0 = ((I) ((J) interfaceC0269c)).Z0();
        i.e(kZ0, "correspondingProperty");
        return kZ0;
    }
}
