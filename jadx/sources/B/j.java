package B;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final boolean[] a = new boolean[3];

    /* JADX WARN: Code duplicated, block: B:189:0x0290  */
    /* JADX WARN: Code duplicated, block: B:206:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:208:0x02db  */
    /* JADX WARN: Code duplicated, block: B:210:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:410:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:413:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:414:0x06af  */
    /* JADX WARN: Code duplicated, block: B:417:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:418:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:420:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:422:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:425:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:427:0x06d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:437:0x06ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:74:0x010e  */
    public static void a(e eVar, p239z.c cVar, ArrayList arrayList, int i10) {
        int i11;
        b[] bVarArr;
        int i12;
        int i13;
        float f10;
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        c[] cVarArr;
        int i14;
        b[] bVarArr2;
        d dVar;
        p239z.c cVar2;
        p239z.f fVar;
        c cVar3;
        p239z.f fVar2;
        int i15;
        c cVar4;
        p239z.f fVar3;
        d dVar2;
        int i16;
        c[] cVarArr2;
        int i17;
        c cVar5;
        c cVar6;
        p239z.f fVar4;
        c cVar7;
        p239z.f fVar5;
        int size;
        float f11;
        ArrayList arrayList2;
        int i18;
        float f12;
        float f13;
        boolean z13;
        c cVar8;
        d dVar3;
        int i19;
        int i20;
        d dVar4;
        e eVar2 = eVar;
        if (i10 == 0) {
            i11 = eVar2.f513z0;
            bVarArr = eVar2.f494C0;
            i12 = 0;
        } else {
            i11 = eVar2.f492A0;
            bVarArr = eVar2.f493B0;
            i12 = 2;
        }
        int i21 = i11;
        b[] bVarArr3 = bVarArr;
        int i22 = 0;
        while (i22 < i21) {
            b bVar = bVarArr3[i22];
            boolean z14 = bVar.f420q;
            d dVar5 = bVar.a;
            int i23 = 3;
            int i24 = 8;
            if (z14) {
                i13 = i22;
                f10 = 0.0f;
            } else {
                int i25 = bVar.f415l;
                int i26 = i25 * 2;
                d dVar6 = dVar5;
                d dVar7 = dVar6;
                boolean z15 = false;
                f10 = 0.0f;
                while (!z15) {
                    bVar.f413i++;
                    dVar6.f475m0[i25] = null;
                    dVar6.f473l0[i25] = null;
                    int i27 = dVar6.f464g0;
                    c[] cVarArr3 = dVar6.f444Q;
                    if (i27 != i24) {
                        dVar6.j(i25);
                        cVarArr3[i26].e();
                        int i28 = i26 + 1;
                        cVarArr3[i28].e();
                        cVarArr3[i26].e();
                        cVarArr3[i28].e();
                        if (bVar.f406b == null) {
                            bVar.f406b = dVar6;
                        }
                        bVar.f408d = dVar6;
                        int i29 = dVar6.f481p0[i25];
                        if (i29 == i23) {
                            int i30 = dVar6.f485t[i25];
                            if (i30 == 0 || i30 == i23 || i30 == 2) {
                                bVar.j++;
                                float f14 = dVar6.f471k0[i25];
                                if (f14 > 0.0f) {
                                    bVar.f414k += f14;
                                }
                                i20 = i25;
                                if (dVar6.f464g0 != 8 && i29 == 3 && (i30 == 0 || i30 == 3)) {
                                    if (f14 < 0.0f) {
                                        bVar.f417n = true;
                                    } else {
                                        bVar.f418o = true;
                                    }
                                    if (bVar.f412h == null) {
                                        bVar.f412h = new ArrayList();
                                    }
                                    bVar.f412h.add(dVar6);
                                }
                                if (bVar.f410f == null) {
                                    bVar.f410f = dVar6;
                                }
                                d dVar8 = bVar.f411g;
                                if (dVar8 != null) {
                                    dVar8.f473l0[i20] = dVar6;
                                }
                                bVar.f411g = dVar6;
                            } else {
                                i22 = i22;
                                i20 = i25;
                            }
                            if (i20 == 0) {
                                if (dVar6.f483r == 0 && dVar6.f486u == 0) {
                                    int i31 = dVar6.f487v;
                                }
                            } else if (dVar6.f484s == 0 && dVar6.f489x == 0) {
                                int i32 = dVar6.f490y;
                            }
                        } else {
                            i22 = i22;
                            i20 = i25;
                        }
                    } else {
                        i22 = i22;
                        i20 = i25;
                    }
                    if (dVar7 != dVar6) {
                        dVar7.f475m0[i20] = dVar6;
                    }
                    c cVar9 = cVarArr3[i26 + 1].f425f;
                    if (cVar9 != null) {
                        dVar4 = cVar9.f423d;
                        c cVar10 = dVar4.f444Q[i26].f425f;
                        if (cVar10 == null || cVar10.f423d != dVar6) {
                            dVar4 = null;
                        }
                    } else {
                        dVar4 = null;
                    }
                    if (dVar4 == null) {
                        dVar4 = dVar6;
                        z15 = true;
                    }
                    dVar7 = dVar6;
                    i25 = i20;
                    i23 = 3;
                    i24 = 8;
                    dVar6 = dVar4;
                    i22 = i22;
                }
                i13 = i22;
                int i33 = i25;
                d dVar9 = bVar.f406b;
                if (dVar9 != null) {
                    dVar9.f444Q[i26].e();
                }
                d dVar10 = bVar.f408d;
                if (dVar10 != null) {
                    dVar10.f444Q[i26 + 1].e();
                }
                bVar.f407c = dVar6;
                if (i33 == 0 && bVar.f416m) {
                    bVar.f409e = dVar6;
                } else {
                    bVar.f409e = dVar5;
                }
                bVar.f419p = bVar.f418o && bVar.f417n;
            }
            bVar.f420q = true;
            if (arrayList == 0 || arrayList.contains(dVar5)) {
                d dVar11 = bVar.f407c;
                d dVar12 = bVar.f406b;
                d dVar13 = bVar.f408d;
                d dVar14 = bVar.f409e;
                float f15 = bVar.f414k;
                boolean z16 = eVar2.f481p0[i10] == 2;
                if (i10 == 0) {
                    int i34 = dVar14.f468i0;
                    boolean z17 = i34 == 0;
                    boolean z18 = i34 == 1;
                    z6 = i34 == 2;
                    z11 = z18;
                    z10 = z17;
                    z12 = false;
                } else {
                    int i35 = dVar14.f469j0;
                    boolean z19 = i35 == 0;
                    boolean z20 = i35 == 1;
                    z6 = i35 == 2;
                    z10 = z19;
                    z11 = z20;
                    z12 = false;
                }
                while (true) {
                    cVarArr = eVar2.f444Q;
                    if (z12) {
                        break;
                    }
                    c cVar11 = dVar5.f444Q[i12];
                    int i36 = z6 ? 1 : 4;
                    int iE = cVar11.e();
                    boolean z21 = z12;
                    int[] iArr = dVar5.f481p0;
                    boolean z22 = z6;
                    boolean z23 = iArr[i10] == 3 && dVar5.f485t[i10] == 0;
                    c cVar12 = cVar11.f425f;
                    if (cVar12 != null && dVar5 != dVar5) {
                        iE = cVar12.e() + iE;
                    }
                    int i37 = iE;
                    if (z22 && dVar5 != dVar5 && dVar5 != dVar12) {
                        i36 = 8;
                    }
                    boolean z24 = z23;
                    c cVar13 = cVar11.f425f;
                    if (cVar13 != null) {
                        if (dVar5 == dVar12) {
                            cVar.f(cVar11.f428i, cVar13.f428i, i37, 6);
                        } else {
                            cVar.f(cVar11.f428i, cVar13.f428i, i37, 8);
                        }
                        if (z24 && !z22) {
                            i36 = 5;
                        }
                        cVar.e(cVar11.f428i, cVar11.f425f.f428i, i37, (dVar5 == dVar12 && z22 && dVar5.f446S[i10]) ? 5 : i36);
                    } else {
                        i21 = i21;
                    }
                    c[] cVarArr4 = dVar5.f444Q;
                    if (z16) {
                        if (dVar5.f464g0 == 8 || iArr[i10] != 3) {
                            i19 = 0;
                        } else {
                            i19 = 0;
                            cVar.f(cVarArr4[i12 + 1].f428i, cVarArr4[i12].f428i, 0, 5);
                        }
                        cVar.f(cVarArr4[i12].f428i, cVarArr[i12].f428i, i19, 8);
                    }
                    c cVar14 = cVarArr4[i12 + 1].f425f;
                    if (cVar14 != null) {
                        dVar3 = cVar14.f423d;
                        c cVar15 = dVar3.f444Q[i12].f425f;
                        if (cVar15 == null || cVar15.f423d != dVar5) {
                            dVar3 = null;
                        }
                    } else {
                        dVar3 = null;
                    }
                    if (dVar3 != null) {
                        dVar5 = dVar3;
                        z12 = z21;
                    } else {
                        z12 = true;
                    }
                    z6 = z22;
                    i21 = i21;
                }
                boolean z25 = z6;
                i14 = i21;
                if (dVar13 != null) {
                    int i38 = i12 + 1;
                    if (dVar11.f444Q[i38].f425f != null) {
                        c cVar16 = dVar13.f444Q[i38];
                        if (dVar13.f481p0[i10] == 3 && dVar13.f485t[i10] == 0 && !z25) {
                            c cVar17 = cVar16.f425f;
                            if (cVar17.f423d == eVar2) {
                                cVar.e(cVar16.f428i, cVar17.f428i, -cVar16.e(), 5);
                            } else if (z25) {
                                cVar8 = cVar16.f425f;
                                if (cVar8.f423d == eVar2) {
                                    cVar.e(cVar16.f428i, cVar8.f428i, -cVar16.e(), 4);
                                }
                            }
                        } else if (z25) {
                            cVar8 = cVar16.f425f;
                            if (cVar8.f423d == eVar2) {
                                cVar.e(cVar16.f428i, cVar8.f428i, -cVar16.e(), 4);
                            }
                        }
                        cVar.g(cVar16.f428i, dVar11.f444Q[i38].f425f.f428i, -cVar16.e(), 6);
                    }
                }
                if (z16 != 0) {
                    int i39 = i12 + 1;
                    p239z.f fVar6 = cVarArr[i39].f428i;
                    c cVar18 = dVar11.f444Q[i39];
                    cVar.f(fVar6, cVar18.f428i, cVar18.e(), 8);
                }
                ArrayList arrayList3 = bVar.f412h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (bVar.f417n && !bVar.f419p) {
                        f15 = bVar.j;
                    }
                    d dVar15 = null;
                    float f16 = f10;
                    int i40 = 0;
                    while (i40 < size) {
                        d dVar16 = (d) arrayList3.get(i40);
                        float f17 = dVar16.f471k0[i10];
                        c[] cVarArr5 = dVar16.f444Q;
                        if (f17 < f10) {
                            if (bVar.f419p) {
                                arrayList2 = arrayList3;
                                i18 = size;
                                cVar.e(cVarArr5[i12 + 1].f428i, cVarArr5[i12].f428i, 0, 4);
                                z13 = false;
                            } else {
                                f11 = 1.0f;
                            }
                            i40 = i40;
                            f13 = f10;
                            bVarArr3 = bVarArr3;
                            i40++;
                            bVarArr3 = bVarArr3;
                            arrayList3 = arrayList2;
                            size = i18;
                            f10 = f13;
                        } else {
                            f11 = f17;
                        }
                        arrayList2 = arrayList3;
                        i18 = size;
                        if (f11 == f10) {
                            z13 = false;
                            cVar.e(cVarArr5[i12 + 1].f428i, cVarArr5[i12].f428i, 0, 8);
                            i40 = i40;
                            f13 = f10;
                            bVarArr3 = bVarArr3;
                        } else {
                            if (dVar15 != null) {
                                c[] cVarArr6 = dVar15.f444Q;
                                p239z.f fVar7 = cVarArr6[i12].f428i;
                                int i41 = i12 + 1;
                                p239z.f fVar8 = cVarArr6[i41].f428i;
                                f12 = f11;
                                p239z.f fVar9 = cVarArr5[i12].f428i;
                                p239z.f fVar10 = cVarArr5[i41].f428i;
                                p239z.b bVarL = cVar.l();
                                float f18 = f10;
                                bVarL.f16259b = f18;
                                f13 = f18;
                                if (f15 == f18 || f16 == f12) {
                                    bVarL.f16261d.g(fVar7, 1.0f);
                                    bVarL.f16261d.g(fVar8, -1.0f);
                                    bVarL.f16261d.g(fVar10, 1.0f);
                                    bVarL.f16261d.g(fVar9, -1.0f);
                                } else if (f16 == f13) {
                                    bVarL.f16261d.g(fVar7, 1.0f);
                                    bVarL.f16261d.g(fVar8, -1.0f);
                                } else if (f11 == f10) {
                                    bVarL.f16261d.g(fVar9, 1.0f);
                                    bVarL.f16261d.g(fVar10, -1.0f);
                                } else {
                                    float f19 = (f16 / f15) / (f12 / f15);
                                    bVarL.f16261d.g(fVar7, 1.0f);
                                    bVarL.f16261d.g(fVar8, -1.0f);
                                    bVarL.f16261d.g(fVar10, f19);
                                    bVarL.f16261d.g(fVar9, -f19);
                                }
                                cVar.c(bVarL);
                            } else {
                                f12 = f11;
                                f13 = f10;
                                bVarArr3 = bVarArr3;
                            }
                            dVar15 = dVar16;
                            f16 = f12;
                        }
                        i40++;
                        bVarArr3 = bVarArr3;
                        arrayList3 = arrayList2;
                        size = i18;
                        f10 = f13;
                    }
                }
                bVarArr2 = bVarArr3;
                if (dVar12 == null || !(dVar12 == dVar13 || z25)) {
                    dVar = dVar13;
                    if (!z10 || dVar12 == null) {
                        if (z11 && dVar12 != null) {
                            int i42 = bVar.j;
                            boolean z26 = i42 > 0 && bVar.f413i == i42;
                            d dVar17 = dVar12;
                            d dVar18 = dVar17;
                            while (dVar17 != null) {
                                d dVar19 = dVar17.f475m0[i10];
                                while (dVar19 != null && dVar19.f464g0 == 8) {
                                    dVar19 = dVar19.f475m0[i10];
                                }
                                if (dVar17 != dVar12 && dVar17 != dVar && dVar19 != null) {
                                    if (dVar19 == dVar) {
                                        dVar19 = null;
                                    }
                                    c[] cVarArr7 = dVar17.f444Q;
                                    c cVar19 = cVarArr7[i12];
                                    p239z.f fVar11 = cVar19.f428i;
                                    int i43 = i12 + 1;
                                    p239z.f fVar12 = dVar18.f444Q[i43].f428i;
                                    int iE2 = cVar19.e();
                                    int iE3 = cVarArr7[i43].e();
                                    if (dVar19 != null) {
                                        cVar3 = dVar19.f444Q[i12];
                                        fVar2 = cVar3.f428i;
                                        c cVar20 = cVar3.f425f;
                                        fVar = cVar20 != null ? cVar20.f428i : null;
                                    } else {
                                        c cVar21 = dVar.f444Q[i12];
                                        p239z.f fVar13 = cVar21 != null ? cVar21.f428i : null;
                                        fVar = cVarArr7[i43].f428i;
                                        cVar3 = cVar21;
                                        fVar2 = fVar13;
                                    }
                                    if (cVar3 != null) {
                                        iE3 += cVar3.e();
                                    }
                                    int iE4 = dVar18.f444Q[i43].e() + iE2;
                                    p239z.f fVar14 = fVar2;
                                    int i44 = iE3;
                                    p239z.f fVar15 = fVar;
                                    int i45 = z26 ? 8 : 4;
                                    if (fVar11 != null && fVar12 != null && fVar14 != null && fVar15 != null) {
                                        cVar.b(fVar11, fVar12, iE4, 0.5f, fVar14, fVar15, i44, i45);
                                    }
                                    dVar19 = dVar19;
                                }
                                if (dVar17.f464g0 != 8) {
                                    dVar18 = dVar17;
                                }
                                dVar17 = dVar19;
                            }
                            c cVar22 = dVar12.f444Q[i12];
                            c cVar23 = dVar5.f444Q[i12].f425f;
                            int i46 = i12 + 1;
                            c cVar24 = dVar.f444Q[i46];
                            c cVar25 = dVar11.f444Q[i46].f425f;
                            if (cVar23 == null) {
                                cVar2 = cVar;
                            } else {
                                if (dVar12 != dVar) {
                                    cVar.e(cVar22.f428i, cVar23.f428i, cVar22.e(), 5);
                                } else if (cVar25 != null) {
                                    cVar2 = cVar;
                                    cVar2.b(cVar22.f428i, cVar23.f428i, cVar22.e(), 0.5f, cVar24.f428i, cVar25.f428i, cVar24.e(), 5);
                                }
                                cVar2 = cVar;
                            }
                            if (cVar25 != null && dVar12 != dVar) {
                                cVar2.e(cVar24.f428i, cVar25.f428i, -cVar24.e(), 5);
                            }
                        }
                        if ((z10 || z11) && dVar12 != null && dVar12 != dVar) {
                            cVarArr2 = dVar12.f444Q;
                            c cVar26 = cVarArr2[i12];
                            if (dVar == null) {
                                dVar = dVar12;
                            }
                            i17 = i12 + 1;
                            c[] cVarArr8 = dVar.f444Q;
                            cVar5 = cVarArr8[i17];
                            cVar6 = cVar26.f425f;
                            if (cVar6 != null) {
                                fVar4 = cVar6.f428i;
                            } else {
                                fVar4 = null;
                            }
                            cVar7 = cVar5.f425f;
                            if (cVar7 != null) {
                                fVar5 = cVar7.f428i;
                            } else {
                                fVar5 = null;
                            }
                            if (dVar11 != dVar) {
                                c cVar27 = dVar11.f444Q[i17].f425f;
                                fVar5 = cVar27 != null ? cVar27.f428i : null;
                            }
                            if (dVar12 == dVar) {
                                cVar5 = cVarArr2[i17];
                            }
                            if (fVar4 == null && fVar5 != null) {
                                cVar2.b(cVar26.f428i, fVar4, cVar26.e(), 0.5f, fVar5, cVar5.f428i, cVarArr8[i17].e(), 5);
                            }
                        }
                    } else {
                        int i47 = bVar.j;
                        boolean z27 = i47 > 0 && bVar.f413i == i47;
                        d dVar20 = dVar12;
                        d dVar21 = dVar20;
                        while (dVar20 != null) {
                            d dVar22 = dVar20.f475m0[i10];
                            while (true) {
                                if (dVar22 == null) {
                                    i15 = 8;
                                    break;
                                }
                                i15 = 8;
                                if (dVar22.f464g0 != 8) {
                                    break;
                                } else {
                                    dVar22 = dVar22.f475m0[i10];
                                }
                            }
                            if (dVar22 != null || dVar20 == dVar) {
                                c[] cVarArr9 = dVar20.f444Q;
                                c cVar28 = cVarArr9[i12];
                                p239z.f fVar16 = cVar28.f428i;
                                c cVar29 = cVar28.f425f;
                                p239z.f fVar17 = cVar29 != null ? cVar29.f428i : null;
                                if (dVar21 != dVar20) {
                                    fVar17 = dVar21.f444Q[i12 + 1].f428i;
                                } else if (dVar20 == dVar12) {
                                    c cVar30 = dVar5.f444Q[i12].f425f;
                                    fVar17 = cVar30 != null ? cVar30.f428i : null;
                                }
                                int iE5 = cVar28.e();
                                int i48 = i12 + 1;
                                int iE6 = cVarArr9[i48].e();
                                if (dVar22 != null) {
                                    cVar4 = dVar22.f444Q[i12];
                                    fVar3 = cVar4.f428i;
                                } else {
                                    cVar4 = dVar11.f444Q[i48].f425f;
                                    fVar3 = cVar4 != null ? cVar4.f428i : null;
                                }
                                p239z.f fVar18 = cVarArr9[i48].f428i;
                                if (cVar4 != null) {
                                    iE6 += cVar4.e();
                                }
                                int iE7 = dVar21.f444Q[i48].e() + iE5;
                                if (fVar16 == null || fVar17 == null || fVar3 == null || fVar18 == null) {
                                    dVar2 = dVar5;
                                    i16 = 8;
                                } else {
                                    if (dVar20 == dVar12) {
                                        iE7 = dVar12.f444Q[i12].e();
                                    }
                                    if (dVar20 == dVar) {
                                        iE6 = dVar.f444Q[i48].e();
                                    }
                                    dVar2 = dVar5;
                                    i16 = 8;
                                    cVar.b(fVar16, fVar17, iE7, 0.5f, fVar3, fVar18, iE6, z27 ? 8 : 5);
                                }
                            } else {
                                dVar2 = dVar5;
                                i16 = i15;
                            }
                            if (dVar20.f464g0 != i16) {
                                dVar21 = dVar20;
                            }
                            dVar20 = dVar22;
                            dVar21 = dVar21;
                            dVar5 = dVar2;
                        }
                    }
                } else {
                    c cVar31 = dVar5.f444Q[i12];
                    int i49 = i12 + 1;
                    c cVar32 = dVar11.f444Q[i49];
                    c cVar33 = cVar31.f425f;
                    p239z.f fVar19 = cVar33 != null ? cVar33.f428i : null;
                    c cVar34 = cVar32.f425f;
                    p239z.f fVar20 = cVar34 != null ? cVar34.f428i : null;
                    c cVar35 = dVar12.f444Q[i12];
                    if (dVar13 != null) {
                        cVar32 = dVar13.f444Q[i49];
                    }
                    if (fVar19 == null || fVar20 == null) {
                        dVar = dVar13;
                    } else {
                        float f20 = i10 == 0 ? dVar14.f459d0 : dVar14.f461e0;
                        int iE8 = cVar35.e();
                        int iE9 = cVar32.e();
                        p239z.f fVar21 = cVar35.f428i;
                        p239z.f fVar22 = cVar32.f428i;
                        p239z.f fVar23 = fVar19;
                        dVar = dVar13;
                        cVar.b(fVar21, fVar23, iE8, f20, fVar20, fVar22, iE9, 7);
                    }
                }
                cVar2 = cVar;
                if (z10) {
                    cVarArr2 = dVar12.f444Q;
                    c cVar210 = cVarArr2[i12];
                    if (dVar == null) {
                        dVar = dVar12;
                    }
                    i17 = i12 + 1;
                    c[] cVarArr10 = dVar.f444Q;
                    cVar5 = cVarArr10[i17];
                    cVar6 = cVar210.f425f;
                    if (cVar6 != null) {
                        fVar4 = cVar6.f428i;
                    } else {
                        fVar4 = null;
                    }
                    cVar7 = cVar5.f425f;
                    if (cVar7 != null) {
                        fVar5 = cVar7.f428i;
                    } else {
                        fVar5 = null;
                    }
                    if (dVar11 != dVar) {
                        c cVar211 = dVar11.f444Q[i17].f425f;
                        fVar5 = cVar211 != null ? cVar211.f428i : null;
                    }
                    if (dVar12 == dVar) {
                        cVar5 = cVarArr2[i17];
                    }
                    if (fVar4 == null) {
                    }
                } else {
                    cVarArr2 = dVar12.f444Q;
                    c cVar212 = cVarArr2[i12];
                    if (dVar == null) {
                        dVar = dVar12;
                    }
                    i17 = i12 + 1;
                    c[] cVarArr11 = dVar.f444Q;
                    cVar5 = cVarArr11[i17];
                    cVar6 = cVar212.f425f;
                    if (cVar6 != null) {
                        fVar4 = cVar6.f428i;
                    } else {
                        fVar4 = null;
                    }
                    cVar7 = cVar5.f425f;
                    if (cVar7 != null) {
                        fVar5 = cVar7.f428i;
                    } else {
                        fVar5 = null;
                    }
                    if (dVar11 != dVar) {
                        c cVar213 = dVar11.f444Q[i17].f425f;
                        fVar5 = cVar213 != null ? cVar213.f428i : null;
                    }
                    if (dVar12 == dVar) {
                        cVar5 = cVarArr2[i17];
                    }
                    if (fVar4 == null) {
                    }
                }
            } else {
                i14 = i21;
                bVarArr2 = bVarArr3;
            }
            i22 = i13 + 1;
            eVar2 = eVar;
            bVarArr3 = bVarArr2;
            i21 = i14;
        }
    }

    public static void b(e eVar, p239z.c cVar, d dVar) {
        dVar.f478o = -1;
        dVar.f480p = -1;
        int i10 = eVar.f481p0[0];
        int[] iArr = dVar.f481p0;
        if (i10 != 2 && iArr[0] == 4) {
            c cVar2 = dVar.f437I;
            int i11 = cVar2.f426g;
            int iQ = eVar.q();
            c cVar3 = dVar.f439K;
            int i12 = iQ - cVar3.f426g;
            cVar2.f428i = cVar.k(cVar2);
            cVar3.f428i = cVar.k(cVar3);
            cVar.d(cVar2.f428i, i11);
            cVar.d(cVar3.f428i, i12);
            dVar.f478o = 2;
            dVar.f452Y = i11;
            int i13 = i12 - i11;
            dVar.f448U = i13;
            int i14 = dVar.f456b0;
            if (i13 < i14) {
                dVar.f448U = i14;
            }
        }
        if (eVar.f481p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        c cVar4 = dVar.f438J;
        int i15 = cVar4.f426g;
        int iK = eVar.k();
        c cVar5 = dVar.f440L;
        int i16 = iK - cVar5.f426g;
        cVar4.f428i = cVar.k(cVar4);
        cVar5.f428i = cVar.k(cVar5);
        cVar.d(cVar4.f428i, i15);
        cVar.d(cVar5.f428i, i16);
        if (dVar.f454a0 > 0 || dVar.f464g0 == 8) {
            c cVar6 = dVar.f441M;
            p239z.f fVarK = cVar.k(cVar6);
            cVar6.f428i = fVarK;
            cVar.d(fVarK, dVar.f454a0 + i15);
        }
        dVar.f480p = 2;
        dVar.f453Z = i15;
        int i17 = i16 - i15;
        dVar.f449V = i17;
        int i18 = dVar.c0;
        if (i17 < i18) {
            dVar.f449V = i18;
        }
    }

    public static final boolean c(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
