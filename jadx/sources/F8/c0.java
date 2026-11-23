package F8;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1568s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d0 f1569t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, int i10) {
        super(0);
        this.f1568s = i10;
        this.f1569t = d0Var;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f1568s) {
            case 0:
                return new b0(this.f1569t);
            default:
                return this.f1569t.k();
        }
    }
}
