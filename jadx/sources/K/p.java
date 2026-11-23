package K;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p f2503k;
    public final float a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f2507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f2508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f2509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f2510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f2511i;
    public final float j;

    static {
        float[] fArr = b.f2482c;
        float fO = (float) ((((double) b.o()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        float f18 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fO) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d3 = fExp;
        if (d3 > 1.0d) {
            fExp = 1.0f;
        } else if (d3 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp};
        float f19 = 1.0f / ((5.0f * fO) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float fCbrt = (0.1f * f21 * f21 * ((float) Math.cbrt(((double) fO) * 5.0d))) + (f20 * fO);
        float fO2 = b.o() / fArr[1];
        double d8 = fO2;
        float fSqrt = ((float) Math.sqrt(d8)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d8, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f15)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f16)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f17)) / 100.0d, 0.42d)};
        float f22 = fArr7[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr7[2];
        float[] fArr8 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        f2503k = new p(fO2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f18, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public p(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f2508f = f10;
        this.a = f11;
        this.f2504b = f12;
        this.f2505c = f13;
        this.f2506d = f14;
        this.f2507e = f15;
        this.f2509g = fArr;
        this.f2510h = f16;
        this.f2511i = f17;
        this.j = f18;
    }
}
