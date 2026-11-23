package T0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Drawable implements Animatable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f4613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f4614t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Resources f4615u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ValueAnimator f4616v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f4617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final LinearInterpolator f4611y = new LinearInterpolator();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final p178s0.a f4612z = new p178s0.a(1);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f4610A = {-16777216};

    public e(Context context) {
        context.getClass();
        this.f4615u = context.getResources();
        d dVar = new d();
        this.f4613s = dVar;
        dVar.f4598i = f4610A;
        dVar.a(0);
        dVar.f4597h = 2.5f;
        dVar.f4591b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new b(this, dVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f4611y);
        valueAnimatorOfFloat.addListener(new c(this, dVar));
        this.f4616v = valueAnimatorOfFloat;
    }

    public static void d(float f10, d dVar) {
        if (f10 <= 0.75f) {
            dVar.f4609u = dVar.f4598i[dVar.j];
            return;
        }
        float f11 = (f10 - 0.75f) / 0.25f;
        int[] iArr = dVar.f4598i;
        int i10 = dVar.j;
        int i11 = iArr[i10];
        int i12 = iArr[(i10 + 1) % iArr.length];
        int i13 = (i11 >> 24) & 255;
        int i14 = (i11 >> 16) & 255;
        int i15 = (i11 >> 8) & 255;
        int i16 = i11 & 255;
        dVar.f4609u = ((i13 + ((int) ((((i12 >> 24) & 255) - i13) * f11))) << 24) | ((i14 + ((int) ((((i12 >> 16) & 255) - i14) * f11))) << 16) | ((i15 + ((int) ((((i12 >> 8) & 255) - i15) * f11))) << 8) | (i16 + ((int) (f11 * ((i12 & 255) - i16))));
    }

    public final void a(float f10, d dVar, boolean z6) {
        float interpolation;
        float interpolation2;
        if (this.f4618x) {
            d(f10, dVar);
            float fFloor = (float) (Math.floor(dVar.f4601m / 0.8f) + 1.0d);
            float f11 = dVar.f4599k;
            float f12 = dVar.f4600l;
            dVar.f4594e = (((f12 - 0.01f) - f11) * f10) + f11;
            dVar.f4595f = f12;
            float f13 = dVar.f4601m;
            dVar.f4596g = ((fFloor - f13) * f10) + f13;
            return;
        }
        if (f10 != 1.0f || z6) {
            float f14 = dVar.f4601m;
            p178s0.a aVar = f4612z;
            if (f10 < 0.5f) {
                interpolation = dVar.f4599k;
                interpolation2 = (aVar.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f15 = dVar.f4599k + 0.79f;
                interpolation = f15 - (((1.0f - aVar.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f15;
            }
            float f16 = (0.20999998f * f10) + f14;
            float f17 = (f10 + this.f4617w) * 216.0f;
            dVar.f4594e = interpolation;
            dVar.f4595f = interpolation2;
            dVar.f4596g = f16;
            this.f4614t = f17;
        }
    }

    public final void b(float f10, float f11, float f12, float f13) {
        float f14 = this.f4615u.getDisplayMetrics().density;
        float f15 = f11 * f14;
        d dVar = this.f4613s;
        dVar.f4597h = f15;
        dVar.f4591b.setStrokeWidth(f15);
        dVar.f4605q = f10 * f14;
        dVar.a(0);
        dVar.f4606r = (int) (f12 * f14);
        dVar.f4607s = (int) (f13 * f14);
    }

    public final void c(int i10) {
        if (i10 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f4614t, bounds.exactCenterX(), bounds.exactCenterY());
        d dVar = this.f4613s;
        RectF rectF = dVar.a;
        float f10 = dVar.f4605q;
        float fMin = (dVar.f4597h / 2.0f) + f10;
        if (f10 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((dVar.f4606r * dVar.f4604p) / 2.0f, dVar.f4597h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f11 = dVar.f4594e;
        float f12 = dVar.f4596g;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((dVar.f4595f + f12) * 360.0f) - f13;
        Paint paint = dVar.f4591b;
        paint.setColor(dVar.f4609u);
        paint.setAlpha(dVar.f4608t);
        float f15 = dVar.f4597h / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f4593d);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, paint);
        if (dVar.f4602n) {
            Path path = dVar.f4603o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f4603o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f17 = (dVar.f4606r * dVar.f4604p) / 2.0f;
            dVar.f4603o.moveTo(0.0f, 0.0f);
            dVar.f4603o.lineTo(dVar.f4606r * dVar.f4604p, 0.0f);
            Path path3 = dVar.f4603o;
            float f18 = dVar.f4606r;
            float f19 = dVar.f4604p;
            path3.lineTo((f18 * f19) / 2.0f, dVar.f4607s * f19);
            dVar.f4603o.offset((rectF.centerX() + fMin2) - f17, (dVar.f4597h / 2.0f) + rectF.centerY());
            dVar.f4603o.close();
            Paint paint2 = dVar.f4592c;
            paint2.setColor(dVar.f4609u);
            paint2.setAlpha(dVar.f4608t);
            canvas.save();
            canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f4603o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4613s.f4608t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f4616v.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f4613s.f4608t = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4613s.f4591b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f4616v.cancel();
        d dVar = this.f4613s;
        float f10 = dVar.f4594e;
        dVar.f4599k = f10;
        float f11 = dVar.f4595f;
        dVar.f4600l = f11;
        dVar.f4601m = dVar.f4596g;
        if (f11 != f10) {
            this.f4618x = true;
            this.f4616v.setDuration(666L);
            this.f4616v.start();
            return;
        }
        dVar.a(0);
        dVar.f4599k = 0.0f;
        dVar.f4600l = 0.0f;
        dVar.f4601m = 0.0f;
        dVar.f4594e = 0.0f;
        dVar.f4595f = 0.0f;
        dVar.f4596g = 0.0f;
        this.f4616v.setDuration(1332L);
        this.f4616v.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f4616v.cancel();
        this.f4614t = 0.0f;
        d dVar = this.f4613s;
        if (dVar.f4602n) {
            dVar.f4602n = false;
        }
        dVar.a(0);
        dVar.f4599k = 0.0f;
        dVar.f4600l = 0.0f;
        dVar.f4601m = 0.0f;
        dVar.f4594e = 0.0f;
        dVar.f4595f = 0.0f;
        dVar.f4596g = 0.0f;
        invalidateSelf();
    }
}
