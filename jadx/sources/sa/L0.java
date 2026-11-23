package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum L0 extends e1 {
    public L0() {
        super("AfterDoctypeName", 53);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        boolean zN = c0787a.n();
        Z z6 = e1.f14948s;
        if (zN) {
            n10.l(this);
            n10.f14849m.f14826f = true;
            n10.j();
            n10.o(z6);
            return;
        }
        if (c0787a.s('\t', '\n', '\r', '\f', ' ')) {
            c0787a.a();
            return;
        }
        if (c0787a.r('>')) {
            n10.j();
            n10.o(z6);
            n10.a.a();
        } else if (c0787a.q("PUBLIC")) {
            n10.f14849m.f14823c = "PUBLIC";
            n10.o(e1.f14953u0);
        } else if (c0787a.q("SYSTEM")) {
            n10.f14849m.f14823c = "SYSTEM";
            n10.o(e1.f14897A0);
        } else {
            n10.m(this);
            n10.f14849m.f14826f = true;
            n10.o(e1.f14907F0);
            n10.a.a();
        }
    }
}
