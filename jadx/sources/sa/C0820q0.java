package sa;

/* JADX INFO: renamed from: sa.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0820q0 extends e1 {
    public C0820q0() {
        super("AttributeName", 34);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        String strK = c0787a.k(e1.f14911H0);
        M m2 = n10.f14847k;
        m2.getClass();
        String strReplace = strK.replace((char) 0, (char) 65533);
        m2.f14831f = true;
        String str = m2.f14830e;
        StringBuilder sb = m2.f14829d;
        if (str != null) {
            sb.append(str);
            m2.f14830e = null;
        }
        if (sb.length() == 0) {
            m2.f14830e = strReplace;
        } else {
            sb.append(strReplace);
        }
        char cE = c0787a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            n10.o(e1.f14933b0);
            return;
        }
        if (cE != '\"' && cE != '\'') {
            if (cE == '/') {
                n10.o(e1.f14937h0);
                return;
            }
            Z z6 = e1.f14948s;
            if (cE == 65535) {
                n10.l(this);
                n10.o(z6);
                return;
            }
            switch (cE) {
                case '<':
                    break;
                case '=':
                    n10.o(e1.c0);
                    break;
                case '>':
                    n10.k();
                    n10.o(z6);
                    break;
                default:
                    M m10 = n10.f14847k;
                    m10.f14831f = true;
                    String str2 = m10.f14830e;
                    StringBuilder sb2 = m10.f14829d;
                    if (str2 != null) {
                        sb2.append(str2);
                        m10.f14830e = null;
                    }
                    sb2.append(cE);
                    break;
            }
            return;
        }
        n10.m(this);
        M m11 = n10.f14847k;
        m11.f14831f = true;
        String str3 = m11.f14830e;
        StringBuilder sb3 = m11.f14829d;
        if (str3 != null) {
            sb3.append(str3);
            m11.f14830e = null;
        }
        sb3.append(cE);
    }
}
