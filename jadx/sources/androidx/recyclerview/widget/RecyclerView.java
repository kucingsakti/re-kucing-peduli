package androidx.recyclerview.widget;

import J0.C0251a;
import J0.C0255e;
import J0.C0256f;
import J0.C0263m;
import J0.P;
import U.C0429o;
import U.InterfaceC0428n;
import U.K;
import U.U;
import U.V;
import U.Y;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0428n {

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public static boolean f6910S0 = false;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public static boolean f6911T0 = false;
    public static final int[] U0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static final float f6912V0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public static final boolean f6913W0 = true;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public static final boolean f6914X0 = true;
    public static final boolean Y0 = true;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public static final Class[] f6915Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final J0.s f6916a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final J0.E f6917b1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final J0.r f6918A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public J0.A f6919A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Rect f6920B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ArrayList f6921B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Rect f6922C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f6923C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final RectF f6924D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f6925D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public s f6926E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final v f6927E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public w f6928F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f6929F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final ArrayList f6930G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public J0.I f6931G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ArrayList f6932H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final int[] f6933H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final ArrayList f6934I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public C0429o f6935I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C0255e f6936J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final int[] f6937J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f6938K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final int[] f6939K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f6940L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final int[] f6941L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f6942M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final ArrayList f6943M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f6944N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final J0.r f6945N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f6946O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public boolean f6947O0;
    public boolean P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f6948P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f6949Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public int f6950Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f6951R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final p f6952R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f6953S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final AccessibilityManager f6954T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ArrayList f6955U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f6956V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f6957W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f6958a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f6959b0;
    public J0.w c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public EdgeEffect f6960d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public EdgeEffect f6961e0;
    public EdgeEffect f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public EdgeEffect f6962g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public u f6963h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f6964i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f6965j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public VelocityTracker f6966k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f6967l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f6968m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f6969n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f6970o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f6971p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public J0.z f6972q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f6973r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f6974s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f6975s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C f6976t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final float f6977t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final A f6978u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final float f6979u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SavedState f6980v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f6981v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0528a f6982w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final J0.G f6983w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0529b f6984x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public m f6985x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final I f6986y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final C0256f f6987y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6988z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final J0.D f6989z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new D();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Parcelable f6990u;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6990u = parcel.readParcelable(classLoader == null ? w.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f6990u, 0);
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final List f6991L = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f6993B;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public RecyclerView f7001J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public s f7002K;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final View f7003s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public WeakReference f7004t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f7005u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f7006v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public long f7007w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f7008x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f7009y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public a f7010z = null;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public a f6992A = null;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public ArrayList f6994C = null;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public List f6995D = null;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f6996E = 0;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public A f6997F = null;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public boolean f6998G = false;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f6999H = 0;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f7000I = -1;

        public a(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f7003s = view;
        }

        public final void b(int i10) {
            this.f6993B = i10 | this.f6993B;
        }

        public final int c() {
            RecyclerView recyclerView;
            s adapter;
            int iJ;
            if (this.f7002K == null || (recyclerView = this.f7001J) == null || (adapter = recyclerView.getAdapter()) == null || (iJ = this.f7001J.J(this)) == -1 || this.f7002K != adapter) {
                return -1;
            }
            return iJ;
        }

        public final int d() {
            int i10 = this.f7009y;
            return i10 == -1 ? this.f7005u : i10;
        }

        public final List e() {
            ArrayList arrayList;
            return ((this.f6993B & 1024) != 0 || (arrayList = this.f6994C) == null || arrayList.size() == 0) ? f6991L : this.f6995D;
        }

        public final boolean f() {
            View view = this.f7003s;
            return (view.getParent() == null || view.getParent() == this.f7001J) ? false : true;
        }

        public final boolean g() {
            return (this.f6993B & 1) != 0;
        }

        public final boolean h() {
            return (this.f6993B & 4) != 0;
        }

        public final boolean i() {
            if ((this.f6993B & 16) != 0) {
                return false;
            }
            WeakHashMap weakHashMap = U.a;
            return !this.f7003s.hasTransientState();
        }

        public final boolean j() {
            return (this.f6993B & 8) != 0;
        }

        public final boolean k() {
            return this.f6997F != null;
        }

        public final boolean l() {
            return (this.f6993B & 256) != 0;
        }

        public final boolean m() {
            return (this.f6993B & 2) != 0;
        }

        public final void n(int i10, boolean z6) {
            if (this.f7006v == -1) {
                this.f7006v = this.f7005u;
            }
            if (this.f7009y == -1) {
                this.f7009y = this.f7005u;
            }
            if (z6) {
                this.f7009y += i10;
            }
            this.f7005u += i10;
            View view = this.f7003s;
            if (view.getLayoutParams() != null) {
                ((x) view.getLayoutParams()).f7137u = true;
            }
        }

        public final void o() {
            if (RecyclerView.f6910S0 && l()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.f6993B = 0;
            this.f7005u = -1;
            this.f7006v = -1;
            this.f7007w = -1L;
            this.f7009y = -1;
            this.f6996E = 0;
            this.f7010z = null;
            this.f6992A = null;
            ArrayList arrayList = this.f6994C;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f6993B &= -1025;
            this.f6999H = 0;
            this.f7000I = -1;
            RecyclerView.l(this);
        }

        public final void p(boolean z6) {
            int i10 = this.f6996E;
            int i11 = z6 ? i10 - 1 : i10 + 1;
            this.f6996E = i11;
            if (i11 < 0) {
                this.f6996E = 0;
                if (RecyclerView.f6910S0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                toString();
            } else if (!z6 && i11 == 1) {
                this.f6993B |= 16;
            } else if (z6 && i11 == 0) {
                this.f6993B &= -17;
            }
            if (RecyclerView.f6911T0) {
                toString();
            }
        }

        public final boolean q() {
            return (this.f6993B & 128) != 0;
        }

        public final boolean r() {
            return (this.f6993B & 32) != 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f7005u + " id=" + this.f7007w + ", oldPos=" + this.f7006v + ", pLpos:" + this.f7009y);
            if (k()) {
                sb.append(" scrap ");
                sb.append(this.f6998G ? "[changeScrap]" : "[attachedScrap]");
            }
            if (h()) {
                sb.append(" invalid");
            }
            if (!g()) {
                sb.append(" unbound");
            }
            if ((this.f6993B & 2) != 0) {
                sb.append(" update");
            }
            if (j()) {
                sb.append(" removed");
            }
            if (q()) {
                sb.append(" ignored");
            }
            if (l()) {
                sb.append(" tmpDetached");
            }
            if (!i()) {
                sb.append(" not recyclable(" + this.f6996E + ")");
            }
            if ((this.f6993B & 512) != 0 || h()) {
                sb.append(" undefined adapter position");
            }
            if (this.f7003s.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    static {
        Class cls = Integer.TYPE;
        f6915Z0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f6916a1 = new J0.s(0);
        f6917b1 = new J0.E();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.kcstream.cing.R.attr.recyclerViewStyle);
    }

    public static RecyclerView H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewH = H(viewGroup.getChildAt(i10));
            if (recyclerViewH != null) {
                return recyclerViewH;
            }
        }
        return null;
    }

    public static a M(View view) {
        if (view == null) {
            return null;
        }
        return ((x) view.getLayoutParams()).f7135s;
    }

    private C0429o getScrollingChildHelper() {
        if (this.f6935I0 == null) {
            this.f6935I0 = new C0429o(this);
        }
        return this.f6935I0;
    }

    public static void l(a aVar) {
        WeakReference weakReference = aVar.f7004t;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == aVar.f7003s) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            aVar.f7004t = null;
        }
    }

    public static int o(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && J7.a.h(edgeEffect) != 0.0f) {
            int iRound = Math.round(J7.a.q(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f) * ((-i11) / 4.0f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || J7.a.h(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round(J7.a.q(edgeEffect2, (i10 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z6) {
        f6910S0 = z6;
    }

    public static void setVerboseLoggingEnabled(boolean z6) {
        f6911T0 = z6;
    }

    public final void A() {
        if (this.f0 != null) {
            return;
        }
        ((J0.E) this.c0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f0 = edgeEffect;
        if (this.f6988z) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.f6961e0 != null) {
            return;
        }
        ((J0.E) this.c0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f6961e0 = edgeEffect;
        if (this.f6988z) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.f6926E + ", layout:" + this.f6928F + ", context:" + getContext();
    }

    public final void D(J0.D d3) {
        if (getScrollState() != 2) {
            d3.getClass();
            return;
        }
        OverScroller overScroller = this.f6983w0.f2238u;
        overScroller.getFinalX();
        overScroller.getCurrX();
        d3.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[SYNTHETIC] */
    public final boolean F(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f6934I;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0255e c0255e = (C0255e) arrayList.get(i10);
            int i11 = c0255e.f2298v;
            if (i11 == 1) {
                boolean zE = c0255e.e(motionEvent.getX(), motionEvent.getY());
                boolean zD = c0255e.d(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zE || zD)) {
                    if (zD) {
                        c0255e.f2299w = 1;
                        c0255e.f2292p = (int) motionEvent.getX();
                    } else if (zE) {
                        c0255e.f2299w = 2;
                        c0255e.f2289m = (int) motionEvent.getY();
                    }
                    c0255e.g(2);
                    if (action != 3) {
                        this.f6936J = c0255e;
                        return true;
                    }
                }
            } else if (i11 != 2) {
                continue;
            } else if (action != 3) {
                this.f6936J = c0255e;
                return true;
            }
        }
        return false;
    }

    public final void G(int[] iArr) {
        int iE = this.f6984x.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iE; i12++) {
            a aVarM = M(this.f6984x.d(i12));
            if (!aVarM.q()) {
                int iD = aVarM.d();
                if (iD < i10) {
                    i10 = iD;
                }
                if (iD > i11) {
                    i11 = iD;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final a I(int i10) {
        a aVar = null;
        if (this.f6956V) {
            return null;
        }
        int iH = this.f6984x.h();
        for (int i11 = 0; i11 < iH; i11++) {
            a aVarM = M(this.f6984x.g(i11));
            if (aVarM != null && !aVarM.j() && J(aVarM) == i10) {
                C0529b c0529b = this.f6984x;
                if (!c0529b.f7053c.contains(aVarM.f7003s)) {
                    return aVarM;
                }
                aVar = aVarM;
            }
        }
        return aVar;
    }

    public final int J(a aVar) {
        if (((aVar.f6993B & 524) != 0) || !aVar.g()) {
            return -1;
        }
        C0528a c0528a = this.f6982w;
        int i10 = aVar.f7005u;
        ArrayList arrayList = c0528a.f7047b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0251a c0251a = (C0251a) arrayList.get(i11);
            int i12 = c0251a.a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = c0251a.f2268b;
                    if (i13 <= i10) {
                        int i14 = c0251a.f2270d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = c0251a.f2268b;
                    if (i15 == i10) {
                        i10 = c0251a.f2270d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (c0251a.f2270d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (c0251a.f2268b <= i10) {
                i10 += c0251a.f2270d;
            }
        }
        return i10;
    }

    public final long K(a aVar) {
        return this.f6926E.f7113b ? aVar.f7007w : aVar.f7005u;
    }

    public final a L(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return M(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect N(View view) {
        x xVar = (x) view.getLayoutParams();
        boolean z6 = xVar.f7137u;
        Rect rect = xVar.f7136t;
        if (!z6 || (this.f6989z0.f2229g && (xVar.f7135s.m() || xVar.f7135s.h()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f6932H;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Rect rect2 = this.f6920B;
            rect2.set(0, 0, 0, 0);
            ((J0.x) arrayList.get(i10)).a(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        xVar.f7137u = false;
        return rect;
    }

    public final boolean O() {
        return !this.f6942M || this.f6956V || this.f6982w.g();
    }

    public final boolean P() {
        return this.f6958a0 > 0;
    }

    public final void Q(int i10) {
        if (this.f6928F == null) {
            return;
        }
        setScrollState(2);
        this.f6928F.w0(i10);
        awakenScrollBars();
    }

    public final void R() {
        int iH = this.f6984x.h();
        for (int i10 = 0; i10 < iH; i10++) {
            ((x) this.f6984x.g(i10).getLayoutParams()).f7137u = true;
        }
        ArrayList arrayList = this.f6978u.f6875c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            x xVar = (x) ((a) arrayList.get(i11)).f7003s.getLayoutParams();
            if (xVar != null) {
                xVar.f7137u = true;
            }
        }
    }

    public final void S(int i10, int i11, boolean z6) {
        int i12 = i10 + i11;
        int iH = this.f6984x.h();
        for (int i13 = 0; i13 < iH; i13++) {
            a aVarM = M(this.f6984x.g(i13));
            if (aVarM != null && !aVarM.q()) {
                int i14 = aVarM.f7005u;
                J0.D d3 = this.f6989z0;
                if (i14 >= i12) {
                    if (f6911T0) {
                        aVarM.toString();
                    }
                    aVarM.n(-i11, z6);
                    d3.f2228f = true;
                } else if (i14 >= i10) {
                    if (f6911T0) {
                        aVarM.toString();
                    }
                    aVarM.b(8);
                    aVarM.n(-i11, z6);
                    aVarM.f7005u = i10 - 1;
                    d3.f2228f = true;
                }
            }
        }
        A a10 = this.f6978u;
        ArrayList arrayList = a10.f6875c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (aVar != null) {
                int i15 = aVar.f7005u;
                if (i15 >= i12) {
                    if (f6911T0) {
                        aVar.toString();
                    }
                    aVar.n(-i11, z6);
                } else if (i15 >= i10) {
                    aVar.b(8);
                    a10.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void T() {
        this.f6958a0++;
    }

    public final void U(boolean z6) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.f6958a0 - 1;
        this.f6958a0 = i11;
        if (i11 < 1) {
            if (f6910S0 && i11 < 0) {
                throw new IllegalStateException(E0.a.f(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f6958a0 = 0;
            if (z6) {
                int i12 = this.f6951R;
                this.f6951R = 0;
                if (i12 != 0 && (accessibilityManager = this.f6954T) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i12);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f6943M0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    a aVar = (a) arrayList.get(size);
                    if (aVar.f7003s.getParent() == this && !aVar.q() && (i10 = aVar.f7000I) != -1) {
                        WeakHashMap weakHashMap = U.a;
                        aVar.f7003s.setImportantForAccessibility(i10);
                        aVar.f7000I = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6965j0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f6965j0 = motionEvent.getPointerId(i10);
            int x8 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f6969n0 = x8;
            this.f6967l0 = x8;
            int y6 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f6970o0 = y6;
            this.f6968m0 = y6;
        }
    }

    public final void W() {
        if (this.f6929F0 || !this.f6938K) {
            return;
        }
        WeakHashMap weakHashMap = U.a;
        postOnAnimation(this.f6945N0);
        this.f6929F0 = true;
    }

    public final void X() {
        boolean z6;
        boolean z10 = false;
        if (this.f6956V) {
            C0528a c0528a = this.f6982w;
            c0528a.k(c0528a.f7047b);
            c0528a.k(c0528a.f7048c);
            c0528a.f7051f = 0;
            if (this.f6957W) {
                this.f6928F.e0();
            }
        }
        if (this.f6963h0 == null || !this.f6928F.I0()) {
            this.f6982w.c();
        } else {
            this.f6982w.j();
        }
        boolean z11 = this.f6923C0 || this.f6925D0;
        boolean z12 = this.f6942M && this.f6963h0 != null && ((z6 = this.f6956V) || z11 || this.f6928F.f7125f) && (!z6 || this.f6926E.f7113b);
        J0.D d3 = this.f6989z0;
        d3.j = z12;
        if (z12 && z11 && !this.f6956V && this.f6963h0 != null && this.f6928F.I0()) {
            z10 = true;
        }
        d3.f2232k = z10;
    }

    public final void Y(boolean z6) {
        this.f6957W = z6 | this.f6957W;
        this.f6956V = true;
        int iH = this.f6984x.h();
        for (int i10 = 0; i10 < iH; i10++) {
            a aVarM = M(this.f6984x.g(i10));
            if (aVarM != null && !aVarM.q()) {
                aVarM.b(6);
            }
        }
        R();
        A a10 = this.f6978u;
        ArrayList arrayList = a10.f6875c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar != null) {
                aVar.b(6);
                aVar.b(1024);
            }
        }
        s sVar = a10.f6880h.f6926E;
        if (sVar == null || !sVar.f7113b) {
            a10.f();
        }
    }

    public final void Z(a aVar, t tVar) {
        aVar.f6993B &= -8193;
        boolean z6 = this.f6989z0.f2230h;
        I i10 = this.f6986y;
        if (z6 && aVar.m() && !aVar.j() && !aVar.q()) {
            i10.f6891b.j(K(aVar), aVar);
        }
        p212w.i iVar = i10.a;
        P pA = (P) iVar.get(aVar);
        if (pA == null) {
            pA = P.a();
            iVar.put(aVar, pA);
        }
        pA.f2266b = tVar;
        pA.a |= 4;
    }

    public final int a0(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f6960d0;
        float f11 = 0.0f;
        if (edgeEffect == null || J7.a.h(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f0;
            if (edgeEffect2 != null && J7.a.h(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f0.onRelease();
                } else {
                    float fQ = J7.a.q(this.f0, width, height);
                    if (J7.a.h(this.f0) == 0.0f) {
                        this.f0.onRelease();
                    }
                    f11 = fQ;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f6960d0.onRelease();
            } else {
                float f12 = -J7.a.q(this.f6960d0, -width, 1.0f - height);
                if (J7.a.h(this.f6960d0) == 0.0f) {
                    this.f6960d0.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        w wVar = this.f6928F;
        if (wVar != null) {
            wVar.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final int b0(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f6961e0;
        float f11 = 0.0f;
        if (edgeEffect == null || J7.a.h(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f6962g0;
            if (edgeEffect2 != null && J7.a.h(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f6962g0.onRelease();
                } else {
                    float fQ = J7.a.q(this.f6962g0, height, 1.0f - width);
                    if (J7.a.h(this.f6962g0) == 0.0f) {
                        this.f6962g0.onRelease();
                    }
                    f11 = fQ;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f6961e0.onRelease();
            } else {
                float f12 = -J7.a.q(this.f6961e0, -height, width);
                if (J7.a.h(this.f6961e0) == 0.0f) {
                    this.f6961e0.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    public final void c0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f6920B;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof x) {
            x xVar = (x) layoutParams;
            if (!xVar.f7137u) {
                int i10 = rect.left;
                Rect rect2 = xVar.f7136t;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f6928F.t0(this, view, this.f6920B, !this.f6942M, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof x) && this.f6928F.g((x) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        w wVar = this.f6928F;
        if (wVar != null && wVar.e()) {
            return this.f6928F.k(this.f6989z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        w wVar = this.f6928F;
        if (wVar != null && wVar.e()) {
            return this.f6928F.l(this.f6989z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        w wVar = this.f6928F;
        if (wVar != null && wVar.e()) {
            return this.f6928F.m(this.f6989z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        w wVar = this.f6928F;
        if (wVar != null && wVar.f()) {
            return this.f6928F.n(this.f6989z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        w wVar = this.f6928F;
        if (wVar != null && wVar.f()) {
            return this.f6928F.o(this.f6989z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        w wVar = this.f6928F;
        if (wVar != null && wVar.f()) {
            return this.f6928F.p(this.f6989z0);
        }
        return 0;
    }

    public final void d0() {
        VelocityTracker velocityTracker = this.f6966k0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        l0(0);
        EdgeEffect edgeEffect = this.f6960d0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f6960d0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f6961e0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f6961e0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f6962g0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f6962g0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = U.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z6) {
        return getScrollingChildHelper().a(f10, f11, z6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z6;
        super.draw(canvas);
        ArrayList arrayList = this.f6932H;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((J0.x) arrayList.get(i10)).c(canvas, this);
        }
        EdgeEffect edgeEffect = this.f6960d0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z6 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f6988z ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f6960d0;
            z6 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f6961e0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f6988z) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f6961e0;
            z6 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f6988z ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f0;
            z6 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f6962g0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f6988z) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f6962g0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z6 |= z10;
            canvas.restoreToCount(iSave4);
        }
        if ((z6 || this.f6963h0 == null || arrayList.size() <= 0 || !this.f6963h0.f()) ? z6 : true) {
            WeakHashMap weakHashMap = U.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fc A[DONT_INVERT, PHI: r7
      0x00fc: PHI (r7v10 boolean) = (r7v8 boolean), (r7v11 boolean) binds: [B:34:0x00e3, B:32:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    public final boolean e0(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z6;
        boolean z10;
        p();
        s sVar = this.f6926E;
        int[] iArr = this.f6941L0;
        if (sVar != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            f0(i10, i11, iArr);
            i13 = iArr[0];
            i14 = iArr[1];
            i15 = i10 - i13;
            i16 = i11 - i14;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f6932H.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        w(i13, i14, i15, i16, this.f6937J0, i12, iArr);
        int i17 = iArr[0];
        int i18 = i15 - i17;
        int i19 = iArr[1];
        int i20 = i16 - i19;
        boolean z11 = (i17 == 0 && i19 == 0) ? false : true;
        int i21 = this.f6969n0;
        int[] iArr2 = this.f6937J0;
        int i22 = iArr2[0];
        this.f6969n0 = i21 - i22;
        int i23 = this.f6970o0;
        int i24 = iArr2[1];
        this.f6970o0 = i23 - i24;
        int[] iArr3 = this.f6939K0;
        iArr3[0] = iArr3[0] + i22;
        iArr3[1] = iArr3[1] + i24;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z6 = true;
            } else {
                float x8 = motionEvent.getX();
                float f10 = i18;
                float y6 = motionEvent.getY();
                float f11 = i20;
                if (f10 < 0.0f) {
                    z();
                    z6 = true;
                    J7.a.q(this.f6960d0, (-f10) / getWidth(), 1.0f - (y6 / getHeight()));
                } else {
                    z6 = true;
                    if (f10 > 0.0f) {
                        A();
                        J7.a.q(this.f0, f10 / getWidth(), y6 / getHeight());
                    } else {
                        z10 = false;
                    }
                    if (f11 < 0.0f) {
                        B();
                        J7.a.q(this.f6961e0, (-f11) / getHeight(), x8 / getWidth());
                    } else if (f11 > 0.0f) {
                        y();
                        J7.a.q(this.f6962g0, f11 / getHeight(), 1.0f - (x8 / getWidth()));
                    } else if (z10 || f10 != 0.0f || f11 != 0.0f) {
                        WeakHashMap weakHashMap = U.a;
                        postInvalidateOnAnimation();
                    }
                    z10 = z6;
                    if (z10) {
                        WeakHashMap weakHashMap2 = U.a;
                        postInvalidateOnAnimation();
                    } else {
                        WeakHashMap weakHashMap3 = U.a;
                        postInvalidateOnAnimation();
                    }
                }
                z10 = z6;
                if (f11 < 0.0f) {
                    B();
                    J7.a.q(this.f6961e0, (-f11) / getHeight(), x8 / getWidth());
                } else if (f11 > 0.0f) {
                    y();
                    J7.a.q(this.f6962g0, f11 / getHeight(), 1.0f - (x8 / getWidth()));
                } else if (z10) {
                    WeakHashMap weakHashMap4 = U.a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap5 = U.a;
                    postInvalidateOnAnimation();
                }
                z10 = z6;
                if (z10) {
                    WeakHashMap weakHashMap6 = U.a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap7 = U.a;
                    postInvalidateOnAnimation();
                }
            }
            n(i10, i11);
        } else {
            z6 = true;
        }
        if (i13 != 0 || i14 != 0) {
            x(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z11 && i13 == 0 && i14 == 0) {
            return false;
        }
        return z6;
    }

    public final void f0(int i10, int i11, int[] iArr) {
        a aVar;
        C0529b c0529b = this.f6984x;
        j0();
        T();
        int i12 = Q.m.a;
        Trace.beginSection("RV Scroll");
        J0.D d3 = this.f6989z0;
        D(d3);
        A a10 = this.f6978u;
        int iV0 = i10 != 0 ? this.f6928F.v0(i10, d3, a10) : 0;
        int iX0 = i11 != 0 ? this.f6928F.x0(i11, d3, a10) : 0;
        Trace.endSection();
        int iE = c0529b.e();
        for (int i13 = 0; i13 < iE; i13++) {
            View viewD = c0529b.d(i13);
            a aVarL = L(viewD);
            if (aVarL != null && (aVar = aVarL.f6992A) != null) {
                int left = viewD.getLeft();
                int top = viewD.getTop();
                View view = aVar.f7003s;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        U(true);
        k0(false);
        if (iArr != null) {
            iArr[0] = iV0;
            iArr[1] = iX0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0163  */
    /* JADX WARN: Code duplicated, block: B:137:0x0193 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:138:0x0194  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i10) {
        View viewY;
        int i11;
        byte b3;
        boolean z6;
        this.f6928F.getClass();
        boolean z10 = true;
        boolean z11 = (this.f6926E == null || this.f6928F == null || P() || this.P) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        J0.D d3 = this.f6989z0;
        A a10 = this.f6978u;
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f6928F.f()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            if (!z6 && this.f6928F.e()) {
                z6 = focusFinder.findNextFocus(this, view, (this.f6928F.H() == 1) ^ (i10 == 2) ? 66 : 17) == null;
            }
            if (z6) {
                p();
                if (E(view) != null) {
                    j0();
                    this.f6928F.Y(view, i10, a10, d3);
                    k0(false);
                }
                return null;
            }
            viewY = focusFinder.findNextFocus(this, view, i10);
            if (viewY == null) {
            }
            if (viewY != null) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                return viewY;
            }
            return super.focusSearch(view, i10);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
        if (viewFindNextFocus == null && z11) {
            p();
            if (E(view) != null) {
                j0();
                viewY = this.f6928F.Y(view, i10, a10, d3);
                k0(false);
            }
            return null;
        }
        viewY = viewFindNextFocus;
        if (viewY == null && !viewY.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i10);
            }
            c0(viewY, null);
            return view;
        }
        if (viewY != null || viewY == this || viewY == view) {
            z10 = false;
        } else if (E(viewY) == null) {
            z10 = false;
        } else if (view != null && E(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f6920B;
            rect.set(0, 0, width, height);
            int width2 = viewY.getWidth();
            int height2 = viewY.getHeight();
            Rect rect2 = this.f6922C;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewY, rect2);
            int i12 = this.f6928F.H() == 1 ? -1 : 1;
            int i13 = rect.left;
            int i14 = rect2.left;
            if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
                i11 = 1;
            } else {
                int i15 = rect.right;
                int i16 = rect2.right;
                i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
            }
            int i17 = rect.top;
            int i18 = rect2.top;
            if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
                b3 = 1;
            } else {
                int i19 = rect.bottom;
                int i20 = rect2.bottom;
                b3 = ((i19 > i20 || i17 >= i20) && i17 > i18) ? (byte) -1 : (byte) 0;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 17) {
                        if (i10 != 33) {
                            if (i10 != 66) {
                                if (i10 != 130) {
                                    StringBuilder sb = new StringBuilder("Invalid direction: ");
                                    sb.append(i10);
                                    throw new IllegalArgumentException(E0.a.f(this, sb));
                                }
                                if (b3 <= 0) {
                                    z10 = false;
                                }
                            } else if (i11 <= 0) {
                                z10 = false;
                            }
                        } else if (b3 >= 0) {
                            z10 = false;
                        }
                    } else if (i11 >= 0) {
                        z10 = false;
                    }
                } else if (b3 <= 0 && (b3 != 0 || i11 * i12 <= 0)) {
                    z10 = false;
                }
            } else if (b3 >= 0 && (b3 != 0 || i11 * i12 >= 0)) {
                z10 = false;
            }
        }
        if (z10) {
            return viewY;
        }
        return super.focusSearch(view, i10);
    }

    public final void g0(int i10) {
        C0263m c0263m;
        if (this.P) {
            return;
        }
        setScrollState(0);
        J0.G g8 = this.f6983w0;
        g8.f2242y.removeCallbacks(g8);
        g8.f2238u.abortAnimation();
        w wVar = this.f6928F;
        if (wVar != null && (c0263m = wVar.f7124e) != null) {
            c0263m.i();
        }
        w wVar2 = this.f6928F;
        if (wVar2 == null) {
            return;
        }
        wVar2.w0(i10);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        w wVar = this.f6928F;
        if (wVar != null) {
            return wVar.s();
        }
        throw new IllegalStateException(E0.a.f(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        w wVar = this.f6928F;
        if (wVar != null) {
            return wVar.t(getContext(), attributeSet);
        }
        throw new IllegalStateException(E0.a.f(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public s getAdapter() {
        return this.f6926E;
    }

    @Override // android.view.View
    public int getBaseline() {
        w wVar = this.f6928F;
        if (wVar == null) {
            return super.getBaseline();
        }
        wVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f6988z;
    }

    public J0.I getCompatAccessibilityDelegate() {
        return this.f6931G0;
    }

    public J0.w getEdgeEffectFactory() {
        return this.c0;
    }

    public u getItemAnimator() {
        return this.f6963h0;
    }

    public int getItemDecorationCount() {
        return this.f6932H.size();
    }

    public w getLayoutManager() {
        return this.f6928F;
    }

    public int getMaxFlingVelocity() {
        return this.f6975s0;
    }

    public int getMinFlingVelocity() {
        return this.f6973r0;
    }

    public long getNanoTime() {
        if (Y0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public J0.z getOnFlingListener() {
        return this.f6972q0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f6981v0;
    }

    public z getRecycledViewPool() {
        return this.f6978u.c();
    }

    public int getScrollState() {
        return this.f6964i0;
    }

    public final void h(a aVar) {
        View view = aVar.f7003s;
        boolean z6 = view.getParent() == this;
        this.f6978u.l(L(view));
        if (aVar.l()) {
            this.f6984x.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z6) {
            this.f6984x.a(view, -1, true);
            return;
        }
        C0529b c0529b = this.f6984x;
        int iIndexOfChild = c0529b.a.a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            c0529b.f7052b.h(iIndexOfChild);
            c0529b.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final boolean h0(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        float fH = J7.a.h(edgeEffect) * i11;
        float fAbs = Math.abs(-i10) * 0.35f;
        float f10 = this.f6974s * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d3 = f6912V0;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * dLog) * ((double) f10))) < fH;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(J0.x xVar) {
        w wVar = this.f6928F;
        if (wVar != null) {
            wVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f6932H;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(xVar);
        R();
        requestLayout();
    }

    public final void i0(int i10, int i11, boolean z6) {
        w wVar = this.f6928F;
        if (wVar == null || this.P) {
            return;
        }
        if (!wVar.e()) {
            i10 = 0;
        }
        if (!this.f6928F.f()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (z6) {
            int i12 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i12 |= 2;
            }
            getScrollingChildHelper().g(i12, 1);
        }
        this.f6983w0.c(i10, i11, Integer.MIN_VALUE, null);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f6938K;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.P;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f4833d;
    }

    public final void j(J0.A a10) {
        if (this.f6921B0 == null) {
            this.f6921B0 = new ArrayList();
        }
        this.f6921B0.add(a10);
    }

    public final void j0() {
        int i10 = this.f6944N + 1;
        this.f6944N = i10;
        if (i10 != 1 || this.P) {
            return;
        }
        this.f6946O = false;
    }

    public final void k(String str) {
        if (P()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(E0.a.f(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f6959b0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(E0.a.f(this, new StringBuilder(""))));
        }
    }

    public final void k0(boolean z6) {
        if (this.f6944N < 1) {
            if (f6910S0) {
                throw new IllegalStateException(E0.a.f(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f6944N = 1;
        }
        if (!z6 && !this.P) {
            this.f6946O = false;
        }
        if (this.f6944N == 1) {
            if (z6 && this.f6946O && !this.P && this.f6928F != null && this.f6926E != null) {
                s();
            }
            if (!this.P) {
                this.f6946O = false;
            }
        }
        this.f6944N--;
    }

    public final void l0(int i10) {
        getScrollingChildHelper().h(i10);
    }

    public final void m() {
        int iH = this.f6984x.h();
        for (int i10 = 0; i10 < iH; i10++) {
            a aVarM = M(this.f6984x.g(i10));
            if (!aVarM.q()) {
                aVarM.f7006v = -1;
                aVarM.f7009y = -1;
            }
        }
        A a10 = this.f6978u;
        ArrayList arrayList = a10.f6875c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            aVar.f7006v = -1;
            aVar.f7009y = -1;
        }
        ArrayList arrayList2 = a10.a;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            a aVar2 = (a) arrayList2.get(i12);
            aVar2.f7006v = -1;
            aVar2.f7009y = -1;
        }
        ArrayList arrayList3 = a10.f6874b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                a aVar3 = (a) a10.f6874b.get(i13);
                aVar3.f7006v = -1;
                aVar3.f7009y = -1;
            }
        }
    }

    public final void n(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f6960d0;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f6960d0.onRelease();
            zIsFinished = this.f6960d0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f0.onRelease();
            zIsFinished |= this.f0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f6961e0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f6961e0.onRelease();
            zIsFinished |= this.f6961e0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f6962g0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f6962g0.onRelease();
            zIsFinished |= this.f6962g0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = U.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f6958a0 = 0;
        this.f6938K = true;
        this.f6942M = this.f6942M && !isLayoutRequested();
        this.f6978u.d();
        w wVar = this.f6928F;
        if (wVar != null) {
            wVar.f7126g = true;
            wVar.W(this);
        }
        this.f6929F0 = false;
        if (Y0) {
            ThreadLocal threadLocal = m.f7097w;
            m mVar = (m) threadLocal.get();
            this.f6985x0 = mVar;
            if (mVar == null) {
                m mVar2 = new m();
                mVar2.f7099s = new ArrayList();
                mVar2.f7102v = new ArrayList();
                this.f6985x0 = mVar2;
                WeakHashMap weakHashMap = U.a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                m mVar3 = this.f6985x0;
                mVar3.f7101u = (long) (1.0E9f / refreshRate);
                threadLocal.set(mVar3);
            }
            m mVar4 = this.f6985x0;
            mVar4.getClass();
            boolean z6 = f6910S0;
            ArrayList arrayList = mVar4.f7099s;
            if (z6 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        A a10;
        m mVar;
        C0263m c0263m;
        super.onDetachedFromWindow();
        u uVar = this.f6963h0;
        if (uVar != null) {
            uVar.e();
        }
        int i10 = 0;
        setScrollState(0);
        J0.G g8 = this.f6983w0;
        g8.f2242y.removeCallbacks(g8);
        g8.f2238u.abortAnimation();
        w wVar = this.f6928F;
        if (wVar != null && (c0263m = wVar.f7124e) != null) {
            c0263m.i();
        }
        this.f6938K = false;
        w wVar2 = this.f6928F;
        if (wVar2 != null) {
            wVar2.f7126g = false;
            wVar2.X(this);
        }
        this.f6943M0.clear();
        removeCallbacks(this.f6945N0);
        this.f6986y.getClass();
        while (P.f2265d.a() != null) {
        }
        int i11 = 0;
        while (true) {
            a10 = this.f6978u;
            ArrayList arrayList = a10.f6875c;
            if (i11 >= arrayList.size()) {
                break;
            }
            com.bumptech.glide.c.b(((a) arrayList.get(i11)).f7003s);
            i11++;
        }
        a10.e(a10.f6880h.f6926E, false);
        while (i10 < getChildCount()) {
            int i12 = i10 + 1;
            View childAt = getChildAt(i10);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            p012b0.a aVar = (p012b0.a) childAt.getTag(com.kcstream.cing.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new p012b0.a();
                childAt.setTag(com.kcstream.cing.R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList2 = aVar.a;
            int iB = p086i8.l.B(arrayList2);
            if (-1 < iB) {
                arrayList2.get(iB).getClass();
                throw new ClassCastException();
            }
            i10 = i12;
        }
        if (!Y0 || (mVar = this.f6985x0) == null) {
            return;
        }
        boolean zRemove = mVar.f7099s.remove(this);
        if (f6910S0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f6985x0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f6932H;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((J0.x) arrayList.get(i10)).b(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if (this.f6928F != null && !this.P && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.f6928F.f() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f6928F.e() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f6928F.f()) {
                    f10 = -axisValue2;
                } else if (this.f6928F.e()) {
                    axisValue = axisValue2;
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f10 = 0.0f;
                axisValue = 0.0f;
            }
            if (f10 != 0.0f || axisValue != 0.0f) {
                int i10 = (int) (axisValue * this.f6977t0);
                int i11 = (int) (f10 * this.f6979u0);
                w wVar = this.f6928F;
                if (wVar != null && !this.P) {
                    int[] iArr = this.f6941L0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zE = wVar.e();
                    boolean zF = this.f6928F.f();
                    int i12 = zF ? (zE ? 1 : 0) | 2 : zE ? 1 : 0;
                    float y6 = motionEvent.getY();
                    float x8 = motionEvent.getX();
                    int iA0 = i10 - a0(i10, y6);
                    int iB0 = i11 - b0(i11, x8);
                    getScrollingChildHelper().g(i12, 1);
                    if (v(zE ? iA0 : 0, zF ? iB0 : 0, 1, this.f6941L0, this.f6937J0)) {
                        iA0 -= iArr[0];
                        iB0 -= iArr[1];
                    }
                    e0(zE ? iA0 : 0, zF ? iB0 : 0, motionEvent, 1);
                    m mVar = this.f6985x0;
                    if (mVar != null && (iA0 != 0 || iB0 != 0)) {
                        mVar.a(this, iA0, iB0);
                    }
                    l0(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z10;
        if (!this.P) {
            this.f6936J = null;
            if (F(motionEvent)) {
                d0();
                setScrollState(0);
                return true;
            }
            w wVar = this.f6928F;
            if (wVar != null) {
                boolean zE = wVar.e();
                boolean zF = this.f6928F.f();
                if (this.f6966k0 == null) {
                    this.f6966k0 = VelocityTracker.obtain();
                }
                this.f6966k0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f6949Q) {
                        this.f6949Q = false;
                    }
                    this.f6965j0 = motionEvent.getPointerId(0);
                    int x8 = (int) (motionEvent.getX() + 0.5f);
                    this.f6969n0 = x8;
                    this.f6967l0 = x8;
                    int y6 = (int) (motionEvent.getY() + 0.5f);
                    this.f6970o0 = y6;
                    this.f6968m0 = y6;
                    EdgeEffect edgeEffect = this.f6960d0;
                    if (edgeEffect == null || J7.a.h(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z6 = false;
                    } else {
                        J7.a.q(this.f6960d0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z6 = true;
                    }
                    EdgeEffect edgeEffect2 = this.f0;
                    boolean z11 = z6;
                    if (edgeEffect2 != null && J7.a.h(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        z11 = z6;
                        z11 = z6;
                        J7.a.q(this.f0, 0.0f, motionEvent.getY() / getHeight());
                        z11 = true;
                    }
                    z11 = z6;
                    z11 = z6;
                    z11 = z6;
                    EdgeEffect edgeEffect3 = this.f6961e0;
                    boolean z12 = z11;
                    if (edgeEffect3 != null && J7.a.h(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        z12 = z11;
                        z12 = z11;
                        J7.a.q(this.f6961e0, 0.0f, motionEvent.getX() / getWidth());
                        z12 = true;
                    }
                    z12 = z11;
                    z12 = z11;
                    z12 = z11;
                    EdgeEffect edgeEffect4 = this.f6962g0;
                    boolean z13 = z12;
                    if (edgeEffect4 != null && J7.a.h(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        z13 = z12;
                        z13 = z12;
                        J7.a.q(this.f6962g0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z13 = true;
                    }
                    if (z13 || this.f6964i0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        l0(1);
                    }
                    int[] iArr = this.f6939K0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i10 = zE;
                    if (zF) {
                        i10 = (zE ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else if (actionMasked == 1) {
                    this.f6966k0.clear();
                    l0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f6965j0);
                    if (iFindPointerIndex >= 0) {
                        int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y8 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        if (this.f6964i0 != 1) {
                            int i11 = x10 - this.f6967l0;
                            int i12 = y8 - this.f6968m0;
                            if (!zE || Math.abs(i11) <= this.f6971p0) {
                                z10 = false;
                            } else {
                                this.f6969n0 = x10;
                                z10 = true;
                            }
                            if (zF && Math.abs(i12) > this.f6971p0) {
                                this.f6970o0 = y8;
                                z10 = true;
                            }
                            if (z10) {
                                setScrollState(1);
                            }
                        }
                    }
                } else if (actionMasked == 3) {
                    d0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f6965j0 = motionEvent.getPointerId(actionIndex);
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f6969n0 = x11;
                    this.f6967l0 = x11;
                    int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f6970o0 = y10;
                    this.f6968m0 = y10;
                } else if (actionMasked == 6) {
                    V(motionEvent);
                }
                if (this.f6964i0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int i14 = Q.m.a;
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.f6942M = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        w wVar = this.f6928F;
        if (wVar == null) {
            q(i10, i11);
            return;
        }
        boolean zQ = wVar.Q();
        boolean z6 = false;
        J0.D d3 = this.f6989z0;
        if (zQ) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f6928F.f7121b.q(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z6 = true;
            }
            this.f6947O0 = z6;
            if (z6 || this.f6926E == null) {
                return;
            }
            if (d3.f2226d == 1) {
                t();
            }
            this.f6928F.z0(i10, i11);
            d3.f2231i = true;
            u();
            this.f6928F.B0(i10, i11);
            if (this.f6928F.E0()) {
                this.f6928F.z0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                d3.f2231i = true;
                u();
                this.f6928F.B0(i10, i11);
            }
            this.f6948P0 = getMeasuredWidth();
            this.f6950Q0 = getMeasuredHeight();
            return;
        }
        if (this.f6940L) {
            this.f6928F.f7121b.q(i10, i11);
            return;
        }
        if (this.f6953S) {
            j0();
            T();
            X();
            U(true);
            if (d3.f2232k) {
                d3.f2229g = true;
            } else {
                this.f6982w.c();
                d3.f2229g = false;
            }
            this.f6953S = false;
            k0(false);
        } else if (d3.f2232k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        s sVar = this.f6926E;
        if (sVar != null) {
            d3.f2227e = sVar.a();
        } else {
            d3.f2227e = 0;
        }
        j0();
        this.f6928F.f7121b.q(i10, i11);
        k0(false);
        d3.f2229g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f6980v = savedState;
        super.onRestoreInstanceState(savedState.f6382s);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f6980v;
        if (savedState2 != null) {
            savedState.f6990u = savedState2.f6990u;
            return savedState;
        }
        w wVar = this.f6928F;
        if (wVar != null) {
            savedState.f6990u = wVar.m0();
            return savedState;
        }
        savedState.f6990u = null;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.f6962g0 = null;
        this.f6961e0 = null;
        this.f0 = null;
        this.f6960d0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x032a  */
    /* JADX WARN: Code duplicated, block: B:196:0x036c  */
    /* JADX WARN: Code duplicated, block: B:232:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:244:0x040f  */
    /* JADX WARN: Code duplicated, block: B:301:0x04cc A[PHI: r6 r21 r22
      0x04cc: PHI (r6v17 int) = (r6v10 int), (r6v20 int) binds: [B:339:0x0546, B:299:0x04c9] A[DONT_GENERATE, DONT_INLINE]
      0x04cc: PHI (r21v3 boolean) = (r21v2 boolean), (r21v6 boolean) binds: [B:339:0x0546, B:299:0x04c9] A[DONT_GENERATE, DONT_INLINE]
      0x04cc: PHI (r22v3 boolean) = (r22v2 boolean), (r22v6 boolean) binds: [B:339:0x0546, B:299:0x04c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:302:0x04cf A[PHI: r21 r22
      0x04cf: PHI (r21v5 boolean) = 
      (r21v2 boolean)
      (r21v2 boolean)
      (r21v2 boolean)
      (r21v2 boolean)
      (r21v2 boolean)
      (r21v2 boolean)
      (r21v6 boolean)
      (r21v6 boolean)
      (r21v6 boolean)
      (r21v7 boolean)
     binds: [B:304:0x04d9, B:307:0x04e1, B:310:0x04e8, B:313:0x04ef, B:316:0x04fb, B:333:0x053c, B:282:0x0498, B:298:0x04c7, B:299:0x04c9, B:244:0x040f] A[DONT_GENERATE, DONT_INLINE]
      0x04cf: PHI (r22v5 boolean) = 
      (r22v2 boolean)
      (r22v2 boolean)
      (r22v2 boolean)
      (r22v2 boolean)
      (r22v2 boolean)
      (r22v2 boolean)
      (r22v6 boolean)
      (r22v6 boolean)
      (r22v6 boolean)
      (r22v8 boolean)
     binds: [B:304:0x04d9, B:307:0x04e1, B:310:0x04e8, B:313:0x04ef, B:316:0x04fb, B:333:0x053c, B:282:0x0498, B:298:0x04c7, B:299:0x04c9, B:244:0x040f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:345:0x0553  */
    /* JADX WARN: Code duplicated, block: B:347:0x0559 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:348:0x055b  */
    /* JADX WARN: Code duplicated, block: B:349:0x055e  */
    /* JADX WARN: Code duplicated, block: B:94:0x01df A[PHI: r1
      0x01df: PHI (r1v61 int) = (r1v45 int), (r1v65 int) binds: [B:88:0x01c8, B:92:0x01db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x038e, code lost:
    
        if (r3 == 0) goto L351;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [U.o] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [U.o] */
    /* JADX WARN: Type inference failed for: r3v16, types: [J0.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44, types: [int] */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.recyclerview.widget.w] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instruction units count: 1476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        C0529b c0529b = this.f6984x;
        C0528a c0528a = this.f6982w;
        if (!this.f6942M || this.f6956V) {
            int i10 = Q.m.a;
            Trace.beginSection("RV FullInvalidate");
            s();
            Trace.endSection();
            return;
        }
        if (c0528a.g()) {
            int i11 = c0528a.f7051f;
            if ((i11 & 4) == 0 || (i11 & 11) != 0) {
                if (c0528a.g()) {
                    int i12 = Q.m.a;
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i13 = Q.m.a;
            Trace.beginSection("RV PartialInvalidate");
            j0();
            T();
            c0528a.j();
            if (!this.f6946O) {
                int iE = c0529b.e();
                for (int i14 = 0; i14 < iE; i14++) {
                    a aVarM = M(c0529b.d(i14));
                    if (aVarM != null && !aVarM.q() && aVarM.m()) {
                        s();
                    }
                }
                c0528a.b();
            }
            k0(true);
            U(true);
            Trace.endSection();
        }
    }

    public final void q(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = U.a;
        setMeasuredDimension(w.h(i10, paddingRight, getMinimumWidth()), w.h(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void r(View view) {
        a aVarM = M(view);
        s sVar = this.f6926E;
        if (sVar != null && aVarM != null) {
            sVar.j(aVarM);
        }
        ArrayList arrayList = this.f6955U;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p022c1.g) this.f6955U.get(size)).getClass();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z6) {
        a aVarM = M(view);
        if (aVarM != null) {
            if (aVarM.l()) {
                aVarM.f6993B &= -257;
            } else if (!aVarM.q()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(aVarM);
                throw new IllegalArgumentException(E0.a.f(this, sb));
            }
        } else if (f6910S0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(E0.a.f(this, sb2));
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0263m c0263m = this.f6928F.f7124e;
        if ((c0263m == null || !c0263m.f2330e) && !P() && view2 != null) {
            c0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        return this.f6928F.t0(this, view, rect, z6, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        ArrayList arrayList = this.f6934I;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C0255e) arrayList.get(i10)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f6944N != 0 || this.P) {
            this.f6946O = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0314  */
    /* JADX WARN: Code duplicated, block: B:184:0x0358  */
    /* JADX WARN: Code duplicated, block: B:186:0x035b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0370  */
    /* JADX WARN: Code duplicated, block: B:194:0x0378  */
    /* JADX WARN: Code duplicated, block: B:196:0x037c  */
    /* JADX WARN: Code duplicated, block: B:199:0x0384  */
    /* JADX WARN: Code duplicated, block: B:202:0x038b  */
    /* JADX WARN: Code duplicated, block: B:205:0x0395 A[LOOP:4: B:198:0x0382->B:205:0x0395, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:211:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:214:0x03b3 A[LOOP:5: B:207:0x03a0->B:214:0x03b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:216:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:245:0x0398 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0398 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0393 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x03b6 A[EDGE_INSN: B:248:0x03b6->B:215:0x03b6 BREAK  A[LOOP:5: B:207:0x03a0->B:214:0x03b3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void s() {
        int i10;
        long j;
        a aVar;
        int i11;
        int iB;
        int i12;
        int iMin;
        a aVarI;
        View view;
        a aVarI2;
        View view2;
        int i13;
        View viewFindViewById;
        C0529b c0529b;
        View view3;
        boolean z6;
        t tVar;
        ?? r10;
        boolean zG;
        int i14;
        if (this.f6926E == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f6928F == null) {
            return;
        }
        J0.D d3 = this.f6989z0;
        boolean z10 = false;
        d3.f2231i = false;
        int i15 = 1;
        boolean z11 = this.f6947O0 && !(this.f6948P0 == getWidth() && this.f6950Q0 == getHeight());
        this.f6948P0 = 0;
        this.f6950Q0 = 0;
        this.f6947O0 = false;
        if (d3.f2226d == 1) {
            t();
            this.f6928F.y0(this);
            u();
        } else {
            C0528a c0528a = this.f6982w;
            if ((c0528a.f7048c.isEmpty() || c0528a.f7047b.isEmpty()) && !z11 && this.f6928F.f7133o == getWidth() && this.f6928F.f7134p == getHeight()) {
                this.f6928F.y0(this);
            } else {
                this.f6928F.y0(this);
                u();
            }
        }
        d3.a(4);
        j0();
        T();
        d3.f2226d = 1;
        boolean z12 = d3.j;
        A a10 = this.f6978u;
        I i16 = this.f6986y;
        if (z12) {
            int iE = this.f6984x.e() - 1;
            while (iE >= 0) {
                a aVarM = M(this.f6984x.d(iE));
                if (aVarM.q()) {
                    i14 = i15;
                } else {
                    long jK = K(aVarM);
                    this.f6963h0.getClass();
                    t tVar2 = new t();
                    tVar2.a(aVarM);
                    a aVar2 = (a) i16.f6891b.e(jK);
                    if (aVar2 == null || aVar2.q()) {
                        i14 = i15;
                        i16.a(aVarM, tVar2);
                    } else {
                        p212w.i iVar = i16.a;
                        P p10 = (P) iVar.get(aVar2);
                        int i17 = (p10 == null || (p10.a & i15) == 0) ? 0 : i15;
                        P p11 = (P) iVar.get(aVarM);
                        int i18 = (p11 == null || (p11.a & i15) == 0) ? 0 : i15;
                        if (i17 == 0 || aVar2 != aVarM) {
                            i14 = i15;
                            t tVarB = i16.b(aVar2, 4);
                            i16.a(aVarM, tVar2);
                            t tVarB2 = i16.b(aVarM, 8);
                            if (tVarB == null) {
                                int iE2 = this.f6984x.e();
                                for (int i19 = 0; i19 < iE2; i19++) {
                                    a aVarM2 = M(this.f6984x.d(i19));
                                    if (aVarM2 != aVarM && K(aVarM2) == jK) {
                                        s sVar = this.f6926E;
                                        if (sVar == null || !sVar.f7113b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(aVarM2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(aVarM);
                                            throw new IllegalStateException(E0.a.f(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(aVarM2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(aVarM);
                                        throw new IllegalStateException(E0.a.f(this, sb2));
                                    }
                                }
                                Objects.toString(aVar2);
                                Objects.toString(aVarM);
                                C();
                            } else {
                                aVar2.p(false);
                                if (i17 != 0) {
                                    h(aVar2);
                                }
                                if (aVar2 != aVarM) {
                                    if (i18 != 0) {
                                        h(aVarM);
                                    }
                                    aVar2.f7010z = aVarM;
                                    h(aVar2);
                                    a10.l(aVar2);
                                    aVarM.p(false);
                                    aVarM.f6992A = aVar2;
                                }
                                if (this.f6963h0.a(aVar2, aVarM, tVarB, tVarB2)) {
                                    W();
                                }
                            }
                        } else {
                            i16.a(aVarM, tVar2);
                            i14 = i15;
                        }
                    }
                }
                iE--;
                i15 = i14;
            }
            i10 = i15;
            p212w.i iVar2 = i16.a;
            int i20 = iVar2.f15506u - 1;
            while (i20 >= 0) {
                a aVar3 = (a) iVar2.g(i20);
                P p12 = (P) iVar2.i(i20);
                int i21 = p12.a;
                int i22 = i21 & 3;
                p pVar = this.f6952R0;
                if (i22 == 3) {
                    RecyclerView recyclerView = pVar.a;
                    recyclerView.f6928F.s0(aVar3.f7003s, recyclerView.f6978u);
                    r10 = z10;
                } else if ((i21 & 1) != 0) {
                    t tVar3 = p12.f2266b;
                    if (tVar3 == null) {
                        RecyclerView recyclerView2 = pVar.a;
                        recyclerView2.f6928F.s0(aVar3.f7003s, recyclerView2.f6978u);
                        r10 = z10;
                    } else {
                        pVar.b(aVar3, tVar3, p12.f2267c);
                        r10 = z10;
                    }
                } else if ((i21 & 14) == 14) {
                    pVar.a(aVar3, p12.f2266b, p12.f2267c);
                    r10 = z10;
                } else {
                    if ((i21 & 12) == 12) {
                        t tVar4 = p12.f2266b;
                        t tVar5 = p12.f2267c;
                        pVar.getClass();
                        aVar3.p(z10);
                        RecyclerView recyclerView3 = pVar.a;
                        if (!recyclerView3.f6956V) {
                            E e10 = (E) recyclerView3.f6963h0;
                            e10.getClass();
                            int i23 = tVar4.a;
                            int i24 = tVar5.a;
                            if (i23 == i24 && tVar4.f7115b == tVar5.f7115b) {
                                e10.c(aVar3);
                                zG = false;
                            } else {
                                zG = e10.g(aVar3, i23, tVar4.f7115b, i24, tVar5.f7115b);
                            }
                            if (zG) {
                                recyclerView3.W();
                            }
                        } else if (recyclerView3.f6963h0.a(aVar3, aVar3, tVar4, tVar5)) {
                            recyclerView3.W();
                        }
                        r10 = 0;
                    } else {
                        if ((i21 & 4) != 0) {
                            tVar = null;
                            pVar.b(aVar3, p12.f2266b, null);
                        } else {
                            tVar = null;
                            if ((i21 & 8) != 0) {
                                pVar.a(aVar3, p12.f2266b, p12.f2267c);
                            }
                        }
                        r10 = 0;
                    }
                    p12.a = r10;
                    p12.f2266b = tVar;
                    p12.f2267c = tVar;
                    P.f2265d.c(p12);
                    i20--;
                    z10 = false;
                }
                tVar = null;
                p12.a = r10;
                p12.f2266b = tVar;
                p12.f2267c = tVar;
                P.f2265d.c(p12);
                i20--;
                z10 = false;
            }
        } else {
            i10 = 1;
        }
        View view4 = null;
        this.f6928F.r0(a10);
        d3.f2224b = d3.f2227e;
        this.f6956V = false;
        this.f6957W = false;
        d3.j = false;
        d3.f2232k = false;
        this.f6928F.f7125f = false;
        ArrayList arrayList = a10.f6874b;
        if (arrayList != null) {
            arrayList.clear();
        }
        w wVar = this.f6928F;
        if (wVar.f7130l) {
            wVar.f7129k = 0;
            wVar.f7130l = false;
            a10.m();
        }
        this.f6928F.k0(d3);
        ?? r11 = i10;
        U(r11);
        k0(false);
        i16.a.clear();
        i16.f6891b.c();
        int[] iArr = this.f6933H0;
        int i25 = iArr[0];
        int i26 = iArr[r11 == true ? 1 : 0];
        G(iArr);
        if ((iArr[0] == i25 && iArr[r11 == true ? 1 : 0] == i26) ? false : true) {
            x(0, 0);
        }
        if (this.f6981v0 && this.f6926E != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = d3.f2234m;
                if (j == -1) {
                    aVar = null;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    c0529b = this.f6984x;
                    view3 = aVar.f7003s;
                    if (!c0529b.f7053c.contains(view3)) {
                        if (this.f6984x.e() > 0) {
                            int i27 = d3.f2233l;
                            if (i27 != -1) {
                            }
                            iB = d3.b();
                            i12 = i11;
                            while (true) {
                                if (i12 < iB) {
                                    aVarI2 = I(i12);
                                    if (aVarI2 != null) {
                                        view2 = aVarI2.f7003s;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i11) - 1; iMin >= 0; iMin--) {
                                    aVarI = I(iMin);
                                    if (aVarI == null) {
                                        break;
                                        break;
                                    }
                                    view = aVarI.f7003s;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.f6984x.e() > 0) {
                        int i28 = d3.f2233l;
                        if (i28 != -1) {
                        }
                        iB = d3.b();
                        i12 = i11;
                        while (true) {
                            if (i12 < iB) {
                                aVarI2 = I(i12);
                                if (aVarI2 != null) {
                                    view2 = aVarI2.f7003s;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                aVarI = I(iMin);
                                if (aVarI == null) {
                                    break;
                                    break;
                                }
                                view = aVarI.f7003s;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f6984x.e() > 0) {
                    int i29 = d3.f2233l;
                    if (i29 != -1) {
                    }
                    iB = d3.b();
                    i12 = i11;
                    while (true) {
                        if (i12 < iB) {
                            aVarI2 = I(i12);
                            if (aVarI2 != null) {
                                view2 = aVarI2.f7003s;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i12++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            aVarI = I(iMin);
                            if (aVarI == null) {
                                break;
                                break;
                            }
                            view = aVarI.f7003s;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i13 = d3.f2235n;
                    if (i13 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (this.f6984x.f7053c.contains(getFocusedChild())) {
                j = d3.f2234m;
                if (j == -1 && (z6 = this.f6926E.f7113b) && z6) {
                    int iH = this.f6984x.h();
                    aVar = null;
                    for (int i30 = 0; i30 < iH; i30++) {
                        a aVarM3 = M(this.f6984x.g(i30));
                        if (aVarM3 != null && !aVarM3.j() && aVarM3.f7007w == j) {
                            if (!this.f6984x.f7053c.contains(aVarM3.f7003s)) {
                                aVar = aVarM3;
                                break;
                            }
                            aVar = aVarM3;
                        }
                    }
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    c0529b = this.f6984x;
                    view3 = aVar.f7003s;
                    if (!c0529b.f7053c.contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (this.f6984x.e() > 0) {
                        int i210 = d3.f2233l;
                        i11 = i210 != -1 ? i210 : 0;
                        iB = d3.b();
                        i12 = i11;
                        while (true) {
                            if (i12 < iB) {
                                aVarI2 = I(i12);
                                if (aVarI2 != null) {
                                    view2 = aVarI2.f7003s;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                aVarI = I(iMin);
                                if (aVarI == null) {
                                    break;
                                }
                                view = aVarI.f7003s;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f6984x.e() > 0) {
                    int i211 = d3.f2233l;
                    if (i211 != -1) {
                    }
                    iB = d3.b();
                    i12 = i11;
                    while (true) {
                        if (i12 < iB) {
                            aVarI2 = I(i12);
                            if (aVarI2 != null) {
                                view2 = aVarI2.f7003s;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i12++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            aVarI = I(iMin);
                            if (aVarI == null) {
                                break;
                                break;
                            }
                            view = aVarI.f7003s;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i13 = d3.f2235n;
                    if (i13 != -1 && (viewFindViewById = view4.findViewById(i13)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        d3.f2234m = -1L;
        d3.f2233l = -1;
        d3.f2235n = -1;
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        w wVar = this.f6928F;
        if (wVar == null || this.P) {
            return;
        }
        boolean zE = wVar.e();
        boolean zF = this.f6928F.f();
        if (zE || zF) {
            if (!zE) {
                i10 = 0;
            }
            if (!zF) {
                i11 = 0;
            }
            e0(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!P()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f6951R |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(J0.I i10) {
        this.f6931G0 = i10;
        U.n(this, i10);
    }

    public void setAdapter(s sVar) {
        setLayoutFrozen(false);
        s sVar2 = this.f6926E;
        C c10 = this.f6976t;
        if (sVar2 != null) {
            sVar2.a.unregisterObserver(c10);
            this.f6926E.g(this);
        }
        u uVar = this.f6963h0;
        if (uVar != null) {
            uVar.e();
        }
        w wVar = this.f6928F;
        A a10 = this.f6978u;
        if (wVar != null) {
            wVar.q0(a10);
            this.f6928F.r0(a10);
        }
        a10.a.clear();
        a10.f();
        C0528a c0528a = this.f6982w;
        c0528a.k(c0528a.f7047b);
        c0528a.k(c0528a.f7048c);
        c0528a.f7051f = 0;
        s sVar3 = this.f6926E;
        this.f6926E = sVar;
        if (sVar != null) {
            sVar.a.registerObserver(c10);
            sVar.d(this);
        }
        w wVar2 = this.f6928F;
        if (wVar2 != null) {
            wVar2.V();
        }
        s sVar4 = this.f6926E;
        a10.a.clear();
        a10.f();
        a10.e(sVar3, true);
        z zVarC = a10.c();
        if (sVar3 != null) {
            zVarC.f7142b--;
        }
        if (zVarC.f7142b == 0) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = zVarC.a;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                y yVar = (y) sparseArray.valueAt(i10);
                Iterator it = yVar.a.iterator();
                while (it.hasNext()) {
                    com.bumptech.glide.c.b(((a) it.next()).f7003s);
                }
                yVar.a.clear();
                i10++;
            }
        }
        if (sVar4 != null) {
            zVarC.f7142b++;
        }
        a10.d();
        this.f6989z0.f2228f = true;
        Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(J0.v vVar) {
        if (vVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z6) {
        if (z6 != this.f6988z) {
            this.f6962g0 = null;
            this.f6961e0 = null;
            this.f0 = null;
            this.f6960d0 = null;
        }
        this.f6988z = z6;
        super.setClipToPadding(z6);
        if (this.f6942M) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(J0.w wVar) {
        wVar.getClass();
        this.c0 = wVar;
        this.f6962g0 = null;
        this.f6961e0 = null;
        this.f0 = null;
        this.f6960d0 = null;
    }

    public void setHasFixedSize(boolean z6) {
        this.f6940L = z6;
    }

    public void setItemAnimator(u uVar) {
        u uVar2 = this.f6963h0;
        if (uVar2 != null) {
            uVar2.e();
            this.f6963h0.a = null;
        }
        this.f6963h0 = uVar;
        if (uVar != null) {
            uVar.a = this.f6927E0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        A a10 = this.f6978u;
        a10.f6877e = i10;
        a10.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z6) {
        suppressLayout(z6);
    }

    public void setLayoutManager(w wVar) {
        RecyclerView recyclerView;
        C0263m c0263m;
        if (wVar == this.f6928F) {
            return;
        }
        setScrollState(0);
        J0.G g8 = this.f6983w0;
        g8.f2242y.removeCallbacks(g8);
        g8.f2238u.abortAnimation();
        w wVar2 = this.f6928F;
        if (wVar2 != null && (c0263m = wVar2.f7124e) != null) {
            c0263m.i();
        }
        w wVar3 = this.f6928F;
        A a10 = this.f6978u;
        if (wVar3 != null) {
            u uVar = this.f6963h0;
            if (uVar != null) {
                uVar.e();
            }
            this.f6928F.q0(a10);
            this.f6928F.r0(a10);
            a10.a.clear();
            a10.f();
            if (this.f6938K) {
                w wVar4 = this.f6928F;
                wVar4.f7126g = false;
                wVar4.X(this);
            }
            this.f6928F.C0(null);
            this.f6928F = null;
        } else {
            a10.a.clear();
            a10.f();
        }
        C0529b c0529b = this.f6984x;
        c0529b.f7052b.g();
        ArrayList arrayList = c0529b.f7053c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = c0529b.a.a;
            if (size < 0) {
                break;
            }
            a aVarM = M((View) arrayList.get(size));
            if (aVarM != null) {
                int i10 = aVarM.f6999H;
                if (recyclerView.P()) {
                    aVarM.f7000I = i10;
                    recyclerView.f6943M0.add(aVarM);
                } else {
                    View view = aVarM.f7003s;
                    WeakHashMap weakHashMap = U.a;
                    view.setImportantForAccessibility(i10);
                }
                aVarM.f6999H = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f6928F = wVar;
        if (wVar != null) {
            if (wVar.f7121b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(wVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(E0.a.f(wVar.f7121b, sb));
            }
            wVar.C0(this);
            if (this.f6938K) {
                w wVar5 = this.f6928F;
                wVar5.f7126g = true;
                wVar5.W(this);
            }
        }
        a10.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        C0429o scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f4833d) {
            WeakHashMap weakHashMap = U.a;
            U.H.z(scrollingChildHelper.f4832c);
        }
        scrollingChildHelper.f4833d = z6;
    }

    public void setOnFlingListener(J0.z zVar) {
        this.f6972q0 = zVar;
    }

    @Deprecated
    public void setOnScrollListener(J0.A a10) {
        this.f6919A0 = a10;
    }

    public void setPreserveFocusAfterLayout(boolean z6) {
        this.f6981v0 = z6;
    }

    public void setRecycledViewPool(z zVar) {
        A a10 = this.f6978u;
        RecyclerView recyclerView = a10.f6880h;
        a10.e(recyclerView.f6926E, false);
        z zVar2 = a10.f6879g;
        if (zVar2 != null) {
            zVar2.f7142b--;
        }
        a10.f6879g = zVar;
        if (zVar != null && recyclerView.getAdapter() != null) {
            a10.f6879g.f7142b++;
        }
        a10.d();
    }

    @Deprecated
    public void setRecyclerListener(B b3) {
    }

    public void setScrollState(int i10) {
        C0263m c0263m;
        if (i10 == this.f6964i0) {
            return;
        }
        if (f6911T0) {
            new Exception();
        }
        this.f6964i0 = i10;
        if (i10 != 2) {
            J0.G g8 = this.f6983w0;
            g8.f2242y.removeCallbacks(g8);
            g8.f2238u.abortAnimation();
            w wVar = this.f6928F;
            if (wVar != null && (c0263m = wVar.f7124e) != null) {
                c0263m.i();
            }
        }
        w wVar2 = this.f6928F;
        if (wVar2 != null) {
            wVar2.n0(i10);
        }
        J0.A a10 = this.f6919A0;
        if (a10 != null) {
            a10.a(this, i10);
        }
        ArrayList arrayList = this.f6921B0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((J0.A) this.f6921B0.get(size)).a(this, i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f6971p0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f6971p0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(J0.F f10) {
        this.f6978u.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z6) {
        C0263m c0263m;
        if (z6 != this.P) {
            k("Do not suppressLayout in layout or scroll");
            if (!z6) {
                this.P = false;
                if (this.f6946O && this.f6928F != null && this.f6926E != null) {
                    requestLayout();
                }
                this.f6946O = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.P = true;
            this.f6949Q = true;
            setScrollState(0);
            J0.G g8 = this.f6983w0;
            g8.f2242y.removeCallbacks(g8);
            g8.f2238u.abortAnimation();
            w wVar = this.f6928F;
            if (wVar == null || (c0263m = wVar.f7124e) == null) {
                return;
            }
            c0263m.i();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    public final void t() {
        int iJ;
        P p10;
        View viewE;
        J0.D d3 = this.f6989z0;
        d3.a(1);
        D(d3);
        d3.f2231i = false;
        j0();
        I i10 = this.f6986y;
        i10.a.clear();
        p212w.g gVar = i10.f6891b;
        gVar.c();
        T();
        X();
        a aVarL = null;
        View focusedChild = (this.f6981v0 && hasFocus() && this.f6926E != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewE = E(focusedChild)) != null) {
            aVarL = L(viewE);
        }
        if (aVarL == null) {
            d3.f2234m = -1L;
            d3.f2233l = -1;
            d3.f2235n = -1;
        } else {
            d3.f2234m = this.f6926E.f7113b ? aVarL.f7007w : -1L;
            if (this.f6956V) {
                iJ = -1;
            } else if (aVarL.j()) {
                iJ = aVarL.f7006v;
            } else {
                RecyclerView recyclerView = aVarL.f7001J;
                if (recyclerView == null) {
                    iJ = -1;
                } else {
                    iJ = recyclerView.J(aVarL);
                }
            }
            d3.f2233l = iJ;
            View focusedChild2 = aVarL.f7003s;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            d3.f2235n = id;
        }
        d3.f2230h = d3.j && this.f6925D0;
        this.f6925D0 = false;
        this.f6923C0 = false;
        d3.f2229g = d3.f2232k;
        d3.f2227e = this.f6926E.a();
        G(this.f6933H0);
        boolean z6 = d3.j;
        p212w.i iVar = i10.a;
        if (z6) {
            int iE = this.f6984x.e();
            for (int i11 = 0; i11 < iE; i11++) {
                a aVarM = M(this.f6984x.d(i11));
                if (!aVarM.q() && (!aVarM.h() || this.f6926E.f7113b)) {
                    u uVar = this.f6963h0;
                    u.b(aVarM);
                    aVarM.e();
                    uVar.getClass();
                    t tVar = new t();
                    tVar.a(aVarM);
                    P pA = (P) iVar.get(aVarM);
                    if (pA == null) {
                        pA = P.a();
                        iVar.put(aVarM, pA);
                    }
                    pA.f2266b = tVar;
                    pA.a |= 4;
                    if (d3.f2230h && aVarM.m() && !aVarM.j() && !aVarM.q() && !aVarM.h()) {
                        gVar.j(K(aVarM), aVarM);
                    }
                }
            }
        }
        if (d3.f2232k) {
            int iH = this.f6984x.h();
            for (int i12 = 0; i12 < iH; i12++) {
                a aVarM2 = M(this.f6984x.g(i12));
                if (f6910S0 && aVarM2.f7005u == -1 && !aVarM2.j()) {
                    throw new IllegalStateException(E0.a.f(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!aVarM2.q() && aVarM2.f7006v == -1) {
                    aVarM2.f7006v = aVarM2.f7005u;
                }
            }
            boolean z10 = d3.f2228f;
            d3.f2228f = false;
            this.f6928F.j0(this.f6978u, d3);
            d3.f2228f = z10;
            for (int i13 = 0; i13 < this.f6984x.e(); i13++) {
                a aVarM3 = M(this.f6984x.d(i13));
                if (!aVarM3.q() && ((p10 = (P) iVar.get(aVarM3)) == null || (p10.a & 4) == 0)) {
                    u.b(aVarM3);
                    boolean z11 = (aVarM3.f6993B & 8192) != 0;
                    u uVar2 = this.f6963h0;
                    aVarM3.e();
                    uVar2.getClass();
                    t tVar2 = new t();
                    tVar2.a(aVarM3);
                    if (z11) {
                        Z(aVarM3, tVar2);
                    } else {
                        P pA2 = (P) iVar.get(aVarM3);
                        if (pA2 == null) {
                            pA2 = P.a();
                            iVar.put(aVarM3, pA2);
                        }
                        pA2.a |= 2;
                        pA2.f2266b = tVar2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        U(true);
        k0(false);
        d3.f2226d = 2;
    }

    public final void u() {
        j0();
        T();
        J0.D d3 = this.f6989z0;
        d3.a(6);
        this.f6982w.c();
        d3.f2227e = this.f6926E.a();
        d3.f2225c = 0;
        if (this.f6980v != null) {
            s sVar = this.f6926E;
            int iD = p239z.e.d(sVar.f7114c);
            if (iD == 1 ? sVar.a() > 0 : iD != 2) {
                Parcelable parcelable = this.f6980v.f6990u;
                if (parcelable != null) {
                    this.f6928F.l0(parcelable);
                }
                this.f6980v = null;
            }
        }
        d3.f2229g = false;
        this.f6928F.j0(this.f6978u, d3);
        d3.f2228f = false;
        d3.j = d3.j && this.f6963h0 != null;
        d3.f2226d = 4;
        U(true);
        k0(false);
    }

    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void w(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().d(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void x(int i10, int i11) {
        this.f6959b0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        J0.A a10 = this.f6919A0;
        if (a10 != null) {
            a10.b(this, i10, i11);
        }
        ArrayList arrayList = this.f6921B0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((J0.A) this.f6921B0.get(size)).b(this, i10, i11);
            }
        }
        this.f6959b0--;
    }

    public final void y() {
        if (this.f6962g0 != null) {
            return;
        }
        ((J0.E) this.c0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f6962g0 = edgeEffect;
        if (this.f6988z) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.f6960d0 != null) {
            return;
        }
        ((J0.E) this.c0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f6960d0 = edgeEffect;
        if (this.f6988z) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        float fA;
        int i11;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i10);
        int i12 = 1;
        this.f6976t = new C(this);
        this.f6978u = new A(this);
        this.f6986y = new I();
        this.f6918A = new J0.r(this, 0);
        this.f6920B = new Rect();
        this.f6922C = new Rect();
        this.f6924D = new RectF();
        this.f6930G = new ArrayList();
        this.f6932H = new ArrayList();
        this.f6934I = new ArrayList();
        this.f6944N = 0;
        this.f6956V = false;
        this.f6957W = false;
        this.f6958a0 = 0;
        this.f6959b0 = 0;
        this.c0 = f6917b1;
        l lVar = new l();
        lVar.a = null;
        lVar.f7116b = new ArrayList();
        lVar.f7117c = 120L;
        lVar.f7118d = 120L;
        lVar.f7119e = 250L;
        lVar.f7120f = 250L;
        lVar.f6881g = true;
        lVar.f7087h = new ArrayList();
        lVar.f7088i = new ArrayList();
        lVar.j = new ArrayList();
        lVar.f7089k = new ArrayList();
        lVar.f7090l = new ArrayList();
        lVar.f7091m = new ArrayList();
        lVar.f7092n = new ArrayList();
        lVar.f7093o = new ArrayList();
        lVar.f7094p = new ArrayList();
        lVar.f7095q = new ArrayList();
        lVar.f7096r = new ArrayList();
        this.f6963h0 = lVar;
        this.f6964i0 = 0;
        this.f6965j0 = -1;
        this.f6977t0 = Float.MIN_VALUE;
        this.f6979u0 = Float.MIN_VALUE;
        this.f6981v0 = true;
        this.f6983w0 = new J0.G(this);
        this.f6987y0 = Y0 ? new C0256f() : null;
        J0.D d3 = new J0.D();
        d3.a = -1;
        d3.f2224b = 0;
        d3.f2225c = 0;
        d3.f2226d = 1;
        d3.f2227e = 0;
        d3.f2228f = false;
        d3.f2229g = false;
        d3.f2230h = false;
        d3.f2231i = false;
        d3.j = false;
        d3.f2232k = false;
        this.f6989z0 = d3;
        this.f6923C0 = false;
        this.f6925D0 = false;
        v vVar = new v(this);
        this.f6927E0 = vVar;
        this.f6929F0 = false;
        this.f6933H0 = new int[2];
        this.f6937J0 = new int[2];
        this.f6939K0 = new int[2];
        this.f6941L0 = new int[2];
        this.f6943M0 = new ArrayList();
        this.f6945N0 = new J0.r(this, i12);
        this.f6948P0 = 0;
        this.f6950Q0 = 0;
        this.f6952R0 = new p(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f6971p0 = viewConfiguration.getScaledTouchSlop();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            Method method = Y.a;
            fA = V.a(viewConfiguration);
        } else {
            fA = Y.a(viewConfiguration, context);
        }
        this.f6977t0 = fA;
        this.f6979u0 = i13 >= 26 ? V.b(viewConfiguration) : Y.a(viewConfiguration, context);
        this.f6973r0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6975s0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6974s = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f6963h0.a = vVar;
        this.f6982w = new C0528a(new r(this));
        this.f6984x = new C0529b(new q(this));
        WeakHashMap weakHashMap = U.a;
        if ((i13 >= 26 ? K.c(this) : 0) == 0 && i13 >= 26) {
            K.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f6954T = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new J0.I(this));
        int[] iArr = I0.a.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        U.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f6988z = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(E0.a.f(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            i11 = 4;
            new C0255e(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.kcstream.cing.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.kcstream.cing.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.kcstream.cing.R.dimen.fastscroll_margin));
        } else {
            i11 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(w.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f6915Z0);
                        objArr = new Object[i11];
                        objArr[0] = context;
                        objArr[i12] = attributeSet;
                        objArr[2] = Integer.valueOf(i10);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = clsAsSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((w) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e16);
                }
            }
        }
        int[] iArr2 = U0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        U.m(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10);
        boolean z6 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z6);
        setTag(com.kcstream.cing.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        w wVar = this.f6928F;
        if (wVar != null) {
            return wVar.u(layoutParams);
        }
        throw new IllegalStateException(E0.a.f(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
