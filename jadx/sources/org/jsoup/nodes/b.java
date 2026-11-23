package org.jsoup.nodes;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13861s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f13862t;

    public b(c cVar) {
        this.f13862t = cVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        c cVar;
        while (true) {
            int i10 = this.f13861s;
            cVar = this.f13862t;
            if (i10 >= cVar.f13863s || !c.u(cVar.f13864t[i10])) {
                break;
            }
            this.f13861s++;
        }
        return this.f13861s < cVar.f13863s;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f13862t;
        String[] strArr = cVar.f13864t;
        int i10 = this.f13861s;
        a aVar = new a(strArr[i10], (String) cVar.f13865u[i10], cVar);
        this.f13861s++;
        return aVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f13861s - 1;
        this.f13861s = i10;
        this.f13862t.x(i10);
    }
}
