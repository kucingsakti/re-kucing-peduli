package p147p1;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.UUID;
import p061g1.h;
import p061g1.o;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14166u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o f14167v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f14168w;

    public /* synthetic */ b(o oVar, Object obj, int i10) {
        this.f14166u = i10;
        this.f14167v = oVar;
        this.f14168w = obj;
    }

    @Override // p147p1.c
    public final void b() {
        switch (this.f14166u) {
            case 0:
                o oVar = this.f14167v;
                WorkDatabase workDatabase = oVar.f11499c;
                workDatabase.c();
                try {
                    c.a(oVar, ((UUID) this.f14168w).toString());
                    workDatabase.o();
                    workDatabase.j();
                    h.a(oVar.f11498b, oVar.f11499c, oVar.f11501e);
                    return;
                } catch (Throwable th) {
                    workDatabase.j();
                    throw th;
                }
            default:
                o oVar2 = this.f14167v;
                WorkDatabase workDatabase2 = oVar2.f11499c;
                workDatabase2.c();
                try {
                    Iterator it = workDatabase2.v().f((String) this.f14168w).iterator();
                    while (it.hasNext()) {
                        c.a(oVar2, (String) it.next());
                    }
                    workDatabase2.o();
                    return;
                } finally {
                    workDatabase2.j();
                }
        }
    }
}
