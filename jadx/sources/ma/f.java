package ma;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s f13189s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f13190t;

    public final byte[] A(long j) throws EOFException {
        int i10 = 0;
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(p210v8.i.k(Long.valueOf(j), "byteCount: ").toString());
        }
        if (this.f13190t < j) {
            throw new EOFException();
        }
        int i11 = (int) j;
        byte[] bArr = new byte[i11];
        while (i10 < i11) {
            int iP = p(bArr, i10, i11 - i10);
            if (iP == -1) {
                throw new EOFException();
            }
            i10 += iP;
        }
        return bArr;
    }

    public final i B(long j) throws EOFException {
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(p210v8.i.k(Long.valueOf(j), "byteCount: ").toString());
        }
        if (this.f13190t < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new i(A(j));
        }
        i iVarY = Y((int) j);
        X(j);
        return iVarY;
    }

    @Override // ma.v
    public final void C(f fVar, long j) {
        s sVarB;
        p210v8.i.f(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        o1.f.c(fVar.f13190t, 0L, j);
        while (j > 0) {
            s sVar = fVar.f13189s;
            p210v8.i.c(sVar);
            int i10 = sVar.f13216c;
            s sVar2 = fVar.f13189s;
            p210v8.i.c(sVar2);
            long j10 = i10 - sVar2.f13215b;
            int i11 = 0;
            if (j < j10) {
                s sVar3 = this.f13189s;
                s sVar4 = sVar3 != null ? sVar3.f13220g : null;
                if (sVar4 != null && sVar4.f13218e) {
                    if ((((long) sVar4.f13216c) + j) - ((long) (sVar4.f13217d ? 0 : sVar4.f13215b)) <= 8192) {
                        s sVar5 = fVar.f13189s;
                        p210v8.i.c(sVar5);
                        sVar5.d(sVar4, (int) j);
                        fVar.f13190t -= j;
                        this.f13190t += j;
                        return;
                    }
                }
                s sVar6 = fVar.f13189s;
                p210v8.i.c(sVar6);
                int i12 = (int) j;
                if (i12 <= 0 || i12 > sVar6.f13216c - sVar6.f13215b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i12 >= 1024) {
                    sVarB = sVar6.c();
                } else {
                    sVarB = t.b();
                    int i13 = sVar6.f13215b;
                    p086i8.i.o(0, i13, i13 + i12, sVar6.a, sVarB.a);
                }
                sVarB.f13216c = sVarB.f13215b + i12;
                sVar6.f13215b += i12;
                s sVar7 = sVar6.f13220g;
                p210v8.i.c(sVar7);
                sVar7.b(sVarB);
                fVar.f13189s = sVarB;
            }
            s sVar8 = fVar.f13189s;
            p210v8.i.c(sVar8);
            long j11 = sVar8.f13216c - sVar8.f13215b;
            fVar.f13189s = sVar8.a();
            s sVar9 = this.f13189s;
            if (sVar9 == null) {
                this.f13189s = sVar8;
                sVar8.f13220g = sVar8;
                sVar8.f13219f = sVar8;
            } else {
                s sVar10 = sVar9.f13220g;
                p210v8.i.c(sVar10);
                sVar10.b(sVar8);
                s sVar11 = sVar8.f13220g;
                if (sVar11 == sVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                p210v8.i.c(sVar11);
                if (sVar11.f13218e) {
                    int i14 = sVar8.f13216c - sVar8.f13215b;
                    s sVar12 = sVar8.f13220g;
                    p210v8.i.c(sVar12);
                    int i15 = 8192 - sVar12.f13216c;
                    s sVar13 = sVar8.f13220g;
                    p210v8.i.c(sVar13);
                    if (!sVar13.f13217d) {
                        s sVar14 = sVar8.f13220g;
                        p210v8.i.c(sVar14);
                        i11 = sVar14.f13215b;
                    }
                    if (i14 <= i15 + i11) {
                        s sVar15 = sVar8.f13220g;
                        p210v8.i.c(sVar15);
                        sVar8.d(sVar15, i14);
                        sVar8.a();
                        t.a(sVar8);
                    }
                }
            }
            fVar.f13190t -= j11;
            this.f13190t += j11;
            j -= j11;
        }
    }

    @Override // ma.h
    public final long D(f fVar) {
        long j = this.f13190t;
        if (j > 0) {
            fVar.C(this, j);
        }
        return j;
    }

    public final int E() throws EOFException {
        if (this.f13190t < 4) {
            throw new EOFException();
        }
        s sVar = this.f13189s;
        p210v8.i.c(sVar);
        int i10 = sVar.f13215b;
        int i11 = sVar.f13216c;
        if (i11 - i10 < 4) {
            return ((t() & 255) << 24) | ((t() & 255) << 16) | ((t() & 255) << 8) | (t() & 255);
        }
        byte[] bArr = sVar.a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = i13 | (bArr[i12] & 255);
        this.f13190t -= 4;
        if (i14 != i11) {
            sVar.f13215b = i14;
            return i15;
        }
        this.f13189s = sVar.a();
        t.a(sVar);
        return i15;
    }

    @Override // ma.g
    public final g F(byte[] bArr) {
        p210v8.i.f(bArr, "source");
        b0(bArr, 0, bArr.length);
        return this;
    }

    public final short G() throws EOFException {
        if (this.f13190t < 2) {
            throw new EOFException();
        }
        s sVar = this.f13189s;
        p210v8.i.c(sVar);
        int i10 = sVar.f13215b;
        int i11 = sVar.f13216c;
        if (i11 - i10 < 2) {
            return (short) (((t() & 255) << 8) | (t() & 255));
        }
        int i12 = i10 + 1;
        byte[] bArr = sVar.a;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f13190t -= 2;
        if (i14 == i11) {
            this.f13189s = sVar.a();
            t.a(sVar);
        } else {
            sVar.f13215b = i14;
        }
        return (short) i15;
    }

    public final String H(long j, Charset charset) throws EOFException {
        p210v8.i.f(charset, "charset");
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(p210v8.i.k(Long.valueOf(j), "byteCount: ").toString());
        }
        if (this.f13190t < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        s sVar = this.f13189s;
        p210v8.i.c(sVar);
        int i10 = sVar.f13215b;
        if (((long) i10) + j > sVar.f13216c) {
            return new String(A(j), charset);
        }
        int i11 = (int) j;
        String str = new String(sVar.a, i10, i11, charset);
        int i12 = sVar.f13215b + i11;
        sVar.f13215b = i12;
        this.f13190t -= j;
        if (i12 == sVar.f13216c) {
            this.f13189s = sVar.a();
            t.a(sVar);
        }
        return str;
    }

    public final String J() {
        return H(this.f13190t, L9.a.a);
    }

    @Override // ma.g
    public final /* bridge */ /* synthetic */ g N(int i10, byte[] bArr) {
        b0(bArr, 0, i10);
        return this;
    }

    @Override // ma.g
    public final /* bridge */ /* synthetic */ g O(i iVar) {
        a0(iVar);
        return this;
    }

    @Override // ma.g
    public final /* bridge */ /* synthetic */ g Q(String str) {
        i0(str);
        return this;
    }

    @Override // ma.g
    public final /* bridge */ /* synthetic */ g R(long j) {
        e0(j);
        return this;
    }

    @Override // ma.h
    public final String U(Charset charset) {
        return H(this.f13190t, charset);
    }

    @Override // ma.h
    public final InputStream V() {
        return new e(this, 0);
    }

    public final int W() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (this.f13190t == 0) {
            throw new EOFException();
        }
        byte bL = l(0L);
        int i13 = 1;
        if ((bL & 128) == 0) {
            i10 = bL & 127;
            i12 = 0;
            i11 = 1;
        } else if ((bL & 224) == 192) {
            i10 = bL & 31;
            i11 = 2;
            i12 = 128;
        } else if ((bL & 240) == 224) {
            i10 = bL & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((bL & 248) != 240) {
                X(1L);
                return 65533;
            }
            i10 = bL & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j = i11;
        if (this.f13190t < j) {
            StringBuilder sbL = AbstractC0487g.l("size < ", i11, ": ");
            sbL.append(this.f13190t);
            sbL.append(" (to read code point prefixed 0x");
            sbL.append(o1.f.o(bL));
            sbL.append(')');
            throw new EOFException(sbL.toString());
        }
        if (1 < i11) {
            while (true) {
                int i14 = i13 + 1;
                long j10 = i13;
                byte bL2 = l(j10);
                if ((bL2 & 192) != 128) {
                    X(j10);
                    return 65533;
                }
                i10 = (i10 << 6) | (bL2 & 63);
                if (i14 >= i11) {
                    break;
                }
                i13 = i14;
            }
        }
        X(j);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 > 57343) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    public final void X(long j) throws EOFException {
        while (j > 0) {
            s sVar = this.f13189s;
            if (sVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, sVar.f13216c - sVar.f13215b);
            long j10 = iMin;
            this.f13190t -= j10;
            j -= j10;
            int i10 = sVar.f13215b + iMin;
            sVar.f13215b = i10;
            if (i10 == sVar.f13216c) {
                this.f13189s = sVar.a();
                t.a(sVar);
            }
        }
    }

    public final i Y(int i10) {
        if (i10 == 0) {
            return i.f13191v;
        }
        o1.f.c(this.f13190t, 0L, i10);
        s sVar = this.f13189s;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            p210v8.i.c(sVar);
            int i14 = sVar.f13216c;
            int i15 = sVar.f13215b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            sVar = sVar.f13219f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        s sVar2 = this.f13189s;
        int i16 = 0;
        while (i11 < i10) {
            p210v8.i.c(sVar2);
            bArr[i16] = sVar2.a;
            i11 += sVar2.f13216c - sVar2.f13215b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = sVar2.f13215b;
            sVar2.f13217d = true;
            i16++;
            sVar2 = sVar2.f13219f;
        }
        return new u(bArr, iArr);
    }

    public final s Z(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        s sVar = this.f13189s;
        if (sVar == null) {
            s sVarB = t.b();
            this.f13189s = sVarB;
            sVarB.f13220g = sVarB;
            sVarB.f13219f = sVarB;
            return sVarB;
        }
        s sVar2 = sVar.f13220g;
        p210v8.i.c(sVar2);
        if (sVar2.f13216c + i10 <= 8192 && sVar2.f13218e) {
            return sVar2;
        }
        s sVarB2 = t.b();
        sVar2.b(sVarB2);
        return sVarB2;
    }

    public final void a() throws EOFException {
        X(this.f13190t);
    }

    public final void a0(i iVar) {
        p210v8.i.f(iVar, "byteString");
        iVar.p(this, iVar.h());
    }

    public final void b0(byte[] bArr, int i10, int i11) {
        p210v8.i.f(bArr, "source");
        long j = i11;
        o1.f.c(bArr.length, i10, j);
        int i12 = i11 + i10;
        while (i10 < i12) {
            s sVarZ = Z(1);
            int iMin = Math.min(i12 - i10, 8192 - sVarZ.f13216c);
            int i13 = i10 + iMin;
            p086i8.i.o(sVarZ.f13216c, i10, i13, bArr, sVarZ.a);
            sVarZ.f13216c += iMin;
            i10 = i13;
        }
        this.f13190t += j;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        f fVar = new f();
        if (this.f13190t == 0) {
            return fVar;
        }
        s sVar = this.f13189s;
        p210v8.i.c(sVar);
        s sVarC = sVar.c();
        fVar.f13189s = sVarC;
        sVarC.f13220g = sVarC;
        sVarC.f13219f = sVarC;
        for (s sVar2 = sVar.f13219f; sVar2 != sVar; sVar2 = sVar2.f13219f) {
            s sVar3 = sVarC.f13220g;
            p210v8.i.c(sVar3);
            p210v8.i.c(sVar2);
            sVar3.b(sVar2.c());
        }
        fVar.f13190t = this.f13190t;
        return fVar;
    }

    public final long c0(w wVar) {
        p210v8.i.f(wVar, "source");
        long j = 0;
        while (true) {
            long jU = wVar.u(this, 8192L);
            if (jU == -1) {
                return j;
            }
            j += jU;
        }
    }

    public final void d0(int i10) {
        s sVarZ = Z(1);
        int i11 = sVarZ.f13216c;
        sVarZ.f13216c = i11 + 1;
        sVarZ.a[i11] = (byte) i10;
        this.f13190t++;
    }

    @Override // ma.w
    public final y e() {
        return y.f13225d;
    }

    public final void e0(long j) {
        boolean z6;
        byte[] bArr;
        if (j == 0) {
            d0(48);
            return;
        }
        int i10 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                i0("-9223372036854775808");
                return;
            }
            z6 = true;
        } else {
            z6 = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i10 = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i10 = 2;
                }
            } else if (j < 1000000) {
                i10 = j < 100000 ? 5 : 6;
            } else {
                i10 = j < 10000000 ? 7 : 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i10 = j < 1000000000 ? 9 : 10;
            } else {
                i10 = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i10 = 13;
            } else {
                i10 = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i10 = j < 10000000000000000L ? 16 : 17;
        } else {
            i10 = j < 1000000000000000000L ? 18 : 19;
        }
        if (z6) {
            i10++;
        }
        s sVarZ = Z(i10);
        int i11 = sVarZ.f13216c + i10;
        while (true) {
            bArr = sVarZ.a;
            if (j == 0) {
                break;
            }
            long j10 = 10;
            i11--;
            bArr[i11] = na.a.a[(int) (j % j10)];
            j /= j10;
        }
        if (z6) {
            bArr[i11 - 1] = (byte) 45;
        }
        sVarZ.f13216c += i10;
        this.f13190t += (long) i10;
    }

    public final boolean equals(Object obj) {
        boolean z6;
        boolean z10;
        boolean z11 = true;
        if (this == obj) {
            return true;
        }
        boolean z12 = false;
        if (!(obj instanceof f)) {
            return false;
        }
        long j = this.f13190t;
        f fVar = (f) obj;
        if (j != fVar.f13190t) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        s sVar = this.f13189s;
        p210v8.i.c(sVar);
        s sVar2 = fVar.f13189s;
        p210v8.i.c(sVar2);
        int i10 = sVar.f13215b;
        int i11 = sVar2.f13215b;
        long j10 = 0;
        while (j10 < this.f13190t) {
            long jMin = Math.min(sVar.f13216c - i10, sVar2.f13216c - i11);
            if (0 < jMin) {
                long j11 = 0;
                while (true) {
                    j11++;
                    int i12 = i10 + 1;
                    z6 = z11;
                    byte b3 = sVar.a[i10];
                    int i13 = i11 + 1;
                    z10 = z12;
                    if (b3 != sVar2.a[i11]) {
                        return z10;
                    }
                    i11 = i13;
                    i10 = i12;
                    if (j11 >= jMin) {
                        break;
                    }
                    z11 = z6;
                    z12 = z10;
                }
            } else {
                z6 = z11;
                z10 = z12;
            }
            if (i10 == sVar.f13216c) {
                s sVar3 = sVar.f13219f;
                p210v8.i.c(sVar3);
                i10 = sVar3.f13215b;
                sVar = sVar3;
            }
            if (i11 == sVar2.f13216c) {
                sVar2 = sVar2.f13219f;
                p210v8.i.c(sVar2);
                i11 = sVar2.f13215b;
            }
            j10 += jMin;
            z11 = z6;
            z12 = z10;
        }
        return z11;
    }

    @Override // ma.h
    public final boolean f(long j) {
        return this.f13190t >= Long.MAX_VALUE;
    }

    public final void f0(long j) {
        if (j == 0) {
            d0(48);
            return;
        }
        long j10 = (j >>> 1) | j;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        s sVarZ = Z(i10);
        int i11 = sVarZ.f13216c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            sVarZ.a[i12] = na.a.a[(int) (15 & j)];
            j >>>= 4;
        }
        sVarZ.f13216c += i10;
        this.f13190t += (long) i10;
    }

    public final void g0(int i10) {
        s sVarZ = Z(4);
        int i11 = sVarZ.f13216c;
        byte[] bArr = sVarZ.a;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        sVarZ.f13216c = i11 + 4;
        this.f13190t += 4;
    }

    public final long h() {
        long j = this.f13190t;
        if (j == 0) {
            return 0L;
        }
        s sVar = this.f13189s;
        p210v8.i.c(sVar);
        s sVar2 = sVar.f13220g;
        p210v8.i.c(sVar2);
        int i10 = sVar2.f13216c;
        return (i10 >= 8192 || !sVar2.f13218e) ? j : j - ((long) (i10 - sVar2.f13215b));
    }

    public final void h0(int i10, String str, int i11) {
        char cCharAt;
        p210v8.i.f(str, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(p210v8.i.k(Integer.valueOf(i10), "beginIndex < 0: ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(AbstractC0487g.h("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        if (i11 > str.length()) {
            StringBuilder sbL = AbstractC0487g.l("endIndex > string.length: ", i11, " > ");
            sbL.append(str.length());
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 128) {
                s sVarZ = Z(1);
                int i12 = sVarZ.f13216c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                byte[] bArr = sVarZ.a;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = sVarZ.f13216c;
                int i15 = (i12 + i10) - i14;
                sVarZ.f13216c = i14 + i15;
                this.f13190t += (long) i15;
            } else {
                if (cCharAt2 < 2048) {
                    s sVarZ2 = Z(2);
                    int i16 = sVarZ2.f13216c;
                    byte[] bArr2 = sVarZ2.a;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    sVarZ2.f13216c = i16 + 2;
                    this.f13190t += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    s sVarZ3 = Z(3);
                    int i17 = sVarZ3.f13216c;
                    byte[] bArr3 = sVarZ3.a;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    sVarZ3.f13216c = i17 + 3;
                    this.f13190t += 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? str.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 > 57343) {
                        d0(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        s sVarZ4 = Z(4);
                        int i20 = sVarZ4.f13216c;
                        byte[] bArr4 = sVarZ4.a;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        sVarZ4.f13216c = i20 + 4;
                        this.f13190t += 4;
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }

    public final int hashCode() {
        s sVar = this.f13189s;
        if (sVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = sVar.f13216c;
            for (int i12 = sVar.f13215b; i12 < i11; i12++) {
                i10 = (i10 * 31) + sVar.a[i12];
            }
            sVar = sVar.f13219f;
            p210v8.i.c(sVar);
        } while (sVar != this.f13189s);
        return i10;
    }

    public final void i(f fVar, long j, long j10) {
        p210v8.i.f(fVar, "out");
        long j11 = j;
        o1.f.c(this.f13190t, j11, j10);
        if (j10 == 0) {
            return;
        }
        fVar.f13190t += j10;
        s sVar = this.f13189s;
        while (true) {
            p210v8.i.c(sVar);
            long j12 = sVar.f13216c - sVar.f13215b;
            if (j11 < j12) {
                break;
            }
            j11 -= j12;
            sVar = sVar.f13219f;
        }
        s sVar2 = sVar;
        long j13 = j10;
        while (j13 > 0) {
            p210v8.i.c(sVar2);
            s sVarC = sVar2.c();
            int i10 = sVarC.f13215b + ((int) j11);
            sVarC.f13215b = i10;
            sVarC.f13216c = Math.min(i10 + ((int) j13), sVarC.f13216c);
            s sVar3 = fVar.f13189s;
            if (sVar3 == null) {
                sVarC.f13220g = sVarC;
                sVarC.f13219f = sVarC;
                fVar.f13189s = sVarC;
            } else {
                s sVar4 = sVar3.f13220g;
                p210v8.i.c(sVar4);
                sVar4.b(sVarC);
            }
            j13 -= (long) (sVarC.f13216c - sVarC.f13215b);
            sVar2 = sVar2.f13219f;
            j11 = 0;
        }
    }

    public final void i0(String str) {
        p210v8.i.f(str, "string");
        h0(0, str, str.length());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final boolean j() {
        return this.f13190t == 0;
    }

    public final void j0(int i10) {
        String str;
        int i11 = 0;
        if (i10 < 128) {
            d0(i10);
            return;
        }
        if (i10 < 2048) {
            s sVarZ = Z(2);
            int i12 = sVarZ.f13216c;
            byte[] bArr = sVarZ.a;
            bArr[i12] = (byte) ((i10 >> 6) | 192);
            bArr[1 + i12] = (byte) ((i10 & 63) | 128);
            sVarZ.f13216c = i12 + 2;
            this.f13190t += 2;
            return;
        }
        if (55296 <= i10 && i10 <= 57343) {
            d0(63);
            return;
        }
        if (i10 < 65536) {
            s sVarZ2 = Z(3);
            int i13 = sVarZ2.f13216c;
            byte[] bArr2 = sVarZ2.a;
            bArr2[i13] = (byte) ((i10 >> 12) | 224);
            bArr2[1 + i13] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[2 + i13] = (byte) ((i10 & 63) | 128);
            sVarZ2.f13216c = i13 + 3;
            this.f13190t += 3;
            return;
        }
        if (i10 <= 1114111) {
            s sVarZ3 = Z(4);
            int i14 = sVarZ3.f13216c;
            byte[] bArr3 = sVarZ3.a;
            bArr3[i14] = (byte) ((i10 >> 18) | 240);
            bArr3[1 + i14] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[2 + i14] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[3 + i14] = (byte) ((i10 & 63) | 128);
            sVarZ3.f13216c = i14 + 4;
            this.f13190t += 4;
            return;
        }
        if (i10 != 0) {
            char[] cArr = na.b.a;
            char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
            while (i11 < 8 && cArr2[i11] == '0') {
                i11++;
            }
            if (i11 < 0) {
                throw new IndexOutOfBoundsException(E0.a.g("startIndex: ", i11, ", endIndex: 8, size: 8"));
            }
            if (i11 > 8) {
                throw new IllegalArgumentException(E0.a.g("startIndex: ", i11, " > endIndex: 8"));
            }
            str = new String(cArr2, i11, 8 - i11);
        } else {
            str = "0";
        }
        throw new IllegalArgumentException(p210v8.i.k(str, "Unexpected code point: 0x"));
    }

    public final byte l(long j) {
        o1.f.c(this.f13190t, j, 1L);
        s sVar = this.f13189s;
        if (sVar == null) {
            p210v8.i.c(null);
            throw null;
        }
        long j10 = this.f13190t;
        if (j10 - j < j) {
            while (j10 > j) {
                sVar = sVar.f13220g;
                p210v8.i.c(sVar);
                j10 -= (long) (sVar.f13216c - sVar.f13215b);
            }
            return sVar.a[(int) ((((long) sVar.f13215b) + j) - j10)];
        }
        long j11 = 0;
        while (true) {
            int i10 = sVar.f13216c;
            int i11 = sVar.f13215b;
            long j12 = ((long) (i10 - i11)) + j11;
            if (j12 > j) {
                return sVar.a[(int) ((((long) i11) + j) - j11)];
            }
            sVar = sVar.f13219f;
            p210v8.i.c(sVar);
            j11 = j12;
        }
    }

    public final int p(byte[] bArr, int i10, int i11) {
        o1.f.c(bArr.length, i10, i11);
        s sVar = this.f13189s;
        if (sVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, sVar.f13216c - sVar.f13215b);
        int i12 = sVar.f13215b;
        p086i8.i.o(i10, i12, i12 + iMin, sVar.a, bArr);
        int i13 = sVar.f13215b + iMin;
        sVar.f13215b = i13;
        this.f13190t -= (long) iMin;
        if (i13 == sVar.f13216c) {
            this.f13189s = sVar.a();
            t.a(sVar);
        }
        return iMin;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        p210v8.i.f(byteBuffer, "sink");
        s sVar = this.f13189s;
        if (sVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), sVar.f13216c - sVar.f13215b);
        byteBuffer.put(sVar.a, sVar.f13215b, iMin);
        int i10 = sVar.f13215b + iMin;
        sVar.f13215b = i10;
        this.f13190t -= (long) iMin;
        if (i10 == sVar.f13216c) {
            this.f13189s = sVar.a();
            t.a(sVar);
        }
        return iMin;
    }

    public final byte t() throws EOFException {
        if (this.f13190t == 0) {
            throw new EOFException();
        }
        s sVar = this.f13189s;
        p210v8.i.c(sVar);
        int i10 = sVar.f13215b;
        int i11 = sVar.f13216c;
        int i12 = i10 + 1;
        byte b3 = sVar.a[i10];
        this.f13190t--;
        if (i12 != i11) {
            sVar.f13215b = i12;
            return b3;
        }
        this.f13189s = sVar.a();
        t.a(sVar);
        return b3;
    }

    public final String toString() {
        long j = this.f13190t;
        if (j <= 2147483647L) {
            return Y((int) j).toString();
        }
        throw new IllegalStateException(p210v8.i.k(Long.valueOf(j), "size > Int.MAX_VALUE: ").toString());
    }

    @Override // ma.w
    public final long u(f fVar, long j) {
        p210v8.i.f(fVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(p210v8.i.k(Long.valueOf(j), "byteCount < 0: ").toString());
        }
        long j10 = this.f13190t;
        if (j10 == 0) {
            return -1L;
        }
        if (j > j10) {
            j = j10;
        }
        fVar.C(this, j);
        return j;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        p210v8.i.f(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            s sVarZ = Z(1);
            int iMin = Math.min(i10, 8192 - sVarZ.f13216c);
            byteBuffer.get(sVarZ.a, sVarZ.f13216c, iMin);
            i10 -= iMin;
            sVarZ.f13216c += iMin;
        }
        this.f13190t += (long) iRemaining;
        return iRemaining;
    }

    @Override // ma.h
    public final int x(p pVar) throws EOFException {
        p210v8.i.f(pVar, "options");
        int iB = na.a.b(this, pVar, false);
        if (iB == -1) {
            return -1;
        }
        X(pVar.f13207s[iB].h());
        return iB;
    }

    @Override // ma.g
    public final /* bridge */ /* synthetic */ g z(int i10) {
        d0(i10);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, ma.v
    public final void close() {
    }

    @Override // ma.h, ma.g
    public final f d() {
        return this;
    }

    @Override // ma.v, java.io.Flushable
    public final void flush() {
    }
}
