package p;

import C0.C0172b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class A0 implements p136o.B {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Method f13899S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final Method f13900T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final Method f13901U;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f13902A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f13903B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f13904C;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public O6.a f13907F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public View f13908G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public AdapterView.OnItemClickListener f13909H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f13910I;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Handler f13915N;
    public Rect P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f13917Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final C0736x f13918R;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f13919s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ListAdapter f13920t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0722p0 f13921u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13924x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13925y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f13922v = -2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13923w = -2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f13926z = 1002;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f13905D = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f13906E = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final RunnableC0737x0 f13911J = new RunnableC0737x0(this, 1);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final ViewOnTouchListenerC0741z0 f13912K = new ViewOnTouchListenerC0741z0(this);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C0739y0 f13913L = new C0739y0(this);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final RunnableC0737x0 f13914M = new RunnableC0737x0(this, 0);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Rect f13916O = new Rect();

    static {
        int i10 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i10 <= 28) {
            try {
                f13899S = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f13901U = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f13900T = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public A0(Context context, AttributeSet attributeSet, int i10) {
        int resourceId;
        this.f13919s = context;
        this.f13915N = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p069h.a.f11623p, i10, 0);
        this.f13924x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f13925y = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f13902A = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0736x c0736x = new C0736x(context, attributeSet, i10, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p069h.a.f11627t, i10, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            p000a0.k.c(c0736x, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0736x.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : p068ga.l.g(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f13918R = c0736x;
        c0736x.setInputMethodMode(1);
    }

    @Override // p136o.B
    public final void a() {
        int i10;
        int iA;
        int iMakeMeasureSpec;
        int paddingBottom;
        C0722p0 c0722p0;
        int i11 = 1;
        C0722p0 c0722p1 = this.f13921u;
        C0736x c0736x = this.f13918R;
        Context context = this.f13919s;
        if (c0722p1 == null) {
            C0722p0 c0722p0Q = q(context, !this.f13917Q);
            this.f13921u = c0722p0Q;
            c0722p0Q.setAdapter(this.f13920t);
            this.f13921u.setOnItemClickListener(this.f13909H);
            this.f13921u.setFocusable(true);
            this.f13921u.setFocusableInTouchMode(true);
            this.f13921u.setOnItemSelectedListener(new C0172b(this, i11));
            this.f13921u.setOnScrollListener(this.f13913L);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f13910I;
            if (onItemSelectedListener != null) {
                this.f13921u.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0736x.setContentView(this.f13921u);
        }
        Drawable background = c0736x.getBackground();
        Rect rect = this.f13916O;
        if (background != null) {
            background.getPadding(rect);
            int i12 = rect.top;
            i10 = rect.bottom + i12;
            if (!this.f13902A) {
                this.f13925y = -i12;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        boolean z6 = c0736x.getInputMethodMode() == 2;
        View view = this.f13908G;
        int i13 = this.f13925y;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f13900T;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(c0736x, view, Integer.valueOf(i13), Boolean.valueOf(z6))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    iA = c0736x.getMaxAvailableHeight(view, i13);
                }
            } else {
                iA = c0736x.getMaxAvailableHeight(view, i13);
            }
        } else {
            iA = AbstractC0733v0.a(c0736x, view, i13, z6);
        }
        int i14 = this.f13922v;
        if (i14 == -1) {
            paddingBottom = iA + i10;
        } else {
            int i15 = this.f13923w;
            if (i15 != -2) {
                iMakeMeasureSpec = i15 != -1 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.f13921u.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f13921u.getPaddingBottom() + this.f13921u.getPaddingTop() + i10 : 0);
        }
        boolean z10 = this.f13918R.getInputMethodMode() == 2;
        p000a0.k.d(c0736x, this.f13926z);
        if (c0736x.isShowing()) {
            if (this.f13908G.isAttachedToWindow()) {
                int width = this.f13923w;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f13908G.getWidth();
                }
                if (i14 == -1) {
                    i14 = z10 ? paddingBottom : -1;
                    if (z10) {
                        c0736x.setWidth(this.f13923w == -1 ? -1 : 0);
                        c0736x.setHeight(0);
                    } else {
                        c0736x.setWidth(this.f13923w == -1 ? -1 : 0);
                        c0736x.setHeight(-1);
                    }
                } else if (i14 == -2) {
                    i14 = paddingBottom;
                }
                c0736x.setOutsideTouchable(true);
                int i16 = width;
                View view2 = this.f13908G;
                int i17 = this.f13924x;
                int i18 = this.f13925y;
                if (i16 < 0) {
                    i16 = -1;
                }
                c0736x.update(view2, i17, i18, i16, i14 < 0 ? -1 : i14);
                return;
            }
            return;
        }
        int width2 = this.f13923w;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f13908G.getWidth();
        }
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = paddingBottom;
        }
        c0736x.setWidth(width2);
        c0736x.setHeight(i14);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f13899S;
            if (method2 != null) {
                try {
                    method2.invoke(c0736x, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0735w0.b(c0736x, true);
        }
        c0736x.setOutsideTouchable(true);
        c0736x.setTouchInterceptor(this.f13912K);
        if (this.f13904C) {
            p000a0.k.c(c0736x, this.f13903B);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f13901U;
            if (method3 != null) {
                try {
                    method3.invoke(c0736x, this.P);
                } catch (Exception unused3) {
                }
            }
        } else {
            AbstractC0735w0.a(c0736x, this.P);
        }
        c0736x.showAsDropDown(this.f13908G, this.f13924x, this.f13925y, this.f13905D);
        this.f13921u.setSelection(-1);
        if ((!this.f13917Q || this.f13921u.isInTouchMode()) && (c0722p0 = this.f13921u) != null) {
            c0722p0.setListSelectionHidden(true);
            c0722p0.requestLayout();
        }
        if (this.f13917Q) {
            return;
        }
        this.f13915N.post(this.f13914M);
    }

    @Override // p136o.B
    public final boolean b() {
        return this.f13918R.isShowing();
    }

    public final int c() {
        return this.f13924x;
    }

    @Override // p136o.B
    public final void dismiss() {
        C0736x c0736x = this.f13918R;
        c0736x.dismiss();
        c0736x.setContentView(null);
        this.f13921u = null;
        this.f13915N.removeCallbacks(this.f13911J);
    }

    public final Drawable e() {
        return this.f13918R.getBackground();
    }

    @Override // p136o.B
    public final C0722p0 f() {
        return this.f13921u;
    }

    public final void h(Drawable drawable) {
        this.f13918R.setBackgroundDrawable(drawable);
    }

    public final void i(int i10) {
        this.f13925y = i10;
        this.f13902A = true;
    }

    public final void k(int i10) {
        this.f13924x = i10;
    }

    public final int m() {
        if (this.f13902A) {
            return this.f13925y;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        O6.a aVar = this.f13907F;
        if (aVar == null) {
            this.f13907F = new O6.a(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f13920t;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(aVar);
            }
        }
        this.f13920t = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f13907F);
        }
        C0722p0 c0722p0 = this.f13921u;
        if (c0722p0 != null) {
            c0722p0.setAdapter(this.f13920t);
        }
    }

    public C0722p0 q(Context context, boolean z6) {
        return new C0722p0(context, z6);
    }

    public final void r(int i10) {
        Drawable background = this.f13918R.getBackground();
        if (background == null) {
            this.f13923w = i10;
            return;
        }
        Rect rect = this.f13916O;
        background.getPadding(rect);
        this.f13923w = rect.left + rect.right + i10;
    }
}
