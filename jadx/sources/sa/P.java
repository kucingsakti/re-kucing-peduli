package sa;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final enum P extends e1 {
    public P() {
        super("RcdataLessthanSign", 10);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        Locale locale;
        int iV;
        if (c0787a.r('/')) {
            n10.d();
            n10.o(e1.f14902D);
            n10.a.a();
            return;
        }
        if (c0787a.t() && n10.f14851o != null) {
            if (n10.f14852p == null) {
                n10.f14852p = "</" + n10.f14851o;
            }
            String str = n10.f14852p;
            boolean z6 = true;
            if (str.equals(c0787a.f14865l)) {
                int i10 = c0787a.f14866m;
                if (i10 == -1) {
                    z6 = false;
                } else if (i10 < c0787a.f14859e) {
                    c0787a.f14865l = str;
                    locale = Locale.ENGLISH;
                    iV = c0787a.v(str.toLowerCase(locale));
                    if (iV > -1) {
                        c0787a.f14866m = c0787a.f14859e + iV;
                    } else {
                        int iV2 = c0787a.v(str.toUpperCase(locale));
                        if (iV2 > -1) {
                        }
                        c0787a.f14866m = z6 ? c0787a.f14859e + iV2 : -1;
                    }
                }
            } else {
                c0787a.f14865l = str;
                locale = Locale.ENGLISH;
                iV = c0787a.v(str.toLowerCase(locale));
                if (iV > -1) {
                    c0787a.f14866m = c0787a.f14859e + iV;
                } else {
                    int iV3 = c0787a.v(str.toUpperCase(locale));
                    z6 = iV3 > -1;
                    c0787a.f14866m = z6 ? c0787a.f14859e + iV3 : -1;
                }
            }
            if (!z6) {
                M mC = n10.c(false);
                mC.y(n10.f14851o);
                n10.f14847k = mC;
                n10.k();
                n10.o(e1.f14962z);
                return;
            }
        }
        n10.g("<");
        n10.o(e1.f14952u);
    }
}
