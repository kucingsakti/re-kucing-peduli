package p104k9;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Comparable f12765s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f12766t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y f12767u;

    public C(y yVar, Comparable comparable, Object obj) {
        this.f12767u = yVar;
        this.f12765s = comparable;
        this.f12766t = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12765s.compareTo(((C) obj).f12765s);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f12765s;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f12766t;
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
        return this.f12765s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12766t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f12765s;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f12766t;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f12767u.b();
        Object obj2 = this.f12766t;
        this.f12766t = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12765s);
        String strValueOf2 = String.valueOf(this.f12766t);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
