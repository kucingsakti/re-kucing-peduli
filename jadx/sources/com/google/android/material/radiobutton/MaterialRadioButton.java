package com.google.android.material.radiobutton;

import C8.E;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p.C0740z;
import p000a0.b;
import p091j3.C;
import p225x3.a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialRadioButton extends C0740z {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[][] f9780y = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f9781w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9782x;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.kcstream.cing.R.attr.radioButtonStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayI = C.i(context2, attributeSet, Q2.a.f3990A, com.kcstream.cing.R.attr.radioButtonStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayI.hasValue(0)) {
            b.c(this, E.n(context2, typedArrayI, 0));
        }
        this.f9782x = typedArrayI.getBoolean(1, false);
        typedArrayI.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9781w == null) {
            int iG = J7.a.g(this, com.kcstream.cing.R.attr.colorControlActivated);
            int iG2 = J7.a.g(this, com.kcstream.cing.R.attr.colorOnSurface);
            int iG3 = J7.a.g(this, com.kcstream.cing.R.attr.colorSurface);
            this.f9781w = new ColorStateList(f9780y, new int[]{J7.a.n(iG3, 1.0f, iG), J7.a.n(iG3, 0.54f, iG2), J7.a.n(iG3, 0.38f, iG2), J7.a.n(iG3, 0.38f, iG2)});
        }
        return this.f9781w;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9782x && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f9782x = z6;
        if (z6) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
