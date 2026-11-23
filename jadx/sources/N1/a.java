package N1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Set f3269s = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3270t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3271u;

    public final void a() {
        this.f3271u = true;
        Iterator it = U1.n.e(this.f3269s).iterator();
        while (it.hasNext()) {
            ((i) it.next()).k();
        }
    }

    @Override // N1.g
    public final void b(i iVar) {
        this.f3269s.add(iVar);
        if (this.f3271u) {
            iVar.k();
        } else if (this.f3270t) {
            iVar.e();
        } else {
            iVar.c();
        }
    }

    @Override // N1.g
    public final void l(i iVar) {
        this.f3269s.remove(iVar);
    }
}
