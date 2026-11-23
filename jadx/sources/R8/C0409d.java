package R8;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: R8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0409d extends r {
    public final Annotation a;

    public C0409d(Annotation annotation) {
        p210v8.i.f(annotation, "annotation");
        this.a = annotation;
    }

    public final ArrayList b() throws IllegalAccessException, InvocationTargetException {
        p009a9.a oVar;
        Annotation annotation = this.a;
        Method[] declaredMethods = p068ga.d.o(p068ga.d.l(annotation)).getDeclaredMethods();
        p210v8.i.e(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, new Object[0]);
            p210v8.i.e(objInvoke, "method.invoke(annotation)");
            p096j9.f fVarJ = p096j9.f.j(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = AbstractC0408c.a;
            if (Enum.class.isAssignableFrom(cls)) {
                oVar = new s(fVarJ, (Enum) objInvoke);
            } else if (objInvoke instanceof Annotation) {
                oVar = new f(fVarJ, (Annotation) objInvoke);
            } else if (objInvoke instanceof Object[]) {
                oVar = new g(fVarJ, (Object[]) objInvoke);
            } else {
                oVar = objInvoke instanceof Class ? new o(fVarJ, (Class) objInvoke) : new u(fVarJ, objInvoke);
            }
            arrayList.add(oVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0409d) {
            return this.a == ((C0409d) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final String toString() {
        return C0409d.class.getName() + ": " + this.a;
    }
}
