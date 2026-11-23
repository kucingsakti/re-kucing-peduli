package F8;

import R8.AbstractC0408c;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class S extends D {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Class f1540t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s0 f1541u;

    public S(Class cls) {
        p210v8.i.f(cls, "jClass");
        this.f1540t = cls;
        this.f1541u = new s0(new M(this, 1));
    }

    @Override // p210v8.c
    public final Class a() {
        return this.f1540t;
    }

    @Override // F8.D
    public final Collection d() {
        return p086i8.s.f12328s;
    }

    @Override // F8.D
    public final Collection e(p096j9.f fVar) {
        P p10 = (P) this.f1541u.invoke();
        p10.getClass();
        C8.u uVar = P.f1534g[1];
        Object objInvoke = p10.f1536d.invoke();
        p210v8.i.e(objInvoke, "<get-scope>(...)");
        return ((t9.n) objInvoke).c(fVar, T8.b.f4760t);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof S) {
            return p210v8.i.a(this.f1540t, ((S) obj).f1540t);
        }
        return false;
    }

    @Override // F8.D
    public final L8.K f(int i10) {
        P p10 = (P) this.f1541u.invoke();
        p10.getClass();
        C8.u uVar = P.f1534g[3];
        p076h8.k kVar = (p076h8.k) p10.f1538f.invoke();
        if (kVar == null) {
            return null;
        }
        i9.g gVar = (i9.g) kVar.f11799s;
        p047e9.C c10 = (p047e9.C) kVar.f11800t;
        i9.f fVar = (i9.f) kVar.f11801u;
        p104k9.m mVar = h9.k.f11889n;
        p210v8.i.e(mVar, "packageLocalVariable");
        p047e9.G g8 = (p047e9.G) xa.d.n(c10, mVar, i10);
        if (g8 == null) {
            return null;
        }
        p047e9.X x8 = c10.f10752y;
        p210v8.i.e(x8, "packageProto.typeTable");
        return (L8.K) y0.f(this.f1540t, g8, gVar, new p067g9.g(x8), fVar, Q.f1539A);
    }

    @Override // F8.D
    public final Class h() {
        P p10 = (P) this.f1541u.invoke();
        p10.getClass();
        C8.u uVar = P.f1534g[2];
        Class cls = (Class) p10.f1537e.invoke();
        return cls == null ? this.f1540t : cls;
    }

    public final int hashCode() {
        return this.f1540t.hashCode();
    }

    @Override // F8.D
    public final Collection i(p096j9.f fVar) {
        P p10 = (P) this.f1541u.invoke();
        p10.getClass();
        C8.u uVar = P.f1534g[1];
        Object objInvoke = p10.f1536d.invoke();
        p210v8.i.e(objInvoke, "<get-scope>(...)");
        return ((t9.n) objInvoke).b(fVar, T8.b.f4760t);
    }

    public final String toString() {
        return "file class " + AbstractC0408c.a(this.f1540t).b();
    }
}
