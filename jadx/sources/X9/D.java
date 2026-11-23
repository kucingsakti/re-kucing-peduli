package X9;

import java.net.ProxySelector;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public P0.d f5444A;
    public o1.m a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public P0.d f5445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Y9.a f5448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0456b f5450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5452i;
    public r j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0461g f5453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0456b f5454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ProxySelector f5455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0456b f5456n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SocketFactory f5457o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SSLSocketFactory f5458p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public X509TrustManager f5459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f5460r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f5461s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ka.c f5462t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0466l f5463u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C3.b f5464v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5466x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5467y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f5468z;

    public D() {
        o1.m mVar = new o1.m();
        mVar.f13642t = new ArrayDeque();
        mVar.f13643u = new ArrayDeque();
        mVar.f13644v = new ArrayDeque();
        this.a = mVar;
        this.f5445b = new P0.d(11);
        this.f5446c = new ArrayList();
        this.f5447d = new ArrayList();
        this.f5448e = new Y9.a(0);
        this.f5449f = true;
        C0456b c0456b = C0456b.f5565s;
        this.f5450g = c0456b;
        this.f5451h = true;
        this.f5452i = true;
        this.j = r.f5637h;
        this.f5454l = C0456b.f5566t;
        this.f5456n = c0456b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        p210v8.i.e(socketFactory, "getDefault()");
        this.f5457o = socketFactory;
        this.f5460r = E.f5470U;
        this.f5461s = E.f5469T;
        this.f5462t = ka.c.a;
        this.f5463u = C0466l.f5598c;
        this.f5465w = 10000;
        this.f5466x = 10000;
        this.f5467y = 10000;
        this.f5468z = 1024L;
    }
}
