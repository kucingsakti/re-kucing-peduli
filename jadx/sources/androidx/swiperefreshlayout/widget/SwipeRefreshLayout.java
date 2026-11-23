package androidx.swiperefreshlayout.widget;

import J.b;
import T0.d;
import T0.e;
import T0.f;
import T0.g;
import T0.h;
import T0.i;
import T0.j;
import U.C0429o;
import U.H;
import U.InterfaceC0428n;
import U.InterfaceC0430p;
import U.InterfaceC0431q;
import U.U;
import U.r;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC0431q, InterfaceC0430p, InterfaceC0428n {
    public static final int[] f0 = {R.attr.enabled};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int[] f7148A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int[] f7149B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int[] f7150C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f7151D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f7152E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f7153F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f7154G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f7155H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f7156I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f7157J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final DecelerateInterpolator f7158K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final T0.a f7159L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f7160M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f7161N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f7162O;
    public final int P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f7163Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final e f7164R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public g f7165S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public g f7166T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public h f7167U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public h f7168V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f7169W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f7170a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f7171b0;
    public final f c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final g f7172d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final g f7173e0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f7174s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f7175t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7176u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f7177v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f7178w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f7179x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final r f7180y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0429o f7181z;

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7176u = false;
        this.f7178w = -1.0f;
        this.f7148A = new int[2];
        this.f7149B = new int[2];
        this.f7150C = new int[2];
        this.f7157J = -1;
        this.f7160M = -1;
        this.c0 = new f(this, 0);
        this.f7172d0 = new g(this, 2);
        this.f7173e0 = new g(this, 3);
        this.f7177v = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f7152E = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f7158K = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f7170a0 = (int) (displayMetrics.density * 40.0f);
        T0.a aVar = new T0.a(getContext());
        float f10 = aVar.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = aVar.getContext().obtainStyledAttributes(S0.a.a);
        aVar.f4588t = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = U.a;
        H.s(aVar, f10 * 4.0f);
        shapeDrawable.getPaint().setColor(aVar.f4588t);
        aVar.setBackground(shapeDrawable);
        this.f7159L = aVar;
        e eVar = new e(getContext());
        this.f7164R = eVar;
        eVar.c(1);
        this.f7159L.setImageDrawable(this.f7164R);
        this.f7159L.setVisibility(8);
        addView(this.f7159L);
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.P = i10;
        this.f7178w = i10;
        this.f7180y = new r();
        this.f7181z = new C0429o(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f7170a0;
        this.f7153F = i11;
        this.f7162O = i11;
        k(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f0);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i10) {
        this.f7159L.getBackground().setAlpha(i10);
        this.f7164R.setAlpha(i10);
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
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // U.InterfaceC0431q
    public final void d(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        if (i14 == 0) {
            this.f7181z.d(i10, i11, i12, i13, this.f7149B, i14, iArr);
        }
        int i16 = i13 - (iArr[1] - i15);
        int i17 = i16 == 0 ? i13 + this.f7149B[1] : i16;
        if (i17 >= 0 || g()) {
            return;
        }
        float fAbs = this.f7179x + Math.abs(i17);
        this.f7179x = fAbs;
        j(fAbs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z6) {
        return this.f7181z.a(f10, f11, z6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f7181z.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f7181z.c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f7181z.d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // U.InterfaceC0430p
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        d(view, i10, i11, i12, i13, i14, this.f7150C);
    }

    @Override // U.InterfaceC0430p
    public final boolean f(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    public final boolean g() {
        View view = this.f7174s;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f7160M;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        return i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.f7180y;
        return rVar.f4845b | rVar.a;
    }

    public int getProgressCircleDiameter() {
        return this.f7170a0;
    }

    public int getProgressViewEndOffset() {
        return this.P;
    }

    public int getProgressViewStartOffset() {
        return this.f7162O;
    }

    public final void h() {
        if (this.f7174s == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f7159L)) {
                    this.f7174s = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f7181z.f(0);
    }

    public final void i(float f10) {
        if (f10 > this.f7178w) {
            m(true, true);
            return;
        }
        this.f7176u = false;
        e eVar = this.f7164R;
        d dVar = eVar.f4613s;
        dVar.f4594e = 0.0f;
        dVar.f4595f = 0.0f;
        eVar.invalidateSelf();
        f fVar = new f(this, 1);
        this.f7161N = this.f7153F;
        g gVar = this.f7173e0;
        gVar.reset();
        gVar.setDuration(200L);
        gVar.setInterpolator(this.f7158K);
        T0.a aVar = this.f7159L;
        aVar.f4587s = fVar;
        aVar.clearAnimation();
        this.f7159L.startAnimation(gVar);
        e eVar2 = this.f7164R;
        d dVar2 = eVar2.f4613s;
        if (dVar2.f4602n) {
            dVar2.f4602n = false;
        }
        eVar2.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f7181z.f4833d;
    }

    public final void j(float f10) {
        h hVar;
        h hVar2;
        e eVar = this.f7164R;
        d dVar = eVar.f4613s;
        if (!dVar.f4602n) {
            dVar.f4602n = true;
        }
        eVar.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f7178w));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f7178w;
        int i10 = this.f7163Q;
        if (i10 <= 0) {
            i10 = this.P;
        }
        float f11 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.f7162O + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.f7159L.getVisibility() != 0) {
            this.f7159L.setVisibility(0);
        }
        this.f7159L.setScaleX(1.0f);
        this.f7159L.setScaleY(1.0f);
        if (f10 < this.f7178w) {
            if (this.f7164R.f4613s.f4608t > 76 && ((hVar2 = this.f7167U) == null || !hVar2.hasStarted() || hVar2.hasEnded())) {
                h hVar3 = new h(this, this.f7164R.f4613s.f4608t, 76);
                hVar3.setDuration(300L);
                T0.a aVar = this.f7159L;
                aVar.f4587s = null;
                aVar.clearAnimation();
                this.f7159L.startAnimation(hVar3);
                this.f7167U = hVar3;
            }
        } else if (this.f7164R.f4613s.f4608t < 255 && ((hVar = this.f7168V) == null || !hVar.hasStarted() || hVar.hasEnded())) {
            h hVar4 = new h(this, this.f7164R.f4613s.f4608t, 255);
            hVar4.setDuration(300L);
            T0.a aVar2 = this.f7159L;
            aVar2.f4587s = null;
            aVar2.clearAnimation();
            this.f7159L.startAnimation(hVar4);
            this.f7168V = hVar4;
        }
        e eVar2 = this.f7164R;
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        d dVar2 = eVar2.f4613s;
        dVar2.f4594e = 0.0f;
        dVar2.f4595f = fMin2;
        eVar2.invalidateSelf();
        e eVar3 = this.f7164R;
        float fMin3 = Math.min(1.0f, fMax);
        d dVar3 = eVar3.f4613s;
        if (fMin3 != dVar3.f4604p) {
            dVar3.f4604p = fMin3;
        }
        eVar3.invalidateSelf();
        e eVar4 = this.f7164R;
        eVar4.f4613s.f4596g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        eVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i11 - this.f7153F);
    }

    public final void k(float f10) {
        int i10 = this.f7161N;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.f7162O - i10) * f10))) - this.f7159L.getTop());
    }

    public final void l() {
        this.f7159L.clearAnimation();
        this.f7164R.stop();
        this.f7159L.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f7162O - this.f7153F);
        this.f7153F = this.f7159L.getTop();
    }

    public final void m(boolean z6, boolean z10) {
        if (this.f7176u != z6) {
            this.f7169W = z10;
            h();
            this.f7176u = z6;
            f fVar = this.c0;
            if (!z6) {
                g gVar = new g(this, 1);
                this.f7166T = gVar;
                gVar.setDuration(150L);
                T0.a aVar = this.f7159L;
                aVar.f4587s = fVar;
                aVar.clearAnimation();
                this.f7159L.startAnimation(this.f7166T);
                return;
            }
            this.f7161N = this.f7153F;
            g gVar2 = this.f7172d0;
            gVar2.reset();
            gVar2.setDuration(200L);
            gVar2.setInterpolator(this.f7158K);
            if (fVar != null) {
                this.f7159L.f4587s = fVar;
            }
            this.f7159L.clearAnimation();
            this.f7159L.startAnimation(gVar2);
        }
    }

    public final void n(float f10) {
        float f11 = this.f7155H;
        float f12 = f10 - f11;
        float f13 = this.f7177v;
        if (f12 <= f13 || this.f7156I) {
            return;
        }
        this.f7154G = f11 + f13;
        this.f7156I = true;
        this.f7164R.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        h();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !g() && !this.f7176u && !this.f7151D) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.f7156I = false;
                    this.f7157J = -1;
                } else if (actionMasked == 2) {
                    int i10 = this.f7157J;
                    if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        n(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.f7156I = false;
                    this.f7157J = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.f7157J) {
                        this.f7157J = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.f7156I;
            }
            setTargetOffsetTopAndBottom(this.f7162O - this.f7159L.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f7157J = pointerId;
            this.f7156I = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.f7155H = motionEvent.getY(iFindPointerIndex2);
                return this.f7156I;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f7174s == null) {
            h();
        }
        View view = this.f7174s;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f7159L.getMeasuredWidth();
        int measuredHeight2 = this.f7159L.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f7153F;
        this.f7159L.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f7174s == null) {
            h();
        }
        View view = this.f7174s;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f7159L.measure(View.MeasureSpec.makeMeasureSpec(this.f7170a0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f7170a0, 1073741824));
        this.f7160M = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f7159L) {
                this.f7160M = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z6) {
        return this.f7181z.a(f10, f11, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.f7181z.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f7179x;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f7179x = 0.0f;
                } else {
                    this.f7179x = f10 - f11;
                    iArr[1] = i11;
                }
                j(this.f7179x);
            }
        }
        int i12 = i10 - iArr[0];
        int i13 = i11 - iArr[1];
        int[] iArr2 = this.f7148A;
        if (dispatchNestedPreScroll(i12, i13, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        d(view, i10, i11, i12, i13, 0, this.f7150C);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f7180y.a = i10;
        startNestedScroll(i10 & 2);
        this.f7179x = 0.0f;
        this.f7151D = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f7182s);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f7176u);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f7176u || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f7180y.a = 0;
        this.f7151D = false;
        float f10 = this.f7179x;
        if (f10 > 0.0f) {
            i(f10);
            this.f7179x = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !g() && !this.f7176u && !this.f7151D) {
            if (actionMasked == 0) {
                this.f7157J = motionEvent.getPointerId(0);
                this.f7156I = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f7157J);
                if (iFindPointerIndex >= 0) {
                    if (this.f7156I) {
                        float y6 = (motionEvent.getY(iFindPointerIndex) - this.f7154G) * 0.5f;
                        this.f7156I = false;
                        i(y6);
                    }
                    this.f7157J = -1;
                    return false;
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f7157J);
                if (iFindPointerIndex2 >= 0) {
                    float y8 = motionEvent.getY(iFindPointerIndex2);
                    n(y8);
                    if (this.f7156I) {
                        float f10 = (y8 - this.f7154G) * 0.5f;
                        if (f10 > 0.0f) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            j(f10);
                        }
                    }
                    return true;
                }
            } else if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f7157J) {
                            this.f7157J = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 >= 0) {
                    this.f7157J = motionEvent.getPointerId(actionIndex2);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        ViewParent parent;
        View view = this.f7174s;
        if (view != null) {
            WeakHashMap weakHashMap = U.a;
            if (!H.p(view)) {
                if (this.f7171b0 || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z6);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    public void setAnimationProgress(float f10) {
        this.f7159L.setScaleX(f10);
        this.f7159L.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        h();
        e eVar = this.f7164R;
        d dVar = eVar.f4613s;
        dVar.f4598i = iArr;
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = b.a(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f7178w = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        if (z6) {
            return;
        }
        l();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z6) {
        this.f7171b0 = z6;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        C0429o c0429o = this.f7181z;
        if (c0429o.f4833d) {
            WeakHashMap weakHashMap = U.a;
            H.z(c0429o.f4832c);
        }
        c0429o.f4833d = z6;
    }

    public void setOnRefreshListener(j jVar) {
        this.f7175t = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f7159L.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(b.a(getContext(), i10));
    }

    public void setRefreshing(boolean z6) {
        if (!z6 || this.f7176u == z6) {
            m(z6, false);
            return;
        }
        this.f7176u = z6;
        setTargetOffsetTopAndBottom((this.P + this.f7162O) - this.f7153F);
        this.f7169W = false;
        f fVar = this.c0;
        this.f7159L.setVisibility(0);
        this.f7164R.setAlpha(255);
        g gVar = new g(this, 0);
        this.f7165S = gVar;
        gVar.setDuration(this.f7152E);
        if (fVar != null) {
            this.f7159L.f4587s = fVar;
        }
        this.f7159L.clearAnimation();
        this.f7159L.startAnimation(this.f7165S);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f7170a0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f7170a0 = (int) (displayMetrics.density * 40.0f);
            }
            this.f7159L.setImageDrawable(null);
            this.f7164R.c(i10);
            this.f7159L.setImageDrawable(this.f7164R);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.f7163Q = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        T0.a aVar = this.f7159L;
        aVar.bringToFront();
        WeakHashMap weakHashMap = U.a;
        aVar.offsetTopAndBottom(i10);
        this.f7153F = aVar.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f7181z.g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f7181z.h(0);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f7182s;

        public SavedState(Parcelable parcelable, boolean z6) {
            super(parcelable);
            this.f7182s = z6;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f7182s ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f7182s = parcel.readByte() != 0;
        }
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }
}
