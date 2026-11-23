package p020ba;

import X9.E;
import X9.G;
import X9.InterfaceC0464j;
import X9.InterfaceC0465k;
import X9.L;
import Y9.c;
import Z9.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o1.m;
import p030ca.a;
import p030ca.d;
import p030ca.f;
import p068ga.n;
import p086i8.q;
import p140o4.r;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC0464j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public r f7380A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f7381B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f7382C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f7383D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public volatile boolean f7384E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public volatile r f7385F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public volatile k f7386G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final E f7387s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final G f7388t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l f7389u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f7390v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f7391w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f7392x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f7393y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k f7394z;

    public i(E e10, G g8) {
        p210v8.i.f(e10, "client");
        p210v8.i.f(g8, "originalRequest");
        this.f7387s = e10;
        this.f7388t = g8;
        this.f7389u = (l) e10.f5490t.f3811t;
        e10.f5493w.getClass();
        h hVar = new h(this, 0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hVar.g(0);
        this.f7390v = hVar;
        this.f7391w = new AtomicBoolean();
        this.f7383D = true;
    }

    public static final String a(i iVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(iVar.f7384E ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(iVar.f7388t.a.g());
        return sb.toString();
    }

    public final void c(k kVar) {
        byte[] bArr = c.a;
        if (this.f7394z != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f7394z = kVar;
        kVar.f7408p.add(new g(this, this.f7392x));
    }

    public final void cancel() {
        Socket socket;
        if (this.f7384E) {
            return;
        }
        this.f7384E = true;
        r rVar = this.f7385F;
        if (rVar != null) {
            ((d) rVar.f13784v).cancel();
        }
        k kVar = this.f7386G;
        if (kVar == null || (socket = kVar.f7396c) == null) {
            return;
        }
        c.e(socket);
    }

    public final Object clone() {
        return new i(this.f7387s, this.f7388t);
    }

    public final IOException d(IOException iOException) {
        IOException interruptedIOException;
        Socket socketL;
        byte[] bArr = c.a;
        k kVar = this.f7394z;
        if (kVar != null) {
            synchronized (kVar) {
                socketL = l();
            }
            if (this.f7394z == null) {
                if (socketL != null) {
                    c.e(socketL);
                }
            } else if (socketL != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f7390v.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            p210v8.i.c(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final void e(InterfaceC0465k interfaceC0465k) {
        f fVar;
        if (!this.f7391w.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.a;
        this.f7392x = n.a.g();
        m mVar = this.f7387s.f5489s;
        f fVar2 = new f(this, interfaceC0465k);
        mVar.getClass();
        synchronized (mVar) {
            ((ArrayDeque) mVar.f13642t).add(fVar2);
            String str = this.f7388t.a.f5658d;
            Iterator it = ((ArrayDeque) mVar.f13643u).iterator();
            do {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) mVar.f13642t).iterator();
                    do {
                        if (!it2.hasNext()) {
                            fVar = null;
                            break;
                        }
                        fVar = (f) it2.next();
                    } while (!p210v8.i.a(fVar.f7377u.f7388t.a.f5658d, str));
                } else {
                    fVar = (f) it.next();
                }
            } while (!p210v8.i.a(fVar.f7377u.f7388t.a.f5658d, str));
            if (fVar != null) {
                fVar2.f7376t = fVar.f7376t;
            }
        }
        mVar.j();
    }

    public final L f() {
        if (!this.f7391w.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f7390v.h();
        n nVar = n.a;
        this.f7392x = n.a.g();
        try {
            m mVar = this.f7387s.f5489s;
            synchronized (mVar) {
                ((ArrayDeque) mVar.f13644v).add(this);
            }
            L lI = i();
            m mVar2 = this.f7387s.f5489s;
            mVar2.getClass();
            mVar2.c((ArrayDeque) mVar2.f13644v, this);
            return lI;
        } catch (Throwable th) {
            m mVar3 = this.f7387s.f5489s;
            mVar3.getClass();
            mVar3.c((ArrayDeque) mVar3.f13644v, this);
            throw th;
        }
    }

    public final void h(boolean z6) {
        r rVar;
        synchronized (this) {
            if (!this.f7383D) {
                throw new IllegalStateException("released");
            }
        }
        if (z6 && (rVar = this.f7385F) != null) {
            ((d) rVar.f13784v).cancel();
            ((i) rVar.f13782t).j(rVar, true, true, null);
        }
        this.f7380A = null;
    }

    public final L i() {
        ArrayList arrayList = new ArrayList();
        q.J(arrayList, this.f7387s.f5491u);
        arrayList.add(new a(this.f7387s));
        arrayList.add(new a(this.f7387s.f5472B));
        arrayList.add(new b(this.f7387s.f5473C));
        arrayList.add(a.a);
        q.J(arrayList, this.f7387s.f5492v);
        arrayList.add(new p030ca.b());
        G g8 = this.f7388t;
        E e10 = this.f7387s;
        try {
            try {
                L lB = new f(this, arrayList, 0, null, g8, e10.f5485O, e10.P, e10.f5486Q).b(this.f7388t);
                if (this.f7384E) {
                    c.d(lB);
                    throw new IOException("Canceled");
                }
                k(null);
                return lB;
            } catch (IOException e11) {
                IOException iOExceptionK = k(e11);
                if (iOExceptionK == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionK;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                k(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final IOException j(r rVar, boolean z6, boolean z10, IOException iOException) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        p210v8.i.f(rVar, "exchange");
        if (rVar.equals(this.f7385F)) {
            synchronized (this) {
                z11 = false;
                if (z6) {
                    try {
                        if (this.f7381B) {
                            if (z6) {
                                this.f7381B = false;
                            }
                            if (z10) {
                                this.f7382C = false;
                            }
                            z13 = this.f7381B;
                            if (z13) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (!z13) {
                                z11 = true;
                            }
                            z12 = z11;
                            z11 = z14;
                        } else if (z10 || !this.f7382C) {
                            z12 = false;
                        } else {
                            if (z6) {
                                this.f7381B = false;
                            }
                            if (z10) {
                                this.f7382C = false;
                            }
                            z13 = this.f7381B;
                            if (z13 || this.f7382C) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            if (!z13 && !this.f7382C && !this.f7383D) {
                                z11 = true;
                            }
                            z12 = z11;
                            z11 = z14;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z10) {
                    }
                    z12 = false;
                }
            }
            if (z11) {
                this.f7385F = null;
                k kVar = this.f7394z;
                if (kVar != null) {
                    kVar.h();
                }
            }
            if (z12) {
                return d(iOException);
            }
        }
        return iOException;
    }

    public final IOException k(IOException iOException) {
        boolean z6;
        synchronized (this) {
            z6 = false;
            if (this.f7383D) {
                this.f7383D = false;
                if (!this.f7381B && !this.f7382C) {
                    z6 = true;
                }
            }
        }
        return z6 ? d(iOException) : iOException;
    }

    public final Socket l() {
        k kVar = this.f7394z;
        p210v8.i.c(kVar);
        byte[] bArr = c.a;
        ArrayList arrayList = kVar.f7408p;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (p210v8.i.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i10);
        this.f7394z = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        kVar.f7409q = System.nanoTime();
        l lVar = this.f7389u;
        lVar.getClass();
        byte[] bArr2 = c.a;
        boolean z6 = kVar.j;
        p010aa.b bVar = lVar.f7410b;
        if (!z6) {
            bVar.c(lVar.f7411c, 0L);
            return null;
        }
        kVar.j = true;
        ConcurrentLinkedQueue concurrentLinkedQueue = lVar.f7412d;
        concurrentLinkedQueue.remove(kVar);
        if (concurrentLinkedQueue.isEmpty()) {
            bVar.a();
        }
        Socket socket = kVar.f7397d;
        p210v8.i.c(socket);
        return socket;
    }
}
