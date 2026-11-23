package p239z;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f16285D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16286s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f16290w;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16287t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16288u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16289v = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16291x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float[] f16292y = new float[9];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float[] f16293z = new float[9];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public b[] f16282A = new b[16];

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f16283B = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f16284C = 0;

    public f(int i10) {
        this.f16285D = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f16287t - ((f) obj).f16287t;
    }

    public final void f(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f16283B;
            if (i10 >= i11) {
                b[] bVarArr = this.f16282A;
                if (i11 >= bVarArr.length) {
                    this.f16282A = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f16282A;
                int i12 = this.f16283B;
                bVarArr2[i12] = bVar;
                this.f16283B = i12 + 1;
                return;
            }
            if (this.f16282A[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void g(b bVar) {
        int i10 = this.f16283B;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f16282A[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f16282A;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f16283B--;
                return;
            }
            i11++;
        }
    }

    public final void h() {
        this.f16285D = 5;
        this.f16289v = 0;
        this.f16287t = -1;
        this.f16288u = -1;
        this.f16290w = 0.0f;
        this.f16291x = false;
        int i10 = this.f16283B;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f16282A[i11] = null;
        }
        this.f16283B = 0;
        this.f16284C = 0;
        this.f16286s = false;
        Arrays.fill(this.f16293z, 0.0f);
    }

    public final void i(c cVar, float f10) {
        this.f16290w = f10;
        this.f16291x = true;
        int i10 = this.f16283B;
        this.f16288u = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f16282A[i11].h(cVar, this, false);
        }
        this.f16283B = 0;
    }

    public final void j(c cVar, b bVar) {
        int i10 = this.f16283B;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f16282A[i11].i(cVar, bVar, false);
        }
        this.f16283B = 0;
    }

    public final String toString() {
        return "" + this.f16287t;
    }
}
