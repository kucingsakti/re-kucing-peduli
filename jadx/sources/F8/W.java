package F8;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;

/* JADX INFO: loaded from: classes.dex */
public final class W extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X f1550t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(X x8, int i10) {
        super(0);
        this.f1549s = i10;
        this.f1550t = x8;
    }

    @Override // p200u8.a
    public final Object invoke() throws IllegalPropertyDelegateAccessException {
        X x8 = this.f1550t;
        switch (this.f1549s) {
            case 0:
                return new V(x8);
            default:
                Object objK = x8.k();
                try {
                    Object obj = k0.f1591z;
                    Object objF = x8.j() ? C4.a.f(x8.f1595w, x8.g()) : null;
                    if (objF == obj) {
                        objF = null;
                    }
                    x8.j();
                    AccessibleObject accessibleObject = objK instanceof AccessibleObject ? (AccessibleObject) objK : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(p068ga.l.k(x8));
                    }
                    if (objK == null) {
                        return null;
                    }
                    if (objK instanceof Field) {
                        return ((Field) objK).get(objF);
                    }
                    if (!(objK instanceof Method)) {
                        throw new AssertionError("delegate field/method " + objK + " neither field nor method");
                    }
                    int length = ((Method) objK).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) objK).invoke(null, new Object[0]);
                    }
                    if (length == 1) {
                        Method method = (Method) objK;
                        if (objF == null) {
                            Class<?> cls = ((Method) objK).getParameterTypes()[0];
                            p210v8.i.e(cls, "fieldOrMethod.parameterTypes[0]");
                            objF = y0.e(cls);
                        }
                        return method.invoke(null, objF);
                    }
                    if (length == 2) {
                        Method method2 = (Method) objK;
                        Class<?> cls2 = ((Method) objK).getParameterTypes()[1];
                        p210v8.i.e(cls2, "fieldOrMethod.parameterTypes[1]");
                        return method2.invoke(null, objF, y0.e(cls2));
                    }
                    throw new AssertionError("delegate method " + objK + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e10) {
                    throw new IllegalPropertyDelegateAccessException("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e10);
                }
        }
    }
}
