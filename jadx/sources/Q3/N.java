package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class N extends w0 {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f4116i;

    public N(int i10, String str, int i11, long j, long j10, boolean z6, int i12, String str2, String str3) {
        this.a = i10;
        this.f4109b = str;
        this.f4110c = i11;
        this.f4111d = j;
        this.f4112e = j10;
        this.f4113f = z6;
        this.f4114g = i12;
        this.f4115h = str2;
        this.f4116i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.a == ((N) w0Var).a) {
                N n10 = (N) w0Var;
                if (this.f4109b.equals(n10.f4109b) && this.f4110c == n10.f4110c && this.f4111d == n10.f4111d && this.f4112e == n10.f4112e && this.f4113f == n10.f4113f && this.f4114g == n10.f4114g && this.f4115h.equals(n10.f4115h) && this.f4116i.equals(n10.f4116i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a ^ 1000003) * 1000003) ^ this.f4109b.hashCode()) * 1000003) ^ this.f4110c) * 1000003;
        long j = this.f4111d;
        int i10 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f4112e;
        return ((((((((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f4113f ? 1231 : 1237)) * 1000003) ^ this.f4114g) * 1000003) ^ this.f4115h.hashCode()) * 1000003) ^ this.f4116i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.f4109b);
        sb.append(", cores=");
        sb.append(this.f4110c);
        sb.append(", ram=");
        sb.append(this.f4111d);
        sb.append(", diskSpace=");
        sb.append(this.f4112e);
        sb.append(", simulator=");
        sb.append(this.f4113f);
        sb.append(", state=");
        sb.append(this.f4114g);
        sb.append(", manufacturer=");
        sb.append(this.f4115h);
        sb.append(", modelClass=");
        return E0.a.l(sb, this.f4116i, "}");
    }
}
