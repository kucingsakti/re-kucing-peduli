package sa;

/* JADX INFO: renamed from: sa.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0823s0 extends e1 {
    public C0823s0() {
        super("BeforeAttributeValue", 36);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cE = c0787a.e();
        C0831w0 c0831w0 = e1.f0;
        if (cE == 0) {
            n10.m(this);
            n10.f14847k.s((char) 65533);
            n10.o(c0831w0);
            return;
        }
        if (cE != ' ') {
            if (cE == '\"') {
                n10.o(e1.f14934d0);
                return;
            }
            if (cE != '`') {
                Z z6 = e1.f14948s;
                if (cE == 65535) {
                    n10.l(this);
                    n10.k();
                    n10.o(z6);
                    return;
                }
                if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                    return;
                }
                if (cE == '&') {
                    c0787a.y();
                    n10.o(c0831w0);
                    return;
                }
                if (cE == '\'') {
                    n10.o(e1.f14935e0);
                    return;
                }
                switch (cE) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        n10.m(this);
                        n10.k();
                        n10.o(z6);
                        break;
                    default:
                        c0787a.y();
                        n10.o(c0831w0);
                        break;
                }
                return;
            }
            n10.m(this);
            n10.f14847k.s(cE);
            n10.o(c0831w0);
        }
    }
}
