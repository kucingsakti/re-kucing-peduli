package F8;

import L8.AbstractC0281o;
import L8.InterfaceC0269c;
import L8.InterfaceC0276j;
import R8.AbstractC0408c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p230x9.d f1632s = new p230x9.d(3);

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Type inference failed for: r1v35, types: [h8.d, java.lang.Object] */
    public static final G8.e a(e0 e0Var, boolean z6) throws ClassNotFoundException {
        C0217k c0217k;
        Method method;
        G8.e pVar;
        h9.c cVar;
        G8.e rVar;
        if (D.f1511s.a(e0Var.l().f1594v)) {
            return G8.y.a;
        }
        p096j9.b bVar = w0.a;
        t0 t0VarB = w0.b(e0Var.l().g());
        if (t0VarB instanceof C0220n) {
            C0220n c0220n = (C0220n) t0VarB;
            h9.e eVar = c0220n.f1609v;
            Method methodC = null;
            if (z6) {
                if ((eVar.f11834t & 4) == 4) {
                    cVar = eVar.f11837w;
                } else {
                    cVar = null;
                }
            } else if ((eVar.f11834t & 8) == 8) {
                cVar = eVar.f11838x;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                D d3 = e0Var.l().f1592t;
                int i10 = cVar.f11820u;
                p067g9.f fVar = c0220n.f1610w;
                methodC = d3.c(fVar.getString(i10), fVar.getString(cVar.f11821v));
            }
            if (methodC != null) {
                if (!Modifier.isStatic(methodC.getModifiers())) {
                    rVar = e0Var.j() ? new G8.p(methodC, i(e0Var)) : new G8.s(0, methodC);
                } else if (e0Var.l().g().q().E(y0.a)) {
                    rVar = e0Var.j() ? new G8.q(methodC) : new G8.s(1, methodC);
                } else {
                    rVar = e0Var.j() ? new G8.r(methodC, i(e0Var)) : new G8.s(2, methodC);
                }
                pVar = rVar;
            } else if (p124m9.g.d(e0Var.l().g()) && p210v8.i.a(e0Var.l().g().f(), AbstractC0281o.f2821d)) {
                Class clsH = C4.a.H(e0Var.l().g().v());
                if (clsH == null) {
                    throw new p0("Underlying property of inline class " + e0Var.l() + " should have a field", 0);
                }
                Method methodZ = C4.a.z(clsH, e0Var.l().g());
                pVar = e0Var.j() ? new G8.v(methodZ, i(e0Var)) : new G8.w(methodZ, com.bumptech.glide.d.u(methodZ.getDeclaringClass()));
            } else {
                Field field = (Field) e0Var.l().f1596x.getValue();
                if (field == null) {
                    throw new p0("No accessors or field is found for property " + e0Var.l(), 0);
                }
                pVar = f(e0Var, z6, field);
            }
        } else if (t0VarB instanceof C0218l) {
            pVar = f(e0Var, z6, ((C0218l) t0VarB).f1598t);
        } else {
            if (!(t0VarB instanceof C0219m)) {
                if (!(t0VarB instanceof C0221o)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z6) {
                    c0217k = ((C0221o) t0VarB).f1617t;
                } else {
                    c0217k = ((C0221o) t0VarB).f1618u;
                    if (c0217k == null) {
                        throw new p0("No setter found for property " + e0Var.l(), 0);
                    }
                }
                D d8 = e0Var.l().f1592t;
                i9.e eVar2 = c0217k.f1589t;
                Method methodC2 = d8.c(eVar2.f12335b, eVar2.f12336c);
                if (methodC2 != null) {
                    Modifier.isStatic(methodC2.getModifiers());
                    return e0Var.j() ? new G8.p(methodC2, i(e0Var)) : new G8.s(0, methodC2);
                }
                throw new p0("No accessor found for property " + e0Var.l(), 0);
            }
            if (z6) {
                method = ((C0219m) t0VarB).f1601t;
            } else {
                C0219m c0219m = (C0219m) t0VarB;
                method = c0219m.f1602u;
                if (method == null) {
                    throw new p0("No source found for setter of Java method property: " + c0219m.f1601t, 0);
                }
            }
            pVar = e0Var.j() ? new G8.p(method, i(e0Var)) : new G8.s(0, method);
        }
        return C4.a.m(pVar, e0Var.k(), false);
    }

    public static final String c(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        p210v8.i.e(parameterTypes, "parameterTypes");
        sb.append(p086i8.i.A(parameterTypes, "(", ")", C0208b.f1557B, 24));
        Class<?> returnType = method.getReturnType();
        p210v8.i.e(returnType, "returnType");
        sb.append(AbstractC0408c.b(returnType));
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    public static final G8.t f(e0 e0Var, boolean z6, Field field) {
        boolean z10;
        L8.K kG = e0Var.l().g();
        InterfaceC0276j interfaceC0276jV = kG.v();
        p210v8.i.e(interfaceC0276jV, "containingDeclaration");
        boolean z11 = true;
        if (p124m9.e.l(interfaceC0276jV)) {
            InterfaceC0276j interfaceC0276jV2 = interfaceC0276jV.v();
            if ((p124m9.e.n(interfaceC0276jV2, 2) || p124m9.e.n(interfaceC0276jV2, 5)) && (!(kG instanceof p238y9.o) || !i9.h.d(((p238y9.o) kG).f16104S))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    z10 = false;
                    if (e0Var.l().g().q().E(y0.a)) {
                        if (z6) {
                        }
                    }
                    if (z6) {
                        if (e0Var.j()) {
                        }
                    }
                    if (e0Var.j()) {
                    }
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            z10 = false;
            if (e0Var.l().g().q().E(y0.a)) {
                return z6 ? new G8.j(field, z10, 2) : new G8.n(field, g(e0Var), false, 2);
            }
            if (z6) {
                return e0Var.j() ? new G8.i(field, false) : new G8.j(field, z11, 1);
            }
            return e0Var.j() ? new G8.m(field, g(e0Var), false) : new G8.n(field, g(e0Var), true, 1);
        }
        if (z6) {
            if (e0Var.j()) {
                return new G8.h(field, i(e0Var));
            }
            p210v8.i.f(field, "field");
            return new G8.j(field, z11, 0);
        }
        if (e0Var.j()) {
            return new G8.l(field, g(e0Var), i(e0Var));
        }
        boolean zG = g(e0Var);
        p210v8.i.f(field, "field");
        return new G8.n(field, zG, true, 0);
    }

    public static final boolean g(e0 e0Var) {
        return !A9.b0.e(e0Var.l().g().getType());
    }

    public static final Object i(e0 e0Var) {
        p210v8.i.f(e0Var, "<this>");
        k0 k0VarL = e0Var.l();
        return C4.a.f(k0VarL.f1595w, k0VarL.g());
    }

    public static r0 j(InterfaceC0269c interfaceC0269c, p200u8.a aVar) {
        if (aVar != null) {
            return new r0(interfaceC0269c, aVar);
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public abstract String d();
}
