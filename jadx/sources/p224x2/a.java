package p224x2;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class a implements BaseGmsClient.ConnectionProgressReportCallbacks {
    public final WeakReference a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Api f15750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15751c;

    public a(zaaw zaawVar, Api api, boolean z6) {
        this.a = new WeakReference(zaawVar);
        this.f15750b = api;
        this.f15751c = z6;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void a(ConnectionResult connectionResult) {
        zaaw zaawVar = (zaaw) this.a.get();
        if (zaawVar == null) {
            return;
        }
        Preconditions.k("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == zaawVar.a.f7989n.f7976y);
        ReentrantLock reentrantLock = zaawVar.f7937b;
        reentrantLock.lock();
        try {
            if (zaawVar.n(0)) {
                if (!connectionResult.T()) {
                    zaawVar.l(connectionResult, this.f15750b, this.f15751c);
                }
                if (zaawVar.o()) {
                    zaawVar.m();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
