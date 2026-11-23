package K9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Iterator, p123m8.d, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f2696t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Iterator f2697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p123m8.d f2698v;

    public final RuntimeException a() {
        int i10 = this.f2695s;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f2695s);
    }

    @Override // p123m8.d
    public final p123m8.i getContext() {
        return p123m8.j.f13164s;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i10 = this.f2695s;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f2697u;
                p210v8.i.c(it);
                if (it.hasNext()) {
                    this.f2695s = 2;
                    return true;
                }
                this.f2697u = null;
            }
            this.f2695s = 5;
            p123m8.d dVar = this.f2698v;
            p210v8.i.c(dVar);
            this.f2698v = null;
            dVar.resumeWith(p076h8.m.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f2695s;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f2695s = 1;
            Iterator it = this.f2697u;
            p210v8.i.c(it);
            return it.next();
        }
        if (i10 != 3) {
            throw a();
        }
        this.f2695s = 0;
        Object obj = this.f2696t;
        this.f2696t = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p123m8.d
    public final void resumeWith(Object obj) {
        J7.a.v(obj);
        this.f2695s = 4;
    }
}
