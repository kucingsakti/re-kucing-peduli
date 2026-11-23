package C8;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: C8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0173a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Type f957s;

    public C0173a(Type type) {
        p210v8.i.f(type, "elementType");
        this.f957s = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return p210v8.i.a(this.f957s, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f957s;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return E.d(this.f957s) + "[]";
    }

    public final int hashCode() {
        return this.f957s.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
