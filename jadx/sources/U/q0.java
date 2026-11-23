package U;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f4844c;

    public q0() {
        this.f4844c = B2.a.e();
    }

    @Override // U.s0
    public B0 b() {
        a();
        B0 b0H = B0.h(null, this.f4844c.build());
        b0H.a.o(this.f4846b);
        return b0H;
    }

    @Override // U.s0
    public void d(L.c cVar) {
        this.f4844c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // U.s0
    public void e(L.c cVar) {
        this.f4844c.setStableInsets(cVar.d());
    }

    @Override // U.s0
    public void f(L.c cVar) {
        this.f4844c.setSystemGestureInsets(cVar.d());
    }

    @Override // U.s0
    public void g(L.c cVar) {
        this.f4844c.setSystemWindowInsets(cVar.d());
    }

    @Override // U.s0
    public void h(L.c cVar) {
        this.f4844c.setTappableElementInsets(cVar.d());
    }

    public q0(B0 b3) {
        WindowInsets.Builder builderE;
        super(b3);
        WindowInsets windowInsetsG = b3.g();
        if (windowInsetsG != null) {
            builderE = B2.a.f(windowInsetsG);
        } else {
            builderE = B2.a.e();
        }
        this.f4844c = builderE;
    }
}
