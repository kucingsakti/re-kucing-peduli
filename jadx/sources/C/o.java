package C;

/* JADX INFO: loaded from: classes.dex */
public abstract class o implements d {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B.d f840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f843e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f844f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f845g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f846h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f847i = new f(this);
    public int j = 1;

    public o(B.d dVar) {
        this.f840b = dVar;
    }

    public static void b(f fVar, f fVar2, int i10) {
        fVar.f829l.add(fVar2);
        fVar.f824f = i10;
        fVar2.f828k.add(fVar);
    }

    public static f h(B.c cVar) {
        B.c cVar2 = cVar.f425f;
        if (cVar2 == null) {
            return null;
        }
        int iD = p239z.e.d(cVar2.f424e);
        B.d dVar = cVar2.f423d;
        if (iD == 1) {
            return dVar.f458d.f846h;
        }
        if (iD == 2) {
            return dVar.f460e.f846h;
        }
        if (iD == 3) {
            return dVar.f458d.f847i;
        }
        if (iD == 4) {
            return dVar.f460e.f847i;
        }
        if (iD != 5) {
            return null;
        }
        return dVar.f460e.f833k;
    }

    public static f i(B.c cVar, int i10) {
        B.c cVar2 = cVar.f425f;
        if (cVar2 == null) {
            return null;
        }
        B.d dVar = cVar2.f423d;
        o oVar = i10 == 0 ? dVar.f458d : dVar.f460e;
        int iD = p239z.e.d(cVar2.f424e);
        if (iD == 1 || iD == 2) {
            return oVar.f846h;
        }
        if (iD == 3 || iD == 4) {
            return oVar.f847i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f829l.add(fVar2);
        fVar.f829l.add(this.f843e);
        fVar.f826h = i10;
        fVar.f827i = gVar;
        fVar2.f828k.add(fVar);
        gVar.f828k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        if (i11 == 0) {
            B.d dVar = this.f840b;
            int i12 = dVar.f487v;
            int iMax = Math.max(dVar.f486u, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            B.d dVar2 = this.f840b;
            int i13 = dVar2.f490y;
            int iMax2 = Math.max(dVar2.f489x, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    public long j() {
        g gVar = this.f843e;
        if (gVar.j) {
            return gVar.f825g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void l(B.c cVar, B.c cVar2, int i10) {
        g gVar;
        float f10;
        int i11;
        f fVarH = h(cVar);
        f fVarH2 = h(cVar2);
        if (fVarH.j && fVarH2.j) {
            int iE = cVar.e() + fVarH.f825g;
            int iE2 = fVarH2.f825g - cVar2.e();
            int i12 = iE2 - iE;
            g gVar2 = this.f843e;
            if (!gVar2.j && this.f842d == 3) {
                int i13 = this.a;
                if (i13 == 0) {
                    gVar2.d(g(i12, i10));
                } else if (i13 == 1) {
                    gVar2.d(Math.min(g(gVar2.f830m, i10), i12));
                } else if (i13 == 2) {
                    B.d dVar = this.f840b;
                    B.d dVar2 = dVar.f447T;
                    if (dVar2 != null) {
                        g gVar3 = (i10 == 0 ? dVar2.f458d : dVar2.f460e).f843e;
                        if (gVar3.j) {
                            gVar2.d(g((int) ((gVar3.f825g * (i10 == 0 ? dVar.f488w : dVar.f491z)) + 0.5f), i10));
                        }
                    }
                } else if (i13 == 3) {
                    B.d dVar3 = this.f840b;
                    o oVar = dVar3.f458d;
                    if (oVar.f842d == 3 && oVar.a == 3) {
                        m mVar = dVar3.f460e;
                        if (mVar.f842d != 3 || mVar.a != 3) {
                            if (i10 == 0) {
                                oVar = dVar3.f460e;
                            }
                            gVar = oVar.f843e;
                            if (gVar.j) {
                                f10 = dVar3.f450W;
                                if (i10 == 1) {
                                    i11 = (int) ((gVar.f825g / f10) + 0.5f);
                                } else {
                                    i11 = (int) ((f10 * gVar.f825g) + 0.5f);
                                }
                                gVar2.d(i11);
                            }
                        }
                    } else {
                        if (i10 == 0) {
                            oVar = dVar3.f460e;
                        }
                        gVar = oVar.f843e;
                        if (gVar.j) {
                            f10 = dVar3.f450W;
                            if (i10 == 1) {
                                i11 = (int) ((gVar.f825g / f10) + 0.5f);
                            } else {
                                i11 = (int) ((f10 * gVar.f825g) + 0.5f);
                            }
                            gVar2.d(i11);
                        }
                    }
                }
            }
            if (gVar2.j) {
                int i14 = gVar2.f825g;
                f fVar = this.f847i;
                f fVar2 = this.f846h;
                if (i14 == i12) {
                    fVar2.d(iE);
                    fVar.d(iE2);
                    return;
                }
                float f11 = i10 == 0 ? this.f840b.f459d0 : this.f840b.f461e0;
                if (fVarH == fVarH2) {
                    iE = fVarH.f825g;
                    iE2 = fVarH2.f825g;
                    f11 = 0.5f;
                }
                fVar2.d((int) ((((iE2 - iE) - i14) * f11) + iE + 0.5f));
                fVar.d(fVar2.f825g + gVar2.f825g);
            }
        }
    }
}
