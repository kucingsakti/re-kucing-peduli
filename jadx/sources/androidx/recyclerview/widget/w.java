package androidx.recyclerview.widget;

import J0.C0252b;
import J0.C0256f;
import J0.C0263m;
import J0.P;
import U.U;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.internal.measurement.S;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public C0529b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f7121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S f7122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S f7123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0263m f7124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f7128i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7134p;

    public w() {
        A1.r rVar = new A1.r(this, 16);
        p040e1.j jVar = new p040e1.j(this, 15);
        this.f7122c = new S(rVar);
        this.f7123d = new S(jVar);
        this.f7125f = false;
        this.f7126g = false;
        this.f7127h = false;
        this.f7128i = true;
        this.j = true;
    }

    public static int B(View view) {
        return view.getLeft() - ((x) view.getLayoutParams()).f7136t.left;
    }

    public static int C(View view) {
        Rect rect = ((x) view.getLayoutParams()).f7136t;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int D(View view) {
        Rect rect = ((x) view.getLayoutParams()).f7136t;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int E(View view) {
        return view.getRight() + ((x) view.getLayoutParams()).f7136t.right;
    }

    public static int F(View view) {
        return view.getTop() - ((x) view.getLayoutParams()).f7136t.top;
    }

    public static int M(View view) {
        return ((x) view.getLayoutParams()).f7135s.d();
    }

    public static J0.y N(Context context, AttributeSet attributeSet, int i10, int i11) {
        J0.y yVar = new J0.y();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I0.a.a, i10, i11);
        yVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        yVar.f2353b = typedArrayObtainStyledAttributes.getInt(10, 1);
        yVar.f2354c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        yVar.f2355d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return yVar;
    }

    public static boolean R(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    public static void S(View view, int i10, int i11, int i12, int i13) {
        x xVar = (x) view.getLayoutParams();
        Rect rect = xVar.f7136t;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) xVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) xVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) xVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) xVar).bottomMargin);
    }

    public static int h(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i11, i12) : size;
        }
        return Math.min(size, Math.max(i11, i12));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int x(boolean z6, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, i10 - i12);
        if (z6) {
            if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                i11 = 0;
                i13 = 0;
            } else {
                i13 = iMax;
            }
        } else if (i13 >= 0) {
            i11 = 1073741824;
        } else if (i13 == -1) {
            i13 = iMax;
        } else if (i13 != -2) {
            i11 = 0;
            i13 = 0;
        } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
            i13 = iMax;
            i11 = Integer.MIN_VALUE;
        } else {
            i13 = iMax;
            i11 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i13, i11);
    }

    public static int z(View view) {
        return view.getBottom() + ((x) view.getLayoutParams()).f7136t.bottom;
    }

    public void A(Rect rect, View view) {
        boolean z6 = RecyclerView.f6910S0;
        x xVar = (x) view.getLayoutParams();
        Rect rect2 = xVar.f7136t;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) xVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) xVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) xVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) xVar).bottomMargin);
    }

    public void A0(Rect rect, int i10, int i11) {
        int iK = K() + J() + rect.width();
        int I2 = I() + L() + rect.height();
        RecyclerView recyclerView = this.f7121b;
        WeakHashMap weakHashMap = U.a;
        this.f7121b.setMeasuredDimension(h(i10, iK, recyclerView.getMinimumWidth()), h(i11, I2, this.f7121b.getMinimumHeight()));
    }

    public final void B0(int i10, int i11) {
        int iW = w();
        if (iW == 0) {
            this.f7121b.q(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < iW; i16++) {
            View viewV = v(i16);
            Rect rect = this.f7121b.f6920B;
            A(rect, viewV);
            int i17 = rect.left;
            if (i17 < i15) {
                i15 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i13) {
                i13 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i14) {
                i14 = i20;
            }
        }
        this.f7121b.f6920B.set(i15, i13, i12, i14);
        A0(this.f7121b.f6920B, i10, i11);
    }

    public final void C0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f7121b = null;
            this.a = null;
            this.f7133o = 0;
            this.f7134p = 0;
        } else {
            this.f7121b = recyclerView;
            this.a = recyclerView.f6984x;
            this.f7133o = recyclerView.getWidth();
            this.f7134p = recyclerView.getHeight();
        }
        this.f7131m = 1073741824;
        this.f7132n = 1073741824;
    }

    final boolean D0(View view, int i10, int i11, x xVar) {
        return (!view.isLayoutRequested() && this.f7128i && R(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) xVar).width) && R(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) xVar).height)) ? false : true;
    }

    public boolean E0() {
        return false;
    }

    public final boolean F0(View view, int i10, int i11, x xVar) {
        return (this.f7128i && R(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) xVar).width) && R(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) xVar).height)) ? false : true;
    }

    public final int G() {
        RecyclerView recyclerView = this.f7121b;
        s adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public abstract void G0(RecyclerView recyclerView, int i10);

    public final int H() {
        RecyclerView recyclerView = this.f7121b;
        WeakHashMap weakHashMap = U.a;
        return recyclerView.getLayoutDirection();
    }

    public final void H0(C0263m c0263m) {
        C0263m c0263m2 = this.f7124e;
        if (c0263m2 != null && c0263m != c0263m2 && c0263m2.f2330e) {
            c0263m2.i();
        }
        this.f7124e = c0263m;
        RecyclerView recyclerView = this.f7121b;
        J0.G g8 = recyclerView.f6983w0;
        g8.f2242y.removeCallbacks(g8);
        g8.f2238u.abortAnimation();
        if (c0263m.f2333h) {
            Log.w("RecyclerView", "An instance of " + c0263m.getClass().getSimpleName() + " was started more than once. Each instance of" + c0263m.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0263m.f2327b = recyclerView;
        c0263m.f2328c = this;
        int i10 = c0263m.a;
        if (i10 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f6989z0.a = i10;
        c0263m.f2330e = true;
        c0263m.f2329d = true;
        c0263m.f2331f = recyclerView.f6928F.r(i10);
        c0263m.f2327b.f6983w0.b();
        c0263m.f2333h = true;
    }

    public final int I() {
        RecyclerView recyclerView = this.f7121b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public boolean I0() {
        return false;
    }

    public final int J() {
        RecyclerView recyclerView = this.f7121b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int K() {
        RecyclerView recyclerView = this.f7121b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int L() {
        RecyclerView recyclerView = this.f7121b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int O(A a, J0.D d3) {
        return -1;
    }

    public final void P(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((x) view.getLayoutParams()).f7136t;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f7121b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f7121b.f6924D;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean Q() {
        return this.f7127h;
    }

    public void T(int i10) {
        RecyclerView recyclerView = this.f7121b;
        if (recyclerView != null) {
            int iE = recyclerView.f6984x.e();
            for (int i11 = 0; i11 < iE; i11++) {
                recyclerView.f6984x.d(i11).offsetLeftAndRight(i10);
            }
        }
    }

    public void U(int i10) {
        RecyclerView recyclerView = this.f7121b;
        if (recyclerView != null) {
            int iE = recyclerView.f6984x.e();
            for (int i11 = 0; i11 < iE; i11++) {
                recyclerView.f6984x.d(i11).offsetTopAndBottom(i10);
            }
        }
    }

    public void W(RecyclerView recyclerView) {
    }

    public abstract void X(RecyclerView recyclerView);

    public View Y(View view, int i10, A a, J0.D d3) {
        return null;
    }

    public void Z(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f7121b;
        A a = recyclerView.f6978u;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z6 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f7121b.canScrollVertically(-1) && !this.f7121b.canScrollHorizontally(-1) && !this.f7121b.canScrollHorizontally(1)) {
            z6 = false;
        }
        accessibilityEvent.setScrollable(z6);
        s sVar = this.f7121b.f6926E;
        if (sVar != null) {
            accessibilityEvent.setItemCount(sVar.a());
        }
    }

    public void a0(A a, J0.D d3, V.j jVar) {
        if (this.f7121b.canScrollVertically(-1) || this.f7121b.canScrollHorizontally(-1)) {
            jVar.a(8192);
            jVar.l(true);
        }
        if (this.f7121b.canScrollVertically(1) || this.f7121b.canScrollHorizontally(1)) {
            jVar.a(4096);
            jVar.l(true);
        }
        jVar.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) V.h.a(O(a, d3), y(a, d3), 0).f5078t);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    public final void b(View view, int i10, boolean z6) {
        int iB;
        RecyclerView.a aVarM = RecyclerView.M(view);
        if (z6 || aVarM.j()) {
            p212w.i iVar = this.f7121b.f6986y.a;
            P pA = (P) iVar.get(aVarM);
            if (pA == null) {
                pA = P.a();
                iVar.put(aVarM, pA);
            }
            pA.a |= 1;
        } else {
            this.f7121b.f6986y.c(aVarM);
        }
        x xVar = (x) view.getLayoutParams();
        if (aVarM.r() || aVarM.k()) {
            if (aVarM.k()) {
                aVarM.f6997F.l(aVarM);
            } else {
                aVarM.f6993B &= -33;
            }
            this.a.b(view, i10, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f7121b) {
                C0529b c0529b = this.a;
                int iIndexOfChild = c0529b.a.a.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    iB = -1;
                } else {
                    C0252b c0252b = c0529b.f7052b;
                    if (c0252b.d(iIndexOfChild)) {
                        iB = -1;
                    } else {
                        iB = iIndexOfChild - c0252b.b(iIndexOfChild);
                    }
                }
                if (i10 == -1) {
                    i10 = this.a.e();
                }
                if (iB == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f7121b.indexOfChild(view));
                    throw new IllegalStateException(E0.a.f(this.f7121b, sb));
                }
                if (iB != i10) {
                    w wVar = this.f7121b.f6928F;
                    View viewV = wVar.v(iB);
                    if (viewV == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + wVar.f7121b.toString());
                    }
                    wVar.v(iB);
                    wVar.a.c(iB);
                    x xVar2 = (x) viewV.getLayoutParams();
                    RecyclerView.a aVarM2 = RecyclerView.M(viewV);
                    if (aVarM2.j()) {
                        p212w.i iVar2 = wVar.f7121b.f6986y.a;
                        P pA2 = (P) iVar2.get(aVarM2);
                        if (pA2 == null) {
                            pA2 = P.a();
                            iVar2.put(aVarM2, pA2);
                        }
                        pA2.a = 1 | pA2.a;
                    } else {
                        wVar.f7121b.f6986y.c(aVarM2);
                    }
                    wVar.a.b(viewV, i10, xVar2, aVarM2.j());
                }
            } else {
                this.a.a(view, i10, false);
                xVar.f7137u = true;
                C0263m c0263m = this.f7124e;
                if (c0263m != null && c0263m.f2330e) {
                    c0263m.f2327b.getClass();
                    RecyclerView.a aVarM3 = RecyclerView.M(view);
                    if ((aVarM3 != null ? aVarM3.d() : -1) == c0263m.a) {
                        c0263m.f2331f = view;
                    }
                }
            }
        }
        if (xVar.f7138v) {
            if (RecyclerView.f6911T0) {
                Objects.toString(xVar.f7135s);
            }
            aVarM.f7003s.invalidate();
            xVar.f7138v = false;
        }
    }

    public final void b0(View view, V.j jVar) {
        RecyclerView.a aVarM = RecyclerView.M(view);
        if (aVarM == null || aVarM.j()) {
            return;
        }
        C0529b c0529b = this.a;
        if (c0529b.f7053c.contains(aVarM.f7003s)) {
            return;
        }
        RecyclerView recyclerView = this.f7121b;
        c0(recyclerView.f6978u, recyclerView.f6989z0, view, jVar);
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f7121b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public final void d(Rect rect, View view) {
        RecyclerView recyclerView = this.f7121b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.N(view));
        }
    }

    public abstract boolean e();

    public abstract boolean f();

    public boolean g(x xVar) {
        return xVar != null;
    }

    public void i0(RecyclerView recyclerView, int i10, int i11) {
        h0(i10);
    }

    public abstract void j0(A a, J0.D d3);

    public abstract int k(J0.D d3);

    public abstract void k0(J0.D d3);

    public abstract int l(J0.D d3);

    public void l0(Parcelable parcelable) {
    }

    public abstract int m(J0.D d3);

    public Parcelable m0() {
        return null;
    }

    public abstract int n(J0.D d3);

    public void n0(int i10) {
    }

    public abstract int o(J0.D d3);

    /* JADX WARN: Code duplicated, block: B:22:0x0062 A[PHI: r3
      0x0062: PHI (r3v8 int) = (r3v5 int), (r3v11 int) binds: [B:28:0x007e, B:20:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean o0(A a, J0.D d3, int i10, Bundle bundle) {
        int iL;
        int iJ;
        if (this.f7121b != null) {
            int iHeight = this.f7134p;
            int iWidth = this.f7133o;
            Rect rect = new Rect();
            if (this.f7121b.getMatrix().isIdentity() && this.f7121b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i10 == 4096) {
                iL = this.f7121b.canScrollVertically(1) ? (iHeight - L()) - I() : 0;
                if (this.f7121b.canScrollHorizontally(1)) {
                    iJ = (iWidth - J()) - K();
                } else {
                    iJ = 0;
                }
            } else if (i10 != 8192) {
                iL = 0;
                iJ = 0;
            } else {
                iL = this.f7121b.canScrollVertically(-1) ? -((iHeight - L()) - I()) : 0;
                if (this.f7121b.canScrollHorizontally(-1)) {
                    iJ = -((iWidth - J()) - K());
                } else {
                    iJ = 0;
                }
            }
            if (iL != 0 || iJ != 0) {
                this.f7121b.i0(iJ, iL, true);
                return true;
            }
        }
        return false;
    }

    public abstract int p(J0.D d3);

    public final void p0() {
        for (int iW = w() - 1; iW >= 0; iW--) {
            this.a.j(iW);
        }
    }

    public final void q(A a) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            RecyclerView.a aVarM = RecyclerView.M(viewV);
            if (aVarM.q()) {
                if (RecyclerView.f6911T0) {
                    aVarM.toString();
                }
            } else if (!aVarM.h() || aVarM.j() || this.f7121b.f6926E.f7113b) {
                v(iW);
                this.a.c(iW);
                a.j(viewV);
                this.f7121b.f6986y.c(aVarM);
            } else {
                if (v(iW) != null) {
                    this.a.j(iW);
                }
                a.i(aVarM);
            }
        }
    }

    public final void q0(A a) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            if (!RecyclerView.M(v(iW)).q()) {
                View viewV = v(iW);
                if (v(iW) != null) {
                    this.a.j(iW);
                }
                a.h(viewV);
            }
        }
    }

    public View r(int i10) {
        int iW = w();
        for (int i11 = 0; i11 < iW; i11++) {
            View viewV = v(i11);
            RecyclerView.a aVarM = RecyclerView.M(viewV);
            if (aVarM != null && aVarM.d() == i10 && !aVarM.q() && (this.f7121b.f6989z0.f2229g || !aVarM.j())) {
                return viewV;
            }
        }
        return null;
    }

    public final void r0(A a) {
        ArrayList arrayList;
        int size = a.a.size();
        int i10 = size - 1;
        while (true) {
            arrayList = a.a;
            if (i10 < 0) {
                break;
            }
            View view = ((RecyclerView.a) arrayList.get(i10)).f7003s;
            RecyclerView.a aVarM = RecyclerView.M(view);
            if (!aVarM.q()) {
                aVarM.p(false);
                if (aVarM.l()) {
                    this.f7121b.removeDetachedView(view, false);
                }
                u uVar = this.f7121b.f6963h0;
                if (uVar != null) {
                    uVar.d(aVarM);
                }
                aVarM.p(true);
                RecyclerView.a aVarM2 = RecyclerView.M(view);
                aVarM2.f6997F = null;
                aVarM2.f6998G = false;
                aVarM2.f6993B &= -33;
                a.i(aVarM2);
            }
            i10--;
        }
        arrayList.clear();
        ArrayList arrayList2 = a.f6874b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f7121b.invalidate();
        }
    }

    public abstract x s();

    public final void s0(View view, A a) {
        C0529b c0529b = this.a;
        q qVar = c0529b.a;
        int i10 = c0529b.f7054d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c0529b.f7054d = 1;
            c0529b.f7055e = view;
            int iIndexOfChild = qVar.a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (c0529b.f7052b.f(iIndexOfChild)) {
                    c0529b.k(view);
                }
                qVar.a(iIndexOfChild);
            }
            c0529b.f7054d = 0;
            c0529b.f7055e = null;
            a.h(view);
        } catch (Throwable th) {
            c0529b.f7054d = 0;
            c0529b.f7055e = null;
            throw th;
        }
    }

    public x t(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    public boolean t0(RecyclerView recyclerView, View view, Rect rect, boolean z6, boolean z10) {
        int iJ = J();
        int iL = L();
        int iK = this.f7133o - K();
        int I2 = this.f7134p - I();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i10 = left - iJ;
        int iMin = Math.min(0, i10);
        int i11 = top - iL;
        int iMin2 = Math.min(0, i11);
        int i12 = iWidth - iK;
        int iMax = Math.max(0, i12);
        int iMax2 = Math.max(0, iHeight - I2);
        if (H() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i10, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i12);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i11, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i13 = iArr[0];
        int i14 = iArr[1];
        if (z10) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iJ2 = J();
                int iL2 = L();
                int iK2 = this.f7133o - K();
                int I9 = this.f7134p - I();
                Rect rect2 = this.f7121b.f6920B;
                A(rect2, focusedChild);
                if (rect2.left - i13 < iK2 && rect2.right - i13 > iJ2 && rect2.top - i14 < I9 && rect2.bottom - i14 > iL2) {
                    if (i13 == 0) {
                    }
                    if (z6) {
                        recyclerView.scrollBy(i13, i14);
                        return true;
                    }
                    recyclerView.i0(i13, i14, false);
                    return true;
                }
            }
        } else if (i13 == 0 || i14 != 0) {
            if (z6) {
                recyclerView.scrollBy(i13, i14);
                return true;
            }
            recyclerView.i0(i13, i14, false);
            return true;
        }
        return false;
    }

    public x u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof x) {
            return new x((x) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new x((ViewGroup.MarginLayoutParams) layoutParams) : new x(layoutParams);
    }

    public final void u0() {
        RecyclerView recyclerView = this.f7121b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final View v(int i10) {
        C0529b c0529b = this.a;
        if (c0529b != null) {
            return c0529b.d(i10);
        }
        return null;
    }

    public abstract int v0(int i10, J0.D d3, A a);

    public final int w() {
        C0529b c0529b = this.a;
        if (c0529b != null) {
            return c0529b.e();
        }
        return 0;
    }

    public abstract void w0(int i10);

    public abstract int x0(int i10, J0.D d3, A a);

    public int y(A a, J0.D d3) {
        return -1;
    }

    public final void y0(RecyclerView recyclerView) {
        z0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void z0(int i10, int i11) {
        this.f7133o = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f7131m = mode;
        if (mode == 0 && !RecyclerView.f6913W0) {
            this.f7133o = 0;
        }
        this.f7134p = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f7132n = mode2;
        if (mode2 != 0 || RecyclerView.f6913W0) {
            return;
        }
        this.f7134p = 0;
    }

    public void V() {
    }

    public void e0() {
    }

    public void h0(int i10) {
    }

    public void d0(int i10, int i11) {
    }

    public void f0(int i10, int i11) {
    }

    public void g0(int i10, int i11) {
    }

    public void j(int i10, C0256f c0256f) {
    }

    public void c0(A a, J0.D d3, View view, V.j jVar) {
    }

    public void i(int i10, int i11, J0.D d3, C0256f c0256f) {
    }
}
