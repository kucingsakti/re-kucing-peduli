package androidx.work;

import Fa.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import p050f1.g;
import p050f1.j;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends j {
    @Override // p050f1.j
    public final g a(ArrayList arrayList) throws Throwable {
        d dVar = new d(1);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((g) it.next()).a));
        }
        dVar.a(map);
        g gVar = new g(dVar.a);
        g.c(gVar);
        return gVar;
    }
}
