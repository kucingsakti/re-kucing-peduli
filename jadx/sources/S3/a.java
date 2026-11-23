package S3;

import org.jsoup.helper.ValidationException;
import qa.b;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4529c;

    public a(int i10, String str) {
        this.a = 0;
        this.f4529c = i10;
        this.f4528b = str;
    }

    public static String m(String str) {
        StringBuilder sbB = ra.a.b();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i10 = 0;
        char c10 = 0;
        while (i10 < length) {
            char c11 = charArray[i10];
            if (c11 != '\\') {
                sbB.append(c11);
            } else if (c10 == '\\') {
                sbB.append(c11);
            }
            i10++;
            c10 = c11;
        }
        return ra.a.g(sbB);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0071 A[LOOP:0: B:3:0x0009->B:45:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0055 A[EDGE_INSN: B:47:0x0055->B:38:0x0055 BREAK  A[LOOP:0: B:3:0x0009->B:45:0x0071], SYNTHETIC] */
    public String a(char c10, char c11) {
        int i10 = -1;
        int i11 = -1;
        char c12 = 0;
        boolean z6 = false;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        while (!g()) {
            char c13 = c();
            if (c12 != '\\') {
                if (c13 == '\'' && c13 != c10 && !z6) {
                    z10 = !z10;
                } else if (c13 == '\"' && c13 != c10 && !z10) {
                    z6 = !z6;
                }
                if (!z10 && !z6 && !z11) {
                    if (c13 == c10) {
                        i12++;
                        if (i10 == -1) {
                            i10 = this.f4529c;
                        }
                    } else if (c13 == c11) {
                        i12--;
                    }
                }
                if (i12 <= 0) {
                    break;
                }
                c12 = c13;
            } else if (c13 == 'Q') {
                z11 = true;
            } else if (c13 == 'E') {
                z11 = false;
            }
            if (i12 > 0 && c12 != 0) {
                i11 = this.f4529c;
            }
            if (i12 <= 0) {
                break;
                break;
            }
            c12 = c13;
        }
        String strSubstring = i11 >= 0 ? this.f4528b.substring(i10, i11) : "";
        if (i12 <= 0) {
            return strSubstring;
        }
        throw new ValidationException(E0.a.i("Did not find balanced marker at '", strSubstring, "'"));
    }

    public String b() {
        String strL;
        int i10 = this.f4529c;
        String str = this.f4528b;
        int iIndexOf = str.indexOf(")", i10);
        if (iIndexOf != -1) {
            strL = str.substring(this.f4529c, iIndexOf);
            this.f4529c = strL.length() + this.f4529c;
        } else {
            strL = l();
        }
        h(")");
        return strL;
    }

    public char c() {
        int i10 = this.f4529c;
        this.f4529c = i10 + 1;
        return this.f4528b.charAt(i10);
    }

    public void d(String str) {
        if (!i(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = this.f4528b.length();
        int i10 = this.f4529c;
        if (length > length2 - i10) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f4529c = i10 + length;
    }

    public String e() {
        String str;
        int i10 = this.f4529c;
        loop0: while (true) {
            boolean zG = g();
            str = this.f4528b;
            if (zG) {
                break;
            }
            if (!k()) {
                char[] cArr = {'-', '_'};
                if (!g()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= 2) {
                            break loop0;
                        }
                        if (str.charAt(this.f4529c) == cArr[i11]) {
                            break;
                        }
                        i11++;
                    }
                } else {
                    break;
                }
            }
            this.f4529c++;
        }
        return str.substring(i10, this.f4529c);
    }

    public boolean f() {
        boolean z6 = false;
        while (!g() && ra.a.e(this.f4528b.charAt(this.f4529c))) {
            this.f4529c++;
            z6 = true;
        }
        return z6;
    }

    public boolean g() {
        return this.f4528b.length() - this.f4529c == 0;
    }

    public boolean h(String str) {
        if (!i(str)) {
            return false;
        }
        this.f4529c = str.length() + this.f4529c;
        return true;
    }

    public boolean i(String str) {
        return this.f4528b.regionMatches(true, this.f4529c, str, 0, str.length());
    }

    public boolean j(String... strArr) {
        for (String str : strArr) {
            if (i(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        return !g() && Character.isLetterOrDigit(this.f4528b.charAt(this.f4529c));
    }

    public String l() {
        int i10 = this.f4529c;
        String str = this.f4528b;
        String strSubstring = str.substring(i10);
        this.f4529c = str.length();
        return strSubstring;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.f4528b.substring(this.f4529c);
            default:
                return super.toString();
        }
    }

    public a(String str) {
        this.a = 1;
        this.f4529c = 0;
        b.w(str);
        this.f4528b = str;
    }
}
