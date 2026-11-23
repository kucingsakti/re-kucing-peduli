package p140o4;

import J4.j;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f13789s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PowerManager.WakeLock f13790t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final FirebaseMessaging f13791u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ThreadPoolExecutor f13792v = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    public t(FirebaseMessaging firebaseMessaging, long j) {
        this.f13791u = firebaseMessaging;
        this.f13789s = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f9987b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f13790t = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f13791u.f9987b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.f13791u.a() == null) {
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVarN = r.n();
        FirebaseMessaging firebaseMessaging = this.f13791u;
        boolean zW = rVarN.w(firebaseMessaging.f9987b);
        PowerManager.WakeLock wakeLock = this.f13790t;
        if (zW) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f9994i = true;
                }
                if (!firebaseMessaging.f9993h.e()) {
                    firebaseMessaging.f(false);
                    if (r.n().w(firebaseMessaging.f9987b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (!r.n().v(firebaseMessaging.f9987b) || a()) {
                    if (b()) {
                        firebaseMessaging.f(false);
                    } else {
                        firebaseMessaging.h(this.f13789s);
                    }
                    if (r.n().w(firebaseMessaging.f9987b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                j jVar = new j();
                jVar.f2421b = this;
                jVar.a();
                if (r.n().w(firebaseMessaging.f9987b)) {
                    wakeLock.release();
                }
            } catch (IOException e10) {
                e10.getMessage();
                firebaseMessaging.f(false);
                if (r.n().w(firebaseMessaging.f9987b)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (r.n().w(firebaseMessaging.f9987b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
