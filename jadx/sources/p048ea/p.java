package p048ea;

import A1.q;
import C3.a;
import X9.E;
import X9.F;
import X9.G;
import X9.K;
import X9.L;
import X9.y;
import Y9.c;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ma.v;
import ma.w;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import p020ba.h;
import p020ba.k;
import p030ca.d;
import p030ca.e;
import p030ca.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class p implements d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f11329g = c.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f11330h = c.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final k a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f11331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f11332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile v f11333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F f11334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f11335f;

    public p(E e10, k kVar, f fVar, o oVar) {
        i.f(e10, "client");
        i.f(kVar, "connection");
        i.f(oVar, "http2Connection");
        this.a = kVar;
        this.f11331b = fVar;
        this.f11332c = oVar;
        F f10 = F.H2_PRIOR_KNOWLEDGE;
        this.f11334e = e10.f5481K.contains(f10) ? f10 : F.HTTP_2;
    }

    @Override // p030ca.d
    public final long a(L l4) {
        if (e.a(l4)) {
            return c.k(l4);
        }
        return 0L;
    }

    @Override // p030ca.d
    public final w b(L l4) {
        v vVar = this.f11333d;
        i.c(vVar);
        return vVar.f11363i;
    }

    @Override // p030ca.d
    public final void c() throws IOException {
        v vVar = this.f11333d;
        i.c(vVar);
        vVar.g().close();
    }

    @Override // p030ca.d
    public final void cancel() {
        this.f11335f = true;
        v vVar = this.f11333d;
        if (vVar == null) {
            return;
        }
        vVar.e(a.CANCEL);
    }

    @Override // p030ca.d
    public final void d() {
        this.f11332c.flush();
    }

    @Override // p030ca.d
    public final K e(boolean z6) throws IOException {
        X9.w wVar;
        v vVar = this.f11333d;
        i.c(vVar);
        synchronized (vVar) {
            vVar.f11364k.h();
            while (vVar.f11361g.isEmpty() && vVar.f11366m == null) {
                try {
                    vVar.l();
                } catch (Throwable th) {
                    vVar.f11364k.k();
                    throw th;
                }
            }
            vVar.f11364k.k();
            if (vVar.f11361g.isEmpty()) {
                IOException iOException = vVar.f11367n;
                if (iOException != null) {
                    throw iOException;
                }
                a aVar = vVar.f11366m;
                i.c(aVar);
                throw new StreamResetException(aVar);
            }
            Object objRemoveFirst = vVar.f11361g.removeFirst();
            i.e(objRemoveFirst, "headersQueue.removeFirst()");
            wVar = (X9.w) objRemoveFirst;
        }
        F f10 = this.f11334e;
        i.f(f10, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = wVar.size();
        q qVarL = null;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String strF = wVar.f(i10);
            String strM = wVar.m(i10);
            if (i.a(strF, ":status")) {
                qVarL = a.l(i.k(strM, "HTTP/1.1 "));
            } else if (!f11330h.contains(strF)) {
                i.f(strF, MediationMetaData.KEY_NAME);
                i.f(strM, "value");
                arrayList.add(strF);
                arrayList.add(L9.f.j0(strM).toString());
            }
            i10 = i11;
        }
        if (qVarL == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        K k3 = new K();
        k3.f5514b = f10;
        k3.f5515c = qVarL.f163b;
        k3.f5516d = (String) qVarL.f165d;
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        k3.c(new X9.w((String[]) array));
        if (z6 && k3.f5515c == 100) {
            return null;
        }
        return k3;
    }

    @Override // p030ca.d
    public final v f(G g8, long j) {
        i.f(g8, "request");
        v vVar = this.f11333d;
        i.c(vVar);
        return vVar.g();
    }

    @Override // p030ca.d
    public final void g(G g8) throws IOException {
        int i10;
        v vVar;
        i.f(g8, "request");
        if (this.f11333d != null) {
            return;
        }
        boolean z6 = true;
        boolean z10 = g8.f5507d != null;
        X9.w wVar = g8.f5506c;
        ArrayList arrayList = new ArrayList(wVar.size() + 4);
        arrayList.add(new b(b.f11262f, g8.f5505b));
        ma.i iVar = b.f11263g;
        y yVar = g8.a;
        i.f(yVar, "url");
        String strB = yVar.b();
        String strD = yVar.d();
        if (strD != null) {
            strB = strB + '?' + ((Object) strD);
        }
        arrayList.add(new b(iVar, strB));
        String strE = g8.f5506c.e("Host");
        if (strE != null) {
            arrayList.add(new b(b.f11265i, strE));
        }
        arrayList.add(new b(b.f11264h, yVar.a));
        int size = wVar.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            String strF = wVar.f(i11);
            Locale locale = Locale.US;
            i.e(locale, "US");
            String lowerCase = strF.toLowerCase(locale);
            i.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f11329g.contains(lowerCase) || (lowerCase.equals("te") && i.a(wVar.m(i11), "trailers"))) {
                arrayList.add(new b(lowerCase, wVar.m(i11)));
            }
            i11 = i12;
        }
        o oVar = this.f11332c;
        oVar.getClass();
        boolean z11 = !z10;
        synchronized (oVar.f11319O) {
            synchronized (oVar) {
                try {
                    if (oVar.f11325w > 1073741823) {
                        oVar.i(a.REFUSED_STREAM);
                    }
                    if (oVar.f11326x) {
                        throw new ConnectionShutdownException();
                    }
                    i10 = oVar.f11325w;
                    oVar.f11325w = i10 + 2;
                    vVar = new v(i10, oVar, z11, false, null);
                    if (z10 && oVar.f11316L < oVar.f11317M && vVar.f11359e < vVar.f11360f) {
                        z6 = false;
                    }
                    if (vVar.i()) {
                        oVar.f11322t.put(Integer.valueOf(i10), vVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar.f11319O.h(z11, i10, arrayList);
        }
        if (z6) {
            oVar.f11319O.flush();
        }
        this.f11333d = vVar;
        if (this.f11335f) {
            v vVar2 = this.f11333d;
            i.c(vVar2);
            vVar2.e(a.CANCEL);
            throw new IOException("Canceled");
        }
        v vVar3 = this.f11333d;
        i.c(vVar3);
        h hVar = vVar3.f11364k;
        long j = this.f11331b.f7581g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hVar.g(j);
        v vVar4 = this.f11333d;
        i.c(vVar4);
        vVar4.f11365l.g(this.f11331b.f7582h);
    }

    @Override // p030ca.d
    public final k h() {
        return this.a;
    }
}
