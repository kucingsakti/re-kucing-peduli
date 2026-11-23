package F8;

import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import O8.AbstractC0359o;
import java.lang.reflect.Method;
import p047e9.C0620l;
import p047e9.C0632y;
import p104k9.AbstractC0672a;
import p104k9.C0678g;

/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {
    public static final p096j9.b a = p096j9.b.j(new p096j9.c("java.lang.Void"));

    /* JADX WARN: Multi-variable type inference failed */
    public static C0217k a(InterfaceC0285t interfaceC0285t) {
        String strK = p086i8.C.k(interfaceC0285t);
        if (strK == null) {
            if (interfaceC0285t instanceof O8.L) {
                String strG = p165q9.d.k(interfaceC0285t).getName().g();
                p210v8.i.e(strG, "descriptor.propertyIfAccessor.name.asString()");
                strK = U8.w.a(strG);
            } else if (interfaceC0285t instanceof O8.M) {
                String strG2 = p165q9.d.k(interfaceC0285t).getName().g();
                p210v8.i.e(strG2, "descriptor.propertyIfAccessor.name.asString()");
                strK = U8.w.b(strG2);
            } else {
                strK = ((AbstractC0359o) interfaceC0285t).getName().g();
                p210v8.i.e(strK, "descriptor.name.asString()");
            }
        }
        return new C0217k(new i9.e(strK, qa.b.c(interfaceC0285t, 1)));
    }

    public static t0 b(L8.K k3) {
        p210v8.i.f(k3, "possiblyOverriddenProperty");
        L8.K kC = ((L8.K) p124m9.e.t(k3)).c();
        p210v8.i.e(kC, "unwrapFakeOverride(possi…rriddenProperty).original");
        if (kC instanceof p238y9.o) {
            p238y9.o oVar = (p238y9.o) kC;
            p104k9.m mVar = h9.k.f11880d;
            p210v8.i.e(mVar, "propertySignature");
            p047e9.G g8 = oVar.f16104S;
            h9.e eVar = (h9.e) xa.d.m(g8, mVar);
            if (eVar != null) {
                return new C0220n(kC, g8, eVar, oVar.f16105T, oVar.f16106U);
            }
        } else if (kC instanceof W8.g) {
            L8.M mG = ((W8.g) kC).g();
            Q8.f fVar = mG instanceof Q8.f ? (Q8.f) mG : null;
            R8.r rVar = fVar != null ? fVar.f4344s : null;
            if (rVar instanceof R8.t) {
                return new C0218l(((R8.t) rVar).a);
            }
            if (!(rVar instanceof R8.w)) {
                throw new p0("Incorrect resolution sequence for Java field " + kC + " (source = " + rVar + ')', 0);
            }
            Method method = ((R8.w) rVar).a;
            O8.M mH = kC.h();
            L8.M mG2 = mH != null ? mH.g() : null;
            Q8.f fVar2 = mG2 instanceof Q8.f ? (Q8.f) mG2 : null;
            R8.r rVar2 = fVar2 != null ? fVar2.f4344s : null;
            R8.w wVar = rVar2 instanceof R8.w ? (R8.w) rVar2 : null;
            return new C0219m(method, wVar != null ? wVar.a : null);
        }
        O8.L lE = kC.e();
        p210v8.i.c(lE);
        C0217k c0217kA = a(lE);
        O8.M mH2 = kC.h();
        return new C0221o(c0217kA, mH2 != null ? a(mH2) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t0 c(InterfaceC0285t interfaceC0285t) {
        Method method;
        p210v8.i.f(interfaceC0285t, "possiblySubstitutedFunction");
        InterfaceC0285t interfaceC0285tC = ((InterfaceC0285t) p124m9.e.t(interfaceC0285t)).c();
        p210v8.i.e(interfaceC0285tC, "unwrapFakeOverride(possi…titutedFunction).original");
        if (interfaceC0285tC instanceof p238y9.b) {
            p238y9.b bVar = (p238y9.b) interfaceC0285tC;
            AbstractC0672a abstractC0672aW = bVar.W();
            if (abstractC0672aW instanceof C0632y) {
                C0678g c0678g = i9.h.a;
                i9.e eVarC = i9.h.c((C0632y) abstractC0672aW, bVar.J0(), bVar.w0());
                if (eVarC != null) {
                    return new C0217k(eVarC);
                }
            }
            if (abstractC0672aW instanceof C0620l) {
                C0678g c0678g2 = i9.h.a;
                i9.e eVarA = i9.h.a((C0620l) abstractC0672aW, bVar.J0(), bVar.w0());
                if (eVarA != null) {
                    InterfaceC0276j interfaceC0276jV = interfaceC0285t.v();
                    p210v8.i.e(interfaceC0276jV, "possiblySubstitutedFunction.containingDeclaration");
                    return p124m9.g.b(interfaceC0276jV) ? new C0217k(eVarA) : new C0216j(eVarA);
                }
            }
            return a(interfaceC0285tC);
        }
        if (interfaceC0285tC instanceof W8.f) {
            L8.M mG = ((W8.f) interfaceC0285tC).g();
            Q8.f fVar = mG instanceof Q8.f ? (Q8.f) mG : null;
            R8.r rVar = fVar != null ? fVar.f4344s : null;
            R8.w wVar = rVar instanceof R8.w ? (R8.w) rVar : null;
            if (wVar != null && (method = wVar.a) != null) {
                return new C0215i(method);
            }
            throw new p0("Incorrect resolution sequence for Java method " + interfaceC0285tC, 0);
        }
        if (!(interfaceC0285tC instanceof W8.b)) {
            AbstractC0359o abstractC0359o = (AbstractC0359o) interfaceC0285tC;
            if ((abstractC0359o.getName().equals(I8.o.f2190c) && p124m9.m.n(interfaceC0285tC)) || ((abstractC0359o.getName().equals(I8.o.a) && p124m9.m.n(interfaceC0285tC)) || (p210v8.i.a(abstractC0359o.getName(), K8.a.f2622e) && interfaceC0285tC.H0().isEmpty()))) {
                return a(interfaceC0285tC);
            }
            throw new p0("Unknown origin of " + interfaceC0285tC + " (" + interfaceC0285tC.getClass() + ')', 0);
        }
        L8.M mG2 = ((W8.b) interfaceC0285tC).g();
        Q8.f fVar2 = mG2 instanceof Q8.f ? (Q8.f) mG2 : null;
        Object obj = fVar2 != null ? fVar2.f4344s : null;
        if (obj instanceof R8.q) {
            return new C0214h(((R8.q) obj).a);
        }
        if (obj instanceof R8.n) {
            R8.n nVar = (R8.n) obj;
            if (nVar.a.isAnnotation()) {
                return new C0213g(nVar.a);
            }
        }
        throw new p0("Incorrect resolution sequence for Java constructor " + interfaceC0285tC + " (" + obj + ')', 0);
    }
}
