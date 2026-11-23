package C8;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class A implements ParameterizedType, Type {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class f949s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Type f950t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Type[] f951u;

    public A(Class cls, Type type, ArrayList arrayList) {
        this.f949s = cls;
        this.f950t = type;
        this.f951u = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        if (p210v8.i.a(this.f949s, parameterizedType.getRawType()) && p210v8.i.a(this.f950t, parameterizedType.getOwnerType())) {
            return Arrays.equals(this.f951u, parameterizedType.getActualTypeArguments());
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f951u;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f950t;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f949s;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f949s;
        Type type = this.f950t;
        if (type != null) {
            sb.append(E.d(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(E.d(cls));
        }
        Type[] typeArr = this.f951u;
        if (typeArr.length != 0) {
            p086i8.i.z(typeArr, sb, ", ", "<", ">", "...", z.f968A);
        }
        String string = sb.toString();
        p210v8.i.e(string, "toString(...)");
        return string;
    }

    public final int hashCode() {
        int iHashCode = this.f949s.hashCode();
        Type type = this.f950t;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f951u);
    }

    public final String toString() {
        return getTypeName();
    }
}
