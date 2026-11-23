package p137o0;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f13570s.mark(Integer.MAX_VALUE);
    }

    public final void b(long j) throws IOException {
        int i10 = this.f13572u;
        if (i10 > j) {
            this.f13572u = 0;
            this.f13570s.reset();
        } else {
            j -= (long) i10;
        }
        a((int) j);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f13570s.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
