package com.google.android.material.bottomsheet;

import A1.J;
import A1.l;
import B4.K;
import B4.L;
import C8.E;
import G.b;
import G.e;
import U.C0410a;
import U.C0412b;
import U.H;
import U.U;
import U.i0;
import U.j0;
import U.k0;
import X2.c;
import X2.d;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.kcstream.cing.R;
import com.onesignal.core.activities.PermissionsActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p032d0.f;
import p091j3.C;
import p170r3.g;
import p170r3.j;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends b implements p109l3.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final g f9488A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ColorStateList f9489B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f9490C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f9491D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f9492E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f9493F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f9494G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f9495H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f9496I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f9497J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f9498K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f9499L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f9500M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f9501N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f9502O;
    public final boolean P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final j f9503Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f9504R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final d f9505S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final ValueAnimator f9506T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final int f9507U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f9508V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f9509W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final float f9510X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f9511Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final float f9512Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f9513a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f9514b0;
    public final boolean c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f9515d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public f f9516e0;
    public boolean f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f9517g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f9518h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final float f9519i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f9520j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f9521k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f9522l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public WeakReference f9523m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public WeakReference f9524n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final ArrayList f9525o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public VelocityTracker f9526p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public p109l3.f f9527q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f9528r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f9529s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f9530s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9531t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f9532t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f9533u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public HashMap f9534u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f9535v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final SparseIntArray f9536v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9537w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final X2.b f9538w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9539x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9540y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f9541z;

    public BottomSheetBehavior() {
        this.f9529s = 0;
        this.f9531t = true;
        this.f9490C = -1;
        this.f9491D = -1;
        this.f9505S = new d(this);
        this.f9510X = 0.5f;
        this.f9512Z = -1.0f;
        this.c0 = true;
        this.f9515d0 = 4;
        this.f9519i0 = 0.1f;
        this.f9525o0 = new ArrayList();
        this.f9530s0 = -1;
        this.f9536v0 = new SparseIntArray();
        this.f9538w0 = new X2.b(this, 0);
    }

    public static View A(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = U.a;
        if (H.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewA = A(viewGroup.getChildAt(i10));
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }

    public static BottomSheetBehavior B(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        b bVar = ((e) layoutParams).a;
        if (bVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) bVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int C(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    public final int D() {
        if (this.f9531t) {
            return this.f9508V;
        }
        return Math.max(this.f9507U, this.f9497J ? 0 : this.f9502O);
    }

    public final int E(int i10) {
        if (i10 == 3) {
            return D();
        }
        if (i10 == 4) {
            return this.f9511Y;
        }
        if (i10 == 5) {
            return this.f9522l0;
        }
        if (i10 == 6) {
            return this.f9509W;
        }
        throw new IllegalArgumentException(AbstractC0487g.g(i10, "Invalid state to get top offset: "));
    }

    public final boolean F() {
        WeakReference weakReference = this.f9523m0;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f9523m0.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void G(boolean z6) {
        if (this.f9513a0 != z6) {
            this.f9513a0 = z6;
            if (!z6 && this.f9515d0 == 5) {
                I(4);
            }
            M();
        }
    }

    public final void H(int i10) {
        if (i10 == -1) {
            if (this.f9539x) {
                return;
            } else {
                this.f9539x = true;
            }
        } else {
            if (!this.f9539x && this.f9537w == i10) {
                return;
            }
            this.f9539x = false;
            this.f9537w = Math.max(0, i10);
        }
        P();
    }

    public final void I(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(E0.a.l(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f9513a0 && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f9531t && E(i10) <= this.f9508V) ? 3 : i10;
        WeakReference weakReference = this.f9523m0;
        if (weakReference == null || weakReference.get() == null) {
            J(i10);
            return;
        }
        View view = (View) this.f9523m0.get();
        X2.a aVar = new X2.a(this, view, i11);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = U.a;
            if (view.isAttachedToWindow()) {
                view.post(aVar);
                return;
            }
        }
        aVar.run();
    }

    public final void J(int i10) {
        View view;
        if (this.f9515d0 == i10) {
            return;
        }
        this.f9515d0 = i10;
        if (i10 != 4 && i10 != 3 && i10 != 6) {
            boolean z6 = this.f9513a0;
        }
        WeakReference weakReference = this.f9523m0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i11 = 0;
        if (i10 == 3) {
            O(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            O(false);
        }
        N(i10, true);
        while (true) {
            ArrayList arrayList = this.f9525o0;
            if (i11 >= arrayList.size()) {
                M();
                return;
            } else {
                ((c) arrayList.get(i11)).c(view, i10);
                i11++;
            }
        }
    }

    public final boolean K(View view, float f10) {
        if (this.f9514b0) {
            return true;
        }
        if (view.getTop() < this.f9511Y) {
            return false;
        }
        return Math.abs(((f10 * this.f9519i0) + ((float) view.getTop())) - ((float) this.f9511Y)) / ((float) y()) > 0.5f;
    }

    public final void L(View view, int i10, boolean z6) {
        int iE = E(i10);
        f fVar = this.f9516e0;
        if (fVar == null || (!z6 ? fVar.r(view, view.getLeft(), iE) : fVar.p(view.getLeft(), iE))) {
            J(i10);
            return;
        }
        J(2);
        N(i10, true);
        this.f9505S.a(i10);
    }

    public final void M() {
        View view;
        int iA;
        WeakReference weakReference = this.f9523m0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        U.k(view, 524288);
        U.h(view, 0);
        U.k(view, 262144);
        U.h(view, 0);
        U.k(view, 1048576);
        U.h(view, 0);
        SparseIntArray sparseIntArray = this.f9536v0;
        int i10 = sparseIntArray.get(0, -1);
        if (i10 != -1) {
            U.k(view, i10);
            U.h(view, 0);
            sparseIntArray.delete(0);
        }
        int i11 = 6;
        if (!this.f9531t && this.f9515d0 != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            l lVar = new l(this, i11);
            ArrayList arrayListF = U.f(view);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayListF.size()) {
                    int i13 = -1;
                    for (int i14 = 0; i14 < 32 && i13 == -1; i14++) {
                        int i15 = U.f4788d[i14];
                        boolean z6 = true;
                        for (int i16 = 0; i16 < arrayListF.size(); i16++) {
                            z6 &= ((V.d) arrayListF.get(i16)).a() != i15;
                        }
                        if (z6) {
                            i13 = i15;
                        }
                    }
                    iA = i13;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((V.d) arrayListF.get(i12)).a).getLabel())) {
                    iA = ((V.d) arrayListF.get(i12)).a();
                    break;
                }
                i12++;
            }
            if (iA != -1) {
                V.d dVar = new V.d(null, iA, string, lVar, null);
                View.AccessibilityDelegate accessibilityDelegateD = U.d(view);
                C0412b c0412b = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof C0410a ? ((C0410a) accessibilityDelegateD).a : new C0412b(accessibilityDelegateD);
                if (c0412b == null) {
                    c0412b = new C0412b();
                }
                U.n(view, c0412b);
                U.k(view, dVar.a());
                U.f(view).add(dVar);
                U.h(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.f9513a0) {
            int i17 = 5;
            if (this.f9515d0 != 5) {
                U.l(view, V.d.f5071l, new l(this, i17));
            }
        }
        int i18 = this.f9515d0;
        int i19 = 4;
        int i20 = 3;
        if (i18 == 3) {
            U.l(view, V.d.f5070k, new l(this, this.f9531t ? 4 : 6));
            return;
        }
        if (i18 == 4) {
            U.l(view, V.d.j, new l(this, this.f9531t ? 3 : 6));
        } else {
            if (i18 != 6) {
                return;
            }
            U.l(view, V.d.f5070k, new l(this, i19));
            U.l(view, V.d.j, new l(this, i20));
        }
    }

    public final void N(int i10, boolean z6) {
        g gVar = this.f9488A;
        ValueAnimator valueAnimator = this.f9506T;
        if (i10 == 2) {
            return;
        }
        boolean z10 = this.f9515d0 == 3 && (this.P || F());
        if (this.f9504R == z10 || gVar == null) {
            return;
        }
        this.f9504R = z10;
        if (!z6 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            gVar.m(this.f9504R ? x() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(gVar.f14501s.f14478i, z10 ? x() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void O(boolean z6) {
        WeakReference weakReference = this.f9523m0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z6) {
                if (this.f9534u0 != null) {
                    return;
                } else {
                    this.f9534u0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f9523m0.get() && z6) {
                    this.f9534u0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z6) {
                return;
            }
            this.f9534u0 = null;
        }
    }

    public final void P() {
        View view;
        if (this.f9523m0 != null) {
            w();
            if (this.f9515d0 != 4 || (view = (View) this.f9523m0.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p109l3.b
    public final void a(p031d.b bVar) {
        p109l3.f fVar = this.f9527q0;
        if (fVar == null) {
            return;
        }
        if (fVar.f12918f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        p031d.b bVar2 = fVar.f12918f;
        fVar.f12918f = bVar;
        if (bVar2 == null) {
            return;
        }
        fVar.b(bVar.f10433c);
    }

    @Override // p109l3.b
    public final void b() {
        p109l3.f fVar = this.f9527q0;
        if (fVar == null) {
            return;
        }
        p031d.b bVar = fVar.f12918f;
        fVar.f12918f = null;
        if (bVar == null || Build.VERSION.SDK_INT < 34) {
            I(this.f9513a0 ? 5 : 4);
            return;
        }
        boolean z6 = this.f9513a0;
        int i10 = fVar.f12916d;
        int i11 = fVar.f12915c;
        float f10 = bVar.f10433c;
        if (!z6) {
            AnimatorSet animatorSetA = fVar.a();
            animatorSetA.setDuration(R2.a.c(i11, f10, i10));
            animatorSetA.start();
            I(4);
            return;
        }
        L l4 = new L(this, 5);
        View view = fVar.f12914b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        objectAnimatorOfFloat.setInterpolator(new p178s0.a(1));
        objectAnimatorOfFloat.setDuration(R2.a.c(i11, f10, i10));
        objectAnimatorOfFloat.addListener(new L(fVar, 8));
        objectAnimatorOfFloat.addListener(l4);
        objectAnimatorOfFloat.start();
    }

    @Override // p109l3.b
    public final void c(p031d.b bVar) {
        p109l3.f fVar = this.f9527q0;
        if (fVar == null) {
            return;
        }
        fVar.f12918f = bVar;
    }

    @Override // p109l3.b
    public final void d() {
        p109l3.f fVar = this.f9527q0;
        if (fVar == null) {
            return;
        }
        if (fVar.f12918f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        p031d.b bVar = fVar.f12918f;
        fVar.f12918f = null;
        if (bVar == null) {
            return;
        }
        AnimatorSet animatorSetA = fVar.a();
        animatorSetA.setDuration(fVar.f12917e);
        animatorSetA.start();
    }

    @Override // G.b
    public final void g(e eVar) {
        this.f9523m0 = null;
        this.f9516e0 = null;
        this.f9527q0 = null;
    }

    @Override // G.b
    public final void j() {
        this.f9523m0 = null;
        this.f9516e0 = null;
        this.f9527q0 = null;
    }

    @Override // G.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        f fVar;
        if (!view.isShown() || !this.c0) {
            this.f0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9528r0 = -1;
            this.f9530s0 = -1;
            VelocityTracker velocityTracker = this.f9526p0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f9526p0 = null;
            }
        }
        if (this.f9526p0 == null) {
            this.f9526p0 = VelocityTracker.obtain();
        }
        this.f9526p0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x8 = (int) motionEvent.getX();
            this.f9530s0 = (int) motionEvent.getY();
            if (this.f9515d0 != 2) {
                WeakReference weakReference = this.f9524n0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x8, this.f9530s0)) {
                    this.f9528r0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f9532t0 = true;
                }
            }
            this.f0 = this.f9528r0 == -1 && !coordinatorLayout.o(view, x8, this.f9530s0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f9532t0 = false;
            this.f9528r0 = -1;
            if (this.f0) {
                this.f0 = false;
                return false;
            }
        }
        if (this.f0 || (fVar = this.f9516e0) == null || !fVar.q(motionEvent)) {
            WeakReference weakReference2 = this.f9524n0;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f0 || this.f9515d0 == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f9516e0 == null || (i10 = this.f9530s0) == -1 || Math.abs(i10 - motionEvent.getY()) <= this.f9516e0.f10514b) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [int[], java.io.Serializable] */
    @Override // G.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int i11 = this.f9491D;
        g gVar = this.f9488A;
        int i12 = 6;
        WeakHashMap weakHashMap = U.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i13 = 0;
        if (this.f9523m0 == null) {
            this.f9540y = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i14 = Build.VERSION.SDK_INT;
            boolean z6 = (i14 < 29 || this.f9493F || this.f9539x) ? false : true;
            if (this.f9494G || this.f9495H || this.f9496I || this.f9498K || this.f9499L || this.f9500M || z6) {
                C.d(view, new J(this, z6, i12));
            }
            X2.j jVar = new X2.j();
            jVar.f5411e = new int[2];
            jVar.f5410d = view;
            if (i14 >= 30) {
                view.setWindowInsetsAnimationCallback(new k0(jVar));
            } else {
                PathInterpolator pathInterpolator = j0.f4821e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener i0Var = new i0(view, jVar);
                view.setTag(R.id.tag_window_insets_animation_callback, i0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(i0Var);
                }
            }
            this.f9523m0 = new WeakReference(view);
            this.f9527q0 = new p109l3.f(view);
            if (gVar != null) {
                view.setBackground(gVar);
                float fI = this.f9512Z;
                if (fI == -1.0f) {
                    fI = H.i(view);
                }
                gVar.k(fI);
            } else {
                ColorStateList colorStateList = this.f9489B;
                if (colorStateList != null) {
                    H.q(view, colorStateList);
                }
            }
            M();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f9516e0 == null) {
            this.f9516e0 = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f9538w0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i10);
        this.f9521k0 = coordinatorLayout.getWidth();
        this.f9522l0 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f9520j0 = height;
        int iMin = this.f9522l0;
        int i15 = iMin - height;
        int i16 = this.f9502O;
        if (i15 < i16) {
            if (this.f9497J) {
                if (i11 != -1) {
                    iMin = Math.min(iMin, i11);
                }
                this.f9520j0 = iMin;
            } else {
                int iMin2 = iMin - i16;
                if (i11 != -1) {
                    iMin2 = Math.min(iMin2, i11);
                }
                this.f9520j0 = iMin2;
            }
        }
        this.f9508V = Math.max(0, this.f9522l0 - this.f9520j0);
        this.f9509W = (int) ((1.0f - this.f9510X) * this.f9522l0);
        w();
        int i17 = this.f9515d0;
        if (i17 == 3) {
            view.offsetTopAndBottom(D());
        } else if (i17 == 6) {
            view.offsetTopAndBottom(this.f9509W);
        } else if (this.f9513a0 && i17 == 5) {
            view.offsetTopAndBottom(this.f9522l0);
        } else if (i17 == 4) {
            view.offsetTopAndBottom(this.f9511Y);
        } else if (i17 == 1 || i17 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        N(this.f9515d0, false);
        this.f9524n0 = new WeakReference(A(view));
        while (true) {
            ArrayList arrayList = this.f9525o0;
            if (i13 >= arrayList.size()) {
                return true;
            }
            ((c) arrayList.get(i13)).a(view);
            i13++;
        }
    }

    @Override // G.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(C(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f9490C, marginLayoutParams.width), C(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f9491D, marginLayoutParams.height));
        return true;
    }

    @Override // G.b
    public final boolean n(View view) {
        WeakReference weakReference = this.f9524n0;
        return (weakReference == null || view != weakReference.get() || this.f9515d0 == 3) ? false : true;
    }

    @Override // G.b
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        boolean z6 = this.c0;
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f9524n0;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < D()) {
                int iD = top - D();
                iArr[1] = iD;
                WeakHashMap weakHashMap = U.a;
                view.offsetTopAndBottom(-iD);
                J(3);
            } else {
                if (!z6) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap weakHashMap2 = U.a;
                view.offsetTopAndBottom(-i11);
                J(1);
            }
        } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
            int i14 = this.f9511Y;
            if (i13 > i14 && !this.f9513a0) {
                int i15 = top - i14;
                iArr[1] = i15;
                WeakHashMap weakHashMap3 = U.a;
                view.offsetTopAndBottom(-i15);
                J(4);
            } else {
                if (!z6) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap weakHashMap4 = U.a;
                view.offsetTopAndBottom(-i11);
                J(1);
            }
        }
        z(view.getTop());
        this.f9517g0 = i11;
        this.f9518h0 = true;
    }

    @Override // G.b
    public final void r(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i10 = this.f9529s;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f9537w = savedState.f9543v;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f9531t = savedState.f9544w;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.f9513a0 = savedState.f9545x;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.f9514b0 = savedState.f9546y;
            }
        }
        int i11 = savedState.f9542u;
        if (i11 == 1 || i11 == 2) {
            this.f9515d0 = 4;
        } else {
            this.f9515d0 = i11;
        }
    }

    @Override // G.b
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // G.b
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
        this.f9517g0 = 0;
        this.f9518h0 = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // G.b
    public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
        int top;
        int top2;
        int i11;
        float yVelocity;
        int i12 = 3;
        if (view.getTop() == D()) {
            J(3);
            return;
        }
        WeakReference weakReference = this.f9524n0;
        if (weakReference != null && view2 == weakReference.get() && this.f9518h0) {
            if (this.f9517g0 > 0) {
                if (!this.f9531t && view.getTop() > this.f9509W) {
                    i12 = 6;
                }
            } else if (this.f9513a0) {
                VelocityTracker velocityTracker = this.f9526p0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f9533u);
                    yVelocity = this.f9526p0.getYVelocity(this.f9528r0);
                }
                if (K(view, yVelocity)) {
                    i12 = 5;
                } else if (this.f9517g0 == 0) {
                    top2 = view.getTop();
                    if (this.f9531t) {
                        i11 = this.f9509W;
                        if (top2 < i11) {
                            if (top2 >= Math.abs(top2 - this.f9511Y)) {
                            }
                        } else if (Math.abs(top2 - i11) < Math.abs(top2 - this.f9511Y)) {
                            i12 = 4;
                        }
                        i12 = 6;
                    } else if (Math.abs(top2 - this.f9508V) >= Math.abs(top2 - this.f9511Y)) {
                        i12 = 4;
                    }
                } else {
                    if (!this.f9531t) {
                        top = view.getTop();
                        if (Math.abs(top - this.f9509W) < Math.abs(top - this.f9511Y)) {
                            i12 = 6;
                        }
                    }
                    i12 = 4;
                }
            } else if (this.f9517g0 == 0) {
                top2 = view.getTop();
                if (this.f9531t) {
                    i11 = this.f9509W;
                    if (top2 < i11) {
                        if (top2 >= Math.abs(top2 - this.f9511Y)) {
                        }
                    } else if (Math.abs(top2 - i11) < Math.abs(top2 - this.f9511Y)) {
                        i12 = 4;
                    }
                    i12 = 6;
                } else if (Math.abs(top2 - this.f9508V) >= Math.abs(top2 - this.f9511Y)) {
                    i12 = 4;
                }
            } else {
                if (!this.f9531t) {
                    top = view.getTop();
                    if (Math.abs(top - this.f9509W) < Math.abs(top - this.f9511Y)) {
                        i12 = 6;
                    }
                }
                i12 = 4;
            }
            L(view, i12, false);
            this.f9518h0 = false;
        }
    }

    @Override // G.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f9515d0;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        f fVar = this.f9516e0;
        if (fVar != null && (this.c0 || i10 == 1)) {
            fVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f9528r0 = -1;
            this.f9530s0 = -1;
            VelocityTracker velocityTracker = this.f9526p0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f9526p0 = null;
            }
        }
        if (this.f9526p0 == null) {
            this.f9526p0 = VelocityTracker.obtain();
        }
        this.f9526p0.addMovement(motionEvent);
        if (this.f9516e0 != null && ((this.c0 || this.f9515d0 == 1) && actionMasked == 2 && !this.f0)) {
            float fAbs = Math.abs(this.f9530s0 - motionEvent.getY());
            f fVar2 = this.f9516e0;
            if (fAbs > fVar2.f10514b) {
                fVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f0;
    }

    public final void w() {
        int iY = y();
        if (this.f9531t) {
            this.f9511Y = Math.max(this.f9522l0 - iY, this.f9508V);
        } else {
            this.f9511Y = this.f9522l0 - iY;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    public final float x() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f10;
        float f11 = 0.0f;
        if (this.f9488A != null && (weakReference = this.f9523m0) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f9523m0.get();
            if (F() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fH = this.f9488A.h();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fH <= 0.0f) {
                        f10 = 0.0f;
                    } else {
                        f10 = radius / fH;
                    }
                } else {
                    f10 = 0.0f;
                }
                g gVar = this.f9488A;
                float fA = gVar.f14501s.a.f14514f.a(gVar.g());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA > 0.0f) {
                        f11 = radius2 / fA;
                    }
                }
                return Math.max(f10, f11);
            }
        }
        return 0.0f;
    }

    public final int y() {
        int i10;
        if (this.f9539x) {
            return Math.min(Math.max(this.f9540y, this.f9522l0 - ((this.f9521k0 * 9) / 16)), this.f9520j0) + this.f9501N;
        }
        return (this.f9493F || this.f9494G || (i10 = this.f9492E) <= 0) ? this.f9537w + this.f9501N : Math.max(this.f9537w, i10 + this.f9541z);
    }

    public final void z(int i10) {
        View view = (View) this.f9523m0.get();
        if (view != null) {
            ArrayList arrayList = this.f9525o0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i11 = this.f9511Y;
            if (i10 <= i11 && i11 != D()) {
                D();
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((c) arrayList.get(i12)).b(view);
            }
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final int f9542u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f9543v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f9544w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final boolean f9545x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final boolean f9546y;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9542u = parcel.readInt();
            this.f9543v = parcel.readInt();
            this.f9544w = parcel.readInt() == 1;
            this.f9545x = parcel.readInt() == 1;
            this.f9546y = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9542u);
            parcel.writeInt(this.f9543v);
            parcel.writeInt(this.f9544w ? 1 : 0);
            parcel.writeInt(this.f9545x ? 1 : 0);
            parcel.writeInt(this.f9546y ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f9542u = bottomSheetBehavior.f9515d0;
            this.f9543v = bottomSheetBehavior.f9537w;
            this.f9544w = bottomSheetBehavior.f9531t;
            this.f9545x = bottomSheetBehavior.f9513a0;
            this.f9546y = bottomSheetBehavior.f9514b0;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        int i11 = 9;
        this.f9529s = 0;
        this.f9531t = true;
        this.f9490C = -1;
        this.f9491D = -1;
        this.f9505S = new d(this);
        this.f9510X = 0.5f;
        this.f9512Z = -1.0f;
        this.c0 = true;
        this.f9515d0 = 4;
        this.f9519i0 = 0.1f;
        this.f9525o0 = new ArrayList();
        this.f9530s0 = -1;
        this.f9536v0 = new SparseIntArray();
        this.f9538w0 = new X2.b(this, 0);
        this.f9541z = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q2.a.f4012f);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f9489B = E.n(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f9503Q = j.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        j jVar = this.f9503Q;
        if (jVar != null) {
            g gVar = new g(jVar);
            this.f9488A = gVar;
            gVar.j(context);
            ColorStateList colorStateList = this.f9489B;
            if (colorStateList != null) {
                this.f9488A.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f9488A.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.f9506T = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f9506T.addUpdateListener(new K(this, i11));
        this.f9512Z = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f9490C = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f9491D = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            H(i10);
        } else {
            H(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        G(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.f9493F = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f9531t != z6) {
            this.f9531t = z6;
            if (this.f9523m0 != null) {
                w();
            }
            J((this.f9531t && this.f9515d0 == 6) ? 3 : this.f9515d0);
            N(this.f9515d0, true);
            M();
        }
        this.f9514b0 = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.c0 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f9529s = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f10 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f9510X = f10;
            if (this.f9523m0 != null) {
                this.f9509W = (int) ((1.0f - f10) * this.f9522l0);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i12 = typedValuePeekValue2.data;
                if (i12 >= 0) {
                    this.f9507U = i12;
                    N(this.f9515d0, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f9507U = dimensionPixelOffset;
                    N(this.f9515d0, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f9535v = typedArrayObtainStyledAttributes.getInt(11, PermissionsActivity.DELAY_TIME_CALLBACK_CALL);
            this.f9494G = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f9495H = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f9496I = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f9497J = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f9498K = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f9499L = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f9500M = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.P = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f9533u = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // G.b
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }
}
