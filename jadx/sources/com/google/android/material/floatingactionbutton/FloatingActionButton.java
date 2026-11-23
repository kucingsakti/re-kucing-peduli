package com.google.android.material.floatingactionbutton;

import A1.q;
import B4.L;
import C8.E;
import G.e;
import G.f;
import J0.C0254d;
import R2.d;
import U.U;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p.r;
import p019b9.c;
import p072h3.a;
import p081i3.b;
import p081i3.i;
import p081i3.k;
import p091j3.AbstractC0667b;
import p091j3.C;
import p091j3.F;
import p170r3.g;
import p170r3.h;
import p170r3.j;
import p170r3.u;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends F implements a, u, G.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f9715A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f9716B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9717C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Rect f9718D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Rect f9719E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final q f9720F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final c f9721G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public k f9722H;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f9723t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f9724u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f9725v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PorterDuff.Mode f9726w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ColorStateList f9727x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9728y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9729z;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(p225x3.a.a(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        this.f12372s = getVisibility();
        this.f9718D = new Rect();
        this.f9719E = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = C.i(context2, attributeSet, Q2.a.f4019n, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f9723t = E.n(context2, typedArrayI, 1);
        this.f9724u = C.k(typedArrayI.getInt(2, -1), null);
        this.f9727x = E.n(context2, typedArrayI, 12);
        this.f9728y = typedArrayI.getInt(7, -1);
        this.f9729z = typedArrayI.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(3, 0);
        float dimension = typedArrayI.getDimension(4, 0.0f);
        float dimension2 = typedArrayI.getDimension(9, 0.0f);
        float dimension3 = typedArrayI.getDimension(11, 0.0f);
        this.f9717C = typedArrayI.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayI.getDimensionPixelSize(10, 0));
        d dVarA = d.a(context2, typedArrayI, 15);
        d dVarA2 = d.a(context2, typedArrayI, 8);
        h hVar = j.f14509m;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, Q2.a.f3991B, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        j jVarA = j.b(context2, resourceId, resourceId2, hVar).a();
        boolean z6 = typedArrayI.getBoolean(5, false);
        setEnabled(typedArrayI.getBoolean(0, true));
        typedArrayI.recycle();
        q qVar = new q(this);
        this.f9720F = qVar;
        qVar.e(attributeSet, R.attr.floatingActionButtonStyle);
        this.f9721G = new c(this);
        getImpl().n(jVarA);
        getImpl().g(this.f9723t, this.f9724u, this.f9727x, dimensionPixelSize);
        getImpl().f12248k = dimensionPixelSize2;
        i impl = getImpl();
        if (impl.f12246h != dimension) {
            impl.f12246h = dimension;
            impl.k(dimension, impl.f12247i, impl.j);
        }
        i impl2 = getImpl();
        if (impl2.f12247i != dimension2) {
            impl2.f12247i = dimension2;
            impl2.k(impl2.f12246h, dimension2, impl2.j);
        }
        i impl3 = getImpl();
        if (impl3.j != dimension3) {
            impl3.j = dimension3;
            impl3.k(impl3.f12246h, impl3.f12247i, dimension3);
        }
        getImpl().f12250m = dVarA;
        getImpl().f12251n = dVarA2;
        getImpl().f12244f = z6;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private i getImpl() {
        if (this.f9722H == null) {
            this.f9722H = new k(this, new b(this, 0));
        }
        return this.f9722H;
    }

    public final int c(int i10) {
        int i11 = this.f9729z;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            return i10 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    public final void d() {
        i impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f12256s;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f12255r == 1) {
                return;
            }
        } else if (impl.f12255r != 2) {
            return;
        }
        Animator animator = impl.f12249l;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap weakHashMap = U.a;
        FloatingActionButton floatingActionButton2 = impl.f12256s;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(4, false);
            return;
        }
        d dVar = impl.f12251n;
        AnimatorSet animatorSetB = dVar != null ? impl.b(dVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, i.f12231C, i.f12232D);
        animatorSetB.addListener(new C0254d(impl));
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f9725v;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f9726w;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(r.c(colorForState, mode));
    }

    public final void f() {
        i impl = getImpl();
        if (impl.f12256s.getVisibility() != 0) {
            if (impl.f12255r == 2) {
                return;
            }
        } else if (impl.f12255r != 1) {
            return;
        }
        Animator animator = impl.f12249l;
        if (animator != null) {
            animator.cancel();
        }
        boolean z6 = impl.f12250m == null;
        WeakHashMap weakHashMap = U.a;
        FloatingActionButton floatingActionButton = impl.f12256s;
        boolean z10 = floatingActionButton.isLaidOut() && !floatingActionButton.isInEditMode();
        Matrix matrix = impl.f12261x;
        if (!z10) {
            floatingActionButton.a(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f12253p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z6 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z6 ? 0.4f : 0.0f);
            float f10 = z6 ? 0.4f : 0.0f;
            impl.f12253p = f10;
            impl.a(f10, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
        d dVar = impl.f12250m;
        AnimatorSet animatorSetB = dVar != null ? impl.b(dVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, i.f12229A, i.f12230B);
        animatorSetB.addListener(new L(impl, 6));
        animatorSetB.start();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f9723t;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f9724u;
    }

    @Override // G.a
    public G.b getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f12247i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().f12243e;
    }

    public int getCustomSize() {
        return this.f9729z;
    }

    public int getExpandedComponentIdHint() {
        return this.f9721G.f7323b;
    }

    public d getHideMotionSpec() {
        return getImpl().f12251n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f9727x;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f9727x;
    }

    public j getShapeAppearanceModel() {
        j jVar = getImpl().a;
        jVar.getClass();
        return jVar;
    }

    public d getShowMotionSpec() {
        return getImpl().f12250m;
    }

    public int getSize() {
        return this.f9728y;
    }

    public int getSizeDimension() {
        return c(this.f9728y);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f9725v;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f9726w;
    }

    public boolean getUseCompatPadding() {
        return this.f9717C;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i impl = getImpl();
        g gVar = impl.f12240b;
        FloatingActionButton floatingActionButton = impl.f12256s;
        if (gVar != null) {
            D3.b.E(floatingActionButton, gVar);
        }
        if (impl instanceof k) {
            return;
        }
        ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
        if (impl.f12262y == null) {
            impl.f12262y = new f(impl, 2);
        }
        viewTreeObserver.addOnPreDrawListener(impl.f12262y);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f12256s.getViewTreeObserver();
        f fVar = impl.f12262y;
        if (fVar != null) {
            viewTreeObserver.removeOnPreDrawListener(fVar);
            impl.f12262y = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f9715A = (sizeDimension - this.f9716B) / 2;
        getImpl().q();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f9718D;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f6382s);
        Bundle bundle = (Bundle) extendableSavedState.f9813u.get("expandableWidgetHelper");
        bundle.getClass();
        c cVar = this.f9721G;
        cVar.getClass();
        cVar.a = bundle.getBoolean("expanded", false);
        cVar.f7323b = bundle.getInt("expandedComponentIdHint", 0);
        if (cVar.a) {
            View view = (View) cVar.f7324c;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).i(view);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        p212w.i iVar = extendableSavedState.f9813u;
        c cVar = this.f9721G;
        cVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", cVar.a);
        bundle.putInt("expandedComponentIdHint", cVar.f7323b);
        iVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f9719E;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i10 = rect.left;
            Rect rect2 = this.f9718D;
            rect.left = i10 + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            k kVar = this.f9722H;
            int i11 = -(kVar.f12244f ? Math.max((kVar.f12248k - kVar.f12256s.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i11, i11);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f9723t != colorStateList) {
            this.f9723t = colorStateList;
            i impl = getImpl();
            g gVar = impl.f12240b;
            if (gVar != null) {
                gVar.setTintList(colorStateList);
            }
            p081i3.a aVar = impl.f12242d;
            if (aVar != null) {
                if (colorStateList != null) {
                    aVar.f12207m = colorStateList.getColorForState(aVar.getState(), aVar.f12207m);
                }
                aVar.f12210p = colorStateList;
                aVar.f12208n = true;
                aVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f9724u != mode) {
            this.f9724u = mode;
            g gVar = getImpl().f12240b;
            if (gVar != null) {
                gVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        i impl = getImpl();
        if (impl.f12246h != f10) {
            impl.f12246h = f10;
            impl.k(f10, impl.f12247i, impl.j);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        i impl = getImpl();
        if (impl.f12247i != f10) {
            impl.f12247i = f10;
            impl.k(impl.f12246h, f10, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        i impl = getImpl();
        if (impl.j != f10) {
            impl.j = f10;
            impl.k(impl.f12246h, impl.f12247i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f9729z) {
            this.f9729z = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        g gVar = getImpl().f12240b;
        if (gVar != null) {
            gVar.k(f10);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z6) {
        if (z6 != getImpl().f12244f) {
            getImpl().f12244f = z6;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f9721G.f7323b = i10;
    }

    public void setHideMotionSpec(d dVar) {
        getImpl().f12251n = dVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(d.b(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            i impl = getImpl();
            float f10 = impl.f12253p;
            impl.f12253p = f10;
            Matrix matrix = impl.f12261x;
            impl.a(f10, matrix);
            impl.f12256s.setImageMatrix(matrix);
            if (this.f9725v != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f9720F.f(i10);
        e();
    }

    public void setMaxImageSize(int i10) {
        this.f9716B = i10;
        i impl = getImpl();
        if (impl.f12254q != i10) {
            impl.f12254q = i10;
            float f10 = impl.f12253p;
            impl.f12253p = f10;
            Matrix matrix = impl.f12261x;
            impl.a(f10, matrix);
            impl.f12256s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z6) {
        i impl = getImpl();
        impl.f12245g = z6;
        impl.q();
    }

    @Override // p170r3.u
    public void setShapeAppearanceModel(j jVar) {
        getImpl().n(jVar);
    }

    public void setShowMotionSpec(d dVar) {
        getImpl().f12250m = dVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(d.b(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f9729z = 0;
        if (i10 != this.f9728y) {
            this.f9728y = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f9725v != colorStateList) {
            this.f9725v = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f9726w != mode) {
            this.f9726w = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z6) {
        if (this.f9717C != z6) {
            this.f9717C = z6;
            getImpl().i();
        }
    }

    @Override // p091j3.F, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends G.b {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Rect f9730s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean f9731t;

        public BaseBehavior() {
            this.f9731t = true;
        }

        @Override // G.b
        public final boolean e(Rect rect, View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int left = floatingActionButton.getLeft();
            Rect rect2 = floatingActionButton.f9718D;
            rect.set(left + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // G.b
        public final void g(e eVar) {
            if (eVar.f1671h == 0) {
                eVar.f1671h = 80;
            }
        }

        @Override // G.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof e ? ((e) layoutParams).a instanceof BottomSheetBehavior : false) {
                    x(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // G.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListK = coordinatorLayout.k(floatingActionButton);
            int size = arrayListK.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                View view2 = (View) arrayListK.get(i12);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof e ? ((e) layoutParams).a instanceof BottomSheetBehavior : false) && x(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.q(floatingActionButton, i10);
            Rect rect = floatingActionButton.f9718D;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                e eVar = (e) floatingActionButton.getLayoutParams();
                int i13 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) {
                    i11 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin) {
                    i11 = -rect.top;
                }
                if (i11 != 0) {
                    WeakHashMap weakHashMap = U.a;
                    floatingActionButton.offsetTopAndBottom(i11);
                }
                if (i13 != 0) {
                    WeakHashMap weakHashMap2 = U.a;
                    floatingActionButton.offsetLeftAndRight(i13);
                }
            }
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!(this.f9731t && ((e) floatingActionButton.getLayoutParams()).f1669f == appBarLayout.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (this.f9730s == null) {
                this.f9730s = new Rect();
            }
            Rect rect = this.f9730s;
            AbstractC0667b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.d();
            } else {
                floatingActionButton.f();
            }
            return true;
        }

        public final boolean x(View view, FloatingActionButton floatingActionButton) {
            if (!(this.f9731t && ((e) floatingActionButton.getLayoutParams()).f1669f == view.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d();
            } else {
                floatingActionButton.f();
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q2.a.f4020o);
            this.f9731t = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f9727x != colorStateList) {
            this.f9727x = colorStateList;
            getImpl().m(this.f9727x);
        }
    }
}
