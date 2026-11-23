package X9;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final Q a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0468n f5644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p076h8.j f5646d;

    public v(Q q10, C0468n c0468n, List list, p200u8.a aVar) {
        this.a = q10;
        this.f5644b = c0468n;
        this.f5645c = list;
        this.f5646d = D3.b.s(new u(aVar, 0));
    }

    public final List a() {
        return (List) this.f5646d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.a == this.a && p210v8.i.a(vVar.f5644b, this.f5644b) && p210v8.i.a(vVar.a(), a()) && p210v8.i.a(vVar.f5645c, this.f5645c);
    }

    public final int hashCode() {
        return this.f5645c.hashCode() + ((a().hashCode() + ((this.f5644b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(p086i8.m.H(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                p210v8.i.e(type2, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.f5644b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f5645c;
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                p210v8.i.e(type, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
