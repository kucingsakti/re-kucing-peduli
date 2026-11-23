package B;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f402s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f403t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f404u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f405v0;

    @Override // B.d
    public final boolean A() {
        return this.f405v0;
    }

    @Override // B.d
    public final boolean B() {
        return this.f405v0;
    }

    public final boolean T() {
        int i10;
        int i11;
        int i12;
        boolean z6 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f571r0;
            if (i13 >= i10) {
                break;
            }
            d dVar = this.f570q0[i13];
            if ((this.f403t0 || dVar.c()) && ((((i11 = this.f402s0) == 0 || i11 == 1) && !dVar.A()) || (((i12 = this.f402s0) == 2 || i12 == 3) && !dVar.B()))) {
                z6 = false;
            }
            i13++;
        }
        if (!z6 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z10 = false;
        for (int i14 = 0; i14 < this.f571r0; i14++) {
            d dVar2 = this.f570q0[i14];
            if (this.f403t0 || dVar2.c()) {
                if (!z10) {
                    int i15 = this.f402s0;
                    if (i15 == 0) {
                        iMax = dVar2.i(2).d();
                    } else if (i15 == 1) {
                        iMax = dVar2.i(4).d();
                    } else if (i15 == 2) {
                        iMax = dVar2.i(3).d();
                    } else if (i15 == 3) {
                        iMax = dVar2.i(5).d();
                    }
                    z10 = true;
                }
                int i16 = this.f402s0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, dVar2.i(2).d());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, dVar2.i(4).d());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, dVar2.i(3).d());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, dVar2.i(5).d());
                }
            }
        }
        int i17 = iMax + this.f404u0;
        int i18 = this.f402s0;
        if (i18 == 0 || i18 == 1) {
            J(i17, i17);
        } else {
            K(i17, i17);
        }
        this.f405v0 = true;
        return true;
    }

    public final int U() {
        int i10 = this.f402s0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // B.d
    public final void b(p239z.c cVar, boolean z6) {
        boolean z10;
        int i10;
        int i11;
        c[] cVarArr = this.f444Q;
        c cVar2 = this.f437I;
        cVarArr[0] = cVar2;
        c cVar3 = this.f438J;
        int i12 = 2;
        cVarArr[2] = cVar3;
        c cVar4 = this.f439K;
        cVarArr[1] = cVar4;
        c cVar5 = this.f440L;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f428i = cVar.k(cVar6);
        }
        int i13 = this.f402s0;
        if (i13 < 0 || i13 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i13];
        if (!this.f405v0) {
            T();
        }
        if (this.f405v0) {
            this.f405v0 = false;
            int i14 = this.f402s0;
            if (i14 == 0 || i14 == 1) {
                cVar.d(cVar2.f428i, this.f452Y);
                cVar.d(cVar4.f428i, this.f452Y);
                return;
            } else {
                if (i14 == 2 || i14 == 3) {
                    cVar.d(cVar3.f428i, this.f453Z);
                    cVar.d(cVar5.f428i, this.f453Z);
                    return;
                }
                return;
            }
        }
        int i15 = 0;
        while (true) {
            if (i15 >= this.f571r0) {
                z10 = false;
                break;
            }
            d dVar = this.f570q0[i15];
            if ((this.f403t0 || dVar.c()) && ((((i11 = this.f402s0) == 0 || i11 == 1) && dVar.f481p0[0] == 3 && dVar.f437I.f425f != null && dVar.f439K.f425f != null) || ((i11 == 2 || i11 == 3) && dVar.f481p0[1] == 3 && dVar.f438J.f425f != null && dVar.f440L.f425f != null))) {
                z10 = true;
                break;
            }
            i15++;
        }
        boolean z11 = cVar2.g() || cVar4.g();
        boolean z12 = cVar3.g() || cVar5.g();
        int i16 = (z10 || !(((i10 = this.f402s0) == 0 && z11) || ((i10 == 2 && z12) || ((i10 == 1 && z11) || (i10 == 3 && z12))))) ? 4 : 5;
        int i17 = 0;
        while (i17 < this.f571r0) {
            d dVar2 = this.f570q0[i17];
            if (this.f403t0 || dVar2.c()) {
                p239z.f fVarK = cVar.k(dVar2.f444Q[this.f402s0]);
                int i18 = this.f402s0;
                c cVar8 = dVar2.f444Q[i18];
                cVar8.f428i = fVarK;
                c cVar9 = cVar8.f425f;
                int i19 = (cVar9 == null || cVar9.f423d != this) ? 0 : cVar8.f426g;
                if (i18 == 0 || i18 == i12) {
                    p239z.f fVar = cVar7.f428i;
                    int i20 = this.f404u0 - i19;
                    p239z.b bVarL = cVar.l();
                    p239z.f fVarM = cVar.m();
                    fVarM.f16289v = 0;
                    bVarL.c(fVar, fVarK, fVarM, i20);
                    cVar.c(bVarL);
                } else {
                    p239z.f fVar2 = cVar7.f428i;
                    int i21 = this.f404u0 + i19;
                    p239z.b bVarL2 = cVar.l();
                    p239z.f fVarM2 = cVar.m();
                    fVarM2.f16289v = 0;
                    bVarL2.b(fVar2, fVarK, fVarM2, i21);
                    cVar.c(bVarL2);
                }
                cVar.e(cVar7.f428i, fVarK, this.f404u0 + i19, i16);
            }
            i17++;
            i12 = 2;
        }
        int i22 = this.f402s0;
        if (i22 == 0) {
            cVar.e(cVar4.f428i, cVar2.f428i, 0, 8);
            cVar.e(cVar2.f428i, this.f447T.f439K.f428i, 0, 4);
            cVar.e(cVar2.f428i, this.f447T.f437I.f428i, 0, 0);
            return;
        }
        if (i22 == 1) {
            cVar.e(cVar2.f428i, cVar4.f428i, 0, 8);
            cVar.e(cVar2.f428i, this.f447T.f437I.f428i, 0, 4);
            cVar.e(cVar2.f428i, this.f447T.f439K.f428i, 0, 0);
        } else if (i22 == 2) {
            cVar.e(cVar5.f428i, cVar3.f428i, 0, 8);
            cVar.e(cVar3.f428i, this.f447T.f440L.f428i, 0, 4);
            cVar.e(cVar3.f428i, this.f447T.f438J.f428i, 0, 0);
        } else if (i22 == 3) {
            cVar.e(cVar3.f428i, cVar5.f428i, 0, 8);
            cVar.e(cVar3.f428i, this.f447T.f438J.f428i, 0, 4);
            cVar.e(cVar3.f428i, this.f447T.f440L.f428i, 0, 0);
        }
    }

    @Override // B.d
    public final boolean c() {
        return true;
    }

    @Override // B.d
    public final String toString() {
        String strL = E0.a.l(new StringBuilder("[Barrier] "), this.f466h0, " {");
        for (int i10 = 0; i10 < this.f571r0; i10++) {
            d dVar = this.f570q0[i10];
            if (i10 > 0) {
                strL = p231y.a.c(strL, ", ");
            }
            StringBuilder sbC = p239z.e.c(strL);
            sbC.append(dVar.f466h0);
            strL = sbC.toString();
        }
        return p231y.a.c(strL, "}");
    }
}
