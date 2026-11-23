package androidx.appcompat.widget;

import A1.C0099h;
import A1.J;
import U.InterfaceC0426l;
import U.U;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.customview.view.AbsSavedState;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p.C0732v;
import p.InterfaceC0704g0;
import p.K0;
import p.Q0;
import p.R0;
import p.S0;
import p.T0;
import p.U0;
import p.V0;
import p.X;
import p.X0;
import p.f1;
import p102k7.e;
import p125n.g;
import p136o.l;
import p136o.n;
import p156q0.E;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0426l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f6204A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Context f6205B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f6206C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f6207D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f6208E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f6209F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f6210G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f6211H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f6212I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f6213J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f6214K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public K0 f6215L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f6216M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f6217N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f6218O;
    public CharSequence P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public CharSequence f6219Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ColorStateList f6220R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ColorStateList f6221S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f6222T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f6223U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final ArrayList f6224V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final ArrayList f6225W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int[] f6226a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final C0099h f6227b0;
    public ArrayList c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public V0 f6228d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final e f6229e0;
    public X0 f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public b f6230g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public T0 f6231h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public J f6232i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public P0.d f6233j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f6234k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public OnBackInvokedCallback f6235l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public OnBackInvokedDispatcher f6236m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f6237n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final p122m7.d f6238o0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ActionMenuView f6239s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public X f6240t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public X f6241u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AppCompatImageButton f6242v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0732v f6243w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Drawable f6244x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f6245y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AppCompatImageButton f6246z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new d();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f6247u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f6248v;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6247u = parcel.readInt();
            this.f6248v = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6247u);
            parcel.writeInt(this.f6248v ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new g(getContext());
    }

    public static U0 h() {
        U0 u3 = new U0(-2, -2);
        u3.f13996b = 0;
        u3.a = 8388627;
        return u3;
    }

    public static U0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z6 = layoutParams instanceof U0;
        if (z6) {
            U0 u3 = (U0) layoutParams;
            U0 u10 = new U0(u3);
            u10.f13996b = 0;
            u10.f13996b = u3.f13996b;
            return u10;
        }
        if (z6) {
            U0 u11 = new U0((U0) layoutParams);
            u11.f13996b = 0;
            return u11;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            U0 u12 = new U0(layoutParams);
            u12.f13996b = 0;
            return u12;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        U0 u13 = new U0(marginLayoutParams);
        u13.f13996b = 0;
        ((ViewGroup.MarginLayoutParams) u13).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) u13).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) u13).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) u13).bottomMargin = marginLayoutParams.bottomMargin;
        return u13;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z6 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        arrayList.clear();
        if (!z6) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                U0 u3 = (U0) childAt.getLayoutParams();
                if (u3.f13996b == 0 && u(childAt)) {
                    int i12 = u3.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            U0 u10 = (U0) childAt2.getLayoutParams();
            if (u10.f13996b == 0 && u(childAt2)) {
                int i14 = u10.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z6) {
        U0 u0I;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            u0I = h();
        } else {
            u0I = !checkLayoutParams(layoutParams) ? i(layoutParams) : (U0) layoutParams;
        }
        u0I.f13996b = 1;
        if (!z6 || this.f6204A == null) {
            addView(view, u0I);
        } else {
            view.setLayoutParams(u0I);
            this.f6225W.add(view);
        }
    }

    public final void c() {
        if (this.f6246z == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f6246z = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f6244x);
            this.f6246z.setContentDescription(this.f6245y);
            U0 u0H = h();
            u0H.a = (this.f6209F & 112) | 8388611;
            u0H.f13996b = 2;
            this.f6246z.setLayoutParams(u0H);
            this.f6246z.setOnClickListener(new R0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof U0);
    }

    public final void d() {
        if (this.f6215L == null) {
            K0 k3 = new K0();
            k3.a = 0;
            k3.f13963b = 0;
            k3.f13964c = Integer.MIN_VALUE;
            k3.f13965d = Integer.MIN_VALUE;
            k3.f13966e = 0;
            k3.f13967f = 0;
            k3.f13968g = false;
            k3.f13969h = false;
            this.f6215L = k3;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f6239s;
        if (actionMenuView.f6129H == null) {
            l lVar = (l) actionMenuView.getMenu();
            if (this.f6231h0 == null) {
                this.f6231h0 = new T0(this);
            }
            this.f6239s.setExpandedActionViewsExclusive(true);
            lVar.b(this.f6231h0, this.f6205B);
            w();
        }
    }

    public final void f() {
        if (this.f6239s == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f6239s = actionMenuView;
            actionMenuView.setPopupTheme(this.f6206C);
            this.f6239s.setOnMenuItemClickListener(this.f6229e0);
            ActionMenuView actionMenuView2 = this.f6239s;
            J j = this.f6232i0;
            I4.d dVar = new I4.d(this);
            actionMenuView2.f6134M = j;
            actionMenuView2.f6135N = dVar;
            U0 u0H = h();
            u0H.a = (this.f6209F & 112) | 8388613;
            this.f6239s.setLayoutParams(u0H);
            b(this.f6239s, false);
        }
    }

    public final void g() {
        if (this.f6242v == null) {
            this.f6242v = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            U0 u0H = h();
            u0H.a = (this.f6209F & 112) | 8388611;
            this.f6242v.setLayoutParams(u0H);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f6246z;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f6246z;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        K0 k3 = this.f6215L;
        if (k3 != null) {
            return k3.f13968g ? k3.a : k3.f13963b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f6217N;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        K0 k3 = this.f6215L;
        if (k3 != null) {
            return k3.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        K0 k3 = this.f6215L;
        if (k3 != null) {
            return k3.f13963b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        K0 k3 = this.f6215L;
        if (k3 != null) {
            return k3.f13968g ? k3.f13963b : k3.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f6216M;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        l lVar;
        ActionMenuView actionMenuView = this.f6239s;
        return (actionMenuView == null || (lVar = actionMenuView.f6129H) == null || !lVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f6217N, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f6216M, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0732v c0732v = this.f6243w;
        if (c0732v != null) {
            return c0732v.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0732v c0732v = this.f6243w;
        if (c0732v != null) {
            return c0732v.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f6239s.getMenu();
    }

    public View getNavButtonView() {
        return this.f6242v;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f6242v;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f6242v;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public b getOuterActionMenuPresenter() {
        return this.f6230g0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f6239s.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f6205B;
    }

    public int getPopupTheme() {
        return this.f6206C;
    }

    public CharSequence getSubtitle() {
        return this.f6219Q;
    }

    public final TextView getSubtitleTextView() {
        return this.f6241u;
    }

    public CharSequence getTitle() {
        return this.P;
    }

    public int getTitleMarginBottom() {
        return this.f6214K;
    }

    public int getTitleMarginEnd() {
        return this.f6212I;
    }

    public int getTitleMarginStart() {
        return this.f6211H;
    }

    public int getTitleMarginTop() {
        return this.f6213J;
    }

    public final TextView getTitleTextView() {
        return this.f6240t;
    }

    public InterfaceC0704g0 getWrapper() {
        if (this.f0 == null) {
            this.f0 = new X0(this, true);
        }
        return this.f0;
    }

    public final int j(View view, int i10) {
        U0 u3 = (U0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = u3.a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.f6218O & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) u3).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) u3).topMargin;
        if (iMax < i13) {
            iMax = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) u3).bottomMargin;
            if (i14 < i15) {
                iMax = Math.max(0, iMax - (i15 - i14));
            }
        }
        return paddingTop + iMax;
    }

    public void m(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public final void n() {
        Iterator it = this.c0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f6227b0.f104u).iterator();
        while (it2.hasNext()) {
            ((E) it2.next()).a.k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.c0 = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f6225W.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f6238o0);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f6223U = false;
        }
        if (!this.f6223U) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f6223U = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f6223U = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027d  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c8 A[LOOP:2: B:108:0x02c6->B:109:0x02c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x030b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x030d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0311  */
    /* JADX WARN: Code duplicated, block: B:118:0x0318 A[LOOP:3: B:117:0x0316->B:118:0x0318, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210  */
    /* JADX WARN: Code duplicated, block: B:88:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x0255  */
    /* JADX WARN: Code duplicated, block: B:97:0x0258  */
    /* JADX WARN: Code duplicated, block: B:98:0x027a  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int iQ;
        int iR;
        int iMax;
        int iMin;
        boolean zU;
        boolean zU2;
        int measuredHeight;
        X x8;
        X x10;
        U0 u3;
        U0 u10;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iMax2;
        int i23;
        int i24;
        int i25;
        int i26;
        ArrayList arrayList;
        int size;
        int iQ2;
        int i27;
        int size2;
        int i28;
        int size3;
        int i29;
        int i30;
        int i31;
        int measuredWidth;
        int i32;
        int i33;
        int i34;
        int size4;
        boolean z11 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i35 = width - paddingRight;
        int[] iArr = this.f6226a0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = U.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i13 - i11) : 0;
        if (u(this.f6242v)) {
            if (z11) {
                iR = r(this.f6242v, i35, iMin2, iArr);
                iQ = paddingLeft;
            } else {
                iQ = q(this.f6242v, paddingLeft, iMin2, iArr);
            }
            if (u(this.f6246z)) {
                if (z11) {
                    iR = r(this.f6246z, iR, iMin2, iArr);
                } else {
                    iQ = q(this.f6246z, iQ, iMin2, iArr);
                }
            }
            if (u(this.f6239s)) {
                if (z11) {
                    iQ = q(this.f6239s, iQ, iMin2, iArr);
                } else {
                    iR = r(this.f6239s, iR, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iQ);
            iArr[1] = Math.max(0, currentContentInsetRight - (i35 - iR));
            iMax = Math.max(iQ, currentContentInsetLeft);
            iMin = Math.min(iR, i35 - currentContentInsetRight);
            if (u(this.f6204A)) {
                if (z11) {
                    iMin = r(this.f6204A, iMin, iMin2, iArr);
                } else {
                    iMax = q(this.f6204A, iMax, iMin2, iArr);
                }
            }
            if (u(this.f6243w)) {
                if (z11) {
                    iMin = r(this.f6243w, iMin, iMin2, iArr);
                } else {
                    iMax = q(this.f6243w, iMax, iMin2, iArr);
                }
            }
            zU = u(this.f6240t);
            zU2 = u(this.f6241u);
            if (zU) {
                U0 u11 = (U0) this.f6240t.getLayoutParams();
                measuredHeight = this.f6240t.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u11).topMargin + ((ViewGroup.MarginLayoutParams) u11).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zU2) {
                U0 u12 = (U0) this.f6241u.getLayoutParams();
                measuredHeight = this.f6241u.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u12).topMargin + ((ViewGroup.MarginLayoutParams) u12).bottomMargin + measuredHeight;
            }
            if (zU || zU2) {
                if (zU) {
                    x8 = this.f6240t;
                } else {
                    x8 = this.f6241u;
                }
                if (zU2) {
                    x10 = this.f6241u;
                } else {
                    x10 = this.f6240t;
                }
                u3 = (U0) x8.getLayoutParams();
                u10 = (U0) x10.getLayoutParams();
                i14 = measuredHeight;
                z10 = (!zU && this.f6240t.getMeasuredWidth() > 0) || (zU2 && this.f6241u.getMeasuredWidth() > 0);
                i15 = this.f6218O & 112;
                i16 = iMax;
                if (i15 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) u3).topMargin + this.f6213J;
                } else if (i15 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                    i23 = ((ViewGroup.MarginLayoutParams) u3).topMargin + this.f6213J;
                    if (iMax2 < i23) {
                        iMax2 = i23;
                    } else {
                        i24 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                        i25 = ((ViewGroup.MarginLayoutParams) u3).bottomMargin;
                        i26 = this.f6214K;
                        if (i24 < i25 + i26) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) u10).bottomMargin + i26) - i24));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) u10).bottomMargin) - this.f6214K) - i14;
                }
                if (z11) {
                    if (z10) {
                        i20 = this.f6211H;
                    } else {
                        i20 = 0;
                    }
                    int i36 = i20 - iArr[1];
                    iMin -= Math.max(0, i36);
                    iArr[1] = Math.max(0, -i36);
                    if (zU) {
                        U0 u13 = (U0) this.f6240t.getLayoutParams();
                        int measuredWidth2 = iMin - this.f6240t.getMeasuredWidth();
                        int measuredHeight2 = this.f6240t.getMeasuredHeight() + paddingTop;
                        this.f6240t.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i21 = measuredWidth2 - this.f6212I;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) u13).bottomMargin;
                    } else {
                        i21 = iMin;
                    }
                    if (zU2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.f6241u.getLayoutParams())).topMargin;
                        this.f6241u.layout(iMin - this.f6241u.getMeasuredWidth(), i37, iMin, this.f6241u.getMeasuredHeight() + i37);
                        i22 = iMin - this.f6212I;
                    } else {
                        i22 = iMin;
                    }
                    if (z10) {
                        iMin = Math.min(i21, i22);
                    }
                    iMax = i16;
                } else {
                    if (z10) {
                        i17 = this.f6211H;
                    } else {
                        i17 = 0;
                    }
                    int i38 = i17 - iArr[0];
                    iMax = Math.max(0, i38) + i16;
                    iArr[0] = Math.max(0, -i38);
                    if (zU) {
                        U0 u14 = (U0) this.f6240t.getLayoutParams();
                        int measuredWidth3 = this.f6240t.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f6240t.getMeasuredHeight() + paddingTop;
                        this.f6240t.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i18 = measuredWidth3 + this.f6212I;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) u14).bottomMargin;
                    } else {
                        i18 = iMax;
                    }
                    if (zU2) {
                        int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.f6241u.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f6241u.getMeasuredWidth() + iMax;
                        this.f6241u.layout(iMax, i39, measuredWidth4, this.f6241u.getMeasuredHeight() + i39);
                        i19 = measuredWidth4 + this.f6212I;
                    } else {
                        i19 = iMax;
                    }
                    if (z10) {
                        iMax = Math.max(i18, i19);
                    }
                }
            }
            arrayList = this.f6224V;
            a(3, arrayList);
            size = arrayList.size();
            iQ2 = iMax;
            for (i27 = 0; i27 < size; i27++) {
                iQ2 = q((View) arrayList.get(i27), iQ2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i28 = 0; i28 < size2; i28++) {
                iMin = r((View) arrayList.get(i28), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i40 = iArr[0];
            int i41 = iArr[1];
            size3 = arrayList.size();
            i29 = i41;
            i30 = i40;
            i31 = 0;
            measuredWidth = 0;
            while (i31 < size3) {
                View view = (View) arrayList.get(i31);
                U0 u15 = (U0) view.getLayoutParams();
                int i42 = i31;
                int i43 = ((ViewGroup.MarginLayoutParams) u15).leftMargin - i30;
                int i44 = ((ViewGroup.MarginLayoutParams) u15).rightMargin - i29;
                int iMax3 = Math.max(0, i43);
                int iMax4 = Math.max(0, i44);
                int iMax5 = Math.max(0, -i43);
                int iMax6 = Math.max(0, -i44);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i29 = iMax6;
                i30 = iMax5;
                i31 = i42 + 1;
            }
            i33 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i34 = measuredWidth + i33;
            if (i33 >= iQ2) {
                if (i34 > iMin) {
                    iQ2 = i33 - (i34 - iMin);
                } else {
                    iQ2 = i33;
                }
            }
            size4 = arrayList.size();
            for (i32 = 0; i32 < size4; i32++) {
                iQ2 = q((View) arrayList.get(i32), iQ2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iQ = paddingLeft;
        iR = i35;
        if (u(this.f6246z)) {
            if (z11) {
                iR = r(this.f6246z, iR, iMin2, iArr);
            } else {
                iQ = q(this.f6246z, iQ, iMin2, iArr);
            }
        }
        if (u(this.f6239s)) {
            if (z11) {
                iQ = q(this.f6239s, iQ, iMin2, iArr);
            } else {
                iR = r(this.f6239s, iR, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iQ);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i35 - iR));
        iMax = Math.max(iQ, currentContentInsetLeft2);
        iMin = Math.min(iR, i35 - currentContentInsetRight2);
        if (u(this.f6204A)) {
            if (z11) {
                iMin = r(this.f6204A, iMin, iMin2, iArr);
            } else {
                iMax = q(this.f6204A, iMax, iMin2, iArr);
            }
        }
        if (u(this.f6243w)) {
            if (z11) {
                iMin = r(this.f6243w, iMin, iMin2, iArr);
            } else {
                iMax = q(this.f6243w, iMax, iMin2, iArr);
            }
        }
        zU = u(this.f6240t);
        zU2 = u(this.f6241u);
        if (zU) {
            U0 u16 = (U0) this.f6240t.getLayoutParams();
            measuredHeight = this.f6240t.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u16).topMargin + ((ViewGroup.MarginLayoutParams) u16).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zU2) {
            U0 u17 = (U0) this.f6241u.getLayoutParams();
            measuredHeight = this.f6241u.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u17).topMargin + ((ViewGroup.MarginLayoutParams) u17).bottomMargin + measuredHeight;
        }
        if (zU) {
            if (zU) {
                x8 = this.f6240t;
            } else {
                x8 = this.f6241u;
            }
            if (zU2) {
                x10 = this.f6241u;
            } else {
                x10 = this.f6240t;
            }
            u3 = (U0) x8.getLayoutParams();
            u10 = (U0) x10.getLayoutParams();
            i14 = measuredHeight;
            if (zU) {
            }
            i15 = this.f6218O & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) u3).topMargin + this.f6213J;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i23 = ((ViewGroup.MarginLayoutParams) u3).topMargin + this.f6213J;
                if (iMax2 < i23) {
                    iMax2 = i23;
                } else {
                    i24 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i25 = ((ViewGroup.MarginLayoutParams) u3).bottomMargin;
                    i26 = this.f6214K;
                    if (i24 < i25 + i26) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) u10).bottomMargin + i26) - i24));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) u10).bottomMargin) - this.f6214K) - i14;
            }
            if (z11) {
                if (z10) {
                    i20 = this.f6211H;
                } else {
                    i20 = 0;
                }
                int i310 = i20 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zU) {
                    U0 u18 = (U0) this.f6240t.getLayoutParams();
                    int measuredWidth5 = iMin - this.f6240t.getMeasuredWidth();
                    int measuredHeight4 = this.f6240t.getMeasuredHeight() + paddingTop;
                    this.f6240t.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i21 = measuredWidth5 - this.f6212I;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) u18).bottomMargin;
                } else {
                    i21 = iMin;
                }
                if (zU2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.f6241u.getLayoutParams())).topMargin;
                    this.f6241u.layout(iMin - this.f6241u.getMeasuredWidth(), i311, iMin, this.f6241u.getMeasuredHeight() + i311);
                    i22 = iMin - this.f6212I;
                } else {
                    i22 = iMin;
                }
                if (z10) {
                    iMin = Math.min(i21, i22);
                }
                iMax = i16;
            } else {
                if (z10) {
                    i17 = this.f6211H;
                } else {
                    i17 = 0;
                }
                int i312 = i17 - iArr[0];
                iMax = Math.max(0, i312) + i16;
                iArr[0] = Math.max(0, -i312);
                if (zU) {
                    U0 u19 = (U0) this.f6240t.getLayoutParams();
                    int measuredWidth6 = this.f6240t.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f6240t.getMeasuredHeight() + paddingTop;
                    this.f6240t.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i18 = measuredWidth6 + this.f6212I;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) u19).bottomMargin;
                } else {
                    i18 = iMax;
                }
                if (zU2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.f6241u.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f6241u.getMeasuredWidth() + iMax;
                    this.f6241u.layout(iMax, i313, measuredWidth7, this.f6241u.getMeasuredHeight() + i313);
                    i19 = measuredWidth7 + this.f6212I;
                } else {
                    i19 = iMax;
                }
                if (z10) {
                    iMax = Math.max(i18, i19);
                }
            }
        } else {
            if (zU) {
                x8 = this.f6240t;
            } else {
                x8 = this.f6241u;
            }
            if (zU2) {
                x10 = this.f6241u;
            } else {
                x10 = this.f6240t;
            }
            u3 = (U0) x8.getLayoutParams();
            u10 = (U0) x10.getLayoutParams();
            i14 = measuredHeight;
            if (zU) {
            }
            i15 = this.f6218O & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) u3).topMargin + this.f6213J;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i23 = ((ViewGroup.MarginLayoutParams) u3).topMargin + this.f6213J;
                if (iMax2 < i23) {
                    iMax2 = i23;
                } else {
                    i24 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i25 = ((ViewGroup.MarginLayoutParams) u3).bottomMargin;
                    i26 = this.f6214K;
                    if (i24 < i25 + i26) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) u10).bottomMargin + i26) - i24));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) u10).bottomMargin) - this.f6214K) - i14;
            }
            if (z11) {
                if (z10) {
                    i20 = this.f6211H;
                } else {
                    i20 = 0;
                }
                int i314 = i20 - iArr[1];
                iMin -= Math.max(0, i314);
                iArr[1] = Math.max(0, -i314);
                if (zU) {
                    U0 u110 = (U0) this.f6240t.getLayoutParams();
                    int measuredWidth8 = iMin - this.f6240t.getMeasuredWidth();
                    int measuredHeight6 = this.f6240t.getMeasuredHeight() + paddingTop;
                    this.f6240t.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i21 = measuredWidth8 - this.f6212I;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) u110).bottomMargin;
                } else {
                    i21 = iMin;
                }
                if (zU2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.f6241u.getLayoutParams())).topMargin;
                    this.f6241u.layout(iMin - this.f6241u.getMeasuredWidth(), i315, iMin, this.f6241u.getMeasuredHeight() + i315);
                    i22 = iMin - this.f6212I;
                } else {
                    i22 = iMin;
                }
                if (z10) {
                    iMin = Math.min(i21, i22);
                }
                iMax = i16;
            } else {
                if (z10) {
                    i17 = this.f6211H;
                } else {
                    i17 = 0;
                }
                int i316 = i17 - iArr[0];
                iMax = Math.max(0, i316) + i16;
                iArr[0] = Math.max(0, -i316);
                if (zU) {
                    U0 u111 = (U0) this.f6240t.getLayoutParams();
                    int measuredWidth9 = this.f6240t.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f6240t.getMeasuredHeight() + paddingTop;
                    this.f6240t.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i18 = measuredWidth9 + this.f6212I;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) u111).bottomMargin;
                } else {
                    i18 = iMax;
                }
                if (zU2) {
                    int i317 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.f6241u.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f6241u.getMeasuredWidth() + iMax;
                    this.f6241u.layout(iMax, i317, measuredWidth10, this.f6241u.getMeasuredHeight() + i317);
                    i19 = measuredWidth10 + this.f6212I;
                } else {
                    i19 = iMax;
                }
                if (z10) {
                    iMax = Math.max(i18, i19);
                }
            }
        }
        arrayList = this.f6224V;
        a(3, arrayList);
        size = arrayList.size();
        iQ2 = iMax;
        while (i27 < size) {
            iQ2 = q((View) arrayList.get(i27), iQ2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i28 < size2) {
            iMin = r((View) arrayList.get(i28), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i45 = iArr[0];
        int i46 = iArr[1];
        size3 = arrayList.size();
        i29 = i46;
        i30 = i45;
        i31 = 0;
        measuredWidth = 0;
        while (i31 < size3) {
            View view2 = (View) arrayList.get(i31);
            U0 u112 = (U0) view2.getLayoutParams();
            int i47 = i31;
            int i48 = ((ViewGroup.MarginLayoutParams) u112).leftMargin - i30;
            int i49 = ((ViewGroup.MarginLayoutParams) u112).rightMargin - i29;
            int iMax7 = Math.max(0, i48);
            int iMax8 = Math.max(0, i49);
            int iMax9 = Math.max(0, -i48);
            int iMax10 = Math.max(0, -i49);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i29 = iMax10;
            i30 = iMax9;
            i31 = i47 + 1;
        }
        i33 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i34 = measuredWidth + i33;
        if (i33 >= iQ2) {
            if (i34 > iMin) {
                iQ2 = i33 - (i34 - iMin);
            } else {
                iQ2 = i33;
            }
        }
        size4 = arrayList.size();
        while (i32 < size4) {
            iQ2 = q((View) arrayList.get(i32), iQ2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        char c10;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z6 = f1.a;
        int i12 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c10 = 0;
        } else {
            c10 = 1;
            objArr = false;
        }
        if (u(this.f6242v)) {
            t(this.f6242v, i10, 0, i11, this.f6210G);
            iK = k(this.f6242v) + this.f6242v.getMeasuredWidth();
            iMax = Math.max(0, l(this.f6242v) + this.f6242v.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f6242v.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (u(this.f6246z)) {
            t(this.f6246z, i10, 0, i11, this.f6210G);
            iK = k(this.f6246z) + this.f6246z.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f6246z) + this.f6246z.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f6246z.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.f6226a0;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (u(this.f6239s)) {
            t(this.f6239s, i10, iMax3, i11, this.f6210G);
            iK2 = k(this.f6239s) + this.f6239s.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f6239s) + this.f6239s.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f6239s.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c10] = Math.max(0, currentContentInsetEnd - iK2);
        if (u(this.f6204A)) {
            iMax5 += s(this.f6204A, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.f6204A) + this.f6204A.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f6204A.getMeasuredState());
        }
        if (u(this.f6243w)) {
            iMax5 += s(this.f6243w, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.f6243w) + this.f6243w.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f6243w.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((U0) childAt.getLayoutParams()).f13996b == 0 && u(childAt)) {
                iMax5 += s(childAt, i10, iMax5, i11, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i14 = iMax5;
        int i15 = this.f6213J + this.f6214K;
        int i16 = this.f6211H + this.f6212I;
        if (u(this.f6240t)) {
            s(this.f6240t, i10, i14 + i16, i11, i15, iArr);
            int iK3 = k(this.f6240t) + this.f6240t.getMeasuredWidth();
            iL = l(this.f6240t) + this.f6240t.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f6240t.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (u(this.f6241u)) {
            iMax2 = Math.max(iMax2, s(this.f6241u, i10, i14 + i16, i11, i15 + iL, iArr));
            iL += l(this.f6241u) + this.f6241u.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f6241u.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16);
        if (!this.f6234k0) {
            i12 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i12 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6382s);
        ActionMenuView actionMenuView = this.f6239s;
        l lVar = actionMenuView != null ? actionMenuView.f6129H : null;
        int i10 = savedState.f6247u;
        if (i10 != 0 && this.f6231h0 != null && lVar != null && (menuItemFindItem = lVar.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f6248v) {
            p122m7.d dVar = this.f6238o0;
            removeCallbacks(dVar);
            post(dVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        K0 k3 = this.f6215L;
        boolean z6 = i10 == 1;
        if (z6 == k3.f13968g) {
            return;
        }
        k3.f13968g = z6;
        if (!k3.f13969h) {
            k3.a = k3.f13966e;
            k3.f13963b = k3.f13967f;
            return;
        }
        if (z6) {
            int i11 = k3.f13965d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = k3.f13966e;
            }
            k3.a = i11;
            int i12 = k3.f13964c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = k3.f13967f;
            }
            k3.f13963b = i12;
            return;
        }
        int i13 = k3.f13964c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = k3.f13966e;
        }
        k3.a = i13;
        int i14 = k3.f13965d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = k3.f13967f;
        }
        k3.f13963b = i14;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        n nVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        T0 t7 = this.f6231h0;
        if (t7 != null && (nVar = t7.f13994t) != null) {
            savedState.f6247u = nVar.f13538s;
        }
        savedState.f6248v = p();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6222T = false;
        }
        if (!this.f6222T) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f6222T = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f6222T = false;
        return true;
    }

    public final boolean p() {
        b bVar;
        ActionMenuView actionMenuView = this.f6239s;
        return (actionMenuView == null || (bVar = actionMenuView.f6133L) == null || !bVar.f()) ? false : true;
    }

    public final int q(View view, int i10, int i11, int[] iArr) {
        U0 u3 = (U0) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) u3).leftMargin - iArr[0];
        int iMax = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int iJ = j(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) u3).rightMargin + iMax;
    }

    public final int r(View view, int i10, int i11, int[] iArr) {
        U0 u3 = (U0) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) u3).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iJ = j(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) u3).leftMargin);
    }

    public final int s(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void setBackInvokedCallbackEnabled(boolean z6) {
        if (this.f6237n0 != z6) {
            this.f6237n0 = z6;
            w();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(p068ga.l.g(getContext(), i10));
    }

    public void setCollapsible(boolean z6) {
        this.f6234k0 = z6;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f6217N) {
            this.f6217N = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f6216M) {
            this.f6216M = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(p068ga.l.g(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(p068ga.l.g(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f6242v.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(V0 v4) {
        this.f6228d0 = v4;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f6239s.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f6206C != i10) {
            this.f6206C = i10;
            if (i10 == 0) {
                this.f6205B = getContext();
            } else {
                this.f6205B = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f6214K = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f6212I = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f6211H = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f6213J = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final void t(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean v() {
        b bVar;
        ActionMenuView actionMenuView = this.f6239s;
        return (actionMenuView == null || (bVar = actionMenuView.f6133L) == null || !bVar.n()) ? false : true;
    }

    public final void w() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = S0.a(this);
            T0 t7 = this.f6231h0;
            boolean z6 = (t7 == null || t7.f13994t == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f6237n0) ? false : true;
            if (z6 && this.f6236m0 == null) {
                if (this.f6235l0 == null) {
                    this.f6235l0 = S0.b(new Q0(this, 0));
                }
                S0.c(onBackInvokedDispatcherA, this.f6235l0);
                this.f6236m0 = onBackInvokedDispatcherA;
                return;
            }
            if (z6 || (onBackInvokedDispatcher = this.f6236m0) == null) {
                return;
            }
            S0.d(onBackInvokedDispatcher, this.f6235l0);
            this.f6236m0 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f6218O = 8388627;
        this.f6224V = new ArrayList();
        this.f6225W = new ArrayList();
        this.f6226a0 = new int[2];
        this.f6227b0 = new C0099h(new Q0(this, 1));
        this.c0 = new ArrayList();
        this.f6229e0 = new e(this);
        this.f6238o0 = new p122m7.d(this, 3);
        Context context2 = getContext();
        int[] iArr = p069h.a.f11632y;
        Y1.c cVarE = Y1.c.E(context2, attributeSet, iArr, R.attr.toolbarStyle);
        U.m(this, context, iArr, attributeSet, (TypedArray) cVarE.f5671u, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) cVarE.f5671u;
        this.f6207D = typedArray.getResourceId(28, 0);
        this.f6208E = typedArray.getResourceId(19, 0);
        this.f6218O = typedArray.getInteger(0, 8388627);
        this.f6209F = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f6214K = dimensionPixelOffset;
        this.f6213J = dimensionPixelOffset;
        this.f6212I = dimensionPixelOffset;
        this.f6211H = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f6211H = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f6212I = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f6213J = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f6214K = dimensionPixelOffset5;
        }
        this.f6210G = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        K0 k3 = this.f6215L;
        k3.f13969h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            k3.f13966e = dimensionPixelSize;
            k3.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            k3.f13967f = dimensionPixelSize2;
            k3.f13963b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            k3.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f6216M = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f6217N = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f6244x = cVarE.v(4);
        this.f6245y = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f6205B = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableV = cVarE.v(16);
        if (drawableV != null) {
            setNavigationIcon(drawableV);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableV2 = cVarE.v(11);
        if (drawableV2 != null) {
            setLogo(drawableV2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(cVarE.u(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(cVarE.u(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        cVarE.J();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        U0 u3 = new U0(context, attributeSet);
        u3.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p069h.a.f11610b);
        u3.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        u3.f13996b = 0;
        return u3;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.f6246z;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f6246z.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.f6246z;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f6244x);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f6243w == null) {
                this.f6243w = new C0732v(getContext(), null, 0);
            }
            if (!o(this.f6243w)) {
                b(this.f6243w, true);
            }
        } else {
            C0732v c0732v = this.f6243w;
            if (c0732v != null && o(c0732v)) {
                removeView(this.f6243w);
                this.f6225W.remove(this.f6243w);
            }
        }
        C0732v c0732v2 = this.f6243w;
        if (c0732v2 != null) {
            c0732v2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f6243w == null) {
            this.f6243w = new C0732v(getContext(), null, 0);
        }
        C0732v c0732v = this.f6243w;
        if (c0732v != null) {
            c0732v.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.f6242v;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            com.bumptech.glide.e.r(this.f6242v, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f6242v)) {
                b(this.f6242v, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f6242v;
            if (appCompatImageButton != null && o(appCompatImageButton)) {
                removeView(this.f6242v);
                this.f6225W.remove(this.f6242v);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f6242v;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            X x8 = this.f6241u;
            if (x8 != null && o(x8)) {
                removeView(this.f6241u);
                this.f6225W.remove(this.f6241u);
            }
        } else {
            if (this.f6241u == null) {
                Context context = getContext();
                X x10 = new X(context, null);
                this.f6241u = x10;
                x10.setSingleLine();
                this.f6241u.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f6208E;
                if (i10 != 0) {
                    this.f6241u.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f6221S;
                if (colorStateList != null) {
                    this.f6241u.setTextColor(colorStateList);
                }
            }
            if (!o(this.f6241u)) {
                b(this.f6241u, true);
            }
        }
        X x11 = this.f6241u;
        if (x11 != null) {
            x11.setText(charSequence);
        }
        this.f6219Q = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f6221S = colorStateList;
        X x8 = this.f6241u;
        if (x8 != null) {
            x8.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            X x8 = this.f6240t;
            if (x8 != null && o(x8)) {
                removeView(this.f6240t);
                this.f6225W.remove(this.f6240t);
            }
        } else {
            if (this.f6240t == null) {
                Context context = getContext();
                X x10 = new X(context, null);
                this.f6240t = x10;
                x10.setSingleLine();
                this.f6240t.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f6207D;
                if (i10 != 0) {
                    this.f6240t.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f6220R;
                if (colorStateList != null) {
                    this.f6240t.setTextColor(colorStateList);
                }
            }
            if (!o(this.f6240t)) {
                b(this.f6240t, true);
            }
        }
        X x11 = this.f6240t;
        if (x11 != null) {
            x11.setText(charSequence);
        }
        this.P = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f6220R = colorStateList;
        X x8 = this.f6240t;
        if (x8 != null) {
            x8.setTextColor(colorStateList);
        }
    }
}
