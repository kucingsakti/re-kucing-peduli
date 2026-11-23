package p068ga;

import C3.b;
import X9.E;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import ka.a;
import p077ha.c;
import p077ha.d;
import p204v1.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public class n {
    public static volatile n a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f11607b;

    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[PHI: r4
      0x0074: PHI (r4v3 ga.n) = (r4v2 ga.n), (r4v4 ga.n) binds: [B:64:0x0161, B:25:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096 A[PHI: r3
      0x0096: PHI (r3v26 ga.n) = (r3v15 ga.n), (r3v20 ga.n), (r3v24 ga.n), (r3v29 ga.n) binds: [B:55:0x00e4, B:49:0x00d6, B:41:0x00b6, B:33:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0165  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        n kVar;
        String property;
        n nVar;
        n jVar = null;
        if (g.o()) {
            for (Map.Entry entry : c.f11891b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (c.a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(d.a);
                }
            }
            nVar = a.f11587d ? new a() : null;
            if (nVar == null) {
                jVar = c.f11590e ? new c() : null;
                i.c(jVar);
                nVar = jVar;
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            kVar = h.f11595d ? new h() : null;
            if (kVar != null) {
                nVar = kVar;
            } else if (!"BC".equals(Security.getProviders()[0].getName())) {
                if (e.f11593d) {
                    kVar = new e();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    nVar = kVar;
                } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    if (m.f11605d) {
                        kVar = new m();
                    } else {
                        kVar = null;
                    }
                    if (kVar != null) {
                        nVar = kVar;
                    } else {
                        if (k.f11604c) {
                            kVar = new k();
                        } else {
                            kVar = null;
                        }
                        if (kVar != null) {
                            nVar = kVar;
                        } else {
                            property = System.getProperty("java.specification.version", "unknown");
                            i.e(property, "jvmVersion");
                            if (Integer.parseInt(property) < 9) {
                                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls2 = Class.forName(i.k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                Class<?> cls3 = Class.forName(i.k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                Class<?> cls4 = Class.forName(i.k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                                Method method2 = cls.getMethod("get", SSLSocket.class);
                                Method method3 = cls.getMethod("remove", SSLSocket.class);
                                i.e(method, "putMethod");
                                i.e(method2, "getMethod");
                                i.e(method3, "removeMethod");
                                i.e(cls3, "clientProviderClass");
                                i.e(cls4, "serverProviderClass");
                                jVar = new j(method, method2, method3, cls3, cls4);
                            }
                            if (jVar != null) {
                                nVar = jVar;
                            } else {
                                nVar = new n();
                            }
                        }
                    }
                } else {
                    if (k.f11604c) {
                        kVar = new k();
                    } else {
                        kVar = null;
                    }
                    if (kVar != null) {
                        nVar = kVar;
                    } else {
                        property = System.getProperty("java.specification.version", "unknown");
                        i.e(property, "jvmVersion");
                        if (Integer.parseInt(property) < 9) {
                            Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls6 = Class.forName(i.k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Class<?> cls7 = Class.forName(i.k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Class<?> cls8 = Class.forName(i.k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Method method4 = cls5.getMethod("put", SSLSocket.class, cls6);
                            Method method5 = cls5.getMethod("get", SSLSocket.class);
                            Method method6 = cls5.getMethod("remove", SSLSocket.class);
                            i.e(method4, "putMethod");
                            i.e(method5, "getMethod");
                            i.e(method6, "removeMethod");
                            i.e(cls7, "clientProviderClass");
                            i.e(cls8, "serverProviderClass");
                            jVar = new j(method4, method5, method6, cls7, cls8);
                        }
                        if (jVar != null) {
                            nVar = jVar;
                        } else {
                            nVar = new n();
                        }
                    }
                }
            } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                if (k.f11604c) {
                    kVar = new k();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    nVar = kVar;
                } else {
                    property = System.getProperty("java.specification.version", "unknown");
                    i.e(property, "jvmVersion");
                    if (Integer.parseInt(property) < 9) {
                        Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls10 = Class.forName(i.k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                        Class<?> cls11 = Class.forName(i.k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                        Class<?> cls12 = Class.forName(i.k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                        Method method7 = cls9.getMethod("put", SSLSocket.class, cls10);
                        Method method8 = cls9.getMethod("get", SSLSocket.class);
                        Method method9 = cls9.getMethod("remove", SSLSocket.class);
                        i.e(method7, "putMethod");
                        i.e(method8, "getMethod");
                        i.e(method9, "removeMethod");
                        i.e(cls11, "clientProviderClass");
                        i.e(cls12, "serverProviderClass");
                        jVar = new j(method7, method8, method9, cls11, cls12);
                    }
                    if (jVar != null) {
                        nVar = jVar;
                    } else {
                        nVar = new n();
                    }
                }
            } else {
                if (m.f11605d) {
                    kVar = new m();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    nVar = kVar;
                } else {
                    if (k.f11604c) {
                        kVar = new k();
                    } else {
                        kVar = null;
                    }
                    if (kVar != null) {
                        nVar = kVar;
                    } else {
                        property = System.getProperty("java.specification.version", "unknown");
                        i.e(property, "jvmVersion");
                        if (Integer.parseInt(property) < 9) {
                            Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls14 = Class.forName(i.k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Class<?> cls15 = Class.forName(i.k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Class<?> cls16 = Class.forName(i.k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Method method10 = cls13.getMethod("put", SSLSocket.class, cls14);
                            Method method11 = cls13.getMethod("get", SSLSocket.class);
                            Method method12 = cls13.getMethod("remove", SSLSocket.class);
                            i.e(method10, "putMethod");
                            i.e(method11, "getMethod");
                            i.e(method12, "removeMethod");
                            i.e(cls15, "clientProviderClass");
                            i.e(cls16, "serverProviderClass");
                            jVar = new j(method10, method11, method12, cls15, cls16);
                        }
                        if (jVar != null) {
                            nVar = jVar;
                        } else {
                            nVar = new n();
                        }
                    }
                }
            }
        } else if (!"BC".equals(Security.getProviders()[0].getName())) {
            if (e.f11593d) {
                kVar = new e();
            } else {
                kVar = null;
            }
            if (kVar != null) {
                nVar = kVar;
            } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                if (k.f11604c) {
                    kVar = new k();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    nVar = kVar;
                } else {
                    property = System.getProperty("java.specification.version", "unknown");
                    i.e(property, "jvmVersion");
                    if (Integer.parseInt(property) < 9) {
                        Class<?> cls17 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls18 = Class.forName(i.k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                        Class<?> cls19 = Class.forName(i.k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                        Class<?> cls110 = Class.forName(i.k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                        Method method13 = cls17.getMethod("put", SSLSocket.class, cls18);
                        Method method14 = cls17.getMethod("get", SSLSocket.class);
                        Method method15 = cls17.getMethod("remove", SSLSocket.class);
                        i.e(method13, "putMethod");
                        i.e(method14, "getMethod");
                        i.e(method15, "removeMethod");
                        i.e(cls19, "clientProviderClass");
                        i.e(cls110, "serverProviderClass");
                        jVar = new j(method13, method14, method15, cls19, cls110);
                    }
                    if (jVar != null) {
                        nVar = jVar;
                    } else {
                        nVar = new n();
                    }
                }
            } else {
                if (m.f11605d) {
                    kVar = new m();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    nVar = kVar;
                } else {
                    if (k.f11604c) {
                        kVar = new k();
                    } else {
                        kVar = null;
                    }
                    if (kVar != null) {
                        nVar = kVar;
                    } else {
                        property = System.getProperty("java.specification.version", "unknown");
                        i.e(property, "jvmVersion");
                        if (Integer.parseInt(property) < 9) {
                            Class<?> cls111 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls112 = Class.forName(i.k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Class<?> cls113 = Class.forName(i.k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Class<?> cls114 = Class.forName(i.k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Method method16 = cls111.getMethod("put", SSLSocket.class, cls112);
                            Method method17 = cls111.getMethod("get", SSLSocket.class);
                            Method method18 = cls111.getMethod("remove", SSLSocket.class);
                            i.e(method16, "putMethod");
                            i.e(method17, "getMethod");
                            i.e(method18, "removeMethod");
                            i.e(cls113, "clientProviderClass");
                            i.e(cls114, "serverProviderClass");
                            jVar = new j(method16, method17, method18, cls113, cls114);
                        }
                        if (jVar != null) {
                            nVar = jVar;
                        } else {
                            nVar = new n();
                        }
                    }
                }
            }
        } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
            if (k.f11604c) {
                kVar = new k();
            } else {
                kVar = null;
            }
            if (kVar != null) {
                nVar = kVar;
            } else {
                property = System.getProperty("java.specification.version", "unknown");
                try {
                    i.e(property, "jvmVersion");
                    if (Integer.parseInt(property) < 9) {
                        try {
                            Class<?> cls115 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls116 = Class.forName(i.k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Class<?> cls117 = Class.forName(i.k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Class<?> cls118 = Class.forName(i.k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Method method19 = cls115.getMethod("put", SSLSocket.class, cls116);
                            Method method110 = cls115.getMethod("get", SSLSocket.class);
                            Method method111 = cls115.getMethod("remove", SSLSocket.class);
                            i.e(method19, "putMethod");
                            i.e(method110, "getMethod");
                            i.e(method111, "removeMethod");
                            i.e(cls117, "clientProviderClass");
                            i.e(cls118, "serverProviderClass");
                            jVar = new j(method19, method110, method111, cls117, cls118);
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
                if (jVar != null) {
                    nVar = jVar;
                } else {
                    nVar = new n();
                }
            }
        } else {
            if (m.f11605d) {
                kVar = new m();
            } else {
                kVar = null;
            }
            if (kVar != null) {
                nVar = kVar;
            } else {
                if (k.f11604c) {
                    kVar = new k();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    nVar = kVar;
                } else {
                    property = System.getProperty("java.specification.version", "unknown");
                    i.e(property, "jvmVersion");
                    if (Integer.parseInt(property) < 9) {
                        Class<?> cls119 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls1110 = Class.forName(i.k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                        Class<?> cls1111 = Class.forName(i.k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                        Class<?> cls1112 = Class.forName(i.k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                        Method method112 = cls119.getMethod("put", SSLSocket.class, cls1110);
                        Method method113 = cls119.getMethod("get", SSLSocket.class);
                        Method method114 = cls119.getMethod("remove", SSLSocket.class);
                        i.e(method112, "putMethod");
                        i.e(method113, "getMethod");
                        i.e(method114, "removeMethod");
                        i.e(cls1111, "clientProviderClass");
                        i.e(cls1112, "serverProviderClass");
                        jVar = new j(method112, method113, method114, cls1111, cls1112);
                    }
                    if (jVar != null) {
                        nVar = jVar;
                    } else {
                        nVar = new n();
                    }
                }
            }
        }
        a = nVar;
        f11607b = Logger.getLogger(E.class.getName());
    }

    public static void i(String str, int i10, Throwable th) {
        i.f(str, "message");
        f11607b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public static /* synthetic */ void j(n nVar, String str, int i10) {
        int i11 = (i10 & 2) != 0 ? 4 : 5;
        nVar.getClass();
        i(str, i11, null);
    }

    public b b(X509TrustManager x509TrustManager) {
        return new a(c(x509TrustManager));
    }

    public ka.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        i.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new ka.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        i.f(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        i.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f11607b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        i.f(str, "hostname");
        return true;
    }

    public void k(Object obj, String str) {
        i.f(str, "message");
        if (obj == null) {
            str = i.k(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);", str);
        }
        i(str, 5, (Throwable) obj);
    }

    public SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        i.e(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextL = l();
            sSLContextL.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
            i.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError(i.k(e10, "No System TLS: "), e10);
        }
    }

    public X509TrustManager n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
