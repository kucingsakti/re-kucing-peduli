package X9;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0456b implements r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0456b f5565s = new C0456b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0456b f5566t = new C0456b();

    public static final C0468n a(C0456b c0456b, String str) {
        C0468n c0468n = new C0468n(str);
        C0468n.f5602d.put(str, c0468n);
        return c0468n;
    }

    public static String b(String str, int i10, int i11, String str2, int i12) throws EOFException {
        int i13 = (i12 & 1) != 0 ? 0 : i10;
        int length = (i12 & 2) != 0 ? str.length() : i11;
        boolean z6 = (i12 & 8) == 0;
        boolean z10 = (i12 & 16) == 0;
        boolean z11 = (i12 & 32) == 0;
        boolean z12 = (i12 & 64) == 0;
        p210v8.i.f(str, "<this>");
        int iCharCount = i13;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i14 = 32;
            int i15 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z12) || L9.f.K(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z6 || (z10 && !d(iCharCount, str, length)))) || (iCodePointAt == 43 && z11)))) {
                ma.f fVar = new ma.f();
                fVar.h0(i13, str, iCharCount);
                ma.f fVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z6 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z11) {
                            fVar.i0(z6 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i14 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i15 && !z12) || L9.f.K(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z6 || (z10 && !d(iCharCount, str, length)))))) {
                            if (fVar2 == null) {
                                fVar2 = new ma.f();
                            }
                            fVar2.j0(iCodePointAt2);
                            while (!fVar2.j()) {
                                byte bT = fVar2.t();
                                fVar.d0(37);
                                char[] cArr = y.f5655k;
                                fVar.d0(cArr[((bT & 255) >> 4) & 15]);
                                fVar.d0(cArr[bT & 15]);
                            }
                        } else {
                            fVar.j0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i14 = 32;
                    i15 = 128;
                }
                return fVar.J();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i13, length);
        p210v8.i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static boolean d(int i10, String str, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && Y9.c.r(str.charAt(i10 + 1)) != -1 && Y9.c.r(str.charAt(i12)) != -1;
    }

    public static String e(String str, int i10, int i11, int i12) {
        int i13;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        boolean z6 = (i12 & 4) == 0;
        p210v8.i.f(str, "<this>");
        int iCharCount = i10;
        while (iCharCount < i11) {
            int i14 = iCharCount + 1;
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z6)) {
                ma.f fVar = new ma.f();
                fVar.h0(i10, str, iCharCount);
                while (iCharCount < i11) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i13 = iCharCount + 2) < i11) {
                        int iR = Y9.c.r(str.charAt(iCharCount + 1));
                        int iR2 = Y9.c.r(str.charAt(i13));
                        if (iR == -1 || iR2 == -1) {
                            fVar.j0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            fVar.d0((iR << 4) + iR2);
                            iCharCount = Character.charCount(iCodePointAt) + i13;
                        }
                    } else if (iCodePointAt == 43 && z6) {
                        fVar.d0(32);
                        iCharCount++;
                    } else {
                        fVar.j0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return fVar.J();
            }
            iCharCount = i14;
        }
        String strSubstring = str.substring(i10, i11);
        p210v8.i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iO = L9.f.O(str, '&', i10, 4);
            if (iO == -1) {
                iO = str.length();
            }
            int iO2 = L9.f.O(str, '=', i10, 4);
            if (iO2 == -1 || iO2 > iO) {
                String strSubstring = str.substring(i10, iO);
                p210v8.i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i10, iO2);
                p210v8.i.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iO2 + 1, iO);
                p210v8.i.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i10 = iO + 1;
        }
        return arrayList;
    }

    public static void g(ArrayList arrayList, StringBuilder sb) {
        p210v8.i.f(arrayList, "<this>");
        B8.a aVarU = p181s3.a.u(p181s3.a.w(0, arrayList.size()), 2);
        int i10 = aVarU.f769s;
        int i11 = aVarU.f770t;
        int i12 = aVarU.f771u;
        if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
            return;
        }
        while (true) {
            int i13 = i10 + i12;
            String str = (String) arrayList.get(i10);
            String str2 = (String) arrayList.get(i10 + 1);
            if (i10 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i10 == i11) {
                return;
            } else {
                i10 = i13;
            }
        }
    }

    public synchronized C0468n c(String str) {
        C0468n c0468n;
        String strK;
        try {
            p210v8.i.f(str, "javaName");
            LinkedHashMap linkedHashMap = C0468n.f5602d;
            c0468n = (C0468n) linkedHashMap.get(str);
            if (c0468n == null) {
                if (L9.n.I(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    p210v8.i.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strK = p210v8.i.k(strSubstring, "SSL_");
                } else if (L9.n.I(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    p210v8.i.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strK = p210v8.i.k(strSubstring2, "TLS_");
                } else {
                    strK = str;
                }
                c0468n = (C0468n) linkedHashMap.get(strK);
                if (c0468n == null) {
                    c0468n = new C0468n(str);
                }
                linkedHashMap.put(str, c0468n);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0468n;
    }

    @Override // X9.r
    public void i(y yVar, List list) {
        p210v8.i.f(yVar, "url");
    }

    @Override // X9.r
    public List n(y yVar) {
        p210v8.i.f(yVar, "url");
        return p086i8.s.f12328s;
    }
}
