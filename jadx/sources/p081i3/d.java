package p081i3;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class d implements TypeEvaluator {
    public final float[] a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f12213b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f12214c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f12215d;

    public d(i iVar) {
        this.f12215d = iVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        this.f12215d.f12253p = f10;
        float[] fArr = this.a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f12213b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i10 = 0; i10 < 9; i10++) {
            float f11 = fArr2[i10];
            float f12 = fArr[i10];
            fArr2[i10] = ((f11 - f12) * f10) + f12;
        }
        Matrix matrix = this.f12214c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
