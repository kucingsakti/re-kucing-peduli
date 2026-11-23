package p137o0;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f13566s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f13567t;

    public a(f fVar) {
        this.f13567t = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j10 = this.f13566s;
            f fVar = this.f13567t;
            if (j10 != j) {
                if (j10 >= 0 && j >= j10 + ((long) fVar.f13570s.available())) {
                    return -1;
                }
                fVar.b(j);
                this.f13566s = j;
            }
            if (i11 > fVar.f13570s.available()) {
                i11 = fVar.f13570s.available();
            }
            int i12 = fVar.read(bArr, i10, i11);
            if (i12 >= 0) {
                this.f13566s += (long) i12;
                return i12;
            }
        } catch (IOException unused) {
        }
        this.f13566s = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
