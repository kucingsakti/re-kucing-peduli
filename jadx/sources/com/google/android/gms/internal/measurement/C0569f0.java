package com.google.android.gms.internal.measurement;

import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0569f0 extends zzit {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f8385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8387f;

    public C0569f0(int i10, byte[] bArr) {
        super(0);
        if (((bArr.length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
        }
        this.f8385d = bArr;
        this.f8387f = 0;
        this.f8386e = i10;
    }

    public final int i() {
        return this.f8386e - this.f8387f;
    }

    public final void j(byte b3) {
        try {
            byte[] bArr = this.f8385d;
            int i10 = this.f8387f;
            this.f8387f = i10 + 1;
            bArr[i10] = b3;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzit.zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8387f), Integer.valueOf(this.f8386e), 1), e10);
        }
    }

    public final void k(int i10) {
        try {
            byte[] bArr = this.f8385d;
            int i11 = this.f8387f;
            int i12 = i11 + 1;
            this.f8387f = i12;
            bArr[i11] = (byte) i10;
            int i13 = i11 + 2;
            this.f8387f = i13;
            bArr[i12] = (byte) (i10 >> 8);
            int i14 = i11 + 3;
            this.f8387f = i14;
            bArr[i13] = (byte) (i10 >> 16);
            this.f8387f = i11 + 4;
            bArr[i14] = (byte) (i10 >>> 24);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzit.zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8387f), Integer.valueOf(this.f8386e), 1), e10);
        }
    }

    public final void l(int i10, int i11) {
        x(i10, 5);
        k(i11);
    }

    public final void m(int i10, long j) {
        x(i10, 1);
        q(j);
    }

    public final void n(int i10, zzia zziaVar) {
        x(i10, 2);
        w(zziaVar.n());
        zziaVar.k(this);
    }

    public final void o(int i10, String str) throws zzit.zzb {
        x(i10, 2);
        int i11 = this.f8387f;
        try {
            int iG = zzit.g(str.length() * 3);
            int iG2 = zzit.g(str.length());
            byte[] bArr = this.f8385d;
            if (iG2 != iG) {
                w(L0.a(str));
                this.f8387f = L0.b(str, bArr, this.f8387f, i());
                return;
            }
            int i12 = i11 + iG2;
            this.f8387f = i12;
            int iB = L0.b(str, bArr, i12, i());
            this.f8387f = i11;
            w((iB - i11) - iG2);
            this.f8387f = iB;
        } catch (M0 e10) {
            this.f8387f = i11;
            zzit.f8671b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(zzjm.a);
            try {
                w(bytes.length);
                r(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzit.zzb(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new zzit.zzb(e12);
        }
    }

    public final void p(int i10, boolean z6) {
        x(i10, 0);
        j(z6 ? (byte) 1 : (byte) 0);
    }

    public final void q(long j) {
        try {
            byte[] bArr = this.f8385d;
            int i10 = this.f8387f;
            int i11 = i10 + 1;
            this.f8387f = i11;
            bArr[i10] = (byte) j;
            int i12 = i10 + 2;
            this.f8387f = i12;
            bArr[i11] = (byte) (j >> 8);
            int i13 = i10 + 3;
            this.f8387f = i13;
            bArr[i12] = (byte) (j >> 16);
            int i14 = i10 + 4;
            this.f8387f = i14;
            bArr[i13] = (byte) (j >> 24);
            int i15 = i10 + 5;
            this.f8387f = i15;
            bArr[i14] = (byte) (j >> 32);
            int i16 = i10 + 6;
            this.f8387f = i16;
            bArr[i15] = (byte) (j >> 40);
            int i17 = i10 + 7;
            this.f8387f = i17;
            bArr[i16] = (byte) (j >> 48);
            this.f8387f = i10 + 8;
            bArr[i17] = (byte) (j >> 56);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzit.zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8387f), Integer.valueOf(this.f8386e), 1), e10);
        }
    }

    public final void r(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, i10, this.f8385d, this.f8387f, i11);
            this.f8387f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzit.zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8387f), Integer.valueOf(this.f8386e), Integer.valueOf(i11)), e10);
        }
    }

    public final void s(int i10) {
        if (i10 >= 0) {
            w(i10);
        } else {
            v(i10);
        }
    }

    public final void t(int i10, int i11) {
        x(i10, 0);
        s(i11);
    }

    public final void u(int i10, long j) {
        x(i10, 0);
        v(j);
    }

    public final void v(long j) {
        boolean z6 = zzit.f8672c;
        byte[] bArr = this.f8385d;
        if (!z6 || i() < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i10 = this.f8387f;
                    this.f8387f = i10 + 1;
                    bArr[i10] = (byte) (((int) j) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzit.zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8387f), Integer.valueOf(this.f8386e), 1), e10);
                }
            }
            int i11 = this.f8387f;
            this.f8387f = i11 + 1;
            bArr[i11] = (byte) j;
            return;
        }
        while ((j & (-128)) != 0) {
            int i12 = this.f8387f;
            this.f8387f = i12 + 1;
            J0.f8349c.b(bArr, J0.f8352f + ((long) i12), (byte) (((int) j) | 128));
            j >>>= 7;
        }
        int i13 = this.f8387f;
        this.f8387f = 1 + i13;
        J0.f8349c.b(bArr, J0.f8352f + ((long) i13), (byte) j);
    }

    public final void w(int i10) {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f8385d;
            if (i11 == 0) {
                int i12 = this.f8387f;
                this.f8387f = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f8387f;
                    this.f8387f = i13 + 1;
                    bArr[i13] = (byte) (i10 | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzit.zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8387f), Integer.valueOf(this.f8386e), 1), e10);
                }
            }
            throw new zzit.zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8387f), Integer.valueOf(this.f8386e), 1), e10);
        }
    }

    public final void x(int i10, int i11) {
        w((i10 << 3) | i11);
    }

    public final void y(int i10, int i11) {
        x(i10, 0);
        w(i11);
    }
}
