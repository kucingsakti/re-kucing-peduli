package ya;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements ParameterizedType {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Type f16196s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Type f16197t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Type[] f16198u;

    public Q(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            T.b(type3);
        }
        this.f16196s = type;
        this.f16197t = type2;
        this.f16198u = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && T.c(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f16198u.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f16196s;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f16197t;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f16198u) ^ this.f16197t.hashCode();
        Type type = this.f16196s;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f16198u;
        int length = typeArr.length;
        Type type = this.f16197t;
        if (length == 0) {
            return T.p(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(T.p(type));
        sb.append("<");
        sb.append(T.p(typeArr[0]));
        for (int i10 = 1; i10 < typeArr.length; i10++) {
            sb.append(", ");
            sb.append(T.p(typeArr[i10]));
        }
        sb.append(">");
        return sb.toString();
    }
}
