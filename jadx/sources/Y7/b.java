package Y7;

import Q7.d;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f5702A = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Object f5703B = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicLong f5704s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f5705t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f5706u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5707v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AtomicReferenceArray f5708w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f5709x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AtomicReferenceArray f5710y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AtomicLong f5711z;

    public b(int i10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f5704s = atomicLong;
        this.f5711z = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i10) - 1));
        int i11 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.f5708w = atomicReferenceArray;
        this.f5707v = i11;
        this.f5705t = Math.min(iNumberOfLeadingZeros / 4, f5702A);
        this.f5710y = atomicReferenceArray;
        this.f5709x = i11;
        this.f5706u = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // Q7.d
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // Q7.d
    public final boolean isEmpty() {
        return this.f5704s.get() == this.f5711z.get();
    }

    @Override // Q7.d
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f5708w;
        AtomicLong atomicLong = this.f5704s;
        long j = atomicLong.get();
        int i10 = this.f5707v;
        int i11 = ((int) j) & i10;
        if (j < this.f5706u) {
            atomicReferenceArray.lazySet(i11, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j10 = ((long) this.f5705t) + j;
        if (atomicReferenceArray.get(((int) j10) & i10) == null) {
            this.f5706u = j10 - 1;
            atomicReferenceArray.lazySet(i11, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j11 = j + 1;
        if (atomicReferenceArray.get(((int) j11) & i10) == null) {
            atomicReferenceArray.lazySet(i11, obj);
            atomicLong.lazySet(j11);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f5708w = atomicReferenceArray2;
        this.f5706u = (j + ((long) i10)) - 1;
        atomicReferenceArray2.lazySet(i11, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i11, f5703B);
        atomicLong.lazySet(j11);
        return true;
    }

    @Override // Q7.d
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f5710y;
        AtomicLong atomicLong = this.f5711z;
        long j = atomicLong.get();
        int i10 = this.f5709x;
        int i11 = ((int) j) & i10;
        Object obj = atomicReferenceArray.get(i11);
        boolean z6 = obj == f5703B;
        if (obj != null && !z6) {
            atomicReferenceArray.lazySet(i11, null);
            atomicLong.lazySet(j + 1);
            return obj;
        }
        if (!z6) {
            return null;
        }
        int i12 = i10 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i12);
        atomicReferenceArray.lazySet(i12, null);
        this.f5710y = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i11);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i11, null);
            atomicLong.lazySet(j + 1);
        }
        return obj2;
    }
}
