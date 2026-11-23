package p139o3;

import C8.E;
import D3.b;
import K.o;
import Q2.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final ColorStateList a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f13718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f13719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f13721i;
    public final ColorStateList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f13722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f13723l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13724m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Typeface f13725n;

    public d(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, a.P);
        this.f13722k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.j = E.n(context, typedArrayObtainStyledAttributes, 3);
        E.n(context, typedArrayObtainStyledAttributes, 4);
        E.n(context, typedArrayObtainStyledAttributes, 5);
        this.f13715c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f13716d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i11 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f13723l = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
        this.f13714b = typedArrayObtainStyledAttributes.getString(i11);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.a = E.n(context, typedArrayObtainStyledAttributes, 6);
        this.f13717e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f13718f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f13719g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, a.f3992C);
        this.f13720h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f13721i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f13725n;
        int i10 = this.f13715c;
        if (typeface == null && (str = this.f13714b) != null) {
            this.f13725n = Typeface.create(str, i10);
        }
        if (this.f13725n == null) {
            int i11 = this.f13716d;
            if (i11 == 1) {
                this.f13725n = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.f13725n = Typeface.SERIF;
            } else if (i11 != 3) {
                this.f13725n = Typeface.DEFAULT;
            } else {
                this.f13725n = Typeface.MONOSPACE;
            }
            this.f13725n = Typeface.create(this.f13725n, i10);
        }
    }

    public final Typeface b(Context context) {
        if (this.f13724m) {
            return this.f13725n;
        }
        if (!context.isRestricted()) {
            try {
                int i10 = this.f13723l;
                ThreadLocal threadLocal = o.a;
                Typeface typefaceB = context.isRestricted() ? null : o.b(context, i10, new TypedValue(), 0, null, false, false);
                this.f13725n = typefaceB;
                if (typefaceB != null) {
                    this.f13725n = Typeface.create(typefaceB, this.f13715c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        a();
        this.f13724m = true;
        return this.f13725n;
    }

    public final void c(Context context, b bVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f13723l;
        if (i10 == 0) {
            this.f13724m = true;
        }
        if (this.f13724m) {
            bVar.z(this.f13725n, true);
            return;
        }
        try {
            b bVar2 = new b(this, bVar);
            ThreadLocal threadLocal = o.a;
            if (context.isRestricted()) {
                bVar2.a(-4);
            } else {
                o.b(context, i10, new TypedValue(), 0, bVar2, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f13724m = true;
            bVar.y(1);
        } catch (Exception unused2) {
            this.f13724m = true;
            bVar.y(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typefaceB = null;
        int i10 = this.f13723l;
        if (i10 != 0) {
            ThreadLocal threadLocal = o.a;
            if (!context.isRestricted()) {
                typefaceB = o.b(context, i10, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceB != null;
    }

    public final void e(Context context, TextPaint textPaint, b bVar) {
        f(context, textPaint, bVar);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.f13719g, this.f13717e, this.f13718f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, b bVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f13725n);
        c(context, new c(this, context, textPaint, bVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceO = J7.a.o(context.getResources().getConfiguration(), typeface);
        if (typefaceO != null) {
            typeface = typefaceO;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f13715c;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f13722k);
        if (this.f13720h) {
            textPaint.setLetterSpacing(this.f13721i);
        }
    }
}
