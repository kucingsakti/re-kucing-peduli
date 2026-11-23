package androidx.appcompat.widget;

import B4.L;
import U.B0;
import U.F;
import U.H;
import U.InterfaceC0430p;
import U.InterfaceC0431q;
import U.U;
import U.p0;
import U.q0;
import U.r;
import U.r0;
import U.s0;
import U.y0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.kcstream.cing.R;
import java.util.WeakHashMap;
import p.C0699e;
import p.C0701f;
import p.InterfaceC0697d;
import p.InterfaceC0702f0;
import p.InterfaceC0704g0;
import p.RunnableC0695c;
import p.T0;
import p.X0;
import p078i.S;
import p125n.i;
import p136o.l;
import p136o.w;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0702f0, InterfaceC0430p, InterfaceC0431q {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int[] f6098U = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final B0 f6099V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final Rect f6100W;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f6101A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f6102B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f6103C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f6104D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Rect f6105E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Rect f6106F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Rect f6107G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Rect f6108H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public B0 f6109I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public B0 f6110J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public B0 f6111K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public B0 f6112L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public InterfaceC0697d f6113M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public OverScroller f6114N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ViewPropertyAnimator f6115O;
    public final L P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final RunnableC0695c f6116Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final RunnableC0695c f6117R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final r f6118S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final C0701f f6119T;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6120s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6121t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ContentFrameLayout f6122u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ActionBarContainer f6123v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InterfaceC0704g0 f6124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f6125x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6126y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6127z;

    static {
        s0 q0Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            q0Var = new r0();
        } else {
            q0Var = i10 >= 29 ? new q0() : new p0();
        }
        q0Var.g(L.c.b(0, 1, 0, 1));
        f6099V = q0Var.b();
        f6100W = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6121t = 0;
        this.f6105E = new Rect();
        this.f6106F = new Rect();
        this.f6107G = new Rect();
        this.f6108H = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        B0 b3 = B0.f4771b;
        this.f6109I = b3;
        this.f6110J = b3;
        this.f6111K = b3;
        this.f6112L = b3;
        this.P = new L(this, 10);
        this.f6116Q = new RunnableC0695c(this, 0);
        this.f6117R = new RunnableC0695c(this, 1);
        i(context);
        this.f6118S = new r();
        C0701f c0701f = new C0701f(context);
        c0701f.setWillNotDraw(true);
        this.f6119T = c0701f;
        addView(c0701f);
    }

    public static boolean g(View view, Rect rect, boolean z6) {
        boolean z10;
        C0699e c0699e = (C0699e) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) c0699e).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) c0699e).leftMargin = i11;
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) c0699e).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) c0699e).topMargin = i13;
            z10 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) c0699e).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) c0699e).rightMargin = i15;
            z10 = true;
        }
        if (z6) {
            int i16 = ((ViewGroup.MarginLayoutParams) c0699e).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) c0699e).bottomMargin = i17;
                return true;
            }
        }
        return z10;
    }

    @Override // U.InterfaceC0430p
    public final void a(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // U.InterfaceC0430p
    public final void b(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // U.InterfaceC0430p
    public final void c(View view, int i10, int i11, int[] iArr, int i12) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0699e;
    }

    @Override // U.InterfaceC0431q
    public final void d(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        e(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f6125x != null) {
            if (this.f6123v.getVisibility() == 0) {
                translationY = (int) (this.f6123v.getTranslationY() + this.f6123v.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f6125x.setBounds(0, translationY, getWidth(), this.f6125x.getIntrinsicHeight() + translationY);
            this.f6125x.draw(canvas);
        }
    }

    @Override // U.InterfaceC0430p
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // U.InterfaceC0430p
    public final boolean f(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0699e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0699e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f6123v;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.f6118S;
        return rVar.f4845b | rVar.a;
    }

    public CharSequence getTitle() {
        k();
        return ((X0) this.f6124w).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f6116Q);
        removeCallbacks(this.f6117R);
        ViewPropertyAnimator viewPropertyAnimator = this.f6115O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f6098U);
        this.f6120s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f6125x = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f6114N = new OverScroller(context);
    }

    public final void j(int i10) {
        k();
        if (i10 == 2) {
            ((X0) this.f6124w).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i10 == 5) {
            ((X0) this.f6124w).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0704g0 wrapper;
        if (this.f6122u == null) {
            this.f6122u = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f6123v = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0704g0) {
                wrapper = (InterfaceC0704g0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f6124w = wrapper;
        }
    }

    public final void l(l lVar, w wVar) {
        k();
        X0 x8 = (X0) this.f6124w;
        b bVar = x8.f14018m;
        Toolbar toolbar = x8.a;
        if (bVar == null) {
            b bVar2 = new b(toolbar.getContext());
            x8.f14018m = bVar2;
            bVar2.f6253A = R.id.action_menu_presenter;
        }
        b bVar3 = x8.f14018m;
        bVar3.f6273w = wVar;
        if (lVar == null && toolbar.f6239s == null) {
            return;
        }
        toolbar.f();
        l lVar2 = toolbar.f6239s.f6129H;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            lVar2.r(toolbar.f6230g0);
            lVar2.r(toolbar.f6231h0);
        }
        if (toolbar.f6231h0 == null) {
            toolbar.f6231h0 = new T0(toolbar);
        }
        bVar3.f6262J = true;
        if (lVar != null) {
            lVar.b(bVar3, toolbar.f6205B);
            lVar.b(toolbar.f6231h0, toolbar.f6205B);
        } else {
            bVar3.i(toolbar.f6205B, null);
            toolbar.f6231h0.i(toolbar.f6205B, null);
            bVar3.e(true);
            toolbar.f6231h0.e(true);
        }
        toolbar.f6239s.setPopupTheme(toolbar.f6206C);
        toolbar.f6239s.setPresenter(bVar3);
        toolbar.f6230g0 = bVar3;
        toolbar.w();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        B0 b0H = B0.h(this, windowInsets);
        boolean zG = g(this.f6123v, new Rect(b0H.b(), b0H.d(), b0H.c(), b0H.a()), false);
        WeakHashMap weakHashMap = U.a;
        Rect rect = this.f6105E;
        H.b(this, b0H, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        y0 y0Var = b0H.a;
        B0 b0L = y0Var.l(i10, i11, i12, i13);
        this.f6109I = b0L;
        boolean z6 = true;
        if (!this.f6110J.equals(b0L)) {
            this.f6110J = this.f6109I;
            zG = true;
        }
        Rect rect2 = this.f6106F;
        if (rect2.equals(rect)) {
            z6 = zG;
        } else {
            rect2.set(rect);
        }
        if (z6) {
            requestLayout();
        }
        return y0Var.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = U.a;
        F.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0699e c0699e = (C0699e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) c0699e).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) c0699e).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        B0 b3;
        int i12;
        s0 p0Var;
        k();
        measureChildWithMargins(this.f6123v, i10, 0, i11, 0);
        C0699e c0699e = (C0699e) this.f6123v.getLayoutParams();
        int iMax = Math.max(0, this.f6123v.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0699e).leftMargin + ((ViewGroup.MarginLayoutParams) c0699e).rightMargin);
        int iMax2 = Math.max(0, this.f6123v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0699e).topMargin + ((ViewGroup.MarginLayoutParams) c0699e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f6123v.getMeasuredState());
        WeakHashMap weakHashMap = U.a;
        boolean z6 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z6) {
            measuredHeight = this.f6120s;
            if (this.f6127z && this.f6123v.getTabContainer() != null) {
                measuredHeight += this.f6120s;
            }
        } else {
            measuredHeight = this.f6123v.getVisibility() != 8 ? this.f6123v.getMeasuredHeight() : 0;
        }
        Rect rect = this.f6105E;
        Rect rect2 = this.f6107G;
        rect2.set(rect);
        this.f6111K = this.f6109I;
        if (this.f6126y || z6) {
            L.c cVarB = L.c.b(this.f6111K.b(), this.f6111K.d() + measuredHeight, this.f6111K.c(), this.f6111K.a());
            b3 = this.f6111K;
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                p0Var = new r0(b3);
            } else if (i12 >= 29) {
                p0Var = new q0(b3);
            } else {
                p0Var = new p0(b3);
            }
            p0Var.g(cVarB);
            this.f6111K = p0Var.b();
        } else {
            C0701f c0701f = this.f6119T;
            B0 b7 = f6099V;
            Rect rect3 = this.f6108H;
            H.b(c0701f, b7, rect3);
            if (rect3.equals(f6100W)) {
                L.c cVarB2 = L.c.b(this.f6111K.b(), this.f6111K.d() + measuredHeight, this.f6111K.c(), this.f6111K.a());
                b3 = this.f6111K;
                i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    p0Var = new r0(b3);
                } else if (i12 >= 29) {
                    p0Var = new q0(b3);
                } else {
                    p0Var = new p0(b3);
                }
                p0Var.g(cVarB2);
                this.f6111K = p0Var.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f6111K = this.f6111K.a.l(0, measuredHeight, 0, 0);
            }
        }
        g(this.f6122u, rect2, true);
        if (!this.f6112L.equals(this.f6111K)) {
            B0 b10 = this.f6111K;
            this.f6112L = b10;
            U.b(this.f6122u, b10);
        }
        measureChildWithMargins(this.f6122u, i10, 0, i11, 0);
        C0699e c0699e2 = (C0699e) this.f6122u.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f6122u.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0699e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0699e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f6122u.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0699e2).topMargin + ((ViewGroup.MarginLayoutParams) c0699e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f6122u.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z6) {
        if (!this.f6101A || !z6) {
            return false;
        }
        this.f6114N.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f6114N.getFinalY() > this.f6123v.getHeight()) {
            h();
            this.f6117R.run();
        } else {
            h();
            this.f6116Q.run();
        }
        this.f6102B = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f6103C + i11;
        this.f6103C = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        S s9;
        i iVar;
        this.f6118S.a = i10;
        this.f6103C = getActionBarHideOffset();
        h();
        InterfaceC0697d interfaceC0697d = this.f6113M;
        if (interfaceC0697d == null || (iVar = (s9 = (S) interfaceC0697d).f12021t) == null) {
            return;
        }
        iVar.a();
        s9.f12021t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f6123v.getVisibility() != 0) {
            return false;
        }
        return this.f6101A;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f6101A || this.f6102B) {
            return;
        }
        if (this.f6103C <= this.f6123v.getHeight()) {
            h();
            postDelayed(this.f6116Q, 600L);
        } else {
            h();
            postDelayed(this.f6117R, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        k();
        int i11 = this.f6104D ^ i10;
        this.f6104D = i10;
        boolean z6 = (i10 & 4) == 0;
        boolean z10 = (i10 & 256) != 0;
        InterfaceC0697d interfaceC0697d = this.f6113M;
        if (interfaceC0697d != null) {
            S s9 = (S) interfaceC0697d;
            s9.f12017p = !z10;
            if (z6 || !z10) {
                if (s9.f12018q) {
                    s9.f12018q = false;
                    s9.d0(true);
                }
            } else if (!s9.f12018q) {
                s9.f12018q = true;
                s9.d0(true);
            }
        }
        if ((i11 & 256) == 0 || this.f6113M == null) {
            return;
        }
        WeakHashMap weakHashMap = U.a;
        F.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f6121t = i10;
        InterfaceC0697d interfaceC0697d = this.f6113M;
        if (interfaceC0697d != null) {
            ((S) interfaceC0697d).f12016o = i10;
        }
    }

    public void setActionBarHideOffset(int i10) {
        h();
        this.f6123v.setTranslationY(-Math.max(0, Math.min(i10, this.f6123v.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0697d interfaceC0697d) {
        this.f6113M = interfaceC0697d;
        if (getWindowToken() != null) {
            ((S) this.f6113M).f12016o = this.f6121t;
            int i10 = this.f6104D;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap weakHashMap = U.a;
                F.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z6) {
        this.f6127z = z6;
    }

    public void setHideOnContentScrollEnabled(boolean z6) {
        if (z6 != this.f6101A) {
            this.f6101A = z6;
            if (z6) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        k();
        X0 x8 = (X0) this.f6124w;
        x8.f14010d = i10 != 0 ? p068ga.l.g(x8.a.getContext(), i10) : null;
        x8.d();
    }

    public void setLogo(int i10) {
        k();
        X0 x8 = (X0) this.f6124w;
        x8.f14011e = i10 != 0 ? p068ga.l.g(x8.a.getContext(), i10) : null;
        x8.d();
    }

    public void setOverlayMode(boolean z6) {
        this.f6126y = z6;
    }

    public void setShowingForActionMode(boolean z6) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // p.InterfaceC0702f0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((X0) this.f6124w).f14016k = callback;
    }

    @Override // p.InterfaceC0702f0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        X0 x8 = (X0) this.f6124w;
        if (x8.f14013g) {
            return;
        }
        x8.f14014h = charSequence;
        if ((x8.f14008b & 8) != 0) {
            Toolbar toolbar = x8.a;
            toolbar.setTitle(charSequence);
            if (x8.f14013g) {
                U.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0699e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        X0 x8 = (X0) this.f6124w;
        x8.f14010d = drawable;
        x8.d();
    }
}
