package X9;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Iterable, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String[] f5647s;

    public w(String[] strArr) {
        this.f5647s = strArr;
    }

    public final String e(String str) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        String[] strArr = this.f5647s;
        int length = strArr.length - 2;
        int i10 = p068ga.l.i(length, 0, -2);
        if (i10 > length) {
            return null;
        }
        while (true) {
            int i11 = length - 2;
            if (L9.n.C(str, strArr[length], true)) {
                return strArr[length + 1];
            }
            if (length == i10) {
                return null;
            }
            length = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return Arrays.equals(this.f5647s, ((w) obj).f5647s);
        }
        return false;
    }

    public final String f(int i10) {
        return this.f5647s[i10 * 2];
    }

    public final M1.c g() {
        M1.c cVar = new M1.c(3);
        ArrayList arrayList = cVar.a;
        String[] strArr = this.f5647s;
        p210v8.i.f(arrayList, "<this>");
        arrayList.addAll(p086i8.i.l(strArr));
        return cVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5647s);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        p076h8.f[] fVarArr = new p076h8.f[size];
        for (int i10 = 0; i10 < size; i10++) {
            fVarArr[i10] = new p076h8.f(f(i10), m(i10));
        }
        return p210v8.x.g(fVarArr);
    }

    public final TreeMap k() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        p210v8.i.e(comparator, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String strF = f(i10);
            Locale locale = Locale.US;
            p210v8.i.e(locale, "US");
            String lowerCase = strF.toLowerCase(locale);
            p210v8.i.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m(i10));
            i10 = i11;
        }
        return treeMap;
    }

    public final String m(int i10) {
        return this.f5647s[(i10 * 2) + 1];
    }

    public final List n(String str) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        int size = size();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (str.equalsIgnoreCase(f(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m(i10));
            }
            i10 = i11;
        }
        if (arrayList == null) {
            return p086i8.s.f12328s;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        p210v8.i.e(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int size() {
        return this.f5647s.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String strF = f(i10);
            String strM = m(i10);
            sb.append(strF);
            sb.append(": ");
            if (Y9.c.q(strF)) {
                strM = "██";
            }
            sb.append(strM);
            sb.append("\n");
            i10 = i11;
        }
        String string = sb.toString();
        p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
