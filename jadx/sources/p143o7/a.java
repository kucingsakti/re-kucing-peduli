package p143o7;

import J4.j;
import N1.q;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.util.HashSet;
import java.util.Iterator;
import p122m7.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f13820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConnectivityManager f13821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f13822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f13824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f13825g;

    public a(Context context) {
        i.g(context, "context");
        this.f13825g = context;
        this.a = new Object();
        this.f13820b = new HashSet();
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = (ConnectivityManager) (systemService instanceof ConnectivityManager ? systemService : null);
        this.f13821c = connectivityManager;
        j jVar = new j(this, 7);
        this.f13822d = jVar;
        if (connectivityManager == null) {
            try {
                context.registerReceiver(jVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f13823e = true;
            } catch (Exception unused) {
            }
        } else {
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(0).addTransportType(1).addTransportType(3).build();
            q qVar = new q(this, 2);
            this.f13824f = qVar;
            connectivityManager.registerNetworkCallback(networkRequestBuild, qVar);
        }
    }

    public static final void a(a aVar) {
        synchronized (aVar.a) {
            Iterator it = aVar.f13820b.iterator();
            i.b(it, "networkChangeListenerSet.iterator()");
            while (it.hasNext()) {
                c cVar = (c) it.next();
                cVar.a.f13156y.d(new c2.a(cVar, 13));
            }
        }
    }

    public final boolean b() {
        return C3.a.j(this.f13825g);
    }

    public final void c() {
        synchronized (this.a) {
            this.f13820b.clear();
            if (this.f13823e) {
                try {
                    this.f13825g.unregisterReceiver(this.f13822d);
                } catch (Exception unused) {
                }
            }
            ConnectivityManager connectivityManager = this.f13821c;
            if (connectivityManager != null) {
                q qVar = this.f13824f;
                if (qVar instanceof ConnectivityManager.NetworkCallback) {
                    connectivityManager.unregisterNetworkCallback(qVar);
                }
            }
        }
    }

    public final void d(c cVar) {
        synchronized (this.a) {
            this.f13820b.remove(cVar);
        }
    }
}
