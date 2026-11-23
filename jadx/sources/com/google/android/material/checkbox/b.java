package com.google.android.material.checkbox;

import B4.L;
import C8.E;
import K.i;
import K.o;
import W0.d;
import W0.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.kcstream.cing.R;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xmlpull.v1.XmlPullParserException;
import p.C0721p;
import p068ga.l;
import p091j3.C;
import p129n3.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C0721p {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int[] f9586Q = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int[] f9587R = {R.attr.state_error};

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int[][] f9588S = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int f9589T = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f9590A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9591B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public CharSequence f9592C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Drawable f9593D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Drawable f9594E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f9595F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ColorStateList f9596G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ColorStateList f9597H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public PorterDuff.Mode f9598I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f9599J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int[] f9600K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f9601L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public CharSequence f9602M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f9603N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final e f9604O;
    public final c P;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashSet f9605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinkedHashSet f9606x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f9607y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9608z;

    public b(Context context, AttributeSet attributeSet) {
        e eVar;
        int next;
        super(p225x3.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f9605w = new LinkedHashSet();
        this.f9606x = new LinkedHashSet();
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            eVar = new e(context2);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal threadLocal = o.a;
            Drawable drawableA = i.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
            eVar.f5261s = drawableA;
            drawableA.setCallback(eVar.f5259x);
            new L1.b(eVar.f5261s.getConstantState(), 1);
        } else {
            int i10 = e.f5254y;
            try {
                XmlResourceParser xml = context2.getResources().getXml(R.drawable.mtrl_checkbox_button_checked_unchecked);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                Resources resources2 = context2.getResources();
                Resources.Theme theme2 = context2.getTheme();
                e eVar2 = new e(context2);
                eVar2.inflate(resources2, xml, attributeSetAsAttributeSet, theme2);
                eVar = eVar2;
            } catch (IOException | XmlPullParserException unused) {
                eVar = null;
            }
        }
        this.f9604O = eVar;
        this.P = new c(this, 2);
        Context context3 = getContext();
        this.f9593D = p000a0.c.a(this);
        this.f9596G = getSuperButtonTintList();
        setSupportButtonTintList(null);
        Y1.c cVarJ = C.j(context3, attributeSet, Q2.a.f4031z, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        this.f9594E = cVarJ.v(2);
        Drawable drawable = this.f9593D;
        TypedArray typedArray = (TypedArray) cVarJ.f5671u;
        if (drawable != null && C4.a.C(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == f9589T && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f9593D = l.g(context3, R.drawable.mtrl_checkbox_button);
                this.f9595F = true;
                if (this.f9594E == null) {
                    this.f9594E = l.g(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f9597H = E.m(context3, cVarJ, 3);
        this.f9598I = C.k(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f9608z = typedArray.getBoolean(10, false);
        this.f9590A = typedArray.getBoolean(6, true);
        this.f9591B = typedArray.getBoolean(9, false);
        this.f9592C = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        cVarJ.J();
        a();
    }

    private String getButtonStateDescription() {
        int i10 = this.f9599J;
        if (i10 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i10 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9607y == null) {
            int iG = J7.a.g(this, R.attr.colorControlActivated);
            int iG2 = J7.a.g(this, R.attr.colorError);
            int iG3 = J7.a.g(this, R.attr.colorSurface);
            int iG4 = J7.a.g(this, R.attr.colorOnSurface);
            this.f9607y = new ColorStateList(f9588S, new int[]{J7.a.n(iG3, 1.0f, iG2), J7.a.n(iG3, 1.0f, iG), J7.a.n(iG3, 0.54f, iG4), J7.a.n(iG3, 0.38f, iG4), J7.a.n(iG3, 0.38f, iG4)});
        }
        return this.f9607y;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f9596G;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        L l4;
        Drawable drawableMutate = this.f9593D;
        ColorStateList colorStateList3 = this.f9596G;
        PorterDuff.Mode modeB = p000a0.b.b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeB != null) {
                M.a.i(drawableMutate, modeB);
            }
        }
        this.f9593D = drawableMutate;
        Drawable drawableMutate2 = this.f9594E;
        ColorStateList colorStateList4 = this.f9597H;
        PorterDuff.Mode mode = this.f9598I;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                M.a.i(drawableMutate2, mode);
            }
        }
        this.f9594E = drawableMutate2;
        if (this.f9595F) {
            e eVar = this.f9604O;
            if (eVar != null) {
                Drawable drawable = eVar.f5261s;
                c cVar = this.P;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (cVar.a == null) {
                        cVar.a = new W0.b(cVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(cVar.a);
                }
                ArrayList arrayList = eVar.f5258w;
                d dVar = eVar.f5255t;
                if (arrayList != null && cVar != null) {
                    arrayList.remove(cVar);
                    if (eVar.f5258w.size() == 0 && (l4 = eVar.f5257v) != null) {
                        dVar.f5251b.removeListener(l4);
                        eVar.f5257v = null;
                    }
                }
                Drawable drawable2 = eVar.f5261s;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (cVar.a == null) {
                        cVar.a = new W0.b(cVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(cVar.a);
                } else if (cVar != null) {
                    if (eVar.f5258w == null) {
                        eVar.f5258w = new ArrayList();
                    }
                    if (!eVar.f5258w.contains(cVar)) {
                        eVar.f5258w.add(cVar);
                        if (eVar.f5257v == null) {
                            eVar.f5257v = new L(eVar, 4);
                        }
                        dVar.f5251b.addListener(eVar.f5257v);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f9593D;
                if ((drawable3 instanceof AnimatedStateListDrawable) && eVar != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, eVar, false);
                    ((AnimatedStateListDrawable) this.f9593D).addTransition(R.id.indeterminate, R.id.unchecked, eVar, false);
                }
            }
        }
        Drawable drawable4 = this.f9593D;
        if (drawable4 != null && (colorStateList2 = this.f9596G) != null) {
            M.a.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f9594E;
        if (drawable5 != null && (colorStateList = this.f9597H) != null) {
            M.a.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f9593D;
        Drawable drawable7 = this.f9594E;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f10 = intrinsicWidth / intrinsicHeight;
                if (f10 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f10);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f10 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f9593D;
    }

    public Drawable getButtonIconDrawable() {
        return this.f9594E;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f9597H;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f9598I;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f9596G;
    }

    public int getCheckedState() {
        return this.f9599J;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f9592C;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f9599J == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9608z && this.f9596G == null && this.f9597H == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9586Q);
        }
        if (this.f9591B) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9587R);
        }
        for (int i11 = 0; i11 < iArrOnCreateDrawableState.length; i11++) {
            int i12 = iArrOnCreateDrawableState[i11];
            if (i12 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i12 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i11] = 16842912;
            }
            this.f9600K = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.f9600K = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f9590A || !TextUtils.isEmpty(getText()) || (drawableA = p000a0.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (C.h(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            M.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f9591B) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f9592C));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MaterialCheckBox$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MaterialCheckBox$SavedState materialCheckBox$SavedState = (MaterialCheckBox$SavedState) parcelable;
        super.onRestoreInstanceState(materialCheckBox$SavedState.getSuperState());
        setCheckedState(materialCheckBox$SavedState.f9585s);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        MaterialCheckBox$SavedState materialCheckBox$SavedState = new MaterialCheckBox$SavedState(super.onSaveInstanceState());
        materialCheckBox$SavedState.f9585s = getCheckedState();
        return materialCheckBox$SavedState;
    }

    @Override // p.C0721p, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(l.g(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f9594E = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(l.g(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f9597H == colorStateList) {
            return;
        }
        this.f9597H = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f9598I == mode) {
            return;
        }
        this.f9598I = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f9596G == colorStateList) {
            return;
        }
        this.f9596G = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z6) {
        this.f9590A = z6;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        setCheckedState(z6 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f9599J != i10) {
            this.f9599J = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && this.f9602M == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f9601L) {
                return;
            }
            this.f9601L = true;
            LinkedHashSet linkedHashSet = this.f9606x;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw E0.a.e(it);
                }
            }
            if (this.f9599J != 2 && (onCheckedChangeListener = this.f9603N) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i11 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f9601L = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f9592C = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z6) {
        if (this.f9591B == z6) {
            return;
        }
        this.f9591B = z6;
        refreshDrawableState();
        Iterator it = this.f9605w.iterator();
        if (it.hasNext()) {
            throw E0.a.e(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f9603N = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f9602M = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f9608z = z6;
        if (z6) {
            p000a0.b.c(this, getMaterialThemeColorsTintList());
        } else {
            p000a0.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p.C0721p, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f9593D = drawable;
        this.f9595F = false;
        a();
    }
}
