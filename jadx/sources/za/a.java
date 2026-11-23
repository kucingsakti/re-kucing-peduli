package za;

import A1.J;
import J7.j;
import J7.k;
import io.reactivex.exceptions.CompositeException;
import p068ga.l;
import p102k7.e;
import ya.C0898t;
import ya.InterfaceC0882c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16339c;

    public /* synthetic */ a(Object obj, int i10) {
        this.f16338b = i10;
        this.f16339c = obj;
    }

    @Override // J7.j
    public final void V(k kVar) {
        boolean z6;
        switch (this.f16338b) {
            case 0:
                ((a) this.f16339c).U(new J(kVar, 10));
                break;
            case 1:
                ((a) this.f16339c).U(new e(kVar));
                break;
            default:
                InterfaceC0882c interfaceC0882cClone = ((C0898t) this.f16339c).clone();
                b bVar = new b(interfaceC0882cClone);
                kVar.b(bVar);
                if (!bVar.f16341t) {
                    try {
                        Object objC = ((C0898t) interfaceC0882cClone).c();
                        if (!bVar.f16341t) {
                            kVar.d(objC);
                        }
                        if (!bVar.f16341t) {
                            try {
                                kVar.a();
                                break;
                            } catch (Throwable th) {
                                th = th;
                                z6 = true;
                                l.n(th);
                                if (z6) {
                                    j.y(th);
                                    return;
                                }
                                if (bVar.f16341t) {
                                    return;
                                }
                                try {
                                    kVar.onError(th);
                                    return;
                                } catch (Throwable th2) {
                                    l.n(th2);
                                    j.y(new CompositeException(th, th2));
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z6 = false;
                    }
                }
                break;
        }
    }
}
