package p166r;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f14451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14452t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f14453u;

    public d(f fVar) {
        this.f14453u = fVar;
    }

    @Override // p166r.e
    public final void a(c cVar) {
        c cVar2 = this.f14451s;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f14450v;
            this.f14451s = cVar3;
            this.f14452t = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14452t) {
            return this.f14453u.f14454s != null;
        }
        c cVar = this.f14451s;
        return (cVar == null || cVar.f14449u == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f14452t) {
            this.f14452t = false;
            this.f14451s = this.f14453u.f14454s;
        } else {
            c cVar = this.f14451s;
            this.f14451s = cVar != null ? cVar.f14449u : null;
        }
        return this.f14451s;
    }
}
