package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum D0 extends e1 {
    public D0() {
        super("Comment", 46);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cL = c0787a.l();
        if (cL == 0) {
            n10.m(this);
            c0787a.a();
            n10.f14850n.s((char) 65533);
        } else if (cL == '-') {
            n10.o(e1.f14943n0);
            n10.a.a();
        } else {
            if (cL != 65535) {
                n10.f14850n.t(c0787a.j('-', 0));
                return;
            }
            n10.l(this);
            n10.i();
            n10.o(e1.f14948s);
        }
    }
}
