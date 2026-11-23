package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends A0 {
    public final long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4157e;

    public Y(long j, String str, String str2, long j10, int i10) {
        this.a = j;
        this.f4154b = str;
        this.f4155c = str2;
        this.f4156d = j10;
        this.f4157e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A0) {
            A0 a10 = (A0) obj;
            if (this.a == ((Y) a10).a) {
                Y y6 = (Y) a10;
                if (this.f4154b.equals(y6.f4154b)) {
                    String str = y6.f4155c;
                    String str2 = this.f4155c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f4156d == y6.f4156d && this.f4157e == y6.f4157e) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f4154b.hashCode()) * 1000003;
        String str = this.f4155c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f4156d;
        return ((iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f4157e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.f4154b);
        sb.append(", file=");
        sb.append(this.f4155c);
        sb.append(", offset=");
        sb.append(this.f4156d);
        sb.append(", importance=");
        return E0.a.j(sb, this.f4157e, "}");
    }
}
