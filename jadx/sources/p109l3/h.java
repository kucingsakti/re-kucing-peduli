package p109l3;

import U.U;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Log;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.kcstream.cing.R;
import java.util.WeakHashMap;
import p031d.b;
import p178s0.a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f12924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f12925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f12926i;

    public h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f12924g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f12925h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f12926i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a() {
        if (this.f12918f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        b bVar = this.f12918f;
        this.f12918f = null;
        if (bVar == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f12914b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f12917e);
        animatorSet.start();
    }

    public final void b(b bVar, int i10, AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i11;
        boolean z6 = bVar.f10434d == 0;
        WeakHashMap weakHashMap = U.a;
        View view = this.f12914b;
        boolean z10 = (Gravity.getAbsoluteGravity(i10, view.getLayoutDirection()) & 3) == 3;
        float scaleX = view.getScaleX() * view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i11 = z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i11 = 0;
        }
        float f10 = scaleX + i11;
        Property property = View.TRANSLATION_X;
        if (z10) {
            f10 = -f10;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f10);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new a(1));
        objectAnimatorOfFloat.setDuration(R2.a.c(this.f12915c, bVar.f10433c, this.f12916d));
        objectAnimatorOfFloat.addListener(new g(this, z6, i10));
        objectAnimatorOfFloat.addListener(animatorListenerAdapter);
        objectAnimatorOfFloat.start();
    }

    public final void c(float f10, boolean z6, int i10) {
        float interpolation = this.a.getInterpolation(f10);
        WeakHashMap weakHashMap = U.a;
        View view = this.f12914b;
        boolean z10 = (Gravity.getAbsoluteGravity(i10, view.getLayoutDirection()) & 3) == 3;
        boolean z11 = z6 == z10;
        int width = view.getWidth();
        int height = view.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.f12924g / f11;
            float f14 = this.f12925h / f11;
            float f15 = this.f12926i / f12;
            if (z10) {
                f11 = 0.0f;
            }
            view.setPivotX(f11);
            if (!z11) {
                f14 = -f13;
            }
            float fA = R2.a.a(0.0f, f14, interpolation);
            float f16 = fA + 1.0f;
            view.setScaleX(f16);
            float fA2 = 1.0f - R2.a.a(0.0f, f15, interpolation);
            view.setScaleY(fA2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setPivotX(z10 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z11 ? 1.0f - fA : 1.0f;
                    float f18 = fA2 != 0.0f ? (f16 / fA2) * f17 : 1.0f;
                    childAt.setScaleX(f17);
                    childAt.setScaleY(f18);
                }
            }
        }
    }
}
