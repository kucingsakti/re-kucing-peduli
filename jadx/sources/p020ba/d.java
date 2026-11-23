package p020ba;

import java.io.IOException;
import java.net.ProtocolException;
import ma.f;
import ma.k;
import ma.w;
import p140o4.r;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f7361t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f7362u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7363v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r f7366y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, w wVar, long j) {
        super(wVar);
        i.f(rVar, "this$0");
        i.f(wVar, "delegate");
        this.f7366y = rVar;
        this.f7361t = j;
        this.f7363v = true;
        if (j == 0) {
            a(null);
        }
    }

    public final IOException a(IOException iOException) {
        if (this.f7364w) {
            return iOException;
        }
        this.f7364w = true;
        r rVar = this.f7366y;
        if (iOException == null && this.f7363v) {
            this.f7363v = false;
            rVar.getClass();
            i.f((i) rVar.f13782t, "call");
        }
        return rVar.e(true, false, iOException);
    }

    @Override // ma.k, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f7365x) {
            return;
        }
        this.f7365x = true;
        try {
            super.close();
            a(null);
        } catch (IOException e10) {
            throw a(e10);
        }
    }

    @Override // ma.k, ma.w
    public final long u(f fVar, long j) throws IOException {
        i.f(fVar, "sink");
        if (this.f7365x) {
            throw new IllegalStateException("closed");
        }
        try {
            long jU = this.f13196s.u(fVar, 8192L);
            if (this.f7363v) {
                this.f7363v = false;
                r rVar = this.f7366y;
                rVar.getClass();
                i.f((i) rVar.f13782t, "call");
            }
            if (jU == -1) {
                a(null);
                return -1L;
            }
            long j10 = this.f7362u + jU;
            long j11 = this.f7361t;
            if (j11 == -1 || j10 <= j11) {
                this.f7362u = j10;
                if (j10 == j11) {
                    a(null);
                }
                return jU;
            }
            throw new ProtocolException("expected " + j11 + " bytes but received " + j10);
        } catch (IOException e10) {
            throw a(e10);
        }
    }
}
