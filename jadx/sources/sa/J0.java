package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum J0 extends e1 {
    public J0() {
        super("BeforeDoctypeName", 51);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        boolean zT = c0787a.t();
        K0 k3 = e1.f14949s0;
        if (zT) {
            n10.f14849m.q();
            n10.o(k3);
            return;
        }
        char cE = c0787a.e();
        if (cE == 0) {
            n10.m(this);
            n10.f14849m.q();
            n10.f14849m.f14822b.append((char) 65533);
            n10.o(k3);
            return;
        }
        if (cE != ' ') {
            if (cE == 65535) {
                n10.l(this);
                n10.f14849m.q();
                n10.f14849m.f14826f = true;
                n10.j();
                n10.o(e1.f14948s);
                return;
            }
            if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                return;
            }
            n10.f14849m.q();
            n10.f14849m.f14822b.append(cE);
            n10.o(k3);
        }
    }
}
