package G3;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes.dex */
public final class e implements AppMeasurementSdk.OnEventListener {
    public final /* synthetic */ c a;

    public e(c cVar) {
        this.a = cVar;
    }

    @Override // com.google.android.gms.measurement.internal.zziu
    public final void a(long j, Bundle bundle, String str, String str2) {
        if (str == null || b.a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(MediationMetaData.KEY_NAME, str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.a.a.q(bundle2);
    }
}
