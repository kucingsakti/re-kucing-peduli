package p068ga;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import ka.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {
    public final X509TrustManager a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f11589b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.a = x509TrustManager;
        this.f11589b = method;
    }

    @Override // ka.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        i.f(x509Certificate, "cert");
        try {
            Object objInvoke = this.f11589b.invoke(this.a, x509Certificate);
            if (objInvoke != null) {
                return ((TrustAnchor) objInvoke).getTrustedCert();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e10) {
            throw new AssertionError("unable to get issues and signature", e10);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return i.a(this.a, bVar.a) && i.a(this.f11589b, bVar.f11589b);
    }

    public final int hashCode() {
        return this.f11589b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.f11589b + ')';
    }
}
