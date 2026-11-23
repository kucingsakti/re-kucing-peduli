package p147p1;

import java.util.Objects;
import o1.i;
import p050f1.q;
import p080i1.f;
import p080i1.g;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f14196s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f14197t;

    public s(t tVar, i iVar) {
        this.f14196s = tVar;
        this.f14197t = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14196s.f14200d) {
            try {
                if (((s) this.f14196s.f14198b.remove(this.f14197t)) != null) {
                    r rVar = (r) this.f14196s.f14199c.remove(this.f14197t);
                    if (rVar != null) {
                        i iVar = this.f14197t;
                        g gVar = (g) rVar;
                        q qVarA = q.a();
                        Objects.toString(iVar);
                        qVarA.getClass();
                        gVar.f12147z.execute(new f(gVar, 0));
                    }
                } else {
                    q qVarA2 = q.a();
                    this.f14197t.toString();
                    qVarA2.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
