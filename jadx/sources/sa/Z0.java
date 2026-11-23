package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum Z0 extends e1 {
    public Z0() {
        super("CdataSection", 66);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        String strC;
        int iV = c0787a.v("]]>");
        if (iV != -1) {
            strC = C0787a.c(c0787a.a, c0787a.f14862h, c0787a.f14859e, iV);
            c0787a.f14859e += iV;
        } else {
            int i10 = c0787a.f14857c;
            int i11 = c0787a.f14859e;
            if (i10 - i11 < 3) {
                c0787a.b();
                char[] cArr = c0787a.a;
                String[] strArr = c0787a.f14862h;
                int i12 = c0787a.f14859e;
                strC = C0787a.c(cArr, strArr, i12, c0787a.f14857c - i12);
                c0787a.f14859e = c0787a.f14857c;
            } else {
                int i13 = i10 - 2;
                strC = C0787a.c(c0787a.a, c0787a.f14862h, i11, i13 - i11);
                c0787a.f14859e = i13;
            }
        }
        n10.f14845h.append(strC);
        if (c0787a.p("]]>") || c0787a.n()) {
            String string = n10.f14845h.toString();
            F f10 = new F();
            f10.f14819b = string;
            n10.f(f10);
            n10.o(e1.f14948s);
        }
    }
}
