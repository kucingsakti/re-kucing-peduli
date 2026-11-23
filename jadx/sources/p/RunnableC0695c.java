package p;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: p.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0695c implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14044s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f14045t;

    public /* synthetic */ RunnableC0695c(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f14044s = i10;
        this.f14045t = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14044s) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f14045t;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f6115O = actionBarOverlayLayout.f6123v.animate().translationY(0.0f).setListener(actionBarOverlayLayout.P);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f14045t;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f6115O = actionBarOverlayLayout2.f6123v.animate().translationY(-actionBarOverlayLayout2.f6123v.getHeight()).setListener(actionBarOverlayLayout2.P);
                break;
        }
    }
}
