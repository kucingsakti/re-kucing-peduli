package p020ba;

import java.io.IOException;
import java.net.ProtocolException;
import ma.f;
import ma.j;
import ma.v;
import p140o4.r;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f7356t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7357u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f7358v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7359w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f7360x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, v vVar, long j) {
        super(vVar);
        i.f(rVar, "this$0");
        i.f(vVar, "delegate");
        this.f7360x = rVar;
        this.f7356t = j;
    }

    @Override // ma.j, ma.v
    public final void C(f fVar, long j) throws IOException {
        i.f(fVar, "source");
        if (this.f7359w) {
            throw new IllegalStateException("closed");
        }
        long j10 = this.f7356t;
        if (j10 == -1 || this.f7358v + j <= j10) {
            try {
                super.C(fVar, j);
                this.f7358v += j;
                return;
            } catch (IOException e10) {
                throw a(e10);
            }
        }
        throw new ProtocolException("expected " + j10 + " bytes but received " + (this.f7358v + j));
    }

    public final IOException a(IOException iOException) {
        if (this.f7357u) {
            return iOException;
        }
        this.f7357u = true;
        return this.f7360x.e(false, true, iOException);
    }

    @Override // ma.j, ma.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f7359w) {
            return;
        }
        this.f7359w = true;
        long j = this.f7356t;
        if (j != -1 && this.f7358v != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e10) {
            throw a(e10);
        }
    }

    @Override // ma.j, ma.v, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e10) {
            throw a(e10);
        }
    }
}
