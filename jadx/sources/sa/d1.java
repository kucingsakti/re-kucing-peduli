package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum d1 extends e1 {
    public d1() {
        super("EndTagOpen", 8);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        boolean zN = c0787a.n();
        Z z6 = e1.f14948s;
        if (zN) {
            n10.l(this);
            n10.g("</");
            n10.o(z6);
        } else if (c0787a.t()) {
            n10.c(false);
            n10.o(e1.f14898B);
        } else if (c0787a.r('>')) {
            n10.m(this);
            n10.o(z6);
            n10.a.a();
        } else {
            n10.m(this);
            n10.f14850n.q();
            n10.f14850n.s('/');
            n10.o(e1.f14938i0);
        }
    }
}
