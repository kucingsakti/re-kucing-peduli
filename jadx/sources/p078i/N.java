package p078i;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static N f11991d;
    public long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11993c;

    public final void a(double d3, double d8, long j) {
        float f10 = (j - 946728000000L) / 8.64E7f;
        float f11 = (0.01720197f * f10) + 6.24006f;
        double d10 = f11;
        double dSin = (Math.sin(f11 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f11) * 3.4906598739326E-4d) + (Math.sin(d10) * 0.03341960161924362d) + d10 + 1.796593063d + 3.141592653589793d;
        double d11 = (-d8) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d10) * 0.0053d) + ((double) (Math.round(((double) (f10 - 9.0E-4f)) - d11) + 9.0E-4f)) + d11;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d12 = 0.01745329238474369d * d3;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d12))) / (Math.cos(dAsin) * Math.cos(d12));
        if (dSin3 >= 1.0d) {
            this.f11993c = 1;
            this.a = -1L;
            this.f11992b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f11993c = 0;
                this.a = -1L;
                this.f11992b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f11992b = jRound;
            if (jRound >= j || this.a <= j) {
                this.f11993c = 1;
            } else {
                this.f11993c = 0;
            }
        }
    }
}
