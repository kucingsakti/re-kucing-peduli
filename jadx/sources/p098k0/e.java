package p098k0;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public double a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f12673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f12675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f12676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f12677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f12678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f12679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f12680i;
    public final p003a3.e j;

    public e() {
        this.a = Math.sqrt(1500.0d);
        this.f12673b = 0.5d;
        this.f12674c = false;
        this.f12680i = Double.MAX_VALUE;
        this.j = new p003a3.e();
    }

    public final void a(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.a = Math.sqrt(f10);
        this.f12674c = false;
    }

    public final p003a3.e b(double d3, double d8, long j) {
        double dSin;
        double dCos;
        if (!this.f12674c) {
            if (this.f12680i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d10 = this.f12673b;
            if (d10 > 1.0d) {
                double d11 = this.a;
                this.f12677f = (Math.sqrt((d10 * d10) - 1.0d) * d11) + ((-d10) * d11);
                double d12 = this.f12673b;
                double d13 = this.a;
                this.f12678g = ((-d12) * d13) - (Math.sqrt((d12 * d12) - 1.0d) * d13);
            } else if (d10 >= 0.0d && d10 < 1.0d) {
                this.f12679h = Math.sqrt(1.0d - (d10 * d10)) * this.a;
            }
            this.f12674c = true;
        }
        double d14 = j / 1000.0d;
        double d15 = d3 - this.f12680i;
        double d16 = this.f12673b;
        if (d16 > 1.0d) {
            double d17 = this.f12678g;
            double d18 = ((d17 * d15) - d8) / (d17 - this.f12677f);
            double d19 = d15 - d18;
            dSin = (Math.pow(2.718281828459045d, this.f12677f * d14) * d18) + (Math.pow(2.718281828459045d, d17 * d14) * d19);
            double d20 = this.f12678g;
            double dPow = Math.pow(2.718281828459045d, d20 * d14) * d19 * d20;
            double d21 = this.f12677f;
            dCos = (Math.pow(2.718281828459045d, d21 * d14) * d18 * d21) + dPow;
        } else if (d16 == 1.0d) {
            double d22 = this.a;
            double d23 = (d22 * d15) + d8;
            double d24 = (d23 * d14) + d15;
            double dPow2 = Math.pow(2.718281828459045d, (-d22) * d14) * d24;
            double dPow3 = Math.pow(2.718281828459045d, (-this.a) * d14) * d24;
            double d25 = -this.a;
            dCos = (Math.pow(2.718281828459045d, d25 * d14) * d23) + (dPow3 * d25);
            dSin = dPow2;
        } else {
            double d26 = 1.0d / this.f12679h;
            double d27 = this.a;
            double d28 = ((d16 * d27 * d15) + d8) * d26;
            dSin = ((Math.sin(this.f12679h * d14) * d28) + (Math.cos(this.f12679h * d14) * d15)) * Math.pow(2.718281828459045d, (-d16) * d27 * d14);
            double d29 = this.a;
            double d30 = this.f12673b;
            double d31 = (-d29) * dSin * d30;
            double dPow4 = Math.pow(2.718281828459045d, (-d30) * d29 * d14);
            double d32 = this.f12679h;
            double dSin2 = Math.sin(d32 * d14) * (-d32) * d15;
            double d33 = this.f12679h;
            dCos = (((Math.cos(d33 * d14) * d28 * d33) + dSin2) * dPow4) + d31;
        }
        float f10 = (float) (dSin + this.f12680i);
        p003a3.e eVar = this.j;
        eVar.a = f10;
        eVar.f6004b = (float) dCos;
        return eVar;
    }

    public e(float f10) {
        this.a = Math.sqrt(1500.0d);
        this.f12673b = 0.5d;
        this.f12674c = false;
        this.j = new p003a3.e();
        this.f12680i = f10;
    }
}
