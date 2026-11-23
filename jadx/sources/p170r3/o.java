package p170r3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p159q3.a;

/* JADX INFO: loaded from: classes.dex */
public final class o extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f14533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14535e;

    public o(q qVar, float f10, float f11) {
        this.f14533c = qVar;
        this.f14534d = f10;
        this.f14535e = f11;
    }

    @Override // p170r3.s
    public final void a(Matrix matrix, a aVar, int i10, Canvas canvas) {
        q qVar = this.f14533c;
        float f10 = qVar.f14544c;
        float f11 = this.f14535e;
        float f12 = qVar.f14543b;
        float f13 = this.f14534d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f13, f11);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = a.f14406i;
        iArr[0] = aVar.f14413f;
        iArr[1] = aVar.f14412e;
        iArr[2] = aVar.f14411d;
        Paint paint = aVar.f14410c;
        float f14 = rectF.left;
        paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        q qVar = this.f14533c;
        return (float) Math.toDegrees(Math.atan((qVar.f14544c - this.f14535e) / (qVar.f14543b - this.f14534d)));
    }
}
