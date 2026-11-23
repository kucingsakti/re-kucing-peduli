package V9;

import N9.C0324g;
import N9.InterfaceC0323f;
import N9.z0;
import O3.y;
import S9.s;
import p076h8.m;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0323f, z0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0324g f5224s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f5225t;

    public c(d dVar, C0324g c0324g) {
        this.f5225t = dVar;
        this.f5224s = c0324g;
    }

    @Override // N9.z0
    public final void a(s sVar, int i10) {
        this.f5224s.a(sVar, i10);
    }

    @Override // N9.InterfaceC0323f
    public final y f(Object obj, p200u8.b bVar) {
        d dVar = this.f5225t;
        b bVar2 = new b(dVar, this, 1);
        y yVarF = this.f5224s.f((m) obj, bVar2);
        if (yVarF != null) {
            d.f5226g.set(dVar, null);
        }
        return yVarF;
    }

    @Override // N9.InterfaceC0323f
    public final void g(Object obj) {
        this.f5224s.g(obj);
    }

    @Override // p123m8.d
    public final p123m8.i getContext() {
        return this.f5224s.f3452w;
    }

    @Override // p123m8.d
    public final void resumeWith(Object obj) {
        this.f5224s.resumeWith(obj);
    }
}
