package J9;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2467s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2468t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f2469u;

    public f(g gVar) {
        this.f2469u = gVar;
        this.f2468t = ((AbstractList) gVar).modCount;
    }

    public final void a() {
        g gVar = this.f2469u;
        int i10 = ((AbstractList) gVar).modCount;
        int i11 = this.f2468t;
        if (i10 == i11) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) gVar).modCount + "; expected: " + i11);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f2467s;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2467s) {
            throw new NoSuchElementException();
        }
        this.f2467s = true;
        a();
        return this.f2469u.f2471t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.f2469u.clear();
    }
}
