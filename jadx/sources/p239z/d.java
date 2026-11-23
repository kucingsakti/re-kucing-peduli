package p239z;

import F8.C0212f;
import com.google.android.gms.internal.measurement.S;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f[] f16278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f[] f16279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public S f16281i;

    @Override // p239z.b
    public final f d(boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f16280h; i11++) {
            f[] fVarArr = this.f16278f;
            f fVar = fVarArr[i11];
            if (!zArr[fVar.f16287t]) {
                S s9 = this.f16281i;
                s9.f8359t = fVar;
                int i12 = 8;
                if (i10 != -1) {
                    f fVar2 = fVarArr[i10];
                    while (i12 >= 0) {
                        float f10 = fVar2.f16293z[i12];
                        float f11 = ((f) s9.f8359t).f16293z[i12];
                        if (f11 != f10) {
                            if (f11 >= f10) {
                                break;
                            }
                            i10 = i11;
                            break;
                            break;
                        }
                        i12--;
                    }
                } else {
                    while (i12 >= 0) {
                        float f12 = ((f) s9.f8359t).f16293z[i12];
                        if (f12 > 0.0f) {
                            break;
                        }
                        if (f12 < 0.0f) {
                            i10 = i11;
                            break;
                        }
                        i12--;
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f16278f[i10];
    }

    @Override // p239z.b
    public final boolean e() {
        return this.f16280h == 0;
    }

    @Override // p239z.b
    public final void i(c cVar, b bVar, boolean z6) {
        f fVar = bVar.a;
        if (fVar == null) {
            return;
        }
        a aVar = bVar.f16261d;
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            f fVarE = aVar.e(i10);
            float f10 = aVar.f(i10);
            S s9 = this.f16281i;
            s9.f8359t = fVarE;
            boolean z10 = fVarE.f16286s;
            float[] fArr = fVar.f16293z;
            if (z10) {
                boolean z11 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = ((f) s9.f8359t).f16293z;
                    float f11 = (fArr[i11] * f10) + fArr2[i11];
                    fArr2[i11] = f11;
                    if (Math.abs(f11) < 1.0E-4f) {
                        ((f) s9.f8359t).f16293z[i11] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    ((d) s9.f8360u).k((f) s9.f8359t);
                }
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f12 = fArr[i12];
                    if (f12 != 0.0f) {
                        float f13 = f12 * f10;
                        if (Math.abs(f13) < 1.0E-4f) {
                            f13 = 0.0f;
                        }
                        ((f) s9.f8359t).f16293z[i12] = f13;
                    } else {
                        ((f) s9.f8359t).f16293z[i12] = 0.0f;
                    }
                }
                j(fVarE);
            }
            this.f16259b = (bVar.f16259b * f10) + this.f16259b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i10;
        int i11 = this.f16280h + 1;
        f[] fVarArr = this.f16278f;
        if (i11 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f16278f = fVarArr2;
            this.f16279g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f16278f;
        int i12 = this.f16280h;
        fVarArr3[i12] = fVar;
        int i13 = i12 + 1;
        this.f16280h = i13;
        if (i13 > 1 && fVarArr3[i12].f16287t > fVar.f16287t) {
            int i14 = 0;
            while (true) {
                i10 = this.f16280h;
                if (i14 >= i10) {
                    break;
                }
                this.f16279g[i14] = this.f16278f[i14];
                i14++;
            }
            Arrays.sort(this.f16279g, 0, i10, new C0212f(20));
            for (int i15 = 0; i15 < this.f16280h; i15++) {
                this.f16278f[i15] = this.f16279g[i15];
            }
        }
        fVar.f16286s = true;
        fVar.f(this);
    }

    public final void k(f fVar) {
        int i10 = 0;
        while (i10 < this.f16280h) {
            if (this.f16278f[i10] == fVar) {
                while (true) {
                    int i11 = this.f16280h;
                    if (i10 >= i11 - 1) {
                        this.f16280h = i11 - 1;
                        fVar.f16286s = false;
                        return;
                    } else {
                        f[] fVarArr = this.f16278f;
                        int i12 = i10 + 1;
                        fVarArr[i10] = fVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // p239z.b
    public final String toString() {
        String str = " goal -> (" + this.f16259b + ") : ";
        for (int i10 = 0; i10 < this.f16280h; i10++) {
            f fVar = this.f16278f[i10];
            S s9 = this.f16281i;
            s9.f8359t = fVar;
            str = str + s9 + " ";
        }
        return str;
    }
}
