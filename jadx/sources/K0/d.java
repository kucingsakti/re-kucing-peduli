package K0;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends q {
    public /* synthetic */ d(m mVar) {
        super(mVar);
    }

    public abstract void f(P0.j jVar, Object obj);

    public void g(List list) {
        p210v8.i.f(list, "entities");
        P0.j jVarA = a();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f(jVarA, it.next());
                jVarA.a();
            }
            e(jVarA);
        } catch (Throwable th) {
            e(jVarA);
            throw th;
        }
    }

    public void h(Object obj) {
        P0.j jVarA = a();
        try {
            f(jVarA, obj);
            jVarA.f3831t.executeInsert();
        } finally {
            e(jVarA);
        }
    }
}
