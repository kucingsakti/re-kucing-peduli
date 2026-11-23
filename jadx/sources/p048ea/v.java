package p048ea;

import X9.w;
import Y9.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.StreamResetException;
import p020ba.h;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f11356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f11361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f11363i;
    public final t j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f11364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f11365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f11366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IOException f11367n;

    public v(int i10, o oVar, boolean z6, boolean z10, w wVar) {
        i.f(oVar, "connection");
        this.a = i10;
        this.f11356b = oVar;
        this.f11360f = oVar.f11313I.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f11361g = arrayDeque;
        this.f11363i = new u(this, oVar.f11312H.a(), z10);
        this.j = new t(this, z6);
        this.f11364k = new h(this);
        this.f11365l = new h(this);
        if (wVar == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(wVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    public final void a() {
        boolean z6;
        boolean zI;
        byte[] bArr = c.a;
        synchronized (this) {
            u uVar = this.f11363i;
            if (uVar.f11351t || !uVar.f11354w) {
                z6 = false;
            } else {
                t tVar = this.j;
                if (tVar.f11346s || tVar.f11348u) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            zI = i();
        }
        if (z6) {
            c(a.CANCEL, null);
        } else {
            if (zI) {
                return;
            }
            this.f11356b.h(this.a);
        }
    }

    public final void b() throws IOException {
        t tVar = this.j;
        if (tVar.f11348u) {
            throw new IOException("stream closed");
        }
        if (tVar.f11346s) {
            throw new IOException("stream finished");
        }
        if (this.f11366m != null) {
            IOException iOException = this.f11367n;
            if (iOException != null) {
                throw iOException;
            }
            a aVar = this.f11366m;
            i.c(aVar);
            throw new StreamResetException(aVar);
        }
    }

    public final void c(a aVar, IOException iOException) {
        if (d(aVar, iOException)) {
            this.f11356b.f11319O.j(this.a, aVar);
        }
    }

    public final boolean d(a aVar, IOException iOException) {
        byte[] bArr = c.a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            if (this.f11363i.f11351t && this.j.f11346s) {
                return false;
            }
            this.f11366m = aVar;
            this.f11367n = iOException;
            notifyAll();
            this.f11356b.h(this.a);
            return true;
        }
    }

    public final void e(a aVar) {
        if (d(aVar, null)) {
            this.f11356b.n(this.a, aVar);
        }
    }

    public final synchronized a f() {
        return this.f11366m;
    }

    public final t g() {
        synchronized (this) {
            if (!this.f11362h && !h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.j;
    }

    public final boolean h() {
        boolean z6 = (this.a & 1) == 1;
        this.f11356b.getClass();
        return true == z6;
    }

    public final synchronized boolean i() {
        if (this.f11366m != null) {
            return false;
        }
        u uVar = this.f11363i;
        if (uVar.f11351t || uVar.f11354w) {
            t tVar = this.j;
            if ((tVar.f11346s || tVar.f11348u) && this.f11362h) {
                return false;
            }
        }
        return true;
    }

    public final void j(w wVar, boolean z6) {
        boolean zI;
        i.f(wVar, "headers");
        byte[] bArr = c.a;
        synchronized (this) {
            try {
                if (this.f11362h && z6) {
                    this.f11363i.getClass();
                } else {
                    this.f11362h = true;
                    this.f11361g.add(wVar);
                }
                if (z6) {
                    this.f11363i.f11351t = true;
                }
                zI = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zI) {
            return;
        }
        this.f11356b.h(this.a);
    }

    public final synchronized void k(a aVar) {
        if (this.f11366m == null) {
            this.f11366m = aVar;
            notifyAll();
        }
    }

    public final void l() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
