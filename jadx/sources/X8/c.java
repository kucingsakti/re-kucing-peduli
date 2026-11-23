package X8;

import A9.A;
import Fa.e;
import L8.G;
import O8.C;
import R8.x;
import Y8.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p086i8.s;
import p210v8.i;
import p247z9.f;
import p247z9.g;
import p247z9.l;

/* JADX INFO: loaded from: classes.dex */
public final class c implements G {
    public final e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p247z9.e f5430b;

    public c(I4.a aVar) {
        this.a = new e(aVar, a.f5425b, new p076h8.b());
        l lVar = (l) aVar.a;
        lVar.getClass();
        this.f5430b = new p247z9.e(lVar, new ConcurrentHashMap(3, 1.0f, 2), new f(), 0);
    }

    @Override // L8.G
    public final void a(p096j9.c cVar, ArrayList arrayList) {
        i.f(cVar, "fqName");
        arrayList.add(c(cVar));
    }

    @Override // L8.G
    public final boolean b(p096j9.c cVar) {
        i.f(cVar, "fqName");
        ((P0.d) ((I4.a) this.a.f1659t).f2047b).getClass();
        return false;
    }

    public final r c(p096j9.c cVar) throws Throwable {
        ((P0.d) ((I4.a) this.a.f1659t).f2047b).getClass();
        i.f(cVar, "fqName");
        A a = new A(this, 26, new x(cVar));
        p247z9.e eVar = this.f5430b;
        eVar.getClass();
        Object objInvoke = eVar.invoke(new g(cVar, a));
        if (objInvoke != null) {
            return (r) objInvoke;
        }
        p247z9.e.a(3);
        throw null;
    }

    @Override // L8.G
    public final Collection k(p096j9.c cVar, p200u8.b bVar) {
        i.f(cVar, "fqName");
        Collection collection = (List) c(cVar).f5799C.invoke();
        if (collection == null) {
            collection = s.f12328s;
        }
        return collection;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((C) ((I4.a) this.a.f1659t).f2059o);
    }
}
