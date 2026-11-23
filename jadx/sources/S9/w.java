package S9;

import N9.P;
import N9.Q;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4582b = AtomicIntegerFieldUpdater.newUpdater(w.class, "_size");
    private volatile int _size;
    public P[] a;

    public final void a(P p10) {
        p10.n((Q) this);
        P[] pArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4582b;
        if (pArr == null) {
            pArr = new P[4];
            this.a = pArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= pArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(pArr, atomicIntegerFieldUpdater.get(this) * 2);
            p210v8.i.e(objArrCopyOf, "copyOf(this, newSize)");
            pArr = (P[]) objArrCopyOf;
            this.a = pArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        pArr[i10] = p10;
        p10.f3424t = i10;
        e(i10);
    }

    public final P b() {
        P p10;
        synchronized (this) {
            P[] pArr = this.a;
            p10 = pArr != null ? pArr[0] : null;
        }
        return p10;
    }

    public final void c(P p10) {
        synchronized (this) {
            if (p10.k() != null) {
                d(p10.f3424t);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final P d(int i10) {
        int i11;
        int i12;
        Object[] objArr;
        int i13;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        p210v8.i.c(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4582b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i10 < atomicIntegerFieldUpdater.get(this)) {
            f(i10, atomicIntegerFieldUpdater.get(this));
            int i14 = (i10 - 1) / 2;
            if (i10 > 0) {
                P p10 = objArr2[i10];
                p210v8.i.c(p10);
                Object obj2 = objArr2[i14];
                p210v8.i.c(obj2);
                if (p10.compareTo(obj2) < 0) {
                    f(i10, i14);
                    e(i14);
                } else {
                    while (true) {
                        i11 = i10 * 2;
                        i12 = i11 + 1;
                        if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.a;
                        p210v8.i.c(objArr);
                        i13 = i11 + 2;
                        if (i13 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i13];
                            p210v8.i.c(comparable3);
                            obj = objArr[i12];
                            p210v8.i.c(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i13 = i12;
                            }
                        } else {
                            i13 = i12;
                        }
                        comparable = objArr[i10];
                        p210v8.i.c(comparable);
                        comparable2 = objArr[i13];
                        p210v8.i.c(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        f(i10, i13);
                        i10 = i13;
                    }
                }
            } else {
                while (true) {
                    i11 = i10 * 2;
                    i12 = i11 + 1;
                    if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    p210v8.i.c(objArr);
                    i13 = i11 + 2;
                    if (i13 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i13];
                        p210v8.i.c(comparable3);
                        obj = objArr[i12];
                        p210v8.i.c(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i13 = i12;
                        }
                    } else {
                        i13 = i12;
                    }
                    comparable = objArr[i10];
                    p210v8.i.c(comparable);
                    comparable2 = objArr[i13];
                    p210v8.i.c(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    f(i10, i13);
                    i10 = i13;
                }
            }
        }
        P p11 = objArr2[atomicIntegerFieldUpdater.get(this)];
        p210v8.i.c(p11);
        p11.n(null);
        p11.f3424t = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return p11;
    }

    public final void e(int i10) {
        while (i10 > 0) {
            P[] pArr = this.a;
            p210v8.i.c(pArr);
            int i11 = (i10 - 1) / 2;
            P p10 = pArr[i11];
            p210v8.i.c(p10);
            P p11 = pArr[i10];
            p210v8.i.c(p11);
            if (p10.compareTo(p11) <= 0) {
                return;
            }
            f(i10, i11);
            i10 = i11;
        }
    }

    public final void f(int i10, int i11) {
        P[] pArr = this.a;
        p210v8.i.c(pArr);
        P p10 = pArr[i11];
        p210v8.i.c(p10);
        P p11 = pArr[i10];
        p210v8.i.c(p11);
        pArr[i10] = p10;
        pArr[i11] = p11;
        p10.f3424t = i10;
        p11.f3424t = i11;
    }
}
