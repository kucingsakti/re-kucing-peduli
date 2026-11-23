package p097k;

import M.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.kcstream.cing.R;
import p069h.a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f12637m = (float) Math.toRadians(45.0d);
    public final Paint a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f12641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f12643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12645i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f12646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f12647l;

    public f(Context context) {
        Paint paint = new Paint();
        this.a = paint;
        this.f12643g = new Path();
        this.f12645i = false;
        this.f12647l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, a.f11621n, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f12646k = (float) (Math.cos(f12637m) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f12642f != z6) {
            this.f12642f = z6;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.f12641e) {
            this.f12641e = fRound;
            invalidateSelf();
        }
        this.f12644h = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f12639c = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f12638b = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f12640d = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f10, float f11, float f12) {
        return ((f11 - f10) * f12) + f10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f12647l;
        boolean z6 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? b.a(this) == 0 : b.a(this) == 1))) {
            z6 = true;
        }
        float f10 = this.f12638b;
        float fSqrt = (float) Math.sqrt(f10 * f10 * 2.0f);
        float f11 = this.j;
        float f12 = this.f12639c;
        float fA = a(f12, fSqrt, f11);
        float fA2 = a(f12, this.f12640d, this.j);
        float fRound = Math.round(a(0.0f, this.f12646k, this.j));
        float fA3 = a(0.0f, f12637m, this.j);
        float fA4 = a(z6 ? 0.0f : -180.0f, z6 ? 180.0f : 0.0f, this.j);
        double d3 = fA;
        double d8 = fA3;
        boolean z10 = z6;
        float fRound2 = Math.round(Math.cos(d8) * d3);
        float fRound3 = Math.round(Math.sin(d8) * d3);
        Path path = this.f12643g;
        path.rewind();
        float f13 = this.f12641e;
        Paint paint = this.a;
        float fA5 = a(paint.getStrokeWidth() + f13, -this.f12646k, this.j);
        float f14 = (-fA2) / 2.0f;
        path.moveTo(f14 + fRound, 0.0f);
        path.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        path.moveTo(f14, fA5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f14, -fA5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f15 = this.f12641e;
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + f15 + ((((int) (fHeight - (f15 * 2.0f))) / 4) * 2));
        if (this.f12642f) {
            canvas.rotate(fA4 * (this.f12645i ^ z10 ? -1 : 1));
        } else if (z10) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f12644h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f12644h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Paint paint = this.a;
        if (i10 != paint.getAlpha()) {
            paint.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f10) {
        if (this.j != f10) {
            this.j = f10;
            invalidateSelf();
        }
    }
}
