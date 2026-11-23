package S9;

import N9.n0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends d implements n0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4576v = AtomicIntegerFieldUpdater.newUpdater(s.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f4577u;

    public s(long j, s sVar, int i10) {
        super(sVar);
        this.f4577u = j;
        this.cleanedAndPointers = i10 << 16;
    }

    @Override // S9.d
    public final boolean c() {
        return f4576v.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f4576v.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i10, p123m8.i iVar);

    public final void h() {
        if (f4576v.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f4576v;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
