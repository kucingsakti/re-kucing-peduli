package h7;

import java.io.IOException;
import java.io.InputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import p086i8.C;
import p086i8.s;
import p163q7.j;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements p163q7.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map f11766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CookieManager f11767t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p163q7.b f11768u = p163q7.b.f14419s;

    public e() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        i.b(mapSynchronizedMap, "Collections.synchronized…se, HttpURLConnection>())");
        this.f11766s = mapSynchronizedMap;
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        this.f11767t = cookieManager;
    }

    public static LinkedHashMap a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                Collection collection = (List) entry.getValue();
                if (collection == null) {
                    collection = s.f12328s;
                }
                linkedHashMap.put(str, collection);
            }
        }
        return linkedHashMap;
    }

    @Override // p163q7.d
    public final p163q7.c P(Fa.e eVar, j jVar) throws IOException {
        long jP;
        boolean z6;
        String strG;
        i.g(jVar, "interruptMonitor");
        CookieHandler.setDefault(this.f11767t);
        String str = (String) eVar.f1659t;
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        if (uRLConnectionOpenConnection == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        b(httpURLConnection, eVar);
        if (httpURLConnection.getRequestProperty("Referer") == null) {
            httpURLConnection.addRequestProperty("Referer", C3.b.z(str));
        }
        httpURLConnection.connect();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        i.b(headerFields, "client.headerFields");
        LinkedHashMap linkedHashMapA = a(headerFields);
        int responseCode = httpURLConnection.getResponseCode();
        String str2 = "";
        if ((responseCode == 302 || responseCode == 301 || responseCode == 303) && C3.b.w(linkedHashMapA, "Location") != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
            String strW = C3.b.w(linkedHashMapA, "Location");
            if (strW == null) {
                strW = "";
            }
            URLConnection uRLConnectionOpenConnection2 = new URL(strW).openConnection();
            if (uRLConnectionOpenConnection2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection2;
            b(httpURLConnection, eVar);
            if (httpURLConnection.getRequestProperty("Referer") == null) {
                httpURLConnection.addRequestProperty("Referer", C3.b.z(str));
            }
            httpURLConnection.connect();
            Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
            i.b(headerFields2, "client.headerFields");
            linkedHashMapA = a(headerFields2);
            responseCode = httpURLConnection.getResponseCode();
        }
        HttpURLConnection httpURLConnection2 = httpURLConnection;
        LinkedHashMap linkedHashMap = linkedHashMapA;
        int i10 = responseCode;
        InputStream inputStream = null;
        if (200 <= i10 && 299 >= i10) {
            jP = C3.b.p(linkedHashMap);
            InputStream inputStream2 = httpURLConnection2.getInputStream();
            String strW2 = C3.b.w(linkedHashMap, "Content-MD5");
            str2 = strW2 != null ? strW2 : "";
            z6 = true;
            strG = null;
            inputStream = inputStream2;
        } else {
            jP = -1;
            z6 = false;
            strG = C3.b.g(httpURLConnection2.getErrorStream());
        }
        boolean zA = C3.b.a(i10, linkedHashMap);
        i.b(httpURLConnection2.getHeaderFields(), "client.headerFields");
        p163q7.c cVar = new p163q7.c(i10, z6, jP, inputStream, eVar, str2, linkedHashMap, zA, strG);
        this.f11766s.put(cVar, httpURLConnection2);
        return cVar;
    }

    public final void b(HttpURLConnection httpURLConnection, Fa.e eVar) throws ProtocolException {
        httpURLConnection.setRequestMethod((String) eVar.f1662w);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setDoInput(true);
        for (Map.Entry entry : ((LinkedHashMap) eVar.f1660u).entrySet()) {
            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Map map = this.f11766s;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((Map.Entry) it.next()).getValue();
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.disconnect();
                } catch (Exception unused) {
                }
            }
        }
        map.clear();
    }

    @Override // p163q7.d
    public final void k(p163q7.c cVar) {
        Map map = this.f11766s;
        if (map.containsKey(cVar)) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) map.get(cVar);
            map.remove(cVar);
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.disconnect();
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // p163q7.d
    public final Set r(Fa.e eVar) {
        p163q7.b bVar = p163q7.b.f14419s;
        p163q7.b bVar2 = this.f11768u;
        if (bVar2 == bVar) {
            return C.s(bVar2);
        }
        try {
            return C3.b.A(eVar, this);
        } catch (Exception unused) {
            return C.s(bVar2);
        }
    }

    @Override // p163q7.d
    public final p163q7.b s(Fa.e eVar, Set set) {
        i.g(set, "supportedFileDownloaderTypes");
        return this.f11768u;
    }

    @Override // p163q7.d
    public final void L(Fa.e eVar) {
    }

    @Override // p163q7.d
    public final void q(Fa.e eVar) {
    }

    @Override // p163q7.d
    public final void y(Fa.e eVar) {
    }
}
