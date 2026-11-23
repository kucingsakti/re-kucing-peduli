package X9;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class P {
    public final C0455a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f5548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f5549c;

    public P(C0455a c0455a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        p210v8.i.f(inetSocketAddress, "socketAddress");
        this.a = c0455a;
        this.f5548b = proxy;
        this.f5549c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return p210v8.i.a(p10.a, this.a) && p210v8.i.a(p10.f5548b, this.f5548b) && p210v8.i.a(p10.f5549c, this.f5549c);
    }

    public final int hashCode() {
        return this.f5549c.hashCode() + ((this.f5548b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f5549c + '}';
    }
}
