package M2;

import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzkx;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends AbstractC0300i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzkx f2975f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(zzkx zzkxVar, zzhj zzhjVar, int i10) {
        super(zzhjVar);
        this.f2974e = i10;
        this.f2975f = zzkxVar;
    }

    @Override // M2.AbstractC0300i
    public final void c() {
        switch (this.f2974e) {
            case 0:
                zzkx zzkxVar = this.f2975f;
                zzkxVar.W0();
                if (zzkxVar.k1()) {
                    zzkxVar.i().f9052F.b("Inactivity, disconnecting from the service");
                    zzkxVar.j1();
                }
                break;
            default:
                this.f2975f.i().f9047A.b("Tasks have been queued for a long time");
                break;
        }
    }
}
