package p048ea;

import Y9.c;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.f;
import ma.w;
import ma.y;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class r implements w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ma.r f11336s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11337t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11338u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11339v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11340w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11341x;

    public r(ma.r rVar) {
        i.f(rVar, "source");
        this.f11336s = rVar;
    }

    @Override // ma.w
    public final y e() {
        return this.f11336s.f13212s.e();
    }

    @Override // ma.w
    public final long u(f fVar, long j) throws IOException {
        int i10;
        int iJ;
        i.f(fVar, "sink");
        do {
            int i11 = this.f11340w;
            ma.r rVar = this.f11336s;
            if (i11 == 0) {
                rVar.t(this.f11341x);
                this.f11341x = 0;
                if ((this.f11338u & 4) == 0) {
                    i10 = this.f11339v;
                    int iT = c.t(rVar);
                    this.f11340w = iT;
                    this.f11337t = iT;
                    int iC = rVar.c() & 255;
                    this.f11338u = rVar.c() & 255;
                    Logger logger = s.f11342v;
                    if (logger.isLoggable(Level.FINE)) {
                        ma.i iVar = f.a;
                        logger.fine(f.a(true, this.f11339v, this.f11337t, iC, this.f11338u));
                    }
                    iJ = rVar.j() & Integer.MAX_VALUE;
                    this.f11339v = iJ;
                    if (iC != 9) {
                        throw new IOException(iC + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jU = rVar.u(fVar, Math.min(8192L, i11));
                if (jU != -1) {
                    this.f11340w -= (int) jU;
                    return jU;
                }
            }
            return -1L;
        } while (iJ == i10);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
