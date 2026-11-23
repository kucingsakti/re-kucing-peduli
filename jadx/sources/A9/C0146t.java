package A9;

/* JADX INFO: renamed from: A9.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0146t extends r implements c0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r f385v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AbstractC0151y f386w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0146t(r rVar, AbstractC0151y abstractC0151y) {
        super(rVar.f383t, rVar.f384u);
        p210v8.i.f(rVar, "origin");
        p210v8.i.f(abstractC0151y, "enhancement");
        this.f385v = rVar;
        this.f386w = abstractC0151y;
    }

    @Override // A9.d0
    public final d0 G0(boolean z6) {
        return AbstractC0130c.B(this.f385v.G0(z6), this.f386w.D0().G0(z6));
    }

    @Override // A9.d0
    public final d0 K0(B9.f fVar) {
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        r rVar = this.f385v;
        p210v8.i.f(rVar, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        AbstractC0151y abstractC0151y = this.f386w;
        p210v8.i.f(abstractC0151y, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        return new C0146t(rVar, abstractC0151y);
    }

    @Override // A9.d0
    public final d0 N0(K k3) {
        p210v8.i.f(k3, "newAttributes");
        return AbstractC0130c.B(this.f385v.N0(k3), this.f386w);
    }

    @Override // A9.r
    public final D O0() {
        return this.f385v.O0();
    }

    @Override // A9.r
    public final String P0(p114l9.g gVar, p114l9.g gVar2) {
        p210v8.i.f(gVar, "renderer");
        p114l9.k kVar = gVar2.a;
        kVar.getClass();
        return ((Boolean) kVar.f13037m.a(p114l9.k.f13005W[11], kVar)).booleanValue() ? gVar.Y(this.f386w) : this.f385v.P0(gVar, gVar2);
    }

    @Override // A9.c0
    public final AbstractC0151y a() {
        return this.f386w;
    }

    @Override // A9.c0
    public final d0 i() {
        return this.f385v;
    }

    @Override // A9.AbstractC0151y
    public final AbstractC0151y l0(B9.f fVar) {
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        r rVar = this.f385v;
        p210v8.i.f(rVar, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        AbstractC0151y abstractC0151y = this.f386w;
        p210v8.i.f(abstractC0151y, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        return new C0146t(rVar, abstractC0151y);
    }

    @Override // A9.r
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f386w + ")] " + this.f385v;
    }
}
