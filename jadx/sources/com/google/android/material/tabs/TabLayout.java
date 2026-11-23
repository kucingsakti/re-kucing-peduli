package com.google.android.material.tabs;

import B4.K;
import C8.E;
import J7.j;
import T.c;
import T.d;
import U.H;
import U.U;
import Z0.a;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p053f4.e;
import p068ga.l;
import p091j3.C;
import p170r3.g;
import p206v3.b;
import p206v3.f;
import p206v3.h;

/* JADX INFO: loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final d f9814k0 = new d(16);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f9815A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f9816B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f9817C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f9818D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ColorStateList f9819E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ColorStateList f9820F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Drawable f9821G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f9822H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final float f9823I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final float f9824J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f9825K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f9826L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f9827M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f9828N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f9829O;
    public final int P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f9830Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final int f9831R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f9832S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f9833T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f9834U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f9835V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f9836W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f9837a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f9838b0;
    public e c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final TimeInterpolator f9839d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public b f9840e0;
    public final ArrayList f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ValueAnimator f9841g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public a f9842h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f9843i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final c f9844j0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9845s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f9846t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public f f9847u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p206v3.e f9848v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9849w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f9850x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f9851y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f9852z;

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(p225x3.a.a(context, attributeSet, R.attr.tabStyle, R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        this.f9845s = -1;
        this.f9846t = new ArrayList();
        this.f9817C = -1;
        this.f9822H = 0;
        this.f9826L = Integer.MAX_VALUE;
        this.f9836W = -1;
        this.f0 = new ArrayList();
        this.f9844j0 = new c(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        p206v3.e eVar = new p206v3.e(this, context2);
        this.f9848v = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayI = C.i(context2, attributeSet, Q2.a.f4004O, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListI = p086i8.C.i(getBackground());
        if (colorStateListI != null) {
            g gVar = new g();
            gVar.l(colorStateListI);
            gVar.j(context2);
            WeakHashMap weakHashMap = U.a;
            gVar.k(H.i(this));
            setBackground(gVar);
        }
        setSelectedTabIndicator(E.q(context2, typedArrayI, 5));
        setSelectedTabIndicatorColor(typedArrayI.getColor(8, 0));
        eVar.b(typedArrayI.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayI.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayI.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayI.getBoolean(9, true));
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(16, 0);
        this.f9852z = dimensionPixelSize;
        this.f9851y = dimensionPixelSize;
        this.f9850x = dimensionPixelSize;
        this.f9849w = dimensionPixelSize;
        this.f9849w = typedArrayI.getDimensionPixelSize(19, dimensionPixelSize);
        this.f9850x = typedArrayI.getDimensionPixelSize(20, dimensionPixelSize);
        this.f9851y = typedArrayI.getDimensionPixelSize(18, dimensionPixelSize);
        this.f9852z = typedArrayI.getDimensionPixelSize(17, dimensionPixelSize);
        if (C4.a.C(context2, R.attr.isMaterial3Theme, false)) {
            this.f9815A = R.attr.textAppearanceTitleSmall;
        } else {
            this.f9815A = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayI.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.f9816B = resourceId;
        int[] iArr = p069h.a.f11631x;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f9823I = dimensionPixelSize2;
            this.f9818D = E.n(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayI.hasValue(22)) {
                this.f9817C = typedArrayI.getResourceId(22, resourceId);
            }
            int i10 = this.f9817C;
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i10 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i10, iArr);
                try {
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListN = E.n(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListN != null) {
                        this.f9818D = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{colorStateListN.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListN.getDefaultColor()), this.f9818D.getDefaultColor()});
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayI.hasValue(25)) {
                this.f9818D = E.n(context2, typedArrayI, 25);
            }
            if (typedArrayI.hasValue(23)) {
                this.f9818D = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{typedArrayI.getColor(23, 0), this.f9818D.getDefaultColor()});
            }
            this.f9819E = E.n(context2, typedArrayI, 3);
            C.k(typedArrayI.getInt(4, -1), null);
            this.f9820F = E.n(context2, typedArrayI, 21);
            this.f9831R = typedArrayI.getInt(6, 300);
            this.f9839d0 = j.D(context2, R.attr.motionEasingEmphasizedInterpolator, R2.a.f4441b);
            this.f9827M = typedArrayI.getDimensionPixelSize(14, -1);
            this.f9828N = typedArrayI.getDimensionPixelSize(13, -1);
            this.f9825K = typedArrayI.getResourceId(0, 0);
            this.P = typedArrayI.getDimensionPixelSize(1, 0);
            this.f9833T = typedArrayI.getInt(15, 1);
            this.f9830Q = typedArrayI.getInt(2, 0);
            this.f9834U = typedArrayI.getBoolean(12, false);
            this.f9838b0 = typedArrayI.getBoolean(26, false);
            typedArrayI.recycle();
            Resources resources = getResources();
            this.f9824J = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f9829O = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            d();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f9846t;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f9827M;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f9833T;
        if (i11 == 0 || i11 == 2) {
            return this.f9829O;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f9848v.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        p206v3.e eVar = this.f9848v;
        int childCount = eVar.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = eVar.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof h) {
                        ((h) childAt).f();
                    }
                }
                i11++;
            }
        }
    }

    public final void a(b bVar) {
        ArrayList arrayList = this.f0;
        if (arrayList.contains(bVar)) {
            return;
        }
        arrayList.add(bVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(f fVar, boolean z6) {
        ArrayList arrayList = this.f9846t;
        int size = arrayList.size();
        if (fVar.f15431d != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        fVar.f15429b = size;
        arrayList.add(size, fVar);
        int size2 = arrayList.size();
        int i10 = -1;
        for (int i11 = size + 1; i11 < size2; i11++) {
            if (((f) arrayList.get(i11)).f15429b == this.f9845s) {
                i10 = i11;
            }
            ((f) arrayList.get(i11)).f15429b = i11;
        }
        this.f9845s = i10;
        h hVar = fVar.f15432e;
        hVar.setSelected(false);
        hVar.setActivated(false);
        int i12 = fVar.f15429b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f9833T == 1 && this.f9830Q == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f9848v.addView(hVar, i12, layoutParams);
        if (z6) {
            TabLayout tabLayout = fVar.f15431d;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.j(fVar, true);
        }
    }

    public final void c(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = U.a;
            if (isLaidOut()) {
                p206v3.e eVar = this.f9848v;
                int childCount = eVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    if (eVar.getChildAt(i11).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iE = e(i10, 0.0f);
                if (scrollX != iE) {
                    f();
                    this.f9841g0.setIntValues(scrollX, iE);
                    this.f9841g0.start();
                }
                ValueAnimator valueAnimator = eVar.f15427s;
                if (valueAnimator != null && valueAnimator.isRunning() && eVar.f15428t.f9845s != i10) {
                    eVar.f15427s.cancel();
                }
                eVar.d(i10, this.f9831R, true);
                return;
            }
        }
        l(i10, 0.0f, true, true, true);
    }

    public final void d() {
        int i10 = this.f9833T;
        int iMax = (i10 == 0 || i10 == 2) ? Math.max(0, this.P - this.f9849w) : 0;
        WeakHashMap weakHashMap = U.a;
        p206v3.e eVar = this.f9848v;
        eVar.setPaddingRelative(iMax, 0, 0, 0);
        int i11 = this.f9833T;
        if (i11 == 0) {
            int i12 = this.f9830Q;
            if (i12 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i12 == 1) {
                eVar.setGravity(1);
            } else if (i12 == 2) {
            }
            eVar.setGravity(8388611);
        } else if (i11 == 1 || i11 == 2) {
            if (this.f9830Q == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            eVar.setGravity(1);
        }
        m(true);
    }

    public final int e(int i10, float f10) {
        p206v3.e eVar;
        View childAt;
        int i11 = this.f9833T;
        if ((i11 != 0 && i11 != 2) || (childAt = (eVar = this.f9848v).getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < eVar.getChildCount() ? eVar.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        WeakHashMap weakHashMap = U.a;
        return getLayoutDirection() == 0 ? left + i13 : left - i13;
    }

    public final void f() {
        if (this.f9841g0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f9841g0 = valueAnimator;
            valueAnimator.setInterpolator(this.f9839d0);
            this.f9841g0.setDuration(this.f9831R);
            this.f9841g0.addUpdateListener(new K(this, 11));
        }
    }

    public final f g(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return (f) this.f9846t.get(i10);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        f fVar = this.f9847u;
        if (fVar != null) {
            return fVar.f15429b;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f9846t.size();
    }

    public int getTabGravity() {
        return this.f9830Q;
    }

    public ColorStateList getTabIconTint() {
        return this.f9819E;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f9837a0;
    }

    public int getTabIndicatorGravity() {
        return this.f9832S;
    }

    public int getTabMaxWidth() {
        return this.f9826L;
    }

    public int getTabMode() {
        return this.f9833T;
    }

    public ColorStateList getTabRippleColor() {
        return this.f9820F;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f9821G;
    }

    public ColorStateList getTabTextColors() {
        return this.f9818D;
    }

    public final f h() {
        f fVar = (f) f9814k0.a();
        if (fVar == null) {
            fVar = new f();
            fVar.f15429b = -1;
        }
        fVar.f15431d = this;
        c cVar = this.f9844j0;
        h hVar = cVar != null ? (h) cVar.a() : null;
        if (hVar == null) {
            hVar = new h(this, getContext());
        }
        hVar.setTab(fVar);
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(null)) {
            hVar.setContentDescription(fVar.a);
        } else {
            hVar.setContentDescription(null);
        }
        fVar.f15432e = hVar;
        return fVar;
    }

    public final void i() {
        p206v3.e eVar = this.f9848v;
        int childCount = eVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            h hVar = (h) eVar.getChildAt(childCount);
            eVar.removeViewAt(childCount);
            if (hVar != null) {
                hVar.setTab(null);
                hVar.setSelected(false);
                this.f9844j0.c(hVar);
            }
            requestLayout();
        }
        Iterator it = this.f9846t.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            it.remove();
            fVar.f15431d = null;
            fVar.f15432e = null;
            fVar.a = null;
            fVar.f15429b = -1;
            fVar.f15430c = null;
            f9814k0.c(fVar);
        }
        this.f9847u = null;
    }

    public final void j(f fVar, boolean z6) {
        TabLayout tabLayout;
        f fVar2 = this.f9847u;
        ArrayList arrayList = this.f0;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((b) arrayList.get(size)).c(fVar);
                }
                c(fVar.f15429b);
                return;
            }
            return;
        }
        int i10 = fVar != null ? fVar.f15429b : -1;
        if (z6) {
            if ((fVar2 == null || fVar2.f15429b == -1) && i10 != -1) {
                tabLayout = this;
                tabLayout.l(i10, 0.0f, true, true, true);
            } else {
                tabLayout = this;
                c(i10);
            }
            if (i10 != -1) {
                setSelectedTabView(i10);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.f9847u = fVar;
        if (fVar2 != null && fVar2.f15431d != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((b) arrayList.get(size2)).b();
            }
        }
        if (fVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((b) arrayList.get(size3)).a(fVar);
            }
        }
    }

    public final void k(a aVar) {
        this.f9842h0 = aVar;
        i();
        a aVar2 = this.f9842h0;
        if (aVar2 != null) {
            int iC = aVar2.c();
            for (int i10 = 0; i10 < iC; i10++) {
                f fVarH = h();
                this.f9842h0.e(i10);
                fVarH.a(null);
                b(fVarH, false);
            }
        }
    }

    public final void l(int i10, float f10, boolean z6, boolean z10, boolean z11) {
        float f11 = i10 + f10;
        int iRound = Math.round(f11);
        if (iRound >= 0) {
            p206v3.e eVar = this.f9848v;
            if (iRound >= eVar.getChildCount()) {
                return;
            }
            if (z10) {
                eVar.f15428t.f9845s = Math.round(f11);
                ValueAnimator valueAnimator = eVar.f15427s;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    eVar.f15427s.cancel();
                }
                eVar.c(eVar.getChildAt(i10), eVar.getChildAt(i10 + 1), f10);
            }
            ValueAnimator valueAnimator2 = this.f9841g0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f9841g0.cancel();
            }
            int iE = e(i10, f10);
            int scrollX = getScrollX();
            boolean z12 = (i10 < getSelectedTabPosition() && iE >= scrollX) || (i10 > getSelectedTabPosition() && iE <= scrollX) || i10 == getSelectedTabPosition();
            WeakHashMap weakHashMap = U.a;
            if (getLayoutDirection() == 1) {
                z12 = (i10 < getSelectedTabPosition() && iE <= scrollX) || (i10 > getSelectedTabPosition() && iE >= scrollX) || i10 == getSelectedTabPosition();
            }
            if (z12 || this.f9843i0 == 1 || z11) {
                if (i10 < 0) {
                    iE = 0;
                }
                scrollTo(iE, 0);
            }
            if (z6) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void m(boolean z6) {
        int i10 = 0;
        while (true) {
            p206v3.e eVar = this.f9848v;
            if (i10 >= eVar.getChildCount()) {
                return;
            }
            View childAt = eVar.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f9833T == 1 && this.f9830Q == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z6) {
                childAt.requestLayout();
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        D3.b.F(this);
        getParent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        h hVar;
        Drawable drawable;
        int i10 = 0;
        while (true) {
            p206v3.e eVar = this.f9848v;
            if (i10 >= eVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = eVar.getChildAt(i10);
            if ((childAt instanceof h) && (drawable = (hVar = (h) childAt).f15435A) != null) {
                drawable.setBounds(hVar.getLeft(), hVar.getTop(), hVar.getRight(), hVar.getBottom());
                hVar.f15435A.draw(canvas);
            }
            i10++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) V.h.a(1, getTabCount(), 1).f5078t);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iRound = Math.round(C.e(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int iE = this.f9828N;
            if (iE <= 0) {
                iE = (int) (size - C.e(getContext(), 56));
            }
            this.f9826L = iE;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i12 = this.f9833T;
            if (i12 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i12 != 1) {
                if (i12 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        D3.b.C(this, f10);
    }

    public void setInlineLabel(boolean z6) {
        if (this.f9834U == z6) {
            return;
        }
        this.f9834U = z6;
        int i10 = 0;
        while (true) {
            p206v3.e eVar = this.f9848v;
            if (i10 >= eVar.getChildCount()) {
                d();
                return;
            }
            View childAt = eVar.getChildAt(i10);
            if (childAt instanceof h) {
                h hVar = (h) childAt;
                hVar.setOrientation(!hVar.f15437C.f9834U ? 1 : 0);
                TextView textView = hVar.f15444y;
                if (textView == null && hVar.f15445z == null) {
                    hVar.g(hVar.f15439t, hVar.f15440u, true);
                } else {
                    hVar.g(textView, hVar.f15445z, false);
                }
            }
            i10++;
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(p206v3.c cVar) {
        setOnTabSelectedListener((b) cVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.f9841g0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.f9821G = drawableMutate;
        int i10 = this.f9822H;
        if (i10 != 0) {
            M.a.g(drawableMutate, i10);
        } else {
            M.a.h(drawableMutate, null);
        }
        int intrinsicHeight = this.f9836W;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f9821G.getIntrinsicHeight();
        }
        this.f9848v.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f9822H = i10;
        Drawable drawable = this.f9821G;
        if (i10 != 0) {
            M.a.g(drawable, i10);
        } else {
            M.a.h(drawable, null);
        }
        m(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f9832S != i10) {
            this.f9832S = i10;
            WeakHashMap weakHashMap = U.a;
            this.f9848v.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f9836W = i10;
        this.f9848v.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f9830Q != i10) {
            this.f9830Q = i10;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f9819E != colorStateList) {
            this.f9819E = colorStateList;
            ArrayList arrayList = this.f9846t;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = ((f) arrayList.get(i10)).f15432e;
                if (hVar != null) {
                    hVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(J.f.c(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f9837a0 = i10;
        if (i10 == 0) {
            this.c0 = new e(27);
            return;
        }
        if (i10 == 1) {
            this.c0 = new p206v3.a(0);
        } else {
            if (i10 == 2) {
                this.c0 = new p206v3.a(1);
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z6) {
        this.f9835V = z6;
        int i10 = p206v3.e.f15426u;
        p206v3.e eVar = this.f9848v;
        eVar.a(eVar.f15428t.getSelectedTabPosition());
        WeakHashMap weakHashMap = U.a;
        eVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i10) {
        if (i10 != this.f9833T) {
            this.f9833T = i10;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f9820F == colorStateList) {
            return;
        }
        this.f9820F = colorStateList;
        int i10 = 0;
        while (true) {
            p206v3.e eVar = this.f9848v;
            if (i10 >= eVar.getChildCount()) {
                return;
            }
            View childAt = eVar.getChildAt(i10);
            if (childAt instanceof h) {
                Context context = getContext();
                int i11 = h.f15434D;
                ((h) childAt).e(context);
            }
            i10++;
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(J.f.c(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f9818D != colorStateList) {
            this.f9818D = colorStateList;
            ArrayList arrayList = this.f9846t;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = ((f) arrayList.get(i10)).f15432e;
                if (hVar != null) {
                    hVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(a aVar) {
        k(aVar);
    }

    public void setUnboundedRipple(boolean z6) {
        if (this.f9838b0 == z6) {
            return;
        }
        this.f9838b0 = z6;
        int i10 = 0;
        while (true) {
            p206v3.e eVar = this.f9848v;
            if (i10 >= eVar.getChildCount()) {
                return;
            }
            View childAt = eVar.getChildAt(i10);
            if (childAt instanceof h) {
                Context context = getContext();
                int i11 = h.f15434D;
                ((h) childAt).e(context);
            }
            i10++;
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(Z0.b bVar) {
        k(null);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(b bVar) {
        b bVar2 = this.f9840e0;
        if (bVar2 != null) {
            this.f0.remove(bVar2);
        }
        this.f9840e0 = bVar;
        if (bVar != null) {
            a(bVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(l.g(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
