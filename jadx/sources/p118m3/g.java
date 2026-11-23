package p118m3;

import J.f;
import R2.a;
import T.d;
import U.U;
import V.h;
import V0.C0446a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import com.google.android.material.navigation.b;
import java.util.HashSet;
import java.util.WeakHashMap;
import p091j3.A;
import p136o.l;
import p136o.n;
import p136o.z;
import p170r3.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends ViewGroup implements z {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int[] f13107a0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int[] f13108b0 = {-16842910};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f13109A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f13110B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f13111C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ColorStateList f13112D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f13113E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f13114F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f13115G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Drawable f13116H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ColorStateList f13117I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f13118J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final SparseArray f13119K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f13120L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f13121M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f13122N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f13123O;
    public int P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f13124Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f13125R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public j f13126S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f13127T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ColorStateList f13128U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public b f13129V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public l f13130W;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0446a f13131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f13132t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d f13133u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SparseArray f13134v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13135w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d[] f13136x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13137y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13138z;

    public g(Context context) {
        super(context);
        this.f13133u = new d(5);
        this.f13134v = new SparseArray(5);
        this.f13137y = 0;
        this.f13138z = 0;
        this.f13119K = new SparseArray(5);
        this.f13120L = -1;
        this.f13121M = -1;
        this.f13122N = -1;
        this.f13127T = false;
        this.f13112D = c();
        if (isInEditMode()) {
            this.f13131s = null;
        } else {
            C0446a c0446a = new C0446a();
            this.f13131s = c0446a;
            c0446a.S(0);
            c0446a.G(J7.j.C(getContext(), com.kcstream.cing.R.attr.motionDurationMedium4, getResources().getInteger(com.kcstream.cing.R.integer.material_motion_duration_long_1)));
            c0446a.I(J7.j.D(getContext(), com.kcstream.cing.R.attr.motionEasingStandard, a.f4441b));
            c0446a.P(new A());
        }
        this.f13132t = new f((W2.b) this);
        WeakHashMap weakHashMap = U.a;
        setImportantForAccessibility(1);
    }

    private d getNewItem() {
        d dVar = (d) this.f13133u.a();
        return dVar == null ? new W2.a(getContext()) : dVar;
    }

    private void setBadgeIfNeeded(d dVar) {
        T2.a aVar;
        int id = dVar.getId();
        if (id == -1 || (aVar = (T2.a) this.f13119K.get(id)) == null) {
            return;
        }
        dVar.setBadge(aVar);
    }

    public final void a() {
        removeAllViews();
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    this.f13133u.c(dVar);
                    if (dVar.f13095a0 != null) {
                        ImageView imageView = dVar.f13078F;
                        if (imageView != null) {
                            dVar.setClipChildren(true);
                            dVar.setClipToPadding(true);
                            T2.a aVar = dVar.f13095a0;
                            if (aVar != null) {
                                if (aVar.d() != null) {
                                    aVar.d().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(aVar);
                                }
                            }
                        }
                        dVar.f13095a0 = null;
                    }
                    dVar.f13084L = null;
                    dVar.f13089R = 0.0f;
                    dVar.f13096s = false;
                }
            }
        }
        if (this.f13130W.f13512x.size() == 0) {
            this.f13137y = 0;
            this.f13138z = 0;
            this.f13136x = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.f13130W.f13512x.size(); i10++) {
            hashSet.add(Integer.valueOf(this.f13130W.getItem(i10).getItemId()));
        }
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f13119K;
            if (i11 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i11++;
        }
        this.f13136x = new d[this.f13130W.f13512x.size()];
        int i12 = this.f13135w;
        boolean z6 = i12 != -1 ? i12 == 0 : this.f13130W.l().size() > 3;
        for (int i13 = 0; i13 < this.f13130W.f13512x.size(); i13++) {
            this.f13129V.f9772t = true;
            this.f13130W.getItem(i13).setCheckable(true);
            this.f13129V.f9772t = false;
            d newItem = getNewItem();
            this.f13136x[i13] = newItem;
            newItem.setIconTintList(this.f13109A);
            newItem.setIconSize(this.f13110B);
            newItem.setTextColor(this.f13112D);
            newItem.setTextAppearanceInactive(this.f13113E);
            newItem.setTextAppearanceActive(this.f13114F);
            newItem.setTextAppearanceActiveBoldEnabled(this.f13115G);
            newItem.setTextColor(this.f13111C);
            int i14 = this.f13120L;
            if (i14 != -1) {
                newItem.setItemPaddingTop(i14);
            }
            int i15 = this.f13121M;
            if (i15 != -1) {
                newItem.setItemPaddingBottom(i15);
            }
            int i16 = this.f13122N;
            if (i16 != -1) {
                newItem.setActiveIndicatorLabelPadding(i16);
            }
            newItem.setActiveIndicatorWidth(this.P);
            newItem.setActiveIndicatorHeight(this.f13124Q);
            newItem.setActiveIndicatorMarginHorizontal(this.f13125R);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.f13127T);
            newItem.setActiveIndicatorEnabled(this.f13123O);
            Drawable drawable = this.f13116H;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f13118J);
            }
            newItem.setItemRippleColor(this.f13117I);
            newItem.setShifting(z6);
            newItem.setLabelVisibilityMode(this.f13135w);
            n nVar = (n) this.f13130W.getItem(i13);
            newItem.a(nVar);
            newItem.setItemPosition(i13);
            SparseArray sparseArray2 = this.f13134v;
            int i17 = nVar.f13538s;
            newItem.setOnTouchListener((View.OnTouchListener) sparseArray2.get(i17));
            newItem.setOnClickListener(this.f13132t);
            int i18 = this.f13137y;
            if (i18 != 0 && i17 == i18) {
                this.f13138z = i13;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f13130W.f13512x.size() - 1, this.f13138z);
        this.f13138z = iMin;
        this.f13130W.getItem(iMin).setChecked(true);
    }

    @Override // p136o.z
    public final void b(l lVar) {
        this.f13130W = lVar;
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListC = f.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.kcstream.cing.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i10 = typedValue.data;
        int defaultColor = colorStateListC.getDefaultColor();
        int[] iArr = f13108b0;
        return new ColorStateList(new int[][]{iArr, f13107a0, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListC.getColorForState(iArr, defaultColor), i10, defaultColor});
    }

    public final p170r3.g d() {
        if (this.f13126S == null || this.f13128U == null) {
            return null;
        }
        p170r3.g gVar = new p170r3.g(this.f13126S);
        gVar.l(this.f13128U);
        return gVar;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f13122N;
    }

    public SparseArray<T2.a> getBadgeDrawables() {
        return this.f13119K;
    }

    public ColorStateList getIconTintList() {
        return this.f13109A;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f13128U;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f13123O;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f13124Q;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f13125R;
    }

    public j getItemActiveIndicatorShapeAppearance() {
        return this.f13126S;
    }

    public int getItemActiveIndicatorWidth() {
        return this.P;
    }

    public Drawable getItemBackground() {
        d[] dVarArr = this.f13136x;
        return (dVarArr == null || dVarArr.length <= 0) ? this.f13116H : dVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f13118J;
    }

    public int getItemIconSize() {
        return this.f13110B;
    }

    public int getItemPaddingBottom() {
        return this.f13121M;
    }

    public int getItemPaddingTop() {
        return this.f13120L;
    }

    public ColorStateList getItemRippleColor() {
        return this.f13117I;
    }

    public int getItemTextAppearanceActive() {
        return this.f13114F;
    }

    public int getItemTextAppearanceInactive() {
        return this.f13113E;
    }

    public ColorStateList getItemTextColor() {
        return this.f13111C;
    }

    public int getLabelVisibilityMode() {
        return this.f13135w;
    }

    public l getMenu() {
        return this.f13130W;
    }

    public int getSelectedItemId() {
        return this.f13137y;
    }

    public int getSelectedItemPosition() {
        return this.f13138z;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) h.a(1, this.f13130W.l().size(), 1).f5078t);
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f13122N = i10;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorLabelPadding(i10);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f13109A = colorStateList;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f13128U = colorStateList;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z6) {
        this.f13123O = z6;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorEnabled(z6);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f13124Q = i10;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorHeight(i10);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f13125R = i10;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorMarginHorizontal(i10);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z6) {
        this.f13127T = z6;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorResizeable(z6);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(j jVar) {
        this.f13126S = jVar;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.P = i10;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setActiveIndicatorWidth(i10);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f13116H = drawable;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f13118J = i10;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setItemBackground(i10);
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.f13110B = i10;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setIconSize(i10);
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.f13121M = i10;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setItemPaddingBottom(i10);
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.f13120L = i10;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setItemPaddingTop(i10);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f13117I = colorStateList;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f13114F = i10;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.f13111C;
                if (colorStateList != null) {
                    dVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z6) {
        this.f13115G = z6;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setTextAppearanceActiveBoldEnabled(z6);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f13113E = i10;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.f13111C;
                if (colorStateList != null) {
                    dVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f13111C = colorStateList;
        d[] dVarArr = this.f13136x;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                dVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f13135w = i10;
    }

    public void setPresenter(b bVar) {
        this.f13129V = bVar;
    }
}
