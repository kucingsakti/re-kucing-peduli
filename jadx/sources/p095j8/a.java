package p095j8;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ListIterator, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f12507s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12508t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12509u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12510v;

    public a(b bVar, int i10) {
        this.f12507s = bVar;
        this.f12508t = i10;
        this.f12510v = ((AbstractList) bVar).modCount;
    }

    public final void a() {
        if (((AbstractList) this.f12507s).modCount != this.f12510v) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i10 = this.f12508t;
        this.f12508t = i10 + 1;
        b bVar = this.f12507s;
        bVar.add(i10, obj);
        this.f12509u = -1;
        this.f12510v = ((AbstractList) bVar).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12508t < this.f12507s.f12514u;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12508t > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        int i10 = this.f12508t;
        b bVar = this.f12507s;
        if (i10 >= bVar.f12514u) {
            throw new NoSuchElementException();
        }
        this.f12508t = i10 + 1;
        this.f12509u = i10;
        return bVar.f12512s[bVar.f12513t + i10];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12508t;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        int i10 = this.f12508t;
        if (i10 <= 0) {
            throw new NoSuchElementException();
        }
        int i11 = i10 - 1;
        this.f12508t = i11;
        this.f12509u = i11;
        b bVar = this.f12507s;
        return bVar.f12512s[bVar.f12513t + i11];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12508t - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i10 = this.f12509u;
        if (i10 == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        b bVar = this.f12507s;
        bVar.f(i10);
        this.f12508t = this.f12509u;
        this.f12509u = -1;
        this.f12510v = ((AbstractList) bVar).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i10 = this.f12509u;
        if (i10 == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        this.f12507s.set(i10, obj);
    }
}
