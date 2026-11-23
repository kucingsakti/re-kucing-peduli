package sa;

import java.util.Arrays;
import org.jsoup.helper.ValidationException;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final char[] f14837t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f14838u = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final C0787a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f14839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e1 f14840c = e1.f14948s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public K0.n f14841d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14842e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14843f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StringBuilder f14844g = new StringBuilder(1024);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StringBuilder f14845h = new StringBuilder(1024);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L f14846i;
    public final K j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public M f14847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final G f14848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final I f14849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final H f14850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f14851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f14852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f14854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f14855s;

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f14837t = cArr;
        Arrays.sort(cArr);
    }

    public N(C0787a c0787a, C c10) {
        L l4 = new L();
        this.f14846i = l4;
        this.j = new K();
        this.f14847k = l4;
        this.f14848l = new G();
        this.f14849m = new I();
        this.f14850n = new H();
        this.f14853q = -1;
        this.f14854r = new int[1];
        this.f14855s = new int[2];
        this.a = c0787a;
        this.f14839b = c10;
    }

    public final void a(String str, Object... objArr) {
        C c10 = this.f14839b;
        if (c10.d()) {
            String str2 = String.format("Invalid character reference: ".concat(str), objArr);
            o1.r rVar = new o1.r(17);
            C0787a c0787a = this.a;
            c0787a.getClass();
            rVar.f13675t = c0787a.m();
            rVar.f13676u = str2;
            c10.add(rVar);
        }
    }

    public final int[] b(Character ch, boolean z6) {
        int i10;
        char c10;
        char c11;
        char c12;
        char c13;
        int[] iArr;
        int i11;
        String strC;
        char c14;
        int iIntValue;
        int i12;
        char c15;
        C0787a c0787a = this.a;
        if (!c0787a.n() && (ch == null || ch.charValue() != c0787a.l())) {
            char[] cArr = f14837t;
            c0787a.b();
            if (c0787a.n() || Arrays.binarySearch(cArr, c0787a.a[c0787a.f14859e]) < 0) {
                if (c0787a.f14857c - c0787a.f14859e < 1024) {
                    c0787a.f14858d = 0;
                }
                c0787a.b();
                c0787a.f14861g = c0787a.f14859e;
                boolean zP = c0787a.p("#");
                char c16 = 'A';
                int[] iArr2 = this.f14854r;
                if (zP) {
                    boolean zQ = c0787a.q("X");
                    if (zQ) {
                        c0787a.b();
                        int i13 = c0787a.f14859e;
                        while (true) {
                            i12 = c0787a.f14859e;
                            iArr = null;
                            if (i12 >= c0787a.f14857c || (((c15 = c0787a.a[i12]) < '0' || c15 > '9') && ((c15 < c16 || c15 > 'F') && (c15 < 'a' || c15 > 'f')))) {
                                break;
                            }
                            c0787a.f14859e = i12 + 1;
                            c16 = 'A';
                        }
                        strC = C0787a.c(c0787a.a, c0787a.f14862h, i13, i12 - i13);
                    } else {
                        iArr = null;
                        c0787a.b();
                        int i14 = c0787a.f14859e;
                        while (true) {
                            i11 = c0787a.f14859e;
                            if (i11 >= c0787a.f14857c || (c14 = c0787a.a[i11]) < '0' || c14 > '9') {
                                break;
                            }
                            c0787a.f14859e = i11 + 1;
                        }
                        strC = C0787a.c(c0787a.a, c0787a.f14862h, i14, i11 - i14);
                    }
                    if (strC.length() == 0) {
                        a("numeric reference with no numerals", new Object[0]);
                        c0787a.x();
                        return iArr;
                    }
                    c0787a.f14861g = -1;
                    if (!c0787a.p(";")) {
                        a("missing semicolon on [&#%s]", strC);
                    }
                    try {
                        iIntValue = Integer.valueOf(strC, zQ ? 16 : 10).intValue();
                    } catch (NumberFormatException unused) {
                        iIntValue = -1;
                    }
                    if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                        a("character [%s] outside of valid range", Integer.valueOf(iIntValue));
                        iArr2[0] = 65533;
                    } else {
                        if (iIntValue >= 128 && iIntValue < 160) {
                            a("character [%s] is not a valid unicode code point", Integer.valueOf(iIntValue));
                            iIntValue = f14838u[iIntValue - 128];
                        }
                        iArr2[0] = iIntValue;
                    }
                    return iArr2;
                }
                c0787a.b();
                int i15 = c0787a.f14859e;
                while (true) {
                    int i16 = c0787a.f14859e;
                    if (i16 >= c0787a.f14857c || (((c13 = c0787a.a[i16]) < 'A' || c13 > 'Z') && ((c13 < 'a' || c13 > 'z') && !Character.isLetter(c13)))) {
                        break;
                    }
                    c0787a.f14859e++;
                }
                while (true) {
                    i10 = c0787a.f14859e;
                    if (i10 >= c0787a.f14857c || (c12 = c0787a.a[i10]) < '0' || c12 > '9') {
                        break;
                    }
                    c0787a.f14859e = i10 + 1;
                }
                String strC2 = C0787a.c(c0787a.a, c0787a.f14862h, i15, i10 - i15);
                boolean zR = c0787a.r(';');
                char[] cArr2 = org.jsoup.nodes.m.a;
                org.jsoup.nodes.l lVar = org.jsoup.nodes.l.base;
                int iBinarySearch = Arrays.binarySearch(lVar.f13888s, strC2);
                if ((iBinarySearch >= 0 ? lVar.f13889t[iBinarySearch] : -1) == -1) {
                    org.jsoup.nodes.l lVar2 = org.jsoup.nodes.l.extended;
                    int iBinarySearch2 = Arrays.binarySearch(lVar2.f13888s, strC2);
                    if ((iBinarySearch2 >= 0 ? lVar2.f13889t[iBinarySearch2] : -1) == -1 || !zR) {
                        c0787a.x();
                        if (!zR) {
                            return null;
                        }
                        a("invalid named reference [%s]", strC2);
                        return null;
                    }
                }
                if (z6 && (c0787a.u() || ((!c0787a.n() && (c11 = c0787a.a[c0787a.f14859e]) >= '0' && c11 <= '9') || c0787a.s('=', '-', '_')))) {
                    c0787a.x();
                    return null;
                }
                c0787a.f14861g = -1;
                if (!c0787a.p(";")) {
                    a("missing semicolon on [&%s]", strC2);
                }
                String str = (String) org.jsoup.nodes.m.f13892b.get(strC2);
                int[] iArr3 = this.f14855s;
                if (str != null) {
                    iArr3[0] = str.codePointAt(0);
                    iArr3[1] = str.codePointAt(1);
                    c10 = 2;
                } else {
                    org.jsoup.nodes.l lVar3 = org.jsoup.nodes.l.extended;
                    int iBinarySearch3 = Arrays.binarySearch(lVar3.f13888s, strC2);
                    int i17 = iBinarySearch3 >= 0 ? lVar3.f13889t[iBinarySearch3] : -1;
                    if (i17 != -1) {
                        iArr3[0] = i17;
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                }
                if (c10 == 1) {
                    iArr2[0] = iArr3[0];
                    return iArr2;
                }
                if (c10 == 2) {
                    return iArr3;
                }
                throw new ValidationException("Unexpected characters returned for ".concat(strC2));
            }
        }
        return null;
    }

    public final M c(boolean z6) {
        M m2;
        if (z6) {
            m2 = this.f14846i;
            m2.q();
        } else {
            m2 = this.j;
            m2.q();
        }
        this.f14847k = m2;
        return m2;
    }

    public final void d() {
        K0.n.r(this.f14845h);
    }

    public final void e(char c10) {
        if (this.f14843f == null) {
            this.f14843f = String.valueOf(c10);
        } else {
            StringBuilder sb = this.f14844g;
            if (sb.length() == 0) {
                sb.append(this.f14843f);
            }
            sb.append(c10);
        }
        this.f14848l.getClass();
        this.a.getClass();
    }

    public final void f(K0.n nVar) {
        if (this.f14842e) {
            throw new ValidationException("Must be false");
        }
        this.f14841d = nVar;
        this.f14842e = true;
        nVar.getClass();
        C0787a c0787a = this.a;
        c0787a.getClass();
        this.f14853q = -1;
        int i10 = nVar.a;
        if (i10 == 2) {
            this.f14851o = ((L) nVar).f14827b;
            this.f14852p = null;
        } else if (i10 == 3) {
            K k3 = (K) nVar;
            if (k3.w()) {
                Object[] objArr = {k3.f14828c};
                C c10 = this.f14839b;
                if (c10.d()) {
                    c10.add(new o1.r(c0787a, "Attributes incorrectly present on end tag [/%s]", objArr));
                }
            }
        }
    }

    public final void g(String str) {
        if (this.f14843f == null) {
            this.f14843f = str;
        } else {
            StringBuilder sb = this.f14844g;
            if (sb.length() == 0) {
                sb.append(this.f14843f);
            }
            sb.append(str);
        }
        this.f14848l.getClass();
        this.a.getClass();
    }

    public final void h(StringBuilder sb) {
        if (this.f14843f == null) {
            this.f14843f = sb.toString();
        } else {
            StringBuilder sb2 = this.f14844g;
            if (sb2.length() == 0) {
                sb2.append(this.f14843f);
            }
            sb2.append((CharSequence) sb);
        }
        this.f14848l.getClass();
        this.a.getClass();
    }

    public final void i() {
        f(this.f14850n);
    }

    public final void j() {
        f(this.f14849m);
    }

    public final void k() {
        M m2 = this.f14847k;
        if (m2.f14831f) {
            m2.z();
        }
        f(this.f14847k);
    }

    public final void l(e1 e1Var) {
        C c10 = this.f14839b;
        if (c10.d()) {
            c10.add(new o1.r(this.a, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{e1Var}));
        }
    }

    public final void m(e1 e1Var) {
        C c10 = this.f14839b;
        if (c10.d()) {
            C0787a c0787a = this.a;
            c10.add(new o1.r(c0787a, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(c0787a.l()), e1Var}));
        }
    }

    public final boolean n() {
        return this.f14851o != null && this.f14847k.x().equalsIgnoreCase(this.f14851o);
    }

    public final void o(e1 e1Var) {
        int iOrdinal = e1Var.ordinal();
        C0787a c0787a = this.a;
        if (iOrdinal != 0) {
            if (iOrdinal == 7) {
                c0787a.w();
            }
        } else if (this.f14853q == -1) {
            this.f14853q = c0787a.w();
        }
        this.f14840c = e1Var;
    }
}
