package X9;

/* JADX INFO: loaded from: classes.dex */
public final class I extends J {
    public final /* synthetic */ A a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f5513c;

    public I(A a, int i10, byte[] bArr) {
        this.a = a;
        this.f5512b = i10;
        this.f5513c = bArr;
    }

    @Override // X9.J
    public final long a() {
        return this.f5512b;
    }

    @Override // X9.J
    public final A b() {
        return this.a;
    }

    @Override // X9.J
    public final void d(ma.g gVar) {
        gVar.N(this.f5512b, this.f5513c);
    }
}
