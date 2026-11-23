package U8;

import L8.InterfaceC0268b;
import L8.InterfaceC0271e;
import L8.K;
import p188t1.Y;

/* JADX INFO: loaded from: classes.dex */
public final class l implements p124m9.f {
    @Override // p124m9.f
    public final int a() {
        return 3;
    }

    @Override // p124m9.f
    public final int b(InterfaceC0268b interfaceC0268b, InterfaceC0268b interfaceC0268b2, InterfaceC0271e interfaceC0271e) {
        p210v8.i.f(interfaceC0268b, "superDescriptor");
        p210v8.i.f(interfaceC0268b2, "subDescriptor");
        if (!(interfaceC0268b2 instanceof K) || !(interfaceC0268b instanceof K)) {
            return 4;
        }
        K k3 = (K) interfaceC0268b2;
        K k10 = (K) interfaceC0268b;
        if (!p210v8.i.a(k3.getName(), k10.getName())) {
            return 4;
        }
        if (Y.q(k3) && Y.q(k10)) {
            return 1;
        }
        return (Y.q(k3) || Y.q(k10)) ? 3 : 4;
    }
}
