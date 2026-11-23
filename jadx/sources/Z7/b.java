package Z7;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c[] f5859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5860c;

    public b(int i10, k kVar) {
        this.a = i10;
        this.f5859b = new c[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f5859b[i11] = new c(kVar);
        }
    }
}
