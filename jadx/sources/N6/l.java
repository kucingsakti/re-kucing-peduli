package N6;

import A1.RunnableC0094c;
import C0.w;
import F8.C0212f;
import J0.s;
import U.H;
import U.U;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import com.smarteist.autoimageslider.SliderPager$SavedState;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l extends ViewGroup {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int[] f3349u0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final C0212f f3350v0 = new C0212f(12);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final s f3351w0 = new s(1);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final C0212f f3352x0 = new C0212f(13);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public h f3353A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f3354B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public j f3355C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f3356D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Drawable f3357E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f3358F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f3359G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f3360H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f3361I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f3362J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f3363K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f3364L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f3365M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f3366N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f3367O;
    public boolean P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f3368Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f3369R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final int f3370S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f3371T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public float f3372U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f3373V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float f3374W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f3375a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public VelocityTracker f3376b0;
    public final int c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f3377d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f3378e0;
    public final int f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final EdgeEffect f3379g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final EdgeEffect f3380h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f3381i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f3382j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f3383k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ArrayList f3384l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public g f3385m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ArrayList f3386n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public i f3387o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f3388p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f3389q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ArrayList f3390r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3391s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final RunnableC0094c f3392s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f3393t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f3394t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d f3395u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f3396v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Z0.a f3397w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3398x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3399y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Parcelable f3400z;

    public l(Context context) {
        super(context);
        this.f3393t = new ArrayList();
        this.f3395u = new d();
        this.f3396v = new Rect();
        this.f3399y = -1;
        this.f3400z = null;
        this.f3360H = -3.4028235E38f;
        this.f3361I = Float.MAX_VALUE;
        this.f3366N = 1;
        this.f3375a0 = -1;
        this.f3381i0 = true;
        this.f3392s0 = new RunnableC0094c(this, 11);
        this.f3394t0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        h hVar = new h(context2, f3351w0);
        hVar.a = 250;
        this.f3353A = hVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.f3370S = viewConfiguration.getScaledPagingTouchSlop();
        this.c0 = (int) (400.0f * f10);
        this.f3377d0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3379g0 = new EdgeEffect(context2);
        this.f3380h0 = new EdgeEffect(context2);
        this.f3378e0 = (int) (25.0f * f10);
        this.f0 = (int) (2.0f * f10);
        this.f3368Q = (int) (f10 * 16.0f);
        U.n(this, new w(this, 1));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        o1.k kVar = new o1.k();
        kVar.f13639t = this;
        kVar.f13638s = new Rect();
        H.u(this, kVar);
    }

    public static boolean c(int i10, int i11, int i12, View view, boolean z6) {
        int i13;
        if (!(view instanceof ViewGroup)) {
            return z6 ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i14 = i11 + scrollX;
            if (i14 < childAt.getLeft() || i14 >= childAt.getRight() || (i13 = i12 + scrollY) < childAt.getTop() || i13 >= childAt.getBottom() || !c(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
            }
        }
        if (z6 || !view.canScrollHorizontally(-i10)) {
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setAdapterViewPagerObserver(j jVar) {
        try {
            Method declaredMethod = Z0.a.class.getDeclaredMethod(R5.a.PUSH_MINIFIED_BUTTON_TEXT, DataSetObserver.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.f3397w, jVar);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void setScrollingCacheEnabled(boolean z6) {
        if (this.f3364L != z6) {
            this.f3364L = z6;
        }
    }

    public final d a(int i10, int i11) {
        d dVar = new d();
        dVar.f3340b = i10;
        dVar.a = this.f3397w.g(this, i10);
        this.f3397w.f();
        dVar.f3342d = 1.0f;
        ArrayList arrayList = this.f3393t;
        if (i11 < 0 || i11 >= arrayList.size()) {
            arrayList.add(dVar);
            return dVar;
        }
        arrayList.add(i11, dVar);
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        d dVarG;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (dVarG = g(childAt)) != null && dVarG.f3340b == this.f3398x) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        d dVarG;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (dVarG = g(childAt)) != null && dVarG.f3340b == this.f3398x) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        e eVar = (e) layoutParams;
        boolean z6 = eVar.a | (view.getClass().getAnnotation(c.class) != null);
        eVar.a = z6;
        if (!this.f3363K) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z6) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            eVar.f3346d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public final boolean b(int i10) {
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        parent2.getClass();
                    }
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        boolean zL = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f3396v;
            if (i10 == 17) {
                int i11 = f(rect, viewFindNextFocus).left;
                int i12 = f(rect, viewFindFocus).left;
                if (viewFindFocus == null || i11 < i12) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                    zL = zRequestFocus;
                } else {
                    int i13 = this.f3398x;
                    if (i13 > 0) {
                        t(i13 - 1, true);
                        zL = true;
                    }
                }
            } else if (i10 == 66) {
                zRequestFocus = (viewFindFocus == null || f(rect, viewFindNextFocus).left > f(rect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : l();
                zL = zRequestFocus;
            }
        } else if (i10 == 17 || i10 == 1) {
            int i14 = this.f3398x;
            if (i14 > 0) {
                t(i14 - 1, true);
                zL = true;
            }
        } else if (i10 == 66 || i10 == 2) {
            zL = l();
        }
        if (zL) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zL;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (this.f3397w == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f3360H));
        }
        return i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f3361I));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f3354B = true;
        if (this.f3353A.isFinished() || !this.f3353A.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f3353A.getCurrX();
        int currY = this.f3353A.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m(currX)) {
                this.f3353A.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = U.a;
        postInvalidateOnAnimation();
    }

    public final void d(boolean z6) {
        boolean z10 = this.f3394t0 == 2;
        if (z10) {
            setScrollingCacheEnabled(false);
            if (!this.f3353A.isFinished()) {
                this.f3353A.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f3353A.getCurrX();
                int currY = this.f3353A.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m(currX);
                    }
                }
            }
        }
        this.f3365M = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3393t;
            if (i10 >= arrayList.size()) {
                break;
            }
            d dVar = (d) arrayList.get(i10);
            if (dVar.f3341c) {
                dVar.f3341c = false;
                z10 = true;
            }
            i10++;
        }
        if (z10) {
            RunnableC0094c runnableC0094c = this.f3392s0;
            if (!z6) {
                runnableC0094c.run();
            } else {
                WeakHashMap weakHashMap = U.a;
                postOnAnimation(runnableC0094c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zB;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zB = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        zB = keyEvent.hasModifiers(2) ? l() : b(66);
                    } else if (keyCode != 61) {
                        zB = false;
                    } else if (keyEvent.hasNoModifiers()) {
                        zB = b(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        zB = b(1);
                    } else {
                        zB = false;
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    int i10 = this.f3398x;
                    if (i10 > 0) {
                        t(i10 - 1, true);
                        zB = true;
                    } else {
                        zB = false;
                    }
                } else {
                    zB = b(17);
                }
            }
            if (!zB) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        d dVarG;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (dVarG = g(childAt)) != null && dVarG.f3340b == this.f3398x && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Z0.a aVar;
        EdgeEffect edgeEffect = this.f3380h0;
        EdgeEffect edgeEffect2 = this.f3379g0;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f3397w) != null && aVar.c() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f3360H * width);
                edgeEffect2.setSize(height, width);
                zDraw = edgeEffect2.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!edgeEffect.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f3361I + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                zDraw |= edgeEffect.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (zDraw) {
            WeakHashMap weakHashMap = U.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3357E;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        int iC = this.f3397w.c();
        this.f3391s = iC;
        ArrayList arrayList = this.f3393t;
        boolean z6 = arrayList.size() < (this.f3366N * 2) + 1 && arrayList.size() < iC;
        int iMax = this.f3398x;
        boolean z10 = false;
        while (arrayList.size() > 0) {
            d dVar = (d) arrayList.get(0);
            Z0.a aVar = this.f3397w;
            Object obj = dVar.a;
            aVar.d();
            arrayList.remove(0);
            if (!z10) {
                this.f3397w.o();
                z10 = true;
            }
            this.f3397w.a(this, dVar.f3340b, dVar.a);
            int i10 = this.f3398x;
            if (i10 == dVar.f3340b) {
                iMax = Math.max(0, Math.min(i10, iC - 1));
            }
            z6 = true;
        }
        if (z10) {
            this.f3397w.b();
        }
        Collections.sort(arrayList, f3350v0);
        if (z6) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                e eVar = (e) getChildAt(i11).getLayoutParams();
                if (!eVar.a) {
                    eVar.f3345c = 0.0f;
                }
            }
            u(iMax, 0, false, true);
            requestLayout();
        }
    }

    public final Rect f(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final d g(View view) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3393t;
            if (i10 >= arrayList.size()) {
                return null;
            }
            d dVar = (d) arrayList.get(i10);
            if (this.f3397w.h(view, dVar.a)) {
                return dVar;
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        e eVar = new e(-1, -1);
        eVar.f3345c = 0.0f;
        return eVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public Z0.a getAdapter() {
        return this.f3397w;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        if (this.f3389q0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        ArrayList arrayList = this.f3390r0;
        if (arrayList == null || arrayList.size() != getChildCount()) {
            w();
        }
        return ((e) ((View) this.f3390r0.get(i11)).getLayoutParams()).f3348f;
    }

    public int getCurrentItem() {
        Z0.a aVar = this.f3397w;
        return (!(aVar instanceof p007a7.a) || ((p007a7.a) aVar).q() <= 0) ? this.f3398x : ((p007a7.a) this.f3397w).r(this.f3398x);
    }

    public int getOffscreenPageLimit() {
        return this.f3366N;
    }

    public int getPageMargin() {
        return this.f3356D;
    }

    public final d h() {
        d dVar;
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f3356D / clientWidth : 0.0f;
        boolean z6 = true;
        int i11 = 0;
        d dVar2 = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (true) {
            ArrayList arrayList = this.f3393t;
            if (i11 >= arrayList.size()) {
                break;
            }
            d dVar3 = (d) arrayList.get(i11);
            if (z6 || dVar3.f3340b == (i10 = i12 + 1)) {
                dVar = dVar3;
            } else {
                float f13 = f10 + f12 + f11;
                d dVar4 = this.f3395u;
                dVar4.f3343e = f13;
                dVar4.f3340b = i10;
                this.f3397w.f();
                dVar4.f3342d = 1.0f;
                i11--;
                dVar = dVar4;
            }
            f10 = dVar.f3343e;
            float f14 = dVar.f3342d + f10 + f11;
            if (!z6 && scrollX < f10) {
                break;
            }
            if (scrollX < f14 || i11 == arrayList.size() - 1) {
                return dVar;
            }
            int i13 = dVar.f3340b;
            float f15 = dVar.f3342d;
            i11++;
            d dVar5 = dVar;
            i12 = i13;
            f12 = f15;
            dVar2 = dVar5;
            z6 = false;
        }
        return dVar2;
    }

    public final d i(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f3393t;
            if (i11 >= arrayList.size()) {
                return null;
            }
            d dVar = (d) arrayList.get(i11);
            if (dVar.f3340b == i10) {
                return dVar;
            }
            i11++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    public final void j(int i10, float f10, int i11) {
        int iMax;
        int width;
        int left;
        if (this.f3383k0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a) {
                    int i13 = eVar.f3344b & 7;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = iMax;
                    width = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        g gVar = this.f3385m0;
        if (gVar != null) {
            gVar.c(i10, f10);
        }
        ArrayList arrayList = this.f3384l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                g gVar2 = (g) this.f3384l0.get(i15);
                if (gVar2 != null) {
                    gVar2.c(i10, f10);
                }
            }
        }
        if (this.f3387o0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = getChildAt(i16);
                if (!((e) childAt2.getLayoutParams()).a) {
                    this.f3387o0.j(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.f3382j0 = true;
    }

    public final void k(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3375a0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f3371T = motionEvent.getX(i10);
            this.f3375a0 = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f3376b0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean l() {
        Z0.a aVar = this.f3397w;
        if (aVar == null || this.f3398x >= aVar.c() - 1) {
            return false;
        }
        t(this.f3398x + 1, true);
        return true;
    }

    public final boolean m(int i10) {
        if (this.f3393t.size() == 0) {
            if (!this.f3381i0) {
                this.f3382j0 = false;
                j(0, 0.0f, 0);
                if (!this.f3382j0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        d dVarH = h();
        int clientWidth = getClientWidth();
        int i11 = this.f3356D;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = dVarH.f3340b;
        float f11 = ((i10 / f10) - dVarH.f3343e) / (dVarH.f3342d + (i11 / f10));
        this.f3382j0 = false;
        j(i13, f11, (int) (i12 * f11));
        if (this.f3382j0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean n(float f10) {
        boolean z6;
        boolean z10;
        float f11 = this.f3371T - f10;
        this.f3371T = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f3360H * clientWidth;
        float f13 = this.f3361I * clientWidth;
        ArrayList arrayList = this.f3393t;
        boolean z11 = false;
        d dVar = (d) arrayList.get(0);
        d dVar2 = (d) arrayList.get(arrayList.size() - 1);
        if (dVar.f3340b != 0) {
            f12 = dVar.f3343e * clientWidth;
            z6 = false;
        } else {
            z6 = true;
        }
        if (dVar2.f3340b != this.f3397w.c() - 1) {
            f13 = dVar2.f3343e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (scrollX < f12) {
            if (z6) {
                this.f3379g0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z11 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z10) {
                this.f3380h0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z11 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.f3371T = (scrollX - i10) + this.f3371T;
        scrollTo(i10, getScrollY());
        m(i10);
        return z11;
    }

    public final void o() {
        p(this.f3398x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3381i0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f3392s0);
        h hVar = this.f3353A;
        if (hVar != null && !hVar.isFinished()) {
            this.f3353A.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        super.onDraw(canvas);
        if (this.f3356D <= 0 || this.f3357E == null) {
            return;
        }
        ArrayList arrayList = this.f3393t;
        if (arrayList.size() <= 0 || this.f3397w == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f11 = width;
        float f12 = this.f3356D / f11;
        int i11 = 0;
        d dVar = (d) arrayList.get(0);
        float f13 = dVar.f3343e;
        int size = arrayList.size();
        int i12 = dVar.f3340b;
        int i13 = ((d) arrayList.get(size - 1)).f3340b;
        while (i12 < i13) {
            while (true) {
                i10 = dVar.f3340b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                dVar = (d) arrayList.get(i11);
            }
            if (i12 == i10) {
                float f14 = dVar.f3343e + dVar.f3342d;
                f10 = f14 * f11;
                f13 = f14 + f12;
            } else {
                this.f3397w.f();
                float f15 = (f13 + 1.0f) * f11;
                f13 = 1.0f + f12 + f13;
                f10 = f15;
            }
            if (this.f3356D + f10 > scrollX) {
                this.f3357E.setBounds(Math.round(f10), this.f3358F, Math.round(this.f3356D + f10), this.f3359G);
                this.f3357E.draw(canvas);
            }
            if (f10 > scrollX + width) {
                return;
            }
            i12++;
            arrayList = arrayList;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10 = this.f3370S;
        try {
            int action = motionEvent.getAction() & 255;
            if (action != 3 && action != 1) {
                if (action != 0) {
                    if (this.f3367O) {
                        return true;
                    }
                    if (this.P) {
                        return false;
                    }
                }
                if (action == 0) {
                    float x8 = motionEvent.getX();
                    this.f3373V = x8;
                    this.f3371T = x8;
                    float y6 = motionEvent.getY();
                    this.f3374W = y6;
                    this.f3372U = y6;
                    this.f3375a0 = motionEvent.getPointerId(0);
                    this.P = false;
                    this.f3354B = true;
                    this.f3353A.computeScrollOffset();
                    if (this.f3394t0 != 2 || Math.abs(this.f3353A.getFinalX() - this.f3353A.getCurrX()) <= this.f0) {
                        d(false);
                        this.f3367O = false;
                    } else {
                        this.f3353A.abortAnimation();
                        this.f3365M = false;
                        o();
                        this.f3367O = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        setScrollState(1);
                    }
                } else if (action == 2) {
                    int i11 = this.f3375a0;
                    if (i11 != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                        float x10 = motionEvent.getX(iFindPointerIndex);
                        float f10 = x10 - this.f3371T;
                        float fAbs = Math.abs(f10);
                        float y8 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y8 - this.f3374W);
                        if (f10 != 0.0f) {
                            float f11 = this.f3371T;
                            if ((f11 >= this.f3369R || f10 <= 0.0f) && ((f11 <= getWidth() - this.f3369R || f10 >= 0.0f) && c((int) f10, (int) x10, (int) y8, this, false))) {
                                this.f3371T = x10;
                                this.f3372U = y8;
                                this.P = true;
                                return false;
                            }
                        }
                        float f12 = i10;
                        if (fAbs > f12 && fAbs * 0.5f > fAbs2) {
                            this.f3367O = true;
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            this.f3371T = f10 > 0.0f ? this.f3373V + i10 : this.f3373V - i10;
                            this.f3372U = y8;
                            setScrollingCacheEnabled(true);
                        } else if (fAbs2 > f12) {
                            this.P = true;
                        }
                        if (this.f3367O && n(x10)) {
                            WeakHashMap weakHashMap = U.a;
                            postInvalidateOnAnimation();
                        }
                    }
                } else if (action == 6) {
                    k(motionEvent);
                }
                if (this.f3376b0 == null) {
                    this.f3376b0 = VelocityTracker.obtain();
                }
                this.f3376b0.addMovement(motionEvent);
                return this.f3367O;
            }
            r();
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        boolean z10;
        d dVarG;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a) {
                    int i18 = eVar.f3344b;
                    int i19 = i18 & 7;
                    int i20 = i18 & 112;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 != 16) {
                            if (i20 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, childAt.getMeasuredHeight() + paddingTop);
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingLeft + scrollX;
                        childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i24;
                    if (i20 != 16) {
                        if (i20 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingLeft + scrollX;
                    childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, childAt.getMeasuredHeight() + paddingTop);
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i28 = (i14 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                e eVar2 = (e) childAt2.getLayoutParams();
                if (!eVar2.a && (dVarG = g(childAt2)) != null) {
                    float f10 = i28;
                    int i30 = ((int) (dVarG.f3343e * f10)) + paddingLeft;
                    if (eVar2.f3346d) {
                        eVar2.f3346d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * eVar2.f3345c), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i30, paddingTop, childAt2.getMeasuredWidth() + i30, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f3358F = paddingTop;
        this.f3359G = i15 - paddingBottom;
        this.f3383k0 = i16;
        if (this.f3381i0) {
            z10 = false;
            s(this.f3398x, 0, false, false);
        } else {
            z10 = false;
        }
        this.f3381i0 = z10;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        e eVar;
        e eVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f3369R = Math.min(measuredWidth / 10, this.f3368Q);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z6 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (eVar2 = (e) childAt.getLayoutParams()) != null && eVar2.a) {
                int i15 = eVar2.f3344b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z10 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z6 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z10) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z6 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) eVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) eVar2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z6) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f3362J = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f3363K = true;
        o();
        this.f3363K = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((eVar = (e) childAt2.getLayoutParams()) == null || !eVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * eVar.f3345c), 1073741824), this.f3362J);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        d dVarG;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (dVarG = g(childAt)) != null && dVarG.f3340b == this.f3398x && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SliderPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SliderPager$SavedState sliderPager$SavedState = (SliderPager$SavedState) parcelable;
        super.onRestoreInstanceState(sliderPager$SavedState.f6382s);
        Z0.a aVar = this.f3397w;
        if (aVar != null) {
            aVar.k();
            u(sliderPager$SavedState.f10315u, 0, false, true);
        } else {
            this.f3399y = sliderPager$SavedState.f10315u;
            this.f3400z = sliderPager$SavedState.f10316v;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SliderPager$SavedState sliderPager$SavedState = new SliderPager$SavedState(super.onSaveInstanceState());
        sliderPager$SavedState.f10315u = this.f3398x;
        Z0.a aVar = this.f3397w;
        if (aVar != null) {
            aVar.l();
            sliderPager$SavedState.f10316v = null;
        }
        return sliderPager$SavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f3356D;
            q(i10, i12, i14, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Z0.a aVar;
        int i10 = this.f3370S;
        boolean zR = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f3397w) == null || aVar.c() == 0) {
            return false;
        }
        if (this.f3376b0 == null) {
            this.f3376b0 = VelocityTracker.obtain();
        }
        this.f3376b0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f3353A.abortAnimation();
            this.f3365M = false;
            o();
            float x8 = motionEvent.getX();
            this.f3373V = x8;
            this.f3371T = x8;
            float y6 = motionEvent.getY();
            this.f3374W = y6;
            this.f3372U = y6;
            this.f3375a0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f3371T = motionEvent.getX(actionIndex);
                        this.f3375a0 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        k(motionEvent);
                        this.f3371T = motionEvent.getX(motionEvent.findPointerIndex(this.f3375a0));
                    }
                } else if (this.f3367O) {
                    s(this.f3398x, 0, true, false);
                    zR = r();
                }
            } else if (!this.f3367O) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3375a0);
                if (iFindPointerIndex == -1) {
                    zR = r();
                } else {
                    float x10 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x10 - this.f3371T);
                    float y8 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y8 - this.f3372U);
                    if (fAbs > i10 && fAbs > fAbs2) {
                        this.f3367O = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f10 = this.f3373V;
                        this.f3371T = x10 - f10 > 0.0f ? f10 + i10 : f10 - i10;
                        this.f3372U = y8;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f3367O) {
                        zR = n(motionEvent.getX(motionEvent.findPointerIndex(this.f3375a0)));
                    }
                }
            } else if (this.f3367O) {
                zR = n(motionEvent.getX(motionEvent.findPointerIndex(this.f3375a0)));
            }
        } else if (this.f3367O) {
            VelocityTracker velocityTracker = this.f3376b0;
            velocityTracker.computeCurrentVelocity(1000, this.f3377d0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f3375a0);
            this.f3365M = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            d dVarH = h();
            float f11 = clientWidth;
            float f12 = this.f3356D / f11;
            int iMax = dVarH.f3340b;
            float f13 = ((scrollX / f11) - dVarH.f3343e) / (dVarH.f3342d + f12);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f3375a0)) - this.f3373V)) <= this.f3378e0 || Math.abs(xVelocity) <= this.c0) {
                iMax += (int) (f13 + (iMax >= this.f3398x ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            ArrayList arrayList = this.f3393t;
            if (arrayList.size() > 0) {
                iMax = Math.max(((d) arrayList.get(0)).f3340b, Math.min(iMax, ((d) arrayList.get(arrayList.size() - 1)).f3340b));
            }
            u(iMax, xVelocity, true, true);
            zR = r();
        }
        if (zR) {
            WeakHashMap weakHashMap = U.a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c7 A[PHI: r7 r11 r15
      0x00c7: PHI (r7v15 int) = (r7v14 int), (r7v4 int), (r7v18 int) binds: [B:64:0x00eb, B:61:0x00d7, B:52:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r11v26 int) = (r11v1 int), (r11v25 int), (r11v29 int) binds: [B:64:0x00eb, B:61:0x00d7, B:52:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r15v6 float) = (r15v4 float), (r15v5 float), (r15v3 float) binds: [B:64:0x00eb, B:61:0x00d7, B:52:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0149 A[PHI: r3 r12
      0x0149: PHI (r3v20 float) = (r3v18 float), (r3v19 float), (r3v17 float) binds: [B:98:0x0170, B:95:0x015a, B:88:0x0140] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r12v25 int) = (r12v23 int), (r12v24 int), (r12v22 int) binds: [B:98:0x0170, B:95:0x015a, B:88:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    public final void p(int i10) {
        d dVarI;
        String hexString;
        ArrayList arrayList;
        d dVarA;
        float f10;
        d dVarG;
        d dVarG2;
        int i11;
        int i12;
        d dVar;
        d dVar2;
        d dVar3;
        int i13 = this.f3398x;
        if (i13 != i10) {
            dVarI = i(i13);
            this.f3398x = i10;
        } else {
            dVarI = null;
        }
        if (this.f3397w == null) {
            w();
            return;
        }
        if (this.f3365M) {
            w();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f3397w.o();
        int i14 = this.f3366N;
        int iMax = Math.max(0, this.f3398x - i14);
        int iC = this.f3397w.c();
        int iMin = Math.min(iC - 1, this.f3398x + i14);
        if (iC != this.f3391s) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f3391s + ", found: " + iC + " Pager id: " + hexString + " Pager class: " + l.class + " Problematic adapter: " + this.f3397w.getClass());
        }
        int i15 = 0;
        while (true) {
            arrayList = this.f3393t;
            if (i15 < arrayList.size()) {
                dVarA = (d) arrayList.get(i15);
                int i16 = dVarA.f3340b;
                int i17 = this.f3398x;
                if (i16 >= i17) {
                    if (i16 != i17) {
                        break;
                    } else {
                        break;
                    }
                }
                i15++;
            }
            dVarA = null;
            break;
        }
        if (dVarA == null && iC > 0) {
            dVarA = a(this.f3398x, i15);
        }
        if (dVarA != null) {
            int i18 = i15 - 1;
            d dVar4 = i18 >= 0 ? (d) arrayList.get(i18) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - dVarA.f3342d);
            float f11 = 0.0f;
            for (int i19 = this.f3398x - 1; i19 >= 0; i19--) {
                if (f11 < paddingLeft || i19 >= iMax) {
                    if (dVar4 == null || i19 != dVar4.f3340b) {
                        f11 += a(i19, i18 + 1).f3342d;
                        i15++;
                        if (i18 >= 0) {
                            dVar3 = (d) arrayList.get(i18);
                        } else {
                            dVar3 = null;
                        }
                    } else {
                        f11 += dVar4.f3342d;
                        i18--;
                        if (i18 >= 0) {
                            dVar3 = (d) arrayList.get(i18);
                        } else {
                            dVar3 = null;
                        }
                    }
                    dVar4 = dVar3;
                } else {
                    if (dVar4 == null) {
                        break;
                    }
                    if (i19 == dVar4.f3340b && !dVar4.f3341c) {
                        arrayList.remove(i18);
                        this.f3397w.a(this, i19, dVar4.a);
                        i18--;
                        i15--;
                        if (i18 >= 0) {
                            dVar3 = (d) arrayList.get(i18);
                        } else {
                            dVar3 = null;
                        }
                        dVar4 = dVar3;
                    }
                }
            }
            f10 = 0.0f;
            float f12 = dVarA.f3342d;
            int i20 = i15 + 1;
            if (f12 < 2.0f) {
                d dVar5 = i20 < arrayList.size() ? (d) arrayList.get(i20) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i21 = i20;
                for (int i22 = this.f3398x + 1; i22 < iC; i22++) {
                    if (f12 >= paddingRight && i22 > iMin) {
                        if (dVar5 == null) {
                            break;
                        }
                        if (i22 == dVar5.f3340b && !dVar5.f3341c) {
                            arrayList.remove(i21);
                            this.f3397w.a(this, i22, dVar5.a);
                            if (i21 < arrayList.size()) {
                                dVar5 = (d) arrayList.get(i21);
                            } else {
                                dVar5 = null;
                            }
                        }
                    } else if (dVar5 == null || i22 != dVar5.f3340b) {
                        d dVarA2 = a(i22, i21);
                        i21++;
                        f12 += dVarA2.f3342d;
                        if (i21 < arrayList.size()) {
                            dVar5 = (d) arrayList.get(i21);
                        } else {
                            dVar5 = null;
                        }
                    } else {
                        f12 += dVar5.f3342d;
                        i21++;
                        if (i21 < arrayList.size()) {
                            dVar5 = (d) arrayList.get(i21);
                        } else {
                            dVar5 = null;
                        }
                    }
                }
            }
            int iC2 = this.f3397w.c();
            int clientWidth2 = getClientWidth();
            float f13 = clientWidth2 > 0 ? this.f3356D / clientWidth2 : 0.0f;
            if (dVarI != null) {
                int i23 = dVarI.f3340b;
                int i24 = dVarA.f3340b;
                if (i23 < i24) {
                    float f14 = dVarI.f3343e + dVarI.f3342d + f13;
                    int i25 = i23 + 1;
                    int i26 = 0;
                    while (i25 <= dVarA.f3340b && i26 < arrayList.size()) {
                        Object obj = arrayList.get(i26);
                        while (true) {
                            dVar2 = (d) obj;
                            if (i25 <= dVar2.f3340b || i26 >= arrayList.size() - 1) {
                                break;
                            }
                            i26++;
                            obj = arrayList.get(i26);
                        }
                        while (i25 < dVar2.f3340b) {
                            this.f3397w.f();
                            f14 += 1.0f + f13;
                            i25++;
                        }
                        dVar2.f3343e = f14;
                        f14 += dVar2.f3342d + f13;
                        i25++;
                    }
                } else if (i23 > i24) {
                    int size = arrayList.size() - 1;
                    float f15 = dVarI.f3343e;
                    while (true) {
                        i23--;
                        if (i23 < dVarA.f3340b || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            dVar = (d) obj2;
                            if (i23 >= dVar.f3340b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i23 > dVar.f3340b) {
                            this.f3397w.f();
                            f15 -= 1.0f + f13;
                            i23--;
                        }
                        f15 -= dVar.f3342d + f13;
                        dVar.f3343e = f15;
                    }
                }
            }
            int size2 = arrayList.size();
            float f16 = dVarA.f3343e;
            int i27 = dVarA.f3340b;
            int i28 = i27 - 1;
            this.f3360H = i27 == 0 ? f16 : -3.4028235E38f;
            int i29 = iC2 - 1;
            this.f3361I = i27 == i29 ? (dVarA.f3342d + f16) - 1.0f : Float.MAX_VALUE;
            int i30 = i15 - 1;
            while (i30 >= 0) {
                d dVar6 = (d) arrayList.get(i30);
                while (true) {
                    i12 = dVar6.f3340b;
                    if (i28 <= i12) {
                        break;
                    }
                    i28--;
                    this.f3397w.f();
                    f16 -= 1.0f + f13;
                }
                f16 -= dVar6.f3342d + f13;
                dVar6.f3343e = f16;
                if (i12 == 0) {
                    this.f3360H = f16;
                }
                i30--;
                i28--;
            }
            float f17 = dVarA.f3343e + dVarA.f3342d + f13;
            int i31 = dVarA.f3340b;
            while (true) {
                i31++;
                if (i20 >= size2) {
                    break;
                }
                d dVar7 = (d) arrayList.get(i20);
                while (true) {
                    i11 = dVar7.f3340b;
                    if (i31 >= i11) {
                        break;
                    }
                    i31++;
                    this.f3397w.f();
                    f17 += 1.0f + f13;
                }
                if (i11 == i29) {
                    this.f3361I = (dVar7.f3342d + f17) - 1.0f;
                }
                dVar7.f3343e = f17;
                f17 += dVar7.f3342d + f13;
                i20++;
            }
            this.f3397w.m();
        } else {
            f10 = 0.0f;
        }
        this.f3397w.b();
        int childCount = getChildCount();
        for (int i32 = 0; i32 < childCount; i32++) {
            View childAt = getChildAt(i32);
            e eVar = (e) childAt.getLayoutParams();
            eVar.f3348f = i32;
            if (!eVar.a && eVar.f3345c == f10 && (dVarG2 = g(childAt)) != null) {
                eVar.f3345c = dVarG2.f3342d;
                eVar.f3347e = dVarG2.f3340b;
            }
        }
        w();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                dVarG = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    dVarG = g(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        dVarG = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (dVarG == null || dVarG.f3340b != this.f3398x) {
                for (int i33 = 0; i33 < getChildCount(); i33++) {
                    View childAt2 = getChildAt(i33);
                    d dVarG3 = g(childAt2);
                    if (dVarG3 != null && dVarG3.f3340b == this.f3398x && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void q(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f3393t.isEmpty()) {
            if (!this.f3353A.isFinished()) {
                this.f3353A.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        d dVarI = i(this.f3398x);
        int iMin = (int) ((dVarI != null ? Math.min(dVarI.f3343e, this.f3361I) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            d(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public final boolean r() {
        this.f3375a0 = -1;
        this.f3367O = false;
        this.P = false;
        VelocityTracker velocityTracker = this.f3376b0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3376b0 = null;
        }
        this.f3379g0.onRelease();
        this.f3380h0.onRelease();
        return this.f3379g0.isFinished() || this.f3380h0.isFinished();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f3363K) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i10, int i11, boolean z6, boolean z10) {
        int iMax;
        int scrollX;
        int iAbs;
        d dVarI = i(i10);
        if (dVarI != null) {
            iMax = (int) (Math.max(this.f3360H, Math.min(dVarI.f3343e, this.f3361I)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (!z6) {
            if (z10) {
                x(i10);
            }
            d(false);
            scrollTo(iMax, 0);
            m(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            h hVar = this.f3353A;
            if (hVar == null || hVar.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.f3354B ? this.f3353A.getCurrX() : this.f3353A.getStartX();
                this.f3353A.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i12 = scrollX;
            int scrollY = getScrollY();
            int i13 = iMax - i12;
            int i14 = 0 - scrollY;
            if (i13 == 0 && i14 == 0) {
                d(false);
                o();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i15 = clientWidth / 2;
                float f10 = clientWidth;
                float f11 = i15;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                int iAbs2 = Math.abs(i11);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.f3397w.f();
                    iAbs = (int) (((Math.abs(i13) / ((f10 * 1.0f) + this.f3356D)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f3354B = false;
                this.f3353A.startScroll(i12, scrollY, i13, i14, iMin);
                WeakHashMap weakHashMap = U.a;
                postInvalidateOnAnimation();
            }
        }
        if (z10) {
            x(i10);
        }
    }

    public void setAdapter(Z0.a aVar) {
        ArrayList arrayList;
        if (this.f3397w != null) {
            setAdapterViewPagerObserver(null);
            this.f3397w.o();
            int i10 = 0;
            while (true) {
                arrayList = this.f3393t;
                if (i10 >= arrayList.size()) {
                    break;
                }
                d dVar = (d) arrayList.get(i10);
                this.f3397w.a(this, dVar.f3340b, dVar.a);
                i10++;
            }
            this.f3397w.b();
            arrayList.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((e) getChildAt(i11).getLayoutParams()).a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f3398x = 0;
            scrollTo(0, 0);
        }
        this.f3397w = aVar;
        this.f3391s = 0;
        if (aVar != null) {
            if (this.f3355C == null) {
                this.f3355C = new j(this);
            }
            setAdapterViewPagerObserver(this.f3355C);
            try {
                this.f3397w.j(this.f3355C);
            } catch (Exception unused) {
            }
            this.f3365M = false;
            boolean z6 = this.f3381i0;
            this.f3381i0 = true;
            this.f3391s = this.f3397w.c();
            if (this.f3399y >= 0) {
                this.f3397w.k();
                u(this.f3399y, 0, false, true);
                this.f3399y = -1;
                this.f3400z = null;
            } else if (z6) {
                requestLayout();
            } else {
                o();
            }
        }
        ArrayList arrayList2 = this.f3386n0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f3386n0.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((O6.b) ((f) this.f3386n0.get(i12))).g();
        }
    }

    public void setCurrentItem(int i10) {
        this.f3365M = false;
        t(i10, !this.f3381i0);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("SliderPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f3366N) {
            this.f3366N = i10;
            o();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(g gVar) {
        this.f3385m0 = gVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f3356D;
        this.f3356D = i10;
        int width = getWidth();
        q(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f3357E = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollDuration(int i10) {
        h hVar = new h(getContext(), f3351w0);
        hVar.a = i10;
        this.f3353A = hVar;
    }

    public void setScrollState(int i10) {
        if (this.f3394t0 == i10) {
            return;
        }
        this.f3394t0 = i10;
        if (this.f3387o0 != null) {
            boolean z6 = i10 != 0;
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).setLayerType(z6 ? this.f3388p0 : 0, null);
            }
        }
        g gVar = this.f3385m0;
        if (gVar != null) {
            gVar.a(i10);
        }
        ArrayList arrayList = this.f3384l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar2 = (g) this.f3384l0.get(i12);
                if (gVar2 != null) {
                    gVar2.a(i10);
                }
            }
        }
    }

    public final void t(int i10, boolean z6) {
        Z0.a aVar = this.f3397w;
        if (aVar instanceof p007a7.a) {
            i10 += Math.max(0, ((p007a7.a) aVar).q()) * 16200;
        }
        this.f3365M = false;
        u(i10, 0, z6, false);
    }

    public final void u(int i10, int i11, boolean z6, boolean z10) {
        Z0.a aVar = this.f3397w;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.f3393t;
        if (!z10 && this.f3398x == i10 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f3397w.c()) {
            i10 = this.f3397w.c() - 1;
        }
        int i12 = this.f3366N;
        int i13 = this.f3398x;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((d) arrayList.get(i14)).f3341c = true;
            }
        }
        boolean z11 = this.f3398x != i10;
        if (!this.f3381i0) {
            p(i10);
            s(i10, i11, z6, z11);
        } else {
            this.f3398x = i10;
            x(i10);
            requestLayout();
        }
    }

    public final void v(i iVar) {
        boolean z6 = iVar != null;
        boolean z10 = z6 != (this.f3387o0 != null);
        this.f3387o0 = iVar;
        setChildrenDrawingOrderEnabled(z6);
        if (z6) {
            this.f3389q0 = 1;
            this.f3388p0 = 2;
        } else {
            this.f3389q0 = 0;
        }
        if (z10) {
            o();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3357E;
    }

    public final void w() {
        if (this.f3389q0 != 0) {
            ArrayList arrayList = this.f3390r0;
            if (arrayList == null) {
                this.f3390r0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f3390r0.add(getChildAt(i10));
            }
            Collections.sort(this.f3390r0, f3352x0);
        }
    }

    public final void x(int i10) {
        for (g gVar : this.f3384l0) {
            if (gVar != null) {
                Z0.a aVar = this.f3397w;
                if (aVar instanceof p007a7.a) {
                    gVar.b(((p007a7.a) aVar).r(i10));
                } else {
                    gVar.b(i10);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e eVar = new e(context, attributeSet);
        eVar.f3345c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3349u0);
        eVar.f3344b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return eVar;
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(J.a.b(getContext(), i10));
    }
}
