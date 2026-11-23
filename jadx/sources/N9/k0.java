package N9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public class k0 implements c0, o0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3469s = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "_state");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3470t = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public k0(boolean z6) {
        this._state = z6 ? AbstractC0342z.j : AbstractC0342z.f3503i;
    }

    public static C0328k I(S9.j jVar) {
        while (jVar.l()) {
            S9.j jVarD = jVar.d();
            if (jVarD == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = S9.j.f4567t;
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (S9.j) obj;
                    if (!jVar.l()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarD;
            }
        }
        while (true) {
            jVar = jVar.k();
            if (!jVar.l()) {
                if (jVar instanceof C0328k) {
                    return (C0328k) jVar;
                }
                if (jVar instanceof l0) {
                    return null;
                }
            }
        }
    }

    public static String O(Object obj) {
        if (!(obj instanceof i0)) {
            if (obj instanceof Y) {
                return ((Y) obj).a() ? "Active" : "New";
            }
            return obj instanceof C0333p ? "Cancelled" : "Completed";
        }
        i0 i0Var = (i0) obj;
        if (i0Var.e()) {
            return "Cancelling";
        }
        return i0Var.f() ? "Completing" : "Active";
    }

    public final void B(c0 c0Var) {
        int iN;
        m0 m0Var = m0.f3471s;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3470t;
        if (c0Var == null) {
            atomicReferenceFieldUpdater.set(this, m0Var);
            return;
        }
        k0 k0Var = (k0) c0Var;
        do {
            iN = k0Var.N(k0Var.y());
            if (iN == 0) {
                break;
            }
        } while (iN != 1);
        InterfaceC0327j interfaceC0327j = (InterfaceC0327j) k0Var.C((2 & 1) == 0, (2 & 2) != 0, new C0328k(this));
        atomicReferenceFieldUpdater.set(this, interfaceC0327j);
        if (y() instanceof Y) {
            return;
        }
        interfaceC0327j.f();
        atomicReferenceFieldUpdater.set(this, m0Var);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:97:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00c8 A[EDGE_INSN: B:98:0x00c8->B:77:0x00c8 BREAK  A[LOOP:0: B:18:0x0028->B:107:0x0028], SYNTHETIC] */
    public final K C(boolean z6, boolean z10, p200u8.b bVar) {
        f0 l4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thD;
        if (z6) {
            l4 = bVar instanceof d0 ? (d0) bVar : null;
            if (l4 == null) {
                l4 = new C0318a0(bVar);
            }
        } else {
            l4 = bVar instanceof f0 ? (f0) bVar : null;
            if (l4 == null) {
                l4 = new L(bVar, 1);
            }
        }
        l4.f3447v = this;
        loop0: while (true) {
            Object objY = y();
            if (objY instanceof M) {
                M m2 = (M) objY;
                if (m2.f3419s) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3469s;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, objY, l4)) {
                        if (atomicReferenceFieldUpdater2.get(this) != objY) {
                        }
                    }
                    break loop0;
                }
                l0 l0Var = new l0();
                Y x8 = m2.f3419s ? l0Var : new X(l0Var);
                do {
                    atomicReferenceFieldUpdater = f3469s;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, m2, x8)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == m2);
            } else {
                if (!(objY instanceof Y)) {
                    if (z10) {
                        C0333p c0333p = objY instanceof C0333p ? (C0333p) objY : null;
                        bVar.invoke(c0333p != null ? c0333p.a : null);
                    }
                    return m0.f3471s;
                }
                l0 l0VarC = ((Y) objY).c();
                if (l0VarC == null) {
                    p210v8.i.d(objY, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    M((f0) objY);
                } else {
                    K k3 = m0.f3471s;
                    if (z6 && (objY instanceof i0)) {
                        synchronized (objY) {
                            try {
                                thD = ((i0) objY).d();
                                if (thD == null || ((bVar instanceof C0328k) && !((i0) objY).f())) {
                                    if (b((Y) objY, l0VarC, l4)) {
                                        if (thD == null) {
                                            return l4;
                                        }
                                        k3 = l4;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thD != null) {
                            if (z10) {
                                bVar.invoke(thD);
                            }
                            return k3;
                        }
                        if (b((Y) objY, l0VarC, l4)) {
                            break;
                            break;
                        }
                    } else {
                        thD = null;
                        if (thD != null) {
                            if (z10) {
                                bVar.invoke(thD);
                            }
                            return k3;
                        }
                        if (b((Y) objY, l0VarC, l4)) {
                            break;
                        }
                    }
                }
            }
        }
        return l4;
    }

    public boolean D() {
        return this instanceof C0320c;
    }

    public final Object E(p144o8.c cVar) {
        Object objY;
        p076h8.m mVar;
        do {
            objY = y();
            boolean z6 = objY instanceof Y;
            mVar = p076h8.m.a;
            if (!z6) {
                AbstractC0342z.f(cVar.getContext());
                return mVar;
            }
        } while (N(objY) < 0);
        C0324g c0324g = new C0324g(1, qa.b.q(cVar));
        c0324g.w();
        c0324g.y(new C0322e(C(false, true, new L(c0324g, 3)), 1));
        Object objV = c0324g.v();
        p134n8.a aVar = p134n8.a.f13404s;
        if (objV != aVar) {
            objV = mVar;
        }
        return objV == aVar ? objV : mVar;
    }

    public final boolean F(Object obj) {
        Object objP;
        do {
            objP = P(y(), obj);
            if (objP == AbstractC0342z.f3498d) {
                return false;
            }
            if (objP == AbstractC0342z.f3499e) {
                return true;
            }
        } while (objP == AbstractC0342z.f3500f);
        d(objP);
        return true;
    }

    public final Object G(Object obj) {
        Object objP;
        do {
            objP = P(y(), obj);
            if (objP == AbstractC0342z.f3498d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0333p c0333p = obj instanceof C0333p ? (C0333p) obj : null;
                throw new IllegalStateException(str, c0333p != null ? c0333p.a : null);
            }
        } while (objP == AbstractC0342z.f3500f);
        return objP;
    }

    public String H() {
        return getClass().getSimpleName();
    }

    public final void J(l0 l0Var, Throwable th) {
        Object objJ = l0Var.j();
        p210v8.i.d(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (S9.j jVarK = (S9.j) objJ; !jVarK.equals(l0Var); jVarK = jVarK.k()) {
            if (jVarK instanceof d0) {
                f0 f0Var = (f0) jVarK;
                try {
                    f0Var.n(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C8.E.e(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + f0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            A(completionHandlerException);
        }
        m(th);
    }

    public final void M(f0 f0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        l0 l0Var = new l0();
        f0Var.getClass();
        S9.j.f4567t.lazySet(l0Var, f0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = S9.j.f4566s;
        atomicReferenceFieldUpdater2.lazySet(l0Var, f0Var);
        loop0: while (f0Var.j() == f0Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(f0Var, f0Var, l0Var)) {
                    l0Var.i(f0Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(f0Var) == f0Var);
        }
        S9.j jVarK = f0Var.k();
        do {
            atomicReferenceFieldUpdater = f3469s;
            if (atomicReferenceFieldUpdater.compareAndSet(this, f0Var, jVarK)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == f0Var);
    }

    public final int N(Object obj) {
        boolean z6 = obj instanceof M;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3469s;
        if (z6) {
            if (((M) obj).f3419s) {
                return 0;
            }
            M m2 = AbstractC0342z.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof X)) {
            return 0;
        }
        l0 l0Var = ((X) obj).f3435s;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, l0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object P(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof Y)) {
            return AbstractC0342z.f3498d;
        }
        if (((obj instanceof M) || (obj instanceof f0)) && !(obj instanceof C0328k) && !(obj2 instanceof C0333p)) {
            Y y6 = (Y) obj;
            Object z6 = obj2 instanceof Y ? new Z((Y) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f3469s;
                if (atomicReferenceFieldUpdater.compareAndSet(this, y6, z6)) {
                    K(obj2);
                    q(y6, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == y6);
            return AbstractC0342z.f3500f;
        }
        Y y8 = (Y) obj;
        l0 l0VarX = x(y8);
        if (l0VarX == null) {
            return AbstractC0342z.f3500f;
        }
        C0328k c0328kI = null;
        i0 i0Var = y8 instanceof i0 ? (i0) y8 : null;
        if (i0Var == null) {
            i0Var = new i0(l0VarX, null);
        }
        synchronized (i0Var) {
            if (i0Var.f()) {
                return AbstractC0342z.f3498d;
            }
            i0.f3460t.set(i0Var, 1);
            if (i0Var != y8) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3469s;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, y8, i0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != y8) {
                        return AbstractC0342z.f3500f;
                    }
                }
            }
            boolean zE = i0Var.e();
            C0333p c0333p = obj2 instanceof C0333p ? (C0333p) obj2 : null;
            if (c0333p != null) {
                i0Var.b(c0333p.a);
            }
            Throwable thD = i0Var.d();
            if (zE) {
                thD = null;
            }
            if (thD != null) {
                J(l0VarX, thD);
            }
            C0328k c0328k = y8 instanceof C0328k ? (C0328k) y8 : null;
            if (c0328k == null) {
                l0 l0VarC = y8.c();
                if (l0VarC != null) {
                    c0328kI = I(l0VarC);
                }
            } else {
                c0328kI = c0328k;
            }
            if (c0328kI != null) {
                while (c0328kI.f3468w.C((2 & 1) == 0, (2 & 2) != 0, new h0(this, i0Var, c0328kI, obj2)) == m0.f3471s) {
                    c0328kI = I(c0328kI);
                    if (c0328kI == null) {
                    }
                }
                return AbstractC0342z.f3499e;
            }
            return s(i0Var, obj2);
        }
    }

    @Override // N9.c0
    public boolean a() {
        Object objY = y();
        return (objY instanceof Y) && ((Y) objY).a();
    }

    public final boolean b(Y y6, l0 l0Var, f0 f0Var) {
        char c10;
        j0 j0Var = new j0(f0Var, this, y6);
        do {
            S9.j jVarD = l0Var.d();
            if (jVarD == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = S9.j.f4567t;
                Object obj = atomicReferenceFieldUpdater.get(l0Var);
                while (true) {
                    jVarD = (S9.j) obj;
                    if (!jVarD.l()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVarD);
                }
            }
            S9.j.f4567t.lazySet(f0Var, jVarD);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = S9.j.f4566s;
            atomicReferenceFieldUpdater2.lazySet(f0Var, l0Var);
            j0Var.f3465c = l0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(jVarD, l0Var, j0Var)) {
                    if (j0Var.a(jVarD) != null) {
                        c10 = 2;
                        break;
                    }
                    c10 = 1;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(jVarD) != l0Var) {
                    c10 = 0;
                    break;
                }
            }
            if (c10 == 1) {
                return true;
            }
        } while (c10 != 2);
        return false;
    }

    public void e(Object obj) {
        d(obj);
    }

    @Override // p123m8.i
    public final Object fold(Object obj, p200u8.c cVar) {
        return cVar.invoke(obj, this);
    }

    @Override // p123m8.i
    public final p123m8.g get(p123m8.h hVar) {
        return com.bumptech.glide.e.g(this, hVar);
    }

    @Override // p123m8.g
    public final p123m8.h getKey() {
        return b0.f3440s;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
      0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v12 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:24:0x0049, B:29:0x005e, B:32:0x0064, B:34:0x006d, B:37:0x0074), top: B:81:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0064 A[Catch: all -> 0x0072, TRY_ENTER, TryCatch #0 {all -> 0x0072, blocks: (B:24:0x0049, B:29:0x005e, B:32:0x0064, B:34:0x006d, B:37:0x0074), top: B:81:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:24:0x0049, B:29:0x005e, B:32:0x0064, B:34:0x006d, B:37:0x0074), top: B:81:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:81:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:2: B:56:0x00b2->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003e, please report this as an issue */
    public final boolean k(Object obj) {
        Throwable thR;
        Object objY;
        i0 i0Var;
        boolean z6;
        Throwable thD;
        O3.y yVar;
        Y y6;
        l0 l0VarX;
        i0 i0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objP;
        Object objP2 = AbstractC0342z.f3498d;
        if (w()) {
            do {
                Object objY2 = y();
                if (!(objY2 instanceof Y) || ((objY2 instanceof i0) && ((i0) objY2).f())) {
                    objP2 = AbstractC0342z.f3498d;
                    break;
                }
                objP2 = P(objY2, new C0333p(r(obj), false));
            } while (objP2 == AbstractC0342z.f3500f);
            if (objP2 != AbstractC0342z.f3499e) {
                if (objP2 == AbstractC0342z.f3498d) {
                    thR = null;
                    loop1: while (true) {
                        objY = y();
                        if (objY instanceof i0) {
                            synchronized (objY) {
                                try {
                                    i0Var = (i0) objY;
                                    i0Var.getClass();
                                    if (i0.f3462v.get(i0Var) == AbstractC0342z.f3502h) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        yVar = AbstractC0342z.f3501g;
                                    } else {
                                        boolean zE = ((i0) objY).e();
                                        if (thR == null) {
                                            thR = r(obj);
                                        }
                                        ((i0) objY).b(thR);
                                        thD = zE ? null : ((i0) objY).d();
                                        if (thD != null) {
                                            J(((i0) objY).f3463s, thD);
                                        }
                                        yVar = AbstractC0342z.f3498d;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else if (objY instanceof Y) {
                            if (thR == null) {
                                thR = r(obj);
                            }
                            y6 = (Y) objY;
                            if (y6.a()) {
                                l0VarX = x(y6);
                                if (l0VarX == null) {
                                    continue;
                                } else {
                                    i0Var2 = new i0(l0VarX, thR);
                                    while (true) {
                                        atomicReferenceFieldUpdater = f3469s;
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, y6, i0Var2)) {
                                            J(l0VarX, thR);
                                            yVar = AbstractC0342z.f3498d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != y6) {
                                        }
                                    }
                                }
                            } else {
                                objP = P(objY, new C0333p(thR, false));
                                if (objP != AbstractC0342z.f3498d) {
                                    throw new IllegalStateException(("Cannot happen in " + objY).toString());
                                }
                                if (objP != AbstractC0342z.f3500f) {
                                    objP2 = objP;
                                    break;
                                }
                            }
                        } else {
                            yVar = AbstractC0342z.f3501g;
                        }
                        objP2 = yVar;
                        break;
                    }
                }
                if (objP2 != AbstractC0342z.f3498d && objP2 != AbstractC0342z.f3499e) {
                    if (objP2 == AbstractC0342z.f3501g) {
                        return false;
                    }
                    d(objP2);
                    return true;
                }
            }
        } else {
            if (objP2 == AbstractC0342z.f3498d) {
                thR = null;
                loop1: while (true) {
                    objY = y();
                    if (objY instanceof i0) {
                        synchronized (objY) {
                            i0Var = (i0) objY;
                            i0Var.getClass();
                            if (i0.f3462v.get(i0Var) == AbstractC0342z.f3502h) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                yVar = AbstractC0342z.f3501g;
                            } else {
                                boolean zE2 = ((i0) objY).e();
                                if (thR == null) {
                                    thR = r(obj);
                                }
                                ((i0) objY).b(thR);
                                if (zE2) {
                                }
                                if (thD != null) {
                                    J(((i0) objY).f3463s, thD);
                                }
                                yVar = AbstractC0342z.f3498d;
                            }
                        }
                    } else if (objY instanceof Y) {
                        if (thR == null) {
                            thR = r(obj);
                        }
                        y6 = (Y) objY;
                        if (y6.a()) {
                            l0VarX = x(y6);
                            if (l0VarX == null) {
                                continue;
                            } else {
                                i0Var2 = new i0(l0VarX, thR);
                                while (true) {
                                    atomicReferenceFieldUpdater = f3469s;
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, y6, i0Var2)) {
                                        J(l0VarX, thR);
                                        yVar = AbstractC0342z.f3498d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != y6) {
                                    }
                                }
                            }
                        } else {
                            objP = P(objY, new C0333p(thR, false));
                            if (objP != AbstractC0342z.f3498d) {
                                throw new IllegalStateException(("Cannot happen in " + objY).toString());
                            }
                            if (objP != AbstractC0342z.f3500f) {
                                objP2 = objP;
                                break;
                            }
                        }
                    } else {
                        yVar = AbstractC0342z.f3501g;
                    }
                    objP2 = yVar;
                    break;
                }
            }
            if (objP2 != AbstractC0342z.f3498d) {
                if (objP2 == AbstractC0342z.f3501g) {
                    return false;
                }
                d(objP2);
                return true;
            }
        }
        return true;
    }

    public final boolean m(Throwable th) {
        if (D()) {
            return true;
        }
        boolean z6 = th instanceof CancellationException;
        InterfaceC0327j interfaceC0327j = (InterfaceC0327j) f3470t.get(this);
        if (interfaceC0327j == null || interfaceC0327j == m0.f3471s) {
            return z6;
        }
        return interfaceC0327j.g(th) || z6;
    }

    @Override // p123m8.i
    public final p123m8.i minusKey(p123m8.h hVar) {
        return com.bumptech.glide.e.j(this, hVar);
    }

    public String n() {
        return "Job was cancelled";
    }

    public boolean o(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return k(th) && v();
    }

    @Override // p123m8.i
    public final p123m8.i plus(p123m8.i iVar) {
        return com.bumptech.glide.e.l(this, iVar);
    }

    public final void q(Y y6, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3470t;
        InterfaceC0327j interfaceC0327j = (InterfaceC0327j) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0327j != null) {
            interfaceC0327j.f();
            atomicReferenceFieldUpdater.set(this, m0.f3471s);
        }
        CompletionHandlerException completionHandlerException = null;
        C0333p c0333p = obj instanceof C0333p ? (C0333p) obj : null;
        Throwable th = c0333p != null ? c0333p.a : null;
        if (y6 instanceof f0) {
            try {
                ((f0) y6).n(th);
                return;
            } catch (Throwable th2) {
                A(new CompletionHandlerException("Exception in completion handler " + y6 + " for " + this, th2));
                return;
            }
        }
        l0 l0VarC = y6.c();
        if (l0VarC != null) {
            Object objJ = l0VarC.j();
            p210v8.i.d(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (S9.j jVarK = (S9.j) objJ; !jVarK.equals(l0VarC); jVarK = jVarK.k()) {
                if (jVarK instanceof f0) {
                    f0 f0Var = (f0) jVarK;
                    try {
                        f0Var.n(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            C8.E.e(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + f0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                A(completionHandlerException);
            }
        }
    }

    public final Throwable r(Object obj) {
        Throwable thD;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        k0 k0Var = (k0) ((o0) obj);
        Object objY = k0Var.y();
        if (objY instanceof i0) {
            thD = ((i0) objY).d();
        } else if (objY instanceof C0333p) {
            thD = ((C0333p) objY).a;
        } else {
            if (objY instanceof Y) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objY).toString());
            }
            thD = null;
        }
        CancellationException cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(O(objY)), thD, k0Var) : cancellationException;
    }

    public final Object s(i0 i0Var, Object obj) {
        Throwable thU;
        C0333p c0333p = obj instanceof C0333p ? (C0333p) obj : null;
        Throwable th = c0333p != null ? c0333p.a : null;
        synchronized (i0Var) {
            i0Var.e();
            ArrayList<Throwable> arrayListG = i0Var.g(th);
            thU = u(i0Var, arrayListG);
            if (thU != null && arrayListG.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                for (Throwable th2 : arrayListG) {
                    if (th2 != thU && th2 != thU && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        C8.E.e(thU, th2);
                    }
                }
            }
        }
        if (thU != null && thU != th) {
            obj = new C0333p(thU, false);
        }
        if (thU != null && (m(thU) || z(thU))) {
            p210v8.i.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0333p.f3476b.compareAndSet((C0333p) obj, 0, 1);
        }
        K(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3469s;
        Object z6 = obj instanceof Y ? new Z((Y) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, i0Var, z6) && atomicReferenceFieldUpdater.get(this) == i0Var) {
        }
        q(i0Var, obj);
        return obj;
    }

    public final CancellationException t() {
        CancellationException jobCancellationException;
        Object objY = y();
        if (!(objY instanceof i0)) {
            if (objY instanceof Y) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objY instanceof C0333p)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0333p) objY).a;
            jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return jobCancellationException == null ? new JobCancellationException(n(), th, this) : jobCancellationException;
        }
        Throwable thD = ((i0) objY).d();
        if (thD == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        jobCancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        if (jobCancellationException == null) {
            if (strConcat == null) {
                strConcat = n();
            }
            jobCancellationException = new JobCancellationException(strConcat, thD, this);
        }
        return jobCancellationException;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(H() + '{' + O(y()) + '}');
        sb.append('@');
        sb.append(AbstractC0342z.j(this));
        return sb.toString();
    }

    public final Throwable u(i0 i0Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (i0Var.e()) {
                return new JobCancellationException(n(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean v() {
        return true;
    }

    public boolean w() {
        return this instanceof C0330m;
    }

    public final l0 x(Y y6) {
        l0 l0VarC = y6.c();
        if (l0VarC != null) {
            return l0VarC;
        }
        if (y6 instanceof M) {
            return new l0();
        }
        if (y6 instanceof f0) {
            M((f0) y6);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + y6).toString());
    }

    public final Object y() {
        while (true) {
            Object obj = f3469s.get(this);
            if (!(obj instanceof S9.o)) {
                return obj;
            }
            ((S9.o) obj).a(this);
        }
    }

    public boolean z(Throwable th) {
        return false;
    }

    public void L() {
    }

    public void A(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public void K(Object obj) {
    }

    public void d(Object obj) {
    }
}
