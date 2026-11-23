package p224x2;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.zae;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class g implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zaaw f15761b;

    public /* synthetic */ g(zaaw zaawVar) {
        this.f15761b = zaawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zaaw zaawVar = this.f15761b;
        Preconditions.i(zaawVar.f7952r);
        zae zaeVar = zaawVar.f7945k;
        Preconditions.i(zaeVar);
        zaeVar.b(new f(zaawVar));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zaaw zaawVar = this.f15761b;
        ReentrantLock reentrantLock = zaawVar.f7937b;
        ReentrantLock reentrantLock2 = zaawVar.f7937b;
        reentrantLock.lock();
        try {
            if (zaawVar.f7946l && !connectionResult.K()) {
                zaawVar.h();
                zaawVar.m();
            } else {
                zaawVar.k(connectionResult);
            }
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
    }
}
