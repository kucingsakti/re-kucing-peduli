package p235y4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import xa.d;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f16046c = Class.class.getMethod("isRecord", new Class[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f16047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f16048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f16049f;

    public b() throws NoSuchMethodException {
        Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
        this.f16047d = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f16048e = componentType.getMethod("getName", new Class[0]);
        this.f16049f = componentType.getMethod("getType", new Class[0]);
    }

    @Override // xa.d
    public final Method k(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // xa.d
    public final Constructor l(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f16047d.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.f16049f.invoke(objArr[i10], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // xa.d
    public final String[] p(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f16047d.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.f16048e.invoke(objArr[i10], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // xa.d
    public final boolean q(Class cls) {
        try {
            return ((Boolean) this.f16046c.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }
}
