package Z8;

import A9.O;
import L8.InterfaceC0273g;
import L8.P;
import R8.p;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y1.c f5910s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P f5911t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f5912u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ O f5913v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f5914w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Y1.c cVar, P p10, a aVar, O o10, p pVar) {
        super(0);
        this.f5910s = cVar;
        this.f5911t = p10;
        this.f5912u = aVar;
        this.f5913v = o10;
        this.f5914w = pVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        o1.e eVar = (o1.e) this.f5910s.f5672v;
        InterfaceC0273g interfaceC0273gW = this.f5913v.w();
        return eVar.T0(this.f5911t, a.a(a.a(this.f5912u, 0, false, null, interfaceC0273gW != null ? interfaceC0273gW.p() : null, 31), 0, this.f5914w.d(), null, null, 59));
    }
}
