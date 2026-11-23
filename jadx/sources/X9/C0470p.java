package X9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: X9.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0470p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0470p f5621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0470p f5622f;
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f5624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f5625d;

    static {
        C0468n c0468n = C0468n.f5615r;
        C0468n c0468n2 = C0468n.f5616s;
        C0468n c0468n3 = C0468n.f5617t;
        C0468n c0468n4 = C0468n.f5609l;
        C0468n c0468n5 = C0468n.f5611n;
        C0468n c0468n6 = C0468n.f5610m;
        C0468n c0468n7 = C0468n.f5612o;
        C0468n c0468n8 = C0468n.f5614q;
        C0468n c0468n9 = C0468n.f5613p;
        C0468n[] c0468nArr = {c0468n, c0468n2, c0468n3, c0468n4, c0468n5, c0468n6, c0468n7, c0468n8, c0468n9, C0468n.j, C0468n.f5608k, C0468n.f5606h, C0468n.f5607i, C0468n.f5604f, C0468n.f5605g, C0468n.f5603e};
        C0469o c0469o = new C0469o();
        c0469o.b((C0468n[]) Arrays.copyOf(new C0468n[]{c0468n, c0468n2, c0468n3, c0468n4, c0468n5, c0468n6, c0468n7, c0468n8, c0468n9}, 9));
        Q q10 = Q.TLS_1_3;
        Q q11 = Q.TLS_1_2;
        c0469o.d(q10, q11);
        if (!c0469o.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0469o.f5618b = true;
        c0469o.a();
        C0469o c0469o2 = new C0469o();
        c0469o2.b((C0468n[]) Arrays.copyOf(c0468nArr, 16));
        c0469o2.d(q10, q11);
        if (!c0469o2.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0469o2.f5618b = true;
        f5621e = c0469o2.a();
        C0469o c0469o3 = new C0469o();
        c0469o3.b((C0468n[]) Arrays.copyOf(c0468nArr, 16));
        c0469o3.d(q10, q11, Q.TLS_1_1, Q.TLS_1_0);
        if (!c0469o3.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0469o3.f5618b = true;
        c0469o3.a();
        f5622f = new C0470p(false, false, null, null);
    }

    public C0470p(boolean z6, boolean z10, String[] strArr, String[] strArr2) {
        this.a = z6;
        this.f5623b = z10;
        this.f5624c = strArr;
        this.f5625d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f5624c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C0468n.f5600b.c(str));
        }
        return p086i8.k.s0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.f5625d;
        if (strArr != null && !Y9.c.j(strArr, sSLSocket.getEnabledProtocols(), p103k8.a.f12762b)) {
            return false;
        }
        String[] strArr2 = this.f5624c;
        return strArr2 == null || Y9.c.j(strArr2, sSLSocket.getEnabledCipherSuites(), C0468n.f5601c);
    }

    public final List c() {
        String[] strArr = this.f5625d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(o1.f.g(str));
        }
        return p086i8.k.s0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0470p)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0470p c0470p = (C0470p) obj;
        boolean z6 = c0470p.a;
        boolean z10 = this.a;
        if (z10 != z6) {
            return false;
        }
        if (z10) {
            return Arrays.equals(this.f5624c, c0470p.f5624c) && Arrays.equals(this.f5625d, c0470p.f5625d) && this.f5623b == c0470p.f5623b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.f5624c;
        int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f5625d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f5623b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(a(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(c(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f5623b + ')';
    }
}
