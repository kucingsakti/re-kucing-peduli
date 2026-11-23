package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends AbstractList implements C, RandomAccess {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B f6502s;

    public o0(B b3) {
        this.f6502s = b3;
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final void B(C0488h c0488h) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final Object J(int i10) {
        return this.f6502s.f6395t.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f6502s.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final C i() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        n0 n0Var = new n0();
        n0Var.f6501s = this.f6502s.iterator();
        return n0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final List l() {
        return Collections.unmodifiableList(this.f6502s.f6395t);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        m0 m0Var = new m0();
        m0Var.f6499s = this.f6502s.listIterator(i10);
        return m0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6502s.size();
    }
}
