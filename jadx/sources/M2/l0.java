package M2;

import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzb;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.measurement.internal.zzmw;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends AbstractC0300i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3049f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, M m2, int i10) {
        super(m2);
        this.f3048e = i10;
        this.f3049f = obj;
    }

    @Override // M2.AbstractC0300i
    public final void c() throws Throwable {
        switch (this.f3048e) {
            case 0:
                k0 k0Var = (k0) this.f3049f;
                k0Var.f3045d.W0();
                zzmh zzmhVar = k0Var.f3045d;
                ((zzhj) zzmhVar.f577s).f9120F.getClass();
                k0Var.a(false, false, SystemClock.elapsedRealtime());
                zzhj zzhjVar = (zzhj) zzmhVar.f577s;
                zzb zzbVarM = zzhjVar.m();
                zzhjVar.f9120F.getClass();
                zzbVarM.a1(SystemClock.elapsedRealtime());
                break;
            default:
                zzmw zzmwVar = (zzmw) this.f3049f;
                zzmwVar.d1();
                zzmwVar.i().f9052F.b("Starting upload from DelayedRunnable");
                zzmwVar.f3055t.d0();
                break;
        }
    }
}
