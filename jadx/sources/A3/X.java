package A3;

import java.util.Collections;
import java.util.Spliterator;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractC0119q {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient Object f256u;

    public X(Object obj) {
        obj.getClass();
        this.f256u = obj;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C4.a.c(i10, 1);
        return this.f256u;
    }

    @Override // A3.AbstractC0113k
    public final boolean m() {
        return false;
    }

    @Override // A3.AbstractC0113k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: n */
    public final Z iterator() {
        return new J(this.f256u);
    }

    @Override // A3.AbstractC0119q, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final AbstractC0119q subList(int i10, int i11) {
        C4.a.e(i10, i11, 1);
        return i10 == i11 ? Q.f239v : this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 1;
    }

    @Override // A3.AbstractC0119q, A3.AbstractC0113k, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Spliterator spliterator() {
        return Collections.singleton(this.f256u).spliterator();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f256u.toString() + ']';
    }
}
