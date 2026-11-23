package M2;

import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzgm;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zziv;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class S implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2928s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f2929t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zziv f2930u;

    public /* synthetic */ S(zziv zzivVar, long j, int i10) {
        this.f2928s = i10;
        this.f2929t = j;
        this.f2930u = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2928s) {
            case 0:
                zziv zzivVar = this.f2930u;
                zzgm zzgmVar = zzivVar.U0().f3133D;
                long j = this.f2929t;
                zzgmVar.b(j);
                zzfw zzfwVarI = zzivVar.i();
                zzfwVarI.f9051E.a(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                zziv zzivVar2 = this.f2930u;
                zzivVar2.f1(this.f2929t, true);
                ((zzhj) zzivVar2.f577s).r().g1(new AtomicReference());
                break;
        }
    }
}
