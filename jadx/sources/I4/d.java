package I4;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p136o.j;
import p136o.l;
import p156q0.E;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Toolbar f2097s;

    public d(CoordinatorLayout coordinatorLayout, Toolbar toolbar) {
        this.f2097s = toolbar;
    }

    @Override // p136o.j
    public boolean k(l lVar, MenuItem menuItem) {
        P0.d dVar = this.f2097s.f6233j0;
        return false;
    }

    @Override // p136o.j
    public void r(l lVar) {
        Toolbar toolbar = this.f2097s;
        androidx.appcompat.widget.b bVar = toolbar.f6239s.f6133L;
        if (bVar == null || !bVar.f()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f6227b0.f104u).iterator();
            while (it.hasNext()) {
                ((E) it.next()).a.t();
            }
        }
        P0.d dVar = toolbar.f6233j0;
        if (dVar != null) {
            dVar.r(lVar);
        }
    }

    public d(Toolbar toolbar) {
        this.f2097s = toolbar;
    }
}
