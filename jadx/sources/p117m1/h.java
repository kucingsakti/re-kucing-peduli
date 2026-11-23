package p117m1;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import k1.a;
import p050f1.q;
import p147p1.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final /* synthetic */ int a = 0;

    static {
        i.e(q.c("NetworkStateTracker"), "tagWithPrefix(\"NetworkStateTracker\")");
    }

    public static final a a(ConnectivityManager connectivityManager) {
        boolean zB;
        i.f(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z6 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilitiesA = g.a(connectivityManager, p147p1.h.a(connectivityManager));
            zB = networkCapabilitiesA != null ? g.b(networkCapabilitiesA, 16) : false;
        } catch (SecurityException unused) {
            q.a().getClass();
        }
        return new a(z6, zB, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
