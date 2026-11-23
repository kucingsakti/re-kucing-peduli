package R8;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class n extends r implements p009a9.b, p009a9.e {
    public final Class a;

    public n(Class cls) {
        p210v8.i.f(cls, "klass");
        this.a = cls;
    }

    @Override // p009a9.b
    public final C0409d a(p096j9.c cVar) {
        Annotation[] declaredAnnotations;
        p210v8.i.f(cVar, "fqName");
        Class cls = this.a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return qa.b.j(declaredAnnotations, cVar);
    }

    public final Collection b() {
        Field[] declaredFields = this.a.getDeclaredFields();
        p210v8.i.e(declaredFields, "klass.declaredFields");
        return K9.n.B(K9.n.z(new K9.g(p086i8.i.m(declaredFields), false, k.f4471A), l.f4472A));
    }

    public final p096j9.c c() {
        return AbstractC0408c.a(this.a).b();
    }

    public final Collection d() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        p210v8.i.e(declaredMethods, "klass.declaredMethods");
        return K9.n.B(K9.n.z(new K9.g(p086i8.i.m(declaredMethods), true, new A0.m(this, 16)), m.f4473A));
    }

    public final ArrayList e() {
        Class cls = this.a;
        p210v8.i.f(cls, "clazz");
        Method method = (Method) oa.b.i().f13644v;
        Object[] objArr = method == null ? null : (Object[]) method.invoke(cls, new Object[0]);
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new z(obj));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return p210v8.i.a(this.a, ((n) obj).a);
        }
        return false;
    }

    public final boolean f() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        Class cls = this.a;
        p210v8.i.f(cls, "clazz");
        Method method = (Method) oa.b.i().f13643u;
        if (method == null) {
            bool = null;
        } else {
            Object objInvoke = method.invoke(cls, new Object[0]);
            p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean g() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        Class cls = this.a;
        p210v8.i.f(cls, "clazz");
        Method method = (Method) oa.b.i().f13641s;
        if (method == null) {
            bool = null;
        } else {
            Object objInvoke = method.invoke(cls, new Object[0]);
            p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p009a9.b
    public final Collection q() {
        Annotation[] declaredAnnotations;
        Class cls = this.a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? p086i8.s.f12328s : qa.b.k(declaredAnnotations);
    }

    public final String toString() {
        return n.class.getName() + ": " + this.a;
    }

    @Override // p009a9.e
    public final ArrayList z() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        p210v8.i.e(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new B(typeVariable));
        }
        return arrayList;
    }
}
