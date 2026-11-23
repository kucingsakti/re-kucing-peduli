package p147p1;

import V.h;
import java.util.HashMap;
import java.util.Objects;
import o1.i;
import p050f1.q;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final h a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f14198b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f14199c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14200d = new Object();

    static {
        q.c("WorkTimer");
    }

    public t(h hVar) {
        this.a = hVar;
    }

    public final void a(i iVar) {
        synchronized (this.f14200d) {
            try {
                if (((s) this.f14198b.remove(iVar)) != null) {
                    q qVarA = q.a();
                    Objects.toString(iVar);
                    qVarA.getClass();
                    this.f14199c.remove(iVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
