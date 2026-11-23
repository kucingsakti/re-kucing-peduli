package S9;

import O3.y;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4569e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4570f = AtomicLongFieldUpdater.newUpdater(m.class, "_state");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y f4571g = new y("REMOVE_FROZEN", 1);
    private volatile Object _next;
    private volatile long _state;
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f4574d;

    public m(int i10, boolean z6) {
        this.a = i10;
        this.f4572b = z6;
        int i11 = i10 - 1;
        this.f4573c = i11;
        this.f4574d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4570f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i10 = (int) (1073741823 & j);
            int i11 = (int) ((1152921503533105152L & j) >> 30);
            int i12 = this.f4573c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f4574d;
            if (!this.f4572b && atomicReferenceArray.get(i11 & i12) != null) {
                int i13 = this.a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i11 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i11 & i12, runnable);
                m mVarC = this;
                while ((atomicLongFieldUpdater.get(mVarC) & 1152921504606846976L) != 0) {
                    mVarC = mVarC.c();
                    AtomicReferenceArray atomicReferenceArray2 = mVarC.f4574d;
                    int i14 = mVarC.f4573c & i11;
                    Object obj = atomicReferenceArray2.get(i14);
                    if ((obj instanceof l) && ((l) obj).a == i11) {
                        atomicReferenceArray2.set(i14, runnable);
                    } else {
                        mVarC = null;
                    }
                    if (mVarC == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f4570f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        m mVar;
        while (true) {
            atomicLongFieldUpdater = f4570f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                mVar = this;
                break;
            }
            long j10 = 1152921504606846976L | j;
            mVar = this;
            if (atomicLongFieldUpdater.compareAndSet(mVar, j, j10)) {
                j = j10;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4569e;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar2 != null) {
                return mVar2;
            }
            m mVar3 = new m(mVar.a * 2, mVar.f4572b);
            int i10 = (int) (1073741823 & j);
            int i11 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i12 = mVar.f4573c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object lVar = mVar.f4574d.get(i13);
                if (lVar == null) {
                    lVar = new l(i10);
                }
                mVar3.f4574d.set(mVar3.f4573c & i10, lVar);
                i10++;
            }
            atomicLongFieldUpdater.set(mVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        m mVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4570f;
            long j = atomicLongFieldUpdater.get(mVarC);
            if ((j & 1152921504606846976L) != 0) {
                return f4571g;
            }
            int i10 = (int) (j & 1073741823);
            int i11 = mVarC.f4573c;
            int i12 = ((int) ((1152921503533105152L & j) >> 30)) & i11;
            int i13 = i11 & i10;
            if (i12 != i13) {
                AtomicReferenceArray atomicReferenceArray = mVarC.f4574d;
                Object obj = atomicReferenceArray.get(i13);
                boolean z6 = mVarC.f4572b;
                if (obj == null) {
                    if (z6) {
                    }
                } else if (!(obj instanceof l)) {
                    long j10 = (i10 + 1) & 1073741823;
                    if (atomicLongFieldUpdater.compareAndSet(mVarC, j, (j & (-1073741824)) | j10)) {
                        atomicReferenceArray.set(i13, null);
                        return obj;
                    }
                    mVarC = this;
                    if (z6) {
                        while (true) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4570f;
                            long j11 = atomicLongFieldUpdater2.get(mVarC);
                            int i14 = (int) (j11 & 1073741823);
                            if ((j11 & 1152921504606846976L) != 0) {
                                mVarC = mVarC.c();
                            } else {
                                m mVar = mVarC;
                                mVarC = mVar;
                                if (atomicLongFieldUpdater2.compareAndSet(mVar, j11, (j11 & (-1073741824)) | j10)) {
                                    mVarC.f4574d.set(mVarC.f4573c & i14, null);
                                    mVarC = null;
                                } else {
                                    continue;
                                }
                            }
                            if (mVarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
