package U2;

import U.U;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import o1.h;
import p032d0.e;
import p190t3.f;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4883b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f4884c;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4884c = swipeDismissBehavior;
    }

    @Override // p032d0.e
    public final int clampViewPositionHorizontal(View view, int i10, int i11) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = U.a;
        boolean z6 = view.getLayoutDirection() == 1;
        int i12 = this.f4884c.f9484w;
        if (i12 == 0) {
            if (z6) {
                width = this.a - view.getWidth();
                width2 = this.a;
            } else {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i12 != 1) {
            width = this.a - view.getWidth();
            width2 = view.getWidth() + this.a;
        } else if (z6) {
            width = this.a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.a - view.getWidth();
            width2 = this.a;
        }
        return Math.min(Math.max(width, i10), width2);
    }

    @Override // p032d0.e
    public final int clampViewPositionVertical(View view, int i10, int i11) {
        return view.getTop();
    }

    @Override // p032d0.e
    public final int getViewHorizontalDragRange(View view) {
        return view.getWidth();
    }

    @Override // p032d0.e
    public final void onViewCaptured(View view, int i10) {
        this.f4883b = i10;
        this.a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4884c;
            swipeDismissBehavior.f9483v = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f9483v = false;
        }
    }

    @Override // p032d0.e
    public final void onViewDragStateChanged(int i10) {
        p081i3.b bVar = this.f4884c.f9481t;
        if (bVar != null) {
            f fVar = (f) bVar.f12212t;
            if (i10 == 0) {
                h.g().p(fVar.f15206t);
            } else if (i10 == 1 || i10 == 2) {
                h.g().n(fVar.f15206t);
            }
        }
    }

    @Override // p032d0.e
    public final void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4884c;
        float f10 = width * swipeDismissBehavior.f9485x;
        float width2 = view.getWidth() * swipeDismissBehavior.f9486y;
        float fAbs = Math.abs(i10 - this.a);
        if (fAbs <= f10) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f10) / (width2 - f10))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    @Override // p032d0.e
    public final void onViewReleased(View view, float f10, float f11) {
        int i10;
        int left;
        int i11;
        p081i3.b bVar;
        this.f4883b = -1;
        int width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4884c;
        boolean z6 = true;
        if (f10 != 0.0f) {
            WeakHashMap weakHashMap = U.a;
            boolean z10 = view.getLayoutDirection() == 1;
            int i12 = swipeDismissBehavior.f9484w;
            if (i12 != 2 && (i12 != 0 ? i12 != 1 || (!z10 ? f10 < 0.0f : f10 > 0.0f) : !z10 ? f10 > 0.0f : f10 < 0.0f)) {
                i10 = this.a;
                z6 = false;
            } else if (f10 >= 0.0f) {
                left = view.getLeft();
                i11 = this.a;
                if (left < i11) {
                    i10 = this.a - width;
                } else {
                    i10 = i11 + width;
                }
            } else {
                i10 = this.a - width;
            }
        } else {
            if (Math.abs(view.getLeft() - this.a) < Math.round(view.getWidth() * 0.5f)) {
                i10 = this.a;
                z6 = false;
            } else if (f10 >= 0.0f) {
                left = view.getLeft();
                i11 = this.a;
                if (left < i11) {
                    i10 = this.a - width;
                } else {
                    i10 = i11 + width;
                }
            } else {
                i10 = this.a - width;
            }
        }
        if (swipeDismissBehavior.f9480s.p(i10, view.getTop())) {
            b bVar2 = new b(swipeDismissBehavior, view, z6);
            WeakHashMap weakHashMap2 = U.a;
            view.postOnAnimation(bVar2);
        } else {
            if (!z6 || (bVar = swipeDismissBehavior.f9481t) == null) {
                return;
            }
            bVar.E(view);
        }
    }

    @Override // p032d0.e
    public final boolean tryCaptureView(View view, int i10) {
        int i11 = this.f4883b;
        return (i11 == -1 || i11 == i10) && this.f4884c.w(view);
    }
}
