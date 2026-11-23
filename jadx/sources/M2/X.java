package M2;

import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzin;
import com.google.android.gms.measurement.internal.zziv;

/* JADX INFO: loaded from: classes.dex */
public final class X implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ zzin f2954s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f2955t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f2956u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f2957v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zzin f2958w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zziv f2959x;

    public X(zziv zzivVar, zzin zzinVar, long j, long j10, boolean z6, zzin zzinVar2) {
        this.f2954s = zzinVar;
        this.f2955t = j;
        this.f2956u = j10;
        this.f2957v = z6;
        this.f2958w = zzinVar2;
        this.f2959x = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzin zzinVar = this.f2954s;
        zziv zzivVar = this.f2959x;
        zzivVar.i1(zzinVar);
        zznk.a();
        if (!((zzhj) zzivVar.f577s).f9146y.h1(null, zzbf.U0)) {
            zzivVar.f1(this.f2955t, false);
        }
        zziv.k1(this.f2959x, zzinVar, this.f2956u, true, this.f2957v);
        zziv.l1(zzivVar, zzinVar, this.f2958w);
    }
}
