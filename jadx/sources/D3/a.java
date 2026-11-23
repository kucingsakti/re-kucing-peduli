package D3;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1043c;

    public a(long j, long j10, long j11) {
        this.a = j;
        this.f1042b = j10;
        this.f1043c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.f1042b == aVar.f1042b && this.f1043c == aVar.f1043c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j10 = this.f1042b;
        int i10 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f1043c;
        return i10 ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.a + ", elapsedRealtime=" + this.f1042b + ", uptimeMillis=" + this.f1043c + "}";
    }
}
