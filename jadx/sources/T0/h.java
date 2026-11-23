package T0;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Animation {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4622s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f4623t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f4624u;

    public h(SwipeRefreshLayout swipeRefreshLayout, int i10, int i11) {
        this.f4624u = swipeRefreshLayout;
        this.f4622s = i10;
        this.f4623t = i11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        e eVar = this.f4624u.f7164R;
        int i10 = this.f4622s;
        eVar.setAlpha((int) (((this.f4623t - i10) * f10) + i10));
    }
}
