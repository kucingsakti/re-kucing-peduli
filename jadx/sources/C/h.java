package C;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final b a = new b();

    public static boolean a(B.d dVar) {
        int[] iArr = dVar.f481p0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        B.d dVar2 = dVar.f447T;
        B.e eVar = dVar2 != null ? (B.e) dVar2 : null;
        if (eVar != null) {
            int i12 = eVar.f481p0[0];
        }
        if (eVar != null) {
            int i13 = eVar.f481p0[1];
        }
        boolean z6 = i10 == 1 || dVar.A() || i10 == 2 || (i10 == 3 && dVar.f483r == 0 && dVar.f450W == 0.0f && dVar.t(0)) || (i10 == 3 && dVar.f483r == 1 && dVar.u(0, dVar.q()));
        boolean z10 = i11 == 1 || dVar.B() || i11 == 2 || (i11 == 3 && dVar.f484s == 0 && dVar.f450W == 0.0f && dVar.t(1)) || (i11 == 3 && dVar.f484s == 1 && dVar.u(1, dVar.k()));
        return (dVar.f450W > 0.0f && (z6 || z10)) || (z6 && z10);
    }

    public static n b(B.d dVar, int i10, ArrayList arrayList, n nVar) {
        int i11;
        int i12 = i10 == 0 ? dVar.f477n0 : dVar.f479o0;
        if (i12 != -1 && (nVar == null || i12 != nVar.f836b)) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                n nVar2 = (n) arrayList.get(i13);
                if (nVar2.f836b == i12) {
                    if (nVar != null) {
                        nVar.c(i10, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                    break;
                }
            }
        } else if (i12 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (dVar instanceof B.i) {
                B.i iVar = (B.i) dVar;
                int i14 = 0;
                while (true) {
                    if (i14 >= iVar.f571r0) {
                        i11 = -1;
                        break;
                    }
                    B.d dVar2 = iVar.f570q0[i14];
                    if ((i10 == 0 && (i11 = dVar2.f477n0) != -1) || (i10 == 1 && (i11 = dVar2.f479o0) != -1)) {
                        break;
                    }
                    i14++;
                }
                if (i11 != -1) {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        n nVar3 = (n) arrayList.get(i15);
                        if (nVar3.f836b == i11) {
                            nVar = nVar3;
                            break;
                        }
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.a = new ArrayList();
                nVar.f838d = null;
                nVar.f839e = -1;
                int i16 = n.f835f;
                n.f835f = i16 + 1;
                nVar.f836b = i16;
                nVar.f837c = i10;
            }
            arrayList.add(nVar);
        }
        ArrayList arrayList2 = nVar.a;
        if (arrayList2.contains(dVar)) {
            return nVar;
        }
        arrayList2.add(dVar);
        if (dVar instanceof B.h) {
            B.h hVar = (B.h) dVar;
            hVar.f567t0.c(hVar.f568u0 == 0 ? 1 : 0, nVar, arrayList);
        }
        int i17 = nVar.f836b;
        if (i10 == 0) {
            dVar.f477n0 = i17;
            dVar.f437I.c(i10, nVar, arrayList);
            dVar.f439K.c(i10, nVar, arrayList);
        } else {
            dVar.f479o0 = i17;
            dVar.f438J.c(i10, nVar, arrayList);
            dVar.f441M.c(i10, nVar, arrayList);
            dVar.f440L.c(i10, nVar, arrayList);
        }
        dVar.P.c(i10, nVar, arrayList);
        return nVar;
    }

    public static void c(int i10, B.d dVar, E.f fVar, boolean z6) {
        B.c cVar;
        B.c cVar2;
        char c10;
        B.c cVar3;
        B.c cVar4;
        if (dVar.f474m) {
            return;
        }
        if (!(dVar instanceof B.e) && dVar.z() && a(dVar)) {
            B.e.V(dVar, fVar, new b());
        }
        B.c cVarI = dVar.i(2);
        B.c cVarI2 = dVar.i(4);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet<B.c> hashSet = cVarI.a;
        if (hashSet != null && cVarI.f422c) {
            for (B.c cVar5 : hashSet) {
                B.d dVar2 = cVar5.f423d;
                int i11 = i10 + 1;
                boolean zA = a(dVar2);
                if (dVar2.z() && zA) {
                    c10 = 0;
                    B.e.V(dVar2, fVar, new b());
                } else {
                    c10 = 0;
                }
                B.c cVar6 = dVar2.f437I;
                B.c cVar7 = dVar2.f439K;
                char c11 = ((cVar5 == cVar6 && (cVar4 = cVar7.f425f) != null && cVar4.f422c) || (cVar5 == cVar7 && (cVar3 = cVar6.f425f) != null && cVar3.f422c)) ? (char) 1 : c10;
                int i12 = dVar2.f481p0[c10];
                if (i12 != 3 || zA) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f425f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.J(iE, dVar2.q() + iE);
                            c(i11, dVar2, fVar, z6);
                        } else if (cVar5 == cVar7 && cVar6.f425f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.J(iE2 - dVar2.q(), iE2);
                            c(i11, dVar2, fVar, z6);
                        } else if (c11 != 0 && !dVar2.x()) {
                            d(i11, dVar2, fVar, z6);
                        }
                    }
                } else if (i12 == 3 && dVar2.f487v >= 0 && dVar2.f486u >= 0 && (dVar2.f464g0 == 8 || (dVar2.f483r == 0 && dVar2.f450W == 0.0f))) {
                    if (!dVar2.x() && !dVar2.f434F && c11 != 0 && !dVar2.x()) {
                        e(i11, dVar, fVar, dVar2, z6);
                    }
                }
            }
        }
        if (dVar instanceof B.h) {
            return;
        }
        HashSet<B.c> hashSet2 = cVarI2.a;
        if (hashSet2 != null && cVarI2.f422c) {
            for (B.c cVar8 : hashSet2) {
                B.d dVar3 = cVar8.f423d;
                int i13 = i10 + 1;
                boolean zA2 = a(dVar3);
                if (dVar3.z() && zA2) {
                    B.e.V(dVar3, fVar, new b());
                }
                B.c cVar9 = dVar3.f437I;
                B.c cVar10 = dVar3.f439K;
                boolean z10 = (cVar8 == cVar9 && (cVar2 = cVar10.f425f) != null && cVar2.f422c) || (cVar8 == cVar10 && (cVar = cVar9.f425f) != null && cVar.f422c);
                int i14 = dVar3.f481p0[0];
                if (i14 != 3 || zA2) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f425f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.J(iE3, dVar3.q() + iE3);
                            c(i13, dVar3, fVar, z6);
                        } else if (cVar8 == cVar10 && cVar9.f425f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.J(iE4 - dVar3.q(), iE4);
                            c(i13, dVar3, fVar, z6);
                        } else if (z10 && !dVar3.x()) {
                            d(i13, dVar3, fVar, z6);
                        }
                    }
                } else if (i14 == 3 && dVar3.f487v >= 0 && dVar3.f486u >= 0) {
                    if (dVar3.f464g0 == 8 || (dVar3.f483r == 0 && dVar3.f450W == 0.0f)) {
                        if (!dVar3.x() && !dVar3.f434F && z10 && !dVar3.x()) {
                            e(i13, dVar, fVar, dVar3, z6);
                        }
                    }
                }
            }
        }
        dVar.f474m = true;
    }

    public static void d(int i10, B.d dVar, E.f fVar, boolean z6) {
        float f10 = dVar.f459d0;
        B.c cVar = dVar.f437I;
        int iD = cVar.f425f.d();
        B.c cVar2 = dVar.f439K;
        int iD2 = cVar2.f425f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = dVar.q();
        int i11 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i11 = (iD - iD2) - iQ;
        }
        int i12 = ((int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11)) + iD;
        int i13 = i12 + iQ;
        if (iD > iD2) {
            i13 = i12 - iQ;
        }
        dVar.J(i12, i13);
        c(i10 + 1, dVar, fVar, z6);
    }

    public static void e(int i10, B.d dVar, E.f fVar, B.d dVar2, boolean z6) {
        float f10 = dVar2.f459d0;
        B.c cVar = dVar2.f437I;
        int iE = cVar.e() + cVar.f425f.d();
        B.c cVar2 = dVar2.f439K;
        int iD = cVar2.f425f.d() - cVar2.e();
        if (iD >= iE) {
            int iQ = dVar2.q();
            if (dVar2.f464g0 != 8) {
                int i11 = dVar2.f483r;
                if (i11 == 2) {
                    iQ = (int) (dVar2.f459d0 * 0.5f * (dVar instanceof B.e ? dVar.q() : dVar.f447T.q()));
                } else if (i11 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(dVar2.f486u, iQ);
                int i12 = dVar2.f487v;
                if (i12 > 0) {
                    iQ = Math.min(i12, iQ);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iQ)) + 0.5f));
            dVar2.J(i13, iQ + i13);
            c(i10 + 1, dVar2, fVar, z6);
        }
    }

    public static void f(int i10, B.d dVar, E.f fVar) {
        float f10 = dVar.f461e0;
        B.c cVar = dVar.f438J;
        int iD = cVar.f425f.d();
        B.c cVar2 = dVar.f440L;
        int iD2 = cVar2.f425f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = dVar.k();
        int i11 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i11 = (iD - iD2) - iK;
        }
        int i12 = (int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11);
        int i13 = iD + i12;
        int i14 = i13 + iK;
        if (iD > iD2) {
            i13 = iD - i12;
            i14 = i13 - iK;
        }
        dVar.K(i13, i14);
        i(i10 + 1, dVar, fVar);
    }

    public static void g(int i10, B.d dVar, E.f fVar, B.d dVar2) {
        float f10 = dVar2.f461e0;
        B.c cVar = dVar2.f438J;
        int iE = cVar.e() + cVar.f425f.d();
        B.c cVar2 = dVar2.f440L;
        int iD = cVar2.f425f.d() - cVar2.e();
        if (iD >= iE) {
            int iK = dVar2.k();
            if (dVar2.f464g0 != 8) {
                int i11 = dVar2.f484s;
                if (i11 == 2) {
                    iK = (int) (f10 * 0.5f * (dVar instanceof B.e ? dVar.k() : dVar.f447T.k()));
                } else if (i11 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(dVar2.f489x, iK);
                int i12 = dVar2.f490y;
                if (i12 > 0) {
                    iK = Math.min(i12, iK);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iK)) + 0.5f));
            dVar2.K(i13, iK + i13);
            i(i10 + 1, dVar2, fVar);
        }
    }

    public static boolean h(int i10, int i11, int i12, int i13) {
        return (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2)) || (i13 == 1 || i13 == 2 || (i13 == 4 && i11 != 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(int i10, B.d dVar, E.f fVar) {
        B.c cVar;
        B.c cVar2;
        B.c cVar3;
        B.c cVar4;
        if (dVar.f476n) {
            return;
        }
        if (!(dVar instanceof B.e) && dVar.z() && a(dVar)) {
            B.e.V(dVar, fVar, new b());
        }
        B.c cVarI = dVar.i(3);
        B.c cVarI2 = dVar.i(5);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet<B.c> hashSet = cVarI.a;
        if (hashSet != null && cVarI.f422c) {
            for (B.c cVar5 : hashSet) {
                B.d dVar2 = cVar5.f423d;
                int i11 = i10 + 1;
                boolean zA = a(dVar2);
                if (dVar2.z() && zA) {
                    B.e.V(dVar2, fVar, new b());
                }
                B.c cVar6 = dVar2.f438J;
                B.c cVar7 = dVar2.f440L;
                boolean z6 = (cVar5 == cVar6 && (cVar4 = cVar7.f425f) != null && cVar4.f422c) || (cVar5 == cVar7 && (cVar3 = cVar6.f425f) != null && cVar3.f422c);
                int i12 = dVar2.f481p0[1];
                if (i12 != 3 || zA) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f425f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.K(iE, dVar2.k() + iE);
                            i(i11, dVar2, fVar);
                        } else if (cVar5 == cVar7 && cVar6.f425f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.K(iE2 - dVar2.k(), iE2);
                            i(i11, dVar2, fVar);
                        } else if (z6 && !dVar2.y()) {
                            f(i11, dVar2, fVar);
                        }
                    }
                } else if (i12 == 3 && dVar2.f490y >= 0 && dVar2.f489x >= 0 && (dVar2.f464g0 == 8 || (dVar2.f484s == 0 && dVar2.f450W == 0.0f))) {
                    if (!dVar2.y() && !dVar2.f434F && z6 && !dVar2.y()) {
                        g(i11, dVar, fVar, dVar2);
                    }
                }
            }
        }
        char c10 = 1;
        if (dVar instanceof B.h) {
            return;
        }
        HashSet<B.c> hashSet2 = cVarI2.a;
        if (hashSet2 != null && cVarI2.f422c) {
            for (B.c cVar8 : hashSet2) {
                B.d dVar3 = cVar8.f423d;
                int i13 = i10 + 1;
                boolean zA2 = a(dVar3);
                if (dVar3.z() && zA2) {
                    B.e.V(dVar3, fVar, new b());
                }
                B.c cVar9 = dVar3.f438J;
                B.c cVar10 = dVar3.f440L;
                boolean z10 = (cVar8 == cVar9 && (cVar2 = cVar10.f425f) != null && cVar2.f422c) || (cVar8 == cVar10 && (cVar = cVar9.f425f) != null && cVar.f422c);
                int i14 = dVar3.f481p0[1];
                if (i14 != 3 || zA2) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f425f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.K(iE3, dVar3.k() + iE3);
                            i(i13, dVar3, fVar);
                        } else if (cVar8 == cVar10 && cVar9.f425f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.K(iE4 - dVar3.k(), iE4);
                            i(i13, dVar3, fVar);
                        } else if (z10 && !dVar3.y()) {
                            f(i13, dVar3, fVar);
                        }
                    }
                } else if (i14 == 3 && dVar3.f490y >= 0 && dVar3.f489x >= 0 && (dVar3.f464g0 == 8 || (dVar3.f484s == 0 && dVar3.f450W == 0.0f))) {
                    if (!dVar3.y() && !dVar3.f434F && z10 && !dVar3.y()) {
                        g(i13, dVar, fVar, dVar3);
                    }
                }
            }
        }
        B.c cVarI3 = dVar.i(6);
        if (cVarI3.a != null && cVarI3.f422c) {
            int iD3 = cVarI3.d();
            for (B.c cVar11 : cVarI3.a) {
                B.d dVar4 = cVar11.f423d;
                int i15 = i10 + 1;
                boolean zA3 = a(dVar4);
                if (dVar4.z() && zA3) {
                    B.e.V(dVar4, fVar, new b());
                }
                if (dVar4.f481p0[c10] != 3 || zA3) {
                    if (dVar4.z()) {
                        continue;
                    } else {
                        B.c cVar12 = dVar4.f441M;
                        if (cVar11 == cVar12) {
                            int iE5 = cVar11.e() + iD3;
                            if (dVar4.f433E) {
                                int i16 = iE5 - dVar4.f454a0;
                                int i17 = dVar4.f449V + i16;
                                dVar4.f453Z = i16;
                                dVar4.f438J.l(i16);
                                dVar4.f440L.l(i17);
                                cVar12.l(iE5);
                                dVar4.f472l = c10;
                            }
                            i(i15, dVar4, fVar);
                        }
                    }
                }
                c10 = 1;
            }
        }
        dVar.f476n = true;
    }
}
