package Q3;

/* JADX INFO: renamed from: Q3.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0377f0 extends I0 {
    public final C0379g0 a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4210d;

    public C0377f0(C0379g0 c0379g0, String str, String str2, long j) {
        this.a = c0379g0;
        this.f4208b = str;
        this.f4209c = str2;
        this.f4210d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        C0377f0 c0377f0 = (C0377f0) ((I0) obj);
        if (this.a.equals(c0377f0.a)) {
            return this.f4208b.equals(c0377f0.f4208b) && this.f4209c.equals(c0377f0.f4209c) && this.f4210d == c0377f0.f4210d;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4208b.hashCode()) * 1000003) ^ this.f4209c.hashCode()) * 1000003;
        long j = this.f4210d;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.a + ", parameterKey=" + this.f4208b + ", parameterValue=" + this.f4209c + ", templateVersion=" + this.f4210d + "}";
    }
}
