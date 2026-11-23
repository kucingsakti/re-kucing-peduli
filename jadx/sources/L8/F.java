package L8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class F implements G {
    public final ArrayList a;

    public F(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // L8.G
    public final void a(p096j9.c cVar, ArrayList arrayList) {
        p210v8.i.f(cVar, "fqName");
        for (Object obj : this.a) {
            if (p210v8.i.a(((O8.E) ((D) obj)).f3634w, cVar)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // L8.G
    public final boolean b(p096j9.c cVar) {
        p210v8.i.f(cVar, "fqName");
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (p210v8.i.a(((O8.E) ((D) it.next())).f3634w, cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // L8.G
    public final Collection k(p096j9.c cVar, p200u8.b bVar) {
        p210v8.i.f(cVar, "fqName");
        return K9.n.B(new K9.g(K9.n.z(p086i8.k.N(this.a), r.f2834u), true, new E(cVar, 0)));
    }
}
