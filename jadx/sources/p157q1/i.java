package p157q1;

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
import p188t1.Y;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f14397v = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Logger f14398w = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Y f14399x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f14400y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile Object f14401s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile d f14402t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile h f14403u;

    static {
        Y gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, a.PUSH_ADDITIONAL_DATA_KEY), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "u"), AtomicReferenceFieldUpdater.newUpdater(i.class, d.class, "t"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "s"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f14399x = gVar;
        if (th != null) {
            f14398w.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f14400y = new Object();
    }

    public static void b(i iVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = iVar.f14403u;
            if (f14399x.h(iVar, hVar, h.f14395c)) {
                while (hVar != null) {
                    Thread thread = hVar.a;
                    if (thread != null) {
                        hVar.a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f14396b;
                }
                do {
                    dVar = iVar.f14402t;
                } while (!f14399x.f(iVar, dVar, d.f14385d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f14387c;
                    dVar3.f14387c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f14387c;
                    Runnable runnable = dVar2.a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        iVar = fVar.f14393s;
                        if (iVar.f14401s == fVar) {
                            if (f14399x.g(iVar, fVar, e(fVar.f14394t))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, dVar2.f14386b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f14398w.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f14382b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).a);
        }
        if (obj == f14400y) {
            return null;
        }
        return obj;
    }

    public static Object e(d dVar) {
        if (dVar instanceof i) {
            Object obj = ((i) dVar).f14401s;
            if (!(obj instanceof a)) {
                return obj;
            }
            a aVar = (a) obj;
            if (aVar.a) {
                return aVar.f14382b != null ? new a(false, aVar.f14382b) : a.f14381d;
            }
            return obj;
        }
        boolean zIsCancelled = dVar.isCancelled();
        if ((!f14397v) && zIsCancelled) {
            return a.f14381d;
        }
        try {
            Object objG = g(dVar);
            return objG == null ? f14400y : objG;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new a(false, e10);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + dVar, e10));
        } catch (ExecutionException e11) {
            return new c(e11.getCause());
        } catch (Throwable th) {
            return new c(th);
        }
    }

    public static Object g(d dVar) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = dVar.get();
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

    public final void a(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
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
    public final boolean cancel(boolean z6) {
        a aVar;
        Object obj = this.f14401s;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (f14397v) {
            aVar = new a(z6, new CancellationException("Future.cancel() was called."));
        } else {
            aVar = z6 ? a.f14380c : a.f14381d;
        }
        i iVar = this;
        boolean z10 = false;
        while (true) {
            if (f14399x.g(iVar, obj, aVar)) {
                b(iVar);
                if (!(obj instanceof f)) {
                    break;
                }
                d dVar = ((f) obj).f14394t;
                if (!(dVar instanceof i)) {
                    dVar.cancel(z6);
                    break;
                }
                iVar = (i) dVar;
                obj = iVar.f14401s;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z10 = true;
            } else {
                obj = iVar.f14401s;
                if (!(obj instanceof f)) {
                    return z10;
                }
            }
        }
        return true;
    }

    @Override // C3.d
    public final void f(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f14402t;
        d dVar2 = d.f14385d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f14387c = dVar;
                if (f14399x.f(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f14402t;
                }
            } while (dVar != dVar2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z6;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f14401s;
        if ((obj != null) && (!(obj instanceof f))) {
            return d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f14403u;
            h hVar2 = h.f14395c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                z6 = true;
                while (true) {
                    Y y6 = f14399x;
                    y6.r(hVar3, hVar);
                    if (y6.h(this, hVar, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f14401s;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(hVar3);
                        break;
                    }
                    hVar = this.f14403u;
                    if (hVar == hVar2) {
                    }
                }
            }
            return d(this.f14401s);
        }
        z6 = true;
        while (nanos > 0) {
            Object obj3 = this.f14401s;
            if ((obj3 != null ? z6 : false) && (!(obj3 instanceof f))) {
                return d(obj3);
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
            String strC2 = p231y.a.c(strC, " (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z10 = (jConvert == 0 || nanos2 > 1000) ? z6 : false;
            if (jConvert > 0) {
                String strC3 = strC2 + jConvert + " " + lowerCase;
                if (z10) {
                    strC3 = p231y.a.c(strC3, ",");
                }
                strC2 = p231y.a.c(strC3, " ");
            }
            if (z10) {
                strC2 = strC2 + nanos2 + " nanoseconds ";
            }
            strC = p231y.a.c(strC2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(p231y.a.c(strC, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strC + " for " + string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.f14401s;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            d dVar = ((f) obj).f14394t;
            return E0.a.l(sb, dVar == this ? "this future" : String.valueOf(dVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(h hVar) {
        hVar.a = null;
        while (true) {
            h hVar2 = this.f14403u;
            if (hVar2 == h.f14395c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f14396b;
                if (hVar2.a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f14396b = hVar4;
                    if (hVar3.a == null) {
                    }
                } else if (!f14399x.h(this, hVar2, hVar4)) {
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14401s instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f14401s;
        return (!(obj instanceof f)) & (obj != null);
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f14401s instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e10) {
                strH = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strH);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f14401s;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return d(obj2);
            }
            h hVar = this.f14403u;
            h hVar2 = h.f14395c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    Y y6 = f14399x;
                    y6.r(hVar3, hVar);
                    if (y6.h(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f14401s;
                            } else {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return d(obj);
                    }
                    hVar = this.f14403u;
                } while (hVar != hVar2);
            }
            return d(this.f14401s);
        }
        throw new InterruptedException();
    }
}
