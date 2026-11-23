package X9;

import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class E implements Cloneable, InterfaceC0463i {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final List f5469T = Y9.c.l(F.HTTP_2, F.HTTP_1_1);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final List f5470U = Y9.c.l(C0470p.f5621e, C0470p.f5622f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f5471A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final r f5472B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0461g f5473C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0456b f5474D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ProxySelector f5475E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0456b f5476F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final SocketFactory f5477G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final SSLSocketFactory f5478H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final X509TrustManager f5479I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final List f5480J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final List f5481K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ka.c f5482L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C0466l f5483M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C3.b f5484N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f5485O;
    public final int P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f5486Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final long f5487R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final P0.d f5488S;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o1.m f5489s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final P0.d f5490t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f5491u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f5492v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Y9.a f5493w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f5494x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0456b f5495y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f5496z;

    public E(D d3) throws NoSuchAlgorithmException, KeyStoreException {
        this.f5489s = d3.a;
        this.f5490t = d3.f5445b;
        this.f5491u = Y9.c.x(d3.f5446c);
        this.f5492v = Y9.c.x(d3.f5447d);
        this.f5493w = d3.f5448e;
        this.f5494x = d3.f5449f;
        this.f5495y = d3.f5450g;
        this.f5496z = d3.f5451h;
        this.f5471A = d3.f5452i;
        this.f5472B = d3.j;
        this.f5473C = d3.f5453k;
        this.f5474D = d3.f5454l;
        ProxySelector proxySelector = d3.f5455m;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.f5475E = proxySelector == null ? p087ia.a.a : proxySelector;
        this.f5476F = d3.f5456n;
        this.f5477G = d3.f5457o;
        List list = d3.f5460r;
        this.f5480J = list;
        this.f5481K = d3.f5461s;
        this.f5482L = d3.f5462t;
        this.f5485O = d3.f5465w;
        this.P = d3.f5466x;
        this.f5486Q = d3.f5467y;
        this.f5487R = d3.f5468z;
        P0.d dVar = d3.f5444A;
        this.f5488S = dVar == null ? new P0.d(16) : dVar;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f5478H = null;
                    this.f5484N = null;
                    this.f5479I = null;
                    this.f5483M = C0466l.f5598c;
                    break;
                }
                if (((C0470p) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = d3.f5458p;
                    if (sSLSocketFactory == null) {
                        p068ga.n nVar = p068ga.n.a;
                        X509TrustManager x509TrustManagerN = p068ga.n.a.n();
                        this.f5479I = x509TrustManagerN;
                        this.f5478H = p068ga.n.a.m(x509TrustManagerN);
                        C3.b bVarB = p068ga.n.a.b(x509TrustManagerN);
                        this.f5484N = bVarB;
                        C0466l c0466l = d3.f5463u;
                        c0466l.getClass();
                        this.f5483M = p210v8.i.a(c0466l.f5599b, bVarB) ? c0466l : new C0466l(c0466l.a, bVarB);
                        break;
                    }
                    this.f5478H = sSLSocketFactory;
                    C3.b bVar = d3.f5464v;
                    p210v8.i.c(bVar);
                    this.f5484N = bVar;
                    X509TrustManager x509TrustManager = d3.f5459q;
                    p210v8.i.c(x509TrustManager);
                    this.f5479I = x509TrustManager;
                    C0466l c0466l2 = d3.f5463u;
                    c0466l2.getClass();
                    this.f5483M = p210v8.i.a(c0466l2.f5599b, bVar) ? c0466l2 : new C0466l(c0466l2.a, bVar);
                    break;
                }
            }
        } else {
            this.f5478H = null;
            this.f5484N = null;
            this.f5479I = null;
            this.f5483M = C0466l.f5598c;
            break;
        }
        List list3 = this.f5491u;
        if (list3.contains(null)) {
            throw new IllegalStateException(p210v8.i.k(list3, "Null interceptor: ").toString());
        }
        List list4 = this.f5492v;
        if (list4.contains(null)) {
            throw new IllegalStateException(p210v8.i.k(list4, "Null network interceptor: ").toString());
        }
        List list5 = this.f5480J;
        boolean z6 = list5 instanceof Collection;
        X509TrustManager x509TrustManager2 = this.f5479I;
        C3.b bVar2 = this.f5484N;
        SSLSocketFactory sSLSocketFactory2 = this.f5478H;
        if (!z6 || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((C0470p) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (bVar2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (bVar2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!p210v8.i.a(this.f5483M, C0466l.f5598c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final D a() {
        D d3 = new D();
        d3.a = this.f5489s;
        d3.f5445b = this.f5490t;
        p086i8.q.J(d3.f5446c, this.f5491u);
        p086i8.q.J(d3.f5447d, this.f5492v);
        d3.f5448e = this.f5493w;
        d3.f5449f = this.f5494x;
        d3.f5450g = this.f5495y;
        d3.f5451h = this.f5496z;
        d3.f5452i = this.f5471A;
        d3.j = this.f5472B;
        d3.f5453k = this.f5473C;
        d3.f5454l = this.f5474D;
        d3.f5455m = this.f5475E;
        d3.f5456n = this.f5476F;
        d3.f5457o = this.f5477G;
        d3.f5458p = this.f5478H;
        d3.f5459q = this.f5479I;
        d3.f5460r = this.f5480J;
        d3.f5461s = this.f5481K;
        d3.f5462t = this.f5482L;
        d3.f5463u = this.f5483M;
        d3.f5464v = this.f5484N;
        d3.f5465w = this.f5485O;
        d3.f5466x = this.P;
        d3.f5467y = this.f5486Q;
        d3.f5468z = this.f5487R;
        d3.f5444A = this.f5488S;
        return d3;
    }

    public final p020ba.i c(G g8) {
        p210v8.i.f(g8, "request");
        return new p020ba.i(this, g8);
    }

    public final Object clone() {
        return super.clone();
    }

    public E() {
        this(new D());
    }
}
