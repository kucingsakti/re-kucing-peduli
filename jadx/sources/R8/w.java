package R8;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w extends v implements p009a9.e {
    public final Method a;

    public w(Method method) {
        p210v8.i.f(method, "member");
        this.a = method;
    }

    @Override // R8.v
    public final Member b() {
        return this.a;
    }

    public final A f() {
        Type genericReturnType = this.a.getGenericReturnType();
        p210v8.i.e(genericReturnType, "member.genericReturnType");
        boolean z6 = genericReturnType instanceof Class;
        if (z6) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new y(cls);
            }
        }
        if ((genericReturnType instanceof GenericArrayType) || (z6 && ((Class) genericReturnType).isArray())) {
            return new h(genericReturnType);
        }
        return genericReturnType instanceof WildcardType ? new D((WildcardType) genericReturnType) : new p(genericReturnType);
    }

    public final List g() {
        Method method = this.a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        p210v8.i.e(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        p210v8.i.e(parameterAnnotations, "member.parameterAnnotations");
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // p009a9.e
    public final ArrayList z() {
        TypeVariable<Method>[] typeParameters = this.a.getTypeParameters();
        p210v8.i.e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new B(typeVariable));
        }
        return arrayList;
    }
}
