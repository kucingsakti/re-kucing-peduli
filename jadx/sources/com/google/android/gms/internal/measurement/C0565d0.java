package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0565d0 extends zzia {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f8381v;

    public C0565d0(byte[] bArr) {
        bArr.getClass();
        this.f8381v = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public byte d(int i10) {
        return this.f8381v[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzia) || n() != ((zzia) obj).n()) {
            return false;
        }
        if (n() == 0) {
            return true;
        }
        if (!(obj instanceof C0565d0)) {
            return obj.equals(this);
        }
        C0565d0 c0565d0 = (C0565d0) obj;
        int i10 = this.f8670s;
        int i11 = c0565d0.f8670s;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int iN = n();
        if (iN > c0565d0.n()) {
            throw new IllegalArgumentException("Length too large: " + iN + n());
        }
        if (iN > c0565d0.n()) {
            throw new IllegalArgumentException(AbstractC0487g.h("Ran off end of other: 0, ", iN, ", ", c0565d0.n()));
        }
        int iQ = q() + iN;
        int iQ2 = q();
        int iQ3 = c0565d0.q();
        while (iQ2 < iQ) {
            if (this.f8381v[iQ2] != c0565d0.f8381v[iQ3]) {
                return false;
            }
            iQ2++;
            iQ3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final C0565d0 f() {
        int iE = zzia.e(0, 47, n());
        return iE == 0 ? zzia.f8668t : new C0563c0(this.f8381v, q(), iE);
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final void k(C0569f0 c0569f0) {
        c0569f0.r(this.f8381v, q(), n());
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public byte m(int i10) {
        return this.f8381v[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public int n() {
        return this.f8381v.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final int o(int i10, int i11) {
        int iQ = q();
        Charset charset = zzjm.a;
        for (int i12 = iQ; i12 < iQ + i11; i12++) {
            i10 = (i10 * 31) + this.f8381v[i12];
        }
        return i10;
    }

    public int q() {
        return 0;
    }
}
