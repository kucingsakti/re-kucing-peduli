package p068ga;

import C3.b;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p077ha.f;
import p077ha.h;
import p077ha.k;
import p077ha.m;
import p077ha.n;
import p086i8.i;
import p204v1.g;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f11587d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11588c;

    static {
        f11587d = g.o() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList arrayListU = i.u(new n[]{(!g.o() || Build.VERSION.SDK_INT < 29) ? null : new p077ha.a(), new m(f.f11892f), new m(k.a), new m(h.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListU) {
            if (((n) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f11588c = arrayList;
    }

    @Override // p068ga.n
    public final b b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        p077ha.b bVar = x509TrustManagerExtensions != null ? new p077ha.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar == null ? new ka.a(c(x509TrustManager)) : bVar;
    }

    @Override // p068ga.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        p210v8.i.f(list, "protocols");
        Iterator it = this.f11588c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((n) next).a(sSLSocket));
        n nVar = (n) next;
        if (nVar == null) {
            return;
        }
        nVar.c(sSLSocket, str, list);
    }

    @Override // p068ga.n
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f11588c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((n) next).a(sSLSocket));
        n nVar = (n) next;
        if (nVar == null) {
            return null;
        }
        return nVar.b(sSLSocket);
    }

    @Override // p068ga.n
    public final boolean h(String str) {
        p210v8.i.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
