package O8;

import L8.AbstractC0287v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: O8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0358n implements L8.G {
    public final List a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3726b;

    public C0358n(List list, String str) {
        p210v8.i.f(str, "debugName");
        this.a = list;
        this.f3726b = str;
        list.size();
        p086i8.k.w0(list).size();
    }

    @Override // L8.G
    public final void a(p096j9.c cVar, ArrayList arrayList) {
        p210v8.i.f(cVar, "fqName");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            AbstractC0287v.b((L8.G) it.next(), cVar, arrayList);
        }
    }

    @Override // L8.G
    public final boolean b(p096j9.c cVar) {
        p210v8.i.f(cVar, "fqName");
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC0287v.h((L8.G) it.next(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // L8.G
    public final Collection k(p096j9.c cVar, p200u8.b bVar) {
        p210v8.i.f(cVar, "fqName");
        HashSet hashSet = new HashSet();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((L8.G) it.next()).k(cVar, bVar));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f3726b;
    }
}
