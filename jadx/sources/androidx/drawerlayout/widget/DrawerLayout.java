package androidx.drawerlayout.widget;

import U.B0;
import U.H;
import U.U;
import V.h;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p032d0.d;
import p032d0.f;
import p088j0.b;
import p088j0.c;
import p088j0.e;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements d {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int[] f6525V = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int[] f6526W = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final boolean f6527a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final boolean f6528b0;
    public static final boolean c0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final e f6529A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final e f6530B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f6531C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f6532D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f6533E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f6534F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f6535G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f6536H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f6537I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f6538J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public c f6539K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f6540L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f6541M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f6542N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Drawable f6543O;
    public WindowInsets P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f6544Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final ArrayList f6545R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Rect f6546S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Matrix f6547T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final h f6548U;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p000a0.h f6549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f6550t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f6551u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6552v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f6553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Paint f6554x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f6555y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f f6556z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f6557u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f6558v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f6559w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f6560x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f6561y;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6557u = 0;
            this.f6557u = parcel.readInt();
            this.f6558v = parcel.readInt();
            this.f6559w = parcel.readInt();
            this.f6560x = parcel.readInt();
            this.f6561y = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6557u);
            parcel.writeInt(this.f6558v);
            parcel.writeInt(this.f6559w);
            parcel.writeInt(this.f6560x);
            parcel.writeInt(this.f6561y);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f6527a0 = true;
        f6528b0 = true;
        c0 = i10 >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kcstream.cing.R.attr.drawerLayoutStyle);
        this.f6549s = new p000a0.h(4);
        this.f6552v = -1728053248;
        this.f6554x = new Paint();
        this.f6533E = true;
        this.f6534F = 3;
        this.f6535G = 3;
        this.f6536H = 3;
        this.f6537I = 3;
        this.f6548U = new h(this, 26);
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f6551u = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        e eVar = new e(this, 3);
        this.f6529A = eVar;
        e eVar2 = new e(this, 5);
        this.f6530B = eVar2;
        f fVar = new f(getContext(), this, eVar);
        fVar.f10514b = (int) (fVar.f10514b * 1.0f);
        this.f6555y = fVar;
        fVar.f10528q = 1;
        fVar.f10525n = f11;
        eVar.f12352b = fVar;
        f fVar2 = new f(getContext(), this, eVar2);
        fVar2.f10514b = (int) (1.0f * fVar2.f10514b);
        this.f6556z = fVar2;
        fVar2.f10528q = 2;
        fVar2.f10525n = f11;
        eVar2.f12352b = fVar2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = U.a;
        setImportantForAccessibility(1);
        U.n(this, new b(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new p088j0.a());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f6525V);
            try {
                this.f6543O = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p079i0.a.a, com.kcstream.cing.R.attr.drawerLayoutStyle, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f6550t = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f6550t = getResources().getDimension(com.kcstream.cing.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f6545R = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public static String l(int i10) {
        if ((i10 & 3) == 3) {
            return "LEFT";
        }
        return (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    public static boolean m(View view) {
        WeakHashMap weakHashMap = U.a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean n(View view) {
        return ((p088j0.d) view.getLayoutParams()).a == 0;
    }

    public static boolean o(View view) {
        if (p(view)) {
            return (((p088j0.d) view.getLayoutParams()).f12351d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean p(View view) {
        int i10 = ((p088j0.d) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = U.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static boolean q(View view) {
        if (p(view)) {
            return ((p088j0.d) view.getLayoutParams()).f12349b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final void a(c cVar) {
        if (cVar == null) {
            return;
        }
        if (this.f6540L == null) {
            this.f6540L = new ArrayList();
        }
        this.f6540L.add(cVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        boolean z6 = false;
        while (true) {
            arrayList2 = this.f6545R;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (!p(childAt)) {
                arrayList2.add(childAt);
            } else if (o(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z6 = true;
            }
            i12++;
        }
        if (!z6) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = (View) arrayList2.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (g() != null || p(view)) {
            WeakHashMap weakHashMap = U.a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = U.a;
            view.setImportantForAccessibility(1);
        }
        if (f6527a0) {
            return;
        }
        U.n(view, this.f6549s);
    }

    public final boolean b(View view, int i10) {
        return (k(view) & i10) == i10;
    }

    public final void c(View view, boolean z6) {
        if (!p(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        p088j0.d dVar = (p088j0.d) view.getLayoutParams();
        if (this.f6533E) {
            dVar.f12349b = 0.0f;
            dVar.f12351d = 0;
        } else if (z6) {
            dVar.f12351d |= 4;
            if (b(view, 3)) {
                this.f6555y.r(view, -view.getWidth(), view.getTop());
            } else {
                this.f6556z.r(view, getWidth(), view.getTop());
            }
        } else {
            float f10 = ((p088j0.d) view.getLayoutParams()).f12349b;
            float width = view.getWidth();
            int i10 = ((int) (width * 0.0f)) - ((int) (f10 * width));
            if (!b(view, 3)) {
                i10 = -i10;
            }
            view.offsetLeftAndRight(i10);
            u(view, 0.0f);
            x(view, 0);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p088j0.d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((p088j0.d) getChildAt(i10).getLayoutParams()).f12349b);
        }
        this.f6553w = fMax;
        boolean zG = this.f6555y.g();
        boolean zG2 = this.f6556z.g();
        if (zG || zG2) {
            WeakHashMap weakHashMap = U.a;
            postInvalidateOnAnimation();
        }
    }

    public final void d() {
        View viewF = f(8388611);
        if (viewF != null) {
            c(viewF, true);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + l(8388611));
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f6553w <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x8 = motionEvent.getX();
        float y6 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (this.f6546S == null) {
                this.f6546S = new Rect();
            }
            childAt.getHitRect(this.f6546S);
            if (this.f6546S.contains((int) x8, (int) y6) && !n(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f6547T == null) {
                            this.f6547T = new Matrix();
                        }
                        matrix.invert(this.f6547T);
                        motionEventObtain.transform(this.f6547T);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zN = n(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zN) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && p(childAt) && childAt.getHeight() >= height) {
                    if (b(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f10 = this.f6553w;
        if (f10 > 0.0f && zN) {
            int i13 = this.f6552v;
            Paint paint = this.f6554x;
            paint.setColor((((int) ((((-16777216) & i13) >>> 24) * f10)) << 24) | (i13 & 16777215));
            canvas.drawRect(i10, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final void e(boolean z6) {
        int childCount = getChildCount();
        boolean zR = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            p088j0.d dVar = (p088j0.d) childAt.getLayoutParams();
            if (p(childAt) && (!z6 || dVar.f12350c)) {
                zR |= b(childAt, 3) ? this.f6555y.r(childAt, -childAt.getWidth(), childAt.getTop()) : this.f6556z.r(childAt, getWidth(), childAt.getTop());
                dVar.f12350c = false;
            }
        }
        e eVar = this.f6529A;
        eVar.f12354d.removeCallbacks(eVar.f12353c);
        e eVar2 = this.f6530B;
        eVar2.f12354d.removeCallbacks(eVar2.f12353c);
        if (zR) {
            invalidate();
        }
    }

    public final View f(int i10) {
        WeakHashMap weakHashMap = U.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((k(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View g() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((p088j0.d) childAt.getLayoutParams()).f12351d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p088j0.d dVar = new p088j0.d(-1, -1);
        dVar.a = 0;
        return dVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof p088j0.d) {
            p088j0.d dVar = (p088j0.d) layoutParams;
            p088j0.d dVar2 = new p088j0.d(dVar);
            dVar2.a = 0;
            dVar2.a = dVar.a;
            return dVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            p088j0.d dVar3 = new p088j0.d((ViewGroup.MarginLayoutParams) layoutParams);
            dVar3.a = 0;
            return dVar3;
        }
        p088j0.d dVar4 = new p088j0.d(layoutParams);
        dVar4.a = 0;
        return dVar4;
    }

    public float getDrawerElevation() {
        if (f6528b0) {
            return this.f6550t;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f6543O;
    }

    public final View h() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (p(childAt) && q(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public final int i(int i10) {
        WeakHashMap weakHashMap = U.a;
        int layoutDirection = getLayoutDirection();
        if (i10 == 3) {
            int i11 = this.f6534F;
            if (i11 != 3) {
                return i11;
            }
            int i12 = layoutDirection == 0 ? this.f6536H : this.f6537I;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i10 == 5) {
            int i13 = this.f6535G;
            if (i13 != 3) {
                return i13;
            }
            int i14 = layoutDirection == 0 ? this.f6537I : this.f6536H;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i10 == 8388611) {
            int i15 = this.f6536H;
            if (i15 != 3) {
                return i15;
            }
            int i16 = layoutDirection == 0 ? this.f6534F : this.f6535G;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i10 != 8388613) {
            return 0;
        }
        int i17 = this.f6537I;
        if (i17 != 3) {
            return i17;
        }
        int i18 = layoutDirection == 0 ? this.f6535G : this.f6534F;
        if (i18 != 3) {
            return i18;
        }
        return 0;
    }

    public final int j(View view) {
        if (p(view)) {
            return i(((p088j0.d) view.getLayoutParams()).a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int k(View view) {
        int i10 = ((p088j0.d) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = U.a;
        return Gravity.getAbsoluteGravity(i10, getLayoutDirection());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6533E = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6533E = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f6544Q || this.f6543O == null) {
            return;
        }
        WindowInsets windowInsets = this.P;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f6543O.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f6543O.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        View viewH;
        int actionMasked = motionEvent.getActionMasked();
        f fVar = this.f6555y;
        boolean zQ = fVar.q(motionEvent) | this.f6556z.q(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                e(true);
                this.f6538J = false;
            } else if (actionMasked == 2) {
                int length = fVar.f10516d.length;
                for (int i10 = 0; i10 < length; i10++) {
                    if ((fVar.f10522k & (1 << i10)) != 0) {
                        float f10 = fVar.f10518f[i10] - fVar.f10516d[i10];
                        float f11 = fVar.f10519g[i10] - fVar.f10517e[i10];
                        float f12 = (f11 * f11) + (f10 * f10);
                        int i11 = fVar.f10514b;
                        if (f12 > i11 * i11) {
                            e eVar = this.f6529A;
                            eVar.f12354d.removeCallbacks(eVar.f12353c);
                            e eVar2 = this.f6530B;
                            eVar2.f12354d.removeCallbacks(eVar2.f12353c);
                            break;
                        }
                    }
                }
            } else if (actionMasked == 3) {
                e(true);
                this.f6538J = false;
            }
            z6 = false;
        } else {
            float x8 = motionEvent.getX();
            float y6 = motionEvent.getY();
            this.f6541M = x8;
            this.f6542N = y6;
            z6 = this.f6553w > 0.0f && (viewH = fVar.h((int) x8, (int) y6)) != null && n(viewH);
            this.f6538J = false;
        }
        if (!zQ && !z6) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (!((p088j0.d) getChildAt(i12).getLayoutParams()).f12350c) {
                }
            }
            if (!this.f6538J) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || h() == null) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewH = h();
        if (viewH != null && j(viewH) == 0) {
            e(false);
        }
        return viewH != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z10 = true;
        this.f6532D = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                p088j0.d dVar = (p088j0.d) childAt.getLayoutParams();
                if (n(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) dVar).topMargin, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b(childAt, 3)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (dVar.f12349b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        int i18 = i15 - ((int) (dVar.f12349b * f12));
                        f10 = (i15 - i18) / f12;
                        i14 = i18;
                    }
                    boolean z11 = f10 != dVar.f12349b ? z10 : false;
                    int i19 = dVar.a & 112;
                    if (i19 == 16) {
                        int i20 = i13 - i11;
                        int i21 = (i20 - measuredHeight) / 2;
                        int i22 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        if (i21 < i22) {
                            i21 = i22;
                        } else {
                            int i23 = i21 + measuredHeight;
                            int i24 = i20 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                            if (i23 > i24) {
                                i21 = i24 - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i21, measuredWidth + i14, measuredHeight + i21);
                    } else if (i19 != 80) {
                        int i25 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        childAt.layout(i14, i25, measuredWidth + i14, measuredHeight + i25);
                    } else {
                        int i26 = i13 - i11;
                        childAt.layout(i14, (i26 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i26 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    }
                    if (z11) {
                        u(childAt, f10);
                    }
                    int i27 = dVar.f12349b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i27) {
                        childAt.setVisibility(i27);
                    }
                }
            }
            i16++;
            z10 = true;
        }
        if (c0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            L.c cVarI = B0.h(null, rootWindowInsets).a.i();
            f fVar = this.f6555y;
            fVar.f10526o = Math.max(fVar.f10527p, cVarI.a);
            f fVar2 = this.f6556z;
            fVar2.f10526o = Math.max(fVar2.f10527p, cVarI.f2713c);
        }
        this.f6532D = false;
        this.f6533E = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z6;
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i13 = 0;
        if (this.P != null) {
            WeakHashMap weakHashMap = U.a;
            if (getFitsSystemWindows()) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        WeakHashMap weakHashMap2 = U.a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                p088j0.d dVar = (p088j0.d) childAt.getLayoutParams();
                if (z6) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(dVar.a, layoutDirection);
                    i12 = 1;
                    if (childAt.getFitsSystemWindows()) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = this.P;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), i13, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(i13, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = this.P;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), i13, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(i13, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) dVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) dVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) dVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                } else {
                    i12 = 1;
                }
                if (n(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) dVar).leftMargin) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) dVar).topMargin) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, 1073741824));
                } else {
                    if (!p(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i14 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f6528b0) {
                        float fI = H.i(childAt);
                        float f10 = this.f6550t;
                        if (fI != f10) {
                            H.s(childAt, f10);
                        }
                    }
                    int iK = k(childAt) & 7;
                    int i17 = iK == 3 ? i12 : i13;
                    if ((i17 != 0 && i15 != 0) || (i17 == 0 && i16 != 0)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + l(iK) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (i17 != 0) {
                        i15 = i12;
                    } else {
                        i16 = i12;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f6551u + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin, ((ViewGroup.MarginLayoutParams) dVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, ((ViewGroup.MarginLayoutParams) dVar).height));
                }
                i14++;
                i13 = 0;
            }
            i14++;
            i13 = 0;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewF;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6382s);
        int i10 = savedState.f6557u;
        if (i10 != 0 && (viewF = f(i10)) != null) {
            r(viewF);
        }
        int i11 = savedState.f6558v;
        if (i11 != 3) {
            t(i11, 3);
        }
        int i12 = savedState.f6559w;
        if (i12 != 3) {
            t(i12, 5);
        }
        int i13 = savedState.f6560x;
        if (i13 != 3) {
            t(i13, 8388611);
        }
        int i14 = savedState.f6561y;
        if (i14 != 3) {
            t(i14, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (f6528b0) {
            return;
        }
        WeakHashMap weakHashMap = U.a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6557u = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            p088j0.d dVar = (p088j0.d) getChildAt(i10).getLayoutParams();
            int i11 = dVar.f12351d;
            boolean z6 = i11 == 1;
            boolean z10 = i11 == 2;
            if (z6 || z10) {
                savedState.f6557u = dVar.a;
                break;
            }
        }
        savedState.f6558v = this.f6534F;
        savedState.f6559w = this.f6535G;
        savedState.f6560x = this.f6536H;
        savedState.f6561y = this.f6537I;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        View viewG;
        f fVar = this.f6555y;
        fVar.j(motionEvent);
        this.f6556z.j(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x8 = motionEvent.getX();
            float y6 = motionEvent.getY();
            this.f6541M = x8;
            this.f6542N = y6;
            this.f6538J = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            e(true);
            this.f6538J = false;
            return true;
        }
        float x10 = motionEvent.getX();
        float y8 = motionEvent.getY();
        View viewH = fVar.h((int) x10, (int) y8);
        if (viewH != null && n(viewH)) {
            float f10 = x10 - this.f6541M;
            float f11 = y8 - this.f6542N;
            int i10 = fVar.f10514b;
            z6 = (f11 * f11) + (f10 * f10) >= ((float) (i10 * i10)) || (viewG = g()) == null || j(viewG) == 2;
        }
        e(z6);
        return true;
    }

    public final void r(View view) {
        if (!p(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        p088j0.d dVar = (p088j0.d) view.getLayoutParams();
        if (this.f6533E) {
            dVar.f12349b = 1.0f;
            dVar.f12351d = 1;
            w(view, true);
            v(view);
        } else {
            dVar.f12351d |= 2;
            if (b(view, 3)) {
                this.f6555y.r(view, 0, view.getTop());
            } else {
                this.f6556z.r(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (z6) {
            e(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f6532D) {
            return;
        }
        super.requestLayout();
    }

    public final void s() {
        View viewF = f(8388611);
        if (viewF != null) {
            r(viewF);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + l(8388611));
        }
    }

    public void setDrawerElevation(float f10) {
        this.f6550t = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (p(childAt)) {
                float f11 = this.f6550t;
                WeakHashMap weakHashMap = U.a;
                H.s(childAt, f11);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(c cVar) {
        ArrayList arrayList;
        c cVar2 = this.f6539K;
        if (cVar2 != null && (arrayList = this.f6540L) != null) {
            arrayList.remove(cVar2);
        }
        if (cVar != null) {
            a(cVar);
        }
        this.f6539K = cVar;
    }

    public void setDrawerLockMode(int i10) {
        t(i10, 3);
        t(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f6552v = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f6543O = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.f6543O = new ColorDrawable(i10);
        invalidate();
    }

    public final void t(int i10, int i11) {
        View viewF;
        WeakHashMap weakHashMap = U.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, getLayoutDirection());
        if (i11 == 3) {
            this.f6534F = i10;
        } else if (i11 == 5) {
            this.f6535G = i10;
        } else if (i11 == 8388611) {
            this.f6536H = i10;
        } else if (i11 == 8388613) {
            this.f6537I = i10;
        }
        if (i10 != 0) {
            (absoluteGravity == 3 ? this.f6555y : this.f6556z).a();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewF = f(absoluteGravity)) != null) {
                r(viewF);
                return;
            }
            return;
        }
        View viewF2 = f(absoluteGravity);
        if (viewF2 != null) {
            c(viewF2, true);
        }
    }

    public final void u(View view, float f10) {
        p088j0.d dVar = (p088j0.d) view.getLayoutParams();
        if (f10 == dVar.f12349b) {
            return;
        }
        dVar.f12349b = f10;
        ArrayList arrayList = this.f6540L;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c) this.f6540L.get(size)).a(f10);
            }
        }
    }

    public final void v(View view) {
        V.d dVar = V.d.f5071l;
        U.k(view, dVar.a());
        U.h(view, 0);
        if (!o(view) || j(view) == 2) {
            return;
        }
        U.l(view, dVar, this.f6548U);
    }

    public final void w(View view, boolean z6) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z6 || p(childAt)) && !(z6 && childAt == view)) {
                WeakHashMap weakHashMap = U.a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = U.a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public final void x(View view, int i10) {
        int i11;
        View rootView;
        int i12 = this.f6555y.a;
        int i13 = this.f6556z.a;
        if (i12 == 1 || i13 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (i12 != 2 && i13 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((p088j0.d) view.getLayoutParams()).f12349b;
            if (f10 == 0.0f) {
                p088j0.d dVar = (p088j0.d) view.getLayoutParams();
                if ((dVar.f12351d & 1) == 1) {
                    dVar.f12351d = 0;
                    ArrayList arrayList = this.f6540L;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((c) this.f6540L.get(size)).c(view);
                        }
                    }
                    w(view, false);
                    v(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f10 == 1.0f) {
                p088j0.d dVar2 = (p088j0.d) view.getLayoutParams();
                if ((dVar2.f12351d & 1) == 0) {
                    dVar2.f12351d = 1;
                    ArrayList arrayList2 = this.f6540L;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((c) this.f6540L.get(size2)).b(view);
                        }
                    }
                    w(view, true);
                    v(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i11 != this.f6531C) {
            this.f6531C = i11;
            ArrayList arrayList3 = this.f6540L;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((c) this.f6540L.get(size3)).getClass();
                }
            }
        }
    }

    public void setStatusBarBackground(int i10) {
        this.f6543O = i10 != 0 ? J.a.b(getContext(), i10) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        p088j0.d dVar = new p088j0.d(context, attributeSet);
        dVar.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6526W);
        dVar.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return dVar;
    }
}
