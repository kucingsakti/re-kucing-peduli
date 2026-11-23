package sa;

/* JADX INFO: renamed from: sa.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0792c0 extends e1 {
    public C0792c0() {
        super("ScriptDataEscaped", 21);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        if (c0787a.n()) {
            n10.l(this);
            n10.o(e1.f14948s);
            return;
        }
        char cL = c0787a.l();
        if (cL == 0) {
            n10.m(this);
            c0787a.a();
            n10.e((char) 65533);
        } else if (cL == '-') {
            n10.e('-');
            n10.o(e1.f14921O);
            n10.a.a();
        } else if (cL != '<') {
            n10.g(c0787a.j('-', '<', 0));
        } else {
            n10.o(e1.f14922Q);
            n10.a.a();
        }
    }
}
