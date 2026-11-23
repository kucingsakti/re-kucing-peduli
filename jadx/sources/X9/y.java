package X9;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final char[] f5655k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f5660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f5661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5663i;
    public final boolean j;

    public y(String str, String str2, String str3, String str4, int i10, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        p210v8.i.f(str, "scheme");
        p210v8.i.f(str4, "host");
        this.a = str;
        this.f5656b = str2;
        this.f5657c = str3;
        this.f5658d = str4;
        this.f5659e = i10;
        this.f5660f = arrayList;
        this.f5661g = arrayList2;
        this.f5662h = str5;
        this.f5663i = str6;
        this.j = str.equals("https");
    }

    public final String a() {
        if (this.f5657c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.f5663i;
        String strSubstring = str.substring(L9.f.O(str, ':', length, 4) + 1, L9.f.O(str, '@', 0, 6));
        p210v8.i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.f5663i;
        int iO = L9.f.O(str, '/', length, 4);
        String strSubstring = str.substring(iO, Y9.c.g(str, iO, "?#", str.length()));
        p210v8.i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.f5663i;
        int iO = L9.f.O(str, '/', length, 4);
        int iG = Y9.c.g(str, iO, "?#", str.length());
        ArrayList arrayList = new ArrayList();
        while (iO < iG) {
            int i10 = iO + 1;
            int iF = Y9.c.f(str, '/', i10, iG);
            String strSubstring = str.substring(i10, iF);
            p210v8.i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iO = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f5661g == null) {
            return null;
        }
        String str = this.f5663i;
        int iO = L9.f.O(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iO, Y9.c.f(str, '#', iO, str.length()));
        p210v8.i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f5656b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.f5663i;
        String strSubstring = str.substring(length, Y9.c.g(str, length, ":@", str.length()));
        p210v8.i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && p210v8.i.a(((y) obj).f5663i, this.f5663i);
    }

    public final x f(String str) {
        p210v8.i.f(str, "link");
        try {
            x xVar = new x();
            xVar.c(this, str);
            return xVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String g() {
        x xVarF = f("/...");
        p210v8.i.c(xVarF);
        xVarF.f5648b = C0456b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        xVarF.f5649c = C0456b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return xVarF.a().f5663i;
    }

    public final y h(String str) {
        p210v8.i.f(str, "link");
        x xVarF = f(str);
        if (xVarF == null) {
            return null;
        }
        return xVarF.a();
    }

    public final int hashCode() {
        return this.f5663i.hashCode();
    }

    public final URI i() {
        String strSubstring;
        String strReplaceAll;
        x xVar = new x();
        String str = this.a;
        xVar.a = str;
        xVar.f5648b = e();
        xVar.f5649c = a();
        xVar.f5650d = this.f5658d;
        p210v8.i.f(str, "scheme");
        int i10 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i11 = this.f5659e;
        xVar.f5651e = i11 != i10 ? i11 : -1;
        ArrayList arrayList = xVar.f5652f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        xVar.f5653g = strD == null ? null : C0456b.f(C0456b.b(strD, 0, 0, " \"'<>#", 211));
        if (this.f5662h == null) {
            strSubstring = null;
        } else {
            String str2 = this.f5663i;
            strSubstring = str2.substring(L9.f.O(str2, '#', 0, 6) + 1);
            p210v8.i.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        xVar.f5654h = strSubstring;
        String str3 = xVar.f5650d;
        if (str3 == null) {
            strReplaceAll = null;
        } else {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            p210v8.i.e(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            p210v8.i.e(strReplaceAll, "replaceAll(...)");
        }
        xVar.f5650d = strReplaceAll;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.set(i12, C0456b.b((String) arrayList.get(i12), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = xVar.f5653g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                int i14 = i13 + 1;
                String str4 = (String) arrayList2.get(i13);
                arrayList2.set(i13, str4 == null ? null : C0456b.b(str4, 0, 0, "\\^`{|}", 195));
                i13 = i14;
            }
        }
        String str5 = xVar.f5654h;
        xVar.f5654h = str5 != null ? C0456b.b(str5, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String string = xVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                p210v8.i.e(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                p210v8.i.e(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                p210v8.i.e(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final String toString() {
        return this.f5663i;
    }
}
