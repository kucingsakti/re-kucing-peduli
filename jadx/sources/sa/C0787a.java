package sa;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.jsoup.UncheckedIOException;

/* JADX INFO: renamed from: sa.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0787a {
    public char[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StringReader f14856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14861g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f14862h = new String[512];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f14863i = null;
    public int j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f14865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14866m;

    public C0787a(StringReader stringReader, int i10) {
        qa.b.r(stringReader.markSupported());
        this.f14856b = stringReader;
        this.a = new char[Math.min(i10, 32768)];
        b();
    }

    public static String c(char[] cArr, String[] strArr, int i10, int i11) {
        if (i11 > 12) {
            return new String(cArr, i10, i11);
        }
        if (i11 < 1) {
            return "";
        }
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = (i13 * 31) + cArr[i10 + i14];
        }
        int i15 = i13 & 511;
        String str = strArr[i15];
        if (str != null && i11 == str.length()) {
            int i16 = i10;
            int i17 = i11;
            while (true) {
                int i18 = i17 - 1;
                if (i17 == 0) {
                    return str;
                }
                int i19 = i16 + 1;
                int i20 = i12 + 1;
                if (cArr[i16] == str.charAt(i12)) {
                    i16 = i19;
                    i17 = i18;
                    i12 = i20;
                }
            }
        }
        String str2 = new String(cArr, i10, i11);
        strArr[i15] = str2;
        return str2;
    }

    public final void a() {
        this.f14859e++;
    }

    public final void b() {
        int i10;
        int i11;
        boolean z6;
        if (this.f14864k || (i10 = this.f14859e) < this.f14858d) {
            return;
        }
        int i12 = this.f14861g;
        if (i12 != -1) {
            i11 = i10 - i12;
            i10 = i12;
        } else {
            i11 = 0;
        }
        try {
            long j = i10;
            long jSkip = this.f14856b.skip(j);
            this.f14856b.mark(32768);
            int i13 = 0;
            while (true) {
                z6 = true;
                if (i13 > 1024) {
                    break;
                }
                StringReader stringReader = this.f14856b;
                char[] cArr = this.a;
                int i14 = stringReader.read(cArr, i13, cArr.length - i13);
                if (i14 == -1) {
                    this.f14864k = true;
                }
                if (i14 <= 0) {
                    break;
                } else {
                    i13 += i14;
                }
            }
            this.f14856b.reset();
            if (i13 > 0) {
                if (jSkip != j) {
                    z6 = false;
                }
                qa.b.r(z6);
                this.f14857c = i13;
                this.f14860f += i10;
                this.f14859e = i11;
                if (this.f14861g != -1) {
                    this.f14861g = 0;
                }
                this.f14858d = Math.min(i13, 24576);
            }
            ArrayList arrayList = this.f14863i;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    int iO = o(this.f14860f);
                    if (iO == -1) {
                        iO = 0;
                    }
                    Integer num = (Integer) this.f14863i.get(iO);
                    num.getClass();
                    this.j += iO;
                    this.f14863i.clear();
                    this.f14863i.add(num);
                }
                for (int i15 = this.f14859e; i15 < this.f14857c; i15++) {
                    if (this.a[i15] == '\n') {
                        this.f14863i.add(Integer.valueOf(this.f14860f + 1 + i15));
                    }
                }
            }
            this.f14865l = null;
        } catch (IOException e10) {
            throw new UncheckedIOException(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        StringReader stringReader = this.f14856b;
        if (stringReader == null) {
            return;
        }
        try {
            stringReader.close();
        } catch (IOException unused) {
        } finally {
            this.f14856b = null;
            this.a = null;
            this.f14862h = null;
        }
    }

    public final char e() {
        b();
        int i10 = this.f14859e;
        char c10 = i10 >= this.f14857c ? (char) 65535 : this.a[i10];
        this.f14859e = i10 + 1;
        return c10;
    }

    public final String f(boolean z6) {
        int i10 = this.f14859e;
        int i11 = this.f14857c;
        char[] cArr = this.a;
        int i12 = i10;
        while (i12 < i11) {
            char c10 = cArr[i12];
            if (c10 == 0) {
                break;
            }
            if (c10 != '\"') {
                if (c10 == '&') {
                    break;
                }
                if (c10 == '\'') {
                    if (!z6) {
                        break;
                    }
                    break;
                }
                continue;
                i12++;
            }
            if (!z6) {
                break;
            }
            i12++;
        }
        this.f14859e = i12;
        return i12 > i10 ? c(this.a, this.f14862h, i10, i12 - i10) : "";
    }

    public final String g() {
        int i10 = this.f14859e;
        int i11 = this.f14857c;
        char[] cArr = this.a;
        int i12 = i10;
        while (i12 < i11) {
            char c10 = cArr[i12];
            if (c10 == 0 || c10 == '&' || c10 == '<') {
                break;
            }
            i12++;
        }
        this.f14859e = i12;
        return i12 > i10 ? c(this.a, this.f14862h, i10, i12 - i10) : "";
    }

    public final String h() {
        char c10;
        b();
        int i10 = this.f14859e;
        while (true) {
            int i11 = this.f14859e;
            if (i11 >= this.f14857c || (((c10 = this.a[i11]) < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !Character.isLetter(c10)))) {
                break;
            }
            this.f14859e++;
        }
        return c(this.a, this.f14862h, i10, this.f14859e - i10);
    }

    public final String i(char c10) {
        int i10;
        b();
        int i11 = this.f14859e;
        while (true) {
            if (i11 >= this.f14857c) {
                i10 = -1;
                break;
            }
            if (c10 == this.a[i11]) {
                i10 = i11 - this.f14859e;
                break;
            }
            i11++;
        }
        if (i10 != -1) {
            String strC = c(this.a, this.f14862h, this.f14859e, i10);
            this.f14859e += i10;
            return strC;
        }
        b();
        char[] cArr = this.a;
        String[] strArr = this.f14862h;
        int i12 = this.f14859e;
        String strC2 = c(cArr, strArr, i12, this.f14857c - i12);
        this.f14859e = this.f14857c;
        return strC2;
    }

    public final String j(char... cArr) {
        b();
        int i10 = this.f14859e;
        int i11 = this.f14857c;
        char[] cArr2 = this.a;
        int i12 = i10;
        loop0: while (i12 < i11) {
            for (char c10 : cArr) {
                if (cArr2[i12] == c10) {
                    break loop0;
                }
            }
            i12++;
        }
        this.f14859e = i12;
        return i12 > i10 ? c(this.a, this.f14862h, i10, i12 - i10) : "";
    }

    public final String k(char... cArr) {
        b();
        int i10 = this.f14859e;
        int i11 = this.f14857c;
        char[] cArr2 = this.a;
        int i12 = i10;
        while (i12 < i11 && Arrays.binarySearch(cArr, cArr2[i12]) < 0) {
            i12++;
        }
        this.f14859e = i12;
        return i12 > i10 ? c(this.a, this.f14862h, i10, i12 - i10) : "";
    }

    public final char l() {
        b();
        int i10 = this.f14859e;
        if (i10 >= this.f14857c) {
            return (char) 65535;
        }
        return this.a[i10];
    }

    public final String m() {
        int i10;
        int iO;
        StringBuilder sb = new StringBuilder();
        int iW = w();
        if (this.f14863i != null) {
            int iO2 = o(iW);
            i10 = iO2 == -1 ? this.j : iO2 + this.j + 1;
        } else {
            i10 = 1;
        }
        sb.append(i10);
        sb.append(":");
        int iW2 = w();
        if (this.f14863i != null && (iO = o(iW2)) != -1) {
            iW2 -= ((Integer) this.f14863i.get(iO)).intValue();
        }
        sb.append(iW2 + 1);
        return sb.toString();
    }

    public final boolean n() {
        b();
        return this.f14859e >= this.f14857c;
    }

    public final int o(int i10) {
        ArrayList arrayList = this.f14863i;
        if (arrayList == null) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i10));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    public final boolean p(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.f14857c - this.f14859e) {
            for (int i10 = 0; i10 < length; i10++) {
                if (str.charAt(i10) == this.a[this.f14859e + i10]) {
                }
            }
            this.f14859e = str.length() + this.f14859e;
            return true;
        }
        return false;
    }

    public final boolean q(String str) {
        b();
        int length = str.length();
        if (length <= this.f14857c - this.f14859e) {
            for (int i10 = 0; i10 < length; i10++) {
                if (Character.toUpperCase(str.charAt(i10)) == Character.toUpperCase(this.a[this.f14859e + i10])) {
                }
            }
            this.f14859e = str.length() + this.f14859e;
            return true;
        }
        return false;
    }

    public final boolean r(char c10) {
        return !n() && this.a[this.f14859e] == c10;
    }

    public final boolean s(char... cArr) {
        if (!n()) {
            b();
            char c10 = this.a[this.f14859e];
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean t() {
        if (n()) {
            return false;
        }
        char c10 = this.a[this.f14859e];
        if (c10 < 'A' || c10 > 'Z') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public final String toString() {
        int i10 = this.f14857c;
        int i11 = this.f14859e;
        return i10 - i11 < 0 ? "" : new String(this.a, i11, i10 - i11);
    }

    public final boolean u() {
        if (n()) {
            return false;
        }
        char c10 = this.a[this.f14859e];
        if (c10 < 'A' || c10 > 'Z') {
            return (c10 >= 'a' && c10 <= 'z') || Character.isLetter(c10);
        }
        return true;
    }

    public final int v(String str) {
        b();
        char cCharAt = str.charAt(0);
        int i10 = this.f14859e;
        while (i10 < this.f14857c) {
            if (cCharAt != this.a[i10]) {
                do {
                    i10++;
                    if (i10 >= this.f14857c) {
                        break;
                    }
                } while (cCharAt != this.a[i10]);
            }
            int i11 = i10 + 1;
            int length = (str.length() + i11) - 1;
            int i12 = this.f14857c;
            if (i10 < i12 && length <= i12) {
                int i13 = i11;
                for (int i14 = 1; i13 < length && str.charAt(i14) == this.a[i13]; i14++) {
                    i13++;
                }
                if (i13 == length) {
                    return i10 - this.f14859e;
                }
            }
            i10 = i11;
        }
        return -1;
    }

    public final int w() {
        return this.f14860f + this.f14859e;
    }

    public final void x() {
        int i10 = this.f14861g;
        if (i10 == -1) {
            throw new UncheckedIOException(new IOException("Mark invalid"));
        }
        this.f14859e = i10;
        this.f14861g = -1;
    }

    public final void y() {
        int i10 = this.f14859e;
        if (i10 < 1) {
            throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f14859e = i10 - 1;
    }
}
