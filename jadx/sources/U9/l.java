package U9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5059b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5060c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5061d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5062e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5060c;
        if (atomicIntegerFieldUpdater.get(this) - f5061d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f5049t.a == 1) {
            f5062e.incrementAndGet(this);
        }
        int i10 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i10) == null) {
                atomicReferenceArray.lazySet(i10, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final h b() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5061d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f5060c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.a.getAndSet(i11, null)) != null) {
                if (hVar.f5049t.a == 1) {
                    f5062e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h c(int i10, boolean z6) {
        int i11 = i10 & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        h hVar = (h) atomicReferenceArray.get(i11);
        if (hVar != null) {
            if ((hVar.f5049t.a == 1) == z6) {
                while (!atomicReferenceArray.compareAndSet(i11, hVar, null)) {
                    if (atomicReferenceArray.get(i11) != hVar) {
                    }
                }
                if (z6) {
                    f5062e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
