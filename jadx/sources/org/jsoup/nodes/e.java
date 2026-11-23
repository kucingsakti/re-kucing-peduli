package org.jsoup.nodes;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends o {
    @Override // org.jsoup.nodes.p
    /* JADX INFO: renamed from: clone */
    public final Object i() {
        return (e) super.i();
    }

    @Override // org.jsoup.nodes.p
    public final p i() {
        return (e) super.i();
    }

    @Override // org.jsoup.nodes.p
    public final String s() {
        return "#comment";
    }

    @Override // org.jsoup.nodes.p
    public final String toString() {
        return t();
    }

    @Override // org.jsoup.nodes.p
    public final void u(StringBuilder sb, int i10, g gVar) throws IOException {
        if (gVar.f13870w && this.f13897t == 0) {
            p pVar = this.f13896s;
            if ((pVar instanceof k) && ((k) pVar).f13880v.f14814v) {
                p.q(sb, i10, gVar);
            }
        }
        sb.append("<!--").append(C()).append("-->");
    }

    @Override // org.jsoup.nodes.p
    public final void v(StringBuilder sb, int i10, g gVar) {
    }
}
