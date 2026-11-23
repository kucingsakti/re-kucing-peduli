package R8;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class h extends A implements p009a9.d {
    public final Type a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f4467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p086i8.s f4468c;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Type type) {
        A yVar;
        A yVar2;
        this.a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    p210v8.i.e(componentType, "getComponentType()");
                    yVar = componentType.isPrimitive() ? new y(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new h(componentType) : componentType instanceof WildcardType ? new D((WildcardType) componentType) : new p(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        p210v8.i.e(genericComponentType, "genericComponentType");
        boolean z6 = genericComponentType instanceof Class;
        if (z6) {
            Class cls2 = (Class) genericComponentType;
            yVar2 = cls2.isPrimitive() ? new y(cls2) : yVar2;
            this.f4467b = yVar2;
            this.f4468c = p086i8.s.f12328s;
        }
        yVar = ((genericComponentType instanceof GenericArrayType) || (z6 && ((Class) genericComponentType).isArray())) ? new h(genericComponentType) : genericComponentType instanceof WildcardType ? new D((WildcardType) genericComponentType) : new p(genericComponentType);
        yVar2 = yVar;
        this.f4467b = yVar2;
        this.f4468c = p086i8.s.f12328s;
    }

    @Override // R8.A
    public final Type b() {
        return this.a;
    }

    @Override // p009a9.b
    public final Collection q() {
        return this.f4468c;
    }
}
