package J9;

import U.Z;
import java.util.Iterator;
import p210v8.x;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Z f2472s;

    public h(Object[] objArr) {
        p210v8.i.f(objArr, "array");
        this.f2472s = x.g(objArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2472s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f2472s.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
