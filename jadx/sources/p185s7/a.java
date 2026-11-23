package p185s7;

import C3.b;
import Fa.e;
import X9.D;
import X9.E;
import X9.G;
import X9.L;
import X9.O;
import Y9.c;
import com.tonyodev.fetch2core.Extras;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import p086i8.C;
import p086i8.y;
import p163q7.d;
import p163q7.j;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map f14723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile E f14724t;

    public a() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        i.b(mapSynchronizedMap, "Collections.synchronized…er.Response, Response>())");
        this.f14723s = mapSynchronizedMap;
        D d3 = new D();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        i.f(timeUnit, "unit");
        d3.f5466x = c.b(20000L, timeUnit);
        d3.f5465w = c.b(15000L, timeUnit);
        d3.f5453k = null;
        d3.f5451h = true;
        d3.f5452i = true;
        d3.f5449f = false;
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        d3.j = new P0.d(cookieManager, 12);
        this.f14724t = new E(d3);
    }

    @Override // p163q7.d
    public final p163q7.c P(e eVar, j jVar) {
        i.g(jVar, "interruptMonitor");
        i.g(this.f14724t, "client");
        e eVar2 = new e(11);
        eVar2.B((String) eVar.f1659t);
        eVar2.v((String) eVar.f1662w, null);
        for (Map.Entry entry : ((LinkedHashMap) eVar.f1660u).entrySet()) {
            eVar2.g((String) entry.getKey(), (String) entry.getValue());
        }
        G gJ = eVar2.j();
        if (gJ.f5506c.e("Referer") == null) {
            String strZ = b.z((String) eVar.f1659t);
            e eVarA = gJ.a();
            eVarA.g("Referer", strZ);
            gJ = eVarA.j();
        }
        L lF = this.f14724t.c(gJ).f();
        TreeMap treeMapK = lF.f5536x.k();
        int i10 = lF.f5534v;
        if ((i10 == 302 || i10 == 301 || i10 == 303) && b.w(treeMapK, "Location") != null) {
            E e10 = this.f14724t;
            b.w(treeMapK, "Location");
            String str = (String) eVar.f1659t;
            LinkedHashMap linkedHashMap = (LinkedHashMap) eVar.f1660u;
            String str2 = (String) eVar.f1661v;
            String str3 = (String) eVar.f1662w;
            Extras extras = (Extras) eVar.f1663x;
            i.g(str, "url");
            i.g(str2, "file");
            i.g(extras, "extras");
            i.g(e10, "client");
            e eVar3 = new e(11);
            eVar3.B(str);
            eVar3.v(str3, null);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                eVar3.g((String) entry2.getKey(), (String) entry2.getValue());
            }
            G gJ2 = eVar3.j();
            if (gJ2.f5506c.e("Referer") == null) {
                String strZ2 = b.z((String) eVar.f1659t);
                e eVarA2 = gJ2.a();
                eVarA2.g("Referer", strZ2);
                gJ2 = eVarA2.j();
            }
            try {
                lF.close();
            } catch (Exception unused) {
            }
            lF = this.f14724t.c(gJ2).f();
            treeMapK = lF.f5536x.k();
            i10 = lF.f5534v;
        }
        L l4 = lF;
        TreeMap treeMap = treeMapK;
        int i11 = i10;
        boolean zC = l4.c();
        long jP = b.p(treeMap);
        O o10 = l4.f5537y;
        InputStream inputStreamV = o10 != null ? o10.c().V() : null;
        String strG = zC ? null : b.g(inputStreamV);
        String strW = b.w(y.C(treeMap), "Content-MD5");
        if (strW == null) {
            strW = "";
        }
        p163q7.c cVar = new p163q7.c(i11, zC, jP, inputStreamV, eVar, strW, treeMap, b.a(i11, treeMap), strG);
        this.f14723s.put(cVar, l4);
        return cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Map map = this.f14723s;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            L l4 = (L) ((Map.Entry) it.next()).getValue();
            if (l4 != null) {
                try {
                    l4.close();
                } catch (Exception unused) {
                }
            }
        }
        map.clear();
    }

    @Override // p163q7.d
    public final void k(p163q7.c cVar) {
        Map map = this.f14723s;
        if (map.containsKey(cVar)) {
            L l4 = (L) map.get(cVar);
            map.remove(cVar);
            if (l4 != null) {
                try {
                    l4.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // p163q7.d
    public final Set r(e eVar) {
        try {
            return b.A(eVar, this);
        } catch (Exception unused) {
            return C.s(p163q7.b.f14420t);
        }
    }

    @Override // p163q7.d
    public final p163q7.b s(e eVar, Set set) {
        i.g(set, "supportedFileDownloaderTypes");
        return p163q7.b.f14420t;
    }

    @Override // p163q7.d
    public final void L(e eVar) {
    }

    @Override // p163q7.d
    public final void q(e eVar) {
    }

    @Override // p163q7.d
    public final void y(e eVar) {
    }
}
