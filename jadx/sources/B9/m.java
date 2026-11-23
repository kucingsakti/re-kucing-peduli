package B9;

import A9.AbstractC0151y;
import A9.C0133f;

/* JADX INFO: loaded from: classes.dex */
public final class m implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f794c = e.f778s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p124m9.l f795d = new p124m9.l(p124m9.l.f13175d);

    public final boolean a(AbstractC0151y abstractC0151y, AbstractC0151y abstractC0151y2) {
        p210v8.i.f(abstractC0151y, R5.a.PUSH_ADDITIONAL_DATA_KEY);
        p210v8.i.f(abstractC0151y2, "b");
        return C0133f.g(g.l(false, this.f794c, 6), abstractC0151y.D0(), abstractC0151y2.D0());
    }

    public final boolean b(AbstractC0151y abstractC0151y, AbstractC0151y abstractC0151y2) {
        p210v8.i.f(abstractC0151y, "subtype");
        p210v8.i.f(abstractC0151y2, "supertype");
        return C0133f.n(C0133f.a, g.l(true, this.f794c, 6), abstractC0151y.D0(), abstractC0151y2.D0());
    }
}
