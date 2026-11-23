package com.google.android.material.appbar;

import C8.E;
import J0.C0256f;
import J7.j;
import S2.d;
import S2.e;
import S2.g;
import U.B0;
import U.H;
import U.InterfaceC0428n;
import U.U;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.internal.measurement.S;
import com.google.android.material.appbar.AppBarLayout;
import com.kcstream.cing.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p068ga.l;
import p091j3.C;
import p212w.i;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements G.a {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f9398Q = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f9399A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9400B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9401C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f9402D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public WeakReference f9403E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f9404F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ValueAnimator f9405G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f9406H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final ArrayList f9407I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final long f9408J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final TimeInterpolator f9409K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int[] f9410L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Drawable f9411M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Integer f9412N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final float f9413O;
    public Behavior P;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9414s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9415t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9416u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9417v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9418w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9419x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public B0 f9420y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9421z;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends e {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout z(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) arrayList.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // G.b
        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // G.b
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            G.b bVar = ((G.e) view2.getLayoutParams()).a;
            if (bVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVar).f9422B) + this.f4524w) - y(view2);
                WeakHashMap weakHashMap = U.a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f9401C) {
                return false;
            }
            appBarLayout.e(appBarLayout.f(view));
            return false;
        }

        @Override // G.b
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                U.n(coordinatorLayout, null);
            }
        }

        @Override // G.b
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z6) {
            AppBarLayout appBarLayoutZ = z(coordinatorLayout.k(view));
            if (appBarLayoutZ != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f4522u;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutZ.d(false, !z6, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q2.a.f4000K);
            this.f4525x = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        Integer numValueOf;
        super(p225x3.a.a(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.f9415t = -1;
        this.f9416u = -1;
        this.f9417v = -1;
        this.f9419x = 0;
        this.f9407I = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i10 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayI = C.i(context3, attributeSet, g.a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayI.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayI.getResourceId(0, 0)));
            }
            typedArrayI.recycle();
            TypedArray typedArrayI2 = C.i(context2, attributeSet, Q2.a.a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayI2.getDrawable(0);
            WeakHashMap weakHashMap = U.a;
            setBackground(drawable);
            final ColorStateList colorStateListN = E.n(context2, typedArrayI2, 6);
            this.f9404F = colorStateListN != null;
            final ColorStateList colorStateListI = p086i8.C.i(getBackground());
            if (colorStateListI != null) {
                final p170r3.g gVar = new p170r3.g();
                gVar.l(colorStateListI);
                if (colorStateListN != null) {
                    Context context4 = getContext();
                    TypedValue typedValueB = C4.a.B(context4, R.attr.colorSurface);
                    if (typedValueB != null) {
                        int i11 = typedValueB.resourceId;
                        numValueOf = Integer.valueOf(i11 != 0 ? J.b.a(context4, i11) : typedValueB.data);
                    } else {
                        numValueOf = null;
                    }
                    final Integer num = numValueOf;
                    this.f9406H = new ValueAnimator.AnimatorUpdateListener() { // from class: S2.a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num2;
                            int i12 = AppBarLayout.f9398Q;
                            AppBarLayout appBarLayout = this.a;
                            int iN = J7.a.n(colorStateListI.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateListN.getDefaultColor());
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iN);
                            p170r3.g gVar2 = gVar;
                            gVar2.l(colorStateListValueOf);
                            if (appBarLayout.f9411M != null && (num2 = appBarLayout.f9412N) != null && num2.equals(num)) {
                                M.a.g(appBarLayout.f9411M, iN);
                            }
                            ArrayList arrayList = appBarLayout.f9407I;
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    throw new ClassCastException();
                                }
                                if (gVar2.f14501s.f14472c != null) {
                                    throw null;
                                }
                            }
                        }
                    };
                    setBackground(gVar);
                } else {
                    gVar.j(context2);
                    this.f9406H = new ValueAnimator.AnimatorUpdateListener() { // from class: S2.b
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i12 = AppBarLayout.f9398Q;
                            AppBarLayout appBarLayout = this.a;
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            gVar.k(fFloatValue);
                            Drawable drawable2 = appBarLayout.f9411M;
                            if (drawable2 instanceof p170r3.g) {
                                ((p170r3.g) drawable2).k(fFloatValue);
                            }
                            Iterator it = appBarLayout.f9407I.iterator();
                            if (it.hasNext()) {
                                throw E0.a.e(it);
                            }
                        }
                    };
                    setBackground(gVar);
                }
            }
            this.f9408J = j.C(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f9409K = j.D(context2, R.attr.motionEasingStandardInterpolator, R2.a.a);
            if (typedArrayI2.hasValue(4)) {
                d(typedArrayI2.getBoolean(4, false), false, false);
            }
            if (typedArrayI2.hasValue(3)) {
                g.a(this, typedArrayI2.getDimensionPixelSize(3, 0));
            }
            if (i10 >= 26) {
                if (typedArrayI2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayI2.getBoolean(2, false));
                }
                if (typedArrayI2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayI2.getBoolean(1, false));
                }
            }
            this.f9413O = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f9401C = typedArrayI2.getBoolean(5, false);
            this.f9402D = typedArrayI2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayI2.getDrawable(8));
            typedArrayI2.recycle();
            H.u(this, new p040e1.j(this, 27));
        } catch (Throwable th) {
            typedArrayI.recycle();
            throw th;
        }
    }

    public static S2.c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            S2.c cVar = new S2.c((LinearLayout.LayoutParams) layoutParams);
            cVar.a = 1;
            return cVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            S2.c cVar2 = new S2.c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar2.a = 1;
            return cVar2;
        }
        S2.c cVar3 = new S2.c(layoutParams);
        cVar3.a = 1;
        return cVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S2.c generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        S2.c cVar = new S2.c(context, attributeSet);
        cVar.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q2.a.f4008b);
        cVar.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        cVar.f4513b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new S(10);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            cVar.f4514c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    public final void c() {
        Behavior behavior = this.P;
        BaseBehavior.SavedState savedStateF = (behavior == null || this.f9415t == -1 || this.f9419x != 0) ? null : behavior.F(AbsSavedState.f6381t, this);
        this.f9415t = -1;
        this.f9416u = -1;
        this.f9417v = -1;
        if (savedStateF != null) {
            Behavior behavior2 = this.P;
            if (behavior2.f9425E != null) {
                return;
            }
            behavior2.f9425E = savedStateF;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof S2.c;
    }

    public final void d(boolean z6, boolean z10, boolean z11) {
        this.f9419x = (z6 ? 1 : 2) | (z10 ? 4 : 0) | (z11 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f9411M == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f9414s);
        this.f9411M.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9411M;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z6) {
        if (this.f9421z || this.f9400B == z6) {
            return false;
        }
        this.f9400B = z6;
        refreshDrawableState();
        if (!(getBackground() instanceof p170r3.g)) {
            return true;
        }
        if (this.f9404F) {
            g(z6 ? 0.0f : 1.0f, z6 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f9401C) {
            return true;
        }
        float f10 = this.f9413O;
        g(z6 ? 0.0f : f10, z6 ? f10 : 0.0f);
        return true;
    }

    public final boolean f(View view) {
        int i10;
        if (this.f9403E == null && (i10 = this.f9402D) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f9402D);
            }
            if (viewFindViewById != null) {
                this.f9403E = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f9403E;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void g(float f10, float f11) {
        ValueAnimator valueAnimator = this.f9405G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f9405G = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f9408J);
        this.f9405G.setInterpolator(this.f9409K);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f9406H;
        if (animatorUpdateListener != null) {
            this.f9405G.addUpdateListener(animatorUpdateListener);
        }
        this.f9405G.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        S2.c cVar = new S2.c(-1, -2);
        cVar.a = 1;
        return cVar;
    }

    @Override // G.a
    public G.b getBehavior() {
        Behavior behavior = new Behavior();
        this.P = behavior;
        return behavior;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i10 = this.f9416u;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                S2.c cVar = (S2.c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = cVar.a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        WeakHashMap weakHashMap = U.a;
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i12 & 2) != 0) {
                            WeakHashMap weakHashMap2 = U.a;
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i13 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap weakHashMap3 = U.a;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i11 += iMin;
                    }
                    iMin = minimumHeight + i13;
                    if (childCount == 0) {
                        WeakHashMap weakHashMap4 = U.a;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f9416u = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f9417v;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                S2.c cVar = (S2.c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i12 = cVar.a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i12 & 2) != 0) {
                    WeakHashMap weakHashMap = U.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f9417v = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f9402D;
    }

    public p170r3.g getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof p170r3.g) {
            return (p170r3.g) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = U.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f9419x;
    }

    public Drawable getStatusBarForeground() {
        return this.f9411M;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        B0 b3 = this.f9420y;
        if (b3 != null) {
            return b3.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f9415t;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                S2.c cVar = (S2.c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = cVar.a;
                if ((i12 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + minimumHeight;
                if (i11 == 0) {
                    WeakHashMap weakHashMap = U.a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i12 & 2) != 0) {
                    WeakHashMap weakHashMap2 = U.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f9415t = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        D3.b.F(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f9410L == null) {
            this.f9410L = new int[4];
        }
        int[] iArr = this.f9410L;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z6 = this.f9399A;
        iArr[0] = z6 ? R.attr.state_liftable : -2130969782;
        iArr[1] = (z6 && this.f9400B) ? R.attr.state_lifted : -2130969783;
        iArr[2] = z6 ? R.attr.state_collapsible : -2130969778;
        iArr[3] = (z6 && this.f9400B) ? R.attr.state_collapsed : -2130969777;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f9403E;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f9403E = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        boolean z10 = true;
        super.onLayout(z6, i10, i11, i12, i13);
        WeakHashMap weakHashMap = U.a;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.f9418w = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            if (((S2.c) getChildAt(i14).getLayoutParams()).f4514c != null) {
                this.f9418w = true;
                break;
            }
        }
        Drawable drawable = this.f9411M;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f9421z) {
            return;
        }
        if (!this.f9401C) {
            int childCount3 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount3) {
                    z10 = false;
                    break;
                }
                int i16 = ((S2.c) getChildAt(i15).getLayoutParams()).a;
                if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        if (this.f9399A != z10) {
            this.f9399A = z10;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = U.a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = p181s3.a.e(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        c();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        D3.b.C(this, f10);
    }

    public void setExpanded(boolean z6) {
        WeakHashMap weakHashMap = U.a;
        d(z6, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z6) {
        this.f9401C = z6;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f9402D = -1;
        if (view != null) {
            this.f9403E = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.f9403E;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f9403E = null;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f9402D = i10;
        WeakReference weakReference = this.f9403E;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f9403E = null;
    }

    public void setLiftableOverrideEnabled(boolean z6) {
        this.f9421z = z6;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f9411M;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f9411M = drawableMutate;
            if (drawableMutate instanceof p170r3.g) {
                numValueOf = Integer.valueOf(((p170r3.g) drawableMutate).f14498M);
            } else {
                ColorStateList colorStateListI = p086i8.C.i(drawableMutate);
                if (colorStateListI != null) {
                    numValueOf = Integer.valueOf(colorStateListI.getDefaultColor());
                }
            }
            this.f9412N = numValueOf;
            Drawable drawable3 = this.f9411M;
            boolean z6 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f9411M.setState(getDrawableState());
                }
                Drawable drawable4 = this.f9411M;
                WeakHashMap weakHashMap = U.a;
                M.b.b(drawable4, getLayoutDirection());
                this.f9411M.setVisible(getVisibility() == 0, false);
                this.f9411M.setCallback(this);
            }
            if (this.f9411M != null && getTopInset() > 0) {
                z6 = true;
            }
            setWillNotDraw(!z6);
            WeakHashMap weakHashMap2 = U.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(l.g(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        g.a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z6 = i10 == 0;
        Drawable drawable = this.f9411M;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9411M;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends d {

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f9422B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f9423C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public ValueAnimator f9424D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public SavedState f9425E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public WeakReference f9426F;

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new c();

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public boolean f9427u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public boolean f9428v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f9429w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public float f9430x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public boolean f9431y;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f9427u = parcel.readByte() != 0;
                this.f9428v = parcel.readByte() != 0;
                this.f9429w = parcel.readInt();
                this.f9430x = parcel.readFloat();
                this.f9431y = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f9427u ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f9428v ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f9429w);
                parcel.writeFloat(this.f9430x);
                parcel.writeByte(this.f9431y ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.f4519x = -1;
            this.f4521z = -1;
        }

        public static View B(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            baseBehavior.getClass();
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((G.e) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof InterfaceC0428n) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        public static void H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z6) {
            View childAt;
            boolean zF;
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i12);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i12++;
                }
            }
            if (childAt != null) {
                int i13 = ((S2.c) childAt.getLayoutParams()).a;
                if ((i13 & 1) != 0) {
                    WeakHashMap weakHashMap = U.a;
                    int minimumHeight = childAt.getMinimumHeight();
                    if (i11 <= 0 || (i13 & 12) == 0 ? (i13 & 2) == 0 || (-i10) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i10) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zF = false;
                    } else {
                        zF = true;
                    }
                } else {
                    zF = false;
                }
            } else {
                zF = false;
            }
            if (appBarLayout.f9401C) {
                zF = appBarLayout.f(D(coordinatorLayout));
            }
            boolean zE = appBarLayout.e(zF);
            if (!z6) {
                if (zE) {
                    List list = (List) ((i) coordinatorLayout.f6322t.f13633t).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.f6324v;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        G.b bVar = ((G.e) ((View) arrayList.get(i14)).getLayoutParams()).a;
                        if (bVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) bVar).f4525x == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(y() - i10);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iY = y();
            if (iY == i10) {
                ValueAnimator valueAnimator = this.f9424D;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f9424D.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f9424D;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f9424D = valueAnimator3;
                valueAnimator3.setInterpolator(R2.a.f4444e);
                this.f9424D.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f9424D.setDuration(Math.min(iRound, 600));
            this.f9424D.setIntValues(iY, i10);
            this.f9424D.start();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i11;
            int downNestedPreScrollRange;
            if (i10 == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i10 < 0) {
                    i11 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i11;
                } else {
                    i11 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i12 = i11;
                int i13 = downNestedPreScrollRange;
                if (i12 != i13) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = z(coordinatorLayout, appBarLayout2, y() - i10, i12, i13);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.f9401C) {
                appBarLayout2.e(appBarLayout2.f(view));
            }
        }

        public final SavedState F(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iW = w();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + iW;
                if (childAt.getTop() + iW <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f6381t;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z6 = iW == 0;
                    savedState.f9428v = z6;
                    savedState.f9427u = !z6 && (-iW) >= appBarLayout.getTotalScrollRange();
                    savedState.f9429w = i10;
                    WeakHashMap weakHashMap = U.a;
                    savedState.f9431y = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    savedState.f9430x = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iY = y() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                S2.c cVar = (S2.c) childAt.getLayoutParams();
                if ((cVar.a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i11 = -iY;
                if (top <= i11 && bottom >= i11) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i10);
                S2.c cVar2 = (S2.c) childAt2.getLayoutParams();
                int i12 = cVar2.a;
                if ((i12 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i10 == 0) {
                        WeakHashMap weakHashMap = U.a;
                        if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            topInset -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i12 & 2) == 2) {
                        WeakHashMap weakHashMap2 = U.a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i12 & 5) == 5) {
                        WeakHashMap weakHashMap3 = U.a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iY < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i12 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (iY < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    C(coordinatorLayout, appBarLayout, p181s3.a.e(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // S2.f, G.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f9425E;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z6 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z6) {
                            C(coordinatorLayout, appBarLayout, i11);
                        } else {
                            A(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z6) {
                            C(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f9427u) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f9428v) {
                A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f9429w);
                int i12 = -childAt.getBottom();
                if (this.f9425E.f9431y) {
                    WeakHashMap weakHashMap = U.a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i12;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f9425E.f9430x) + i12;
                }
                A(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f9419x = 0;
            this.f9425E = null;
            int iE = p181s3.a.e(w(), -appBarLayout.getTotalScrollRange(), 0);
            C0256f c0256f = this.f4526s;
            if (c0256f == null) {
                this.f4527t = iE;
            } else if (c0256f.f2304c != iE) {
                c0256f.f2304c = iE;
                c0256f.c();
            }
            H(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.f9414s = w();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap weakHashMap2 = U.a;
                appBarLayout.postInvalidateOnAnimation();
            }
            if (U.d(coordinatorLayout) != null) {
                return true;
            }
            U.n(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // G.b
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((G.e) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.r(i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // G.b
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        @Override // G.b
        public final void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout, y() - i12, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i12 == 0 && U.d(coordinatorLayout2) == null) {
                U.n(coordinatorLayout2, new b(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // G.b
        public final void r(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.f9425E = (SavedState) parcelable;
            } else {
                this.f9425E = null;
            }
        }

        @Override // G.b
        public final Parcelable s(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedStateF = F(absSavedState, (AppBarLayout) view);
            return savedStateF == null ? absSavedState : savedStateF;
        }

        @Override // G.b
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z6 = (i10 & 2) != 0 && (appBarLayout.f9401C || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z6 && (valueAnimator = this.f9424D) != null) {
                valueAnimator.cancel();
            }
            this.f9426F = null;
            this.f9423C = i11;
            return z6;
        }

        @Override // G.b
        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f9423C == 0 || i10 == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f9401C) {
                    appBarLayout.e(appBarLayout.f(view2));
                }
            }
            this.f9426F = new WeakReference(view2);
        }

        @Override // S2.d
        public final int y() {
            return w() + this.f9422B;
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:55:0x0148  */
        /* JADX WARN: Code duplicated, block: B:64:0x0167  */
        /* JADX WARN: Code duplicated, block: B:66:0x016e  */
        /* JADX WARN: Code duplicated, block: B:67:0x0170  */
        @Override // S2.d
        public final int z(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            int top;
            boolean z6;
            int i13;
            int i14;
            int i15;
            S s9;
            int topInset;
            int i16 = 1;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iY = y();
            int i17 = 0;
            if (i11 == 0 || iY < i11 || iY > i12) {
                this.f9422B = 0;
            } else {
                int iE = p181s3.a.e(i10, i11, i12);
                if (iY != iE) {
                    if (!appBarLayout.f9418w) {
                        top = iE;
                        break;
                    }
                    int iAbs = Math.abs(iE);
                    int childCount = appBarLayout.getChildCount();
                    int i18 = 0;
                    while (true) {
                        if (i18 < childCount) {
                            View childAt = appBarLayout.getChildAt(i18);
                            S2.c cVar = (S2.c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.f4514c;
                            if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i19 = cVar.a;
                                    if ((i19 & 1) != 0) {
                                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                                        if ((i19 & 2) != 0) {
                                            WeakHashMap weakHashMap = U.a;
                                            topInset -= childAt.getMinimumHeight();
                                        }
                                    } else {
                                        topInset = 0;
                                    }
                                    WeakHashMap weakHashMap2 = U.a;
                                    if (childAt.getFitsSystemWindows()) {
                                        topInset -= appBarLayout.getTopInset();
                                    }
                                    if (topInset > 0) {
                                        float f10 = topInset;
                                        top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f10) * f10)) * Integer.signum(iE);
                                        break;
                                    }
                                }
                            } else {
                                i18++;
                            }
                        }
                        top = iE;
                        break;
                    }
                    C0256f c0256f = this.f4526s;
                    if (c0256f != null) {
                        if (c0256f.f2304c != top) {
                            c0256f.f2304c = top;
                            c0256f.c();
                            z6 = true;
                        }
                        int i20 = iY - iE;
                        this.f9422B = iE - top;
                        if (z6) {
                            i15 = 0;
                            while (i15 < appBarLayout.getChildCount()) {
                                S2.c cVar2 = (S2.c) appBarLayout.getChildAt(i15).getLayoutParams();
                                s9 = cVar2.f4513b;
                                if (s9 == null && (cVar2.a & i16) != 0) {
                                    View childAt2 = appBarLayout.getChildAt(i15);
                                    float fW = w();
                                    Rect rect = (Rect) s9.f8359t;
                                    childAt2.getDrawingRect(rect);
                                    appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                    rect.offset(0, -appBarLayout.getTopInset());
                                    float fAbs = rect.top - Math.abs(fW);
                                    if (fAbs <= 0.0f) {
                                        float fD = 1.0f - p181s3.a.d(Math.abs(fAbs / rect.height()), 0.0f, 1.0f);
                                        float fHeight = (-fAbs) - ((rect.height() * 0.3f) * (1.0f - (fD * fD)));
                                        childAt2.setTranslationY(fHeight);
                                        Rect rect2 = (Rect) s9.f8360u;
                                        childAt2.getDrawingRect(rect2);
                                        rect2.offset(0, (int) (-fHeight));
                                        if (fHeight >= rect2.height()) {
                                            childAt2.setVisibility(4);
                                        } else {
                                            childAt2.setVisibility(0);
                                        }
                                        WeakHashMap weakHashMap3 = U.a;
                                        childAt2.setClipBounds(rect2);
                                    } else {
                                        WeakHashMap weakHashMap4 = U.a;
                                        childAt2.setClipBounds(null);
                                        childAt2.setTranslationY(0.0f);
                                        childAt2.setVisibility(0);
                                    }
                                }
                                i15++;
                                i16 = i16;
                            }
                        }
                        i13 = i16;
                        if (!z6 && appBarLayout.f9418w) {
                            coordinatorLayout.i(appBarLayout);
                        }
                        appBarLayout.f9414s = w();
                        if (!appBarLayout.willNotDraw()) {
                            WeakHashMap weakHashMap5 = U.a;
                            appBarLayout.postInvalidateOnAnimation();
                        }
                        if (iE < iY) {
                            i14 = -1;
                        } else {
                            i14 = i13;
                        }
                        H(coordinatorLayout, appBarLayout, iE, i14, false);
                        i17 = i20;
                    } else {
                        this.f4527t = top;
                    }
                    z6 = false;
                    int i21 = iY - iE;
                    this.f9422B = iE - top;
                    if (z6) {
                        i15 = 0;
                        while (i15 < appBarLayout.getChildCount()) {
                            S2.c cVar3 = (S2.c) appBarLayout.getChildAt(i15).getLayoutParams();
                            s9 = cVar3.f4513b;
                            if (s9 == null) {
                            }
                            i15++;
                            i16 = i16;
                        }
                    }
                    i13 = i16;
                    if (!z6) {
                        coordinatorLayout.i(appBarLayout);
                    }
                    appBarLayout.f9414s = w();
                    if (!appBarLayout.willNotDraw()) {
                        WeakHashMap weakHashMap6 = U.a;
                        appBarLayout.postInvalidateOnAnimation();
                    }
                    if (iE < iY) {
                        i14 = -1;
                    } else {
                        i14 = i13;
                    }
                    H(coordinatorLayout, appBarLayout, iE, i14, false);
                    i17 = i21;
                }
            }
            if (U.d(coordinatorLayout) != null) {
                return i17;
            }
            U.n(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return i17;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f4519x = -1;
            this.f4521z = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        S2.c cVar = new S2.c(-1, -2);
        cVar.a = 1;
        return cVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
