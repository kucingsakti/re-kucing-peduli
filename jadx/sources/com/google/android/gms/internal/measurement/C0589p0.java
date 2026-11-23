package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0589p0 extends W implements zzjr, z0, RandomAccess {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0589p0 f8399v = new C0589p0(new int[0], 0, false);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f8400t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8401u;

    public C0589p0(int[] iArr, int i10, boolean z6) {
        super(z6);
        this.f8400t = iArr;
        this.f8401u = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f8401u)) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("Index:", i10, ", Size:", this.f8401u));
        }
        int[] iArr = this.f8400t;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f8400t, i10, iArr2, i10 + 1, this.f8401u - i10);
            this.f8400t = iArr2;
        }
        this.f8400t[i10] = iIntValue;
        this.f8401u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.W, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzjm.a;
        collection.getClass();
        if (!(collection instanceof C0589p0)) {
            return super.addAll(collection);
        }
        C0589p0 c0589p0 = (C0589p0) collection;
        int i10 = c0589p0.f8401u;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8401u;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f8400t;
        if (i12 > iArr.length) {
            this.f8400t = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c0589p0.f8400t, 0, this.f8400t, this.f8401u, c0589p0.f8401u);
        this.f8401u = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i10) {
        f(i10);
        return this.f8400t[i10];
    }

    public final void e(int i10) {
        b();
        int i11 = this.f8401u;
        int[] iArr = this.f8400t;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f8400t = iArr2;
        }
        int[] iArr3 = this.f8400t;
        int i12 = this.f8401u;
        this.f8401u = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.android.gms.internal.measurement.W, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0589p0)) {
            return super.equals(obj);
        }
        C0589p0 c0589p0 = (C0589p0) obj;
        if (this.f8401u != c0589p0.f8401u) {
            return false;
        }
        int[] iArr = c0589p0.f8400t;
        for (int i10 = 0; i10 < this.f8401u; i10++) {
            if (this.f8400t[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10) {
        if (i10 < 0 || i10 >= this.f8401u) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("Index:", i10, ", Size:", this.f8401u));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Integer.valueOf(d(i10));
    }

    @Override // com.google.android.gms.internal.measurement.W, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8401u; i11++) {
            i10 = (i10 * 31) + this.f8400t[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f8401u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8400t[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final C0589p0 h(int i10) {
        if (i10 >= this.f8401u) {
            return new C0589p0(Arrays.copyOf(this.f8400t, i10), this.f8401u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.W, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        b();
        f(i10);
        int[] iArr = this.f8400t;
        int i11 = iArr[i10];
        int i12 = this.f8401u;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f8401u--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f8400t;
        System.arraycopy(iArr, i11, iArr, i10, this.f8401u - i11);
        this.f8401u -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        f(i10);
        int[] iArr = this.f8400t;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8401u;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
