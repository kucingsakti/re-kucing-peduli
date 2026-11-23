package K9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Iterator f2685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Iterator f2686t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f2687u;

    public h(i iVar) {
        this.f2687u = iVar;
        this.f2685s = iVar.a.iterator();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, u8.b] */
    public final boolean a() {
        Iterator it = this.f2686t;
        if (it != null && !it.hasNext()) {
            this.f2686t = null;
        }
        while (this.f2686t == null) {
            Iterator it2 = this.f2685s;
            if (!it2.hasNext()) {
                return false;
            }
            Object next = it2.next();
            i iVar = this.f2687u;
            Iterator it3 = (Iterator) iVar.f2689c.invoke(iVar.f2688b.invoke(next));
            if (it3.hasNext()) {
                this.f2686t = it3;
                break;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.f2686t;
        p210v8.i.c(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
