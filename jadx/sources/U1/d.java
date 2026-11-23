package U1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f4868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4869t;

    public d(InputStream inputStream, long j) {
        super(inputStream);
        this.f4868s = j;
    }

    public final void a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f4869t += i10;
            return;
        }
        long j = this.f4869t;
        long j10 = this.f4868s;
        if (j10 - j <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j10 + ", but read: " + this.f4869t);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f4868s - ((long) this.f4869t), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i10;
        i10 = super.read();
        a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        i12 = super.read(bArr, i10, i11);
        a(i12);
        return i12;
    }
}
