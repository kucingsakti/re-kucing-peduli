package U;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class w0 extends v0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public L.c f4860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public L.c f4861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public L.c f4862p;

    public w0(B0 b3, WindowInsets windowInsets) {
        super(b3, windowInsets);
        this.f4860n = null;
        this.f4861o = null;
        this.f4862p = null;
    }

    @Override // U.y0
    public L.c g() {
        if (this.f4861o == null) {
            this.f4861o = L.c.c(this.f4851c.getMandatorySystemGestureInsets());
        }
        return this.f4861o;
    }

    @Override // U.y0
    public L.c i() {
        if (this.f4860n == null) {
            this.f4860n = L.c.c(this.f4851c.getSystemGestureInsets());
        }
        return this.f4860n;
    }

    @Override // U.y0
    public L.c k() {
        if (this.f4862p == null) {
            this.f4862p = L.c.c(this.f4851c.getTappableElementInsets());
        }
        return this.f4862p;
    }

    @Override // U.t0, U.y0
    public B0 l(int i10, int i11, int i12, int i13) {
        return B0.h(null, this.f4851c.inset(i10, i11, i12, i13));
    }

    @Override // U.u0, U.y0
    public void q(L.c cVar) {
    }
}
