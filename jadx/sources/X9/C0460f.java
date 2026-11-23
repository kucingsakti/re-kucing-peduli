package X9;

/* JADX INFO: renamed from: X9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0460f extends ma.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0461g f5583t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p204v1.f f5584u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0460f(C0461g c0461g, p204v1.f fVar, ma.v vVar) {
        super(vVar);
        this.f5583t = c0461g;
        this.f5584u = fVar;
    }

    @Override // ma.j, ma.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0461g c0461g = this.f5583t;
        p204v1.f fVar = this.f5584u;
        synchronized (c0461g) {
            if (fVar.a) {
                return;
            }
            fVar.a = true;
            super.close();
            ((K0.g) this.f5584u.f15393b).d();
        }
    }
}
