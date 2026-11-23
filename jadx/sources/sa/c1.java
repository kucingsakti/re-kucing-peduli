package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum c1 extends e1 {
    public c1() {
        super("TagOpen", 7);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cL = c0787a.l();
        if (cL == '!') {
            n10.o(e1.f14939j0);
            n10.a.a();
            return;
        }
        if (cL == '/') {
            n10.o(e1.f14896A);
            n10.a.a();
            return;
        }
        if (cL == '?') {
            n10.f14850n.q();
            n10.o(e1.f14938i0);
        } else if (c0787a.t()) {
            n10.c(true);
            n10.o(e1.f14898B);
        } else {
            n10.m(this);
            n10.e('<');
            n10.o(e1.f14948s);
        }
    }
}
