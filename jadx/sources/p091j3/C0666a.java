package p091j3;

import S.k;
import U.U;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p139o3.a;

/* JADX INFO: renamed from: j3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0666a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f12373A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f12374B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f12375C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Bitmap f12377E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f12378F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f12379G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f12380H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f12381I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f12382J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f12383K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int[] f12384L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f12385M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final TextPaint f12386N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextPaint f12387O;
    public LinearInterpolator P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f12388Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f12389R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public float f12390S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f12391T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ColorStateList f12392U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f12393V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float f12394W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public float f12395X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public StaticLayout f12396Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public float f12397Z;
    public final TextInputLayout a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f12398a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12399b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f12400b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f12401c;
    public CharSequence c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f12402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f12404e;
    public ColorStateList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f12410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f12411l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f12412m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f12413n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f12414o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f12415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f12416q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Typeface f12417r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Typeface f12418s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Typeface f12419t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f12420u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Typeface f12421v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f12422w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f12423x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a f12424y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12406f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12407g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f12408h = 15.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f12409i = 15.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f12425z = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f12376D = true;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f12403d0 = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final float f12405e0 = 1.0f;
    public final int f0 = 1;

    public C0666a(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f12386N = textPaint;
        this.f12387O = new TextPaint(textPaint);
        this.f12402d = new Rect();
        this.f12401c = new Rect();
        this.f12404e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i10, float f10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static float f(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return R2.a.a(f10, f11, f12);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = U.a;
        boolean z6 = this.a.getLayoutDirection() == 1;
        if (this.f12376D) {
            return (z6 ? k.f4505d : k.f4504c).i(charSequence.length(), charSequence);
        }
        return z6;
    }

    public final void c(float f10, boolean z6) {
        float f11;
        float f12;
        Typeface typeface;
        boolean z10;
        Layout.Alignment alignment;
        if (this.f12373A == null) {
            return;
        }
        float fWidth = this.f12402d.width();
        float fWidth2 = this.f12401c.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            f11 = this.f12409i;
            f12 = this.f12393V;
            this.f12378F = 1.0f;
            typeface = this.f12417r;
        } else {
            float f13 = this.f12408h;
            float f14 = this.f12394W;
            Typeface typeface2 = this.f12420u;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                this.f12378F = 1.0f;
            } else {
                this.f12378F = f(this.f12408h, this.f12409i, f10, this.f12388Q) / this.f12408h;
            }
            float f15 = this.f12409i / this.f12408h;
            fWidth = (z6 || fWidth2 * f15 <= fWidth) ? fWidth2 : Math.min(fWidth / f15, fWidth2);
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f12386N;
        if (fWidth > 0.0f) {
            boolean z11 = this.f12379G != f11;
            boolean z12 = this.f12395X != f12;
            boolean z13 = this.f12423x != typeface;
            StaticLayout staticLayout = this.f12396Y;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || this.f12385M;
            this.f12379G = f11;
            this.f12395X = f12;
            this.f12423x = typeface;
            this.f12385M = false;
            textPaint.setLinearText(this.f12378F != 1.0f);
            z10 = z14;
        } else {
            z10 = false;
        }
        if (this.f12374B == null || z10) {
            textPaint.setTextSize(this.f12379G);
            textPaint.setTypeface(this.f12423x);
            textPaint.setLetterSpacing(this.f12395X);
            boolean zB = b(this.f12373A);
            this.f12375C = zB;
            int i10 = this.f12403d0;
            if (i10 <= 1 || zB) {
                i10 = 1;
            }
            if (i10 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f12406f, zB ? 1 : 0) & 7;
                if (absoluteGravity == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (absoluteGravity != 5) {
                    alignment = this.f12375C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = this.f12375C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
            }
            x xVar = new x(this.f12373A, textPaint, (int) fWidth);
            xVar.f12491k = this.f12425z;
            xVar.j = zB;
            xVar.f12486e = alignment;
            xVar.f12490i = false;
            xVar.f12487f = i10;
            xVar.f12488g = this.f12405e0;
            xVar.f12489h = this.f0;
            StaticLayout staticLayoutA = xVar.a();
            staticLayoutA.getClass();
            this.f12396Y = staticLayoutA;
            this.f12374B = staticLayoutA.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f12387O;
        textPaint.setTextSize(this.f12409i);
        textPaint.setTypeface(this.f12417r);
        textPaint.setLetterSpacing(this.f12393V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f12384L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f12419t;
            if (typeface != null) {
                this.f12418s = J7.a.o(configuration, typeface);
            }
            Typeface typeface2 = this.f12422w;
            if (typeface2 != null) {
                this.f12421v = J7.a.o(configuration, typeface2);
            }
            Typeface typeface3 = this.f12418s;
            if (typeface3 == null) {
                typeface3 = this.f12419t;
            }
            this.f12417r = typeface3;
            Typeface typeface4 = this.f12421v;
            if (typeface4 == null) {
                typeface4 = this.f12422w;
            }
            this.f12420u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z6) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z6) {
            return;
        }
        c(1.0f, z6);
        CharSequence charSequence = this.f12374B;
        TextPaint textPaint = this.f12386N;
        if (charSequence != null && (staticLayout = this.f12396Y) != null) {
            this.c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f12425z);
        }
        CharSequence charSequence2 = this.c0;
        if (charSequence2 != null) {
            this.f12397Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f12397Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f12407g, this.f12375C ? 1 : 0);
        int i10 = absoluteGravity & 112;
        Rect rect = this.f12402d;
        if (i10 == 48) {
            this.f12412m = rect.top;
        } else if (i10 != 80) {
            this.f12412m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f12412m = textPaint.ascent() + rect.bottom;
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f12414o = rect.centerX() - (this.f12397Z / 2.0f);
        } else if (i11 != 5) {
            this.f12414o = rect.left;
        } else {
            this.f12414o = rect.right - this.f12397Z;
        }
        c(0.0f, z6);
        StaticLayout staticLayout2 = this.f12396Y;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f12396Y;
        if (staticLayout3 == null || this.f12403d0 <= 1) {
            CharSequence charSequence3 = this.f12374B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f12396Y;
        if (staticLayout4 != null) {
            staticLayout4.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f12406f, this.f12375C ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        Rect rect2 = this.f12401c;
        if (i12 == 48) {
            this.f12411l = rect2.top;
        } else if (i12 != 80) {
            this.f12411l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f12411l = textPaint.descent() + (rect2.bottom - height);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f12413n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i13 != 5) {
            this.f12413n = rect2.left;
        } else {
            this.f12413n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f12377E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f12377E = null;
        }
        l(this.f12399b);
        float f10 = this.f12399b;
        float f11 = f(rect2.left, rect.left, f10, this.P);
        RectF rectF = this.f12404e;
        rectF.left = f11;
        rectF.top = f(this.f12411l, this.f12412m, f10, this.P);
        rectF.right = f(rect2.right, rect.right, f10, this.P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f10, this.P);
        this.f12415p = f(this.f12413n, this.f12414o, f10, this.P);
        this.f12416q = f(this.f12411l, this.f12412m, f10, this.P);
        l(f10);
        p178s0.a aVar = R2.a.f4441b;
        this.f12398a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, aVar);
        WeakHashMap weakHashMap = U.a;
        textInputLayout.postInvalidateOnAnimation();
        this.f12400b0 = f(1.0f, 0.0f, f10, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f12410k;
        ColorStateList colorStateList2 = this.j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), f10, e(this.f12410k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f12 = this.f12393V;
        float f13 = this.f12394W;
        if (f12 != f13) {
            textPaint.setLetterSpacing(f(f13, f12, f10, aVar));
        } else {
            textPaint.setLetterSpacing(f12);
        }
        this.f12380H = R2.a.a(0.0f, this.f12389R, f10);
        this.f12381I = R2.a.a(0.0f, this.f12390S, f10);
        this.f12382J = R2.a.a(0.0f, this.f12391T, f10);
        int iA = a(0, f10, e(this.f12392U));
        this.f12383K = iA;
        textPaint.setShadowLayer(this.f12380H, this.f12381I, this.f12382J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f12410k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.f12410k = colorStateList;
        this.j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        a aVar = this.f12424y;
        if (aVar != null) {
            aVar.f13708c = true;
        }
        if (this.f12419t == typeface) {
            return false;
        }
        this.f12419t = typeface;
        Typeface typefaceO = J7.a.o(this.a.getContext().getResources().getConfiguration(), typeface);
        this.f12418s = typefaceO;
        if (typefaceO == null) {
            typefaceO = this.f12419t;
        }
        this.f12417r = typefaceO;
        return true;
    }

    public final void k(float f10) {
        float fD = p181s3.a.d(f10, 0.0f, 1.0f);
        if (fD != this.f12399b) {
            this.f12399b = fD;
            Rect rect = this.f12401c;
            float f11 = rect.left;
            Rect rect2 = this.f12402d;
            float f12 = f(f11, rect2.left, fD, this.P);
            RectF rectF = this.f12404e;
            rectF.left = f12;
            rectF.top = f(this.f12411l, this.f12412m, fD, this.P);
            rectF.right = f(rect.right, rect2.right, fD, this.P);
            rectF.bottom = f(rect.bottom, rect2.bottom, fD, this.P);
            this.f12415p = f(this.f12413n, this.f12414o, fD, this.P);
            this.f12416q = f(this.f12411l, this.f12412m, fD, this.P);
            l(fD);
            p178s0.a aVar = R2.a.f4441b;
            this.f12398a0 = 1.0f - f(0.0f, 1.0f, 1.0f - fD, aVar);
            WeakHashMap weakHashMap = U.a;
            TextInputLayout textInputLayout = this.a;
            textInputLayout.postInvalidateOnAnimation();
            this.f12400b0 = f(1.0f, 0.0f, fD, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f12410k;
            ColorStateList colorStateList2 = this.j;
            TextPaint textPaint = this.f12386N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), fD, e(this.f12410k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f13 = this.f12393V;
            float f14 = this.f12394W;
            if (f13 != f14) {
                textPaint.setLetterSpacing(f(f14, f13, fD, aVar));
            } else {
                textPaint.setLetterSpacing(f13);
            }
            this.f12380H = R2.a.a(0.0f, this.f12389R, fD);
            this.f12381I = R2.a.a(0.0f, this.f12390S, fD);
            this.f12382J = R2.a.a(0.0f, this.f12391T, fD);
            int iA = a(0, fD, e(this.f12392U));
            this.f12383K = iA;
            textPaint.setShadowLayer(this.f12380H, this.f12381I, this.f12382J, iA);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f10) {
        c(f10, false);
        WeakHashMap weakHashMap = U.a;
        this.a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z6;
        boolean zJ = j(typeface);
        if (this.f12422w != typeface) {
            this.f12422w = typeface;
            Typeface typefaceO = J7.a.o(this.a.getContext().getResources().getConfiguration(), typeface);
            this.f12421v = typefaceO;
            if (typefaceO == null) {
                typefaceO = this.f12422w;
            }
            this.f12420u = typefaceO;
            z6 = true;
        } else {
            z6 = false;
        }
        if (zJ || z6) {
            h(false);
        }
    }
}
