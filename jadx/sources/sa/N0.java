package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum N0 extends e1 {
    public N0() {
        super("BeforeDoctypePublicIdentifier", 55);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cE = c0787a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            return;
        }
        if (cE == '\"') {
            n10.o(e1.f14957w0);
            return;
        }
        if (cE == '\'') {
            n10.o(e1.f14959x0);
            return;
        }
        Z z6 = e1.f14948s;
        if (cE == '>') {
            n10.m(this);
            n10.f14849m.f14826f = true;
            n10.j();
            n10.o(z6);
            return;
        }
        if (cE != 65535) {
            n10.m(this);
            n10.f14849m.f14826f = true;
            n10.o(e1.f14907F0);
        } else {
            n10.l(this);
            n10.f14849m.f14826f = true;
            n10.j();
            n10.o(z6);
        }
    }
}
