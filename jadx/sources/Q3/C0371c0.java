package Q3;

/* JADX INFO: renamed from: Q3.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0371c0 extends F0 {
    public final Double a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4188f;

    public C0371c0(Double d3, int i10, boolean z6, int i11, long j, long j10) {
        this.a = d3;
        this.f4184b = i10;
        this.f4185c = z6;
        this.f4186d = i11;
        this.f4187e = j;
        this.f4188f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F0) {
            F0 f0 = (F0) obj;
            Double d3 = this.a;
            if (d3 != null ? d3.equals(((C0371c0) f0).a) : ((C0371c0) f0).a == null) {
                if (this.f4184b == ((C0371c0) f0).f4184b) {
                    C0371c0 c0371c0 = (C0371c0) f0;
                    if (this.f4185c == c0371c0.f4185c && this.f4186d == c0371c0.f4186d && this.f4187e == c0371c0.f4187e && this.f4188f == c0371c0.f4188f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d3 = this.a;
        int iHashCode = ((((((((d3 == null ? 0 : d3.hashCode()) ^ 1000003) * 1000003) ^ this.f4184b) * 1000003) ^ (this.f4185c ? 1231 : 1237)) * 1000003) ^ this.f4186d) * 1000003;
        long j = this.f4187e;
        long j10 = this.f4188f;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "Device{batteryLevel=" + this.a + ", batteryVelocity=" + this.f4184b + ", proximityOn=" + this.f4185c + ", orientation=" + this.f4186d + ", ramUsed=" + this.f4187e + ", diskUsed=" + this.f4188f + "}";
    }
}
