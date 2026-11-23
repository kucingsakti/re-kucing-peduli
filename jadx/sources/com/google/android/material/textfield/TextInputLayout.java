package com.google.android.material.textfield;

import A1.J;
import C8.E;
import I4.b;
import J.f;
import U.K;
import U.U;
import V0.C0453h;
import Y1.c;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p.AbstractC0710j0;
import p.X;
import p091j3.AbstractC0667b;
import p091j3.C;
import p091j3.C0666a;
import p170r3.e;
import p170r3.g;
import p170r3.i;
import p170r3.j;
import p181s3.d;
import p215w3.k;
import p215w3.l;
import p215w3.o;
import p215w3.p;
import p215w3.r;
import p215w3.t;
import p215w3.u;
import p215w3.v;
import p215w3.w;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] U0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f9855A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ColorStateList f9856A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p f9857B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ColorStateList f9858B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9859C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f9860C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f9861D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f9862D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f9863E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f9864E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public w f9865F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public ColorStateList f9866F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public X f9867G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f9868G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f9869H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f9870H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f9871I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f9872I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public CharSequence f9873J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f9874J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f9875K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f9876K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public X f9877L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public int f9878L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ColorStateList f9879M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f9880M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f9881N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final C0666a f9882N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C0453h f9883O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public boolean f9884O0;
    public C0453h P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public boolean f9885P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ColorStateList f9886Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public ValueAnimator f9887Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ColorStateList f9888R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f9889R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ColorStateList f9890S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f9891S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ColorStateList f9892T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public boolean f9893T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f9894U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public CharSequence f9895V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f9896W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public g f9897a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public g f9898b0;
    public StateListDrawable c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f9899d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public g f9900e0;
    public g f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public j f9901g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f9902h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final int f9903i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f9904j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f9905k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f9906l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f9907m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f9908n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f9909o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f9910p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Rect f9911q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Rect f9912r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FrameLayout f9913s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final RectF f9914s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f9915t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Typeface f9916t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l f9917u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ColorDrawable f9918u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public EditText f9919v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f9920v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f9921w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final LinkedHashSet f9922w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9923x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ColorDrawable f9924x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9925y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f9926y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9927z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Drawable f9928z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public CharSequence f9929u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f9930v;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9929u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f9930v = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f9929u) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f9929u, parcel, i10);
            parcel.writeInt(this.f9930v ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(p225x3.a.a(context, attributeSet, com.kcstream.cing.R.attr.textInputStyle, com.kcstream.cing.R.style.Widget_Design_TextInputLayout), attributeSet, com.kcstream.cing.R.attr.textInputStyle);
        this.f9923x = -1;
        this.f9925y = -1;
        this.f9927z = -1;
        this.f9855A = -1;
        this.f9857B = new p(this);
        this.f9865F = new Y9.a(18);
        this.f9911q0 = new Rect();
        this.f9912r0 = new Rect();
        this.f9914s0 = new RectF();
        this.f9922w0 = new LinkedHashSet();
        C0666a c0666a = new C0666a(this);
        this.f9882N0 = c0666a;
        this.f9893T0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f9913s = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = R2.a.a;
        c0666a.f12388Q = linearInterpolator;
        c0666a.h(false);
        c0666a.P = linearInterpolator;
        c0666a.h(false);
        if (c0666a.f12407g != 8388659) {
            c0666a.f12407g = 8388659;
            c0666a.h(false);
        }
        c cVarJ = C.j(context2, attributeSet, Q2.a.f4006R, com.kcstream.cing.R.attr.textInputStyle, com.kcstream.cing.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        t tVar = new t(this, cVarJ);
        this.f9915t = tVar;
        TypedArray typedArray = (TypedArray) cVarJ.f5671u;
        this.f9894U = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.f9885P0 = typedArray.getBoolean(47, true);
        this.f9884O0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.f9901g0 = j.c(context2, attributeSet, com.kcstream.cing.R.attr.textInputStyle, com.kcstream.cing.R.style.Widget_Design_TextInputLayout).a();
        this.f9903i0 = context2.getResources().getDimensionPixelOffset(com.kcstream.cing.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f9905k0 = typedArray.getDimensionPixelOffset(9, 0);
        this.f9907m0 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.kcstream.cing.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f9908n0 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.kcstream.cing.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f9906l0 = this.f9907m0;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        b bVarF = this.f9901g0.f();
        if (dimension >= 0.0f) {
            bVarF.f2072e = new p170r3.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            bVarF.f2073f = new p170r3.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            bVarF.f2074g = new p170r3.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            bVarF.f2075h = new p170r3.a(dimension4);
        }
        this.f9901g0 = bVarF.a();
        ColorStateList colorStateListM = E.m(context2, cVarJ, 7);
        if (colorStateListM != null) {
            int defaultColor = colorStateListM.getDefaultColor();
            this.f9868G0 = defaultColor;
            this.f9910p0 = defaultColor;
            if (colorStateListM.isStateful()) {
                this.f9870H0 = colorStateListM.getColorForState(new int[]{-16842910}, -1);
                this.f9872I0 = colorStateListM.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f9874J0 = colorStateListM.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f9872I0 = this.f9868G0;
                ColorStateList colorStateListC = f.c(context2, com.kcstream.cing.R.color.mtrl_filled_background_color);
                this.f9870H0 = colorStateListC.getColorForState(new int[]{-16842910}, -1);
                this.f9874J0 = colorStateListC.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f9910p0 = 0;
            this.f9868G0 = 0;
            this.f9870H0 = 0;
            this.f9872I0 = 0;
            this.f9874J0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListU = cVarJ.u(1);
            this.f9858B0 = colorStateListU;
            this.f9856A0 = colorStateListU;
        }
        ColorStateList colorStateListM2 = E.m(context2, cVarJ, 14);
        this.f9864E0 = typedArray.getColor(14, 0);
        this.f9860C0 = J.b.a(context2, com.kcstream.cing.R.color.mtrl_textinput_default_box_stroke_color);
        this.f9876K0 = J.b.a(context2, com.kcstream.cing.R.color.mtrl_textinput_disabled_color);
        this.f9862D0 = J.b.a(context2, com.kcstream.cing.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM2 != null) {
            setBoxStrokeColorStateList(colorStateListM2);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(E.m(context2, cVarJ, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.f9890S = cVarJ.u(24);
        this.f9892T = cVarJ.u(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i10 = typedArray.getInt(34, 1);
        boolean z6 = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z10 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(57, 0);
        CharSequence text3 = typedArray.getText(56);
        boolean z11 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.f9871I = typedArray.getResourceId(22, 0);
        this.f9869H = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i10);
        setCounterOverflowTextAppearance(this.f9869H);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f9871I);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(cVarJ.u(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(cVarJ.u(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(cVarJ.u(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(cVarJ.u(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(cVarJ.u(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(cVarJ.u(58));
        }
        l lVar = new l(this, cVarJ);
        this.f9917u = lVar;
        boolean z12 = typedArray.getBoolean(0, true);
        cVarJ.J();
        setImportantForAccessibility(2);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && i11 >= 26) {
            K.m(this, 1);
        }
        frameLayout.addView(tVar);
        frameLayout.addView(lVar);
        addView(frameLayout);
        setEnabled(z12);
        setHelperTextEnabled(z10);
        setErrorEnabled(z6);
        setCounterEnabled(z11);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f9919v;
        if (!(editText instanceof AutoCompleteTextView) || E.t(editText)) {
            return this.f9897a0;
        }
        int iG = J7.a.g(this.f9919v, com.kcstream.cing.R.attr.colorControlHighlight);
        int i10 = this.f9904j0;
        int[][] iArr = U0;
        if (i10 != 2) {
            if (i10 != 1) {
                return null;
            }
            g gVar = this.f9897a0;
            int i11 = this.f9910p0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{J7.a.n(iG, 0.1f, i11), i11}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.f9897a0;
        TypedValue typedValueD = C4.a.D(com.kcstream.cing.R.attr.colorSurface, context, "TextInputLayout");
        int i12 = typedValueD.resourceId;
        int iA = i12 != 0 ? J.b.a(context, i12) : typedValueD.data;
        g gVar3 = new g(gVar2.f14501s.a);
        int iN = J7.a.n(iG, 0.1f, iA);
        gVar3.l(new ColorStateList(iArr, new int[]{iN, 0}));
        gVar3.setTint(iA);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iN, iA});
        g gVar4 = new g(gVar2.f14501s.a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.c0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.c0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.c0.addState(new int[0], f(false));
        }
        return this.c0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f9898b0 == null) {
            this.f9898b0 = f(true);
        }
        return this.f9898b0;
    }

    public static void k(ViewGroup viewGroup, boolean z6) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z6);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z6);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f9919v != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f9919v = editText;
        int i10 = this.f9923x;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f9927z);
        }
        int i11 = this.f9925y;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f9855A);
        }
        this.f9899d0 = false;
        i();
        setTextInputAccessibilityDelegate(new v(this));
        Typeface typeface = this.f9919v.getTypeface();
        C0666a c0666a = this.f9882N0;
        c0666a.m(typeface);
        float textSize = this.f9919v.getTextSize();
        if (c0666a.f12408h != textSize) {
            c0666a.f12408h = textSize;
            c0666a.h(false);
        }
        int i12 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f9919v.getLetterSpacing();
        if (c0666a.f12394W != letterSpacing) {
            c0666a.f12394W = letterSpacing;
            c0666a.h(false);
        }
        int gravity = this.f9919v.getGravity();
        int i13 = (gravity & (-113)) | 48;
        if (c0666a.f12407g != i13) {
            c0666a.f12407g = i13;
            c0666a.h(false);
        }
        if (c0666a.f12406f != gravity) {
            c0666a.f12406f = gravity;
            c0666a.h(false);
        }
        WeakHashMap weakHashMap = U.a;
        this.f9878L0 = editText.getMinimumHeight();
        this.f9919v.addTextChangedListener(new u(this, editText));
        if (this.f9856A0 == null) {
            this.f9856A0 = this.f9919v.getHintTextColors();
        }
        if (this.f9894U) {
            if (TextUtils.isEmpty(this.f9895V)) {
                CharSequence hint = this.f9919v.getHint();
                this.f9921w = hint;
                setHint(hint);
                this.f9919v.setHint((CharSequence) null);
            }
            this.f9896W = true;
        }
        if (i12 >= 29) {
            p();
        }
        if (this.f9867G != null) {
            n(this.f9919v.getText());
        }
        r();
        this.f9857B.b();
        this.f9915t.bringToFront();
        l lVar = this.f9917u;
        lVar.bringToFront();
        Iterator it = this.f9922w0.iterator();
        while (it.hasNext()) {
            ((k) it.next()).a(this);
        }
        lVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f9895V)) {
            return;
        }
        this.f9895V = charSequence;
        C0666a c0666a = this.f9882N0;
        if (charSequence == null || !TextUtils.equals(c0666a.f12373A, charSequence)) {
            c0666a.f12373A = charSequence;
            c0666a.f12374B = null;
            Bitmap bitmap = c0666a.f12377E;
            if (bitmap != null) {
                bitmap.recycle();
                c0666a.f12377E = null;
            }
            c0666a.h(false);
        }
        if (this.f9880M0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z6) {
        if (this.f9875K == z6) {
            return;
        }
        if (z6) {
            X x8 = this.f9877L;
            if (x8 != null) {
                this.f9913s.addView(x8);
                this.f9877L.setVisibility(0);
            }
        } else {
            X x10 = this.f9877L;
            if (x10 != null) {
                x10.setVisibility(8);
            }
            this.f9877L = null;
        }
        this.f9875K = z6;
    }

    public final void a(float f10) {
        C0666a c0666a = this.f9882N0;
        if (c0666a.f12399b == f10) {
            return;
        }
        if (this.f9887Q0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f9887Q0 = valueAnimator;
            valueAnimator.setInterpolator(J7.j.D(getContext(), com.kcstream.cing.R.attr.motionEasingEmphasizedInterpolator, R2.a.f4441b));
            this.f9887Q0.setDuration(J7.j.C(getContext(), com.kcstream.cing.R.attr.motionDurationMedium4, 167));
            this.f9887Q0.addUpdateListener(new B4.K(this, 12));
        }
        this.f9887Q0.setFloatValues(c0666a.f12399b, f10);
        this.f9887Q0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f9913s;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i10;
        int i11;
        g gVar = this.f9897a0;
        if (gVar == null) {
            return;
        }
        j jVar = gVar.f14501s.a;
        j jVar2 = this.f9901g0;
        if (jVar != jVar2) {
            gVar.setShapeAppearanceModel(jVar2);
        }
        if (this.f9904j0 == 2 && (i10 = this.f9906l0) > -1 && (i11 = this.f9909o0) != 0) {
            g gVar2 = this.f9897a0;
            gVar2.f14501s.j = i10;
            gVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i11);
            p170r3.f fVar = gVar2.f14501s;
            if (fVar.f14473d != colorStateListValueOf) {
                fVar.f14473d = colorStateListValueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int iB = this.f9910p0;
        if (this.f9904j0 == 1) {
            iB = L.a.b(this.f9910p0, J7.a.f(getContext(), com.kcstream.cing.R.attr.colorSurface, 0));
        }
        this.f9910p0 = iB;
        this.f9897a0.l(ColorStateList.valueOf(iB));
        g gVar3 = this.f9900e0;
        if (gVar3 != null && this.f0 != null) {
            if (this.f9906l0 > -1 && this.f9909o0 != 0) {
                gVar3.l(this.f9919v.isFocused() ? ColorStateList.valueOf(this.f9860C0) : ColorStateList.valueOf(this.f9909o0));
                this.f0.l(ColorStateList.valueOf(this.f9909o0));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fD;
        if (!this.f9894U) {
            return 0;
        }
        int i10 = this.f9904j0;
        C0666a c0666a = this.f9882N0;
        if (i10 == 0) {
            fD = c0666a.d();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fD = c0666a.d() / 2.0f;
        }
        return (int) fD;
    }

    public final C0453h d() {
        C0453h c0453h = new C0453h();
        c0453h.f5151u = J7.j.C(getContext(), com.kcstream.cing.R.attr.motionDurationShort2, 87);
        c0453h.f5152v = J7.j.D(getContext(), com.kcstream.cing.R.attr.motionEasingLinearInterpolator, R2.a.a);
        return c0453h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f9919v;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f9921w != null) {
            boolean z6 = this.f9896W;
            this.f9896W = false;
            CharSequence hint = editText.getHint();
            this.f9919v.setHint(this.f9921w);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f9919v.setHint(hint);
                this.f9896W = z6;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f9913s;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f9919v) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f9891S0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f9891S0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        super.draw(canvas);
        boolean z6 = this.f9894U;
        C0666a c0666a = this.f9882N0;
        if (z6) {
            c0666a.getClass();
            int iSave = canvas.save();
            if (c0666a.f12374B != null) {
                RectF rectF = c0666a.f12404e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c0666a.f12386N;
                    textPaint.setTextSize(c0666a.f12379G);
                    float f10 = c0666a.f12415p;
                    float f11 = c0666a.f12416q;
                    float f12 = c0666a.f12378F;
                    if (f12 != 1.0f) {
                        canvas.scale(f12, f12, f10, f11);
                    }
                    if (c0666a.f12403d0 <= 1 || c0666a.f12375C) {
                        canvas.translate(f10, f11);
                        c0666a.f12396Y.draw(canvas);
                    } else {
                        float lineStart = c0666a.f12415p - c0666a.f12396Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f11);
                        float f13 = alpha;
                        textPaint.setAlpha((int) (c0666a.f12400b0 * f13));
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(c0666a.f12380H, c0666a.f12381I, c0666a.f12382J, J7.a.c(c0666a.f12383K, textPaint.getAlpha()));
                        }
                        c0666a.f12396Y.draw(canvas);
                        textPaint.setAlpha((int) (c0666a.f12398a0 * f13));
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(c0666a.f12380H, c0666a.f12381I, c0666a.f12382J, J7.a.c(c0666a.f12383K, textPaint.getAlpha()));
                        }
                        int lineBaseline = c0666a.f12396Y.getLineBaseline(0);
                        CharSequence charSequence = c0666a.c0;
                        float f14 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f14, textPaint);
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(c0666a.f12380H, c0666a.f12381I, c0666a.f12382J, c0666a.f12383K);
                        }
                        String strTrim = c0666a.c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c0666a.f12396Y.getLineEnd(0), str.length()), 0.0f, f14, (Paint) textPaint);
                        canvas = canvas;
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.f0 == null || (gVar = this.f9900e0) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f9919v.isFocused()) {
            Rect bounds = this.f0.getBounds();
            Rect bounds2 = this.f9900e0.getBounds();
            float f15 = c0666a.f12399b;
            int iCenterX = bounds2.centerX();
            bounds.left = R2.a.c(iCenterX, f15, bounds2.left);
            bounds.right = R2.a.c(iCenterX, f15, bounds2.right);
            this.f0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z6;
        ColorStateList colorStateList;
        if (this.f9889R0) {
            return;
        }
        this.f9889R0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0666a c0666a = this.f9882N0;
        if (c0666a != null) {
            c0666a.f12384L = drawableState;
            ColorStateList colorStateList2 = c0666a.f12410k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c0666a.j) == null || !colorStateList.isStateful())) {
                z6 = false;
            } else {
                c0666a.h(false);
                z6 = true;
            }
        } else {
            z6 = false;
        }
        if (this.f9919v != null) {
            WeakHashMap weakHashMap = U.a;
            u(isLaidOut() && isEnabled(), false);
        }
        r();
        x();
        if (z6) {
            invalidate();
        }
        this.f9889R0 = false;
    }

    public final boolean e() {
        return this.f9894U && !TextUtils.isEmpty(this.f9895V) && (this.f9897a0 instanceof p215w3.f);
    }

    public final g f(boolean z6) {
        int i10 = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.kcstream.cing.R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = z6 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f9919v;
        float popupElevation = editText instanceof r ? ((r) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.kcstream.cing.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.kcstream.cing.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e(i10);
        e eVar2 = new e(i10);
        e eVar3 = new e(i10);
        e eVar4 = new e(i10);
        p170r3.a aVar = new p170r3.a(f10);
        p170r3.a aVar2 = new p170r3.a(f10);
        p170r3.a aVar3 = new p170r3.a(dimensionPixelOffset);
        p170r3.a aVar4 = new p170r3.a(dimensionPixelOffset);
        j jVar = new j();
        jVar.a = iVar;
        jVar.f14510b = iVar2;
        jVar.f14511c = iVar3;
        jVar.f14512d = iVar4;
        jVar.f14513e = aVar;
        jVar.f14514f = aVar2;
        jVar.f14515g = aVar4;
        jVar.f14516h = aVar3;
        jVar.f14517i = eVar;
        jVar.j = eVar2;
        jVar.f14518k = eVar3;
        jVar.f14519l = eVar4;
        EditText editText2 = this.f9919v;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof r ? ((r) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.P;
            TypedValue typedValueD = C4.a.D(com.kcstream.cing.R.attr.colorSurface, context, g.class.getSimpleName());
            int i11 = typedValueD.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i11 != 0 ? J.b.a(context, i11) : typedValueD.data);
        }
        g gVar = new g();
        gVar.j(context);
        gVar.l(dropDownBackgroundTintList);
        gVar.k(popupElevation);
        gVar.setShapeAppearanceModel(jVar);
        p170r3.f fVar = gVar.f14501s;
        if (fVar.f14476g == null) {
            fVar.f14476g = new Rect();
        }
        gVar.f14501s.f14476g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i10, boolean z6) {
        int compoundPaddingLeft;
        if (z6 || getPrefixText() == null) {
            compoundPaddingLeft = (!z6 || getSuffixText() == null) ? this.f9919v.getCompoundPaddingLeft() : this.f9917u.c();
        } else {
            compoundPaddingLeft = this.f9915t.a();
        }
        return compoundPaddingLeft + i10;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f9919v;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i10 = this.f9904j0;
        if (i10 == 1 || i10 == 2) {
            return this.f9897a0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f9910p0;
    }

    public int getBoxBackgroundMode() {
        return this.f9904j0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f9905k0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zH = C.h(this);
        RectF rectF = this.f9914s0;
        return zH ? this.f9901g0.f14516h.a(rectF) : this.f9901g0.f14515g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zH = C.h(this);
        RectF rectF = this.f9914s0;
        return zH ? this.f9901g0.f14515g.a(rectF) : this.f9901g0.f14516h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zH = C.h(this);
        RectF rectF = this.f9914s0;
        return zH ? this.f9901g0.f14513e.a(rectF) : this.f9901g0.f14514f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zH = C.h(this);
        RectF rectF = this.f9914s0;
        return zH ? this.f9901g0.f14514f.a(rectF) : this.f9901g0.f14513e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f9864E0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f9866F0;
    }

    public int getBoxStrokeWidth() {
        return this.f9907m0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f9908n0;
    }

    public int getCounterMaxLength() {
        return this.f9861D;
    }

    public CharSequence getCounterOverflowDescription() {
        X x8;
        if (this.f9859C && this.f9863E && (x8 = this.f9867G) != null) {
            return x8.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f9888R;
    }

    public ColorStateList getCounterTextColor() {
        return this.f9886Q;
    }

    public ColorStateList getCursorColor() {
        return this.f9890S;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f9892T;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f9856A0;
    }

    public EditText getEditText() {
        return this.f9919v;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f9917u.f15590y.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f9917u.f15590y.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f9917u.f15574E;
    }

    public int getEndIconMode() {
        return this.f9917u.f15570A;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f9917u.f15575F;
    }

    public CheckableImageButton getEndIconView() {
        return this.f9917u.f15590y;
    }

    public CharSequence getError() {
        p pVar = this.f9857B;
        if (pVar.f15615q) {
            return pVar.f15614p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f9857B.f15618t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f9857B.f15617s;
    }

    public int getErrorCurrentTextColors() {
        X x8 = this.f9857B.f15616r;
        if (x8 != null) {
            return x8.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f9917u.f15586u.getDrawable();
    }

    public CharSequence getHelperText() {
        p pVar = this.f9857B;
        if (pVar.f15622x) {
            return pVar.f15621w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        X x8 = this.f9857B.f15623y;
        if (x8 != null) {
            return x8.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f9894U) {
            return this.f9895V;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f9882N0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0666a c0666a = this.f9882N0;
        return c0666a.e(c0666a.f12410k);
    }

    public ColorStateList getHintTextColor() {
        return this.f9858B0;
    }

    public w getLengthCounter() {
        return this.f9865F;
    }

    public int getMaxEms() {
        return this.f9925y;
    }

    public int getMaxWidth() {
        return this.f9855A;
    }

    public int getMinEms() {
        return this.f9923x;
    }

    public int getMinWidth() {
        return this.f9927z;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f9917u.f15590y.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f9917u.f15590y.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f9875K) {
            return this.f9873J;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f9881N;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f9879M;
    }

    public CharSequence getPrefixText() {
        return this.f9915t.f15642u;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f9915t.f15641t.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f9915t.f15641t;
    }

    public j getShapeAppearanceModel() {
        return this.f9901g0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f9915t.f15643v.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f9915t.f15643v.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f9915t.f15646y;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f9915t.f15647z;
    }

    public CharSequence getSuffixText() {
        return this.f9917u.f15577H;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f9917u.f15578I.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f9917u.f15578I;
    }

    public Typeface getTypeface() {
        return this.f9916t0;
    }

    public final int h(int i10, boolean z6) {
        int compoundPaddingRight;
        if (z6 || getSuffixText() == null) {
            compoundPaddingRight = (!z6 || getPrefixText() == null) ? this.f9919v.getCompoundPaddingRight() : this.f9915t.a();
        } else {
            compoundPaddingRight = this.f9917u.c();
        }
        return i10 - compoundPaddingRight;
    }

    public final void i() {
        int i10 = this.f9904j0;
        if (i10 == 0) {
            this.f9897a0 = null;
            this.f9900e0 = null;
            this.f0 = null;
        } else if (i10 == 1) {
            this.f9897a0 = new g(this.f9901g0);
            this.f9900e0 = new g();
            this.f0 = new g();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(E0.a.j(new StringBuilder(), this.f9904j0, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f9894U || (this.f9897a0 instanceof p215w3.f)) {
                this.f9897a0 = new g(this.f9901g0);
            } else {
                j jVar = this.f9901g0;
                int i11 = p215w3.f.f15553R;
                if (jVar == null) {
                    jVar = new j();
                }
                p215w3.e eVar = new p215w3.e(jVar, new RectF());
                p215w3.f fVar = new p215w3.f(eVar);
                fVar.f15554Q = eVar;
                this.f9897a0 = fVar;
            }
            this.f9900e0 = null;
            this.f0 = null;
        }
        s();
        x();
        if (this.f9904j0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f9905k0 = getResources().getDimensionPixelSize(com.kcstream.cing.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (E.u(getContext())) {
                this.f9905k0 = getResources().getDimensionPixelSize(com.kcstream.cing.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f9919v != null && this.f9904j0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f9919v;
                WeakHashMap weakHashMap = U.a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.kcstream.cing.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f9919v.getPaddingEnd(), getResources().getDimensionPixelSize(com.kcstream.cing.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (E.u(getContext())) {
                EditText editText2 = this.f9919v;
                WeakHashMap weakHashMap2 = U.a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.kcstream.cing.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f9919v.getPaddingEnd(), getResources().getDimensionPixelSize(com.kcstream.cing.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f9904j0 != 0) {
            t();
        }
        EditText editText3 = this.f9919v;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.f9904j0;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    public final void j() {
        float f10;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        int i10;
        float f14;
        int i11;
        if (e()) {
            int width = this.f9919v.getWidth();
            int gravity = this.f9919v.getGravity();
            C0666a c0666a = this.f9882N0;
            boolean zB = c0666a.b(c0666a.f12373A);
            c0666a.f12375C = zB;
            Rect rect = c0666a.f12402d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zB) {
                        i11 = rect.left;
                        f12 = i11;
                    } else {
                        f10 = rect.right;
                        f11 = c0666a.f12397Z;
                    }
                } else if (zB) {
                    f10 = rect.right;
                    f11 = c0666a.f12397Z;
                } else {
                    i11 = rect.left;
                    f12 = i11;
                }
                float fMax = Math.max(f12, rect.left);
                rectF = this.f9914s0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f13 = (width / 2.0f) + (c0666a.f12397Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c0666a.f12375C) {
                        f14 = c0666a.f12397Z;
                        f13 = f14 + fMax;
                    } else {
                        i10 = rect.right;
                        f13 = i10;
                    }
                } else if (c0666a.f12375C) {
                    i10 = rect.right;
                    f13 = i10;
                } else {
                    f14 = c0666a.f12397Z;
                    f13 = f14 + fMax;
                }
                rectF.right = Math.min(f13, rect.right);
                rectF.bottom = c0666a.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f15 = rectF.left;
                float f16 = this.f9903i0;
                rectF.left = f15 - f16;
                rectF.right += f16;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f9906l0);
                p215w3.f fVar = (p215w3.f) this.f9897a0;
                fVar.getClass();
                fVar.r(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f10 = width / 2.0f;
            f11 = c0666a.f12397Z / 2.0f;
            f12 = f10 - f11;
            float fMax2 = Math.max(f12, rect.left);
            rectF = this.f9914s0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f13 = (width / 2.0f) + (c0666a.f12397Z / 2.0f);
            } else {
                f13 = (width / 2.0f) + (c0666a.f12397Z / 2.0f);
            }
            rectF.right = Math.min(f13, rect.right);
            rectF.bottom = c0666a.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(X x8, int i10) {
        try {
            x8.setTextAppearance(i10);
            if (x8.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        x8.setTextAppearance(com.kcstream.cing.R.style.TextAppearance_AppCompat_Caption);
        x8.setTextColor(J.b.a(getContext(), com.kcstream.cing.R.color.design_error));
    }

    public final boolean m() {
        p pVar = this.f9857B;
        return (pVar.f15613o != 1 || pVar.f15616r == null || TextUtils.isEmpty(pVar.f15614p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((Y9.a) this.f9865F).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z6 = this.f9863E;
        int i10 = this.f9861D;
        String string = null;
        if (i10 == -1) {
            this.f9867G.setText(String.valueOf(length));
            this.f9867G.setContentDescription(null);
            this.f9863E = false;
        } else {
            this.f9863E = length > i10;
            Context context = getContext();
            this.f9867G.setContentDescription(context.getString(this.f9863E ? com.kcstream.cing.R.string.character_counter_overflowed_content_description : com.kcstream.cing.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f9861D)));
            if (z6 != this.f9863E) {
                o();
            }
            String str = S.b.f4496b;
            S.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? S.b.f4499e : S.b.f4498d;
            X x8 = this.f9867G;
            String string2 = getContext().getString(com.kcstream.cing.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f9861D));
            if (string2 == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                J j = S.k.a;
                string = bVar.c(string2).toString();
            }
            x8.setText(string);
        }
        if (this.f9919v == null || z6 == this.f9863E) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        X x8 = this.f9867G;
        if (x8 != null) {
            l(x8, this.f9863E ? this.f9869H : this.f9871I);
            if (!this.f9863E && (colorStateList2 = this.f9886Q) != null) {
                this.f9867G.setTextColor(colorStateList2);
            }
            if (!this.f9863E || (colorStateList = this.f9888R) == null) {
                return;
            }
            this.f9867G.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9882N0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        l lVar = this.f9917u;
        lVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z6 = false;
        this.f9893T0 = false;
        if (this.f9919v != null && this.f9919v.getMeasuredHeight() < (iMax = Math.max(lVar.getMeasuredHeight(), this.f9915t.getMeasuredHeight()))) {
            this.f9919v.setMinimumHeight(iMax);
            z6 = true;
        }
        boolean zQ = q();
        if (z6 || zQ) {
            this.f9919v.post(new d(this, 6));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        EditText editText = this.f9919v;
        if (editText != null) {
            Rect rect = this.f9911q0;
            AbstractC0667b.a(this, editText, rect);
            g gVar = this.f9900e0;
            if (gVar != null) {
                int i14 = rect.bottom;
                gVar.setBounds(rect.left, i14 - this.f9907m0, rect.right, i14);
            }
            g gVar2 = this.f0;
            if (gVar2 != null) {
                int i15 = rect.bottom;
                gVar2.setBounds(rect.left, i15 - this.f9908n0, rect.right, i15);
            }
            if (this.f9894U) {
                float textSize = this.f9919v.getTextSize();
                C0666a c0666a = this.f9882N0;
                if (c0666a.f12408h != textSize) {
                    c0666a.f12408h = textSize;
                    c0666a.h(false);
                }
                int gravity = this.f9919v.getGravity();
                int i16 = (gravity & (-113)) | 48;
                if (c0666a.f12407g != i16) {
                    c0666a.f12407g = i16;
                    c0666a.h(false);
                }
                if (c0666a.f12406f != gravity) {
                    c0666a.f12406f = gravity;
                    c0666a.h(false);
                }
                if (this.f9919v == null) {
                    throw new IllegalStateException();
                }
                boolean zH = C.h(this);
                int i17 = rect.bottom;
                Rect rect2 = this.f9912r0;
                rect2.bottom = i17;
                int i18 = this.f9904j0;
                if (i18 == 1) {
                    rect2.left = g(rect.left, zH);
                    rect2.top = rect.top + this.f9905k0;
                    rect2.right = h(rect.right, zH);
                } else if (i18 != 2) {
                    rect2.left = g(rect.left, zH);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zH);
                } else {
                    rect2.left = this.f9919v.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f9919v.getPaddingRight();
                }
                int i19 = rect2.left;
                int i20 = rect2.top;
                int i21 = rect2.right;
                int i22 = rect2.bottom;
                Rect rect3 = c0666a.f12402d;
                if (rect3.left != i19 || rect3.top != i20 || rect3.right != i21 || rect3.bottom != i22) {
                    rect3.set(i19, i20, i21, i22);
                    c0666a.f12385M = true;
                }
                if (this.f9919v == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c0666a.f12387O;
                textPaint.setTextSize(c0666a.f12408h);
                textPaint.setTypeface(c0666a.f12420u);
                textPaint.setLetterSpacing(c0666a.f12394W);
                float f10 = -textPaint.ascent();
                rect2.left = this.f9919v.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f9904j0 != 1 || this.f9919v.getMinLines() > 1) ? rect.top + this.f9919v.getCompoundPaddingTop() : (int) (rect.centerY() - (f10 / 2.0f));
                rect2.right = rect.right - this.f9919v.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f9904j0 != 1 || this.f9919v.getMinLines() > 1) ? rect.bottom - this.f9919v.getCompoundPaddingBottom() : (int) (rect2.top + f10);
                rect2.bottom = compoundPaddingBottom;
                int i23 = rect2.left;
                int i24 = rect2.top;
                int i25 = rect2.right;
                Rect rect4 = c0666a.f12401c;
                if (rect4.left != i23 || rect4.top != i24 || rect4.right != i25 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i23, i24, i25, compoundPaddingBottom);
                    c0666a.f12385M = true;
                }
                c0666a.h(false);
                if (!e() || this.f9880M0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        EditText editText;
        super.onMeasure(i10, i11);
        boolean z6 = this.f9893T0;
        l lVar = this.f9917u;
        if (!z6) {
            lVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f9893T0 = true;
        }
        if (this.f9877L != null && (editText = this.f9919v) != null) {
            this.f9877L.setGravity(editText.getGravity());
            this.f9877L.setPadding(this.f9919v.getCompoundPaddingLeft(), this.f9919v.getCompoundPaddingTop(), this.f9919v.getCompoundPaddingRight(), this.f9919v.getCompoundPaddingBottom());
        }
        lVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6382s);
        setError(savedState.f9929u);
        if (savedState.f9930v) {
            post(new p122m7.d(this, 8));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z6 = i10 == 1;
        if (z6 != this.f9902h0) {
            p170r3.c cVar = this.f9901g0.f14513e;
            RectF rectF = this.f9914s0;
            float fA = cVar.a(rectF);
            float fA2 = this.f9901g0.f14514f.a(rectF);
            float fA3 = this.f9901g0.f14516h.a(rectF);
            float fA4 = this.f9901g0.f14515g.a(rectF);
            j jVar = this.f9901g0;
            E e10 = jVar.a;
            E e11 = jVar.f14510b;
            E e12 = jVar.f14512d;
            E e13 = jVar.f14511c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            b.b(e11);
            b.b(e10);
            b.b(e13);
            b.b(e12);
            p170r3.a aVar = new p170r3.a(fA2);
            p170r3.a aVar2 = new p170r3.a(fA);
            p170r3.a aVar3 = new p170r3.a(fA4);
            p170r3.a aVar4 = new p170r3.a(fA3);
            j jVar2 = new j();
            jVar2.a = e11;
            jVar2.f14510b = e10;
            jVar2.f14511c = e12;
            jVar2.f14512d = e13;
            jVar2.f14513e = aVar;
            jVar2.f14514f = aVar2;
            jVar2.f14515g = aVar4;
            jVar2.f14516h = aVar3;
            jVar2.f14517i = eVar;
            jVar2.j = eVar2;
            jVar2.f14518k = eVar3;
            jVar2.f14519l = eVar4;
            this.f9902h0 = z6;
            setShapeAppearanceModel(jVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m()) {
            savedState.f9929u = getError();
        }
        l lVar = this.f9917u;
        savedState.f9930v = lVar.f15570A != 0 && lVar.f15590y.f9734v;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f9890S;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueB = C4.a.B(context, com.kcstream.cing.R.attr.colorControlActivated);
            if (typedValueB != null) {
                int i10 = typedValueB.resourceId;
                if (i10 != 0) {
                    colorStateListValueOf = f.c(context, i10);
                } else {
                    int i11 = typedValueB.data;
                    if (i11 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i11);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f9919v;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f9919v.getTextCursorDrawable().mutate();
        if ((m() || (this.f9867G != null && this.f9863E)) && (colorStateList = this.f9892T) != null) {
            colorStateListValueOf = colorStateList;
        }
        M.a.h(drawableMutate, colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean q() {
        boolean z6;
        if (this.f9919v == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z10 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            t tVar = this.f9915t;
            if (tVar.getMeasuredWidth() > 0) {
                int measuredWidth = tVar.getMeasuredWidth() - this.f9919v.getPaddingLeft();
                if (this.f9918u0 == null || this.f9920v0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f9918u0 = colorDrawable;
                    this.f9920v0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f9919v.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f9918u0;
                if (drawable != colorDrawable2) {
                    this.f9919v.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else if (this.f9918u0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f9919v.getCompoundDrawablesRelative();
                this.f9919v.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f9918u0 = null;
                z6 = true;
            } else {
                z6 = false;
            }
        } else if (this.f9918u0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.f9919v.getCompoundDrawablesRelative();
            this.f9919v.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.f9918u0 = null;
            z6 = true;
        } else {
            z6 = false;
        }
        l lVar = this.f9917u;
        if ((lVar.e() || ((lVar.f15570A != 0 && lVar.d()) || lVar.f15577H != null)) && lVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = lVar.f15578I.getMeasuredWidth() - this.f9919v.getPaddingRight();
            if (lVar.e()) {
                checkableImageButton = lVar.f15586u;
            } else if (lVar.f15570A != 0 && lVar.d()) {
                checkableImageButton = lVar.f15590y;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f9919v.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f9924x0;
            if (colorDrawable3 != null && this.f9926y0 != measuredWidth2) {
                this.f9926y0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f9919v.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f9924x0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f9924x0 = colorDrawable4;
                this.f9926y0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.f9924x0;
            if (drawable2 != colorDrawable5) {
                this.f9928z0 = drawable2;
                this.f9919v.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.f9924x0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.f9919v.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.f9924x0) {
                this.f9919v.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.f9928z0, compoundDrawablesRelative5[3]);
            } else {
                z10 = z6;
            }
            this.f9924x0 = null;
            return z10;
        }
        return z6;
    }

    public final void r() {
        Drawable background;
        X x8;
        EditText editText = this.f9919v;
        if (editText == null || this.f9904j0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0710j0.a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(p.r.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f9863E && (x8 = this.f9867G) != null) {
            drawableMutate.setColorFilter(p.r.c(x8.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f9919v.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f9919v;
        if (editText == null || this.f9897a0 == null) {
            return;
        }
        if ((this.f9899d0 || editText.getBackground() == null) && this.f9904j0 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f9919v;
            WeakHashMap weakHashMap = U.a;
            editText2.setBackground(editTextBoxBackground);
            this.f9899d0 = true;
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f9910p0 != i10) {
            this.f9910p0 = i10;
            this.f9868G0 = i10;
            this.f9872I0 = i10;
            this.f9874J0 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(J.b.a(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f9868G0 = defaultColor;
        this.f9910p0 = defaultColor;
        this.f9870H0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f9872I0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f9874J0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f9904j0) {
            return;
        }
        this.f9904j0 = i10;
        if (this.f9919v != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f9905k0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        b bVarF = this.f9901g0.f();
        p170r3.c cVar = this.f9901g0.f14513e;
        E eG = D3.b.g(i10);
        bVarF.a = eG;
        b.b(eG);
        bVarF.f2072e = cVar;
        p170r3.c cVar2 = this.f9901g0.f14514f;
        E eG2 = D3.b.g(i10);
        bVarF.f2069b = eG2;
        b.b(eG2);
        bVarF.f2073f = cVar2;
        p170r3.c cVar3 = this.f9901g0.f14516h;
        E eG3 = D3.b.g(i10);
        bVarF.f2071d = eG3;
        b.b(eG3);
        bVarF.f2075h = cVar3;
        p170r3.c cVar4 = this.f9901g0.f14515g;
        E eG4 = D3.b.g(i10);
        bVarF.f2070c = eG4;
        b.b(eG4);
        bVarF.f2074g = cVar4;
        this.f9901g0 = bVarF.a();
        b();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f9864E0 != i10) {
            this.f9864E0 = i10;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f9860C0 = colorStateList.getDefaultColor();
            this.f9876K0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f9862D0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f9864E0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f9864E0 != colorStateList.getDefaultColor()) {
            this.f9864E0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f9866F0 != colorStateList) {
            this.f9866F0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f9907m0 = i10;
        x();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f9908n0 = i10;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z6) {
        if (this.f9859C != z6) {
            p pVar = this.f9857B;
            if (z6) {
                X x8 = new X(getContext(), null);
                this.f9867G = x8;
                x8.setId(com.kcstream.cing.R.id.textinput_counter);
                Typeface typeface = this.f9916t0;
                if (typeface != null) {
                    this.f9867G.setTypeface(typeface);
                }
                this.f9867G.setMaxLines(1);
                pVar.a(this.f9867G, 2);
                ((ViewGroup.MarginLayoutParams) this.f9867G.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.kcstream.cing.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f9867G != null) {
                    EditText editText = this.f9919v;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                pVar.g(this.f9867G, 2);
                this.f9867G = null;
            }
            this.f9859C = z6;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f9861D != i10) {
            if (i10 > 0) {
                this.f9861D = i10;
            } else {
                this.f9861D = -1;
            }
            if (!this.f9859C || this.f9867G == null) {
                return;
            }
            EditText editText = this.f9919v;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f9869H != i10) {
            this.f9869H = i10;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f9888R != colorStateList) {
            this.f9888R = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f9871I != i10) {
            this.f9871I = i10;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f9886Q != colorStateList) {
            this.f9886Q = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f9890S != colorStateList) {
            this.f9890S = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f9892T != colorStateList) {
            this.f9892T = colorStateList;
            if (m() || (this.f9867G != null && this.f9863E)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f9856A0 = colorStateList;
        this.f9858B0 = colorStateList;
        if (this.f9919v != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        k(this, z6);
        super.setEnabled(z6);
    }

    public void setEndIconActivated(boolean z6) {
        this.f9917u.f15590y.setActivated(z6);
    }

    public void setEndIconCheckable(boolean z6) {
        this.f9917u.f15590y.setCheckable(z6);
    }

    public void setEndIconContentDescription(int i10) {
        l lVar = this.f9917u;
        CharSequence text = i10 != 0 ? lVar.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = lVar.f15590y;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        l lVar = this.f9917u;
        Drawable drawableG = i10 != 0 ? p068ga.l.g(lVar.getContext(), i10) : null;
        CheckableImageButton checkableImageButton = lVar.f15590y;
        checkableImageButton.setImageDrawable(drawableG);
        if (drawableG != null) {
            ColorStateList colorStateList = lVar.f15572C;
            PorterDuff.Mode mode = lVar.f15573D;
            TextInputLayout textInputLayout = lVar.f15584s;
            D3.b.a(textInputLayout, checkableImageButton, colorStateList, mode);
            D3.b.A(textInputLayout, checkableImageButton, lVar.f15572C);
        }
    }

    public void setEndIconMinSize(int i10) {
        l lVar = this.f9917u;
        if (i10 < 0) {
            lVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != lVar.f15574E) {
            lVar.f15574E = i10;
            CheckableImageButton checkableImageButton = lVar.f15590y;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
            CheckableImageButton checkableImageButton2 = lVar.f15586u;
            checkableImageButton2.setMinimumWidth(i10);
            checkableImageButton2.setMinimumHeight(i10);
        }
    }

    public void setEndIconMode(int i10) {
        this.f9917u.g(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        l lVar = this.f9917u;
        View.OnLongClickListener onLongClickListener = lVar.f15576G;
        CheckableImageButton checkableImageButton = lVar.f15590y;
        checkableImageButton.setOnClickListener(onClickListener);
        D3.b.D(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        l lVar = this.f9917u;
        lVar.f15576G = onLongClickListener;
        CheckableImageButton checkableImageButton = lVar.f15590y;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        D3.b.D(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        l lVar = this.f9917u;
        lVar.f15575F = scaleType;
        lVar.f15590y.setScaleType(scaleType);
        lVar.f15586u.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        l lVar = this.f9917u;
        if (lVar.f15572C != colorStateList) {
            lVar.f15572C = colorStateList;
            D3.b.a(lVar.f15584s, lVar.f15590y, colorStateList, lVar.f15573D);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        l lVar = this.f9917u;
        if (lVar.f15573D != mode) {
            lVar.f15573D = mode;
            D3.b.a(lVar.f15584s, lVar.f15590y, lVar.f15572C, mode);
        }
    }

    public void setEndIconVisible(boolean z6) {
        this.f9917u.h(z6);
    }

    public void setError(CharSequence charSequence) {
        p pVar = this.f9857B;
        if (!pVar.f15615q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            pVar.f();
            return;
        }
        pVar.c();
        pVar.f15614p = charSequence;
        pVar.f15616r.setText(charSequence);
        int i10 = pVar.f15612n;
        if (i10 != 1) {
            pVar.f15613o = 1;
        }
        pVar.i(i10, pVar.f15613o, pVar.h(pVar.f15616r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        p pVar = this.f9857B;
        pVar.f15618t = i10;
        X x8 = pVar.f15616r;
        if (x8 != null) {
            WeakHashMap weakHashMap = U.a;
            x8.setAccessibilityLiveRegion(i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        p pVar = this.f9857B;
        pVar.f15617s = charSequence;
        X x8 = pVar.f15616r;
        if (x8 != null) {
            x8.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z6) {
        p pVar = this.f9857B;
        if (pVar.f15615q == z6) {
            return;
        }
        pVar.c();
        TextInputLayout textInputLayout = pVar.f15607h;
        if (z6) {
            X x8 = new X(pVar.f15606g, null);
            pVar.f15616r = x8;
            x8.setId(com.kcstream.cing.R.id.textinput_error);
            pVar.f15616r.setTextAlignment(5);
            Typeface typeface = pVar.f15600B;
            if (typeface != null) {
                pVar.f15616r.setTypeface(typeface);
            }
            int i10 = pVar.f15619u;
            pVar.f15619u = i10;
            X x10 = pVar.f15616r;
            if (x10 != null) {
                textInputLayout.l(x10, i10);
            }
            ColorStateList colorStateList = pVar.f15620v;
            pVar.f15620v = colorStateList;
            X x11 = pVar.f15616r;
            if (x11 != null && colorStateList != null) {
                x11.setTextColor(colorStateList);
            }
            CharSequence charSequence = pVar.f15617s;
            pVar.f15617s = charSequence;
            X x12 = pVar.f15616r;
            if (x12 != null) {
                x12.setContentDescription(charSequence);
            }
            int i11 = pVar.f15618t;
            pVar.f15618t = i11;
            X x13 = pVar.f15616r;
            if (x13 != null) {
                WeakHashMap weakHashMap = U.a;
                x13.setAccessibilityLiveRegion(i11);
            }
            pVar.f15616r.setVisibility(4);
            pVar.a(pVar.f15616r, 0);
        } else {
            pVar.f();
            pVar.g(pVar.f15616r, 0);
            pVar.f15616r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        pVar.f15615q = z6;
    }

    public void setErrorIconDrawable(int i10) {
        l lVar = this.f9917u;
        lVar.i(i10 != 0 ? p068ga.l.g(lVar.getContext(), i10) : null);
        D3.b.A(lVar.f15584s, lVar.f15586u, lVar.f15587v);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        l lVar = this.f9917u;
        CheckableImageButton checkableImageButton = lVar.f15586u;
        View.OnLongClickListener onLongClickListener = lVar.f15589x;
        checkableImageButton.setOnClickListener(onClickListener);
        D3.b.D(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        l lVar = this.f9917u;
        lVar.f15589x = onLongClickListener;
        CheckableImageButton checkableImageButton = lVar.f15586u;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        D3.b.D(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        l lVar = this.f9917u;
        if (lVar.f15587v != colorStateList) {
            lVar.f15587v = colorStateList;
            D3.b.a(lVar.f15584s, lVar.f15586u, colorStateList, lVar.f15588w);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        l lVar = this.f9917u;
        if (lVar.f15588w != mode) {
            lVar.f15588w = mode;
            D3.b.a(lVar.f15584s, lVar.f15586u, lVar.f15587v, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        p pVar = this.f9857B;
        pVar.f15619u = i10;
        X x8 = pVar.f15616r;
        if (x8 != null) {
            pVar.f15607h.l(x8, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        p pVar = this.f9857B;
        pVar.f15620v = colorStateList;
        X x8 = pVar.f15616r;
        if (x8 == null || colorStateList == null) {
            return;
        }
        x8.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z6) {
        if (this.f9884O0 != z6) {
            this.f9884O0 = z6;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        p pVar = this.f9857B;
        if (zIsEmpty) {
            if (pVar.f15622x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!pVar.f15622x) {
            setHelperTextEnabled(true);
        }
        pVar.c();
        pVar.f15621w = charSequence;
        pVar.f15623y.setText(charSequence);
        int i10 = pVar.f15612n;
        if (i10 != 2) {
            pVar.f15613o = 2;
        }
        pVar.i(i10, pVar.f15613o, pVar.h(pVar.f15623y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        p pVar = this.f9857B;
        pVar.f15599A = colorStateList;
        X x8 = pVar.f15623y;
        if (x8 == null || colorStateList == null) {
            return;
        }
        x8.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z6) {
        p pVar = this.f9857B;
        if (pVar.f15622x == z6) {
            return;
        }
        pVar.c();
        if (z6) {
            X x8 = new X(pVar.f15606g, null);
            pVar.f15623y = x8;
            x8.setId(com.kcstream.cing.R.id.textinput_helper_text);
            pVar.f15623y.setTextAlignment(5);
            Typeface typeface = pVar.f15600B;
            if (typeface != null) {
                pVar.f15623y.setTypeface(typeface);
            }
            pVar.f15623y.setVisibility(4);
            pVar.f15623y.setAccessibilityLiveRegion(1);
            int i10 = pVar.f15624z;
            pVar.f15624z = i10;
            X x10 = pVar.f15623y;
            if (x10 != null) {
                x10.setTextAppearance(i10);
            }
            ColorStateList colorStateList = pVar.f15599A;
            pVar.f15599A = colorStateList;
            X x11 = pVar.f15623y;
            if (x11 != null && colorStateList != null) {
                x11.setTextColor(colorStateList);
            }
            pVar.a(pVar.f15623y, 1);
            pVar.f15623y.setAccessibilityDelegate(new o(pVar));
        } else {
            pVar.c();
            int i11 = pVar.f15612n;
            if (i11 == 2) {
                pVar.f15613o = 0;
            }
            pVar.i(i11, pVar.f15613o, pVar.h(pVar.f15623y, ""));
            pVar.g(pVar.f15623y, 1);
            pVar.f15623y = null;
            TextInputLayout textInputLayout = pVar.f15607h;
            textInputLayout.r();
            textInputLayout.x();
        }
        pVar.f15622x = z6;
    }

    public void setHelperTextTextAppearance(int i10) {
        p pVar = this.f9857B;
        pVar.f15624z = i10;
        X x8 = pVar.f15623y;
        if (x8 != null) {
            x8.setTextAppearance(i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f9894U) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z6) {
        this.f9885P0 = z6;
    }

    public void setHintEnabled(boolean z6) {
        if (z6 != this.f9894U) {
            this.f9894U = z6;
            if (z6) {
                CharSequence hint = this.f9919v.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f9895V)) {
                        setHint(hint);
                    }
                    this.f9919v.setHint((CharSequence) null);
                }
                this.f9896W = true;
            } else {
                this.f9896W = false;
                if (!TextUtils.isEmpty(this.f9895V) && TextUtils.isEmpty(this.f9919v.getHint())) {
                    this.f9919v.setHint(this.f9895V);
                }
                setHintInternal(null);
            }
            if (this.f9919v != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        C0666a c0666a = this.f9882N0;
        TextInputLayout textInputLayout = c0666a.a;
        p139o3.d dVar = new p139o3.d(textInputLayout.getContext(), i10);
        ColorStateList colorStateList = dVar.j;
        if (colorStateList != null) {
            c0666a.f12410k = colorStateList;
        }
        float f10 = dVar.f13722k;
        if (f10 != 0.0f) {
            c0666a.f12409i = f10;
        }
        ColorStateList colorStateList2 = dVar.a;
        if (colorStateList2 != null) {
            c0666a.f12392U = colorStateList2;
        }
        c0666a.f12390S = dVar.f13717e;
        c0666a.f12391T = dVar.f13718f;
        c0666a.f12389R = dVar.f13719g;
        c0666a.f12393V = dVar.f13721i;
        p139o3.a aVar = c0666a.f12424y;
        if (aVar != null) {
            aVar.f13708c = true;
        }
        p081i3.b bVar = new p081i3.b(c0666a, 1);
        dVar.a();
        c0666a.f12424y = new p139o3.a(bVar, dVar.f13725n);
        dVar.c(textInputLayout.getContext(), c0666a.f12424y);
        c0666a.h(false);
        this.f9858B0 = c0666a.f12410k;
        if (this.f9919v != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f9858B0 != colorStateList) {
            if (this.f9856A0 == null) {
                C0666a c0666a = this.f9882N0;
                if (c0666a.f12410k != colorStateList) {
                    c0666a.f12410k = colorStateList;
                    c0666a.h(false);
                }
            }
            this.f9858B0 = colorStateList;
            if (this.f9919v != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(w wVar) {
        this.f9865F = wVar;
    }

    public void setMaxEms(int i10) {
        this.f9925y = i10;
        EditText editText = this.f9919v;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f9855A = i10;
        EditText editText = this.f9919v;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f9923x = i10;
        EditText editText = this.f9919v;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f9927z = i10;
        EditText editText = this.f9919v;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        l lVar = this.f9917u;
        lVar.f15590y.setContentDescription(i10 != 0 ? lVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        l lVar = this.f9917u;
        lVar.f15590y.setImageDrawable(i10 != 0 ? p068ga.l.g(lVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z6) {
        l lVar = this.f9917u;
        if (z6 && lVar.f15570A != 1) {
            lVar.g(1);
        } else if (z6) {
            lVar.getClass();
        } else {
            lVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        l lVar = this.f9917u;
        lVar.f15572C = colorStateList;
        D3.b.a(lVar.f15584s, lVar.f15590y, colorStateList, lVar.f15573D);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        l lVar = this.f9917u;
        lVar.f15573D = mode;
        D3.b.a(lVar.f15584s, lVar.f15590y, lVar.f15572C, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f9877L == null) {
            X x8 = new X(getContext(), null);
            this.f9877L = x8;
            x8.setId(com.kcstream.cing.R.id.textinput_placeholder);
            this.f9877L.setImportantForAccessibility(2);
            C0453h c0453hD = d();
            this.f9883O = c0453hD;
            c0453hD.f5150t = 67L;
            this.P = d();
            setPlaceholderTextAppearance(this.f9881N);
            setPlaceholderTextColor(this.f9879M);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f9875K) {
                setPlaceholderTextEnabled(true);
            }
            this.f9873J = charSequence;
        }
        EditText editText = this.f9919v;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f9881N = i10;
        X x8 = this.f9877L;
        if (x8 != null) {
            x8.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f9879M != colorStateList) {
            this.f9879M = colorStateList;
            X x8 = this.f9877L;
            if (x8 == null || colorStateList == null) {
                return;
            }
            x8.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        t tVar = this.f9915t;
        tVar.getClass();
        tVar.f15642u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        tVar.f15641t.setText(charSequence);
        tVar.e();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f9915t.f15641t.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f9915t.f15641t.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(j jVar) {
        g gVar = this.f9897a0;
        if (gVar == null || gVar.f14501s.a == jVar) {
            return;
        }
        this.f9901g0 = jVar;
        b();
    }

    public void setStartIconCheckable(boolean z6) {
        this.f9915t.f15643v.setCheckable(z6);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f9915t.f15643v;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? p068ga.l.g(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        t tVar = this.f9915t;
        if (i10 < 0) {
            tVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != tVar.f15646y) {
            tVar.f15646y = i10;
            CheckableImageButton checkableImageButton = tVar.f15643v;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        t tVar = this.f9915t;
        View.OnLongClickListener onLongClickListener = tVar.f15638A;
        CheckableImageButton checkableImageButton = tVar.f15643v;
        checkableImageButton.setOnClickListener(onClickListener);
        D3.b.D(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        t tVar = this.f9915t;
        tVar.f15638A = onLongClickListener;
        CheckableImageButton checkableImageButton = tVar.f15643v;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        D3.b.D(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        t tVar = this.f9915t;
        tVar.f15647z = scaleType;
        tVar.f15643v.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        t tVar = this.f9915t;
        if (tVar.f15644w != colorStateList) {
            tVar.f15644w = colorStateList;
            D3.b.a(tVar.f15640s, tVar.f15643v, colorStateList, tVar.f15645x);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        t tVar = this.f9915t;
        if (tVar.f15645x != mode) {
            tVar.f15645x = mode;
            D3.b.a(tVar.f15640s, tVar.f15643v, tVar.f15644w, mode);
        }
    }

    public void setStartIconVisible(boolean z6) {
        this.f9915t.c(z6);
    }

    public void setSuffixText(CharSequence charSequence) {
        l lVar = this.f9917u;
        lVar.getClass();
        lVar.f15577H = TextUtils.isEmpty(charSequence) ? null : charSequence;
        lVar.f15578I.setText(charSequence);
        lVar.n();
    }

    public void setSuffixTextAppearance(int i10) {
        this.f9917u.f15578I.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f9917u.f15578I.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(v vVar) {
        EditText editText = this.f9919v;
        if (editText != null) {
            U.n(editText, vVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f9916t0) {
            this.f9916t0 = typeface;
            this.f9882N0.m(typeface);
            p pVar = this.f9857B;
            if (typeface != pVar.f15600B) {
                pVar.f15600B = typeface;
                X x8 = pVar.f15616r;
                if (x8 != null) {
                    x8.setTypeface(typeface);
                }
                X x10 = pVar.f15623y;
                if (x10 != null) {
                    x10.setTypeface(typeface);
                }
            }
            X x11 = this.f9867G;
            if (x11 != null) {
                x11.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f9904j0 != 1) {
            FrameLayout frameLayout = this.f9913s;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z6, boolean z10) {
        ColorStateList colorStateList;
        X x8;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f9919v;
        boolean z11 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f9919v;
        boolean z12 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f9856A0;
        C0666a c0666a = this.f9882N0;
        if (colorStateList2 != null) {
            c0666a.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f9856A0;
            c0666a.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f9876K0) : this.f9876K0));
        } else if (m()) {
            X x10 = this.f9857B.f15616r;
            c0666a.i(x10 != null ? x10.getTextColors() : null);
        } else if (this.f9863E && (x8 = this.f9867G) != null) {
            c0666a.i(x8.getTextColors());
        } else if (z12 && (colorStateList = this.f9858B0) != null && c0666a.f12410k != colorStateList) {
            c0666a.f12410k = colorStateList;
            c0666a.h(false);
        }
        l lVar = this.f9917u;
        t tVar = this.f9915t;
        if (z11 || !this.f9884O0 || (isEnabled() && z12)) {
            if (z10 || this.f9880M0) {
                ValueAnimator valueAnimator = this.f9887Q0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f9887Q0.cancel();
                }
                if (z6 && this.f9885P0) {
                    a(1.0f);
                } else {
                    c0666a.k(1.0f);
                }
                this.f9880M0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f9919v;
                v(editText3 != null ? editText3.getText() : null);
                tVar.f15639B = false;
                tVar.e();
                lVar.f15579J = false;
                lVar.n();
                return;
            }
            return;
        }
        if (z10 || !this.f9880M0) {
            ValueAnimator valueAnimator2 = this.f9887Q0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f9887Q0.cancel();
            }
            if (z6 && this.f9885P0) {
                a(0.0f);
            } else {
                c0666a.k(0.0f);
            }
            if (e() && !((p215w3.f) this.f9897a0).f15554Q.f15552r.isEmpty() && e()) {
                ((p215w3.f) this.f9897a0).r(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f9880M0 = true;
            X x11 = this.f9877L;
            if (x11 != null && this.f9875K) {
                x11.setText((CharSequence) null);
                V0.t.a(this.f9913s, this.P);
                this.f9877L.setVisibility(4);
            }
            tVar.f15639B = true;
            tVar.e();
            lVar.f15579J = true;
            lVar.n();
        }
    }

    public final void v(Editable editable) {
        ((Y9.a) this.f9865F).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f9913s;
        if (length != 0 || this.f9880M0) {
            X x8 = this.f9877L;
            if (x8 == null || !this.f9875K) {
                return;
            }
            x8.setText((CharSequence) null);
            V0.t.a(frameLayout, this.P);
            this.f9877L.setVisibility(4);
            return;
        }
        if (this.f9877L == null || !this.f9875K || TextUtils.isEmpty(this.f9873J)) {
            return;
        }
        this.f9877L.setText(this.f9873J);
        V0.t.a(frameLayout, this.f9883O);
        this.f9877L.setVisibility(0);
        this.f9877L.bringToFront();
        announceForAccessibility(this.f9873J);
    }

    public final void w(boolean z6, boolean z10) {
        int defaultColor = this.f9866F0.getDefaultColor();
        int colorForState = this.f9866F0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f9866F0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z6) {
            this.f9909o0 = colorForState2;
        } else if (z10) {
            this.f9909o0 = colorForState;
        } else {
            this.f9909o0 = defaultColor;
        }
    }

    public final void x() {
        X x8;
        EditText editText;
        EditText editText2;
        if (this.f9897a0 == null || this.f9904j0 == 0) {
            return;
        }
        boolean z6 = false;
        boolean z10 = isFocused() || ((editText2 = this.f9919v) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f9919v) != null && editText.isHovered())) {
            z6 = true;
        }
        if (!isEnabled()) {
            this.f9909o0 = this.f9876K0;
        } else if (m()) {
            if (this.f9866F0 != null) {
                w(z10, z6);
            } else {
                this.f9909o0 = getErrorCurrentTextColors();
            }
        } else if (!this.f9863E || (x8 = this.f9867G) == null) {
            if (z10) {
                this.f9909o0 = this.f9864E0;
            } else if (z6) {
                this.f9909o0 = this.f9862D0;
            } else {
                this.f9909o0 = this.f9860C0;
            }
        } else if (this.f9866F0 != null) {
            w(z10, z6);
        } else {
            this.f9909o0 = x8.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        l lVar = this.f9917u;
        lVar.l();
        CheckableImageButton checkableImageButton = lVar.f15586u;
        ColorStateList colorStateList = lVar.f15587v;
        TextInputLayout textInputLayout = lVar.f15584s;
        D3.b.A(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = lVar.f15572C;
        CheckableImageButton checkableImageButton2 = lVar.f15590y;
        D3.b.A(textInputLayout, checkableImageButton2, colorStateList2);
        if (lVar.b() instanceof p215w3.i) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                D3.b.a(textInputLayout, checkableImageButton2, lVar.f15572C, lVar.f15573D);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                M.a.g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        t tVar = this.f9915t;
        D3.b.A(tVar.f15640s, tVar.f15643v, tVar.f15644w);
        if (this.f9904j0 == 2) {
            int i10 = this.f9906l0;
            if (z10 && isEnabled()) {
                this.f9906l0 = this.f9908n0;
            } else {
                this.f9906l0 = this.f9907m0;
            }
            if (this.f9906l0 != i10 && e() && !this.f9880M0) {
                if (e()) {
                    ((p215w3.f) this.f9897a0).r(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f9904j0 == 1) {
            if (!isEnabled()) {
                this.f9910p0 = this.f9870H0;
            } else if (z6 && !z10) {
                this.f9910p0 = this.f9874J0;
            } else if (z10) {
                this.f9910p0 = this.f9872I0;
            } else {
                this.f9910p0 = this.f9868G0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f9915t.b(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f9917u.f15590y.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f9917u.f15590y.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f9917u.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f9917u.f15590y;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        l lVar = this.f9917u;
        CheckableImageButton checkableImageButton = lVar.f15590y;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = lVar.f15572C;
            PorterDuff.Mode mode = lVar.f15573D;
            TextInputLayout textInputLayout = lVar.f15584s;
            D3.b.a(textInputLayout, checkableImageButton, colorStateList, mode);
            D3.b.A(textInputLayout, checkableImageButton, lVar.f15572C);
        }
    }
}
