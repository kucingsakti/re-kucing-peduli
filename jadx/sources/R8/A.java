package R8;

import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class A implements p009a9.d {
    @Override // p009a9.b
    public C0409d a(p096j9.c cVar) {
        Object next;
        p210v8.i.f(cVar, "fqName");
        Iterator it = q().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (AbstractC0408c.a(p068ga.d.o(p068ga.d.l(((C0409d) next).a))).b().equals(cVar)) {
                return (C0409d) next;
            }
        }
        next = null;
        return (C0409d) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof A) && p210v8.i.a(b(), ((A) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
