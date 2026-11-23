package U7;

import J7.j;
import com.tailoredapps.biometricauth.BiometricAuthenticationException;
import p068ga.l;

/* JADX INFO: loaded from: classes.dex */
public final class c extends J7.g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4910s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f4911t;

    public /* synthetic */ c(Object obj, int i10) {
        this.f4910s = i10;
        this.f4911t = obj;
    }

    @Override // J7.g
    public final void b(J7.i iVar) {
        switch (this.f4910s) {
            case 0:
                b bVar = new b(iVar);
                iVar.b(bVar);
                try {
                    ((o1.e) this.f4911t).Y0(bVar);
                } catch (Throwable th) {
                    l.n(th);
                    bVar.a(th);
                    return;
                }
                break;
            case 1:
                iVar.b(O7.c.f3610s);
                iVar.onError((BiometricAuthenticationException) this.f4911t);
                break;
            default:
                ((j) this.f4911t).U(new W7.a(iVar, 0));
                break;
        }
    }
}
