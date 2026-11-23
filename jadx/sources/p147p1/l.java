package p147p1;

import p050f1.q;
import p061g1.e;
import p061g1.i;
import p061g1.o;
import p061g1.p;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f14181s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f14182t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14183u;

    static {
        q.c("StopWorkRunnable");
    }

    public l(o oVar, i iVar, boolean z6) {
        this.f14181s = oVar;
        this.f14182t = iVar;
        this.f14183u = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar;
        if (this.f14183u) {
            e eVar = this.f14181s.f11502f;
            i iVar = this.f14182t;
            eVar.getClass();
            String str = iVar.a.a;
            synchronized (eVar.f11474D) {
                try {
                    q.a().getClass();
                    pVar = (p) eVar.f11480x.remove(str);
                    if (pVar != null) {
                        eVar.f11482z.remove(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            e.c(pVar);
        } else {
            this.f14181s.f11502f.m(this.f14182t);
        }
        q qVarA = q.a();
        o1.i iVar2 = this.f14182t.a;
        qVarA.getClass();
    }
}
