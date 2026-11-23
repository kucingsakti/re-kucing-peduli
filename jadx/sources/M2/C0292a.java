package M2;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zziu;

/* JADX INFO: renamed from: M2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0292a implements zziu {
    public final zzdh a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f2962b;

    public C0292a(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdh zzdhVar) {
        this.f2962b = appMeasurementDynamiteService;
        this.a = zzdhVar;
    }

    @Override // com.google.android.gms.measurement.internal.zziu
    public final void a(long j, Bundle bundle, String str, String str2) {
        try {
            this.a.N(j, bundle, str, str2);
        } catch (RemoteException e10) {
            zzhj zzhjVar = this.f2962b.f8881b;
            if (zzhjVar != null) {
                zzfw zzfwVar = zzhjVar.f9115A;
                zzhj.g(zzfwVar);
                zzfwVar.f9047A.a(e10, "Event listener threw exception");
            }
        }
    }
}
