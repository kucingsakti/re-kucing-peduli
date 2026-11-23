package P9;

import N9.AbstractC0342z;
import N9.C0324g;
import N9.InterfaceC0323f;
import N9.z0;
import O3.y;
import S9.s;
import S9.t;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p076h8.m;

/* JADX INFO: loaded from: classes.dex */
public class a implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3902c = AtomicLongFieldUpdater.newUpdater(a.class, "sendersAndCloseStatus");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3903d = AtomicLongFieldUpdater.newUpdater(a.class, "receivers");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3904e = AtomicLongFieldUpdater.newUpdater(a.class, "bufferEnd");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3905f = AtomicLongFieldUpdater.newUpdater(a.class, "completedExpandBuffersAndPauseFlag");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3906g = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "sendSegment");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3907h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "receiveSegment");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3908i = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "bufferEndSegment");
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_closeCause");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3909k = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3910b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public a(int i10) {
        this.f3910b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(E0.a.g("Invalid channel capacity: ", i10, ", should be >=0").toString());
        }
        i iVar = c.a;
        this.bufferEnd = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f3904e.get(this);
        i iVar2 = new i(0L, null, this, 3);
        this.sendSegment = iVar2;
        this.receiveSegment = iVar2;
        if (o()) {
            iVar2 = c.a;
            p210v8.i.d(iVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = iVar2;
        this._closeCause = c.f3927r;
    }

    public static final i b(a aVar, long j10, i iVar) {
        Object objA;
        a aVar2;
        aVar.getClass();
        i iVar2 = c.a;
        b bVar = b.f3911A;
        loop0: while (true) {
            objA = S9.a.a(iVar, j10, bVar);
            if (!S9.a.d(objA)) {
                s sVarB = S9.a.b(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3906g;
                    s sVar = (s) atomicReferenceFieldUpdater.get(aVar);
                    if (sVar.f4577u >= sVarB.f4577u) {
                        break loop0;
                    }
                    if (!sVarB.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(aVar, sVar, sVarB)) {
                            if (!sVar.e()) {
                                break loop0;
                            }
                            sVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(aVar) == sVar);
                    if (sVarB.e()) {
                        sVarB.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zD = S9.a.d(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3903d;
        if (zD) {
            aVar.f();
            if (iVar.f4577u * ((long) c.f3912b) < atomicLongFieldUpdater.get(aVar)) {
                iVar.a();
                return null;
            }
        } else {
            i iVar3 = (i) S9.a.b(objA);
            long j11 = iVar3.f4577u;
            if (j11 <= j10) {
                return iVar3;
            }
            long j12 = ((long) c.f3912b) * j11;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3902c;
                long j13 = atomicLongFieldUpdater2.get(aVar);
                long j14 = 1152921504606846975L & j13;
                if (j14 >= j12) {
                    aVar2 = aVar;
                    break;
                }
                aVar2 = aVar;
                if (atomicLongFieldUpdater2.compareAndSet(aVar2, j13, j14 + (((long) ((int) (j13 >> 60))) << 60))) {
                    break;
                }
                aVar = aVar2;
            }
            if (j11 * ((long) c.f3912b) < atomicLongFieldUpdater.get(aVar2)) {
                iVar3.a();
            }
        }
        return null;
    }

    public static final int c(a aVar, i iVar, int i10, Object obj, long j10, y yVar, boolean z6) {
        aVar.getClass();
        iVar.m(i10, obj);
        if (z6) {
            return aVar.v(iVar, i10, obj, j10, yVar, z6);
        }
        Object objK = iVar.k(i10);
        if (objK == null) {
            if (aVar.d(j10)) {
                if (iVar.j(null, i10, c.f3914d)) {
                    return 1;
                }
            } else {
                if (yVar == null) {
                    return 3;
                }
                if (iVar.j(null, i10, yVar)) {
                    return 2;
                }
            }
        } else if (objK instanceof z0) {
            iVar.m(i10, null);
            if (aVar.s(objK, obj)) {
                iVar.n(i10, c.f3919i);
                return 0;
            }
            y yVar2 = c.f3920k;
            if (iVar.f3930x.getAndSet((i10 * 2) + 1, yVar2) == yVar2) {
                return 5;
            }
            iVar.l(i10, true);
            return 5;
        }
        return aVar.v(iVar, i10, obj, j10, yVar, z6);
    }

    public static void l(a aVar) {
        aVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3905f;
        if ((atomicLongFieldUpdater.addAndGet(aVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(aVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean t(Object obj) {
        if (!(obj instanceof InterfaceC0323f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        p210v8.i.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0323f interfaceC0323f = (InterfaceC0323f) obj;
        i iVar = c.a;
        y yVarF = interfaceC0323f.f(m.a, null);
        if (yVarF == null) {
            return false;
        }
        interfaceC0323f.g(yVarF);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x007d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // P9.k
    public Object a(Object obj) {
        int iC;
        m mVar;
        z0 z0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3902c;
        long j10 = atomicLongFieldUpdater.get(this);
        boolean z6 = false;
        long j11 = 1152921504606846975L;
        boolean z10 = m(j10, false) ? false : !d(j10 & 1152921504606846975L);
        g gVar = h.a;
        if (z10) {
            return gVar;
        }
        y yVar = c.j;
        i iVar = (i) f3906g.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = andIncrement & j11;
            boolean zM = m(andIncrement, z6);
            int i10 = c.f3912b;
            long j13 = i10;
            long j14 = j12 / j13;
            int i11 = (int) (j12 % j13);
            if (iVar.f4577u == j14) {
                iC = c(this, iVar, i11, obj, j12, yVar, zM);
                mVar = m.a;
                if (iC != 0) {
                    iVar.a();
                    return mVar;
                }
                if (iC != 1) {
                    return mVar;
                }
                if (iC != 2) {
                    if (zM) {
                        iVar.h();
                        return new f(j());
                    }
                    if (yVar instanceof z0) {
                        z0Var = (z0) yVar;
                    } else {
                        z0Var = null;
                    }
                    if (z0Var != null) {
                        z0Var.a(iVar, i11 + i10);
                    }
                    iVar.h();
                    return gVar;
                }
                if (iC != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iC != 4) {
                    if (j12 < f3903d.get(this)) {
                        iVar.a();
                    }
                    return new f(j());
                }
                if (iC == 5) {
                    iVar.a();
                }
                z6 = false;
            } else {
                i iVarB = b(this, j14, iVar);
                if (iVarB != null) {
                    iVar = iVarB;
                    iC = c(this, iVar, i11, obj, j12, yVar, zM);
                    mVar = m.a;
                    if (iC != 0) {
                        iVar.a();
                        return mVar;
                    }
                    if (iC != 1) {
                        return mVar;
                    }
                    if (iC != 2) {
                        if (zM) {
                            iVar.h();
                            return new f(j());
                        }
                        if (yVar instanceof z0) {
                            z0Var = (z0) yVar;
                        } else {
                            z0Var = null;
                        }
                        if (z0Var != null) {
                            z0Var.a(iVar, i11 + i10);
                        }
                        iVar.h();
                        return gVar;
                    }
                    if (iC != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iC != 4) {
                        if (j12 < f3903d.get(this)) {
                            iVar.a();
                        }
                        return new f(j());
                    }
                    if (iC == 5) {
                        iVar.a();
                    }
                    z6 = false;
                } else {
                    if (zM) {
                        return new f(j());
                    }
                    z6 = false;
                }
            }
            j11 = 1152921504606846975L;
        }
    }

    public final boolean d(long j10) {
        return j10 < f3904e.get(this) || j10 < f3903d.get(this) + ((long) this.f3910b);
    }

    public final i e(long j10) {
        Object objE;
        long j11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = f3908i.get(this);
        i iVar = (i) f3906g.get(this);
        if (iVar.f4577u > ((i) obj).f4577u) {
            obj = iVar;
        }
        i iVar2 = (i) f3907h.get(this);
        if (iVar2.f4577u > ((i) obj).f4577u) {
            obj = iVar2;
        }
        S9.d dVar = (S9.d) obj;
        loop0: while (true) {
            dVar.getClass();
            Object obj2 = S9.d.f4552s.get(dVar);
            y yVar = S9.a.f4547b;
            objE = null;
            if (obj2 == yVar) {
                break;
            }
            S9.d dVar2 = (S9.d) obj2;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = S9.d.f4552s;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, yVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        i iVar3 = (i) dVar;
        if (n()) {
            i iVar4 = iVar3;
            loop2: while (true) {
                int i10 = c.f3912b - 1;
                while (true) {
                    if (-1 < i10) {
                        j11 = (iVar4.f4577u * ((long) c.f3912b)) + ((long) i10);
                        if (j11 >= f3903d.get(this)) {
                            while (true) {
                                Object objK = iVar4.k(i10);
                                if (objK != null && objK != c.f3915e) {
                                    if (objK != c.f3914d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (iVar4.j(objK, i10, c.f3921l)) {
                                    iVar4.h();
                                    break;
                                }
                            }
                            i10--;
                        }
                    } else {
                        iVar4 = (i) ((S9.d) S9.d.f4553t.get(iVar4));
                        if (iVar4 == null) {
                        }
                    }
                    j11 = -1;
                    break;
                }
            }
            if (j11 != -1) {
                g(j11);
            }
        }
        loop5: for (i iVar5 = iVar3; iVar5 != null; iVar5 = (i) ((S9.d) S9.d.f4553t.get(iVar5))) {
            for (int i11 = c.f3912b - 1; -1 < i11; i11--) {
                if ((iVar5.f4577u * ((long) c.f3912b)) + ((long) i11) < j10) {
                    break loop5;
                }
                while (true) {
                    Object objK2 = iVar5.k(i11);
                    if (objK2 != null && objK2 != c.f3915e) {
                        if (!(objK2 instanceof l)) {
                            if (!(objK2 instanceof z0)) {
                                break;
                            }
                            if (iVar5.j(objK2, i11, c.f3921l)) {
                                objE = S9.a.e(objE, objK2);
                                iVar5.l(i11, true);
                                break;
                            }
                        } else {
                            if (iVar5.j(objK2, i11, c.f3921l)) {
                                objE = S9.a.e(objE, ((l) objK2).a);
                                iVar5.l(i11, true);
                                break;
                            }
                        }
                    } else {
                        if (iVar5.j(objK2, i11, c.f3921l)) {
                            iVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objE != null) {
            if (!(objE instanceof ArrayList)) {
                r((z0) objE, true);
                return iVar3;
            }
            ArrayList arrayList = (ArrayList) objE;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                r((z0) arrayList.get(size), true);
            }
        }
        return iVar3;
    }

    public final void f() {
        m(f3902c.get(this), false);
    }

    public final void g(long j10) {
        i iVar = (i) f3907h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3903d;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(((long) this.f3910b) + j11, f3904e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, 1 + j11)) {
                long j12 = c.f3912b;
                long j13 = j11 / j12;
                int i10 = (int) (j11 % j12);
                if (iVar.f4577u != j13) {
                    i iVarI = i(j13, iVar);
                    if (iVarI != null) {
                        iVar = iVarI;
                    }
                }
                i iVar2 = iVar;
                if (u(iVar2, i10, j11, null) != c.f3924o || j11 < k()) {
                    iVar2.a();
                }
                iVar = iVar2;
            }
        }
    }

    public final void h() {
        Object objA;
        if (o()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3908i;
        i iVar = (i) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f3904e.getAndIncrement(this);
            long j10 = andIncrement / ((long) c.f3912b);
            if (k() <= andIncrement) {
                if (iVar.f4577u < j10 && iVar.b() != null) {
                    p(j10, iVar);
                }
                l(this);
                return;
            }
            if (iVar.f4577u != j10) {
                b bVar = b.f3911A;
                while (true) {
                    objA = S9.a.a(iVar, j10, bVar);
                    if (!S9.a.d(objA)) {
                        s sVarB = S9.a.b(objA);
                        while (true) {
                            s sVar = (s) atomicReferenceFieldUpdater.get(this);
                            if (sVar.f4577u >= sVarB.f4577u) {
                                break;
                            }
                            if (!sVarB.i()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarB)) {
                                    if (!sVar.e()) {
                                        break;
                                    }
                                    sVar.d();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == sVar);
                            if (sVarB.e()) {
                                sVarB.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                i iVar2 = null;
                if (S9.a.d(objA)) {
                    f();
                    p(j10, iVar);
                    l(this);
                } else {
                    i iVar3 = (i) S9.a.b(objA);
                    long j11 = iVar3.f4577u;
                    if (j11 > j10) {
                        long j12 = j11 * ((long) c.f3912b);
                        if (f3904e.compareAndSet(this, 1 + andIncrement, j12)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f3905f;
                            if ((atomicLongFieldUpdater.addAndGet(this, j12 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            l(this);
                        }
                    } else {
                        iVar2 = iVar3;
                    }
                }
                if (iVar2 == null) {
                    continue;
                } else {
                    iVar = iVar2;
                }
            }
            int i10 = (int) (andIncrement % ((long) c.f3912b));
            Object objK = iVar.k(i10);
            boolean z6 = objK instanceof z0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3903d;
            if (!z6 || andIncrement < atomicLongFieldUpdater2.get(this) || !iVar.j(objK, i10, c.f3917g)) {
                while (true) {
                    Object objK2 = iVar.k(i10);
                    if (objK2 instanceof z0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (iVar.j(objK2, i10, new l((z0) objK2))) {
                                l(this);
                                return;
                            }
                        } else if (iVar.j(objK2, i10, c.f3917g)) {
                            if (!t(objK2)) {
                                iVar.n(i10, c.j);
                                iVar.h();
                                break;
                            } else {
                                iVar.n(i10, c.f3914d);
                                l(this);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == c.j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (iVar.j(objK2, i10, c.f3915e)) {
                                l(this);
                                return;
                            }
                        } else if (objK2 == c.f3914d || objK2 == c.f3918h || objK2 == c.f3919i || objK2 == c.f3920k || objK2 == c.f3921l) {
                            l(this);
                            return;
                        } else if (objK2 != c.f3916f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objK2).toString());
                        }
                    }
                }
                l(this);
            } else if (t(objK)) {
                iVar.n(i10, c.f3914d);
                l(this);
                return;
            } else {
                iVar.n(i10, c.j);
                iVar.h();
                l(this);
            }
        }
    }

    public final i i(long j10, i iVar) {
        Object objA;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        i iVar2 = c.a;
        b bVar = b.f3911A;
        loop0: while (true) {
            objA = S9.a.a(iVar, j10, bVar);
            if (!S9.a.d(objA)) {
                s sVarB = S9.a.b(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3907h;
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f4577u >= sVarB.f4577u) {
                        break loop0;
                    }
                    if (!sVarB.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarB)) {
                            if (!sVar.e()) {
                                break loop0;
                            }
                            sVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == sVar);
                    if (sVarB.e()) {
                        sVarB.d();
                    }
                }
            } else {
                break;
            }
        }
        if (S9.a.d(objA)) {
            f();
            if (iVar.f4577u * ((long) c.f3912b) < k()) {
                iVar.a();
                return null;
            }
        } else {
            i iVar3 = (i) S9.a.b(objA);
            boolean zO = o();
            long j12 = iVar3.f4577u;
            if (!zO && j10 <= f3904e.get(this) / ((long) c.f3912b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3908i;
                    s sVar2 = (s) atomicReferenceFieldUpdater2.get(this);
                    if (sVar2.f4577u >= j12 || !iVar3.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, iVar3)) {
                            if (!sVar2.e()) {
                                break loop3;
                            }
                            sVar2.d();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == sVar2);
                    if (iVar3.e()) {
                        iVar3.d();
                    }
                }
            }
            if (j12 <= j10) {
                return iVar3;
            }
            long j13 = j12 * ((long) c.f3912b);
            do {
                atomicLongFieldUpdater = f3903d;
                j11 = atomicLongFieldUpdater.get(this);
                if (j11 >= j13) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j11, j13));
            if (j12 * ((long) c.f3912b) < k()) {
                iVar3.a();
            }
        }
        return null;
    }

    public final Throwable j() {
        Throwable th = (Throwable) j.get(this);
        return th == null ? new ClosedSendChannelException("Channel was closed") : th;
    }

    public final long k() {
        return f3902c.get(this) & 1152921504606846975L;
    }

    public final boolean m(long j10, boolean z6) {
        int i10 = (int) (j10 >> 60);
        if (i10 != 0 && i10 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3903d;
            if (i10 == 2) {
                e(1152921504606846975L & j10);
                if (z6) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3907h;
                        i iVarI = (i) atomicReferenceFieldUpdater.get(this);
                        long j11 = atomicLongFieldUpdater.get(this);
                        if (k() <= j11) {
                            break;
                        }
                        long j12 = c.f3912b;
                        long j13 = j11 / j12;
                        if (iVarI.f4577u != j13 && (iVarI = i(j13, iVarI)) == null) {
                            if (((i) atomicReferenceFieldUpdater.get(this)).f4577u < j13) {
                                break;
                            }
                        } else {
                            iVarI.a();
                            int i11 = (int) (j11 % j12);
                            while (true) {
                                Object objK = iVarI.k(i11);
                                if (objK != null && objK != c.f3915e) {
                                    if (objK != c.f3914d && (objK == c.j || objK == c.f3921l || objK == c.f3919i || objK == c.f3918h || (objK != c.f3917g && (objK == c.f3916f || j11 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (iVarI.j(objK, i11, c.f3918h)) {
                                    h();
                                    break;
                                }
                            }
                            f3903d.compareAndSet(this, j11, j11 + 1);
                        }
                    }
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException(AbstractC0487g.g(i10, "unexpected close status: ").toString());
                }
                i iVarE = e(1152921504606846975L & j10);
                Object objE = null;
                loop0: do {
                    for (int i12 = c.f3912b - 1; -1 < i12; i12--) {
                        long j14 = (iVarE.f4577u * ((long) c.f3912b)) + ((long) i12);
                        while (true) {
                            Object objK2 = iVarE.k(i12);
                            if (objK2 == c.f3919i) {
                                break loop0;
                            }
                            if (objK2 != c.f3914d) {
                                if (objK2 != c.f3915e && objK2 != null) {
                                    if (!(objK2 instanceof z0) && !(objK2 instanceof l)) {
                                        y yVar = c.f3917g;
                                        if (objK2 == yVar || objK2 == c.f3916f) {
                                            break loop0;
                                        }
                                        if (objK2 != yVar) {
                                            break;
                                        }
                                    } else {
                                        if (j14 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        z0 z0Var = objK2 instanceof l ? ((l) objK2).a : (z0) objK2;
                                        if (iVarE.j(objK2, i12, c.f3921l)) {
                                            objE = S9.a.e(objE, z0Var);
                                            iVarE.m(i12, null);
                                            iVarE.h();
                                            break;
                                        }
                                    }
                                } else {
                                    if (iVarE.j(objK2, i12, c.f3921l)) {
                                        iVarE.h();
                                        break;
                                    }
                                }
                            } else {
                                if (j14 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (iVarE.j(objK2, i12, c.f3921l)) {
                                    iVarE.m(i12, null);
                                    iVarE.h();
                                    break;
                                }
                            }
                        }
                    }
                    iVarE = (i) ((S9.d) S9.d.f4553t.get(iVarE));
                } while (iVarE != null);
                if (objE != null) {
                    if (objE instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objE;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            r((z0) arrayList.get(size), false);
                        }
                    } else {
                        r((z0) objE, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean n() {
        return false;
    }

    public final boolean o() {
        long j10 = f3904e.get(this);
        return j10 == 0 || j10 == Long.MAX_VALUE;
    }

    public final void p(long j10, i iVar) {
        i iVar2;
        i iVar3;
        while (iVar.f4577u < j10 && (iVar3 = (i) iVar.b()) != null) {
            iVar = iVar3;
        }
        while (true) {
            if (!iVar.c() || (iVar2 = (i) iVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3908i;
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f4577u >= iVar.f4577u) {
                        return;
                    }
                    if (!iVar.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, iVar)) {
                            if (sVar.e()) {
                                sVar.d();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == sVar);
                    if (iVar.e()) {
                        iVar.d();
                    }
                }
            } else {
                iVar = iVar2;
            }
        }
    }

    public final Object q(p123m8.d dVar) throws Throwable {
        i iVarI;
        a aVar = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3907h;
        i iVar = (i) atomicReferenceFieldUpdater.get(aVar);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3902c;
            boolean zM = aVar.m(atomicLongFieldUpdater.get(aVar), true);
            String str = "Channel was closed";
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
            if (zM) {
                Throwable closedReceiveChannelException = (Throwable) atomicReferenceFieldUpdater2.get(aVar);
                if (closedReceiveChannelException == null) {
                    closedReceiveChannelException = new ClosedReceiveChannelException("Channel was closed");
                }
                int i10 = t.a;
                throw closedReceiveChannelException;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3903d;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(aVar);
            long j10 = c.f3912b;
            long j11 = andIncrement / j10;
            int i11 = (int) (andIncrement % j10);
            if (iVar.f4577u != j11) {
                i iVarI2 = aVar.i(j11, iVar);
                if (iVarI2 == null) {
                    continue;
                } else {
                    iVar = iVarI2;
                }
            }
            Object objU = aVar.u(iVar, i11, andIncrement, null);
            y yVar = c.f3922m;
            if (objU == yVar) {
                throw new IllegalStateException("unexpected");
            }
            y yVar2 = c.f3924o;
            if (objU != yVar2) {
                if (objU != c.f3923n) {
                    iVar.a();
                    return objU;
                }
                C0324g c0324gK = AbstractC0342z.k(qa.b.q(dVar));
                try {
                    Object objU2 = u(iVar, i11, andIncrement, c0324gK);
                    if (objU2 == yVar) {
                        c0324gK.a(iVar, i11);
                    } else if (objU2 == yVar2) {
                        if (andIncrement < k()) {
                            iVar.a();
                        }
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(this);
                        for (boolean z6 = true; !m(atomicLongFieldUpdater.get(this), z6); z6 = true) {
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                            long j12 = c.f3912b;
                            long j13 = andIncrement2 / j12;
                            int i12 = (int) (andIncrement2 % j12);
                            String str2 = str;
                            if (iVar2.f4577u != j13) {
                                iVarI = i(j13, iVar2);
                                if (iVarI == null) {
                                    continue;
                                }
                                str = str2;
                            } else {
                                iVarI = iVar2;
                            }
                            Object objU3 = u(iVarI, i12, andIncrement2, c0324gK);
                            if (objU3 == c.f3922m) {
                                c0324gK.a(iVarI, i12);
                            } else if (objU3 == c.f3924o) {
                                if (andIncrement2 < k()) {
                                    iVarI.a();
                                }
                                iVar2 = iVarI;
                                str = str2;
                            } else {
                                if (objU3 == c.f3923n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                iVarI.a();
                                c0324gK.E(objU3, null);
                            }
                        }
                        Throwable closedReceiveChannelException2 = (Throwable) atomicReferenceFieldUpdater2.get(this);
                        if (closedReceiveChannelException2 == null) {
                            closedReceiveChannelException2 = new ClosedReceiveChannelException(str);
                        }
                        c0324gK.resumeWith(J7.a.d(closedReceiveChannelException2));
                    } else {
                        iVar.a();
                        c0324gK.E(objU2, null);
                    }
                    return c0324gK.v();
                } catch (Throwable th) {
                    c0324gK.D();
                    throw th;
                }
            }
            if (andIncrement < k()) {
                iVar.a();
            }
            aVar = this;
        }
    }

    public final void r(z0 z0Var, boolean z6) {
        Throwable thJ;
        if (!(z0Var instanceof InterfaceC0323f)) {
            throw new IllegalStateException(("Unexpected waiter: " + z0Var).toString());
        }
        p123m8.d dVar = (p123m8.d) z0Var;
        if (z6) {
            thJ = (Throwable) j.get(this);
            if (thJ == null) {
                thJ = new ClosedReceiveChannelException("Channel was closed");
            }
        } else {
            thJ = j();
        }
        dVar.resumeWith(J7.a.d(thJ));
    }

    public final boolean s(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC0323f)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        p210v8.i.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        InterfaceC0323f interfaceC0323f = (InterfaceC0323f) obj;
        i iVar = c.a;
        y yVarF = interfaceC0323f.f(obj2, null);
        if (yVarF == null) {
            return false;
        }
        interfaceC0323f.g(yVarF);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i10 = (int) (f3902c.get(this) >> 60);
        if (i10 == 2) {
            sb.append("closed,");
        } else if (i10 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f3910b + ',');
        sb.append("data=[");
        int i11 = 0;
        boolean z6 = true;
        List listC = p086i8.l.C(f3907h.get(this), f3906g.get(this), f3908i.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (((i) obj) != c.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((i) next).f4577u;
            do {
                Object next2 = it.next();
                long j11 = ((i) next2).f4577u;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        i iVar = (i) next;
        long j12 = f3903d.get(this);
        long jK = k();
        loop2: while (true) {
            int i12 = c.f3912b;
            int i13 = i11;
            while (i13 < i12) {
                long j13 = (iVar.f4577u * ((long) c.f3912b)) + ((long) i13);
                if (j13 >= jK && j13 >= j12) {
                    break loop2;
                }
                Object objK = iVar.k(i13);
                boolean z10 = z6;
                Object obj2 = iVar.f3930x.get(i13 * 2);
                if (objK instanceof InterfaceC0323f) {
                    string = (j13 >= j12 || j13 < jK) ? (j13 >= jK || j13 < j12) ? "cont" : "send" : "receive";
                } else if (objK instanceof l) {
                    string = "EB(" + objK + ')';
                } else if (p210v8.i.a(objK, c.f3916f) ? z10 : p210v8.i.a(objK, c.f3917g)) {
                    string = "resuming_sender";
                } else {
                    if (!(objK == null ? z10 : objK.equals(c.f3915e) ? z10 : p210v8.i.a(objK, c.f3919i) ? z10 : p210v8.i.a(objK, c.f3918h) ? z10 : p210v8.i.a(objK, c.f3920k) ? z10 : p210v8.i.a(objK, c.j) ? z10 : p210v8.i.a(objK, c.f3921l))) {
                        string = objK.toString();
                    }
                    i13++;
                    z6 = z10;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i13++;
                z6 = z10;
            }
            boolean z11 = z6;
            iVar = (i) iVar.b();
            if (iVar == null) {
                break;
            }
            z6 = z11;
            i11 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(L9.f.L(sb)) == ',') {
            p210v8.i.e(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object u(i iVar, int i10, long j10, Object obj) {
        Object objK = iVar.k(i10);
        AtomicReferenceArray atomicReferenceArray = iVar.f3930x;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3902c;
        if (objK == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return c.f3923n;
                }
                if (iVar.j(objK, i10, obj)) {
                    h();
                    return c.f3922m;
                }
            }
        } else if (objK == c.f3914d && iVar.j(objK, i10, c.f3919i)) {
            h();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            iVar.m(i10, null);
            return obj2;
        }
        while (true) {
            Object objK2 = iVar.k(i10);
            if (objK2 == null || objK2 == c.f3915e) {
                if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (iVar.j(objK2, i10, c.f3918h)) {
                        h();
                        return c.f3924o;
                    }
                } else {
                    if (obj == null) {
                        return c.f3923n;
                    }
                    if (iVar.j(objK2, i10, obj)) {
                        h();
                        return c.f3922m;
                    }
                }
            } else if (objK2 != c.f3914d) {
                y yVar = c.j;
                if (objK2 == yVar) {
                    return c.f3924o;
                }
                if (objK2 == c.f3918h) {
                    return c.f3924o;
                }
                if (objK2 == c.f3921l) {
                    h();
                    return c.f3924o;
                }
                if (objK2 != c.f3917g && iVar.j(objK2, i10, c.f3916f)) {
                    boolean z6 = objK2 instanceof l;
                    if (z6) {
                        objK2 = ((l) objK2).a;
                    }
                    if (t(objK2)) {
                        iVar.n(i10, c.f3919i);
                        h();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        iVar.m(i10, null);
                        return obj3;
                    }
                    iVar.n(i10, yVar);
                    iVar.h();
                    if (z6) {
                        h();
                    }
                    return c.f3924o;
                }
            } else if (iVar.j(objK2, i10, c.f3919i)) {
                h();
                Object obj4 = atomicReferenceArray.get(i10 * 2);
                iVar.m(i10, null);
                return obj4;
            }
        }
    }

    public final int v(i iVar, int i10, Object obj, long j10, y yVar, boolean z6) {
        while (true) {
            Object objK = iVar.k(i10);
            if (objK == null) {
                if (!d(j10) || z6) {
                    if (z6) {
                        if (iVar.j(null, i10, c.j)) {
                            iVar.h();
                            return 4;
                        }
                    } else {
                        if (yVar == null) {
                            return 3;
                        }
                        if (iVar.j(null, i10, yVar)) {
                            return 2;
                        }
                    }
                } else if (iVar.j(null, i10, c.f3914d)) {
                    break;
                }
            } else {
                if (objK != c.f3915e) {
                    y yVar2 = c.f3920k;
                    if (objK == yVar2) {
                        iVar.m(i10, null);
                        return 5;
                    }
                    if (objK == c.f3918h) {
                        iVar.m(i10, null);
                        return 5;
                    }
                    if (objK == c.f3921l) {
                        iVar.m(i10, null);
                        f();
                        return 4;
                    }
                    iVar.m(i10, null);
                    if (objK instanceof l) {
                        objK = ((l) objK).a;
                    }
                    if (s(objK, obj)) {
                        iVar.n(i10, c.f3919i);
                        return 0;
                    }
                    if (iVar.f3930x.getAndSet((i10 * 2) + 1, yVar2) != yVar2) {
                        iVar.l(i10, true);
                    }
                    return 5;
                }
                if (iVar.j(objK, i10, c.f3914d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void w(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        a aVar = this;
        if (aVar.o()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f3904e;
            if (atomicLongFieldUpdater.get(aVar) > j10) {
                break;
            } else {
                aVar = this;
            }
        }
        int i10 = c.f3913c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3905f;
            if (i11 < i10) {
                long j11 = atomicLongFieldUpdater.get(aVar);
                if (j11 == (4611686018427387903L & atomicLongFieldUpdater2.get(aVar)) && j11 == atomicLongFieldUpdater.get(aVar)) {
                    return;
                } else {
                    i11++;
                }
            } else {
                while (true) {
                    long j12 = atomicLongFieldUpdater2.get(aVar);
                    if (atomicLongFieldUpdater2.compareAndSet(aVar, j12, (j12 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        aVar = this;
                    }
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater.get(aVar);
                    long j14 = atomicLongFieldUpdater2.get(aVar);
                    long j15 = j14 & 4611686018427387903L;
                    boolean z6 = (j14 & 4611686018427387904L) != 0;
                    if (j13 == j15 && j13 == atomicLongFieldUpdater.get(aVar)) {
                        break;
                    }
                    if (!z6) {
                        atomicLongFieldUpdater2.compareAndSet(this, j14, 4611686018427387904L + j15);
                    }
                    aVar = this;
                }
                while (true) {
                    long j16 = atomicLongFieldUpdater2.get(aVar);
                    if (atomicLongFieldUpdater2.compareAndSet(aVar, j16, j16 & 4611686018427387903L)) {
                        return;
                    } else {
                        aVar = this;
                    }
                }
            }
        }
    }
}
