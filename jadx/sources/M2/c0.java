package M2;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzfl;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzkx;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzo f2978t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zzkx f2979u;

    public /* synthetic */ c0(zzkx zzkxVar, zzo zzoVar, int i10) {
        this.f2977s = i10;
        this.f2978t = zzoVar;
        this.f2979u = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f2977s) {
            case 0:
                zzo zzoVar = this.f2978t;
                zzkx zzkxVar = this.f2979u;
                zzfl zzflVar = zzkxVar.f9243v;
                if (zzflVar != null) {
                    try {
                        zzflVar.y(zzoVar);
                    } catch (RemoteException e10) {
                        zzkxVar.i().f9056x.a(e10, "Failed to reset data on the service: remote exception");
                    }
                    zzkxVar.o1();
                } else {
                    zzkxVar.i().f9056x.b("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                zzo zzoVar2 = this.f2978t;
                zzkx zzkxVar2 = this.f2979u;
                zzfl zzflVar2 = zzkxVar2.f9243v;
                if (zzflVar2 == null) {
                    zzkxVar2.i().f9056x.b("Discarding data. Failed to send app launch");
                } else {
                    try {
                        zzflVar2.b0(zzoVar2);
                        ((zzhj) zzkxVar2.f577s).p().g1();
                        zzkxVar2.e1(zzflVar2, null, zzoVar2);
                        zzkxVar2.o1();
                    } catch (RemoteException e11) {
                        zzkxVar2.i().f9056x.a(e11, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            case 2:
                zzo zzoVar3 = this.f2978t;
                zzkx zzkxVar3 = this.f2979u;
                zzfl zzflVar3 = zzkxVar3.f9243v;
                if (zzflVar3 == null) {
                    zzkxVar3.i().f9056x.b("Failed to send measurementEnabled to service");
                } else {
                    try {
                        zzflVar3.W(zzoVar3);
                        zzkxVar3.o1();
                    } catch (RemoteException e12) {
                        zzkxVar3.i().f9056x.a(e12, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
                break;
            default:
                zzo zzoVar4 = this.f2978t;
                zzkx zzkxVar4 = this.f2979u;
                zzfl zzflVar4 = zzkxVar4.f9243v;
                if (zzflVar4 == null) {
                    zzkxVar4.i().f9056x.b("Failed to send consent settings to service");
                } else {
                    try {
                        zzflVar4.I(zzoVar4);
                        zzkxVar4.o1();
                    } catch (RemoteException e13) {
                        zzkxVar4.i().f9056x.a(e13, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }
}
