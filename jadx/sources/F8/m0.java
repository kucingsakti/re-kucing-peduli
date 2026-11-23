package F8;

import A9.AbstractC0151y;
import C8.InterfaceC0176d;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import R8.AbstractC0408c;
import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements p210v8.j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C8.u[] f1603e;
    public final AbstractC0151y a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f1604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f1605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f1606d;

    static {
        p210v8.v vVar = p210v8.u.a;
        f1603e = new C8.u[]{vVar.f(new p210v8.n(vVar.b(m0.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), vVar.f(new p210v8.n(vVar.b(m0.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public m0(AbstractC0151y abstractC0151y, p200u8.a aVar) {
        p210v8.i.f(abstractC0151y, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        this.a = abstractC0151y;
        r0 r0Var = aVar instanceof r0 ? (r0) aVar : null;
        this.f1604b = r0Var == null ? aVar != null ? t0.j(null, aVar) : null : r0Var;
        this.f1605c = t0.j(null, new l0(this, 1));
        this.f1606d = t0.j(null, new A9.A(this, aVar));
    }

    public final InterfaceC0176d a(AbstractC0151y abstractC0151y) {
        AbstractC0151y abstractC0151yB;
        InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
        if (interfaceC0273gW instanceof InterfaceC0271e) {
            Class clsJ = y0.j((InterfaceC0271e) interfaceC0273gW);
            if (clsJ != null) {
                if (!clsJ.isArray()) {
                    if (A9.b0.e(abstractC0151y)) {
                        return new A(clsJ);
                    }
                    Class cls = (Class) AbstractC0408c.f4462b.get(clsJ);
                    if (cls != null) {
                        clsJ = cls;
                    }
                    return new A(clsJ);
                }
                A9.S s9 = (A9.S) p086i8.k.m0(abstractC0151y.l());
                if (s9 == null || (abstractC0151yB = s9.b()) == null) {
                    return new A(clsJ);
                }
                InterfaceC0176d interfaceC0176dA = a(abstractC0151yB);
                if (interfaceC0176dA != null) {
                    return new A(Array.newInstance((Class<?>) p068ga.d.o(o1.f.i(interfaceC0176dA)), 0).getClass());
                }
                throw new p0("Cannot determine classifier for array element type: " + this, 0);
            }
        } else {
            if (interfaceC0273gW instanceof L8.P) {
                return new n0(null, (L8.P) interfaceC0273gW);
            }
            if (interfaceC0273gW instanceof p238y9.q) {
                throw new p0("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    public final List b() {
        C8.u uVar = f1603e[1];
        Object objInvoke = this.f1606d.invoke();
        p210v8.i.e(objInvoke, "<get-arguments>(...)");
        return (List) objInvoke;
    }

    public final InterfaceC0176d c() {
        C8.u uVar = f1603e[0];
        return (InterfaceC0176d) this.f1605c.invoke();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return p210v8.i.a(this.a, m0Var.a) && p210v8.i.a(c(), m0Var.c()) && b().equals(m0Var.b());
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        InterfaceC0176d interfaceC0176dC = c();
        return b().hashCode() + ((iHashCode + (interfaceC0176dC != null ? interfaceC0176dC.hashCode() : 0)) * 31);
    }

    public final String toString() {
        p114l9.g gVar = v0.a;
        return v0.d(this.a);
    }
}
