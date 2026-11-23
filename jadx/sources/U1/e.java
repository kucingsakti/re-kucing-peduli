package U1;

import H1.w;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class e extends InputStream {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ArrayDeque f4870u;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public w f4871s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public IOException f4872t;

    static {
        char[] cArr = n.a;
        f4870u = new ArrayDeque(0);
    }

    public final void a() {
        this.f4872t = null;
        this.f4871s = null;
        ArrayDeque arrayDeque = f4870u;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f4871s.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4871s.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f4871s.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f4871s.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f4871s.read();
        } catch (IOException e10) {
            this.f4872t = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f4871s.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f4871s.skip(j);
        } catch (IOException e10) {
            this.f4872t = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f4871s.read(bArr);
        } catch (IOException e10) {
            this.f4872t = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f4871s.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f4872t = e10;
            throw e10;
        }
    }
}
