package G3;

import A3.F;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zzkq;

/* JADX INFO: loaded from: classes.dex */
public final class d implements AppMeasurementSdk.OnEventListener {
    public final /* synthetic */ a a;

    public d(a aVar) {
        this.a = aVar;
    }

    @Override // com.google.android.gms.measurement.internal.zziu
    public final void a(long j, Bundle bundle, String str, String str2) {
        a aVar = this.a;
        if (aVar.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            F f10 = b.a;
            String strA = zzkq.a(str2, zziq.f9180c, zziq.a);
            if (strA != null) {
                str2 = strA;
            }
            bundle2.putString("events", str2);
            aVar.f1690b.q(bundle2);
        }
    }
}
