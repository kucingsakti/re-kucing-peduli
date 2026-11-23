package p124m9;

import A9.AbstractC0151y;
import A9.D;
import L8.C0286u;
import L8.C0291z;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.K;
import L8.Q;
import L8.T;
import O8.L;
import p096j9.b;
import p096j9.c;
import p096j9.f;
import p165q9.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    static {
        b.j(new c("kotlin.jvm.JvmInline"));
    }

    public static final boolean a(InterfaceC0269c interfaceC0269c) {
        i.f(interfaceC0269c, "<this>");
        if (!(interfaceC0269c instanceof L)) {
            return false;
        }
        K kZ0 = ((L) interfaceC0269c).Z0();
        i.e(kZ0, "correspondingProperty");
        return d(kZ0);
    }

    public static final boolean b(InterfaceC0276j interfaceC0276j) {
        i.f(interfaceC0276j, "<this>");
        return (interfaceC0276j instanceof InterfaceC0271e) && (((InterfaceC0271e) interfaceC0276j).t0() instanceof C0286u);
    }

    public static final boolean c(AbstractC0151y abstractC0151y) {
        i.f(abstractC0151y, "<this>");
        InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
        if (interfaceC0273gW != null) {
            return b(interfaceC0273gW);
        }
        return false;
    }

    public static final boolean d(T t7) {
        if (t7.R() != null) {
            return false;
        }
        InterfaceC0276j interfaceC0276jV = t7.v();
        f fVar = null;
        InterfaceC0271e interfaceC0271e = interfaceC0276jV instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0276jV : null;
        if (interfaceC0271e != null) {
            int i10 = d.a;
            Q qT0 = interfaceC0271e.t0();
            C0286u c0286u = qT0 instanceof C0286u ? (C0286u) qT0 : null;
            if (c0286u != null) {
                fVar = c0286u.a;
            }
        }
        return i.a(fVar, t7.getName());
    }

    public static final boolean e(InterfaceC0276j interfaceC0276j) {
        if (b(interfaceC0276j)) {
            return true;
        }
        return (interfaceC0276j instanceof InterfaceC0271e) && (((InterfaceC0271e) interfaceC0276j).t0() instanceof C0291z);
    }

    public static final D f(AbstractC0151y abstractC0151y) {
        i.f(abstractC0151y, "<this>");
        InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
        InterfaceC0271e interfaceC0271e = interfaceC0273gW instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gW : null;
        if (interfaceC0271e != null) {
            int i10 = d.a;
            Q qT0 = interfaceC0271e.t0();
            C0286u c0286u = qT0 instanceof C0286u ? (C0286u) qT0 : null;
            if (c0286u != null) {
                return (D) c0286u.f2839b;
            }
        }
        return null;
    }
}
