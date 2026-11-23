package F8;

import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements C8.v {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C8.u[] f1613v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final L8.P f1614s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r0 f1615t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o0 f1616u;

    static {
        p210v8.v vVar = p210v8.u.a;
        f1613v = new C8.u[]{vVar.f(new p210v8.n(vVar.b(n0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public n0(o0 o0Var, L8.P p10) {
        Class cls;
        A aB;
        Object objK0;
        p210v8.i.f(p10, "descriptor");
        this.f1614s = p10;
        this.f1615t = t0.j(null, new A0.r(this, 11));
        if (o0Var == null) {
            InterfaceC0276j interfaceC0276jV = p10.v();
            p210v8.i.e(interfaceC0276jV, "descriptor.containingDeclaration");
            if (interfaceC0276jV instanceof InterfaceC0271e) {
                objK0 = b((InterfaceC0271e) interfaceC0276jV);
            } else {
                if (!(interfaceC0276jV instanceof InterfaceC0269c)) {
                    throw new p0("Unknown type parameter container: " + interfaceC0276jV, 0);
                }
                InterfaceC0276j interfaceC0276jV2 = ((InterfaceC0269c) interfaceC0276jV).v();
                p210v8.i.e(interfaceC0276jV2, "declaration.containingDeclaration");
                if (interfaceC0276jV2 instanceof InterfaceC0271e) {
                    aB = b((InterfaceC0271e) interfaceC0276jV2);
                } else {
                    p238y9.i iVar = interfaceC0276jV instanceof p238y9.i ? (p238y9.i) interfaceC0276jV : null;
                    if (iVar == null) {
                        throw new p0("Non-class callable descriptor must be deserialized: " + interfaceC0276jV, 0);
                    }
                    p238y9.h hVarB = iVar.B();
                    p029c9.f fVar = hVarB instanceof p029c9.f ? (p029c9.f) hVarB : null;
                    Q8.b bVar = fVar != null ? fVar.f7551u : null;
                    Q8.b bVar2 = bVar instanceof Q8.b ? bVar : null;
                    if (bVar2 == null || (cls = bVar2.a) == null) {
                        throw new p0("Container of deserialized member is not resolved: " + iVar, 0);
                    }
                    aB = (A) p068ga.d.r(cls);
                }
                objK0 = interfaceC0276jV.k0(new A1.r(aB), p076h8.m.a);
            }
            p210v8.i.e(objK0, "when (val declaration = … $declaration\")\n        }");
            o0Var = (o0) objK0;
        }
        this.f1616u = o0Var;
    }

    public static A b(InterfaceC0271e interfaceC0271e) {
        Class clsJ = y0.j(interfaceC0271e);
        A a = (A) (clsJ != null ? p068ga.d.r(clsJ) : null);
        if (a != null) {
            return a;
        }
        throw new p0("Type parameter container is not resolved: " + interfaceC0271e.v(), 0);
    }

    public final String a() {
        String strG = this.f1614s.getName().g();
        p210v8.i.e(strG, "descriptor.name.asString()");
        return strG;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return p210v8.i.a(this.f1616u, n0Var.f1616u) && a().equals(n0Var.a());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f1616u.hashCode() * 31);
    }

    public final String toString() {
        C8.y yVar;
        StringBuilder sb = new StringBuilder();
        int iD = p239z.e.d(this.f1614s.j0());
        if (iD == 0) {
            yVar = C8.y.f964s;
        } else if (iD == 1) {
            yVar = C8.y.f965t;
        } else {
            if (iD != 2) {
                throw new NoWhenBranchMatchedException();
            }
            yVar = C8.y.f966u;
        }
        int iOrdinal = yVar.ordinal();
        if (iOrdinal == 1) {
            sb.append("in ");
        } else if (iOrdinal == 2) {
            sb.append("out ");
        }
        sb.append(a());
        String string = sb.toString();
        p210v8.i.e(string, "toString(...)");
        return string;
    }
}
