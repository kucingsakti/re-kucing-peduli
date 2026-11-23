package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0594s0 extends W implements zzjq, z0, RandomAccess {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0594s0 f8413v = new C0594s0(new long[0], 0, false);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long[] f8414t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8415u;

    public C0594s0(long[] jArr, int i10, boolean z6) {
        super(z6);
        this.f8414t = jArr;
        this.f8415u = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzjq
    public final long G(int i10) {
        e(i10);
        return this.f8414t[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f8415u)) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("Index:", i10, ", Size:", this.f8415u));
        }
        long[] jArr = this.f8414t;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f8414t, i10, jArr2, i10 + 1, this.f8415u - i10);
            this.f8414t = jArr2;
        }
        this.f8414t[i10] = jLongValue;
        this.f8415u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.W, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzjm.a;
        collection.getClass();
        if (!(collection instanceof C0594s0)) {
            return super.addAll(collection);
        }
        C0594s0 c0594s0 = (C0594s0) collection;
        int i10 = c0594s0.f8415u;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8415u;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f8414t;
        if (i12 > jArr.length) {
            this.f8414t = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c0594s0.f8414t, 0, this.f8414t, this.f8415u, c0594s0.f8415u);
        this.f8415u = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j) {
        b();
        int i10 = this.f8415u;
        long[] jArr = this.f8414t;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f8414t = jArr2;
        }
        long[] jArr3 = this.f8414t;
        int i11 = this.f8415u;
        this.f8415u = i11 + 1;
        jArr3[i11] = j;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 >= this.f8415u) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("Index:", i10, ", Size:", this.f8415u));
        }
    }

    @Override // com.google.android.gms.internal.measurement.W, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0594s0)) {
            return super.equals(obj);
        }
        C0594s0 c0594s0 = (C0594s0) obj;
        if (this.f8415u != c0594s0.f8415u) {
            return false;
        }
        long[] jArr = c0594s0.f8414t;
        for (int i10 = 0; i10 < this.f8415u; i10++) {
            if (this.f8414t[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Long.valueOf(G(i10));
    }

    @Override // com.google.android.gms.internal.measurement.W, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i10 = 0; i10 < this.f8415u; i10++) {
            iA = (iA * 31) + zzjm.a(this.f8414t[i10]);
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f8415u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8414t[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final C0594s0 h(int i10) {
        if (i10 >= this.f8415u) {
            return new C0594s0(Arrays.copyOf(this.f8414t, i10), this.f8415u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.W, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        b();
        e(i10);
        long[] jArr = this.f8414t;
        long j = jArr[i10];
        int i11 = this.f8415u;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f8415u--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f8414t;
        System.arraycopy(jArr, i11, jArr, i10, this.f8415u - i11);
        this.f8415u -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        e(i10);
        long[] jArr = this.f8414t;
        long j = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8415u;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
