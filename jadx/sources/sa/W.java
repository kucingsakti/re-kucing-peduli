package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum W extends e1 {
    public W() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cE = c0787a.e();
        if (cE == '!') {
            n10.g("<!");
            n10.o(e1.f14918L);
            return;
        }
        if (cE == '/') {
            n10.d();
            n10.o(e1.f14914J);
        } else if (cE != 65535) {
            n10.g("<");
            c0787a.y();
            n10.o(e1.f14958x);
        } else {
            n10.g("<");
            n10.l(this);
            n10.o(e1.f14948s);
        }
    }
}
