package M2;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzbd;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zziv;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zznp;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f2940t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zziv f2941u;

    public /* synthetic */ U(zziv zzivVar, Bundle bundle, int i10) {
        this.f2939s = i10;
        this.f2940t = bundle;
        this.f2941u = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2939s) {
            case 0:
                zziv zzivVar = this.f2941u;
                zzivVar.W0();
                zzivVar.a1();
                Bundle bundle = this.f2940t;
                String string = bundle.getString(MediationMetaData.KEY_NAME);
                String string2 = bundle.getString("origin");
                Preconditions.e(string);
                Preconditions.e(string2);
                Preconditions.i(bundle.get("value"));
                zzhj zzhjVar = (zzhj) zzivVar.f577s;
                if (!zzhjVar.h()) {
                    zzivVar.i().f9052F.b("Conditional property not set since app measurement is disabled");
                } else {
                    zzno zznoVar = new zzno(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                    try {
                        zznp zznpVarV0 = zzivVar.V0();
                        bundle.getString("app_id");
                        zzbd zzbdVarJ1 = zznpVarV0.j1(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true);
                        zznp zznpVarV1 = zzivVar.V0();
                        bundle.getString("app_id");
                        zzbd zzbdVarJ2 = zznpVarV1.j1(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true);
                        zznp zznpVarV2 = zzivVar.V0();
                        bundle.getString("app_id");
                        zzhjVar.r().d1(new zzae(bundle.getString("app_id"), string2, zznoVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), zzbdVarJ2, bundle.getLong("trigger_timeout"), zzbdVarJ1, bundle.getLong("time_to_live"), zznpVarV2.j1(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            default:
                zziv zzivVar2 = this.f2941u;
                zzivVar2.W0();
                zzivVar2.a1();
                Bundle bundle2 = this.f2940t;
                String string3 = bundle2.getString(MediationMetaData.KEY_NAME);
                Preconditions.e(string3);
                zzhj zzhjVar2 = (zzhj) zzivVar2.f577s;
                if (!zzhjVar2.h()) {
                    zzivVar2.i().f9052F.b("Conditional property not cleared since app measurement is disabled");
                } else {
                    zzno zznoVar2 = new zzno(0L, null, string3, "");
                    try {
                        zznp zznpVarV3 = zzivVar2.V0();
                        bundle2.getString("app_id");
                        zzhjVar2.r().d1(new zzae(bundle2.getString("app_id"), "", zznoVar2, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), zznpVarV3.j1(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), true)));
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
                break;
        }
    }
}
