package sa;

/* JADX INFO: renamed from: sa.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0810l0 extends e1 {
    public C0810l0() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cE = c0787a.e();
        C0806j0 c0806j0 = e1.f14926U;
        if (cE == 0) {
            n10.m(this);
            n10.e((char) 65533);
            n10.o(c0806j0);
        } else if (cE == '-') {
            n10.e(cE);
            n10.o(e1.f14928W);
        } else if (cE == '<') {
            n10.e(cE);
            n10.o(e1.f14929X);
        } else if (cE != 65535) {
            n10.e(cE);
            n10.o(c0806j0);
        } else {
            n10.l(this);
            n10.o(e1.f14948s);
        }
    }
}
