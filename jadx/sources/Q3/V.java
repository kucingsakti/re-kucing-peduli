package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class V extends z0 {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4146c;

    public V(String str, String str2, long j) {
        this.a = str;
        this.f4145b = str2;
        this.f4146c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (this.a.equals(((V) z0Var).a)) {
                V v4 = (V) z0Var;
                if (this.f4145b.equals(v4.f4145b) && this.f4146c == v4.f4146c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4145b.hashCode()) * 1000003;
        long j = this.f4146c;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Signal{name=" + this.a + ", code=" + this.f4145b + ", address=" + this.f4146c + "}";
    }
}
