package com.google.android.material.card;

import C8.E;
import D3.b;
import Z2.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import p068ga.l;
import p091j3.C;
import p170r3.f;
import p170r3.g;
import p170r3.j;
import p170r3.u;
import p202v.a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends a implements Checkable, u {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f9575D = {R.attr.state_checkable};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f9576E = {R.attr.state_checked};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f9577F = {com.kcstream.cing.R.attr.state_dragged};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f9578A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9579B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9580C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c f9581z;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(p225x3.a.a(context, attributeSet, com.kcstream.cing.R.attr.materialCardViewStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_CardView), attributeSet, com.kcstream.cing.R.attr.materialCardViewStyle);
        this.f9579B = false;
        this.f9580C = false;
        this.f9578A = true;
        TypedArray typedArrayI = C.i(getContext(), attributeSet, Q2.a.f4030y, com.kcstream.cing.R.attr.materialCardViewStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_CardView, new int[0]);
        c cVar = new c(this, attributeSet);
        this.f9581z = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        g gVar = cVar.f5833c;
        gVar.l(cardBackgroundColor);
        cVar.f5832b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.l();
        MaterialCardView materialCardView = cVar.a;
        ColorStateList colorStateListN = E.n(materialCardView.getContext(), typedArrayI, 11);
        cVar.f5843n = colorStateListN;
        if (colorStateListN == null) {
            cVar.f5843n = ColorStateList.valueOf(-1);
        }
        cVar.f5838h = typedArrayI.getDimensionPixelSize(12, 0);
        boolean z6 = typedArrayI.getBoolean(0, false);
        cVar.f5848s = z6;
        materialCardView.setLongClickable(z6);
        cVar.f5841l = E.n(materialCardView.getContext(), typedArrayI, 6);
        cVar.g(E.q(materialCardView.getContext(), typedArrayI, 2));
        cVar.f5836f = typedArrayI.getDimensionPixelSize(5, 0);
        cVar.f5835e = typedArrayI.getDimensionPixelSize(4, 0);
        cVar.f5837g = typedArrayI.getInteger(3, 8388661);
        ColorStateList colorStateListN2 = E.n(materialCardView.getContext(), typedArrayI, 7);
        cVar.f5840k = colorStateListN2;
        if (colorStateListN2 == null) {
            cVar.f5840k = ColorStateList.valueOf(J7.a.g(materialCardView, com.kcstream.cing.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListN3 = E.n(materialCardView.getContext(), typedArrayI, 1);
        g gVar2 = cVar.f5834d;
        gVar2.l(colorStateListN3 == null ? ColorStateList.valueOf(0) : colorStateListN3);
        int[] iArr = p149p3.a.a;
        RippleDrawable rippleDrawable = cVar.f5844o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.f5840k);
        }
        gVar.k(materialCardView.getCardElevation());
        float f10 = cVar.f5838h;
        ColorStateList colorStateList = cVar.f5843n;
        gVar2.f14501s.j = f10;
        gVar2.invalidateSelf();
        f fVar = gVar2.f14501s;
        if (fVar.f14473d != colorStateList) {
            fVar.f14473d = colorStateList;
            gVar2.onStateChange(gVar2.getState());
        }
        materialCardView.setBackgroundInternal(cVar.d(gVar));
        Drawable drawableC = cVar.j() ? cVar.c() : gVar2;
        cVar.f5839i = drawableC;
        materialCardView.setForeground(cVar.d(drawableC));
        typedArrayI.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f9581z.f5833c.getBounds());
        return rectF;
    }

    public final void b() {
        c cVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (cVar = this.f9581z).f5844o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i10 = bounds.bottom;
        cVar.f5844o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
        cVar.f5844o.setBounds(bounds.left, bounds.top, bounds.right, i10);
    }

    @Override // p202v.a
    public ColorStateList getCardBackgroundColor() {
        return this.f9581z.f5833c.f14501s.f14472c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f9581z.f5834d.f14501s.f14472c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f9581z.j;
    }

    public int getCheckedIconGravity() {
        return this.f9581z.f5837g;
    }

    public int getCheckedIconMargin() {
        return this.f9581z.f5835e;
    }

    public int getCheckedIconSize() {
        return this.f9581z.f5836f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f9581z.f5841l;
    }

    @Override // p202v.a
    public int getContentPaddingBottom() {
        return this.f9581z.f5832b.bottom;
    }

    @Override // p202v.a
    public int getContentPaddingLeft() {
        return this.f9581z.f5832b.left;
    }

    @Override // p202v.a
    public int getContentPaddingRight() {
        return this.f9581z.f5832b.right;
    }

    @Override // p202v.a
    public int getContentPaddingTop() {
        return this.f9581z.f5832b.top;
    }

    public float getProgress() {
        return this.f9581z.f5833c.f14501s.f14478i;
    }

    @Override // p202v.a
    public float getRadius() {
        return this.f9581z.f5833c.h();
    }

    public ColorStateList getRippleColor() {
        return this.f9581z.f5840k;
    }

    public j getShapeAppearanceModel() {
        return this.f9581z.f5842m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f9581z.f5843n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f9581z.f5843n;
    }

    public int getStrokeWidth() {
        return this.f9581z.f5838h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f9579B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.f9581z;
        cVar.k();
        b.E(this, cVar.f5833c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        c cVar = this.f9581z;
        if (cVar != null && cVar.f5848s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9575D);
        }
        if (this.f9579B) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9576E);
        }
        if (this.f9580C) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9577F);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f9579B);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.f9581z;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f5848s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f9579B);
    }

    @Override // p202v.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f9581z.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f9578A) {
            c cVar = this.f9581z;
            if (!cVar.f5847r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                cVar.f5847r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // p202v.a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f9581z.f5833c.l(colorStateList);
    }

    @Override // p202v.a
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        c cVar = this.f9581z;
        cVar.f5833c.k(cVar.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        g gVar = this.f9581z.f5834d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.l(colorStateList);
    }

    public void setCheckable(boolean z6) {
        this.f9581z.f5848s = z6;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (this.f9579B != z6) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f9581z.g(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        c cVar = this.f9581z;
        if (cVar.f5837g != i10) {
            cVar.f5837g = i10;
            MaterialCardView materialCardView = cVar.a;
            cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f9581z.f5835e = i10;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f9581z.f5835e = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f9581z.g(l.g(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f9581z.f5836f = i10;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f9581z.f5836f = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.f9581z;
        cVar.f5841l = colorStateList;
        Drawable drawable = cVar.j;
        if (drawable != null) {
            M.a.h(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z6) {
        super.setClickable(z6);
        c cVar = this.f9581z;
        if (cVar != null) {
            cVar.k();
        }
    }

    public void setDragged(boolean z6) {
        if (this.f9580C != z6) {
            this.f9580C = z6;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // p202v.a
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f9581z.m();
    }

    @Override // p202v.a
    public void setPreventCornerOverlap(boolean z6) {
        super.setPreventCornerOverlap(z6);
        c cVar = this.f9581z;
        cVar.m();
        cVar.l();
    }

    public void setProgress(float f10) {
        c cVar = this.f9581z;
        cVar.f5833c.m(f10);
        g gVar = cVar.f5834d;
        if (gVar != null) {
            gVar.m(f10);
        }
        g gVar2 = cVar.f5846q;
        if (gVar2 != null) {
            gVar2.m(f10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    @Override // p202v.a
    public void setRadius(float f10) {
        super.setRadius(f10);
        c cVar = this.f9581z;
        I4.b bVarF = cVar.f5842m.f();
        bVarF.c(f10);
        cVar.h(bVarF.a());
        cVar.f5839i.invalidateSelf();
        if (cVar.i()) {
            cVar.l();
        } else if (cVar.a.getPreventCornerOverlap()) {
            g gVar = cVar.f5833c;
            if (!gVar.f14501s.a.e(gVar.g())) {
                cVar.l();
            }
        }
        if (cVar.i()) {
            cVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.f9581z;
        cVar.f5840k = colorStateList;
        int[] iArr = p149p3.a.a;
        RippleDrawable rippleDrawable = cVar.f5844o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        ColorStateList colorStateListC = J.f.c(getContext(), i10);
        c cVar = this.f9581z;
        cVar.f5840k = colorStateListC;
        int[] iArr = p149p3.a.a;
        RippleDrawable rippleDrawable = cVar.f5844o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListC);
        }
    }

    @Override // p170r3.u
    public void setShapeAppearanceModel(j jVar) {
        setClipToOutline(jVar.e(getBoundsAsRectF()));
        this.f9581z.h(jVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        c cVar = this.f9581z;
        if (i10 != cVar.f5838h) {
            cVar.f5838h = i10;
            g gVar = cVar.f5834d;
            ColorStateList colorStateList = cVar.f5843n;
            gVar.f14501s.j = i10;
            gVar.invalidateSelf();
            f fVar = gVar.f14501s;
            if (fVar.f14473d != colorStateList) {
                fVar.f14473d = colorStateList;
                gVar.onStateChange(gVar.getState());
            }
        }
        invalidate();
    }

    @Override // p202v.a
    public void setUseCompatPadding(boolean z6) {
        super.setUseCompatPadding(z6);
        c cVar = this.f9581z;
        cVar.m();
        cVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        c cVar = this.f9581z;
        if (cVar != null && cVar.f5848s && isEnabled()) {
            this.f9579B = !this.f9579B;
            refreshDrawableState();
            b();
            cVar.f(this.f9579B, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.f9581z;
        if (cVar.f5843n != colorStateList) {
            cVar.f5843n = colorStateList;
            g gVar = cVar.f5834d;
            gVar.f14501s.j = cVar.f5838h;
            gVar.invalidateSelf();
            f fVar = gVar.f14501s;
            if (fVar.f14473d != colorStateList) {
                fVar.f14473d = colorStateList;
                gVar.onStateChange(gVar.getState());
            }
        }
        invalidate();
    }

    @Override // p202v.a
    public void setCardBackgroundColor(int i10) {
        this.f9581z.f5833c.l(ColorStateList.valueOf(i10));
    }

    public void setOnCheckedChangeListener(Z2.a aVar) {
    }
}
