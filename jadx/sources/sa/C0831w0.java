package sa;

/* JADX INFO: renamed from: sa.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0831w0 extends e1 {
    public C0831w0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        String strK = c0787a.k(e1.f14913I0);
        if (strK.length() > 0) {
            n10.f14847k.t(strK);
        }
        char cE = c0787a.e();
        if (cE == 0) {
            n10.m(this);
            n10.f14847k.s((char) 65533);
            return;
        }
        if (cE != ' ') {
            if (cE != '\"' && cE != '`') {
                Z z6 = e1.f14948s;
                if (cE == 65535) {
                    n10.l(this);
                    n10.o(z6);
                    return;
                }
                if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r') {
                    if (cE == '&') {
                        int[] iArrB = n10.b('>', true);
                        if (iArrB != null) {
                            n10.f14847k.u(iArrB);
                            return;
                        } else {
                            n10.f14847k.s('&');
                            return;
                        }
                    }
                    if (cE != '\'') {
                        switch (cE) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                n10.k();
                                n10.o(z6);
                                break;
                            default:
                                n10.f14847k.s(cE);
                                break;
                        }
                        return;
                    }
                }
            }
            n10.m(this);
            n10.f14847k.s(cE);
            return;
        }
        n10.o(e1.f14931Z);
    }
}
