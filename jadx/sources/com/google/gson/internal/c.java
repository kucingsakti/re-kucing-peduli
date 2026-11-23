package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c implements WildcardType, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Type f10100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Type f10101t;

    public c(Type[] typeArr, Type[] typeArr2) {
        d.b(typeArr2.length <= 1);
        d.b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            d.c(typeArr[0]);
            this.f10101t = null;
            this.f10100s = d.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        d.c(typeArr2[0]);
        d.b(typeArr[0] == Object.class);
        this.f10101t = d.a(typeArr2[0]);
        this.f10100s = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f10101t;
        return type != null ? new Type[]{type} : d.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f10100s};
    }

    public final int hashCode() {
        Type type = this.f10101t;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f10100s.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f10101t;
        if (type != null) {
            return "? super " + d.j(type);
        }
        Type type2 = this.f10100s;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.j(type2);
    }
}
