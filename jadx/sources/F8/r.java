package F8;

import L8.InterfaceC0269c;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0269c f1623s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1624t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC0269c interfaceC0269c, int i10) {
        super(0);
        this.f1623s = interfaceC0269c;
        this.f1624t = i10;
    }

    @Override // p200u8.a
    public final Object invoke() {
        Object obj = this.f1623s.H0().get(this.f1624t);
        p210v8.i.e(obj, "descriptor.valueParameters[i]");
        return (L8.I) obj;
    }
}
