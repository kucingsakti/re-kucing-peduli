package p086i8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class B extends e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f12306s;

    public B(ArrayList arrayList) {
        this.f12306s = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f12306s.add(k.M(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f12306s.clear();
    }

    @Override // p086i8.e
    public final int e() {
        return this.f12306s.size();
    }

    @Override // p086i8.e
    public final Object f(int i10) {
        return this.f12306s.remove(k.L(this, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f12306s.get(k.L(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new A(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new A(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return this.f12306s.set(k.L(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new A(this, i10);
    }
}
