package p114l9;

import A9.AbstractC0151y;
import A9.S;
import E0.a;
import p145o9.g;
import p200u8.b;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f12976t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i10) {
        super(1);
        this.f12975s = i10;
        this.f12976t = gVar;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f12975s) {
            case 0:
                S s9 = (S) obj;
                i.f(s9, "it");
                if (s9.c()) {
                    return "*";
                }
                AbstractC0151y abstractC0151yB = s9.b();
                i.e(abstractC0151yB, "it.type");
                String strY = this.f12976t.Y(abstractC0151yB);
                if (s9.a() == 1) {
                    return strY;
                }
                return a.r(s9.a()) + ' ' + strY;
            case 1:
                g gVar = (g) obj;
                i.f(gVar, "it");
                return this.f12976t.B(gVar);
            default:
                AbstractC0151y abstractC0151y = (AbstractC0151y) obj;
                i.e(abstractC0151y, "it");
                return this.f12976t.Y(abstractC0151y);
        }
    }
}
