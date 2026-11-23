package S9;

import N9.AbstractC0337u;
import N9.B;
import N9.C0324g;
import N9.E;
import N9.K;
import N9.u0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0337u implements E {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4560y = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers");
    private volatile int runningWorkers;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final U9.k f4561t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f4562u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ E f4563v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f4564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f4565x;

    /* JADX WARN: Multi-variable type inference failed */
    public h(U9.k kVar, int i10) {
        this.f4561t = kVar;
        this.f4562u = i10;
        E e10 = kVar instanceof E ? (E) kVar : null;
        this.f4563v = e10 == null ? B.a : e10;
        this.f4564w = new k();
        this.f4565x = new Object();
    }

    public final boolean A() {
        synchronized (this.f4565x) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4560y;
            if (atomicIntegerFieldUpdater.get(this) >= this.f4562u) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // N9.E
    public final void b(long j, C0324g c0324g) {
        this.f4563v.b(j, c0324g);
    }

    @Override // N9.E
    public final K c(long j, u0 u0Var, p123m8.i iVar) {
        return this.f4563v.c(j, u0Var, iVar);
    }

    @Override // N9.AbstractC0337u
    public final void g(p123m8.i iVar, Runnable runnable) {
        Runnable runnableT;
        this.f4564w.a(runnable);
        if (f4560y.get(this) >= this.f4562u || !A() || (runnableT = t()) == null) {
            return;
        }
        this.f4561t.g(this, new P2.g((Object) this, (Object) runnableT, 3, false));
    }

    @Override // N9.AbstractC0337u
    public final void n(p123m8.i iVar, Runnable runnable) {
        Runnable runnableT;
        this.f4564w.a(runnable);
        if (f4560y.get(this) >= this.f4562u || !A() || (runnableT = t()) == null) {
            return;
        }
        this.f4561t.n(this, new P2.g((Object) this, (Object) runnableT, 3, false));
    }

    public final Runnable t() {
        while (true) {
            Runnable runnable = (Runnable) this.f4564w.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f4565x) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4560y;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f4564w.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
