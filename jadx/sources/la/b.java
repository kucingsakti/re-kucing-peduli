package la;

import X9.A;
import X9.F;
import X9.G;
import X9.J;
import X9.L;
import X9.O;
import X9.w;
import X9.z;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.bumptech.glide.c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import ma.h;
import ma.m;
import p020ba.k;
import p030ca.e;
import p030ca.f;
import p140o4.r;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f13064b = a.a;
    public volatile int a = 1;

    /* JADX WARN: Code duplicated, block: B:75:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x021b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0220  */
    /* JADX WARN: Code duplicated, block: B:83:0x0253  */
    /* JADX WARN: Code duplicated, block: B:84:0x025c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0269  */
    /* JADX WARN: Code duplicated, block: B:89:0x0272 A[LOOP:1: B:88:0x0270->B:89:0x0272, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x01ed, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x0220, please report this as an issue */
    @Override // X9.z
    public final L a(f fVar) throws Exception {
        String string;
        boolean z6;
        char c10;
        L lB;
        long jA;
        String str;
        String str2;
        String strI;
        w wVar;
        int size;
        int i10;
        Long lValueOf;
        Charset charsetA;
        Charset charsetA2;
        int i11 = this.a;
        G g8 = fVar.f7579e;
        boolean z10 = true;
        if (i11 == 1) {
            return fVar.b(g8);
        }
        boolean z11 = i11 == 4;
        if (!z11 && i11 != 3) {
            z10 = false;
        }
        J j = g8.f5507d;
        r rVar = fVar.f7578d;
        k kVar = rVar == null ? null : (k) rVar.f13785w;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(g8.f5505b);
        sb.append(' ');
        sb.append(g8.a);
        if (kVar != null) {
            StringBuilder sb2 = new StringBuilder(" ");
            F f10 = kVar.f7399f;
            i.c(f10);
            sb2.append(f10);
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        String string2 = sb.toString();
        String str3 = "-byte body)";
        if (!z10 && j != null) {
            string2 = string2 + " (" + j.a() + "-byte body)";
        }
        this.f13064b.a(string2);
        try {
            if (z10) {
                w wVar2 = g8.f5506c;
                if (j != null) {
                    c10 = ' ';
                    A aB = j.b();
                    z6 = z10;
                    if (aB != null && wVar2.e("Content-Type") == null) {
                        this.f13064b.a("Content-Type: " + aB);
                    }
                    if (j.a() != -1 && wVar2.e("Content-Length") == null) {
                        this.f13064b.a("Content-Length: " + j.a());
                    }
                } else {
                    z6 = z10;
                    z11 = z11;
                    c10 = ' ';
                }
                int size2 = wVar2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    b(wVar2, i12);
                }
                if (!z11 || j == null) {
                    this.f13064b.a("--> END " + g8.f5505b);
                } else {
                    String strE = g8.f5506c.e("Content-Encoding");
                    if (strE == null || strE.equalsIgnoreCase("identity") || strE.equalsIgnoreCase("gzip")) {
                        ma.f fVar2 = new ma.f();
                        j.d(fVar2);
                        A aB2 = j.b();
                        if (aB2 == null || (charsetA2 = aB2.a(StandardCharsets.UTF_8)) == null) {
                            charsetA2 = StandardCharsets.UTF_8;
                            i.e(charsetA2, "UTF_8");
                        }
                        this.f13064b.a("");
                        if (c.i(fVar2)) {
                            this.f13064b.a(fVar2.H(fVar2.f13190t, charsetA2));
                            this.f13064b.a("--> END " + g8.f5505b + " (" + j.a() + str3);
                        } else {
                            this.f13064b.a("--> END " + g8.f5505b + " (binary " + j.a() + "-byte body omitted)");
                        }
                    } else {
                        this.f13064b.a(E0.a.l(new StringBuilder("--> END "), g8.f5505b, " (encoded body omitted)"));
                    }
                }
                long jNanoTime = System.nanoTime();
                lB = fVar.b(g8);
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                O o10 = lB.f5537y;
                i.c(o10);
                jA = o10.a();
                if (jA != -1) {
                    str = jA + "-byte";
                } else {
                    str = "unknown-length";
                }
                a aVar = this.f13064b;
                StringBuilder sb3 = new StringBuilder("<-- ");
                sb3.append(lB.f5534v);
                if (lB.f5533u.length() == 0) {
                    str2 = r11;
                } else {
                    str2 = String.valueOf(c10) + lB.f5533u;
                }
                sb3.append(str2);
                sb3.append(c10);
                sb3.append(lB.f5531s.a);
                sb3.append(" (");
                sb3.append(millis);
                sb3.append("ms");
                if (z6) {
                    strI = r11;
                } else {
                    strI = E0.a.i(", ", str, " body");
                }
                aVar.a(AbstractC0487g.j(sb3, strI, ')'));
                if (z6) {
                    wVar = lB.f5536x;
                    size = wVar.size();
                    for (i10 = 0; i10 < size; i10++) {
                        b(wVar, i10);
                    }
                    if (!z11 && e.a(lB)) {
                        String strE2 = lB.f5536x.e("Content-Encoding");
                        if (strE2 != null && !strE2.equalsIgnoreCase("identity") && !strE2.equalsIgnoreCase("gzip")) {
                            this.f13064b.a("<-- END HTTP (encoded body omitted)");
                            return lB;
                        }
                        h hVarC = o10.c();
                        hVarC.f(Long.MAX_VALUE);
                        ma.f fVarD = hVarC.d();
                        if ("gzip".equalsIgnoreCase(wVar.e("Content-Encoding"))) {
                            lValueOf = Long.valueOf(fVarD.f13190t);
                            m mVar = new m(fVarD.clone());
                            try {
                                fVarD = new ma.f();
                                fVarD.c0(mVar);
                                mVar.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    c.c(mVar, th);
                                    throw th2;
                                }
                            }
                        } else {
                            lValueOf = null;
                        }
                        A aB3 = o10.b();
                        if (aB3 == null || (charsetA = aB3.a(StandardCharsets.UTF_8)) == null) {
                            charsetA = StandardCharsets.UTF_8;
                            i.e(charsetA, "UTF_8");
                        }
                        if (!c.i(fVarD)) {
                            this.f13064b.a("");
                            this.f13064b.a("<-- END HTTP (binary " + fVarD.f13190t + "-byte body omitted)");
                            return lB;
                        }
                        if (jA != 0) {
                            this.f13064b.a("");
                            a aVar2 = this.f13064b;
                            ma.f fVarClone = fVarD.clone();
                            aVar2.a(fVarClone.H(fVarClone.f13190t, charsetA));
                        }
                        if (lValueOf == null) {
                            this.f13064b.a("<-- END HTTP (" + fVarD.f13190t + str3);
                            return lB;
                        }
                        this.f13064b.a("<-- END HTTP (" + fVarD.f13190t + "-byte, " + lValueOf + "-gzipped-byte body)");
                        return lB;
                    }
                    this.f13064b.a("<-- END HTTP");
                }
                return lB;
            }
            z6 = z10;
            z11 = z11;
            str3 = "-byte body)";
            c10 = ' ';
            lB = fVar.b(g8);
            long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            O o11 = lB.f5537y;
            i.c(o11);
            jA = o11.a();
            if (jA != -1) {
                str = jA + "-byte";
            } else {
                str = "unknown-length";
            }
            a aVar3 = this.f13064b;
            StringBuilder sb4 = new StringBuilder("<-- ");
            sb4.append(lB.f5534v);
            if (lB.f5533u.length() == 0) {
                str2 = r11;
            } else {
                str2 = String.valueOf(c10) + lB.f5533u;
            }
            sb4.append(str2);
            sb4.append(c10);
            sb4.append(lB.f5531s.a);
            sb4.append(" (");
            sb4.append(millis2);
            sb4.append("ms");
            if (z6) {
                strI = E0.a.i(", ", str, " body");
            } else {
                strI = r11;
            }
            aVar3.a(AbstractC0487g.j(sb4, strI, ')'));
            if (z6) {
                wVar = lB.f5536x;
                size = wVar.size();
                while (i10 < size) {
                    b(wVar, i10);
                }
                if (!z11) {
                }
                this.f13064b.a("<-- END HTTP");
            }
            return lB;
        } catch (Exception e10) {
            this.f13064b.a("<-- HTTP FAILED: " + e10);
            throw e10;
        }
        long jNanoTime2 = System.nanoTime();
    }

    public final void b(w wVar, int i10) {
        wVar.f(i10);
        String strM = wVar.m(i10);
        this.f13064b.a(wVar.f(i10) + ": " + strM);
    }
}
