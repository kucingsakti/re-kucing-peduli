package P3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3871f;

    public b(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f3867b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f3868c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f3869d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f3870e = str4;
        this.f3871f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f3867b.equals(((b) mVar).f3867b)) {
                b bVar = (b) mVar;
                if (this.f3868c.equals(bVar.f3868c) && this.f3869d.equals(bVar.f3869d) && this.f3870e.equals(bVar.f3870e) && this.f3871f == bVar.f3871f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f3867b.hashCode() ^ 1000003) * 1000003) ^ this.f3868c.hashCode()) * 1000003) ^ this.f3869d.hashCode()) * 1000003) ^ this.f3870e.hashCode()) * 1000003;
        long j = this.f3871f;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "RolloutAssignment{rolloutId=" + this.f3867b + ", parameterKey=" + this.f3868c + ", parameterValue=" + this.f3869d + ", variantId=" + this.f3870e + ", templateVersion=" + this.f3871f + "}";
    }
}
