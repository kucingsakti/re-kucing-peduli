package com.google.gson.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Map.Entry {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10112A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j f10113s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f10114t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j f10115u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f10116v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j f10117w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f10118x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f10119y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f10120z;

    public j(boolean z6) {
        this.f10118x = null;
        this.f10119y = z6;
        this.f10117w = this;
        this.f10116v = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f10118x;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f10120z;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f10118x;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10120z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f10118x;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f10120z;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f10119y) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f10120z;
        this.f10120z = obj;
        return obj2;
    }

    public final String toString() {
        return this.f10118x + "=" + this.f10120z;
    }

    public j(boolean z6, j jVar, Object obj, j jVar2, j jVar3) {
        this.f10113s = jVar;
        this.f10118x = obj;
        this.f10119y = z6;
        this.f10112A = 1;
        this.f10116v = jVar2;
        this.f10117w = jVar3;
        jVar3.f10116v = this;
        jVar2.f10117w = this;
    }
}
