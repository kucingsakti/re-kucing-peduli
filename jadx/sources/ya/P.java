package ya;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class P implements GenericArrayType {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Type f16195s;

    public P(Type type) {
        this.f16195s = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && T.c(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f16195s;
    }

    public final int hashCode() {
        return this.f16195s.hashCode();
    }

    public final String toString() {
        return T.p(this.f16195s) + "[]";
    }
}
