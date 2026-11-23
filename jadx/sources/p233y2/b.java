package p233y2;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zzc;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends zzc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f16025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f16026f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BaseGmsClient baseGmsClient, int i10, Bundle bundle) {
        super(baseGmsClient);
        this.f16026f = baseGmsClient;
        this.f16024d = i10;
        this.f16025e = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final /* bridge */ /* synthetic */ void a() {
        BaseGmsClient baseGmsClient = this.f16026f;
        int i10 = this.f16024d;
        if (i10 != 0) {
            baseGmsClient.G(1, null);
            Bundle bundle = this.f16025e;
            d(new ConnectionResult(i10, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (e()) {
                return;
            }
            baseGmsClient.G(1, null);
            d(new ConnectionResult(8, null));
        }
    }

    public abstract void d(ConnectionResult connectionResult);

    public abstract boolean e();
}
