package p239z;

import java.util.ArrayList;
import wa.a;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f16261d;
    public f a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f16259b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f16260c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16262e = false;

    public b(a aVar) {
        this.f16261d = new a(this, aVar);
    }

    public final void a(c cVar, int i10) {
        this.f16261d.g(cVar.j(i10), 1.0f);
        this.f16261d.g(cVar.j(i10), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i10) {
        boolean z6 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z6 = true;
            }
            this.f16259b = i10;
        }
        if (z6) {
            this.f16261d.g(fVar, 1.0f);
            this.f16261d.g(fVar2, -1.0f);
            this.f16261d.g(fVar3, -1.0f);
        } else {
            this.f16261d.g(fVar, -1.0f);
            this.f16261d.g(fVar2, 1.0f);
            this.f16261d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i10) {
        boolean z6 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z6 = true;
            }
            this.f16259b = i10;
        }
        if (z6) {
            this.f16261d.g(fVar, 1.0f);
            this.f16261d.g(fVar2, -1.0f);
            this.f16261d.g(fVar3, 1.0f);
        } else {
            this.f16261d.g(fVar, -1.0f);
            this.f16261d.g(fVar2, 1.0f);
            this.f16261d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.f16259b == 0.0f && this.f16261d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i10;
        int iD = this.f16261d.d();
        f fVar2 = null;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < iD; i11++) {
            float f11 = this.f16261d.f(i11);
            if (f11 < 0.0f) {
                f fVarE = this.f16261d.e(i11);
                if ((zArr == null || !zArr[fVarE.f16287t]) && fVarE != fVar && (((i10 = fVarE.f16285D) == 3 || i10 == 4) && f11 < f10)) {
                    f10 = f11;
                    fVar2 = fVarE;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.a;
        if (fVar2 != null) {
            this.f16261d.g(fVar2, -1.0f);
            this.a.f16288u = -1;
            this.a = null;
        }
        float fH = this.f16261d.h(fVar, true) * (-1.0f);
        this.a = fVar;
        if (fH == 1.0f) {
            return;
        }
        this.f16259b /= fH;
        a aVar = this.f16261d;
        int i10 = aVar.f16257h;
        for (int i11 = 0; i10 != -1 && i11 < aVar.a; i11++) {
            float[] fArr = aVar.f16256g;
            fArr[i10] = fArr[i10] / fH;
            i10 = aVar.f16255f[i10];
        }
    }

    public final void h(c cVar, f fVar, boolean z6) {
        if (fVar == null || !fVar.f16291x) {
            return;
        }
        float fC = this.f16261d.c(fVar);
        this.f16259b = (fVar.f16290w * fC) + this.f16259b;
        this.f16261d.h(fVar, z6);
        if (z6) {
            fVar.g(this);
        }
        if (this.f16261d.d() == 0) {
            this.f16262e = true;
            cVar.f16264b = true;
        }
    }

    public void i(c cVar, b bVar, boolean z6) {
        a aVar = this.f16261d;
        aVar.getClass();
        float fC = aVar.c(bVar.a);
        aVar.h(bVar.a, z6);
        a aVar2 = bVar.f16261d;
        int iD = aVar2.d();
        for (int i10 = 0; i10 < iD; i10++) {
            f fVarE = aVar2.e(i10);
            aVar.a(fVarE, aVar2.c(fVarE) * fC, z6);
        }
        this.f16259b = (bVar.f16259b * fC) + this.f16259b;
        if (z6) {
            bVar.a.g(this);
        }
        if (this.a == null || this.f16261d.d() != 0) {
            return;
        }
        this.f16262e = true;
        cVar.f16264b = true;
    }

    public String toString() {
        boolean z6;
        String strC = p231y.a.c(this.a == null ? "0" : "" + this.a, " = ");
        if (this.f16259b != 0.0f) {
            StringBuilder sbC = e.c(strC);
            sbC.append(this.f16259b);
            strC = sbC.toString();
            z6 = true;
        } else {
            z6 = false;
        }
        int iD = this.f16261d.d();
        for (int i10 = 0; i10 < iD; i10++) {
            f fVarE = this.f16261d.e(i10);
            if (fVarE != null) {
                float f10 = this.f16261d.f(i10);
                if (f10 != 0.0f) {
                    String string = fVarE.toString();
                    if (z6) {
                        if (f10 > 0.0f) {
                            strC = p231y.a.c(strC, " + ");
                        } else {
                            strC = p231y.a.c(strC, " - ");
                            f10 *= -1.0f;
                        }
                    } else if (f10 < 0.0f) {
                        strC = p231y.a.c(strC, "- ");
                        f10 *= -1.0f;
                    }
                    strC = f10 == 1.0f ? p231y.a.c(strC, string) : strC + f10 + " " + string;
                    z6 = true;
                }
            }
        }
        return !z6 ? p231y.a.c(strC, "0.0") : strC;
    }
}
