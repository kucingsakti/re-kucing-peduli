package da;

import java.io.IOException;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10589v;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10575t) {
            return;
        }
        if (!this.f10589v) {
            a();
        }
        this.f10575t = true;
    }

    @Override // da.a, ma.w
    public final long u(ma.f fVar, long j) throws IOException {
        i.f(fVar, "sink");
        if (this.f10575t) {
            throw new IllegalStateException("closed");
        }
        if (this.f10589v) {
            return -1L;
        }
        long jU = super.u(fVar, 8192L);
        if (jU != -1) {
            return jU;
        }
        this.f10589v = true;
        a();
        return -1L;
    }
}
