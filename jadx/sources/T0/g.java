package T0;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Animation {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4620s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f4621t;

    public /* synthetic */ g(SwipeRefreshLayout swipeRefreshLayout, int i10) {
        this.f4620s = i10;
        this.f4621t = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f4620s) {
            case 0:
                this.f4621t.setAnimationProgress(f10);
                break;
            case 1:
                this.f4621t.setAnimationProgress(1.0f - f10);
                break;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = this.f4621t;
                int iAbs = swipeRefreshLayout.P - Math.abs(swipeRefreshLayout.f7162O);
                int i10 = swipeRefreshLayout.f7161N;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((i10 + ((int) ((iAbs - i10) * f10))) - swipeRefreshLayout.f7159L.getTop());
                e eVar = swipeRefreshLayout.f7164R;
                float f11 = 1.0f - f10;
                d dVar = eVar.f4613s;
                if (f11 != dVar.f4604p) {
                    dVar.f4604p = f11;
                }
                eVar.invalidateSelf();
                break;
            default:
                this.f4621t.k(f10);
                break;
        }
    }
}
