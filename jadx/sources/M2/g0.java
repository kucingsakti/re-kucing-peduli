package M2;

import android.content.ComponentName;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzkx;
import com.google.android.gms.measurement.internal.zzlw;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3019s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzlw f3020t;

    public /* synthetic */ g0(zzlw zzlwVar, int i10) {
        this.f3019s = i10;
        this.f3020t = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3019s) {
            case 0:
                zzkx zzkxVar = this.f3020t.f9252u;
                zzkxVar.f9243v = null;
                zzkxVar.n1();
                break;
            default:
                zzlw zzlwVar = this.f3020t;
                zzkx zzkxVar2 = zzlwVar.f9252u;
                ComponentName componentName = new ComponentName(((zzhj) zzlwVar.f9252u.f577s).f9140s, "com.google.android.gms.measurement.AppMeasurementService");
                zzkxVar2.W0();
                if (zzkxVar2.f9243v != null) {
                    zzkxVar2.f9243v = null;
                    zzkxVar2.i().f9052F.a(componentName, "Disconnected from device MeasurementService");
                    zzkxVar2.W0();
                    zzkxVar2.i1();
                }
                break;
        }
    }
}
