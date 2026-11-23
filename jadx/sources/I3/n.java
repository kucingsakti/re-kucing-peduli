package I3;

import E4.B;

/* JADX INFO: loaded from: classes.dex */
public final class n implements p073h4.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D3.i f2043c = new D3.i(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f2044d = new f(1);
    public p073h4.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile p073h4.b f2045b;

    public n(D3.i iVar, p073h4.b bVar) {
        this.a = iVar;
        this.f2045b = bVar;
    }

    public final void a(p073h4.a aVar) {
        p073h4.b bVar;
        p073h4.b bVar2;
        p073h4.b bVar3 = this.f2045b;
        f fVar = f2044d;
        if (bVar3 != fVar) {
            aVar.c(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f2045b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.a = new B(this.a, 2, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.c(bVar);
        }
    }

    @Override // p073h4.b
    public final Object get() {
        return this.f2045b.get();
    }
}
