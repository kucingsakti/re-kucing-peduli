package androidx.appcompat.widget;

import J.f;
import J7.j;
import U.C;
import U.U;
import V0.C0447b;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.WeakHashMap;
import p.AbstractC0710j0;
import p.C0730u;
import p.N0;
import p.T;
import p.f1;
import p068ga.l;
import p106l0.g;
import p126n0.h;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final C0447b f6162m0 = new C0447b(Float.class, "thumbPos", 10);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int[] f6163n0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f6164A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f6165B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f6166C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f6167D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f6168E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f6169F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f6170G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f6171H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public CharSequence f6172I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public CharSequence f6173J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f6174K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f6175L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f6176M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f6177N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f6178O;
    public final VelocityTracker P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f6179Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f6180R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f6181S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f6182T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f6183U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f6184V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f6185W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f6186a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f6187b0;
    public boolean c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final TextPaint f6188d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ColorStateList f6189e0;
    public StaticLayout f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public StaticLayout f6190g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final p115m.a f6191h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ObjectAnimator f6192i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public C0730u f6193j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public h f6194k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final Rect f6195l0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f6196s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f6197t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f6198u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6199v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6200w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f6201x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f6202y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public PorterDuff.Mode f6203z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, com.kcstream.cing.R.attr.switchStyle);
        this.f6197t = null;
        this.f6198u = null;
        this.f6199v = false;
        this.f6200w = false;
        this.f6202y = null;
        this.f6203z = null;
        this.f6164A = false;
        this.f6165B = false;
        this.P = VelocityTracker.obtain();
        this.c0 = true;
        this.f6195l0 = new Rect();
        N0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f6188d0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = p069h.a.f11630w;
        Y1.c cVarE = Y1.c.E(context, attributeSet, iArr, com.kcstream.cing.R.attr.switchStyle);
        U.m(this, context, iArr, attributeSet, (TypedArray) cVarE.f5671u, com.kcstream.cing.R.attr.switchStyle);
        Drawable drawableV = cVarE.v(2);
        this.f6196s = drawableV;
        if (drawableV != null) {
            drawableV.setCallback(this);
        }
        Drawable drawableV2 = cVarE.v(11);
        this.f6201x = drawableV2;
        if (drawableV2 != null) {
            drawableV2.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) cVarE.f5671u;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f6174K = typedArray.getBoolean(3, true);
        this.f6166C = typedArray.getDimensionPixelSize(8, 0);
        this.f6167D = typedArray.getDimensionPixelSize(5, 0);
        this.f6168E = typedArray.getDimensionPixelSize(6, 0);
        this.f6169F = typedArray.getBoolean(4, false);
        ColorStateList colorStateListU = cVarE.u(9);
        if (colorStateListU != null) {
            this.f6197t = colorStateListU;
            this.f6199v = true;
        }
        PorterDuff.Mode modeC = AbstractC0710j0.c(typedArray.getInt(10, -1), null);
        if (this.f6198u != modeC) {
            this.f6198u = modeC;
            this.f6200w = true;
        }
        if (this.f6199v || this.f6200w) {
            a();
        }
        ColorStateList colorStateListU2 = cVarE.u(12);
        if (colorStateListU2 != null) {
            this.f6202y = colorStateListU2;
            this.f6164A = true;
        }
        PorterDuff.Mode modeC2 = AbstractC0710j0.c(typedArray.getInt(13, -1), null);
        if (this.f6203z != modeC2) {
            this.f6203z = modeC2;
            this.f6165B = true;
        }
        if (this.f6164A || this.f6165B) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, p069h.a.f11631x);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = f.c(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f6189e0 = colorStateList;
            } else {
                this.f6189e0 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i10 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i11 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i10 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i10 != 2) {
                typeface = i10 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i11 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i11) : Typeface.create(typeface, i11);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i12 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i11;
                textPaint.setFakeBoldText((i12 & 1) != 0);
                textPaint.setTextSkewX((2 & i12) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                p115m.a aVar = new p115m.a();
                aVar.a = context2.getResources().getConfiguration().locale;
                this.f6191h0 = aVar;
            } else {
                this.f6191h0 = null;
            }
            setTextOnInternal(this.f6170G);
            setTextOffInternal(this.f6172I);
            typedArrayObtainStyledAttributes.recycle();
        }
        new T(this).f(attributeSet, com.kcstream.cing.R.attr.switchStyle);
        cVarE.J();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f6176M = viewConfiguration.getScaledTouchSlop();
        this.f6179Q = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.kcstream.cing.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C0730u getEmojiTextViewHelper() {
        if (this.f6193j0 == null) {
            this.f6193j0 = new C0730u(this);
        }
        return this.f6193j0;
    }

    private boolean getTargetCheckedState() {
        return this.f6180R > 0.5f;
    }

    private int getThumbOffset() {
        boolean z6 = f1.a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f6180R : this.f6180R) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f6201x;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f6195l0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f6196s;
        Rect rectB = drawable2 != null ? AbstractC0710j0.b(drawable2) : AbstractC0710j0.f14073c;
        return ((((this.f6181S - this.f6183U) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f6172I = charSequence;
        C0730u emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodQ = ((oa.b) emojiTextViewHelper.f14132b.f12743s).q(this.f6191h0);
        if (transformationMethodQ != null) {
            charSequence = transformationMethodQ.getTransformation(charSequence, this);
        }
        this.f6173J = charSequence;
        this.f6190g0 = null;
        if (this.f6174K) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f6170G = charSequence;
        C0730u emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodQ = ((oa.b) emojiTextViewHelper.f14132b.f12743s).q(this.f6191h0);
        if (transformationMethodQ != null) {
            charSequence = transformationMethodQ.getTransformation(charSequence, this);
        }
        this.f6171H = charSequence;
        this.f0 = null;
        if (this.f6174K) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f6196s;
        if (drawable != null) {
            if (this.f6199v || this.f6200w) {
                Drawable drawableMutate = drawable.mutate();
                this.f6196s = drawableMutate;
                if (this.f6199v) {
                    M.a.h(drawableMutate, this.f6197t);
                }
                if (this.f6200w) {
                    M.a.i(this.f6196s, this.f6198u);
                }
                if (this.f6196s.isStateful()) {
                    this.f6196s.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f6201x;
        if (drawable != null) {
            if (this.f6164A || this.f6165B) {
                Drawable drawableMutate = drawable.mutate();
                this.f6201x = drawableMutate;
                if (this.f6164A) {
                    M.a.h(drawableMutate, this.f6202y);
                }
                if (this.f6165B) {
                    M.a.i(this.f6201x, this.f6203z);
                }
                if (this.f6201x.isStateful()) {
                    this.f6201x.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f6170G);
        setTextOffInternal(this.f6172I);
        requestLayout();
    }

    public final void d() {
        if (this.f6194k0 == null && ((oa.b) this.f6193j0.f14132b.f12743s).j() && g.f12850k != null) {
            g gVarA = g.a();
            int iB = gVarA.b();
            if (iB == 3 || iB == 0) {
                h hVar = new h(this);
                this.f6194k0 = hVar;
                gVarA.f(hVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12 = this.f6184V;
        int i13 = this.f6185W;
        int i14 = this.f6186a0;
        int i15 = this.f6187b0;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f6196s;
        Rect rectB = drawable != null ? AbstractC0710j0.b(drawable) : AbstractC0710j0.f14073c;
        Drawable drawable2 = this.f6201x;
        Rect rect = this.f6195l0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectB != null) {
                int i17 = rectB.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectB.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectB.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectB.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f6201x.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f6201x.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f6196s;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f6183U + rect.right;
            this.f6196s.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                M.a.f(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f6196s;
        if (drawable != null) {
            M.a.e(drawable, f10, f11);
        }
        Drawable drawable2 = this.f6201x;
        if (drawable2 != null) {
            M.a.e(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6196s;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f6201x;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z6 = f1.a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f6181S;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f6168E : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z6 = f1.a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f6181S;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f6168E : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j.Y(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f6174K;
    }

    public boolean getSplitTrack() {
        return this.f6169F;
    }

    public int getSwitchMinWidth() {
        return this.f6167D;
    }

    public int getSwitchPadding() {
        return this.f6168E;
    }

    public CharSequence getTextOff() {
        return this.f6172I;
    }

    public CharSequence getTextOn() {
        return this.f6170G;
    }

    public Drawable getThumbDrawable() {
        return this.f6196s;
    }

    public final float getThumbPosition() {
        return this.f6180R;
    }

    public int getThumbTextPadding() {
        return this.f6166C;
    }

    public ColorStateList getThumbTintList() {
        return this.f6197t;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f6198u;
    }

    public Drawable getTrackDrawable() {
        return this.f6201x;
    }

    public ColorStateList getTrackTintList() {
        return this.f6202y;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f6203z;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6196s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f6201x;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f6192i0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f6192i0.end();
        this.f6192i0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6163n0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f6201x;
        Rect rect = this.f6195l0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f6185W;
        int i11 = this.f6187b0;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f6196s;
        if (drawable != null) {
            if (!this.f6169F || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = AbstractC0710j0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f0 : this.f6190g0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f6189e0;
            TextPaint textPaint = this.f6188d0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i12 + i13) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f6170G : this.f6172I;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z6, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f6196s != null) {
            Drawable drawable = this.f6201x;
            Rect rect = this.f6195l0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = AbstractC0710j0.b(this.f6196s);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z10 = f1.a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f6181S + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f6181S) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i14 = this.f6182T;
            int i15 = height2 - (i14 / 2);
            height = i14 + i15;
            paddingTop = i15;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f6182T + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f6182T;
        }
        this.f6184V = paddingLeft;
        this.f6185W = paddingTop;
        this.f6187b0 = height;
        this.f6186a0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.f6174K) {
            StaticLayout staticLayout = this.f0;
            TextPaint textPaint = this.f6188d0;
            if (staticLayout == null) {
                CharSequence charSequence = this.f6171H;
                this.f0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f6190g0 == null) {
                CharSequence charSequence2 = this.f6173J;
                this.f6190g0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f6196s;
        Rect rect = this.f6195l0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f6196s.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f6196s.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f6174K) {
            iMax = (this.f6166C * 2) + Math.max(this.f0.getWidth(), this.f6190g0.getWidth());
        } else {
            iMax = 0;
        }
        this.f6183U = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f6201x;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f6201x.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f6196s;
        if (drawable3 != null) {
            Rect rectB = AbstractC0710j0.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        int iMax4 = this.c0 ? Math.max(this.f6167D, (this.f6183U * 2) + iMax2 + iMax3) : this.f6167D;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f6181S = iMax4;
        this.f6182T = iMax5;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f6170G : this.f6172I;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f10;
        VelocityTracker velocityTracker = this.P;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f6176M;
        if (actionMasked != 0) {
            float f11 = 0.0f;
            if (actionMasked == 1) {
                if (this.f6175L == 2) {
                    this.f6175L = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    zIsChecked = isChecked();
                    if (z6) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.f6179Q) {
                            boolean z10 = f1.a;
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f6175L = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i11 = this.f6175L;
                if (i11 == 1) {
                    float x8 = motionEvent.getX();
                    float y6 = motionEvent.getY();
                    float f12 = i10;
                    if (Math.abs(x8 - this.f6177N) > f12 || Math.abs(y6 - this.f6178O) > f12) {
                        this.f6175L = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f6177N = x8;
                        this.f6178O = y6;
                        return true;
                    }
                } else if (i11 == 2) {
                    float x10 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f13 = x10 - this.f6177N;
                    if (thumbScrollRange != 0) {
                        f10 = f13 / thumbScrollRange;
                    } else {
                        f10 = f13 > 0.0f ? 1.0f : -1.0f;
                    }
                    boolean z11 = f1.a;
                    if (getLayoutDirection() == 1) {
                        f10 = -f10;
                    }
                    float f14 = this.f6180R;
                    float f15 = f10 + f14;
                    if (f15 >= 0.0f) {
                        f11 = f15 > 1.0f ? 1.0f : f15;
                    }
                    if (f11 != f14) {
                        this.f6177N = x10;
                        setThumbPosition(f11);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f6175L == 2) {
                    this.f6175L = 0;
                    if (motionEvent.getAction() == 1) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    zIsChecked = isChecked();
                    if (z6) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.f6179Q) {
                            boolean z12 = f1.a;
                            if (getLayoutDirection() == 1) {
                            }
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f6175L = 0;
                velocityTracker.clear();
            }
        } else {
            float x11 = motionEvent.getX();
            float y8 = motionEvent.getY();
            if (isEnabled() && this.f6196s != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f6196s;
                Rect rect = this.f6195l0;
                drawable.getPadding(rect);
                int i12 = this.f6185W - i10;
                int i13 = (this.f6184V + thumbOffset) - i10;
                int i14 = this.f6183U + i13 + rect.left + rect.right + i10;
                int i15 = this.f6187b0 + i10;
                if (x11 > i13 && x11 < i14 && y8 > i12 && y8 < i15) {
                    this.f6175L = 1;
                    this.f6177N = x11;
                    this.f6178O = y8;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        super.setChecked(z6);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f6170G;
                if (string == null) {
                    string = getResources().getString(com.kcstream.cing.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = U.a;
                new C(com.kcstream.cing.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f6172I;
            if (string2 == null) {
                string2 = getResources().getString(com.kcstream.cing.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = U.a;
            new C(com.kcstream.cing.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f6192i0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f6162m0, zIsChecked ? 1.0f : 0.0f);
        this.f6192i0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f6192i0.setAutoCancel(true);
        this.f6192i0.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.Z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().d(z6);
        setTextOnInternal(this.f6170G);
        setTextOffInternal(this.f6172I);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z6) {
        this.c0 = z6;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z6) {
        if (this.f6174K != z6) {
            this.f6174K = z6;
            requestLayout();
            if (z6) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z6) {
        this.f6169F = z6;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f6167D = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f6168E = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f6188d0;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f6172I;
        if (string == null) {
            string = getResources().getString(com.kcstream.cing.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = U.a;
        new C(com.kcstream.cing.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f6170G;
        if (string == null) {
            string = getResources().getString(com.kcstream.cing.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = U.a;
        new C(com.kcstream.cing.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f6196s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f6196s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f6180R = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(l.g(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f6166C = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f6197t = colorStateList;
        this.f6199v = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f6198u = mode;
        this.f6200w = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f6201x;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f6201x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(l.g(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f6202y = colorStateList;
        this.f6164A = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f6203z = mode;
        this.f6165B = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6196s || drawable == this.f6201x;
    }
}
