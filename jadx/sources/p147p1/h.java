package p147p1;

import android.net.ConnectivityManager;
import android.net.Network;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final Network a(ConnectivityManager connectivityManager) {
        i.f(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
