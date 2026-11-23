package A3;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: A3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0103a extends Z implements ListIterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f259t;

    public AbstractC0103a(int i10, int i11) {
        C4.a.d(i11, i10);
        this.f258s = i10;
        this.f259t = i11;
    }

    public abstract Object a(int i10);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f259t < this.f258s;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f259t > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f259t;
        this.f259t = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f259t;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f259t - 1;
        this.f259t = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f259t - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
