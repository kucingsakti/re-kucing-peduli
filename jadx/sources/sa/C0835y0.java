package sa;

/* JADX INFO: renamed from: sa.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0835y0 extends e1 {
    public C0835y0() {
        super("SelfClosingStartTag", 41);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cE = c0787a.e();
        Z z6 = e1.f14948s;
        if (cE == '>') {
            n10.f14847k.f14835k = true;
            n10.k();
            n10.o(z6);
        } else if (cE == 65535) {
            n10.l(this);
            n10.o(z6);
        } else {
            c0787a.y();
            n10.m(this);
            n10.o(e1.f14931Z);
        }
    }
}
