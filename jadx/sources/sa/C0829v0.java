package sa;

/* JADX INFO: renamed from: sa.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0829v0 extends e1 {
    public C0829v0() {
        super("Rcdata", 2);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cL = c0787a.l();
        if (cL == 0) {
            n10.m(this);
            c0787a.a();
            n10.e((char) 65533);
        } else if (cL == '&') {
            n10.o(e1.f14954v);
            n10.a.a();
        } else if (cL == '<') {
            n10.o(e1.f14900C);
            n10.a.a();
        } else if (cL != 65535) {
            n10.g(c0787a.g());
        } else {
            n10.f(new J());
        }
    }
}
