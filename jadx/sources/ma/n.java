package ma;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class n implements w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r f13203s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Inflater f13204t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13205u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13206v;

    public n(r rVar, Inflater inflater) {
        this.f13203s = rVar;
        this.f13204t = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f13206v) {
            return;
        }
        this.f13204t.end();
        this.f13206v = true;
        this.f13203s.close();
    }

    @Override // ma.w
    public final y e() {
        return this.f13203s.f13212s.e();
    }

    @Override // ma.w
    public final long u(f fVar, long j) throws IOException {
        long j10;
        p210v8.i.f(fVar, "sink");
        while (!this.f13206v) {
            r rVar = this.f13203s;
            Inflater inflater = this.f13204t;
            try {
                s sVarZ = fVar.Z(1);
                int iMin = (int) Math.min(8192L, 8192 - sVarZ.f13216c);
                if (inflater.needsInput() && !rVar.a()) {
                    s sVar = rVar.f13213t.f13189s;
                    p210v8.i.c(sVar);
                    int i10 = sVar.f13216c;
                    int i11 = sVar.f13215b;
                    int i12 = i10 - i11;
                    this.f13205u = i12;
                    inflater.setInput(sVar.a, i11, i12);
                }
                int iInflate = inflater.inflate(sVarZ.a, sVarZ.f13216c, iMin);
                int i13 = this.f13205u;
                if (i13 != 0) {
                    int remaining = i13 - inflater.getRemaining();
                    this.f13205u -= remaining;
                    rVar.t(remaining);
                }
                if (iInflate > 0) {
                    sVarZ.f13216c += iInflate;
                    j10 = iInflate;
                    fVar.f13190t += j10;
                } else {
                    if (sVarZ.f13215b == sVarZ.f13216c) {
                        fVar.f13189s = sVarZ.a();
                        t.a(sVarZ);
                    }
                    j10 = 0;
                }
                if (j10 > 0) {
                    return j10;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (rVar.a()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        }
        throw new IllegalStateException("closed");
    }
}
