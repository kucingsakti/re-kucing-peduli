package p048ea;

import O8.C0352h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import ma.f;
import ma.q;
import ma.r;
import p010aa.b;
import p010aa.c;
import p188t1.G;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Closeable {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final z f11304R;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b f11305A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final b f11306B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final y f11307C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f11308D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f11309E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f11310F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f11311G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final z f11312H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public z f11313I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f11314J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f11315K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f11316L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f11317M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Socket f11318N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final w f11319O;
    public final C0352h P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final LinkedHashSet f11320Q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f11321s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f11322t = new LinkedHashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f11323u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11324v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11325w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11326x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f11327y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f11328z;

    static {
        z zVar = new z();
        zVar.c(7, 65535);
        zVar.c(5, 16384);
        f11304R = zVar;
    }

    public o(G g8) {
        this.f11321s = (h) g8.f14983x;
        String str = (String) g8.f14978s;
        if (str == null) {
            i.n("connectionName");
            throw null;
        }
        this.f11323u = str;
        this.f11325w = 3;
        c cVar = (c) g8.f14979t;
        this.f11327y = cVar;
        this.f11328z = cVar.e();
        this.f11305A = cVar.e();
        this.f11306B = cVar.e();
        this.f11307C = y.a;
        z zVar = new z();
        zVar.c(7, 16777216);
        this.f11312H = zVar;
        z zVar2 = f11304R;
        this.f11313I = zVar2;
        this.f11317M = zVar2.a();
        Socket socket = (Socket) g8.f14980u;
        if (socket == null) {
            i.n("socket");
            throw null;
        }
        this.f11318N = socket;
        q qVar = (q) g8.f14982w;
        if (qVar == null) {
            i.n("sink");
            throw null;
        }
        this.f11319O = new w(qVar);
        r rVar = (r) g8.f14981v;
        if (rVar == null) {
            i.n("source");
            throw null;
        }
        this.P = new C0352h(this, new s(rVar));
        this.f11320Q = new LinkedHashSet();
    }

    public final void a(a aVar, a aVar2, IOException iOException) {
        int i10;
        Object[] array;
        byte[] bArr = Y9.c.a;
        try {
            i(aVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f11322t.isEmpty()) {
                array = null;
            } else {
                array = this.f11322t.values().toArray(new v[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                this.f11322t.clear();
            }
        }
        v[] vVarArr = (v[]) array;
        if (vVarArr != null) {
            for (v vVar : vVarArr) {
                try {
                    vVar.c(aVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f11319O.close();
        } catch (IOException unused3) {
        }
        try {
            this.f11318N.close();
        } catch (IOException unused4) {
        }
        this.f11328z.f();
        this.f11305A.f();
        this.f11306B.f();
    }

    public final void b(IOException iOException) {
        a aVar = a.PROTOCOL_ERROR;
        a(aVar, aVar, iOException);
    }

    public final synchronized v c(int i10) {
        return (v) this.f11322t.get(Integer.valueOf(i10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(a.NO_ERROR, a.CANCEL, null);
    }

    public final void flush() {
        this.f11319O.flush();
    }

    public final synchronized boolean g(long j) {
        if (this.f11326x) {
            return false;
        }
        return this.f11310F >= this.f11309E || j < this.f11311G;
    }

    public final synchronized v h(int i10) {
        v vVar;
        vVar = (v) this.f11322t.remove(Integer.valueOf(i10));
        notifyAll();
        return vVar;
    }

    public final void i(a aVar) {
        synchronized (this.f11319O) {
            synchronized (this) {
                if (this.f11326x) {
                    return;
                }
                this.f11326x = true;
                this.f11319O.g(this.f11324v, aVar, Y9.c.a);
            }
        }
    }

    public final synchronized void j(long j) {
        long j10 = this.f11314J + j;
        this.f11314J = j10;
        long j11 = j10 - this.f11315K;
        if (j11 >= this.f11312H.a() / 2) {
            o(0, j11);
            this.f11315K += j11;
        }
    }

    public final void l(int i10, boolean z6, f fVar, long j) {
        long j10;
        long j11;
        int iMin;
        long j12;
        if (j == 0) {
            this.f11319O.b(z6, i10, fVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j10 = this.f11316L;
                            j11 = this.f11317M;
                            if (j10 >= j11) {
                                if (!this.f11322t.containsKey(Integer.valueOf(i10))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j11 - j10), this.f11319O.f11371u);
                j12 = iMin;
                this.f11316L += j12;
            }
            j -= j12;
            this.f11319O.b(z6 && j == 0, i10, fVar, iMin);
        }
    }

    public final void n(int i10, a aVar) {
        this.f11328z.c(new l(this.f11323u + '[' + i10 + "] writeSynReset", this, i10, aVar, 2), 0L);
    }

    public final void o(int i10, long j) {
        this.f11328z.c(new n(this.f11323u + '[' + i10 + "] windowUpdate", this, i10, j), 0L);
    }
}
