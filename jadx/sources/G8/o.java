package G8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1735e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1736f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o(Method method, boolean z6, int i10) {
        z6 = (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z6;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        p210v8.i.e(genericParameterTypes, "method.genericParameterTypes");
        this(method, z6, genericParameterTypes);
    }

    @Override // G8.t
    public void a(Object[] objArr) {
        switch (this.f1735e) {
            case 0:
                p210v8.i.f(objArr, "args");
                C3.a.b(this, objArr);
                if (this.f1736f && p086i8.i.B(objArr) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            default:
                super.a(objArr);
                return;
        }
    }

    public Object c(Object obj, Object[] objArr) {
        p210v8.i.f(objArr, "args");
        return this.f1736f ? p076h8.m.a : ((Method) this.a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // G8.e
    public Object v(Object[] objArr) throws IllegalAccessException {
        p210v8.i.f(objArr, "args");
        a(objArr);
        ((Field) this.a).set(this.f1741c != null ? p086i8.i.v(objArr) : null, p086i8.i.B(objArr));
        return p076h8.m.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(Method method, boolean z6, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        p210v8.i.e(genericReturnType, "method.genericReturnType");
        super(method, genericReturnType, z6 ? method.getDeclaringClass() : null, typeArr);
        this.f1736f = genericReturnType.equals(Void.TYPE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(Field field, boolean z6, boolean z10) {
        Class cls = Void.TYPE;
        p210v8.i.e(cls, "TYPE");
        Class<?> declaringClass = z10 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        p210v8.i.e(genericType, "field.genericType");
        super(field, cls, declaringClass, new Type[]{genericType});
        this.f1736f = z6;
    }
}
