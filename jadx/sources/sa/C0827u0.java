package sa;

/* JADX INFO: renamed from: sa.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0827u0 extends e1 {
    public C0827u0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        String strF = c0787a.f(true);
        if (strF.length() > 0) {
            n10.f14847k.t(strF);
        } else {
            n10.f14847k.j = true;
        }
        char cE = c0787a.e();
        if (cE == 0) {
            n10.m(this);
            n10.f14847k.s((char) 65533);
            return;
        }
        if (cE == 65535) {
            n10.l(this);
            n10.o(e1.f14948s);
            return;
        }
        if (cE != '&') {
            if (cE != '\'') {
                n10.f14847k.s(cE);
                return;
            } else {
                n10.o(e1.f14936g0);
                return;
            }
        }
        int[] iArrB = n10.b('\'', true);
        if (iArrB != null) {
            n10.f14847k.u(iArrB);
        } else {
            n10.f14847k.s('&');
        }
    }
}
