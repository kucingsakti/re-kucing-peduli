package F8;

/* JADX INFO: loaded from: classes.dex */
public final class M extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1527s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ S f1528t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(S s9, int i10) {
        super(0);
        this.f1527s = i10;
        this.f1528t = s9;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f1527s) {
            case 0:
                return p068ga.d.i(this.f1528t.f1540t);
            default:
                return new P(this.f1528t);
        }
    }
}
