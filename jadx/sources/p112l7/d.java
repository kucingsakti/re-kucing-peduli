package p112l7;

import V3.b;
import Y1.c;
import android.os.Handler;
import o1.r;
import p085i7.g;
import p122m7.a;
import p163q7.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final i a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f12943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f12944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f12945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f12946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f12947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f12948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p143o7.a f12949h;

    public d(i iVar, g gVar, a aVar, c cVar, Handler handler, r rVar, b bVar, p143o7.a aVar2) {
        p210v8.i.g(handler, "uiHandler");
        p210v8.i.g(aVar2, "networkInfoProvider");
        this.a = iVar;
        this.f12943b = gVar;
        this.f12944c = aVar;
        this.f12945d = cVar;
        this.f12946e = handler;
        this.f12947f = rVar;
        this.f12948g = bVar;
        this.f12949h = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p210v8.i.a(this.a, dVar.a) && p210v8.i.a(this.f12943b, dVar.f12943b) && p210v8.i.a(this.f12944c, dVar.f12944c) && p210v8.i.a(this.f12945d, dVar.f12945d) && p210v8.i.a(this.f12946e, dVar.f12946e) && p210v8.i.a(this.f12947f, dVar.f12947f) && p210v8.i.a(this.f12948g, dVar.f12948g) && p210v8.i.a(this.f12949h, dVar.f12949h);
    }

    public final int hashCode() {
        int iHashCode = (this.f12945d.hashCode() + ((this.f12944c.hashCode() + ((this.f12943b.hashCode() + ((-1521653773) * 31)) * 31)) * 31)) * 31;
        Handler handler = this.f12946e;
        int iHashCode2 = (this.f12948g.hashCode() + ((this.f12947f.hashCode() + ((iHashCode + (handler != null ? handler.hashCode() : 0)) * 31)) * 31)) * 31;
        p143o7.a aVar = this.f12949h;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "Holder(handlerWrapper=" + this.a + ", fetchDatabaseManagerWrapper=" + this.f12943b + ", downloadProvider=" + this.f12944c + ", groupInfoProvider=" + this.f12945d + ", uiHandler=" + this.f12946e + ", downloadManagerCoordinator=" + this.f12947f + ", listenerCoordinator=" + this.f12948g + ", networkInfoProvider=" + this.f12949h + ")";
    }
}
