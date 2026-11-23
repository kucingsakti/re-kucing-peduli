package I8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final LinkedHashSet a;

    static {
        Set<k> set = k.f2124w;
        ArrayList arrayList = new ArrayList(p086i8.m.H(set, 10));
        for (k kVar : set) {
            p210v8.i.f(kVar, "primitiveType");
            arrayList.add(o.f2197k.c(kVar.f2128s));
        }
        p096j9.c cVarG = n.f2169f.g();
        p210v8.i.e(cVarG, "string.toSafe()");
        ArrayList arrayListH0 = p086i8.k.h0(arrayList, cVarG);
        p096j9.c cVarG2 = n.f2171h.g();
        p210v8.i.e(cVarG2, "_boolean.toSafe()");
        ArrayList arrayListH1 = p086i8.k.h0(arrayListH0, cVarG2);
        p096j9.c cVarG3 = n.j.g();
        p210v8.i.e(cVarG3, "_enum.toSafe()");
        ArrayList arrayListH2 = p086i8.k.h0(arrayListH1, cVarG3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListH2.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(p096j9.b.j((p096j9.c) it.next()));
        }
        a = linkedHashSet;
    }
}
