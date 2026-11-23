package K9;

import java.util.Iterator;
import p086i8.v;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2674s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Iterator f2675t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2676u;

    public b(Iterator it) {
        p210v8.i.f(it, "iterator");
        this.f2675t = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f2674s) {
            case 0:
                break;
            default:
                return this.f2675t.hasNext();
        }
        while (true) {
            int i10 = this.f2676u;
            it = this.f2675t;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f2676u--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f2674s) {
            case 0:
                break;
            default:
                int i10 = this.f2676u;
                this.f2676u = i10 + 1;
                if (i10 >= 0) {
                    return new v(i10, this.f2675t.next());
                }
                p086i8.l.G();
                throw null;
        }
        while (true) {
            int i11 = this.f2676u;
            it = this.f2675t;
            if (i11 > 0 && it.hasNext()) {
                it.next();
                this.f2676u--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2674s) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar) {
        this.f2675t = cVar.a.iterator();
        this.f2676u = cVar.f2677b;
    }
}
