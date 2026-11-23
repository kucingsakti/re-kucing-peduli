package W7;

import J7.j;
import J7.k;
import J7.n;
import P2.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f5359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f5360c;

    public b(j jVar, n nVar) {
        this.f5359b = jVar;
        this.f5360c = nVar;
    }

    @Override // J7.j
    public final void V(k kVar) {
        R7.a aVar = new R7.a(kVar);
        kVar.b(aVar);
        O7.b.j(aVar, this.f5360c.b(new g((Object) this, (Object) aVar, 4, false)));
    }
}
