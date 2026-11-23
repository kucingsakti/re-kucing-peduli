package H1;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f1874b = new m(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f1875c = new m(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f1876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f1877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f1878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p232y1.g f1879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f1880h;
    public final /* synthetic */ int a;

    static {
        m mVar = new m(1);
        f1876d = mVar;
        f1877e = new m(3);
        f1878f = mVar;
        f1879g = p232y1.g.a(mVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f1880h = true;
    }

    public /* synthetic */ m(int i10) {
        this.a = i10;
    }

    public final int a(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                if (b(i10, i11, i12, i13) == 1.0f) {
                    return 2;
                }
                return f1874b.a(i10, i11, i12, i13);
            case 1:
                return 2;
            case 2:
                return f1880h ? 2 : 1;
            default:
                return 2;
        }
    }

    public final float b(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                return Math.min(1.0f, f1874b.b(i10, i11, i12, i13));
            case 1:
                return Math.max(i12 / i10, i13 / i11);
            case 2:
                if (f1880h) {
                    return Math.min(i12 / i10, i13 / i11);
                }
                int iMax = Math.max(i11 / i13, i10 / i12);
                if (iMax == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(iMax);
            default:
                return 1.0f;
        }
    }
}
