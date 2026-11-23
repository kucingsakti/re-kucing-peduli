package p239z;

import com.google.android.gms.internal.measurement.S;
import java.util.ArrayList;
import java.util.Arrays;
import wa.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f16263q = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f16266d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f16274m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f16277p;
    public int a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16264b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16265c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16267e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16268f = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16270h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean[] f16271i = new boolean[32];
    public int j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16272k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16273l = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f[] f16275n = new f[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16276o = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b[] f16269g = new b[32];

    public c() {
        s();
        a aVar = new a(2);
        aVar.f15698t = new T.c();
        aVar.f15699u = new T.c();
        aVar.f15700v = new f[32];
        this.f16274m = aVar;
        d dVar = new d(aVar);
        dVar.f16278f = new f[128];
        dVar.f16279g = new f[128];
        dVar.f16280h = 0;
        dVar.f16281i = new S(dVar);
        this.f16266d = dVar;
        this.f16277p = new b(aVar);
    }

    public static int n(Object obj) {
        f fVar = ((B.c) obj).f428i;
        if (fVar != null) {
            return (int) (fVar.f16290w + 0.5f);
        }
        return 0;
    }

    public final f a(int i10) {
        T.c cVar = (T.c) this.f16274m.f15699u;
        int i11 = cVar.f4585b;
        Object obj = null;
        if (i11 > 0) {
            int i12 = i11 - 1;
            Object[] objArr = cVar.a;
            Object obj2 = objArr[i12];
            objArr[i12] = null;
            cVar.f4585b = i12;
            obj = obj2;
        }
        f fVar = (f) obj;
        if (fVar == null) {
            fVar = new f(i10);
            fVar.f16285D = i10;
        } else {
            fVar.h();
            fVar.f16285D = i10;
        }
        int i13 = this.f16276o;
        int i14 = this.a;
        if (i13 >= i14) {
            int i15 = i14 * 2;
            this.a = i15;
            this.f16275n = (f[]) Arrays.copyOf(this.f16275n, i15);
        }
        f[] fVarArr = this.f16275n;
        int i16 = this.f16276o;
        this.f16276o = i16 + 1;
        fVarArr[i16] = fVar;
        return fVar;
    }

    public final void b(f fVar, f fVar2, int i10, float f10, f fVar3, f fVar4, int i11, int i12) {
        b bVarL = l();
        if (fVar2 == fVar3) {
            bVarL.f16261d.g(fVar, 1.0f);
            bVarL.f16261d.g(fVar4, 1.0f);
            bVarL.f16261d.g(fVar2, -2.0f);
        } else if (f10 == 0.5f) {
            bVarL.f16261d.g(fVar, 1.0f);
            bVarL.f16261d.g(fVar2, -1.0f);
            bVarL.f16261d.g(fVar3, -1.0f);
            bVarL.f16261d.g(fVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                bVarL.f16259b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            bVarL.f16261d.g(fVar, -1.0f);
            bVarL.f16261d.g(fVar2, 1.0f);
            bVarL.f16259b = i10;
        } else if (f10 >= 1.0f) {
            bVarL.f16261d.g(fVar4, -1.0f);
            bVarL.f16261d.g(fVar3, 1.0f);
            bVarL.f16259b = -i11;
        } else {
            float f11 = 1.0f - f10;
            bVarL.f16261d.g(fVar, f11 * 1.0f);
            bVarL.f16261d.g(fVar2, f11 * (-1.0f));
            bVarL.f16261d.g(fVar3, (-1.0f) * f10);
            bVarL.f16261d.g(fVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                bVarL.f16259b = (i11 * f10) + ((-i10) * f11);
            }
        }
        if (i12 != 8) {
            bVarL.a(this, i12);
        }
        c(bVarL);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f8  */
    public final void c(b bVar) {
        boolean z6;
        boolean z10;
        f fVarF;
        ArrayList arrayList;
        if (this.f16272k + 1 >= this.f16273l || this.j + 1 >= this.f16268f) {
            o();
        }
        if (bVar.f16262e) {
            z6 = false;
        } else {
            if (this.f16269g.length != 0) {
                boolean z11 = false;
                while (!z11) {
                    int iD = bVar.f16261d.d();
                    int i10 = 0;
                    while (true) {
                        arrayList = bVar.f16260c;
                        if (i10 >= iD) {
                            break;
                        }
                        f fVarE = bVar.f16261d.e(i10);
                        if (fVarE.f16288u != -1 || fVarE.f16291x) {
                            arrayList.add(fVarE);
                        }
                        i10++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i11 = 0; i11 < size; i11++) {
                            f fVar = (f) arrayList.get(i11);
                            if (fVar.f16291x) {
                                bVar.h(this, fVar, true);
                            } else {
                                bVar.i(this, this.f16269g[fVar.f16288u], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z11 = true;
                    }
                }
                if (bVar.a != null && bVar.f16261d.d() == 0) {
                    bVar.f16262e = true;
                    this.f16264b = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f10 = bVar.f16259b;
            float f11 = 0.0f;
            if (f10 < 0.0f) {
                bVar.f16259b = f10 * (-1.0f);
                a aVar = bVar.f16261d;
                int i12 = aVar.f16257h;
                for (int i13 = 0; i12 != -1 && i13 < aVar.a; i13++) {
                    float[] fArr = aVar.f16256g;
                    fArr[i12] = fArr[i12] * (-1.0f);
                    i12 = aVar.f16255f[i12];
                }
            }
            int iD2 = bVar.f16261d.d();
            float f12 = 0.0f;
            float f13 = 0.0f;
            f fVar2 = null;
            f fVar3 = null;
            int i14 = 0;
            boolean z12 = false;
            boolean z13 = false;
            while (i14 < iD2) {
                float f14 = bVar.f16261d.f(i14);
                f fVarE2 = bVar.f16261d.e(i14);
                float f15 = f11;
                if (fVarE2.f16285D == 1) {
                    if (fVar2 == null) {
                        if (fVarE2.f16284C <= 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        fVar2 = fVarE2;
                        f12 = f14;
                    } else {
                        if (f12 > f14) {
                            if (fVarE2.f16284C > 1) {
                                z12 = false;
                            }
                            fVar2 = fVarE2;
                            f12 = f14;
                        } else if (z12 || fVarE2.f16284C > 1) {
                        }
                        z12 = true;
                        fVar2 = fVarE2;
                        f12 = f14;
                    }
                } else if (fVar2 == null && f14 < f15) {
                    if (fVar3 == null) {
                        if (fVarE2.f16284C <= 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        fVar3 = fVarE2;
                        f13 = f14;
                    } else {
                        if (f13 > f14) {
                            if (fVarE2.f16284C > 1) {
                                z13 = false;
                            }
                            fVar3 = fVarE2;
                            f13 = f14;
                        } else if (z13 || fVarE2.f16284C > 1) {
                        }
                        z13 = true;
                        fVar3 = fVarE2;
                        f13 = f14;
                    }
                }
                i14++;
                f11 = f15;
            }
            float f16 = f11;
            if (fVar2 == null) {
                fVar2 = fVar3;
            }
            if (fVar2 == null) {
                z10 = true;
            } else {
                bVar.g(fVar2);
                z10 = false;
            }
            if (bVar.f16261d.d() == 0) {
                bVar.f16262e = true;
            }
            if (z10) {
                if (this.j + 1 >= this.f16268f) {
                    o();
                }
                f fVarA = a(3);
                int i15 = this.f16265c + 1;
                this.f16265c = i15;
                this.j++;
                fVarA.f16287t = i15;
                a aVar2 = this.f16274m;
                ((f[]) aVar2.f15700v)[i15] = fVarA;
                bVar.a = fVarA;
                int i16 = this.f16272k;
                h(bVar);
                if (this.f16272k == i16 + 1) {
                    b bVar2 = this.f16277p;
                    bVar2.getClass();
                    bVar2.a = null;
                    bVar2.f16261d.b();
                    for (int i17 = 0; i17 < bVar.f16261d.d(); i17++) {
                        bVar2.f16261d.a(bVar.f16261d.e(i17), bVar.f16261d.f(i17), true);
                    }
                    r(this.f16277p);
                    if (fVarA.f16288u == -1) {
                        if (bVar.a == fVarA && (fVarF = bVar.f(null, fVarA)) != null) {
                            bVar.g(fVarF);
                        }
                        if (!bVar.f16262e) {
                            bVar.a.j(this, bVar);
                        }
                        ((T.c) aVar2.f15698t).b(bVar);
                        this.f16272k--;
                    }
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            f fVar4 = bVar.a;
            if (fVar4 == null) {
                return;
            }
            if (fVar4.f16285D != 1 && bVar.f16259b < f16) {
                return;
            }
        }
        if (z6) {
            return;
        }
        h(bVar);
    }

    public final void d(f fVar, int i10) {
        int i11 = fVar.f16288u;
        if (i11 == -1) {
            fVar.i(this, i10);
            for (int i12 = 0; i12 < this.f16265c + 1; i12++) {
                f fVar2 = ((f[]) this.f16274m.f15700v)[i12];
            }
            return;
        }
        if (i11 == -1) {
            b bVarL = l();
            bVarL.a = fVar;
            float f10 = i10;
            fVar.f16290w = f10;
            bVarL.f16259b = f10;
            bVarL.f16262e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f16269g[i11];
        if (bVar.f16262e) {
            bVar.f16259b = i10;
            return;
        }
        if (bVar.f16261d.d() == 0) {
            bVar.f16262e = true;
            bVar.f16259b = i10;
            return;
        }
        b bVarL2 = l();
        if (i10 < 0) {
            bVarL2.f16259b = i10 * (-1);
            bVarL2.f16261d.g(fVar, 1.0f);
        } else {
            bVarL2.f16259b = i10;
            bVarL2.f16261d.g(fVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(f fVar, f fVar2, int i10, int i11) {
        if (i11 == 8 && fVar2.f16291x && fVar.f16288u == -1) {
            fVar.i(this, fVar2.f16290w + i10);
            return;
        }
        b bVarL = l();
        boolean z6 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z6 = true;
            }
            bVarL.f16259b = i10;
        }
        if (z6) {
            bVarL.f16261d.g(fVar, 1.0f);
            bVarL.f16261d.g(fVar2, -1.0f);
        } else {
            bVarL.f16261d.g(fVar, -1.0f);
            bVarL.f16261d.g(fVar2, 1.0f);
        }
        if (i11 != 8) {
            bVarL.a(this, i11);
        }
        c(bVarL);
    }

    public final void f(f fVar, f fVar2, int i10, int i11) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f16289v = 0;
        bVarL.b(fVar, fVar2, fVarM, i10);
        if (i11 != 8) {
            bVarL.f16261d.g(j(i11), (int) (bVarL.f16261d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(f fVar, f fVar2, int i10, int i11) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f16289v = 0;
        bVarL.c(fVar, fVar2, fVarM, i10);
        if (i11 != 8) {
            bVarL.f16261d.g(j(i11), (int) (bVarL.f16261d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i10;
        if (bVar.f16262e) {
            bVar.a.i(this, bVar.f16259b);
        } else {
            b[] bVarArr = this.f16269g;
            int i11 = this.f16272k;
            bVarArr[i11] = bVar;
            f fVar = bVar.a;
            fVar.f16288u = i11;
            this.f16272k = i11 + 1;
            fVar.j(this, bVar);
        }
        if (this.f16264b) {
            int i12 = 0;
            while (i12 < this.f16272k) {
                if (this.f16269g[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f16269g[i12];
                if (bVar2 != null && bVar2.f16262e) {
                    bVar2.a.i(this, bVar2.f16259b);
                    ((T.c) this.f16274m.f15698t).b(bVar2);
                    this.f16269g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f16272k;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f16269g;
                        int i15 = i13 - 1;
                        b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        f fVar2 = bVar3.a;
                        if (fVar2.f16288u == i13) {
                            fVar2.f16288u = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f16269g[i14] = null;
                    }
                    this.f16272k = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f16264b = false;
        }
    }

    public final void i() {
        for (int i10 = 0; i10 < this.f16272k; i10++) {
            b bVar = this.f16269g[i10];
            bVar.a.f16290w = bVar.f16259b;
        }
    }

    public final f j(int i10) {
        if (this.j + 1 >= this.f16268f) {
            o();
        }
        f fVarA = a(4);
        int i11 = this.f16265c + 1;
        this.f16265c = i11;
        this.j++;
        fVarA.f16287t = i11;
        fVarA.f16289v = i10;
        ((f[]) this.f16274m.f15700v)[i11] = fVarA;
        d dVar = this.f16266d;
        dVar.f16281i.f8359t = fVarA;
        float[] fArr = fVarA.f16293z;
        Arrays.fill(fArr, 0.0f);
        fArr[fVarA.f16289v] = 1.0f;
        dVar.j(fVarA);
        return fVarA;
    }

    public final f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f16268f) {
            o();
        }
        if (!(obj instanceof B.c)) {
            return null;
        }
        B.c cVar = (B.c) obj;
        f fVar = cVar.f428i;
        if (fVar == null) {
            cVar.k();
            fVar = cVar.f428i;
        }
        int i10 = fVar.f16287t;
        a aVar = this.f16274m;
        if (i10 != -1 && i10 <= this.f16265c && ((f[]) aVar.f15700v)[i10] != null) {
            return fVar;
        }
        if (i10 != -1) {
            fVar.h();
        }
        int i11 = this.f16265c + 1;
        this.f16265c = i11;
        this.j++;
        fVar.f16287t = i11;
        fVar.f16285D = 1;
        ((f[]) aVar.f15700v)[i11] = fVar;
        return fVar;
    }

    public final b l() {
        Object obj;
        a aVar = this.f16274m;
        T.c cVar = (T.c) aVar.f15698t;
        int i10 = cVar.f4585b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = cVar.a;
            obj = objArr[i11];
            objArr[i11] = null;
            cVar.f4585b = i11;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(aVar);
        }
        bVar.a = null;
        bVar.f16261d.b();
        bVar.f16259b = 0.0f;
        bVar.f16262e = false;
        return bVar;
    }

    public final f m() {
        if (this.j + 1 >= this.f16268f) {
            o();
        }
        f fVarA = a(3);
        int i10 = this.f16265c + 1;
        this.f16265c = i10;
        this.j++;
        fVarA.f16287t = i10;
        ((f[]) this.f16274m.f15700v)[i10] = fVarA;
        return fVarA;
    }

    public final void o() {
        int i10 = this.f16267e * 2;
        this.f16267e = i10;
        this.f16269g = (b[]) Arrays.copyOf(this.f16269g, i10);
        a aVar = this.f16274m;
        aVar.f15700v = (f[]) Arrays.copyOf((f[]) aVar.f15700v, this.f16267e);
        int i11 = this.f16267e;
        this.f16271i = new boolean[i11];
        this.f16268f = i11;
        this.f16273l = i11;
    }

    public final void p() {
        d dVar = this.f16266d;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f16270h) {
            q(dVar);
            return;
        }
        for (int i10 = 0; i10 < this.f16272k; i10++) {
            if (!this.f16269g[i10].f16262e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        for (int i10 = 0; i10 < this.f16272k; i10++) {
            b bVar = this.f16269g[i10];
            int i11 = 1;
            if (bVar.a.f16285D != 1) {
                float f10 = 0.0f;
                if (bVar.f16259b < 0.0f) {
                    boolean z6 = false;
                    int i12 = 0;
                    while (!z6) {
                        i12 += i11;
                        float f11 = Float.MAX_VALUE;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < this.f16272k) {
                            b bVar2 = this.f16269g[i15];
                            if (bVar2.a.f16285D != i11 && !bVar2.f16262e && bVar2.f16259b < f10) {
                                int iD = bVar2.f16261d.d();
                                int i17 = 0;
                                while (i17 < iD) {
                                    f fVarE = bVar2.f16261d.e(i17);
                                    float fC = bVar2.f16261d.c(fVarE);
                                    if (fC > f10) {
                                        for (int i18 = 0; i18 < 9; i18++) {
                                            float f12 = fVarE.f16292y[i18] / fC;
                                            if ((f12 < f11 && i18 == i16) || i18 > i16) {
                                                i16 = i18;
                                                i14 = fVarE.f16287t;
                                                i13 = i15;
                                                f11 = f12;
                                            }
                                        }
                                    }
                                    i17++;
                                    f10 = 0.0f;
                                }
                            }
                            i15++;
                            f10 = 0.0f;
                            i11 = 1;
                        }
                        if (i13 != -1) {
                            b bVar3 = this.f16269g[i13];
                            bVar3.a.f16288u = -1;
                            bVar3.g(((f[]) this.f16274m.f15700v)[i14]);
                            f fVar = bVar3.a;
                            fVar.f16288u = i13;
                            fVar.j(this, bVar3);
                        } else {
                            z6 = true;
                        }
                        if (i12 > this.j / 2) {
                            z6 = true;
                        }
                        f10 = 0.0f;
                        i11 = 1;
                    }
                    break;
                }
            }
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        boolean z6;
        int i10 = 0;
        for (int i11 = 0; i11 < this.j; i11++) {
            this.f16271i[i11] = false;
        }
        boolean z10 = false;
        int i12 = 0;
        while (!z10) {
            int i13 = 1;
            i12++;
            if (i12 >= this.j * 2) {
                return;
            }
            f fVar = bVar.a;
            if (fVar != null) {
                this.f16271i[fVar.f16287t] = true;
            }
            f fVarD = bVar.d(this.f16271i);
            if (fVarD != null) {
                boolean[] zArr = this.f16271i;
                int i14 = fVarD.f16287t;
                if (zArr[i14]) {
                    return;
                } else {
                    zArr[i14] = true;
                }
            }
            if (fVarD != null) {
                float f10 = Float.MAX_VALUE;
                int i15 = i10;
                int i16 = -1;
                while (i15 < this.f16272k) {
                    b bVar2 = this.f16269g[i15];
                    if (bVar2.a.f16285D != i13 && !bVar2.f16262e) {
                        a aVar = bVar2.f16261d;
                        int i17 = aVar.f16257h;
                        if (i17 == -1) {
                            z6 = false;
                            break;
                        }
                        int i18 = 0;
                        while (true) {
                            if (i17 == -1 || i18 >= aVar.a) {
                                z6 = false;
                                break;
                            } else if (aVar.f16254e[i17] == fVarD.f16287t) {
                                z6 = true;
                                break;
                            } else {
                                i17 = aVar.f16255f[i17];
                                i18++;
                            }
                        }
                        if (z6) {
                            float fC = bVar2.f16261d.c(fVarD);
                            if (fC < 0.0f) {
                                float f11 = (-bVar2.f16259b) / fC;
                                if (f11 < f10) {
                                    f10 = f11;
                                    i16 = i15;
                                }
                            }
                        }
                    }
                    i15++;
                    i13 = 1;
                }
                if (i16 > -1) {
                    b bVar3 = this.f16269g[i16];
                    bVar3.a.f16288u = -1;
                    bVar3.g(fVarD);
                    f fVar2 = bVar3.a;
                    fVar2.f16288u = i16;
                    fVar2.j(this, bVar3);
                }
            } else {
                z10 = true;
            }
            i10 = 0;
        }
    }

    public final void s() {
        for (int i10 = 0; i10 < this.f16272k; i10++) {
            b bVar = this.f16269g[i10];
            if (bVar != null) {
                ((T.c) this.f16274m.f15698t).b(bVar);
            }
            this.f16269g[i10] = null;
        }
    }

    public final void t() {
        a aVar;
        int i10 = 0;
        while (true) {
            aVar = this.f16274m;
            f[] fVarArr = (f[]) aVar.f15700v;
            if (i10 >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i10];
            if (fVar != null) {
                fVar.h();
            }
            i10++;
        }
        T.c cVar = (T.c) aVar.f15699u;
        f[] fVarArr2 = this.f16275n;
        int length = this.f16276o;
        cVar.getClass();
        if (length > fVarArr2.length) {
            length = fVarArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            f fVar2 = fVarArr2[i11];
            int i12 = cVar.f4585b;
            Object[] objArr = cVar.a;
            if (i12 < objArr.length) {
                objArr[i12] = fVar2;
                cVar.f4585b = i12 + 1;
            }
        }
        this.f16276o = 0;
        Arrays.fill((f[]) aVar.f15700v, (Object) null);
        this.f16265c = 0;
        d dVar = this.f16266d;
        dVar.f16280h = 0;
        dVar.f16259b = 0.0f;
        this.j = 1;
        for (int i13 = 0; i13 < this.f16272k; i13++) {
            b bVar = this.f16269g[i13];
        }
        s();
        this.f16272k = 0;
        this.f16277p = new b(aVar);
    }
}
