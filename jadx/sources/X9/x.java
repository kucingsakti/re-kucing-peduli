package X9;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public String a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5650d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f5652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f5653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f5654h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5648b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5649c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5651e = -1;

    public x() {
        ArrayList arrayList = new ArrayList();
        this.f5652f = arrayList;
        arrayList.add("");
    }

    public final y a() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strE = C0456b.e(this.f5648b, 0, 0, 7);
        String strE2 = C0456b.e(this.f5649c, 0, 0, 7);
        String str2 = this.f5650d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iB = b();
        ArrayList arrayList2 = this.f5652f;
        ArrayList arrayList3 = new ArrayList(p086i8.m.H(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C0456b.e((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.f5653g;
        if (arrayList4 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList5 = new ArrayList(p086i8.m.H(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 == null ? null : C0456b.e(str3, 0, 0, 3));
            }
            arrayList = arrayList5;
        }
        String str4 = this.f5654h;
        return new y(str, strE, strE2, str2, iB, arrayList3, arrayList, str4 != null ? C0456b.e(str4, 0, 0, 7) : null, toString());
    }

    public final int b() {
        int i10 = this.f5651e;
        if (i10 != -1) {
            return i10;
        }
        String str = this.a;
        p210v8.i.c(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d9 A[LOOP:4: B:107:0x01d9->B:232:?, LOOP_START, PHI: r1
      0x01d9: PHI (r1v21 int) = (r1v10 int), (r1v22 int) binds: [B:106:0x01d7, B:232:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:126:0x0215  */
    /* JADX WARN: Code duplicated, block: B:130:0x021c  */
    /* JADX WARN: Code duplicated, block: B:132:0x023e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0254  */
    /* JADX WARN: Code duplicated, block: B:135:0x0257  */
    /* JADX WARN: Code duplicated, block: B:137:0x025d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0260  */
    /* JADX WARN: Code duplicated, block: B:142:0x0267  */
    /* JADX WARN: Code duplicated, block: B:197:0x036d  */
    /* JADX WARN: Code duplicated, block: B:226:0x01f1 A[EDGE_INSN: B:226:0x01f1->B:117:0x01f1 BREAK  A[LOOP:3: B:104:0x01cf->B:115:0x01ed], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x01e5 A[EDGE_INSN: B:230:0x01e5->B:111:0x01e5 BREAK  A[LOOP:4: B:107:0x01d9->B:232:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:4:0x0029  */
    /* JADX WARN: Code duplicated, block: B:74:0x013c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0147  */
    /* JADX WARN: Code duplicated, block: B:79:0x014d  */
    public final void c(y yVar, String str) {
        int i10;
        int i11;
        int i12;
        int iG;
        byte bCharAt;
        int i13;
        int i14;
        String str2;
        int i15;
        int i16;
        char cCharAt;
        p210v8.i.f(str, "input");
        byte[] bArr = Y9.c.a;
        int iN = Y9.c.n(0, str, str.length());
        int iO = Y9.c.o(iN, str, str.length());
        if (iO - iN < 2) {
            i11 = 6;
            i10 = -1;
        } else {
            char cCharAt2 = str.charAt(iN);
            char c10 = 'a';
            if ((p210v8.i.h(cCharAt2, 97) < 0 || p210v8.i.h(cCharAt2, 122) > 0) && (p210v8.i.h(cCharAt2, 65) < 0 || p210v8.i.h(cCharAt2, 90) > 0)) {
                i11 = 6;
                i10 = -1;
            } else {
                i10 = iN + 1;
                while (true) {
                    if (i10 < iO) {
                        int i17 = i10 + 1;
                        i11 = 6;
                        char cCharAt3 = str.charAt(i10);
                        if ((c10 <= cCharAt3 && cCharAt3 < '{') || (('A' <= cCharAt3 && cCharAt3 < '[') || (('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            i10 = i17;
                            c10 = 'a';
                        } else if (cCharAt3 != ':') {
                            i10 = -1;
                        }
                    } else {
                        i11 = 6;
                        i10 = -1;
                    }
                }
            }
        }
        if (i10 != -1) {
            if (L9.n.H(str, iN, "https:", true)) {
                this.a = "https";
                iN += 6;
            } else {
                if (!L9.n.H(str, iN, "http:", true)) {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String strSubstring = str.substring(0, i10);
                    p210v8.i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(strSubstring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
                this.a = "http";
                iN += 5;
            }
        } else {
            if (yVar == null) {
                int i18 = i11;
                throw new IllegalArgumentException(p210v8.i.k(str.length() > i18 ? p210v8.i.k("...", L9.f.i0(i18, str)) : str, "Expected URL scheme 'http' or 'https' but no scheme was found for "));
            }
            this.a = yVar.a;
        }
        int i19 = iN;
        int i20 = 0;
        while (i19 < iO) {
            int i21 = i19 + 1;
            char cCharAt4 = str.charAt(i19);
            if (cCharAt4 != '\\' && cCharAt4 != '/') {
                break;
            }
            i20++;
            i19 = i21;
        }
        ArrayList arrayList = this.f5652f;
        char c11 = '#';
        if (i20 >= 2 || yVar == null) {
            i12 = iN + i20;
            boolean z6 = false;
            boolean z10 = false;
            while (true) {
                iG = Y9.c.g(str, i12, "@/\\?#", iO);
                if (iG != iO) {
                    bCharAt = str.charAt(iG);
                } else {
                    bCharAt = -1;
                }
                if (bCharAt == -1 || bCharAt == c11 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z6) {
                        this.f5649c += "%40" + C0456b.b(str, i12, iG, " \"':;<=>@[]^`{}|/\\?#", 240);
                        z6 = z6;
                    } else {
                        boolean z11 = z6;
                        int iF = Y9.c.f(str, ':', i12, iG);
                        String strB = C0456b.b(str, i12, iF, " \"':;<=>@[]^`{}|/\\?#", 240);
                        if (z10) {
                            strB = this.f5648b + "%40" + strB;
                        }
                        this.f5648b = strB;
                        if (iF != iG) {
                            this.f5649c = C0456b.b(str, iF + 1, iG, " \"':;<=>@[]^`{}|/\\?#", 240);
                            z6 = true;
                        } else {
                            z6 = z11;
                        }
                        z10 = true;
                    }
                    i12 = iG + 1;
                    c11 = '#';
                }
            }
            i13 = i12;
            while (true) {
                if (i13 >= iG) {
                    i13 = iG;
                    break;
                }
                cCharAt = str.charAt(i13);
                if (cCharAt == '[') {
                    do {
                        i13++;
                        if (i13 < iG) {
                            break;
                        }
                    } while (str.charAt(i13) != ']');
                } else if (cCharAt == ':') {
                    break;
                }
                i13++;
            }
            i14 = i13 + 1;
            if (i14 < iG) {
                this.f5650d = C3.a.q(C0456b.e(str, i12, i13, 4));
                try {
                    i16 = Integer.parseInt(C0456b.b(str, i14, iG, "", 248));
                    if (1 <= i16 || i16 >= 65536) {
                        i16 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f5651e = i16;
                if (i16 == -1) {
                    StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = str.substring(i14, iG);
                    p210v8.i.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(strSubstring2);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            } else {
                this.f5650d = C3.a.q(C0456b.e(str, i12, i13, 4));
                str2 = this.a;
                p210v8.i.c(str2);
                if (str2.equals("http")) {
                    i15 = 80;
                } else if (str2.equals("https")) {
                    i15 = 443;
                } else {
                    i15 = -1;
                }
                this.f5651e = i15;
            }
            if (this.f5650d != null) {
                StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = str.substring(i12, i13);
                p210v8.i.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                sb3.append(strSubstring3);
                sb3.append('\"');
                throw new IllegalArgumentException(sb3.toString().toString());
            }
            iN = iG;
        } else {
            if (p210v8.i.a(yVar.a, this.a)) {
                this.f5648b = yVar.e();
                this.f5649c = yVar.a();
                this.f5650d = yVar.f5658d;
                this.f5651e = yVar.f5659e;
                arrayList.clear();
                arrayList.addAll(yVar.c());
                if (iN == iO || str.charAt(iN) == '#') {
                    String strD = yVar.d();
                    this.f5653g = strD == null ? null : C0456b.f(C0456b.b(strD, 0, 0, " \"'<>#", 211));
                }
            } else {
                i12 = iN + i20;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    iG = Y9.c.g(str, i12, "@/\\?#", iO);
                    if (iG != iO) {
                        bCharAt = str.charAt(iG);
                    } else {
                        bCharAt = -1;
                    }
                    if (bCharAt == -1) {
                        break;
                    } else {
                        break;
                    }
                }
                i13 = i12;
                while (true) {
                    if (i13 >= iG) {
                        i13 = iG;
                        break;
                    }
                    cCharAt = str.charAt(i13);
                    if (cCharAt == '[') {
                        do {
                            i13++;
                            if (i13 < iG) {
                                break;
                                break;
                            }
                        } while (str.charAt(i13) != ']');
                    } else if (cCharAt == ':') {
                        break;
                        break;
                    }
                    i13++;
                }
                i14 = i13 + 1;
                if (i14 < iG) {
                    this.f5650d = C3.a.q(C0456b.e(str, i12, i13, 4));
                    i16 = Integer.parseInt(C0456b.b(str, i14, iG, "", 248));
                    if (1 <= i16) {
                        i16 = -1;
                    } else {
                        i16 = -1;
                    }
                    this.f5651e = i16;
                    if (i16 == -1) {
                        StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring4 = str.substring(i14, iG);
                        p210v8.i.e(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb4.append(strSubstring4);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    this.f5650d = C3.a.q(C0456b.e(str, i12, i13, 4));
                    str2 = this.a;
                    p210v8.i.c(str2);
                    if (str2.equals("http")) {
                        i15 = 80;
                    } else if (str2.equals("https")) {
                        i15 = 443;
                    } else {
                        i15 = -1;
                    }
                    this.f5651e = i15;
                }
                if (this.f5650d != null) {
                    StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring5 = str.substring(i12, i13);
                    p210v8.i.e(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb5.append(strSubstring5);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iN = iG;
            }
        }
        int iG2 = Y9.c.g(str, iN, "?#", iO);
        if (iN != iG2) {
            char cCharAt5 = str.charAt(iN);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iN++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iN < iG2) {
                int iG3 = Y9.c.g(str, iN, "/\\", iG2);
                boolean z14 = iG3 < iG2;
                String strB2 = C0456b.b(str, iN, iG3, " \"<>^`{}|/\\?#", 240);
                if (!strB2.equals(".") && !strB2.equalsIgnoreCase("%2e")) {
                    if (!strB2.equals("..") && !strB2.equalsIgnoreCase("%2e.") && !strB2.equalsIgnoreCase(".%2e") && !strB2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strB2);
                        } else {
                            arrayList.add(strB2);
                        }
                        if (z14) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iN = z14 ? iG3 + 1 : iG3;
            }
        }
        if (iG2 < iO && str.charAt(iG2) == '?') {
            int iF2 = Y9.c.f(str, '#', iG2, iO);
            this.f5653g = C0456b.f(C0456b.b(str, iG2 + 1, iF2, " \"'<>#", 208));
            iG2 = iF2;
        }
        if (iG2 >= iO || str.charAt(iG2) != '#') {
            return;
        }
        this.f5654h = C0456b.b(str, iG2 + 1, iO, "", 176);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f5648b.length() > 0 || this.f5649c.length() > 0) {
            sb.append(this.f5648b);
            if (this.f5649c.length() > 0) {
                sb.append(':');
                sb.append(this.f5649c);
            }
            sb.append('@');
        }
        String str2 = this.f5650d;
        if (str2 != null) {
            if (L9.f.K(str2, ':')) {
                sb.append('[');
                sb.append(this.f5650d);
                sb.append(']');
            } else {
                sb.append(this.f5650d);
            }
        }
        int i10 = -1;
        if (this.f5651e != -1 || this.a != null) {
            int iB = b();
            String str3 = this.a;
            if (str3 == null) {
                sb.append(':');
                sb.append(iB);
            } else {
                if (str3.equals("http")) {
                    i10 = 80;
                } else if (str3.equals("https")) {
                    i10 = 443;
                }
                if (iB != i10) {
                    sb.append(':');
                    sb.append(iB);
                }
            }
        }
        ArrayList arrayList = this.f5652f;
        p210v8.i.f(arrayList, "<this>");
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb.append('/');
            sb.append((String) arrayList.get(i11));
        }
        if (this.f5653g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f5653g;
            p210v8.i.c(arrayList2);
            C0456b.g(arrayList2, sb);
        }
        if (this.f5654h != null) {
            sb.append('#');
            sb.append(this.f5654h);
        }
        String string = sb.toString();
        p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
