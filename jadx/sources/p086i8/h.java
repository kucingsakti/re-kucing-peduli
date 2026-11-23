package p086i8;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object[] f12322v = new Object[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12323s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object[] f12324t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12325u;

    public h() {
        this.f12324t = f12322v;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int length;
        int i11 = this.f12325u;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("index: ", i10, ", size: ", i11));
        }
        if (i10 == i11) {
            k(obj);
            return;
        }
        if (i10 == 0) {
            g(obj);
            return;
        }
        n(i11 + 1);
        int iU = u(this.f12323s + i10);
        int i12 = this.f12325u;
        if (i10 < ((i12 + 1) >> 1)) {
            if (iU == 0) {
                Object[] objArr = this.f12324t;
                i.f(objArr, "<this>");
                iU = objArr.length;
            }
            int i13 = iU - 1;
            int i14 = this.f12323s;
            if (i14 == 0) {
                Object[] objArr2 = this.f12324t;
                i.f(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i14 - 1;
            }
            int i15 = this.f12323s;
            if (i13 >= i15) {
                Object[] objArr3 = this.f12324t;
                objArr3[length] = objArr3[i15];
                i.q(objArr3, objArr3, i15, i15 + 1, i13 + 1);
            } else {
                Object[] objArr4 = this.f12324t;
                i.q(objArr4, objArr4, i15 - 1, i15, objArr4.length);
                Object[] objArr5 = this.f12324t;
                objArr5[objArr5.length - 1] = objArr5[0];
                i.q(objArr5, objArr5, 0, 1, i13 + 1);
            }
            this.f12324t[i13] = obj;
            this.f12323s = length;
        } else {
            int iU2 = u(i12 + this.f12323s);
            if (iU < iU2) {
                Object[] objArr6 = this.f12324t;
                i.q(objArr6, objArr6, iU + 1, iU, iU2);
            } else {
                Object[] objArr7 = this.f12324t;
                i.q(objArr7, objArr7, 1, 0, iU2);
                Object[] objArr8 = this.f12324t;
                objArr8[0] = objArr8[objArr8.length - 1];
                i.q(objArr8, objArr8, iU + 1, iU, objArr8.length - 1);
            }
            this.f12324t[iU] = obj;
        }
        this.f12325u++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        i.f(collection, "elements");
        int i11 = this.f12325u;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("index: ", i10, ", size: ", i11));
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i12 = this.f12325u;
        if (i10 == i12) {
            return addAll(collection);
        }
        n(collection.size() + i12);
        int iU = u(this.f12325u + this.f12323s);
        int iU2 = u(this.f12323s + i10);
        int size = collection.size();
        if (i10 >= ((this.f12325u + 1) >> 1)) {
            int i13 = iU2 + size;
            if (iU2 < iU) {
                int i14 = size + iU;
                Object[] objArr = this.f12324t;
                if (i14 <= objArr.length) {
                    i.q(objArr, objArr, i13, iU2, iU);
                } else if (i13 >= objArr.length) {
                    i.q(objArr, objArr, i13 - objArr.length, iU2, iU);
                } else {
                    int length = iU - (i14 - objArr.length);
                    i.q(objArr, objArr, 0, length, iU);
                    Object[] objArr2 = this.f12324t;
                    i.q(objArr2, objArr2, i13, iU2, length);
                }
            } else {
                Object[] objArr3 = this.f12324t;
                i.q(objArr3, objArr3, size, 0, iU);
                Object[] objArr4 = this.f12324t;
                if (i13 >= objArr4.length) {
                    i.q(objArr4, objArr4, i13 - objArr4.length, iU2, objArr4.length);
                } else {
                    i.q(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f12324t;
                    i.q(objArr5, objArr5, i13, iU2, objArr5.length - size);
                }
            }
            m(iU2, collection);
            return true;
        }
        int i15 = this.f12323s;
        int length2 = i15 - size;
        if (iU2 < i15) {
            Object[] objArr6 = this.f12324t;
            i.q(objArr6, objArr6, length2, i15, objArr6.length);
            if (size >= iU2) {
                Object[] objArr7 = this.f12324t;
                i.q(objArr7, objArr7, objArr7.length - size, 0, iU2);
            } else {
                Object[] objArr8 = this.f12324t;
                i.q(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f12324t;
                i.q(objArr9, objArr9, 0, size, iU2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f12324t;
            i.q(objArr10, objArr10, length2, i15, iU2);
        } else {
            Object[] objArr11 = this.f12324t;
            length2 += objArr11.length;
            int i16 = iU2 - i15;
            int length3 = objArr11.length - length2;
            if (length3 >= i16) {
                i.q(objArr11, objArr11, length2, i15, iU2);
            } else {
                i.q(objArr11, objArr11, length2, i15, i15 + length3);
                Object[] objArr12 = this.f12324t;
                i.q(objArr12, objArr12, 0, this.f12323s + length3, iU2);
            }
        }
        this.f12323s = length2;
        int length4 = iU2 - size;
        if (length4 < 0) {
            length4 += this.f12324t.length;
        }
        m(length4, collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iU = u(this.f12325u + this.f12323s);
        int i10 = this.f12323s;
        if (i10 < iU) {
            i.t(i10, iU, this.f12324t);
        } else if (!isEmpty()) {
            Object[] objArr = this.f12324t;
            i.t(this.f12323s, objArr.length, objArr);
            i.t(0, iU, this.f12324t);
        }
        this.f12323s = 0;
        this.f12325u = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p086i8.e
    public final int e() {
        return this.f12325u;
    }

    @Override // p086i8.e
    public final Object f(int i10) {
        int i11 = this.f12325u;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("index: ", i10, ", size: ", i11));
        }
        if (i10 == l.B(this)) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            int iU = u(l.B(this) + this.f12323s);
            Object[] objArr = this.f12324t;
            Object obj = objArr[iU];
            objArr[iU] = null;
            this.f12325u--;
            return obj;
        }
        if (i10 == 0) {
            return v();
        }
        int iU2 = u(this.f12323s + i10);
        Object[] objArr2 = this.f12324t;
        Object obj2 = objArr2[iU2];
        if (i10 < (this.f12325u >> 1)) {
            int i12 = this.f12323s;
            if (iU2 >= i12) {
                i.q(objArr2, objArr2, i12 + 1, i12, iU2);
            } else {
                i.q(objArr2, objArr2, 1, 0, iU2);
                Object[] objArr3 = this.f12324t;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i13 = this.f12323s;
                i.q(objArr3, objArr3, i13 + 1, i13, objArr3.length - 1);
            }
            Object[] objArr4 = this.f12324t;
            int i14 = this.f12323s;
            objArr4[i14] = null;
            this.f12323s = q(i14);
        } else {
            int iU3 = u(l.B(this) + this.f12323s);
            if (iU2 <= iU3) {
                Object[] objArr5 = this.f12324t;
                i.q(objArr5, objArr5, iU2, iU2 + 1, iU3 + 1);
            } else {
                Object[] objArr6 = this.f12324t;
                i.q(objArr6, objArr6, iU2, iU2 + 1, objArr6.length);
                Object[] objArr7 = this.f12324t;
                objArr7[objArr7.length - 1] = objArr7[0];
                i.q(objArr7, objArr7, 0, 1, iU3 + 1);
            }
            this.f12324t[iU3] = null;
        }
        this.f12325u--;
        return obj2;
    }

    public final void g(Object obj) {
        n(this.f12325u + 1);
        int length = this.f12323s;
        if (length == 0) {
            Object[] objArr = this.f12324t;
            i.f(objArr, "<this>");
            length = objArr.length;
        }
        int i10 = length - 1;
        this.f12323s = i10;
        this.f12324t[i10] = obj;
        this.f12325u++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int iE = e();
        if (i10 < 0 || i10 >= iE) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("index: ", i10, ", size: ", iE));
        }
        return this.f12324t[u(this.f12323s + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int iU = u(e() + this.f12323s);
        int length = this.f12323s;
        if (length < iU) {
            while (length < iU) {
                if (i.a(obj, this.f12324t[length])) {
                    i10 = this.f12323s;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iU) {
            return -1;
        }
        int length2 = this.f12324t.length;
        while (length < length2) {
            if (i.a(obj, this.f12324t[length])) {
                i10 = this.f12323s;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iU; i11++) {
            if (i.a(obj, this.f12324t[i11])) {
                length = i11 + this.f12324t.length;
                i10 = this.f12323s;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return e() == 0;
    }

    public final void k(Object obj) {
        n(e() + 1);
        this.f12324t[u(e() + this.f12323s)] = obj;
        this.f12325u = e() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int iU = u(this.f12325u + this.f12323s);
        int i11 = this.f12323s;
        if (i11 < iU) {
            length = iU - 1;
            if (i11 <= length) {
                while (!i.a(obj, this.f12324t[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f12323s;
                return length - i10;
            }
            return -1;
        }
        if (i11 > iU) {
            for (int i12 = iU - 1; -1 < i12; i12--) {
                if (i.a(obj, this.f12324t[i12])) {
                    length = i12 + this.f12324t.length;
                    i10 = this.f12323s;
                    return length - i10;
                }
            }
            Object[] objArr = this.f12324t;
            i.f(objArr, "<this>");
            length = objArr.length - 1;
            int i13 = this.f12323s;
            if (i13 <= length) {
                while (!i.a(obj, this.f12324t[length])) {
                    if (length != i13) {
                        length--;
                    }
                }
                i10 = this.f12323s;
                return length - i10;
            }
        }
        return -1;
    }

    public final void m(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f12324t.length;
        while (i10 < length && it.hasNext()) {
            this.f12324t[i10] = it.next();
            i10++;
        }
        int i11 = this.f12323s;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f12324t[i12] = it.next();
        }
        this.f12325u = collection.size() + this.f12325u;
    }

    public final void n(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f12324t;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f12322v) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f12324t = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        i.q(objArr, objArr2, 0, this.f12323s, objArr.length);
        Object[] objArr3 = this.f12324t;
        int length2 = objArr3.length;
        int i12 = this.f12323s;
        i.q(objArr3, objArr2, length2 - i12, 0, i12);
        this.f12323s = 0;
        this.f12324t = objArr2;
    }

    public final Object o() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f12324t[this.f12323s];
    }

    public final int q(int i10) {
        Object[] objArr = this.f12324t;
        i.f(objArr, "<this>");
        if (i10 == objArr.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final Object r() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f12324t[u(l.B(this) + this.f12323s)];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        f(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iU;
        i.f(collection, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f12324t.length != 0) {
            int iU2 = u(this.f12325u + this.f12323s);
            int i10 = this.f12323s;
            if (i10 < iU2) {
                iU = i10;
                while (i10 < iU2) {
                    Object obj = this.f12324t[i10];
                    if (collection.contains(obj)) {
                        z6 = true;
                    } else {
                        this.f12324t[iU] = obj;
                        iU++;
                    }
                    i10++;
                }
                i.t(iU, iU2, this.f12324t);
            } else {
                int length = this.f12324t.length;
                boolean z10 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f12324t;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (collection.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.f12324t[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iU = u(i11);
                for (int i12 = 0; i12 < iU2; i12++) {
                    Object[] objArr2 = this.f12324t;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (collection.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.f12324t[iU] = obj3;
                        iU = q(iU);
                    }
                }
                z6 = z10;
            }
            if (z6) {
                int length2 = iU - this.f12323s;
                if (length2 < 0) {
                    length2 += this.f12324t.length;
                }
                this.f12325u = length2;
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iU;
        i.f(collection, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f12324t.length != 0) {
            int iU2 = u(this.f12325u + this.f12323s);
            int i10 = this.f12323s;
            if (i10 < iU2) {
                iU = i10;
                while (i10 < iU2) {
                    Object obj = this.f12324t[i10];
                    if (collection.contains(obj)) {
                        this.f12324t[iU] = obj;
                        iU++;
                    } else {
                        z6 = true;
                    }
                    i10++;
                }
                i.t(iU, iU2, this.f12324t);
            } else {
                int length = this.f12324t.length;
                boolean z10 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f12324t;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (collection.contains(obj2)) {
                        this.f12324t[i11] = obj2;
                        i11++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                iU = u(i11);
                for (int i12 = 0; i12 < iU2; i12++) {
                    Object[] objArr2 = this.f12324t;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (collection.contains(obj3)) {
                        this.f12324t[iU] = obj3;
                        iU = q(iU);
                    } else {
                        z10 = true;
                    }
                }
                z6 = z10;
            }
            if (z6) {
                int length2 = iU - this.f12323s;
                if (length2 < 0) {
                    length2 += this.f12324t.length;
                }
                this.f12325u = length2;
            }
        }
        return z6;
    }

    public final Object s() {
        if (isEmpty()) {
            return null;
        }
        return this.f12324t[u(l.B(this) + this.f12323s)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iE = e();
        if (i10 < 0 || i10 >= iE) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("index: ", i10, ", size: ", iE));
        }
        int iU = u(this.f12323s + i10);
        Object[] objArr = this.f12324t;
        Object obj2 = objArr[iU];
        objArr[iU] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[e()]);
    }

    public final int u(int i10) {
        Object[] objArr = this.f12324t;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final Object v() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f12324t;
        int i10 = this.f12323s;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f12323s = q(i10);
        this.f12325u = e() - 1;
        return obj;
    }

    public h(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f12322v;
        } else if (i10 > 0) {
            objArr = new Object[i10];
        } else {
            throw new IllegalArgumentException(AbstractC0487g.g(i10, "Illegal Capacity: "));
        }
        this.f12324t = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        i.f(objArr, "array");
        int length = objArr.length;
        int i10 = this.f12325u;
        if (length < i10) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i10);
            i.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iU = u(this.f12325u + this.f12323s);
        int i11 = this.f12323s;
        if (i11 < iU) {
            i.r(this.f12324t, objArr, i11, iU, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f12324t;
            i.q(objArr2, objArr, 0, this.f12323s, objArr2.length);
            Object[] objArr3 = this.f12324t;
            i.q(objArr3, objArr, objArr3.length - this.f12323s, 0, iU);
        }
        int i12 = this.f12325u;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        k(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        n(collection.size() + e());
        m(u(e() + this.f12323s), collection);
        return true;
    }
}
