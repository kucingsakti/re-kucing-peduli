package E;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final ConstraintLayout a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f1163h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f1163h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean a(int i10, int i11, int i12) {
        if (i10 == i11) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0198  */
    /* JADX WARN: Code duplicated, block: B:111:0x019a  */
    /* JADX WARN: Code duplicated, block: B:113:0x019d  */
    /* JADX WARN: Code duplicated, block: B:114:0x019f  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:131:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01cb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:156:0x0200  */
    /* JADX WARN: Code duplicated, block: B:159:0x021a  */
    /* JADX WARN: Code duplicated, block: B:160:0x021f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0224  */
    /* JADX WARN: Code duplicated, block: B:166:0x022c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0233  */
    /* JADX WARN: Code duplicated, block: B:171:0x0239  */
    /* JADX WARN: Code duplicated, block: B:174:0x0246  */
    /* JADX WARN: Code duplicated, block: B:176:0x024a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x0254 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x0260 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:185:0x0266  */
    /* JADX WARN: Code duplicated, block: B:187:0x026a  */
    /* JADX WARN: Code duplicated, block: B:189:0x0270  */
    /* JADX WARN: Code duplicated, block: B:192:0x0290  */
    /* JADX WARN: Code duplicated, block: B:193:0x0292  */
    /* JADX WARN: Code duplicated, block: B:200:0x029e  */
    /* JADX WARN: Code duplicated, block: B:203:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x010b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0116  */
    /* JADX WARN: Code duplicated, block: B:85:0x0120  */
    public final void b(B.d dVar, C.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iD;
        int iMakeMeasureSpec3;
        B.e eVar;
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        e eVar2;
        int i10;
        int measuredWidth;
        int measuredHeight;
        int baseline;
        int i11;
        int measuredWidth2;
        int i12;
        int i13;
        int measuredHeight2;
        boolean z15;
        int i14;
        boolean z16;
        int i15;
        boolean z17;
        boolean z18;
        boolean z19;
        int i16;
        boolean z20;
        int i17;
        if (dVar == null) {
            return;
        }
        if (dVar.f464g0 == 8) {
            bVar.f806e = 0;
            bVar.f807f = 0;
            bVar.f808g = 0;
            return;
        }
        if (dVar.f447T == null) {
            return;
        }
        s sVar = ConstraintLayout.f6289H;
        ConstraintLayout constraintLayout = this.f1163h;
        int i18 = bVar.a;
        int i19 = bVar.f803b;
        int i20 = bVar.f804c;
        int i21 = bVar.f805d;
        int i22 = this.f1157b + this.f1158c;
        int i23 = this.f1159d;
        View view = dVar.f0;
        int iD2 = p239z.e.d(i18);
        B.c cVar = dVar.f439K;
        B.c cVar2 = dVar.f437I;
        if (iD2 == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
        } else {
            if (iD2 != 1) {
                if (iD2 == 2) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1161f, i23, -2);
                    boolean z21 = dVar.f483r == 1;
                    int i24 = bVar.j;
                    if (i24 == 1 || i24 == 2) {
                        boolean z22 = view.getMeasuredHeight() == dVar.k();
                        if (bVar.j == 2 || !z21 || ((z21 && z22) || dVar.A())) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                        }
                    }
                } else if (iD2 != 3) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    int i25 = this.f1161f;
                    int i26 = cVar2 != null ? cVar2.f426g : 0;
                    if (cVar != null) {
                        i26 += cVar.f426g;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i25, i23 + i26, -1);
                }
                iD = p239z.e.d(i19);
                if (iD != 0) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                } else if (iD != 1) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f1162g, i22, -2);
                } else if (iD != 2) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f1162g, i22, -2);
                    if (dVar.f484s == 1) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    i16 = bVar.j;
                    if (i16 != 1 || i16 == 2) {
                        if (view.getMeasuredWidth() == dVar.q()) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (bVar.j != 2 || !z19 || ((z19 && z20) || dVar.B())) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                        }
                    }
                } else if (iD != 3) {
                    iMakeMeasureSpec3 = 0;
                } else {
                    int i27 = this.f1162g;
                    if (cVar2 != null) {
                        i17 = dVar.f438J.f426g;
                    } else {
                        i17 = 0;
                    }
                    if (cVar != null) {
                        i17 += dVar.f440L.f426g;
                    }
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i27, i22 + i17, -1);
                }
                eVar = (B.e) dVar.f447T;
                if (eVar == null && B.j.c(constraintLayout.f6290A, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f454a0 && !dVar.z() && a(dVar.f435G, iMakeMeasureSpec2, dVar.q()) && a(dVar.f436H, iMakeMeasureSpec3, dVar.k())) {
                    bVar.f806e = dVar.q();
                    bVar.f807f = dVar.k();
                    bVar.f808g = dVar.f454a0;
                    return;
                }
                if (i18 == 3) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (i19 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i19 != 4 || i19 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i18 != 4 || i18 == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z6 || dVar.f450W <= 0.0f) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z10 || dVar.f450W <= 0.0f) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (view == null) {
                    return;
                }
                eVar2 = (e) view.getLayoutParams();
                i10 = bVar.j;
                if (i10 == 1 && i10 != 2 && z6 && dVar.f483r == 0 && z10 && dVar.f484s == 0) {
                    measuredHeight2 = 0;
                    i15 = -1;
                    z16 = false;
                    baseline = 0;
                    measuredWidth2 = 0;
                } else {
                    if ((view instanceof t) || !(dVar instanceof B.g)) {
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                    } else {
                        ((t) view).j((B.g) dVar, iMakeMeasureSpec2, iMakeMeasureSpec3);
                    }
                    dVar.f435G = iMakeMeasureSpec2;
                    dVar.f436H = iMakeMeasureSpec3;
                    dVar.f463g = false;
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i11 = dVar.f486u;
                    if (i11 > 0) {
                        measuredWidth2 = Math.max(i11, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i12 = dVar.f487v;
                    if (i12 > 0) {
                        measuredWidth2 = Math.min(i12, measuredWidth2);
                    }
                    i13 = dVar.f489x;
                    if (i13 > 0) {
                        measuredHeight2 = Math.max(i13, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    z15 = z14;
                    i14 = dVar.f490y;
                    if (i14 > 0) {
                        measuredHeight2 = Math.min(i14, measuredHeight2);
                    }
                    if (!B.j.c(constraintLayout.f6290A, 1)) {
                        if (!z13 && z11) {
                            measuredWidth2 = (int) ((measuredHeight2 * dVar.f450W) + 0.5f);
                        } else if (z15 && z12) {
                            measuredHeight2 = (int) ((measuredWidth2 / dVar.f450W) + 0.5f);
                        }
                    }
                    if (measuredWidth == measuredWidth2 || measuredHeight != measuredHeight2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                        dVar.f435G = iMakeMeasureSpec2;
                        dVar.f436H = iMakeMeasureSpec3;
                        z16 = false;
                        dVar.f463g = false;
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        i15 = -1;
                    } else {
                        i15 = -1;
                        z16 = false;
                    }
                }
                if (baseline != i15) {
                    z17 = true;
                } else {
                    z17 = z16;
                }
                if (measuredWidth2 == bVar.f804c || measuredHeight2 != bVar.f805d) {
                    z18 = true;
                } else {
                    z18 = z16;
                }
                bVar.f810i = z18;
                if (eVar2.c0) {
                    z17 = true;
                }
                if (z17 && baseline != -1 && dVar.f454a0 != baseline) {
                    bVar.f810i = true;
                }
                bVar.f806e = measuredWidth2;
                bVar.f807f = measuredHeight2;
                bVar.f809h = z17;
                bVar.f808g = baseline;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1161f, i23, -2);
        }
        iMakeMeasureSpec2 = iMakeMeasureSpec;
        iD = p239z.e.d(i19);
        if (iD != 0) {
            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
        } else if (iD != 1) {
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f1162g, i22, -2);
        } else if (iD != 2) {
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f1162g, i22, -2);
            if (dVar.f484s == 1) {
                z19 = true;
            } else {
                z19 = false;
            }
            i16 = bVar.j;
            if (i16 != 1) {
                if (view.getMeasuredWidth() == dVar.q()) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                if (bVar.j != 2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            } else {
                if (view.getMeasuredWidth() == dVar.q()) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                if (bVar.j != 2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (iD != 3) {
            iMakeMeasureSpec3 = 0;
        } else {
            int i28 = this.f1162g;
            if (cVar2 != null) {
                i17 = dVar.f438J.f426g;
            } else {
                i17 = 0;
            }
            if (cVar != null) {
                i17 += dVar.f440L.f426g;
            }
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i28, i22 + i17, -1);
        }
        eVar = (B.e) dVar.f447T;
        if (eVar == null) {
        }
        if (i18 == 3) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (i19 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i19 != 4) {
            z11 = true;
        } else {
            z11 = true;
        }
        if (i18 != 4) {
            z12 = true;
        } else {
            z12 = true;
        }
        if (z6) {
            z13 = false;
        } else {
            z13 = false;
        }
        if (z10) {
            z14 = false;
        } else {
            z14 = false;
        }
        if (view == null) {
            return;
        }
        eVar2 = (e) view.getLayoutParams();
        i10 = bVar.j;
        if (i10 == 1) {
            if (view instanceof t) {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            } else {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            }
            dVar.f435G = iMakeMeasureSpec2;
            dVar.f436H = iMakeMeasureSpec3;
            dVar.f463g = false;
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            baseline = view.getBaseline();
            i11 = dVar.f486u;
            if (i11 > 0) {
                measuredWidth2 = Math.max(i11, measuredWidth);
            } else {
                measuredWidth2 = measuredWidth;
            }
            i12 = dVar.f487v;
            if (i12 > 0) {
                measuredWidth2 = Math.min(i12, measuredWidth2);
            }
            i13 = dVar.f489x;
            if (i13 > 0) {
                measuredHeight2 = Math.max(i13, measuredHeight);
            } else {
                measuredHeight2 = measuredHeight;
            }
            z15 = z14;
            i14 = dVar.f490y;
            if (i14 > 0) {
                measuredHeight2 = Math.min(i14, measuredHeight2);
            }
            if (!B.j.c(constraintLayout.f6290A, 1)) {
                if (!z13) {
                    if (z15) {
                        measuredHeight2 = (int) ((measuredWidth2 / dVar.f450W) + 0.5f);
                    }
                } else if (z15) {
                    measuredHeight2 = (int) ((measuredWidth2 / dVar.f450W) + 0.5f);
                }
            }
            if (measuredWidth == measuredWidth2) {
                if (measuredWidth != measuredWidth2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                }
                if (measuredHeight != measuredHeight2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                dVar.f435G = iMakeMeasureSpec2;
                dVar.f436H = iMakeMeasureSpec3;
                z16 = false;
                dVar.f463g = false;
                measuredWidth2 = view.getMeasuredWidth();
                measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i15 = -1;
            } else {
                if (measuredWidth != measuredWidth2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                }
                if (measuredHeight != measuredHeight2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                dVar.f435G = iMakeMeasureSpec2;
                dVar.f436H = iMakeMeasureSpec3;
                z16 = false;
                dVar.f463g = false;
                measuredWidth2 = view.getMeasuredWidth();
                measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i15 = -1;
            }
        } else {
            if (view instanceof t) {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            } else {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            }
            dVar.f435G = iMakeMeasureSpec2;
            dVar.f436H = iMakeMeasureSpec3;
            dVar.f463g = false;
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            baseline = view.getBaseline();
            i11 = dVar.f486u;
            if (i11 > 0) {
                measuredWidth2 = Math.max(i11, measuredWidth);
            } else {
                measuredWidth2 = measuredWidth;
            }
            i12 = dVar.f487v;
            if (i12 > 0) {
                measuredWidth2 = Math.min(i12, measuredWidth2);
            }
            i13 = dVar.f489x;
            if (i13 > 0) {
                measuredHeight2 = Math.max(i13, measuredHeight);
            } else {
                measuredHeight2 = measuredHeight;
            }
            z15 = z14;
            i14 = dVar.f490y;
            if (i14 > 0) {
                measuredHeight2 = Math.min(i14, measuredHeight2);
            }
            if (!B.j.c(constraintLayout.f6290A, 1)) {
                if (!z13) {
                    if (z15) {
                        measuredHeight2 = (int) ((measuredWidth2 / dVar.f450W) + 0.5f);
                    }
                } else if (z15) {
                    measuredHeight2 = (int) ((measuredWidth2 / dVar.f450W) + 0.5f);
                }
            }
            if (measuredWidth == measuredWidth2) {
                if (measuredWidth != measuredWidth2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                }
                if (measuredHeight != measuredHeight2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                dVar.f435G = iMakeMeasureSpec2;
                dVar.f436H = iMakeMeasureSpec3;
                z16 = false;
                dVar.f463g = false;
                measuredWidth2 = view.getMeasuredWidth();
                measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i15 = -1;
            } else {
                if (measuredWidth != measuredWidth2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                }
                if (measuredHeight != measuredHeight2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                dVar.f435G = iMakeMeasureSpec2;
                dVar.f436H = iMakeMeasureSpec3;
                z16 = false;
                dVar.f463g = false;
                measuredWidth2 = view.getMeasuredWidth();
                measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i15 = -1;
            }
        }
        if (baseline != i15) {
            z17 = true;
        } else {
            z17 = z16;
        }
        if (measuredWidth2 == bVar.f804c) {
            z18 = true;
        } else {
            z18 = true;
        }
        bVar.f810i = z18;
        if (eVar2.c0) {
            z17 = true;
        }
        if (z17) {
            bVar.f810i = true;
        }
        bVar.f806e = measuredWidth2;
        bVar.f807f = measuredHeight2;
        bVar.f809h = z17;
        bVar.f808g = baseline;
    }
}
