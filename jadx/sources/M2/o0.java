package M2;

import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zznc;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    public zzfn.zzk a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f3056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f3057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zznc f3059e;

    public o0(zznc zzncVar) {
        this.f3059e = zzncVar;
    }

    public final void a(zzfn.zzk zzkVar) {
        this.a = zzkVar;
    }

    public final boolean b(long j, zzfn.zzf zzfVar) {
        if (this.f3057c == null) {
            this.f3057c = new ArrayList();
        }
        if (this.f3056b == null) {
            this.f3056b = new ArrayList();
        }
        if (this.f3057c.isEmpty() || ((((zzfn.zzf) this.f3057c.get(0)).L() / 1000) / 60) / 60 == ((zzfVar.L() / 1000) / 60) / 60) {
            long jG = this.f3058d + ((long) zzfVar.g(null));
            zznc zzncVar = this.f3059e;
            zzncVar.S();
            if (jG < Math.max(0, ((Integer) zzbf.j.a(null)).intValue())) {
                this.f3058d = jG;
                this.f3057c.add(zzfVar);
                this.f3056b.add(Long.valueOf(j));
                int size = this.f3057c.size();
                zzncVar.S();
                if (size < Math.max(1, ((Integer) zzbf.f8991k.a(null)).intValue())) {
                    return true;
                }
            }
        }
        return false;
    }
}
