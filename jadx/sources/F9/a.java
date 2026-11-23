package F9;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1652b;

    public a(Object obj, Object obj2) {
        this.a = obj;
        this.f1652b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.a, aVar.a) && i.a(this.f1652b, aVar.f1652b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f1652b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.a + ", upper=" + this.f1652b + ')';
    }
}
