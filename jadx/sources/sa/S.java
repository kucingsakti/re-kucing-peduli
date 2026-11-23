package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum S extends e1 {
    public S() {
        super("RCDATAEndTagName", 12);
    }

    public static void j(N n10, C0787a c0787a) {
        n10.g("</");
        n10.h(n10.f14845h);
        c0787a.y();
        n10.o(e1.f14952u);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        if (c0787a.t()) {
            String strH = c0787a.h();
            n10.f14847k.v(strH);
            n10.f14845h.append(strH);
            return;
        }
        char cE = c0787a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            if (n10.n()) {
                n10.o(e1.f14931Z);
                return;
            } else {
                j(n10, c0787a);
                return;
            }
        }
        if (cE == '/') {
            if (n10.n()) {
                n10.o(e1.f14937h0);
                return;
            } else {
                j(n10, c0787a);
                return;
            }
        }
        if (cE != '>') {
            j(n10, c0787a);
        } else if (!n10.n()) {
            j(n10, c0787a);
        } else {
            n10.k();
            n10.o(e1.f14948s);
        }
    }
}
