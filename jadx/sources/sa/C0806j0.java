package sa;

/* JADX INFO: renamed from: sa.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0806j0 extends e1 {
    public C0806j0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cL = c0787a.l();
        if (cL == 0) {
            n10.m(this);
            c0787a.a();
            n10.e((char) 65533);
            return;
        }
        if (cL == '-') {
            n10.e(cL);
            n10.o(e1.f14927V);
            n10.a.a();
        } else if (cL == '<') {
            n10.e(cL);
            n10.o(e1.f14929X);
            n10.a.a();
        } else if (cL != 65535) {
            n10.g(c0787a.j('-', '<', 0));
        } else {
            n10.l(this);
            n10.o(e1.f14948s);
        }
    }
}
