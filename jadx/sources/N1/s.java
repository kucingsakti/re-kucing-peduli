package N1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s implements p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Executor f3299g = AsyncTask.SERIAL_EXECUTOR;
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f3300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A1.s f3301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f3302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f3303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J4.j f3304f = new J4.j(this, 2);

    public s(Context context, A1.s sVar, o oVar) {
        this.a = context.getApplicationContext();
        this.f3301c = sVar;
        this.f3300b = oVar;
    }

    @Override // N1.p
    public final void a() {
        f3299g.execute(new r(this, 1));
    }

    @Override // N1.p
    public final boolean b() {
        f3299g.execute(new r(this, 0));
        return true;
    }

    public final boolean c() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f3301c.get()).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e10) {
            if (!Log.isLoggable("ConnectivityMonitor", 5)) {
                return true;
            }
            Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
            return true;
        }
    }
}
