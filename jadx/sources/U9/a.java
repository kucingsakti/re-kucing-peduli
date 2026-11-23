package U9;

import O3.y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5024A = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f5025s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f5026t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5027u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f5028v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f5029w;
    private volatile int workerCtl;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5030x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5031y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ b f5032z;

    public a(b bVar, int i10) {
        this.f5032z = bVar;
        setDaemon(true);
        this.f5025s = new l();
        this.f5026t = new t();
        this.f5027u = 4;
        this.nextParkedWorker = b.f5035C;
        this.f5030x = p246z8.d.f16317s.b();
        f(i10);
    }

    public final h a(boolean z6) {
        h hVarE;
        h hVarE2;
        b bVar;
        long j;
        int i10 = this.f5027u;
        h hVar = null;
        l lVar = this.f5025s;
        b bVar2 = this.f5032z;
        if (i10 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f5033A;
            do {
                bVar = this.f5032z;
                j = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    lVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f5059b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 == null || hVar2.f5049t.a != 1) {
                            int i11 = l.f5061d.get(lVar);
                            int i12 = l.f5060c.get(lVar);
                            while (i11 != i12 && l.f5062e.get(lVar) != 0) {
                                i12--;
                                h hVarC = lVar.c(i12, true);
                                if (hVarC != null) {
                                    hVar = hVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                hVar = hVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(lVar) == hVar2);
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f5042x.d();
                    return hVar3 == null ? m(1) : hVar3;
                }
            } while (!b.f5033A.compareAndSet(bVar, j, j - 4398046511104L));
            this.f5027u = 1;
        }
        if (z6) {
            boolean z10 = d(bVar2.f5037s * 2) == 0;
            if (z10 && (hVarE2 = e()) != null) {
                return hVarE2;
            }
            lVar.getClass();
            h hVarB = (h) l.f5059b.getAndSet(lVar, null);
            if (hVarB == null) {
                hVarB = lVar.b();
            }
            if (hVarB != null) {
                return hVarB;
            }
            if (!z10 && (hVarE = e()) != null) {
                return hVarE;
            }
        } else {
            h hVarE3 = e();
            if (hVarE3 != null) {
                return hVarE3;
            }
        }
        return m(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i10) {
        int i11 = this.f5030x;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f5030x = i14;
        int i15 = i10 - 1;
        return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
    }

    public final h e() {
        int iD = d(2);
        b bVar = this.f5032z;
        if (iD == 0) {
            h hVar = (h) bVar.f5041w.d();
            return hVar != null ? hVar : (h) bVar.f5042x.d();
        }
        h hVar2 = (h) bVar.f5042x.d();
        return hVar2 != null ? hVar2 : (h) bVar.f5041w.d();
    }

    public final void f(int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5032z.f5040v);
        sb.append("-worker-");
        sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
        setName(sb.toString());
        this.indexInArray = i10;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean k(int i10) {
        int i11 = this.f5027u;
        boolean z6 = i11 == 1;
        if (z6) {
            b.f5033A.addAndGet(this.f5032z, 4398046511104L);
        }
        if (i11 != i10) {
            this.f5027u = i10;
        }
        return z6;
    }

    public final h m(int i10) {
        int i11;
        long j;
        h hVarC;
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f5033A;
        b bVar = this.f5032z;
        int i12 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar = null;
        if (i12 < 2) {
            return null;
        }
        int iD = d(i12);
        int i13 = 0;
        long jMin = Long.MAX_VALUE;
        while (i13 < i12) {
            int i14 = iD + 1;
            if (i14 > i12) {
                i14 = 1;
            }
            a aVar = (a) bVar.f5043y.b(i14);
            if (aVar == null || aVar == this) {
                i11 = i14;
            } else {
                l lVar = aVar.f5025s;
                if (i10 != 3) {
                    lVar.getClass();
                    int i15 = l.f5061d.get(lVar);
                    int i16 = l.f5060c.get(lVar);
                    boolean z6 = i10 == 1;
                    while (true) {
                        if (i15 != i16) {
                            j = 0;
                            if (!z6 || l.f5062e.get(lVar) != 0) {
                                int i17 = i15 + 1;
                                hVarC = lVar.c(i15, z6);
                                if (hVarC != null) {
                                    break;
                                }
                                i15 = i17;
                            }
                        } else {
                            j = 0;
                        }
                        hVarC = hVar;
                        break;
                    }
                } else {
                    hVarC = lVar.b();
                    j = 0;
                }
                t tVar = this.f5026t;
                if (hVarC == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f5059b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 == null) {
                            j10 = -1;
                        } else {
                            j10 = -1;
                            if (((hVar2.f5049t.a == 1 ? 1 : 2) & i10) != 0) {
                                j.f5055f.getClass();
                                i11 = i14;
                                long jNanoTime = System.nanoTime() - hVar2.f5048s;
                                long j12 = j.f5051b;
                                if (jNanoTime < j12) {
                                    j11 = j12 - jNanoTime;
                                    hVar = null;
                                    break;
                                }
                                do {
                                    hVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                        tVar.f15466s = hVar2;
                                        j11 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(lVar) == hVar2);
                                i14 = i11;
                                hVar = null;
                            }
                        }
                        j11 = -2;
                        i11 = i14;
                        break;
                    }
                } else {
                    tVar.f15466s = hVarC;
                    i11 = i14;
                    j11 = -1;
                    j10 = -1;
                }
                if (j11 == j10) {
                    h hVar3 = (h) tVar.f15466s;
                    tVar.f15466s = hVar;
                    return hVar3;
                }
                if (j11 > j) {
                    jMin = Math.min(jMin, j11);
                }
            }
            i13++;
            iD = i11;
            hVar = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f5029w = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        int i10;
        loop0: while (true) {
            boolean z6 = false;
            while (true) {
                b bVar = this.f5032z;
                bVar.getClass();
                if (b.f5034B.get(bVar) != 0 || this.f5027u == 5) {
                    break loop0;
                }
                h hVarA = a(this.f5031y);
                if (hVarA == null) {
                    this.f5031y = false;
                    if (this.f5029w == 0) {
                        Object obj = this.nextParkedWorker;
                        y yVar = b.f5035C;
                        long j10 = 2097151;
                        if (obj != yVar) {
                            f5024A.set(this, -1);
                            while (this.nextParkedWorker != b.f5035C) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5024A;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                b bVar2 = this.f5032z;
                                bVar2.getClass();
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f5034B;
                                if (atomicIntegerFieldUpdater2.get(bVar2) != 0 || this.f5027u == 5) {
                                    break;
                                }
                                k(3);
                                Thread.interrupted();
                                if (this.f5028v == 0) {
                                    this.f5028v = System.nanoTime() + this.f5032z.f5039u;
                                }
                                LockSupport.parkNanos(this.f5032z.f5039u);
                                if (System.nanoTime() - this.f5028v >= 0) {
                                    this.f5028v = 0L;
                                    b bVar3 = this.f5032z;
                                    synchronized (bVar3.f5043y) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(bVar3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f5033A;
                                                if (((int) (atomicLongFieldUpdater2.get(bVar3) & j10)) > bVar3.f5037s) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i11 = this.indexInArray;
                                                        f(0);
                                                        bVar3.g(this, i11, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar3) & j10);
                                                        if (andDecrement != i11) {
                                                            Object objB = bVar3.f5043y.b(andDecrement);
                                                            p210v8.i.c(objB);
                                                            a aVar = (a) objB;
                                                            bVar3.f5043y.c(i11, aVar);
                                                            aVar.f(i11);
                                                            bVar3.g(aVar, andDecrement, i11);
                                                        }
                                                        bVar3.f5043y.c(andDecrement, null);
                                                        this.f5027u = 5;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                j10 = j10;
                            }
                        } else {
                            b bVar4 = this.f5032z;
                            bVar4.getClass();
                            if (this.nextParkedWorker == yVar) {
                                do {
                                    atomicLongFieldUpdater = b.f5036z;
                                    j = atomicLongFieldUpdater.get(bVar4);
                                    i10 = this.indexInArray;
                                    this.nextParkedWorker = bVar4.f5043y.b((int) (j & 2097151));
                                } while (!atomicLongFieldUpdater.compareAndSet(bVar4, j, ((j + 2097152) & (-2097152)) | ((long) i10)));
                            }
                        }
                    } else {
                        if (z6) {
                            k(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f5029w);
                            this.f5029w = 0L;
                            break;
                        }
                        z6 = true;
                    }
                } else {
                    this.f5029w = 0L;
                    int i12 = hVarA.f5049t.a;
                    this.f5028v = 0L;
                    if (this.f5027u == 3) {
                        this.f5027u = 2;
                    }
                    b bVar5 = this.f5032z;
                    if (i12 != 0 && k(2) && !bVar5.i() && !bVar5.h(b.f5033A.get(bVar5))) {
                        bVar5.i();
                    }
                    bVar5.getClass();
                    try {
                        hVarA.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread = Thread.currentThread();
                        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                    }
                    if (i12 != 0) {
                        b.f5033A.addAndGet(bVar5, -2097152L);
                        if (this.f5027u == 5) {
                            break;
                        }
                        this.f5027u = 4;
                        break;
                    }
                    break;
                }
            }
        }
        k(5);
    }
}
