package N9;

/* JADX INFO: loaded from: classes.dex */
public final class N extends P {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0324g f3420u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ S f3421v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(S s9, long j, C0324g c0324g) {
        super(j);
        this.f3421v = s9;
        this.f3420u = c0324g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3420u.G(this.f3421v);
    }

    @Override // N9.P
    public final String toString() {
        return super.toString() + this.f3420u;
    }
}
