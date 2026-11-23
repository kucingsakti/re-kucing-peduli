package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class G0 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Comparable f8344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f8345t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ F0 f8346u;

    public G0(F0 f0, Comparable comparable, Object obj) {
        this.f8346u = f0;
        this.f8344s = comparable;
        this.f8345t = obj;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f8344s.compareTo(((G0) obj).f8344s);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f8344s;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f8345t;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f8344s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8345t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f8344s;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f8345t;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f8346u.h();
        Object obj2 = this.f8345t;
        this.f8345t = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f8344s) + "=" + String.valueOf(this.f8345t);
    }
}
