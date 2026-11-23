package N1;

import androidx.lifecycle.C;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0518m;
import androidx.lifecycle.EnumC0519n;
import androidx.lifecycle.InterfaceC0523s;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g, androidx.lifecycle.r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashSet f3274s = new HashSet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0525u f3275t;

    public h(C0525u c0525u) {
        this.f3275t = c0525u;
        c0525u.a(this);
    }

    @Override // N1.g
    public final void b(i iVar) {
        this.f3274s.add(iVar);
        EnumC0519n enumC0519n = this.f3275t.f6763c;
        if (enumC0519n == EnumC0519n.f6755s) {
            iVar.k();
        } else if (enumC0519n.compareTo(EnumC0519n.f6758v) >= 0) {
            iVar.e();
        } else {
            iVar.c();
        }
    }

    @Override // N1.g
    public final void l(i iVar) {
        this.f3274s.remove(iVar);
    }

    @C(EnumC0518m.ON_DESTROY)
    public void onDestroy(InterfaceC0523s interfaceC0523s) {
        Iterator it = U1.n.e(this.f3274s).iterator();
        while (it.hasNext()) {
            ((i) it.next()).k();
        }
        interfaceC0523s.g().f(this);
    }

    @C(EnumC0518m.ON_START)
    public void onStart(InterfaceC0523s interfaceC0523s) {
        Iterator it = U1.n.e(this.f3274s).iterator();
        while (it.hasNext()) {
            ((i) it.next()).e();
        }
    }

    @C(EnumC0518m.ON_STOP)
    public void onStop(InterfaceC0523s interfaceC0523s) {
        Iterator it = U1.n.e(this.f3274s).iterator();
        while (it.hasNext()) {
            ((i) it.next()).c();
        }
    }
}
