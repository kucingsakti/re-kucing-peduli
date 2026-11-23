package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum W0 extends e1 {
    public W0() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cE = c0787a.e();
        if (cE == 0) {
            n10.m(this);
            n10.f14849m.f14825e.append((char) 65533);
            return;
        }
        if (cE == '\'') {
            n10.o(e1.f14905E0);
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
            n10.f14849m.f14825e.append(cE);
            return;
        }
        n10.l(this);
        n10.f14849m.f14826f = true;
        n10.j();
        n10.o(z6);
    }
}
