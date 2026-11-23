package p206v3;

import U.U;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
import p091j3.C;

/* JADX INFO: loaded from: classes.dex */
public final class e extends LinearLayout {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f15426u = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ValueAnimator f15427s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TabLayout f15428t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TabLayout tabLayout, Context context) {
        super(context);
        this.f15428t = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i10) {
        TabLayout tabLayout = this.f15428t;
        if (tabLayout.f9843i0 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i10);
            p053f4.e eVar = tabLayout.c0;
            Drawable drawable = tabLayout.f9821G;
            eVar.getClass();
            RectF rectFO = p053f4.e.o(tabLayout, childAt);
            drawable.setBounds((int) rectFO.left, drawable.getBounds().top, (int) rectFO.right, drawable.getBounds().bottom);
            tabLayout.f9845s = i10;
        }
    }

    public final void b(int i10) {
        TabLayout tabLayout = this.f15428t;
        Rect bounds = tabLayout.f9821G.getBounds();
        tabLayout.f9821G.setBounds(bounds.left, 0, bounds.right, i10);
        requestLayout();
    }

    public final void c(View view, View view2, float f10) {
        TabLayout tabLayout = this.f15428t;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.f9821G;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f9821G.getBounds().bottom);
        } else {
            tabLayout.c0.r(tabLayout, view, view2, f10, tabLayout.f9821G);
        }
        WeakHashMap weakHashMap = U.a;
        postInvalidateOnAnimation();
    }

    public final void d(int i10, int i11, boolean z6) {
        TabLayout tabLayout = this.f15428t;
        if (tabLayout.f9845s == i10) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i10);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f9845s = i10;
        d dVar = new d(this, childAt, childAt2);
        if (!z6) {
            this.f15427s.removeAllUpdateListeners();
            this.f15427s.addUpdateListener(dVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f15427s = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.f9839d0);
        valueAnimator.setDuration(i11);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(dVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f15428t;
        int iHeight = tabLayout.f9821G.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.f9821G.getIntrinsicHeight();
        }
        int i10 = tabLayout.f9832S;
        if (i10 == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i10 != 1) {
            height = 0;
            if (i10 != 2) {
                iHeight = i10 != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.f9821G.getBounds().width() > 0) {
            Rect bounds = tabLayout.f9821G.getBounds();
            tabLayout.f9821G.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.f9821G.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        ValueAnimator valueAnimator = this.f15427s;
        TabLayout tabLayout = this.f15428t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.f9845s == -1) {
            tabLayout.f9845s = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.f9845s);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f15428t;
        boolean z6 = true;
        if (tabLayout.f9830Q == 1 || tabLayout.f9833T == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) C.e(getContext(), 16)) * 2)) {
                boolean z10 = false;
                for (int i13 = 0; i13 < childCount; i13++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z10 = true;
                    }
                }
                z6 = z10;
            } else {
                tabLayout.f9830Q = 0;
                tabLayout.m(false);
            }
            if (z6) {
                super.onMeasure(i10, i11);
            }
        }
    }
}
