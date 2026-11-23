package C;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f812l;

    public c(B.d dVar, int i10) {
        B.d dVar2;
        super(dVar);
        this.f811k = new ArrayList();
        this.f844f = i10;
        B.d dVar3 = this.f840b;
        B.d dVarM = dVar3.m(i10);
        while (true) {
            B.d dVar4 = dVarM;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            } else {
                dVarM = dVar3.m(this.f844f);
            }
        }
        this.f840b = dVar2;
        int i11 = this.f844f;
        o oVar = i11 == 0 ? dVar2.f458d : i11 == 1 ? dVar2.f460e : null;
        ArrayList<o> arrayList = this.f811k;
        arrayList.add(oVar);
        B.d dVarL = dVar2.l(this.f844f);
        while (dVarL != null) {
            int i12 = this.f844f;
            arrayList.add(i12 == 0 ? dVarL.f458d : i12 == 1 ? dVarL.f460e : null);
            dVarL = dVarL.l(this.f844f);
        }
        for (o oVar2 : arrayList) {
            int i13 = this.f844f;
            if (i13 == 0) {
                oVar2.f840b.f455b = this;
            } else if (i13 == 1) {
                oVar2.f840b.f457c = this;
            }
        }
        if (this.f844f == 0 && ((B.e) this.f840b.f447T).f509v0 && arrayList.size() > 1) {
            this.f840b = ((o) arrayList.get(arrayList.size() - 1)).f840b;
        }
        this.f812l = this.f844f == 0 ? this.f840b.f468i0 : this.f840b.f469j0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0152  */
    @Override // C.d
    public final void a(d dVar) {
        int i10;
        int i11;
        boolean z6;
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        float f11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        float f12;
        f fVar = this.f846h;
        if (fVar.j) {
            f fVar2 = this.f847i;
            if (fVar2.j) {
                B.d dVar2 = this.f840b.f447T;
                boolean z10 = dVar2 instanceof B.e ? ((B.e) dVar2).f509v0 : false;
                int i24 = fVar2.f825g - fVar.f825g;
                ArrayList arrayList = this.f811k;
                int size = arrayList.size();
                int i25 = 0;
                while (true) {
                    i10 = -1;
                    i11 = 8;
                    if (i25 >= size) {
                        i25 = -1;
                        break;
                    } else if (((o) arrayList.get(i25)).f840b.f464g0 != 8) {
                        break;
                    } else {
                        i25++;
                    }
                }
                int i26 = size - 1;
                for (int i27 = i26; i27 >= 0; i27--) {
                    if (((o) arrayList.get(i27)).f840b.f464g0 != 8) {
                        i10 = i27;
                        break;
                    }
                }
                int i28 = 0;
                while (true) {
                    if (i28 >= 2) {
                        z6 = z10;
                        f10 = 0.0f;
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                        break;
                    }
                    f10 = 0.0f;
                    int i29 = 0;
                    i14 = 0;
                    int i30 = 0;
                    int i31 = 0;
                    while (i29 < size) {
                        o oVar = (o) arrayList.get(i29);
                        B.d dVar3 = oVar.f840b;
                        boolean z11 = z10;
                        if (dVar3.f464g0 == i11) {
                            i22 = i28;
                        } else {
                            i31++;
                            if (i29 > 0 && i29 >= i25) {
                                i14 += oVar.f846h.f824f;
                            }
                            g gVar = oVar.f843e;
                            int i32 = gVar.f825g;
                            i22 = i28;
                            boolean z12 = oVar.f842d != 3;
                            if (z12) {
                                int i33 = this.f844f;
                                if (i33 == 0 && !dVar3.f458d.f843e.j) {
                                    return;
                                }
                                if (i33 == 1 && !dVar3.f460e.f843e.j) {
                                    return;
                                }
                            } else {
                                if (oVar.a == 1 && i22 == 0) {
                                    i23 = gVar.f830m;
                                    i30++;
                                } else {
                                    if (gVar.j) {
                                        i23 = i32;
                                    }
                                    if (z12) {
                                        i14 += i23;
                                    } else {
                                        i30++;
                                        f12 = dVar3.f471k0[this.f844f];
                                        if (f12 >= 0.0f) {
                                            f10 += f12;
                                        }
                                    }
                                    if (i29 >= i26 && i29 < i10) {
                                        i14 += -oVar.f847i.f824f;
                                    }
                                }
                                z12 = true;
                                if (z12) {
                                    i30++;
                                    f12 = dVar3.f471k0[this.f844f];
                                    if (f12 >= 0.0f) {
                                        f10 += f12;
                                    }
                                } else {
                                    i14 += i23;
                                }
                                if (i29 >= i26) {
                                }
                            }
                            i23 = i32;
                            if (z12) {
                                i30++;
                                f12 = dVar3.f471k0[this.f844f];
                                if (f12 >= 0.0f) {
                                    f10 += f12;
                                }
                            } else {
                                i14 += i23;
                            }
                            if (i29 >= i26) {
                            }
                        }
                        i29++;
                        z10 = z11;
                        i28 = i22;
                        i11 = 8;
                    }
                    z6 = z10;
                    int i34 = i28;
                    if (i14 < i24 || i30 == 0) {
                        i12 = i30;
                        i13 = i31;
                        break;
                    } else {
                        i28 = i34 + 1;
                        z10 = z6;
                        i11 = 8;
                    }
                }
                int i35 = fVar.f825g;
                if (z6) {
                    i35 = fVar2.f825g;
                }
                float f13 = 0.5f;
                if (i14 > i24) {
                    i35 = z6 ? i35 + ((int) (((i14 - i24) / 2.0f) + 0.5f)) : i35 - ((int) (((i14 - i24) / 2.0f) + 0.5f));
                }
                if (i12 > 0) {
                    float f14 = i24 - i14;
                    int i36 = (int) ((f14 / i12) + 0.5f);
                    int i37 = 0;
                    int i38 = 0;
                    while (i37 < size) {
                        float f15 = f13;
                        o oVar2 = (o) arrayList.get(i37);
                        int i39 = i35;
                        B.d dVar4 = oVar2.f840b;
                        int i40 = i12;
                        float f16 = f14;
                        if (dVar4.f464g0 != 8 && oVar2.f842d == 3) {
                            g gVar2 = oVar2.f843e;
                            if (gVar2.j) {
                                i19 = i36;
                            } else {
                                if (f10 > 0.0f) {
                                    i18 = (int) (((dVar4.f471k0[this.f844f] * f16) / f10) + f15);
                                    i19 = i36;
                                } else {
                                    i18 = i36;
                                    i19 = i18;
                                }
                                if (this.f844f == 0) {
                                    i20 = dVar4.f487v;
                                    i21 = dVar4.f486u;
                                } else {
                                    i20 = dVar4.f490y;
                                    i21 = dVar4.f489x;
                                }
                                int iMax = Math.max(i21, oVar2.a == 1 ? Math.min(i18, gVar2.f830m) : i18);
                                if (i20 > 0) {
                                    iMax = Math.min(i20, iMax);
                                }
                                if (iMax != i18) {
                                    i38++;
                                    i18 = iMax;
                                }
                                gVar2.d(i18);
                            }
                        } else {
                            i19 = i36;
                        }
                        i37++;
                        i35 = i39;
                        f13 = f15;
                        i12 = i40;
                        f14 = f16;
                        i36 = i19;
                    }
                    i15 = i35;
                    f11 = f13;
                    int i41 = i12;
                    if (i38 > 0) {
                        i12 = i41 - i38;
                        i14 = 0;
                        for (int i42 = 0; i42 < size; i42++) {
                            o oVar3 = (o) arrayList.get(i42);
                            if (oVar3.f840b.f464g0 != 8) {
                                if (i42 > 0 && i42 >= i25) {
                                    i14 += oVar3.f846h.f824f;
                                }
                                i14 += oVar3.f843e.f825g;
                                if (i42 < i26 && i42 < i10) {
                                    i14 += -oVar3.f847i.f824f;
                                }
                            }
                        }
                    } else {
                        i12 = i41;
                    }
                    i17 = 2;
                    if (this.f812l == 2 && i38 == 0) {
                        i16 = 0;
                        this.f812l = 0;
                    } else {
                        i16 = 0;
                    }
                } else {
                    i15 = i35;
                    f11 = 0.5f;
                    i16 = 0;
                    i17 = 2;
                }
                if (i14 > i24) {
                    this.f812l = i17;
                }
                if (i13 > 0 && i12 == 0 && i25 == i10) {
                    this.f812l = i17;
                }
                int i43 = this.f812l;
                if (i43 == 1) {
                    int i44 = i13 > 1 ? (i24 - i14) / (i13 - 1) : i13 == 1 ? (i24 - i14) / 2 : i16;
                    if (i12 > 0) {
                        i44 = i16;
                    }
                    int i45 = i15;
                    for (int i46 = i16; i46 < size; i46++) {
                        o oVar4 = (o) arrayList.get(z6 ? size - (i46 + 1) : i46);
                        int i47 = oVar4.f840b.f464g0;
                        f fVar3 = oVar4.f847i;
                        f fVar4 = oVar4.f846h;
                        if (i47 == 8) {
                            fVar4.d(i45);
                            fVar3.d(i45);
                        } else {
                            if (i46 > 0) {
                                i45 = z6 ? i45 - i44 : i45 + i44;
                            }
                            if (i46 > 0 && i46 >= i25) {
                                i45 = z6 ? i45 - fVar4.f824f : i45 + fVar4.f824f;
                            }
                            if (z6) {
                                fVar3.d(i45);
                            } else {
                                fVar4.d(i45);
                            }
                            g gVar3 = oVar4.f843e;
                            int i48 = gVar3.f825g;
                            if (oVar4.f842d == 3 && oVar4.a == 1) {
                                i48 = gVar3.f830m;
                            }
                            i45 = z6 ? i45 - i48 : i45 + i48;
                            if (z6) {
                                fVar4.d(i45);
                            } else {
                                fVar3.d(i45);
                            }
                            oVar4.f845g = true;
                            if (i46 < i26 && i46 < i10) {
                                i45 = z6 ? i45 - (-fVar3.f824f) : i45 + (-fVar3.f824f);
                            }
                        }
                    }
                    return;
                }
                if (i43 == 0) {
                    int i49 = (i24 - i14) / (i13 + 1);
                    if (i12 > 0) {
                        i49 = i16;
                    }
                    int i50 = i15;
                    for (int i51 = i16; i51 < size; i51++) {
                        o oVar5 = (o) arrayList.get(z6 ? size - (i51 + 1) : i51);
                        int i52 = oVar5.f840b.f464g0;
                        f fVar5 = oVar5.f847i;
                        f fVar6 = oVar5.f846h;
                        if (i52 == 8) {
                            fVar6.d(i50);
                            fVar5.d(i50);
                        } else {
                            int i53 = z6 ? i50 - i49 : i50 + i49;
                            if (i51 > 0 && i51 >= i25) {
                                i53 = z6 ? i53 - fVar6.f824f : i53 + fVar6.f824f;
                            }
                            if (z6) {
                                fVar5.d(i53);
                            } else {
                                fVar6.d(i53);
                            }
                            g gVar4 = oVar5.f843e;
                            int iMin = gVar4.f825g;
                            if (oVar5.f842d == 3 && oVar5.a == 1) {
                                iMin = Math.min(iMin, gVar4.f830m);
                            }
                            i50 = z6 ? i53 - iMin : i53 + iMin;
                            if (z6) {
                                fVar6.d(i50);
                            } else {
                                fVar5.d(i50);
                            }
                            if (i51 < i26 && i51 < i10) {
                                i50 = z6 ? i50 - (-fVar5.f824f) : i50 + (-fVar5.f824f);
                            }
                        }
                    }
                    return;
                }
                if (i43 == 2) {
                    float f17 = this.f844f == 0 ? this.f840b.f459d0 : this.f840b.f461e0;
                    if (z6) {
                        f17 = 1.0f - f17;
                    }
                    int i54 = (int) (((i24 - i14) * f17) + f11);
                    if (i54 < 0 || i12 > 0) {
                        i54 = i16;
                    }
                    int i55 = z6 ? i15 - i54 : i15 + i54;
                    for (int i56 = i16; i56 < size; i56++) {
                        o oVar6 = (o) arrayList.get(z6 ? size - (i56 + 1) : i56);
                        int i57 = oVar6.f840b.f464g0;
                        f fVar7 = oVar6.f847i;
                        f fVar8 = oVar6.f846h;
                        if (i57 == 8) {
                            fVar8.d(i55);
                            fVar7.d(i55);
                        } else {
                            if (i56 > 0 && i56 >= i25) {
                                i55 = z6 ? i55 - fVar8.f824f : i55 + fVar8.f824f;
                            }
                            if (z6) {
                                fVar7.d(i55);
                            } else {
                                fVar8.d(i55);
                            }
                            g gVar5 = oVar6.f843e;
                            int i58 = gVar5.f825g;
                            if (oVar6.f842d == 3 && oVar6.a == 1) {
                                i58 = gVar5.f830m;
                            }
                            i55 = z6 ? i55 - i58 : i55 + i58;
                            if (z6) {
                                fVar8.d(i55);
                            } else {
                                fVar7.d(i55);
                            }
                            if (i56 < i26 && i56 < i10) {
                                i55 = z6 ? i55 - (-fVar7.f824f) : i55 + (-fVar7.f824f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // C.o
    public final void d() {
        ArrayList arrayList = this.f811k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        B.d dVar = ((o) arrayList.get(0)).f840b;
        B.d dVar2 = ((o) arrayList.get(size - 1)).f840b;
        int i10 = this.f844f;
        f fVar = this.f847i;
        f fVar2 = this.f846h;
        if (i10 == 0) {
            B.c cVar = dVar.f437I;
            B.c cVar2 = dVar2.f439K;
            f fVarI = o.i(cVar, 0);
            int iE = cVar.e();
            B.d dVarM = m();
            if (dVarM != null) {
                iE = dVarM.f437I.e();
            }
            if (fVarI != null) {
                o.b(fVar2, fVarI, iE);
            }
            f fVarI2 = o.i(cVar2, 0);
            int iE2 = cVar2.e();
            B.d dVarN = n();
            if (dVarN != null) {
                iE2 = dVarN.f439K.e();
            }
            if (fVarI2 != null) {
                o.b(fVar, fVarI2, -iE2);
            }
        } else {
            B.c cVar3 = dVar.f438J;
            B.c cVar4 = dVar2.f440L;
            f fVarI3 = o.i(cVar3, 1);
            int iE3 = cVar3.e();
            B.d dVarM2 = m();
            if (dVarM2 != null) {
                iE3 = dVarM2.f438J.e();
            }
            if (fVarI3 != null) {
                o.b(fVar2, fVarI3, iE3);
            }
            f fVarI4 = o.i(cVar4, 1);
            int iE4 = cVar4.e();
            B.d dVarN2 = n();
            if (dVarN2 != null) {
                iE4 = dVarN2.f440L.e();
            }
            if (fVarI4 != null) {
                o.b(fVar, fVarI4, -iE4);
            }
        }
        fVar2.a = this;
        fVar.a = this;
    }

    @Override // C.o
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f811k;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i10)).e();
            i10++;
        }
    }

    @Override // C.o
    public final void f() {
        this.f841c = null;
        Iterator it = this.f811k.iterator();
        while (it.hasNext()) {
            ((o) it.next()).f();
        }
    }

    @Override // C.o
    public final long j() {
        ArrayList arrayList = this.f811k;
        int size = arrayList.size();
        long j = 0;
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList.get(i10);
            j = ((long) oVar.f847i.f824f) + oVar.j() + j + ((long) oVar.f846h.f824f);
        }
        return j;
    }

    @Override // C.o
    public final boolean k() {
        ArrayList arrayList = this.f811k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((o) arrayList.get(i10)).k()) {
                return false;
            }
        }
        return true;
    }

    public final B.d m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f811k;
            if (i10 >= arrayList.size()) {
                return null;
            }
            B.d dVar = ((o) arrayList.get(i10)).f840b;
            if (dVar.f464g0 != 8) {
                return dVar;
            }
            i10++;
        }
    }

    public final B.d n() {
        ArrayList arrayList = this.f811k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            B.d dVar = ((o) arrayList.get(size)).f840b;
            if (dVar.f464g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f844f == 0 ? "horizontal : " : "vertical : ");
        for (o oVar : this.f811k) {
            sb.append("<");
            sb.append(oVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
