package I8;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2116s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f2117t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i10) {
        super(0);
        this.f2116s = i10;
        this.f2117t = kVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f2116s) {
            case 0:
                return o.f2197k.c(this.f2117t.f2129t);
            default:
                return o.f2197k.c(this.f2117t.f2128s);
        }
    }
}
