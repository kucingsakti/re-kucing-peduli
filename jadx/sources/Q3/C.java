package Q3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f4061i;
    public byte j;

    public final D a() {
        String str;
        if (this.j == 63 && (str = this.f4054b) != null) {
            return new D(this.a, str, this.f4055c, this.f4056d, this.f4057e, this.f4058f, this.f4059g, this.f4060h, this.f4061i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" pid");
        }
        if (this.f4054b == null) {
            sb.append(" processName");
        }
        if ((this.j & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.j & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.j & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.j & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.j & 32) == 0) {
            sb.append(" timestamp");
        }
        throw new IllegalStateException(E0.a.k(sb, "Missing required properties:"));
    }
}
