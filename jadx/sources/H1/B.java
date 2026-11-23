package H1;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class B extends MediaDataSource {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f1851s;

    public B(ByteBuffer byteBuffer) {
        this.f1851s = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f1851s.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f1851s;
        if (j >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j);
        int iMin = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
