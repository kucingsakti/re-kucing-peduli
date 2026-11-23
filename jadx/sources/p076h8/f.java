package p076h8;

import java.io.Serializable;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f11789s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f11790t;

    public f(Object obj, Object obj2) {
        this.f11789s = obj;
        this.f11790t = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.f11789s, fVar.f11789s) && i.a(this.f11790t, fVar.f11790t);
    }

    public final int hashCode() {
        Object obj = this.f11789s;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f11790t;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f11789s + ", " + this.f11790t + ')';
    }
}
