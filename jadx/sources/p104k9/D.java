package p104k9;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class D implements ListIterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ListIterator f12768s;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12768s.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12768s.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f12768s.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12768s.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f12768s.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12768s.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
