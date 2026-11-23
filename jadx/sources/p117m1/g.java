package p117m1;

import B7.a;
import N1.q;
import Y1.c;
import android.content.Context;
import android.net.ConnectivityManager;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f13067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f13068g;

    public g(Context context, c cVar) {
        super(context, cVar);
        Object systemService = this.a.getSystemService("connectivity");
        i.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f13067f = (ConnectivityManager) systemService;
        this.f13068g = new q(this, 1);
    }

    @Override // B7.a
    public final Object b() {
        return h.a(this.f13067f);
    }

    @Override // B7.a
    public final void g() {
        try {
            p050f1.q qVarA = p050f1.q.a();
            int i10 = h.a;
            qVarA.getClass();
            p147p1.i.a(this.f13067f, this.f13068g);
        } catch (IllegalArgumentException unused) {
            p050f1.q qVarA2 = p050f1.q.a();
            int i11 = h.a;
            qVarA2.getClass();
        } catch (SecurityException unused2) {
            p050f1.q qVarA3 = p050f1.q.a();
            int i12 = h.a;
            qVarA3.getClass();
        }
    }

    @Override // B7.a
    public final void h() {
        try {
            p050f1.q qVarA = p050f1.q.a();
            int i10 = h.a;
            qVarA.getClass();
            p147p1.g.c(this.f13067f, this.f13068g);
        } catch (IllegalArgumentException unused) {
            p050f1.q qVarA2 = p050f1.q.a();
            int i11 = h.a;
            qVarA2.getClass();
        } catch (SecurityException unused2) {
            p050f1.q qVarA3 = p050f1.q.a();
            int i12 = h.a;
            qVarA3.getClass();
        }
    }
}
