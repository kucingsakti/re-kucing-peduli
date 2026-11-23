package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class A {
    public String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f4039i;
    public J j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public G f4040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public D f4041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f4042m;

    public final B a() {
        if (this.f4042m == 1 && this.a != null && this.f4032b != null && this.f4034d != null && this.f4038h != null && this.f4039i != null) {
            return new B(this.a, this.f4032b, this.f4033c, this.f4034d, this.f4035e, this.f4036f, this.f4037g, this.f4038h, this.f4039i, this.j, this.f4040k, this.f4041l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" sdkVersion");
        }
        if (this.f4032b == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.f4042m) == 0) {
            sb.append(" platform");
        }
        if (this.f4034d == null) {
            sb.append(" installationUuid");
        }
        if (this.f4038h == null) {
            sb.append(" buildVersion");
        }
        if (this.f4039i == null) {
            sb.append(" displayVersion");
        }
        throw new IllegalStateException(E0.a.k(sb, "Missing required properties:"));
    }
}
