package com.google.android.material.button;

import C8.E;
import J.f;
import U.U;
import V.h;
import Y2.b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p068ga.l;
import p091j3.C;
import p170r3.j;
import p170r3.u;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, u {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int[] f9547J = {R.attr.state_checkable};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int[] f9548K = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Drawable f9549A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f9550B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f9551C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f9552D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f9553E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f9554F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f9555G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f9556H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f9557I;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f9558v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashSet f9559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Y2.a f9560x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PorterDuff.Mode f9561y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f9562z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f9563u;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f9563u = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9563u ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(p225x3.a.a(context, attributeSet, com.kcstream.cing.R.attr.materialButtonStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_Button), attributeSet, com.kcstream.cing.R.attr.materialButtonStyle);
        this.f9559w = new LinkedHashSet();
        this.f9555G = false;
        this.f9556H = false;
        Context context2 = getContext();
        TypedArray typedArrayI = C.i(context2, attributeSet, Q2.a.f4026u, com.kcstream.cing.R.attr.materialButtonStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f9554F = typedArrayI.getDimensionPixelSize(12, 0);
        int i10 = typedArrayI.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f9561y = C.k(i10, mode);
        this.f9562z = E.n(getContext(), typedArrayI, 14);
        this.f9549A = E.q(getContext(), typedArrayI, 10);
        this.f9557I = typedArrayI.getInteger(11, 1);
        this.f9551C = typedArrayI.getDimensionPixelSize(13, 0);
        b bVar = new b(this, j.c(context2, attributeSet, com.kcstream.cing.R.attr.materialButtonStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_Button).a());
        this.f9558v = bVar;
        bVar.f5674c = typedArrayI.getDimensionPixelOffset(1, 0);
        bVar.f5675d = typedArrayI.getDimensionPixelOffset(2, 0);
        bVar.f5676e = typedArrayI.getDimensionPixelOffset(3, 0);
        bVar.f5677f = typedArrayI.getDimensionPixelOffset(4, 0);
        if (typedArrayI.hasValue(8)) {
            int dimensionPixelSize = typedArrayI.getDimensionPixelSize(8, -1);
            bVar.f5678g = dimensionPixelSize;
            I4.b bVarF = bVar.f5673b.f();
            bVarF.c(dimensionPixelSize);
            bVar.c(bVarF.a());
            bVar.f5686p = true;
        }
        bVar.f5679h = typedArrayI.getDimensionPixelSize(20, 0);
        bVar.f5680i = C.k(typedArrayI.getInt(7, -1), mode);
        bVar.j = E.n(getContext(), typedArrayI, 6);
        bVar.f5681k = E.n(getContext(), typedArrayI, 19);
        bVar.f5682l = E.n(getContext(), typedArrayI, 16);
        bVar.f5687q = typedArrayI.getBoolean(5, false);
        bVar.f5690t = typedArrayI.getDimensionPixelSize(9, 0);
        bVar.f5688r = typedArrayI.getBoolean(21, true);
        WeakHashMap weakHashMap = U.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayI.hasValue(0)) {
            bVar.f5685o = true;
            setSupportBackgroundTintList(bVar.j);
            setSupportBackgroundTintMode(bVar.f5680i);
        } else {
            bVar.e();
        }
        setPaddingRelative(paddingStart + bVar.f5674c, paddingTop + bVar.f5676e, paddingEnd + bVar.f5675d, paddingBottom + bVar.f5677f);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f9554F);
        c(this.f9549A != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        b bVar = this.f9558v;
        return (bVar == null || bVar.f5685o) ? false : true;
    }

    public final void b() {
        int i10 = this.f9557I;
        boolean z6 = true;
        if (i10 != 1 && i10 != 2) {
            z6 = false;
        }
        if (z6) {
            setCompoundDrawablesRelative(this.f9549A, null, null, null);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            setCompoundDrawablesRelative(null, null, this.f9549A, null);
        } else if (i10 == 16 || i10 == 32) {
            setCompoundDrawablesRelative(null, this.f9549A, null, null);
        }
    }

    public final void c(boolean z6) {
        Drawable drawable = this.f9549A;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f9549A = drawableMutate;
            M.a.h(drawableMutate, this.f9562z);
            PorterDuff.Mode mode = this.f9561y;
            if (mode != null) {
                M.a.i(this.f9549A, mode);
            }
            int intrinsicWidth = this.f9551C;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f9549A.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f9551C;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f9549A.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f9549A;
            int i10 = this.f9552D;
            int i11 = this.f9553E;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f9549A.setVisible(true, z6);
        }
        if (z6) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i12 = this.f9557I;
        if (((i12 == 1 || i12 == 2) && drawable3 != this.f9549A) || (((i12 == 3 || i12 == 4) && drawable5 != this.f9549A) || ((i12 == 16 || i12 == 32) && drawable4 != this.f9549A))) {
            b();
        }
    }

    public final void d(int i10, int i11) {
        if (this.f9549A == null || getLayout() == null) {
            return;
        }
        int i12 = this.f9557I;
        if (!(i12 == 1 || i12 == 2) && i12 != 3 && i12 != 4) {
            if (i12 == 16 || i12 == 32) {
                this.f9552D = 0;
                if (i12 == 16) {
                    this.f9553E = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.f9551C;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f9549A.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f9554F) - getPaddingBottom()) / 2);
                if (this.f9553E != iMax) {
                    this.f9553E = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f9553E = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.f9557I;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f9552D = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.f9551C;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f9549A.getIntrinsicWidth();
        }
        int textLayoutWidth = i10 - getTextLayoutWidth();
        WeakHashMap weakHashMap = U.a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f9554F) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f9557I == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f9552D != paddingEnd) {
            this.f9552D = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f9550B)) {
            return this.f9550B;
        }
        b bVar = this.f9558v;
        return ((bVar == null || !bVar.f5687q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f9558v.f5678g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f9549A;
    }

    public int getIconGravity() {
        return this.f9557I;
    }

    public int getIconPadding() {
        return this.f9554F;
    }

    public int getIconSize() {
        return this.f9551C;
    }

    public ColorStateList getIconTint() {
        return this.f9562z;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f9561y;
    }

    public int getInsetBottom() {
        return this.f9558v.f5677f;
    }

    public int getInsetTop() {
        return this.f9558v.f5676e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f9558v.f5682l;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        if (a()) {
            return this.f9558v.f5673b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f9558v.f5681k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f9558v.f5679h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f9558v.j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f9558v.f5680i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f9555G;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            D3.b.E(this, this.f9558v.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        b bVar = this.f9558v;
        if (bVar != null && bVar.f5687q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9547J);
        }
        if (this.f9555G) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9548K);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f9555G);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        b bVar = this.f9558v;
        accessibilityNodeInfo.setCheckable(bVar != null && bVar.f5687q);
        accessibilityNodeInfo.setChecked(this.f9555G);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6382s);
        setChecked(savedState.f9563u);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9563u = this.f9555G;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f9558v.f5688r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f9549A != null) {
            if (this.f9549A.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f9550B = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (!a()) {
            super.setBackgroundColor(i10);
            return;
        }
        b bVar = this.f9558v;
        if (bVar.b(false) != null) {
            bVar.b(false).setTint(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        b bVar = this.f9558v;
        bVar.f5685o = true;
        ColorStateList colorStateList = bVar.j;
        MaterialButton materialButton = bVar.a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(bVar.f5680i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? l.g(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z6) {
        if (a()) {
            this.f9558v.f5687q = z6;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        b bVar = this.f9558v;
        if (bVar == null || !bVar.f5687q || !isEnabled() || this.f9555G == z6) {
            return;
        }
        this.f9555G = z6;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z10 = this.f9555G;
            if (!materialButtonToggleGroup.f9572x) {
                materialButtonToggleGroup.b(getId(), z10);
            }
        }
        if (this.f9556H) {
            return;
        }
        this.f9556H = true;
        Iterator it = this.f9559w.iterator();
        if (it.hasNext()) {
            throw E0.a.e(it);
        }
        this.f9556H = false;
    }

    public void setCornerRadius(int i10) {
        if (a()) {
            b bVar = this.f9558v;
            if (bVar.f5686p && bVar.f5678g == i10) {
                return;
            }
            bVar.f5678g = i10;
            bVar.f5686p = true;
            I4.b bVarF = bVar.f5673b.f();
            bVarF.c(i10);
            bVar.c(bVarF.a());
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (a()) {
            this.f9558v.b(false).k(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f9549A != drawable) {
            this.f9549A = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f9557I != i10) {
            this.f9557I = i10;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f9554F != i10) {
            this.f9554F = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? l.g(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f9551C != i10) {
            this.f9551C = i10;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f9562z != colorStateList) {
            this.f9562z = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f9561y != mode) {
            this.f9561y = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(f.c(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        b bVar = this.f9558v;
        bVar.d(bVar.f5676e, i10);
    }

    public void setInsetTop(int i10) {
        b bVar = this.f9558v;
        bVar.d(i10, bVar.f5677f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(Y2.a aVar) {
        this.f9560x = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        Y2.a aVar = this.f9560x;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((h) aVar).f5078t).invalidate();
        }
        super.setPressed(z6);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            b bVar = this.f9558v;
            if (bVar.f5682l != colorStateList) {
                bVar.f5682l = colorStateList;
                MaterialButton materialButton = bVar.a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(p149p3.a.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (a()) {
            setRippleColor(f.c(getContext(), i10));
        }
    }

    @Override // p170r3.u
    public void setShapeAppearanceModel(j jVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f9558v.c(jVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z6) {
        if (a()) {
            b bVar = this.f9558v;
            bVar.f5684n = z6;
            bVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            b bVar = this.f9558v;
            if (bVar.f5681k != colorStateList) {
                bVar.f5681k = colorStateList;
                bVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (a()) {
            setStrokeColor(f.c(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (a()) {
            b bVar = this.f9558v;
            if (bVar.f5679h != i10) {
                bVar.f5679h = i10;
                bVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        b bVar = this.f9558v;
        if (bVar.j != colorStateList) {
            bVar.j = colorStateList;
            if (bVar.b(false) != null) {
                M.a.h(bVar.b(false), bVar.j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        b bVar = this.f9558v;
        if (bVar.f5680i != mode) {
            bVar.f5680i = mode;
            if (bVar.b(false) == null || bVar.f5680i == null) {
                return;
            }
            M.a.i(bVar.b(false), bVar.f5680i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z6) {
        this.f9558v.f5688r = z6;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f9555G);
    }
}
