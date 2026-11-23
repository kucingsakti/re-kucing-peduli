package Z9;

import L9.n;
import X9.C0456b;
import X9.C0458d;
import X9.C0459e;
import X9.C0460f;
import X9.C0461g;
import X9.C0462h;
import X9.F;
import X9.G;
import X9.K;
import X9.L;
import X9.N;
import X9.O;
import X9.v;
import X9.y;
import X9.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ma.w;
import o1.k;
import p020ba.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements z {
    public final C0461g a;

    public b(C0461g c0461g) {
        this.a = c0461g;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:122:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:130:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:132:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:134:0x0303  */
    /* JADX WARN: Code duplicated, block: B:143:0x0333 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x0335  */
    /* JADX WARN: Code duplicated, block: B:145:0x033a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x033c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0340 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x0342  */
    /* JADX WARN: Code duplicated, block: B:150:0x0369  */
    /* JADX WARN: Code duplicated, block: B:160:0x0395  */
    /* JADX WARN: Code duplicated, block: B:266:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:284:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:286:0x0636  */
    /* JADX WARN: Code duplicated, block: B:4:0x000c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X9.z
    public final L a(p030ca.f fVar) {
        boolean z6;
        L l4;
        long j;
        int i10;
        Date dateA;
        long j10;
        long jLongValue;
        Date dateA2;
        Date dateA3;
        String str;
        String str2;
        String str3;
        k kVar;
        long millis;
        long time;
        String string;
        int i11;
        int i12;
        long millis2;
        String str4;
        String str5;
        k kVar2;
        long j11;
        K kG;
        int i13;
        p204v1.f fVar2;
        O o10;
        p204v1.f fVar3;
        K0.g gVarC;
        K0.g gVarC2;
        O o11;
        i iVar = fVar.a;
        C0461g c0461g = this.a;
        if (c0461g == null) {
            l4 = null;
            z6 = true;
        } else {
            G g8 = fVar.f7579e;
            p210v8.i.f(g8, "request");
            y yVar = g8.a;
            try {
                e eVarG = c0461g.f5585s.g(p181s3.a.o(yVar));
                if (eVarG == null) {
                    l4 = null;
                    z6 = true;
                } else {
                    try {
                        C0459e c0459e = new C0459e((w) eVarG.f5936u.get(0));
                        X9.w wVar = c0459e.f5575b;
                        String str6 = c0459e.f5576c;
                        y yVar2 = c0459e.a;
                        X9.w wVar2 = c0459e.f5580g;
                        String strE = wVar2.e("Content-Type");
                        String strE2 = wVar2.e("Content-Length");
                        z6 = true;
                        Fa.e eVar = new Fa.e(11);
                        p210v8.i.f(yVar2, "url");
                        eVar.f1659t = yVar2;
                        eVar.v(str6, null);
                        p210v8.i.f(wVar, "headers");
                        eVar.f1661v = wVar.g();
                        G gJ = eVar.j();
                        new M1.c(3);
                        F f10 = c0459e.f5577d;
                        p210v8.i.f(f10, "protocol");
                        int i14 = c0459e.f5578e;
                        String str7 = c0459e.f5579f;
                        p210v8.i.f(str7, "message");
                        M1.c cVarG = wVar2.g();
                        C0458d c0458d = new C0458d(eVarG, strE, strE2);
                        v vVar = c0459e.f5581h;
                        long j12 = c0459e.f5582i;
                        long j13 = c0459e.j;
                        if (i14 < 0) {
                            throw new IllegalStateException(p210v8.i.k(Integer.valueOf(i14), "code < 0: ").toString());
                        }
                        l4 = new L(gJ, f10, str7, i14, vVar, cVarG.d(), c0458d, null, null, null, j12, j13, null);
                        if (yVar2.equals(yVar) && str6.equals(g8.f5505b)) {
                            Set setY = p181s3.a.y(l4.f5536x);
                            if (!setY.isEmpty()) {
                                Iterator it = setY.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String str8 = (String) it.next();
                                        if (!wVar.n(str8).equals(g8.f5506c.n(str8))) {
                                        }
                                    }
                                }
                            }
                        }
                        O o12 = l4.f5537y;
                        if (o12 != null) {
                            Y9.c.d(o12);
                        }
                        l4 = null;
                    } catch (IOException unused) {
                        z6 = true;
                        Y9.c.d(eVarG);
                    }
                }
            } catch (IOException unused2) {
                z6 = true;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        G g10 = fVar.f7579e;
        p210v8.i.f(g10, "request");
        if (l4 != null) {
            j10 = l4.f5527C;
            jLongValue = l4.f5528D;
            X9.w wVar3 = l4.f5536x;
            int size = wVar3.size();
            int i15 = 0;
            dateA = null;
            dateA2 = null;
            dateA3 = null;
            str = null;
            str2 = null;
            str3 = null;
            int iY = -1;
            while (i15 < size) {
                int i16 = i15 + 1;
                String strF = wVar3.f(i15);
                String strM = wVar3.m(i15);
                long j14 = jCurrentTimeMillis;
                boolean z10 = z6;
                if (n.C(strF, "Date", z10)) {
                    dateA = p030ca.c.a(strM);
                    str3 = strM;
                } else if (n.C(strF, "Expires", z10)) {
                    dateA3 = p030ca.c.a(strM);
                } else if (n.C(strF, "Last-Modified", z10)) {
                    dateA2 = p030ca.c.a(strM);
                    str2 = strM;
                } else if (n.C(strF, "ETag", z10)) {
                    str = strM;
                } else if (n.C(strF, "Age", z10)) {
                    iY = Y9.c.y(-1, strM);
                }
                i15 = i16;
                jCurrentTimeMillis = j14;
                z6 = true;
            }
            j = jCurrentTimeMillis;
            i10 = iY;
        } else {
            j = jCurrentTimeMillis;
            i10 = -1;
            dateA = null;
            j10 = 0;
            jLongValue = 0;
            dateA2 = null;
            dateA3 = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        if (l4 == null) {
            kVar = new k(g10, (Object) null);
        } else {
            Object obj = null;
            if (!(g10.a.j && l4.f5535w == null) && D3.b.o(l4, g10)) {
                C0462h c0462hJ = g10.f5509f;
                if (c0462hJ == null) {
                    int i17 = C0462h.f5586n;
                    c0462hJ = com.bumptech.glide.c.j(g10.f5506c);
                    g10.f5509f = c0462hJ;
                }
                if (!c0462hJ.a && g10.f5506c.e("If-Modified-Since") == null && g10.f5506c.e("If-None-Match") == null) {
                    C0462h c0462hA = l4.a();
                    long jMax = dateA != null ? Math.max(0L, jLongValue - dateA.getTime()) : 0L;
                    if (i10 != -1) {
                        jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
                    }
                    long j15 = jMax + (jLongValue - j10) + (j - jLongValue);
                    int i18 = l4.a().f5588c;
                    if (i18 != -1) {
                        time = TimeUnit.SECONDS.toMillis(i18);
                    } else {
                        if (dateA3 != null) {
                            Long lValueOf = dateA == 0 ? null : Long.valueOf(dateA.getTime());
                            if (lValueOf != null) {
                                jLongValue = lValueOf.longValue();
                            }
                            time = dateA3.getTime() - jLongValue;
                            if (time <= 0) {
                                time = 0;
                            }
                        } else if (dateA2 == null) {
                            millis = 0;
                            time = millis;
                        } else {
                            ArrayList arrayList = l4.f5531s.a.f5661g;
                            if (arrayList == null) {
                                string = null;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                C0456b.g(arrayList, sb);
                                string = sb.toString();
                            }
                            if (string == null) {
                                Long lValueOf2 = dateA == 0 ? null : Long.valueOf(dateA.getTime());
                                long jLongValue2 = (lValueOf2 == null ? j10 : lValueOf2.longValue()) - dateA2.getTime();
                                millis = 0;
                                if (jLongValue2 > 0) {
                                    time = jLongValue2 / ((long) 10);
                                }
                            } else {
                                millis = 0;
                            }
                            time = millis;
                        }
                        i11 = c0462hJ.f5588c;
                        if (i11 != -1) {
                            time = Math.min(time, TimeUnit.SECONDS.toMillis(i11));
                        }
                        i12 = c0462hJ.f5594i;
                        if (i12 != -1) {
                            millis2 = TimeUnit.SECONDS.toMillis(i12);
                        } else {
                            millis2 = millis;
                        }
                        if (!c0462hA.f5592g && (i13 = c0462hJ.f5593h) != -1) {
                            millis = TimeUnit.SECONDS.toMillis(i13);
                        }
                        if (c0462hA.a) {
                            if (str != null) {
                                str5 = str;
                                str4 = "If-None-Match";
                            } else if (dateA2 != null) {
                                str4 = "If-Modified-Since";
                                str5 = str2;
                            } else if (dateA != null) {
                                str4 = r7;
                                str5 = str3;
                            } else {
                                kVar = new k(g10, (Object) null);
                            }
                            M1.c cVarG2 = g10.f5506c.g();
                            p210v8.i.c(str5);
                            cVarG2.c(str4, str5);
                            Fa.e eVarA = g10.a();
                            eVarA.f1661v = cVarG2.d().g();
                            kVar2 = new k(eVarA.j(), l4);
                            kVar = kVar2;
                        } else {
                            j11 = j15 + millis2;
                            if (j11 < time + millis) {
                                kG = l4.g();
                                if (j11 >= time) {
                                    kG.f5518f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j15 > 86400000 && l4.a().f5588c == -1 && dateA3 == null) {
                                    kG.f5518f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                kVar2 = new k((Object) null, kG.a());
                            } else {
                                if (str != null) {
                                    str5 = str;
                                    str4 = "If-None-Match";
                                } else if (dateA2 != null) {
                                    str4 = "If-Modified-Since";
                                    str5 = str2;
                                } else if (dateA != null) {
                                    str4 = r7;
                                    str5 = str3;
                                } else {
                                    kVar = new k(g10, (Object) null);
                                }
                                M1.c cVarG3 = g10.f5506c.g();
                                p210v8.i.c(str5);
                                cVarG3.c(str4, str5);
                                Fa.e eVarA2 = g10.a();
                                eVarA2.f1661v = cVarG3.d().g();
                                kVar2 = new k(eVarA2.j(), l4);
                            }
                            kVar = kVar2;
                        }
                    }
                    millis = 0;
                    i11 = c0462hJ.f5588c;
                    if (i11 != -1) {
                        time = Math.min(time, TimeUnit.SECONDS.toMillis(i11));
                    }
                    i12 = c0462hJ.f5594i;
                    if (i12 != -1) {
                        millis2 = TimeUnit.SECONDS.toMillis(i12);
                    } else {
                        millis2 = millis;
                    }
                    if (!c0462hA.f5592g) {
                        millis = TimeUnit.SECONDS.toMillis(i13);
                    }
                    if (c0462hA.a) {
                        j11 = j15 + millis2;
                        if (j11 < time + millis) {
                            kG = l4.g();
                            if (j11 >= time) {
                                kG.f5518f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                            }
                            if (j15 > 86400000) {
                                kG.f5518f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            kVar2 = new k((Object) null, kG.a());
                        } else {
                            if (str != null) {
                                str5 = str;
                                str4 = "If-None-Match";
                            } else if (dateA2 != null) {
                                str4 = "If-Modified-Since";
                                str5 = str2;
                            } else if (dateA != null) {
                                str4 = r7;
                                str5 = str3;
                            } else {
                                kVar = new k(g10, (Object) null);
                            }
                            M1.c cVarG4 = g10.f5506c.g();
                            p210v8.i.c(str5);
                            cVarG4.c(str4, str5);
                            Fa.e eVarA3 = g10.a();
                            eVarA3.f1661v = cVarG4.d().g();
                            kVar2 = new k(eVarA3.j(), l4);
                        }
                        kVar = kVar2;
                    } else {
                        if (str != null) {
                            str5 = str;
                            str4 = "If-None-Match";
                        } else if (dateA2 != null) {
                            str4 = "If-Modified-Since";
                            str5 = str2;
                        } else if (dateA != null) {
                            str4 = r7;
                            str5 = str3;
                        } else {
                            kVar = new k(g10, (Object) null);
                        }
                        M1.c cVarG5 = g10.f5506c.g();
                        p210v8.i.c(str5);
                        cVarG5.c(str4, str5);
                        Fa.e eVarA4 = g10.a();
                        eVarA4.f1661v = cVarG5.d().g();
                        kVar2 = new k(eVarA4.j(), l4);
                        kVar = kVar2;
                    }
                } else {
                    kVar = new k(g10, (Object) null);
                }
            } else {
                kVar = new k(g10, obj);
            }
        }
        if (((G) kVar.f13638s) == null) {
            fVar2 = null;
        } else {
            C0462h c0462hJ2 = g10.f5509f;
            if (c0462hJ2 == null) {
                int i19 = C0462h.f5586n;
                c0462hJ2 = com.bumptech.glide.c.j(g10.f5506c);
                g10.f5509f = c0462hJ2;
            }
            if (c0462hJ2.j) {
                fVar2 = null;
                kVar = new k(fVar2, fVar2);
            } else {
                fVar2 = null;
            }
        }
        G g11 = (G) kVar.f13638s;
        L l10 = (L) kVar.f13639t;
        C0461g c0461g2 = this.a;
        if (c0461g2 != null) {
            synchronized (c0461g2) {
            }
        }
        boolean z11 = iVar instanceof i;
        if (l4 != null && l10 == null && (o11 = l4.f5537y) != null) {
            Y9.c.d(o11);
        }
        if (g11 == null && l10 == null) {
            ArrayList arrayList2 = new ArrayList(20);
            G g12 = fVar.f7579e;
            p210v8.i.f(g12, "request");
            F f11 = F.HTTP_1_1;
            N n10 = Y9.c.f5822c;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Object[] array = arrayList2.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            L l11 = new L(g12, f11, "Unsatisfiable Request (only-if-cached)", 504, null, new X9.w((String[]) array), n10, null, null, null, -1L, jCurrentTimeMillis2, null);
            p210v8.i.f(iVar, "call");
            return l11;
        }
        if (g11 == null) {
            p210v8.i.c(l10);
            K kG2 = l10.g();
            L lD = p204v1.g.d(l10);
            K.b(lD, "cacheResponse");
            kG2.f5521i = lD;
            L lA = kG2.a();
            p210v8.i.f(iVar, "call");
            return lA;
        }
        if (l10 != null || this.a != null) {
            p210v8.i.f(iVar, "call");
        }
        try {
            L lB = fVar.b(g11);
            if (l10 != null) {
                if (lB.f5534v == 304) {
                    K kG3 = l10.g();
                    X9.w wVar4 = l10.f5536x;
                    X9.w wVar5 = lB.f5536x;
                    M1.c cVar = new M1.c(3);
                    int size2 = wVar4.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        int i21 = i20 + 1;
                        String strF2 = wVar4.f(i20);
                        String strM2 = wVar4.m(i20);
                        if (!"Warning".equalsIgnoreCase(strF2) || !n.I(strM2, "1", false)) {
                            if ("Content-Length".equalsIgnoreCase(strF2) || "Content-Encoding".equalsIgnoreCase(strF2) || "Content-Type".equalsIgnoreCase(strF2) || !p204v1.g.p(strF2) || wVar5.e(strF2) == null) {
                                cVar.c(strF2, strM2);
                            }
                        }
                        i20 = i21;
                    }
                    int i22 = 0;
                    int size3 = wVar5.size();
                    while (i22 < size3) {
                        int i23 = i22 + 1;
                        String strF3 = wVar5.f(i22);
                        if (!"Content-Length".equalsIgnoreCase(strF3) && !"Content-Encoding".equalsIgnoreCase(strF3) && !"Content-Type".equalsIgnoreCase(strF3) && p204v1.g.p(strF3)) {
                            cVar.c(strF3, wVar5.m(i22));
                        }
                        i22 = i23;
                    }
                    kG3.c(cVar.d());
                    kG3.f5522k = lB.f5527C;
                    kG3.f5523l = lB.f5528D;
                    L lD2 = p204v1.g.d(l10);
                    K.b(lD2, "cacheResponse");
                    kG3.f5521i = lD2;
                    L lD3 = p204v1.g.d(lB);
                    K.b(lD3, "networkResponse");
                    kG3.f5520h = lD3;
                    L lA2 = kG3.a();
                    O o13 = lB.f5537y;
                    p210v8.i.c(o13);
                    o13.close();
                    C0461g c0461g3 = this.a;
                    p210v8.i.c(c0461g3);
                    c0461g3.b();
                    this.a.getClass();
                    C0459e c0459e2 = new C0459e(lA2);
                    O o14 = l10.f5537y;
                    if (o14 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
                    }
                    e eVar2 = ((C0458d) o14).f5569t;
                    try {
                        gVarC2 = eVar2.f5937v.c(eVar2.f5934s, eVar2.f5935t);
                        if (gVarC2 != 0) {
                            try {
                                c0459e2.c(gVarC2);
                                gVarC2.d();
                            } catch (IOException unused3) {
                                if (gVarC2 != 0) {
                                    try {
                                        gVarC2.c();
                                    } catch (IOException unused4) {
                                    }
                                }
                            }
                        }
                    } catch (IOException unused5) {
                        gVarC2 = fVar2;
                    }
                    p210v8.i.f(iVar, "call");
                    return lA2;
                }
                O o15 = l10.f5537y;
                if (o15 != null) {
                    Y9.c.d(o15);
                }
            }
            K kG4 = lB.g();
            L lD4 = p204v1.g.d(l10);
            K.b(lD4, "cacheResponse");
            kG4.f5521i = lD4;
            L lD5 = p204v1.g.d(lB);
            K.b(lD5, "networkResponse");
            kG4.f5520h = lD5;
            L lA3 = kG4.a();
            if (this.a != null) {
                if (p030ca.e.a(lA3) && D3.b.o(lA3, g11)) {
                    C0461g c0461g4 = this.a;
                    c0461g4.getClass();
                    G g13 = lA3.f5531s;
                    String str9 = g13.f5505b;
                    p210v8.i.f(str9, "method");
                    try {
                        if (!str9.equals("POST") && !str9.equals("PATCH") && !str9.equals("PUT") && !str9.equals("DELETE") && !str9.equals("MOVE")) {
                            if (str9.equals("GET") && !p181s3.a.y(lA3.f5536x).contains("*")) {
                                C0459e c0459e3 = new C0459e(lA3);
                                try {
                                    g gVar = c0461g4.f5585s;
                                    String strO = p181s3.a.o(g13.a);
                                    L9.e eVar3 = g.f5940J;
                                    gVarC = gVar.c(strO, -1L);
                                    if (gVarC == 0) {
                                        fVar3 = fVar2;
                                    } else {
                                        try {
                                            c0459e3.c(gVarC);
                                            fVar3 = new p204v1.f(c0461g4, gVarC);
                                        } catch (IOException unused6) {
                                            if (gVarC != 0) {
                                                gVarC.c();
                                            }
                                            fVar3 = fVar2;
                                        }
                                    }
                                } catch (IOException unused7) {
                                    gVarC = fVar2;
                                }
                            } else {
                                fVar3 = fVar2;
                            }
                            if (fVar3 != null) {
                                C0460f c0460f = (C0460f) fVar3.f15395d;
                                O o16 = lA3.f5537y;
                                p210v8.i.c(o16);
                                a aVar = new a(o16.c(), fVar3, p068ga.d.c(c0460f));
                                String strB = L.b(lA3, "Content-Type");
                                long jA = lA3.f5537y.a();
                                K kG5 = lA3.g();
                                kG5.f5519g = new N(strB, jA, p068ga.d.d(aVar), 1);
                                lA3 = kG5.a();
                            }
                            if (l10 != null) {
                                p210v8.i.f(iVar, "call");
                            }
                            return lA3;
                        }
                        c0461g4.a(g13);
                    } catch (IOException unused8) {
                    }
                    fVar3 = fVar2;
                    if (fVar3 != null) {
                        C0460f c0460f2 = (C0460f) fVar3.f15395d;
                        O o17 = lA3.f5537y;
                        p210v8.i.c(o17);
                        a aVar2 = new a(o17.c(), fVar3, p068ga.d.c(c0460f2));
                        String strB2 = L.b(lA3, "Content-Type");
                        long jA2 = lA3.f5537y.a();
                        K kG6 = lA3.g();
                        kG6.f5519g = new N(strB2, jA2, p068ga.d.d(aVar2), 1);
                        lA3 = kG6.a();
                    }
                    if (l10 != null) {
                        p210v8.i.f(iVar, "call");
                    }
                    return lA3;
                }
                String str10 = g11.f5505b;
                p210v8.i.f(str10, "method");
                if (str10.equals("POST") || str10.equals("PATCH") || str10.equals("PUT") || str10.equals("DELETE") || str10.equals("MOVE")) {
                    try {
                        this.a.a(g11);
                    } catch (IOException unused9) {
                    }
                }
            }
            return lA3;
        } catch (Throwable th) {
            if (l4 != null && (o10 = l4.f5537y) != null) {
                Y9.c.d(o10);
            }
            throw th;
        }
    }
}
