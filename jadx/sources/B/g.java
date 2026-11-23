package B;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f530A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public C.b f531B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public E.f f532C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f533D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f534E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f535F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f536G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f537H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f538I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public float f539J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public float f540K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public float f541L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public float f542M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public float f543N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public float f544O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f545P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public int f546Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public int f547R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public int f548S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public int f549T0;
    public int U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public int f550V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public ArrayList f551W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public d[] f552X0;
    public d[] Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public int[] f553Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public d[] f554a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f555b1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f556s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f557t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f558u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f559v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f560w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f561x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f562y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f563z0;

    @Override // B.i
    public final void S() {
        for (int i10 = 0; i10 < this.f571r0; i10++) {
            d dVar = this.f570q0[i10];
            if (dVar != null) {
                dVar.f434F = true;
            }
        }
    }

    public final int T(d dVar, int i10) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f481p0;
            if (iArr[1] == 3) {
                int i11 = dVar.f484s;
                if (i11 != 0) {
                    if (i11 == 2) {
                        int i12 = (int) (dVar.f491z * i10);
                        if (i12 != dVar.k()) {
                            dVar.f463g = true;
                            V(iArr[0], dVar.q(), 1, i12, dVar);
                        }
                        return i12;
                    }
                    dVar2 = dVar;
                    if (i11 == 1) {
                        return dVar2.k();
                    }
                    if (i11 == 3) {
                        return (int) ((dVar2.q() * dVar2.f450W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.k();
        }
        return 0;
    }

    public final int U(d dVar, int i10) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f481p0;
            if (iArr[0] == 3) {
                int i11 = dVar.f483r;
                if (i11 != 0) {
                    if (i11 == 2) {
                        int i12 = (int) (dVar.f488w * i10);
                        if (i12 != dVar.q()) {
                            dVar.f463g = true;
                            V(1, i12, iArr[1], dVar.k(), dVar);
                        }
                        return i12;
                    }
                    dVar2 = dVar;
                    if (i11 == 1) {
                        return dVar2.q();
                    }
                    if (i11 == 3) {
                        return (int) ((dVar2.k() * dVar2.f450W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.q();
        }
        return 0;
    }

    public final void V(int i10, int i11, int i12, int i13, d dVar) {
        E.f fVar;
        d dVar2;
        while (true) {
            fVar = this.f532C0;
            if (fVar != null || (dVar2 = this.f447T) == null) {
                break;
            } else {
                this.f532C0 = ((e) dVar2).f508u0;
            }
        }
        C.b bVar = this.f531B0;
        bVar.a = i10;
        bVar.f803b = i12;
        bVar.f804c = i11;
        bVar.f805d = i13;
        fVar.b(dVar, bVar);
        dVar.O(bVar.f806e);
        dVar.L(bVar.f807f);
        dVar.f433E = bVar.f809h;
        dVar.I(bVar.f808g);
    }

    @Override // B.d
    public final void b(p239z.c cVar, boolean z6) {
        d dVar;
        float f10;
        int i10;
        super.b(cVar, z6);
        d dVar2 = this.f447T;
        boolean z10 = dVar2 != null && ((e) dVar2).f509v0;
        int i11 = this.f549T0;
        ArrayList arrayList = this.f551W0;
        if (i11 != 0) {
            if (i11 == 1) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    ((f) arrayList.get(i12)).b(i12, z10, i12 == size + (-1));
                    i12++;
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        ((f) arrayList.get(i13)).b(i13, z10, i13 == size2 + (-1));
                        i13++;
                    }
                }
            } else if (this.f553Z0 != null && this.Y0 != null && this.f552X0 != null) {
                for (int i14 = 0; i14 < this.f555b1; i14++) {
                    this.f554a1[i14].D();
                }
                int[] iArr = this.f553Z0;
                int i15 = iArr[0];
                int i16 = iArr[1];
                float f11 = this.f539J0;
                d dVar3 = null;
                int i17 = 0;
                while (i17 < i15) {
                    if (z10) {
                        i10 = (i15 - i17) - 1;
                        f10 = 1.0f - this.f539J0;
                    } else {
                        f10 = f11;
                        i10 = i17;
                    }
                    d dVar4 = this.Y0[i10];
                    if (dVar4 != null && dVar4.f464g0 != 8) {
                        c cVar2 = dVar4.f437I;
                        if (i17 == 0) {
                            dVar4.f(cVar2, this.f437I, this.f560w0);
                            dVar4.f468i0 = this.f533D0;
                            dVar4.f459d0 = f10;
                        }
                        if (i17 == i15 - 1) {
                            dVar4.f(dVar4.f439K, this.f439K, this.f561x0);
                        }
                        if (i17 > 0 && dVar3 != null) {
                            int i18 = this.f545P0;
                            c cVar3 = dVar3.f439K;
                            dVar4.f(cVar2, cVar3, i18);
                            dVar3.f(cVar3, cVar2, 0);
                        }
                        dVar3 = dVar4;
                    }
                    i17++;
                    f11 = f10;
                }
                for (int i19 = 0; i19 < i16; i19++) {
                    d dVar5 = this.f552X0[i19];
                    if (dVar5 != null && dVar5.f464g0 != 8) {
                        c cVar4 = dVar5.f438J;
                        if (i19 == 0) {
                            dVar5.f(cVar4, this.f438J, this.f556s0);
                            dVar5.f469j0 = this.f534E0;
                            dVar5.f461e0 = this.f540K0;
                        }
                        if (i19 == i16 - 1) {
                            dVar5.f(dVar5.f440L, this.f440L, this.f557t0);
                        }
                        if (i19 > 0 && dVar3 != null) {
                            int i20 = this.f546Q0;
                            c cVar5 = dVar3.f440L;
                            dVar5.f(cVar4, cVar5, i20);
                            dVar3.f(cVar5, cVar4, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i21 = 0; i21 < i15; i21++) {
                    for (int i22 = 0; i22 < i16; i22++) {
                        int i23 = (i22 * i15) + i21;
                        if (this.f550V0 == 1) {
                            i23 = (i21 * i16) + i22;
                        }
                        d[] dVarArr = this.f554a1;
                        if (i23 < dVarArr.length && (dVar = dVarArr[i23]) != null && dVar.f464g0 != 8) {
                            d dVar6 = this.Y0[i21];
                            d dVar7 = this.f552X0[i22];
                            if (dVar != dVar6) {
                                dVar.f(dVar.f437I, dVar6.f437I, 0);
                                dVar.f(dVar.f439K, dVar6.f439K, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.f438J, dVar7.f438J, 0);
                                dVar.f(dVar.f440L, dVar7.f440L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z10, true);
        }
        this.f562y0 = false;
    }
}
