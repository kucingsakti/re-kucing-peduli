package p231y;

import com.bumptech.glide.d;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {
    @Override // com.bumptech.glide.d
    public final boolean c(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f15822t != dVar) {
                    return false;
                }
                hVar.f15822t = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.d
    public final boolean d(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f15821s != obj) {
                    return false;
                }
                hVar.f15821s = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.d
    public final boolean e(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f15823u != gVar) {
                    return false;
                }
                hVar.f15823u = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.d
    public final void y(g gVar, g gVar2) {
        gVar.f15816b = gVar2;
    }

    @Override // com.bumptech.glide.d
    public final void z(g gVar, Thread thread) {
        gVar.a = thread;
    }
}
