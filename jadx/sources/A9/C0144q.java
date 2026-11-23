package A9;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: renamed from: A9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0144q extends W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W f382c;

    public C0144q(W w2, W w10) {
        this.f381b = w2;
        this.f382c = w10;
    }

    @Override // A9.W
    public final boolean a() {
        return this.f381b.a() || this.f382c.a();
    }

    @Override // A9.W
    public final boolean b() {
        return this.f381b.b() || this.f382c.b();
    }

    @Override // A9.W
    public final M8.h c(M8.h hVar) {
        p210v8.i.f(hVar, "annotations");
        return this.f382c.c(this.f381b.c(hVar));
    }

    @Override // A9.W
    public final S d(AbstractC0151y abstractC0151y) {
        S sD = this.f381b.d(abstractC0151y);
        return sD == null ? this.f382c.d(abstractC0151y) : sD;
    }

    @Override // A9.W
    public final AbstractC0151y f(int i10, AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, "topLevelType");
        AbstractC0487g.p(i10, "position");
        return this.f382c.f(i10, this.f381b.f(i10, abstractC0151y));
    }
}
