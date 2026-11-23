package C;

/* JADX INFO: loaded from: classes.dex */
public final class m extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f833k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f834l;

    @Override // C.d
    public final void a(d dVar) {
        float f10;
        float f11;
        float f12;
        int i10;
        if (p239z.e.d(this.j) == 3) {
            B.d dVar2 = this.f840b;
            l(dVar2.f438J, dVar2.f440L, 1);
            return;
        }
        g gVar = this.f843e;
        if (gVar.f821c && !gVar.j && this.f842d == 3) {
            B.d dVar3 = this.f840b;
            int i11 = dVar3.f484s;
            if (i11 == 2) {
                B.d dVar4 = dVar3.f447T;
                if (dVar4 != null) {
                    g gVar2 = dVar4.f460e.f843e;
                    if (gVar2.j) {
                        gVar.d((int) ((gVar2.f825g * dVar3.f491z) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                g gVar3 = dVar3.f458d.f843e;
                if (gVar3.j) {
                    int i12 = dVar3.f451X;
                    if (i12 != -1) {
                        if (i12 == 0) {
                            f12 = gVar3.f825g * dVar3.f450W;
                            i10 = (int) (f12 + 0.5f);
                        } else if (i12 != 1) {
                            i10 = 0;
                        } else {
                            f10 = gVar3.f825g;
                            f11 = dVar3.f450W;
                        }
                        gVar.d(i10);
                    } else {
                        f10 = gVar3.f825g;
                        f11 = dVar3.f450W;
                    }
                    f12 = f10 / f11;
                    i10 = (int) (f12 + 0.5f);
                    gVar.d(i10);
                }
            }
        }
        f fVar = this.f846h;
        if (fVar.f821c) {
            f fVar2 = this.f847i;
            if (fVar2.f821c) {
                if (fVar.j && fVar2.j && gVar.j) {
                    return;
                }
                if (!gVar.j && this.f842d == 3) {
                    B.d dVar5 = this.f840b;
                    if (dVar5.f483r == 0 && !dVar5.y()) {
                        f fVar3 = (f) fVar.f829l.get(0);
                        f fVar4 = (f) fVar2.f829l.get(0);
                        int i13 = fVar3.f825g + fVar.f824f;
                        int i14 = fVar4.f825g + fVar2.f824f;
                        fVar.d(i13);
                        fVar2.d(i14);
                        gVar.d(i14 - i13);
                        return;
                    }
                }
                if (!gVar.j && this.f842d == 3 && this.a == 1 && fVar.f829l.size() > 0 && fVar2.f829l.size() > 0) {
                    f fVar5 = (f) fVar.f829l.get(0);
                    int i15 = (((f) fVar2.f829l.get(0)).f825g + fVar2.f824f) - (fVar5.f825g + fVar.f824f);
                    int i16 = gVar.f830m;
                    if (i15 < i16) {
                        gVar.d(i15);
                    } else {
                        gVar.d(i16);
                    }
                }
                if (gVar.j && fVar.f829l.size() > 0 && fVar2.f829l.size() > 0) {
                    f fVar6 = (f) fVar.f829l.get(0);
                    f fVar7 = (f) fVar2.f829l.get(0);
                    int i17 = fVar6.f825g;
                    int i18 = fVar.f824f + i17;
                    int i19 = fVar7.f825g;
                    int i20 = fVar2.f824f + i19;
                    float f13 = this.f840b.f461e0;
                    if (fVar6 == fVar7) {
                        f13 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    fVar.d((int) ((((i19 - i17) - gVar.f825g) * f13) + i17 + 0.5f));
                    fVar2.d(fVar.f825g + gVar.f825g);
                }
            }
        }
    }

    @Override // C.o
    public final void d() {
        B.d dVar;
        B.d dVar2;
        B.d dVar3;
        B.d dVar4;
        B.d dVar5 = this.f840b;
        boolean z6 = dVar5.a;
        g gVar = this.f843e;
        if (z6) {
            gVar.d(dVar5.k());
        }
        boolean z10 = gVar.j;
        f fVar = this.f847i;
        f fVar2 = this.f846h;
        if (!z10) {
            B.d dVar6 = this.f840b;
            this.f842d = dVar6.f481p0[1];
            if (dVar6.f433E) {
                this.f834l = new a(this);
            }
            int i10 = this.f842d;
            if (i10 != 3) {
                if (i10 == 4 && (dVar4 = this.f840b.f447T) != null && dVar4.f481p0[1] == 1) {
                    int iK = (dVar4.k() - this.f840b.f438J.e()) - this.f840b.f440L.e();
                    o.b(fVar2, dVar4.f460e.f846h, this.f840b.f438J.e());
                    o.b(fVar, dVar4.f460e.f847i, -this.f840b.f440L.e());
                    gVar.d(iK);
                    return;
                }
                if (i10 == 1) {
                    gVar.d(this.f840b.k());
                }
            }
        } else if (this.f842d == 4 && (dVar2 = (dVar = this.f840b).f447T) != null && dVar2.f481p0[1] == 1) {
            o.b(fVar2, dVar2.f460e.f846h, dVar.f438J.e());
            o.b(fVar, dVar2.f460e.f847i, -this.f840b.f440L.e());
            return;
        }
        boolean z11 = gVar.j;
        f fVar3 = this.f833k;
        if (z11) {
            B.d dVar7 = this.f840b;
            if (dVar7.a) {
                B.c[] cVarArr = dVar7.f444Q;
                B.c cVar = cVarArr[2];
                B.c cVar2 = cVar.f425f;
                if (cVar2 != null && cVarArr[3].f425f != null) {
                    if (dVar7.y()) {
                        fVar2.f824f = this.f840b.f444Q[2].e();
                        fVar.f824f = -this.f840b.f444Q[3].e();
                    } else {
                        f fVarH = o.h(this.f840b.f444Q[2]);
                        if (fVarH != null) {
                            o.b(fVar2, fVarH, this.f840b.f444Q[2].e());
                        }
                        f fVarH2 = o.h(this.f840b.f444Q[3]);
                        if (fVarH2 != null) {
                            o.b(fVar, fVarH2, -this.f840b.f444Q[3].e());
                        }
                        fVar2.f820b = true;
                        fVar.f820b = true;
                    }
                    B.d dVar8 = this.f840b;
                    if (dVar8.f433E) {
                        o.b(fVar3, fVar2, dVar8.f454a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = o.h(cVar);
                    if (fVarH3 != null) {
                        o.b(fVar2, fVarH3, this.f840b.f444Q[2].e());
                        o.b(fVar, fVar2, gVar.f825g);
                        B.d dVar9 = this.f840b;
                        if (dVar9.f433E) {
                            o.b(fVar3, fVar2, dVar9.f454a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                B.c cVar3 = cVarArr[3];
                if (cVar3.f425f != null) {
                    f fVarH4 = o.h(cVar3);
                    if (fVarH4 != null) {
                        o.b(fVar, fVarH4, -this.f840b.f444Q[3].e());
                        o.b(fVar2, fVar, -gVar.f825g);
                    }
                    B.d dVar10 = this.f840b;
                    if (dVar10.f433E) {
                        o.b(fVar3, fVar2, dVar10.f454a0);
                        return;
                    }
                    return;
                }
                B.c cVar4 = cVarArr[4];
                if (cVar4.f425f != null) {
                    f fVarH5 = o.h(cVar4);
                    if (fVarH5 != null) {
                        o.b(fVar3, fVarH5, 0);
                        o.b(fVar2, fVar3, -this.f840b.f454a0);
                        o.b(fVar, fVar2, gVar.f825g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof B.i) || dVar7.f447T == null || dVar7.i(7).f425f != null) {
                    return;
                }
                B.d dVar11 = this.f840b;
                o.b(fVar2, dVar11.f447T.f460e.f846h, dVar11.s());
                o.b(fVar, fVar2, gVar.f825g);
                B.d dVar12 = this.f840b;
                if (dVar12.f433E) {
                    o.b(fVar3, fVar2, dVar12.f454a0);
                    return;
                }
                return;
            }
        }
        if (z11 || this.f842d != 3) {
            gVar.b(this);
        } else {
            B.d dVar13 = this.f840b;
            int i11 = dVar13.f484s;
            if (i11 == 2) {
                B.d dVar14 = dVar13.f447T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f460e.f843e;
                    gVar.f829l.add(gVar2);
                    gVar2.f828k.add(gVar);
                    gVar.f820b = true;
                    gVar.f828k.add(fVar2);
                    gVar.f828k.add(fVar);
                }
            } else if (i11 == 3 && !dVar13.y()) {
                B.d dVar15 = this.f840b;
                if (dVar15.f483r != 3) {
                    g gVar3 = dVar15.f458d.f843e;
                    gVar.f829l.add(gVar3);
                    gVar3.f828k.add(gVar);
                    gVar.f820b = true;
                    gVar.f828k.add(fVar2);
                    gVar.f828k.add(fVar);
                }
            }
        }
        B.d dVar16 = this.f840b;
        B.c[] cVarArr2 = dVar16.f444Q;
        B.c cVar5 = cVarArr2[2];
        B.c cVar6 = cVar5.f425f;
        if (cVar6 != null && cVarArr2[3].f425f != null) {
            if (dVar16.y()) {
                fVar2.f824f = this.f840b.f444Q[2].e();
                fVar.f824f = -this.f840b.f444Q[3].e();
            } else {
                f fVarH6 = o.h(this.f840b.f444Q[2]);
                f fVarH7 = o.h(this.f840b.f444Q[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.j = 4;
            }
            if (this.f840b.f433E) {
                c(fVar3, fVar2, 1, this.f834l);
            }
        } else if (cVar6 != null) {
            f fVarH8 = o.h(cVar5);
            if (fVarH8 != null) {
                o.b(fVar2, fVarH8, this.f840b.f444Q[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f840b.f433E) {
                    c(fVar3, fVar2, 1, this.f834l);
                }
                if (this.f842d == 3) {
                    B.d dVar17 = this.f840b;
                    if (dVar17.f450W > 0.0f) {
                        k kVar = dVar17.f458d;
                        if (kVar.f842d == 3) {
                            kVar.f843e.f828k.add(gVar);
                            gVar.f829l.add(this.f840b.f458d.f843e);
                            gVar.a = this;
                        }
                    }
                }
            }
        } else {
            B.c cVar7 = cVarArr2[3];
            if (cVar7.f425f != null) {
                f fVarH9 = o.h(cVar7);
                if (fVarH9 != null) {
                    o.b(fVar, fVarH9, -this.f840b.f444Q[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f840b.f433E) {
                        c(fVar3, fVar2, 1, this.f834l);
                    }
                }
            } else {
                B.c cVar8 = cVarArr2[4];
                if (cVar8.f425f != null) {
                    f fVarH10 = o.h(cVar8);
                    if (fVarH10 != null) {
                        o.b(fVar3, fVarH10, 0);
                        c(fVar2, fVar3, -1, this.f834l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof B.i) && (dVar3 = dVar16.f447T) != null) {
                    o.b(fVar2, dVar3.f460e.f846h, dVar16.s());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f840b.f433E) {
                        c(fVar3, fVar2, 1, this.f834l);
                    }
                    if (this.f842d == 3) {
                        B.d dVar18 = this.f840b;
                        if (dVar18.f450W > 0.0f) {
                            k kVar2 = dVar18.f458d;
                            if (kVar2.f842d == 3) {
                                kVar2.f843e.f828k.add(gVar);
                                gVar.f829l.add(this.f840b.f458d.f843e);
                                gVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f829l.size() == 0) {
            gVar.f821c = true;
        }
    }

    @Override // C.o
    public final void e() {
        f fVar = this.f846h;
        if (fVar.j) {
            this.f840b.f453Z = fVar.f825g;
        }
    }

    @Override // C.o
    public final void f() {
        this.f841c = null;
        this.f846h.c();
        this.f847i.c();
        this.f833k.c();
        this.f843e.c();
        this.f845g = false;
    }

    @Override // C.o
    public final boolean k() {
        return this.f842d != 3 || this.f840b.f484s == 0;
    }

    public final void m() {
        this.f845g = false;
        f fVar = this.f846h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.f847i;
        fVar2.c();
        fVar2.j = false;
        f fVar3 = this.f833k;
        fVar3.c();
        fVar3.j = false;
        this.f843e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f840b.f466h0;
    }
}
