package p020ba;

import X9.C0467m;
import X9.C0468n;
import X9.C0469o;
import X9.C0470p;
import Y9.c;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p103k8.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final List a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7355d;

    public b(List list) {
        i.f(list, "connectionSpecs");
        this.a = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public final C0470p a(SSLSocket sSLSocket) throws UnknownServiceException {
        C0470p c0470p;
        int i10;
        boolean z6;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i11 = this.f7353b;
        List list = this.a;
        int size = list.size();
        while (true) {
            if (i11 >= size) {
                c0470p = null;
                break;
            }
            int i12 = i11 + 1;
            c0470p = (C0470p) list.get(i11);
            if (c0470p.b(sSLSocket)) {
                this.f7353b = i12;
                break;
            }
            i11 = i12;
        }
        if (c0470p == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f7355d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            i.c(enabledProtocols2);
            String string = Arrays.toString(enabledProtocols2);
            i.e(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i13 = this.f7353b;
        int size2 = list.size();
        while (true) {
            i10 = 0;
            if (i13 >= size2) {
                z6 = false;
                break;
            }
            int i14 = i13 + 1;
            if (((C0470p) list.get(i13)).b(sSLSocket)) {
                z6 = true;
                break;
            }
            i13 = i14;
        }
        this.f7354c = z6;
        boolean z10 = this.f7355d;
        String[] strArr = c0470p.f5624c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            i.e(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = c.p(enabledCipherSuites2, strArr, C0468n.f5601c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r10 = c0470p.f5625d;
        if (r10 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            i.e(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = c.p(enabledProtocols3, r10, a.f12762b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        i.e(supportedCipherSuites, "supportedCipherSuites");
        C0467m c0467m = C0468n.f5601c;
        byte[] bArr = c.a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (c0467m.compare(supportedCipherSuites[i10], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i10++;
        }
        if (z10 && i10 != -1) {
            i.e(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i10];
            i.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            i.e(objArrCopyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        C0469o c0469o = new C0469o();
        c0469o.a = c0470p.a;
        c0469o.f5619c = strArr;
        c0469o.f5620d = r10;
        c0469o.f5618b = c0470p.f5623b;
        i.e(enabledCipherSuites, "cipherSuitesIntersection");
        c0469o.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        i.e(enabledProtocols, "tlsVersionsIntersection");
        c0469o.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        C0470p c0470pA = c0469o.a();
        if (c0470pA.c() != null) {
            sSLSocket.setEnabledProtocols(c0470pA.f5625d);
        }
        if (c0470pA.a() != null) {
            sSLSocket.setEnabledCipherSuites(c0470pA.f5624c);
        }
        return c0470p;
    }
}
