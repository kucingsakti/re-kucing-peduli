package C;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public B.e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B.e f815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public E.f f817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f819h;

    public final void a(f fVar, int i10, ArrayList arrayList, l lVar) {
        o oVar = fVar.f822d;
        if (oVar.f841c == null) {
            B.e eVar = this.a;
            if (oVar == eVar.f458d || oVar == eVar.f460e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.a = null;
                lVar.f832b = new ArrayList();
                lVar.a = oVar;
                arrayList.add(lVar);
            }
            oVar.f841c = lVar;
            lVar.f832b.add(oVar);
            f fVar2 = oVar.f846h;
            for (d dVar : fVar2.f828k) {
                if (dVar instanceof f) {
                    a((f) dVar, i10, arrayList, lVar);
                }
            }
            f fVar3 = oVar.f847i;
            for (d dVar2 : fVar3.f828k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i10, arrayList, lVar);
                }
            }
            if (i10 == 1 && (oVar instanceof m)) {
                for (d dVar3 : ((m) oVar).f833k.f828k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i10, arrayList, lVar);
                    }
                }
            }
            Iterator it = fVar2.f829l.iterator();
            while (it.hasNext()) {
                a((f) it.next(), i10, arrayList, lVar);
            }
            Iterator it2 = fVar3.f829l.iterator();
            while (it2.hasNext()) {
                a((f) it2.next(), i10, arrayList, lVar);
            }
            if (i10 == 1 && (oVar instanceof m)) {
                Iterator it3 = ((m) oVar).f833k.f829l.iterator();
                while (it3.hasNext()) {
                    a((f) it3.next(), i10, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:151:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x018f  */
    /* JADX WARN: Code duplicated, block: B:94:0x019f  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b2  */
    public final void b(B.e eVar) {
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f11;
        for (B.d dVar : eVar.f504q0) {
            int[] iArr = dVar.f481p0;
            int i20 = iArr[0];
            int i21 = iArr[1];
            if (dVar.f464g0 == 8) {
                dVar.a = true;
            } else {
                float f12 = dVar.f488w;
                if (f12 < 1.0f && i20 == 3) {
                    dVar.f483r = 2;
                }
                float f13 = dVar.f491z;
                if (f13 < 1.0f && i21 == 3) {
                    dVar.f484s = 2;
                }
                if (dVar.f450W > 0.0f) {
                    if (i20 == 3 && (i21 == 2 || i21 == 1)) {
                        dVar.f483r = 3;
                    } else if (i21 == 3 && (i20 == 2 || i20 == 1)) {
                        dVar.f484s = 3;
                    } else if (i20 == 3 && i21 == 3) {
                        if (dVar.f483r == 0) {
                            dVar.f483r = 3;
                        }
                        if (dVar.f484s == 0) {
                            dVar.f484s = 3;
                        }
                    }
                }
                B.c cVar = dVar.f439K;
                B.c cVar2 = dVar.f437I;
                if (i20 == 3 && dVar.f483r == 1 && (cVar2.f425f == null || cVar.f425f == null)) {
                    i20 = 2;
                }
                B.c cVar3 = dVar.f440L;
                B.c cVar4 = dVar.f438J;
                if (i21 == 3 && dVar.f484s == 1 && (cVar4.f425f == null || cVar3.f425f == null)) {
                    i21 = 2;
                }
                k kVar = dVar.f458d;
                kVar.f842d = i20;
                int i22 = dVar.f483r;
                kVar.a = i22;
                m mVar = dVar.f460e;
                mVar.f842d = i21;
                int i23 = dVar.f484s;
                mVar.a = i23;
                if ((i20 == 4 || i20 == 1 || i20 == 2) && (i21 == 4 || i21 == 1 || i21 == 2)) {
                    int i24 = i21;
                    int iQ = dVar.q();
                    if (i20 == 4) {
                        iQ = (eVar.q() - cVar2.f426g) - cVar.f426g;
                        i20 = 1;
                    }
                    int i25 = iQ;
                    int iK = dVar.k();
                    if (i24 == 4) {
                        iK = (eVar.k() - cVar4.f426g) - cVar3.f426g;
                        i24 = 1;
                    }
                    f(i20, i25, i24, iK, dVar);
                    dVar.f458d.f843e.d(dVar.q());
                    dVar.f460e.f843e.d(dVar.k());
                    dVar.a = true;
                } else {
                    int[] iArr2 = eVar.f481p0;
                    B.c[] cVarArr = dVar.f444Q;
                    if (i20 != 3) {
                        i10 = i20;
                        i11 = 2;
                        f10 = f13;
                        i12 = i21;
                    } else if (i21 != 2 && i21 != 1) {
                        i12 = i21;
                        i13 = 3;
                        i10 = i20;
                        i11 = 2;
                        f10 = f13;
                        if (i12 != i13) {
                            int i26 = i10;
                            i14 = i11;
                            i15 = i26;
                        } else if (i10 == i11 && i10 != 1) {
                            int i27 = i10;
                            i14 = i11;
                            i15 = i27;
                            i17 = i13;
                            i16 = 1;
                            if (i15 != i17 && i12 == i17) {
                                if (i22 == i16 || i23 == i16) {
                                    f(i14, 0, i14, 0, dVar);
                                    dVar.f458d.f843e.f830m = dVar.q();
                                    dVar.f460e.f843e.f830m = dVar.k();
                                } else if (i23 == 2 && i22 == 2 && iArr2[0] == 1 && iArr2[i16] == 1) {
                                    f(1, (int) ((f12 * eVar.q()) + 0.5f), 1, (int) ((f10 * eVar.k()) + 0.5f), dVar);
                                    dVar.f458d.f843e.d(dVar.q());
                                    dVar.f460e.f843e.d(dVar.k());
                                    dVar.a = true;
                                }
                            }
                        } else if (i23 == i13) {
                            if (i10 == i11) {
                                f(i11, 0, i11, 0, dVar);
                            }
                            int iQ2 = dVar.q();
                            f11 = dVar.f450W;
                            if (dVar.f451X == -1) {
                                f11 = 1.0f / f11;
                            }
                            f(1, iQ2, 1, (int) ((iQ2 * f11) + 0.5f), dVar);
                            dVar.f458d.f843e.d(dVar.q());
                            dVar.f460e.f843e.d(dVar.k());
                            dVar.a = true;
                        } else if (i23 == 1) {
                            f(i10, 0, i11, 0, dVar);
                            dVar.f460e.f843e.f830m = dVar.k();
                        } else {
                            i18 = i10;
                            i14 = i11;
                            if (i23 == 2) {
                                i19 = iArr2[1];
                                if (i19 != 1 || i19 == 4) {
                                    f(i18, dVar.q(), 1, (int) ((f10 * eVar.k()) + 0.5f), dVar);
                                    dVar.f458d.f843e.d(dVar.q());
                                    dVar.f460e.f843e.d(dVar.k());
                                    dVar.a = true;
                                } else {
                                    i15 = i18;
                                }
                            } else {
                                i15 = i18;
                                if (cVarArr[2].f425f != null || cVarArr[3].f425f == null) {
                                    f(i14, 0, i12, 0, dVar);
                                    dVar.f458d.f843e.d(dVar.q());
                                    dVar.f460e.f843e.d(dVar.k());
                                    dVar.a = true;
                                }
                            }
                        }
                        i16 = 1;
                        i17 = 3;
                        if (i15 != i17) {
                        }
                    } else if (i22 == 3) {
                        if (i21 == 2) {
                            f(2, 0, 2, 0, dVar);
                        }
                        int iK2 = dVar.k();
                        f(1, (int) ((iK2 * dVar.f450W) + 0.5f), 1, iK2, dVar);
                        dVar.f458d.f843e.d(dVar.q());
                        dVar.f460e.f843e.d(dVar.k());
                        dVar.a = true;
                    } else {
                        i10 = i20;
                        i11 = 2;
                        if (i22 == 1) {
                            f(2, 0, i21, 0, dVar);
                            dVar.f458d.f843e.f830m = dVar.q();
                        } else {
                            f10 = f13;
                            i12 = i21;
                            if (i22 == 2) {
                                int i28 = iArr2[0];
                                if (i28 == 1 || i28 == 4) {
                                    f(1, (int) ((f12 * eVar.q()) + 0.5f), i12, dVar.k(), dVar);
                                    dVar.f458d.f843e.d(dVar.q());
                                    dVar.f460e.f843e.d(dVar.k());
                                    dVar.a = true;
                                }
                            } else if (cVarArr[0].f425f == null || cVarArr[1].f425f == null) {
                                f(2, 0, i12, 0, dVar);
                                dVar.f458d.f843e.d(dVar.q());
                                dVar.f460e.f843e.d(dVar.k());
                                dVar.a = true;
                            }
                        }
                    }
                    i13 = 3;
                    if (i12 != i13) {
                        if (i10 == i11) {
                        }
                        if (i23 == i13) {
                            if (i10 == i11) {
                                f(i11, 0, i11, 0, dVar);
                            }
                            int iQ3 = dVar.q();
                            f11 = dVar.f450W;
                            if (dVar.f451X == -1) {
                                f11 = 1.0f / f11;
                            }
                            f(1, iQ3, 1, (int) ((iQ3 * f11) + 0.5f), dVar);
                            dVar.f458d.f843e.d(dVar.q());
                            dVar.f460e.f843e.d(dVar.k());
                            dVar.a = true;
                        } else if (i23 == 1) {
                            f(i10, 0, i11, 0, dVar);
                            dVar.f460e.f843e.f830m = dVar.k();
                        } else {
                            i18 = i10;
                            i14 = i11;
                            if (i23 == 2) {
                                i19 = iArr2[1];
                                if (i19 != 1) {
                                }
                                f(i18, dVar.q(), 1, (int) ((f10 * eVar.k()) + 0.5f), dVar);
                                dVar.f458d.f843e.d(dVar.q());
                                dVar.f460e.f843e.d(dVar.k());
                                dVar.a = true;
                            } else {
                                i15 = i18;
                                if (cVarArr[2].f425f != null) {
                                }
                                f(i14, 0, i12, 0, dVar);
                                dVar.f458d.f843e.d(dVar.q());
                                dVar.f460e.f843e.d(dVar.k());
                                dVar.a = true;
                            }
                        }
                    } else {
                        int i29 = i10;
                        i14 = i11;
                        i15 = i29;
                    }
                    i16 = 1;
                    i17 = 3;
                    if (i15 != i17) {
                    }
                }
            }
        }
    }

    public final void c() {
        ArrayList<o> arrayList = this.f816e;
        arrayList.clear();
        B.e eVar = this.f815d;
        eVar.f458d.f();
        eVar.f460e.f();
        arrayList.add(eVar.f458d);
        arrayList.add(eVar.f460e);
        HashSet hashSet = null;
        for (B.d dVar : eVar.f504q0) {
            if (dVar instanceof B.h) {
                i iVar = new i(dVar);
                dVar.f458d.f();
                dVar.f460e.f();
                iVar.f844f = ((B.h) dVar).f568u0;
                arrayList.add(iVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f455b == null) {
                        dVar.f455b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f455b);
                } else {
                    arrayList.add(dVar.f458d);
                }
                if (dVar.y()) {
                    if (dVar.f457c == null) {
                        dVar.f457c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f457c);
                } else {
                    arrayList.add(dVar.f460e);
                }
                if (dVar instanceof B.i) {
                    arrayList.add(new j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).f();
        }
        for (o oVar : arrayList) {
            if (oVar.f840b != eVar) {
                oVar.d();
            }
        }
        ArrayList arrayList2 = this.f819h;
        arrayList2.clear();
        B.e eVar2 = this.a;
        e(eVar2.f458d, 0, arrayList2);
        e(eVar2.f460e, 1, arrayList2);
        this.f813b = false;
    }

    public final int d(B.e eVar, int i10) {
        ArrayList arrayList;
        int i11;
        int i12;
        long j;
        float f10;
        long j10;
        ArrayList arrayList2 = this.f819h;
        int size = arrayList2.size();
        int i13 = 0;
        long jMax = 0;
        while (i13 < size) {
            o oVar = ((l) arrayList2.get(i13)).a;
            if (!(oVar instanceof c) ? !(i10 != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((c) oVar).f844f != i10) {
                f fVar = (i10 == 0 ? eVar.f458d : eVar.f460e).f846h;
                f fVar2 = (i10 == 0 ? eVar.f458d : eVar.f460e).f847i;
                boolean zContains = oVar.f846h.f829l.contains(fVar);
                f fVar3 = oVar.f847i;
                boolean zContains2 = fVar3.f829l.contains(fVar2);
                long j11 = oVar.j();
                f fVar4 = oVar.f846h;
                if (zContains && zContains2) {
                    long jB = l.b(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i11 = size;
                    long jA = l.a(fVar3, 0L);
                    long j12 = jB - j11;
                    int i14 = fVar3.f824f;
                    arrayList = arrayList3;
                    i12 = i13;
                    if (j12 >= (-i14)) {
                        j12 += (long) i14;
                    }
                    long j13 = (-jA) - j11;
                    long j14 = fVar4.f824f;
                    long j15 = j13 - j14;
                    if (j15 >= j14) {
                        j15 -= j14;
                    }
                    B.d dVar = oVar.f840b;
                    if (i10 == 0) {
                        f10 = dVar.f459d0;
                    } else if (i10 == 1) {
                        f10 = dVar.f461e0;
                    } else {
                        dVar.getClass();
                        f10 = -1.0f;
                    }
                    if (f10 > 0.0f) {
                        j10 = (long) ((j12 / (1.0f - f10)) + (j15 / f10));
                    } else {
                        j10 = 0;
                    }
                    float f11 = j10;
                    j = (((long) fVar4.f824f) + ((((long) ((f11 * f10) + 0.5f)) + j11) + ((long) (((1.0f - f10) * f11) + 0.5f)))) - ((long) fVar3.f824f);
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    i12 = i13;
                    if (zContains) {
                        j = Math.max(l.b(fVar4, fVar4.f824f), ((long) fVar4.f824f) + j11);
                    } else if (zContains2) {
                        j = Math.max(-l.a(fVar3, fVar3.f824f), ((long) (-fVar3.f824f)) + j11);
                    } else {
                        j = (oVar.j() + ((long) fVar4.f824f)) - ((long) fVar3.f824f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i11 = size;
                i12 = i13;
                j = 0;
            }
            jMax = Math.max(jMax, j);
            i13 = i12 + 1;
            size = i11;
            arrayList2 = arrayList;
        }
        return (int) jMax;
    }

    public final void e(o oVar, int i10, ArrayList arrayList) {
        f fVar;
        Iterator it = oVar.f846h.f828k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fVar = oVar.f847i;
            if (!zHasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i10, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).f846h, i10, arrayList, null);
            }
        }
        for (d dVar2 : fVar.f828k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).f847i, i10, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((m) oVar).f833k.f828k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, arrayList, null);
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13, B.d dVar) {
        b bVar = this.f818g;
        bVar.a = i10;
        bVar.f803b = i12;
        bVar.f804c = i11;
        bVar.f805d = i13;
        this.f817f.b(dVar, bVar);
        dVar.O(bVar.f806e);
        dVar.L(bVar.f807f);
        dVar.f433E = bVar.f809h;
        dVar.I(bVar.f808g);
    }

    public final void g() {
        a aVar;
        for (B.d dVar : this.a.f504q0) {
            if (!dVar.a) {
                int[] iArr = dVar.f481p0;
                boolean z6 = false;
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = dVar.f483r;
                int i13 = dVar.f484s;
                boolean z10 = i10 == 2 || (i10 == 3 && i12 == 1);
                if (i11 == 2 || (i11 == 3 && i13 == 1)) {
                    z6 = true;
                }
                g gVar = dVar.f458d.f843e;
                boolean z11 = gVar.j;
                g gVar2 = dVar.f460e.f843e;
                boolean z12 = gVar2.j;
                boolean z13 = z10;
                if (z11 && z12) {
                    f(1, gVar.f825g, 1, gVar2.f825g, dVar);
                    dVar.a = true;
                } else if (z11 && z6) {
                    f(1, gVar.f825g, 2, gVar2.f825g, dVar);
                    if (i11 == 3) {
                        dVar.f460e.f843e.f830m = dVar.k();
                    } else {
                        dVar.f460e.f843e.d(dVar.k());
                        dVar.a = true;
                    }
                } else if (z12 && z13) {
                    f(2, gVar.f825g, 1, gVar2.f825g, dVar);
                    if (i10 == 3) {
                        dVar.f458d.f843e.f830m = dVar.q();
                    } else {
                        dVar.f458d.f843e.d(dVar.q());
                        dVar.a = true;
                    }
                }
                if (dVar.a && (aVar = dVar.f460e.f834l) != null) {
                    aVar.d(dVar.f454a0);
                }
            }
        }
    }
}
