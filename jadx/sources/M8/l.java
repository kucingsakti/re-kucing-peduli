package M8;

import A9.X;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l implements h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f3206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final X f3207t;

    public l(h hVar, X x8) {
        this.f3206s = hVar;
        this.f3207t = x8;
    }

    @Override // M8.h
    public final boolean E(p096j9.c cVar) {
        p210v8.i.f(cVar, "fqName");
        if (((Boolean) this.f3207t.invoke(cVar)).booleanValue()) {
            return this.f3206s.E(cVar);
        }
        return false;
    }

    @Override // M8.h
    public final b H(p096j9.c cVar) {
        p210v8.i.f(cVar, "fqName");
        if (((Boolean) this.f3207t.invoke(cVar)).booleanValue()) {
            return this.f3206s.H(cVar);
        }
        return null;
    }

    @Override // M8.h
    public final boolean isEmpty() {
        h hVar = this.f3206s;
        if ((hVar instanceof Collection) && ((Collection) hVar).isEmpty()) {
            return false;
        }
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            p096j9.c cVarA = ((b) it.next()).a();
            if (cVarA != null && ((Boolean) this.f3207t.invoke(cVarA)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f3206s) {
            p096j9.c cVarA = ((b) obj).a();
            if (cVarA != null && ((Boolean) this.f3207t.invoke(cVarA)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}
