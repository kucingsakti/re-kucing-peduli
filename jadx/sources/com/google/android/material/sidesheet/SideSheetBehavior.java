package com.google.android.material.sidesheet;

import B4.L;
import C8.E;
import G.b;
import G.e;
import K.m;
import R2.a;
import U.H;
import U.U;
import V.t;
import X2.d;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.kcstream.cing.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p032d0.f;
import p109l3.h;
import p170r3.g;
import p170r3.j;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends b implements p109l3.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public f f9784A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9785B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final float f9786C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f9787D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f9788E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f9789F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f9790G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public WeakReference f9791H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public WeakReference f9792I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f9793J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public VelocityTracker f9794K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public h f9795L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f9796M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final LinkedHashSet f9797N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final X2.b f9798O;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p181s3.a f9799s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f9800t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ColorStateList f9801u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f9802v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f9803w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f9804x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f9805y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9806z;

    public SideSheetBehavior() {
        this.f9803w = new d(this);
        this.f9805y = true;
        this.f9806z = 5;
        this.f9786C = 0.1f;
        this.f9793J = -1;
        this.f9797N = new LinkedHashSet();
        this.f9798O = new X2.b(this, 1);
    }

    public final void A() {
        View view;
        WeakReference weakReference = this.f9791H;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        U.k(view, 262144);
        U.h(view, 0);
        U.k(view, 1048576);
        U.h(view, 0);
        final int i10 = 5;
        if (this.f9806z != 5) {
            U.l(view, V.d.f5071l, new t() { // from class: s3.b
                @Override // V.t
                public final boolean b(View view2) {
                    this.f14590s.w(i10);
                    return true;
                }
            });
        }
        final int i11 = 3;
        if (this.f9806z != 3) {
            U.l(view, V.d.j, new t() { // from class: s3.b
                @Override // V.t
                public final boolean b(View view2) {
                    this.f14590s.w(i11);
                    return true;
                }
            });
        }
    }

    @Override // p109l3.b
    public final void a(p031d.b bVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        h hVar = this.f9795L;
        if (hVar == null) {
            return;
        }
        p181s3.a aVar = this.f9799s;
        int i10 = (aVar == null || aVar.l() == 0) ? 5 : 3;
        if (hVar.f12918f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        p031d.b bVar2 = hVar.f12918f;
        hVar.f12918f = bVar;
        if (bVar2 != null) {
            hVar.c(bVar.f10433c, bVar.f10434d == 0, i10);
        }
        WeakReference weakReference = this.f9791H;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f9791H.get();
        WeakReference weakReference2 = this.f9792I;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f9799s.x(marginLayoutParams, (int) ((view.getScaleX() * this.f9787D) + this.f9790G));
        view2.requestLayout();
    }

    @Override // p109l3.b
    public final void b() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i10;
        h hVar = this.f9795L;
        if (hVar == null) {
            return;
        }
        p031d.b bVar = hVar.f12918f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        hVar.f12918f = null;
        int i11 = 5;
        if (bVar == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        p181s3.a aVar = this.f9799s;
        if (aVar != null && aVar.l() != 0) {
            i11 = 3;
        }
        L l4 = new L(this, 11);
        WeakReference weakReference = this.f9792I;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            switch (this.f9799s.a) {
                case 0:
                    i10 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i10 = marginLayoutParams.rightMargin;
                    break;
            }
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: s3.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.f9799s.x(marginLayoutParams, a.c(i10, valueAnimator.getAnimatedFraction(), 0));
                    view.requestLayout();
                }
            };
        }
        hVar.b(bVar, i11, l4, animatorUpdateListener);
    }

    @Override // p109l3.b
    public final void c(p031d.b bVar) {
        h hVar = this.f9795L;
        if (hVar == null) {
            return;
        }
        hVar.f12918f = bVar;
    }

    @Override // p109l3.b
    public final void d() {
        h hVar = this.f9795L;
        if (hVar == null) {
            return;
        }
        hVar.a();
    }

    @Override // G.b
    public final void g(e eVar) {
        this.f9791H = null;
        this.f9784A = null;
        this.f9795L = null;
    }

    @Override // G.b
    public final void j() {
        this.f9791H = null;
        this.f9784A = null;
        this.f9795L = null;
    }

    @Override // G.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        f fVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && U.e(view) == null) || !this.f9805y) {
            this.f9785B = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f9794K) != null) {
            velocityTracker.recycle();
            this.f9794K = null;
        }
        if (this.f9794K == null) {
            this.f9794K = VelocityTracker.obtain();
        }
        this.f9794K.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f9796M = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f9785B) {
            this.f9785B = false;
            return false;
        }
        return (this.f9785B || (fVar = this.f9784A) == null || !fVar.q(motionEvent)) ? false : true;
    }

    @Override // G.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View view2;
        View view3;
        int left;
        int i11;
        int i12;
        View viewFindViewById;
        int iK = 0;
        int i13 = 1;
        g gVar = this.f9800t;
        WeakHashMap weakHashMap = U.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f9791H == null) {
            this.f9791H = new WeakReference(view);
            this.f9795L = new h(view);
            if (gVar != null) {
                view.setBackground(gVar);
                float fI = this.f9804x;
                if (fI == -1.0f) {
                    fI = H.i(view);
                }
                gVar.k(fI);
            } else {
                ColorStateList colorStateList = this.f9801u;
                if (colorStateList != null) {
                    H.q(view, colorStateList);
                }
            }
            int i14 = this.f9806z == 5 ? 4 : 0;
            if (view.getVisibility() != i14) {
                view.setVisibility(i14);
            }
            A();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (U.e(view) == null) {
                U.o(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i15 = Gravity.getAbsoluteGravity(((e) view.getLayoutParams()).f1666c, i10) == 3 ? 1 : 0;
        p181s3.a aVar = this.f9799s;
        if (aVar == null || aVar.l() != i15) {
            j jVar = this.f9802v;
            e eVar = null;
            if (i15 == 0) {
                this.f9799s = new p181s3.a(this, i13);
                if (jVar != null) {
                    WeakReference weakReference = this.f9791H;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof e)) {
                        eVar = (e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        I4.b bVarF = jVar.f();
                        bVarF.f2073f = new p170r3.a(0.0f);
                        bVarF.f2074g = new p170r3.a(0.0f);
                        j jVarA = bVarF.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(jVarA);
                        }
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalArgumentException(E0.a.g("Invalid sheet edge position value: ", i15, ". Must be 0 or 1."));
                }
                this.f9799s = new p181s3.a(this, iK);
                if (jVar != null) {
                    WeakReference weakReference2 = this.f9791H;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof e)) {
                        eVar = (e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        I4.b bVarF2 = jVar.f();
                        bVarF2.f2072e = new p170r3.a(0.0f);
                        bVarF2.f2075h = new p170r3.a(0.0f);
                        j jVarA2 = bVarF2.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(jVarA2);
                        }
                    }
                }
            }
        }
        if (this.f9784A == null) {
            this.f9784A = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f9798O);
        }
        int iK2 = this.f9799s.k(view);
        coordinatorLayout.q(view, i10);
        this.f9788E = coordinatorLayout.getWidth();
        switch (this.f9799s.a) {
            case 0:
                left = coordinatorLayout.getLeft();
                break;
            default:
                left = coordinatorLayout.getRight();
                break;
        }
        this.f9789F = left;
        this.f9787D = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            switch (this.f9799s.a) {
                case 0:
                    i11 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i11 = marginLayoutParams.rightMargin;
                    break;
            }
        } else {
            i11 = 0;
        }
        this.f9790G = i11;
        int i16 = this.f9806z;
        if (i16 == 1 || i16 == 2) {
            iK = iK2 - this.f9799s.k(view);
        } else if (i16 != 3) {
            if (i16 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f9806z);
            }
            iK = this.f9799s.j();
        }
        view.offsetLeftAndRight(iK);
        if (this.f9792I == null && (i12 = this.f9793J) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i12)) != null) {
            this.f9792I = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f9797N.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // G.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // G.b
    public final void r(View view, Parcelable parcelable) {
        int i10 = ((SavedState) parcelable).f9807u;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f9806z = i10;
    }

    @Override // G.b
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // G.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f9806z == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.f9784A.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f9794K) != null) {
            velocityTracker.recycle();
            this.f9794K = null;
        }
        if (this.f9794K == null) {
            this.f9794K = VelocityTracker.obtain();
        }
        this.f9794K.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.f9785B && y()) {
            float fAbs = Math.abs(this.f9796M - motionEvent.getX());
            f fVar = this.f9784A;
            if (fAbs > fVar.f10514b) {
                fVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f9785B;
    }

    public final void w(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(E0.a.l(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.f9791H;
        if (weakReference == null || weakReference.get() == null) {
            x(i10);
            return;
        }
        View view = (View) this.f9791H.get();
        m mVar = new m(i10, 1, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = U.a;
            if (view.isAttachedToWindow()) {
                view.post(mVar);
                return;
            }
        }
        mVar.run();
    }

    public final void x(int i10) {
        View view;
        if (this.f9806z == i10) {
            return;
        }
        this.f9806z = i10;
        WeakReference weakReference = this.f9791H;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i11 = this.f9806z == 5 ? 4 : 0;
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
        Iterator it = this.f9797N.iterator();
        if (it.hasNext()) {
            throw E0.a.e(it);
        }
        A();
    }

    public final boolean y() {
        if (this.f9784A != null) {
            return this.f9805y || this.f9806z == 1;
        }
        return false;
    }

    public final void z(View view, int i10, boolean z6) {
        int i11;
        if (i10 == 3) {
            i11 = this.f9799s.i();
        } else {
            if (i10 != 5) {
                throw new IllegalArgumentException(AbstractC0487g.g(i10, "Invalid state to get outer edge offset: "));
            }
            i11 = this.f9799s.j();
        }
        f fVar = this.f9784A;
        if (fVar == null || (!z6 ? fVar.r(view, i11, view.getTop()) : fVar.p(i11, view.getTop()))) {
            x(i10);
        } else {
            x(2);
            this.f9803w.a(i10);
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final int f9807u;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9807u = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9807u);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f9807u = sideSheetBehavior.f9806z;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f9803w = new d(this);
        this.f9805y = true;
        this.f9806z = 5;
        this.f9786C = 0.1f;
        this.f9793J = -1;
        this.f9797N = new LinkedHashSet();
        this.f9798O = new X2.b(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q2.a.f4002M);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f9801u = E.n(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f9802v = j.c(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f9793J = resourceId;
            WeakReference weakReference = this.f9792I;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f9792I = null;
            WeakReference weakReference2 = this.f9791H;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = U.a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        j jVar = this.f9802v;
        if (jVar != null) {
            g gVar = new g(jVar);
            this.f9800t = gVar;
            gVar.j(context);
            ColorStateList colorStateList = this.f9801u;
            if (colorStateList != null) {
                this.f9800t.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f9800t.setTint(typedValue.data);
            }
        }
        this.f9804x = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f9805y = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
