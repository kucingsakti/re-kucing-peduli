package F8;

import A9.AbstractC0151y;
import L8.InterfaceC0269c;
import L8.InterfaceC0285t;

/* JADX INFO: loaded from: classes.dex */
public final class U implements C8.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C8.u[] f1544e;
    public final AbstractC0224s a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C8.k f1546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f1547d;

    static {
        p210v8.v vVar = p210v8.u.a;
        f1544e = new C8.u[]{vVar.f(new p210v8.n(vVar.b(U.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), vVar.f(new p210v8.n(vVar.b(U.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public U(AbstractC0224s abstractC0224s, int i10, C8.k kVar, p200u8.a aVar) {
        p210v8.i.f(abstractC0224s, "callable");
        this.a = abstractC0224s;
        this.f1545b = i10;
        this.f1546c = kVar;
        this.f1547d = t0.j(null, aVar);
        t0.j(null, new T(this, 0));
    }

    public final L8.I a() {
        C8.u uVar = f1544e[0];
        Object objInvoke = this.f1547d.invoke();
        p210v8.i.e(objInvoke, "<get-descriptor>(...)");
        return (L8.I) objInvoke;
    }

    public final String b() {
        L8.I iA = a();
        O8.U u3 = iA instanceof O8.U ? (O8.U) iA : null;
        if (u3 != null && !u3.v().Z()) {
            p096j9.f name = u3.getName();
            p210v8.i.e(name, "valueParameter.name");
            if (!name.f12552t) {
                return name.g();
            }
        }
        return null;
    }

    public final m0 c() {
        AbstractC0151y type = a().getType();
        p210v8.i.e(type, "descriptor.type");
        return new m0(type, new T(this, 1));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof U)) {
            return false;
        }
        U u3 = (U) obj;
        if (p210v8.i.a(this.a, u3.a)) {
            return this.f1545b == u3.f1545b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.f1545b;
    }

    public final String toString() {
        String strB;
        p114l9.g gVar = v0.a;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.f1546c.ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("extension receiver parameter");
        } else if (iOrdinal == 2) {
            sb.append("parameter #" + this.f1545b + ' ' + b());
        }
        sb.append(" of ");
        InterfaceC0269c interfaceC0269cG = this.a.g();
        if (interfaceC0269cG instanceof L8.K) {
            strB = v0.c((L8.K) interfaceC0269cG);
        } else {
            if (!(interfaceC0269cG instanceof InterfaceC0285t)) {
                throw new IllegalStateException(("Illegal callable: " + interfaceC0269cG).toString());
            }
            strB = v0.b((InterfaceC0285t) interfaceC0269cG);
        }
        sb.append(strB);
        String string = sb.toString();
        p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
