package p210v8;

import C8.InterfaceC0175c;
import C8.InterfaceC0177e;
import C8.InterfaceC0178f;
import C8.i;
import C8.p;
import C8.r;
import C8.t;

/* JADX INFO: loaded from: classes.dex */
public class v {
    public InterfaceC0175c b(Class cls) {
        return new d(cls);
    }

    public InterfaceC0177e c(String str, Class cls) {
        return new m(str, cls);
    }

    public String h(f fVar) {
        String string = fVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String i(k kVar) {
        return h(kVar);
    }

    public InterfaceC0178f a(g gVar) {
        return gVar;
    }

    public i d(l lVar) {
        return lVar;
    }

    public p e(S9.i iVar) {
        return iVar;
    }

    public r f(n nVar) {
        return nVar;
    }

    public t g(o oVar) {
        return oVar;
    }
}
