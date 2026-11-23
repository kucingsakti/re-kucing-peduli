package C;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f831k = new int[2];

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // C.d
    public final void a(d dVar) {
        float f10;
        int iG;
        int i10;
        int iG2;
        float f11;
        float f12;
        float f13;
        int i11;
        if (p239z.e.d(this.j) == 3) {
            B.d dVar2 = this.f840b;
            l(dVar2.f437I, dVar2.f439K, 0);
            return;
        }
        g gVar = this.f843e;
        boolean z6 = gVar.j;
        f fVar = this.f846h;
        f fVar2 = this.f847i;
        if (z6 || this.f842d != 3) {
            f10 = 0.5f;
        } else {
            B.d dVar3 = this.f840b;
            int i12 = dVar3.f483r;
            if (i12 == 2) {
                f10 = 0.5f;
                B.d dVar4 = dVar3.f447T;
                if (dVar4 != null) {
                    g gVar2 = dVar4.f458d.f843e;
                    if (gVar2.j) {
                        gVar.d((int) ((gVar2.f825g * dVar3.f488w) + 0.5f));
                    }
                }
            } else if (i12 == 3) {
                int i13 = dVar3.f484s;
                if (i13 == 0 || i13 == 3) {
                    m mVar = dVar3.f460e;
                    f fVar3 = mVar.f846h;
                    f fVar4 = mVar.f847i;
                    boolean z10 = dVar3.f437I.f425f != null;
                    boolean z11 = dVar3.f438J.f425f != null;
                    boolean z12 = dVar3.f439K.f425f != null;
                    boolean z13 = dVar3.f440L.f425f != null;
                    f10 = 0.5f;
                    int i14 = dVar3.f451X;
                    if (z10 && z11 && z12 && z13) {
                        float f14 = dVar3.f450W;
                        boolean z14 = fVar3.j;
                        int[] iArr = f831k;
                        if (z14 && fVar4.j) {
                            if (fVar.f821c && fVar2.f821c) {
                                m(iArr, ((f) fVar.f829l.get(0)).f825g + fVar.f824f, ((f) fVar2.f829l.get(0)).f825g - fVar2.f824f, fVar3.f825g + fVar3.f824f, fVar4.f825g - fVar4.f824f, f14, i14);
                                gVar.d(iArr[0]);
                                this.f840b.f460e.f843e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z15 = fVar.j;
                        ArrayList arrayList = fVar3.f829l;
                        if (z15 && fVar2.j) {
                            if (!fVar3.f821c || !fVar4.f821c) {
                                return;
                            }
                            m(iArr, fVar.f825g + fVar.f824f, fVar2.f825g - fVar2.f824f, ((f) arrayList.get(0)).f825g + fVar3.f824f, ((f) fVar4.f829l.get(0)).f825g - fVar4.f824f, f14, i14);
                            gVar.d(iArr[0]);
                            this.f840b.f460e.f843e.d(iArr[1]);
                        }
                        if (!fVar.f821c || !fVar2.f821c || !fVar3.f821c || !fVar4.f821c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f829l.get(0)).f825g + fVar.f824f, ((f) fVar2.f829l.get(0)).f825g - fVar2.f824f, ((f) arrayList.get(0)).f825g + fVar3.f824f, ((f) fVar4.f829l.get(0)).f825g - fVar4.f824f, f14, i14);
                        gVar.d(iArr[0]);
                        this.f840b.f460e.f843e.d(iArr[1]);
                    } else if (z10 && z12) {
                        if (!fVar.f821c || !fVar2.f821c) {
                            return;
                        }
                        float f15 = dVar3.f450W;
                        int i15 = ((f) fVar.f829l.get(0)).f825g + fVar.f824f;
                        int i16 = ((f) fVar2.f829l.get(0)).f825g - fVar2.f824f;
                        if (i14 == -1 || i14 == 0) {
                            int iG3 = g(i16 - i15, 0);
                            int i17 = (int) ((iG3 * f15) + 0.5f);
                            int iG4 = g(i17, 1);
                            if (i17 != iG4) {
                                iG3 = (int) ((iG4 / f15) + 0.5f);
                            }
                            gVar.d(iG3);
                            this.f840b.f460e.f843e.d(iG4);
                        } else if (i14 == 1) {
                            int iG5 = g(i16 - i15, 0);
                            int i18 = (int) ((iG5 / f15) + 0.5f);
                            int iG6 = g(i18, 1);
                            if (i18 != iG6) {
                                iG5 = (int) ((iG6 * f15) + 0.5f);
                            }
                            gVar.d(iG5);
                            this.f840b.f460e.f843e.d(iG6);
                        }
                    } else if (z11 && z13) {
                        if (!fVar3.f821c || !fVar4.f821c) {
                            return;
                        }
                        float f16 = dVar3.f450W;
                        int i19 = ((f) fVar3.f829l.get(0)).f825g + fVar3.f824f;
                        int i20 = ((f) fVar4.f829l.get(0)).f825g - fVar4.f824f;
                        if (i14 == -1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / f16) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * f16) + 0.5f);
                            }
                            gVar.d(iG2);
                            this.f840b.f460e.f843e.d(iG);
                        } else if (i14 == 0) {
                            int iG7 = g(i20 - i19, 1);
                            int i21 = (int) ((iG7 * f16) + 0.5f);
                            int iG8 = g(i21, 0);
                            if (i21 != iG8) {
                                iG7 = (int) ((iG8 / f16) + 0.5f);
                            }
                            gVar.d(iG8);
                            this.f840b.f460e.f843e.d(iG7);
                        } else if (i14 == 1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / f16) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * f16) + 0.5f);
                            }
                            gVar.d(iG2);
                            this.f840b.f460e.f843e.d(iG);
                        }
                    }
                } else {
                    int i22 = dVar3.f451X;
                    if (i22 != -1) {
                        if (i22 == 0) {
                            f13 = dVar3.f460e.f843e.f825g / dVar3.f450W;
                            i11 = (int) (f13 + 0.5f);
                        } else if (i22 != 1) {
                            i11 = 0;
                        } else {
                            f11 = dVar3.f460e.f843e.f825g;
                            f12 = dVar3.f450W;
                        }
                        gVar.d(i11);
                        f10 = 0.5f;
                    } else {
                        f11 = dVar3.f460e.f843e.f825g;
                        f12 = dVar3.f450W;
                    }
                    f13 = f11 * f12;
                    i11 = (int) (f13 + 0.5f);
                    gVar.d(i11);
                    f10 = 0.5f;
                }
            } else {
                f10 = 0.5f;
            }
        }
        if (fVar.f821c && fVar2.f821c) {
            if (fVar.j && fVar2.j && gVar.j) {
                return;
            }
            if (!gVar.j && this.f842d == 3) {
                B.d dVar5 = this.f840b;
                if (dVar5.f483r == 0 && !dVar5.x()) {
                    f fVar5 = (f) fVar.f829l.get(0);
                    f fVar6 = (f) fVar2.f829l.get(0);
                    int i23 = fVar5.f825g + fVar.f824f;
                    int i24 = fVar6.f825g + fVar2.f824f;
                    fVar.d(i23);
                    fVar2.d(i24);
                    gVar.d(i24 - i23);
                    return;
                }
            }
            if (!gVar.j && this.f842d == 3 && this.a == 1 && fVar.f829l.size() > 0 && fVar2.f829l.size() > 0) {
                int iMin = Math.min((((f) fVar2.f829l.get(0)).f825g + fVar2.f824f) - (((f) fVar.f829l.get(0)).f825g + fVar.f824f), gVar.f830m);
                B.d dVar6 = this.f840b;
                int i25 = dVar6.f487v;
                int iMax = Math.max(dVar6.f486u, iMin);
                if (i25 > 0) {
                    iMax = Math.min(i25, iMax);
                }
                gVar.d(iMax);
            }
            if (gVar.j) {
                f fVar7 = (f) fVar.f829l.get(0);
                f fVar8 = (f) fVar2.f829l.get(0);
                int i26 = fVar7.f825g;
                int i27 = fVar.f824f + i26;
                int i28 = fVar8.f825g;
                int i29 = fVar2.f824f + i28;
                float f17 = this.f840b.f459d0;
                if (fVar7 == fVar8) {
                    f17 = f10;
                } else {
                    i26 = i27;
                    i28 = i29;
                }
                fVar.d((int) ((((i28 - i26) - gVar.f825g) * f17) + i26 + f10));
                fVar2.d(fVar.f825g + gVar.f825g);
            }
        }
    }

    @Override // C.o
    public final void d() {
        B.d dVar;
        B.d dVar2;
        int i10;
        B.d dVar3;
        B.d dVar4;
        int i11;
        B.d dVar5 = this.f840b;
        boolean z6 = dVar5.a;
        g gVar = this.f843e;
        if (z6) {
            gVar.d(dVar5.q());
        }
        boolean z10 = gVar.j;
        f fVar = this.f847i;
        f fVar2 = this.f846h;
        if (!z10) {
            B.d dVar6 = this.f840b;
            int i12 = dVar6.f481p0[0];
            this.f842d = i12;
            if (i12 != 3) {
                if (i12 == 4 && (dVar4 = dVar6.f447T) != null && ((i11 = dVar4.f481p0[0]) == 1 || i11 == 4)) {
                    int iQ = (dVar4.q() - this.f840b.f437I.e()) - this.f840b.f439K.e();
                    o.b(fVar2, dVar4.f458d.f846h, this.f840b.f437I.e());
                    o.b(fVar, dVar4.f458d.f847i, -this.f840b.f439K.e());
                    gVar.d(iQ);
                    return;
                }
                if (i12 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.f842d == 4 && (dVar2 = (dVar = this.f840b).f447T) != null && ((i10 = dVar2.f481p0[0]) == 1 || i10 == 4)) {
            o.b(fVar2, dVar2.f458d.f846h, dVar.f437I.e());
            o.b(fVar, dVar2.f458d.f847i, -this.f840b.f439K.e());
            return;
        }
        if (gVar.j) {
            B.d dVar7 = this.f840b;
            if (dVar7.a) {
                B.c[] cVarArr = dVar7.f444Q;
                B.c cVar = cVarArr[0];
                B.c cVar2 = cVar.f425f;
                if (cVar2 != null && cVarArr[1].f425f != null) {
                    if (dVar7.x()) {
                        fVar2.f824f = this.f840b.f444Q[0].e();
                        fVar.f824f = -this.f840b.f444Q[1].e();
                        return;
                    }
                    f fVarH = o.h(this.f840b.f444Q[0]);
                    if (fVarH != null) {
                        o.b(fVar2, fVarH, this.f840b.f444Q[0].e());
                    }
                    f fVarH2 = o.h(this.f840b.f444Q[1]);
                    if (fVarH2 != null) {
                        o.b(fVar, fVarH2, -this.f840b.f444Q[1].e());
                    }
                    fVar2.f820b = true;
                    fVar.f820b = true;
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = o.h(cVar);
                    if (fVarH3 != null) {
                        o.b(fVar2, fVarH3, this.f840b.f444Q[0].e());
                        o.b(fVar, fVar2, gVar.f825g);
                        return;
                    }
                    return;
                }
                B.c cVar3 = cVarArr[1];
                if (cVar3.f425f != null) {
                    f fVarH4 = o.h(cVar3);
                    if (fVarH4 != null) {
                        o.b(fVar, fVarH4, -this.f840b.f444Q[1].e());
                        o.b(fVar2, fVar, -gVar.f825g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof B.i) || dVar7.f447T == null || dVar7.i(7).f425f != null) {
                    return;
                }
                B.d dVar8 = this.f840b;
                o.b(fVar2, dVar8.f447T.f458d.f846h, dVar8.r());
                o.b(fVar, fVar2, gVar.f825g);
                return;
            }
        }
        if (this.f842d == 3) {
            B.d dVar9 = this.f840b;
            int i13 = dVar9.f483r;
            if (i13 == 2) {
                B.d dVar10 = dVar9.f447T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f460e.f843e;
                    gVar.f829l.add(gVar2);
                    gVar2.f828k.add(gVar);
                    gVar.f820b = true;
                    gVar.f828k.add(fVar2);
                    gVar.f828k.add(fVar);
                }
            } else if (i13 == 3) {
                if (dVar9.f484s == 3) {
                    fVar2.a = this;
                    fVar.a = this;
                    m mVar = dVar9.f460e;
                    mVar.f846h.a = this;
                    mVar.f847i.a = this;
                    gVar.a = this;
                    if (dVar9.y()) {
                        gVar.f829l.add(this.f840b.f460e.f843e);
                        this.f840b.f460e.f843e.f828k.add(gVar);
                        m mVar2 = this.f840b.f460e;
                        mVar2.f843e.a = this;
                        gVar.f829l.add(mVar2.f846h);
                        gVar.f829l.add(this.f840b.f460e.f847i);
                        this.f840b.f460e.f846h.f828k.add(gVar);
                        this.f840b.f460e.f847i.f828k.add(gVar);
                    } else if (this.f840b.x()) {
                        this.f840b.f460e.f843e.f829l.add(gVar);
                        gVar.f828k.add(this.f840b.f460e.f843e);
                    } else {
                        this.f840b.f460e.f843e.f829l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f460e.f843e;
                    gVar.f829l.add(gVar3);
                    gVar3.f828k.add(gVar);
                    this.f840b.f460e.f846h.f828k.add(gVar);
                    this.f840b.f460e.f847i.f828k.add(gVar);
                    gVar.f820b = true;
                    gVar.f828k.add(fVar2);
                    gVar.f828k.add(fVar);
                    fVar2.f829l.add(gVar);
                    fVar.f829l.add(gVar);
                }
            }
        }
        B.d dVar11 = this.f840b;
        B.c[] cVarArr2 = dVar11.f444Q;
        B.c cVar4 = cVarArr2[0];
        B.c cVar5 = cVar4.f425f;
        if (cVar5 != null && cVarArr2[1].f425f != null) {
            if (dVar11.x()) {
                fVar2.f824f = this.f840b.f444Q[0].e();
                fVar.f824f = -this.f840b.f444Q[1].e();
                return;
            }
            f fVarH5 = o.h(this.f840b.f444Q[0]);
            f fVarH6 = o.h(this.f840b.f444Q[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (cVar5 != null) {
            f fVarH7 = o.h(cVar4);
            if (fVarH7 != null) {
                o.b(fVar2, fVarH7, this.f840b.f444Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        B.c cVar6 = cVarArr2[1];
        if (cVar6.f425f != null) {
            f fVarH8 = o.h(cVar6);
            if (fVarH8 != null) {
                o.b(fVar, fVarH8, -this.f840b.f444Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof B.i) || (dVar3 = dVar11.f447T) == null) {
            return;
        }
        o.b(fVar2, dVar3.f458d.f846h, dVar11.r());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // C.o
    public final void e() {
        f fVar = this.f846h;
        if (fVar.j) {
            this.f840b.f452Y = fVar.f825g;
        }
    }

    @Override // C.o
    public final void f() {
        this.f841c = null;
        this.f846h.c();
        this.f847i.c();
        this.f843e.c();
        this.f845g = false;
    }

    @Override // C.o
    public final boolean k() {
        return this.f842d != 3 || this.f840b.f483r == 0;
    }

    public final void n() {
        this.f845g = false;
        f fVar = this.f846h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.f847i;
        fVar2.c();
        fVar2.j = false;
        this.f843e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f840b.f466h0;
    }
}
