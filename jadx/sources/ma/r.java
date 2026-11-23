package ma;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class r implements h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w f13212s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f13213t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13214u;

    public r(w wVar) {
        p210v8.i.f(wVar, "source");
        this.f13212s = wVar;
        this.f13213t = new f();
    }

    @Override // ma.h
    public final long D(f fVar) {
        f fVar2;
        long j = 0;
        while (true) {
            fVar2 = this.f13213t;
            if (this.f13212s.u(fVar2, 8192L) == -1) {
                break;
            }
            long jH = fVar2.h();
            if (jH > 0) {
                j += jH;
                fVar.C(fVar2, jH);
            }
        }
        long j10 = fVar2.f13190t;
        if (j10 <= 0) {
            return j;
        }
        long j11 = j + j10;
        fVar.C(fVar2, j10);
        return j11;
    }

    @Override // ma.h
    public final String U(Charset charset) {
        f fVar = this.f13213t;
        fVar.c0(this.f13212s);
        return fVar.H(fVar.f13190t, charset);
    }

    @Override // ma.h
    public final InputStream V() {
        return new e(this, 1);
    }

    public final boolean a() {
        if (this.f13214u) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f13213t;
        return fVar.j() && this.f13212s.u(fVar, 8192L) == -1;
    }

    public final long b(byte b3, long j, long j10) {
        s sVar;
        long j11;
        if (this.f13214u) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        if (0 > j10) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j10).toString());
        }
        while (jMax < j10) {
            f fVar = this.f13213t;
            fVar.getClass();
            long j12 = 0;
            boolean z6 = false;
            if (0 <= jMax && jMax <= j10) {
                z6 = true;
            }
            if (!z6) {
                throw new IllegalArgumentException(("size=" + fVar.f13190t + " fromIndex=" + jMax + " toIndex=" + j10).toString());
            }
            long j13 = fVar.f13190t;
            long j14 = j10 > j13 ? j13 : j10;
            long j15 = -1;
            if (jMax == j14 || (sVar = fVar.f13189s) == null) {
                j11 = -1;
                break;
            }
            if (j13 - jMax < jMax) {
                while (j13 > jMax) {
                    sVar = sVar.f13220g;
                    p210v8.i.c(sVar);
                    j13 -= (long) (sVar.f13216c - sVar.f13215b);
                }
                long j16 = jMax;
                while (true) {
                    if (j13 >= j14) {
                        j11 = -1;
                        break;
                    }
                    j11 = -1;
                    int iMin = (int) Math.min(sVar.f13216c, (((long) sVar.f13215b) + j14) - j13);
                    for (int i10 = (int) ((((long) sVar.f13215b) + j16) - j13); i10 < iMin; i10++) {
                        if (sVar.a[i10] == b3) {
                            j15 = ((long) (i10 - sVar.f13215b)) + j13;
                            break;
                        }
                    }
                    j16 = j13 + ((long) (sVar.f13216c - sVar.f13215b));
                    sVar = sVar.f13219f;
                    p210v8.i.c(sVar);
                    j13 = j16;
                }
            } else {
                j11 = -1;
                while (true) {
                    long j17 = ((long) (sVar.f13216c - sVar.f13215b)) + j12;
                    if (j17 > jMax) {
                        break;
                    }
                    sVar = sVar.f13219f;
                    p210v8.i.c(sVar);
                    j12 = j17;
                }
                long j18 = jMax;
                while (j12 < j14) {
                    long j19 = j18;
                    int iMin2 = (int) Math.min(sVar.f13216c, (((long) sVar.f13215b) + j14) - j12);
                    for (int i11 = (int) ((((long) sVar.f13215b) + j19) - j12); i11 < iMin2; i11++) {
                        if (sVar.a[i11] == b3) {
                            j15 = ((long) (i11 - sVar.f13215b)) + j12;
                            break;
                        }
                    }
                    j18 = ((long) (sVar.f13216c - sVar.f13215b)) + j12;
                    sVar = sVar.f13219f;
                    p210v8.i.c(sVar);
                    j12 = j18;
                }
            }
            if (j15 != j11) {
                return j15;
            }
            long j20 = fVar.f13190t;
            if (j20 >= j10 || this.f13212s.u(fVar, 8192L) == j11) {
                return j11;
            }
            jMax = Math.max(jMax, j20);
        }
        return -1L;
    }

    public final byte c() throws EOFException {
        p(1L);
        return this.f13213t.t();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f13214u) {
            return;
        }
        this.f13214u = true;
        this.f13212s.close();
        this.f13213t.a();
    }

    @Override // ma.h, ma.g
    public final f d() {
        return this.f13213t;
    }

    @Override // ma.w
    public final y e() {
        return this.f13212s.e();
    }

    @Override // ma.h
    public final boolean f(long j) {
        f fVar;
        if (j < 0) {
            throw new IllegalArgumentException(p210v8.i.k(Long.valueOf(j), "byteCount < 0: ").toString());
        }
        if (this.f13214u) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f13213t;
            if (fVar.f13190t >= j) {
                return true;
            }
        } while (this.f13212s.u(fVar, 8192L) != -1);
        return false;
    }

    public final i g(long j) throws EOFException {
        p(j);
        return this.f13213t.B(j);
    }

    public final long h() {
        f fVar;
        long j;
        byte b3;
        p(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            boolean zF = f(j11);
            fVar = this.f13213t;
            if (!zF) {
                break;
            }
            byte bL = fVar.l(j10);
            if ((bL < ((byte) 48) || bL > ((byte) 57)) && !(j10 == 0 && bL == ((byte) 45))) {
                if (j10 != 0) {
                    break;
                }
                D3.b.d(16);
                D3.b.d(16);
                String string = Integer.toString(bL, 16);
                p210v8.i.e(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                throw new NumberFormatException(p210v8.i.k(string, "Expected a digit or '-' but was 0x"));
            }
            j10 = j11;
        }
        long j12 = 0;
        if (fVar.f13190t == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z6 = false;
        long j13 = 0;
        long j14 = -7;
        boolean z10 = false;
        loop1: while (true) {
            s sVar = fVar.f13189s;
            p210v8.i.c(sVar);
            int i11 = sVar.f13215b;
            int i12 = sVar.f13216c;
            while (true) {
                if (i11 >= i12) {
                    j = j12;
                    break;
                }
                b3 = sVar.a[i11];
                byte b7 = (byte) 48;
                j = j12;
                if (b3 >= b7 && b3 <= ((byte) 57)) {
                    int i13 = b7 - b3;
                    if (j13 < -922337203685477580L || (j13 == -922337203685477580L && i13 < j14)) {
                        break loop1;
                    }
                    j13 = (j13 * 10) + ((long) i13);
                } else {
                    if (b3 != ((byte) 45) || i10 != 0) {
                        z10 = true;
                        break;
                    }
                    j14--;
                    z6 = true;
                }
                i11++;
                i10++;
                j12 = j;
            }
            if (i11 == i12) {
                fVar.f13189s = sVar.a();
                t.a(sVar);
            } else {
                sVar.f13215b = i11;
            }
            if (z10 || fVar.f13189s == null) {
                long j15 = fVar.f13190t - ((long) i10);
                fVar.f13190t = j15;
                if (i10 >= (z6 ? 2 : 1)) {
                    return z6 ? j13 : -j13;
                }
                if (j15 == j) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z6 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + o1.f.o(fVar.l(j)));
            }
            j12 = j;
        }
        f fVar2 = new f();
        fVar2.e0(j13);
        fVar2.d0(b3);
        if (!z6) {
            fVar2.t();
        }
        throw new NumberFormatException(p210v8.i.k(fVar2.J(), "Number too large: "));
    }

    public final long i() throws EOFException {
        f fVar;
        int i10;
        p(1L);
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            boolean zF = f(i12);
            fVar = this.f13213t;
            if (!zF) {
                break;
            }
            byte bL = fVar.l(i11);
            if ((bL < ((byte) 48) || bL > ((byte) 57)) && ((bL < ((byte) 97) || bL > ((byte) 102)) && (bL < ((byte) 65) || bL > ((byte) 70)))) {
                if (i11 != 0) {
                    break;
                }
                D3.b.d(16);
                D3.b.d(16);
                String string = Integer.toString(bL, 16);
                p210v8.i.e(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                throw new NumberFormatException(p210v8.i.k(string, "Expected leading [0-9a-fA-F] character but was 0x"));
            }
            i11 = i12;
        }
        if (fVar.f13190t == 0) {
            throw new EOFException();
        }
        int i13 = 0;
        boolean z6 = false;
        long j = 0;
        do {
            s sVar = fVar.f13189s;
            p210v8.i.c(sVar);
            int i14 = sVar.f13215b;
            int i15 = sVar.f13216c;
            while (i14 < i15) {
                byte b3 = sVar.a[i14];
                byte b7 = (byte) 48;
                if (b3 < b7 || b3 > ((byte) 57)) {
                    byte b10 = (byte) 97;
                    if ((b3 < b10 || b3 > ((byte) 102)) && (b3 < (b10 = (byte) 65) || b3 > ((byte) 70))) {
                        if (i13 == 0) {
                            throw new NumberFormatException(p210v8.i.k(o1.f.o(b3), "Expected leading [0-9a-fA-F] character but was 0x"));
                        }
                        z6 = true;
                        break;
                    }
                    i10 = (b3 - b10) + 10;
                } else {
                    i10 = b3 - b7;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    f fVar2 = new f();
                    fVar2.f0(j);
                    fVar2.d0(b3);
                    throw new NumberFormatException(p210v8.i.k(fVar2.J(), "Number too large: "));
                }
                j = (j << 4) | ((long) i10);
                i14++;
                i13++;
            }
            if (i14 == i15) {
                fVar.f13189s = sVar.a();
                t.a(sVar);
            } else {
                sVar.f13215b = i14;
            }
            if (z6) {
                break;
            }
        } while (fVar.f13189s != null);
        fVar.f13190t -= (long) i13;
        return j;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f13214u;
    }

    public final int j() throws EOFException {
        p(4L);
        return this.f13213t.E();
    }

    public final int l() throws EOFException {
        p(4L);
        int iE = this.f13213t.E();
        return ((iE & 255) << 24) | (((-16777216) & iE) >>> 24) | ((16711680 & iE) >>> 8) | ((65280 & iE) << 8);
    }

    public final short n() throws EOFException {
        p(2L);
        return this.f13213t.G();
    }

    public final String o(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(p210v8.i.k(Long.valueOf(j), "limit < 0: ").toString());
        }
        long j10 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        byte b3 = (byte) 10;
        long jB = b(b3, 0L, j10);
        f fVar = this.f13213t;
        if (jB != -1) {
            return na.a.a(fVar, jB);
        }
        if (j10 < Long.MAX_VALUE && f(j10) && fVar.l(j10 - 1) == ((byte) 13) && f(j10 + 1) && fVar.l(j10) == b3) {
            return na.a.a(fVar, j10);
        }
        f fVar2 = new f();
        fVar.i(fVar2, 0L, Math.min(32, fVar.f13190t));
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f13190t, j) + " content=" + fVar2.B(fVar2.f13190t).i() + (char) 8230);
    }

    public final void p(long j) throws EOFException {
        if (!f(j)) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        p210v8.i.f(byteBuffer, "sink");
        f fVar = this.f13213t;
        if (fVar.f13190t == 0 && this.f13212s.u(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    public final void t(long j) throws EOFException {
        if (this.f13214u) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            f fVar = this.f13213t;
            if (fVar.f13190t == 0 && this.f13212s.u(fVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, fVar.f13190t);
            fVar.X(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f13212s + ')';
    }

    @Override // ma.w
    public final long u(f fVar, long j) {
        p210v8.i.f(fVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(p210v8.i.k(Long.valueOf(j), "byteCount < 0: ").toString());
        }
        if (this.f13214u) {
            throw new IllegalStateException("closed");
        }
        f fVar2 = this.f13213t;
        if (fVar2.f13190t == 0 && this.f13212s.u(fVar2, 8192L) == -1) {
            return -1L;
        }
        return fVar2.u(fVar, Math.min(j, fVar2.f13190t));
    }

    @Override // ma.h
    public final int x(p pVar) throws EOFException {
        f fVar;
        p210v8.i.f(pVar, "options");
        if (this.f13214u) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f13213t;
            int iB = na.a.b(fVar, pVar, true);
            if (iB != -2) {
                if (iB == -1) {
                    break;
                }
                fVar.X(pVar.f13207s[iB].h());
                return iB;
            }
        } while (this.f13212s.u(fVar, 8192L) != -1);
        return -1;
    }
}
