package p048ea;

import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import ma.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final b[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f11281b;

    static {
        b bVar = new b(b.f11265i, "");
        i iVar = b.f11262f;
        b bVar2 = new b(iVar, "GET");
        b bVar3 = new b(iVar, "POST");
        i iVar2 = b.f11263g;
        b bVar4 = new b(iVar2, "/");
        b bVar5 = new b(iVar2, "/index.html");
        i iVar3 = b.f11264h;
        b bVar6 = new b(iVar3, "http");
        b bVar7 = new b(iVar3, "https");
        i iVar4 = b.f11261e;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new b(iVar4, "200"), new b(iVar4, "204"), new b(iVar4, "206"), new b(iVar4, "304"), new b(iVar4, "400"), new b(iVar4, "404"), new b(iVar4, "500"), new b("accept-charset", ""), new b("accept-encoding", "gzip, deflate"), new b("accept-language", ""), new b("accept-ranges", ""), new b("accept", ""), new b("access-control-allow-origin", ""), new b("age", ""), new b("allow", ""), new b("authorization", ""), new b("cache-control", ""), new b("content-disposition", ""), new b("content-encoding", ""), new b("content-language", ""), new b("content-length", ""), new b("content-location", ""), new b("content-range", ""), new b("content-type", ""), new b("cookie", ""), new b("date", ""), new b("etag", ""), new b("expect", ""), new b("expires", ""), new b("from", ""), new b("host", ""), new b("if-match", ""), new b("if-modified-since", ""), new b("if-none-match", ""), new b("if-range", ""), new b("if-unmodified-since", ""), new b("last-modified", ""), new b("link", ""), new b("location", ""), new b("max-forwards", ""), new b("proxy-authenticate", ""), new b("proxy-authorization", ""), new b("range", ""), new b("referer", ""), new b("refresh", ""), new b("retry-after", ""), new b("server", ""), new b("set-cookie", ""), new b("strict-transport-security", ""), new b("transfer-encoding", ""), new b("user-agent", ""), new b("vary", ""), new b("via", ""), new b("www-authenticate", "")};
        a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        int i10 = 0;
        while (i10 < 61) {
            int i11 = i10 + 1;
            if (!linkedHashMap.containsKey(bVarArr[i10].a)) {
                linkedHashMap.put(bVarArr[i10].a, Integer.valueOf(i10));
            }
            i10 = i11;
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        p210v8.i.e(mapUnmodifiableMap, "unmodifiableMap(result)");
        f11281b = mapUnmodifiableMap;
    }

    public static void a(i iVar) throws IOException {
        p210v8.i.f(iVar, MediationMetaData.KEY_NAME);
        int iH = iVar.h();
        int i10 = 0;
        while (i10 < iH) {
            int i11 = i10 + 1;
            byte bK = iVar.k(i10);
            if (65 <= bK && bK <= 90) {
                throw new IOException(p210v8.i.k(iVar.o(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
            i10 = i11;
        }
    }
}
