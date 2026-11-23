package U1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ByteBuffer f4865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4866t = -1;

    public a(ByteBuffer byteBuffer) {
        this.f4865s = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f4865s.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f4866t = this.f4865s.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f4865s;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i10 = this.f4866t;
        if (i10 == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f4865s.position(i10);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.f4865s;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j, byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f4865s;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, iMin);
        return iMin;
    }
}
