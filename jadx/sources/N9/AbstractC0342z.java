package N9;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: renamed from: N9.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0342z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O3.y f3496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final O3.y f3497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final O3.y f3498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final O3.y f3499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final O3.y f3500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final O3.y f3501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final O3.y f3502h;
    public static final O3.y a = new O3.y("RESUME_TOKEN", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final M f3503i = new M(false);
    public static final M j = new M(true);

    static {
        int i10 = 1;
        f3496b = new O3.y("REMOVED_TASK", i10);
        f3497c = new O3.y("CLOSED_EMPTY", i10);
        int i11 = 1;
        f3498d = new O3.y("COMPLETING_ALREADY", i11);
        f3499e = new O3.y("COMPLETING_WAITING_CHILDREN", i11);
        f3500f = new O3.y("COMPLETING_RETRY", i11);
        f3501g = new O3.y("TOO_LATE_TO_CANCEL", i11);
        f3502h = new O3.y("SEALED", i11);
    }

    public static C0330m a() {
        C0330m c0330m = new C0330m(true);
        c0330m.B(null);
        return c0330m;
    }

    public static final S9.e b(p123m8.i iVar) {
        if (iVar.get(b0.f3440s) == null) {
            iVar = iVar.plus(new e0());
        }
        return new S9.e(iVar);
    }

    public static final Executor c(AbstractC0337u abstractC0337u) {
        Executor executorT;
        U u3 = abstractC0337u instanceof U ? (U) abstractC0337u : null;
        return (u3 == null || (executorT = u3.t()) == null) ? new H(abstractC0337u) : executorT;
    }

    public static D d(InterfaceC0341y interfaceC0341y, AbstractC0337u abstractC0337u, p200u8.c cVar, int i10) {
        p123m8.i iVar = abstractC0337u;
        if ((i10 & 1) != 0) {
            iVar = p123m8.j.f13164s;
        }
        p123m8.i iVarG = g(interfaceC0341y.c(), iVar, true);
        U9.d dVar = I.a;
        if (iVarG != dVar && iVarG.get(p123m8.e.f13163s) == null) {
            iVarG = iVarG.plus(dVar);
        }
        D d3 = new D(iVarG, true);
        d3.Q(1, d3, cVar);
        return d3;
    }

    public static final Object e(long j10, p123m8.d dVar) {
        p076h8.m mVar = p076h8.m.a;
        if (j10 > 0) {
            C0324g c0324g = new C0324g(1, qa.b.q(dVar));
            c0324g.w();
            if (j10 < Long.MAX_VALUE) {
                i(c0324g.f3452w).b(j10, c0324g);
            }
            Object objV = c0324g.v();
            if (objV == p134n8.a.f13404s) {
                return objV;
            }
        }
        return mVar;
    }

    public static final void f(p123m8.i iVar) {
        c0 c0Var = (c0) iVar.get(b0.f3440s);
        if (c0Var != null && !c0Var.a()) {
            throw ((k0) c0Var).t();
        }
    }

    public static final p123m8.i g(p123m8.i iVar, p123m8.i iVar2, boolean z6) {
        Boolean bool = Boolean.FALSE;
        r rVar = r.f3478u;
        boolean zBooleanValue = ((Boolean) iVar.fold(bool, rVar)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) iVar2.fold(bool, rVar)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return iVar.plus(iVar2);
        }
        p123m8.j jVar = p123m8.j.f13164s;
        p123m8.i iVar3 = (p123m8.i) iVar.fold(jVar, new r(2, 2));
        Object objFold = iVar2;
        if (zBooleanValue2) {
            objFold = iVar2.fold(jVar, r.f3477t);
        }
        return iVar3.plus((p123m8.i) objFold);
    }

    public static final AbstractC0337u h(Executor executor) {
        AbstractC0337u abstractC0337u;
        H h10 = executor instanceof H ? (H) executor : null;
        return (h10 == null || (abstractC0337u = h10.f3413s) == null) ? new V(executor) : abstractC0337u;
    }

    public static final E i(p123m8.i iVar) {
        p123m8.g gVar = iVar.get(p123m8.e.f13163s);
        E e10 = gVar instanceof E ? (E) gVar : null;
        return e10 == null ? B.a : e10;
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0324g k(p123m8.d dVar) {
        C0324g c0324g;
        C0324g c0324g2;
        if (!(dVar instanceof S9.g)) {
            return new C0324g(1, dVar);
        }
        S9.g gVar = (S9.g) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = S9.g.f4555z;
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            O3.y yVar = S9.a.f4549d;
            c0324g = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(gVar, yVar);
                c0324g2 = null;
                break;
            }
            if (obj instanceof C0324g) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, yVar)) {
                        c0324g2 = (C0324g) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(gVar) == obj);
            } else if (obj != yVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0324g2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0324g.f3449y;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0324g2);
            if (!(obj2 instanceof C0332o) || ((C0332o) obj2).f3474d == null) {
                C0324g.f3448x.set(c0324g2, 536870911);
                atomicReferenceFieldUpdater2.set(c0324g2, C0319b.f3439s);
                c0324g = c0324g2;
            } else {
                c0324g2.s();
            }
            if (c0324g != null) {
                return c0324g;
            }
        }
        return new C0324g(2, dVar);
    }

    public static final void l(p123m8.i iVar, Throwable th) {
        try {
            InterfaceC0339w interfaceC0339w = (InterfaceC0339w) iVar.get(C0338v.f3487s);
            if (interfaceC0339w != null) {
                interfaceC0339w.handleException(iVar, th);
            } else {
                S9.a.c(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C8.E.e(runtimeException, th);
                th = runtimeException;
            }
            S9.a.c(iVar, th);
        }
    }

    public static p0 n(InterfaceC0341y interfaceC0341y, p123m8.a aVar, p200u8.c cVar, int i10) {
        p123m8.i iVar = aVar;
        if ((i10 & 1) != 0) {
            iVar = p123m8.j.f13164s;
        }
        p123m8.i iVarG = g(interfaceC0341y.c(), iVar, true);
        U9.d dVar = I.a;
        if (iVarG != dVar && iVarG.get(p123m8.e.f13163s) == null) {
            iVarG = iVarG.plus(dVar);
        }
        p0 p0Var = new p0(iVarG, true);
        p0Var.Q(1, p0Var, cVar);
        return p0Var;
    }

    public static final Object o(Object obj) {
        return obj instanceof C0333p ? J7.a.d(((C0333p) obj).a) : obj;
    }

    public static final void p(C0324g c0324g, p123m8.d dVar, boolean z6) {
        Object obj = C0324g.f3449y.get(c0324g);
        Throwable thD = c0324g.d(obj);
        Object objD = thD != null ? J7.a.d(thD) : c0324g.e(obj);
        if (!z6) {
            dVar.resumeWith(objD);
            return;
        }
        p210v8.i.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        S9.g gVar = (S9.g) dVar;
        p144o8.c cVar = gVar.f4557w;
        p123m8.i context = cVar.getContext();
        Object objK = S9.a.k(context, gVar.f4559y);
        x0 x0VarV = objK != S9.a.f4551f ? v(cVar, context, objK) : null;
        try {
            cVar.resumeWith(objD);
        } finally {
            if (x0VarV == null || x0VarV.R()) {
                S9.a.f(context, objK);
            }
        }
    }

    public static final Object q(p123m8.i iVar, p200u8.c cVar) throws Throwable {
        T tA;
        p123m8.i iVarG;
        Thread threadCurrentThread = Thread.currentThread();
        p123m8.h hVar = p123m8.e.f13163s;
        p123m8.f fVar = (p123m8.f) iVar.get(hVar);
        p123m8.j jVar = p123m8.j.f13164s;
        if (fVar == null) {
            tA = s0.a();
            iVarG = g(jVar, iVar.plus(tA), true);
            U9.d dVar = I.a;
            if (iVarG != dVar && iVarG.get(hVar) == null) {
                iVarG = iVarG.plus(dVar);
            }
        } else {
            if (fVar instanceof T) {
            }
            tA = (T) s0.a.get();
            iVarG = g(jVar, iVar, true);
            U9.d dVar2 = I.a;
            if (iVarG != dVar2 && iVarG.get(hVar) == null) {
                iVarG = iVarG.plus(dVar2);
            }
        }
        C0320c c0320c = new C0320c(iVarG, threadCurrentThread, tA);
        c0320c.Q(1, c0320c, cVar);
        T t7 = c0320c.f3442w;
        if (t7 != null) {
            int i10 = T.f3429w;
            t7.E(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jG = t7 != null ? t7.G() : Long.MAX_VALUE;
                if (!(c0320c.y() instanceof Y)) {
                    if (t7 != null) {
                        int i11 = T.f3429w;
                        t7.t(false);
                    }
                    Object objU = u(c0320c.y());
                    C0333p c0333p = objU instanceof C0333p ? (C0333p) objU : null;
                    if (c0333p == null) {
                        return objU;
                    }
                    throw c0333p.a;
                }
                LockSupport.parkNanos(c0320c, jG);
            } catch (Throwable th) {
                if (t7 != null) {
                    int i12 = T.f3429w;
                    t7.t(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0320c.k(interruptedException);
        throw interruptedException;
    }

    public static final Object s(u0 u0Var, p200u8.c cVar) throws Throwable {
        Object c0333p;
        Object objG;
        u0Var.C(false, true, new L(i(u0Var.f4575v.getContext()).c(u0Var.f3486w, u0Var, u0Var.f3436u), 0));
        try {
            p210v8.x.e(2, cVar);
            c0333p = cVar.invoke(u0Var, u0Var);
        } catch (Throwable th) {
            c0333p = new C0333p(th, false);
        }
        p134n8.a aVar = p134n8.a.f13404s;
        if (c0333p == aVar || (objG = u0Var.G(c0333p)) == f3499e) {
            return aVar;
        }
        if (objG instanceof C0333p) {
            Throwable th2 = ((C0333p) objG).a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).f12843s != u0Var) {
                throw th2;
            }
            if (c0333p instanceof C0333p) {
                throw ((C0333p) c0333p).a;
            }
        } else {
            c0333p = u(objG);
        }
        return c0333p;
    }

    public static final String t(p123m8.d dVar) {
        Object objD;
        if (dVar instanceof S9.g) {
            return dVar.toString();
        }
        try {
            objD = dVar + '@' + j(dVar);
        } catch (Throwable th) {
            objD = J7.a.d(th);
        }
        if (p076h8.h.a(objD) != null) {
            objD = dVar.getClass().getName() + '@' + j(dVar);
        }
        return (String) objD;
    }

    public static final Object u(Object obj) {
        Y y6;
        Z z6 = obj instanceof Z ? (Z) obj : null;
        return (z6 == null || (y6 = z6.a) == null) ? obj : y6;
    }

    public static final x0 v(p123m8.d dVar, p123m8.i iVar, Object obj) {
        x0 x0Var = null;
        if ((dVar instanceof p144o8.d) && iVar.get(y0.f3495s) != null) {
            p144o8.d callerFrame = (p144o8.d) dVar;
            while (!(callerFrame instanceof F) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof x0) {
                    x0Var = (x0) callerFrame;
                    break;
                }
            }
            if (x0Var != null) {
                x0Var.S(iVar, obj);
            }
        }
        return x0Var;
    }

    public static final Object w(p123m8.i iVar, p200u8.c cVar, p123m8.d dVar) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        p123m8.i context = dVar.getContext();
        p123m8.i iVarPlus = !((Boolean) iVar.fold(Boolean.FALSE, r.f3478u)).booleanValue() ? context.plus(iVar) : g(context, iVar, false);
        f(iVarPlus);
        if (iVarPlus == context) {
            S9.r rVar = new S9.r(dVar, iVarPlus);
            return C3.b.N(rVar, rVar, cVar);
        }
        p123m8.e eVar = p123m8.e.f13163s;
        if (p210v8.i.a(iVarPlus.get(eVar), context.get(eVar))) {
            x0 x0Var = new x0(dVar, iVarPlus);
            p123m8.i iVar2 = x0Var.f3436u;
            Object objK = S9.a.k(iVar2, null);
            try {
                return C3.b.N(x0Var, x0Var, cVar);
            } finally {
                S9.a.f(iVar2, objK);
            }
        }
        F f10 = new F(dVar, iVarPlus);
        C3.a.p(cVar, f10, f10);
        do {
            atomicIntegerFieldUpdater = F.f3411w;
            int i10 = atomicIntegerFieldUpdater.get(f10);
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objU = u(f10.y());
                if (objU instanceof C0333p) {
                    throw ((C0333p) objU).a;
                }
                return objU;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(f10, 0, 1));
        return p134n8.a.f13404s;
    }

    public static final Object x(long j10, p200u8.c cVar, p144o8.c cVar2) {
        if (j10 > 0) {
            return s(new u0(j10, cVar2), cVar);
        }
        throw new TimeoutCancellationException("Timed out immediately", null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object y(long j10, p200u8.c cVar, p123m8.d dVar) throws Throwable {
        v0 v0Var;
        p210v8.t tVar;
        if (dVar instanceof v0) {
            v0Var = (v0) dVar;
            int i10 = v0Var.f3490u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                v0Var.f3490u = i10 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(dVar);
            }
        } else {
            v0Var = new v0(dVar);
        }
        Object obj = v0Var.f3489t;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = v0Var.f3490u;
        if (i11 == 0) {
            J7.a.v(obj);
            if (j10 <= 0) {
                return null;
            }
            p210v8.t tVar2 = new p210v8.t();
            try {
                v0Var.f3488s = tVar2;
                v0Var.f3490u = 1;
                u0 u0Var = new u0(j10, v0Var);
                tVar2.f15466s = u0Var;
                Object objS = s(u0Var, cVar);
                return objS == aVar ? aVar : objS;
            } catch (TimeoutCancellationException e10) {
                e = e10;
                tVar = tVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = v0Var.f3488s;
            try {
                J7.a.v(obj);
                return obj;
            } catch (TimeoutCancellationException e11) {
                e = e11;
            }
        }
        if (e.f12843s == tVar.f15466s) {
            return null;
        }
        throw e;
    }
}
