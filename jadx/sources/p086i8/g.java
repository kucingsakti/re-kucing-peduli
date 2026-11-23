package p086i8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p210v8.i;
import p210v8.x;
import p219w8.a;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Collection, a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object[] f12320s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f12321t;

    public g(Object[] objArr, boolean z6) {
        i.f(objArr, "values");
        this.f12320s = objArr;
        this.f12321t = z6;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return i.n(obj, this.f12320s);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        i.f(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!i.n(it.next(), this.f12320s)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f12320s.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return x.g(this.f12320s);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f12320s.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f12320s;
        i.f(objArr, "<this>");
        if (this.f12321t && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        i.e(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        i.f(objArr, "array");
        return i.p(this, objArr);
    }
}
