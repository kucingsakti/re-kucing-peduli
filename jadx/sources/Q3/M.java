package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class M {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f4108i;
    public byte j;

    public final N a() {
        String str;
        String str2;
        String str3;
        if (this.j == 63 && (str = this.f4101b) != null && (str2 = this.f4107h) != null && (str3 = this.f4108i) != null) {
            return new N(this.a, str, this.f4102c, this.f4103d, this.f4104e, this.f4105f, this.f4106g, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" arch");
        }
        if (this.f4101b == null) {
            sb.append(" model");
        }
        if ((this.j & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.j & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.j & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.j & 16) == 0) {
            sb.append(" simulator");
        }
        if ((this.j & 32) == 0) {
            sb.append(" state");
        }
        if (this.f4107h == null) {
            sb.append(" manufacturer");
        }
        if (this.f4108i == null) {
            sb.append(" modelClass");
        }
        throw new IllegalStateException(E0.a.k(sb, "Missing required properties:"));
    }
}
