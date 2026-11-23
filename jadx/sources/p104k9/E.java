package p104k9;

import M2.C0303l;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractList implements RandomAccess, r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q f12769s;

    public E(q qVar) {
        this.f12769s = qVar;
    }

    @Override // p104k9.r
    public final AbstractC0675d A(int i10) {
        return this.f12769s.A(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f12769s.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C0303l c0303l = new C0303l(1);
        c0303l.f3047t = this.f12769s.iterator();
        return c0303l;
    }

    @Override // p104k9.r
    public final List l() {
        return Collections.unmodifiableList(this.f12769s.f12820s);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        D d3 = new D();
        d3.f12768s = this.f12769s.listIterator(i10);
        return d3;
    }

    @Override // p104k9.r
    public final void p(s sVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12769s.size();
    }

    @Override // p104k9.r
    public final E i() {
        return this;
    }
}
