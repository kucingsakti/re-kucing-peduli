package ma;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final s a = new s(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f13222c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f13221b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f13222c = atomicReferenceArr;
    }

    public static final void a(s sVar) {
        p210v8.i.f(sVar, "segment");
        if (sVar.f13219f != null || sVar.f13220g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (sVar.f13217d) {
            return;
        }
        AtomicReference atomicReference = f13222c[(int) (Thread.currentThread().getId() & (((long) f13221b) - 1))];
        s sVar2 = (s) atomicReference.get();
        if (sVar2 == a) {
            return;
        }
        int i10 = sVar2 == null ? 0 : sVar2.f13216c;
        if (i10 >= 65536) {
            return;
        }
        sVar.f13219f = sVar2;
        sVar.f13215b = 0;
        sVar.f13216c = i10 + 8192;
        while (!atomicReference.compareAndSet(sVar2, sVar)) {
            if (atomicReference.get() != sVar2) {
                sVar.f13219f = null;
                return;
            }
        }
    }

    public static final s b() {
        AtomicReference atomicReference = f13222c[(int) (Thread.currentThread().getId() & (((long) f13221b) - 1))];
        s sVar = a;
        s sVar2 = (s) atomicReference.getAndSet(sVar);
        if (sVar2 == sVar) {
            return new s();
        }
        if (sVar2 == null) {
            atomicReference.set(null);
            return new s();
        }
        atomicReference.set(sVar2.f13219f);
        sVar2.f13219f = null;
        sVar2.f13216c = 0;
        return sVar2;
    }
}
