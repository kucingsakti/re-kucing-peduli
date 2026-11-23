package M2;

import com.google.android.gms.internal.measurement.zzdg;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzkx;
import com.google.android.gms.measurement.internal.zznp;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2906s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzdg f2907t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f2908u;

    public /* synthetic */ H(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdg zzdgVar, int i10) {
        this.f2906s = i10;
        this.f2907t = zzdgVar;
        this.f2908u = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2906s) {
            case 0:
                zzkx zzkxVarR = this.f2908u.f8881b.r();
                zzkxVarR.W0();
                zzkxVarR.a1();
                zzkxVarR.f1(new B4.I(zzkxVarR, zzkxVarR.p1(false), this.f2907t, 6));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f2908u;
                zznp zznpVar = appMeasurementDynamiteService.f8881b.f9118D;
                zzhj.e(zznpVar);
                zzhj zzhjVar = appMeasurementDynamiteService.f8881b;
                zznpVar.v1(this.f2907t, zzhjVar.f9132S != null && zzhjVar.f9132S.booleanValue());
                break;
        }
    }
}
