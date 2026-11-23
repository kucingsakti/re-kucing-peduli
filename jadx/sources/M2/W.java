package M2;

import com.google.android.gms.measurement.internal.zzin;
import com.google.android.gms.measurement.internal.zziv;
import com.google.android.gms.measurement.internal.zzkp;
import com.google.android.gms.measurement.internal.zzks;

/* JADX INFO: loaded from: classes.dex */
public final class W implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2948s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f2949t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f2950u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2951v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractC0305n f2953x;

    public W(zziv zzivVar, zzin zzinVar, long j, boolean z6, zzin zzinVar2) {
        this.f2951v = zzinVar;
        this.f2949t = j;
        this.f2950u = z6;
        this.f2952w = zzinVar2;
        this.f2953x = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2948s) {
            case 0:
                zziv zzivVar = (zziv) this.f2953x;
                zzin zzinVar = (zzin) this.f2951v;
                zzivVar.i1(zzinVar);
                zziv.k1((zziv) this.f2953x, (zzin) this.f2951v, this.f2949t, false, this.f2950u);
                zziv.l1(zzivVar, zzinVar, (zzin) this.f2952w);
                break;
            default:
                ((zzks) this.f2953x).h1((zzkp) this.f2951v, (zzkp) this.f2952w, this.f2949t, this.f2950u, null);
                break;
        }
    }

    public W(zzks zzksVar, zzkp zzkpVar, zzkp zzkpVar2, long j, boolean z6) {
        this.f2951v = zzkpVar;
        this.f2952w = zzkpVar2;
        this.f2949t = j;
        this.f2950u = z6;
        this.f2953x = zzksVar;
    }
}
