package F8;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1553s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a0 f1554t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(a0 a0Var, int i10) {
        super(0);
        this.f1553s = i10;
        this.f1554t = a0Var;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f1553s) {
            case 0:
                return new Y(this.f1554t);
            default:
                return this.f1554t.k();
        }
    }
}
