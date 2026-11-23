package N9;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class G extends U9.h {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3412u;

    public G(int i10) {
        super(0L, U9.j.f5056g);
        this.f3412u = i10;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract p123m8.d c();

    public Throwable d(Object obj) {
        C0333p c0333p = obj instanceof C0333p ? (C0333p) obj : null;
        if (c0333p != null) {
            return c0333p.a;
        }
        return null;
    }

    public final void k(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C8.E.e(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        p210v8.i.c(th);
        AbstractC0342z.l(c().getContext(), new F8.p0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object m();

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var;
        Object objD = p076h8.m.a;
        G9.p pVar = this.f5049t;
        try {
            p123m8.d dVarC = c();
            p210v8.i.d(dVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            S9.g gVar = (S9.g) dVarC;
            p144o8.c cVar = gVar.f4557w;
            Object obj = gVar.f4559y;
            p123m8.i context = cVar.getContext();
            Object objK = S9.a.k(context, obj);
            x0 x0VarV = objK != S9.a.f4551f ? AbstractC0342z.v(cVar, context, objK) : null;
            try {
                p123m8.i context2 = cVar.getContext();
                Object objM = m();
                Throwable thD = d(objM);
                if (thD == null) {
                    int i10 = this.f3412u;
                    boolean z6 = true;
                    if (i10 != 1 && i10 != 2) {
                        z6 = false;
                    }
                    if (z6) {
                        c0Var = (c0) context2.get(b0.f3440s);
                    } else {
                        c0Var = null;
                    }
                } else {
                    c0Var = null;
                }
                if (c0Var != null && !c0Var.a()) {
                    CancellationException cancellationExceptionT = ((k0) c0Var).t();
                    b(objM, cancellationExceptionT);
                    cVar.resumeWith(J7.a.d(cancellationExceptionT));
                } else if (thD != null) {
                    cVar.resumeWith(J7.a.d(thD));
                } else {
                    cVar.resumeWith(e(objM));
                }
                if (x0VarV == null || x0VarV.R()) {
                    S9.a.f(context, objK);
                }
                try {
                    pVar.getClass();
                } catch (Throwable th) {
                    objD = J7.a.d(th);
                }
                k(null, p076h8.h.a(objD));
            } catch (Throwable th2) {
                if (x0VarV == null || x0VarV.R()) {
                    S9.a.f(context, objK);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                pVar.getClass();
            } catch (Throwable th4) {
                objD = J7.a.d(th4);
            }
            k(th3, p076h8.h.a(objD));
        }
    }

    public Object e(Object obj) {
        return obj;
    }
}
