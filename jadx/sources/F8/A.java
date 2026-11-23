package F8;

import C8.InterfaceC0175c;
import L8.InterfaceC0271e;
import R8.AbstractC0408c;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class A extends D implements InterfaceC0175c, o0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f1507v = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Class f1508t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s0 f1509u;

    public A(Class cls) {
        p210v8.i.f(cls, "jClass");
        this.f1508t = cls;
        this.f1509u = new s0(new C0226u(this, 7));
    }

    @Override // p210v8.c
    public final Class a() {
        return this.f1508t;
    }

    @Override // F8.D
    public final Collection d() {
        InterfaceC0271e interfaceC0271eQ = q();
        if (interfaceC0271eQ.M() == 2 || interfaceC0271eQ.M() == 6) {
            return p086i8.s.f12328s;
        }
        Collection collectionN = interfaceC0271eQ.n();
        p210v8.i.e(collectionN, "descriptor.constructors");
        return collectionN;
    }

    @Override // F8.D
    public final Collection e(p096j9.f fVar) {
        t9.n nVarE0 = q().p().E0();
        T8.b bVar = T8.b.f4760t;
        Collection collectionC = nVarE0.c(fVar, bVar);
        t9.n nVarV0 = q().v0();
        p210v8.i.e(nVarV0, "descriptor.staticScope");
        return p086i8.k.g0(collectionC, nVarV0.c(fVar, bVar));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof A) && p068ga.d.p(this).equals(p068ga.d.p((InterfaceC0175c) obj));
    }

    @Override // F8.D
    public final L8.K f(int i10) {
        Class<?> declaringClass;
        Class cls = this.f1508t;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((A) p068ga.d.r(declaringClass)).f(i10);
        }
        InterfaceC0271e interfaceC0271eQ = q();
        p238y9.g gVar = interfaceC0271eQ instanceof p238y9.g ? (p238y9.g) interfaceC0271eQ : null;
        if (gVar != null) {
            p104k9.m mVar = h9.k.j;
            p210v8.i.e(mVar, "classLocalVariable");
            p047e9.G g8 = (p047e9.G) xa.d.n(gVar.f16079w, mVar, i10);
            if (g8 != null) {
                V3.b bVar = gVar.f16067D;
                return (L8.K) y0.f(this.f1508t, g8, (p067g9.f) bVar.f5172b, (p067g9.g) bVar.f5174d, gVar.f16080x, C0231z.f1650A);
            }
        }
        return null;
    }

    public final int hashCode() {
        return p068ga.d.p(this).hashCode();
    }

    @Override // F8.D
    public final Collection i(p096j9.f fVar) {
        t9.n nVarE0 = q().p().E0();
        T8.b bVar = T8.b.f4760t;
        Collection collectionB = nVarE0.b(fVar, bVar);
        t9.n nVarV0 = q().v0();
        p210v8.i.e(nVarV0, "descriptor.staticScope");
        return p086i8.k.g0(collectionB, nVarV0.b(fVar, bVar));
    }

    @Override // C8.InterfaceC0175c
    public final Collection n() {
        C0229x c0229x = (C0229x) this.f1509u.invoke();
        c0229x.getClass();
        C8.u uVar = C0229x.f1639n[4];
        Object objInvoke = c0229x.f1643f.invoke();
        p210v8.i.e(objInvoke, "<get-constructors>(...)");
        return (Collection) objInvoke;
    }

    public final p096j9.b p() {
        I8.k kVarI;
        p096j9.b bVar = w0.a;
        Class cls = this.f1508t;
        p210v8.i.f(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            p210v8.i.e(componentType, "klass.componentType");
            kVarI = componentType.isPrimitive() ? p176r9.c.g(componentType.getSimpleName()).i() : null;
            return kVarI != null ? new p096j9.b(I8.o.f2197k, kVarI.f2129t) : p096j9.b.j(I8.n.f2170g.g());
        }
        if (cls.equals(Void.TYPE)) {
            return w0.a;
        }
        kVarI = cls.isPrimitive() ? p176r9.c.g(cls.getSimpleName()).i() : null;
        if (kVarI != null) {
            return new p096j9.b(I8.o.f2197k, kVarI.f2128s);
        }
        p096j9.b bVarA = AbstractC0408c.a(cls);
        if (!bVarA.f12542c) {
            String str = K8.d.a;
            p096j9.b bVar2 = (p096j9.b) K8.d.f2632h.get(bVarA.b().i());
            if (bVar2 != null) {
                return bVar2;
            }
        }
        return bVarA;
    }

    public final InterfaceC0271e q() {
        return ((C0229x) this.f1509u.invoke()).a();
    }

    @Override // C8.InterfaceC0175c
    public final boolean r() {
        return q().r();
    }

    @Override // C8.InterfaceC0175c
    public final String s() {
        C0229x c0229x = (C0229x) this.f1509u.invoke();
        c0229x.getClass();
        C8.u uVar = C0229x.f1639n[3];
        return (String) c0229x.f1642e.invoke();
    }

    @Override // C8.InterfaceC0175c
    public final List t() {
        C0229x c0229x = (C0229x) this.f1509u.invoke();
        c0229x.getClass();
        C8.u uVar = C0229x.f1639n[8];
        Object objInvoke = c0229x.f1644g.invoke();
        p210v8.i.e(objInvoke, "<get-supertypes>(...)");
        return (List) objInvoke;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("class ");
        p096j9.b bVarP = p();
        p096j9.c cVarG = bVarP.g();
        p210v8.i.e(cVarG, "classId.packageFqName");
        String strConcat = cVarG.d() ? "" : cVarG.b().concat(".");
        sb.append(strConcat + L9.n.F(bVarP.h().b(), '.', '$'));
        return sb.toString();
    }

    @Override // C8.InterfaceC0175c
    public final boolean u(Object obj) {
        List list = AbstractC0408c.a;
        Class cls = this.f1508t;
        p210v8.i.f(cls, "<this>");
        Integer num = (Integer) AbstractC0408c.f4464d.get(cls);
        if (num != null) {
            return p210v8.x.f(num.intValue(), obj);
        }
        Class cls2 = (Class) AbstractC0408c.f4463c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // C8.InterfaceC0175c
    public final String v() {
        C0229x c0229x = (C0229x) this.f1509u.invoke();
        c0229x.getClass();
        C8.u uVar = C0229x.f1639n[2];
        return (String) c0229x.f1641d.invoke();
    }
}
