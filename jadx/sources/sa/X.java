package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum X extends e1 {
    public X() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        Y y6 = e1.f14916K;
        a1 a1Var = e1.f14958x;
        if (c0787a.t()) {
            n10.c(false);
            n10.o(y6);
        } else {
            n10.g("</");
            n10.o(a1Var);
        }
    }
}
