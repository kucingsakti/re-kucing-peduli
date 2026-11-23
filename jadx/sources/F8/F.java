package F8;

import A9.AbstractC0151y;
import C8.InterfaceC0178f;
import L8.AbstractC0281o;
import L8.InterfaceC0271e;
import L8.InterfaceC0285t;
import O8.AbstractC0359o;
import O8.C0355k;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC0224s implements p210v8.f, InterfaceC0178f, InterfaceC0211e {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C8.u[] f1514z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D f1515t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f1516u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f1517v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r0 f1518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f1519x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f1520y;

    static {
        p210v8.v vVar = p210v8.u.a;
        f1514z = new C8.u[]{vVar.f(new p210v8.n(vVar.b(F.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    public F(D d3, String str, String str2, InterfaceC0285t interfaceC0285t, Object obj) {
        this.f1515t = d3;
        this.f1516u = str2;
        this.f1517v = obj;
        this.f1518w = t0.j(interfaceC0285t, new A9.A(this, 6, str));
        p076h8.e eVar = p076h8.e.f11786s;
        this.f1519x = D3.b.r(eVar, new E(this, 0));
        this.f1520y = D3.b.r(eVar, new E(this, 1));
    }

    public static final G8.t k(F f10, Constructor constructor, InterfaceC0285t interfaceC0285t, boolean z6) {
        if (!z6) {
            f10.getClass();
            C0355k c0355k = interfaceC0285t instanceof C0355k ? (C0355k) interfaceC0285t : null;
            if (c0355k != null) {
                C0355k c0355k2 = c0355k;
                if (!AbstractC0281o.e(c0355k2.f())) {
                    InterfaceC0271e interfaceC0271eQ = c0355k.Q();
                    p210v8.i.e(interfaceC0271eQ, "constructorDescriptor.constructedClass");
                    if (!p124m9.g.b(interfaceC0271eQ) && !p124m9.e.q(c0355k.Q())) {
                        List listH0 = c0355k2.H0();
                        p210v8.i.e(listH0, "constructorDescriptor.valueParameters");
                        List list = listH0;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                AbstractC0151y type = ((O8.U) it.next()).getType();
                                p210v8.i.e(type, "it.type");
                                if (J7.a.s(type)) {
                                    if (f10.j()) {
                                        return new G8.f(constructor, C4.a.f(f10.f1517v, f10.g()), 0);
                                    }
                                    p210v8.i.f(constructor, "constructor");
                                    Class declaringClass = constructor.getDeclaringClass();
                                    p210v8.i.e(declaringClass, "constructor.declaringClass");
                                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                    p210v8.i.e(genericParameterTypes, "constructor.genericParameterTypes");
                                    return new G8.g(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : p086i8.i.s(0, genericParameterTypes.length - 1, genericParameterTypes)), 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (f10.j()) {
            return new G8.f(constructor, C4.a.f(f10.f1517v, f10.g()), 1);
        }
        p210v8.i.f(constructor, "constructor");
        Class declaringClass2 = constructor.getDeclaringClass();
        p210v8.i.e(declaringClass2, "constructor.declaringClass");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        Class<?> cls = (declaringClass4 == null || Modifier.isStatic(declaringClass3.getModifiers())) ? null : declaringClass4;
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        p210v8.i.e(genericParameterTypes2, "constructor.genericParameterTypes");
        return new G8.g(constructor, declaringClass2, cls, genericParameterTypes2, 1);
    }

    @Override // p200u8.d
    public final Object b(Object obj, Object obj2, Object obj3) {
        return v(obj, obj2, obj3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // F8.AbstractC0224s
    public final G8.e c() {
        return (G8.e) this.f1519x.getValue();
    }

    @Override // F8.AbstractC0224s
    public final D d() {
        return this.f1515t;
    }

    public final boolean equals(Object obj) {
        F fB = y0.b(obj);
        return fB != null && p210v8.i.a(this.f1515t, fB.f1515t) && getName().equals(fB.getName()) && p210v8.i.a(this.f1516u, fB.f1516u) && p210v8.i.a(this.f1517v, fB.f1517v);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // F8.AbstractC0224s
    public final G8.e f() {
        return (G8.e) this.f1520y.getValue();
    }

    @Override // p210v8.f
    public final int getArity() {
        return C3.b.o(c());
    }

    @Override // C8.InterfaceC0174b
    public final String getName() {
        String strG = ((AbstractC0359o) g()).getName().g();
        p210v8.i.e(strG, "descriptor.name.asString()");
        return strG;
    }

    public final int hashCode() {
        return this.f1516u.hashCode() + ((getName().hashCode() + (this.f1515t.hashCode() * 31)) * 31);
    }

    @Override // p200u8.a
    public final Object invoke() {
        return v(new Object[0]);
    }

    @Override // F8.AbstractC0224s
    public final boolean j() {
        return !p210v8.i.a(this.f1517v, p210v8.a.f15448s);
    }

    @Override // F8.AbstractC0224s
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0285t g() {
        C8.u uVar = f1514z[0];
        Object objInvoke = this.f1518w.invoke();
        p210v8.i.e(objInvoke, "<get-descriptor>(...)");
        return (InterfaceC0285t) objInvoke;
    }

    @Override // C8.InterfaceC0174b
    public final boolean t() {
        return g().t();
    }

    public final String toString() {
        p114l9.g gVar = v0.a;
        return v0.b(g());
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        return v(obj);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return v(obj, obj2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public F(D d3, InterfaceC0285t interfaceC0285t) {
        p210v8.i.f(d3, "container");
        p210v8.i.f(interfaceC0285t, "descriptor");
        String strG = ((AbstractC0359o) interfaceC0285t).getName().g();
        p210v8.i.e(strG, "descriptor.name.asString()");
        this(d3, strG, w0.c(interfaceC0285t).d(), interfaceC0285t, p210v8.a.f15448s);
    }
}
