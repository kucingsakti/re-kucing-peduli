package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class O {
    public long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Q f4118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0371c0 f4119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0373d0 f4120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0381h0 f4121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f4122g;

    public final P a() {
        String str;
        Q q10;
        C0371c0 c0371c0;
        if (this.f4122g == 1 && (str = this.f4117b) != null && (q10 = this.f4118c) != null && (c0371c0 = this.f4119d) != null) {
            return new P(this.a, str, q10, c0371c0, this.f4120e, this.f4121f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.f4122g) == 0) {
            sb.append(" timestamp");
        }
        if (this.f4117b == null) {
            sb.append(" type");
        }
        if (this.f4118c == null) {
            sb.append(" app");
        }
        if (this.f4119d == null) {
            sb.append(" device");
        }
        throw new IllegalStateException(E0.a.k(sb, "Missing required properties:"));
    }
}
