package org.jsoup.nodes;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import p188t1.Y;
import sa.C;
import sa.E;
import sa.K;
import sa.L;

/* JADX INFO: loaded from: classes.dex */
public class k extends p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f13878A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final List f13879z = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final E f13880v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WeakReference f13881w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f13882x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c f13883y;

    static {
        Pattern.compile("\\s+");
        f13878A = "/".concat("baseUri");
    }

    public k(E e10, String str, c cVar) {
        qa.b.w(e10);
        this.f13882x = p.f13895u;
        this.f13883y = cVar;
        this.f13880v = e10;
        if (str != null) {
            H(str);
        }
    }

    public static void D(p pVar, StringBuilder sb) {
        if (pVar instanceof r) {
            sb.append(((r) pVar).C());
        } else if ((pVar instanceof k) && ((k) pVar).f13880v.f14812t.equals("br")) {
            sb.append("\n");
        }
    }

    public static boolean L(p pVar) {
        if (pVar instanceof k) {
            k kVar = (k) pVar;
            int i10 = 0;
            while (!kVar.f13880v.f14817y) {
                kVar = (k) kVar.f13896s;
                i10++;
                if (i10 >= 6 || kVar == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // org.jsoup.nodes.p
    public final p A() {
        p pVar = this;
        while (true) {
            p pVar2 = pVar.f13896s;
            if (pVar2 == null) {
                return (k) pVar;
            }
            pVar = pVar2;
        }
    }

    public final void B(p pVar) {
        p pVar2 = pVar.f13896s;
        if (pVar2 != null) {
            pVar2.z(pVar);
        }
        pVar.f13896s = this;
        l();
        this.f13882x.add(pVar);
        pVar.f13897t = this.f13882x.size() - 1;
    }

    public final k C(String str) {
        p pVarA = A();
        h hVar = pVarA instanceof h ? (h) pVarA : null;
        int i10 = 0;
        if (hVar == null || hVar.f13875C == null) {
            new L();
            new K();
            new C(i10, 0);
        }
        HashMap map = E.f14803B;
        E e10 = (E) map.get(str);
        if (e10 == null) {
            String strT = J7.j.t(str.trim());
            qa.b.u(strT);
            e10 = (E) map.get(J7.j.t(strT));
            if (e10 == null) {
                e10 = new E(strT);
                e10.f14813u = false;
            }
        }
        k kVar = new k(e10, f(), null);
        B(kVar);
        return kVar;
    }

    public final List E() {
        List list;
        if (this.f13882x.size() == 0) {
            return f13879z;
        }
        WeakReference weakReference = this.f13881w;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.f13882x.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) this.f13882x.get(i10);
            if (pVar instanceof k) {
                arrayList.add((k) pVar);
            }
        }
        this.f13881w = new WeakReference(arrayList);
        return arrayList;
    }

    @Override // org.jsoup.nodes.p
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public k i() {
        return (k) super.i();
    }

    public final String G() {
        StringBuilder sbB = ra.a.b();
        for (p pVar : this.f13882x) {
            if (pVar instanceof f) {
                sbB.append(((f) pVar).C());
            } else if (pVar instanceof e) {
                sbB.append(((e) pVar).C());
            } else if (pVar instanceof k) {
                sbB.append(((k) pVar).G());
            } else if (pVar instanceof d) {
                sbB.append(((d) pVar).C());
            }
        }
        return ra.a.g(sbB);
    }

    public final void H(String str) {
        e().v(f13878A, str);
    }

    public final int I() {
        k kVar = (k) this.f13896s;
        if (kVar == null) {
            return 0;
        }
        List listE = kVar.E();
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (listE.get(i10) == this) {
                return i10;
            }
        }
        return 0;
    }

    public final String J() {
        StringBuilder sbB = ra.a.b();
        for (int i10 = 0; i10 < this.f13882x.size(); i10++) {
            p pVar = (p) this.f13882x.get(i10);
            if (pVar instanceof r) {
                r rVar = (r) pVar;
                String strC = rVar.C();
                if (L(rVar.f13896s) || (rVar instanceof d)) {
                    sbB.append(strC);
                } else {
                    ra.a.a(strC, sbB, r.F(sbB));
                }
            } else if ((pVar instanceof k) && ((k) pVar).f13880v.f14812t.equals("br") && !r.F(sbB)) {
                sbB.append(" ");
            }
        }
        return ra.a.g(sbB).trim();
    }

    public final k M() {
        p pVar = this.f13896s;
        if (pVar == null) {
            return null;
        }
        List listE = ((k) pVar).E();
        int size = listE.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (listE.get(i11) == this) {
                i10 = i11;
                break;
            }
        }
        if (i10 > 0) {
            return (k) listE.get(i10 - 1);
        }
        return null;
    }

    public final C N(String str) {
        qa.b.u(str);
        ta.m mVarJ = ta.o.j(str);
        qa.b.w(mVarJ);
        C c10 = new C();
        Y.z(new Y1.c(this, c10, mVarJ, 26), this);
        return c10;
    }

    public final boolean O(g gVar) {
        k kVar;
        if (!gVar.f13870w) {
            return false;
        }
        E e10 = this.f13880v;
        if (!e10.f14814v && ((kVar = (k) this.f13896s) == null || !kVar.f13880v.f14814v)) {
            return false;
        }
        if (!e10.f14813u) {
            p pVar = this.f13896s;
            k kVar2 = (k) pVar;
            if (kVar2 == null || kVar2.f13880v.f14813u) {
                p pVar2 = null;
                if (pVar != null && this.f13897t > 0) {
                    pVar2 = (p) pVar.l().get(this.f13897t - 1);
                }
                if (pVar2 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String P() {
        StringBuilder sbB = ra.a.b();
        Y.z(new p081i3.b(sbB, 12), this);
        return ra.a.g(sbB).trim();
    }

    public final String Q() {
        StringBuilder sbB = ra.a.b();
        int size = this.f13882x.size();
        for (int i10 = 0; i10 < size; i10++) {
            D((p) this.f13882x.get(i10), sbB);
        }
        return ra.a.g(sbB);
    }

    @Override // org.jsoup.nodes.p
    public final c e() {
        if (this.f13883y == null) {
            this.f13883y = new c();
        }
        return this.f13883y;
    }

    @Override // org.jsoup.nodes.p
    public final String f() {
        for (k kVar = this; kVar != null; kVar = (k) kVar.f13896s) {
            c cVar = kVar.f13883y;
            if (cVar != null) {
                String str = f13878A;
                if (cVar.r(str) != -1) {
                    return kVar.f13883y.k(str);
                }
            }
        }
        return "";
    }

    @Override // org.jsoup.nodes.p
    public final int h() {
        return this.f13882x.size();
    }

    @Override // org.jsoup.nodes.p
    public final p j(p pVar) {
        k kVar = (k) super.j(pVar);
        c cVar = this.f13883y;
        kVar.f13883y = cVar != null ? cVar.clone() : null;
        j jVar = new j(kVar, this.f13882x.size());
        kVar.f13882x = jVar;
        jVar.addAll(this.f13882x);
        return kVar;
    }

    @Override // org.jsoup.nodes.p
    public final p k() {
        this.f13882x.clear();
        return this;
    }

    @Override // org.jsoup.nodes.p
    public final List l() {
        if (this.f13882x == p.f13895u) {
            this.f13882x = new j(this, 4);
        }
        return this.f13882x;
    }

    @Override // org.jsoup.nodes.p
    public final boolean p() {
        return this.f13883y != null;
    }

    @Override // org.jsoup.nodes.p
    public String s() {
        return this.f13880v.f14811s;
    }

    @Override // org.jsoup.nodes.p
    public void u(StringBuilder sb, int i10, g gVar) throws IOException {
        if (O(gVar) && (!(sb instanceof StringBuilder) || sb.length() > 0)) {
            p.q(sb, i10, gVar);
        }
        Appendable appendableAppend = sb.append('<');
        E e10 = this.f13880v;
        appendableAppend.append(e10.f14811s);
        c cVar = this.f13883y;
        if (cVar != null) {
            cVar.q(sb, gVar);
        }
        if (this.f13882x.isEmpty()) {
            boolean z6 = e10.f14815w;
            if (z6 || e10.f14816x) {
                if (gVar.f13873z == 1 && z6) {
                    sb.append('>');
                    return;
                } else {
                    sb.append(" />");
                    return;
                }
            }
        }
        sb.append('>');
    }

    @Override // org.jsoup.nodes.p
    public void v(StringBuilder sb, int i10, g gVar) throws IOException {
        boolean zIsEmpty = this.f13882x.isEmpty();
        E e10 = this.f13880v;
        if (zIsEmpty && (e10.f14815w || e10.f14816x)) {
            return;
        }
        if (gVar.f13870w && !this.f13882x.isEmpty() && e10.f14814v) {
            p.q(sb, i10, gVar);
        }
        sb.append("</").append(e10.f14811s).append('>');
    }

    @Override // org.jsoup.nodes.p
    public final p w() {
        return (k) this.f13896s;
    }
}
