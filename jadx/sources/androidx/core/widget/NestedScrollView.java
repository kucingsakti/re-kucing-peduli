package androidx.core.widget;

import U.A;
import U.AbstractC0438y;
import U.AbstractC0439z;
import U.C0422h;
import U.C0429o;
import U.H;
import U.InterfaceC0428n;
import U.InterfaceC0431q;
import U.U;
import U.X;
import U.Y;
import U.r;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a0.e;
import p000a0.h;
import p000a0.i;
import p000a0.j;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0431q, InterfaceC0428n {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final float f6350U = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final h f6351V = new h(0);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int[] f6352W = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f6353A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View f6354B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f6355C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public VelocityTracker f6356D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f6357E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f6358F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f6359G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f6360H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f6361I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f6362J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int[] f6363K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int[] f6364L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f6365M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f6366N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public SavedState f6367O;
    public final r P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final C0429o f6368Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f6369R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public j f6370S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final C0422h f6371T;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f6372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f6373t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f6374u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final OverScroller f6375v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final EdgeEffect f6376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final EdgeEffect f6377x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6378y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6379z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f6380s;

        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            return E0.a.j(sb, this.f6380s, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6380s);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kcstream.cing.R.attr.nestedScrollViewStyle);
        this.f6374u = new Rect();
        this.f6379z = true;
        this.f6353A = false;
        this.f6354B = null;
        this.f6355C = false;
        this.f6358F = true;
        this.f6362J = -1;
        this.f6363K = new int[2];
        this.f6364L = new int[2];
        this.f6371T = new C0422h(getContext(), new V.h(this, 5));
        int i10 = Build.VERSION.SDK_INT;
        this.f6376w = i10 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f6377x = i10 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f6372s = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f6375v = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f6359G = viewConfiguration.getScaledTouchSlop();
        this.f6360H = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6361I = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6352W, com.kcstream.cing.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.P = new r();
        this.f6368Q = new C0429o(this);
        setNestedScrollingEnabled(true);
        U.n(this, f6351V);
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // U.InterfaceC0430p
    public final void a(View view, View view2, int i10, int i11) {
        r rVar = this.P;
        if (i11 == 1) {
            rVar.f4845b = i10;
        } else {
            rVar.a = i10;
        }
        this.f6368Q.g(2, i11);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // U.InterfaceC0430p
    public final void b(View view, int i10) {
        r rVar = this.P;
        if (i10 == 1) {
            rVar.f4845b = 0;
        } else {
            rVar.a = 0;
        }
        w(i10);
    }

    @Override // U.InterfaceC0430p
    public final void c(View view, int i10, int i11, int[] iArr, int i12) {
        this.f6368Q.c(i10, i11, i12, iArr, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i10;
        int scrollRange;
        int overScrollMode;
        if (this.f6375v.isFinished()) {
            return;
        }
        this.f6375v.computeScrollOffset();
        int currY = this.f6375v.getCurrY();
        int i11 = currY - this.f6366N;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f6377x;
        EdgeEffect edgeEffect2 = this.f6376w;
        if (i11 <= 0 || J7.a.h(edgeEffect2) == 0.0f) {
            if (i11 < 0 && J7.a.h(edgeEffect) != 0.0f) {
                float f10 = height;
                iRound = Math.round(J7.a.q(edgeEffect, (i11 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
                if (iRound != i11) {
                    edgeEffect.finish();
                }
            }
            int i12 = i11;
            this.f6366N = currY;
            iArr = this.f6364L;
            iArr[1] = 0;
            this.f6368Q.c(0, i12, 1, iArr, null);
            i10 = i12 - iArr[1];
            scrollRange = getScrollRange();
            if (i10 != 0) {
                int scrollY = getScrollY();
                p(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i13 = i10 - scrollY2;
                iArr[1] = 0;
                this.f6368Q.d(0, scrollY2, 0, i13, this.f6363K, 1, iArr);
                i10 = i13 - iArr[1];
            }
            if (i10 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f6375v.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f6375v.getCurrVelocity());
                    }
                }
                this.f6375v.abortAnimation();
                w(1);
            }
            if (this.f6375v.isFinished()) {
                w(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(J7.a.q(edgeEffect2, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i11) {
            edgeEffect2.finish();
        }
        i11 -= iRound;
        int i14 = i11;
        this.f6366N = currY;
        iArr = this.f6364L;
        iArr[1] = 0;
        this.f6368Q.c(0, i14, 1, iArr, null);
        i10 = i14 - iArr[1];
        scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY3 = getScrollY();
            p(i10, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i15 = i10 - scrollY4;
            iArr[1] = 0;
            this.f6368Q.d(0, scrollY4, 0, i15, this.f6363K, 1, iArr);
            i10 = i15 - iArr[1];
        }
        if (i10 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i10 < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f6375v.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f6375v.getCurrVelocity());
                }
            } else if (i10 < 0) {
                if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f6375v.getCurrVelocity());
                }
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb((int) this.f6375v.getCurrVelocity());
            }
            this.f6375v.abortAnimation();
            w(1);
        }
        if (this.f6375v.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            w(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // U.InterfaceC0431q
    public final void d(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z6) {
        return this.f6368Q.a(f10, f11, z6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f6368Q.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f6368Q.c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f6368Q.d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f6376w;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (i.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f6377x;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (i.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (i.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // U.InterfaceC0430p
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        n(i13, i14, null);
    }

    @Override // U.InterfaceC0430p
    public final boolean f(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public final boolean g(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f6374u;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            s(h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.P;
        return rVar.f4845b | rVar.a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f6369R == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f6369R = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f6369R;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f6368Q.f(0);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    public final boolean i(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f6374u.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? k(33) : g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? k(130) : g(130);
                    }
                    if (keyCode == 62) {
                        q(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return k(33);
                    }
                    if (keyCode == 93) {
                        return k(130);
                    }
                    if (keyCode == 122) {
                        q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        q(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f6368Q.f4833d;
    }

    public final void j(int i10) {
        if (getChildCount() > 0) {
            this.f6375v.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f6368Q.g(2, 1);
            this.f6366N = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean k(int i10) {
        int childCount;
        boolean z6 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f6374u;
        rect.top = 0;
        rect.bottom = height;
        if (z6 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i10, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i10, int i11) {
        Rect rect = this.f6374u;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f6368Q.d(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6362J) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f6378y = (int) motionEvent.getY(i10);
            this.f6362J = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f6356D;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6353A = false;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i10;
        int width;
        int i11;
        int i12;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z6;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f10;
        long j;
        float f11;
        float fSqrt;
        int i13;
        int i14;
        if (motionEvent.getAction() != 8 || this.f6355C) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i10 = 9;
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i10 = 26;
        } else {
            axisValue = 0.0f;
            i10 = 0;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        s(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i10 == 0) {
            return true;
        }
        C0422h c0422h = this.f6371T;
        c0422h.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i15 = c0422h.f4815f;
        int[] iArr = c0422h.f4817h;
        int i16 = 1;
        if (i15 == source && c0422h.f4816g == deviceId && c0422h.f4814e == i10) {
            z6 = false;
            i11 = 20;
            i12 = 0;
        } else {
            Context context = c0422h.a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            i11 = 20;
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i12 = 0;
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 34) {
                Method method = Y.a;
                scaledMinimumFlingVelocity = X.b(viewConfiguration, deviceId2, i10, source2);
            } else {
                Method method2 = Y.a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i10, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i10 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID) : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i17 >= 34) {
                scaledMaximumFlingVelocity = X.a(viewConfiguration, deviceId3, i10, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if ((device2 == null || device2.getMotionRange(i10, source3) == null) ? false : true) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i10 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID) : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                } else {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0422h.f4815f = source;
            c0422h.f4816g = deviceId;
            c0422h.f4814e = i10;
            z6 = true;
        }
        if (iArr[i12] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker2 = c0422h.f4812c;
            if (velocityTracker2 == null) {
                return true;
            }
            velocityTracker2.recycle();
            c0422h.f4812c = null;
            return true;
        }
        if (c0422h.f4812c == null) {
            c0422h.f4812c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker3 = c0422h.f4812c;
        Map map = AbstractC0439z.a;
        velocityTracker3.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC0439z.a;
            if (!map2.containsKey(velocityTracker3)) {
                map2.put(velocityTracker3, new A());
            }
            A a = (A) map2.get(velocityTracker3);
            a.getClass();
            long eventTime = motionEvent.getEventTime();
            int i18 = a.f4769d;
            long[] jArr = a.f4767b;
            if (i18 != 0 && eventTime - jArr[a.f4770e] > 40) {
                a.f4769d = i12;
                a.f4768c = 0.0f;
            }
            int i19 = (a.f4770e + 1) % 20;
            a.f4770e = i19;
            int i20 = a.f4769d;
            if (i20 != i11) {
                a.f4769d = i20 + 1;
            }
            a.a[i19] = motionEvent.getAxisValue(26);
            jArr[a.f4770e] = eventTime;
        }
        float f12 = Float.MAX_VALUE;
        velocityTracker3.computeCurrentVelocity(1000, Float.MAX_VALUE);
        A a10 = (A) AbstractC0439z.a.get(velocityTracker3);
        if (a10 != null) {
            int i21 = a10.f4769d;
            if (i21 < 2) {
                velocityTracker = velocityTracker3;
                f11 = Float.MAX_VALUE;
                i13 = 1000;
                fSqrt = 0.0f;
            } else {
                int i22 = a10.f4770e;
                int i23 = ((i22 + 20) - (i21 - 1)) % 20;
                long[] jArr2 = a10.f4767b;
                long j10 = jArr2[i22];
                while (true) {
                    j = jArr2[i23];
                    if (j10 - j <= 100) {
                        break;
                    }
                    a10.f4769d--;
                    i23 = (i23 + 1) % 20;
                }
                int i24 = a10.f4769d;
                if (i24 < 2) {
                    velocityTracker = velocityTracker3;
                    f11 = Float.MAX_VALUE;
                    i13 = 1000;
                    fSqrt = 0.0f;
                } else {
                    float[] fArr = a10.a;
                    if (i24 == 2) {
                        int i25 = (i23 + 1) % 20;
                        long j11 = jArr2[i25];
                        if (j == j11) {
                            velocityTracker = velocityTracker3;
                            f11 = Float.MAX_VALUE;
                            i13 = 1000;
                            fSqrt = 0.0f;
                        } else {
                            velocityTracker = velocityTracker3;
                            f11 = Float.MAX_VALUE;
                            i13 = 1000;
                            fSqrt = fArr[i25] / (j11 - j);
                        }
                    } else {
                        float f13 = 0.0f;
                        int i26 = 0;
                        int i27 = 0;
                        while (true) {
                            if (i26 >= a10.f4769d - 1) {
                                break;
                            }
                            int i28 = i26 + i23;
                            long j12 = jArr2[i28 % 20];
                            int i29 = (i28 + 1) % 20;
                            if (jArr2[i29] == j12) {
                                i14 = i16;
                            } else {
                                i27++;
                                float fSqrt2 = (f13 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f13) * 2.0f));
                                float f14 = fArr[i29] / (jArr2[i29] - j12);
                                float fAbs = (Math.abs(f14) * (f14 - fSqrt2)) + f13;
                                i14 = i16;
                                if (i27 == i14) {
                                    fAbs *= 0.5f;
                                }
                                f13 = fAbs;
                            }
                            i26 += i14;
                            f12 = f12;
                            i16 = i14;
                            velocityTracker3 = velocityTracker3;
                        }
                        velocityTracker = velocityTracker3;
                        f11 = f12;
                        fSqrt = ((float) Math.sqrt(Math.abs(f13) * 2.0f)) * (f13 < 0.0f ? -1.0f : 1.0f);
                        i13 = 1000;
                    }
                }
            }
            float f15 = fSqrt * i13;
            a10.f4768c = f15;
            if (f15 < (-Math.abs(f11))) {
                a10.f4768c = -Math.abs(f11);
            } else if (a10.f4768c > Math.abs(f11)) {
                a10.f4768c = Math.abs(f11);
            }
        } else {
            velocityTracker = velocityTracker3;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC0438y.a(velocityTracker, i10);
        } else {
            VelocityTracker velocityTracker4 = velocityTracker;
            if (i10 == 0) {
                yVelocity = velocityTracker4.getXVelocity();
            } else if (i10 == 1) {
                yVelocity = velocityTracker4.getYVelocity();
            } else {
                A a11 = (A) AbstractC0439z.a.get(velocityTracker4);
                yVelocity = (a11 == null || i10 != 26) ? 0.0f : a11.f4768c;
            }
        }
        NestedScrollView nestedScrollView = (NestedScrollView) c0422h.f4811b.f5078t;
        float f16 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
        float fSignum = Math.signum(f16);
        if (z6 || (fSignum != Math.signum(c0422h.f4813d) && fSignum != 0.0f)) {
            nestedScrollView.f6375v.abortAnimation();
        }
        if (Math.abs(f16) < iArr[0]) {
            return true;
        }
        int i30 = iArr[1];
        float fMax = Math.max(-i30, Math.min(f16, i30));
        if (fMax == 0.0f) {
            f10 = 0.0f;
        } else {
            nestedScrollView.f6375v.abortAnimation();
            nestedScrollView.j((int) fMax);
            f10 = fMax;
        }
        c0422h.f4813d = f10;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int iFindPointerIndex;
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action == 2 && this.f6355C) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y6 = (int) motionEvent.getY();
            int x8 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y6 < childAt.getTop() - scrollY || y6 >= childAt.getBottom() - scrollY || x8 < childAt.getLeft() || x8 >= childAt.getRight()) {
                    if (!v(motionEvent) && this.f6375v.isFinished()) {
                        z6 = false;
                    }
                    this.f6355C = z6;
                    velocityTracker = this.f6356D;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f6356D = null;
                    }
                } else {
                    this.f6378y = y6;
                    this.f6362J = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f6356D;
                    if (velocityTracker3 == null) {
                        this.f6356D = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f6356D.addMovement(motionEvent);
                    this.f6375v.computeScrollOffset();
                    if (!v(motionEvent) && this.f6375v.isFinished()) {
                        z6 = false;
                    }
                    this.f6355C = z6;
                    this.f6368Q.g(2, 0);
                }
            } else {
                if (!v(motionEvent)) {
                    z6 = false;
                }
                this.f6355C = z6;
                velocityTracker = this.f6356D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f6356D = null;
                }
            }
        } else if (i10 == 1) {
            this.f6355C = false;
            this.f6362J = -1;
            velocityTracker2 = this.f6356D;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f6356D = null;
            }
            if (this.f6375v.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i10 == 2) {
            int i11 = this.f6362J;
            if (i11 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i11)) != -1) {
                int y8 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y8 - this.f6378y) > this.f6359G && (2 & getNestedScrollAxes()) == 0) {
                    this.f6355C = true;
                    this.f6378y = y8;
                    if (this.f6356D == null) {
                        this.f6356D = VelocityTracker.obtain();
                    }
                    this.f6356D.addMovement(motionEvent);
                    this.f6365M = 0;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        } else if (i10 == 3) {
            this.f6355C = false;
            this.f6362J = -1;
            velocityTracker2 = this.f6356D;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f6356D = null;
            }
            if (this.f6375v.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i10 == 6) {
            o(motionEvent);
        }
        return this.f6355C;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        super.onLayout(z6, i10, i11, i12, i13);
        int i14 = 0;
        this.f6379z = false;
        View view = this.f6354B;
        if (view != null && l(view, this)) {
            View view2 = this.f6354B;
            Rect rect = this.f6374u;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.f6354B = null;
        if (!this.f6353A) {
            if (this.f6367O != null) {
                scrollTo(getScrollX(), this.f6367O.f6380s);
                this.f6367O = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i14 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f6353A = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f6357E && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        j((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.f6368Q.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        this.f6368Q.c(i10, i11, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        a(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z6, boolean z10) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus != null && m(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f6367O = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6380s = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        j jVar = this.f6370S;
        if (jVar != null) {
            jVar.f(this, i11);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m(viewFindFocus, 0, i13)) {
            return;
        }
        Rect rect = this.f6374u;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.f6358F) {
                u(0, iH, false);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return f(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f6356D == null) {
            this.f6356D = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6365M = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f10 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f6365M);
        C0429o c0429o = this.f6368Q;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f6377x;
            EdgeEffect edgeEffect2 = this.f6376w;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f6356D;
                velocityTracker.computeCurrentVelocity(1000, this.f6361I);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f6362J);
                if (Math.abs(yVelocity) >= this.f6360H) {
                    if (J7.a.h(edgeEffect2) != 0.0f) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (J7.a.h(edgeEffect) != 0.0f) {
                        int i10 = -yVelocity;
                        if (t(edgeEffect, i10)) {
                            edgeEffect.onAbsorb(i10);
                        } else {
                            j(i10);
                        }
                    } else {
                        int i11 = -yVelocity;
                        float f11 = i11;
                        if (!c0429o.b(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            j(i11);
                        }
                    }
                } else if (this.f6375v.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f6362J = -1;
                this.f6355C = false;
                VelocityTracker velocityTracker2 = this.f6356D;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f6356D = null;
                }
                w(0);
                this.f6376w.onRelease();
                this.f6377x.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f6362J);
                if (iFindPointerIndex != -1) {
                    int y6 = (int) motionEvent.getY(iFindPointerIndex);
                    int i12 = this.f6378y - y6;
                    float x8 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i12 / getHeight();
                    if (J7.a.h(edgeEffect2) != 0.0f) {
                        float f12 = -J7.a.q(edgeEffect2, -height, x8);
                        if (J7.a.h(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f10 = f12;
                    } else if (J7.a.h(edgeEffect) != 0.0f) {
                        float fQ = J7.a.q(edgeEffect, height, 1.0f - x8);
                        if (J7.a.h(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f10 = fQ;
                    }
                    int iRound = Math.round(f10 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i13 = i12 - iRound;
                    if (!this.f6355C && Math.abs(i13) > this.f6359G) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f6355C = true;
                        i13 = i13 > 0 ? i13 - this.f6359G : i13 + this.f6359G;
                    }
                    if (this.f6355C) {
                        int iS = s(i13, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f6378y = y6 - iS;
                        this.f6365M += iS;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f6355C && getChildCount() > 0 && this.f6375v.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f6362J = -1;
                this.f6355C = false;
                VelocityTracker velocityTracker3 = this.f6356D;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f6356D = null;
                }
                w(0);
                this.f6376w.onRelease();
                this.f6377x.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f6378y = (int) motionEvent.getY(actionIndex);
                this.f6362J = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f6378y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f6362J));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f6355C && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f6375v.isFinished()) {
                this.f6375v.abortAnimation();
                w(1);
            }
            int y8 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f6378y = y8;
            this.f6362J = pointerId;
            c0429o.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f6356D;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(int i10, int i11, int i12, int i13) {
        int i14;
        boolean z6;
        int i15;
        boolean z10;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i16 = i12 + i10;
        if (i11 <= 0 && i11 >= 0) {
            i14 = i11;
            z6 = false;
        } else {
            i14 = 0;
            z6 = true;
        }
        if (i16 <= i13) {
            if (i16 < 0) {
                i15 = 0;
            } else {
                i15 = i16;
                z10 = false;
            }
            if (z10 && !this.f6368Q.f(1)) {
                this.f6375v.springBack(i14, i15, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i14, i15);
            return !z6 || z10;
        }
        i15 = i13;
        z10 = true;
        if (z10) {
            this.f6375v.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i14, i15);
        if (z6) {
        }
    }

    public final void q(int i10) {
        boolean z6 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f6374u;
        if (z6) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        r(i10, i11, i12);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean r(int i10, int i11, int i12) {
        boolean z6;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = i10 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z12 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12 && z13) {
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else if (z13) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 < scrollY || i12 > i13) {
            s(z10 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z6 = true;
        } else {
            z6 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f6379z) {
            this.f6354B = view2;
        } else {
            Rect rect = this.f6374u;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z10 = iH != 0;
        if (z10) {
            if (z6) {
                scrollBy(0, iH);
                return z10;
            }
            u(0, iH, false);
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        VelocityTracker velocityTracker;
        if (z6 && (velocityTracker = this.f6356D) != null) {
            velocityTracker.recycle();
            this.f6356D = null;
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f6379z = true;
        super.requestLayout();
    }

    public final int s(int i10, int i11, int i12, boolean z6) {
        int i13;
        int i14;
        boolean z10;
        VelocityTracker velocityTracker;
        C0429o c0429o = this.f6368Q;
        if (i12 == 1) {
            c0429o.g(2, i12);
        }
        boolean zC = this.f6368Q.c(0, i10, i12, this.f6364L, this.f6363K);
        int[] iArr = this.f6364L;
        int[] iArr2 = this.f6363K;
        if (zC) {
            i13 = i10 - iArr[1];
            i14 = iArr2[1];
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z11 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z6;
        boolean z12 = p(i13, 0, scrollY, scrollRange) && !c0429o.f(i12);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f6368Q.d(0, scrollY2, 0, i13 - scrollY2, this.f6363K, i12, iArr);
        int i15 = i14 + iArr2[1];
        int i16 = i13 - iArr[1];
        int i17 = scrollY + i16;
        EdgeEffect edgeEffect = this.f6377x;
        EdgeEffect edgeEffect2 = this.f6376w;
        if (i17 < 0) {
            if (z11) {
                J7.a.q(edgeEffect2, (-i16) / getHeight(), i11 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > scrollRange && z11) {
            J7.a.q(edgeEffect, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z10 = z12;
        } else {
            postInvalidateOnAnimation();
            z10 = false;
        }
        if (z10 && i12 == 0 && (velocityTracker = this.f6356D) != null) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
            w(i12);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i15;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z6) {
        if (z6 != this.f6357E) {
            this.f6357E = z6;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        C0429o c0429o = this.f6368Q;
        if (c0429o.f4833d) {
            WeakHashMap weakHashMap = U.a;
            H.z(c0429o.f4832c);
        }
        c0429o.f4833d = z6;
    }

    public void setOnScrollChangeListener(j jVar) {
        this.f6370S = jVar;
    }

    public void setSmoothScrollingEnabled(boolean z6) {
        this.f6358F = z6;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f6368Q.g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float fH = J7.a.h(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i10) * 0.35f;
        float f10 = this.f6372s * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d3 = f6350U;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * dLog) * ((double) f10))) < fH;
    }

    public final void u(int i10, int i11, boolean z6) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f6373t > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f6375v.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z6) {
                this.f6368Q.g(2, 1);
            } else {
                w(1);
            }
            this.f6366N = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f6375v.isFinished()) {
                this.f6375v.abortAnimation();
                w(1);
            }
            scrollBy(i10, i11);
        }
        this.f6373t = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z6;
        EdgeEffect edgeEffect = this.f6376w;
        if (J7.a.h(edgeEffect) != 0.0f) {
            J7.a.q(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z6 = true;
        } else {
            z6 = false;
        }
        EdgeEffect edgeEffect2 = this.f6377x;
        if (J7.a.h(edgeEffect2) == 0.0f) {
            return z6;
        }
        J7.a.q(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i10) {
        this.f6368Q.h(i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
