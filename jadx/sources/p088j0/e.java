package p088j0;

import A1.RunnableC0094c;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import p032d0.f;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p032d0.e {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f12352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RunnableC0094c f12353c = new RunnableC0094c(this, 26);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f12354d;

    public e(DrawerLayout drawerLayout, int i10) {
        this.f12354d = drawerLayout;
        this.a = i10;
    }

    @Override // p032d0.e
    public final int clampViewPositionHorizontal(View view, int i10, int i11) {
        DrawerLayout drawerLayout = this.f12354d;
        if (drawerLayout.b(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i10, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i10, width));
    }

    @Override // p032d0.e
    public final int clampViewPositionVertical(View view, int i10, int i11) {
        return view.getTop();
    }

    @Override // p032d0.e
    public final int getViewHorizontalDragRange(View view) {
        if (DrawerLayout.p(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // p032d0.e
    public final void onEdgeDragStarted(int i10, int i11) {
        int i12 = i10 & 1;
        DrawerLayout drawerLayout = this.f12354d;
        View viewF = i12 == 1 ? drawerLayout.f(3) : drawerLayout.f(5);
        if (viewF == null || drawerLayout.j(viewF) != 0) {
            return;
        }
        this.f12352b.b(viewF, i11);
    }

    @Override // p032d0.e
    public final boolean onEdgeLock(int i10) {
        return false;
    }

    @Override // p032d0.e
    public final void onEdgeTouched(int i10, int i11) {
        this.f12354d.postDelayed(this.f12353c, 160L);
    }

    @Override // p032d0.e
    public final void onViewCaptured(View view, int i10) {
        ((d) view.getLayoutParams()).f12350c = false;
        int i11 = this.a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f12354d;
        View viewF = drawerLayout.f(i11);
        if (viewF != null) {
            drawerLayout.c(viewF, true);
        }
    }

    @Override // p032d0.e
    public final void onViewDragStateChanged(int i10) {
        this.f12354d.x(this.f12352b.f10531t, i10);
    }

    @Override // p032d0.e
    public final void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f12354d;
        float width2 = (drawerLayout.b(view, 3) ? i10 + width : drawerLayout.getWidth() - i10) / width;
        drawerLayout.u(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // p032d0.e
    public final void onViewReleased(View view, float f10, float f11) {
        int i10;
        DrawerLayout drawerLayout = this.f12354d;
        int[] iArr = DrawerLayout.f6525V;
        float f12 = ((d) view.getLayoutParams()).f12349b;
        int width = view.getWidth();
        if (drawerLayout.b(view, 3)) {
            i10 = (f10 > 0.0f || (f10 == 0.0f && f12 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f10 < 0.0f || (f10 == 0.0f && f12 > 0.5f)) {
                width2 -= width;
            }
            i10 = width2;
        }
        this.f12352b.p(i10, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // p032d0.e
    public final boolean tryCaptureView(View view, int i10) {
        DrawerLayout drawerLayout = this.f12354d;
        return DrawerLayout.p(view) && drawerLayout.b(view, this.a) && drawerLayout.j(view) == 0;
    }
}
