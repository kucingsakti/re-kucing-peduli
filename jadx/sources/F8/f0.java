package F8;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g0 f1573t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(g0 g0Var, int i10) {
        super(0);
        this.f1572s = i10;
        this.f1573t = g0Var;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f1572s) {
            case 0:
                return t0.a(this.f1573t, true);
            default:
                g0 g0Var = this.f1573t;
                O8.L lE = g0Var.l().g().e();
                return lE == null ? p124m9.m.f(g0Var.l().g(), M8.g.a) : lE;
        }
    }
}
