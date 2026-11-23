package Y8;

import L8.InterfaceC0271e;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class B implements J9.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final B f5723s = new B();

    @Override // J9.b
    public final Iterable h(Object obj) {
        int i10 = D.f5727p;
        Collection collectionT = ((InterfaceC0271e) obj).I().t();
        p210v8.i.e(collectionT, "it.typeConstructor.supertypes");
        return new K9.r(K9.n.A(p086i8.k.N(collectionT), k.f5776x), 0);
    }
}
