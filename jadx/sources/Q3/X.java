package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class X {
    public long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f4153f;

    public final Y a() {
        String str;
        if (this.f4153f == 7 && (str = this.f4149b) != null) {
            return new Y(this.a, str, this.f4150c, this.f4151d, this.f4152e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f4153f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.f4149b == null) {
            sb.append(" symbol");
        }
        if ((this.f4153f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f4153f & 4) == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException(E0.a.k(sb, "Missing required properties:"));
    }
}
