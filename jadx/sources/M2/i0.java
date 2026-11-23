package M2;

import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzmh;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f3029t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zzmh f3030u;

    public /* synthetic */ i0(zzmh zzmhVar, long j, int i10) {
        this.f3028s = i10;
        this.f3029t = j;
        this.f3030u = zzmhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3028s) {
            case 0:
                zzmh zzmhVar = this.f3030u;
                zzmhVar.W0();
                zzmhVar.d1();
                zzfw zzfwVarI = zzmhVar.i();
                long j = this.f3029t;
                zzfwVarI.f9052F.a(Long.valueOf(j), "Activity paused, time");
                o1.c cVar = zzmhVar.f9270y;
                zzmh zzmhVar2 = (zzmh) cVar.f13624u;
                ((zzhj) zzmhVar2.f577s).f9120F.getClass();
                j0 j0Var = new j0(cVar, System.currentTimeMillis(), j);
                cVar.f13623t = j0Var;
                zzmhVar2.f9266u.postDelayed(j0Var, 2000L);
                if (((zzhj) zzmhVar.f577s).f9146y.k1()) {
                    zzmhVar.f9269x.f3044c.a();
                }
                break;
            default:
                zzmh zzmhVar3 = this.f3030u;
                zzmhVar3.W0();
                zzmhVar3.d1();
                zzfw zzfwVarI2 = zzmhVar3.i();
                long j10 = this.f3029t;
                zzfwVarI2.f9052F.a(Long.valueOf(j10), "Activity resumed, time");
                zzhj zzhjVar = (zzhj) zzmhVar3.f577s;
                boolean zH1 = zzhjVar.f9146y.h1(null, zzbf.f8940G0);
                zzag zzagVar = zzhjVar.f9146y;
                k0 k0Var = zzmhVar3.f9269x;
                if (zH1) {
                    if (zzagVar.k1() || zzmhVar3.f9267v) {
                        k0Var.f3045d.W0();
                        k0Var.f3044c.a();
                        k0Var.a = j10;
                        k0Var.f3043b = j10;
                    }
                } else if (zzagVar.k1() || zzmhVar3.U0().f3141L.b()) {
                    k0Var.f3045d.W0();
                    k0Var.f3044c.a();
                    k0Var.a = j10;
                    k0Var.f3043b = j10;
                }
                o1.c cVar2 = zzmhVar3.f9270y;
                zzmh zzmhVar4 = (zzmh) cVar2.f13624u;
                zzmhVar4.W0();
                j0 j0Var2 = (j0) cVar2.f13623t;
                if (j0Var2 != null) {
                    zzmhVar4.f9266u.removeCallbacks(j0Var2);
                }
                zzmhVar4.U0().f3141L.a(false);
                zzmhVar4.W0();
                zzmhVar4.f9267v = false;
                A1.r rVar = zzmhVar3.f9268w;
                ((zzmh) rVar.f167t).W0();
                zzmh zzmhVar5 = (zzmh) rVar.f167t;
                if (((zzhj) zzmhVar5.f577s).h()) {
                    ((zzhj) zzmhVar5.f577s).f9120F.getClass();
                    rVar.N(System.currentTimeMillis());
                }
                break;
        }
    }
}
