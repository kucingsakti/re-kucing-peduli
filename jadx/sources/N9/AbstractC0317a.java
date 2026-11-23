package N9;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: renamed from: N9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0317a extends k0 implements p123m8.d, InterfaceC0341y {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p123m8.i f3436u;

    public AbstractC0317a(p123m8.i iVar, boolean z6) {
        super(z6);
        B((c0) iVar.get(b0.f3440s));
        this.f3436u = iVar.plus(this);
    }

    @Override // N9.k0
    public final void A(CompletionHandlerException completionHandlerException) {
        AbstractC0342z.l(this.f3436u, completionHandlerException);
    }

    @Override // N9.k0
    public final void K(Object obj) {
        if (obj instanceof C0333p) {
            C0333p c0333p = (C0333p) obj;
            Throwable th = c0333p.a;
            c0333p.getClass();
            C0333p.f3476b.get(c0333p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(int i10, AbstractC0317a abstractC0317a, p200u8.c cVar) {
        int iD = p239z.e.d(i10);
        if (iD == 0) {
            C3.a.p(cVar, abstractC0317a, this);
            return;
        }
        if (iD != 1) {
            if (iD == 2) {
                qa.b.q(((p144o8.a) cVar).create(abstractC0317a, this)).resumeWith(p076h8.m.a);
                return;
            }
            if (iD != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                p123m8.i iVar = this.f3436u;
                Object objK = S9.a.k(iVar, null);
                try {
                    p210v8.x.e(2, cVar);
                    Object objInvoke = cVar.invoke(abstractC0317a, this);
                    S9.a.f(iVar, objK);
                    if (objInvoke != p134n8.a.f13404s) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    S9.a.f(iVar, objK);
                    throw th;
                }
            } catch (Throwable th2) {
                resumeWith(J7.a.d(th2));
            }
        }
    }

    @Override // N9.InterfaceC0341y
    public final p123m8.i c() {
        return this.f3436u;
    }

    @Override // p123m8.d
    public final p123m8.i getContext() {
        return this.f3436u;
    }

    @Override // N9.k0
    public final String n() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p123m8.d
    public final void resumeWith(Object obj) {
        Throwable thA = p076h8.h.a(obj);
        if (thA != null) {
            obj = new C0333p(thA, false);
        }
        Object objG = G(obj);
        if (objG == AbstractC0342z.f3499e) {
            return;
        }
        e(objG);
    }
}
