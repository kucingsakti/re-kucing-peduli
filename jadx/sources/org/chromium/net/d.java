package org.chromium.net;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class d extends UploadDataProvider {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile FileChannel f13849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f13850t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f13851u = new Object();

    public d(c cVar) {
        this.f13850t = cVar;
    }

    public final FileChannel a() {
        if (this.f13849s == null) {
            synchronized (this.f13851u) {
                try {
                    if (this.f13849s == null) {
                        this.f13849s = this.f13850t.q();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f13849s;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.f13849s;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return a().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        FileChannel fileChannelA = a();
        int i10 = 0;
        while (i10 == 0) {
            int i11 = fileChannelA.read(byteBuffer);
            if (i11 == -1) {
                break;
            } else {
                i10 += i11;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        a().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
