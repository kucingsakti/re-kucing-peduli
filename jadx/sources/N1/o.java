package N1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o implements b {
    public final /* synthetic */ t a;

    public o(t tVar) {
        this.a = tVar;
    }

    @Override // N1.b
    public final void a(boolean z6) {
        ArrayList arrayList;
        U1.n.a();
        synchronized (this.a) {
            arrayList = new ArrayList((HashSet) this.a.f3308d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(z6);
        }
    }
}
