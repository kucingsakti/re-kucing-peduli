package p068ga;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f11593d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f11594c = new BouncyCastleJsseProvider();

    static {
        boolean z6 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, d.class.getClassLoader());
            z6 = true;
        } catch (ClassNotFoundException unused) {
        }
        f11593d = z6;
    }

    @Override // p068ga.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        i.f(list, "protocols");
    }

    @Override // p068ga.n
    public final String f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // p068ga.n
    public final SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f11594c);
        i.e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p068ga.n
    public final X509TrustManager n() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        i.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String string = Arrays.toString(trustManagers);
        i.e(string, "toString(this)");
        throw new IllegalStateException(i.k(string, "Unexpected default trust managers: ").toString());
    }
}
