package p029c9;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p f7564k = new p(false, false, false, false, false, new p(false, false, false, false, false, null, false, null, null, 1023), false, null, null, 988);
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f7569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f7571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f7572i;
    public final boolean j;

    public p(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, p pVar, boolean z14, p pVar2, p pVar3, int i10) {
        z6 = (i10 & 1) != 0 ? true : z6;
        z10 = (i10 & 2) != 0 ? true : z10;
        z11 = (i10 & 4) != 0 ? false : z11;
        z12 = (i10 & 8) != 0 ? false : z12;
        z13 = (i10 & 16) != 0 ? false : z13;
        pVar = (i10 & 32) != 0 ? null : pVar;
        z14 = (i10 & 64) != 0 ? true : z14;
        pVar2 = (i10 & 128) != 0 ? pVar : pVar2;
        pVar3 = (i10 & 256) != 0 ? pVar : pVar3;
        boolean z15 = (i10 & 512) == 0;
        this.a = z6;
        this.f7565b = z10;
        this.f7566c = z11;
        this.f7567d = z12;
        this.f7568e = z13;
        this.f7569f = pVar;
        this.f7570g = z14;
        this.f7571h = pVar2;
        this.f7572i = pVar3;
        this.j = z15;
    }
}
