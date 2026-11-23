package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum b1 extends e1 {
    public b1() {
        super("PLAINTEXT", 6);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cL = c0787a.l();
        if (cL == 0) {
            n10.m(this);
            c0787a.a();
            n10.e((char) 65533);
        } else if (cL != 65535) {
            n10.g(c0787a.i((char) 0));
        } else {
            n10.f(new J());
        }
    }
}
