package p224x2;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.IAccountAccessor;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f15765s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f15766t;

    public n(o oVar, ConnectionResult connectionResult) {
        this.f15766t = oVar;
        this.f15765s = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor iAccountAccessor;
        o oVar = this.f15766t;
        zabq zabqVar = (zabq) oVar.f15771f.f7906B.get(oVar.f15767b);
        if (zabqVar == null) {
            return;
        }
        ConnectionResult connectionResult = this.f15765s;
        if (!connectionResult.T()) {
            zabqVar.l(connectionResult, null);
            return;
        }
        oVar.f15770e = true;
        Api.Client client = oVar.a;
        if (client.s()) {
            if (!oVar.f15770e || (iAccountAccessor = oVar.f15768c) == null) {
                return;
            }
            client.d(iAccountAccessor, oVar.f15769d);
            return;
        }
        try {
            client.d(null, client.c());
        } catch (SecurityException unused) {
            client.f("Failed to get service from broker.");
            zabqVar.l(new ConnectionResult(10), null);
        }
    }
}
