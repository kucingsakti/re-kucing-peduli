package Q3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class I {
    public String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f4078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public K f4080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0387k0 f4081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0385j0 f4082i;
    public N j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f4083k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4084l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f4085m;

    public final J a() {
        String str;
        String str2;
        K k3;
        if (this.f4085m == 7 && (str = this.a) != null && (str2 = this.f4075b) != null && (k3 = this.f4080g) != null) {
            return new J(str, str2, this.f4076c, this.f4077d, this.f4078e, this.f4079f, k3, this.f4081h, this.f4082i, this.j, this.f4083k, this.f4084l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" generator");
        }
        if (this.f4075b == null) {
            sb.append(" identifier");
        }
        if ((this.f4085m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.f4085m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.f4080g == null) {
            sb.append(" app");
        }
        if ((this.f4085m & 4) == 0) {
            sb.append(" generatorType");
        }
        throw new IllegalStateException(E0.a.k(sb, "Missing required properties:"));
    }
}
