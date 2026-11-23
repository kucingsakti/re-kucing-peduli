package W0;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes.dex */
public final class f implements TypeEvaluator {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5260b;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                L.f[] fVarArr = (L.f[]) obj;
                L.f[] fVarArr2 = (L.f[]) obj2;
                if (!C3.b.d(fVarArr, fVarArr2)) {
                    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                }
                if (!C3.b.d((L.f[]) this.f5260b, fVarArr)) {
                    this.f5260b = C3.b.m(fVarArr);
                }
                for (int i10 = 0; i10 < fVarArr.length; i10++) {
                    L.f fVar = ((L.f[]) this.f5260b)[i10];
                    L.f fVar2 = fVarArr[i10];
                    L.f fVar3 = fVarArr2[i10];
                    fVar.getClass();
                    fVar.a = fVar2.a;
                    int i11 = 0;
                    while (true) {
                        float[] fArr = fVar2.f2715b;
                        if (i11 < fArr.length) {
                            fVar.f2715b[i11] = (fVar3.f2715b[i11] * f10) + ((1.0f - f10) * fArr[i11]);
                            i11++;
                        }
                    }
                }
                return (L.f[]) this.f5260b;
            default:
                float fFloatValue = ((FloatEvaluator) this.f5260b).evaluate(f10, (Number) obj, (Number) obj2).floatValue();
                if (fFloatValue < 0.1f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
        }
    }
}
