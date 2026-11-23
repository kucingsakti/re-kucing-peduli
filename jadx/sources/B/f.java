package B;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public int a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f521i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f522k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f528q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f529r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f514b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f515c = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f523l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f524m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f525n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f526o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f527p = 0;

    public f(g gVar, int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11) {
        this.f529r = gVar;
        this.a = i10;
        this.f516d = cVar;
        this.f517e = cVar2;
        this.f518f = cVar3;
        this.f519g = cVar4;
        this.f520h = gVar.f560w0;
        this.f521i = gVar.f556s0;
        this.j = gVar.f561x0;
        this.f522k = gVar.f557t0;
        this.f528q = i11;
    }

    public final void a(d dVar) {
        int i10 = this.a;
        g gVar = this.f529r;
        if (i10 == 0) {
            int iU = gVar.U(dVar, this.f528q);
            if (dVar.f481p0[0] == 3) {
                this.f527p++;
                iU = 0;
            }
            this.f523l = iU + (dVar.f464g0 != 8 ? gVar.f545P0 : 0) + this.f523l;
            int iT = gVar.T(dVar, this.f528q);
            if (this.f514b == null || this.f515c < iT) {
                this.f514b = dVar;
                this.f515c = iT;
                this.f524m = iT;
            }
        } else {
            int iU2 = gVar.U(dVar, this.f528q);
            int iT2 = gVar.T(dVar, this.f528q);
            if (dVar.f481p0[1] == 3) {
                this.f527p++;
                iT2 = 0;
            }
            this.f524m = iT2 + (dVar.f464g0 != 8 ? gVar.f546Q0 : 0) + this.f524m;
            if (this.f514b == null || this.f515c < iU2) {
                this.f514b = dVar;
                this.f515c = iU2;
                this.f523l = iU2;
            }
        }
        this.f526o++;
    }

    public final void b(int i10, boolean z6, boolean z10) {
        g gVar;
        int i11;
        d dVar;
        boolean z11;
        char c10;
        float f10;
        float f11;
        int i12;
        float f12;
        float f13;
        int i13;
        int i14 = this.f526o;
        int i15 = 0;
        while (true) {
            gVar = this.f529r;
            if (i15 >= i14 || (i13 = this.f525n + i15) >= gVar.f555b1) {
                break;
            }
            d dVar2 = gVar.f554a1[i13];
            if (dVar2 != null) {
                dVar2.D();
            }
            i15++;
        }
        if (i14 == 0 || this.f514b == null) {
            return;
        }
        boolean z12 = z10 && i10 == 0;
        int i16 = -1;
        int i17 = -1;
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = this.f525n + (z6 ? (i14 - 1) - i18 : i18);
            if (i19 >= gVar.f555b1) {
                break;
            }
            d dVar3 = gVar.f554a1[i19];
            if (dVar3 != null && dVar3.f464g0 == 0) {
                if (i16 == -1) {
                    i16 = i18;
                }
                i17 = i18;
            }
        }
        if (this.a != 0) {
            boolean z13 = z12;
            d dVar4 = this.f514b;
            dVar4.f468i0 = gVar.f533D0;
            int i20 = this.f520h;
            if (i10 > 0) {
                i20 += gVar.f545P0;
            }
            c cVar = dVar4.f437I;
            c cVar2 = dVar4.f439K;
            if (z6) {
                cVar2.a(this.f518f, i20);
                if (z10) {
                    cVar.a(this.f516d, this.j);
                }
                if (i10 > 0) {
                    this.f518f.f423d.f437I.a(cVar2, 0);
                }
            } else {
                cVar.a(this.f516d, i20);
                if (z10) {
                    cVar2.a(this.f518f, this.j);
                }
                if (i10 > 0) {
                    this.f516d.f423d.f439K.a(cVar, 0);
                }
            }
            d dVar5 = null;
            for (int i21 = 0; i21 < i14; i21++) {
                int i22 = this.f525n + i21;
                if (i22 >= gVar.f555b1) {
                    return;
                }
                d dVar6 = gVar.f554a1[i22];
                if (dVar6 != null) {
                    c cVar3 = dVar6.f438J;
                    if (i21 == 0) {
                        dVar6.f(cVar3, this.f517e, this.f521i);
                        int i23 = gVar.f534E0;
                        float f14 = gVar.f540K0;
                        if (this.f525n == 0) {
                            int i24 = gVar.f536G0;
                            i11 = -1;
                            if (i24 != -1) {
                                f14 = gVar.f542M0;
                            }
                            i23 = i24;
                            dVar6.f469j0 = i23;
                            dVar6.f461e0 = f14;
                        } else {
                            i11 = -1;
                        }
                        if (z10 && (i24 = gVar.f538I0) != i11) {
                            f14 = gVar.f544O0;
                            i23 = i24;
                        }
                        dVar6.f469j0 = i23;
                        dVar6.f461e0 = f14;
                    }
                    if (i21 == i14 - 1) {
                        dVar6.f(dVar6.f440L, this.f519g, this.f522k);
                    }
                    if (dVar5 != null) {
                        int i25 = gVar.f546Q0;
                        c cVar4 = dVar5.f440L;
                        cVar3.a(cVar4, i25);
                        if (i21 == i16) {
                            int i26 = this.f521i;
                            if (cVar3.h()) {
                                cVar3.f427h = i26;
                            }
                        }
                        cVar4.a(cVar3, 0);
                        if (i21 == i17 + 1) {
                            int i27 = this.f522k;
                            if (cVar4.h()) {
                                cVar4.f427h = i27;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        c cVar5 = dVar6.f439K;
                        c cVar6 = dVar6.f437I;
                        if (z6) {
                            int i28 = gVar.f547R0;
                            if (i28 == 0) {
                                cVar5.a(cVar2, 0);
                            } else if (i28 == 1) {
                                cVar6.a(cVar, 0);
                            } else if (i28 == 2) {
                                cVar6.a(cVar, 0);
                                cVar5.a(cVar2, 0);
                            }
                        } else {
                            int i29 = gVar.f547R0;
                            if (i29 == 0) {
                                cVar6.a(cVar, 0);
                            } else if (i29 == 1) {
                                cVar5.a(cVar2, 0);
                            } else if (i29 == 2) {
                                if (z13) {
                                    cVar6.a(this.f516d, this.f520h);
                                    cVar5.a(this.f518f, this.j);
                                } else {
                                    cVar6.a(cVar, 0);
                                    cVar5.a(cVar2, 0);
                                }
                            }
                        }
                    }
                    dVar5 = dVar6;
                }
            }
            return;
        }
        d dVar7 = this.f514b;
        dVar7.f469j0 = gVar.f534E0;
        int i30 = this.f521i;
        if (i10 > 0) {
            i30 += gVar.f546Q0;
        }
        c cVar7 = this.f517e;
        c cVar8 = dVar7.f438J;
        cVar8.a(cVar7, i30);
        c cVar9 = dVar7.f440L;
        if (z10) {
            cVar9.a(this.f519g, this.f522k);
        }
        if (i10 > 0) {
            this.f517e.f423d.f440L.a(cVar8, 0);
        }
        if (gVar.f548S0 != 3 || dVar7.f433E) {
            dVar = dVar7;
            break;
        }
        int i31 = 0;
        while (true) {
            if (i31 < i14) {
                int i32 = this.f525n + (z6 ? (i14 - 1) - i31 : i31);
                if (i32 < gVar.f555b1) {
                    dVar = gVar.f554a1[i32];
                    if (dVar.f433E) {
                        break;
                    } else {
                        i31++;
                    }
                }
            }
            dVar = dVar7;
            break;
        }
        int i33 = 0;
        d dVar8 = null;
        while (i33 < i14) {
            int i34 = z6 ? (i14 - 1) - i33 : i33;
            int i35 = this.f525n + i34;
            if (i35 >= gVar.f555b1) {
                return;
            }
            d dVar9 = gVar.f554a1[i35];
            if (dVar9 == null) {
                z11 = z12;
                c10 = 3;
            } else {
                c cVar10 = dVar9.f437I;
                if (i33 == 0) {
                    dVar9.f(cVar10, this.f516d, this.f520h);
                }
                if (i34 == 0) {
                    int i36 = gVar.f533D0;
                    if (z6) {
                        f10 = 1.0f;
                        f11 = 1.0f - gVar.f539J0;
                    } else {
                        f10 = 1.0f;
                        f11 = gVar.f539J0;
                    }
                    if (this.f525n == 0) {
                        i12 = gVar.f535F0;
                        z11 = z12;
                        if (i12 != -1) {
                            if (z6) {
                                f13 = gVar.f541L0;
                                f11 = f10 - f13;
                            } else {
                                f12 = gVar.f541L0;
                                f11 = f12;
                            }
                        }
                        dVar9.f468i0 = i12;
                        dVar9.f459d0 = f11;
                    } else {
                        z11 = z12;
                    }
                    if (!z10 || (i12 = gVar.f537H0) == -1) {
                        i12 = i36;
                    } else if (z6) {
                        f13 = gVar.f543N0;
                        f11 = f10 - f13;
                    } else {
                        f12 = gVar.f543N0;
                        f11 = f12;
                    }
                    dVar9.f468i0 = i12;
                    dVar9.f459d0 = f11;
                } else {
                    z11 = z12;
                }
                if (i33 == i14 - 1) {
                    dVar9.f(dVar9.f439K, this.f518f, this.j);
                }
                if (dVar8 != null) {
                    int i37 = gVar.f545P0;
                    c cVar11 = dVar8.f439K;
                    cVar10.a(cVar11, i37);
                    if (i33 == i16) {
                        int i38 = this.f520h;
                        if (cVar10.h()) {
                            cVar10.f427h = i38;
                        }
                    }
                    cVar11.a(cVar10, 0);
                    if (i33 == i17 + 1) {
                        int i39 = this.j;
                        if (cVar11.h()) {
                            cVar11.f427h = i39;
                        }
                    }
                }
                if (dVar9 != dVar7) {
                    int i40 = gVar.f548S0;
                    c10 = 3;
                    if (i40 == 3 && dVar.f433E && dVar9 != dVar && dVar9.f433E) {
                        dVar9.f441M.a(dVar.f441M, 0);
                    } else {
                        c cVar12 = dVar9.f438J;
                        if (i40 != 0) {
                            c cVar13 = dVar9.f440L;
                            if (i40 == 1) {
                                cVar13.a(cVar9, 0);
                            } else if (z11) {
                                cVar12.a(this.f517e, this.f521i);
                                cVar13.a(this.f519g, this.f522k);
                            } else {
                                cVar12.a(cVar8, 0);
                                cVar13.a(cVar9, 0);
                            }
                        } else {
                            cVar12.a(cVar8, 0);
                        }
                    }
                } else {
                    c10 = 3;
                }
                dVar8 = dVar9;
            }
            i33++;
            z12 = z11;
        }
    }

    public final int c() {
        return this.a == 1 ? this.f524m - this.f529r.f546Q0 : this.f524m;
    }

    public final int d() {
        return this.a == 0 ? this.f523l - this.f529r.f545P0 : this.f523l;
    }

    public final void e(int i10) {
        g gVar;
        int i11;
        int i12 = this.f527p;
        if (i12 == 0) {
            return;
        }
        int i13 = this.f526o;
        int i14 = i10 / i12;
        int i15 = 0;
        while (true) {
            gVar = this.f529r;
            if (i15 >= i13 || (i11 = this.f525n + i15) >= gVar.f555b1) {
                break;
            }
            d dVar = gVar.f554a1[i11];
            if (this.a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f481p0;
                    if (iArr[0] == 3 && dVar.f483r == 0) {
                        gVar.V(1, i14, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f481p0;
                if (iArr2[1] == 3 && dVar.f484s == 0) {
                    int i16 = iArr2[0];
                    int i17 = i14;
                    gVar.V(i16, dVar.q(), 1, i17, dVar);
                    i14 = i17;
                }
            }
            i15++;
        }
        this.f523l = 0;
        this.f524m = 0;
        this.f514b = null;
        this.f515c = 0;
        int i18 = this.f526o;
        for (int i19 = 0; i19 < i18; i19++) {
            int i20 = this.f525n + i19;
            if (i20 >= gVar.f555b1) {
                return;
            }
            d dVar2 = gVar.f554a1[i20];
            if (this.a == 0) {
                int iQ = dVar2.q();
                int i21 = gVar.f545P0;
                if (dVar2.f464g0 == 8) {
                    i21 = 0;
                }
                this.f523l = iQ + i21 + this.f523l;
                int iT = gVar.T(dVar2, this.f528q);
                if (this.f514b == null || this.f515c < iT) {
                    this.f514b = dVar2;
                    this.f515c = iT;
                    this.f524m = iT;
                }
            } else {
                int iU = gVar.U(dVar2, this.f528q);
                int iT2 = gVar.T(dVar2, this.f528q);
                int i22 = gVar.f546Q0;
                if (dVar2.f464g0 == 8) {
                    i22 = 0;
                }
                this.f524m = iT2 + i22 + this.f524m;
                if (this.f514b == null || this.f515c < iU) {
                    this.f514b = dVar2;
                    this.f515c = iU;
                    this.f523l = iU;
                }
            }
        }
    }

    public final void f(int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11, int i12, int i13, int i14, int i15) {
        this.a = i10;
        this.f516d = cVar;
        this.f517e = cVar2;
        this.f518f = cVar3;
        this.f519g = cVar4;
        this.f520h = i11;
        this.f521i = i12;
        this.j = i13;
        this.f522k = i14;
        this.f528q = i15;
    }
}
