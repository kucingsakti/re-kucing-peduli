package X9;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class G {
    public final y a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f5506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f5507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f5508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0462h f5509f;

    public G(y yVar, String str, w wVar, J j, Map map) {
        p210v8.i.f(yVar, "url");
        p210v8.i.f(str, "method");
        this.a = yVar;
        this.f5505b = str;
        this.f5506c = wVar;
        this.f5507d = j;
        this.f5508e = map;
    }

    public final Fa.e a() {
        Fa.e eVar = new Fa.e(false);
        eVar.f1663x = new LinkedHashMap();
        eVar.f1659t = this.a;
        eVar.f1660u = this.f5505b;
        eVar.f1662w = this.f5507d;
        Map map = this.f5508e;
        eVar.f1663x = map.isEmpty() ? new LinkedHashMap() : p086i8.y.C(map);
        eVar.f1661v = this.f5506c.g();
        return eVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f5505b);
        sb.append(", url=");
        sb.append(this.a);
        w wVar = this.f5506c;
        if (wVar.size() != 0) {
            sb.append(", headers=[");
            int i10 = 0;
            for (Object obj : wVar) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    p086i8.l.G();
                    throw null;
                }
                p076h8.f fVar = (p076h8.f) obj;
                String str = (String) fVar.f11789s;
                String str2 = (String) fVar.f11790t;
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i10 = i11;
            }
            sb.append(']');
        }
        Map map = this.f5508e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String string = sb.toString();
        p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
