package M2;

import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.measurement.internal.zzmo;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f3031s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f3032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o1.c f3033u;

    public j0(o1.c cVar, long j, long j10) {
        this.f3033u = cVar;
        this.f3031s = j;
        this.f3032t = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhc zzhcVarL = ((zzmh) this.f3033u.f13624u).l();
        zzmo zzmoVar = new zzmo();
        zzmoVar.f9271s = this;
        zzhcVarL.f1(zzmoVar);
    }
}
