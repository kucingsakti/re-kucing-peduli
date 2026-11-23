package R8;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class D extends A implements p009a9.d {
    public final WildcardType a;

    public D(WildcardType wildcardType) {
        this.a = wildcardType;
    }

    @Override // R8.A
    public final Type b() {
        return this.a;
    }

    public final A c() {
        WildcardType wildcardType = this.a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Object objC = p086i8.i.C(lowerBounds);
            p210v8.i.e(objC, "lowerBounds.single()");
            Type type = (Type) objC;
            boolean z6 = type instanceof Class;
            if (z6) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new y(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z6 && ((Class) type).isArray())) {
                return new h(type);
            }
            return type instanceof WildcardType ? new D((WildcardType) type) : new p(type);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type type2 = (Type) p086i8.i.C(upperBounds);
        if (p210v8.i.a(type2, Object.class)) {
            return null;
        }
        p210v8.i.e(type2, "ub");
        boolean z10 = type2 instanceof Class;
        if (z10) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new y(cls2);
            }
        }
        if ((type2 instanceof GenericArrayType) || (z10 && ((Class) type2).isArray())) {
            return new h(type2);
        }
        return type2 instanceof WildcardType ? new D((WildcardType) type2) : new p(type2);
    }

    @Override // p009a9.b
    public final Collection q() {
        return p086i8.s.f12328s;
    }
}
