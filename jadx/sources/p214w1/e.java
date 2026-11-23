package p214w1;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FileInputStream f15536s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Charset f15537t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f15538u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15539v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15540w;

    public e(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(f.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f15536s = fileInputStream;
        this.f15537t = charset;
        this.f15538u = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public final String a() {
        int i10;
        synchronized (this.f15536s) {
            try {
                byte[] bArr = this.f15538u;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f15539v >= this.f15540w) {
                    int i11 = this.f15536s.read(bArr, 0, bArr.length);
                    if (i11 == -1) {
                        throw new EOFException();
                    }
                    this.f15539v = 0;
                    this.f15540w = i11;
                }
                for (int i12 = this.f15539v; i12 != this.f15540w; i12++) {
                    byte[] bArr2 = this.f15538u;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f15539v;
                        if (i12 != i13) {
                            i10 = i12 - 1;
                            if (bArr2[i10] != 13) {
                                i10 = i12;
                            }
                        } else {
                            i10 = i12;
                        }
                        String str = new String(bArr2, i13, i10 - i13, this.f15537t.name());
                        this.f15539v = i12 + 1;
                        return str;
                    }
                }
                d dVar = new d(this, (this.f15540w - this.f15539v) + 80);
                while (true) {
                    byte[] bArr3 = this.f15538u;
                    int i14 = this.f15539v;
                    dVar.write(bArr3, i14, this.f15540w - i14);
                    this.f15540w = -1;
                    byte[] bArr4 = this.f15538u;
                    int i15 = this.f15536s.read(bArr4, 0, bArr4.length);
                    if (i15 == -1) {
                        throw new EOFException();
                    }
                    this.f15539v = 0;
                    this.f15540w = i15;
                    for (int i16 = 0; i16 != this.f15540w; i16++) {
                        byte[] bArr5 = this.f15538u;
                        if (bArr5[i16] == 10) {
                            int i17 = this.f15539v;
                            if (i16 != i17) {
                                dVar.write(bArr5, i17, i16 - i17);
                            }
                            this.f15539v = i16 + 1;
                            return dVar.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f15536s) {
            try {
                if (this.f15538u != null) {
                    this.f15538u = null;
                    this.f15536s.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
