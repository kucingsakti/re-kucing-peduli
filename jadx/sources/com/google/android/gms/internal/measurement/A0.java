package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends W implements RandomAccess {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final A0 f8327v = new A0(new Object[0], 0, false);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object[] f8328t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8329u;

    public A0(Object[] objArr, int i10, boolean z6) {
        super(z6);
        this.f8328t = objArr;
        this.f8329u = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f8329u)) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("Index:", i10, ", Size:", this.f8329u));
        }
        Object[] objArr = this.f8328t;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f8328t, i10, objArr2, i10 + 1, this.f8329u - i10);
            this.f8328t = objArr2;
        }
        this.f8328t[i10] = obj;
        this.f8329u++;
        ((AbstractList) this).modCount++;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f8329u) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("Index:", i10, ", Size:", this.f8329u));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        d(i10);
        return this.f8328t[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    public final /* synthetic */ zzjt h(int i10) {
        if (i10 >= this.f8329u) {
            return new A0(Arrays.copyOf(this.f8328t, i10), this.f8329u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.W, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        d(i10);
        Object[] objArr = this.f8328t;
        Object obj = objArr[i10];
        int i11 = this.f8329u;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f8329u--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        d(i10);
        Object[] objArr = this.f8328t;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8329u;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f8329u;
        Object[] objArr = this.f8328t;
        if (i10 == objArr.length) {
            this.f8328t = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f8328t;
        int i11 = this.f8329u;
        this.f8329u = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
