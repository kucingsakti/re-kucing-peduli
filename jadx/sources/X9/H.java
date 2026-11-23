package X9;

/* JADX INFO: loaded from: classes.dex */
public final class H extends J {
    public final /* synthetic */ int a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f5510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5511c;

    public H(A a, ma.i iVar) {
        this.f5510b = a;
        this.f5511c = iVar;
    }

    @Override // X9.J
    public final long a() {
        switch (this.a) {
            case 0:
                return ((ma.i) this.f5511c).h();
            default:
                return ((J) this.f5511c).a();
        }
    }

    @Override // X9.J
    public final A b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.f5510b;
    }

    @Override // X9.J
    public final void d(ma.g gVar) {
        switch (this.a) {
            case 0:
                gVar.O((ma.i) this.f5511c);
                break;
            default:
                ((J) this.f5511c).d(gVar);
                break;
        }
    }

    public H(J j, A a) {
        this.f5511c = j;
        this.f5510b = a;
    }
}
