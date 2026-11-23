package L9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends J7.a {
    public static String x(String str) {
        int length;
        Comparable comparable;
        String strSubstring;
        p210v8.i.f(str, "<this>");
        List listT = f.T(str);
        List list = listT;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!n.D((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!D3.b.q(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listT.size();
        int iB = p086i8.l.B(listT);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i10 = length + 1;
            if (length < 0) {
                p086i8.l.G();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iB) && n.D(str3)) {
                strSubstring = null;
            } else {
                p210v8.i.f(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(E0.a.g("Requested character count ", iIntValue, " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                p210v8.i.e(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            length = i10;
        }
        StringBuilder sb = new StringBuilder(length3);
        p086i8.k.Y(arrayList3, sb, "\n", null, null, null, 124);
        String string = sb.toString();
        p210v8.i.e(string, "toString(...)");
        return string;
    }

    public static String y(String str) {
        p210v8.i.f(str, "<this>");
        if (n.D("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listT = f.T(str);
        int length = str.length();
        listT.size();
        int iB = p086i8.l.B(listT);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listT) {
            int i11 = i10 + 1;
            String strSubstring = null;
            if (i10 < 0) {
                p086i8.l.G();
                throw null;
            }
            String str2 = (String) obj;
            if ((i10 != 0 && i10 != iB) || !n.D(str2)) {
                int length2 = str2.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!D3.b.q(str2.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1 && n.H(str2, i12, "|", false)) {
                    strSubstring = str2.substring("|".length() + i12);
                    p210v8.i.e(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i10 = i11;
        }
        StringBuilder sb = new StringBuilder(length);
        p086i8.k.Y(arrayList, sb, "\n", null, null, null, 124);
        String string = sb.toString();
        p210v8.i.e(string, "toString(...)");
        return string;
    }
}
