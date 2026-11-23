package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum I0 extends e1 {
    public I0() {
        super("Doctype", 50);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cE = c0787a.e();
        J0 j10 = e1.f14947r0;
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            n10.o(j10);
            return;
        }
        if (cE != '>') {
            if (cE != 65535) {
                n10.m(this);
                n10.o(j10);
                return;
            }
            n10.l(this);
        }
        n10.m(this);
        n10.f14849m.q();
        n10.f14849m.f14826f = true;
        n10.j();
        n10.o(e1.f14948s);
    }
}
