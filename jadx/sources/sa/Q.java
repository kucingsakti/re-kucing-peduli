package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum Q extends e1 {
    public Q() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        if (!c0787a.t()) {
            n10.g("</");
            n10.o(e1.f14952u);
            return;
        }
        n10.c(false);
        M m2 = n10.f14847k;
        char cL = c0787a.l();
        m2.getClass();
        m2.v(String.valueOf(cL));
        n10.f14845h.append(c0787a.l());
        n10.o(e1.f14904E);
        n10.a.a();
    }
}
