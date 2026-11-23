package p030ca;

import B4.C0157e;
import Fa.e;
import P3.n;
import X9.A;
import X9.C0455a;
import X9.C0466l;
import X9.C0471q;
import X9.E;
import X9.G;
import X9.J;
import X9.K;
import X9.L;
import X9.N;
import X9.O;
import X9.P;
import X9.r;
import X9.w;
import X9.y;
import X9.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import ka.c;
import ma.m;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import p068ga.d;
import p086i8.k;
import p086i8.l;
import p086i8.s;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements z {
    public final /* synthetic */ int a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7573b;

    public a(r rVar) {
        i.f(rVar, "cookieJar");
        this.f7573b = rVar;
    }

    public static int d(L l4, int i10) {
        String strB = L.b(l4, "Retry-After");
        if (strB == null) {
            return i10;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        i.e(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strB).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strB);
        i.e(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // X9.z
    public final L a(f fVar) {
        boolean z6;
        O o10;
        L lB;
        SSLSocketFactory sSLSocketFactory;
        c cVar;
        C0466l c0466l;
        switch (this.a) {
            case 0:
                G g8 = fVar.f7579e;
                e eVarA = g8.a();
                J j = g8.f5507d;
                if (j != null) {
                    A aB = j.b();
                    if (aB != null) {
                        eVarA.n("Content-Type", aB.a);
                    }
                    long jA = j.a();
                    if (jA != -1) {
                        eVarA.n("Content-Length", String.valueOf(jA));
                        ((M1.c) eVarA.f1661v).i("Transfer-Encoding");
                    } else {
                        eVarA.n("Transfer-Encoding", "chunked");
                        ((M1.c) eVarA.f1661v).i("Content-Length");
                    }
                }
                w wVar = g8.f5506c;
                String strE = wVar.e("Host");
                int i10 = 0;
                y yVar = g8.a;
                if (strE == null) {
                    eVarA.n("Host", Y9.c.w(yVar, false));
                }
                if (wVar.e("Connection") == null) {
                    eVarA.n("Connection", "Keep-Alive");
                }
                if (wVar.e("Accept-Encoding") == null && wVar.e("Range") == null) {
                    eVarA.n("Accept-Encoding", "gzip");
                    z6 = true;
                } else {
                    z6 = false;
                }
                r rVar = (r) this.f7573b;
                List listN = rVar.n(yVar);
                if (!listN.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (Object obj : listN) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            l.G();
                            throw null;
                        }
                        C0471q c0471q = (C0471q) obj;
                        if (i10 > 0) {
                            sb.append("; ");
                        }
                        sb.append(c0471q.a);
                        sb.append('=');
                        sb.append(c0471q.f5629b);
                        i10 = i11;
                    }
                    String string = sb.toString();
                    i.e(string, "StringBuilder().apply(builderAction).toString()");
                    eVarA.n("Cookie", string);
                }
                if (wVar.e("User-Agent") == null) {
                    eVarA.n("User-Agent", "okhttp/4.10.0");
                }
                L lB2 = fVar.b(eVarA.j());
                w wVar2 = lB2.f5536x;
                e.b(rVar, yVar, wVar2);
                K kG = lB2.g();
                kG.a = g8;
                if (z6 && "gzip".equalsIgnoreCase(L.b(lB2, "Content-Encoding")) && e.a(lB2) && (o10 = lB2.f5537y) != null) {
                    m mVar = new m(o10.c());
                    M1.c cVarG = wVar2.g();
                    cVarG.i("Content-Encoding");
                    cVarG.i("Content-Length");
                    kG.c(cVarG.d());
                    kG.f5519g = new N(L.b(lB2, "Content-Type"), -1L, d.d(mVar), 1);
                }
                return kG.a();
            default:
                G g10 = fVar.f7579e;
                p020ba.i iVar = fVar.a;
                List listH0 = s.f12328s;
                L l4 = null;
                int i12 = 0;
                G gB = g10;
                while (true) {
                    boolean z10 = true;
                    while (true) {
                        iVar.getClass();
                        i.f(gB, "request");
                        if (iVar.f7380A != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (iVar) {
                            try {
                                if (iVar.f7382C) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (iVar.f7381B) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z10) {
                            p020ba.l lVar = iVar.f7389u;
                            y yVar2 = gB.a;
                            boolean z11 = yVar2.j;
                            E e10 = iVar.f7387s;
                            if (z11) {
                                SSLSocketFactory sSLSocketFactory2 = e10.f5478H;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                c cVar2 = e10.f5482L;
                                c0466l = e10.f5483M;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                c0466l = null;
                            }
                            iVar.f7393y = new p020ba.e(lVar, new C0455a(yVar2.f5658d, yVar2.f5659e, e10.f5474D, e10.f5477G, sSLSocketFactory, cVar, c0466l, e10.f5476F, e10.f5481K, e10.f5480J, e10.f5475E), iVar);
                        }
                        try {
                            if (iVar.f7384E) {
                                throw new IOException("Canceled");
                            }
                            try {
                                lB = fVar.b(gB);
                            } catch (IOException e11) {
                                if (!c(e11, iVar, gB, !(e11 instanceof ConnectionShutdownException))) {
                                    Y9.c.A(e11, listH0);
                                    throw e11;
                                }
                                listH0 = k.h0(listH0, e11);
                                iVar.h(true);
                                z10 = false;
                            } catch (RouteException e12) {
                                if (!c(e12.f13840t, iVar, gB, false)) {
                                    IOException iOException = e12.f13839s;
                                    Y9.c.A(iOException, listH0);
                                    throw iOException;
                                }
                                listH0 = k.h0(listH0, e12.f13839s);
                                iVar.h(true);
                                z10 = false;
                            }
                        } catch (Throwable th2) {
                            iVar.h(true);
                            throw th2;
                        }
                        break;
                    }
                    if (l4 != null) {
                        K kG2 = lB.g();
                        K kG3 = l4.g();
                        kG3.f5519g = null;
                        L lA = kG3.a();
                        if (lA.f5537y != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        kG2.j = lA;
                        lB = kG2.a();
                    }
                    l4 = lB;
                    gB = b(l4, iVar.f7380A);
                    if (gB == null) {
                        iVar.h(false);
                        return l4;
                    }
                    O o11 = l4.f5537y;
                    if (o11 != null) {
                        Y9.c.d(o11);
                    }
                    i12++;
                    if (i12 > 20) {
                        throw new ProtocolException(i.k(Integer.valueOf(i12), "Too many follow-up requests: "));
                    }
                    iVar.h(true);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0145  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x011b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0122  */
    public G b(L l4, p140o4.r rVar) throws ProtocolException {
        p020ba.k kVar;
        E e10;
        String strB;
        G g8;
        y yVarH;
        e eVarA;
        boolean z6;
        L l10;
        P p10 = (rVar == null || (kVar = (p020ba.k) rVar.f13785w) == null) ? null : kVar.f7395b;
        int i10 = l4.f5534v;
        String str = l4.f5531s.f5505b;
        if (i10 == 307 || i10 == 308) {
            e10 = (E) this.f7573b;
            if (e10.f5496z && (strB = L.b(l4, "Location")) != null) {
                g8 = l4.f5531s;
                yVarH = g8.a.h(strB);
                if (yVarH != null) {
                    if (!i.a(yVarH.a, g8.a.a) || e10.f5471A) {
                        eVarA = g8.a();
                        if (xa.d.s(str)) {
                            boolean zEquals = str.equals("PROPFIND");
                            int i11 = l4.f5534v;
                            z6 = !zEquals || i11 == 308 || i11 == 307;
                            if (!str.equals("PROPFIND") || i11 == 308 || i11 == 307) {
                                eVarA.v(str, z6 ? g8.f5507d : null);
                            } else {
                                eVarA.v("GET", null);
                            }
                            if (!z6) {
                                ((M1.c) eVarA.f1661v).i("Transfer-Encoding");
                                ((M1.c) eVarA.f1661v).i("Content-Length");
                                ((M1.c) eVarA.f1661v).i("Content-Type");
                            }
                        }
                        if (!Y9.c.a(g8.a, yVarH)) {
                            ((M1.c) eVarA.f1661v).i("Authorization");
                        }
                        eVarA.f1659t = yVarH;
                        return eVarA.j();
                    }
                }
            }
        } else {
            if (i10 == 401) {
                ((E) this.f7573b).f5495y.getClass();
                return null;
            }
            if (i10 != 421) {
                if (i10 == 503) {
                    L l11 = l4.f5526B;
                    if ((l11 == null || l11.f5534v != 503) && d(l4, Integer.MAX_VALUE) == 0) {
                        return l4.f5531s;
                    }
                } else {
                    if (i10 == 407) {
                        i.c(p10);
                        if (p10.f5548b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((E) this.f7573b).f5476F.getClass();
                        return null;
                    }
                    if (i10 != 408) {
                        switch (i10) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                e10 = (E) this.f7573b;
                                if (e10.f5496z) {
                                    g8 = l4.f5531s;
                                    yVarH = g8.a.h(strB);
                                    if (yVarH != null) {
                                        if (!i.a(yVarH.a, g8.a.a)) {
                                            break;
                                        }
                                        eVarA = g8.a();
                                        if (xa.d.s(str)) {
                                            boolean zEquals2 = str.equals("PROPFIND");
                                            int i12 = l4.f5534v;
                                            if (zEquals2) {
                                            }
                                            if (str.equals("PROPFIND")) {
                                                eVarA.v(str, z6 ? g8.f5507d : null);
                                            } else {
                                                eVarA.v(str, z6 ? g8.f5507d : null);
                                            }
                                            if (!z6) {
                                                ((M1.c) eVarA.f1661v).i("Transfer-Encoding");
                                                ((M1.c) eVarA.f1661v).i("Content-Length");
                                                ((M1.c) eVarA.f1661v).i("Content-Type");
                                            }
                                        }
                                        if (!Y9.c.a(g8.a, yVarH)) {
                                            ((M1.c) eVarA.f1661v).i("Authorization");
                                        }
                                        eVarA.f1659t = yVarH;
                                        return eVarA.j();
                                    }
                                }
                            default:
                                return null;
                        }
                    } else if (((E) this.f7573b).f5494x && (((l10 = l4.f5526B) == null || l10.f5534v != 408) && d(l4, 0) <= 0)) {
                        return l4.f5531s;
                    }
                }
            } else if (rVar != null && !i.a(((p020ba.e) rVar.f13783u).f7367b.f5563h.f5658d, ((p020ba.k) rVar.f13785w).f7395b.a.f5563h.f5658d)) {
                p020ba.k kVar2 = (p020ba.k) rVar.f13785w;
                synchronized (kVar2) {
                    kVar2.f7403k = true;
                }
                return l4.f5531s;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0049  */
    /* JADX WARN: Code duplicated, block: B:36:0x004e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0051  */
    /* JADX WARN: Code duplicated, block: B:49:0x0066 A[ADDED_TO_REGION, DONT_GENERATE, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:51:0x0068 A[Catch: all -> 0x007e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:47:0x0062, B:51:0x0068, B:55:0x007a), top: B:77:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0083  */
    /* JADX WARN: Code duplicated, block: B:63:0x0085  */
    /* JADX WARN: Code duplicated, block: B:64:0x0087  */
    /* JADX WARN: Code duplicated, block: B:67:0x008c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0093  */
    /* JADX WARN: Code duplicated, block: B:76:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public boolean c(IOException iOException, p020ba.i iVar, G g8, boolean z6) {
        p020ba.e eVar;
        int i10;
        boolean zJ;
        P p10;
        n nVar;
        C0157e c0157e;
        p020ba.k kVar;
        if (!((E) this.f7573b).f5494x || ((z6 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (!(iOException instanceof InterruptedIOException)) {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            eVar = iVar.f7393y;
            i.c(eVar);
            i10 = eVar.f7371f;
            if (i10 != 0) {
                if (eVar.f7374i != null) {
                    zJ = true;
                } else {
                    p10 = null;
                    if (i10 <= 1) {
                        synchronized (kVar) {
                            if (kVar.f7404l != 0) {
                                p10 = kVar.f7395b;
                            }
                        }
                    }
                    if (p10 != null) {
                        eVar.f7374i = p10;
                    } else {
                        nVar = eVar.f7369d;
                        if (nVar != null) {
                        }
                    }
                    zJ = true;
                }
            } else if (eVar.f7374i != null) {
                zJ = true;
            } else {
                p10 = null;
                if (i10 <= 1) {
                    synchronized (kVar) {
                        if (kVar.f7404l != 0) {
                            p10 = kVar.f7395b;
                        }
                    }
                }
                if (p10 != null) {
                    eVar.f7374i = p10;
                } else {
                    nVar = eVar.f7369d;
                    if (nVar != null) {
                    }
                }
                zJ = true;
            }
            if (!zJ) {
                return true;
            }
        } else if ((iOException instanceof SocketTimeoutException) && !z6) {
            eVar = iVar.f7393y;
            i.c(eVar);
            i10 = eVar.f7371f;
            if (i10 != 0 && eVar.f7372g == 0 && eVar.f7373h == 0) {
                zJ = false;
            } else if (eVar.f7374i != null) {
                zJ = true;
            } else {
                p10 = null;
                if (i10 <= 1 && eVar.f7372g <= 1 && eVar.f7373h <= 0 && (kVar = eVar.f7368c.f7394z) != null) {
                    synchronized (kVar) {
                        if (kVar.f7404l != 0 && Y9.c.a(kVar.f7395b.a.f5563h, eVar.f7367b.f5563h)) {
                            p10 = kVar.f7395b;
                        }
                    }
                }
                if (p10 != null) {
                    eVar.f7374i = p10;
                } else {
                    nVar = eVar.f7369d;
                    if ((nVar != null || !nVar.b()) && (c0157e = eVar.f7370e) != null) {
                        zJ = c0157e.j();
                    }
                }
                zJ = true;
            }
            if (!zJ) {
                return true;
            }
        }
        return false;
    }

    public a(E e10) {
        i.f(e10, "client");
        this.f7573b = e10;
    }
}
