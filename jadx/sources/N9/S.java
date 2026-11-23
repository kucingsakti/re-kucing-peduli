package N9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public abstract class S extends T implements E {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3426x = AtomicReferenceFieldUpdater.newUpdater(S.class, Object.class, "_queue");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3427y = AtomicReferenceFieldUpdater.newUpdater(S.class, Object.class, "_delayed");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3428z = AtomicIntegerFieldUpdater.newUpdater(S.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // N9.T
    public final long G() {
        P pB;
        P pD;
        if (!H()) {
            Q q10 = (Q) f3427y.get(this);
            Runnable runnable = null;
            if (q10 != null && S9.w.f4582b.get(q10) != 0) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (q10) {
                        try {
                            P[] pArr = q10.a;
                            P p10 = pArr != null ? pArr[0] : null;
                            if (p10 == null) {
                                pD = null;
                            } else {
                                pD = ((jNanoTime - p10.f3423s) > 0L ? 1 : ((jNanoTime - p10.f3423s) == 0L ? 0 : -1)) >= 0 ? T(p10) : false ? q10.d(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (pD != null);
            }
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3426x;
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (obj instanceof S9.m) {
                    S9.m mVar = (S9.m) obj;
                    Object objD = mVar.d();
                    if (objD != S9.m.f4571g) {
                        runnable = (Runnable) objD;
                        break;
                    }
                    S9.m mVarC = mVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == AbstractC0342z.f3497c) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            runnable = (Runnable) obj;
                            break loop1;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            p086i8.h hVar = this.f3432v;
            if (((hVar == null || hVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f3426x.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof S9.m) {
                        long j = S9.m.f4570f.get((S9.m) obj2);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                        }
                    } else if (obj2 == AbstractC0342z.f3497c) {
                        return Long.MAX_VALUE;
                    }
                }
                Q q11 = (Q) f3427y.get(this);
                if (q11 != null && (pB = q11.b()) != null) {
                    long jNanoTime2 = pB.f3423s - System.nanoTime();
                    if (jNanoTime2 >= 0) {
                        return jNanoTime2;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void K(Runnable runnable) {
        if (!T(runnable)) {
            A.f3407A.K(runnable);
            return;
        }
        Thread threadB = B();
        if (Thread.currentThread() != threadB) {
            LockSupport.unpark(threadB);
        }
    }

    public final boolean T(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3426x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f3428z.get(this) != 0) {
                break;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof S9.m)) {
                if (obj == AbstractC0342z.f3497c) {
                    break;
                }
                S9.m mVar = new S9.m(8, true);
                mVar.a((Runnable) obj);
                mVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            S9.m mVar2 = (S9.m) obj;
            int iA = mVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                S9.m mVarC = mVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                break;
            }
        }
        return false;
    }

    public final boolean W() {
        Q q10;
        p086i8.h hVar = this.f3432v;
        if (!(hVar != null ? hVar.isEmpty() : true) || ((q10 = (Q) f3427y.get(this)) != null && S9.w.f4582b.get(q10) != 0)) {
            return false;
        }
        Object obj = f3426x.get(this);
        if (obj != null) {
            if (obj instanceof S9.m) {
                long j = S9.m.f4570f.get((S9.m) obj);
                return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
            }
            if (obj != AbstractC0342z.f3497c) {
                return false;
            }
        }
        return true;
    }

    public final void X(long j, P p10) {
        int iM;
        Thread threadB;
        boolean z6 = f3428z.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3427y;
        if (z6) {
            iM = 1;
        } else {
            Q q10 = (Q) atomicReferenceFieldUpdater.get(this);
            if (q10 == null) {
                Q q11 = new Q();
                q11.f3425c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, q11) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                p210v8.i.c(obj);
                q10 = (Q) obj;
            }
            iM = p10.m(j, q10, this);
        }
        if (iM != 0) {
            if (iM == 1) {
                J(j, p10);
                return;
            } else {
                if (iM != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        Q q12 = (Q) atomicReferenceFieldUpdater.get(this);
        if ((q12 != null ? q12.b() : null) != p10 || Thread.currentThread() == (threadB = B())) {
            return;
        }
        LockSupport.unpark(threadB);
    }

    @Override // N9.E
    public final void b(long j, C0324g c0324g) {
        long j10 = 0;
        if (j > 0) {
            j10 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j10 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            N n10 = new N(this, j10 + jNanoTime, c0324g);
            X(jNanoTime, n10);
            c0324g.y(new C0322e(n10, 1));
        }
    }

    public K c(long j, u0 u0Var, p123m8.i iVar) {
        return B.a.c(j, u0Var, iVar);
    }

    @Override // N9.AbstractC0337u
    public final void g(p123m8.i iVar, Runnable runnable) {
        K(runnable);
    }

    @Override // N9.T
    public void shutdown() {
        P pD;
        s0.a.set(null);
        f3428z.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3426x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            O3.y yVar = AbstractC0342z.f3497c;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, yVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof S9.m) {
                ((S9.m) obj).b();
                break;
            } else {
                if (obj == yVar) {
                    break;
                }
                S9.m mVar = new S9.m(8, true);
                mVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (G() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            Q q10 = (Q) f3427y.get(this);
            if (q10 == null) {
                return;
            }
            synchronized (q10) {
                pD = S9.w.f4582b.get(q10) > 0 ? q10.d(0) : null;
            }
            if (pD == null) {
                return;
            } else {
                J(jNanoTime, pD);
            }
        }
    }
}
