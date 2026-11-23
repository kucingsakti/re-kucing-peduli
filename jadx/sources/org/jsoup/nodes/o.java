package org.jsoup.nodes;

import java.util.List;
import sa.C;
import sa.K;
import sa.L;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f13894v;

    public final o B(String str, String str2) {
        if (!(this.f13894v instanceof c) && str.equals("#doctype")) {
            this.f13894v = str2;
            return this;
        }
        D();
        p pVarA = A();
        h hVar = pVarA instanceof h ? (h) pVarA : null;
        if (hVar == null || hVar.f13875C == null) {
            new L();
            new K();
            new C(0, 0);
        }
        String strT = J7.j.t(str.trim());
        c cVarE = e();
        int iS = cVarE.s(strT);
        if (iS == -1) {
            cVarE.d(strT, str2);
            return this;
        }
        cVarE.f13865u[iS] = str2;
        if (!cVarE.f13864t[iS].equals(strT)) {
            cVarE.f13864t[iS] = strT;
        }
        return this;
    }

    public final String C() {
        return d(s());
    }

    public final void D() {
        Object obj = this.f13894v;
        if (obj instanceof c) {
            return;
        }
        c cVar = new c();
        this.f13894v = cVar;
        if (obj != null) {
            cVar.v(s(), (String) obj);
        }
    }

    @Override // org.jsoup.nodes.p
    public final String a(String str) {
        D();
        return super.a(str);
    }

    @Override // org.jsoup.nodes.p
    public final String d(String str) {
        if (this.f13894v instanceof c) {
            return super.d(str);
        }
        return s().equals(str) ? (String) this.f13894v : "";
    }

    @Override // org.jsoup.nodes.p
    public final c e() {
        D();
        return (c) this.f13894v;
    }

    @Override // org.jsoup.nodes.p
    public final String f() {
        p pVar = this.f13896s;
        return pVar != null ? pVar.f() : "";
    }

    @Override // org.jsoup.nodes.p
    public final int h() {
        return 0;
    }

    @Override // org.jsoup.nodes.p
    public final p j(p pVar) {
        o oVar = (o) super.j(pVar);
        Object obj = this.f13894v;
        if (obj instanceof c) {
            oVar.f13894v = ((c) obj).clone();
        }
        return oVar;
    }

    @Override // org.jsoup.nodes.p
    public final p k() {
        return this;
    }

    @Override // org.jsoup.nodes.p
    public final List l() {
        return p.f13895u;
    }

    @Override // org.jsoup.nodes.p
    public final boolean p() {
        return this.f13894v instanceof c;
    }
}
