package p138o2;

import java.util.HashMap;
import p051f2.d;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final p169r2.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f13677b;

    public a(p169r2.a aVar, HashMap map) {
        this.a = aVar;
        this.f13677b = map;
    }

    public final long a(d dVar, long j, int i10) {
        long jK = j - this.a.k();
        b bVar = (b) this.f13677b.get(dVar);
        long j10 = bVar.a;
        int i11 = i10 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) i11)))), jK), bVar.f13678b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.f13677b.equals(aVar.f13677b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f13677b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.f13677b + "}";
    }
}
