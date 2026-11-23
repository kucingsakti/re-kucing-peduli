package S9;

import C8.E;
import N9.AbstractC0337u;
import N9.AbstractC0342z;
import N9.C0333p;
import N9.InterfaceC0339w;
import N9.T;
import N9.b0;
import N9.c0;
import N9.k0;
import N9.r0;
import N9.s0;
import N9.x0;
import O3.y;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f4548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f4549d;
    public static final y a = new y("NO_DECISION", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f4547b = new y("CLOSED", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f4550e = new y("CONDITION_FALSE", 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y f4551f = new y("NO_THREAD_ELEMENTS", 1);

    static {
        int i10 = 1;
        f4548c = new y("UNDEFINED", i10);
        f4549d = new y("REUSABLE_CLAIMED", i10);
    }

    public static final Object a(s sVar, long j, p200u8.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (sVar.f4577u >= j && !sVar.c()) {
                return sVar;
            }
            Object obj = d.f4552s.get(sVar);
            y yVar = f4547b;
            if (obj == yVar) {
                return yVar;
            }
            s sVar2 = (s) ((d) obj);
            if (sVar2 == null) {
                sVar2 = (s) cVar.invoke(Long.valueOf(sVar.f4577u + 1), sVar);
                do {
                    atomicReferenceFieldUpdater = d.f4552s;
                    if (atomicReferenceFieldUpdater.compareAndSet(sVar, null, sVar2)) {
                        if (sVar.c()) {
                            sVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(sVar) == null);
            }
            sVar = sVar2;
        }
    }

    public static final s b(Object obj) {
        if (obj != f4547b) {
            return (s) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(p123m8.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0339w) it.next()).handleException(iVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    E.e(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            E.e(th, new DiagnosticCoroutineContextException(iVar));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean d(Object obj) {
        return obj == f4547b;
    }

    public static final Object e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void f(p123m8.i iVar, Object obj) {
        if (obj == f4551f) {
            return;
        }
        if (!(obj instanceof x)) {
            Object objFold = iVar.fold(null, v.f4579u);
            p210v8.i.d(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC0487g.q(objFold);
            throw null;
        }
        x xVar = (x) obj;
        r0[] r0VarArr = xVar.f4583b;
        int length = r0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        r0 r0Var = r0VarArr[length];
        p210v8.i.c(null);
        Object obj2 = xVar.a[length];
        throw null;
    }

    public static final void g(Object obj, p123m8.d dVar) {
        if (!(dVar instanceof g)) {
            dVar.resumeWith(obj);
            return;
        }
        g gVar = (g) dVar;
        Throwable thA = p076h8.h.a(obj);
        Object c0333p = thA == null ? obj : new C0333p(thA, false);
        p144o8.c cVar = gVar.f4557w;
        cVar.getContext();
        AbstractC0337u abstractC0337u = gVar.f4556v;
        if (abstractC0337u.o()) {
            gVar.f4558x = c0333p;
            gVar.f3412u = 1;
            abstractC0337u.g(cVar.getContext(), gVar);
            return;
        }
        T tA = s0.a();
        if (tA.f3430t >= 4294967296L) {
            gVar.f4558x = c0333p;
            gVar.f3412u = 1;
            tA.A(gVar);
            return;
        }
        tA.E(true);
        try {
            c0 c0Var = (c0) cVar.getContext().get(b0.f3440s);
            if (c0Var == null || c0Var.a()) {
                Object obj2 = gVar.f4559y;
                p123m8.i context = cVar.getContext();
                Object objK = k(context, obj2);
                x0 x0VarV = objK != f4551f ? AbstractC0342z.v(cVar, context, objK) : null;
                try {
                    cVar.resumeWith(obj);
                    if (x0VarV == null || x0VarV.R()) {
                        f(context, objK);
                    }
                } catch (Throwable th) {
                    if (x0VarV == null || x0VarV.R()) {
                        f(context, objK);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionT = ((k0) c0Var).t();
                gVar.b(c0333p, cancellationExceptionT);
                gVar.resumeWith(J7.a.d(cancellationExceptionT));
            }
            while (tA.H()) {
            }
        } catch (Throwable th2) {
            try {
                gVar.k(th2, null);
            } finally {
                tA.t(true);
            }
        }
    }

    public static final long i(String str, long j, long j10, long j11) {
        String property;
        int i10 = u.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lA = L9.m.A(property);
        if (lA == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lA.longValue();
        if (j10 <= jLongValue && jLongValue <= j11) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int j(int i10, String str, int i11) {
        return (int) i(str, i10, 1, (i11 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(p123m8.i iVar, Object obj) {
        if (obj == null) {
            obj = iVar.fold(0, v.f4578t);
            p210v8.i.c(obj);
        }
        if (obj == 0) {
            return f4551f;
        }
        if (obj instanceof Integer) {
            return iVar.fold(new x(((Number) obj).intValue(), iVar), v.f4580v);
        }
        AbstractC0487g.q(obj);
        throw null;
    }
}
