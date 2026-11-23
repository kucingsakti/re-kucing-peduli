package da;

import B4.C0157e;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p020ba.k;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f10584v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0157e f10585w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C0157e c0157e, long j) {
        super(c0157e);
        i.f(c0157e, "this$0");
        this.f10585w = c0157e;
        this.f10584v = j;
        if (j == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10575t) {
            return;
        }
        if (this.f10584v != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!Y9.c.h(this)) {
                ((k) this.f10585w.f667d).l();
                a();
            }
        }
        this.f10575t = true;
    }

    @Override // da.a, ma.w
    public final long u(ma.f fVar, long j) throws IOException {
        i.f(fVar, "sink");
        if (this.f10575t) {
            throw new IllegalStateException("closed");
        }
        long j10 = this.f10584v;
        if (j10 == 0) {
            return -1L;
        }
        long jU = super.u(fVar, Math.min(j10, 8192L));
        if (jU == -1) {
            ((k) this.f10585w.f667d).l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j11 = this.f10584v - jU;
        this.f10584v = j11;
        if (j11 == 0) {
            a();
        }
        return jU;
    }
}
