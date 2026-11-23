package p080i1;

import android.os.Handler;
import java.util.Objects;
import o1.i;
import p050f1.q;
import p147p1.s;
import p147p1.t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12134s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f12135t;

    public /* synthetic */ f(g gVar, int i10) {
        this.f12134s = i10;
        this.f12135t = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12134s) {
            case 0:
                g.a(this.f12135t);
                return;
            default:
                g gVar = this.f12135t;
                if (gVar.f12146y != 0) {
                    q qVarA = q.a();
                    Objects.toString(gVar.f12142u);
                    qVarA.getClass();
                    return;
                }
                gVar.f12146y = 1;
                q qVarA2 = q.a();
                Objects.toString(gVar.f12142u);
                qVarA2.getClass();
                if (!gVar.f12143v.f12155v.j(gVar.f12139D, null)) {
                    gVar.b();
                    return;
                }
                t tVar = gVar.f12143v.f12154u;
                i iVar = gVar.f12142u;
                synchronized (tVar.f14200d) {
                    q qVarA3 = q.a();
                    Objects.toString(iVar);
                    qVarA3.getClass();
                    tVar.a(iVar);
                    s sVar = new s(tVar, iVar);
                    tVar.f14198b.put(iVar, sVar);
                    tVar.f14199c.put(iVar, gVar);
                    ((Handler) tVar.a.f5078t).postDelayed(sVar, 600000L);
                    break;
                }
                return;
        }
    }
}
