package androidx.coordinatorlayout.widget;

import F8.C0212f;
import G.b;
import G.c;
import G.e;
import G.f;
import G.g;
import T.d;
import U.B0;
import U.F;
import U.H;
import U.InterfaceC0430p;
import U.InterfaceC0431q;
import U.U;
import U.r;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import o1.h;
import p040e1.j;
import p212w.i;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0430p, InterfaceC0431q {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final String f6306L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Class[] f6307M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final ThreadLocal f6308N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C0212f f6309O;
    public static final d P;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int[] f6310A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View f6311B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f6312C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public f f6313D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f6314E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public B0 f6315F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f6316G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Drawable f6317H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f6318I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public j f6319J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final r f6320K;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f6321s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f6322t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f6323u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f6324v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f6325w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f6326x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6327y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6328z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public SparseArray f6329u;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f6329u = new SparseArray(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f6329u.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f6329u;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f6329u.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f6329u.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    static {
        Package r10 = CoordinatorLayout.class.getPackage();
        f6306L = r10 != null ? r10.getName() : null;
        f6309O = new C0212f(3);
        f6307M = new Class[]{Context.class, AttributeSet.class};
        f6308N = new ThreadLocal();
        P = new d(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f6321s = new ArrayList();
        this.f6322t = new h(2);
        this.f6323u = new ArrayList();
        this.f6324v = new ArrayList();
        this.f6325w = new int[2];
        this.f6326x = new int[2];
        this.f6320K = new r();
        int[] iArr = F.a.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f6310A = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                int[] iArr2 = this.f6310A;
                iArr2[i10] = (int) (iArr2[i10] * f10);
            }
        }
        this.f6317H = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        x();
        super.setOnHierarchyChangeListener(new G.d(this));
        WeakHashMap weakHashMap = U.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) P.a();
        return rect == null ? new Rect() : rect;
    }

    public static void m(int i10, Rect rect, Rect rect2, e eVar, int i11, int i12) {
        int iWidth;
        int iHeight;
        int i13 = eVar.f1666c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = eVar.f1667d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        if (i17 != 1) {
            iWidth = i17 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i18 != 16) {
            iHeight = i18 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i15 == 1) {
            iWidth -= i11 / 2;
        } else if (i15 != 5) {
            iWidth -= i11;
        }
        if (i16 == 16) {
            iHeight -= i12 / 2;
        } else if (i16 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e n(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f1665b) {
            if (view instanceof G.a) {
                eVar.b(((G.a) view).getBehavior());
                eVar.f1665b = true;
                return eVar;
            }
            c cVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cVar = (c) superclass.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    eVar.b((b) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception unused) {
                    cVar.value().getClass();
                }
            }
            eVar.f1665b = true;
        }
        return eVar;
    }

    public static void v(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f1672i;
        if (i11 != i10) {
            WeakHashMap weakHashMap = U.a;
            view.offsetLeftAndRight(i10 - i11);
            eVar.f1672i = i10;
        }
    }

    public static void w(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.j;
        if (i11 != i10) {
            WeakHashMap weakHashMap = U.a;
            view.offsetTopAndBottom(i10 - i11);
            eVar.j = i10;
        }
    }

    @Override // U.InterfaceC0430p
    public final void a(View view, View view2, int i10, int i11) {
        r rVar = this.f6320K;
        if (i11 == 1) {
            rVar.f4845b = i10;
        } else {
            rVar.a = i10;
        }
        this.f6312C = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((e) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // U.InterfaceC0430p
    public final void b(View view, int i10) {
        r rVar = this.f6320K;
        if (i10 == 1) {
            rVar.f4845b = 0;
        } else {
            rVar.a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i10)) {
                b bVar = eVar.a;
                if (bVar != null) {
                    bVar.u(this, childAt, view, i10);
                }
                if (i10 == 0) {
                    eVar.f1675m = false;
                } else if (i10 == 1) {
                    eVar.f1676n = false;
                }
                eVar.f1677o = false;
            }
        }
        this.f6312C = null;
    }

    @Override // U.InterfaceC0430p
    public final void c(View view, int i10, int i11, int[] iArr, int i12) {
        b bVar;
        int childCount = getChildCount();
        boolean z6 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i12) && (bVar = eVar.a) != null) {
                    int[] iArr2 = this.f6325w;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.o(this, childAt, view, i10, i11, iArr2, i12);
                    iMax = i10 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z6) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // U.InterfaceC0431q
    public final void d(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        b bVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z6 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i14) && (bVar = eVar.a) != null) {
                    int[] iArr2 = this.f6325w;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.p(this, childAt, i11, i12, i13, iArr2);
                    iMax = i12 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z6) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        b bVar = ((e) view.getLayoutParams()).a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6317H;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // U.InterfaceC0430p
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        d(view, i10, i11, i12, i13, 0, this.f6326x);
    }

    @Override // U.InterfaceC0430p
    public final boolean f(View view, View view2, int i10, int i11) {
        View view3;
        int i12;
        int i13;
        int childCount = getChildCount();
        int i14 = 0;
        boolean z6 = false;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                view3 = view;
                i12 = i10;
                i13 = i11;
            } else {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.a;
                if (bVar != null) {
                    view3 = view;
                    i12 = i10;
                    i13 = i11;
                    boolean zT = bVar.t(this, childAt, view3, i12, i13);
                    z6 |= zT;
                    if (i13 == 0) {
                        eVar.f1675m = zT;
                    } else if (i13 == 1) {
                        eVar.f1676n = zT;
                    }
                } else {
                    view3 = view;
                    i12 = i10;
                    i13 = i11;
                    if (i13 == 0) {
                        eVar.f1675m = false;
                    } else if (i13 == 1) {
                        eVar.f1676n = false;
                    }
                }
            }
            i14++;
            view = view3;
            i10 = i12;
            i11 = i13;
        }
        return z6;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        t();
        return Collections.unmodifiableList(this.f6321s);
    }

    public final B0 getLastWindowInsets() {
        return this.f6315F;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.f6320K;
        return rVar.f4845b | rVar.a;
    }

    public Drawable getStatusBarBackground() {
        return this.f6317H;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(e eVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    public final void i(View view) {
        List list = (List) ((i) this.f6322t.f13633t).get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            View view2 = (View) list.get(i10);
            b bVar = ((e) view2.getLayoutParams()).a;
            if (bVar != null) {
                bVar.h(this, view2, view);
            }
        }
    }

    public final void j(View view, Rect rect, boolean z6) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z6) {
            l(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList k(View view) {
        i iVar = (i) this.f6322t.f13633t;
        int i10 = iVar.f15506u;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) iVar.k(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(iVar.g(i11));
            }
        }
        ArrayList arrayList3 = this.f6324v;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void l(Rect rect, View view) {
        ThreadLocal threadLocal = g.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f1681b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final boolean o(View view, int i10, int i11) {
        d dVar = P;
        Rect rectG = g();
        l(rectG, view);
        try {
            return rectG.contains(i10, i11);
        } finally {
            rectG.setEmpty();
            dVar.c(rectG);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        u(false);
        if (this.f6314E) {
            if (this.f6313D == null) {
                this.f6313D = new f(this, i10);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f6313D);
        }
        if (this.f6315F == null) {
            WeakHashMap weakHashMap = U.a;
            if (getFitsSystemWindows()) {
                F.c(this);
            }
        }
        this.f6328z = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        if (this.f6314E && this.f6313D != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f6313D);
        }
        View view = this.f6312C;
        if (view != null) {
            b(view, 0);
        }
        this.f6328z = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f6316G || this.f6317H == null) {
            return;
        }
        B0 b3 = this.f6315F;
        int iD = b3 != null ? b3.d() : 0;
        if (iD > 0) {
            this.f6317H.setBounds(0, 0, getWidth(), iD);
            this.f6317H.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u(true);
        }
        boolean zS = s(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zS;
        }
        u(true);
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        b bVar;
        WeakHashMap weakHashMap = U.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f6321s;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).a) == null || !bVar.l(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0105  */
    /* JADX WARN: Code duplicated, block: B:70:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0127  */
    /* JADX WARN: Code duplicated, block: B:79:0x013e  */
    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0176  */
    /* JADX WARN: Code duplicated, block: B:88:0x019d  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a0  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z6;
        int i12;
        ArrayList arrayList;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        b bVar;
        int i13;
        View view;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        boolean zM;
        int i20;
        int i21;
        int absoluteGravity;
        CoordinatorLayout coordinatorLayout = this;
        int i22 = 0;
        coordinatorLayout.t();
        int childCount = coordinatorLayout.getChildCount();
        int i23 = 0;
        loop0: while (true) {
            if (i23 >= childCount) {
                z6 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i23);
            i iVar = (i) coordinatorLayout.f6322t.f13633t;
            int i24 = iVar.f15506u;
            for (int i25 = 0; i25 < i24; i25++) {
                ArrayList arrayList2 = (ArrayList) iVar.k(i25);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z6 = true;
                    break loop0;
                }
            }
            i23++;
        }
        if (z6 != coordinatorLayout.f6314E) {
            if (z6) {
                if (coordinatorLayout.f6328z) {
                    if (coordinatorLayout.f6313D == null) {
                        coordinatorLayout.f6313D = new f(coordinatorLayout, i22);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f6313D);
                }
                coordinatorLayout.f6314E = true;
            } else {
                if (coordinatorLayout.f6328z && coordinatorLayout.f6313D != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f6313D);
                }
                coordinatorLayout.f6314E = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = U.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z11 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i26 = paddingLeft + paddingRight;
        int i27 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z12 = coordinatorLayout.f6315F != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f6321s;
        int size3 = arrayList3.size();
        int i28 = 0;
        int iCombineMeasuredStates = 0;
        while (i28 < size3) {
            View view2 = (View) arrayList3.get(i28);
            int i29 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i14 = size3;
                i19 = i28;
                i17 = paddingRight;
                suggestedMinimumWidth = i29;
                z10 = false;
                i15 = paddingLeft;
            } else {
                e eVar = (e) view2.getLayoutParams();
                int i30 = eVar.f1668e;
                if (i30 < 0 || mode == 0) {
                    i12 = suggestedMinimumHeight;
                    arrayList = arrayList3;
                } else {
                    i12 = suggestedMinimumHeight;
                    int[] iArr = coordinatorLayout.f6310A;
                    if (iArr == null) {
                        coordinatorLayout.toString();
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (i30 < 0 || i30 >= iArr.length) {
                            coordinatorLayout.toString();
                        } else {
                            i20 = iArr[i30];
                        }
                        i21 = eVar.f1666c;
                        if (i21 == 0) {
                            i21 = 8388661;
                        }
                        absoluteGravity = Gravity.getAbsoluteGravity(i21, layoutDirection) & 7;
                        if (!(absoluteGravity == 3 || z11) || (absoluteGravity == 5 && z11)) {
                            iMax = Math.max(0, (size - paddingRight) - i20);
                        } else if ((absoluteGravity != 5 && !z11) || (absoluteGravity == 3 && z11)) {
                            iMax = Math.max(0, i20 - paddingLeft);
                        }
                        if (z12 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i10;
                            iMakeMeasureSpec2 = i11;
                        } else {
                            int iC = coordinatorLayout.f6315F.c() + coordinatorLayout.f6315F.b();
                            int iA = coordinatorLayout.f6315F.a() + coordinatorLayout.f6315F.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        bVar = eVar.a;
                        if (bVar != null) {
                            int i31 = iMax;
                            int i32 = iMakeMeasureSpec;
                            i14 = size3;
                            i15 = paddingLeft;
                            i16 = i29;
                            int i33 = i12;
                            i17 = paddingRight;
                            i18 = i33;
                            z10 = false;
                            i19 = i28;
                            int i34 = iMakeMeasureSpec2;
                            zM = bVar.m(this, view2, i32, i31, i34);
                            view = view2;
                            iMakeMeasureSpec = i32;
                            iMax = i31;
                            i13 = i34;
                            if (zM) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i16, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                            int iMax3 = Math.max(i18, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            int i35 = size3;
                            i13 = iMakeMeasureSpec2;
                            view = view2;
                            i14 = i35;
                            i15 = paddingLeft;
                            i16 = i29;
                            int i36 = i12;
                            i17 = paddingRight;
                            i18 = i36;
                            i19 = i28;
                            z10 = false;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i13, 0);
                        int iMax4 = Math.max(i16, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                        int iMax5 = Math.max(i18, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    }
                    i20 = 0;
                    i21 = eVar.f1666c;
                    if (i21 == 0) {
                        i21 = 8388661;
                    }
                    absoluteGravity = Gravity.getAbsoluteGravity(i21, layoutDirection) & 7;
                    if (absoluteGravity == 3) {
                        if (absoluteGravity != 5) {
                        }
                    } else if (absoluteGravity != 5) {
                    }
                    if (z12) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    }
                    bVar = eVar.a;
                    if (bVar != null) {
                        int i37 = iMax;
                        int i38 = iMakeMeasureSpec;
                        i14 = size3;
                        i15 = paddingLeft;
                        i16 = i29;
                        int i39 = i12;
                        i17 = paddingRight;
                        i18 = i39;
                        z10 = false;
                        i19 = i28;
                        int i310 = iMakeMeasureSpec2;
                        zM = bVar.m(this, view2, i38, i37, i310);
                        view = view2;
                        iMakeMeasureSpec = i38;
                        iMax = i37;
                        i13 = i310;
                        if (zM) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i16, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                        int iMax7 = Math.max(i18, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        int i311 = size3;
                        i13 = iMakeMeasureSpec2;
                        view = view2;
                        i14 = i311;
                        i15 = paddingLeft;
                        i16 = i29;
                        int i312 = i12;
                        i17 = paddingRight;
                        i18 = i312;
                        i19 = i28;
                        z10 = false;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i13, 0);
                    int iMax8 = Math.max(i16, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int iMax9 = Math.max(i18, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                iMax = 0;
                if (z12) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                bVar = eVar.a;
                if (bVar != null) {
                    int i313 = iMax;
                    int i314 = iMakeMeasureSpec;
                    i14 = size3;
                    i15 = paddingLeft;
                    i16 = i29;
                    int i315 = i12;
                    i17 = paddingRight;
                    i18 = i315;
                    z10 = false;
                    i19 = i28;
                    int i316 = iMakeMeasureSpec2;
                    zM = bVar.m(this, view2, i314, i313, i316);
                    view = view2;
                    iMakeMeasureSpec = i314;
                    iMax = i313;
                    i13 = i316;
                    if (zM) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i16, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int iMax11 = Math.max(i18, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    int i317 = size3;
                    i13 = iMakeMeasureSpec2;
                    view = view2;
                    i14 = i317;
                    i15 = paddingLeft;
                    i16 = i29;
                    int i318 = i12;
                    i17 = paddingRight;
                    i18 = i318;
                    i19 = i28;
                    z10 = false;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i13, 0);
                int iMax12 = Math.max(i16, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                int iMax13 = Math.max(i18, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i28 = i19 + 1;
            size3 = i14;
            paddingLeft = i15;
            paddingRight = i17;
            arrayList3 = arrayList;
        }
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i10, (-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(suggestedMinimumHeight, i11, iCombineMeasuredStates << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z6) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        b bVar;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.a) != null) {
                    zN |= bVar.n(view);
                }
            }
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        c(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        e(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        a(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6382s);
        SparseArray sparseArray = savedState.f6329u;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            b bVar = n(childAt).a;
            if (id != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bVar.r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableS;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            b bVar = ((e) childAt.getLayoutParams()).a;
            if (id != -1 && bVar != null && (parcelableS = bVar.s(childAt)) != null) {
                sparseArray.append(id, parcelableS);
            }
        }
        savedState.f6329u = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return f(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zS;
        boolean zV;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6311B == null) {
            zS = s(motionEvent, 1);
            if (!zS) {
                zV = false;
            }
            motionEventObtain = null;
            if (this.f6311B == null) {
                zV |= super.onTouchEvent(motionEvent);
            } else if (zS) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zV;
            }
            u(false);
            return zV;
        }
        zS = false;
        b bVar = ((e) this.f6311B.getLayoutParams()).a;
        if (bVar != null) {
            zV = bVar.v(this, this.f6311B, motionEvent);
        } else {
            zV = false;
        }
        motionEventObtain = null;
        if (this.f6311B == null) {
            zV |= super.onTouchEvent(motionEvent);
        } else if (zS) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        u(false);
        return zV;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0271  */
    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    public final void p(int i10) {
        Rect rect;
        int i11;
        Rect rect2;
        int i12;
        ArrayList arrayList;
        int i13;
        boolean zH;
        boolean z6;
        boolean z10;
        int width;
        int i14;
        int i15;
        int i16;
        int height;
        int i17;
        int i18;
        int i19;
        Rect rect3;
        d dVar;
        b bVar;
        WeakHashMap weakHashMap = U.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f6321s;
        int size = arrayList2.size();
        Rect rectG = g();
        Rect rectG2 = g();
        Rect rectG3 = g();
        int i20 = 0;
        while (true) {
            d dVar2 = P;
            if (i20 >= size) {
                Rect rect4 = rectG2;
                Rect rect5 = rectG3;
                rectG.setEmpty();
                dVar2.c(rectG);
                rect4.setEmpty();
                dVar2.c(rect4);
                rect5.setEmpty();
                dVar2.c(rect5);
                return;
            }
            View view = (View) arrayList2.get(i20);
            e eVar = (e) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                int i21 = 0;
                while (i21 < i20) {
                    if (eVar.f1674l == ((View) arrayList2.get(i21))) {
                        e eVar2 = (e) view.getLayoutParams();
                        if (eVar2.f1673k != null) {
                            Rect rectG4 = g();
                            Rect rectG5 = g();
                            Rect rect6 = rectG3;
                            Rect rectG6 = g();
                            l(rectG4, eVar2.f1673k);
                            j(view, rectG5, false);
                            int measuredWidth = view.getMeasuredWidth();
                            d dVar3 = dVar2;
                            int measuredHeight = view.getMeasuredHeight();
                            dVar = dVar3;
                            m(layoutDirection, rectG4, rectG6, eVar2, measuredWidth, measuredHeight);
                            rect3 = rect6;
                            boolean z11 = (rectG6.left == rectG5.left && rectG6.top == rectG5.top) ? false : true;
                            h(eVar2, rectG6, measuredWidth, measuredHeight);
                            int i22 = rectG6.left - rectG5.left;
                            int i23 = rectG6.top - rectG5.top;
                            if (i22 != 0) {
                                WeakHashMap weakHashMap2 = U.a;
                                view.offsetLeftAndRight(i22);
                            }
                            if (i23 != 0) {
                                WeakHashMap weakHashMap3 = U.a;
                                view.offsetTopAndBottom(i23);
                            }
                            if (z11 && (bVar = eVar2.a) != null) {
                                bVar.h(this, view, eVar2.f1673k);
                            }
                            rectG4.setEmpty();
                            dVar.c(rectG4);
                            rectG5.setEmpty();
                            dVar.c(rectG5);
                            rectG6.setEmpty();
                            dVar.c(rectG6);
                        } else {
                            rect3 = rectG3;
                            dVar = dVar2;
                        }
                    } else {
                        rect3 = rectG3;
                        dVar = dVar2;
                    }
                    dVar2 = dVar;
                    i21++;
                    rectG2 = rectG2;
                    i20 = i20;
                    arrayList2 = arrayList2;
                    size = size;
                    rectG3 = rect3;
                }
                ArrayList arrayList3 = arrayList2;
                rect = rectG2;
                Rect rect7 = rectG3;
                i11 = i20;
                T.c cVar = dVar2;
                int i24 = size;
                j(view, rect, true);
                if (eVar.f1670g != 0 && !rect.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar.f1670g, layoutDirection);
                    int i25 = absoluteGravity & 112;
                    if (i25 == 48) {
                        rectG.top = Math.max(rectG.top, rect.bottom);
                    } else if (i25 == 80) {
                        rectG.bottom = Math.max(rectG.bottom, getHeight() - rect.top);
                    }
                    int i26 = absoluteGravity & 7;
                    if (i26 == 3) {
                        rectG.left = Math.max(rectG.left, rect.right);
                    } else if (i26 == 5) {
                        rectG.right = Math.max(rectG.right, getWidth() - rect.left);
                    }
                }
                if (eVar.f1671h != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = U.a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        e eVar3 = (e) view.getLayoutParams();
                        b bVar2 = eVar3.a;
                        Rect rectG7 = g();
                        Rect rectG8 = g();
                        rectG8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (bVar2 == null || !bVar2.e(rectG7, view)) {
                            rectG7.set(rectG8);
                        } else if (!rectG8.contains(rectG7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectG7.toShortString() + " | Bounds:" + rectG8.toShortString());
                        }
                        rectG8.setEmpty();
                        cVar.c(rectG8);
                        if (rectG7.isEmpty()) {
                            rectG7.setEmpty();
                            cVar.c(rectG7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar3.f1671h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i18 = (rectG7.top - ((ViewGroup.MarginLayoutParams) eVar3).topMargin) - eVar3.j) >= (i19 = rectG.top)) {
                                z6 = false;
                            } else {
                                w(view, i19 - i18);
                                z6 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectG7.bottom) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin) + eVar3.j) < (i17 = rectG.bottom)) {
                                w(view, height - i17);
                                z6 = true;
                            }
                            if (!z6) {
                                w(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i15 = (rectG7.left - ((ViewGroup.MarginLayoutParams) eVar3).leftMargin) - eVar3.f1672i) >= (i16 = rectG.left)) {
                                z10 = false;
                            } else {
                                v(view, i16 - i15);
                                z10 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectG7.right) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin) + eVar3.f1672i) < (i14 = rectG.right)) {
                                v(view, width - i14);
                                z10 = true;
                            }
                            if (!z10) {
                                v(view, 0);
                            }
                            rectG7.setEmpty();
                            cVar.c(rectG7);
                        }
                    }
                }
                if (i10 != 2) {
                    rect2 = rect7;
                    rect2.set(((e) view.getLayoutParams()).f1678p);
                    if (rect2.equals(rect)) {
                        arrayList = arrayList3;
                        i12 = i24;
                    } else {
                        ((e) view.getLayoutParams()).f1678p.set(rect);
                    }
                } else {
                    rect2 = rect7;
                }
                int i27 = i11 + 1;
                i12 = i24;
                while (true) {
                    arrayList = arrayList3;
                    if (i27 >= i12) {
                        break;
                    }
                    View view2 = (View) arrayList.get(i27);
                    e eVar4 = (e) view2.getLayoutParams();
                    b bVar3 = eVar4.a;
                    if (bVar3 == null || !bVar3.f(view2, view)) {
                        i13 = 1;
                    } else if (i10 == 0 && eVar4.f1677o) {
                        eVar4.f1677o = false;
                        i13 = 1;
                    } else {
                        if (i10 != 2) {
                            zH = bVar3.h(this, view2, view);
                        } else {
                            bVar3.i(this, view);
                            zH = true;
                        }
                        i13 = 1;
                        if (i10 == 1) {
                            eVar4.f1677o = zH;
                        }
                    }
                    i27 += i13;
                    arrayList3 = arrayList;
                }
            } else {
                int i28 = size;
                arrayList = arrayList2;
                i12 = i28;
                rect = rectG2;
                rect2 = rectG3;
                i11 = i20;
            }
            i20 = i11 + 1;
            ArrayList arrayList4 = arrayList;
            size = i12;
            arrayList2 = arrayList4;
            rectG3 = rect2;
            rectG2 = rect;
        }
    }

    public final void q(View view, int i10) {
        int i11;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f1673k;
        if (view2 == null && eVar.f1669f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar = P;
        if (view2 != null) {
            Rect rectG = g();
            Rect rectG2 = g();
            try {
                l(rectG, view2);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m(i10, rectG, rectG2, eVar2, measuredWidth, measuredHeight);
                h(eVar2, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                dVar.c(rectG);
                rectG2.setEmpty();
                dVar.c(rectG2);
            }
        }
        int i12 = eVar.f1668e;
        if (i12 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            Rect rectG3 = g();
            rectG3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f6315F != null) {
                WeakHashMap weakHashMap = U.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectG3.left = this.f6315F.b() + rectG3.left;
                    rectG3.top = this.f6315F.d() + rectG3.top;
                    rectG3.right -= this.f6315F.c();
                    rectG3.bottom -= this.f6315F.a();
                }
            }
            Rect rectG4 = g();
            int i13 = eVar3.f1666c;
            if ((i13 & 7) == 0) {
                i13 |= 8388611;
            }
            if ((i13 & 112) == 0) {
                i13 |= 48;
            }
            Gravity.apply(i13, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG3, rectG4, i10);
            view.layout(rectG4.left, rectG4.top, rectG4.right, rectG4.bottom);
            rectG3.setEmpty();
            dVar.c(rectG3);
            rectG4.setEmpty();
            dVar.c(rectG4);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i14 = eVar4.f1666c;
        if (i14 == 0) {
            i14 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i10 == 1) {
            i12 = width - i12;
        }
        int[] iArr = this.f6310A;
        int i17 = 0;
        if (iArr != null && i12 >= 0 && i12 < iArr.length) {
            i11 = iArr[i12];
        } else {
            toString();
            i11 = 0;
        }
        int i18 = i11 - measuredWidth2;
        if (i15 == 1) {
            i18 += measuredWidth2 / 2;
        } else if (i15 == 5) {
            i18 += measuredWidth2;
        }
        if (i16 == 16) {
            i17 = measuredHeight2 / 2;
        } else if (i16 == 80) {
            i17 = measuredHeight2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(i18, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i17, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final void r(int i10, int i11, int i12, View view) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        b bVar = ((e) view.getLayoutParams()).a;
        if (bVar == null || !bVar.q(this, view, rect, z6)) {
            return super.requestChildRectangleOnScreen(view, rect, z6);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (!z6 || this.f6327y) {
            return;
        }
        u(false);
        this.f6327y = true;
    }

    public final boolean s(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f6323u;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        C0212f c0212f = f6309O;
        if (c0212f != null) {
            Collections.sort(arrayList, c0212f);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            b bVar = ((e) view.getLayoutParams()).a;
            if (zK && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i10 == 0) {
                        bVar.k(this, view, motionEventObtain);
                    } else if (i10 == 1) {
                        bVar.v(this, view, motionEventObtain);
                    }
                }
            } else if (!zK && bVar != null) {
                if (i10 == 0) {
                    zK = bVar.k(this, view, motionEvent);
                } else if (i10 == 1) {
                    zK = bVar.v(this, view, motionEvent);
                }
                if (zK) {
                    this.f6311B = view;
                }
            }
        }
        arrayList.clear();
        return zK;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z6) {
        super.setFitsSystemWindows(z6);
        x();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f6318I = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f6317H;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f6317H = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f6317H.setState(getDrawableState());
                }
                Drawable drawable3 = this.f6317H;
                WeakHashMap weakHashMap = U.a;
                M.b.b(drawable3, getLayoutDirection());
                this.f6317H.setVisible(getVisibility() == 0, false);
                this.f6317H.setCallback(this);
            }
            WeakHashMap weakHashMap2 = U.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? J.a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z6 = i10 == 0;
        Drawable drawable = this.f6317H;
        if (drawable == null || drawable.isVisible() == z6) {
            return;
        }
        this.f6317H.setVisible(z6, false);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:40:0x0095
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void t() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.t():void");
    }

    public final void u(boolean z6) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            b bVar = ((e) childAt.getLayoutParams()).a;
            if (bVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z6) {
                    bVar.k(this, childAt, motionEventObtain);
                } else {
                    bVar.v(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((e) getChildAt(i11).getLayoutParams()).getClass();
        }
        this.f6311B = null;
        this.f6327y = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6317H;
    }

    public final void x() {
        WeakHashMap weakHashMap = U.a;
        if (!getFitsSystemWindows()) {
            H.u(this, null);
            return;
        }
        if (this.f6319J == null) {
            this.f6319J = new j(this, 11);
        }
        H.u(this, this.f6319J);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }
}
