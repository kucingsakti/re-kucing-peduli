package ma;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b implements w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13179s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f13180t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f13181u;

    public /* synthetic */ b(Object obj, int i10, Object obj2) {
        this.f13179s = i10;
        this.f13180t = obj;
        this.f13181u = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f13179s) {
            case 0:
                b bVar = (b) this.f13181u;
                p020ba.h hVar = (p020ba.h) this.f13180t;
                hVar.h();
                try {
                    try {
                        bVar.close();
                        if (hVar.i()) {
                            throw hVar.l(null);
                        }
                        return;
                    } catch (IOException e10) {
                        if (!hVar.i()) {
                            throw e10;
                        }
                        throw hVar.l(e10);
                    }
                } catch (Throwable th) {
                    hVar.i();
                    throw th;
                }
            default:
                ((InputStream) this.f13180t).close();
                return;
        }
    }

    @Override // ma.w
    public final y e() {
        switch (this.f13179s) {
            case 0:
                return (p020ba.h) this.f13180t;
            default:
                return (y) this.f13181u;
        }
    }

    public final String toString() {
        switch (this.f13179s) {
            case 0:
                return "AsyncTimeout.source(" + ((b) this.f13181u) + ')';
            default:
                return "source(" + ((InputStream) this.f13180t) + ')';
        }
    }

    @Override // ma.w
    public final long u(f fVar, long j) throws IOException {
        switch (this.f13179s) {
            case 0:
                p210v8.i.f(fVar, "sink");
                b bVar = (b) this.f13181u;
                p020ba.h hVar = (p020ba.h) this.f13180t;
                hVar.h();
                try {
                    try {
                        long jU = bVar.u(fVar, 8192L);
                        if (hVar.i()) {
                            throw hVar.l(null);
                        }
                        return jU;
                    } catch (IOException e10) {
                        if (hVar.i()) {
                            throw hVar.l(e10);
                        }
                        throw e10;
                    }
                } catch (Throwable th) {
                    hVar.i();
                    throw th;
                }
            default:
                p210v8.i.f(fVar, "sink");
                try {
                    ((y) this.f13181u).f();
                    s sVarZ = fVar.Z(1);
                    int i10 = ((InputStream) this.f13180t).read(sVarZ.a, sVarZ.f13216c, (int) Math.min(8192L, 8192 - sVarZ.f13216c));
                    if (i10 == -1) {
                        if (sVarZ.f13215b == sVarZ.f13216c) {
                            fVar.f13189s = sVarZ.a();
                            t.a(sVarZ);
                        }
                        return -1L;
                    }
                    sVarZ.f13216c += i10;
                    long j10 = i10;
                    fVar.f13190t += j10;
                    return j10;
                } catch (AssertionError e11) {
                    if (p068ga.d.v(e11)) {
                        throw new IOException(e11);
                    }
                    throw e11;
                }
        }
    }
}
