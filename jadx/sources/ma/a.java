package ma;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class a implements v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13176s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f13177t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f13178u;

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f13176s = i10;
        this.f13177t = obj;
        this.f13178u = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009e A[LOOP:1: B:12:0x0065->B:25:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0 A[SYNTHETIC] */
    @Override // ma.v
    public final void C(f fVar, long j) throws IOException {
        p020ba.h hVar;
        switch (this.f13176s) {
            case 0:
                p210v8.i.f(fVar, "source");
                o1.f.c(fVar.f13190t, 0L, j);
                long j10 = j;
                while (true) {
                    long j11 = 0;
                    if (j10 <= 0) {
                        return;
                    }
                    s sVar = fVar.f13189s;
                    p210v8.i.c(sVar);
                    try {
                        try {
                            while (j11 < 65536) {
                                j11 += (long) (sVar.f13216c - sVar.f13215b);
                                if (j11 >= j10) {
                                    j11 = j10;
                                    a aVar = (a) this.f13178u;
                                    hVar = (p020ba.h) this.f13177t;
                                    hVar.h();
                                    aVar.C(fVar, j11);
                                    if (!hVar.i()) {
                                        throw hVar.l(null);
                                    }
                                    j10 -= j11;
                                } else {
                                    sVar = sVar.f13219f;
                                    p210v8.i.c(sVar);
                                }
                            }
                            aVar.C(fVar, j11);
                            if (!hVar.i()) {
                                throw hVar.l(null);
                            }
                            j10 -= j11;
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
                    a aVar2 = (a) this.f13178u;
                    hVar = (p020ba.h) this.f13177t;
                    hVar.h();
                }
                break;
            default:
                p210v8.i.f(fVar, "source");
                o1.f.c(fVar.f13190t, 0L, j);
                while (j > 0) {
                    ((y) this.f13178u).f();
                    s sVar2 = fVar.f13189s;
                    p210v8.i.c(sVar2);
                    int iMin = (int) Math.min(j, sVar2.f13216c - sVar2.f13215b);
                    ((OutputStream) this.f13177t).write(sVar2.a, sVar2.f13215b, iMin);
                    int i10 = sVar2.f13215b + iMin;
                    sVar2.f13215b = i10;
                    long j12 = iMin;
                    j -= j12;
                    fVar.f13190t -= j12;
                    if (i10 == sVar2.f13216c) {
                        fVar.f13189s = sVar2.a();
                        t.a(sVar2);
                    }
                }
                return;
        }
    }

    @Override // ma.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f13176s) {
            case 0:
                a aVar = (a) this.f13178u;
                p020ba.h hVar = (p020ba.h) this.f13177t;
                hVar.h();
                try {
                    try {
                        aVar.close();
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
                ((OutputStream) this.f13177t).close();
                return;
        }
    }

    @Override // ma.v
    public final y e() {
        switch (this.f13176s) {
            case 0:
                return (p020ba.h) this.f13177t;
            default:
                return (y) this.f13178u;
        }
    }

    @Override // ma.v, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f13176s) {
            case 0:
                a aVar = (a) this.f13178u;
                p020ba.h hVar = (p020ba.h) this.f13177t;
                hVar.h();
                try {
                    try {
                        aVar.flush();
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
                ((OutputStream) this.f13177t).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f13176s) {
            case 0:
                return "AsyncTimeout.sink(" + ((a) this.f13178u) + ')';
            default:
                return "sink(" + ((OutputStream) this.f13177t) + ')';
        }
    }
}
