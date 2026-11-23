package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Comparable f6463s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f6464t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d0 f6465u;

    public g0(d0 d0Var, Comparable comparable, Object obj) {
        this.f6465u = d0Var;
        this.f6463s = comparable;
        this.f6464t = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f6463s.compareTo(((g0) obj).f6463s);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f6463s;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f6464t;
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
    public final Object getKey() {
        return this.f6463s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6464t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f6463s;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f6464t;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f6465u.b();
        Object obj2 = this.f6464t;
        this.f6464t = obj;
        return obj2;
    }

    public final String toString() {
        return this.f6463s + "=" + this.f6464t;
    }
}
