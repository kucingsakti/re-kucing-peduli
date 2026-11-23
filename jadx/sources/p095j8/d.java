package p095j8;

import java.util.Map;
import p210v8.i;
import p219w8.a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Map.Entry, a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f12519s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12520t;

    public d(e eVar, int i10) {
        i.f(eVar, "map");
        this.f12519s = eVar;
        this.f12520t = i10;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return i.a(entry.getKey(), getKey()) && i.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12519s.f12527s[this.f12520t];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f12519s.f12528t;
        i.c(objArr);
        return objArr[this.f12520t];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        e eVar = this.f12519s;
        eVar.c();
        Object[] objArr = eVar.f12528t;
        if (objArr == null) {
            int length = eVar.f12527s.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            eVar.f12528t = objArr;
        }
        int i10 = this.f12520t;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
