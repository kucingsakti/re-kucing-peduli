package za;

import ya.InterfaceC0882c;

/* JADX INFO: loaded from: classes.dex */
public final class b implements L7.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC0882c f16340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f16341t;

    public b(InterfaceC0882c interfaceC0882c) {
        this.f16340s = interfaceC0882c;
    }

    @Override // L7.b
    public final void f() {
        this.f16341t = true;
        this.f16340s.cancel();
    }
}
