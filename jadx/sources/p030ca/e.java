package p030ca;

import C3.a;
import L9.f;
import L9.n;
import X9.C0471q;
import X9.L;
import X9.r;
import X9.w;
import X9.y;
import Y9.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import ma.i;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p086i8.s;
import p230x9.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    static {
        i iVar = i.f13191v;
        d.r("\"\\");
        d.r("\t ,=");
    }

    public static final boolean a(L l4) {
        if (p210v8.i.a(l4.f5531s.f5505b, "HEAD")) {
            return false;
        }
        int i10 = l4.f5534v;
        return (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && c.k(l4) == -1 && !"chunked".equalsIgnoreCase(L.b(l4, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:9:0x0053  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v2 */
    public static final void b(r rVar, y yVar, w wVar) {
        List listUnmodifiableList;
        int i10;
        C0471q c0471q;
        int i11;
        C0471q c0471q2;
        int i12 = 1;
        p210v8.i.f(rVar, "<this>");
        p210v8.i.f(yVar, "url");
        p210v8.i.f(wVar, "headers");
        if (rVar == r.f5637h) {
            return;
        }
        Pattern pattern = C0471q.j;
        List listN = wVar.n("Set-Cookie");
        int size = listN.size();
        int i13 = 0;
        int i14 = 0;
        ArrayList arrayList = null;
        while (i14 < size) {
            int i15 = i14 + 1;
            String str = (String) listN.get(i14);
            p210v8.i.f(str, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = c.a;
            char c10 = ';';
            int iF = c.f(str, ';', i13, str.length());
            char c11 = '=';
            int iF2 = c.f(str, '=', i13, iF);
            if (iF2 == iF) {
                i10 = i12;
                i11 = i13;
                c0471q2 = null;
            } else {
                String strZ = c.z(i13, str, iF2);
                if (strZ.length() != 0) {
                    i10 = i12;
                    if (c.m(strZ) == -1) {
                        String strZ2 = c.z(iF2 + 1, str, iF);
                        if (c.m(strZ2) == -1) {
                            int i16 = iF + 1;
                            int length = str.length();
                            long j = 253402300799999L;
                            int i17 = i13;
                            int i18 = i17;
                            int i19 = i18 == true ? 1 : 0;
                            long jX = 253402300799999L;
                            boolean z6 = i10;
                            String str2 = null;
                            String str3 = null;
                            long j10 = -1;
                            boolean z10 = i18;
                            while (true) {
                                if (i16 >= length) {
                                    if (j10 == Long.MIN_VALUE) {
                                        j = Long.MIN_VALUE;
                                    } else if (j10 != -1) {
                                        long j11 = jCurrentTimeMillis + (j10 <= 9223372036854775L ? j10 * ((long) 1000) : Long.MAX_VALUE);
                                        if (j11 >= jCurrentTimeMillis && j11 <= 253402300799999L) {
                                            j = j11;
                                        }
                                    } else {
                                        j = jX;
                                    }
                                    String str4 = yVar.f5658d;
                                    if (str2 != null) {
                                        if (!p210v8.i.a(str4, str2) && (!n.B(str4, str2) || str4.charAt((str4.length() - str2.length()) - 1) != '.' || c.f5825f.a(str4))) {
                                            i11 = 0;
                                            c0471q = null;
                                        }
                                        c0471q2 = c0471q;
                                        break;
                                    }
                                    str2 = str4;
                                    if (str4.length() == str2.length() || PublicSuffixDatabase.f13844g.a(str2) != null) {
                                        String strSubstring = "/";
                                        i11 = 0;
                                        if (str3 == null || !n.I(str3, "/", false)) {
                                            String strB = yVar.b();
                                            int iR = f.R(strB, '/', 0, 6);
                                            if (iR != 0) {
                                                strSubstring = strB.substring(0, iR);
                                                p210v8.i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                            }
                                            str3 = strSubstring;
                                        }
                                        c0471q = new C0471q(strZ, strZ2, j, str2, str3, i19 == true ? 1 : 0, i17, z10, z6);
                                    } else {
                                        i11 = 0;
                                        c0471q = null;
                                    }
                                    c0471q2 = c0471q;
                                    break;
                                }
                                int iF3 = c.f(str, c10, i16, length);
                                int iF4 = c.f(str, c11, i16, iF3);
                                String strZ3 = c.z(i16, str, iF4);
                                String strZ4 = iF4 < iF3 ? c.z(iF4 + 1, str, iF3) : "";
                                if (strZ3.equalsIgnoreCase("expires")) {
                                    try {
                                        jX = com.bumptech.glide.d.x(strZ4.length(), strZ4);
                                        z10 = i10;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (strZ3.equalsIgnoreCase("max-age")) {
                                    try {
                                        long j12 = Long.parseLong(strZ4);
                                        j10 = j12 <= 0 ? Long.MIN_VALUE : j12;
                                    } catch (NumberFormatException e10) {
                                        Pattern patternCompile = Pattern.compile("-?\\d+");
                                        p210v8.i.e(patternCompile, "compile(...)");
                                        if (!patternCompile.matcher(strZ4).matches()) {
                                            throw e10;
                                        }
                                        j10 = n.I(strZ4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z10 = i10;
                                } else if (strZ3.equalsIgnoreCase("domain")) {
                                    if (n.B(strZ4, ".")) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String strQ = a.q(f.W(strZ4, "."));
                                    if (strQ == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str2 = strQ;
                                    z6 = 0;
                                } else if (strZ3.equalsIgnoreCase("path")) {
                                    str3 = strZ4;
                                } else if (strZ3.equalsIgnoreCase("secure")) {
                                    i19 = i10;
                                } else if (strZ3.equalsIgnoreCase("httponly")) {
                                    i17 = i10;
                                }
                                i16 = iF3 + 1;
                                c10 = ';';
                                c11 = '=';
                                z10 = z10;
                                z6 = z6;
                            }
                        }
                    }
                } else {
                    i10 = i12;
                }
                i11 = i13;
                c0471q2 = null;
            }
            if (c0471q2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0471q2);
            }
            i14 = i15;
            i13 = i11;
            i12 = i10;
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            p210v8.i.e(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            listUnmodifiableList = s.f12328s;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        rVar.i(yVar, listUnmodifiableList);
    }
}
