package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum H0 extends e1 {
    public H0() {
        super("CommentEndBang", 49);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cE = c0787a.e();
        D0 d3 = e1.f14942m0;
        if (cE == 0) {
            n10.m(this);
            H h10 = n10.f14850n;
            h10.t("--!");
            h10.s((char) 65533);
            n10.o(d3);
            return;
        }
        if (cE == '-') {
            n10.f14850n.t("--!");
            n10.o(e1.f14943n0);
            return;
        }
        Z z6 = e1.f14948s;
        if (cE == '>') {
            n10.i();
            n10.o(z6);
        } else if (cE == 65535) {
            n10.l(this);
            n10.i();
            n10.o(z6);
        } else {
            H h11 = n10.f14850n;
            h11.t("--!");
            h11.s(cE);
            n10.o(d3);
        }
    }
}
