package org.jsoup.nodes;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.helper.ValidationException;
import p188t1.Y;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements Cloneable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final List f13895u = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p f13896s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13897t;

    public static void q(StringBuilder sb, int i10, g gVar) {
        String strValueOf;
        Appendable appendableAppend = sb.append('\n');
        int iMin = i10 * gVar.f13871x;
        String[] strArr = ra.a.a;
        if (!(iMin >= 0)) {
            throw new ValidationException("width must be >= 0");
        }
        int i11 = gVar.f13872y;
        qa.b.r(i11 >= -1);
        if (i11 != -1) {
            iMin = Math.min(iMin, i11);
        }
        if (iMin < 21) {
            strValueOf = ra.a.a[iMin];
        } else {
            char[] cArr = new char[iMin];
            for (int i12 = 0; i12 < iMin; i12++) {
                cArr[i12] = ' ';
            }
            strValueOf = String.valueOf(cArr);
        }
        appendableAppend.append(strValueOf);
    }

    public p A() {
        p pVar = this;
        while (true) {
            p pVar2 = pVar.f13896s;
            if (pVar2 == null) {
                return pVar;
            }
            pVar = pVar2;
        }
    }

    public String a(String str) {
        qa.b.u(str);
        if (!p() || e().s(str) == -1) {
            return "";
        }
        String strF = f();
        String strM = e().m(str);
        Pattern pattern = ra.a.f14582d;
        String strReplaceAll = pattern.matcher(strF).replaceAll("");
        String strReplaceAll2 = pattern.matcher(strM).replaceAll("");
        try {
            try {
                return ra.a.h(new URL(strReplaceAll), strReplaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(strReplaceAll2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return ra.a.f14581c.matcher(strReplaceAll2).find() ? strReplaceAll2 : "";
        }
    }

    public final void c(int i10, p... pVarArr) {
        qa.b.w(pVarArr);
        if (pVarArr.length == 0) {
            return;
        }
        List listL = l();
        p pVarW = pVarArr[0].w();
        if (pVarW != null && pVarW.h() == pVarArr.length) {
            List listL2 = pVarW.l();
            int length = pVarArr.length;
            while (true) {
                int i11 = length - 1;
                if (length <= 0) {
                    boolean z6 = h() == 0;
                    pVarW.k();
                    listL.addAll(i10, Arrays.asList(pVarArr));
                    int length2 = pVarArr.length;
                    while (true) {
                        int i12 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        pVarArr[i12].f13896s = this;
                        length2 = i12;
                    }
                    if (z6 && pVarArr[0].f13897t == 0) {
                        return;
                    }
                    x(i10);
                    return;
                }
                if (pVarArr[i11] != listL2.get(i11)) {
                    break;
                } else {
                    length = i11;
                }
            }
        }
        for (p pVar : pVarArr) {
            if (pVar == null) {
                throw new ValidationException("Array must not contain any null objects");
            }
        }
        for (p pVar2 : pVarArr) {
            pVar2.getClass();
            p pVar3 = pVar2.f13896s;
            if (pVar3 != null) {
                pVar3.z(pVar2);
            }
            pVar2.f13896s = this;
        }
        listL.addAll(i10, Arrays.asList(pVarArr));
        x(i10);
    }

    public String d(String str) {
        qa.b.w(str);
        if (!p()) {
            return "";
        }
        String strM = e().m(str);
        if (strM.length() > 0) {
            return strM;
        }
        return str.startsWith("abs:") ? a(str.substring(4)) : "";
    }

    public abstract c e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract String f();

    public abstract int h();

    @Override // 
    public p i() {
        p pVarJ = j(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(pVarJ);
        while (!linkedList.isEmpty()) {
            p pVar = (p) linkedList.remove();
            int iH = pVar.h();
            for (int i10 = 0; i10 < iH; i10++) {
                List listL = pVar.l();
                p pVarJ2 = ((p) listL.get(i10)).j(pVar);
                listL.set(i10, pVarJ2);
                linkedList.add(pVarJ2);
            }
        }
        return pVarJ;
    }

    public p j(p pVar) {
        try {
            p pVar2 = (p) super.clone();
            pVar2.f13896s = pVar;
            pVar2.f13897t = pVar == null ? 0 : this.f13897t;
            if (pVar == null && !(this instanceof h)) {
                p pVarA = A();
                h hVar = pVarA instanceof h ? (h) pVarA : null;
                if (hVar != null) {
                    h hVar2 = new h(hVar.f());
                    c cVar = hVar.f13883y;
                    if (cVar != null) {
                        hVar2.f13883y = cVar.clone();
                    }
                    hVar2.f13874B = hVar.f13874B.clone();
                    pVar2.f13896s = hVar2;
                    hVar2.l().add(pVar2);
                }
            }
            return pVar2;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public abstract p k();

    public abstract List l();

    public final boolean m(String str) {
        qa.b.w(str);
        if (!p()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (e().s(strSubstring) != -1 && !a(strSubstring).isEmpty()) {
                return true;
            }
        }
        return e().s(str) != -1;
    }

    public abstract boolean p();

    public final p r() {
        p pVar = this.f13896s;
        if (pVar == null) {
            return null;
        }
        List listL = pVar.l();
        int i10 = this.f13897t + 1;
        if (listL.size() > i10) {
            return (p) listL.get(i10);
        }
        return null;
    }

    public abstract String s();

    public String t() {
        StringBuilder sbB = ra.a.b();
        p pVarA = A();
        h hVar = pVarA instanceof h ? (h) pVarA : null;
        if (hVar == null) {
            hVar = new h("");
        }
        Y.z(new o1.r(sbB, hVar.f13874B), this);
        return ra.a.g(sbB);
    }

    public String toString() {
        return t();
    }

    public abstract void u(StringBuilder sb, int i10, g gVar);

    public abstract void v(StringBuilder sb, int i10, g gVar);

    public p w() {
        return this.f13896s;
    }

    public final void x(int i10) {
        int iH = h();
        if (iH == 0) {
            return;
        }
        List listL = l();
        while (i10 < iH) {
            ((p) listL.get(i10)).f13897t = i10;
            i10++;
        }
    }

    public final void y() {
        qa.b.w(this.f13896s);
        this.f13896s.z(this);
    }

    public void z(p pVar) {
        qa.b.r(pVar.f13896s == this);
        int i10 = pVar.f13897t;
        l().remove(i10);
        x(i10);
        pVar.f13896s = null;
    }
}
