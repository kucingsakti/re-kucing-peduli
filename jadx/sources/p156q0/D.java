package p156q0;

import B6.d;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p210v8.h;

/* JADX INFO: loaded from: classes.dex */
public final class D {
    public boolean a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f14254b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f14255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14257e;

    public D(Object obj, int i10) {
        this.f14256d = i10;
        this.f14257e = obj;
    }

    public void a() {
        switch (this.f14256d) {
            case 0:
                boolean zK = e.K(3);
                e eVar = (e) this.f14257e;
                if (zK) {
                    Objects.toString(eVar);
                }
                eVar.getClass();
                if (e.K(3)) {
                    Objects.toString(eVar.f6682h);
                }
                C0742a c0742a = eVar.f6682h;
                if (c0742a != null) {
                    c0742a.f14310s = false;
                    c0742a.e();
                    C0742a c0742a2 = eVar.f6682h;
                    d dVar = new d(eVar, 28);
                    if (c0742a2.f14308q == null) {
                        c0742a2.f14308q = new ArrayList();
                    }
                    c0742a2.f14308q.add(dVar);
                    eVar.f6682h.f();
                    eVar.f6683i = true;
                    eVar.z(true);
                    eVar.F();
                    eVar.f6683i = false;
                    eVar.f6682h = null;
                }
                break;
        }
    }

    public final void b() {
    }
}
