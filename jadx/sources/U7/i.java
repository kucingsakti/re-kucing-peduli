package U7;

import J7.o;

/* JADX INFO: loaded from: classes.dex */
public final class i extends J7.g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4921s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f4922t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f4923u;

    public /* synthetic */ i(Object obj, int i10, Object obj2) {
        this.f4921s = i10;
        this.f4922t = obj;
        this.f4923u = obj2;
    }

    @Override // J7.g
    public final void b(J7.i iVar) {
        switch (this.f4921s) {
            case 0:
                ((c) this.f4922t).a(new h(iVar, this));
                break;
            default:
                ((o) this.f4922t).b(new R7.a(iVar, 2, (N7.c) this.f4923u));
                break;
        }
    }
}
