package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.UncheckedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends r {
    @Override // org.jsoup.nodes.r
    /* JADX INFO: renamed from: E */
    public final r i() {
        return (d) super.i();
    }

    @Override // org.jsoup.nodes.r, org.jsoup.nodes.p
    /* JADX INFO: renamed from: clone */
    public final Object i() {
        return (d) super.i();
    }

    @Override // org.jsoup.nodes.r, org.jsoup.nodes.p
    public final p i() {
        return (d) super.i();
    }

    @Override // org.jsoup.nodes.r, org.jsoup.nodes.p
    public final String s() {
        return "#cdata";
    }

    @Override // org.jsoup.nodes.r, org.jsoup.nodes.p
    public final void u(StringBuilder sb, int i10, g gVar) throws IOException {
        sb.append("<![CDATA[").append(C());
    }

    @Override // org.jsoup.nodes.r, org.jsoup.nodes.p
    public final void v(StringBuilder sb, int i10, g gVar) {
        try {
            sb.append("]]>");
        } catch (IOException e10) {
            throw new UncheckedIOException(e10);
        }
    }
}
