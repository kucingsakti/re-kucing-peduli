package org.jsoup.nodes;

import sa.C;
import sa.E;

/* JADX INFO: loaded from: classes.dex */
public final class n extends k {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C f13893B;

    public n(E e10, c cVar) {
        super(e10, null, cVar);
        this.f13893B = new C();
    }

    @Override // org.jsoup.nodes.k
    /* JADX INFO: renamed from: F */
    public final k clone() {
        return (n) super.clone();
    }

    @Override // org.jsoup.nodes.k, org.jsoup.nodes.p
    /* JADX INFO: renamed from: clone */
    public final Object i() {
        return (n) super.clone();
    }

    @Override // org.jsoup.nodes.k, org.jsoup.nodes.p
    public final p i() {
        return (n) super.clone();
    }

    @Override // org.jsoup.nodes.p
    public final void z(p pVar) {
        super.z(pVar);
        this.f13893B.remove(pVar);
    }
}
