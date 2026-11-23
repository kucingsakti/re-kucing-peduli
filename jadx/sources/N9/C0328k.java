package N9;

/* JADX INFO: renamed from: N9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0328k extends d0 implements InterfaceC0327j {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k0 f3468w;

    public C0328k(k0 k0Var) {
        this.f3468w = k0Var;
    }

    @Override // N9.InterfaceC0327j
    public final boolean g(Throwable th) {
        return m().o(th);
    }

    @Override // p200u8.b
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n((Throwable) obj);
        return p076h8.m.a;
    }

    @Override // N9.f0
    public final void n(Throwable th) {
        this.f3468w.k(m());
    }
}
