package p129n3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import p181s3.a;
import xa.d;

/* JADX INFO: loaded from: classes.dex */
public final class l extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f13369f;

    public final void b(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12) {
        float f12;
        float fD = a.d(f10, 0.0f, 1.0f);
        float fD2 = a.d(f11, 0.0f, 1.0f);
        float fR = d.r(1.0f - this.f13369f, 1.0f, fD);
        float fR2 = d.r(1.0f - this.f13369f, 1.0f, fD2);
        int iD = (int) ((a.d(fR, 0.0f, 0.01f) * i11) / 0.01f);
        float fD3 = 1.0f - a.d(fR2, 0.99f, 1.0f);
        float f13 = this.f13365b;
        int i13 = (int) ((fR * f13) + iD);
        int i14 = (int) ((fR2 * f13) - ((int) ((fD3 * i12) / 0.01f)));
        float f14 = (-f13) / 2.0f;
        if (i13 <= i14) {
            float f15 = this.f13367d;
            float f16 = i13 + f15;
            float f17 = i14 - f15;
            float f18 = f15 * 2.0f;
            paint.setColor(i10);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f13366c);
            if (f16 >= f17) {
                c(canvas, paint, new PointF(f16 + f14, 0.0f), new PointF(f17 + f14, 0.0f), f18, this.f13366c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.f13368e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f19 = f16 + f14;
            float f20 = f17 + f14;
            canvas.drawLine(f19, 0.0f, f20, 0.0f, paint);
            if (this.f13368e || this.f13367d <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f16 > 0.0f) {
                f12 = f18;
                c(canvas, paint, new PointF(f19, 0.0f), null, f12, this.f13366c);
            } else {
                f12 = f18;
            }
            if (f17 < this.f13365b) {
                c(canvas, paint, new PointF(f20, 0.0f), null, f12, this.f13366c);
            }
        }
    }

    public final void c(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f10, float f11) {
        float fMin = Math.min(f11, this.f13366c);
        float f12 = f10 / 2.0f;
        float fMin2 = Math.min(f12, (this.f13367d * fMin) / this.f13366c);
        RectF rectF = new RectF((-f10) / 2.0f, (-fMin) / 2.0f, f12, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    public final void d(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12) {
        b(canvas, paint, f10, f11, J7.a.c(i10, i11), i12, i12);
    }
}
