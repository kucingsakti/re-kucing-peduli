package sa;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.net.UrlRequest;
import org.jsoup.helper.ValidationException;

/* JADX INFO: renamed from: sa.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0832x extends B {
    public C0832x() {
        super("InBody", 6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:189:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:191:0x02df  */
    /* JADX WARN: Code duplicated, block: B:193:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:195:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:197:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:202:0x0310  */
    /* JADX WARN: Code duplicated, block: B:204:0x031a  */
    /* JADX WARN: Code duplicated, block: B:205:0x031c  */
    /* JADX WARN: Code duplicated, block: B:214:0x0335  */
    /* JADX WARN: Code duplicated, block: B:219:0x0354  */
    /* JADX WARN: Code duplicated, block: B:223:0x0360  */
    /* JADX WARN: Code duplicated, block: B:224:0x0363  */
    /* JADX WARN: Code duplicated, block: B:226:0x0379  */
    /* JADX WARN: Code duplicated, block: B:228:0x0381  */
    /* JADX WARN: Code duplicated, block: B:229:0x0383  */
    /* JADX WARN: Code duplicated, block: B:231:0x0386  */
    /* JADX WARN: Code duplicated, block: B:237:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:238:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:352:0x058f  */
    /* JADX WARN: Code duplicated, block: B:768:0x0c61  */
    /* JADX WARN: Code duplicated, block: B:800:0x0cf8  */
    /* JADX WARN: Code duplicated, block: B:877:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:878:0x03d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:893:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:894:0x034e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:895:0x034a A[SYNTHETIC] */
    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        String[] strArr;
        boolean z6;
        org.jsoup.nodes.k kVarL;
        org.jsoup.nodes.n nVar2;
        org.jsoup.nodes.c cVar;
        String str;
        byte b3;
        byte b7;
        String[] strArr2;
        org.jsoup.nodes.k kVar;
        String str2;
        ArrayList arrayList;
        org.jsoup.nodes.k kVar2;
        org.jsoup.nodes.c cVarE;
        org.jsoup.nodes.c cVarE2;
        int i10;
        List listUnmodifiableList;
        int size;
        boolean z10;
        int iLastIndexOf;
        boolean z11;
        boolean z12;
        int i11;
        org.jsoup.nodes.a aVar;
        String str3;
        int iD = p239z.e.d(nVar.a);
        if (iD == 0) {
            c0789b.h(this);
            return false;
        }
        B b10 = B.f14794v;
        String[] strArr3 = A.f14758i;
        String[] strArr4 = A.f14760l;
        String[] strArr5 = C0789b.f14871E;
        if (iD == 1) {
            String[] strArr6 = strArr5;
            L l4 = (L) nVar;
            String str4 = l4.f14828c;
            str4.getClass();
            String[] strArr7 = A.j;
            C0836z c0836z = B.f14775A;
            switch (str4) {
                case "frameset":
                    c0789b.h(this);
                    ArrayList arrayList2 = c0789b.f14878e;
                    if (arrayList2.size() == 1) {
                        return false;
                    }
                    if ((arrayList2.size() > 2 && !((org.jsoup.nodes.k) arrayList2.get(1)).f13880v.f14812t.equals("body")) || !c0789b.f14893u) {
                        return false;
                    }
                    org.jsoup.nodes.k kVar3 = (org.jsoup.nodes.k) arrayList2.get(1);
                    if (((org.jsoup.nodes.k) kVar3.f13896s) != null) {
                        kVar3.y();
                    }
                    while (arrayList2.size() > 1) {
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    c0789b.r(l4);
                    c0789b.f14884l = B.f14786L;
                    return true;
                case "button":
                    if (c0789b.m("button")) {
                        c0789b.h(this);
                        c0789b.F("button");
                        c0789b.D(l4);
                        return true;
                    }
                    c0789b.I();
                    c0789b.r(l4);
                    c0789b.f14893u = false;
                    return true;
                case "iframe":
                    c0789b.f14893u = false;
                    B.g(l4, c0789b);
                    return true;
                case "keygen":
                case "br":
                case "img":
                case "wbr":
                case "area":
                case "embed":
                    c0789b.I();
                    c0789b.u(l4);
                    c0789b.f14893u = false;
                    return true;
                case "option":
                case "optgroup":
                    if (c0789b.g("option")) {
                        c0789b.F("option");
                    }
                    c0789b.I();
                    c0789b.r(l4);
                    return true;
                case "textarea":
                    c0789b.r(l4);
                    if (!l4.f14835k) {
                        c0789b.f14876c.o(e1.f14952u);
                        c0789b.f14885m = c0789b.f14884l;
                        c0789b.f14893u = false;
                        c0789b.f14884l = B.f14798z;
                        return true;
                    }
                    break;
                case "select":
                    c0789b.I();
                    c0789b.r(l4);
                    c0789b.f14893u = false;
                    if (!l4.f14835k) {
                        B b11 = c0789b.f14884l;
                        if (b11.equals(c0836z) || b11.equals(B.f14777C) || b11.equals(B.f14779E) || b11.equals(B.f14780F) || b11.equals(B.f14781G)) {
                            c0789b.f14884l = B.f14783I;
                            return true;
                        }
                        c0789b.f14884l = B.f14782H;
                        return true;
                    }
                    break;
                case "strike":
                case "strong":
                case "b":
                case "i":
                case "s":
                case "u":
                case "em":
                case "tt":
                case "big":
                case "code":
                case "font":
                case "small":
                    c0789b.I();
                    org.jsoup.nodes.k kVarR = c0789b.r(l4);
                    c0789b.b(kVarR);
                    c0789b.f14889q.add(kVarR);
                    return true;
                case "a":
                    if (c0789b.k(R5.a.PUSH_ADDITIONAL_DATA_KEY) != null) {
                        c0789b.h(this);
                        c0789b.F(R5.a.PUSH_ADDITIONAL_DATA_KEY);
                        org.jsoup.nodes.k kVarL2 = c0789b.l(R5.a.PUSH_ADDITIONAL_DATA_KEY);
                        if (kVarL2 != null) {
                            c0789b.J(kVarL2);
                            c0789b.K(kVarL2);
                        }
                    }
                    c0789b.I();
                    org.jsoup.nodes.k kVarR2 = c0789b.r(l4);
                    c0789b.b(kVarR2);
                    c0789b.f14889q.add(kVarR2);
                    return true;
                case "dd":
                case "dt":
                    c0789b.f14893u = false;
                    ArrayList arrayList3 = c0789b.f14878e;
                    int size2 = arrayList3.size();
                    int i12 = size2 - 1;
                    int i13 = i12 >= 24 ? size2 - 25 : 0;
                    while (i12 >= i13) {
                        org.jsoup.nodes.k kVar4 = (org.jsoup.nodes.k) arrayList3.get(i12);
                        boolean zC = ra.a.c(kVar4.f13880v.f14812t, A.f14759k);
                        E e10 = kVar4.f13880v;
                        if (zC) {
                            c0789b.F(e10.f14812t);
                        } else if (!ra.a.c(e10.f14812t, strArr6) || ra.a.c(e10.f14812t, strArr7)) {
                            i12--;
                        }
                        if (c0789b.m(R5.a.PUSH_MINIFIED_BUTTON_ICON)) {
                            c0789b.F(R5.a.PUSH_MINIFIED_BUTTON_ICON);
                        }
                        c0789b.r(l4);
                        return true;
                    }
                    if (c0789b.m(R5.a.PUSH_MINIFIED_BUTTON_ICON)) {
                        c0789b.F(R5.a.PUSH_MINIFIED_BUTTON_ICON);
                    }
                    c0789b.r(l4);
                    return true;
                case "h1":
                case "h2":
                case "h3":
                case "h4":
                case "h5":
                case "h6":
                    if (c0789b.m(R5.a.PUSH_MINIFIED_BUTTON_ICON)) {
                        c0789b.F(R5.a.PUSH_MINIFIED_BUTTON_ICON);
                    }
                    if (ra.a.c(c0789b.f().f13880v.f14812t, strArr3)) {
                        c0789b.h(this);
                        c0789b.A();
                    }
                    c0789b.r(l4);
                    return true;
                case "hr":
                    if (c0789b.m(R5.a.PUSH_MINIFIED_BUTTON_ICON)) {
                        c0789b.F(R5.a.PUSH_MINIFIED_BUTTON_ICON);
                    }
                    c0789b.u(l4);
                    c0789b.f14893u = false;
                    return true;
                case "li":
                    c0789b.f14893u = false;
                    ArrayList arrayList4 = c0789b.f14878e;
                    int size3 = arrayList4.size() - 1;
                    while (size3 > 0) {
                        org.jsoup.nodes.k kVar5 = (org.jsoup.nodes.k) arrayList4.get(size3);
                        if (kVar5.f13880v.f14812t.equals("li")) {
                            c0789b.F("li");
                        } else {
                            E e11 = kVar5.f13880v;
                            String[] strArr8 = strArr6;
                            if (ra.a.c(e11.f14812t, strArr8)) {
                                strArr = strArr7;
                                if (!ra.a.c(e11.f14812t, strArr)) {
                                }
                            } else {
                                strArr = strArr7;
                            }
                            size3--;
                            strArr7 = strArr;
                            strArr6 = strArr8;
                        }
                        if (c0789b.m(R5.a.PUSH_MINIFIED_BUTTON_ICON)) {
                            c0789b.F(R5.a.PUSH_MINIFIED_BUTTON_ICON);
                        }
                        c0789b.r(l4);
                        return true;
                    }
                    if (c0789b.m(R5.a.PUSH_MINIFIED_BUTTON_ICON)) {
                        c0789b.F(R5.a.PUSH_MINIFIED_BUTTON_ICON);
                    }
                    c0789b.r(l4);
                    return true;
                case "rp":
                case "rt":
                    if (!c0789b.n("ruby")) {
                        z6 = true;
                        return z6;
                    }
                    c0789b.j(false);
                    if (!c0789b.g("ruby")) {
                        c0789b.h(this);
                        for (int size4 = c0789b.f14878e.size() - 1; size4 >= 0 && !((org.jsoup.nodes.k) c0789b.f14878e.get(size4)).f13880v.f14812t.equals("ruby"); size4--) {
                            c0789b.f14878e.remove(size4);
                        }
                    }
                    c0789b.r(l4);
                    return true;
                case "pre":
                case "listing":
                    if (c0789b.m(R5.a.PUSH_MINIFIED_BUTTON_ICON)) {
                        c0789b.F(R5.a.PUSH_MINIFIED_BUTTON_ICON);
                    }
                    c0789b.r(l4);
                    c0789b.f14875b.p("\n");
                    c0789b.f14893u = false;
                    return true;
                case "svg":
                    c0789b.I();
                    c0789b.r(l4);
                    return true;
                case "xmp":
                    if (c0789b.m(R5.a.PUSH_MINIFIED_BUTTON_ICON)) {
                        c0789b.F(R5.a.PUSH_MINIFIED_BUTTON_ICON);
                    }
                    c0789b.I();
                    c0789b.f14893u = false;
                    B.g(l4, c0789b);
                    return true;
                case "body":
                    c0789b.h(this);
                    ArrayList arrayList5 = c0789b.f14878e;
                    if (arrayList5.size() == 1) {
                        return false;
                    }
                    if ((arrayList5.size() > 2 && !((org.jsoup.nodes.k) arrayList5.get(1)).f13880v.f14812t.equals("body")) || c0789b.y("template")) {
                        return false;
                    }
                    c0789b.f14893u = false;
                    if (l4.w() && (kVarL = c0789b.l("body")) != null) {
                        org.jsoup.nodes.c cVar2 = l4.f14836l;
                        cVar2.getClass();
                        int i14 = 0;
                        while (true) {
                            if (i14 < cVar2.f13863s && org.jsoup.nodes.c.u(cVar2.f13864t[i14])) {
                                i14++;
                            } else if (i14 >= cVar2.f13863s) {
                                break;
                            } else {
                                org.jsoup.nodes.a aVar2 = new org.jsoup.nodes.a(cVar2.f13864t[i14], (String) cVar2.f13865u[i14], cVar2);
                                i14++;
                                if (!kVarL.m(aVar2.f13858s)) {
                                    kVarL.e().w(aVar2);
                                }
                            }
                        }
                    }
                    break;
                case "form":
                    if (c0789b.f14888p != null && !c0789b.y("template")) {
                        c0789b.h(this);
                        return false;
                    }
                    if (c0789b.m(R5.a.PUSH_MINIFIED_BUTTON_ICON)) {
                        c0789b.i(R5.a.PUSH_MINIFIED_BUTTON_ICON);
                        if (!R5.a.PUSH_MINIFIED_BUTTON_ICON.equals(c0789b.f().f13880v.f14812t)) {
                            c0789b.h(c0789b.f14884l);
                        }
                        c0789b.B(R5.a.PUSH_MINIFIED_BUTTON_ICON);
                    }
                    c0789b.v(l4, true, true);
                    return true;
                case "html":
                    c0789b.h(this);
                    if (c0789b.y("template")) {
                        return false;
                    }
                    if (c0789b.f14878e.size() > 0) {
                        org.jsoup.nodes.k kVar6 = (org.jsoup.nodes.k) c0789b.f14878e.get(0);
                        if (l4.w()) {
                            org.jsoup.nodes.c cVar3 = l4.f14836l;
                            cVar3.getClass();
                            int i15 = 0;
                            while (true) {
                                if (i15 < cVar3.f13863s && org.jsoup.nodes.c.u(cVar3.f13864t[i15])) {
                                    i15++;
                                } else if (i15 >= cVar3.f13863s) {
                                    break;
                                } else {
                                    org.jsoup.nodes.a aVar3 = new org.jsoup.nodes.a(cVar3.f13864t[i15], (String) cVar3.f13865u[i15], cVar3);
                                    i15++;
                                    if (!kVar6.m(aVar3.f13858s)) {
                                        kVar6.e().w(aVar3);
                                    }
                                }
                            }
                        }
                    }
                    break;
                case "math":
                    c0789b.I();
                    c0789b.r(l4);
                    return true;
                case "nobr":
                    c0789b.I();
                    if (c0789b.n("nobr")) {
                        c0789b.h(this);
                        c0789b.F("nobr");
                        c0789b.I();
                    }
                    org.jsoup.nodes.k kVarR3 = c0789b.r(l4);
                    c0789b.b(kVarR3);
                    c0789b.f14889q.add(kVarR3);
                    return true;
                case "span":
                    c0789b.I();
                    c0789b.r(l4);
                    return true;
                case "image":
                    if (c0789b.l("svg") == null) {
                        l4.y("img");
                        return c0789b.D(l4);
                    }
                    c0789b.r(l4);
                    return true;
                case "input":
                    z6 = true;
                    c0789b.I();
                    if (!c0789b.u(l4).d(com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY).equalsIgnoreCase("hidden")) {
                        c0789b.f14893u = false;
                        return true;
                    }
                    return z6;
                case "table":
                    if (c0789b.f14877d.f13876D != 2 && c0789b.m(R5.a.PUSH_MINIFIED_BUTTON_ICON)) {
                        c0789b.F(R5.a.PUSH_MINIFIED_BUTTON_ICON);
                    }
                    c0789b.r(l4);
                    c0789b.f14893u = false;
                    c0789b.f14884l = c0836z;
                    return true;
                case "plaintext":
                    if (c0789b.m(R5.a.PUSH_MINIFIED_BUTTON_ICON)) {
                        c0789b.F(R5.a.PUSH_MINIFIED_BUTTON_ICON);
                    }
                    c0789b.r(l4);
                    c0789b.f14876c.o(e1.f14960y);
                    return true;
                case "isindex":
                    c0789b.h(this);
                    if (c0789b.f14888p != null) {
                        return false;
                    }
                    c0789b.G("form");
                    org.jsoup.nodes.c cVar4 = l4.f14836l;
                    if (cVar4 != null && cVar4.r("action") != -1 && (nVar2 = c0789b.f14888p) != null && (cVar = l4.f14836l) != null && cVar.r("action") != -1) {
                        nVar2.e().v("action", l4.f14836l.k("action"));
                    }
                    c0789b.G("hr");
                    c0789b.G("label");
                    org.jsoup.nodes.c cVar5 = l4.f14836l;
                    String strK = (cVar5 == null || cVar5.r("prompt") == -1) ? "This is a searchable index. Enter search keywords: " : l4.f14836l.k("prompt");
                    G g8 = new G();
                    g8.f14819b = strK;
                    c0789b.D(g8);
                    org.jsoup.nodes.c cVar6 = new org.jsoup.nodes.c();
                    if (l4.w()) {
                        org.jsoup.nodes.c cVar7 = l4.f14836l;
                        cVar7.getClass();
                        int i16 = 0;
                        while (true) {
                            if (i16 < cVar7.f13863s && org.jsoup.nodes.c.u(cVar7.f13864t[i16])) {
                                i16++;
                            } else if (i16 < cVar7.f13863s) {
                                org.jsoup.nodes.a aVar4 = new org.jsoup.nodes.a(cVar7.f13864t[i16], (String) cVar7.f13865u[i16], cVar7);
                                i16++;
                                if (!ra.a.c(aVar4.f13858s, A.f14762n)) {
                                    cVar6.w(aVar4);
                                }
                            }
                        }
                    }
                    cVar6.v(MediationMetaData.KEY_NAME, "isindex");
                    K0.n nVar3 = c0789b.f14880g;
                    L l10 = c0789b.j;
                    if (nVar3 == l10) {
                        L l11 = new L();
                        l11.f14827b = "input";
                        l11.f14836l = cVar6;
                        l11.f14828c = J7.j.t("input");
                        c0789b.D(l11);
                    } else {
                        l10.q();
                        l10.f14827b = "input";
                        l10.f14836l = cVar6;
                        l10.f14828c = J7.j.t("input");
                        c0789b.D(l10);
                    }
                    c0789b.F("label");
                    c0789b.G("hr");
                    c0789b.F("form");
                    return true;
                case "noembed":
                    B.g(l4, c0789b);
                    return true;
                default:
                    if (!E.f14803B.containsKey(str4)) {
                        c0789b.r(l4);
                        return true;
                    }
                    if (ra.a.c(str4, A.f14757h)) {
                        if (c0789b.m(R5.a.PUSH_MINIFIED_BUTTON_ICON)) {
                            c0789b.F(R5.a.PUSH_MINIFIED_BUTTON_ICON);
                        }
                        c0789b.r(l4);
                        return true;
                    }
                    if (ra.a.c(str4, A.f14756g)) {
                        c0789b.f14880g = nVar;
                        return b10.h(nVar, c0789b);
                    }
                    if (ra.a.c(str4, strArr4)) {
                        c0789b.I();
                        c0789b.r(l4);
                        c0789b.f14889q.add(null);
                        c0789b.f14893u = false;
                        return true;
                    }
                    if (ra.a.c(str4, A.f14761m)) {
                        c0789b.u(l4);
                        return true;
                    }
                    if (ra.a.c(str4, A.f14763o)) {
                        c0789b.h(this);
                        return false;
                    }
                    c0789b.I();
                    c0789b.r(l4);
                    return true;
            }
        } else if (iD == 2) {
            K k3 = (K) nVar;
            String str5 = k3.f14828c;
            str5.getClass();
            String[] strArr9 = C0789b.f14872x;
            switch (str5.hashCode()) {
                case -1321546630:
                    str = "template";
                    b3 = str5.equals(str) ? (byte) 0 : (byte) -1;
                    break;
                case 112:
                    if (str5.equals(R5.a.PUSH_MINIFIED_BUTTON_ICON)) {
                        str = "template";
                        b3 = 1;
                    } else {
                        str = "template";
                    }
                    break;
                case 3152:
                    if (str5.equals("br")) {
                        str = "template";
                        b3 = 2;
                    } else {
                        str = "template";
                    }
                    break;
                case 3200:
                    if (str5.equals("dd")) {
                        str = "template";
                        b3 = 3;
                    } else {
                        str = "template";
                    }
                    break;
                case 3216:
                    if (str5.equals("dt")) {
                        str = "template";
                        b3 = 4;
                    } else {
                        str = "template";
                    }
                    break;
                case 3273:
                    if (str5.equals("h1")) {
                        b3 = 5;
                        str = "template";
                    } else {
                        str = "template";
                    }
                    break;
                case 3274:
                    if (str5.equals("h2")) {
                        str = "template";
                        b3 = 6;
                    } else {
                        str = "template";
                    }
                    break;
                case 3275:
                    if (str5.equals("h3")) {
                        str = "template";
                        b3 = 7;
                    } else {
                        str = "template";
                    }
                    break;
                case 3276:
                    if (str5.equals("h4")) {
                        str = "template";
                        b3 = 8;
                    } else {
                        str = "template";
                    }
                    break;
                case 3277:
                    if (str5.equals("h5")) {
                        b7 = 9;
                        b3 = b7;
                        str = "template";
                    } else {
                        str = "template";
                    }
                    break;
                case 3278:
                    if (str5.equals("h6")) {
                        b7 = 10;
                        b3 = b7;
                        str = "template";
                    } else {
                        str = "template";
                    }
                    break;
                case 3453:
                    if (str5.equals("li")) {
                        b7 = 11;
                        b3 = b7;
                        str = "template";
                    } else {
                        str = "template";
                    }
                    break;
                case 3029410:
                    if (str5.equals("body")) {
                        b7 = 12;
                        b3 = b7;
                        str = "template";
                    } else {
                        str = "template";
                    }
                    break;
                case 3148996:
                    if (str5.equals("form")) {
                        b7 = 13;
                        b3 = b7;
                        str = "template";
                    } else {
                        str = "template";
                    }
                    break;
                case 3213227:
                    if (str5.equals(com.onesignal.inAppMessages.internal.d.HTML)) {
                        b7 = 14;
                        b3 = b7;
                        str = "template";
                    } else {
                        str = "template";
                    }
                    break;
                case 3536714:
                    if (str5.equals("span")) {
                        b7 = 15;
                        b3 = b7;
                        str = "template";
                    } else {
                        str = "template";
                    }
                    break;
                case 1869063452:
                    if (str5.equals("sarcasm")) {
                        b7 = 16;
                        b3 = b7;
                        str = "template";
                    } else {
                        str = "template";
                    }
                    break;
                default:
                    str = "template";
                    break;
            }
            switch (b3) {
                case 0:
                    c0789b.E(nVar, b10);
                    return true;
                case 1:
                    if (!c0789b.m(str5)) {
                        c0789b.h(this);
                        c0789b.G(str5);
                        return c0789b.D(k3);
                    }
                    c0789b.i(str5);
                    if (!c0789b.g(str5)) {
                        c0789b.h(this);
                    }
                    c0789b.B(str5);
                    return true;
                case 2:
                    c0789b.h(this);
                    c0789b.G("br");
                    return false;
                case 3:
                case 4:
                    if (!c0789b.n(str5)) {
                        c0789b.h(this);
                        return false;
                    }
                    c0789b.i(str5);
                    if (!c0789b.g(str5)) {
                        c0789b.h(this);
                    }
                    c0789b.B(str5);
                    return true;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    if (!c0789b.p(strArr3, strArr9, null)) {
                        c0789b.h(this);
                        return false;
                    }
                    c0789b.i(str5);
                    if (!c0789b.g(str5)) {
                        c0789b.h(this);
                    }
                    for (int size5 = c0789b.f14878e.size() - 1; size5 >= 0; size5--) {
                        org.jsoup.nodes.k kVar7 = (org.jsoup.nodes.k) c0789b.f14878e.get(size5);
                        c0789b.f14878e.remove(size5);
                        if (ra.a.c(kVar7.f13880v.f14812t, strArr3)) {
                        }
                        break;
                    }
                    break;
                    break;
                case 11:
                    String[] strArr10 = C0789b.f14873y;
                    String[] strArr11 = c0789b.f14895w;
                    strArr11[0] = str5;
                    if (!c0789b.p(strArr11, strArr9, strArr10)) {
                        c0789b.h(this);
                        return false;
                    }
                    c0789b.i(str5);
                    if (!c0789b.g(str5)) {
                        c0789b.h(this);
                    }
                    c0789b.B(str5);
                    return true;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (!c0789b.n("body")) {
                        c0789b.h(this);
                        return false;
                    }
                    i(nVar, c0789b);
                    c0789b.f14884l = B.f14785K;
                    return true;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (c0789b.y(str)) {
                        if (!c0789b.n(str5)) {
                            c0789b.h(this);
                            return false;
                        }
                        c0789b.j(false);
                        if (!c0789b.g(str5)) {
                            c0789b.h(this);
                        }
                        c0789b.B(str5);
                        return true;
                    }
                    org.jsoup.nodes.k kVar8 = c0789b.f14888p;
                    c0789b.f14888p = null;
                    if (kVar8 == null || !c0789b.n(str5)) {
                        c0789b.h(this);
                        return false;
                    }
                    c0789b.j(false);
                    if (!c0789b.g(str5)) {
                        c0789b.h(this);
                    }
                    c0789b.K(kVar8);
                    return true;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (c0789b.F("body")) {
                        return c0789b.D(k3);
                    }
                    break;
                case 15:
                case 16:
                    return i(nVar, c0789b);
                default:
                    if (ra.a.c(str5, A.f14765q)) {
                        String str6 = k3.f14828c;
                        ArrayList arrayList6 = c0789b.f14878e;
                        int i17 = 0;
                        while (i17 < 8) {
                            org.jsoup.nodes.k kVarK = c0789b.k(str6);
                            if (kVarK == null) {
                                return i(nVar, c0789b);
                            }
                            if (C0789b.z(c0789b.f14878e, kVarK)) {
                                E e12 = kVarK.f13880v;
                                if (!c0789b.n(e12.f14812t)) {
                                    c0789b.h(this);
                                    return false;
                                }
                                if (c0789b.f() != kVarK) {
                                    c0789b.h(this);
                                }
                                int size6 = arrayList6.size();
                                boolean z13 = false;
                                int i18 = -1;
                                int i19 = 1;
                                org.jsoup.nodes.k kVar9 = null;
                                while (true) {
                                    if (i19 >= size6 || i19 >= 64) {
                                        strArr2 = strArr5;
                                        kVar = null;
                                    } else {
                                        kVar = (org.jsoup.nodes.k) arrayList6.get(i19);
                                        if (kVar == kVarK) {
                                            org.jsoup.nodes.k kVar10 = (org.jsoup.nodes.k) arrayList6.get(i19 - 1);
                                            i18 = 0;
                                            while (true) {
                                                if (i18 >= c0789b.f14889q.size()) {
                                                    i18 = -1;
                                                } else if (kVar != c0789b.f14889q.get(i18)) {
                                                    i18++;
                                                }
                                            }
                                            kVar9 = kVar10;
                                            strArr2 = strArr5;
                                            z13 = true;
                                        } else if (z13) {
                                            strArr2 = strArr5;
                                            if (ra.a.c(kVar.f13880v.f14812t, strArr2)) {
                                            }
                                        } else {
                                            strArr2 = strArr5;
                                        }
                                        i19++;
                                        strArr5 = strArr2;
                                    }
                                }
                                if (kVar == null) {
                                    c0789b.B(e12.f14812t);
                                    c0789b.J(kVarK);
                                } else {
                                    org.jsoup.nodes.k kVarA = kVar;
                                    org.jsoup.nodes.k kVar11 = kVarA;
                                    int i20 = 0;
                                    while (i20 < 3) {
                                        if (C0789b.z(c0789b.f14878e, kVarA)) {
                                            kVarA = c0789b.a(kVarA);
                                        }
                                        if (!C0789b.z(c0789b.f14889q, kVarA)) {
                                            c0789b.K(kVarA);
                                            kVar11 = kVar11;
                                        } else if (kVarA == kVarK) {
                                            str2 = str6;
                                            arrayList = arrayList6;
                                            if (kVar9 != null) {
                                                if (ra.a.c(kVar9.f13880v.f14812t, A.f14766r)) {
                                                    if (((org.jsoup.nodes.k) kVar11.f13896s) != null) {
                                                        kVar11.y();
                                                    }
                                                    c0789b.w(kVar11);
                                                } else {
                                                    if (((org.jsoup.nodes.k) kVar11.f13896s) != null) {
                                                        kVar11.y();
                                                    }
                                                    kVar9.B(kVar11);
                                                }
                                            }
                                            kVar2 = new org.jsoup.nodes.k(e12, c0789b.f14879f, null);
                                            cVarE = kVar2.e();
                                            cVarE2 = kVarK.e();
                                            cVarE.getClass();
                                            i10 = cVarE2.f13863s;
                                            if (i10 != 0) {
                                                cVarE.e(cVarE.f13863s + i10);
                                                if (cVarE.f13863s != 0) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                i11 = 0;
                                                while (true) {
                                                    if (i11 >= cVarE2.f13863s && org.jsoup.nodes.c.u(cVarE2.f13864t[i11])) {
                                                        i11++;
                                                    } else if (i11 < cVarE2.f13863s) {
                                                        aVar = new org.jsoup.nodes.a(cVarE2.f13864t[i11], (String) cVarE2.f13865u[i11], cVarE2);
                                                        i11++;
                                                        if (z12) {
                                                            cVarE.w(aVar);
                                                        } else {
                                                            String str7 = aVar.f13858s;
                                                            str3 = aVar.f13859t;
                                                            if (str3 == null) {
                                                                str3 = "";
                                                            }
                                                            cVarE.d(str7, str3);
                                                        }
                                                    }
                                                }
                                            }
                                            if (kVar.h() == 0) {
                                                listUnmodifiableList = org.jsoup.nodes.p.f13895u;
                                            } else {
                                                List listL = kVar.l();
                                                ArrayList arrayList7 = new ArrayList(listL.size());
                                                arrayList7.addAll(listL);
                                                listUnmodifiableList = Collections.unmodifiableList(arrayList7);
                                            }
                                            if (listUnmodifiableList != null) {
                                                throw new ValidationException("Children collection to be inserted must not be null.");
                                            }
                                            size = kVar2.f13882x.size();
                                            if (size >= 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                throw new ValidationException("Insert position out of bounds.");
                                            }
                                            kVar2.c(size, (org.jsoup.nodes.p[]) new ArrayList(listUnmodifiableList).toArray(new org.jsoup.nodes.p[0]));
                                            kVar.B(kVar2);
                                            c0789b.J(kVarK);
                                            c0789b.b(kVar2);
                                            try {
                                                c0789b.f14889q.add(i18, kVar2);
                                            } catch (IndexOutOfBoundsException unused) {
                                                c0789b.f14889q.add(kVar2);
                                            }
                                            c0789b.K(kVarK);
                                            iLastIndexOf = c0789b.f14878e.lastIndexOf(kVar);
                                            if (iLastIndexOf != -1) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            qa.b.r(z11);
                                            c0789b.f14878e.add(iLastIndexOf + 1, kVar2);
                                            i17++;
                                            strArr5 = strArr2;
                                            str6 = str2;
                                            arrayList6 = arrayList;
                                        } else {
                                            org.jsoup.nodes.k kVar12 = new org.jsoup.nodes.k(c0789b.N(kVarA.s(), D.f14801d), c0789b.f14879f, null);
                                            ArrayList arrayList8 = c0789b.f14889q;
                                            int iLastIndexOf2 = arrayList8.lastIndexOf(kVarA);
                                            qa.b.r(iLastIndexOf2 != -1);
                                            arrayList8.set(iLastIndexOf2, kVar12);
                                            ArrayList arrayList9 = c0789b.f14878e;
                                            int iLastIndexOf3 = arrayList9.lastIndexOf(kVarA);
                                            qa.b.r(iLastIndexOf3 != -1);
                                            arrayList9.set(iLastIndexOf3, kVar12);
                                            if (kVar11 == kVar) {
                                                int i21 = 0;
                                                while (true) {
                                                    if (i21 >= c0789b.f14889q.size()) {
                                                        i21 = -1;
                                                    } else if (kVar12 != c0789b.f14889q.get(i21)) {
                                                        i21++;
                                                    }
                                                }
                                                i18 = i21 + 1;
                                            }
                                            if (((org.jsoup.nodes.k) kVar11.f13896s) != null) {
                                                kVar11.y();
                                            }
                                            kVar12.B(kVar11);
                                            kVarA = kVar12;
                                            kVar11 = kVarA;
                                        }
                                        i20++;
                                        str6 = str6;
                                        arrayList6 = arrayList6;
                                        break;
                                    }
                                    str2 = str6;
                                    arrayList = arrayList6;
                                    if (kVar9 != null) {
                                        if (ra.a.c(kVar9.f13880v.f14812t, A.f14766r)) {
                                            if (((org.jsoup.nodes.k) kVar11.f13896s) != null) {
                                                kVar11.y();
                                            }
                                            c0789b.w(kVar11);
                                        } else {
                                            if (((org.jsoup.nodes.k) kVar11.f13896s) != null) {
                                                kVar11.y();
                                            }
                                            kVar9.B(kVar11);
                                        }
                                    }
                                    kVar2 = new org.jsoup.nodes.k(e12, c0789b.f14879f, null);
                                    cVarE = kVar2.e();
                                    cVarE2 = kVarK.e();
                                    cVarE.getClass();
                                    i10 = cVarE2.f13863s;
                                    if (i10 != 0) {
                                        cVarE.e(cVarE.f13863s + i10);
                                        if (cVarE.f13863s != 0) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        i11 = 0;
                                        while (true) {
                                            if (i11 >= cVarE2.f13863s) {
                                            }
                                            if (i11 < cVarE2.f13863s) {
                                                aVar = new org.jsoup.nodes.a(cVarE2.f13864t[i11], (String) cVarE2.f13865u[i11], cVarE2);
                                                i11++;
                                                if (z12) {
                                                    cVarE.w(aVar);
                                                } else {
                                                    String str8 = aVar.f13858s;
                                                    str3 = aVar.f13859t;
                                                    if (str3 == null) {
                                                        str3 = "";
                                                    }
                                                    cVarE.d(str8, str3);
                                                }
                                            }
                                        }
                                    }
                                    if (kVar.h() == 0) {
                                        listUnmodifiableList = org.jsoup.nodes.p.f13895u;
                                    } else {
                                        List listL2 = kVar.l();
                                        ArrayList arrayList10 = new ArrayList(listL2.size());
                                        arrayList10.addAll(listL2);
                                        listUnmodifiableList = Collections.unmodifiableList(arrayList10);
                                    }
                                    if (listUnmodifiableList != null) {
                                        throw new ValidationException("Children collection to be inserted must not be null.");
                                    }
                                    size = kVar2.f13882x.size();
                                    if (size >= 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        throw new ValidationException("Insert position out of bounds.");
                                    }
                                    kVar2.c(size, (org.jsoup.nodes.p[]) new ArrayList(listUnmodifiableList).toArray(new org.jsoup.nodes.p[0]));
                                    kVar.B(kVar2);
                                    c0789b.J(kVarK);
                                    c0789b.b(kVar2);
                                    c0789b.f14889q.add(i18, kVar2);
                                    c0789b.K(kVarK);
                                    iLastIndexOf = c0789b.f14878e.lastIndexOf(kVar);
                                    if (iLastIndexOf != -1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    qa.b.r(z11);
                                    c0789b.f14878e.add(iLastIndexOf + 1, kVar2);
                                    i17++;
                                    strArr5 = strArr2;
                                    str6 = str2;
                                    arrayList6 = arrayList;
                                }
                            } else {
                                c0789b.h(this);
                                c0789b.J(kVarK);
                            }
                            return true;
                        }
                        return true;
                    }
                    if (ra.a.c(str5, A.f14764p)) {
                        if (!c0789b.n(str5)) {
                            c0789b.h(this);
                            return false;
                        }
                        c0789b.j(false);
                        if (!c0789b.g(str5)) {
                            c0789b.h(this);
                        }
                        c0789b.B(str5);
                        return true;
                    }
                    if (!ra.a.c(str5, strArr4)) {
                        return i(nVar, c0789b);
                    }
                    if (!c0789b.n(MediationMetaData.KEY_NAME)) {
                        if (!c0789b.n(str5)) {
                            c0789b.h(this);
                            return false;
                        }
                        c0789b.j(false);
                        if (!c0789b.g(str5)) {
                            c0789b.h(this);
                        }
                        c0789b.B(str5);
                        c0789b.c();
                        return true;
                    }
                    break;
            }
        } else {
            if (iD == 3) {
                c0789b.t((H) nVar);
                return true;
            }
            if (iD == 4) {
                G g10 = (G) nVar;
                if (g10.f14819b.equals(B.P)) {
                    c0789b.h(this);
                    return false;
                }
                if (c0789b.f14893u && B.f(g10)) {
                    c0789b.I();
                    c0789b.s(g10);
                    return true;
                }
                c0789b.I();
                c0789b.s(g10);
                c0789b.f14893u = false;
                return true;
            }
            if (iD == 5 && c0789b.f14890r.size() > 0) {
                C0807k c0807k = B.f14784J;
                c0789b.f14880g = nVar;
                return c0807k.h(nVar, c0789b);
            }
        }
        return true;
    }

    public final boolean i(K0.n nVar, C0789b c0789b) {
        nVar.getClass();
        String str = ((K) nVar).f14828c;
        ArrayList arrayList = c0789b.f14878e;
        if (c0789b.l(str) == null) {
            c0789b.h(this);
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) arrayList.get(size);
            if (kVar.f13880v.f14812t.equals(str)) {
                c0789b.i(str);
                if (!c0789b.g(str)) {
                    c0789b.h(this);
                }
                c0789b.B(str);
                return true;
            }
            if (ra.a.c(kVar.f13880v.f14812t, C0789b.f14871E)) {
                c0789b.h(this);
                return false;
            }
        }
        return true;
    }
}
