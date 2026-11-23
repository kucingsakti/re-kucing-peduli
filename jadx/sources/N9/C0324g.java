package N9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: renamed from: N9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0324g extends G implements InterfaceC0323f, p144o8.d, z0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3448x = AtomicIntegerFieldUpdater.newUpdater(C0324g.class, "_decisionAndIndex");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3449y = AtomicReferenceFieldUpdater.newUpdater(C0324g.class, Object.class, "_state");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3450z = AtomicReferenceFieldUpdater.newUpdater(C0324g.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p123m8.d f3451v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p123m8.i f3452w;

    public C0324g(int i10, p123m8.d dVar) {
        super(i10);
        this.f3451v = dVar;
        this.f3452w = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C0319b.f3439s;
    }

    public static void B(n0 n0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + n0Var + ", already has " + obj).toString());
    }

    public static Object H(n0 n0Var, Object obj, int i10, p200u8.b bVar) {
        if (obj instanceof C0333p) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (bVar != null || (n0Var instanceof C0322e)) {
            return new C0332o(obj, n0Var instanceof C0322e ? (C0322e) n0Var : null, bVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public final boolean A() {
        if (this.f3412u != 2) {
            return false;
        }
        p123m8.d dVar = this.f3451v;
        p210v8.i.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return S9.g.f4555z.get((S9.g) dVar) != null;
    }

    public String C() {
        return "CancellableContinuation";
    }

    public final void D() {
        p123m8.d dVar = this.f3451v;
        Throwable th = null;
        S9.g gVar = dVar instanceof S9.g ? (S9.g) dVar : null;
        if (gVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = S9.g.f4555z;
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                O3.y yVar = S9.a.f4549d;
                if (obj != yVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(gVar, yVar, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(gVar) == yVar);
            }
            if (th == null) {
                return;
            }
            s();
            r(th);
        }
    }

    public final void E(Object obj, p200u8.b bVar) {
        F(obj, this.f3412u, bVar);
    }

    public final void F(Object obj, int i10, p200u8.b bVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3449y;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof n0)) {
                if (obj2 instanceof C0325h) {
                    C0325h c0325h = (C0325h) obj2;
                    c0325h.getClass();
                    if (C0325h.f3454c.compareAndSet(c0325h, 0, 1)) {
                        if (bVar != null) {
                            o(bVar, c0325h.a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objH = H((n0) obj2, obj, i10, bVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objH)) {
                    if (!A()) {
                        s();
                    }
                    t(i10);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void G(AbstractC0337u abstractC0337u) {
        p076h8.m mVar = p076h8.m.a;
        p123m8.d dVar = this.f3451v;
        S9.g gVar = dVar instanceof S9.g ? (S9.g) dVar : null;
        F(mVar, (gVar != null ? gVar.f4556v : null) == abstractC0337u ? 4 : this.f3412u, null);
    }

    @Override // N9.z0
    public final void a(S9.s sVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f3448x;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        z(sVar);
    }

    @Override // N9.G
    public final void b(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3449y;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof n0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0333p) {
                return;
            }
            if (!(obj2 instanceof C0332o)) {
                cancellationException2 = cancellationException;
                C0332o c0332o = new C0332o(obj2, (C0322e) null, (p200u8.b) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0332o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            C0332o c0332o2 = (C0332o) obj2;
            if (c0332o2.f3475e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0332o c0332oA = C0332o.a(c0332o2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0332oA)) {
                    C0322e c0322e = c0332o2.f3472b;
                    if (c0322e != null) {
                        n(c0322e, cancellationException);
                    }
                    p200u8.b bVar = c0332o2.f3473c;
                    if (bVar != null) {
                        o(bVar, cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // N9.G
    public final p123m8.d c() {
        return this.f3451v;
    }

    @Override // N9.G
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // N9.G
    public final Object e(Object obj) {
        return obj instanceof C0332o ? ((C0332o) obj).a : obj;
    }

    @Override // N9.InterfaceC0323f
    public final O3.y f(Object obj, p200u8.b bVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3449y;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z6 = obj2 instanceof n0;
            O3.y yVar = AbstractC0342z.a;
            if (!z6) {
                boolean z10 = obj2 instanceof C0332o;
                return null;
            }
            Object objH = H((n0) obj2, obj, this.f3412u, bVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objH)) {
                    if (!A()) {
                        s();
                    }
                    return yVar;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // N9.InterfaceC0323f
    public final void g(Object obj) {
        t(this.f3412u);
    }

    @Override // p144o8.d
    public final p144o8.d getCallerFrame() {
        p123m8.d dVar = this.f3451v;
        if (dVar instanceof p144o8.d) {
            return (p144o8.d) dVar;
        }
        return null;
    }

    @Override // p123m8.d
    public final p123m8.i getContext() {
        return this.f3452w;
    }

    @Override // N9.G
    public final Object m() {
        return f3449y.get(this);
    }

    public final void n(C0322e c0322e, Throwable th) {
        try {
            c0322e.a(th);
        } catch (Throwable th2) {
            AbstractC0342z.l(this.f3452w, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o(p200u8.b bVar, Throwable th) {
        try {
            bVar.invoke(th);
        } catch (Throwable th2) {
            AbstractC0342z.l(this.f3452w, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void q(S9.s sVar, Throwable th) {
        p123m8.i iVar = this.f3452w;
        int i10 = f3448x.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            sVar.g(i10, iVar);
        } catch (Throwable th2) {
            AbstractC0342z.l(iVar, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean r(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3449y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof n0)) {
                return false;
            }
            C0325h c0325h = new C0325h(this, th, (obj instanceof C0322e) || (obj instanceof S9.s));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0325h)) {
                    n0 n0Var = (n0) obj;
                    if (n0Var instanceof C0322e) {
                        n((C0322e) obj, th);
                    } else if (n0Var instanceof S9.s) {
                        q((S9.s) obj, th);
                    }
                    if (!A()) {
                        s();
                    }
                    t(this.f3412u);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // p123m8.d
    public final void resumeWith(Object obj) {
        Throwable thA = p076h8.h.a(obj);
        if (thA != null) {
            obj = new C0333p(thA, false);
        }
        F(obj, this.f3412u, null);
    }

    public final void s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3450z;
        K k3 = (K) atomicReferenceFieldUpdater.get(this);
        if (k3 == null) {
            return;
        }
        k3.f();
        atomicReferenceFieldUpdater.set(this, m0.f3471s);
    }

    public final void t(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f3448x;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z6 = i10 == 4;
                p123m8.d dVar = this.f3451v;
                if (!z6 && (dVar instanceof S9.g)) {
                    boolean z10 = i10 == 1 || i10 == 2;
                    int i13 = this.f3412u;
                    if (z10 == (i13 == 1 || i13 == 2)) {
                        AbstractC0337u abstractC0337u = ((S9.g) dVar).f4556v;
                        p123m8.i context = ((S9.g) dVar).f4557w.getContext();
                        if (abstractC0337u.o()) {
                            abstractC0337u.g(context, this);
                            return;
                        }
                        T tA = s0.a();
                        if (tA.f3430t >= 4294967296L) {
                            tA.A(this);
                            return;
                        }
                        tA.E(true);
                        try {
                            AbstractC0342z.p(this, dVar, true);
                            do {
                            } while (tA.H());
                        } catch (Throwable th) {
                            try {
                                k(th, null);
                            } finally {
                                tA.t(true);
                            }
                        }
                        return;
                    }
                }
                AbstractC0342z.p(this, dVar, z6);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(C());
        sb.append('(');
        sb.append(AbstractC0342z.t(this.f3451v));
        sb.append("){");
        Object obj = f3449y.get(this);
        if (obj instanceof n0) {
            str = "Active";
        } else {
            str = obj instanceof C0325h ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0342z.j(this));
        return sb.toString();
    }

    public Throwable u(k0 k0Var) {
        return k0Var.t();
    }

    public final Object v() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean zA = A();
        do {
            atomicIntegerFieldUpdater = f3448x;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zA) {
                    D();
                }
                Object obj = f3449y.get(this);
                if (obj instanceof C0333p) {
                    throw ((C0333p) obj).a;
                }
                int i12 = this.f3412u;
                if (i12 == 1 || i12 == 2) {
                    c0 c0Var = (c0) this.f3452w.get(b0.f3440s);
                    if (c0Var != null && !c0Var.a()) {
                        CancellationException cancellationExceptionT = ((k0) c0Var).t();
                        b(obj, cancellationExceptionT);
                        throw cancellationExceptionT;
                    }
                }
                return e(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((K) f3450z.get(this)) == null) {
            x();
        }
        if (zA) {
            D();
        }
        return p134n8.a.f13404s;
    }

    public final void w() {
        K kX = x();
        if (kX == null || (f3449y.get(this) instanceof n0)) {
            return;
        }
        kX.f();
        f3450z.set(this, m0.f3471s);
    }

    public final K x() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c0 c0Var = (c0) this.f3452w.get(b0.f3440s);
        if (c0Var == null) {
            return null;
        }
        K kC = ((k0) c0Var).C((2 & 1) == 0, (2 & 2) != 0, new C0326i(this));
        do {
            atomicReferenceFieldUpdater = f3450z;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, kC)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return kC;
    }

    public final void y(p200u8.b bVar) {
        z(bVar instanceof C0322e ? (C0322e) bVar : new C0322e(bVar, 2));
    }

    public final void z(n0 n0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3449y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0319b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if (obj instanceof C0322e ? true : obj instanceof S9.s) {
                B(n0Var, obj);
                throw null;
            }
            if (obj instanceof C0333p) {
                C0333p c0333p = (C0333p) obj;
                c0333p.getClass();
                if (!C0333p.f3476b.compareAndSet(c0333p, 0, 1)) {
                    B(n0Var, obj);
                    throw null;
                }
                if (obj instanceof C0325h) {
                    if (!(obj instanceof C0333p)) {
                        c0333p = null;
                    }
                    Throwable th = c0333p != null ? c0333p.a : null;
                    if (n0Var instanceof C0322e) {
                        n((C0322e) n0Var, th);
                        return;
                    } else {
                        p210v8.i.d(n0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        q((S9.s) n0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0332o)) {
                if (n0Var instanceof S9.s) {
                    return;
                }
                p210v8.i.d(n0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0332o c0332o = new C0332o(obj, (C0322e) n0Var, (p200u8.b) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0332o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0332o c0332o2 = (C0332o) obj;
            if (c0332o2.f3472b != null) {
                B(n0Var, obj);
                throw null;
            }
            if (n0Var instanceof S9.s) {
                return;
            }
            p210v8.i.d(n0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            C0322e c0322e = (C0322e) n0Var;
            Throwable th2 = c0332o2.f3475e;
            if (th2 != null) {
                n(c0322e, th2);
                return;
            }
            C0332o c0332oA = C0332o.a(c0332o2, c0322e, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0332oA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }
}
