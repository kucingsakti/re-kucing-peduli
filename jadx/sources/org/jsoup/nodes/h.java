package org.jsoup.nodes;

import java.util.HashMap;
import p188t1.Y;
import sa.C0789b;
import sa.E;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public g f13874B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public p102k7.e f13875C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f13876D;

    public h(String str) {
        HashMap map = E.f14803B;
        E e10 = (E) map.get("#root");
        if (e10 == null) {
            String strT = J7.j.t("#root");
            qa.b.u(strT);
            e10 = (E) map.get(J7.j.t(strT));
            if (e10 == null) {
                e10 = new E(strT);
                e10.f14813u = false;
            }
        }
        super(e10, str, null);
        this.f13874B = new g();
        this.f13876D = 1;
        this.f13875C = new p102k7.e(new C0789b());
    }

    @Override // org.jsoup.nodes.k
    /* JADX INFO: renamed from: F */
    public final k clone() {
        h hVar = (h) super.clone();
        hVar.f13874B = this.f13874B.clone();
        return hVar;
    }

    @Override // org.jsoup.nodes.k, org.jsoup.nodes.p
    /* JADX INFO: renamed from: clone */
    public final Object i() {
        h hVar = (h) super.clone();
        hVar.f13874B = this.f13874B.clone();
        return hVar;
    }

    @Override // org.jsoup.nodes.k, org.jsoup.nodes.p
    public final p i() {
        h hVar = (h) super.clone();
        hVar.f13874B = this.f13874B.clone();
        return hVar;
    }

    @Override // org.jsoup.nodes.k, org.jsoup.nodes.p
    public final String s() {
        return "#document";
    }

    @Override // org.jsoup.nodes.p
    public final String t() {
        h hVar;
        StringBuilder sbB = ra.a.b();
        int size = this.f13882x.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            p pVar = (p) this.f13882x.get(i10);
            p pVarA = pVar.A();
            hVar = pVarA instanceof h ? (h) pVarA : null;
            if (hVar == null) {
                hVar = new h("");
            }
            Y.z(new o1.r(sbB, hVar.f13874B), pVar);
            i10++;
        }
        String strG = ra.a.g(sbB);
        p pVarA2 = A();
        hVar = pVarA2 instanceof h ? (h) pVarA2 : null;
        return (hVar != null ? hVar.f13874B : new h("").f13874B).f13870w ? strG.trim() : strG;
    }
}
