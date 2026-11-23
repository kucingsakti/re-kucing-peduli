package p163q7;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14430e;

    public g(int i10, int i11, long j, long j10, long j11) {
        this.a = i10;
        this.f14427b = i11;
        this.f14428c = j;
        this.f14429d = j10;
        this.f14430e = j11;
    }

    public final long a() {
        return this.f14429d;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.f14427b;
    }

    public final long d() {
        return this.f14428c;
    }

    public final boolean e() {
        return this.f14428c + this.f14430e == this.f14429d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.f14427b == gVar.f14427b && this.f14428c == gVar.f14428c && this.f14429d == gVar.f14429d && this.f14430e == gVar.f14430e;
    }

    public final int hashCode() {
        int i10 = ((this.a * 31) + this.f14427b) * 31;
        long j = this.f14428c;
        int i11 = (i10 + ((int) (j ^ (j >>> 32)))) * 31;
        long j10 = this.f14429d;
        int i12 = (i11 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f14430e;
        return i12 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "FileSlice(id=" + this.a + ", position=" + this.f14427b + ", startBytes=" + this.f14428c + ", endBytes=" + this.f14429d + ", downloaded=" + this.f14430e + ")";
    }
}
