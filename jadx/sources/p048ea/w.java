package p048ea;

import Y9.c;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.f;
import ma.q;
import ma.s;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Closeable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Logger f11368x = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q f11369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f11370t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11371u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11372v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f11373w;

    public w(q qVar) {
        i.f(qVar, "sink");
        this.f11369s = qVar;
        f fVar = new f();
        this.f11370t = fVar;
        this.f11371u = 16384;
        this.f11373w = new d(fVar);
    }

    public final synchronized void a(z zVar) {
        try {
            i.f(zVar, "peerSettings");
            if (this.f11372v) {
                throw new IOException("closed");
            }
            int i10 = this.f11371u;
            int i11 = zVar.a;
            if ((i11 & 32) != 0) {
                i10 = zVar.f11376b[5];
            }
            this.f11371u = i10;
            if (((i11 & 2) != 0 ? zVar.f11376b[1] : -1) != -1) {
                d dVar = this.f11373w;
                int i12 = (i11 & 2) != 0 ? zVar.f11376b[1] : -1;
                dVar.getClass();
                int iMin = Math.min(i12, 16384);
                int i13 = dVar.f11276d;
                if (i13 != iMin) {
                    if (iMin < i13) {
                        dVar.f11274b = Math.min(dVar.f11274b, iMin);
                    }
                    dVar.f11275c = true;
                    dVar.f11276d = iMin;
                    int i14 = dVar.f11280h;
                    if (iMin < i14) {
                        if (iMin == 0) {
                            b[] bVarArr = dVar.f11277e;
                            p086i8.i.t(0, bVarArr.length, bVarArr);
                            dVar.f11278f = dVar.f11277e.length - 1;
                            dVar.f11279g = 0;
                            dVar.f11280h = 0;
                        } else {
                            dVar.a(i14 - iMin);
                        }
                    }
                }
            }
            c(0, 0, 4, 1);
            this.f11369s.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z6, int i10, f fVar, int i11) {
        if (this.f11372v) {
            throw new IOException("closed");
        }
        c(i10, i11, 0, z6 ? 1 : 0);
        if (i11 > 0) {
            i.c(fVar);
            this.f11369s.C(fVar, i11);
        }
    }

    public final void c(int i10, int i11, int i12, int i13) {
        Level level = Level.FINE;
        Logger logger = f11368x;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i10, i11, i12, i13));
        }
        if (i11 > this.f11371u) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f11371u + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(i.k(Integer.valueOf(i10), "reserved bit set: ").toString());
        }
        byte[] bArr = c.a;
        q qVar = this.f11369s;
        i.f(qVar, "<this>");
        qVar.z((i11 >>> 16) & 255);
        qVar.z((i11 >>> 8) & 255);
        qVar.z(i11 & 255);
        qVar.z(i12 & 255);
        qVar.z(i13 & 255);
        qVar.b(i10 & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f11372v = true;
        this.f11369s.close();
    }

    public final synchronized void flush() {
        if (this.f11372v) {
            throw new IOException("closed");
        }
        this.f11369s.flush();
    }

    public final synchronized void g(int i10, a aVar, byte[] bArr) {
        if (this.f11372v) {
            throw new IOException("closed");
        }
        if (aVar.f11259s == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        c(0, bArr.length + 8, 7, 0);
        this.f11369s.b(i10);
        this.f11369s.b(aVar.f11259s);
        if (bArr.length != 0) {
            this.f11369s.F(bArr);
        }
        this.f11369s.flush();
    }

    public final synchronized void h(boolean z6, int i10, ArrayList arrayList) {
        if (this.f11372v) {
            throw new IOException("closed");
        }
        this.f11373w.d(arrayList);
        long j = this.f11370t.f13190t;
        long jMin = Math.min(this.f11371u, j);
        int i11 = j == jMin ? 4 : 0;
        if (z6) {
            i11 |= 1;
        }
        c(i10, (int) jMin, 1, i11);
        this.f11369s.C(this.f11370t, jMin);
        if (j > jMin) {
            long j10 = j - jMin;
            while (j10 > 0) {
                long jMin2 = Math.min(this.f11371u, j10);
                j10 -= jMin2;
                c(i10, (int) jMin2, 9, j10 == 0 ? 4 : 0);
                this.f11369s.C(this.f11370t, jMin2);
            }
        }
    }

    public final synchronized void i(int i10, int i11, boolean z6) {
        if (this.f11372v) {
            throw new IOException("closed");
        }
        c(0, 8, 6, z6 ? 1 : 0);
        this.f11369s.b(i10);
        this.f11369s.b(i11);
        this.f11369s.flush();
    }

    public final synchronized void j(int i10, a aVar) {
        if (this.f11372v) {
            throw new IOException("closed");
        }
        if (aVar.f11259s == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        c(i10, 4, 3, 0);
        this.f11369s.b(aVar.f11259s);
        this.f11369s.flush();
    }

    public final synchronized void l(z zVar) {
        int i10;
        try {
            i.f(zVar, "settings");
            if (this.f11372v) {
                throw new IOException("closed");
            }
            c(0, Integer.bitCount(zVar.a) * 6, 4, 0);
            int i11 = 0;
            while (i11 < 10) {
                int i12 = i11 + 1;
                boolean z6 = true;
                if (((1 << i11) & zVar.a) == 0) {
                    z6 = false;
                }
                if (z6) {
                    if (i11 != 4) {
                        i10 = i11 != 7 ? i11 : 4;
                    } else {
                        i10 = 3;
                    }
                    q qVar = this.f11369s;
                    if (qVar.f13211u) {
                        throw new IllegalStateException("closed");
                    }
                    f fVar = qVar.f13210t;
                    s sVarZ = fVar.Z(2);
                    int i13 = sVarZ.f13216c;
                    byte[] bArr = sVarZ.a;
                    bArr[i13] = (byte) ((i10 >>> 8) & 255);
                    bArr[i13 + 1] = (byte) (i10 & 255);
                    sVarZ.f13216c = i13 + 2;
                    fVar.f13190t += 2;
                    qVar.a();
                    this.f11369s.b(zVar.f11376b[i11]);
                }
                i11 = i12;
            }
            this.f11369s.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n(int i10, long j) {
        if (this.f11372v) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(i.k(Long.valueOf(j), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
        }
        c(i10, 4, 8, 0);
        this.f11369s.b((int) j);
        this.f11369s.flush();
    }
}
