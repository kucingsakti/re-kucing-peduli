package N1;

import M2.P;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class q extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3296b;

    public /* synthetic */ q(Object obj, int i10) {
        this.a = i10;
        this.f3296b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                U1.n.f().post(new P(this, true, 1));
                break;
            case 1:
            default:
                super.onAvailable(network);
                break;
            case 2:
                p210v8.i.g(network, "network");
                p143o7.a.a((p143o7.a) this.f3296b);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 1:
                p210v8.i.f(network, "network");
                p210v8.i.f(networkCapabilities, "capabilities");
                p050f1.q qVarA = p050f1.q.a();
                int i10 = p117m1.h.a;
                networkCapabilities.toString();
                qVarA.getClass();
                p117m1.g gVar = (p117m1.g) this.f3296b;
                gVar.f(p117m1.h.a(gVar.f13067f));
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Object obj = this.f3296b;
        switch (this.a) {
            case 0:
                U1.n.f().post(new P(this, false, 1));
                break;
            case 1:
                p210v8.i.f(network, "network");
                p050f1.q qVarA = p050f1.q.a();
                int i10 = p117m1.h.a;
                qVarA.getClass();
                p117m1.g gVar = (p117m1.g) obj;
                gVar.f(p117m1.h.a(gVar.f13067f));
                break;
            default:
                p210v8.i.g(network, "network");
                p143o7.a.a((p143o7.a) obj);
                break;
        }
    }
}
