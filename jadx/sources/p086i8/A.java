package p086i8;

import L9.d;
import java.util.List;
import java.util.ListIterator;
import p219w8.a;

/* JADX INFO: loaded from: classes.dex */
public final class A implements ListIterator, a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12303s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ListIterator f12304t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12305u;

    public A(d dVar, int i10) {
        this.f12305u = dVar;
        this.f12304t = ((List) dVar.f2854t).listIterator(k.M(dVar, i10));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f12303s) {
            case 0:
                ListIterator listIterator = this.f12304t;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12303s) {
            case 0:
                break;
        }
        return this.f12304t.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f12303s) {
            case 0:
                break;
        }
        return this.f12304t.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f12303s) {
            case 0:
                break;
        }
        return this.f12304t.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f12303s) {
            case 0:
                return l.B((B) this.f12305u) - this.f12304t.previousIndex();
            default:
                return l.B((d) this.f12305u) - this.f12304t.previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f12303s) {
            case 0:
                break;
        }
        return this.f12304t.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f12303s) {
            case 0:
                return l.B((B) this.f12305u) - this.f12304t.nextIndex();
            default:
                return l.B((d) this.f12305u) - this.f12304t.nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f12303s) {
            case 0:
                this.f12304t.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f12303s) {
            case 0:
                this.f12304t.set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public A(B b3, int i10) {
        this.f12305u = b3;
        this.f12304t = b3.f12306s.listIterator(k.M(b3, i10));
    }
}
