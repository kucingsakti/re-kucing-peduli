package p081i3;

import L1.b;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p086i8.C;
import p170r3.c;
import p170r3.j;
import p170r3.k;
import p170r3.l;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f12197b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f12203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12204i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12207m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f12209o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f12210p;
    public final l a = k.a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f12198c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f12199d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f12200e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f12201f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f12202g = new b(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12208n = true;

    public a(j jVar) {
        this.f12209o = jVar;
        Paint paint = new Paint(1);
        this.f12197b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z6 = this.f12208n;
        Paint paint = this.f12197b;
        Rect rect = this.f12199d;
        if (z6) {
            copyBounds(rect);
            float fHeight = this.f12203h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{L.a.b(this.f12204i, this.f12207m), L.a.b(this.j, this.f12207m), L.a.b(L.a.d(this.j, 0), this.f12207m), L.a.b(L.a.d(this.f12206l, 0), this.f12207m), L.a.b(this.f12206l, this.f12207m), L.a.b(this.f12205k, this.f12207m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f12208n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f12200e;
        rectF.set(rect);
        c cVar = this.f12209o.f14513e;
        RectF rectF2 = this.f12201f;
        rectF2.set(getBounds());
        float fMin = Math.min(cVar.a(rectF2), rectF.width() / 2.0f);
        j jVar = this.f12209o;
        rectF2.set(getBounds());
        if (jVar.e(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f12202g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f12203h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        j jVar = this.f12209o;
        RectF rectF = this.f12201f;
        rectF.set(getBounds());
        if (jVar.e(rectF)) {
            c cVar = this.f12209o.f14513e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), cVar.a(rectF));
            return;
        }
        Rect rect = this.f12199d;
        copyBounds(rect);
        RectF rectF2 = this.f12200e;
        rectF2.set(rect);
        j jVar2 = this.f12209o;
        Path path = this.f12198c;
        this.a.a(jVar2, 1.0f, rectF2, null, path);
        C.y(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        j jVar = this.f12209o;
        RectF rectF = this.f12201f;
        rectF.set(getBounds());
        if (!jVar.e(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f12203h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f12210p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f12208n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f12210p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f12207m)) != this.f12207m) {
            this.f12208n = true;
            this.f12207m = colorForState;
        }
        if (this.f12208n) {
            invalidateSelf();
        }
        return this.f12208n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f12197b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f12197b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
