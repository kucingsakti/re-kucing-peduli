package S9;

import N9.AbstractC0334q;
import N9.AbstractC0337u;
import N9.AbstractC0342z;
import N9.C0333p;
import N9.G;
import N9.T;
import N9.s0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class g extends G implements p144o8.d, p123m8.d {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4555z = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AbstractC0337u f4556v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p144o8.c f4557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f4558x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f4559y;

    public g(AbstractC0337u abstractC0337u, p144o8.c cVar) {
        super(-1);
        this.f4556v = abstractC0337u;
        this.f4557w = cVar;
        this.f4558x = a.f4548c;
        Object objFold = cVar.getContext().fold(0, v.f4578t);
        p210v8.i.c(objFold);
        this.f4559y = objFold;
    }

    @Override // N9.G
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC0334q) {
            ((AbstractC0334q) obj).getClass();
            throw null;
        }
    }

    @Override // p144o8.d
    public final p144o8.d getCallerFrame() {
        p144o8.c cVar = this.f4557w;
        if (cVar instanceof p144o8.d) {
            return cVar;
        }
        return null;
    }

    @Override // p123m8.d
    public final p123m8.i getContext() {
        return this.f4557w.getContext();
    }

    @Override // N9.G
    public final Object m() {
        Object obj = this.f4558x;
        this.f4558x = a.f4548c;
        return obj;
    }

    @Override // p123m8.d
    public final void resumeWith(Object obj) {
        p144o8.c cVar = this.f4557w;
        p123m8.i context = cVar.getContext();
        Throwable thA = p076h8.h.a(obj);
        Object c0333p = thA == null ? obj : new C0333p(thA, false);
        AbstractC0337u abstractC0337u = this.f4556v;
        if (abstractC0337u.o()) {
            this.f4558x = c0333p;
            this.f3412u = 0;
            abstractC0337u.g(context, this);
            return;
        }
        T tA = s0.a();
        if (tA.f3430t >= 4294967296L) {
            this.f4558x = c0333p;
            this.f3412u = 0;
            tA.A(this);
            return;
        }
        tA.E(true);
        try {
            p123m8.i context2 = cVar.getContext();
            Object objK = a.k(context2, this.f4559y);
            try {
                cVar.resumeWith(obj);
                a.f(context2, objK);
                while (tA.H()) {
                }
            } catch (Throwable th) {
                a.f(context2, objK);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                k(th2, null);
            } finally {
                tA.t(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f4556v + ", " + AbstractC0342z.t(this.f4557w) + ']';
    }

    @Override // N9.G
    public final p123m8.d c() {
        return this;
    }
}
