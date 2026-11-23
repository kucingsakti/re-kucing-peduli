package K8;

import L8.InterfaceC0290y;
import O8.z;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f2639s = new f(1);

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        InterfaceC0290y interfaceC0290y = (InterfaceC0290y) obj;
        p210v8.i.f(interfaceC0290y, "module");
        List list = (List) J7.j.o(((z) interfaceC0290y.K(g.f2642f)).f3797w, z.f3794z[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof p230x9.c) {
                arrayList.add(obj2);
            }
        }
        return (p230x9.c) p086i8.k.T(arrayList);
    }
}
