package N1;

import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import p078i.AbstractActivityC0655l;

/* JADX INFO: loaded from: classes.dex */
public class u extends androidx.fragment.app.b {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final a f3309t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final A1.r f3310u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final HashSet f3311v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public u f3312w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public com.bumptech.glide.l f3313x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public androidx.fragment.app.b f3314y0;

    public u() {
        a aVar = new a();
        this.f3310u0 = new A1.r(this, 28);
        this.f3311v0 = new HashSet();
        this.f3309t0 = aVar;
    }

    @Override // androidx.fragment.app.b
    public final void B(AbstractActivityC0655l abstractActivityC0655l) {
        super.B(abstractActivityC0655l);
        androidx.fragment.app.b bVar = this;
        while (true) {
            androidx.fragment.app.b bVar2 = bVar.f6624Q;
            if (bVar2 == null) {
                break;
            } else {
                bVar = bVar2;
            }
        }
        androidx.fragment.app.e eVar = bVar.f6622N;
        if (eVar == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            Context contextM = m();
            u uVar = this.f3312w0;
            if (uVar != null) {
                uVar.f3311v0.remove(this);
                this.f3312w0 = null;
            }
            u uVarI = com.bumptech.glide.b.b(contextM).f7591w.i(eVar, null);
            this.f3312w0 = uVarI;
            if (equals(uVarI)) {
                return;
            }
            this.f3312w0.f3311v0.add(this);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // androidx.fragment.app.b
    public final void F() {
        this.f6634a0 = true;
        this.f3309t0.a();
        u uVar = this.f3312w0;
        if (uVar != null) {
            uVar.f3311v0.remove(this);
            this.f3312w0 = null;
        }
    }

    @Override // androidx.fragment.app.b
    public final void H() {
        this.f6634a0 = true;
        this.f3314y0 = null;
        u uVar = this.f3312w0;
        if (uVar != null) {
            uVar.f3311v0.remove(this);
            this.f3312w0 = null;
        }
    }

    @Override // androidx.fragment.app.b
    public final void P() {
        this.f6634a0 = true;
        a aVar = this.f3309t0;
        aVar.f3270t = true;
        Iterator it = U1.n.e(aVar.f3269s).iterator();
        while (it.hasNext()) {
            ((i) it.next()).e();
        }
    }

    @Override // androidx.fragment.app.b
    public final void Q() {
        this.f6634a0 = true;
        a aVar = this.f3309t0;
        aVar.f3270t = false;
        Iterator it = U1.n.e(aVar.f3269s).iterator();
        while (it.hasNext()) {
            ((i) it.next()).c();
        }
    }

    @Override // androidx.fragment.app.b
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        androidx.fragment.app.b bVar = this.f6624Q;
        if (bVar == null) {
            bVar = this.f3314y0;
        }
        sb.append(bVar);
        sb.append("}");
        return sb.toString();
    }
}
