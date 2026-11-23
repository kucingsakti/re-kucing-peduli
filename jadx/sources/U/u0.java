package U;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class u0 extends t0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public L.c f4856m;

    public u0(B0 b3, WindowInsets windowInsets) {
        super(b3, windowInsets);
        this.f4856m = null;
    }

    @Override // U.y0
    public B0 b() {
        return B0.h(null, this.f4851c.consumeStableInsets());
    }

    @Override // U.y0
    public B0 c() {
        return B0.h(null, this.f4851c.consumeSystemWindowInsets());
    }

    @Override // U.y0
    public final L.c h() {
        if (this.f4856m == null) {
            WindowInsets windowInsets = this.f4851c;
            this.f4856m = L.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f4856m;
    }

    @Override // U.y0
    public boolean m() {
        return this.f4851c.isConsumed();
    }

    @Override // U.y0
    public void q(L.c cVar) {
        this.f4856m = cVar;
    }
}
