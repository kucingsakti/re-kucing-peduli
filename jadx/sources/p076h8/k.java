package p076h8;

import java.io.Serializable;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f11799s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f11800t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f11801u;

    public k(Object obj, Object obj2, Object obj3) {
        this.f11799s = obj;
        this.f11800t = obj2;
        this.f11801u = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return i.a(this.f11799s, kVar.f11799s) && i.a(this.f11800t, kVar.f11800t) && i.a(this.f11801u, kVar.f11801u);
    }

    public final int hashCode() {
        Object obj = this.f11799s;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f11800t;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f11801u;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f11799s + ", " + this.f11800t + ", " + this.f11801u + ')';
    }
}
