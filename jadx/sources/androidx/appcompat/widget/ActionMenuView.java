package androidx.appcompat.widget;

import A1.J;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p.AbstractC0731u0;
import p.C0703g;
import p.C0709j;
import p.C0713l;
import p.C0729t0;
import p.InterfaceC0711k;
import p.InterfaceC0715m;
import p.f1;
import p136o.j;
import p136o.k;
import p136o.l;
import p136o.n;
import p136o.w;
import p136o.z;
import p170r3.e;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC0731u0 implements k, z {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public l f6129H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Context f6130I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f6131J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f6132K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public b f6133L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public J f6134M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public j f6135N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f6136O;
    public int P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f6137Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final int f6138R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public InterfaceC0715m f6139S;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f6137Q = (int) (56.0f * f10);
        this.f6138R = (int) (f10 * 4.0f);
        this.f6130I = context;
        this.f6131J = 0;
    }

    public static C0713l j() {
        C0713l c0713l = new C0713l(-2, -2);
        c0713l.a = false;
        ((LinearLayout.LayoutParams) c0713l).gravity = 16;
        return c0713l;
    }

    public static C0713l k(ViewGroup.LayoutParams layoutParams) {
        C0713l c0713l;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C0713l) {
            C0713l c0713l2 = (C0713l) layoutParams;
            c0713l = new C0713l(c0713l2);
            c0713l.a = c0713l2.a;
        } else {
            c0713l = new C0713l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0713l).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0713l).gravity = 16;
        }
        return c0713l;
    }

    @Override // p136o.z
    public final void b(l lVar) {
        this.f6129H = lVar;
    }

    @Override // p136o.k
    public final boolean c(n nVar) {
        return this.f6129H.q(nVar, null, 0);
    }

    @Override // p.AbstractC0731u0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0713l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p.AbstractC0731u0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ C0729t0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // p.AbstractC0731u0
    /* JADX INFO: renamed from: g */
    public final C0729t0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0713l(getContext(), attributeSet);
    }

    @Override // p.AbstractC0731u0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // p.AbstractC0731u0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f6129H == null) {
            Context context = getContext();
            l lVar = new l(context);
            this.f6129H = lVar;
            lVar.f13511w = new p081i3.b(this, 13);
            b bVar = new b(context);
            this.f6133L = bVar;
            bVar.f6257E = true;
            bVar.f6258F = true;
            w eVar = this.f6134M;
            if (eVar == null) {
                eVar = new e(25);
            }
            bVar.f6273w = eVar;
            this.f6129H.b(bVar, this.f6130I);
            b bVar2 = this.f6133L;
            bVar2.f6276z = this;
            this.f6129H = bVar2.f6271u;
        }
        return this.f6129H;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        b bVar = this.f6133L;
        C0709j c0709j = bVar.f6254B;
        if (c0709j != null) {
            return c0709j.getDrawable();
        }
        if (bVar.f6256D) {
            return bVar.f6255C;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f6131J;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p.AbstractC0731u0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C0729t0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i10) {
        boolean zB = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof InterfaceC0711k)) {
            zB = ((InterfaceC0711k) childAt).b();
        }
        return (i10 <= 0 || !(childAt2 instanceof InterfaceC0711k)) ? zB : ((InterfaceC0711k) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b bVar = this.f6133L;
        if (bVar != null) {
            bVar.e(false);
            if (this.f6133L.f()) {
                this.f6133L.b();
                this.f6133L.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f6133L;
        if (bVar != null) {
            bVar.b();
            C0703g c0703g = bVar.f6265M;
            if (c0703g == null || !c0703g.b()) {
                return;
            }
            c0703g.f13564i.dismiss();
        }
    }

    @Override // p.AbstractC0731u0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f6136O) {
            super.onLayout(z6, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z10 = f1.a;
        boolean z11 = getLayoutDirection() == 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                C0713l c0713l = (C0713l) childAt.getLayoutParams();
                if (c0713l.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z11) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0713l).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0713l).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0713l).leftMargin) + ((LinearLayout.LayoutParams) c0713l).rightMargin;
                    l(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (z11) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                C0713l c0713l2 = (C0713l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0713l2.a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) c0713l2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0713l2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            C0713l c0713l3 = (C0713l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0713l3.a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) c0713l3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0713l3).rightMargin + iMax + i27;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // p.AbstractC0731u0, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        ?? r11;
        int i14;
        int i15;
        l lVar;
        boolean z6 = this.f6136O;
        boolean z10 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f6136O = z10;
        if (z6 != z10) {
            this.P = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f6136O && (lVar = this.f6129H) != null && size != this.P) {
            this.P = size;
            lVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f6136O || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                C0713l c0713l = (C0713l) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) c0713l).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0713l).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.f6137Q;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i22 = 0;
        int iMax2 = 0;
        int i23 = 0;
        boolean z11 = false;
        int i24 = 0;
        long j = 0;
        while (true) {
            i12 = this.f6138R;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i14 = i21;
            } else {
                boolean z12 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z12) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                C0713l c0713l2 = (C0713l) childAt.getLayoutParams();
                c0713l2.f14078f = false;
                c0713l2.f14075c = 0;
                c0713l2.f14074b = 0;
                c0713l2.f14076d = false;
                ((LinearLayout.LayoutParams) c0713l2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0713l2).rightMargin = 0;
                c0713l2.f14077e = z12 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i27 = c0713l2.a ? 1 : i19;
                C0713l c0713l3 = (C0713l) childAt.getLayoutParams();
                int i28 = i19;
                i14 = i21;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i26, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z12 ? (ActionMenuItemView) childAt : null;
                boolean z13 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z14 = z13;
                if (i27 <= 0 || (z13 && i27 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i27, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i14;
                    if (measuredWidth % i14 != 0) {
                        i15++;
                    }
                    if (z14 && i15 < 2) {
                        i15 = 2;
                    }
                }
                c0713l3.f14076d = !c0713l3.a && z14;
                c0713l3.f14074b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i14, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i15);
                if (c0713l2.f14076d) {
                    i24++;
                }
                if (c0713l2.a) {
                    z11 = true;
                }
                i19 = i28 - i15;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j |= (long) (1 << i23);
                }
            }
            i23++;
            size3 = i25;
            paddingBottom = i26;
            i21 = i14;
        }
        int i29 = size3;
        int i30 = i19;
        int i31 = i21;
        boolean z15 = z11 && i22 == 2;
        int i32 = i30;
        boolean z16 = false;
        while (true) {
            if (i24 <= 0 || i32 <= 0) {
                i13 = iMax;
                break;
            }
            int i33 = Integer.MAX_VALUE;
            long j10 = 0;
            int i34 = 0;
            int i35 = 0;
            while (i35 < childCount2) {
                boolean z17 = z15;
                C0713l c0713l4 = (C0713l) getChildAt(i35).getLayoutParams();
                int i36 = iMax;
                if (c0713l4.f14076d) {
                    int i37 = c0713l4.f14074b;
                    if (i37 < i33) {
                        j10 = 1 << i35;
                        i33 = i37;
                        i34 = 1;
                    } else if (i37 == i33) {
                        j10 |= 1 << i35;
                        i34++;
                    }
                }
                i35++;
                iMax = i36;
                z15 = z17;
            }
            boolean z18 = z15;
            i13 = iMax;
            j |= j10;
            if (i34 > i32) {
                break;
            }
            int i38 = i33 + 1;
            int i39 = 0;
            while (i39 < childCount2) {
                View childAt2 = getChildAt(i39);
                C0713l c0713l5 = (C0713l) childAt2.getLayoutParams();
                boolean z19 = z11;
                long j11 = 1 << i39;
                if ((j10 & j11) != 0) {
                    if (z18 && c0713l5.f14077e) {
                        r11 = 1;
                        r11 = 1;
                        if (i32 == 1) {
                            childAt2.setPadding(i12 + i31, 0, i12, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c0713l5.f14074b += r11;
                    c0713l5.f14078f = r11;
                    i32--;
                } else if (c0713l5.f14074b == i38) {
                    j |= j11;
                }
                i39++;
                z11 = z19;
            }
            iMax = i13;
            z15 = z18;
            z16 = true;
        }
        boolean z20 = !z11 && i22 == 1;
        if (i32 > 0 && j != 0 && (i32 < i22 - 1 || z20 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z20) {
                if ((j & 1) != 0 && !((C0713l) getChildAt(0).getLayoutParams()).f14077e) {
                    fBitCount -= 0.5f;
                }
                int i40 = childCount2 - 1;
                if ((j & ((long) (1 << i40))) != 0 && !((C0713l) getChildAt(i40).getLayoutParams()).f14077e) {
                    fBitCount -= 0.5f;
                }
            }
            int i41 = fBitCount > 0.0f ? (int) ((i32 * i31) / fBitCount) : 0;
            boolean z21 = z16;
            for (int i42 = 0; i42 < childCount2; i42++) {
                if ((j & ((long) (1 << i42))) != 0) {
                    View childAt3 = getChildAt(i42);
                    C0713l c0713l6 = (C0713l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0713l6.f14075c = i41;
                        c0713l6.f14078f = true;
                        if (i42 == 0 && !c0713l6.f14077e) {
                            ((LinearLayout.LayoutParams) c0713l6).leftMargin = (-i41) / 2;
                        }
                        z21 = true;
                    } else if (c0713l6.a) {
                        c0713l6.f14075c = i41;
                        c0713l6.f14078f = true;
                        ((LinearLayout.LayoutParams) c0713l6).rightMargin = (-i41) / 2;
                        z21 = true;
                    } else {
                        if (i42 != 0) {
                            ((LinearLayout.LayoutParams) c0713l6).leftMargin = i41 / 2;
                        }
                        if (i42 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c0713l6).rightMargin = i41 / 2;
                        }
                    }
                }
            }
            z16 = z21;
        }
        if (z16) {
            for (int i43 = 0; i43 < childCount2; i43++) {
                View childAt4 = getChildAt(i43);
                C0713l c0713l7 = (C0713l) childAt4.getLayoutParams();
                if (c0713l7.f14078f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0713l7.f14074b * i31) + c0713l7.f14075c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i13 : i29);
    }

    public void setExpandedActionViewsExclusive(boolean z6) {
        this.f6133L.f6262J = z6;
    }

    public void setOnMenuItemClickListener(InterfaceC0715m interfaceC0715m) {
        this.f6139S = interfaceC0715m;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        b bVar = this.f6133L;
        C0709j c0709j = bVar.f6254B;
        if (c0709j != null) {
            c0709j.setImageDrawable(drawable);
        } else {
            bVar.f6256D = true;
            bVar.f6255C = drawable;
        }
    }

    public void setOverflowReserved(boolean z6) {
        this.f6132K = z6;
    }

    public void setPopupTheme(int i10) {
        if (this.f6131J != i10) {
            this.f6131J = i10;
            if (i10 == 0) {
                this.f6130I = getContext();
            } else {
                this.f6130I = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(b bVar) {
        this.f6133L = bVar;
        bVar.f6276z = this;
        this.f6129H = bVar.f6271u;
    }

    @Override // p.AbstractC0731u0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0713l(getContext(), attributeSet);
    }
}
