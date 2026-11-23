package J0;

import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class B {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BaseInterpolator f2222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2223f;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.f2221d;
        if (i10 >= 0) {
            this.f2221d = -1;
            recyclerView.Q(i10);
            this.f2223f = false;
        } else if (this.f2223f) {
            BaseInterpolator baseInterpolator = this.f2222e;
            if (baseInterpolator != null && this.f2220c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f2220c;
            if (i11 < 1) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView.f6983w0.c(this.a, this.f2219b, i11, baseInterpolator);
            this.f2223f = false;
        }
    }
}
