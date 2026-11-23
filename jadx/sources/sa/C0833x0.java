package sa;

/* JADX INFO: renamed from: sa.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0833x0 extends e1 {
    public C0833x0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cE = c0787a.e();
        C0818p0 c0818p0 = e1.f14931Z;
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            n10.o(c0818p0);
            return;
        }
        if (cE == '/') {
            n10.o(e1.f14937h0);
            return;
        }
        Z z6 = e1.f14948s;
        if (cE == '>') {
            n10.k();
            n10.o(z6);
        } else if (cE == 65535) {
            n10.l(this);
            n10.o(z6);
        } else {
            c0787a.y();
            n10.m(this);
            n10.o(c0818p0);
        }
    }
}
