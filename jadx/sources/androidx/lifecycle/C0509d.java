package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0509d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0509d f6750c = new C0509d();
    public final HashMap a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f6751b = new HashMap();

    public static void b(HashMap map, C0508c c0508c, EnumC0518m enumC0518m, Class cls) {
        EnumC0518m enumC0518m2 = (EnumC0518m) map.get(c0508c);
        if (enumC0518m2 == null || enumC0518m == enumC0518m2) {
            if (enumC0518m2 == null) {
                map.put(c0508c, enumC0518m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0508c.f6749b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0518m2 + ", new value " + enumC0518m);
    }

    public final C0507b a(Class cls, Method[] methodArr) {
        int i10;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            C0507b c0507bA = (C0507b) map2.get(superclass);
            if (c0507bA == null) {
                c0507bA = a(superclass, null);
            }
            map.putAll(c0507bA.f6748b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0507b c0507bA2 = (C0507b) map2.get(cls2);
            if (c0507bA2 == null) {
                c0507bA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0507bA2.f6748b.entrySet()) {
                b(map, (C0508c) entry.getKey(), (EnumC0518m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z6 = false;
        for (Method method : methodArr) {
            C c10 = (C) method.getAnnotation(C.class);
            if (c10 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC0523s.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                EnumC0518m enumC0518mValue = c10.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0518m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0518mValue != EnumC0518m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0508c(i10, method), enumC0518mValue, cls);
                z6 = true;
            }
        }
        C0507b c0507b = new C0507b(map);
        map2.put(cls, c0507b);
        this.f6751b.put(cls, Boolean.valueOf(z6));
        return c0507b;
    }
}
