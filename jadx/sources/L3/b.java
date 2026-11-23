package L3;

import E4.C0187a;
import I3.n;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f2779c = new d();
    public final n a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f2780b = new AtomicReference(null);

    public b(n nVar) {
        this.a = nVar;
        nVar.a(new C0187a(this, 11));
    }

    public final d a(String str) {
        b bVar = (b) this.f2780b.get();
        return bVar == null ? f2779c : bVar.a(str);
    }

    public final boolean b() {
        b bVar = (b) this.f2780b.get();
        return bVar != null && bVar.b();
    }

    public final boolean c(String str) {
        b bVar = (b) this.f2780b.get();
        return bVar != null && bVar.c(str);
    }
}
