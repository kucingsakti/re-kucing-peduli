package sa;

/* JADX INFO: renamed from: sa.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0796e0 extends e1 {
    public C0796e0() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        if (c0787a.n()) {
            n10.l(this);
            n10.o(e1.f14948s);
            return;
        }
        char cE = c0787a.e();
        C0792c0 c0792c0 = e1.f14920N;
        if (cE == 0) {
            n10.m(this);
            n10.e((char) 65533);
            n10.o(c0792c0);
        } else {
            if (cE == '-') {
                n10.e(cE);
                return;
            }
            if (cE == '<') {
                n10.o(e1.f14922Q);
            } else if (cE != '>') {
                n10.e(cE);
                n10.o(c0792c0);
            } else {
                n10.e(cE);
                n10.o(e1.f14958x);
            }
        }
    }
}
