package O8;

import A9.C0133f;
import A9.b0;
import java.util.List;

/* JADX INFO: renamed from: O8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0345a implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC0346b f3696t;

    public /* synthetic */ C0345a(AbstractC0346b abstractC0346b, int i10) {
        this.f3695s = i10;
        this.f3696t = abstractC0346b;
    }

    @Override // p200u8.a
    public final Object invoke() {
        AbstractC0346b abstractC0346b = this.f3696t;
        switch (this.f3695s) {
            case 0:
                t9.n nVarZ0 = abstractC0346b.z0();
                I8.g gVar = new I8.g(this, 1);
                C9.f fVar = b0.a;
                if (C9.i.f(abstractC0346b)) {
                    return C9.i.c(C9.h.UNABLE_TO_SUBSTITUTE_TYPE, abstractC0346b.toString());
                }
                A9.O oI = abstractC0346b.I();
                if (oI == null) {
                    b0.a(12);
                    throw null;
                }
                if (nVarZ0 == null) {
                    b0.a(13);
                    throw null;
                }
                List listD = b0.d(oI.u());
                A9.K.f338t.getClass();
                return C0133f.t(A9.K.f339u, oI, listD, false, nVarZ0, gVar);
            case 1:
                return new t9.i(abstractC0346b.z0());
            default:
                return new x(abstractC0346b);
        }
    }
}
