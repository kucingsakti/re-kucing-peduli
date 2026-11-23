package p224x2;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zacs;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {
    public final Api.Client a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApiKey f15767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IAccountAccessor f15768c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f15769d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15770e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f15771f;

    public o(GoogleApiManager googleApiManager, Api.Client client, ApiKey apiKey) {
        this.f15771f = googleApiManager;
        this.a = client;
        this.f15767b = apiKey;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void a(ConnectionResult connectionResult) {
        this.f15771f.f7910F.post(new n(this, connectionResult));
    }

    public final void b(ConnectionResult connectionResult) {
        zabq zabqVar = (zabq) this.f15771f.f7906B.get(this.f15767b);
        if (zabqVar != null) {
            zabqVar.m(connectionResult);
        }
    }
}
