package ya;

/* JADX INFO: renamed from: ya.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0895p extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0882c f16220t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0895p(InterfaceC0882c interfaceC0882c, int i10) {
        super(1);
        this.f16219s = i10;
        this.f16220t = interfaceC0882c;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f16219s) {
            case 0:
                this.f16220t.cancel();
                break;
            default:
                this.f16220t.cancel();
                break;
        }
        return p076h8.m.a;
    }
}
