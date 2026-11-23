package p145o9;

import A9.AbstractC0151y;
import I8.k;
import L8.InterfaceC0290y;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class u extends n {
    public u(short s9) {
        super(Short.valueOf(s9));
    }

    @Override // p145o9.g
    public final AbstractC0151y a(InterfaceC0290y interfaceC0290y) {
        i.f(interfaceC0290y, "module");
        I8.i iVarS = interfaceC0290y.s();
        iVarS.getClass();
        return iVarS.s(k.SHORT);
    }

    @Override // p145o9.g
    public final String toString() {
        return ((Number) this.a).intValue() + ".toShort()";
    }
}
