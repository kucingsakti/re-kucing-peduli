package p163q7;

import D6.a;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class l extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14435s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Closeable f14436t;

    public l(FileOutputStream fileOutputStream) throws IOException {
        this.f14436t = fileOutputStream;
        fileOutputStream.getChannel().position(0L);
    }

    @Override // D6.a
    public final void a(long j) throws IOException {
        switch (this.f14435s) {
            case 0:
                ((FileOutputStream) this.f14436t).getChannel().position(j);
                break;
            default:
                ((RandomAccessFile) this.f14436t).seek(j);
                break;
        }
    }

    @Override // D6.a
    public final void c(int i10, byte[] bArr) throws IOException {
        switch (this.f14435s) {
            case 0:
                ((FileOutputStream) this.f14436t).write(bArr, 0, i10);
                break;
            default:
                ((RandomAccessFile) this.f14436t).write(bArr, 0, i10);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f14435s) {
            case 0:
                ((FileOutputStream) this.f14436t).close();
                break;
            default:
                ((RandomAccessFile) this.f14436t).close();
                break;
        }
    }

    @Override // D6.a
    public final void flush() throws IOException {
        switch (this.f14435s) {
            case 0:
                ((FileOutputStream) this.f14436t).flush();
                break;
        }
    }

    public l(RandomAccessFile randomAccessFile) throws IOException {
        this.f14436t = randomAccessFile;
        randomAccessFile.seek(0L);
    }

    private final void g() {
    }
}
