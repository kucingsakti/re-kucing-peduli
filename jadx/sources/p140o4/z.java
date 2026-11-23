package p140o4;

import X2.j;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object f13812x = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static Boolean f13813y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static Boolean f13814z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f13815s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f13816t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final PowerManager.WakeLock f13817u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x f13818v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f13819w;

    public z(x xVar, Context context, j jVar, long j) {
        this.f13818v = xVar;
        this.f13815s = context;
        this.f13819w = j;
        this.f13816t = jVar;
        this.f13817u = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f13812x) {
            try {
                Boolean bool = f13814z;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                f13814z = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context) {
        boolean zBooleanValue;
        synchronized (f13812x) {
            try {
                Boolean bool = f13813y;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                f13813y = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final synchronized boolean c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f13815s.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f13818v;
        Context context = this.f13815s;
        boolean zB = b(context);
        PowerManager.WakeLock wakeLock = this.f13817u;
        if (zB) {
            wakeLock.acquire(f.a);
        }
        try {
            try {
                try {
                    xVar.f(true);
                    if (!this.f13816t.e()) {
                        xVar.f(false);
                        if (!b(context)) {
                            return;
                        }
                    } else if (!a(context) || c()) {
                        if (xVar.g()) {
                            xVar.f(false);
                        } else {
                            xVar.h(this.f13819w);
                        }
                        if (!b(context)) {
                            return;
                        }
                    } else {
                        y yVar = new y();
                        yVar.a = this;
                        if (!Log.isLoggable("FirebaseMessaging", 3) && Build.VERSION.SDK_INT == 23) {
                            Log.isLoggable("FirebaseMessaging", 3);
                        }
                        context.registerReceiver(yVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        if (!b(context)) {
                            return;
                        }
                    }
                    wakeLock.release();
                } catch (IOException e10) {
                    e10.getMessage();
                    xVar.f(false);
                    if (b(context)) {
                        wakeLock.release();
                    }
                }
            } catch (Throwable th) {
                if (b(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused2) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
