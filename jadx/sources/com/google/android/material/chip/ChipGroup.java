package com.google.android.material.chip;

import O0.a;
import P0.d;
import U.U;
import V.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.kcstream.cing.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p023c3.g;
import p023c3.i;
import p023c3.j;
import p091j3.AbstractC0668c;
import p091j3.C;
import p091j3.InterfaceC0671f;

/* JADX INFO: loaded from: classes.dex */
public class ChipGroup extends AbstractC0668c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f9630A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final j f9631B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9633x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f9634y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f9635z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        Context contextA = p225x3.a.a(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        super(contextA, attributeSet, R.attr.chipGroupStyle);
        this.f12429u = false;
        TypedArray typedArrayObtainStyledAttributes = contextA.getTheme().obtainStyledAttributes(attributeSet, Q2.a.f4021p, 0, 0);
        this.f12427s = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f12428t = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        a aVar = new a();
        this.f9635z = aVar;
        j jVar = new j(this);
        this.f9631B = jVar;
        TypedArray typedArrayI = C.i(getContext(), attributeSet, Q2.a.j, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayI.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayI.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayI.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayI.getBoolean(5, false));
        setSingleSelection(typedArrayI.getBoolean(6, false));
        setSelectionRequired(typedArrayI.getBoolean(4, false));
        this.f9630A = typedArrayI.getResourceId(0, -1);
        typedArrayI.recycle();
        aVar.f3507e = new d(this, 21);
        super.setOnHierarchyChangeListener(jVar);
        WeakHashMap weakHashMap = U.a;
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof Chip) && getChildAt(i11).getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f9635z.g();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f9635z.d(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f9632w;
    }

    public int getChipSpacingVertical() {
        return this.f9633x;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f9630A;
        if (i10 != -1) {
            a aVar = this.f9635z;
            InterfaceC0671f interfaceC0671f = (InterfaceC0671f) ((HashMap) aVar.f3505c).get(Integer.valueOf(i10));
            if (interfaceC0671f != null && aVar.a(interfaceC0671f)) {
                aVar.h();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) h.a(getRowCount(), this.f12429u ? getVisibleChipCount() : -1, this.f9635z.a ? 1 : 2).f5078t);
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f9632w != i10) {
            this.f9632w = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f9633x != i10) {
            this.f9633x = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(p023c3.h hVar) {
        if (hVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new h(this, 12));
        }
    }

    public void setOnCheckedStateChangeListener(i iVar) {
        this.f9634y = iVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f9631B.f7519s = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z6) {
        this.f9635z.f3504b = z6;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // p091j3.AbstractC0668c
    public void setSingleLine(boolean z6) {
        super.setSingleLine(z6);
    }

    public void setSingleSelection(boolean z6) {
        a aVar = this.f9635z;
        if (aVar.a != z6) {
            aVar.a = z6;
            boolean zIsEmpty = ((HashSet) aVar.f3506d).isEmpty();
            Iterator it = ((HashMap) aVar.f3505c).values().iterator();
            while (it.hasNext()) {
                aVar.j((InterfaceC0671f) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            aVar.h();
        }
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g(layoutParams);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
