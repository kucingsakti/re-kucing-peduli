package p082i4;

import D3.g;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import o1.r;
import p092j4.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12266s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f12267t;

    public /* synthetic */ b(c cVar, int i10) {
        this.f12266s = i10;
        this.f12267t = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVarT;
        a aVarI;
        switch (this.f12266s) {
            case 0:
                this.f12267t.b();
                return;
            case 1:
                this.f12267t.b();
                return;
            default:
                c cVar = this.f12267t;
                cVar.getClass();
                synchronized (c.f12268m) {
                    try {
                        g gVar = cVar.a;
                        gVar.a();
                        r rVarC = r.c(gVar.a);
                        try {
                            aVarT = cVar.f12270c.t();
                            if (rVarC != null) {
                                rVarC.u();
                            }
                        } catch (Throwable th) {
                            if (rVarC != null) {
                                rVarC.u();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i10 = aVarT.f12498b;
                    if (i10 == 5) {
                        aVarI = cVar.i(aVarT);
                    } else {
                        if (i10 == 3) {
                            aVarI = cVar.i(aVarT);
                        } else if (!cVar.f12271d.a(aVarT)) {
                            return;
                        } else {
                            aVarI = cVar.c(aVarT);
                        }
                    }
                    cVar.f(aVarI);
                    cVar.m(aVarT, aVarI);
                    if (aVarI.f12498b == 4) {
                        cVar.l(aVarI.a);
                    }
                    int i11 = aVarI.f12498b;
                    if (i11 == 5) {
                        cVar.j(new FirebaseInstallationsException());
                        return;
                    } else if (i11 == 2 || i11 == 1) {
                        cVar.j(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.k(aVarI);
                        return;
                    }
                } catch (FirebaseInstallationsException e10) {
                    cVar.j(e10);
                    return;
                }
        }
    }
}
