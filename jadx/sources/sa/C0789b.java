package sa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.jsoup.helper.ValidationException;

/* JADX INFO: renamed from: sa.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0789b {
    public p102k7.e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0787a f14875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public N f14876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public org.jsoup.nodes.h f14877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f14878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public K0.n f14880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public D f14881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f14882i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public B f14884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public B f14885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public org.jsoup.nodes.k f14887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public org.jsoup.nodes.n f14888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f14889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f14890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f14891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public K f14892t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14893u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14894v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String[] f14872x = {"applet", "caption", com.onesignal.inAppMessages.internal.d.HTML, "marquee", "object", "table", "td", "th"};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String[] f14873y = {"ol", "ul"};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String[] f14874z = {"button"};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String[] f14867A = {com.onesignal.inAppMessages.internal.d.HTML, "table"};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String[] f14868B = {"optgroup", "option"};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String[] f14869C = {"dd", "dt", "li", "optgroup", "option", R5.a.PUSH_MINIFIED_BUTTON_ICON, "rb", "rp", "rt", "rtc"};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String[] f14870D = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", R5.a.PUSH_MINIFIED_BUTTON_ICON, "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f14871E = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", com.onesignal.inAppMessages.internal.d.HTML, "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", R5.a.PUSH_MINIFIED_BUTTON_ICON, "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    public L j = new L();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public K f14883k = new K();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String[] f14895w = {null};

    public static boolean z(ArrayList arrayList, org.jsoup.nodes.k kVar) {
        int size = arrayList.size();
        int i10 = size - 1;
        int i11 = i10 >= 256 ? size - 257 : 0;
        while (i10 >= i11) {
            if (((org.jsoup.nodes.k) arrayList.get(i10)) == kVar) {
                return true;
            }
            i10--;
        }
        return false;
    }

    public final void A() {
    }

    public final void B(String str) {
        for (int size = this.f14878e.size() - 1; size >= 0; size--) {
            org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) this.f14878e.get(size);
            this.f14878e.remove(size);
            if (kVar.f13880v.f14812t.equals(str)) {
                boolean z6 = this.f14880g instanceof K;
                return;
            }
        }
    }

    public final void C() {
        if (this.f14890r.size() > 0) {
            ArrayList arrayList = this.f14890r;
        }
    }

    public final boolean D(K0.n nVar) {
        this.f14880g = nVar;
        return this.f14884l.h(nVar, this);
    }

    public final boolean E(K0.n nVar, B b3) {
        this.f14880g = nVar;
        return b3.h(nVar, this);
    }

    public final boolean F(String str) {
        K0.n nVar = this.f14880g;
        K k3 = this.f14883k;
        if (nVar == k3) {
            K k10 = new K();
            k10.y(str);
            return D(k10);
        }
        k3.q();
        k3.y(str);
        return D(k3);
    }

    public final void G(String str) {
        K0.n nVar = this.f14880g;
        L l4 = this.j;
        if (nVar == l4) {
            L l10 = new L();
            l10.y(str);
            D(l10);
        } else {
            l4.q();
            l4.y(str);
            D(l4);
        }
    }

    public final void H(B b3) {
        this.f14890r.add(b3);
    }

    public final void I() {
        org.jsoup.nodes.k kVar;
        if (this.f14878e.size() > 256) {
            return;
        }
        boolean z6 = true;
        if (this.f14889q.size() > 0) {
            ArrayList arrayList = this.f14889q;
            kVar = (org.jsoup.nodes.k) arrayList.get(arrayList.size() - 1);
        } else {
            kVar = null;
        }
        if (kVar == null || z(this.f14878e, kVar)) {
            return;
        }
        int size = this.f14889q.size();
        int i10 = size - 12;
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = size - 1;
        int i12 = i11;
        while (i12 != i10) {
            i12--;
            kVar = (org.jsoup.nodes.k) this.f14889q.get(i12);
            if (kVar == null || z(this.f14878e, kVar)) {
                z6 = false;
                break;
            }
        }
        while (true) {
            if (!z6) {
                i12++;
                kVar = (org.jsoup.nodes.k) this.f14889q.get(i12);
            }
            qa.b.w(kVar);
            org.jsoup.nodes.k kVar2 = new org.jsoup.nodes.k(N(kVar.f13880v.f14812t, this.f14881h), null, kVar.e().clone());
            x(kVar2);
            this.f14878e.add(kVar2);
            this.f14889q.set(i12, kVar2);
            if (i12 == i11) {
                return;
            } else {
                z6 = false;
            }
        }
    }

    public final void J(org.jsoup.nodes.k kVar) {
        for (int size = this.f14889q.size() - 1; size >= 0; size--) {
            if (((org.jsoup.nodes.k) this.f14889q.get(size)) == kVar) {
                this.f14889q.remove(size);
                return;
            }
        }
    }

    public final void K(org.jsoup.nodes.k kVar) {
        for (int size = this.f14878e.size() - 1; size >= 0; size--) {
            if (((org.jsoup.nodes.k) this.f14878e.get(size)) == kVar) {
                this.f14878e.remove(size);
                return;
            }
        }
    }

    public final void L() {
        org.jsoup.nodes.k kVarC;
        org.jsoup.nodes.k kVarC2;
        if (!y("body")) {
            ArrayList arrayList = this.f14878e;
            org.jsoup.nodes.h hVar = this.f14877d;
            Iterator it = hVar.E().iterator();
            do {
                if (!it.hasNext()) {
                    kVarC = hVar.C(com.onesignal.inAppMessages.internal.d.HTML);
                    break;
                }
                kVarC = (org.jsoup.nodes.k) it.next();
            } while (!kVarC.f13880v.f14812t.equals(com.onesignal.inAppMessages.internal.d.HTML));
            Iterator it2 = kVarC.E().iterator();
            do {
                if (!it2.hasNext()) {
                    kVarC2 = kVarC.C("body");
                    break;
                } else {
                    kVarC2 = (org.jsoup.nodes.k) it2.next();
                    if ("body".equals(kVarC2.f13880v.f14812t)) {
                        break;
                    }
                }
            } while (!"frameset".equals(kVarC2.f13880v.f14812t));
            arrayList.add(kVarC2);
        }
        this.f14884l = B.f14797y;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x0176 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:113:0x0177 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:127:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x013d A[LOOP:0: B:10:0x0022->B:98:0x013d, LOOP_END] */
    public final boolean M() {
        B b3;
        int size = this.f14878e.size();
        int i10 = size - 1;
        int i11 = i10 >= 256 ? size - 257 : 0;
        B b7 = this.f14884l;
        if (this.f14878e.size() == 0) {
            this.f14884l = B.f14797y;
        }
        boolean z6 = false;
        while (i10 >= i11) {
            org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) this.f14878e.get(i10);
            if (i10 == i11) {
                z6 = true;
            }
            String str = kVar != null ? kVar.f13880v.f14812t : "";
            str.getClass();
            switch (str) {
                case "frameset":
                    this.f14884l = B.f14786L;
                    if (this.f14884l != b7) {
                        return true;
                    }
                    return false;
                case "template":
                    if (this.f14890r.size() > 0) {
                        ArrayList arrayList = this.f14890r;
                        b3 = (B) arrayList.get(arrayList.size() - 1);
                    } else {
                        b3 = null;
                    }
                    if (b3 == null) {
                        throw new ValidationException("Bug: no template insertion mode on stack!");
                    }
                    this.f14884l = b3;
                    if (this.f14884l != b7) {
                        return true;
                    }
                    return false;
                case "select":
                    this.f14884l = B.f14782H;
                    if (this.f14884l != b7) {
                        return true;
                    }
                    return false;
                case "colgroup":
                    this.f14884l = B.f14778D;
                    if (this.f14884l != b7) {
                        return true;
                    }
                    return false;
                case "td":
                case "th":
                    if (z6) {
                        if (z6) {
                            i10--;
                        } else {
                            this.f14884l = B.f14797y;
                        }
                        break;
                    } else {
                        this.f14884l = B.f14781G;
                    }
                    if (this.f14884l != b7) {
                        return true;
                    }
                    return false;
                case "tr":
                    this.f14884l = B.f14780F;
                    if (this.f14884l != b7) {
                        return true;
                    }
                    return false;
                case "body":
                    this.f14884l = B.f14797y;
                    if (this.f14884l != b7) {
                        return true;
                    }
                    return false;
                case "head":
                    if (z6) {
                        if (z6) {
                            i10--;
                        } else {
                            this.f14884l = B.f14797y;
                        }
                        break;
                    } else {
                        this.f14884l = B.f14794v;
                    }
                    if (this.f14884l != b7) {
                        return true;
                    }
                    return false;
                case "html":
                    this.f14884l = this.f14887o == null ? B.f14793u : B.f14796x;
                    if (this.f14884l != b7) {
                        return true;
                    }
                    return false;
                case "table":
                    this.f14884l = B.f14775A;
                    if (this.f14884l != b7) {
                        return true;
                    }
                    return false;
                case "tbody":
                case "tfoot":
                case "thead":
                    this.f14884l = B.f14779E;
                    if (this.f14884l != b7) {
                        return true;
                    }
                    return false;
                case "caption":
                    this.f14884l = B.f14777C;
                    if (this.f14884l != b7) {
                        return true;
                    }
                    return false;
                default:
                    if (z6) {
                        this.f14884l = B.f14797y;
                        if (this.f14884l != b7) {
                            return true;
                        }
                        return false;
                    }
                    i10--;
                    break;
                    break;
            }
        }
        if (this.f14884l != b7) {
            return true;
        }
        return false;
    }

    public final E N(String str, D d3) {
        E eClone;
        E e10 = (E) this.f14882i.get(str);
        if (e10 != null) {
            return e10;
        }
        HashMap map = E.f14803B;
        qa.b.w(str);
        HashMap map2 = E.f14803B;
        E e11 = (E) map2.get(str);
        if (e11 == null) {
            d3.getClass();
            String strTrim = str.trim();
            boolean z6 = d3.a;
            if (!z6) {
                strTrim = J7.j.t(strTrim);
            }
            qa.b.u(strTrim);
            String strT = J7.j.t(strTrim);
            E e12 = (E) map2.get(strT);
            if (e12 == null) {
                eClone = new E(strTrim);
                eClone.f14813u = false;
            } else if (!z6 || strTrim.equals(strT)) {
                e11 = e12;
            } else {
                eClone = e12.clone();
                eClone.f14811s = strTrim;
            }
            e11 = eClone;
        }
        this.f14882i.put(str, e11);
        return e11;
    }

    public final org.jsoup.nodes.k a(org.jsoup.nodes.k kVar) {
        for (int size = this.f14878e.size() - 1; size >= 0; size--) {
            if (((org.jsoup.nodes.k) this.f14878e.get(size)) == kVar) {
                return (org.jsoup.nodes.k) this.f14878e.get(size - 1);
            }
        }
        return null;
    }

    public final void b(org.jsoup.nodes.k kVar) {
        int size = this.f14889q.size();
        int i10 = size - 13;
        int i11 = 0;
        if (i10 < 0) {
            i10 = 0;
        }
        for (int i12 = size - 1; i12 >= i10; i12--) {
            org.jsoup.nodes.k kVar2 = (org.jsoup.nodes.k) this.f14889q.get(i12);
            if (kVar2 == null) {
                return;
            }
            if (kVar.f13880v.f14812t.equals(kVar2.f13880v.f14812t) && kVar.e().equals(kVar2.e())) {
                i11++;
            }
            if (i11 == 3) {
                this.f14889q.remove(i12);
                return;
            }
        }
    }

    public final void c() {
        while (!this.f14889q.isEmpty()) {
            int size = this.f14889q.size();
            if ((size > 0 ? (org.jsoup.nodes.k) this.f14889q.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    public final void d(String... strArr) {
        for (int size = this.f14878e.size() - 1; size >= 0; size--) {
            org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) this.f14878e.get(size);
            String str = kVar.f13880v.f14812t;
            String[] strArr2 = ra.a.a;
            for (String str2 : strArr) {
                if (str2.equals(str)) {
                    return;
                }
            }
            if (kVar.f13880v.f14812t.equals(com.onesignal.inAppMessages.internal.d.HTML)) {
                return;
            }
            this.f14878e.remove(size);
        }
    }

    public final void e() {
        d("table", "template");
    }

    public final org.jsoup.nodes.k f() {
        int size = this.f14878e.size();
        return size > 0 ? (org.jsoup.nodes.k) this.f14878e.get(size - 1) : this.f14877d;
    }

    public final boolean g(String str) {
        org.jsoup.nodes.k kVarF;
        return (this.f14878e.size() == 0 || (kVarF = f()) == null || !kVarF.f13880v.f14812t.equals(str)) ? false : true;
    }

    public final void h(B b3) {
        if (((C) this.a.f12743s).d()) {
            ((C) this.a.f12743s).add(new o1.r(this.f14875b, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.f14880g.getClass().getSimpleName(), this.f14880g, b3}));
        }
    }

    public final void i(String str) {
        while (ra.a.c(f().f13880v.f14812t, f14869C)) {
            if (str != null && g(str)) {
                return;
            } else {
                A();
            }
        }
    }

    public final void j(boolean z6) {
        String[] strArr = z6 ? f14870D : f14869C;
        while (ra.a.c(f().f13880v.f14812t, strArr)) {
            A();
        }
    }

    public final org.jsoup.nodes.k k(String str) {
        for (int size = this.f14889q.size() - 1; size >= 0; size--) {
            org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) this.f14889q.get(size);
            if (kVar == null) {
                return null;
            }
            if (kVar.f13880v.f14812t.equals(str)) {
                return kVar;
            }
        }
        return null;
    }

    public final org.jsoup.nodes.k l(String str) {
        int size = this.f14878e.size();
        int i10 = size - 1;
        int i11 = i10 >= 256 ? size - 257 : 0;
        while (i10 >= i11) {
            org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) this.f14878e.get(i10);
            if (kVar.f13880v.f14812t.equals(str)) {
                return kVar;
            }
            i10--;
        }
        return null;
    }

    public final boolean m(String str) {
        String[] strArr = f14874z;
        String[] strArr2 = f14872x;
        String[] strArr3 = this.f14895w;
        strArr3[0] = str;
        return p(strArr3, strArr2, strArr);
    }

    public final boolean n(String str) {
        String[] strArr = f14872x;
        String[] strArr2 = this.f14895w;
        strArr2[0] = str;
        return p(strArr2, strArr, null);
    }

    public final boolean o(String str) {
        for (int size = this.f14878e.size() - 1; size >= 0; size--) {
            String str2 = ((org.jsoup.nodes.k) this.f14878e.get(size)).f13880v.f14812t;
            if (str2.equals(str)) {
                return true;
            }
            if (!ra.a.c(str2, f14868B)) {
                return false;
            }
        }
        throw new ValidationException("Should not be reachable");
    }

    public final boolean p(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f14878e.size();
        int i10 = size - 1;
        int i11 = i10 > 100 ? size - 101 : 0;
        while (i10 >= i11) {
            String str = ((org.jsoup.nodes.k) this.f14878e.get(i10)).f13880v.f14812t;
            if (!ra.a.c(str, strArr)) {
                if (ra.a.c(str, strArr2) || (strArr3 != null && ra.a.c(str, strArr3))) {
                    break;
                }
                i10--;
            } else {
                return true;
            }
        }
        return false;
    }

    public final boolean q(String str) {
        String[] strArr = f14867A;
        String[] strArr2 = this.f14895w;
        strArr2[0] = str;
        return p(strArr2, strArr, null);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    public final org.jsoup.nodes.k r(L l4) {
        org.jsoup.nodes.c cVar;
        int i10;
        int i11;
        String str;
        if (l4.w() && (i10 = (cVar = l4.f14836l).f13863s) != 0) {
            D d3 = this.f14881h;
            if (i10 == 0) {
                i11 = 0;
            } else {
                boolean z6 = d3.f14802b;
                int i12 = 0;
                i11 = 0;
                while (i12 < cVar.f13864t.length) {
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        String[] strArr = cVar.f13864t;
                        if (i14 >= strArr.length || (str = strArr[i14]) == null) {
                            break;
                        }
                        if (z6 && strArr[i12].equals(str)) {
                            i11++;
                            cVar.x(i14);
                            i14--;
                        } else if (!z6) {
                            String[] strArr2 = cVar.f13864t;
                            if (strArr2[i12].equalsIgnoreCase(strArr2[i14])) {
                                i11++;
                                cVar.x(i14);
                                i14--;
                            }
                        }
                        i14++;
                    }
                    i12 = i13;
                }
            }
            if (i11 > 0) {
                Object[] objArr = {l4.f14828c};
                C c10 = (C) this.a.f12743s;
                if (c10.d()) {
                    c10.add(new o1.r(this.f14875b, "Dropped duplicate attribute(s) in tag [%s]", objArr));
                }
            }
        }
        if (!l4.f14835k) {
            E eN = N(l4.x(), this.f14881h);
            D d8 = this.f14881h;
            org.jsoup.nodes.c cVar2 = l4.f14836l;
            d8.a(cVar2);
            org.jsoup.nodes.k kVar = new org.jsoup.nodes.k(eN, null, cVar2);
            x(kVar);
            this.f14878e.add(kVar);
            return kVar;
        }
        org.jsoup.nodes.k kVarU = u(l4);
        this.f14878e.add(kVarU);
        this.f14876c.o(e1.f14948s);
        N n10 = this.f14876c;
        K k3 = this.f14892t;
        k3.q();
        k3.y(kVarU.f13880v.f14811s);
        n10.f(k3);
        return kVarU;
    }

    public final void s(G g8) {
        org.jsoup.nodes.o fVar;
        org.jsoup.nodes.k kVarF = f();
        String str = kVarF.f13880v.f14812t;
        String str2 = g8.f14819b;
        if (g8 instanceof F) {
            fVar = new org.jsoup.nodes.d(str2);
        } else if (str.equals("script") || str.equals("style")) {
            fVar = new org.jsoup.nodes.f();
            fVar.f13894v = str2;
        } else {
            fVar = new org.jsoup.nodes.r(str2);
        }
        kVarF.B(fVar);
    }

    public final void t(H h10) {
        String string = h10.f14821c;
        if (string == null) {
            string = h10.f14820b.toString();
        }
        org.jsoup.nodes.e eVar = new org.jsoup.nodes.e();
        eVar.f13894v = string;
        x(eVar);
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.f14880g + ", state=" + this.f14884l + ", currentElement=" + f() + '}';
    }

    public final org.jsoup.nodes.k u(L l4) {
        E eN = N(l4.x(), this.f14881h);
        D d3 = this.f14881h;
        org.jsoup.nodes.c cVar = l4.f14836l;
        d3.a(cVar);
        org.jsoup.nodes.k kVar = new org.jsoup.nodes.k(eN, null, cVar);
        x(kVar);
        if (l4.f14835k) {
            if (!E.f14803B.containsKey(eN.f14811s)) {
                eN.f14816x = true;
            } else if (!eN.f14815w) {
                N n10 = this.f14876c;
                Object[] objArr = {eN.f14812t};
                C c10 = n10.f14839b;
                if (c10.d()) {
                    c10.add(new o1.r(n10.a, "Tag [%s] cannot be self closing; not a void tag", objArr));
                    return kVar;
                }
            }
        }
        return kVar;
    }

    public final void v(L l4, boolean z6, boolean z10) {
        E eN = N(l4.x(), this.f14881h);
        D d3 = this.f14881h;
        org.jsoup.nodes.c cVar = l4.f14836l;
        d3.a(cVar);
        org.jsoup.nodes.n nVar = new org.jsoup.nodes.n(eN, cVar);
        if (!z10 || !y("template")) {
            this.f14888p = nVar;
        }
        x(nVar);
        if (z6) {
            this.f14878e.add(nVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    public final void w(org.jsoup.nodes.p pVar) {
        org.jsoup.nodes.k kVarA;
        boolean z6;
        org.jsoup.nodes.k kVarL = l("table");
        if (kVarL != null) {
            kVarA = (org.jsoup.nodes.k) kVarL.f13896s;
            if (kVarA != null) {
                z6 = true;
            } else {
                kVarA = a(kVarL);
            }
            if (z6) {
                kVarA.B(pVar);
                return;
            }
            qa.b.w(kVarL);
            qa.b.w(kVarL.f13896s);
            kVarL.f13896s.c(kVarL.f13897t, pVar);
        }
        kVarA = (org.jsoup.nodes.k) this.f14878e.get(0);
        z6 = false;
        if (z6) {
            kVarA.B(pVar);
            return;
        }
        qa.b.w(kVarL);
        qa.b.w(kVarL.f13896s);
        kVarL.f13896s.c(kVarL.f13897t, pVar);
    }

    public final void x(org.jsoup.nodes.p pVar) {
        org.jsoup.nodes.n nVar;
        if (this.f14878e.isEmpty()) {
            this.f14877d.B(pVar);
        } else if (this.f14894v && ra.a.c(f().f13880v.f14812t, A.f14739A)) {
            w(pVar);
        } else {
            f().B(pVar);
        }
        if (pVar instanceof org.jsoup.nodes.k) {
            org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) pVar;
            if (!kVar.f13880v.f14818z || (nVar = this.f14888p) == null) {
                return;
            }
            nVar.f13893B.add(kVar);
        }
    }

    public final boolean y(String str) {
        return l(str) != null;
    }
}
