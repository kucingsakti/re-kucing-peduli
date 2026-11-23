package p095j8;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p210v8.i;
import p219w8.b;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractCollection implements Collection, b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f12537s;

    public g(e eVar) {
        this.f12537s = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        i.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f12537s.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12537s.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f12537s.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        e eVar = this.f12537s;
        eVar.getClass();
        return new c(eVar, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f12537s;
        eVar.c();
        int i10 = eVar.i(obj);
        if (i10 < 0) {
            return false;
        }
        eVar.l(i10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        i.f(collection, "elements");
        this.f12537s.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        i.f(collection, "elements");
        this.f12537s.c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f12537s.f12522A;
    }
}
