package F8;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1579s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0 f1580t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(i0 i0Var, int i10) {
        super(0);
        this.f1579s = i10;
        this.f1580t = i0Var;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f1579s) {
            case 0:
                return t0.a(this.f1580t, false);
            default:
                i0 i0Var = this.f1580t;
                O8.M mH = i0Var.l().g().h();
                return mH == null ? p124m9.m.g(i0Var.l().g(), M8.g.a) : mH;
        }
    }
}
