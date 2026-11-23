package N1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v implements i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Set f3315s = Collections.newSetFromMap(new WeakHashMap());

    @Override // N1.i
    public final void c() {
        Iterator it = U1.n.e(this.f3315s).iterator();
        while (it.hasNext()) {
            ((R1.c) it.next()).c();
        }
    }

    @Override // N1.i
    public final void e() {
        Iterator it = U1.n.e(this.f3315s).iterator();
        while (it.hasNext()) {
            ((R1.c) it.next()).e();
        }
    }

    @Override // N1.i
    public final void k() {
        Iterator it = U1.n.e(this.f3315s).iterator();
        while (it.hasNext()) {
            ((R1.c) it.next()).k();
        }
    }
}
