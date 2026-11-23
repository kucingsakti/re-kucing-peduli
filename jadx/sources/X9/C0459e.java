package X9;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0459e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f5573k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f5574l;
    public final y a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f5575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F f5577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f5580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f5581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f5582i;
    public final long j;

    static {
        p068ga.n nVar = p068ga.n.a;
        p068ga.n.a.getClass();
        f5573k = p210v8.i.k("-Sent-Millis", "OkHttp");
        p068ga.n.a.getClass();
        f5574l = p210v8.i.k("-Received-Millis", "OkHttp");
    }

    public C0459e(ma.w wVar) throws IOException {
        y yVarA;
        p210v8.i.f(wVar, "rawSource");
        try {
            ma.r rVarD = p068ga.d.d(wVar);
            String strO = rVarD.o(Long.MAX_VALUE);
            try {
                x xVar = new x();
                xVar.c(null, strO);
                yVarA = xVar.a();
            } catch (IllegalArgumentException unused) {
                yVarA = null;
            }
            if (yVarA == null) {
                IOException iOException = new IOException(p210v8.i.k(strO, "Cache corruption for "));
                p068ga.n nVar = p068ga.n.a;
                p068ga.n.a.getClass();
                p068ga.n.i("cache corruption", 5, iOException);
                throw iOException;
            }
            this.a = yVarA;
            this.f5576c = rVarD.o(Long.MAX_VALUE);
            M1.c cVar = new M1.c(3);
            int iP = p181s3.a.p(rVarD);
            int i10 = 0;
            while (i10 < iP) {
                i10++;
                cVar.b(rVarD.o(Long.MAX_VALUE));
            }
            this.f5575b = cVar.d();
            A1.q qVarL = C3.a.l(rVarD.o(Long.MAX_VALUE));
            this.f5577d = (F) qVarL.f164c;
            this.f5578e = qVarL.f163b;
            this.f5579f = (String) qVarL.f165d;
            M1.c cVar2 = new M1.c(3);
            int iP2 = p181s3.a.p(rVarD);
            int i11 = 0;
            while (i11 < iP2) {
                i11++;
                cVar2.b(rVarD.o(Long.MAX_VALUE));
            }
            String str = f5573k;
            String strF = cVar2.f(str);
            String str2 = f5574l;
            String strF2 = cVar2.f(str2);
            cVar2.i(str);
            cVar2.i(str2);
            long j = 0;
            this.f5582i = strF == null ? 0L : Long.parseLong(strF);
            if (strF2 != null) {
                j = Long.parseLong(strF2);
            }
            this.j = j;
            this.f5580g = cVar2.d();
            if (p210v8.i.a(this.a.a, "https")) {
                String strO2 = rVarD.o(Long.MAX_VALUE);
                if (strO2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strO2 + '\"');
                }
                C0468n c0468nC = C0468n.f5600b.c(rVarD.o(Long.MAX_VALUE));
                List listA = a(rVarD);
                this.f5581h = new v(!rVarD.a() ? o1.f.g(rVarD.o(Long.MAX_VALUE)) : Q.SSL_3_0, c0468nC, Y9.c.x(a(rVarD)), new t(Y9.c.x(listA), 0));
            } else {
                this.f5581h = null;
            }
            wVar.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.bumptech.glide.c.c(wVar, th);
                throw th2;
            }
        }
    }

    public static List a(ma.r rVar) throws IOException {
        int iP = p181s3.a.p(rVar);
        if (iP == -1) {
            return p086i8.s.f12328s;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iP);
            int i10 = 0;
            while (i10 < iP) {
                i10++;
                String strO = rVar.o(Long.MAX_VALUE);
                ma.f fVar = new ma.f();
                ma.i iVar = ma.i.f13191v;
                ma.i iVarP = p230x9.d.p(strO);
                p210v8.i.c(iVarP);
                fVar.a0(iVarP);
                arrayList.add(certificateFactory.generateCertificate(new ma.e(fVar, 0)));
            }
            return arrayList;
        } catch (CertificateException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public static void b(ma.q qVar, List list) throws IOException {
        try {
            qVar.R(list.size());
            qVar.z(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                ma.i iVar = ma.i.f13191v;
                p210v8.i.e(encoded, "bytes");
                qVar.Q(p230x9.d.u(encoded).f());
                qVar.z(10);
            }
        } catch (CertificateEncodingException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public final void c(K0.g gVar) {
        y yVar = this.a;
        v vVar = this.f5581h;
        w wVar = this.f5580g;
        w wVar2 = this.f5575b;
        ma.q qVarC = p068ga.d.c(gVar.j(0));
        try {
            qVarC.Q(yVar.f5663i);
            qVarC.z(10);
            qVarC.Q(this.f5576c);
            qVarC.z(10);
            qVarC.R(wVar2.size());
            qVarC.z(10);
            int size = wVar2.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                qVarC.Q(wVar2.f(i10));
                qVarC.Q(": ");
                qVarC.Q(wVar2.m(i10));
                qVarC.z(10);
                i10 = i11;
            }
            F f10 = this.f5577d;
            int i12 = this.f5578e;
            String str = this.f5579f;
            p210v8.i.f(f10, "protocol");
            p210v8.i.f(str, "message");
            StringBuilder sb = new StringBuilder();
            if (f10 == F.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i12);
            sb.append(' ');
            sb.append(str);
            String string = sb.toString();
            p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
            qVarC.Q(string);
            qVarC.z(10);
            qVarC.R(wVar.size() + 2);
            qVarC.z(10);
            int size2 = wVar.size();
            for (int i13 = 0; i13 < size2; i13++) {
                qVarC.Q(wVar.f(i13));
                qVarC.Q(": ");
                qVarC.Q(wVar.m(i13));
                qVarC.z(10);
            }
            qVarC.Q(f5573k);
            qVarC.Q(": ");
            qVarC.R(this.f5582i);
            qVarC.z(10);
            qVarC.Q(f5574l);
            qVarC.Q(": ");
            qVarC.R(this.j);
            qVarC.z(10);
            if (p210v8.i.a(yVar.a, "https")) {
                qVarC.z(10);
                p210v8.i.c(vVar);
                qVarC.Q(vVar.f5644b.a);
                qVarC.z(10);
                b(qVarC, vVar.a());
                b(qVarC, vVar.f5645c);
                qVarC.Q(vVar.a.f5556s);
                qVarC.z(10);
            }
            qVarC.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.bumptech.glide.c.c(qVarC, th);
                throw th2;
            }
        }
    }

    public C0459e(L l4) {
        w wVarD;
        G g8 = l4.f5531s;
        this.a = g8.a;
        L l10 = l4.f5538z;
        p210v8.i.c(l10);
        w wVar = l10.f5531s.f5506c;
        w wVar2 = l4.f5536x;
        Set setY = p181s3.a.y(wVar2);
        if (setY.isEmpty()) {
            wVarD = Y9.c.f5821b;
        } else {
            M1.c cVar = new M1.c(3);
            int size = wVar.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                String strF = wVar.f(i10);
                if (setY.contains(strF)) {
                    cVar.a(strF, wVar.m(i10));
                }
                i10 = i11;
            }
            wVarD = cVar.d();
        }
        this.f5575b = wVarD;
        this.f5576c = g8.f5505b;
        this.f5577d = l4.f5532t;
        this.f5578e = l4.f5534v;
        this.f5579f = l4.f5533u;
        this.f5580g = wVar2;
        this.f5581h = l4.f5535w;
        this.f5582i = l4.f5527C;
        this.j = l4.f5528D;
    }
}
