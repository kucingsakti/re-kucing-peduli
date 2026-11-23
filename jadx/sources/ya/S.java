package ya;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes.dex */
public final class S implements WildcardType {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Type f16199s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Type f16200t;

    public S(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            T.b(typeArr[0]);
            this.f16200t = null;
            this.f16199s = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        T.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f16200t = typeArr2[0];
        this.f16199s = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && T.c(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f16200t;
        return type != null ? new Type[]{type} : T.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f16199s};
    }

    public final int hashCode() {
        Type type = this.f16200t;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f16199s.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f16200t;
        if (type != null) {
            return "? super " + T.p(type);
        }
        Type type2 = this.f16199s;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + T.p(type2);
    }
}
