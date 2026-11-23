package Z9;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import ma.q;
import ma.w;
import ma.y;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5919s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ma.h f5920t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p204v1.f f5921u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q f5922v;

    public a(ma.h hVar, p204v1.f fVar, q qVar) {
        this.f5920t = hVar;
        this.f5921u = fVar;
        this.f5922v = qVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f5919s) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!Y9.c.h(this)) {
                this.f5919s = true;
                this.f5921u.a();
            }
        }
        this.f5920t.close();
    }

    @Override // ma.w
    public final y e() {
        return this.f5920t.e();
    }

    @Override // ma.w
    public final long u(ma.f fVar, long j) throws Throwable {
        i.f(fVar, "sink");
        try {
            long jU = this.f5920t.u(fVar, 8192L);
            q qVar = this.f5922v;
            if (jU != -1) {
                fVar.i(qVar.f13210t, fVar.f13190t - jU, jU);
                qVar.a();
                return jU;
            }
            if (!this.f5919s) {
                this.f5919s = true;
                qVar.close();
            }
            return -1L;
        } catch (IOException e10) {
            if (this.f5919s) {
                throw e10;
            }
            this.f5919s = true;
            this.f5921u.a();
            throw e10;
        }
    }
}
