package B4;

import J0.C0252b;
import X9.C0455a;
import X9.InterfaceC0464j;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: B4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0157e implements p030ca.d {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f671h;

    public /* synthetic */ C0157e(int i10) {
        this.a = i10;
    }

    @Override // p030ca.d
    public long a(X9.L l4) {
        if (!p030ca.e.a(l4)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(X9.L.b(l4, "Transfer-Encoding"))) {
            return -1L;
        }
        return Y9.c.k(l4);
    }

    @Override // p030ca.d
    public ma.w b(X9.L l4) {
        if (!p030ca.e.a(l4)) {
            return k(0L);
        }
        if ("chunked".equalsIgnoreCase(X9.L.b(l4, "Transfer-Encoding"))) {
            X9.y yVar = l4.f5531s.a;
            int i10 = this.f666c;
            if (i10 != 4) {
                throw new IllegalStateException(p210v8.i.k(Integer.valueOf(i10), "state: ").toString());
            }
            this.f666c = 5;
            return new da.c(this, yVar);
        }
        long jK = Y9.c.k(l4);
        if (jK != -1) {
            return k(jK);
        }
        int i11 = this.f666c;
        if (i11 != 4) {
            throw new IllegalStateException(p210v8.i.k(Integer.valueOf(i11), "state: ").toString());
        }
        this.f666c = 5;
        ((p020ba.k) this.f667d).l();
        return new da.f(this);
    }

    @Override // p030ca.d
    public void c() {
        ((ma.q) this.f669f).flush();
    }

    @Override // p030ca.d
    public void cancel() {
        Socket socket = ((p020ba.k) this.f667d).f7396c;
        if (socket == null) {
            return;
        }
        Y9.c.e(socket);
    }

    @Override // p030ca.d
    public void d() {
        ((ma.q) this.f669f).flush();
    }

    @Override // p030ca.d
    public X9.K e(boolean z6) throws IOException {
        C0252b c0252b = (C0252b) this.f670g;
        int i10 = this.f666c;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException(p210v8.i.k(Integer.valueOf(i10), "state: ").toString());
        }
        try {
            String strO = ((ma.r) c0252b.f2272c).o(c0252b.f2271b);
            c0252b.f2271b -= (long) strO.length();
            A1.q qVarL = C3.a.l(strO);
            int i11 = qVarL.f163b;
            X9.K k3 = new X9.K();
            k3.f5514b = (X9.F) qVarL.f164c;
            k3.f5515c = i11;
            k3.f5516d = (String) qVarL.f165d;
            M1.c cVar = new M1.c(3);
            while (true) {
                String strO2 = ((ma.r) c0252b.f2272c).o(c0252b.f2271b);
                c0252b.f2271b -= (long) strO2.length();
                if (strO2.length() == 0) {
                    break;
                }
                cVar.b(strO2);
            }
            k3.c(cVar.d());
            if (z6 && i11 == 100) {
                return null;
            }
            if (i11 == 100) {
                this.f666c = 3;
                return k3;
            }
            this.f666c = 4;
            return k3;
        } catch (EOFException e10) {
            throw new IOException(p210v8.i.k(((p020ba.k) this.f667d).f7395b.a.f5563h.g(), "unexpected end of stream on "), e10);
        }
    }

    @Override // p030ca.d
    public ma.v f(X9.G g8, long j) {
        p210v8.i.f(g8, "request");
        if ("chunked".equalsIgnoreCase(g8.f5506c.e("Transfer-Encoding"))) {
            int i10 = this.f666c;
            if (i10 != 1) {
                throw new IllegalStateException(p210v8.i.k(Integer.valueOf(i10), "state: ").toString());
            }
            this.f666c = 2;
            return new da.b(this);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i11 = this.f666c;
        if (i11 != 1) {
            throw new IllegalStateException(p210v8.i.k(Integer.valueOf(i11), "state: ").toString());
        }
        this.f666c = 2;
        return new da.e(this);
    }

    @Override // p030ca.d
    public void g(X9.G g8) {
        p210v8.i.f(g8, "request");
        Proxy.Type type = ((p020ba.k) this.f667d).f7395b.f5548b.type();
        p210v8.i.e(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(g8.f5505b);
        sb.append(' ');
        X9.y yVar = g8.a;
        if (yVar.j || type != Proxy.Type.HTTP) {
            String strB = yVar.b();
            String strD = yVar.d();
            if (strD != null) {
                strB = strB + '?' + ((Object) strD);
            }
            sb.append(strB);
        } else {
            sb.append(yVar);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
        n(g8.f5506c, string);
    }

    @Override // p030ca.d
    public p020ba.k h() {
        return (p020ba.k) this.f667d;
    }

    public p092j4.a i() {
        String strC = this.f666c == 0 ? " registrationStatus" : "";
        if (((Long) this.f669f) == null) {
            strC = strC.concat(" expiresInSecs");
        }
        if (((Long) this.f670g) == null) {
            strC = p231y.a.c(strC, " tokenCreationEpochInSecs");
        }
        if (strC.isEmpty()) {
            return new p092j4.a((String) this.f665b, this.f666c, (String) this.f667d, (String) this.f668e, ((Long) this.f669f).longValue(), ((Long) this.f670g).longValue(), (String) this.f671h);
        }
        throw new IllegalStateException("Missing required properties:".concat(strC));
    }

    public boolean j() {
        return this.f666c < ((List) this.f669f).size() || !((ArrayList) this.f671h).isEmpty();
    }

    public da.d k(long j) {
        int i10 = this.f666c;
        if (i10 != 4) {
            throw new IllegalStateException(p210v8.i.k(Integer.valueOf(i10), "state: ").toString());
        }
        this.f666c = 5;
        return new da.d(this, j);
    }

    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.List] */
    public P3.n l() throws SocketException, UnknownHostException {
        String hostAddress;
        int port;
        boolean zContains;
        if (!j()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f666c < ((List) this.f669f).size()) {
            boolean z6 = this.f666c < ((List) this.f669f).size();
            C0455a c0455a = (C0455a) this.f665b;
            if (!z6) {
                throw new SocketException("No route to " + c0455a.f5563h.f5658d + "; exhausted proxy configurations: " + ((List) this.f669f));
            }
            List list = (List) this.f669f;
            int i10 = this.f666c;
            this.f666c = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            ArrayList arrayList2 = new ArrayList();
            this.f670g = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                X9.y yVar = c0455a.f5563h;
                hostAddress = yVar.f5658d;
                port = yVar.f5659e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(p210v8.i.k(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
                }
                p210v8.i.e(socketAddressAddress, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                p210v8.i.f(inetSocketAddress, "<this>");
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    p210v8.i.e(hostAddress, "hostName");
                } else {
                    hostAddress = address.getHostAddress();
                    p210v8.i.e(hostAddress, "address.hostAddress");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                p210v8.i.f((InterfaceC0464j) this.f668e, "call");
                p210v8.i.f(hostAddress, "domainName");
                c0455a.a.getClass();
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                    p210v8.i.e(allByName, "getAllByName(hostname)");
                    List listH = p086i8.i.H(allByName);
                    if (listH.isEmpty()) {
                        throw new UnknownHostException(c0455a.a + " returned no addresses for " + hostAddress);
                    }
                    Iterator it = listH.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                    }
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException(p210v8.i.k(hostAddress, "Broken system behaviour for dns lookup of "));
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
            Iterator it2 = this.f670g.iterator();
            while (it2.hasNext()) {
                X9.P p10 = new X9.P((C0455a) this.f665b, proxy, (InetSocketAddress) it2.next());
                P0.d dVar = (P0.d) this.f667d;
                synchronized (dVar) {
                    zContains = ((LinkedHashSet) dVar.f3811t).contains(p10);
                }
                if (zContains) {
                    ((ArrayList) this.f671h).add(p10);
                } else {
                    arrayList.add(p10);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            p086i8.q.J(arrayList, (ArrayList) this.f671h);
            ((ArrayList) this.f671h).clear();
        }
        return new P3.n(arrayList);
    }

    public A1.r m(ViewGroup viewGroup, LinearLayout.LayoutParams layoutParams) {
        this.f667d = viewGroup;
        this.f668e = layoutParams;
        A1.r rVar = new A1.r(1, false);
        rVar.f167t = this;
        return rVar;
    }

    public void n(X9.w wVar, String str) {
        p210v8.i.f(str, "requestLine");
        int i10 = this.f666c;
        if (i10 != 0) {
            throw new IllegalStateException(p210v8.i.k(Integer.valueOf(i10), "state: ").toString());
        }
        ma.q qVar = (ma.q) this.f669f;
        qVar.Q(str);
        qVar.Q("\r\n");
        int size = wVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            qVar.Q(wVar.f(i11));
            qVar.Q(": ");
            qVar.Q(wVar.m(i11));
            qVar.Q("\r\n");
        }
        qVar.Q("\r\n");
        this.f666c = 1;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return ((p037d9.a) this.f665b) + " version=" + ((i9.f) this.f667d);
            default:
                return super.toString();
        }
    }

    public C0157e(p037d9.a aVar, i9.f fVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10) {
        this.a = 3;
        p210v8.i.f(aVar, "kind");
        this.f665b = aVar;
        this.f667d = fVar;
        this.f668e = strArr;
        this.f669f = strArr2;
        this.f670g = strArr3;
        this.f671h = str;
        this.f666c = i10;
    }

    public C0157e(C0455a c0455a, P0.d dVar, InterfaceC0464j interfaceC0464j) {
        List listL;
        this.a = 2;
        p210v8.i.f(dVar, "routeDatabase");
        p210v8.i.f(interfaceC0464j, "call");
        this.f665b = c0455a;
        this.f667d = dVar;
        this.f668e = interfaceC0464j;
        p086i8.s sVar = p086i8.s.f12328s;
        this.f669f = sVar;
        this.f670g = sVar;
        this.f671h = new ArrayList();
        X9.y yVar = c0455a.f5563h;
        p210v8.i.f(yVar, "url");
        URI uriI = yVar.i();
        if (uriI.getHost() == null) {
            listL = Y9.c.l(Proxy.NO_PROXY);
        } else {
            List<Proxy> listSelect = c0455a.f5562g.select(uriI);
            List<Proxy> list = listSelect;
            if (list != null && !list.isEmpty()) {
                p210v8.i.e(listSelect, "proxiesOrNull");
                listL = Y9.c.x(listSelect);
            } else {
                listL = Y9.c.l(Proxy.NO_PROXY);
            }
        }
        this.f669f = listL;
        this.f666c = 0;
    }

    public C0157e(X9.E e10, p020ba.k kVar, ma.r rVar, ma.q qVar) {
        this.a = 4;
        p210v8.i.f(kVar, "connection");
        p210v8.i.f(rVar, "source");
        p210v8.i.f(qVar, "sink");
        this.f665b = e10;
        this.f667d = kVar;
        this.f668e = rVar;
        this.f669f = qVar;
        this.f670g = new C0252b(rVar);
    }
}
