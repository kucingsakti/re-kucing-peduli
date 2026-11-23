package M2;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhc;
import java.util.AbstractQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class C extends Thread {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f2884s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractQueue f2885t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2886u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ zzhc f2887v;

    /* JADX WARN: Multi-variable type inference failed */
    public C(zzhc zzhcVar, String str, BlockingQueue blockingQueue) {
        this.f2887v = zzhcVar;
        Preconditions.i(blockingQueue);
        this.f2884s = new Object();
        this.f2885t = (AbstractQueue) blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f2884s) {
            this.f2884s.notifyAll();
        }
    }

    public final void b(InterruptedException interruptedException) {
        zzfw zzfwVarI = this.f2887v.i();
        zzfwVarI.f9047A.a(interruptedException, p231y.a.c(getName(), " was interrupted"));
    }

    public final void c() {
        synchronized (this.f2887v.f9104A) {
            try {
                if (!this.f2886u) {
                    this.f2887v.f9105B.release();
                    this.f2887v.f9104A.notifyAll();
                    zzhc zzhcVar = this.f2887v;
                    if (this == zzhcVar.f9106u) {
                        zzhcVar.f9106u = null;
                    } else if (this == zzhcVar.f9107v) {
                        zzhcVar.f9107v = null;
                    } else {
                        zzhcVar.i().f9056x.b("Current scheduler thread is neither worker nor network");
                    }
                    this.f2886u = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z6 = false;
        while (!z6) {
            try {
                this.f2887v.f9105B.acquire();
                z6 = true;
            } catch (InterruptedException e10) {
                b(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                D d3 = (D) this.f2885t.poll();
                if (d3 != null) {
                    Process.setThreadPriority(d3.f2889t ? threadPriority : 10);
                    d3.run();
                } else {
                    synchronized (this.f2884s) {
                        if (this.f2885t.peek() == null) {
                            zzhc zzhcVar = this.f2887v;
                            AtomicLong atomicLong = zzhc.f9103C;
                            zzhcVar.getClass();
                            try {
                                this.f2884s.wait(30000L);
                            } catch (InterruptedException e11) {
                                b(e11);
                            }
                        }
                    }
                    synchronized (this.f2887v.f9104A) {
                        if (this.f2885t.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
