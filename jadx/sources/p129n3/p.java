package p129n3;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f13390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13396i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13397k;

    public final void a() {
        int i10 = this.f13394g;
        if (i10 < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
        if (this.f13397k < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f13395h == 0) {
            if (this.f13389b > 0 && i10 == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.f13390c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
