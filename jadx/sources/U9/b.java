package U9;

import G9.p;
import N9.AbstractC0342z;
import O3.y;
import S9.q;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor, Closeable {
    private volatile int _isTerminated;
    private volatile long controlState;
    private volatile long parkedWorkersStack;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f5037s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f5038t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f5039u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f5040v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f5041w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f5042x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q f5043y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5036z = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5033A = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5034B = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final y f5035C = new y("NOT_IN_STACK", 1);

    public b(int i10, int i11, long j, String str) {
        this.f5037s = i10;
        this.f5038t = i11;
        this.f5039u = j;
        this.f5040v = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(E0.a.g("Core pool size ", i10, " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(AbstractC0487g.h("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(E0.a.g("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f5041w = new e();
        this.f5042x = new e();
        this.f5043y = new q((i10 + 1) * 2);
        this.controlState = ((long) i10) << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void c(b bVar, Runnable runnable, int i10) {
        bVar.b(runnable, j.f5056g, (i10 & 4) == 0);
    }

    public final int a() {
        synchronized (this.f5043y) {
            try {
                if (f5034B.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f5033A;
                long j = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j & 2097151);
                int i11 = i10 - ((int) ((j & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f5037s) {
                    return 0;
                }
                if (i10 >= this.f5038t) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f5043y.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i12);
                this.f5043y.c(i12, aVar);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                aVar.start();
                return i13;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, p pVar, boolean z6) {
        h iVar;
        int i10;
        j.f5055f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f5048s = jNanoTime;
            iVar.f5049t = pVar;
        } else {
            iVar = new i(runnable, jNanoTime, pVar);
        }
        boolean z10 = false;
        boolean z11 = iVar.f5049t.a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5033A;
        long jAddAndGet = z11 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !p210v8.i.a(aVar.f5032z, this)) {
            aVar = null;
        }
        if (aVar != null && (i10 = aVar.f5027u) != 5 && (iVar.f5049t.a != 0 || i10 != 2)) {
            aVar.f5031y = true;
            l lVar = aVar.f5025s;
            if (z6) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f5059b.getAndSet(lVar, iVar);
                iVar = hVar == null ? null : lVar.a(hVar);
            }
        }
        if (iVar != null) {
            if (!(iVar.f5049t.a == 1 ? this.f5042x.a(iVar) : this.f5041w.a(iVar))) {
                throw new RejectedExecutionException(E0.a.l(new StringBuilder(), this.f5040v, " was terminated"));
            }
        }
        if (z6 && aVar != null) {
            z10 = true;
        }
        if (z11) {
            if (z10 || i() || h(jAddAndGet)) {
                return;
            }
            i();
            return;
        }
        if (z10 || i() || h(atomicLongFieldUpdater.get(this))) {
            return;
        }
        i();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i10;
        h hVarA;
        if (f5034B.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !p210v8.i.a(aVar.f5032z, this)) {
                aVar = null;
            }
            synchronized (this.f5043y) {
                i10 = (int) (f5033A.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object objB = this.f5043y.b(i11);
                    p210v8.i.c(objB);
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        l lVar = aVar2.f5025s;
                        e eVar = this.f5042x;
                        lVar.getClass();
                        h hVar = (h) l.f5059b.getAndSet(lVar, null);
                        if (hVar != null) {
                            eVar.a(hVar);
                        }
                        while (true) {
                            h hVarB = lVar.b();
                            if (hVarB == null) {
                                break;
                            } else {
                                eVar.a(hVarB);
                            }
                        }
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f5042x.b();
            this.f5041w.b();
            while (true) {
                if (aVar != null) {
                    hVarA = aVar.a(true);
                    if (hVarA == null) {
                        hVarA = (h) this.f5041w.d();
                        if (hVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    hVarA = (h) this.f5041w.d();
                    if (hVarA == null && (hVarA = (h) this.f5042x.d()) == null) {
                        break;
                    }
                }
                try {
                    hVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.k(5);
            }
            f5036z.set(this, 0L);
            f5033A.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    public final void g(a aVar, int i10, int i11) {
        while (true) {
            long j = f5036z.get(this);
            int i12 = (int) (2097151 & j);
            long j10 = (2097152 + j) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f5035C) {
                            i12 = -1;
                            break;
                        }
                        if (objC == null) {
                            i12 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i12 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f5036z.compareAndSet(this, j, ((long) i12) | j10)) {
                    return;
                }
            }
        }
    }

    public final boolean h(long j) {
        int i10 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f5037s;
        if (i10 < i11) {
            int iA = a();
            if (iA == 1 && i11 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        y yVar;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5036z;
            long j = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f5043y.b((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
            } else {
                long j10 = (2097152 + j) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    yVar = f5035C;
                    if (objC == yVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j10 | ((long) iB))) {
                    aVar.g(yVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f5024A.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.f5043y;
        int iA = qVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            a aVar = (a) qVar.b(i15);
            if (aVar != null) {
                l lVar = aVar.f5025s;
                lVar.getClass();
                int i16 = l.f5059b.get(lVar) != null ? (l.f5060c.get(lVar) - l.f5061d.get(lVar)) + 1 : l.f5060c.get(lVar) - l.f5061d.get(lVar);
                int iD = p239z.e.d(aVar.f5027u);
                if (iD == 0) {
                    i10++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i16);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iD == 1) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iD == 2) {
                    i12++;
                } else if (iD == 3) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i16);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iD == 4) {
                    i14++;
                }
            }
        }
        long j = f5033A.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f5040v);
        sb4.append('@');
        sb4.append(AbstractC0342z.j(this));
        sb4.append("[Pool Size {core = ");
        int i17 = this.f5037s;
        sb4.append(i17);
        sb4.append(", max = ");
        sb4.append(this.f5038t);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i10);
        sb4.append(", blocking = ");
        sb4.append(i11);
        sb4.append(", parked = ");
        sb4.append(i12);
        sb4.append(", dormant = ");
        sb4.append(i13);
        sb4.append(", terminated = ");
        sb4.append(i14);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f5041w.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f5042x.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i17 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
