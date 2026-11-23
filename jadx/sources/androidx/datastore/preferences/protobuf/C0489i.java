package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0489i extends A3.E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileInputStream f6475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f6476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6481i;
    public int j = Integer.MAX_VALUE;

    public C0489i(FileInputStream fileInputStream) {
        Charset charset = AbstractC0505z.a;
        this.f6475c = fileInputStream;
        this.f6476d = new byte[4096];
        this.f6477e = 0;
        this.f6479g = 0;
        this.f6481i = 0;
    }

    @Override // A3.E
    public final boolean B(int i10) throws InvalidProtocolBufferException {
        int iX;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            int i13 = this.f6477e - this.f6479g;
            byte[] bArr = this.f6476d;
            if (i13 >= 10) {
                while (i12 < 10) {
                    int i14 = this.f6479g;
                    this.f6479g = i14 + 1;
                    if (bArr[i14] < 0) {
                        i12++;
                    }
                }
                throw InvalidProtocolBufferException.c();
            }
            while (i12 < 10) {
                if (this.f6479g == this.f6477e) {
                    L(1);
                }
                int i15 = this.f6479g;
                this.f6479g = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            }
            throw InvalidProtocolBufferException.c();
            return true;
        }
        if (i11 == 1) {
            M(8);
            return true;
        }
        if (i11 == 2) {
            M(H());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            M(4);
            return true;
        }
        do {
            iX = x();
            if (iX == 0) {
                break;
            }
        } while (B(iX));
        d(((i10 >>> 3) << 3) | 4);
        return true;
    }

    public final byte[] C(int i10) throws IOException {
        byte[] bArrD = D(i10);
        if (bArrD != null) {
            return bArrD;
        }
        int i11 = this.f6479g;
        int i12 = this.f6477e;
        int length = i12 - i11;
        this.f6481i += i12;
        this.f6479g = 0;
        this.f6477e = 0;
        ArrayList<byte[]> arrayListE = E(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f6476d, i11, bArr, 0, length);
        for (byte[] bArr2 : arrayListE) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] D(int i10) throws IOException {
        if (i10 == 0) {
            return AbstractC0505z.f6524b;
        }
        if (i10 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i11 = this.f6481i;
        int i12 = this.f6479g;
        int i13 = i11 + i12 + i10;
        if (i13 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.j;
        if (i13 > i14) {
            M((i14 - i11) - i12);
            throw InvalidProtocolBufferException.f();
        }
        int i15 = this.f6477e - i12;
        int i16 = i10 - i15;
        FileInputStream fileInputStream = this.f6475c;
        if (i16 >= 4096 && i16 > fileInputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f6476d, this.f6479g, bArr, 0, i15);
        this.f6481i += this.f6477e;
        this.f6479g = 0;
        this.f6477e = 0;
        while (i15 < i10) {
            int i17 = fileInputStream.read(bArr, i15, i10 - i15);
            if (i17 == -1) {
                throw InvalidProtocolBufferException.f();
            }
            this.f6481i += i17;
            i15 += i17;
        }
        return bArr;
    }

    public final ArrayList E(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f6475c.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw InvalidProtocolBufferException.f();
                }
                this.f6481i += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int F() throws InvalidProtocolBufferException {
        int i10 = this.f6479g;
        if (this.f6477e - i10 < 4) {
            L(4);
            i10 = this.f6479g;
        }
        this.f6479g = i10 + 4;
        byte[] bArr = this.f6476d;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long G() throws InvalidProtocolBufferException {
        int i10 = this.f6479g;
        if (this.f6477e - i10 < 8) {
            L(8);
            i10 = this.f6479g;
        }
        this.f6479g = i10 + 8;
        byte[] bArr = this.f6476d;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public final int H() {
        int i10;
        int i11 = this.f6479g;
        int i12 = this.f6477e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f6476d;
            byte b3 = bArr[i11];
            if (b3 >= 0) {
                this.f6479g = i13;
                return b3;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b3;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b7 = bArr[i18];
                            int i20 = (i19 ^ (b7 << 28)) ^ 266354560;
                            if (b7 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f6479g = i14;
                return i10;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j;
        long j10;
        long j11;
        long j12;
        int i10 = this.f6479g;
        int i11 = this.f6477e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f6476d;
            byte b3 = bArr[i10];
            if (b3 >= 0) {
                this.f6479g = i12;
                return b3;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b3;
                if (i14 < 0) {
                    j = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j12 = (-2080896) ^ i18;
                        } else {
                            long j13 = i18;
                            i13 = i10 + 5;
                            long j14 = j13 ^ (((long) bArr[i17]) << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j15 = j14 ^ (((long) bArr[i13]) << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j14 = j15 ^ (((long) bArr[i17]) << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j15 = j14 ^ (((long) bArr[i13]) << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j16 = (j15 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j = j16;
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                            }
                            j = j11 ^ j14;
                        }
                        i13 = i17;
                        j = j12;
                    }
                }
                this.f6479g = i13;
                return j;
            }
        }
        return J();
    }

    public final long J() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f6479g == this.f6477e) {
                L(1);
            }
            int i11 = this.f6479g;
            this.f6479g = i11 + 1;
            byte b3 = this.f6476d[i11];
            j |= ((long) (b3 & 127)) << i10;
            if ((b3 & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void K() {
        int i10 = this.f6477e + this.f6478f;
        this.f6477e = i10;
        int i11 = this.f6481i + i10;
        int i12 = this.j;
        if (i11 <= i12) {
            this.f6478f = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f6478f = i13;
        this.f6477e = i10 - i13;
    }

    public final void L(int i10) throws InvalidProtocolBufferException {
        if (N(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.f6481i) - this.f6479g) {
            throw InvalidProtocolBufferException.f();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void M(int i10) throws InvalidProtocolBufferException {
        int i11 = this.f6477e;
        int i12 = this.f6479g;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f6479g = i12 + i10;
            return;
        }
        FileInputStream fileInputStream = this.f6475c;
        if (i10 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i14 = this.f6481i;
        int i15 = i14 + i12;
        int i16 = i15 + i10;
        int i17 = this.j;
        if (i16 > i17) {
            M((i17 - i14) - i12);
            throw InvalidProtocolBufferException.f();
        }
        this.f6481i = i15;
        this.f6477e = 0;
        this.f6479g = 0;
        while (i13 < i10) {
            long j = i10 - i13;
            try {
                long jSkip = fileInputStream.skip(j);
                if (jSkip < 0 || jSkip > j) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i13 += (int) jSkip;
                }
            } catch (Throwable th) {
                this.f6481i += i13;
                K();
                throw th;
            }
        }
        this.f6481i += i13;
        K();
        if (i13 >= i10) {
            return;
        }
        int i18 = this.f6477e;
        int i19 = i18 - this.f6479g;
        this.f6479g = i18;
        L(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f6477e;
            if (i20 <= i21) {
                this.f6479g = i20;
                return;
            } else {
                i19 += i21;
                this.f6479g = i21;
                L(1);
            }
        }
    }

    public final boolean N(int i10) throws IOException {
        int i11 = this.f6479g;
        int i12 = i11 + i10;
        int i13 = this.f6477e;
        if (i12 <= i13) {
            throw new IllegalStateException(E0.a.g("refillBuffer() called when ", i10, " bytes were already available in buffer"));
        }
        int i14 = this.f6481i;
        if (i10 <= (Integer.MAX_VALUE - i14) - i11 && i14 + i11 + i10 <= this.j) {
            byte[] bArr = this.f6476d;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f6481i += i11;
                this.f6477e -= i11;
                this.f6479g = 0;
            }
            int i15 = this.f6477e;
            int iMin = Math.min(bArr.length - i15, (Integer.MAX_VALUE - this.f6481i) - i15);
            FileInputStream fileInputStream = this.f6475c;
            int i16 = fileInputStream.read(bArr, i15, iMin);
            if (i16 == 0 || i16 < -1 || i16 > bArr.length) {
                throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
            }
            if (i16 > 0) {
                this.f6477e += i16;
                K();
                if (this.f6477e >= i10) {
                    return true;
                }
                return N(i10);
            }
        }
        return false;
    }

    @Override // A3.E
    public final void d(int i10) throws InvalidProtocolBufferException {
        if (this.f6480h != i10) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // A3.E
    public final int e() {
        return this.f6481i + this.f6479g;
    }

    @Override // A3.E
    public final boolean f() {
        return this.f6479g == this.f6477e && !N(1);
    }

    @Override // A3.E
    public final void g(int i10) {
        this.j = i10;
        K();
    }

    @Override // A3.E
    public final int h(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i11 = this.f6481i + this.f6479g + i10;
        int i12 = this.j;
        if (i11 > i12) {
            throw InvalidProtocolBufferException.f();
        }
        this.j = i11;
        K();
        return i12;
    }

    @Override // A3.E
    public final boolean i() {
        return I() != 0;
    }

    @Override // A3.E
    public final C0488h j() throws IOException {
        int iH = H();
        int i10 = this.f6477e;
        int i11 = this.f6479g;
        int i12 = i10 - i11;
        byte[] bArr = this.f6476d;
        if (iH <= i12 && iH > 0) {
            C0488h c0488hD = C0488h.d(bArr, i11, iH);
            this.f6479g += iH;
            return c0488hD;
        }
        if (iH == 0) {
            return C0488h.f6466u;
        }
        byte[] bArrD = D(iH);
        if (bArrD != null) {
            return C0488h.d(bArrD, 0, bArrD.length);
        }
        int i13 = this.f6479g;
        int i14 = this.f6477e;
        int length = i14 - i13;
        this.f6481i += i14;
        this.f6479g = 0;
        this.f6477e = 0;
        ArrayList<byte[]> arrayListE = E(iH - length);
        byte[] bArr2 = new byte[iH];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        for (byte[] bArr3 : arrayListE) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0488h c0488h = C0488h.f6466u;
        return new C0488h(bArr2);
    }

    @Override // A3.E
    public final double k() {
        return Double.longBitsToDouble(G());
    }

    @Override // A3.E
    public final int l() {
        return H();
    }

    @Override // A3.E
    public final int m() {
        return F();
    }

    @Override // A3.E
    public final long n() {
        return G();
    }

    @Override // A3.E
    public final float o() {
        return Float.intBitsToFloat(F());
    }

    @Override // A3.E
    public final int p() {
        return H();
    }

    @Override // A3.E
    public final long q() {
        return I();
    }

    @Override // A3.E
    public final int r() {
        return F();
    }

    @Override // A3.E
    public final long s() {
        return G();
    }

    @Override // A3.E
    public final int t() {
        int iH = H();
        return (-(iH & 1)) ^ (iH >>> 1);
    }

    @Override // A3.E
    public final long u() {
        long jI = I();
        return (-(jI & 1)) ^ (jI >>> 1);
    }

    @Override // A3.E
    public final String v() throws InvalidProtocolBufferException {
        int iH = H();
        byte[] bArr = this.f6476d;
        if (iH > 0) {
            int i10 = this.f6477e;
            int i11 = this.f6479g;
            if (iH <= i10 - i11) {
                String str = new String(bArr, i11, iH, AbstractC0505z.a);
                this.f6479g += iH;
                return str;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH > this.f6477e) {
            return new String(C(iH), AbstractC0505z.a);
        }
        L(iH);
        String str2 = new String(bArr, this.f6479g, iH, AbstractC0505z.a);
        this.f6479g += iH;
        return str2;
    }

    @Override // A3.E
    public final String w() throws IOException {
        int iH = H();
        int i10 = this.f6479g;
        int i11 = this.f6477e;
        int i12 = i11 - i10;
        byte[] bArrC = this.f6476d;
        if (iH <= i12 && iH > 0) {
            this.f6479g = i10 + iH;
        } else {
            if (iH == 0) {
                return "";
            }
            i10 = 0;
            if (iH <= i11) {
                L(iH);
                this.f6479g = iH;
            } else {
                bArrC = C(iH);
            }
        }
        return w0.a.e(bArrC, i10, iH);
    }

    @Override // A3.E
    public final int x() throws InvalidProtocolBufferException {
        if (f()) {
            this.f6480h = 0;
            return 0;
        }
        int iH = H();
        this.f6480h = iH;
        if ((iH >>> 3) != 0) {
            return iH;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // A3.E
    public final int y() {
        return H();
    }

    @Override // A3.E
    public final long z() {
        return I();
    }
}
