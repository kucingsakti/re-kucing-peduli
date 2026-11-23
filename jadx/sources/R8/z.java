package R8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class z extends v {
    public final Object a;

    public z(Object obj) {
        p210v8.i.f(obj, "recordComponent");
        this.a = obj;
    }

    @Override // R8.v
    public final Member b() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.a;
        p210v8.i.f(obj, "recordComponent");
        o1.k kVar = o1.f.a;
        Method method = null;
        if (kVar == null) {
            Class<?> cls = obj.getClass();
            try {
                kVar = new o1.k(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                kVar = new o1.k(method, method);
            }
            o1.f.a = kVar;
        }
        Method method2 = (Method) kVar.f13639t;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, new Object[0]);
            p210v8.i.d(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final p009a9.d f() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.a;
        p210v8.i.f(obj, "recordComponent");
        o1.k kVar = o1.f.a;
        Class cls = null;
        if (kVar == null) {
            Class<?> cls2 = obj.getClass();
            try {
                kVar = new o1.k(cls2.getMethod("getType", new Class[0]), cls2.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                kVar = new o1.k(cls, cls);
            }
            o1.f.a = kVar;
        }
        Method method = (Method) kVar.f13638s;
        if (method != null) {
            Object objInvoke = method.invoke(obj, new Object[0]);
            p210v8.i.d(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new p(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
