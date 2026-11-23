package C1;

import A1.C0099h;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import o1.k;
import o1.r;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final File f926t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p214w1.c f929w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f928v = new k(2);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f927u = 262144000;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r f925s = new r(2);

    public d(File file) {
        this.f926t = file;
    }

    @Override // C1.a
    public final File a(p232y1.e eVar) {
        String strO = this.f925s.o(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(eVar);
        }
        try {
            p102k7.e eVarI = b().i(strO);
            if (eVarI != null) {
                return ((File[]) eVarI.f12743s)[0];
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    public final synchronized p214w1.c b() {
        try {
            if (this.f929w == null) {
                this.f929w = p214w1.c.l(this.f926t, this.f927u);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f929w;
    }

    @Override // C1.a
    public final void d(p232y1.e eVar, C0099h c0099h) {
        b bVarA;
        String strO = this.f925s.o(eVar);
        k kVar = this.f928v;
        synchronized (kVar) {
            try {
                bVarA = (b) ((HashMap) kVar.f13638s).get(strO);
                if (bVarA == null) {
                    bVarA = ((c) kVar.f13639t).a();
                    ((HashMap) kVar.f13638s).put(strO, bVarA);
                }
                bVarA.f924b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        bVarA.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(eVar);
            }
            try {
                p214w1.c cVarB = b();
                if (cVarB.i(strO) != null) {
                    this.f928v.u(strO);
                    return;
                }
                K0.g gVarG = cVarB.g(strO);
                if (gVarG == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: ".concat(strO));
                }
                try {
                    if (((p232y1.b) c0099h.f103t).a(c0099h.f104u, gVarG.f(), (p232y1.h) c0099h.f105v)) {
                        p214w1.c.a((p214w1.c) gVarG.f2528e, gVarG, true);
                        gVarG.f2525b = true;
                    }
                    if (!gVarG.f2525b) {
                        try {
                            gVarG.c();
                        } catch (IOException unused) {
                        }
                    }
                    this.f928v.u(strO);
                } catch (Throwable th2) {
                    if (!gVarG.f2525b) {
                        try {
                            gVarG.c();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
        } catch (Throwable th3) {
            this.f928v.u(strO);
            throw th3;
        }
    }
}
