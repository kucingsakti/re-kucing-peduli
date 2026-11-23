package p095j8;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import o1.f;
import p086i8.e;
import p181s3.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f12511y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f12512s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12513t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12514u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12515v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f12516w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f12517x;

    static {
        b bVar = new b(0);
        bVar.f12515v = true;
        f12511y = bVar;
    }

    public b(Object[] objArr, int i10, int i11, boolean z6, b bVar, b bVar2) {
        this.f12512s = objArr;
        this.f12513t = i10;
        this.f12514u = i11;
        this.f12515v = z6;
        this.f12516w = bVar;
        this.f12517x = bVar2;
        if (bVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        o();
        n();
        m(this.f12513t + this.f12514u, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i.f(collection, "elements");
        o();
        n();
        int size = collection.size();
        k(this.f12513t + this.f12514u, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        o();
        n();
        s(this.f12513t, this.f12514u);
    }

    @Override // p086i8.e
    public final int e() {
        n();
        return this.f12514u;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        n();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f12512s;
            int i10 = this.f12514u;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i.a(objArr[this.f12513t + i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p086i8.e
    public final Object f(int i10) {
        o();
        n();
        int i11 = this.f12514u;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("index: ", i10, ", size: ", i11));
        }
        return r(this.f12513t + i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        n();
        int i11 = this.f12514u;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("index: ", i10, ", size: ", i11));
        }
        return this.f12512s[this.f12513t + i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        n();
        Object[] objArr = this.f12512s;
        int i10 = this.f12514u;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[this.f12513t + i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        n();
        for (int i10 = 0; i10 < this.f12514u; i10++) {
            if (i.a(this.f12512s[this.f12513t + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        n();
        return this.f12514u == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        b bVar = this.f12516w;
        if (bVar != null) {
            bVar.k(i10, collection, i11);
            this.f12512s = bVar.f12512s;
            this.f12514u += i11;
        } else {
            q(i10, i11);
            Iterator it = collection.iterator();
            for (int i12 = 0; i12 < i11; i12++) {
                this.f12512s[i10 + i12] = it.next();
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        n();
        for (int i10 = this.f12514u - 1; i10 >= 0; i10--) {
            if (i.a(this.f12512s[this.f12513t + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void m(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.f12516w;
        if (bVar == null) {
            q(i10, 1);
            this.f12512s[i10] = obj;
        } else {
            bVar.m(i10, obj);
            this.f12512s = bVar.f12512s;
            this.f12514u++;
        }
    }

    public final void n() {
        b bVar = this.f12517x;
        if (bVar != null && ((AbstractList) bVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void o() {
        b bVar;
        if (this.f12515v || ((bVar = this.f12517x) != null && bVar.f12515v)) {
            throw new UnsupportedOperationException();
        }
    }

    public final void q(int i10, int i11) {
        int i12 = this.f12514u + i11;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f12512s;
        if (i12 > objArr.length) {
            int length = objArr.length;
            int i13 = length + (length >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - 2147483639 > 0) {
                i13 = i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i13);
            i.e(objArrCopyOf, "copyOf(...)");
            this.f12512s = objArrCopyOf;
        }
        Object[] objArr2 = this.f12512s;
        p086i8.i.q(objArr2, objArr2, i10 + i11, i10, this.f12513t + this.f12514u);
        this.f12514u += i11;
    }

    public final Object r(int i10) {
        ((AbstractList) this).modCount++;
        b bVar = this.f12516w;
        if (bVar != null) {
            Object objR = bVar.r(i10);
            this.f12514u--;
            return objR;
        }
        Object[] objArr = this.f12512s;
        Object obj = objArr[i10];
        int i11 = this.f12514u;
        int i12 = this.f12513t;
        p086i8.i.q(objArr, objArr, i10, i10 + 1, i11 + i12);
        Object[] objArr2 = this.f12512s;
        int i13 = (i12 + this.f12514u) - 1;
        i.f(objArr2, "<this>");
        objArr2[i13] = null;
        this.f12514u--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        o();
        n();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            f(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        i.f(collection, "elements");
        o();
        n();
        return u(this.f12513t, this.f12514u, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        i.f(collection, "elements");
        o();
        n();
        return u(this.f12513t, this.f12514u, collection, true) > 0;
    }

    public final void s(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f12516w;
        if (bVar != null) {
            bVar.s(i10, i11);
        } else {
            Object[] objArr = this.f12512s;
            p086i8.i.q(objArr, objArr, i10, i10 + i11, this.f12514u);
            Object[] objArr2 = this.f12512s;
            int i12 = this.f12514u;
            f.n(i12 - i11, i12, objArr2);
        }
        this.f12514u -= i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        o();
        n();
        int i11 = this.f12514u;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("index: ", i10, ", size: ", i11));
        }
        Object[] objArr = this.f12512s;
        int i12 = this.f12513t;
        Object obj2 = objArr[i12 + i10];
        objArr[i12 + i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        a.c(i10, i11, this.f12514u);
        Object[] objArr = this.f12512s;
        int i12 = this.f12513t + i10;
        int i13 = i11 - i10;
        boolean z6 = this.f12515v;
        b bVar = this.f12517x;
        return new b(objArr, i12, i13, z6, this, bVar == null ? this : bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        i.f(objArr, "destination");
        n();
        int length = objArr.length;
        int i10 = this.f12514u;
        int i11 = this.f12513t;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f12512s, i11, i10 + i11, objArr.getClass());
            i.e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        p086i8.i.q(this.f12512s, objArr, 0, i11, i10 + i11);
        int i12 = this.f12514u;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        n();
        Object[] objArr = this.f12512s;
        int i10 = this.f12514u;
        StringBuilder sb = new StringBuilder((i10 * 3) + 2);
        sb.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[this.f12513t + i11];
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        i.e(string, "toString(...)");
        return string;
    }

    public final int u(int i10, int i11, Collection collection, boolean z6) {
        int iU;
        b bVar = this.f12516w;
        if (bVar != null) {
            iU = bVar.u(i10, i11, collection, z6);
        } else {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = i10 + i12;
                if (collection.contains(this.f12512s[i14]) == z6) {
                    Object[] objArr = this.f12512s;
                    i12++;
                    objArr[i13 + i10] = objArr[i14];
                    i13++;
                } else {
                    i12++;
                }
            }
            int i15 = i11 - i13;
            Object[] objArr2 = this.f12512s;
            p086i8.i.q(objArr2, objArr2, i10 + i13, i11 + i10, this.f12514u);
            Object[] objArr3 = this.f12512s;
            int i16 = this.f12514u;
            f.n(i16 - i15, i16, objArr3);
            iU = i15;
        }
        if (iU > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f12514u -= iU;
        return iU;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        n();
        int i11 = this.f12514u;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("index: ", i10, ", size: ", i11));
        }
        return new a(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        o();
        n();
        int i11 = this.f12514u;
        if (i10 >= 0 && i10 <= i11) {
            m(this.f12513t + i10, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0487g.h("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        i.f(collection, "elements");
        o();
        n();
        int i11 = this.f12514u;
        if (i10 >= 0 && i10 <= i11) {
            int size = collection.size();
            k(this.f12513t + i10, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0487g.h("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        n();
        Object[] objArr = this.f12512s;
        int i10 = this.f12514u;
        int i11 = this.f12513t;
        return p086i8.i.s(i11, i10 + i11, objArr);
    }

    public b() {
        this(10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(int i10) {
        this(new Object[i10], 0, 0, false, null, null);
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }
}
