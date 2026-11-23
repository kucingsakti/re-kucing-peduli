package Q6;

import i2.h;
import i2.l;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f4336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f4337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f4338i;
    public Object j;

    public void a(String str, String str2) {
        HashMap map = (HashMap) this.f4335f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public h b() {
        String strC = ((String) this.a) == null ? " transportName" : "";
        if (((l) this.f4332c) == null) {
            strC = strC.concat(" encodedPayload");
        }
        if (((Long) this.f4333d) == null) {
            strC = p231y.a.c(strC, " eventMillis");
        }
        if (((Long) this.f4334e) == null) {
            strC = p231y.a.c(strC, " uptimeMillis");
        }
        if (((HashMap) this.f4335f) == null) {
            strC = p231y.a.c(strC, " autoMetadata");
        }
        if (strC.isEmpty()) {
            return new h((String) this.a, (Integer) this.f4331b, (l) this.f4332c, ((Long) this.f4333d).longValue(), ((Long) this.f4334e).longValue(), (HashMap) this.f4335f, (Integer) this.f4336g, (String) this.f4337h, (byte[]) this.f4338i, (byte[]) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strC));
    }
}
