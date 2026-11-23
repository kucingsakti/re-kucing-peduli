package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum K0 extends e1 {
    public K0() {
        super("DoctypeName", 52);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        if (c0787a.u()) {
            n10.f14849m.f14822b.append(c0787a.h());
            return;
        }
        char cE = c0787a.e();
        if (cE == 0) {
            n10.m(this);
            n10.f14849m.f14822b.append((char) 65533);
            return;
        }
        if (cE != ' ') {
            Z z6 = e1.f14948s;
            if (cE == '>') {
                n10.j();
                n10.o(z6);
                return;
            }
            if (cE == 65535) {
                n10.l(this);
                n10.f14849m.f14826f = true;
                n10.j();
                n10.o(z6);
                return;
            }
            if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r') {
                n10.f14849m.f14822b.append(cE);
                return;
            }
        }
        n10.o(e1.f14951t0);
    }
}
