package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class P extends K0 {
    public final long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q f4124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0371c0 f4125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0373d0 f4126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0381h0 f4127f;

    public P(long j, String str, Q q10, C0371c0 c0371c0, C0373d0 c0373d0, C0381h0 c0381h0) {
        this.a = j;
        this.f4123b = str;
        this.f4124c = q10;
        this.f4125d = c0371c0;
        this.f4126e = c0373d0;
        this.f4127f = c0381h0;
    }

    public final O a() {
        O o10 = new O();
        o10.a = this.a;
        o10.f4117b = this.f4123b;
        o10.f4118c = this.f4124c;
        o10.f4119d = this.f4125d;
        o10.f4120e = this.f4126e;
        o10.f4121f = this.f4127f;
        o10.f4122g = (byte) 1;
        return o10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        P p10 = (P) ((K0) obj);
        if (this.a != p10.a) {
            return false;
        }
        if (!this.f4123b.equals(p10.f4123b) || !this.f4124c.equals(p10.f4124c) || !this.f4125d.equals(p10.f4125d)) {
            return false;
        }
        C0373d0 c0373d0 = p10.f4126e;
        C0373d0 c0373d1 = this.f4126e;
        if (c0373d1 == null) {
            if (c0373d0 != null) {
                return false;
            }
        } else if (!c0373d1.equals(c0373d0)) {
            return false;
        }
        C0381h0 c0381h0 = p10.f4127f;
        C0381h0 c0381h1 = this.f4127f;
        if (c0381h1 == null) {
            return c0381h0 == null;
        }
        return c0381h1.equals(c0381h0);
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f4123b.hashCode()) * 1000003) ^ this.f4124c.hashCode()) * 1000003) ^ this.f4125d.hashCode()) * 1000003;
        C0373d0 c0373d0 = this.f4126e;
        int iHashCode2 = (iHashCode ^ (c0373d0 == null ? 0 : c0373d0.hashCode())) * 1000003;
        C0381h0 c0381h0 = this.f4127f;
        return iHashCode2 ^ (c0381h0 != null ? c0381h0.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.f4123b + ", app=" + this.f4124c + ", device=" + this.f4125d + ", log=" + this.f4126e + ", rollouts=" + this.f4127f + "}";
    }
}
