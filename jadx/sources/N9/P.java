package N9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class P implements Runnable, Comparable, K {
    private volatile Object _heap;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f3423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3424t = -1;

    public P(long j) {
        this.f3423s = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f3423s - ((P) obj).f3423s;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // N9.K
    public final void f() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                O3.y yVar = AbstractC0342z.f3496b;
                if (obj == yVar) {
                    return;
                }
                Q q10 = obj instanceof Q ? (Q) obj : null;
                if (q10 != null) {
                    q10.c(this);
                }
                this._heap = yVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final S9.w k() {
        Object obj = this._heap;
        if (obj instanceof S9.w) {
            return (S9.w) obj;
        }
        return null;
    }

    public final int m(long j, Q q10, S s9) {
        synchronized (this) {
            if (this._heap == AbstractC0342z.f3496b) {
                return 2;
            }
            synchronized (q10) {
                try {
                    P[] pArr = q10.a;
                    P p10 = pArr != null ? pArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = S.f3426x;
                    s9.getClass();
                    if (S.f3428z.get(s9) != 0) {
                        return 1;
                    }
                    if (p10 == null) {
                        q10.f3425c = j;
                    } else {
                        long j10 = p10.f3423s;
                        if (j10 - j < 0) {
                            j = j10;
                        }
                        if (j - q10.f3425c > 0) {
                            q10.f3425c = j;
                        }
                    }
                    long j11 = this.f3423s;
                    long j12 = q10.f3425c;
                    if (j11 - j12 < 0) {
                        this.f3423s = j12;
                    }
                    q10.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void n(Q q10) {
        if (this._heap == AbstractC0342z.f3496b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = q10;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f3423s + ']';
    }
}
