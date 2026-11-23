package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum B0 extends e1 {
    public B0() {
        super("CommentStart", 44);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cE = c0787a.e();
        D0 d3 = e1.f14942m0;
        if (cE == 0) {
            n10.m(this);
            n10.f14850n.s((char) 65533);
            n10.o(d3);
            return;
        }
        if (cE == '-') {
            n10.o(e1.f14941l0);
            return;
        }
        Z z6 = e1.f14948s;
        if (cE == '>') {
            n10.m(this);
            n10.i();
            n10.o(z6);
        } else if (cE != 65535) {
            c0787a.y();
            n10.o(d3);
        } else {
            n10.l(this);
            n10.i();
            n10.o(z6);
        }
    }
}
