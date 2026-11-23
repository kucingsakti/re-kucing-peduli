package p147p1;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        p210v8.i.f(connectivityManager, "<this>");
        p210v8.i.f(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
