package N9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class F extends S9.r {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3411w = AtomicIntegerFieldUpdater.newUpdater(F.class, "_decision");
    private volatile int _decision;

    @Override // S9.r, N9.k0
    public final void d(Object obj) {
        e(obj);
    }

    @Override // S9.r, N9.k0
    public final void e(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f3411w;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                S9.a.g(AbstractC0342z.o(obj), qa.b.q(this.f4575v));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
