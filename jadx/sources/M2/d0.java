package M2;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzbd;
import com.google.android.gms.measurement.internal.zzfl;
import com.google.android.gms.measurement.internal.zzkx;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2981s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzo f2982t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f2983u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ zzkx f2984v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractSafeParcelable f2985w;

    public /* synthetic */ d0(zzkx zzkxVar, zzo zzoVar, boolean z6, AbstractSafeParcelable abstractSafeParcelable, int i10) {
        this.f2981s = i10;
        this.f2982t = zzoVar;
        this.f2983u = z6;
        this.f2985w = abstractSafeParcelable;
        this.f2984v = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f2981s) {
            case 0:
                zzkx zzkxVar = this.f2984v;
                zzfl zzflVar = zzkxVar.f9243v;
                if (zzflVar != null) {
                    zzkxVar.e1(zzflVar, this.f2983u ? null : (zzno) this.f2985w, this.f2982t);
                    zzkxVar.o1();
                } else {
                    zzkxVar.i().f9056x.b("Discarding data. Failed to set user property");
                }
                break;
            case 1:
                zzkx zzkxVar2 = this.f2984v;
                zzfl zzflVar2 = zzkxVar2.f9243v;
                if (zzflVar2 != null) {
                    zzbd zzbdVar = (zzbd) this.f2985w;
                    zzo zzoVar = this.f2982t;
                    if (this.f2983u) {
                        zzbdVar = null;
                    }
                    zzkxVar2.e1(zzflVar2, zzbdVar, zzoVar);
                    zzkxVar2.o1();
                } else {
                    zzkxVar2.i().f9056x.b("Discarding data. Failed to send event to service");
                }
                break;
            default:
                zzkx zzkxVar3 = this.f2984v;
                zzfl zzflVar3 = zzkxVar3.f9243v;
                if (zzflVar3 != null) {
                    zzkxVar3.e1(zzflVar3, this.f2983u ? null : (zzae) this.f2985w, this.f2982t);
                    zzkxVar3.o1();
                } else {
                    zzkxVar3.i().f9056x.b("Discarding data. Failed to send conditional user property to service");
                }
                break;
        }
    }

    public d0(zzkx zzkxVar, zzo zzoVar, boolean z6, zzae zzaeVar, zzae zzaeVar2) {
        this.f2981s = 2;
        this.f2982t = zzoVar;
        this.f2983u = z6;
        this.f2985w = zzaeVar;
        this.f2984v = zzkxVar;
    }
}
