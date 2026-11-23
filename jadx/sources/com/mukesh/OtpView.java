package com.mukesh;

import B4.K;
import E4.B;
import K.o;
import M2.P;
import O4.a;
import O4.b;
import O4.c;
import U.U;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Toast;
import com.kcstream.cing.activity.MainActivity;
import com.kcstream.cing.activity.PasscodeActivity;
import java.util.WeakHashMap;
import p.C0728t;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public class OtpView extends C0728t {
    public static final InputFilter[] f0 = new InputFilter[0];

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int[] f10282g0 = {R.attr.state_selected};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int[] f10283h0 = {com.kcstream.cing.R.attr.OtpState_filled};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10284A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10285B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f10286C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f10287D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Paint f10288E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final TextPaint f10289F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ColorStateList f10290G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f10291H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f10292I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Rect f10293J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final RectF f10294K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final RectF f10295L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Path f10296M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final PointF f10297N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ValueAnimator f10298O;
    public boolean P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public P f10299Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f10300R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f10301S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f10302T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f10303U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f10304V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f10305W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Drawable f10306a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f10307b0;
    public final boolean c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f10308d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public b f10309e0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f10310y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10311z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kcstream.cing.R.attr.otpViewStyle);
        int i10 = 2;
        TextPaint textPaint = new TextPaint();
        this.f10289F = textPaint;
        this.f10291H = -16777216;
        this.f10293J = new Rect();
        this.f10294K = new RectF();
        this.f10295L = new RectF();
        this.f10296M = new Path();
        this.f10297N = new PointF();
        this.P = false;
        Resources resources = getResources();
        Paint paint = new Paint(1);
        this.f10288E = paint;
        paint.setStyle(Paint.Style.STROKE);
        textPaint.set(getPaint());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c.a, com.kcstream.cing.R.attr.otpViewStyle, 0);
        this.f10310y = typedArrayObtainStyledAttributes.getInt(15, 2);
        this.f10311z = typedArrayObtainStyledAttributes.getInt(5, 4);
        this.f10285B = (int) typedArrayObtainStyledAttributes.getDimension(6, resources.getDimensionPixelSize(com.kcstream.cing.R.dimen.otp_view_item_size));
        this.f10284A = (int) typedArrayObtainStyledAttributes.getDimension(9, resources.getDimensionPixelSize(com.kcstream.cing.R.dimen.otp_view_item_size));
        this.f10287D = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, resources.getDimensionPixelSize(com.kcstream.cing.R.dimen.otp_view_item_spacing));
        this.f10286C = (int) typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        this.f10292I = (int) typedArrayObtainStyledAttributes.getDimension(11, resources.getDimensionPixelSize(com.kcstream.cing.R.dimen.otp_view_item_line_width));
        this.f10290G = typedArrayObtainStyledAttributes.getColorStateList(10);
        this.f10300R = typedArrayObtainStyledAttributes.getBoolean(1, true);
        this.f10304V = typedArrayObtainStyledAttributes.getColor(2, getCurrentTextColor());
        this.f10303U = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, resources.getDimensionPixelSize(com.kcstream.cing.R.dimen.otp_view_cursor_width));
        this.f10306a0 = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f10307b0 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        this.c0 = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.f10308d0 = typedArrayObtainStyledAttributes.getString(12);
        typedArrayObtainStyledAttributes.recycle();
        ColorStateList colorStateList = this.f10290G;
        if (colorStateList != null) {
            this.f10291H = colorStateList.getDefaultColor();
        }
        k();
        b();
        setMaxLength(this.f10311z);
        paint.setStrokeWidth(this.f10292I);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        this.f10298O = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(150L);
        this.f10298O.setInterpolator(new DecelerateInterpolator());
        this.f10298O.addUpdateListener(new K(this, i10));
        super.setCursorVisible(false);
        setTextIsSelectable(false);
    }

    private void setMaxLength(int i10) {
        setFilters(i10 >= 0 ? new InputFilter[]{new InputFilter.LengthFilter(i10)} : f0);
    }

    public final void b() {
        int i10 = this.f10310y;
        if (i10 == 1) {
            if (this.f10286C > this.f10292I / 2.0f) {
                throw new IllegalArgumentException("The itemRadius can not be greater than lineWidth when viewType is line");
            }
        } else if (i10 == 0) {
            if (this.f10286C > this.f10284A / 2.0f) {
                throw new IllegalArgumentException("The itemRadius can not be greater than itemWidth");
            }
        }
    }

    public final void c(Canvas canvas, int i10) {
        TextPaint textPaintF = f(i10);
        textPaintF.setColor(getCurrentHintTextColor());
        if (!this.c0) {
            e(canvas, textPaintF, getHint(), i10);
            return;
        }
        int length = (this.f10311z - i10) - getHint().length();
        if (length <= 0) {
            e(canvas, textPaintF, getHint(), Math.abs(length));
        }
    }

    public final void d(Canvas canvas, int i10) {
        int inputType;
        String str = this.f10308d0;
        boolean z6 = this.c0;
        if (str != null && (getInputType() == 2 || (inputType = getInputType() & 4095) == 129 || inputType == 225 || inputType == 18)) {
            String string = Character.toString(this.f10308d0.charAt(0));
            TextPaint textPaintF = f(i10);
            textPaintF.setColor(getCurrentTextColor());
            if (!z6) {
                if (getText() != null) {
                    e(canvas, textPaintF, getText().toString().replaceAll(".", string), i10);
                    return;
                }
                return;
            }
            int length = this.f10311z - i10;
            if (getText() != null) {
                length -= getText().length();
            }
            if (length > 0 || getText() == null) {
                return;
            }
            e(canvas, textPaintF, getText().toString().replaceAll(".", string), Math.abs(length));
            return;
        }
        int inputType2 = getInputType() & 4095;
        if (inputType2 == 129 || inputType2 == 225 || inputType2 == 18) {
            TextPaint textPaintF2 = f(i10);
            PointF pointF = this.f10297N;
            float f10 = pointF.x;
            float f11 = pointF.y;
            if (!z6) {
                canvas.drawCircle(f10, f11, textPaintF2.getTextSize() / 2.0f, textPaintF2);
                return;
            } else {
                if ((this.f10311z - i10) - getHint().length() <= 0) {
                    canvas.drawCircle(f10, f11, textPaintF2.getTextSize() / 2.0f, textPaintF2);
                    return;
                }
                return;
            }
        }
        TextPaint textPaintF3 = f(i10);
        textPaintF3.setColor(getCurrentTextColor());
        if (!z6) {
            if (getText() != null) {
                e(canvas, textPaintF3, getText(), i10);
                return;
            }
            return;
        }
        int length2 = this.f10311z - i10;
        if (getText() != null) {
            length2 -= getText().length();
        }
        if (length2 > 0 || getText() == null) {
            return;
        }
        e(canvas, textPaintF3, getText(), Math.abs(length2));
    }

    @Override // p.C0728t, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.f10290G;
        if (colorStateList == null || colorStateList.isStateful()) {
            j();
        }
    }

    public final void e(Canvas canvas, TextPaint textPaint, CharSequence charSequence, int i10) {
        String string = charSequence.toString();
        int i11 = i10 + 1;
        Rect rect = this.f10293J;
        textPaint.getTextBounds(string, i10, i11, rect);
        PointF pointF = this.f10297N;
        canvas.drawText(charSequence, i10, i11, (pointF.x - (Math.abs(rect.width()) / 2.0f)) - rect.left, ((Math.abs(rect.height()) / 2.0f) + pointF.y) - rect.bottom, textPaint);
    }

    public final TextPaint f(int i10) {
        if (getText() == null || !this.P || i10 != getText().length() - 1) {
            return getPaint();
        }
        TextPaint textPaint = this.f10289F;
        textPaint.setColor(getPaint().getColor());
        return textPaint;
    }

    public final void g(boolean z6) {
        if (this.f10301S != z6) {
            this.f10301S = z6;
            invalidate();
        }
    }

    public int getCurrentLineColor() {
        return this.f10291H;
    }

    public int getCursorColor() {
        return this.f10304V;
    }

    public int getCursorWidth() {
        return this.f10303U;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public MovementMethod getDefaultMovementMethod() {
        if (a.a == null) {
            a.a = new a();
        }
        return a.a;
    }

    public int getItemCount() {
        return this.f10311z;
    }

    public int getItemHeight() {
        return this.f10285B;
    }

    public int getItemRadius() {
        return this.f10286C;
    }

    public int getItemSpacing() {
        return this.f10287D;
    }

    public int getItemWidth() {
        return this.f10284A;
    }

    public ColorStateList getLineColors() {
        return this.f10290G;
    }

    public int getLineWidth() {
        return this.f10292I;
    }

    public String getMaskingChar() {
        return this.f10308d0;
    }

    public final void h() {
        if (!this.f10300R || !isFocused()) {
            P p10 = this.f10299Q;
            if (p10 != null) {
                removeCallbacks(p10);
                return;
            }
            return;
        }
        if (this.f10299Q == null) {
            this.f10299Q = new P(this);
        }
        removeCallbacks(this.f10299Q);
        this.f10301S = false;
        postDelayed(this.f10299Q, 500L);
    }

    public final void i() {
        RectF rectF = this.f10294K;
        this.f10297N.set((Math.abs(rectF.width()) / 2.0f) + rectF.left, (Math.abs(rectF.height()) / 2.0f) + rectF.top);
    }

    @Override // android.widget.TextView
    public final boolean isCursorVisible() {
        return this.f10300R;
    }

    public final void j() {
        ColorStateList colorStateList = this.f10290G;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(getDrawableState(), 0) : getCurrentTextColor();
        if (colorForState != this.f10291H) {
            this.f10291H = colorForState;
            invalidate();
        }
    }

    public final void k() {
        float f10 = ((int) ((getResources().getDisplayMetrics().density * 2.0f) + 0.5f)) * 2;
        this.f10302T = ((float) this.f10285B) - getTextSize() > f10 ? getTextSize() + f10 : getTextSize();
    }

    public final void l(int i10) {
        float f10 = this.f10292I / 2.0f;
        int scrollX = getScrollX();
        WeakHashMap weakHashMap = U.a;
        int paddingStart = getPaddingStart() + scrollX;
        int i11 = this.f10287D;
        int i12 = this.f10284A;
        float f11 = ((i11 + i12) * i10) + paddingStart + f10;
        if (i11 == 0 && i10 > 0) {
            f11 -= this.f10292I * i10;
        }
        float f12 = (i12 + f11) - this.f10292I;
        float paddingTop = getPaddingTop() + getScrollY() + f10;
        this.f10294K.set(f11, paddingTop, f12, (this.f10285B + paddingTop) - this.f10292I);
    }

    public final void m(int i10) {
        boolean z6;
        boolean z10;
        if (this.f10287D != 0) {
            z10 = true;
            z6 = true;
        } else {
            boolean z11 = i10 == 0 && i10 != this.f10311z - 1;
            z6 = i10 == this.f10311z - 1 && i10 != 0;
            z10 = z11;
        }
        RectF rectF = this.f10294K;
        int i11 = this.f10286C;
        n(rectF, i11, i11, z10, z6);
    }

    public final void n(RectF rectF, float f10, float f11, boolean z6, boolean z10) {
        Path path = this.f10296M;
        path.reset();
        float f12 = rectF.left;
        float f13 = rectF.top;
        float f14 = (rectF.right - f12) - (f10 * 2.0f);
        float f15 = (rectF.bottom - f13) - (2.0f * f11);
        path.moveTo(f12, f13 + f11);
        if (z6) {
            float f16 = -f11;
            path.rQuadTo(0.0f, f16, f10, f16);
        } else {
            path.rLineTo(0.0f, -f11);
            path.rLineTo(f10, 0.0f);
        }
        path.rLineTo(f14, 0.0f);
        if (z10) {
            path.rQuadTo(f10, 0.0f, f10, f11);
        } else {
            path.rLineTo(f10, 0.0f);
            path.rLineTo(0.0f, f11);
        }
        path.rLineTo(0.0f, f15);
        if (z10) {
            path.rQuadTo(0.0f, f11, -f10, f11);
        } else {
            path.rLineTo(0.0f, f11);
            path.rLineTo(-f10, 0.0f);
        }
        path.rLineTo(-f14, 0.0f);
        if (z6) {
            float f17 = -f10;
            path.rQuadTo(f17, 0.0f, f17, -f11);
        } else {
            path.rLineTo(-f10, 0.0f);
            path.rLineTo(0.0f, -f11);
        }
        path.rLineTo(0.0f, -f15);
        path.close();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        P p10 = this.f10299Q;
        if (p10 != null) {
            p10.f2924t = false;
            h();
        }
    }

    @Override // p.C0728t, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        P p10 = this.f10299Q;
        if (p10 != null) {
            if (!p10.f2924t) {
                ((OtpView) p10.f2925u).removeCallbacks(p10);
                p10.f2924t = true;
            }
            g(false);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 'this'  ??, new type: com.mukesh.OtpView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v16 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v16 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v17 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v18 ??, new type: android.graphics.RectF
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r18v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 'this'  ??, new type: com.mukesh.OtpView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v16 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mukesh.OtpView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z6, int i10, Rect rect) {
        super.onFocusChanged(z6, i10, rect);
        if (z6) {
            if (getText() != null) {
                setSelection(getText().length());
            }
            h();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = this.f10285B;
        if (mode != 1073741824) {
            int i13 = this.f10311z;
            int i14 = (i13 * this.f10284A) + ((i13 - 1) * this.f10287D);
            WeakHashMap weakHashMap = U.a;
            size = getPaddingStart() + getPaddingEnd() + i14;
            if (this.f10287D == 0) {
                size -= (this.f10311z - 1) * this.f10292I;
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingTop() + i12 + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onScreenStateChanged(int i10) {
        P p10;
        super.onScreenStateChanged(i10);
        if (i10 == 1) {
            P p11 = this.f10299Q;
            if (p11 != null) {
                p11.f2924t = false;
                h();
                return;
            }
            return;
        }
        if (i10 != 0 || (p10 = this.f10299Q) == null) {
            return;
        }
        if (!p10.f2924t) {
            ((OtpView) p10.f2925u).removeCallbacks(p10);
            p10.f2924t = true;
        }
        g(false);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (getText() == null || i11 == getText().length() || getText() == null) {
            return;
        }
        setSelection(getText().length());
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        b bVar;
        ValueAnimator valueAnimator = this.f10298O;
        if (i10 != charSequence.length() && getText() != null) {
            setSelection(getText().length());
        }
        if (charSequence.length() == this.f10311z && (bVar = this.f10309e0) != null) {
            String string = charSequence.toString();
            B b3 = (B) bVar;
            int i13 = PasscodeActivity.f10200W;
            PasscodeActivity passcodeActivity = (PasscodeActivity) b3.f1351u;
            i.f(passcodeActivity, "this$0");
            if (((Intent) b3.f1350t).hasExtra("is_setup_passcode")) {
                SharedPreferences.Editor editorEdit = passcodeActivity.y().edit();
                editorEdit.putString("key_passcode", string);
                editorEdit.apply();
                passcodeActivity.finish();
            } else if (i.a(string, String.valueOf(passcodeActivity.y().getString("key_passcode", null)))) {
                SharedPreferences.Editor editorEdit2 = passcodeActivity.y().edit();
                editorEdit2.putBoolean("unlocked", true);
                editorEdit2.remove("app_locked");
                editorEdit2.apply();
                Ha.a.a.getClass();
                za.c.k(new Object[0]);
                Intent intent = new Intent("com.kcstream.cing.broadcast.guard");
                intent.putExtra("unlocked", true);
                passcodeActivity.sendBroadcast(intent);
                if (passcodeActivity.y().contains("is_splash")) {
                    D3.b.H(passcodeActivity, MainActivity.class);
                    passcodeActivity.finish();
                } else {
                    passcodeActivity.finish();
                }
            } else {
                Ha.a.a.getClass();
                za.c.k(new Object[0]);
                Toast.makeText(passcodeActivity, "PIN Salah", 0).show();
            }
        }
        h();
        if (!this.P || i12 - i11 <= 0 || valueAnimator == null) {
            return;
        }
        valueAnimator.end();
        valueAnimator.start();
    }

    public void setAnimationEnable(boolean z6) {
        this.P = z6;
    }

    public void setCursorColor(int i10) {
        this.f10304V = i10;
        if (this.f10300R) {
            g(true);
        }
    }

    @Override // android.widget.TextView
    public void setCursorVisible(boolean z6) {
        if (this.f10300R != z6) {
            this.f10300R = z6;
            g(z6);
            h();
        }
    }

    public void setCursorWidth(int i10) {
        this.f10303U = i10;
        if (this.f10300R) {
            g(true);
        }
    }

    public void setHideLineWhenFilled(boolean z6) {
        this.f10307b0 = z6;
    }

    public void setItemBackground(Drawable drawable) {
        this.f10305W = 0;
        this.f10306a0 = drawable;
        invalidate();
    }

    public void setItemBackgroundColor(int i10) {
        Drawable drawable = this.f10306a0;
        if (!(drawable instanceof ColorDrawable)) {
            setItemBackground(new ColorDrawable(i10));
        } else {
            ((ColorDrawable) drawable.mutate()).setColor(i10);
            this.f10305W = 0;
        }
    }

    public void setItemBackgroundResources(int i10) {
        if (i10 == 0 || this.f10305W == i10) {
            Resources resources = getResources();
            Resources.Theme theme = getContext().getTheme();
            ThreadLocal threadLocal = o.a;
            Drawable drawableA = K.i.a(resources, i10, theme);
            this.f10306a0 = drawableA;
            setItemBackground(drawableA);
            this.f10305W = i10;
        }
    }

    public void setItemCount(int i10) {
        this.f10311z = i10;
        setMaxLength(i10);
        requestLayout();
    }

    public void setItemHeight(int i10) {
        this.f10285B = i10;
        k();
        requestLayout();
    }

    public void setItemRadius(int i10) {
        this.f10286C = i10;
        b();
        requestLayout();
    }

    public void setItemSpacing(int i10) {
        this.f10287D = i10;
        requestLayout();
    }

    public void setItemWidth(int i10) {
        this.f10284A = i10;
        b();
        requestLayout();
    }

    public void setLineColor(int i10) {
        this.f10290G = ColorStateList.valueOf(i10);
        j();
    }

    public void setLineWidth(int i10) {
        this.f10292I = i10;
        b();
        requestLayout();
    }

    public void setMaskingChar(String str) {
        this.f10308d0 = str;
        requestLayout();
    }

    public void setOtpCompletionListener(b bVar) {
        this.f10309e0 = bVar;
    }

    @Override // android.widget.TextView
    public void setTextSize(float f10) {
        super.setTextSize(f10);
        k();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        TextPaint textPaint = this.f10289F;
        if (textPaint != null) {
            textPaint.set(getPaint());
        }
    }

    public void setLineColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f10290G = colorStateList;
            j();
            return;
        }
        throw new IllegalArgumentException("Color cannot be null");
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        k();
    }
}
