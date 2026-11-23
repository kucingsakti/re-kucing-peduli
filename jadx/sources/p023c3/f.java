package p023c3;

import I4.b;
import R2.d;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p091j3.C;
import p091j3.y;
import p091j3.z;
import p149p3.a;
import p170r3.g;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g implements Drawable.Callback, y {
    public static final int[] Y0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public static final ShapeDrawable f7461Z0 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final RectF f7462A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final PointF f7463B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final Path f7464C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final z f7465D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f7466E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f7467F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f7468G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f7469H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f7470I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f7471J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public boolean f7472K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public int f7473L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f7474M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public ColorFilter f7475N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public PorterDuffColorFilter f7476O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public ColorStateList f7477P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ColorStateList f7478Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public PorterDuff.Mode f7479Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ColorStateList f7480R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public int[] f7481R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public float f7482S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public ColorStateList f7483S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f7484T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public WeakReference f7485T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ColorStateList f7486U;
    public TextUtils.TruncateAt U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f7487V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public boolean f7488V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ColorStateList f7489W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public int f7490W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public CharSequence f7491X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public boolean f7492X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f7493Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Drawable f7494Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ColorStateList f7495a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f7496b0;
    public boolean c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f7497d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Drawable f7498e0;
    public RippleDrawable f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ColorStateList f7499g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f7500h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public SpannableStringBuilder f7501i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f7502j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f7503k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Drawable f7504l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ColorStateList f7505m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public d f7506n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public d f7507o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f7508p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f7509q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f7510r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f7511s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f7512t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f7513u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float f7514v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f7515w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Context f7516x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Paint f7517y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final Paint.FontMetrics f7518z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kcstream.cing.R.attr.chipStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_Chip_Action);
        this.f7484T = -1.0f;
        this.f7517y0 = new Paint(1);
        this.f7518z0 = new Paint.FontMetrics();
        this.f7462A0 = new RectF();
        this.f7463B0 = new PointF();
        this.f7464C0 = new Path();
        this.f7474M0 = 255;
        this.f7479Q0 = PorterDuff.Mode.SRC_IN;
        this.f7485T0 = new WeakReference(null);
        j(context);
        this.f7516x0 = context;
        z zVar = new z(this);
        this.f7465D0 = zVar;
        this.f7491X = "";
        zVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = Y0;
        setState(iArr);
        if (!Arrays.equals(this.f7481R0, iArr)) {
            this.f7481R0 = iArr;
            if (W()) {
                z(getState(), iArr);
            }
        }
        this.f7488V0 = true;
        int[] iArr2 = a.a;
        f7461Z0.setTint(-1);
    }

    public static void X(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean w(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean x(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z6) {
        if (this.f7502j0 != z6) {
            this.f7502j0 = z6;
            float fT = t();
            if (!z6 && this.f7472K0) {
                this.f7472K0 = false;
            }
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void B(Drawable drawable) {
        if (this.f7504l0 != drawable) {
            float fT = t();
            this.f7504l0 = drawable;
            float fT2 = t();
            X(this.f7504l0);
            r(this.f7504l0);
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void C(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f7505m0 != colorStateList) {
            this.f7505m0 = colorStateList;
            if (this.f7503k0 && (drawable = this.f7504l0) != null && this.f7502j0) {
                M.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void D(boolean z6) {
        if (this.f7503k0 != z6) {
            boolean zU = U();
            this.f7503k0 = z6;
            boolean zU2 = U();
            if (zU != zU2) {
                if (zU2) {
                    r(this.f7504l0);
                } else {
                    X(this.f7504l0);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void E(float f10) {
        if (this.f7484T != f10) {
            this.f7484T = f10;
            b bVarF = this.f14501s.a.f();
            bVarF.c(f10);
            setShapeAppearanceModel(bVarF.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void F(Drawable drawable) {
        ?? r10;
        Object obj = this.f7494Z;
        if (obj == null) {
            r10 = 0;
        } else if (obj instanceof M.g) {
            r10 = obj;
            r10 = 0;
        }
        if (r10 != drawable) {
            float fT = t();
            this.f7494Z = drawable != null ? drawable.mutate() : null;
            float fT2 = t();
            X(r10);
            if (V()) {
                r(this.f7494Z);
            }
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void G(float f10) {
        if (this.f7496b0 != f10) {
            float fT = t();
            this.f7496b0 = f10;
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        this.c0 = true;
        if (this.f7495a0 != colorStateList) {
            this.f7495a0 = colorStateList;
            if (V()) {
                M.a.h(this.f7494Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z6) {
        if (this.f7493Y != z6) {
            boolean zV = V();
            this.f7493Y = z6;
            boolean zV2 = V();
            if (zV != zV2) {
                if (zV2) {
                    r(this.f7494Z);
                } else {
                    X(this.f7494Z);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        if (this.f7486U != colorStateList) {
            this.f7486U = colorStateList;
            if (this.f7492X0) {
                p170r3.f fVar = this.f14501s;
                if (fVar.f14473d != colorStateList) {
                    fVar.f14473d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void K(float f10) {
        if (this.f7487V != f10) {
            this.f7487V = f10;
            this.f7517y0.setStrokeWidth(f10);
            if (this.f7492X0) {
                this.f14501s.j = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final void L(Drawable drawable) {
        ?? r10;
        Object obj = this.f7498e0;
        if (obj == null) {
            r10 = 0;
        } else if (obj instanceof M.g) {
            r10 = obj;
            r10 = 0;
        }
        if (r10 != drawable) {
            float fU = u();
            this.f7498e0 = drawable != null ? drawable.mutate() : null;
            int[] iArr = a.a;
            this.f0 = new RippleDrawable(a.c(this.f7489W), this.f7498e0, f7461Z0);
            float fU2 = u();
            X(r10);
            if (W()) {
                r(this.f7498e0);
            }
            invalidateSelf();
            if (fU != fU2) {
                y();
            }
        }
    }

    public final void M(float f10) {
        if (this.f7514v0 != f10) {
            this.f7514v0 = f10;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void N(float f10) {
        if (this.f7500h0 != f10) {
            this.f7500h0 = f10;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void O(float f10) {
        if (this.f7513u0 != f10) {
            this.f7513u0 = f10;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f7499g0 != colorStateList) {
            this.f7499g0 = colorStateList;
            if (W()) {
                M.a.h(this.f7498e0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(boolean z6) {
        if (this.f7497d0 != z6) {
            boolean zW = W();
            this.f7497d0 = z6;
            boolean zW2 = W();
            if (zW != zW2) {
                if (zW2) {
                    r(this.f7498e0);
                } else {
                    X(this.f7498e0);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void R(float f10) {
        if (this.f7510r0 != f10) {
            float fT = t();
            this.f7510r0 = f10;
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void S(float f10) {
        if (this.f7509q0 != f10) {
            float fT = t();
            this.f7509q0 = f10;
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void T(ColorStateList colorStateList) {
        if (this.f7489W != colorStateList) {
            this.f7489W = colorStateList;
            this.f7483S0 = null;
            onStateChange(getState());
        }
    }

    public final boolean U() {
        return this.f7503k0 && this.f7504l0 != null && this.f7472K0;
    }

    public final boolean V() {
        return this.f7493Y && this.f7494Z != null;
    }

    public final boolean W() {
        return this.f7497d0 && this.f7498e0 != null;
    }

    @Override // p091j3.y
    public final void a() {
        y();
        invalidateSelf();
    }

    @Override // p170r3.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f10;
        int i11;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i10 = this.f7474M0) == 0) {
            return;
        }
        if (i10 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z6 = this.f7492X0;
        Paint paint = this.f7517y0;
        RectF rectF = this.f7462A0;
        if (!z6) {
            paint.setColor(this.f7466E0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, v(), v(), paint);
        }
        if (!this.f7492X0) {
            paint.setColor(this.f7467F0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f7475N0;
            if (colorFilter == null) {
                colorFilter = this.f7476O0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, v(), v(), paint);
        }
        if (this.f7492X0) {
            super.draw(canvas);
        }
        if (this.f7487V > 0.0f && !this.f7492X0) {
            paint.setColor(this.f7469H0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f7492X0) {
                ColorFilter colorFilter2 = this.f7475N0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f7476O0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f11 = bounds.left;
            float f12 = this.f7487V / 2.0f;
            rectF.set(f11 + f12, bounds.top + f12, bounds.right - f12, bounds.bottom - f12);
            float f13 = this.f7484T - (this.f7487V / 2.0f);
            canvas2.drawRoundRect(rectF, f13, f13, paint);
        }
        paint.setColor(this.f7470I0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f7492X0) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f7464C0;
            p170r3.f fVar = this.f14501s;
            this.f14495J.a(fVar.a, fVar.f14478i, rectF2, this.f14494I, path);
            e(canvas2, paint, path, this.f14501s.a, g());
        } else {
            canvas2.drawRoundRect(rectF, v(), v(), paint);
        }
        if (V()) {
            s(bounds, rectF);
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.f7494Z.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f7494Z.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (U()) {
            s(bounds, rectF);
            float f16 = rectF.left;
            float f17 = rectF.top;
            canvas2.translate(f16, f17);
            this.f7504l0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f7504l0.draw(canvas2);
            canvas2.translate(-f16, -f17);
        }
        if (this.f7488V0 && this.f7491X != null) {
            PointF pointF = this.f7463B0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f7491X;
            z zVar = this.f7465D0;
            if (charSequence != null) {
                float fT = t() + this.f7508p0 + this.f7511s0;
                if (M.b.a(this) == 0) {
                    pointF.x = bounds.left + fT;
                } else {
                    pointF.x = bounds.right - fT;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = zVar.a;
                Paint.FontMetrics fontMetrics = this.f7518z0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f7491X != null) {
                float fT2 = t() + this.f7508p0 + this.f7511s0;
                float fU = u() + this.f7515w0 + this.f7512t0;
                if (M.b.a(this) == 0) {
                    rectF.left = bounds.left + fT2;
                    rectF.right = bounds.right - fU;
                } else {
                    rectF.left = bounds.left + fU;
                    rectF.right = bounds.right - fT2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            p139o3.d dVar = zVar.f12497g;
            TextPaint textPaint2 = zVar.a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                zVar.f12497g.e(this.f7516x0, textPaint2, zVar.f12492b);
            }
            textPaint2.setTextAlign(align);
            String string = this.f7491X.toString();
            if (zVar.f12495e) {
                zVar.a(string);
                f10 = zVar.f12493c;
            } else {
                f10 = zVar.f12493c;
            }
            boolean z10 = Math.round(f10) > Math.round(rectF.width());
            if (z10) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i11 = iSave;
            } else {
                i11 = 0;
            }
            CharSequence charSequenceEllipsize = this.f7491X;
            if (z10 && this.U0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.U0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z10) {
                canvas2.restoreToCount(i11);
            }
        }
        if (W()) {
            rectF.setEmpty();
            if (W()) {
                float f18 = this.f7515w0 + this.f7514v0;
                if (M.b.a(this) == 0) {
                    float f19 = bounds.right - f18;
                    rectF.right = f19;
                    rectF.left = f19 - this.f7500h0;
                } else {
                    float f20 = bounds.left + f18;
                    rectF.left = f20;
                    rectF.right = f20 + this.f7500h0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f21 = this.f7500h0;
                float f22 = fExactCenterY - (f21 / 2.0f);
                rectF.top = f22;
                rectF.bottom = f22 + f21;
            }
            float f23 = rectF.left;
            float f24 = rectF.top;
            canvas2.translate(f23, f24);
            this.f7498e0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = a.a;
            this.f0.setBounds(this.f7498e0.getBounds());
            this.f0.jumpToCurrentState();
            this.f0.draw(canvas2);
            canvas2.translate(-f23, -f24);
        }
        if (this.f7474M0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // p170r3.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f7474M0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f7475N0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f7482S;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f10;
        float fT = t() + this.f7508p0 + this.f7511s0;
        String string = this.f7491X.toString();
        z zVar = this.f7465D0;
        if (zVar.f12495e) {
            zVar.a(string);
            f10 = zVar.f12493c;
        } else {
            f10 = zVar.f12493c;
        }
        return Math.min(Math.round(u() + f10 + fT + this.f7512t0 + this.f7515w0), this.f7490W0);
    }

    @Override // p170r3.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p170r3.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f7492X0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f7482S, this.f7484T);
        } else {
            outline.setRoundRect(bounds, this.f7484T);
            outline2 = outline;
        }
        outline2.setAlpha(this.f7474M0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p170r3.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (w(this.f7478Q) || w(this.f7480R) || w(this.f7486U)) {
            return true;
        }
        p139o3.d dVar = this.f7465D0.f12497g;
        if (dVar == null || (colorStateList = dVar.j) == null || !colorStateList.isStateful()) {
            return (this.f7503k0 && this.f7504l0 != null && this.f7502j0) || x(this.f7494Z) || x(this.f7504l0) || w(this.f7477P0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (V()) {
            zOnLayoutDirectionChanged |= M.b.b(this.f7494Z, i10);
        }
        if (U()) {
            zOnLayoutDirectionChanged |= M.b.b(this.f7504l0, i10);
        }
        if (W()) {
            zOnLayoutDirectionChanged |= M.b.b(this.f7498e0, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (V()) {
            zOnLevelChange |= this.f7494Z.setLevel(i10);
        }
        if (U()) {
            zOnLevelChange |= this.f7504l0.setLevel(i10);
        }
        if (W()) {
            zOnLevelChange |= this.f7498e0.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p170r3.g, android.graphics.drawable.Drawable, p091j3.y
    public final boolean onStateChange(int[] iArr) {
        if (this.f7492X0) {
            super.onStateChange(iArr);
        }
        return z(iArr, this.f7481R0);
    }

    public final void r(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        M.b.b(drawable, M.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f7498e0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f7481R0);
            }
            M.a.h(drawable, this.f7499g0);
            return;
        }
        Drawable drawable2 = this.f7494Z;
        if (drawable == drawable2 && this.c0) {
            M.a.h(drawable2, this.f7495a0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void s(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (V() || U()) {
            float f10 = this.f7508p0 + this.f7509q0;
            Drawable drawable = this.f7472K0 ? this.f7504l0 : this.f7494Z;
            float intrinsicWidth = this.f7496b0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (M.b.a(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + intrinsicWidth;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - intrinsicWidth;
            }
            Drawable drawable2 = this.f7472K0 ? this.f7504l0 : this.f7494Z;
            float fCeil = this.f7496b0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(C.e(this.f7516x0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p170r3.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f7474M0 != i10) {
            this.f7474M0 = i10;
            invalidateSelf();
        }
    }

    @Override // p170r3.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f7475N0 != colorFilter) {
            this.f7475N0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p170r3.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f7477P0 != colorStateList) {
            this.f7477P0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p170r3.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f7479Q0 != mode) {
            this.f7479Q0 = mode;
            ColorStateList colorStateList = this.f7477P0;
            this.f7476O0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z10) {
        boolean visible = super.setVisible(z6, z10);
        if (V()) {
            visible |= this.f7494Z.setVisible(z6, z10);
        }
        if (U()) {
            visible |= this.f7504l0.setVisible(z6, z10);
        }
        if (W()) {
            visible |= this.f7498e0.setVisible(z6, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        if (!V() && !U()) {
            return 0.0f;
        }
        float f10 = this.f7509q0;
        Drawable drawable = this.f7472K0 ? this.f7504l0 : this.f7494Z;
        float intrinsicWidth = this.f7496b0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f10 + this.f7510r0;
    }

    public final float u() {
        if (W()) {
            return this.f7513u0 + this.f7500h0 + this.f7514v0;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        return this.f7492X0 ? h() : this.f7484T;
    }

    public final void y() {
        e eVar = (e) this.f7485T0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f9619I);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean z(int[] iArr, int[] iArr2) {
        boolean z6;
        boolean z10;
        ColorStateList colorStateList;
        boolean state = true;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f7478Q;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f7466E0) : 0);
        if (this.f7466E0 != iC) {
            this.f7466E0 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f7480R;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f7467F0) : 0);
        if (this.f7467F0 != iC2) {
            this.f7467F0 = iC2;
            zOnStateChange = true;
        }
        int iB = L.a.b(iC2, iC);
        if ((this.f7468G0 != iB) | (this.f14501s.f14472c == null)) {
            this.f7468G0 = iB;
            l(ColorStateList.valueOf(iB));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f7486U;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f7469H0) : 0;
        if (this.f7469H0 != colorForState) {
            this.f7469H0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f7483S0 == null || !a.d(iArr)) ? 0 : this.f7483S0.getColorForState(iArr, this.f7470I0);
        if (this.f7470I0 != colorForState2) {
            this.f7470I0 = colorForState2;
        }
        p139o3.d dVar = this.f7465D0.f12497g;
        int colorForState3 = (dVar == null || (colorStateList = dVar.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f7471J0);
        if (this.f7471J0 != colorForState3) {
            this.f7471J0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (state2[i10] != 16842912) {
                        i10++;
                    } else if (this.f7502j0) {
                        z6 = true;
                        break;
                    }
                }
                z6 = false;
                break;
            }
        } else {
            z6 = false;
            break;
        }
        if (this.f7472K0 == z6 || this.f7504l0 == null) {
            z10 = false;
        } else {
            float fT = t();
            this.f7472K0 = z6;
            if (fT != t()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                zOnStateChange = true;
                z10 = false;
            }
        }
        ColorStateList colorStateList5 = this.f7477P0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f7473L0) : 0;
        if (this.f7473L0 != colorForState4) {
            this.f7473L0 = colorForState4;
            ColorStateList colorStateList6 = this.f7477P0;
            PorterDuff.Mode mode = this.f7479Q0;
            this.f7476O0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (x(this.f7494Z)) {
            state |= this.f7494Z.setState(iArr);
        }
        if (x(this.f7504l0)) {
            state |= this.f7504l0.setState(iArr);
        }
        if (x(this.f7498e0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f7498e0.setState(iArr3);
        }
        int[] iArr4 = a.a;
        if (x(this.f0)) {
            state |= this.f0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            y();
        }
        return state;
    }
}
