package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Type f10022s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Type f10023t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Type[] f10024u;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z6 = true;
            boolean z10 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z10) {
                z6 = false;
            }
            d.b(z6);
        }
        this.f10022s = type == null ? null : d.a(type);
        this.f10023t = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f10024u = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.f10024u[i10]);
            d.c(this.f10024u[i10]);
            Type[] typeArr3 = this.f10024u;
            typeArr3[i10] = d.a(typeArr3[i10]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f10024u.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f10022s;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f10023t;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f10024u) ^ this.f10023t.hashCode();
        Type type = this.f10022s;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f10024u;
        int length = typeArr.length;
        Type type = this.f10023t;
        if (length == 0) {
            return d.j(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.j(type));
        sb.append("<");
        sb.append(d.j(typeArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb.append(", ");
            sb.append(d.j(typeArr[i10]));
        }
        sb.append(">");
        return sb.toString();
    }
}
