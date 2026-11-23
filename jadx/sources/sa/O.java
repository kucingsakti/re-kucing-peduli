package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum O extends e1 {
    public O() {
        super("TagName", 9);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char c10;
        c0787a.b();
        int i10 = c0787a.f14859e;
        int i11 = c0787a.f14857c;
        char[] cArr = c0787a.a;
        int i12 = i10;
        while (i12 < i11 && (c10 = cArr[i12]) != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ' && c10 != '/' && c10 != '<' && c10 != '>') {
            i12++;
        }
        c0787a.f14859e = i12;
        n10.f14847k.v(i12 > i10 ? C0787a.c(c0787a.a, c0787a.f14862h, i10, i12 - i10) : "");
        char cE = c0787a.e();
        if (cE == 0) {
            n10.f14847k.v(e1.f14915J0);
            return;
        }
        if (cE != ' ') {
            if (cE == '/') {
                n10.o(e1.f14937h0);
                return;
            }
            Z z6 = e1.f14948s;
            if (cE == '<') {
                c0787a.y();
                n10.m(this);
            } else if (cE != '>') {
                if (cE == 65535) {
                    n10.l(this);
                    n10.o(z6);
                    return;
                } else if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r') {
                    M m2 = n10.f14847k;
                    m2.getClass();
                    m2.v(String.valueOf(cE));
                    return;
                }
            }
            n10.k();
            n10.o(z6);
            return;
        }
        n10.o(e1.f14931Z);
    }
}
