package p078i;

import U.C0417d0;
import U.U;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12115s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D f12116t;

    public /* synthetic */ r(D d3, int i10) {
        this.f12115s = i10;
        this.f12116t = d3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f12115s) {
            case 0:
                D d3 = this.f12116t;
                if ((d3.f11960r0 & 1) != 0) {
                    d3.v(0);
                }
                if ((d3.f11960r0 & 4096) != 0) {
                    d3.v(108);
                }
                d3.f11959q0 = false;
                d3.f11960r0 = 0;
                break;
            default:
                D d8 = this.f12116t;
                d8.f11934O.showAtLocation(d8.f11933N, 55, 0, 0);
                C0417d0 c0417d0 = d8.f11935Q;
                if (c0417d0 != null) {
                    c0417d0.b();
                }
                if (!(d8.f11936R && (viewGroup = d8.f11937S) != null && viewGroup.isLaidOut())) {
                    d8.f11933N.setAlpha(1.0f);
                    d8.f11933N.setVisibility(0);
                } else {
                    d8.f11933N.setAlpha(0.0f);
                    C0417d0 c0417d0A = U.a(d8.f11933N);
                    c0417d0A.a(1.0f);
                    d8.f11935Q = c0417d0A;
                    c0417d0A.d(new u(this, 0));
                }
                break;
        }
    }
}
