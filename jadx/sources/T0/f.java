package T0;

import C8.u;
import E4.B;
import J4.p;
import N9.AbstractC0342z;
import android.view.View;
import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.kcstream.cing.fragment.TabsRecentFragment;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Animation.AnimationListener {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f4619b;

    public /* synthetic */ f(SwipeRefreshLayout swipeRefreshLayout, int i10) {
        this.a = i10;
        this.f4619b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        j jVar;
        SwipeRefreshLayout swipeRefreshLayout = this.f4619b;
        switch (this.a) {
            case 0:
                if (!swipeRefreshLayout.f7176u) {
                    swipeRefreshLayout.l();
                } else {
                    swipeRefreshLayout.f7164R.setAlpha(255);
                    swipeRefreshLayout.f7164R.start();
                    if (swipeRefreshLayout.f7169W && (jVar = swipeRefreshLayout.f7175t) != null) {
                        B b3 = (B) jVar;
                        u[] uVarArr = TabsRecentFragment.f10260y0;
                        TabsRecentFragment tabsRecentFragment = (TabsRecentFragment) b3.f1350t;
                        p210v8.i.f(tabsRecentFragment, "this$0");
                        p210v8.i.f((View) b3.f1351u, "$view");
                        AbstractC0342z.n(tabsRecentFragment, null, new p(tabsRecentFragment, null), 3);
                    }
                    swipeRefreshLayout.f7153F = swipeRefreshLayout.f7159L.getTop();
                }
                break;
            default:
                swipeRefreshLayout.getClass();
                g gVar = new g(swipeRefreshLayout, 1);
                swipeRefreshLayout.f7166T = gVar;
                gVar.setDuration(150L);
                a aVar = swipeRefreshLayout.f7159L;
                aVar.f4587s = null;
                aVar.clearAnimation();
                swipeRefreshLayout.f7159L.startAnimation(swipeRefreshLayout.f7166T);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i10 = this.a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
