package X9;

import java.io.IOException;

/* JADX INFO: renamed from: X9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0457c extends ma.k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5567t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ O f5568u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0457c(ya.r rVar, ma.h hVar) {
        super(hVar);
        this.f5568u = rVar;
    }

    @Override // ma.k, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f5567t) {
            case 0:
                ((C0458d) this.f5568u).f5569t.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // ma.k, ma.w
    public long u(ma.f fVar, long j) throws IOException {
        switch (this.f5567t) {
            case 1:
                try {
                    return super.u(fVar, 8192L);
                } catch (IOException e10) {
                    ((ya.r) this.f5568u).f16225v = e10;
                    throw e10;
                }
            default:
                return super.u(fVar, j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0457c(ma.w wVar, C0458d c0458d) {
        super(wVar);
        this.f5568u = c0458d;
    }
}
