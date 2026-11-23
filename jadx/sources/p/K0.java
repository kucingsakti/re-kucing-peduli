package p;

/* JADX INFO: loaded from: classes.dex */
public final class K0 {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13969h;

    public final void a(int i10, int i11) {
        this.f13964c = i10;
        this.f13965d = i11;
        this.f13969h = true;
        if (this.f13968g) {
            if (i11 != Integer.MIN_VALUE) {
                this.a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f13963b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f13963b = i11;
        }
    }
}
