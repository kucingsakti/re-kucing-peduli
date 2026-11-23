package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class E extends F {
    @Override // androidx.datastore.preferences.protobuf.F
    public final void a(long j, Object obj) {
        ((AbstractC0480b) ((InterfaceC0504y) t0.f6515d.i(j, obj))).f6447s = false;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final void b(AbstractC0502w abstractC0502w, AbstractC0502w abstractC0502w2, long j) {
        s0 s0Var = t0.f6515d;
        InterfaceC0504y interfaceC0504yT = (InterfaceC0504y) s0Var.i(j, abstractC0502w);
        InterfaceC0504y interfaceC0504y = (InterfaceC0504y) s0Var.i(j, abstractC0502w2);
        int size = interfaceC0504yT.size();
        int size2 = interfaceC0504y.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0480b) interfaceC0504yT).f6447s) {
                interfaceC0504yT = interfaceC0504yT.t(size2 + size);
            }
            interfaceC0504yT.addAll(interfaceC0504y);
        }
        if (size > 0) {
            interfaceC0504y = interfaceC0504yT;
        }
        t0.o(j, abstractC0502w, interfaceC0504y);
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public final List c(long j, Object obj) {
        InterfaceC0504y interfaceC0504y = (InterfaceC0504y) t0.f6515d.i(j, obj);
        if (((AbstractC0480b) interfaceC0504y).f6447s) {
            return interfaceC0504y;
        }
        int size = interfaceC0504y.size();
        InterfaceC0504y interfaceC0504yT = interfaceC0504y.t(size == 0 ? 10 : size * 2);
        t0.o(j, obj, interfaceC0504yT);
        return interfaceC0504yT;
    }
}
