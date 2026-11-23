package org.jsoup.nodes;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class r extends o {
    public r(String str) {
        this.f13894v = str;
    }

    public static boolean F(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // org.jsoup.nodes.p
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public r i() {
        return (r) super.i();
    }

    @Override // org.jsoup.nodes.p
    public String s() {
        return "#text";
    }

    @Override // org.jsoup.nodes.p
    public final String toString() {
        return t();
    }

    @Override // org.jsoup.nodes.p
    public void u(StringBuilder sb, int i10, g gVar) throws IOException {
        boolean z6;
        boolean z10;
        boolean z11 = gVar.f13870w;
        p pVar = this.f13896s;
        k kVar = pVar instanceof k ? (k) pVar : null;
        boolean z12 = z11 && !k.L(pVar);
        if (z12) {
            boolean z13 = (this.f13897t == 0 && kVar != null && kVar.f13880v.f14813u) || (this.f13896s instanceof h);
            boolean z14 = r() == null && kVar != null && kVar.f13880v.f14813u;
            p pVarR = r();
            if ((((pVarR instanceof k) && ((k) pVarR).O(gVar)) || ((pVarR instanceof r) && ra.a.d(((r) pVarR).C()))) && ra.a.d(C())) {
                return;
            }
            if (this.f13897t == 0 && kVar != null && kVar.f13880v.f14814v && !ra.a.d(C())) {
                p.q(sb, i10, gVar);
            }
            z6 = z13;
            z10 = z14;
        } else {
            z6 = false;
            z10 = false;
        }
        m.b(sb, C(), gVar, false, z12, z6, z10);
    }

    @Override // org.jsoup.nodes.p
    public void v(StringBuilder sb, int i10, g gVar) {
    }
}
