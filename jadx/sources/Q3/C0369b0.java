package Q3;

/* JADX INFO: renamed from: Q3.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0369b0 {
    public Double a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f4181g;

    public final C0371c0 a() {
        if (this.f4181g == 31) {
            return new C0371c0(this.a, this.f4176b, this.f4177c, this.f4178d, this.f4179e, this.f4180f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f4181g & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.f4181g & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.f4181g & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.f4181g & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.f4181g & 16) == 0) {
            sb.append(" diskUsed");
        }
        throw new IllegalStateException(E0.a.k(sb, "Missing required properties:"));
    }
}
