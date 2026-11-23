package com.google.android.material.behavior;

import B4.L;
import G.b;
import J7.j;
import R2.a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.kcstream.cing.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9473t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9474u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TimeInterpolator f9475v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TimeInterpolator f9476w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ViewPropertyAnimator f9479z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f9472s = new LinkedHashSet();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9477x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9478y = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // G.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f9477x = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f9473t = j.C(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f9474u = j.C(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f9475v = j.D(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, a.f4443d);
        this.f9476w = j.D(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, a.f4442c);
        return false;
    }

    @Override // G.b
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f9472s;
        if (i10 > 0) {
            if (this.f9478y == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f9479z;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f9478y = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw E0.a.e(it);
            }
            this.f9479z = view.animate().translationY(this.f9477x).setInterpolator(this.f9476w).setDuration(this.f9474u).setListener(new L(this, 2));
            return;
        }
        if (i10 >= 0 || this.f9478y == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f9479z;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f9478y = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw E0.a.e(it2);
        }
        this.f9479z = view.animate().translationY(0).setInterpolator(this.f9475v).setDuration(this.f9473t).setListener(new L(this, 2));
    }

    @Override // G.b
    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
