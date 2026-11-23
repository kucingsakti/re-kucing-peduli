package M2;

import com.google.android.gms.measurement.internal.zzb;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzks;

/* JADX INFO: renamed from: M2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0304m implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3050s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f3051t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC0306o f3052u;

    public /* synthetic */ RunnableC0304m(AbstractC0306o abstractC0306o, long j, int i10) {
        this.f3050s = i10;
        this.f3051t = j;
        this.f3052u = abstractC0306o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3050s) {
            case 0:
                ((zzb) this.f3052u).e1(this.f3051t);
                break;
            default:
                zzks zzksVar = (zzks) this.f3052u;
                ((zzhj) zzksVar.f577s).m().a1(this.f3051t);
                zzksVar.f9237w = null;
                break;
        }
    }
}
