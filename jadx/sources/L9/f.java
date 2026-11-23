package L9;

import K9.r;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends n {
    public static boolean J(CharSequence charSequence, CharSequence charSequence2, boolean z6) {
        p210v8.i.f(charSequence, "<this>");
        p210v8.i.f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (P(charSequence, (String) charSequence2, 0, z6, 2) >= 0) {
                return true;
            }
        } else if (N(charSequence, charSequence2, 0, charSequence.length(), z6, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean K(CharSequence charSequence, char c10) {
        p210v8.i.f(charSequence, "<this>");
        return O(charSequence, c10, 0, 2) >= 0;
    }

    public static int L(CharSequence charSequence) {
        p210v8.i.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int M(CharSequence charSequence, String str, int i10, boolean z6) {
        p210v8.i.f(charSequence, "<this>");
        p210v8.i.f(str, "string");
        return (z6 || !(charSequence instanceof String)) ? N(charSequence, str, i10, charSequence.length(), z6, false) : ((String) charSequence).indexOf(str, i10);
    }

    public static final int N(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z6, boolean z10) {
        B8.a aVar;
        if (z10) {
            int iL = L(charSequence);
            if (i10 > iL) {
                i10 = iL;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            aVar = new B8.a(i10, i11, -1);
        } else {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            aVar = new B8.c(i10, i11, 1);
        }
        boolean z11 = charSequence instanceof String;
        int i12 = aVar.f771u;
        int i13 = aVar.f770t;
        int i14 = aVar.f769s;
        if (!z11 || !(charSequence2 instanceof String)) {
            boolean z12 = z6;
            if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z13 = z12;
                    z12 = z13;
                    if (V(charSequence4, 0, charSequence3, i14, charSequence2.length(), z13)) {
                        return i14;
                    }
                    if (i14 != i13) {
                        i14 += i12;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    }
                }
            }
        } else if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
            int i15 = i14;
            while (true) {
                boolean z14 = z6;
                if (n.E(0, i15, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, z14)) {
                    return i15;
                }
                if (i15 != i13) {
                    i15 += i12;
                    z6 = z14;
                }
            }
        }
        return -1;
    }

    public static int O(CharSequence charSequence, char c10, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        p210v8.i.f(charSequence, "<this>");
        return !(charSequence instanceof String) ? Q(charSequence, new char[]{c10}, i10, false) : ((String) charSequence).indexOf(c10, i10);
    }

    public static /* synthetic */ int P(CharSequence charSequence, String str, int i10, boolean z6, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z6 = false;
        }
        return M(charSequence, str, i10, z6);
    }

    public static final int Q(CharSequence charSequence, char[] cArr, int i10, boolean z6) {
        p210v8.i.f(charSequence, "<this>");
        if (!z6 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        B8.b bVarE = new B8.c(i10, L(charSequence), 1).iterator();
        while (bVarE.f774u) {
            int iA = bVarE.a();
            char cCharAt = charSequence.charAt(iA);
            for (char c10 : cArr) {
                if (D3.b.h(c10, cCharAt, z6)) {
                    return iA;
                }
            }
        }
        return -1;
    }

    public static int R(String str, char c10, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = L(str);
        }
        p210v8.i.f(str, "<this>");
        return str.lastIndexOf(c10, i10);
    }

    public static int S(String str, int i10, String str2) {
        int iL = (i10 & 2) != 0 ? L(str) : 0;
        p210v8.i.f(str, "<this>");
        p210v8.i.f(str2, "string");
        return str.lastIndexOf(str2, iL);
    }

    public static List T(String str) {
        p210v8.i.f(str, "<this>");
        return K9.n.B(K9.n.z(U(str, new String[]{"\r\n", "\n", "\r"}, 0), new A0.i(str, 1)));
    }

    public static c U(CharSequence charSequence, String[] strArr, int i10) {
        Y(i10);
        return new c(charSequence, i10, new o(p086i8.i.l(strArr), 1));
    }

    public static final boolean V(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z6) {
        p210v8.i.f(charSequence, "<this>");
        p210v8.i.f(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!D3.b.h(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z6)) {
                return false;
            }
        }
        return true;
    }

    public static String W(String str, String str2) {
        p210v8.i.f(str, "<this>");
        if (!n.I(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        p210v8.i.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String X(String str, String str2) {
        p210v8.i.f(str, "<this>");
        if (!n.B(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        p210v8.i.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void Y(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0487g.g(i10, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List Z(CharSequence charSequence, String str, int i10) {
        Y(i10);
        int iM = M(charSequence, str, 0, false);
        if (iM == -1 || i10 == 1) {
            return com.bumptech.glide.d.u(charSequence.toString());
        }
        boolean z6 = i10 > 0;
        int i11 = 10;
        if (z6 && i10 <= 10) {
            i11 = i10;
        }
        ArrayList arrayList = new ArrayList(i11);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM).toString());
            length = str.length() + iM;
            if (z6 && arrayList.size() == i10 - 1) {
                break;
            }
            iM = M(charSequence, str, length, false);
        } while (iM != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List a0(CharSequence charSequence, String[] strArr, int i10) {
        int i11 = (i10 & 4) != 0 ? 0 : 2;
        p210v8.i.f(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return Z(charSequence, str, i11);
            }
        }
        c cVarU = U(charSequence, strArr, i11);
        ArrayList arrayList = new ArrayList(p086i8.m.H(new r(cVarU, 0), 10));
        Iterator it = cVarU.iterator();
        while (it.hasNext()) {
            arrayList.add(c0(charSequence, (B8.c) it.next()));
        }
        return arrayList;
    }

    public static List b0(String str, char[] cArr) {
        p210v8.i.f(str, "<this>");
        if (cArr.length == 1) {
            return Z(str, String.valueOf(cArr[0]), 0);
        }
        Y(0);
        c cVar = new c(str, 0, new o(cArr, 0));
        ArrayList arrayList = new ArrayList(p086i8.m.H(new r(cVar, 0), 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(c0(str, (B8.c) it.next()));
        }
        return arrayList;
    }

    public static final String c0(CharSequence charSequence, B8.c cVar) {
        p210v8.i.f(charSequence, "<this>");
        p210v8.i.f(cVar, "range");
        return charSequence.subSequence(cVar.f769s, cVar.f770t + 1).toString();
    }

    public static String d0(String str, String str2, String str3) {
        p210v8.i.f(str2, "delimiter");
        int iP = P(str, str2, 0, false, 6);
        if (iP == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iP, str.length());
        p210v8.i.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String e0(String str) {
        int iO = O(str, '$', 0, 6);
        if (iO == -1) {
            return str;
        }
        String strSubstring = str.substring(iO + 1, str.length());
        p210v8.i.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String f0(String str, char c10, String str2) {
        p210v8.i.f(str, "<this>");
        p210v8.i.f(str2, "missingDelimiterValue");
        int iR = R(str, c10, 0, 6);
        if (iR == -1) {
            return str2;
        }
        String strSubstring = str.substring(iR + 1, str.length());
        p210v8.i.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String g0(String str, String str2) {
        p210v8.i.f(str, "<this>");
        p210v8.i.f(str, "missingDelimiterValue");
        int iP = P(str, str2, 0, false, 6);
        if (iP == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iP);
        p210v8.i.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String h0(String str, String str2) {
        p210v8.i.f(str, "<this>");
        int iS = S(str, 6, ".");
        if (iS == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iS);
        p210v8.i.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String i0(int i10, String str) {
        p210v8.i.f(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(E0.a.g("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(0, i10);
        p210v8.i.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence j0(String str) {
        p210v8.i.f(str, "<this>");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z6 = false;
        while (i10 <= length) {
            boolean zQ = D3.b.q(str.charAt(!z6 ? i10 : length));
            if (z6) {
                if (!zQ) {
                    break;
                }
                length--;
            } else if (zQ) {
                i10++;
            } else {
                z6 = true;
            }
        }
        return str.subSequence(i10, length + 1);
    }

    public static String k0(String str, char... cArr) {
        p210v8.i.f(str, "<this>");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z6 = false;
        while (i10 <= length) {
            char cCharAt = str.charAt(!z6 ? i10 : length);
            int length2 = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    i11 = -1;
                    break;
                }
                if (cCharAt == cArr[i11]) {
                    break;
                }
                i11++;
            }
            boolean z10 = i11 >= 0;
            if (z6) {
                if (!z10) {
                    break;
                }
                length--;
            } else if (z10) {
                i10++;
            } else {
                z6 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }
}
