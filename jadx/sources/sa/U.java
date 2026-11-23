package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum U extends e1 {
    public U() {
        super("RawtextEndTagOpen", 14);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        V v4 = e1.f14910H;
        R0 r10 = e1.f14956w;
        if (c0787a.t()) {
            n10.c(false);
            n10.o(v4);
        } else {
            n10.g("</");
            n10.o(r10);
        }
    }
}
