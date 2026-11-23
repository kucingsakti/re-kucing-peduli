package sa;

/* JADX INFO: renamed from: sa.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0821r0 extends e1 {
    public C0821r0() {
        super("AfterAttributeName", 35);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        char cE = c0787a.e();
        C0820q0 c0820q0 = e1.f14932a0;
        if (cE == 0) {
            n10.m(this);
            M m2 = n10.f14847k;
            m2.f14831f = true;
            String str = m2.f14830e;
            StringBuilder sb = m2.f14829d;
            if (str != null) {
                sb.append(str);
                m2.f14830e = null;
            }
            sb.append((char) 65533);
            n10.o(c0820q0);
            return;
        }
        if (cE != ' ') {
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
                if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
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
                        n10.f14847k.z();
                        c0787a.y();
                        n10.o(c0820q0);
                        break;
                }
                return;
            }
            n10.m(this);
            n10.f14847k.z();
            M m10 = n10.f14847k;
            m10.f14831f = true;
            String str2 = m10.f14830e;
            StringBuilder sb2 = m10.f14829d;
            if (str2 != null) {
                sb2.append(str2);
                m10.f14830e = null;
            }
            sb2.append(cE);
            n10.o(c0820q0);
        }
    }
}
