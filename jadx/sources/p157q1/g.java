package p157q1;

import p188t1.Y;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Y {
    @Override // p188t1.Y
    public final boolean f(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f14402t != dVar) {
                    return false;
                }
                iVar.f14402t = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p188t1.Y
    public final boolean g(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f14401s != obj) {
                    return false;
                }
                iVar.f14401s = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p188t1.Y
    public final boolean h(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f14403u != hVar) {
                    return false;
                }
                iVar.f14403u = hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p188t1.Y
    public final void r(h hVar, h hVar2) {
        hVar.f14396b = hVar2;
    }

    @Override // p188t1.Y
    public final void s(h hVar, Thread thread) {
        hVar.a = thread;
    }
}
