package X9;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: X9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0455a {
    public final C0456b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f5557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f5558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f5559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0466l f5560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0456b f5561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f5562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f5563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f5564i;
    public final List j;

    public C0455a(String str, int i10, C0456b c0456b, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0466l c0466l, C0456b c0456b2, List list, List list2, ProxySelector proxySelector) {
        p210v8.i.f(str, "uriHost");
        p210v8.i.f(c0456b, "dns");
        p210v8.i.f(socketFactory, "socketFactory");
        p210v8.i.f(c0456b2, "proxyAuthenticator");
        p210v8.i.f(list, "protocols");
        p210v8.i.f(list2, "connectionSpecs");
        p210v8.i.f(proxySelector, "proxySelector");
        this.a = c0456b;
        this.f5557b = socketFactory;
        this.f5558c = sSLSocketFactory;
        this.f5559d = hostnameVerifier;
        this.f5560e = c0466l;
        this.f5561f = c0456b2;
        this.f5562g = proxySelector;
        x xVar = new x();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            xVar.a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException(p210v8.i.k(str2, "unexpected scheme: "));
            }
            xVar.a = "https";
        }
        String strQ = C3.a.q(C0456b.e(str, 0, 0, 7));
        if (strQ == null) {
            throw new IllegalArgumentException(p210v8.i.k(str, "unexpected host: "));
        }
        xVar.f5650d = strQ;
        if (1 > i10 || i10 >= 65536) {
            throw new IllegalArgumentException(p210v8.i.k(Integer.valueOf(i10), "unexpected port: ").toString());
        }
        xVar.f5651e = i10;
        this.f5563h = xVar.a();
        this.f5564i = Y9.c.x(list);
        this.j = Y9.c.x(list2);
    }

    public final boolean a(C0455a c0455a) {
        p210v8.i.f(c0455a, "that");
        return p210v8.i.a(this.a, c0455a.a) && p210v8.i.a(this.f5561f, c0455a.f5561f) && p210v8.i.a(this.f5564i, c0455a.f5564i) && p210v8.i.a(this.j, c0455a.j) && p210v8.i.a(this.f5562g, c0455a.f5562g) && p210v8.i.a(this.f5558c, c0455a.f5558c) && p210v8.i.a(this.f5559d, c0455a.f5559d) && p210v8.i.a(this.f5560e, c0455a.f5560e) && this.f5563h.f5659e == c0455a.f5563h.f5659e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0455a)) {
            return false;
        }
        C0455a c0455a = (C0455a) obj;
        return p210v8.i.a(this.f5563h, c0455a.f5563h) && a(c0455a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f5560e) + ((Objects.hashCode(this.f5559d) + ((Objects.hashCode(this.f5558c) + ((this.f5562g.hashCode() + ((this.j.hashCode() + ((this.f5564i.hashCode() + ((this.f5561f.hashCode() + ((this.a.hashCode() + p231y.a.a(527, this.f5563h.f5663i, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        y yVar = this.f5563h;
        sb.append(yVar.f5658d);
        sb.append(':');
        sb.append(yVar.f5659e);
        sb.append(", ");
        sb.append(p210v8.i.k(this.f5562g, "proxySelector="));
        sb.append('}');
        return sb.toString();
    }
}
