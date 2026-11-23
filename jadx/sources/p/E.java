package p;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractViewOnTouchListenerC0727s0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ K f13933B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.c f13934C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(androidx.appcompat.widget.c cVar, androidx.appcompat.widget.c cVar2, K k3) {
        super(cVar2);
        this.f13934C = cVar;
        this.f13933B = k3;
    }

    @Override // p.AbstractViewOnTouchListenerC0727s0
    public final p136o.B b() {
        return this.f13933B;
    }

    @Override // p.AbstractViewOnTouchListenerC0727s0
    public final boolean c() {
        androidx.appcompat.widget.c cVar = this.f13934C;
        if (cVar.getInternalPopup().b()) {
            return true;
        }
        cVar.f6283x.l(cVar.getTextDirection(), cVar.getTextAlignment());
        return true;
    }
}
