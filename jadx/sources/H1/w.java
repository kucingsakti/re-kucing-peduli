package H1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class w extends FilterInputStream {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile byte[] f1903s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1904t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1905u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1906v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1907w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final B1.g f1908x;

    public w(InputStream inputStream, B1.g gVar) {
        super(inputStream);
        this.f1906v = -1;
        this.f1908x = gVar;
        this.f1903s = (byte[]) gVar.d(65536, byte[].class);
    }

    public static void c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f1906v;
        if (i10 != -1) {
            int i11 = this.f1907w - i10;
            int i12 = this.f1905u;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f1904t == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f1908x.d(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f1903s = bArr2;
                    this.f1908x.h(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f1907w - this.f1906v;
                this.f1907w = i13;
                this.f1906v = 0;
                this.f1904t = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f1907w;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f1904t = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f1906v = -1;
            this.f1907w = 0;
            this.f1904t = i16;
        }
        return i16;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f1903s == null || inputStream == null) {
            c();
            throw null;
        }
        return (this.f1904t - this.f1907w) + inputStream.available();
    }

    public final synchronized void b() {
        if (this.f1903s != null) {
            this.f1908x.h(this.f1903s);
            this.f1903s = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f1903s != null) {
            this.f1908x.h(this.f1903s);
            this.f1903s = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f1905u = Math.max(this.f1905u, i10);
        this.f1906v = this.f1907w;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f1903s;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            c();
            throw null;
        }
        if (this.f1907w >= this.f1904t && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f1903s && (bArr = this.f1903s) == null) {
            c();
            throw null;
        }
        int i10 = this.f1904t;
        int i11 = this.f1907w;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f1907w = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f1903s == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f1906v;
        if (-1 == i10) {
            throw new v("Mark has been invalidated, pos: " + this.f1907w + " markLimit: " + this.f1905u);
        }
        this.f1907w = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f1903s;
        if (bArr == null) {
            c();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            c();
            throw null;
        }
        int i10 = this.f1904t;
        int i11 = this.f1907w;
        if (i10 - i11 >= j) {
            this.f1907w = (int) (((long) i11) + j);
            return j;
        }
        long j10 = ((long) i10) - ((long) i11);
        this.f1907w = i10;
        if (this.f1906v == -1 || j > this.f1905u) {
            long jSkip = inputStream.skip(j - j10);
            if (jSkip > 0) {
                this.f1906v = -1;
            }
            return j10 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j10;
        }
        int i12 = this.f1904t;
        int i13 = this.f1907w;
        if (i12 - i13 >= j - j10) {
            this.f1907w = (int) ((((long) i13) + j) - j10);
            return j;
        }
        long j11 = (j10 + ((long) i12)) - ((long) i13);
        this.f1907w = i12;
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f1903s;
        if (bArr2 == null) {
            c();
            throw null;
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f1907w;
            int i15 = this.f1904t;
            if (i14 < i15) {
                int i16 = i15 - i14;
                if (i16 >= i11) {
                    i16 = i11;
                }
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f1907w += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f1906v == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f1903s && (bArr2 = this.f1903s) == null) {
                        c();
                        throw null;
                    }
                    int i17 = this.f1904t;
                    int i18 = this.f1907w;
                    i13 = i17 - i18;
                    if (i13 >= i12) {
                        i13 = i12;
                    }
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f1907w += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            c();
            throw null;
        }
    }
}
