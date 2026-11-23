package B;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f564q0 = -1.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f565r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f566s0 = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public c f567t0 = this.f438J;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f568u0 = 0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f569v0;

    public h() {
        this.f445R.clear();
        this.f445R.add(this.f567t0);
        int length = this.f444Q.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f444Q[i10] = this.f567t0;
        }
    }

    @Override // B.d
    public final boolean A() {
        return this.f569v0;
    }

    @Override // B.d
    public final boolean B() {
        return this.f569v0;
    }

    @Override // B.d
    public final void Q(p239z.c cVar, boolean z6) {
        if (this.f447T == null) {
            return;
        }
        c cVar2 = this.f567t0;
        cVar.getClass();
        int iN = p239z.c.n(cVar2);
        if (this.f568u0 == 1) {
            this.f452Y = iN;
            this.f453Z = 0;
            L(this.f447T.k());
            O(0);
            return;
        }
        this.f452Y = 0;
        this.f453Z = iN;
        O(this.f447T.q());
        L(0);
    }

    public final void R(int i10) {
        this.f567t0.l(i10);
        this.f569v0 = true;
    }

    public final void S(int i10) {
        if (this.f568u0 == i10) {
            return;
        }
        this.f568u0 = i10;
        ArrayList arrayList = this.f445R;
        arrayList.clear();
        if (this.f568u0 == 1) {
            this.f567t0 = this.f437I;
        } else {
            this.f567t0 = this.f438J;
        }
        arrayList.add(this.f567t0);
        c[] cVarArr = this.f444Q;
        int length = cVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            cVarArr[i11] = this.f567t0;
        }
    }

    @Override // B.d
    public final void b(p239z.c cVar, boolean z6) {
        e eVar = (e) this.f447T;
        if (eVar == null) {
            return;
        }
        Object objI = eVar.i(2);
        Object objI2 = eVar.i(4);
        d dVar = this.f447T;
        boolean z10 = dVar != null && dVar.f481p0[0] == 2;
        if (this.f568u0 == 0) {
            objI = eVar.i(3);
            objI2 = eVar.i(5);
            d dVar2 = this.f447T;
            z10 = dVar2 != null && dVar2.f481p0[1] == 2;
        }
        if (this.f569v0) {
            c cVar2 = this.f567t0;
            if (cVar2.f422c) {
                p239z.f fVarK = cVar.k(cVar2);
                cVar.d(fVarK, this.f567t0.d());
                if (this.f565r0 != -1) {
                    if (z10) {
                        cVar.f(cVar.k(objI2), fVarK, 0, 5);
                    }
                } else if (this.f566s0 != -1 && z10) {
                    p239z.f fVarK2 = cVar.k(objI2);
                    cVar.f(fVarK, cVar.k(objI), 0, 5);
                    cVar.f(fVarK2, fVarK, 0, 5);
                }
                this.f569v0 = false;
                return;
            }
        }
        if (this.f565r0 != -1) {
            p239z.f fVarK3 = cVar.k(this.f567t0);
            cVar.e(fVarK3, cVar.k(objI), this.f565r0, 8);
            if (z10) {
                cVar.f(cVar.k(objI2), fVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f566s0 != -1) {
            p239z.f fVarK4 = cVar.k(this.f567t0);
            p239z.f fVarK5 = cVar.k(objI2);
            cVar.e(fVarK4, fVarK5, -this.f566s0, 8);
            if (z10) {
                cVar.f(fVarK4, cVar.k(objI), 0, 5);
                cVar.f(fVarK5, fVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f564q0 != -1.0f) {
            p239z.f fVarK6 = cVar.k(this.f567t0);
            p239z.f fVarK7 = cVar.k(objI2);
            float f10 = this.f564q0;
            p239z.b bVarL = cVar.l();
            bVarL.f16261d.g(fVarK6, -1.0f);
            bVarL.f16261d.g(fVarK7, f10);
            cVar.c(bVarL);
        }
    }

    @Override // B.d
    public final boolean c() {
        return true;
    }

    @Override // B.d
    public final c i(int i10) {
        int iD = p239z.e.d(i10);
        if (iD != 1) {
            if (iD != 2) {
                if (iD != 3) {
                    if (iD != 4) {
                        return null;
                    }
                }
            }
            if (this.f568u0 == 0) {
                return this.f567t0;
            }
            return null;
        }
        if (this.f568u0 == 1) {
            return this.f567t0;
        }
        return null;
    }
}
