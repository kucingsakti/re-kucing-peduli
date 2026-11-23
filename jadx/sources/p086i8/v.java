package p086i8;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12331b;

    public v(int i10, Object obj) {
        this.a = i10;
        this.f12331b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a == vVar.a && i.a(this.f12331b, vVar.f12331b);
    }

    public final int hashCode() {
        int i10 = this.a * 31;
        Object obj = this.f12331b;
        return i10 + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.f12331b + ')';
    }
}
