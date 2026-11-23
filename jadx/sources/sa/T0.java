package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum T0 extends e1 {
    public T0() {
        super("AfterDoctypeSystemKeyword", 60);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cE = c0787a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            n10.o(e1.f14899B0);
            return;
        }
        if (cE == '\"') {
            n10.m(this);
            n10.o(e1.f14901C0);
            return;
        }
        if (cE == '\'') {
            n10.m(this);
            n10.o(e1.f14903D0);
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
            n10.j();
        } else {
            n10.l(this);
            n10.f14849m.f14826f = true;
            n10.j();
            n10.o(z6);
        }
    }
}
