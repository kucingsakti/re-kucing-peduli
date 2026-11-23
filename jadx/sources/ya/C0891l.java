package ya;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ya.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0891l implements InterfaceC0882c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Executor f16211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InterfaceC0882c f16212t;

    public C0891l(Executor executor, InterfaceC0882c interfaceC0882c) {
        this.f16211s = executor;
        this.f16212t = interfaceC0882c;
    }

    @Override // ya.InterfaceC0882c
    public final X9.G K() {
        return this.f16212t.K();
    }

    @Override // ya.InterfaceC0882c
    public final boolean T() {
        return this.f16212t.T();
    }

    @Override // ya.InterfaceC0882c
    public final void cancel() {
        this.f16212t.cancel();
    }

    @Override // ya.InterfaceC0882c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0882c clone() {
        return new C0891l(this.f16211s, this.f16212t.clone());
    }

    @Override // ya.InterfaceC0882c
    public final void n(InterfaceC0885f interfaceC0885f) {
        this.f16212t.n(new o1.k(this, interfaceC0885f, false));
    }
}
