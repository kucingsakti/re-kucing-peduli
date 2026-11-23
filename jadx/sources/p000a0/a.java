package p000a0;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f5966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5971i;

    public final float a(long j) {
        long j10 = this.f5967e;
        if (j < j10) {
            return 0.0f;
        }
        long j11 = this.f5969g;
        if (j11 < 0 || j < j11) {
            return g.b((j - j10) / this.a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f5970h;
        return (g.b((j - j11) / this.f5971i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
