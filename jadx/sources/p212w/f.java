package p212w;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p086i8.i;
import p086i8.k;
import p219w8.b;
import p219w8.e;
import p221x.a;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Collection, Set, b, e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f15496s = a.a;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object[] f15497t = a.f15702b;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15498u;

    public f(int i10) {
        if (i10 > 0) {
            h.b(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int iC;
        int i11 = this.f15498u;
        if (obj == null) {
            iC = h.c(this, null, 0);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iC = h.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i12 = ~iC;
        int[] iArr = this.f15496s;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f15497t;
            h.b(this, i13);
            if (i11 != this.f15498u) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f15496s;
            if (iArr2.length != 0) {
                i.p(0, 0, iArr.length, iArr, iArr2);
                i.r(objArr, this.f15497t, 0, objArr.length, 6);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f15496s;
            int i14 = i12 + 1;
            i.p(i14, i12, i11, iArr3, iArr3);
            Object[] objArr2 = this.f15497t;
            i.q(objArr2, objArr2, i14, i12, i11);
        }
        int i15 = this.f15498u;
        if (i11 == i15) {
            int[] iArr4 = this.f15496s;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f15497t[i12] = obj;
                this.f15498u = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        p210v8.i.f(collection, "elements");
        int size = collection.size() + this.f15498u;
        int i10 = this.f15498u;
        int[] iArr = this.f15496s;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f15497t;
            h.b(this, size);
            int i11 = this.f15498u;
            if (i11 > 0) {
                i.p(0, 0, i11, iArr, this.f15496s);
                i.r(objArr, this.f15497t, 0, this.f15498u, 6);
            }
        }
        if (this.f15498u != i10) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f15498u != 0) {
            this.f15496s = a.a;
            this.f15497t = a.f15702b;
            this.f15498u = 0;
        }
        if (this.f15498u != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? h.c(this, null, 0) : h.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        p210v8.i.f(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object e(int i10) {
        int i11 = this.f15498u;
        Object[] objArr = this.f15497t;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i12 = i11 - 1;
        int[] iArr = this.f15496s;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                i.p(i10, i13, i11, iArr, iArr);
                Object[] objArr2 = this.f15497t;
                i.q(objArr2, objArr2, i10, i13, i11);
            }
            this.f15497t[i12] = null;
        } else {
            h.b(this, i11 > 8 ? i11 + (i11 >> 1) : 8);
            if (i10 > 0) {
                i.p(0, 0, i10, iArr, this.f15496s);
                i.r(objArr, this.f15497t, 0, i10, 6);
            }
            if (i10 < i12) {
                int i14 = i10 + 1;
                i.p(i10, i14, i11, iArr, this.f15496s);
                i.q(objArr, this.f15497t, i10, i14, i11);
            }
        }
        if (i11 != this.f15498u) {
            throw new ConcurrentModificationException();
        }
        this.f15498u = i12;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f15498u != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = this.f15498u;
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(this.f15497t[i11])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f15496s;
        int i10 = this.f15498u;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f15498u <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC = obj == null ? h.c(this, null, 0) : h.c(this, obj, obj.hashCode());
        if (iC < 0) {
            return false;
        }
        e(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        p210v8.i.f(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        p210v8.i.f(collection, "elements");
        boolean z6 = false;
        for (int i10 = this.f15498u - 1; -1 < i10; i10--) {
            if (!k.O(collection, this.f15497t[i10])) {
                e(i10);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f15498u;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return i.s(0, this.f15498u, this.f15497t);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f15498u * 14);
        sb.append('{');
        int i10 = this.f15498u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object obj = this.f15497t[i11];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        p210v8.i.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        p210v8.i.f(objArr, "array");
        int i10 = this.f15498u;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        } else if (objArr.length > i10) {
            objArr[i10] = null;
        }
        i.q(this.f15497t, objArr, 0, 0, this.f15498u);
        return objArr;
    }
}
