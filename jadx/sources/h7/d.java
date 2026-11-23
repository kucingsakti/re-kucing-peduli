package h7;

import L9.m;
import android.net.Uri;
import com.tonyodev.fetch2core.Extras;
import com.tonyodev.fetch2core.MutableExtras;
import com.tonyodev.fetch2core.server.FileRequest;
import com.tonyodev.fetch2core.server.FileResponse;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONObject;
import p086i8.C;
import p086i8.k;
import p086i8.y;
import p163q7.j;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p163q7.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map f11764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p163q7.b f11765t = p163q7.b.f14419s;

    public d() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        i.b(mapSynchronizedMap, "Collections.synchronized…leResourceTransporter>())");
        this.f11764s = mapSynchronizedMap;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0226  */
    @Override // p163q7.d
    public final p163q7.c P(Fa.e eVar, j jVar) {
        long j;
        boolean z6;
        boolean z10;
        String str;
        String str2;
        boolean z11;
        Integer numZ;
        Integer numZ2;
        i.g(jVar, "interruptMonitor");
        p174r7.a aVar = new p174r7.a();
        System.nanoTime();
        LinkedHashMap linkedHashMap = (LinkedHashMap) eVar.f1660u;
        String str3 = (String) linkedHashMap.get("Range");
        if (str3 == null) {
            str3 = "bytes=0-";
        }
        int iS = L9.f.S(str3, 6, "=");
        int iS2 = L9.f.S(str3, 6, "-");
        String strSubstring = str3.substring(iS + 1, iS2);
        i.b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        long j10 = Long.parseLong(strSubstring);
        try {
            String strSubstring2 = str3.substring(iS2 + 1, str3.length());
            i.b(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            j = Long.parseLong(strSubstring2);
        } catch (Exception unused) {
            j = -1;
        }
        String str4 = (String) linkedHashMap.get("Authorization");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str4;
        String str6 = (String) eVar.f1659t;
        int iS3 = C3.b.s(str6);
        String strR = C3.b.r(str6);
        MutableExtras mutableExtras = new MutableExtras(y.C(((Extras) eVar.f1663x).f10374s));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str7 = (String) entry.getKey();
            String str8 = (String) entry.getValue();
            i.g(str7, "key");
            i.g(str8, "value");
            mutableExtras.f10375u.put(str7, str8);
        }
        new InetSocketAddress(0);
        String strValueOf = String.valueOf(-1L);
        Extras.CREATOR.getClass();
        new FileRequest(-1, strValueOf, 0L, -1L, "", "", Extras.f10373t, 0, 0, true);
        InetSocketAddress inetSocketAddress = new InetSocketAddress(strR, iS3);
        Uri uri = Uri.parse(str6);
        i.b(uri, "Uri.parse(url)");
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "-1";
        }
        String str9 = lastPathSegment;
        String string = (String) linkedHashMap.get("Client");
        if (string == null) {
            string = UUID.randomUUID().toString();
            i.b(string, "UUID.randomUUID().toString()");
        }
        String str10 = string;
        String str11 = (String) linkedHashMap.get("Page");
        int iIntValue = (str11 == null || (numZ2 = m.z(str11)) == null) ? 0 : numZ2.intValue();
        String str12 = (String) linkedHashMap.get("Size");
        FileRequest fileRequest = new FileRequest(1, str9, j10, j, str5, str10, mutableExtras, iIntValue, (str12 == null || (numZ = m.z(str12)) == null) ? 0 : numZ.intValue(), false);
        synchronized (aVar.f14559c) {
            aVar.e();
            aVar.f14561e.connect(inetSocketAddress);
            aVar.a = new DataInputStream(aVar.f14561e.getInputStream());
            aVar.f14558b = new DataOutputStream(aVar.f14561e.getOutputStream());
        }
        aVar.d(fileRequest);
        if (jVar.p()) {
            return null;
        }
        FileResponse fileResponseC = aVar.c();
        int i10 = fileResponseC.f10386s;
        if (fileResponseC.f10388u == 1 && fileResponseC.f10387t == 1 && i10 == 206) {
            z6 = false;
            z10 = true;
        } else {
            z6 = false;
            z10 = false;
        }
        long j11 = fileResponseC.f10390w;
        DataInputStream dataInputStreamB = aVar.b();
        String strG = !z10 ? C3.b.g(dataInputStreamB) : null;
        boolean z12 = z6;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        try {
            JSONObject jSONObject = new JSONObject(fileResponseC.a());
            Iterator<String> itKeys = jSONObject.keys();
            str = null;
            try {
                i.b(itKeys, "json.keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    i.b(next, "it");
                    linkedHashMap2.put(next, com.bumptech.glide.d.u(jSONObject.get(next).toString()));
                }
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            str = null;
        }
        if (!linkedHashMap2.containsKey("Content-MD5")) {
            linkedHashMap2.put("Content-MD5", com.bumptech.glide.d.u(fileResponseC.f10391x));
        }
        List list = (List) linkedHashMap2.get("Content-MD5");
        if (list == null || (str2 = (String) k.V(list)) == null) {
            str2 = "";
        }
        if (i10 == 206) {
            z11 = true;
        } else {
            List list2 = (List) linkedHashMap2.get("Accept-Ranges");
            if (i.a(list2 != null ? (String) k.V(list2) : str, "bytes")) {
                z11 = true;
            } else {
                z11 = z12;
            }
        }
        p163q7.c cVar = new p163q7.c(i10, z10, j11, dataInputStreamB, eVar, str2, linkedHashMap2, z11, strG);
        this.f11764s.put(cVar, aVar);
        return cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Map map = this.f11764s;
        try {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((p174r7.a) ((Map.Entry) it.next()).getValue()).a();
            }
            map.clear();
        } catch (Exception unused) {
        }
    }

    @Override // p163q7.d
    public final void k(p163q7.c cVar) {
        Map map = this.f11764s;
        if (map.containsKey(cVar)) {
            p174r7.a aVar = (p174r7.a) map.get(cVar);
            map.remove(cVar);
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    @Override // p163q7.d
    public final Set r(Fa.e eVar) {
        try {
            return C3.b.A(eVar, this);
        } catch (Exception unused) {
            return C.s(this.f11765t);
        }
    }

    @Override // p163q7.d
    public final p163q7.b s(Fa.e eVar, Set set) {
        i.g(set, "supportedFileDownloaderTypes");
        return this.f11765t;
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
