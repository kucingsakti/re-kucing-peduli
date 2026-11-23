package p138o2;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f13679c;

    public b(long j, long j10, Set set) {
        this.a = j;
        this.f13678b = j10;
        this.f13679c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.f13678b == bVar.f13678b && this.f13679c.equals(bVar.f13679c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i10 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f13678b;
        return ((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f13679c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.f13678b + ", flags=" + this.f13679c + "}";
    }
}
