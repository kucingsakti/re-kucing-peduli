package p170r3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p159q3.a;

/* JADX INFO: loaded from: classes.dex */
public final class n extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f14532c;

    public n(p pVar) {
        this.f14532c = pVar;
    }

    @Override // p170r3.s
    public final void a(Matrix matrix, a aVar, int i10, Canvas canvas) {
        p pVar = this.f14532c;
        float f10 = pVar.f14541f;
        float f11 = pVar.f14542g;
        RectF rectF = new RectF(pVar.f14537b, pVar.f14538c, pVar.f14539d, pVar.f14540e);
        aVar.getClass();
        boolean z6 = f11 < 0.0f;
        Path path = aVar.f14414g;
        int[] iArr = a.f14407k;
        if (z6) {
            iArr[0] = 0;
            iArr[1] = aVar.f14413f;
            iArr[2] = aVar.f14412e;
            iArr[3] = aVar.f14411d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = aVar.f14411d;
            iArr[2] = aVar.f14412e;
            iArr[3] = aVar.f14413f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / fWidth);
        float[] fArr = a.f14408l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f14409b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z6) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f14415h);
        }
        canvas.drawArc(rectF, f10, f11, true, paint);
        canvas.restore();
    }
}
