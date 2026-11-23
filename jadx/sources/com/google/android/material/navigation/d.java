package com.google.android.material.navigation;

import C8.E;
import U.U;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kcstream.cing.R;
import java.util.WeakHashMap;
import p091j3.C;
import p118m3.h;
import p118m3.i;
import p125n.g;
import p136o.z;
import p170r3.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends FrameLayout {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p118m3.e f9774s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final W2.b f9775t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f9776u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g f9777v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i f9778w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f9779x;

    public d(Context context, AttributeSet attributeSet) {
        super(p225x3.a.a(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        b bVar = new b();
        bVar.f9772t = false;
        this.f9776u = bVar;
        Context context2 = getContext();
        Y1.c cVarJ = C.j(context2, attributeSet, Q2.a.f3996G, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 12, 10);
        p118m3.e eVar = new p118m3.e(context2, getClass(), getMaxItemCount());
        this.f9774s = eVar;
        W2.b bVar2 = new W2.b(context2);
        this.f9775t = bVar2;
        bVar.f9771s = bVar2;
        bVar.f9773u = 1;
        bVar2.setPresenter(bVar);
        eVar.b(bVar, eVar.f13507s);
        getContext();
        bVar.f9771s.f13130W = eVar;
        TypedArray typedArray = (TypedArray) cVarJ.f5671u;
        if (typedArray.hasValue(6)) {
            bVar2.setIconTintList(cVarJ.u(6));
        } else {
            bVar2.setIconTintList(bVar2.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(12)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(12, 0));
        }
        if (typedArray.hasValue(10)) {
            setItemTextAppearanceActive(typedArray.getResourceId(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(11, true));
        if (typedArray.hasValue(13)) {
            setItemTextColor(cVarJ.u(13));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListI = p086i8.C.i(background);
        if (background == null || colorStateListI != null) {
            p170r3.g gVar = new p170r3.g(j.c(context2, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).a());
            if (colorStateListI != null) {
                gVar.l(colorStateListI);
            }
            gVar.j(context2);
            WeakHashMap weakHashMap = U.a;
            setBackground(gVar);
        }
        if (typedArray.hasValue(8)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(8, 0));
        }
        if (typedArray.hasValue(7)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(7, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        M.a.h(getBackground().mutate(), E.m(context2, cVarJ, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            bVar2.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(E.m(context2, cVarJ, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, Q2.a.f3995F);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(E.n(context2, typedArrayObtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(j.a(context2, typedArrayObtainStyledAttributes.getResourceId(4, 0), 0).a());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            int resourceId3 = typedArray.getResourceId(15, 0);
            bVar.f9772t = true;
            getMenuInflater().inflate(resourceId3, eVar);
            bVar.f9772t = false;
            bVar.e(true);
        }
        cVarJ.J();
        addView(bVar2);
        eVar.f13511w = new p102k7.e((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f9777v == null) {
            this.f9777v = new g(getContext());
        }
        return this.f9777v;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f9775t.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f9775t.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f9775t.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f9775t.getItemActiveIndicatorMarginHorizontal();
    }

    public j getItemActiveIndicatorShapeAppearance() {
        return this.f9775t.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f9775t.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f9775t.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f9775t.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f9775t.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f9775t.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f9775t.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f9775t.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f9775t.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f9775t.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f9775t.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f9775t.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f9775t.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f9774s;
    }

    public z getMenuView() {
        return this.f9775t;
    }

    public b getPresenter() {
        return this.f9776u;
    }

    public int getSelectedItemId() {
        return this.f9775t.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        D3.b.F(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof NavigationBarView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        NavigationBarView$SavedState navigationBarView$SavedState = (NavigationBarView$SavedState) parcelable;
        super.onRestoreInstanceState(navigationBarView$SavedState.f6382s);
        this.f9774s.t(navigationBarView$SavedState.f9752u);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        NavigationBarView$SavedState navigationBarView$SavedState = new NavigationBarView$SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        navigationBarView$SavedState.f9752u = bundle;
        this.f9774s.v(bundle);
        return navigationBarView$SavedState;
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f9775t.setActiveIndicatorLabelPadding(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        D3.b.C(this, f10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f9775t.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z6) {
        this.f9775t.setItemActiveIndicatorEnabled(z6);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f9775t.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f9775t.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(j jVar) {
        this.f9775t.setItemActiveIndicatorShapeAppearance(jVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f9775t.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f9775t.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        this.f9775t.setItemBackgroundRes(i10);
    }

    public void setItemIconSize(int i10) {
        this.f9775t.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f9775t.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f9775t.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f9775t.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f9775t.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f9775t.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z6) {
        this.f9775t.setItemTextAppearanceActiveBoldEnabled(z6);
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f9775t.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f9775t.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) {
        W2.b bVar = this.f9775t;
        if (bVar.getLabelVisibilityMode() != i10) {
            bVar.setLabelVisibilityMode(i10);
            this.f9776u.e(false);
        }
    }

    public void setOnItemReselectedListener(h hVar) {
        this.f9779x = hVar;
    }

    public void setOnItemSelectedListener(i iVar) {
        this.f9778w = iVar;
    }

    public void setSelectedItemId(int i10) {
        p118m3.e eVar = this.f9774s;
        MenuItem menuItemFindItem = eVar.findItem(i10);
        if (menuItemFindItem == null || eVar.q(menuItemFindItem, this.f9776u, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }
}
