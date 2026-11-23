package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC0480b implements RandomAccess {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Y f6441v;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object[] f6442t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6443u;

    static {
        Y y6 = new Y(0, new Object[0]);
        f6441v = y6;
        y6.f6447s = false;
    }

    public Y(int i10, Object[] objArr) {
        this.f6442t = objArr;
        this.f6443u = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0480b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        int i10 = this.f6443u;
        Object[] objArr = this.f6442t;
        if (i10 == objArr.length) {
            this.f6442t = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f6442t;
        int i11 = this.f6443u;
        this.f6443u = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 >= this.f6443u) {
            StringBuilder sbL = AbstractC0487g.l("Index:", i10, ", Size:");
            sbL.append(this.f6443u);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        e(i10);
        return this.f6442t[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        e(i10);
        Object[] objArr = this.f6442t;
        Object obj = objArr[i10];
        int i11 = this.f6443u;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f6443u--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        d();
        e(i10);
        Object[] objArr = this.f6442t;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6443u;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0504y
    public final InterfaceC0504y t(int i10) {
        if (i10 < this.f6443u) {
            throw new IllegalArgumentException();
        }
        return new Y(this.f6443u, Arrays.copyOf(this.f6442t, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f6443u)) {
            Object[] objArr = this.f6442t;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f6442t, i10, objArr2, i10 + 1, this.f6443u - i10);
                this.f6442t = objArr2;
            }
            this.f6442t[i10] = obj;
            this.f6443u++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbL = AbstractC0487g.l("Index:", i10, ", Size:");
        sbL.append(this.f6443u);
        throw new IndexOutOfBoundsException(sbL.toString());
    }
}
