package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0563c0 extends C0565d0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f8376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f8377x;

    public C0563c0(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzia.e(i10, i10 + i11, bArr.length);
        this.f8376w = i10;
        this.f8377x = i11;
    }

    @Override // com.google.android.gms.internal.measurement.C0565d0, com.google.android.gms.internal.measurement.zzia
    public final byte d(int i10) {
        int i11 = this.f8377x;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f8381v[this.f8376w + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0487g.g(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0487g.h("Index > length: ", i10, ", ", i11));
    }

    @Override // com.google.android.gms.internal.measurement.C0565d0, com.google.android.gms.internal.measurement.zzia
    public final byte m(int i10) {
        return this.f8381v[this.f8376w + i10];
    }

    @Override // com.google.android.gms.internal.measurement.C0565d0, com.google.android.gms.internal.measurement.zzia
    public final int n() {
        return this.f8377x;
    }

    @Override // com.google.android.gms.internal.measurement.C0565d0
    public final int q() {
        return this.f8376w;
    }
}
