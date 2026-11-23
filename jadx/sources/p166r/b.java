package p166r;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f14444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f14445t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14446u;

    public b(c cVar, c cVar2, int i10) {
        this.f14446u = i10;
        this.f14444s = cVar2;
        this.f14445t = cVar;
    }

    @Override // p166r.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f14444s == cVar && cVar == this.f14445t) {
            this.f14445t = null;
            this.f14444s = null;
        }
        c cVar3 = this.f14444s;
        if (cVar3 == cVar) {
            switch (this.f14446u) {
                case 0:
                    cVar2 = cVar3.f14450v;
                    break;
                default:
                    cVar2 = cVar3.f14449u;
                    break;
            }
            this.f14444s = cVar2;
        }
        c cVar4 = this.f14445t;
        if (cVar4 == cVar) {
            c cVar5 = this.f14444s;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f14445t = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f14446u) {
            case 0:
                return cVar.f14449u;
            default:
                return cVar.f14450v;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14445t != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f14445t;
        c cVar2 = this.f14444s;
        this.f14445t = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
