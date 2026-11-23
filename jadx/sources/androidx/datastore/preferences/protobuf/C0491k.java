package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0491k extends P {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f6487h = Logger.getLogger(C0491k.class.getName());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f6488i = t0.f6517f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public I f6489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f6490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p039e0.m f6493g;

    public C0491k(p039e0.m mVar, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f6490d = new byte[iMax];
        this.f6491e = iMax;
        this.f6493g = mVar;
    }

    public static int A(long j) {
        int i10;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j) != 0) {
            i10 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int r(int i10, C0488h c0488h) {
        return s(c0488h) + y(i10);
    }

    public static int s(C0488h c0488h) {
        int size = c0488h.size();
        return z(size) + size;
    }

    public static int t(int i10) {
        return y(i10) + 4;
    }

    public static int u(int i10) {
        return y(i10) + 8;
    }

    public static int v(int i10, AbstractC0478a abstractC0478a, InterfaceC0481b0 interfaceC0481b0) {
        return abstractC0478a.b(interfaceC0481b0) + (y(i10) * 2);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return z(i10);
        }
        return 10;
    }

    public static int x(String str) {
        int length;
        try {
            length = w0.b(str);
        } catch (v0 unused) {
            length = str.getBytes(AbstractC0505z.a).length;
        }
        return z(length) + length;
    }

    public static int y(int i10) {
        return z(i10 << 3);
    }

    public static int z(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public final void B() {
        this.f6493g.write(this.f6490d, 0, this.f6492f);
        this.f6492f = 0;
    }

    public final void C(int i10) {
        if (this.f6491e - this.f6492f < i10) {
            B();
        }
    }

    public final void D(byte b3) {
        if (this.f6492f == this.f6491e) {
            B();
        }
        int i10 = this.f6492f;
        this.f6492f = i10 + 1;
        this.f6490d[i10] = b3;
    }

    public final void E(byte[] bArr, int i10, int i11) {
        int i12 = this.f6492f;
        int i13 = this.f6491e;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f6490d;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f6492f += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f6492f = i13;
        B();
        if (i16 > i13) {
            this.f6493g.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f6492f = i16;
        }
    }

    public final void F(int i10, boolean z6) {
        C(11);
        o(i10, 0);
        byte b3 = z6 ? (byte) 1 : (byte) 0;
        int i11 = this.f6492f;
        this.f6492f = i11 + 1;
        this.f6490d[i11] = b3;
    }

    public final void G(int i10, C0488h c0488h) {
        R(i10, 2);
        H(c0488h);
    }

    public final void H(C0488h c0488h) {
        T(c0488h.size());
        l(c0488h.f6469t, c0488h.e(), c0488h.size());
    }

    public final void I(int i10, int i11) {
        C(14);
        o(i10, 5);
        m(i11);
    }

    public final void J(int i10) {
        C(4);
        m(i10);
    }

    public final void K(int i10, long j) {
        C(18);
        o(i10, 1);
        n(j);
    }

    public final void L(long j) {
        C(8);
        n(j);
    }

    public final void M(int i10, int i11) {
        C(20);
        o(i10, 0);
        if (i11 >= 0) {
            p(i11);
        } else {
            q(i11);
        }
    }

    public final void N(int i10) {
        if (i10 >= 0) {
            T(i10);
        } else {
            V(i10);
        }
    }

    public final void O(int i10, AbstractC0478a abstractC0478a, InterfaceC0481b0 interfaceC0481b0) {
        R(i10, 2);
        T(abstractC0478a.b(interfaceC0481b0));
        interfaceC0481b0.b(abstractC0478a, this.f6489c);
    }

    public final void P(int i10, String str) throws CodedOutputStream$OutOfSpaceException {
        R(i10, 2);
        Q(str);
    }

    public final void Q(String str) throws CodedOutputStream$OutOfSpaceException {
        try {
            int length = str.length() * 3;
            int iZ = z(length);
            int i10 = iZ + length;
            int i11 = this.f6491e;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iF = w0.a.f(str, bArr, 0, length);
                T(iF);
                E(bArr, 0, iF);
                return;
            }
            if (i10 > i11 - this.f6492f) {
                B();
            }
            int iZ2 = z(str.length());
            int i12 = this.f6492f;
            byte[] bArr2 = this.f6490d;
            try {
                try {
                    if (iZ2 == iZ) {
                        int i13 = i12 + iZ2;
                        this.f6492f = i13;
                        int iF2 = w0.a.f(str, bArr2, i13, i11 - i13);
                        this.f6492f = i12;
                        p((iF2 - i12) - iZ2);
                        this.f6492f = iF2;
                    } else {
                        int iB = w0.b(str);
                        p(iB);
                        this.f6492f = w0.a.f(str, bArr2, this.f6492f, iB);
                    }
                } catch (v0 e10) {
                    this.f6492f = i12;
                    throw e10;
                }
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new CodedOutputStream$OutOfSpaceException(e11);
            }
        } catch (v0 e12) {
            f6487h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
            byte[] bytes = str.getBytes(AbstractC0505z.a);
            try {
                T(bytes.length);
                l(bytes, 0, bytes.length);
            } catch (CodedOutputStream$OutOfSpaceException e13) {
                throw e13;
            } catch (IndexOutOfBoundsException e14) {
                throw new CodedOutputStream$OutOfSpaceException(e14);
            }
        }
    }

    public final void R(int i10, int i11) {
        T((i10 << 3) | i11);
    }

    public final void S(int i10, int i11) {
        C(20);
        o(i10, 0);
        p(i11);
    }

    public final void T(int i10) {
        C(5);
        p(i10);
    }

    public final void U(int i10, long j) {
        C(20);
        o(i10, 0);
        q(j);
    }

    public final void V(long j) {
        C(10);
        q(j);
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final void l(byte[] bArr, int i10, int i11) {
        E(bArr, i10, i11);
    }

    public final void m(int i10) {
        int i11 = this.f6492f;
        int i12 = i11 + 1;
        this.f6492f = i12;
        byte[] bArr = this.f6490d;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f6492f = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f6492f = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f6492f = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    public final void n(long j) {
        int i10 = this.f6492f;
        int i11 = i10 + 1;
        this.f6492f = i11;
        byte[] bArr = this.f6490d;
        bArr[i10] = (byte) (j & 255);
        int i12 = i10 + 2;
        this.f6492f = i12;
        bArr[i11] = (byte) ((j >> 8) & 255);
        int i13 = i10 + 3;
        this.f6492f = i13;
        bArr[i12] = (byte) ((j >> 16) & 255);
        int i14 = i10 + 4;
        this.f6492f = i14;
        bArr[i13] = (byte) (255 & (j >> 24));
        int i15 = i10 + 5;
        this.f6492f = i15;
        bArr[i14] = (byte) (((int) (j >> 32)) & 255);
        int i16 = i10 + 6;
        this.f6492f = i16;
        bArr[i15] = (byte) (((int) (j >> 40)) & 255);
        int i17 = i10 + 7;
        this.f6492f = i17;
        bArr[i16] = (byte) (((int) (j >> 48)) & 255);
        this.f6492f = i10 + 8;
        bArr[i17] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void o(int i10, int i11) {
        p((i10 << 3) | i11);
    }

    public final void p(int i10) {
        boolean z6 = f6488i;
        byte[] bArr = this.f6490d;
        if (z6) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f6492f;
                this.f6492f = i11 + 1;
                t0.j(bArr, i11, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            int i12 = this.f6492f;
            this.f6492f = i12 + 1;
            t0.j(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f6492f;
            this.f6492f = i13 + 1;
            bArr[i13] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        int i14 = this.f6492f;
        this.f6492f = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public final void q(long j) {
        boolean z6 = f6488i;
        byte[] bArr = this.f6490d;
        if (z6) {
            while ((j & (-128)) != 0) {
                int i10 = this.f6492f;
                this.f6492f = i10 + 1;
                t0.j(bArr, i10, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i11 = this.f6492f;
            this.f6492f = i11 + 1;
            t0.j(bArr, i11, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i12 = this.f6492f;
            this.f6492f = i12 + 1;
            bArr[i12] = (byte) ((((int) j) & 127) | 128);
            j >>>= 7;
        }
        int i13 = this.f6492f;
        this.f6492f = i13 + 1;
        bArr[i13] = (byte) j;
    }
}
