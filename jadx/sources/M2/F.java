package M2;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzhn;
import com.google.android.gms.measurement.internal.zziv;
import com.google.android.gms.measurement.internal.zzkp;
import com.google.android.gms.measurement.internal.zzks;
import com.google.android.gms.measurement.internal.zznc;

/* JADX INFO: loaded from: classes.dex */
public final class F implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2896t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2897u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f2898v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2899w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2900x;

    public /* synthetic */ F(Object obj, Object obj2, Object obj3, Object obj4, long j, int i10) {
        this.f2895s = i10;
        this.f2896t = obj2;
        this.f2897u = obj3;
        this.f2899w = obj4;
        this.f2898v = j;
        this.f2900x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2895s) {
            case 0:
                String str = (String) this.f2897u;
                zzhn zzhnVar = (zzhn) this.f2900x;
                String str2 = (String) this.f2896t;
                if (str2 != null) {
                    zzkp zzkpVar = new zzkp((String) this.f2899w, str2, this.f2898v);
                    zznc zzncVar = zzhnVar.f9150b;
                    zzncVar.l().W0();
                    String str3 = zzncVar.f9302X;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    zzncVar.f9302X = str;
                    zzncVar.f9301W = zzkpVar;
                } else {
                    zznc zzncVar2 = zzhnVar.f9150b;
                    zzncVar2.l().W0();
                    String str4 = zzncVar2.f9302X;
                    if (str4 == null || str4.equals(str)) {
                        zzncVar2.f9302X = str;
                        zzncVar2.f9301W = null;
                    }
                }
                break;
            case 1:
                Object obj = this.f2899w;
                ((zziv) this.f2900x).e1(this.f2898v, obj, (String) this.f2896t, (String) this.f2897u);
                break;
            default:
                Bundle bundle = (Bundle) this.f2896t;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                zzks zzksVar = (zzks) this.f2900x;
                zzksVar.h1((zzkp) this.f2897u, (zzkp) this.f2899w, this.f2898v, true, zzksVar.V0().g1("screen_view", bundle, null, false));
                break;
        }
    }
}
