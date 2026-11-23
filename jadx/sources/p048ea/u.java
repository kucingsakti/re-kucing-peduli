package p048ea;

import Y9.c;
import java.io.IOException;
import ma.f;
import ma.w;
import ma.y;
import okhttp3.internal.http2.StreamResetException;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class u implements w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f11350s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11351t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f f11352u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f11353v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11354w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v f11355x;

    public u(v vVar, long j, boolean z6) {
        i.f(vVar, "this$0");
        this.f11355x = vVar;
        this.f11350s = j;
        this.f11351t = z6;
        this.f11352u = new f();
        this.f11353v = new f();
    }

    public final void a(long j) {
        byte[] bArr = c.a;
        this.f11355x.f11356b.j(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        v vVar = this.f11355x;
        synchronized (vVar) {
            this.f11354w = true;
            f fVar = this.f11353v;
            j = fVar.f13190t;
            fVar.a();
            vVar.notifyAll();
        }
        if (j > 0) {
            a(j);
        }
        this.f11355x.a();
    }

    @Override // ma.w
    public final y e() {
        return this.f11355x.f11364k;
    }

    @Override // ma.w
    public final long u(f fVar, long j) throws Throwable {
        Throwable streamResetException;
        boolean z6;
        long jU;
        i.f(fVar, "sink");
        do {
            v vVar = this.f11355x;
            synchronized (vVar) {
                vVar.f11364k.h();
                try {
                    if (vVar.f() != null) {
                        streamResetException = vVar.f11367n;
                        if (streamResetException == null) {
                            a aVarF = vVar.f();
                            i.c(aVarF);
                            streamResetException = new StreamResetException(aVarF);
                        }
                    } else {
                        streamResetException = null;
                    }
                    if (this.f11354w) {
                        throw new IOException("stream closed");
                    }
                    f fVar2 = this.f11353v;
                    long j10 = fVar2.f13190t;
                    z6 = false;
                    if (j10 > 0) {
                        jU = fVar2.u(fVar, Math.min(8192L, j10));
                        long j11 = vVar.f11357c + jU;
                        vVar.f11357c = j11;
                        long j12 = j11 - vVar.f11358d;
                        if (streamResetException == null && j12 >= vVar.f11356b.f11312H.a() / 2) {
                            vVar.f11356b.o(vVar.a, j12);
                            vVar.f11358d = vVar.f11357c;
                        }
                    } else {
                        if (!this.f11351t && streamResetException == null) {
                            vVar.l();
                            z6 = true;
                        }
                        jU = -1;
                    }
                    vVar.f11364k.k();
                } catch (Throwable th) {
                    vVar.f11364k.k();
                    throw th;
                }
                throw th;
            }
        } while (z6);
        if (jU != -1) {
            a(jU);
            return jU;
        }
        if (streamResetException == null) {
            return -1L;
        }
        throw streamResetException;
    }
}
