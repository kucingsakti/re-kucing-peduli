package C8;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class F implements WildcardType, Type {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final F f954u = new F(null, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Type f955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Type f956t;

    public F(Type type, Type type2) {
        this.f955s = type;
        this.f956t = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f956t;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f956t;
        if (type != null) {
            return "? super " + E.d(type);
        }
        Type type2 = this.f955s;
        if (type2 == null || p210v8.i.a(type2, Object.class)) {
            return "?";
        }
        return "? extends " + E.d(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f955s;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
