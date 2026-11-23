package org.jsoup.nodes;

import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends o {
    public final boolean E(String str) {
        return !ra.a.d(d(str));
    }

    @Override // org.jsoup.nodes.p
    public final String s() {
        return "#doctype";
    }

    @Override // org.jsoup.nodes.p
    public final void u(StringBuilder sb, int i10, g gVar) throws IOException {
        if (this.f13897t > 0 && gVar.f13870w) {
            sb.append('\n');
        }
        if (gVar.f13873z != 1 || E("publicId") || E("systemId")) {
            sb.append("<!DOCTYPE");
        } else {
            sb.append("<!doctype");
        }
        if (E(MediationMetaData.KEY_NAME)) {
            sb.append(" ").append(d(MediationMetaData.KEY_NAME));
        }
        if (E("pubSysKey")) {
            sb.append(" ").append(d("pubSysKey"));
        }
        if (E("publicId")) {
            sb.append(" \"").append(d("publicId")).append('\"');
        }
        if (E("systemId")) {
            sb.append(" \"").append(d("systemId")).append('\"');
        }
        sb.append('>');
    }

    @Override // org.jsoup.nodes.p
    public final void v(StringBuilder sb, int i10, g gVar) {
    }
}
