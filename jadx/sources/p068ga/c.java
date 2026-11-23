package p068ga;

import C3.b;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import ka.a;
import ka.d;
import p077ha.f;
import p077ha.h;
import p077ha.i;
import p077ha.k;
import p077ha.m;
import p077ha.n;
import p077ha.o;
import p204v1.g;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f11590e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f11592d;

    static {
        boolean z6 = false;
        if (g.o() && Build.VERSION.SDK_INT < 30) {
            z6 = true;
        }
        f11590e = z6;
    }

    public c() throws NoSuchMethodException {
        o oVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName(p210v8.i.k(".OpenSSLSocketImpl", "com.android.org.conscrypt"));
            Class.forName(p210v8.i.k(".OpenSSLSocketFactoryImpl", "com.android.org.conscrypt"));
            Class.forName(p210v8.i.k(".SSLParametersImpl", "com.android.org.conscrypt"));
            oVar = new o(cls);
        } catch (Exception e10) {
            n.a.getClass();
            n.i("unable to load android socket classes", 5, e10);
            oVar = null;
        }
        ArrayList arrayListU = p086i8.i.u(new n[]{oVar, new m(f.f11892f), new m(k.a), new m(h.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListU) {
            if (((n) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f11591c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method = cls2.getMethod("open", String.class);
            method2 = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f11592d = new i(method3, method, method2);
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
        return bVar == null ? new a(c(x509TrustManager)) : bVar;
    }

    @Override // p068ga.n
    public final d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // p068ga.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        p210v8.i.f(list, "protocols");
        Iterator it = this.f11591c.iterator();
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        p210v8.i.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // p068ga.n
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f11591c.iterator();
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
    public final Object g() {
        i iVar = this.f11592d;
        iVar.getClass();
        Method method = iVar.a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = iVar.f11897b;
                p210v8.i.c(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // p068ga.n
    public final boolean h(String str) {
        p210v8.i.f(str, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // p068ga.n
    public final void k(Object obj, String str) {
        p210v8.i.f(str, "message");
        i iVar = this.f11592d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f11898c;
                p210v8.i.c(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        n.j(this, str, 4);
    }
}
