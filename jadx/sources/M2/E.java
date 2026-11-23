package M2;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzhn;
import com.google.android.gms.measurement.internal.zznc;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes.dex */
public final class E implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2892s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzo f2893t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zzhn f2894u;

    public /* synthetic */ E(zzhn zzhnVar, zzo zzoVar, int i10) {
        this.f2892s = i10;
        this.f2893t = zzoVar;
        this.f2894u = zzhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2892s) {
            case 0:
                zzhn zzhnVar = this.f2894u;
                zzhnVar.f9150b.b0();
                zzhnVar.f9150b.P(this.f2893t);
                break;
            case 1:
                zzhn zzhnVar2 = this.f2894u;
                zzhnVar2.f9150b.b0();
                zznc zzncVar = zzhnVar2.f9150b;
                zzncVar.l().W0();
                zzncVar.c0();
                zzo zzoVar = this.f2893t;
                Preconditions.e(zzoVar.f9350s);
                zzncVar.e(zzoVar);
                break;
            case 2:
                zzhn zzhnVar3 = this.f2894u;
                zzhnVar3.f9150b.b0();
                zzhnVar3.f9150b.R(this.f2893t);
                break;
            default:
                zzhn zzhnVar4 = this.f2894u;
                zzhnVar4.f9150b.b0();
                zznc zzncVar2 = zzhnVar4.f9150b;
                zzncVar2.l().W0();
                zzncVar2.c0();
                zzo zzoVar2 = this.f2893t;
                Preconditions.e(zzoVar2.f9350s);
                zzncVar2.V(zzoVar2);
                zzncVar2.T(zzoVar2);
                break;
        }
    }
}
