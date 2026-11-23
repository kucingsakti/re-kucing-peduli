package K3;

import I3.n;
import java.util.ArrayList;
import p106l0.g;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f2577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f2578c;

    public b(n nVar) {
        N3.b bVar = new N3.b();
        d dVar = new d(8);
        this.f2578c = bVar;
        this.a = new ArrayList();
        this.f2577b = dVar;
        nVar.a(new a(this));
    }

    public b(g gVar) {
        this.a = gVar;
    }
}
