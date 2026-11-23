package p231y;

import C3.d;
import R5.a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f15817v = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Logger f15818w = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final com.bumptech.glide.d f15819x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f15820y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile Object f15821s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile d f15822t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile g f15823u;

    static {
        com.bumptech.glide.d fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, a.PUSH_ADDITIONAL_DATA_KEY), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "u"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "t"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "s"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f15819x = fVar;
        if (th != null) {
            f15818w.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f15820y = new Object();
    }

    public static void i(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f15823u;
        } while (!f15819x.e(hVar, gVar, g.f15815c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.a;
            if (thread != null) {
                gVar.a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f15816b;
        }
        hVar.h();
        do {
            dVar2 = hVar.f15822t;
        } while (!f15819x.c(hVar, dVar2, d.f15808d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f15810c;
            dVar.f15810c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f15810c;
            j(dVar3.a, dVar3.f15809b);
            dVar3 = dVar4;
        }
    }

    public static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f15818w.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object k(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            CancellationException cancellationException = ((b) obj).f15807b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).a);
        }
        if (obj == f15820y) {
            return null;
        }
        return obj;
    }

    public static Object l(h hVar) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        b bVar;
        Object obj = this.f15821s;
        if (obj != null) {
            return false;
        }
        if (f15817v) {
            bVar = new b(z6, new CancellationException("Future.cancel() was called."));
        } else {
            bVar = z6 ? b.f15805c : b.f15806d;
        }
        if (!f15819x.d(this, obj, bVar)) {
            return false;
        }
        i(this);
        return true;
    }

    @Override // C3.d
    public final void f(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f15822t;
        d dVar2 = d.f15808d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f15810c = dVar;
                if (f15819x.c(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f15822t;
                }
            } while (dVar != dVar2);
        }
        j(runnable, executor);
    }

    public final void g(StringBuilder sb) {
        try {
            Object objL = l(this);
            sb.append("SUCCESS, result=[");
            sb.append(objL == this ? "this future" : String.valueOf(objL));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f15821s;
        if (obj != null) {
            return k(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar = this.f15823u;
            g gVar2 = g.f15815c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                while (true) {
                    com.bumptech.glide.d dVar = f15819x;
                    dVar.y(gVar3, gVar);
                    if (dVar.e(this, gVar, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                n(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f15821s;
                            if (obj2 != null) {
                                return k(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        n(gVar3);
                        break;
                    }
                    gVar = this.f15823u;
                    if (gVar == gVar2) {
                    }
                }
            }
            return k(this.f15821s);
        }
        while (nanos > 0) {
            Object obj3 = this.f15821s;
            if (obj3 != null) {
                return k(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strC = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strC2 = a.c(strC, " (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z6 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strC3 = strC2 + jConvert + " " + lowerCase;
                if (z6) {
                    strC3 = a.c(strC3, ",");
                }
                strC2 = a.c(strC3, " ");
            }
            if (z6) {
                strC2 = strC2 + nanos2 + " nanoseconds ";
            }
            strC = a.c(strC2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(a.c(strC, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strC + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15821s instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15821s != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String m() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void n(g gVar) {
        gVar.a = null;
        while (true) {
            g gVar2 = this.f15823u;
            if (gVar2 == g.f15815c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f15816b;
                if (gVar2.a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f15816b = gVar4;
                    if (gVar3.a == null) {
                    }
                } else if (!f15819x.e(this, gVar2, gVar4)) {
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    public boolean o(Object obj) {
        if (obj == null) {
            obj = f15820y;
        }
        if (!f15819x.d(this, null, obj)) {
            return false;
        }
        i(this);
        return true;
    }

    public boolean p(Throwable th) {
        th.getClass();
        if (!f15819x.d(this, null, new c(th))) {
            return false;
        }
        i(this);
        return true;
    }

    public final String toString() {
        String strM;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f15821s instanceof b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            g(sb);
        } else {
            try {
                strM = m();
            } catch (RuntimeException e10) {
                strM = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strM != null && !strM.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strM);
                sb.append("]");
            } else if (isDone()) {
                g(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void h() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f15821s;
            if (obj2 != null) {
                return k(obj2);
            }
            g gVar = this.f15823u;
            g gVar2 = g.f15815c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    com.bumptech.glide.d dVar = f15819x;
                    dVar.y(gVar3, gVar);
                    if (dVar.e(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f15821s;
                            } else {
                                n(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return k(obj);
                    }
                    gVar = this.f15823u;
                } while (gVar != gVar2);
            }
            return k(this.f15821s);
        }
        throw new InterruptedException();
    }
}
