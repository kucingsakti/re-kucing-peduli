package J0;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: J0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0266p {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2348c;

    public AbstractC0266p(androidx.recyclerview.widget.w wVar) {
        this.a = Integer.MIN_VALUE;
        this.f2348c = new Rect();
        this.f2347b = wVar;
    }

    public static AbstractC0266p a(androidx.recyclerview.widget.w wVar, int i10) {
        if (i10 == 0) {
            return new C0265o(wVar, 0);
        }
        if (i10 == 1) {
            return new C0265o(wVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.a) {
            return 0;
        }
        return l() - this.a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i10);

    public AbstractC0266p(p106l0.f fVar) {
        this.a = 0;
        this.f2348c = new p106l0.c();
        this.f2347b = fVar;
    }
}
