package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum A0 extends e1 {
    public A0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        if (c0787a.p("--")) {
            n10.f14850n.q();
            n10.o(e1.f14940k0);
        } else {
            if (c0787a.q("DOCTYPE")) {
                n10.o(e1.f14946q0);
                return;
            }
            if (c0787a.p("[CDATA[")) {
                n10.d();
                n10.o(e1.f14909G0);
            } else {
                n10.m(this);
                n10.f14850n.q();
                n10.o(e1.f14938i0);
            }
        }
    }
}
