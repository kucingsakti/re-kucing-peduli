package V8;

import A9.AbstractC0151y;
import I8.n;
import L8.InterfaceC0290y;
import O8.U;
import p188t1.Y;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f5210s = new d(1);

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        InterfaceC0290y interfaceC0290y = (InterfaceC0290y) obj;
        p210v8.i.f(interfaceC0290y, "module");
        U uL = Y.l(c.f5207b, interfaceC0290y.s().i(n.f2182t));
        AbstractC0151y type = uL != null ? uL.getType() : null;
        return type == null ? C9.i.c(C9.h.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }
}
