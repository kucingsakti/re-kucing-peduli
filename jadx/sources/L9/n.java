package L9;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends m {
    public static boolean B(String str, String str2) {
        p210v8.i.f(str, "<this>");
        p210v8.i.f(str2, "suffix");
        return str.endsWith(str2);
    }

    public static boolean C(String str, String str2, boolean z6) {
        if (str == null) {
            return str2 == null;
        }
        return !z6 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean D(CharSequence charSequence) {
        p210v8.i.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            B8.c cVar = new B8.c(0, charSequence.length() - 1, 1);
            if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                B8.b bVarE = cVar.iterator();
                while (bVarE.f774u) {
                    if (!D3.b.q(charSequence.charAt(bVarE.a()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean E(int i10, int i11, int i12, String str, String str2, boolean z6) {
        p210v8.i.f(str, "<this>");
        p210v8.i.f(str2, "other");
        return !z6 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z6, i10, str2, i11, i12);
    }

    public static String F(String str, char c10, char c11) {
        p210v8.i.f(str, "<this>");
        String strReplace = str.replace(c10, c11);
        p210v8.i.e(strReplace, "replace(...)");
        return strReplace;
    }

    public static String G(String str, String str2, String str3) {
        p210v8.i.f(str, "<this>");
        p210v8.i.f(str2, "oldValue");
        p210v8.i.f(str3, "newValue");
        int iM = f.M(str, str2, 0, false);
        if (iM < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb.append((CharSequence) str, i11, iM);
            sb.append(str3);
            i11 = iM + length;
            if (iM >= str.length()) {
                break;
            }
            iM = f.M(str, str2, iM + i10, false);
        } while (iM > 0);
        sb.append((CharSequence) str, i11, str.length());
        String string = sb.toString();
        p210v8.i.e(string, "toString(...)");
        return string;
    }

    public static boolean H(String str, int i10, String str2, boolean z6) {
        p210v8.i.f(str, "<this>");
        return !z6 ? str.startsWith(str2, i10) : E(i10, 0, str2.length(), str, str2, z6);
    }

    public static boolean I(String str, String str2, boolean z6) {
        p210v8.i.f(str, "<this>");
        p210v8.i.f(str2, "prefix");
        return !z6 ? str.startsWith(str2) : E(0, 0, str2.length(), str, str2, z6);
    }
}
