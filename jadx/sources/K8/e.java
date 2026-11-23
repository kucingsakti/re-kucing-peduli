package K8;

import C8.u;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;

/* JADX INFO: loaded from: classes.dex */
public final class e implements J9.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f2638s = new e();

    public static InterfaceC0271e a(InterfaceC0271e interfaceC0271e) {
        p096j9.e eVarG = p124m9.e.g(interfaceC0271e);
        String str = d.a;
        p096j9.c cVar = (p096j9.c) d.f2634k.get(eVarG);
        if (cVar != null) {
            return p165q9.d.e(interfaceC0271e).i(cVar);
        }
        throw new IllegalArgumentException("Given class " + interfaceC0271e + " is not a read-only collection");
    }

    public static InterfaceC0271e b(p096j9.c cVar, I8.i iVar) {
        p210v8.i.f(iVar, "builtIns");
        String str = d.a;
        p096j9.b bVar = (p096j9.b) d.f2632h.get(cVar.i());
        if (bVar != null) {
            return iVar.i(bVar.b());
        }
        return null;
    }

    @Override // J9.b
    public Iterable h(Object obj) {
        u[] uVarArr = n.f2660g;
        return ((InterfaceC0269c) obj).c().x();
    }
}
