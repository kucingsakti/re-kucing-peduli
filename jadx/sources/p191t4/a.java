package p191t4;

import O3.k;
import V9.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final d a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f15211b = null;

    public a(d dVar) {
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && i.a(this.f15211b, aVar.f15211b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        k kVar = this.f15211b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.a + ", subscriber=" + this.f15211b + ')';
    }
}
