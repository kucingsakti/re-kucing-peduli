package p020ba;

import A0.j;
import B4.C0157e;
import Fa.e;
import L9.g;
import P0.d;
import X9.C0455a;
import X9.C0466l;
import X9.C0468n;
import X9.C0470p;
import X9.E;
import X9.F;
import X9.G;
import X9.InterfaceC0464j;
import X9.K;
import X9.L;
import X9.P;
import X9.v;
import X9.y;
import Y9.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import ma.q;
import ma.r;
import okhttp3.internal.connection.RouteException;
import p030ca.f;
import p048ea.a;
import p048ea.h;
import p048ea.o;
import p048ea.p;
import p048ea.w;
import p048ea.z;
import p068ga.l;
import p068ga.n;
import p086i8.C;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class k extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f7395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Socket f7396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f7397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f7398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F f7399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f7400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f7401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f7402i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7406n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f7408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f7409q;

    public k(l lVar, P p10) {
        i.f(lVar, "connectionPool");
        i.f(p10, "route");
        this.f7395b = p10;
        this.f7407o = 1;
        this.f7408p = new ArrayList();
        this.f7409q = Long.MAX_VALUE;
    }

    public static void d(E e10, P p10, IOException iOException) {
        i.f(e10, "client");
        i.f(p10, "failedRoute");
        i.f(iOException, "failure");
        if (p10.f5548b.type() != Proxy.Type.DIRECT) {
            C0455a c0455a = p10.a;
            c0455a.f5562g.connectFailed(c0455a.f5563h.i(), p10.f5548b.address(), iOException);
        }
        d dVar = e10.f5488S;
        synchronized (dVar) {
            ((LinkedHashSet) dVar.f3811t).add(p10);
        }
    }

    @Override // p048ea.h
    public final synchronized void a(o oVar, z zVar) {
        i.f(oVar, "connection");
        i.f(zVar, "settings");
        this.f7407o = (zVar.a & 16) != 0 ? zVar.f11376b[4] : Integer.MAX_VALUE;
    }

    @Override // p048ea.h
    public final void b(p048ea.v vVar) {
        vVar.c(a.REFUSED_STREAM, null);
    }

    public final void c(int i10, int i11, int i12, boolean z6, InterfaceC0464j interfaceC0464j) throws Throwable {
        i.f(interfaceC0464j, "call");
        if (this.f7399f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f7395b.a.j;
        b bVar = new b(list);
        C0455a c0455a = this.f7395b.a;
        if (c0455a.f5558c == null) {
            if (!list.contains(C0470p.f5622f)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f7395b.a.f5563h.f5658d;
            n nVar = n.a;
            if (!n.a.h(str)) {
                throw new RouteException(new UnknownServiceException(E0.a.i("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c0455a.f5564i.contains(F.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                P p10 = this.f7395b;
                if (p10.a.f5558c != null && p10.f5548b.type() == Proxy.Type.HTTP) {
                    f(i10, i11, i12, interfaceC0464j);
                    if (this.f7396c != null) {
                        break;
                    } else {
                        break;
                    }
                }
                e(i10, i11, interfaceC0464j);
                g(bVar, interfaceC0464j);
                i.f(this.f7395b.f5549c, "inetSocketAddress");
                break;
            } catch (IOException e10) {
                Socket socket = this.f7397d;
                if (socket != null) {
                    c.e(socket);
                }
                Socket socket2 = this.f7396c;
                if (socket2 != null) {
                    c.e(socket2);
                }
                this.f7397d = null;
                this.f7396c = null;
                this.f7401h = null;
                this.f7402i = null;
                this.f7398e = null;
                this.f7399f = null;
                this.f7400g = null;
                this.f7407o = 1;
                i.f(this.f7395b.f5549c, "inetSocketAddress");
                if (routeException == null) {
                    routeException = new RouteException(e10);
                } else {
                    C8.E.e(routeException.f13839s, e10);
                    routeException.f13840t = e10;
                }
                if (!z6) {
                    throw routeException;
                }
                bVar.f7355d = true;
                if (!bVar.f7354c) {
                    throw routeException;
                }
                if (e10 instanceof ProtocolException) {
                    throw routeException;
                }
                if (e10 instanceof InterruptedIOException) {
                    throw routeException;
                }
                if ((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) {
                    throw routeException;
                }
                if (e10 instanceof SSLPeerUnverifiedException) {
                    throw routeException;
                }
                if (!(e10 instanceof SSLException)) {
                    throw routeException;
                }
            }
        }
        P p11 = this.f7395b;
        if (p11.a.f5558c != null && p11.f5548b.type() == Proxy.Type.HTTP && this.f7396c == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f7409q = System.nanoTime();
    }

    public final void e(int i10, int i11, InterfaceC0464j interfaceC0464j) throws IOException {
        Socket socketCreateSocket;
        P p10 = this.f7395b;
        Proxy proxy = p10.f5548b;
        C0455a c0455a = p10.a;
        Proxy.Type type = proxy.type();
        int i12 = type == null ? -1 : j.a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = c0455a.f5557b.createSocket();
            i.c(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f7396c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f7395b.f5549c;
        i.f(interfaceC0464j, "call");
        i.f(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i11);
        try {
            n nVar = n.a;
            n.a.e(socketCreateSocket, this.f7395b.f5549c, i10);
            try {
                this.f7401h = p068ga.d.d(p068ga.d.E(socketCreateSocket));
                this.f7402i = p068ga.d.c(p068ga.d.B(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (i.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException(i.k(this.f7395b.f5549c, "Failed to connect to "));
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i10, int i11, int i12, InterfaceC0464j interfaceC0464j) throws IOException {
        e eVar = new e(11);
        P p10 = this.f7395b;
        y yVar = p10.a.f5563h;
        i.f(yVar, "url");
        eVar.f1659t = yVar;
        eVar.v("CONNECT", null);
        C0455a c0455a = p10.a;
        eVar.n("Host", c.w(c0455a.f5563h, true));
        eVar.n("Proxy-Connection", "Keep-Alive");
        eVar.n("User-Agent", "okhttp/4.10.0");
        G gJ = eVar.j();
        M1.c cVar = new M1.c(3);
        C.e("Proxy-Authenticate");
        C.f("OkHttp-Preemptive", "Proxy-Authenticate");
        cVar.i("Proxy-Authenticate");
        cVar.c("Proxy-Authenticate", "OkHttp-Preemptive");
        cVar.d();
        c0455a.f5561f.getClass();
        e(i10, i11, interfaceC0464j);
        String str = "CONNECT " + c.w(gJ.a, true) + " HTTP/1.1";
        r rVar = this.f7401h;
        i.c(rVar);
        q qVar = this.f7402i;
        i.c(qVar);
        C0157e c0157e = new C0157e(null, this, rVar, qVar);
        ma.y yVarE = rVar.f13212s.e();
        long j = i11;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yVarE.g(j);
        qVar.f13209s.e().g(i12);
        c0157e.n(gJ.f5506c, str);
        c0157e.c();
        K kE = c0157e.e(false);
        i.c(kE);
        kE.a = gJ;
        L lA = kE.a();
        long jK = c.k(lA);
        if (jK != -1) {
            da.d dVarK = c0157e.k(jK);
            c.u(dVarK, Integer.MAX_VALUE);
            dVarK.close();
        }
        int i13 = lA.f5534v;
        if (i13 != 200) {
            if (i13 != 407) {
                throw new IOException(i.k(Integer.valueOf(i13), "Unexpected response code for CONNECT: "));
            }
            c0455a.f5561f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!rVar.f13213t.j() || !qVar.f13210t.j()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(b bVar, InterfaceC0464j interfaceC0464j) throws Throwable {
        int i10 = 7;
        C0455a c0455a = this.f7395b.a;
        SSLSocketFactory sSLSocketFactory = c0455a.f5558c;
        F f10 = F.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c0455a.f5564i;
            F f11 = F.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(f11)) {
                this.f7397d = this.f7396c;
                this.f7399f = f10;
                return;
            } else {
                this.f7397d = this.f7396c;
                this.f7399f = f11;
                m();
                return;
            }
        }
        i.f(interfaceC0464j, "call");
        C0455a c0455a2 = this.f7395b.a;
        SSLSocketFactory sSLSocketFactory2 = c0455a2.f5558c;
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            i.c(sSLSocketFactory2);
            Socket socket = this.f7396c;
            y yVar = c0455a2.f5563h;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, yVar.f5658d, yVar.f5659e, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                C0470p c0470pA = bVar.a(sSLSocket2);
                if (c0470pA.f5623b) {
                    n nVar = n.a;
                    n.a.d(sSLSocket2, c0455a2.f5563h.f5658d, c0455a2.f5564i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                i.e(session, "sslSocketSession");
                v vVarF = com.bumptech.glide.e.f(session);
                HostnameVerifier hostnameVerifier = c0455a2.f5559d;
                i.c(hostnameVerifier);
                if (hostnameVerifier.verify(c0455a2.f5563h.f5658d, session)) {
                    C0466l c0466l = c0455a2.f5560e;
                    i.c(c0466l);
                    this.f7398e = new v(vVarF.a, vVarF.f5644b, vVarF.f5645c, new j(c0466l, vVarF, c0455a2, i10));
                    c0466l.a(c0455a2.f5563h.f5658d, new A0.r(this, 29));
                    if (c0470pA.f5623b) {
                        n nVar2 = n.a;
                        strF = n.a.f(sSLSocket2);
                    }
                    this.f7397d = sSLSocket2;
                    this.f7401h = p068ga.d.d(p068ga.d.E(sSLSocket2));
                    this.f7402i = p068ga.d.c(p068ga.d.B(sSLSocket2));
                    if (strF != null) {
                        f10 = l.f(strF);
                    }
                    this.f7399f = f10;
                    n nVar3 = n.a;
                    n.a.a(sSLSocket2);
                    if (this.f7399f == F.HTTP_2) {
                        m();
                        return;
                    }
                    return;
                }
                List listA = vVarF.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c0455a2.f5563h.f5658d + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) listA.get(0);
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c0455a2.f5563h.f5658d);
                sb.append(" not verified:\n              |    certificate: ");
                C0466l c0466l2 = C0466l.f5598c;
                i.f(x509Certificate, "certificate");
                ma.i iVar = ma.i.f13191v;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                i.e(encoded, "publicKey.encoded");
                sb.append(i.k(p230x9.d.u(encoded).g("SHA-256").f(), "sha256/"));
                sb.append("\n              |    DN: ");
                sb.append((Object) x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(p086i8.k.g0(ka.c.a(x509Certificate, 7), ka.c.a(x509Certificate, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(g.y(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    n nVar4 = n.a;
                    n.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    c.e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void h() {
        this.f7405m++;
    }

    public final boolean i(C0455a c0455a, List list) {
        v vVar;
        byte[] bArr = c.a;
        if (this.f7408p.size() < this.f7407o && !this.j) {
            P p10 = this.f7395b;
            if (p10.a.a(c0455a)) {
                y yVar = c0455a.f5563h;
                String str = yVar.f5658d;
                C0455a c0455a2 = p10.a;
                if (i.a(str, c0455a2.f5563h.f5658d)) {
                    return true;
                }
                if (this.f7400g != null && list != null) {
                    List<P> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (P p11 : list2) {
                            Proxy.Type type = p11.f5548b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && p10.f5548b.type() == type2) {
                                if (i.a(p10.f5549c, p11.f5549c)) {
                                    if (c0455a.f5559d != ka.c.a) {
                                        break;
                                    }
                                    byte[] bArr2 = c.a;
                                    y yVar2 = c0455a2.f5563h;
                                    if (yVar.f5659e != yVar2.f5659e) {
                                        break;
                                    }
                                    String str2 = yVar2.f5658d;
                                    String str3 = yVar.f5658d;
                                    if (!i.a(str3, str2)) {
                                        if (!this.f7403k && (vVar = this.f7398e) != null) {
                                            List listA = vVar.a();
                                            if (listA.isEmpty() || !ka.c.c(str3, (X509Certificate) listA.get(0))) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            break;
                                            break;
                                        }
                                    }
                                    try {
                                        C0466l c0466l = c0455a.f5560e;
                                        i.c(c0466l);
                                        v vVar2 = this.f7398e;
                                        i.c(vVar2);
                                        List listA2 = vVar2.a();
                                        i.f(str3, "hostname");
                                        i.f(listA2, "peerCertificates");
                                        c0466l.a(str3, new j(c0466l, listA2, str3, 5));
                                        return true;
                                    } catch (SSLPeerUnverifiedException unused) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean j(boolean z6) {
        long j;
        byte[] bArr = c.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f7396c;
        i.c(socket);
        Socket socket2 = this.f7397d;
        i.c(socket2);
        r rVar = this.f7401h;
        i.c(rVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        o oVar = this.f7400g;
        if (oVar != null) {
            return oVar.g(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.f7409q;
        }
        if (j < 10000000000L || !z6) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !rVar.a();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final p030ca.d k(E e10, f fVar) throws SocketException {
        i.f(e10, "client");
        Socket socket = this.f7397d;
        i.c(socket);
        r rVar = this.f7401h;
        i.c(rVar);
        q qVar = this.f7402i;
        i.c(qVar);
        o oVar = this.f7400g;
        if (oVar != null) {
            return new p(e10, this, fVar, oVar);
        }
        int i10 = fVar.f7581g;
        socket.setSoTimeout(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        rVar.f13212s.e().g(i10);
        qVar.f13209s.e().g(fVar.f7582h);
        return new C0157e(e10, this, rVar, qVar);
    }

    public final synchronized void l() {
        this.j = true;
    }

    public final void m() throws SocketException {
        Socket socket = this.f7397d;
        i.c(socket);
        r rVar = this.f7401h;
        i.c(rVar);
        q qVar = this.f7402i;
        i.c(qVar);
        socket.setSoTimeout(0);
        p010aa.c cVar = p010aa.c.f6023h;
        p188t1.G g8 = new p188t1.G(cVar);
        String str = this.f7395b.a.f5563h.f5658d;
        i.f(str, "peerName");
        g8.f14980u = socket;
        String str2 = c.f5826g + ' ' + str;
        i.f(str2, "<set-?>");
        g8.f14978s = str2;
        g8.f14981v = rVar;
        g8.f14982w = qVar;
        g8.f14983x = this;
        o oVar = new o(g8);
        this.f7400g = oVar;
        z zVar = o.f11304R;
        this.f7407o = (zVar.a & 16) != 0 ? zVar.f11376b[4] : Integer.MAX_VALUE;
        w wVar = oVar.f11319O;
        synchronized (wVar) {
            try {
                if (wVar.f11372v) {
                    throw new IOException("closed");
                }
                Logger logger = w.f11368x;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(c.i(i.k(p048ea.f.a.i(), ">> CONNECTION "), new Object[0]));
                }
                wVar.f11369s.O(p048ea.f.a);
                wVar.f11369s.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        oVar.f11319O.l(oVar.f11312H);
        int iA = oVar.f11312H.a();
        if (iA != 65535) {
            oVar.f11319O.n(0, iA - 65535);
        }
        cVar.e().c(new Z9.f(oVar.f11323u, oVar.P, 1), 0L);
    }

    public final String toString() {
        C0468n c0468n;
        StringBuilder sb = new StringBuilder("Connection{");
        P p10 = this.f7395b;
        sb.append(p10.a.f5563h.f5658d);
        sb.append(':');
        sb.append(p10.a.f5563h.f5659e);
        sb.append(", proxy=");
        sb.append(p10.f5548b);
        sb.append(" hostAddress=");
        sb.append(p10.f5549c);
        sb.append(" cipherSuite=");
        v vVar = this.f7398e;
        Object obj = "none";
        if (vVar != null && (c0468n = vVar.f5644b) != null) {
            obj = c0468n;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f7399f);
        sb.append('}');
        return sb.toString();
    }
}
