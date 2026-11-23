package A0;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0519n;
import androidx.lifecycle.InterfaceC0523s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p156q0.Q;
import y0.C0872j;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f27s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.b f28t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0872j f29u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, androidx.fragment.app.b bVar, C0872j c0872j) {
        super(1);
        this.f27s = gVar;
        this.f28t = bVar;
        this.f29u = c0872j;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        InterfaceC0523s interfaceC0523s = (InterfaceC0523s) obj;
        g gVar = this.f27s;
        ArrayList arrayList = gVar.f16g;
        boolean z6 = arrayList instanceof Collection;
        boolean z10 = false;
        androidx.fragment.app.b bVar = this.f28t;
        if (!z6 || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (p210v8.i.a(((p076h8.f) it.next()).f11789s, bVar.f6627T)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (interfaceC0523s != null && !z10) {
            Q q10 = bVar.f6644m0;
            if (q10 == null) {
                throw new IllegalStateException(AbstractC0487g.i("Can't access the Fragment View's LifecycleOwner for ", bVar, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
            }
            q10.c();
            C0525u c0525u = q10.f14280v;
            if (c0525u.f6763c.compareTo(EnumC0519n.f6757u) >= 0) {
                c0525u.a((androidx.lifecycle.r) gVar.f18i.invoke(this.f29u));
            }
        }
        return p076h8.m.a;
    }
}
