package ta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.ValidationException;
import org.jsoup.select.Selector$SelectorParseException;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f15279d = {",", ">", "+", "~", " "};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f15280e = {"=", "!=", "^=", "$=", "*=", "~="};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f15281f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f15282g = Pattern.compile("([+-])?(\\d+)");
    public final S3.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f15284c = new ArrayList();

    public o(String str) {
        qa.b.u(str);
        String strTrim = str.trim();
        this.f15283b = strTrim;
        this.a = new S3.a(strTrim);
    }

    public static m j(String str) {
        try {
            return new o(str).i();
        } catch (IllegalArgumentException e10) {
            throw new Selector$SelectorParseException(e10.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x0114  */
    /* JADX WARN: Code duplicated, block: B:50:0x0127  */
    /* JADX WARN: Code duplicated, block: B:52:0x013d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0149  */
    public final void a(char c10) {
        m aVar;
        boolean z6;
        Object obj;
        a aVar2;
        c cVar;
        int i10 = 1;
        int i11 = 0;
        S3.a aVar3 = this.a;
        aVar3.f();
        StringBuilder sbB = ra.a.b();
        while (!aVar3.g()) {
            if (aVar3.i("(")) {
                sbB.append("(");
                sbB.append(aVar3.a('(', ')'));
                sbB.append(")");
            } else if (aVar3.i("[")) {
                sbB.append("[");
                sbB.append(aVar3.a('[', ']'));
                sbB.append("]");
            } else if (!aVar3.j(f15279d)) {
                sbB.append(aVar3.c());
            } else if (sbB.length() > 0) {
                break;
            } else {
                aVar3.c();
            }
        }
        m mVarJ = j(ra.a.g(sbB));
        ArrayList arrayList = this.f15284c;
        if (arrayList.size() == 1) {
            aVar = (m) arrayList.get(0);
            if ((aVar instanceof b) && c10 != ',') {
                b bVar = (b) aVar;
                int i12 = bVar.f15270b;
                m mVar = i12 > 0 ? (m) bVar.a.get(i12 - 1) : null;
                obj = aVar;
                aVar = mVar;
                z6 = true;
            }
            arrayList.clear();
            if (c10 != ' ') {
                q qVar = new q(3);
                qVar.a = aVar;
                aVar2 = new a(qVar, mVarJ);
            } else if (c10 != '>') {
                q qVar2 = new q(i11);
                qVar2.a = aVar;
                aVar2 = new a(qVar2, mVarJ);
            } else {
                if (c10 != '~') {
                    if (c10 != '+') {
                        q qVar3 = new q(i10);
                        qVar3.a = aVar;
                        aVar2 = new a(qVar3, mVarJ);
                    } else {
                        if (c10 == ',') {
                            throw new Selector$SelectorParseException("Unknown combinator '%s'", Character.valueOf(c10));
                        }
                        if (aVar instanceof b) {
                            cVar = (b) aVar;
                        } else {
                            b bVar2 = new b();
                            ArrayList arrayList2 = bVar2.a;
                            arrayList2.add(aVar);
                            bVar2.f15270b = arrayList2.size();
                            cVar = bVar2;
                        }
                        ArrayList arrayList3 = cVar.a;
                        arrayList3.add(mVarJ);
                        cVar.f15270b = arrayList3.size();
                    }
                    if (z6) {
                        b bVar3 = (b) obj;
                        bVar3.a.set(bVar3.f15270b - 1, cVar);
                    } else {
                        obj = cVar;
                    }
                    arrayList.add(obj);
                }
                q qVar4 = new q(4);
                qVar4.a = aVar;
                aVar2 = new a(qVar4, mVarJ);
            }
            cVar = aVar2;
            if (z6) {
                b bVar4 = (b) obj;
                bVar4.a.set(bVar4.f15270b - 1, cVar);
            } else {
                obj = cVar;
            }
            arrayList.add(obj);
        }
        aVar = new a(arrayList);
        z6 = false;
        obj = aVar;
        arrayList.clear();
        if (c10 != ' ') {
            q qVar5 = new q(3);
            qVar5.a = aVar;
            aVar2 = new a(qVar5, mVarJ);
        } else if (c10 != '>') {
            q qVar6 = new q(i11);
            qVar6.a = aVar;
            aVar2 = new a(qVar6, mVarJ);
        } else {
            if (c10 != '~') {
                if (c10 != '+') {
                    q qVar7 = new q(i10);
                    qVar7.a = aVar;
                    aVar2 = new a(qVar7, mVarJ);
                } else {
                    if (c10 == ',') {
                        throw new Selector$SelectorParseException("Unknown combinator '%s'", Character.valueOf(c10));
                    }
                    if (aVar instanceof b) {
                        cVar = (b) aVar;
                    } else {
                        b bVar5 = new b();
                        ArrayList arrayList4 = bVar5.a;
                        arrayList4.add(aVar);
                        bVar5.f15270b = arrayList4.size();
                        cVar = bVar5;
                    }
                    ArrayList arrayList5 = cVar.a;
                    arrayList5.add(mVarJ);
                    cVar.f15270b = arrayList5.size();
                }
                if (z6) {
                    b bVar6 = (b) obj;
                    bVar6.a.set(bVar6.f15270b - 1, cVar);
                } else {
                    obj = cVar;
                }
                arrayList.add(obj);
            }
            q qVar8 = new q(4);
            qVar8.a = aVar;
            aVar2 = new a(qVar8, mVarJ);
        }
        cVar = aVar2;
        if (z6) {
            b bVar7 = (b) obj;
            bVar7.a.set(bVar7.f15270b - 1, cVar);
        } else {
            obj = cVar;
        }
        arrayList.add(obj);
    }

    public final int b() {
        boolean z6 = true;
        String strTrim = this.a.b().trim();
        String[] strArr = ra.a.a;
        if (strTrim == null || strTrim.length() == 0) {
            z6 = false;
            break;
        }
        int length = strTrim.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isDigit(strTrim.codePointAt(i10))) {
                z6 = false;
                break;
            }
        }
        if (z6) {
            return Integer.parseInt(strTrim);
        }
        throw new ValidationException("Index must be numeric");
    }

    public final void c(boolean z6) {
        String str = z6 ? ":containsOwn" : ":contains";
        S3.a aVar = this.a;
        aVar.d(str);
        String strM = S3.a.m(aVar.a('(', ')'));
        qa.b.v(strM, str.concat("(text) query must not be empty"));
        this.f15284c.add(z6 ? new e(strM, 4) : new e(strM, 5));
    }

    public final void d(boolean z6) {
        e eVar;
        String str = z6 ? ":containsWholeOwnText" : ":containsWholeText";
        S3.a aVar = this.a;
        aVar.d(str);
        String strM = S3.a.m(aVar.a('(', ')'));
        qa.b.v(strM, str.concat("(text) query must not be empty"));
        ArrayList arrayList = this.f15284c;
        if (z6) {
            eVar = new e(strM, false, 6);
        } else {
            eVar = new e(strM, false, 7);
        }
        arrayList.add(eVar);
    }

    public final void e(boolean z6, boolean z10) {
        int i10;
        int i11;
        String strV = J7.j.v(this.a.b());
        Matcher matcher = f15281f.matcher(strV);
        Matcher matcher2 = f15282g.matcher(strV);
        if ("odd".equals(strV)) {
            i11 = 2;
            i10 = 1;
        } else if ("even".equals(strV)) {
            i10 = 0;
            i11 = 2;
        } else if (matcher.matches()) {
            i11 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
            i10 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
        } else {
            if (!matcher2.matches()) {
                throw new Selector$SelectorParseException("Could not parse nth-index '%s': unexpected format", strV);
            }
            i10 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
            i11 = 0;
        }
        ArrayList arrayList = this.f15284c;
        if (z10) {
            if (z6) {
                arrayList.add(new k(i11, i10, 2));
                return;
            } else {
                arrayList.add(new k(i11, i10, 3));
                return;
            }
        }
        if (z6) {
            arrayList.add(new k(i11, i10, 1));
        } else {
            arrayList.add(new k(i11, i10, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        int i10 = 9;
        int i11 = 4;
        int i12 = 3;
        int i13 = 1;
        int i14 = 2;
        boolean z6 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        S3.a aVar = this.a;
        boolean zH = aVar.h("#");
        ArrayList arrayList = this.f15284c;
        if (zH) {
            String strE = aVar.e();
            qa.b.u(strE);
            arrayList.add(new e(strE, z6, 8));
            return;
        }
        if (aVar.h(".")) {
            String strE2 = aVar.e();
            qa.b.u(strE2);
            arrayList.add(new e(strE2.trim(), objArr7 == true ? 1 : 0, i14));
            return;
        }
        if (aVar.k() || aVar.i("*|")) {
            int i15 = aVar.f4529c;
            while (!aVar.g() && (aVar.k() || aVar.j("*|", "|", "_", "-"))) {
                aVar.f4529c++;
            }
            String strV = J7.j.v(aVar.f4528b.substring(i15, aVar.f4529c));
            qa.b.u(strV);
            if (!strV.startsWith("*|")) {
                if (strV.contains("|")) {
                    strV = strV.replace("|", ":");
                }
                arrayList.add(new e(strV, objArr == true ? 1 : 0, i10));
                return;
            }
            List listAsList = Arrays.asList(new e(strV.substring(2), objArr3 == true ? 1 : 0, i10), new e(strV.replace("*|", ":"), objArr2 == true ? 1 : 0, 10));
            b bVar = new b();
            int i16 = bVar.f15270b;
            ArrayList arrayList2 = bVar.a;
            if (i16 > 1) {
                arrayList2.add(new a(listAsList));
            } else {
                arrayList2.addAll(listAsList);
            }
            bVar.f15270b = arrayList2.size();
            arrayList.add(bVar);
            return;
        }
        boolean zI = aVar.i("[");
        String str = this.f15283b;
        if (zI) {
            S3.a aVar2 = new S3.a(aVar.a('[', ']'));
            String[] strArr = f15280e;
            int i17 = aVar2.f4529c;
            while (!aVar2.g() && !aVar2.j(strArr)) {
                aVar2.f4529c++;
            }
            String strSubstring = aVar2.f4528b.substring(i17, aVar2.f4529c);
            qa.b.u(strSubstring);
            aVar2.f();
            if (aVar2.g()) {
                if (strSubstring.startsWith("^")) {
                    arrayList.add(new e(strSubstring.substring(1), 1));
                    return;
                } else {
                    arrayList.add(new e(strSubstring, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0));
                    return;
                }
            }
            if (aVar2.h("=")) {
                arrayList.add(new f(strSubstring, 0, aVar2.l(), true));
                return;
            }
            if (aVar2.h("!=")) {
                arrayList.add(new f(strSubstring, 3, aVar2.l(), true));
                return;
            }
            if (aVar2.h("^=")) {
                arrayList.add(new f(strSubstring, 4, aVar2.l(), false));
                return;
            }
            if (aVar2.h("$=")) {
                arrayList.add(new f(strSubstring, 2, aVar2.l(), false));
                return;
            }
            if (aVar2.h("*=")) {
                arrayList.add(new f(strSubstring, 1, aVar2.l(), true));
                return;
            }
            if (!aVar2.h("~=")) {
                throw new Selector$SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", str, aVar2.l());
            }
            Pattern patternCompile = Pattern.compile(aVar2.l());
            g gVar = new g();
            gVar.a = J7.j.v(strSubstring);
            gVar.f15274b = patternCompile;
            arrayList.add(gVar);
            return;
        }
        if (aVar.h("*")) {
            arrayList.add(new d(objArr4 == true ? 1 : 0));
            return;
        }
        if (aVar.h(":lt(")) {
            arrayList.add(new h(b(), 2));
            return;
        }
        if (aVar.h(":gt(")) {
            arrayList.add(new h(b(), 1));
            return;
        }
        if (aVar.h(":eq(")) {
            arrayList.add(new h(b(), 0));
            return;
        }
        if (aVar.i(":has(")) {
            aVar.d(":has");
            String strA = aVar.a('(', ')');
            qa.b.v(strA, ":has(selector) sub-select must not be empty");
            arrayList.add(new p(j(strA)));
            return;
        }
        if (aVar.i(":contains(")) {
            c(false);
            return;
        }
        if (aVar.i(":containsOwn(")) {
            c(true);
            return;
        }
        if (aVar.i(":containsWholeText(")) {
            d(false);
            return;
        }
        if (aVar.i(":containsWholeOwnText(")) {
            d(true);
            return;
        }
        if (aVar.i(":containsData(")) {
            aVar.d(":containsData");
            String strM = S3.a.m(aVar.a('(', ')'));
            qa.b.v(strM, ":containsData(text) query must not be empty");
            arrayList.add(new e(strM, 3));
            return;
        }
        if (aVar.i(":matches(")) {
            g(false);
            return;
        }
        if (aVar.i(":matchesOwn(")) {
            g(true);
            return;
        }
        if (aVar.i(":matchesWholeText(")) {
            h(false);
            return;
        }
        if (aVar.i(":matchesWholeOwnText(")) {
            h(true);
            return;
        }
        if (aVar.i(":not(")) {
            aVar.d(":not");
            String strA2 = aVar.a('(', ')');
            qa.b.v(strA2, ":not(selector) subselect must not be empty");
            m mVarJ = j(strA2);
            q qVar = new q(i14);
            qVar.a = mVarJ;
            arrayList.add(qVar);
            return;
        }
        if (aVar.h(":nth-child(")) {
            e(false, false);
            return;
        }
        if (aVar.h(":nth-last-child(")) {
            e(true, false);
            return;
        }
        if (aVar.h(":nth-of-type(")) {
            e(false, true);
            return;
        }
        if (aVar.h(":nth-last-of-type(")) {
            e(true, true);
            return;
        }
        if (aVar.h(":first-child")) {
            arrayList.add(new d(i14));
            return;
        }
        if (aVar.h(":last-child")) {
            arrayList.add(new d(i12));
            return;
        }
        if (aVar.h(":first-of-type")) {
            arrayList.add(new i(0, 1, 3));
            return;
        }
        if (aVar.h(":last-of-type")) {
            arrayList.add(new j(0, 1, 2));
            return;
        }
        if (aVar.h(":only-child")) {
            arrayList.add(new d(i11));
            return;
        }
        if (aVar.h(":only-of-type")) {
            arrayList.add(new d(5));
            return;
        }
        if (aVar.h(":empty")) {
            arrayList.add(new d(i13));
        } else if (aVar.h(":root")) {
            arrayList.add(new d(6));
        } else {
            if (!aVar.h(":matchText")) {
                throw new Selector$SelectorParseException("Could not parse query '%s': unexpected token at '%s'", str, aVar.l());
            }
            arrayList.add(new d(7));
        }
    }

    public final void g(boolean z6) {
        String str = z6 ? ":matchesOwn" : ":matches";
        S3.a aVar = this.a;
        aVar.d(str);
        String strA = aVar.a('(', ')');
        qa.b.v(strA, str.concat("(regex) query must not be empty"));
        this.f15284c.add(z6 ? new l(Pattern.compile(strA), 1) : new l(Pattern.compile(strA), 0));
    }

    public final void h(boolean z6) {
        String str = z6 ? ":matchesWholeOwnText" : ":matchesWholeText";
        S3.a aVar = this.a;
        aVar.d(str);
        String strA = aVar.a('(', ')');
        qa.b.v(strA, str.concat("(regex) query must not be empty"));
        this.f15284c.add(z6 ? new l(Pattern.compile(strA), 2) : new l(Pattern.compile(strA), 3));
    }

    public final m i() {
        S3.a aVar = this.a;
        aVar.f();
        String[] strArr = f15279d;
        boolean zJ = aVar.j(strArr);
        ArrayList arrayList = this.f15284c;
        if (zJ) {
            arrayList.add(new d(8));
            a(aVar.c());
        } else {
            f();
        }
        while (!aVar.g()) {
            boolean zF = aVar.f();
            if (aVar.j(strArr)) {
                a(aVar.c());
            } else if (zF) {
                a(' ');
            } else {
                f();
            }
        }
        return arrayList.size() == 1 ? (m) arrayList.get(0) : new a(arrayList);
    }

    public final String toString() {
        return this.f15283b;
    }
}
