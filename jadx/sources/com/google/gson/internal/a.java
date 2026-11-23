package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Type f10021s;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.f10021s = d.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f10021s;
    }

    public final int hashCode() {
        return this.f10021s.hashCode();
    }

    public final String toString() {
        return d.j(this.f10021s) + "[]";
    }
}
