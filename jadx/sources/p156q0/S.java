package p156q0;

import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class S extends Writer {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final StringBuilder f14282s = new StringBuilder(128);

    public final void a() {
        StringBuilder sb = this.f14282s;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f14282s.append(c10);
            }
        }
    }
}
