package p086i8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p219w8.a;

/* JADX INFO: renamed from: i8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0662a implements Iterator, a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public D f12313s = D.f12309t;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f12314t;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        D d3 = this.f12313s;
        D d8 = D.f12311v;
        if (d3 == d8) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iOrdinal = d3.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 2) {
            return false;
        }
        this.f12313s = d8;
        a();
        return this.f12313s == D.f12308s;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12313s = D.f12309t;
        return this.f12314t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
