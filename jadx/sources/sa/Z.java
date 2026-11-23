package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum Z extends e1 {
    public Z() {
        super("Data", 0);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cL = c0787a.l();
        if (cL == 0) {
            n10.m(this);
            n10.e(c0787a.e());
            return;
        }
        if (cL == '&') {
            n10.o(e1.f14950t);
            n10.a.a();
        } else if (cL == '<') {
            n10.o(e1.f14962z);
            n10.a.a();
        } else if (cL != 65535) {
            n10.g(c0787a.g());
        } else {
            n10.f(new J());
        }
    }
}
