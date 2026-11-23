package M2;

import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zziv;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class N implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2918s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f2919t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zziv f2920u;

    public /* synthetic */ N(zziv zzivVar, AtomicReference atomicReference, int i10) {
        this.f2918s = i10;
        this.f2919t = atomicReference;
        this.f2920u = zzivVar;
    }

    private final void a() {
        synchronized (this.f2919t) {
            try {
                try {
                    AtomicReference atomicReference = this.f2919t;
                    zzhj zzhjVar = (zzhj) this.f2920u.f577s;
                    zzag zzagVar = zzhjVar.f9146y;
                    String strD1 = zzhjVar.o().d1();
                    zzagVar.getClass();
                    atomicReference.set(Boolean.valueOf(zzagVar.h1(strD1, zzbf.f8949L)));
                    this.f2919t.notify();
                } catch (Throwable th) {
                    this.f2919t.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b() {
        synchronized (this.f2919t) {
            try {
                try {
                    AtomicReference atomicReference = this.f2919t;
                    zzhj zzhjVar = (zzhj) this.f2920u.f577s;
                    zzag zzagVar = zzhjVar.f9146y;
                    String strD1 = zzhjVar.o().d1();
                    zzagVar.getClass();
                    atomicReference.set(zzagVar.e1(strD1, zzbf.f8951M));
                    this.f2919t.notify();
                } catch (Throwable th) {
                    this.f2919t.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void c() {
        synchronized (this.f2919t) {
            try {
                try {
                    AtomicReference atomicReference = this.f2919t;
                    zzhj zzhjVar = (zzhj) this.f2920u.f577s;
                    atomicReference.set(Long.valueOf(zzhjVar.f9146y.c1(zzhjVar.o().d1(), zzbf.f8953N)));
                    this.f2919t.notify();
                } catch (Throwable th) {
                    this.f2919t.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        synchronized (this.f2919t) {
            try {
                try {
                    AtomicReference atomicReference = this.f2919t;
                    zzhj zzhjVar = (zzhj) this.f2920u.f577s;
                    atomicReference.set(Double.valueOf(zzhjVar.f9146y.X0(zzhjVar.o().d1(), zzbf.P)));
                    this.f2919t.notify();
                } catch (Throwable th) {
                    this.f2919t.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2918s) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                c();
                return;
            case 3:
                d();
                return;
            default:
                synchronized (this.f2919t) {
                    try {
                        try {
                            AtomicReference atomicReference = this.f2919t;
                            zzhj zzhjVar = (zzhj) this.f2920u.f577s;
                            atomicReference.set(Integer.valueOf(zzhjVar.f9146y.b1(zzhjVar.o().d1(), zzbf.f8955O)));
                            this.f2919t.notify();
                        } catch (Throwable th) {
                            this.f2919t.notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
